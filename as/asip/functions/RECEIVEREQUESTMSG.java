package generatedbyassl.as.asip.functions;

import java.io.Serializable;
import generatedbyassl.as.ASSLFUNCTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'receiveRequestMsg' (specified as FUNCTION ASSL tier).
 */
public class RECEIVEREQUESTMSG
	extends ASSLFUNCTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'RECEIVEREQUESTMSG' class.
	 */
	static private RECEIVEREQUESTMSG oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Action parameter.
	 */
	protected String USERNAME = null;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  RECEIVEREQUESTMSG (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'RECEIVEREQUESTMSG' class.
	 */
	static public RECEIVEREQUESTMSG getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new RECEIVEREQUESTMSG();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Embeds statements to be performed by the function.
	 */
	public void DOES (  )
	{
		super.DOES();
		if (  generatedbyassl.as.asip.functions.RECEIVEREQUESTMSG.getInstance().USERNAME  ==  "User_A"  ) 
		{
			generatedbyassl.as.asip.channels.VIDEOCONFERENCELINK.getInstance().getMessage("generatedbyassl.as.asip.messages.MSGREQUESTA");
		}
		else if (  generatedbyassl.as.asip.functions.RECEIVEREQUESTMSG.getInstance().USERNAME  ==  "User_B"  ) 
		{
			generatedbyassl.as.asip.channels.VIDEOCONFERENCELINK.getInstance().getMessage("generatedbyassl.as.asip.messages.MSGREQUESTB");
		}
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Performs the function (performs with default arguments).
	 */
	public synchronized void perform (  )
	{
		//**** Calls perform() with arguments by default.
		//**** If needed, change the arguments by default with appropriate ones.
		//****************************************************
		perform("");
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Performs the function.
	 */
	public synchronized void perform ( String USERNAME )
	{
		this.USERNAME = USERNAME;
		super.perform();
	}

}