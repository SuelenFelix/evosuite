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

public class Version_toLiteral_10330641034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;

    public Version_toLiteral_10330641034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101 = newInstance(Class.forName("utg.Version"));
        Object term105 = newInstance(Class.forName("java.util.Date"));
        setIntField(term101, term101.getClass(), "major", 1048535127);
        setIntField(term101, term101.getClass(), "minor", -655067527);
        setIntField(term101, term101.getClass(), "patch", -6029667);
        setLongField(term105, term105.getClass(), "fastTime", 1515890130018L);
        setField(term105, term105.getClass(), "cdate", null);
        setField(term101, term101.getClass(), "deprecateTime", term105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utg.Version");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toLiteral", argTypes, term101, args);
    }

};


