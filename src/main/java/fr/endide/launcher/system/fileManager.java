package fr.endide.launcher.system;






import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;

public class fileManager {
    static getOS getOS = new getOS();
    public static File createGameDir() {
        final String userhome = System.getProperty("user.home");
        if (getOS.isWindows() == true) {
            return new File(userhome + File.separator + "AppData" + File.separator + "Roaming" + File.separator + "." + "endideLauncher");
        }
        return new File(userhome + File.separator + "." + "endideLauncher");
    }
        public File getAssetsDir(){
            return new File(createGameDir(), "assets");
        }
        public File getLibsDir(){
            return new File(createGameDir(), "libs");
        }
        public File getNativesDir(String version){
            return new File(createGameDir(), File.separator + "runtime" + File.separator + version + File.separator + "natives");
        }
        public File getRuntimeDir(){
        return new File(createGameDir(), "runtime");
    }
        public static File getServerDir(){
        return new File(createGameDir(), "servers");
    }
        public static File getServerInstallDir(){
        return new File(getServerDir(), "install");
    }
        public File getConfigFile(){
        return new File(getServerDir(), "config.properties");
    }
    public static File getThemeDir(){
        return new File(createGameDir(), "themes");
    }
    public static URL getThemes(String fxml, String name) throws MalformedURLException {
        return Path.of(getThemeDir() + File.separator + name + File.separator + fxml + ".fxml").toUri().toURL();
    }
    public static String getThemeName(){
        return "default";
    }
}




