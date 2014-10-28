package introduction.to.algorithms.chapter1;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestInsertSort {

	@Test
	public void 测试只有1个元素() {
		int[] a = { 8 };
		int[] result = InsertSort.sort(a);
		assertArrayEquals(new int[] { 8 }, result);
	}

	@Test
	public void 测试2个元素且已排序() {
		int[] a = { 6, 8 };
		int[] result = InsertSort.sort(a);
		assertArrayEquals(new int[] { 6, 8 }, result);
	}

	@Test
	public void 测试2个元素未排序() {
		int[] a = { 8, 6 };
		int[] result = InsertSort.sort(a);
		assertArrayEquals(new int[] { 6, 8 }, result);
	}

	@Test
	public void 测试多个元素() {
		int[] a = { 5, 2, 4, 6, 1, 3 };
		int[] result = InsertSort.sort(a);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, result);
	}

	@Test
	public void 测试含重复元素() {
		int[] a = { 5, 2, 5, 6, 1, 6, 2 };
		int[] result = InsertSort.sort(a);
		assertArrayEquals(new int[] { 1, 2, 2, 5, 5, 6, 6 }, result);
	}

}
