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

public class JumpGame_canJump_13158988151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486;
     Object term487;

    public JumpGame_canJump_13158988151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term486 = newInstance(Class.forName("leetcode.medium.JumpGame"));
        term487 = (int[]) newIntArray(6);
        setIntElement(term487, 0, 1045657203);
        setIntElement(term487, 1, 1386130016);
        setIntElement(term487, 2, 1072005683);
        setIntElement(term487, 3, 1861318859);
        setIntElement(term487, 4, 1474524152);
        setIntElement(term487, 5, 568954359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.JumpGame");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term487;
        callMethod(klass, "canJump", argTypes, term486, args);
    }

};


