package generatedbyassl.as.aes.user_a.aeself_management.videoconferencing;

import java.io.Serializable;
import generatedbyassl.as.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'InRecordingInstantMeeting' (specified as FLUENT ASSL tier).
 */
public class INRECORDINGINSTANTMEETING
	extends ASSLFLUENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'INRECORDINGINSTANTMEETING' class.
	 */
	static private INRECORDINGINSTANTMEETING oInstance = null;
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
	private  INRECORDINGINSTANTMEETING (  )
	{
		vInitiatedByEvents.add( generatedbyassl.as.aes.user_a.events.INSTANTMEETINGSESSIONSTARTED.getInstance() );
		generatedbyassl.as.aes.user_a.events.INSTANTMEETINGSESSIONSTARTED.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.aes.user_a.events.MEETINGSESSIONENDEDINSTANTMEETING.getInstance() );
		generatedbyassl.as.aes.user_a.events.MEETINGSESSIONENDEDINSTANTMEETING.getInstance().addEventCatcher(this); //**** fluent registers for that event
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'INRECORDINGINSTANTMEETING' class.
	 */
	static public INRECORDINGINSTANTMEETING getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new INRECORDINGINSTANTMEETING();
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