package generatedbyassl.as.aes.user_b.aeself_management.videoconferencing;

import java.io.Serializable;
import generatedbyassl.as.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'inSendingVideo' (specified as FLUENT ASSL tier).
 */
public class INSENDINGVIDEO
	extends ASSLFLUENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'INSENDINGVIDEO' class.
	 */
	static private INSENDINGVIDEO oInstance = null;
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
	private  INSENDINGVIDEO (  )
	{
		vInitiatedByEvents.add( generatedbyassl.as.aes.user_b.events.MEETINGSESSIONENDEDINSTANTMEETING.getInstance() );
		generatedbyassl.as.aes.user_b.events.MEETINGSESSIONENDEDINSTANTMEETING.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vInitiatedByEvents.add( generatedbyassl.as.aes.user_b.events.MEETINGSESSIONENDEDSCHEDULEDMEETING.getInstance() );
		generatedbyassl.as.aes.user_b.events.MEETINGSESSIONENDEDSCHEDULEDMEETING.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.aes.user_b.events.VIDEOUSER_BSENT.getInstance() );
		generatedbyassl.as.aes.user_b.events.VIDEOUSER_BSENT.getInstance().addEventCatcher(this); //**** fluent registers for that event
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'INSENDINGVIDEO' class.
	 */
	static public INSENDINGVIDEO getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new INSENDINGVIDEO();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method calls all the fluent-mapped actions in sequence.
	 */
	protected synchronized void callFluentActions (  )
	{
	}

}