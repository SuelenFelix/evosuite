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

public class Camera_emitPhotoData_2777369204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192;
     Object term193;

    public Camera_emitPhotoData_2777369204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192 = newInstance(Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Camera"));
        term193 = newInstance(Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Photo"));
        Object term218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term223 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term193, term193.getClass(), "title", "MjGYSRKTNF");
        setField(term193, term193.getClass(), "location", "hRNSzYYIrc");
        setIntField(term219, term219.getClass(), "year", 2015);
        setShortField(term219, term219.getClass(), "month", (short) 4);
        setShortField(term219, term219.getClass(), "day", (short) 14);
        setField(term218, term218.getClass(), "date", term219);
        setByteField(term223, term223.getClass(), "hour", (byte) 18);
        setByteField(term223, term223.getClass(), "minute", (byte) 24);
        setByteField(term223, term223.getClass(), "second", (byte) 32);
        setIntField(term223, term223.getClass(), "nano", 369233818);
        setField(term218, term218.getClass(), "time", term223);
        setField(term193, term193.getClass(), "date", term218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Camera");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Photo");
        Object[] args = new Object[1];
        args[0] = term193;
        callMethod(klass, "emitPhotoData", argTypes, term192, args);
    }

};


