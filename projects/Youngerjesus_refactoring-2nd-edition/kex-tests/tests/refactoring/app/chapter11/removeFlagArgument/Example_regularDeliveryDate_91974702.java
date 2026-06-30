package refactoring.app.chapter11.removeFlagArgument;

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
import static refactoring.app.chapter11.removeFlagArgument.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Example_regularDeliveryDate_91974702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term36;

    public Example_regularDeliveryDate_91974702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = newInstance(Class.forName("refactoring.app.chapter11.removeFlagArgument.Example"));
        term36 = newInstance(Class.forName("refactoring.app.chapter11.removeFlagArgument.Order"));
        Object term37 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term38, term38.getClass(), "year", 2021);
        setShortField(term38, term38.getClass(), "month", (short) 1);
        setShortField(term38, term38.getClass(), "day", (short) 18);
        setField(term37, term37.getClass(), "date", term38);
        setByteField(term42, term42.getClass(), "hour", (byte) 13);
        setByteField(term42, term42.getClass(), "minute", (byte) 38);
        setByteField(term42, term42.getClass(), "second", (byte) 26);
        setIntField(term42, term42.getClass(), "nano", 544608644);
        setField(term37, term37.getClass(), "time", term42);
        setField(term36, term36.getClass(), "placeOn", term37);
        setField(term36, term36.getClass(), "deliveryState", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.removeFlagArgument.Example");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter11.removeFlagArgument.Order");
        Object[] args = new Object[1];
        args[0] = term36;
        callMethod(klass, "regularDeliveryDate", argTypes, term35, args);
    }

};


