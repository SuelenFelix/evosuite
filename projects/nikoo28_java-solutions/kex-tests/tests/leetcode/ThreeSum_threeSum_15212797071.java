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

public class ThreeSum_threeSum_15212797071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11944;
     Object term11945;

    public ThreeSum_threeSum_15212797071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11944 = newInstance(Class.forName("leetcode.ThreeSum"));
        term11945 = (int[]) newIntArray(9);
        setIntElement(term11945, 0, -1878319299);
        setIntElement(term11945, 1, -690862846);
        setIntElement(term11945, 2, 805027262);
        setIntElement(term11945, 3, 717389178);
        setIntElement(term11945, 4, -1265226052);
        setIntElement(term11945, 5, 1970023149);
        setIntElement(term11945, 6, -336351735);
        setIntElement(term11945, 7, 1938932230);
        setIntElement(term11945, 8, 1128720609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ThreeSum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term11945;
        callMethod(klass, "threeSum", argTypes, term11944, args);
    }

};


