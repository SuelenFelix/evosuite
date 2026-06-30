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

public class After_calculateOutstanding_14597981043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term49;

    public After_calculateOutstanding_14597981043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("refactoring.app.chapter06.extractMethod.After"));
        ArrayList term50 = new ArrayList();
        term49 = newInstance(Class.forName("refactoring.app.chapter06.extractMethod.Invoice"));
        Object term54 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term49, term49.getClass(), "orders", term50);
        setIntField(term55, term55.getClass(), "year", 2021);
        setShortField(term55, term55.getClass(), "month", (short) 1);
        setShortField(term55, term55.getClass(), "day", (short) 18);
        setField(term54, term54.getClass(), "date", term55);
        setByteField(term59, term59.getClass(), "hour", (byte) 13);
        setByteField(term59, term59.getClass(), "minute", (byte) 38);
        setByteField(term59, term59.getClass(), "second", (byte) 26);
        setIntField(term59, term59.getClass(), "nano", 544608644);
        setField(term54, term54.getClass(), "time", term59);
        setField(term49, term49.getClass(), "dueDate", term54);
        setField(term49, term49.getClass(), "customer", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.extractMethod.After");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter06.extractMethod.Invoice");
        Object[] args = new Object[1];
        args[0] = term49;
        callMethod(klass, "calculateOutstanding", argTypes, term48, args);
    }

};


