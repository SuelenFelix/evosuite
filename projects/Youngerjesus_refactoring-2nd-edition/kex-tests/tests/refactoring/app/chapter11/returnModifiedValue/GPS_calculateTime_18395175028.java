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

public class GPS_calculateTime_18395175028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;

    public GPS_calculateTime_18395175028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41 = newInstance(Class.forName("refactoring.app.chapter11.returnModifiedValue.GPS"));
        setField(term41, term41.getClass(), "points", null);
        setIntField(term41, term41.getClass(), "totalAscent", 0);
        setIntField(term41, term41.getClass(), "totalTime", 0);
        setIntField(term41, term41.getClass(), "totalDistance", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.returnModifiedValue.GPS");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateTime", argTypes, term41, args);
    }

};


