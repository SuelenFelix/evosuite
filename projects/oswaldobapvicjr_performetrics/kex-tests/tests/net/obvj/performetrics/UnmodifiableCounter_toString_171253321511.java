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
import java.lang.Object;
import java.lang.String;

public class UnmodifiableCounter_toString_171253321511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214348;

    public UnmodifiableCounter_toString_171253321511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term214393 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term214392 = ((Class) term214393).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term214392).setAccessible(true);
        Object enum772 = ((Field) term214392).get((Object) null);
        Class<? extends Object> term214608 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term214607 = ((Class) term214608).getDeclaredField((String) "FAST");
        ((Field) term214607).setAccessible(true);
        Object enum773 = ((Field) term214607).get((Object) null);
        term214348 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        Object term214349 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term214349, term214349.getClass(), "type", enum772);
        setField(term214349, term214349.getClass(), "conversionMode", enum773);
        setLongField(term214349, term214349.getClass(), "unitsBefore", 4199886998224701110L);
        setLongField(term214349, term214349.getClass(), "unitsAfter", 8540994973773607992L);
        setBooleanField(term214349, term214349.getClass(), "unitsAfterSet", false);
        setField(term214348, term214348.getClass(), "counter", term214349);
        setField(term214348, term214348.getClass(), "type", enum772);
        setField(term214348, term214348.getClass(), "conversionMode", enum773);
        setLongField(term214348, term214348.getClass(), "unitsBefore", -2338103433822116635L);
        setLongField(term214348, term214348.getClass(), "unitsAfter", -1885698929232124806L);
        setBooleanField(term214348, term214348.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term214348, args);
    }

};


