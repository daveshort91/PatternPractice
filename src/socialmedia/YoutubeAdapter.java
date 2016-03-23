public class YoutubeAdapter implements SocialMediaEntry {
	
	String _user;
	String _postText;

	public void YoutubeAdapter (YouTubeVideo youtubeEntry) {
		String title = youtubeEntry.getTitle();
		String description = youtubeEntry.getDescription();

		_user = youtubeEntry.getAuthor();
		_postText = title + ": " + description;

	}

	public String getUser () {
		return _user;
	}

    public String getPostText () {
    	return _postText;
    }

    public void setUser (String user) {
    	_user = user;
    }

    public void setDescription (String postText) {
    	_postText = postText;
    }
}