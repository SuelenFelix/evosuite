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

public class Version_compare_10279769247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;
     Object term147;

    public Version_compare_10279769247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141 = newInstance(Class.forName("utg.Version"));
        Object term145 = newInstance(Class.forName("java.util.Date"));
        setIntField(term141, term141.getClass(), "major", -1179120542);
        setIntField(term141, term141.getClass(), "minor", -73683645);
        setIntField(term141, term141.getClass(), "patch", -226514366);
        setLongField(term145, term145.getClass(), "fastTime", 1645834034896L);
        setField(term145, term145.getClass(), "cdate", null);
        setField(term141, term141.getClass(), "deprecateTime", term145);
        term147 = newInstance(Class.forName("utg.Version"));
        Object term151 = newInstance(Class.forName("java.util.Date"));
        setIntField(term147, term147.getClass(), "major", -1087774327);
        setIntField(term147, term147.getClass(), "minor", -1530420153);
        setIntField(term147, term147.getClass(), "patch", -469968304);
        setLongField(term151, term151.getClass(), "fastTime", 1500721068023L);
        setField(term151, term151.getClass(), "cdate", null);
        setField(term147, term147.getClass(), "deprecateTime", term151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utg.Version");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("utg.Version");
        Object[] args = new Object[1];
        args[0] = term147;
        callMethod(klass, "compare", argTypes, term141, args);
    }

};


