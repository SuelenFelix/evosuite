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

public class Customer_getDiscountRate_18572516042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;

    public Customer_getDiscountRate_18572516042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("refactoring.app.chapter08.moveField.Customer"));
        Object term117 = newInstance(Class.forName("refactoring.app.chapter08.moveField.CustomerContract"));
        Object term118 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term104, term104.getClass(), "name", "MuLcgQHgqz");
        setIntField(term119, term119.getClass(), "year", 2022);
        setShortField(term119, term119.getClass(), "month", (short) 2);
        setShortField(term119, term119.getClass(), "day", (short) 26);
        setField(term118, term118.getClass(), "date", term119);
        setByteField(term123, term123.getClass(), "hour", (byte) 11);
        setByteField(term123, term123.getClass(), "minute", (byte) 42);
        setByteField(term123, term123.getClass(), "second", (byte) 15);
        setIntField(term123, term123.getClass(), "nano", 377731937);
        setField(term118, term118.getClass(), "time", term123);
        setField(term117, term117.getClass(), "startDate", term118);
        setDoubleField(term117, term117.getClass(), "discountRate", 0.2641345529914265);
        setField(term104, term104.getClass(), "customerContract", term117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveField.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiscountRate", argTypes, term104, args);
    }

};


