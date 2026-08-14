package net.obvj.performetrics;

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
import static net.obvj.performetrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Counter_elapsedTime_27493542013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220381;
     Object enum799;

    public Counter_elapsedTime_27493542013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term220441 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term220440 = ((Class) term220441).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term220440).setAccessible(true);
        Object enum797 = ((Field) term220440).get((Object) null);
        Class<? extends Object> term220656 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term220655 = ((Class) term220656).getDeclaredField((String) "FAST");
        ((Field) term220655).setAccessible(true);
        Object enum798 = ((Field) term220655).get((Object) null);
        term220381 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term220381, term220381.getClass(), "type", enum797);
        setField(term220381, term220381.getClass(), "conversionMode", enum798);
        setLongField(term220381, term220381.getClass(), "unitsBefore", -1592696983130738594L);
        setLongField(term220381, term220381.getClass(), "unitsAfter", 6902365338255307910L);
        setBooleanField(term220381, term220381.getClass(), "unitsAfterSet", true);
        Class<? extends Object> term220860 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term220859 = ((Class) term220860).getDeclaredField((String) "SECONDS");
        ((Field) term220859).setAccessible(true);
        enum799 = ((Field) term220859).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[1];
        args[0] = enum799;
        callMethod(klass, "elapsedTime", argTypes, term220381, args);
    }

};


