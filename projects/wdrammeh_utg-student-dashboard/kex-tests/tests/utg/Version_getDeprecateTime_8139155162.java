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

public class Version_getDeprecateTime_8139155162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;

    public Version_getDeprecateTime_8139155162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("utg.Version"));
        Object term91 = newInstance(Class.forName("java.util.Date"));
        setIntField(term87, term87.getClass(), "major", -522618178);
        setIntField(term87, term87.getClass(), "minor", 1134449235);
        setIntField(term87, term87.getClass(), "patch", -883034806);
        setLongField(term91, term91.getClass(), "fastTime", 1610940182830L);
        setField(term91, term91.getClass(), "cdate", null);
        setField(term87, term87.getClass(), "deprecateTime", term91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utg.Version");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeprecateTime", argTypes, term87, args);
    }

};


