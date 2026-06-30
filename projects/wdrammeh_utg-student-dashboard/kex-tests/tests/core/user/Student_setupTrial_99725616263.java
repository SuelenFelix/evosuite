package core.user;

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
import static core.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Student_setupTrial_99725616263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2468;

    public Student_setupTrial_99725616263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2468 = (Object[]) newArray("java.lang.String", 7);
        setElement(term2468, 0, "hxCBltsObl");
        setElement(term2468, 1, "BndsHwAFMv");
        setElement(term2468, 2, "GzFkzHGYFt");
        setElement(term2468, 3, "tShwQLRGNe");
        setElement(term2468, 4, "LvtrsXUliU");
        setElement(term2468, 5, "xLbjWUgOIL");
        setElement(term2468, 6, "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.user.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2468;
        callMethod(klass, "setupTrial", argTypes, null, args);
    }

};


