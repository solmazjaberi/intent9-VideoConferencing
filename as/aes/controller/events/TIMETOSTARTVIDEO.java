package generatedbyassl.as.aes.controller.events;

import java.io.Serializable;
import generatedbyassl.as.ASSLEVENT;
import java.util.Date;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'TimetoStartVideo' (specified as EVENT ASSL tier).
 */
public class TIMETOSTARTVIDEO
	extends ASSLEVENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'TIMETOSTARTVIDEO' class.
	 */
	static private TIMETOSTARTVIDEO oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  TIMETOSTARTVIDEO (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'TIMETOSTARTVIDEO' class.
	 */
	static public TIMETOSTARTVIDEO getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new TIMETOSTARTVIDEO();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Initialises the event after the system has been started.
	 */
	public synchronized void postStartInit (  )
	{
		vPeriods.add( new Float(60) );
		vPeriodUnits.add( "SEC" );
		vPeriodTimes.add( new Date() );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method checks the event's prompting conditions and if satisfied triggers the event.
	 */
	protected void checkEventConditions (  )
	{
		//**** triggers the event if the event conditions are satisfied
		if (  isPeriodElapsed()  ) 
		{
			triggerEvent();
		}
		vOccurredEvents.clear();
		vReceivedMessages.clear();
		vSentMessages.clear();
	}

}