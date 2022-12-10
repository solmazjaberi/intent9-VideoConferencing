package generatedbyassl.as.aes.user_b.aeself_management.videoconferencing;

import java.io.Serializable;
import generatedbyassl.as.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'inStartingScheduledMeetingSession' (specified as FLUENT ASSL tier).
 */
public class INSTARTINGSCHEDULEDMEETINGSESSION
	extends ASSLFLUENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'INSTARTINGSCHEDULEDMEETINGSESSION' class.
	 */
	static private INSTARTINGSCHEDULEDMEETINGSESSION oInstance = null;
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
	private  INSTARTINGSCHEDULEDMEETINGSESSION (  )
	{
		vInitiatedByEvents.add( generatedbyassl.as.aes.user_b.events.SCHEDULEDMEETINGSESSIONISSTARTING.getInstance() );
		generatedbyassl.as.aes.user_b.events.SCHEDULEDMEETINGSESSIONISSTARTING.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.aes.user_b.events.SCHEDULEDMEETINGSESSIONSTARTED.getInstance() );
		generatedbyassl.as.aes.user_b.events.SCHEDULEDMEETINGSESSIONSTARTED.getInstance().addEventCatcher(this); //**** fluent registers for that event
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'INSTARTINGSCHEDULEDMEETINGSESSION' class.
	 */
	static public INSTARTINGSCHEDULEDMEETINGSESSION getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new INSTARTINGSCHEDULEDMEETINGSESSION();
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