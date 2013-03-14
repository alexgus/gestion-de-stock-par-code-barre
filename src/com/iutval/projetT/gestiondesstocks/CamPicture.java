package com.iutval.projetT.gestiondesstocks;

import android.hardware.Camera;

/**
 * This class used to handle pictures took from camera
 * @author Alexandre Guyon
 */
public class CamPicture implements Camera.PictureCallback
{
	/**
	 * The picture data
	 */
	private byte[] data;
	
	
	/**
	 * Get the picture from the camera
	 */
	@Override
    public void onPictureTaken(byte[] data, Camera camera)
	{
		this.data = data;
	}
	
	//***************** Getters and Setters *****************
	
	public byte[] getData()
	{
		return data;
	}
}
