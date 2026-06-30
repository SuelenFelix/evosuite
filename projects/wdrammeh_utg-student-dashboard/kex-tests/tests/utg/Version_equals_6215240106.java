package utg;

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
import static utg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Version_equals_6215240106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;

    public Version_equals_6215240106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("utg.Version"));
        Object term117 = newInstance(Class.forName("java.util.Date"));
        setIntField(term113, term113.getClass(), "major", 865208305);
        setIntField(term113, term113.getClass(), "minor", -1275173084);
        setIntField(term113, term113.getClass(), "patch", -244121226);
        setLongField(term117, term117.getClass(), "fastTime", 1495357463288L);
        setField(term117, term117.getClass(), "cdate", null);
        setField(term113, term113.getClass(), "deprecateTime", term117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utg.Version");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        callMethod(klass, "equals", argTypes, term113, args);
    }

};


