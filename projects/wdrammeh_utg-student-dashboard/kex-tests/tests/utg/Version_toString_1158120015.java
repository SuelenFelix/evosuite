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

public class Version_toString_1158120015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107;

    public Version_toString_1158120015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107 = newInstance(Class.forName("utg.Version"));
        Object term111 = newInstance(Class.forName("java.util.Date"));
        setIntField(term107, term107.getClass(), "major", -117576464);
        setIntField(term107, term107.getClass(), "minor", -1007160944);
        setIntField(term107, term107.getClass(), "patch", 1135664017);
        setLongField(term111, term111.getClass(), "fastTime", 1429023851389L);
        setField(term111, term111.getClass(), "cdate", null);
        setField(term107, term107.getClass(), "deprecateTime", term111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utg.Version");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term107, args);
    }

};


