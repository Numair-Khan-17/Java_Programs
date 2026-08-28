class VideoProcessor {
    void downloadVideo() {
        System.out.println("Downloading video...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Video downloaded successfully.");
    }
    void generateThumbnail() {
        System.out.println("Generating thumbnail...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thumbnail generated successfully.");
    }
    void sendNotification() {
        System.out.println("Sending notification...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Notification sent successfully.");
    }
}
class DownloadThread extends Thread {
    VideoProcessor video;
    DownloadThread(VideoProcessor video) {
        this.video = video;
    }
    public void run() {
        video.downloadVideo();
    }
}
class ThumbnailThread extends Thread {
    VideoProcessor video;
    ThumbnailThread(VideoProcessor video) {
        this.video = video;
    }
    public void run() {
        video.generateThumbnail();
    }
}
class NotificationThread extends Thread {
    VideoProcessor video;
    NotificationThread(VideoProcessor video) {
        this.video = video;
    }
    public void run() {
        video.sendNotification();
    }
}
public class YouTubeVideoProcessing {
    public static void main(String[] args) {
        VideoProcessor video = new VideoProcessor();
        DownloadThread t1 = new DownloadThread(video);
        ThumbnailThread t2 = new ThumbnailThread(video);
        NotificationThread t3 = new NotificationThread(video);
        t1.start();
        t2.start();
        t3.start();
    }
}