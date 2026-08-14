package leetcode.easy;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MatrixDiagonalSum_diagonalSum_7814296431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1312;
     Object term1313;

    public MatrixDiagonalSum_diagonalSum_7814296431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1312 = newInstance(Class.forName("leetcode.easy.MatrixDiagonalSum"));
        term1313 = (Object[]) newArray("[I", 5);
        int[] term1314 = (int[]) newIntArray(6);
        int[] term1321 = (int[]) newIntArray(5);
        int[] term1327 = (int[]) newIntArray(3);
        int[] term1331 = (int[]) newIntArray(7);
        int[] term1339 = (int[]) newIntArray(2);
        setIntElement(term1314, 0, -1362856620);
        setIntElement(term1314, 1, -1835839814);
        setIntElement(term1314, 2, -1404350380);
        setIntElement(term1314, 3, -2013924238);
        setIntElement(term1314, 4, 579006268);
        setIntElement(term1314, 5, -1694747156);
        setElement(term1313, 0, term1314);
        setIntElement(term1321, 0, 1466373988);
        setIntElement(term1321, 1, -358526505);
        setIntElement(term1321, 2, 1843268026);
        setIntElement(term1321, 3, 954660603);
        setIntElement(term1321, 4, -1351605385);
        setElement(term1313, 1, term1321);
        setIntElement(term1327, 0, 278355793);
        setIntElement(term1327, 1, -310648604);
        setIntElement(term1327, 2, -648200466);
        setElement(term1313, 2, term1327);
        setIntElement(term1331, 0, 2007134147);
        setIntElement(term1331, 1, 993388358);
        setIntElement(term1331, 2, -765191335);
        setIntElement(term1331, 3, -1697741155);
        setIntElement(term1331, 4, 1295839803);
        setIntElement(term1331, 5, -1891015523);
        setIntElement(term1331, 6, -1560631747);
        setElement(term1313, 3, term1331);
        setIntElement(term1339, 0, 1215150180);
        setIntElement(term1339, 1, -1422859977);
        setElement(term1313, 4, term1339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MatrixDiagonalSum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1313;
        callMethod(klass, "diagonalSum", argTypes, term1312, args);
    }

};


