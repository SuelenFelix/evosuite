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

public class Camera_emitPhotoData_19012662703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;
     Object term185;

    public Camera_emitPhotoData_19012662703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184 = newInstance(Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Camera"));
        term185 = newInstance(Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Photo"));
        Object term210 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term211 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term185, term185.getClass(), "title", "LQFpaHEwXR");
        setField(term185, term185.getClass(), "location", "oVcInYnLWB");
        setIntField(term211, term211.getClass(), "year", 2025);
        setShortField(term211, term211.getClass(), "month", (short) 4);
        setShortField(term211, term211.getClass(), "day", (short) 24);
        setField(term210, term210.getClass(), "date", term211);
        setByteField(term215, term215.getClass(), "hour", (byte) 18);
        setByteField(term215, term215.getClass(), "minute", (byte) 11);
        setByteField(term215, term215.getClass(), "second", (byte) 40);
        setIntField(term215, term215.getClass(), "nano", 137454929);
        setField(term210, term210.getClass(), "time", term215);
        setField(term185, term185.getClass(), "date", term210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Camera");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Photo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term185;
        callMethod(klass, "emitPhotoData", argTypes, term184, args);
    }

};


