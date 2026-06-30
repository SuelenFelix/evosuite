package refactoring.app.chapter08.moveStatementsIntoFunction;

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
import static refactoring.app.chapter08.moveStatementsIntoFunction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Camera_renderPhoto_10451663152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term81;

    public Camera_renderPhoto_10451663152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = newInstance(Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Camera"));
        term81 = newInstance(Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Photo"));
        Object term106 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term81, term81.getClass(), "title", "xxtlPwDYFs");
        setField(term81, term81.getClass(), "location", "jJCZpVmanW");
        setIntField(term107, term107.getClass(), "year", 2021);
        setShortField(term107, term107.getClass(), "month", (short) 1);
        setShortField(term107, term107.getClass(), "day", (short) 18);
        setField(term106, term106.getClass(), "date", term107);
        setByteField(term111, term111.getClass(), "hour", (byte) 13);
        setByteField(term111, term111.getClass(), "minute", (byte) 38);
        setByteField(term111, term111.getClass(), "second", (byte) 26);
        setIntField(term111, term111.getClass(), "nano", 544608644);
        setField(term106, term106.getClass(), "time", term111);
        setField(term81, term81.getClass(), "date", term106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Camera");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Photo");
        Object[] args = new Object[1];
        args[0] = term81;
        callMethod(klass, "renderPhoto", argTypes, term80, args);
    }

};


