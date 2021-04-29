package codetime.data;
public class TopVideos {

    private int videoId;
    private String videoName;
    private String videoLevel;
    private String videoDuration;
    private String videoCategory;
    private String videoDescription;
    private String videoCreator;
    private String videoUrl;

    public TopVideos(int videoId, String videoName, String videoLevel, String videoDuration, String videoCategory, String videoDescription, String videoCreator, String videoUrl) {
        this.videoId = videoId;
        this.videoName = videoName;
        this.videoLevel = videoLevel;
        this.videoDuration = videoDuration;
        this.videoCategory = videoCategory;
        this.videoDescription = videoDescription;
        this.videoCreator = videoCreator;
        this.videoUrl = videoUrl;
    }

    public TopVideos(String videoName, String videoLevel, String videoDuration, String videoCategory, String videoDescription, String videoCreator, String videoUrl) {
        this.videoName = videoName;
        this.videoLevel = videoLevel;
        this.videoDuration = videoDuration;
        this.videoCategory = videoCategory;
        this.videoDescription = videoDescription;
        this.videoCreator = videoCreator;
        this.videoUrl = videoUrl;
    }

    public int getVideoId() {
        return videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public String getVideoLevel() {
        return videoLevel;
    }

    public String getVideoDuration() {
        return videoDuration;
    }

    public String getVideoCategory() {
        return videoCategory;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public String getVideoCreator() {
        return videoCreator;
    }

    public String getVideoUrl() {
        return videoUrl;
    }
}
