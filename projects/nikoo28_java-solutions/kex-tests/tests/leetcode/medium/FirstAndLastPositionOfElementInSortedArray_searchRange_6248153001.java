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

public class FirstAndLastPositionOfElementInSortedArray_searchRange_6248153001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1198;
     Object term1199;
     Object term1209;

    public FirstAndLastPositionOfElementInSortedArray_searchRange_6248153001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1198 = newInstance(Class.forName("leetcode.medium.FirstAndLastPositionOfElementInSortedArray"));
        term1199 = (int[]) newIntArray(9);
        setIntElement(term1199, 0, 1870727665);
        setIntElement(term1199, 1, -519881101);
        setIntElement(term1199, 2, -680920524);
        setIntElement(term1199, 3, -916335264);
        setIntElement(term1199, 4, -919416536);
        setIntElement(term1199, 5, -43417861);
        setIntElement(term1199, 6, -1533843432);
        setIntElement(term1199, 7, -123338791);
        setIntElement(term1199, 8, -1467089634);
        term1209 = new Integer(413548937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.FirstAndLastPositionOfElementInSortedArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1199;
        args[1] = term1209;
        callMethod(klass, "searchRange", argTypes, term1198, args);
    }

};


