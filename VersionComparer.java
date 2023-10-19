public class VersionComparer {

	public static int compareVersions(String version1, String version2) {
		// Split version strings into arrays of string
		String[] parts1 = version1.split("\\.");
		String[] parts2 = version2.split("\\.");

		// Compare version components
		for (int i = 0; i < Math.max(parts1.length, parts2.length); i++) {
			int v1 = (i < parts1.length) ? Integer.parseInt(parts1[i]) : 0;
			int v2 = (i < parts2.length) ? Integer.parseInt(parts2[i]) : 0;

			if (v1 < v2) // version1 is less than version2
				return -1;
			if (v1 > v2) // version1 is greater than version2
				return 1;
		}

		return 0; // version1 is equal to version2
	}

	public static void main(String[] args) {
		String version1 = "1.2";
		String version2 = "1.1";

		int result = compareVersions(version1, version2);

		if (result < 0) {
			System.out.println('"' + version1 + '"' + " is less than " + '"' + version2 + '"' + ".");
		} else if (result > 0) {
			System.out.println('"' + version1 + '"' + " is greater than " + '"' + version2 + '"' + ".");
		} else {
			System.out.println('"' + version1 + '"' + " is equal to " + '"' + version2 + '"' + ".");
		}

	}

}
