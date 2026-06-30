package refactoring.app.chapter08.moveField;

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
import static refactoring.app.chapter08.moveField.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CustomerContract_getDiscountRate_7537589701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;

    public CustomerContract_getDiscountRate_7537589701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = newInstance(Class.forName("refactoring.app.chapter08.moveField.CustomerContract"));
        Object term12 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13, term13.getClass(), "year", 2021);
        setShortField(term13, term13.getClass(), "month", (short) 1);
        setShortField(term13, term13.getClass(), "day", (short) 18);
        setField(term12, term12.getClass(), "date", term13);
        setByteField(term17, term17.getClass(), "hour", (byte) 13);
        setByteField(term17, term17.getClass(), "minute", (byte) 38);
        setByteField(term17, term17.getClass(), "second", (byte) 26);
        setIntField(term17, term17.getClass(), "nano", 544608644);
        setField(term12, term12.getClass(), "time", term17);
        setField(term11, term11.getClass(), "startDate", term12);
        setDoubleField(term11, term11.getClass(), "discountRate", 0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveField.CustomerContract");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiscountRate", argTypes, term11, args);
    }

};


