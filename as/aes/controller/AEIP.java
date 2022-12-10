package generatedbyassl.as.aes.controller;

import java.io.Serializable;
import java.util.Hashtable;
import generatedbyassl.as.ASSLMESSAGE;
import generatedbyassl.as.ASSLCHANNEL;
import generatedbyassl.as.ASSLFUNCTION;
import generatedbyassl.as.ASSLMANAGED_ELEMENT;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'AEIP' (specified as AEIP ASSL tier).
 */
public class AEIP
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'AEIP' class.
	 */
	static private AEIP oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'message name'-'message reference' of all the messages specified by AEIP.
	 */
	public Hashtable<String, ASSLMESSAGE> MESSAGES = new Hashtable<String, ASSLMESSAGE>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'channel name'-'channel reference' of all the channels specified by AEIP.
	 */
	public Hashtable<String, ASSLCHANNEL> CHANNELS = new Hashtable<String, ASSLCHANNEL>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'function name'-'function reference' of all the functions specified by AEIP.
	 */
	public Hashtable<String, ASSLFUNCTION> FUNCTIONS = new Hashtable<String, ASSLFUNCTION>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'managed element name'-'managed element reference' of all the managed elements specified by AEIP.
	 */
	private Hashtable<String, ASSLMANAGED_ELEMENT> MANAGED_ELEMENTS = new Hashtable<String, ASSLMANAGED_ELEMENT>();

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  AEIP (  )
	{
		MESSAGES.put( "MSGVIDEOCONFERENCE", generatedbyassl.as.aes.controller.aeip.messages.MSGVIDEOCONFERENCE.getInstance() );
		MESSAGES.put( "MSGSCHEDULEDMEETINGBEGIN_A", generatedbyassl.as.aes.controller.aeip.messages.MSGSCHEDULEDMEETINGBEGIN_A.getInstance() );
		MESSAGES.put( "MSGSCHEDULEDMEETINGEND_A", generatedbyassl.as.aes.controller.aeip.messages.MSGSCHEDULEDMEETINGEND_A.getInstance() );
		MESSAGES.put( "MSGINSTANTMEETINGBEGIN_A", generatedbyassl.as.aes.controller.aeip.messages.MSGINSTANTMEETINGBEGIN_A.getInstance() );
		MESSAGES.put( "MSGINSTANTMEETINGEND_A", generatedbyassl.as.aes.controller.aeip.messages.MSGINSTANTMEETINGEND_A.getInstance() );
		MESSAGES.put( "MSGSCHEDULEDMEETINGBEGIN_B", generatedbyassl.as.aes.controller.aeip.messages.MSGSCHEDULEDMEETINGBEGIN_B.getInstance() );
		MESSAGES.put( "MSGSCHEDULEDMEETINGEND_B", generatedbyassl.as.aes.controller.aeip.messages.MSGSCHEDULEDMEETINGEND_B.getInstance() );
		MESSAGES.put( "MSGINSTANTMEETINGBEGIN_B", generatedbyassl.as.aes.controller.aeip.messages.MSGINSTANTMEETINGBEGIN_B.getInstance() );
		MESSAGES.put( "MSGINSTANTMEETINGEND_B", generatedbyassl.as.aes.controller.aeip.messages.MSGINSTANTMEETINGEND_B.getInstance() );
		CHANNELS.put( "CONTROLLER_LINK", generatedbyassl.as.aes.controller.aeip.channels.CONTROLLER_LINK.getInstance() );
		FUNCTIONS.put( "SENDVIDEOCONFERENCEMSG", generatedbyassl.as.aes.controller.aeip.functions.SENDVIDEOCONFERENCEMSG.getInstance() );
		FUNCTIONS.put( "SENDBEGINMSGS", generatedbyassl.as.aes.controller.aeip.functions.SENDBEGINMSGS.getInstance() );
		FUNCTIONS.put( "SENDENDSESSIONMSGS", generatedbyassl.as.aes.controller.aeip.functions.SENDENDSESSIONMSGS.getInstance() );
		MANAGED_ELEMENTS.put( "MEETINGTOOL_A", generatedbyassl.as.aes.controller.aeip.managed_elements.MEETINGTOOL_A.getInstance() );
		MANAGED_ELEMENTS.put( "MEETINGTOOL_B", generatedbyassl.as.aes.controller.aeip.managed_elements.MEETINGTOOL_B.getInstance() );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'AEIP' class.
	 */
	static public AEIP getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new AEIP();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a message specified by name.
	 */
	public ASSLMESSAGE getMessage ( String psMessageName )
	{
		return MESSAGES.get(psMessageName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a channel specified by name.
	 */
	public ASSLCHANNEL getChannel ( String psChannelName )
	{
		return CHANNELS.get(psChannelName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a function specified by name.
	 */
	public ASSLFUNCTION getFunction ( String psFunctionName )
	{
		return FUNCTIONS.get(psFunctionName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a managed element specified by name.
	 */
	public ASSLMANAGED_ELEMENT getManagedElement ( String psManagedElementName )
	{
		return MANAGED_ELEMENTS.get(psManagedElementName);
	}

}