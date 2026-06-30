package refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass;

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
import static refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Booking_init_20845979580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term4;

    public Booking_init_20845979580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        setBooleanField(term1, term1.getClass(), "talkback", false);
        setIntField(term1, term1.getClass(), "price", 568599855);
        term4 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term5, term5.getClass(), "year", 2012);
        setShortField(term5, term5.getClass(), "month", (short) 8);
        setShortField(term5, term5.getClass(), "day", (short) 25);
        setField(term4, term4.getClass(), "date", term5);
        setByteField(term9, term9.getClass(), "hour", (byte) 5);
        setByteField(term9, term9.getClass(), "minute", (byte) 20);
        setByteField(term9, term9.getClass(), "second", (byte) 50);
        setIntField(term9, term9.getClass(), "nano", 345595912);
        setField(term4, term4.getClass(), "time", term9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term4;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


