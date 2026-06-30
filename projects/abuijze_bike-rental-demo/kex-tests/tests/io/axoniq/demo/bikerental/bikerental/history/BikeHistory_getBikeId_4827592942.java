package io.axoniq.demo.bikerental.bikerental.history;

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
import static io.axoniq.demo.bikerental.bikerental.history.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class BikeHistory_getBikeId_4827592942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;

    public BikeHistory_getBikeId_4827592942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49 = new Long(2442117782898005296L);
        term48 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.history.BikeHistory"));
        setField(term48, term48.getClass(), "id", term49);
        setField(term48, term48.getClass(), "bikeId", "MuLcgQHgqz");
        setField(term48, term48.getClass(), "description", "xxtlPwDYFs");
        setField(term48, term48.getClass(), "timestamp", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.history.BikeHistory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBikeId", argTypes, term48, args);
    }

};


