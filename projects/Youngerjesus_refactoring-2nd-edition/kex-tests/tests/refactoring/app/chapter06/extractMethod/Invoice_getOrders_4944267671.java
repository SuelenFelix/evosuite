package refactoring.app.chapter06.extractMethod;

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
import static refactoring.app.chapter06.extractMethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Invoice_getOrders_4944267671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171;

    public Invoice_getOrders_4944267671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term172 = new ArrayList();
        term171 = newInstance(Class.forName("refactoring.app.chapter06.extractMethod.Invoice"));
        Object term176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term171, term171.getClass(), "orders", term172);
        setIntField(term177, term177.getClass(), "year", 2022);
        setShortField(term177, term177.getClass(), "month", (short) 2);
        setShortField(term177, term177.getClass(), "day", (short) 26);
        setField(term176, term176.getClass(), "date", term177);
        setByteField(term181, term181.getClass(), "hour", (byte) 11);
        setByteField(term181, term181.getClass(), "minute", (byte) 42);
        setByteField(term181, term181.getClass(), "second", (byte) 15);
        setIntField(term181, term181.getClass(), "nano", 377731937);
        setField(term176, term176.getClass(), "time", term181);
        setField(term171, term171.getClass(), "dueDate", term176);
        setField(term171, term171.getClass(), "customer", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.extractMethod.Invoice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrders", argTypes, term171, args);
    }

};


