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
import java.lang.Boolean;

public class Example_deliveryDate_15703189023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;
     Object term70;
     Object term93;

    public Example_deliveryDate_15703189023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("refactoring.app.chapter11.removeFlagArgument.Example"));
        term70 = newInstance(Class.forName("refactoring.app.chapter11.removeFlagArgument.Order"));
        Object term71 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term72, term72.getClass(), "year", 2015);
        setShortField(term72, term72.getClass(), "month", (short) 9);
        setShortField(term72, term72.getClass(), "day", (short) 19);
        setField(term71, term71.getClass(), "date", term72);
        setByteField(term76, term76.getClass(), "hour", (byte) 9);
        setByteField(term76, term76.getClass(), "minute", (byte) 4);
        setByteField(term76, term76.getClass(), "second", (byte) 10);
        setIntField(term76, term76.getClass(), "nano", 401765865);
        setField(term71, term71.getClass(), "time", term76);
        setField(term70, term70.getClass(), "placeOn", term71);
        setField(term70, term70.getClass(), "deliveryState", "MuLcgQHgqz");
        term93 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.removeFlagArgument.Example");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter11.removeFlagArgument.Order");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term70;
        args[1] = term93;
        callMethod(klass, "deliveryDate", argTypes, term69, args);
    }

};


