package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UpdateMatrix_updateMatrix_17580946571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1263;
     Object term1264;

    public UpdateMatrix_updateMatrix_17580946571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1263 = newInstance(Class.forName("leetcode.medium.UpdateMatrix"));
        term1264 = (Object[]) newArray("[I", 6);
        int[] term1265 = (int[]) newIntArray(0);
        int[] term1266 = (int[]) newIntArray(6);
        int[] term1273 = (int[]) newIntArray(5);
        int[] term1279 = (int[]) newIntArray(1);
        int[] term1281 = (int[]) newIntArray(0);
        int[] term1282 = (int[]) newIntArray(6);
        setElement(term1264, 0, term1265);
        setIntElement(term1266, 0, 76929641);
        setIntElement(term1266, 1, -2003192918);
        setIntElement(term1266, 2, -1362856620);
        setIntElement(term1266, 3, -1835839814);
        setIntElement(term1266, 4, -1404350380);
        setIntElement(term1266, 5, -2013924238);
        setElement(term1264, 1, term1266);
        setIntElement(term1273, 0, 579006268);
        setIntElement(term1273, 1, -1694747156);
        setIntElement(term1273, 2, 1466373988);
        setIntElement(term1273, 3, -358526505);
        setIntElement(term1273, 4, 1843268026);
        setElement(term1264, 2, term1273);
        setIntElement(term1279, 0, 954660603);
        setElement(term1264, 3, term1279);
        setElement(term1264, 4, term1281);
        setIntElement(term1282, 0, -1351605385);
        setIntElement(term1282, 1, 278355793);
        setIntElement(term1282, 2, -310648604);
        setIntElement(term1282, 3, -648200466);
        setIntElement(term1282, 4, 2007134147);
        setIntElement(term1282, 5, 993388358);
        setElement(term1264, 5, term1282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.UpdateMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1264;
        callMethod(klass, "updateMatrix", argTypes, term1263, args);
    }

};


