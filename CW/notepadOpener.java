import java.io.IOException;

public class notepadOpener {
    static void main(String[] args) throws IOException {
        new ProcessBuilder("notepad.exe").start();
    }
}
