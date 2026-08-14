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

public class Counter_getType_4935372657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217433;

    public Counter_getType_4935372657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term217494 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term217493 = ((Class) term217494).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term217493).setAccessible(true);
        Object enum785 = ((Field) term217493).get((Object) null);
        Class<? extends Object> term217721 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term217720 = ((Class) term217721).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term217720).setAccessible(true);
        Object enum786 = ((Field) term217720).get((Object) null);
        term217433 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term217433, term217433.getClass(), "type", enum785);
        setField(term217433, term217433.getClass(), "conversionMode", enum786);
        setLongField(term217433, term217433.getClass(), "unitsBefore", -7698746988132548371L);
        setLongField(term217433, term217433.getClass(), "unitsAfter", 2145420811068634601L);
        setBooleanField(term217433, term217433.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term217433, args);
    }

};


