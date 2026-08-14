package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class FloodFill_floodFill_20002931771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4530;
     Object term4531;
     Object term4589;
     Object term4591;
     Object term4593;

    public FloodFill_floodFill_20002931771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4530 = newInstance(Class.forName("leetcode.FloodFill"));
        term4531 = (Object[]) newArray("[I", 9);
        int[] term4532 = (int[]) newIntArray(6);
        int[] term4539 = (int[]) newIntArray(5);
        int[] term4545 = (int[]) newIntArray(9);
        int[] term4555 = (int[]) newIntArray(3);
        int[] term4559 = (int[]) newIntArray(9);
        int[] term4569 = (int[]) newIntArray(3);
        int[] term4573 = (int[]) newIntArray(3);
        int[] term4577 = (int[]) newIntArray(8);
        int[] term4586 = (int[]) newIntArray(2);
        setIntElement(term4532, 0, -1541981599);
        setIntElement(term4532, 1, 1605456363);
        setIntElement(term4532, 2, 2059896693);
        setIntElement(term4532, 3, 2109912812);
        setIntElement(term4532, 4, 1841286431);
        setIntElement(term4532, 5, -1723168189);
        setElement(term4531, 0, term4532);
        setIntElement(term4539, 0, -675283917);
        setIntElement(term4539, 1, -2093862988);
        setIntElement(term4539, 2, 1337828646);
        setIntElement(term4539, 3, 532666604);
        setIntElement(term4539, 4, -13725716);
        setElement(term4531, 1, term4539);
        setIntElement(term4545, 0, -1695750603);
        setIntElement(term4545, 1, 63677360);
        setIntElement(term4545, 2, 1478914037);
        setIntElement(term4545, 3, 1630231519);
        setIntElement(term4545, 4, 1460702778);
        setIntElement(term4545, 5, -1398142433);
        setIntElement(term4545, 6, -1112119058);
        setIntElement(term4545, 7, 2073858334);
        setIntElement(term4545, 8, -1693535639);
        setElement(term4531, 2, term4545);
        setIntElement(term4555, 0, 1344744036);
        setIntElement(term4555, 1, -98060427);
        setIntElement(term4555, 2, -1272268399);
        setElement(term4531, 3, term4555);
        setIntElement(term4559, 0, 1120271104);
        setIntElement(term4559, 1, -128435804);
        setIntElement(term4559, 2, 2136158480);
        setIntElement(term4559, 3, 2118747457);
        setIntElement(term4559, 4, 1868344256);
        setIntElement(term4559, 5, 1857693976);
        setIntElement(term4559, 6, 1631305277);
        setIntElement(term4559, 7, 162113491);
        setIntElement(term4559, 8, -932147928);
        setElement(term4531, 4, term4559);
        setIntElement(term4569, 0, 487369012);
        setIntElement(term4569, 1, -179238712);
        setIntElement(term4569, 2, -2018735535);
        setElement(term4531, 5, term4569);
        setIntElement(term4573, 0, -658524954);
        setIntElement(term4573, 1, -2009613557);
        setIntElement(term4573, 2, 654195547);
        setElement(term4531, 6, term4573);
        setIntElement(term4577, 0, 1622857008);
        setIntElement(term4577, 1, 934338954);
        setIntElement(term4577, 2, 598635505);
        setIntElement(term4577, 3, -944986533);
        setIntElement(term4577, 4, 1894454926);
        setIntElement(term4577, 5, 1415142780);
        setIntElement(term4577, 6, -574105759);
        setIntElement(term4577, 7, -1165271567);
        setElement(term4531, 7, term4577);
        setIntElement(term4586, 0, 376834234);
        setIntElement(term4586, 1, -1911972560);
        setElement(term4531, 8, term4586);
        term4589 = new Integer(-642716895);
        term4591 = new Integer(1743398246);
        term4593 = new Integer(-934658823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.FloodFill");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term4531;
        args[1] = term4589;
        args[2] = term4591;
        args[3] = term4593;
        callMethod(klass, "floodFill", argTypes, term4530, args);
    }

};


