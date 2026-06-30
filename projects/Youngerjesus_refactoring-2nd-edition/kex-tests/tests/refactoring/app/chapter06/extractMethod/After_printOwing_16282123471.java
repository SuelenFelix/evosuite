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

public class After_printOwing_16282123471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term10;

    public After_printOwing_16282123471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("refactoring.app.chapter06.extractMethod.After"));
        ArrayList term11 = new ArrayList();
        term10 = newInstance(Class.forName("refactoring.app.chapter06.extractMethod.Invoice"));
        Object term15 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10, term10.getClass(), "orders", term11);
        setIntField(term16, term16.getClass(), "year", 2012);
        setShortField(term16, term16.getClass(), "month", (short) 8);
        setShortField(term16, term16.getClass(), "day", (short) 25);
        setField(term15, term15.getClass(), "date", term16);
        setByteField(term20, term20.getClass(), "hour", (byte) 5);
        setByteField(term20, term20.getClass(), "minute", (byte) 20);
        setByteField(term20, term20.getClass(), "second", (byte) 50);
        setIntField(term20, term20.getClass(), "nano", 345595912);
        setField(term15, term15.getClass(), "time", term20);
        setField(term10, term10.getClass(), "dueDate", term15);
        setField(term10, term10.getClass(), "customer", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.extractMethod.After");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter06.extractMethod.Invoice");
        Object[] args = new Object[1];
        args[0] = term10;
        callMethod(klass, "printOwing", argTypes, term9, args);
    }

};


