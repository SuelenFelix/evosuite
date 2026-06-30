package refactoring.app.chapter08.movsStatementsToCaller;

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
import static refactoring.app.chapter08.movsStatementsToCaller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Camera_renderPhoto_10743836544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240;
     Object term241;

    public Camera_renderPhoto_10743836544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240 = newInstance(Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Camera"));
        term241 = newInstance(Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Photo"));
        Object term266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term241, term241.getClass(), "title", "aJlieCFVtF");
        setField(term241, term241.getClass(), "location", "ZiaGIbnzTs");
        setIntField(term267, term267.getClass(), "year", 2024);
        setShortField(term267, term267.getClass(), "month", (short) 1);
        setShortField(term267, term267.getClass(), "day", (short) 24);
        setField(term266, term266.getClass(), "date", term267);
        setByteField(term271, term271.getClass(), "hour", (byte) 20);
        setByteField(term271, term271.getClass(), "minute", (byte) 28);
        setByteField(term271, term271.getClass(), "second", (byte) 39);
        setIntField(term271, term271.getClass(), "nano", 952728177);
        setField(term266, term266.getClass(), "time", term271);
        setField(term241, term241.getClass(), "date", term266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Camera");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Photo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term241;
        callMethod(klass, "renderPhoto", argTypes, term240, args);
    }

};


