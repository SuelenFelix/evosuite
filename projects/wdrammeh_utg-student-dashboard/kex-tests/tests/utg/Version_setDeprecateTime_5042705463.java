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

public class Version_setDeprecateTime_5042705463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;
     Object term99;

    public Version_setDeprecateTime_5042705463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("utg.Version"));
        Object term97 = newInstance(Class.forName("java.util.Date"));
        setIntField(term93, term93.getClass(), "major", 597278769);
        setIntField(term93, term93.getClass(), "minor", -1685132342);
        setIntField(term93, term93.getClass(), "patch", -1456670397);
        setLongField(term97, term97.getClass(), "fastTime", 1606045635837L);
        setField(term97, term97.getClass(), "cdate", null);
        setField(term93, term93.getClass(), "deprecateTime", term97);
        term99 = newInstance(Class.forName("java.util.Date"));
        setLongField(term99, term99.getClass(), "fastTime", 1442639565302L);
        setField(term99, term99.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utg.Version");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term99;
        callMethod(klass, "setDeprecateTime", argTypes, term93, args);
    }

};


