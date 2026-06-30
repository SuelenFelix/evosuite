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

public class Camera_photoDiv_19987504463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;
     Object term137;

    public Camera_photoDiv_19987504463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136 = newInstance(Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Camera"));
        term137 = newInstance(Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Photo"));
        Object term162 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term137, term137.getClass(), "title", "EGtDIRbSSb");
        setField(term137, term137.getClass(), "location", "SzjVpOQTyS");
        setIntField(term163, term163.getClass(), "year", 2015);
        setShortField(term163, term163.getClass(), "month", (short) 9);
        setShortField(term163, term163.getClass(), "day", (short) 19);
        setField(term162, term162.getClass(), "date", term163);
        setByteField(term167, term167.getClass(), "hour", (byte) 9);
        setByteField(term167, term167.getClass(), "minute", (byte) 4);
        setByteField(term167, term167.getClass(), "second", (byte) 10);
        setIntField(term167, term167.getClass(), "nano", 401765865);
        setField(term162, term162.getClass(), "time", term167);
        setField(term137, term137.getClass(), "date", term162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Camera");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Photo");
        Object[] args = new Object[1];
        args[0] = term137;
        callMethod(klass, "photoDiv", argTypes, term136, args);
    }

};


