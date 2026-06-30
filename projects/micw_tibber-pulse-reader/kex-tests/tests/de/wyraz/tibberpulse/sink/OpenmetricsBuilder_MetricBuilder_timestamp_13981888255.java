package de.wyraz.tibberpulse.sink;

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
import static de.wyraz.tibberpulse.sink.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OpenmetricsBuilder_MetricBuilder_timestamp_13981888255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553;

    public OpenmetricsBuilder_MetricBuilder_timestamp_13981888255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term553 = newInstance(Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder$MetricBuilder"));
        setField(term553, term553.getClass(), "sb", null);
        setField(term553, term553.getClass(), "timestamp", null);
        setBooleanField(term553, term553.getClass(), "hasTags", false);
        setField(term553, term553.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.OpenmetricsBuilder$MetricBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.ZonedDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "timestamp", argTypes, term553, args);
    }

};


