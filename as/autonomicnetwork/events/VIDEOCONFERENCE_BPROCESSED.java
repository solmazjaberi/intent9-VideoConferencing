package generatedbyassl.as.autonomicnetwork.events;

import java.io.Serializable;
import generatedbyassl.as.ASSLEVENT;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'VideoConference_BProcessed' (specified as EVENT ASSL tier).
 */
public class VIDEOCONFERENCE_BPROCESSED
	extends ASSLEVENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'VIDEOCONFERENCE_BPROCESSED' class.
	 */
	static private VIDEOCONFERENCE_BPROCESSED oInstance = null;
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
	private  VIDEOCONFERENCE_BPROCESSED (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'VIDEOCONFERENCE_BPROCESSED' class.
	 */
	static public VIDEOCONFERENCE_BPROCESSED getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new VIDEOCONFERENCE_BPROCESSED();
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
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method checks the event's prompting conditions and if satisfied triggers the event.
	 */
	protected void checkEventConditions (  )
	{
	}

}