import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class VersionComparerTest {

	@Test
	void testCompareVersions() {
		assertEquals(1, VersionComparer.compareVersions("1.2", "1.1"));
		assertEquals(-1, VersionComparer.compareVersions("1.1", "1.2"));
		assertEquals(0, VersionComparer.compareVersions("1.2", "1.2"));
		assertEquals(1, VersionComparer.compareVersions("2.0.1", "2.0"));
		assertEquals(-1, VersionComparer.compareVersions("2.0", "2.0.1"));
		assertEquals(1, VersionComparer.compareVersions("1.2.3.4", "1.2.3.3"));
		assertEquals(-1, VersionComparer.compareVersions("1.2.3.3", "1.2.3.4"));
		assertEquals(0, VersionComparer.compareVersions("1.2.3.4", "1.2.3.4"));
		assertEquals(0, VersionComparer.compareVersions("1.0.0.0", "1.0"));
		assertEquals(0, VersionComparer.compareVersions("1.0", "1.0.0.0"));
		assertEquals(-1, VersionComparer.compareVersions("1.9.9.9", "2.0"));
	}

	@Test
	void testCompareVersionsWithDifferentLengths() {
		assertEquals(1, VersionComparer.compareVersions("1.2.3", "1.2"));
		assertEquals(-1, VersionComparer.compareVersions("1.2", "1.2.3"));
	}

	@Test
	void testCompareVersionsWithSingleDigit() {
		assertEquals(0, VersionComparer.compareVersions("1", "1"));
		assertEquals(1, VersionComparer.compareVersions("2", "1"));
		assertEquals(-1, VersionComparer.compareVersions("1", "2"));
	}
}
