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

public class LengthOfLongestPalindrome_main_9363731232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10140;

    public LengthOfLongestPalindrome_main_9363731232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10140 = (Object[]) newArray("java.lang.String", 8);
        setElement(term10140, 0, "OcJCIDNIXA");
        setElement(term10140, 1, "XfRABIFVEp");
        setElement(term10140, 2, "MHGKyEnwKc");
        setElement(term10140, 3, "ShIELyuULw");
        setElement(term10140, 4, "IpQuOGMgmj");
        setElement(term10140, 5, "pJbnHTYrxn");
        setElement(term10140, 6, "iIRsCSYqXH");
        setElement(term10140, 7, "nghfqDXyCG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.LengthOfLongestPalindrome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10140;
        callMethod(klass, "main", argTypes, null, args);
    }

};


