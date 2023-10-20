package eclipsetest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LineSegmentOverlapTest {

	// all the test cases in which lines are overlap with each other.
	@Test
	void testSegmentsOverlap() {
		assertTrue(LineSegmentOverlap.doSegmentsOverlap(1, 5, 2, 6));
		assertFalse(LineSegmentOverlap.doSegmentsOverlap(1, 5, 6, 8));
		assertTrue(LineSegmentOverlap.doSegmentsOverlap(1, 7, 3, 5));
		assertFalse(LineSegmentOverlap.doSegmentsOverlap(1, 3, 4, 6));
	}

	// endpoint of first line is same as second line initial point.
	@Test
	void testSegmentsBarelyTouch() {
		assertTrue(LineSegmentOverlap.doSegmentsOverlap(1, 3, 3, 5));
	}

	// second line segment is within the first line segment.
	@Test
	void testOneSegmentWithinAnother() {
		assertTrue(LineSegmentOverlap.doSegmentsOverlap(1, 7, 3, 5));
	}

	// one point line segment overlap with initial point of second line segment.
	@Test
	void testOnePointOverlapsWithLine() {
		assertTrue(LineSegmentOverlap.doSegmentsOverlap(1, 1, 1, 5));
	}

	// first line segment endpoint overlap with starting point of second line
	// segment.
	@Test
	void testSegmentsTouchAtEndpoint() {
		assertTrue(LineSegmentOverlap.doSegmentsOverlap(1, 5, 5, 7));
	}

	// two line segment don't overlap with each other.
	@Test
	void testSegmentsDoNotOverlap() {
		assertFalse(LineSegmentOverlap.doSegmentsOverlap(1, 3, 4, 6));
	}

	// two line segments are single points.
	@Test
	void testBothSegmentsAreSinglePoints() {
		assertTrue(LineSegmentOverlap.doSegmentsOverlap(1, 1, 1, 1));
	}

	// one line segment with point which is not overlap with another line segment.
	@Test
	void testOneSegmentIsSinglePointAndOtherIsLine() {
		assertFalse(LineSegmentOverlap.doSegmentsOverlap(1, 1, 2, 4));
	}

}
