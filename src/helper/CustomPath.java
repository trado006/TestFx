package helper;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomPath {
	public URL getURLfromRelativePath(String relativePath) {
		String currPath = this.getClass().getResource("").getPath();
		currPath = currPath.substring(1);
		Path basePath = FileSystems.getDefault().getPath(currPath).getParent();
		//Path resolvedPath = basePath.getParent().resolve("..\\..\\module3\\submodule9\\subsubmodule32\\fileB"); // use getParent() if basePath is a file (not a directory) 
		Path resolvedPath = basePath.resolve(relativePath);
		Path absolutePath = resolvedPath.normalize();
		try {
			URL url = absolutePath.toFile().toURI().toURL();
			return url;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
