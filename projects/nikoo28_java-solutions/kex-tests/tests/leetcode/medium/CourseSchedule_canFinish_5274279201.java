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
import java.lang.Integer;
import java.lang.Object;

public class CourseSchedule_canFinish_5274279201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4692;
     Object term4693;
     Object term4695;

    public CourseSchedule_canFinish_5274279201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4692 = newInstance(Class.forName("leetcode.medium.CourseSchedule"));
        term4693 = new Integer(1594426218);
        term4695 = (Object[]) newArray("[I", 2);
        int[] term4696 = (int[]) newIntArray(9);
        int[] term4706 = (int[]) newIntArray(7);
        setIntElement(term4696, 0, -2060535464);
        setIntElement(term4696, 1, -1242946317);
        setIntElement(term4696, 2, -1541566235);
        setIntElement(term4696, 3, -189738995);
        setIntElement(term4696, 4, 1943019963);
        setIntElement(term4696, 5, 186472650);
        setIntElement(term4696, 6, 279675992);
        setIntElement(term4696, 7, -1626074989);
        setIntElement(term4696, 8, -552272253);
        setElement(term4695, 0, term4696);
        setIntElement(term4706, 0, -633523956);
        setIntElement(term4706, 1, 1761540885);
        setIntElement(term4706, 2, -168498989);
        setIntElement(term4706, 3, 388247095);
        setIntElement(term4706, 4, -1320402633);
        setIntElement(term4706, 5, 919602316);
        setIntElement(term4706, 6, 1833713431);
        setElement(term4695, 1, term4706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.CourseSchedule");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term4693;
        args[1] = term4695;
        callMethod(klass, "canFinish", argTypes, term4692, args);
    }

};


