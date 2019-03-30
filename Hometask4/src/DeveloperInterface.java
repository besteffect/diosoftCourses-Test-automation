/**
 This is interface for saving methods for a developer
 */
public interface DeveloperInterface {
    public String takeTask(String story);
    public String talksToBa(BA ba, String story);
    public String developsStory(String story);
    public String sendsStoryForQa(String story);
    public boolean fixBug(String bug);
}