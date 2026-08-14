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

public class MergeSortedArray_main_18969254902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term955;

    public MergeSortedArray_main_18969254902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term955 = (Object[]) newArray("java.lang.String", 6);
        setElement(term955, 0, "RkybSrpybU");
        setElement(term955, 1, "xOEqzGAmDU");
        setElement(term955, 2, "eZFUvlxvGV");
        setElement(term955, 3, "BYqFIqCKAV");
        setElement(term955, 4, "vrQLuWIDJX");
        setElement(term955, 5, "flxyYxBRtu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MergeSortedArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term955;
        callMethod(klass, "main", argTypes, null, args);
    }

};


