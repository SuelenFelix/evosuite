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
import java.util.LinkedList;
import java.lang.Object;

public class Camera_listRecentPhotos_18628119122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term81;

    public Camera_listRecentPhotos_18628119122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = newInstance(Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Camera"));
        Object term84 = newInstance(Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Photo"));
        Object term109 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term84, term84.getClass(), "title", "xxtlPwDYFs");
        setField(term84, term84.getClass(), "location", "jJCZpVmanW");
        setIntField(term110, term110.getClass(), "year", 2021);
        setShortField(term110, term110.getClass(), "month", (short) 1);
        setShortField(term110, term110.getClass(), "day", (short) 18);
        setField(term109, term109.getClass(), "date", term110);
        setByteField(term114, term114.getClass(), "hour", (byte) 13);
        setByteField(term114, term114.getClass(), "minute", (byte) 38);
        setByteField(term114, term114.getClass(), "second", (byte) 26);
        setIntField(term114, term114.getClass(), "nano", 544608644);
        setField(term109, term109.getClass(), "time", term114);
        setField(term84, term84.getClass(), "date", term109);
        Object term120 = newInstance(Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Photo"));
        Object term123 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term120, term120.getClass(), "title", "");
        setField(term120, term120.getClass(), "location", "");
        setField(term123, term123.getClass(), "date", null);
        setField(term123, term123.getClass(), "time", null);
        setField(term120, term120.getClass(), "date", term123);
        Object term125 = newInstance(Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Photo"));
        setField(term125, term125.getClass(), "title", null);
        setField(term125, term125.getClass(), "location", null);
        setField(term125, term125.getClass(), "date", null);
        term81 = new LinkedList();
        ((LinkedList) term81).add(term84);
        ((LinkedList) term81).add(term120);
        ((LinkedList) term81).add(term125);
        ((LinkedList) term81).add((Object)null);
        ((LinkedList) term81).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.movsStatementsToCaller.Camera");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term81;
        callMethod(klass, "listRecentPhotos", argTypes, term80, args);
    }

};


