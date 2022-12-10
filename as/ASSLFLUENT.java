package generatedbyassl.as;

import java.lang.InterruptedException;
import java.util.Vector;
import java.util.Enumeration;

/**
 * Generated by ASSL Framework
 * 
 * This is the superclass for all ASSL fluents.
 */
public class ASSLFLUENT
	extends Thread
	implements  ASSLEVENTCATCHER
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * Events that initiate this fluent.
	 */
	protected Vector<ASSLEVENT> vInitiatedByEvents = new Vector<ASSLEVENT>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Events that terminate this fluent.
	 */
	protected Vector<ASSLEVENT> vTerminatedByEvents = new Vector<ASSLEVENT>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Determines whether the fluent must stop.
	 */
	protected boolean bStopFluent = false;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Determines whether the fluent has been and still yet initiated.
	 */
	protected boolean bFluentInitiated = false;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Determines whether to pause the fluent.
	 */
	protected boolean bPause = false;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Determines whether the fluent has been started.
	 */
	private boolean bStarted = false;

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method determines whether the fluent is still initiated.
	 */
	public synchronized boolean isFluentInitiated (  )
	{
		return bFluentInitiated;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method notifies the ASSL event-catcher class that a specific event has been prompted.
	 */
	public synchronized void notifyForEvent ( ASSLEVENT poEvent )
	{
		boolean bEventFound = false;
		Enumeration<ASSLEVENT> eEVENTS = vInitiatedByEvents.elements();
		ASSLEVENT currEvent = null;
		while ( eEVENTS.hasMoreElements() ) 
		{
			currEvent = eEVENTS.nextElement();
			if ( currEvent == poEvent &&
				 !bFluentInitiated  ) 
			{
				bFluentInitiated = true;
				bEventFound = true;
				String sMsg = "FLUENT '" + this.getClass().getName() + "': has been initiated";
				System.out.println( sMsg );
				break;
			}
		}
		if ( !bEventFound ) 
		{
			eEVENTS = vTerminatedByEvents.elements();
			while ( eEVENTS.hasMoreElements() ) 
			{
				currEvent = eEVENTS.nextElement();
				if ( currEvent == poEvent &&
					 bFluentInitiated  ) 
				{
					bFluentInitiated = false;
					bEventFound = true;
					String sMsg = "FLUENT '" + this.getClass().getName() + "': has been terminated";
					System.out.println( sMsg );
					break;
				}
			}
		}
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method calls all the fluent-mapped actions in sequence.
	 */
	protected synchronized void callFluentActions (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Pauses/resumes the fluent.
	 */
	public synchronized void pause ( boolean pbPause )
	{
		bPause = pbPause;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns true if the fluent has been started.
	 */
	public synchronized boolean isStarted (  )
	{
		return bStarted;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Put your description here ....
	 */
	public void run (  )
	{
		String sMsg = "FLUENT '" + this.getClass().getName() + "': started";
		System.out.println( sMsg );
		bStarted = true;
		//**** runs the fluent
		while ( !bStopFluent ) 
		{
			if ( bFluentInitiated ) 
			{
				callFluentActions();
			}
			else
			{
				try
				{
					Thread.sleep(100);
					while ( bPause ) 
					{
						Thread.sleep(100);
					}
				}
				catch ( InterruptedException ex ) 
				{
					System.err.println( ex.getMessage() );
				}
			}
		}
	}

}