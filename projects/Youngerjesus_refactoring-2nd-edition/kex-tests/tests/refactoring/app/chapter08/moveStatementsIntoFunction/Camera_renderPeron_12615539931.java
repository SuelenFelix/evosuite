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

public class Camera_renderPeron_12615539931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public Camera_renderPeron_12615539931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Camera"));
        term2 = newInstance(Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Person"));
        Object term15 = newInstance(Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Photo"));
        Object term40 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2, term2.getClass(), "name", "PAEBtnZtTD");
        setField(term15, term15.getClass(), "title", "sjlJAEtRrb");
        setField(term15, term15.getClass(), "location", "MuLcgQHgqz");
        setIntField(term41, term41.getClass(), "year", 2012);
        setShortField(term41, term41.getClass(), "month", (short) 8);
        setShortField(term41, term41.getClass(), "day", (short) 25);
        setField(term40, term40.getClass(), "date", term41);
        setByteField(term45, term45.getClass(), "hour", (byte) 5);
        setByteField(term45, term45.getClass(), "minute", (byte) 20);
        setByteField(term45, term45.getClass(), "second", (byte) 50);
        setIntField(term45, term45.getClass(), "nano", 345595912);
        setField(term40, term40.getClass(), "time", term45);
        setField(term15, term15.getClass(), "date", term40);
        setField(term2, term2.getClass(), "photo", term15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Camera");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Person");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2;
        callMethod(klass, "renderPeron", argTypes, term1, args);
    }

};


