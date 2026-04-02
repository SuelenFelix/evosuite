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

public class ReshapeTheMatrix_matrixReshape_19107725601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6285;
     Object term6286;
     Object term6320;
     Object term6322;

    public ReshapeTheMatrix_matrixReshape_19107725601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6285 = newInstance(Class.forName("leetcode.ReshapeTheMatrix"));
        term6286 = (Object[]) newArray("[I", 5);
        int[] term6287 = (int[]) newIntArray(3);
        int[] term6291 = (int[]) newIntArray(9);
        int[] term6301 = (int[]) newIntArray(2);
        int[] term6304 = (int[]) newIntArray(5);
        int[] term6310 = (int[]) newIntArray(9);
        setIntElement(term6287, 0, -137577510);
        setIntElement(term6287, 1, 719185716);
        setIntElement(term6287, 2, 1624820010);
        setElement(term6286, 0, term6287);
        setIntElement(term6291, 0, -831921156);
        setIntElement(term6291, 1, -2085566906);
        setIntElement(term6291, 2, 1773193728);
        setIntElement(term6291, 3, -1341357647);
        setIntElement(term6291, 4, 138447019);
        setIntElement(term6291, 5, 114915275);
        setIntElement(term6291, 6, 338519695);
        setIntElement(term6291, 7, 2025566580);
        setIntElement(term6291, 8, -1231122778);
        setElement(term6286, 1, term6291);
        setIntElement(term6301, 0, 1923558221);
        setIntElement(term6301, 1, 1762934060);
        setElement(term6286, 2, term6301);
        setIntElement(term6304, 0, -859828739);
        setIntElement(term6304, 1, 1986855642);
        setIntElement(term6304, 2, 1280322790);
        setIntElement(term6304, 3, -1702209203);
        setIntElement(term6304, 4, -1592307668);
        setElement(term6286, 3, term6304);
        setIntElement(term6310, 0, -203832871);
        setIntElement(term6310, 1, 1151963130);
        setIntElement(term6310, 2, -1855819749);
        setIntElement(term6310, 3, 1059048043);
        setIntElement(term6310, 4, 537273345);
        setIntElement(term6310, 5, -346107257);
        setIntElement(term6310, 6, -1577393360);
        setIntElement(term6310, 7, 1112256038);
        setIntElement(term6310, 8, -441333794);
        setElement(term6286, 4, term6310);
        term6320 = new Integer(1504698817);
        term6322 = new Integer(-2018333791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ReshapeTheMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term6286;
        args[1] = term6320;
        args[2] = term6322;
        callMethod(klass, "matrixReshape", argTypes, term6285, args);
    }

};


