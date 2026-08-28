interface Camera{
    void takephoto();
} 
interface multiplayer {
    void playmusic();
}
class smaartphone implements Camera, multiplayer {
    public void takephoto() {
        System.out.println("Picture taken");
    }
    public void playmusic() {
        System.out.println("Music playing");
    }
}
public class multipleinheritence {
    public static void main(String[] args) {
        smaartphone sp = new smaartphone();
        sp.takephoto();
        sp.playmusic();
    }
}