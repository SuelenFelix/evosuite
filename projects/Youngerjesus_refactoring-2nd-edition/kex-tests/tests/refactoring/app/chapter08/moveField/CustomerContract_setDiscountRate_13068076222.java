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
import java.lang.Double;

public class CustomerContract_setDiscountRate_13068076222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term35;

    public CustomerContract_setDiscountRate_13068076222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("refactoring.app.chapter08.moveField.CustomerContract"));
        Object term24 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term25, term25.getClass(), "year", 2015);
        setShortField(term25, term25.getClass(), "month", (short) 9);
        setShortField(term25, term25.getClass(), "day", (short) 19);
        setField(term24, term24.getClass(), "date", term25);
        setByteField(term29, term29.getClass(), "hour", (byte) 9);
        setByteField(term29, term29.getClass(), "minute", (byte) 4);
        setByteField(term29, term29.getClass(), "second", (byte) 10);
        setIntField(term29, term29.getClass(), "nano", 401765865);
        setField(term24, term24.getClass(), "time", term29);
        setField(term23, term23.getClass(), "startDate", term24);
        setDoubleField(term23, term23.getClass(), "discountRate", 0.3455959125047594);
        term35 = new Double(0.5523635872663106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveField.CustomerContract");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term35;
        callMethod(klass, "setDiscountRate", argTypes, term23, args);
    }

};


