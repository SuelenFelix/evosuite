package refactoring.app.chapter11.returnModifiedValue;

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
import static refactoring.app.chapter11.returnModifiedValue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GPS_calculateAscent_12333016437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;

    public GPS_calculateAscent_12333016437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = newInstance(Class.forName("refactoring.app.chapter11.returnModifiedValue.GPS"));
        setField(term37, term37.getClass(), "points", null);
        setIntField(term37, term37.getClass(), "totalAscent", 0);
        setIntField(term37, term37.getClass(), "totalTime", 0);
        setIntField(term37, term37.getClass(), "totalDistance", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.returnModifiedValue.GPS");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateAscent", argTypes, term37, args);
    }

};


