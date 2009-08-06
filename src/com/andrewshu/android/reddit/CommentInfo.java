package com.andrewshu.android.reddit;

import java.util.HashMap;

import org.codehaus.jackson.JsonNode;

/**
 * Class representing a single comment in reddit API.
 * 
 * @author TalkLittle
 *
 */
public class CommentInfo {
	public static final String AUTHOR      = "author";
	public static final String BODY        = "body";
	public static final String BODY_HTML   = "body_html";
	public static final String CREATED     = "created";
	public static final String CREATED_UTC = "created_utc";
	public static final String DOWNS       = "downs";
	public static final String ID          = "id";
	public static final String LINK_ID     = "link_id";
	public static final String NAME        = "name"; // thing fullname
	public static final String PARENT_ID   = "parent_id";
	public static final String UPS         = "ups";
	public static JsonNode REPLIES;  // not stored here. use another JSON GET if necessary
	
	public static final String[] _KEYS = {
		AUTHOR, BODY, BODY_HTML, CREATED, CREATED_UTC, DOWNS, ID, LINK_ID, NAME, PARENT_ID, UPS
	};
	
	public HashMap<String, String> mValues = new HashMap<String, String>();

	// TODO?: Make setters for everything instead... or not.
	public void put(String key, String value) {
		mValues.put(key, value);
	}
	
	public String getThingFullname() {
		return mValues.get(NAME);
	}
	
	public String getId() {
		return mValues.get(ID);
	}
	
	public String getSubmissionTime() {
		return mValues.get(CREATED);
	}

	public String getAuthor() {
		return mValues.get(AUTHOR);
	}
	
	
}