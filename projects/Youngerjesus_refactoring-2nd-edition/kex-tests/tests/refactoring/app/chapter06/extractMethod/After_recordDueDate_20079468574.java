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

public class After_recordDueDate_20079468574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86;
     Object term87;

    public After_recordDueDate_20079468574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86 = newInstance(Class.forName("refactoring.app.chapter06.extractMethod.After"));
        ArrayList term88 = new ArrayList();
        term87 = newInstance(Class.forName("refactoring.app.chapter06.extractMethod.Invoice"));
        Object term92 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term87, term87.getClass(), "orders", term88);
        setIntField(term93, term93.getClass(), "year", 2015);
        setShortField(term93, term93.getClass(), "month", (short) 9);
        setShortField(term93, term93.getClass(), "day", (short) 19);
        setField(term92, term92.getClass(), "date", term93);
        setByteField(term97, term97.getClass(), "hour", (byte) 9);
        setByteField(term97, term97.getClass(), "minute", (byte) 4);
        setByteField(term97, term97.getClass(), "second", (byte) 10);
        setIntField(term97, term97.getClass(), "nano", 401765865);
        setField(term92, term92.getClass(), "time", term97);
        setField(term87, term87.getClass(), "dueDate", term92);
        setField(term87, term87.getClass(), "customer", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.extractMethod.After");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter06.extractMethod.Invoice");
        Object[] args = new Object[1];
        args[0] = term87;
        callMethod(klass, "recordDueDate", argTypes, term86, args);
    }

};


