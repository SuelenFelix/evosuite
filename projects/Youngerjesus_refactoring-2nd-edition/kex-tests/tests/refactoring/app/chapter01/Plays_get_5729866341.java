package refactoring.app.chapter01;

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
import static refactoring.app.chapter01.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class Plays_get_5729866341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1140;
     Object term1151;

    public Plays_get_5729866341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1141 = new HashMap();
        term1140 = newInstance(Class.forName("refactoring.app.chapter01.Plays"));
        setField(term1140, term1140.getClass(), "playMap", term1141);
        term1151 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1151, term1151.getClass(), "playId", "hNxWaHcfhY");
        setIntField(term1151, term1151.getClass(), "audience", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.Plays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter01.Performance");
        Object[] args = new Object[1];
        args[0] = term1151;
        callMethod(klass, "get", argTypes, term1140, args);
    }

};


