package generatedbyassl.as.aes.user_b.events;

import java.io.Serializable;
import generatedbyassl.as.ASSLEVENT;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'MeetingSessionEndedInstantMeeting' (specified as EVENT ASSL tier).
 */
public class MEETINGSESSIONENDEDINSTANTMEETING
	extends ASSLEVENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'MEETINGSESSIONENDEDINSTANTMEETING' class.
	 */
	static private MEETINGSESSIONENDEDINSTANTMEETING oInstance = null;
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
	private  MEETINGSESSIONENDEDINSTANTMEETING (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'MEETINGSESSIONENDEDINSTANTMEETING' class.
	 */
	static public MEETINGSESSIONENDEDINSTANTMEETING getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new MEETINGSESSIONENDEDINSTANTMEETING();
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
		generatedbyassl.as.aes.controller.aeip.messages.MSGINSTANTMEETINGEND_B.getInstance().addMsgCatcherReceivedEvent(this);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method checks the event's prompting conditions and if satisfied triggers the event.
	 */
	protected void checkEventConditions (  )
	{
		//**** triggers the event if the event conditions are satisfied
		if (  isMessageReceived(generatedbyassl.as.aes.controller.aeip.messages.MSGINSTANTMEETINGEND_B.getInstance())  ) 
		{
			triggerEvent();
		}
		vOccurredEvents.clear();
		vReceivedMessages.clear();
		vSentMessages.clear();
	}

}