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

public class Example_rushDeliveryDate_6036333701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public Example_rushDeliveryDate_6036333701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter11.removeFlagArgument.Example"));
        term2 = newInstance(Class.forName("refactoring.app.chapter11.removeFlagArgument.Order"));
        Object term3 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4, term4.getClass(), "year", 2012);
        setShortField(term4, term4.getClass(), "month", (short) 8);
        setShortField(term4, term4.getClass(), "day", (short) 25);
        setField(term3, term3.getClass(), "date", term4);
        setByteField(term8, term8.getClass(), "hour", (byte) 5);
        setByteField(term8, term8.getClass(), "minute", (byte) 20);
        setByteField(term8, term8.getClass(), "second", (byte) 50);
        setIntField(term8, term8.getClass(), "nano", 345595912);
        setField(term3, term3.getClass(), "time", term8);
        setField(term2, term2.getClass(), "placeOn", term3);
        setField(term2, term2.getClass(), "deliveryState", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.removeFlagArgument.Example");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter11.removeFlagArgument.Order");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "rushDeliveryDate", argTypes, term1, args);
    }

};


