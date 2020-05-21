/**
 * 
 */
package com.keg.rest;

/**
 * @author Owner
 * 
 *         This is converted to a JSON object thanks to springs
 *         MappingJackson2HttpMessageConverter
 *
 */
public class Greeting
{
	private long id;
	private String content;

	public Greeting(long id, String content)
	{
		this.id = id;
		this.content = content;
	}

	/**
	 * @return the id
	 */
	public long getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id)
	{
		this.id = id;
	}

	/**
	 * @return the content
	 */
	public String getContent()
	{
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content)
	{
		this.content = content;
	}

}
