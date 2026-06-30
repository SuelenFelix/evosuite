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
import java.lang.Integer;

public class After_printDetails_603113535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;
     Object term125;
     Object term152;

    public After_printDetails_603113535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124 = newInstance(Class.forName("refactoring.app.chapter06.extractMethod.After"));
        ArrayList term126 = new ArrayList();
        term125 = newInstance(Class.forName("refactoring.app.chapter06.extractMethod.Invoice"));
        Object term130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term125, term125.getClass(), "orders", term126);
        setIntField(term131, term131.getClass(), "year", 2015);
        setShortField(term131, term131.getClass(), "month", (short) 4);
        setShortField(term131, term131.getClass(), "day", (short) 14);
        setField(term130, term130.getClass(), "date", term131);
        setByteField(term135, term135.getClass(), "hour", (byte) 18);
        setByteField(term135, term135.getClass(), "minute", (byte) 24);
        setByteField(term135, term135.getClass(), "second", (byte) 32);
        setIntField(term135, term135.getClass(), "nano", 369233818);
        setField(term130, term130.getClass(), "time", term135);
        setField(term125, term125.getClass(), "dueDate", term130);
        setField(term125, term125.getClass(), "customer", "xxtlPwDYFs");
        term152 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.extractMethod.After");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter06.extractMethod.Invoice");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term125;
        args[1] = term152;
        callMethod(klass, "printDetails", argTypes, term124, args);
    }

};


