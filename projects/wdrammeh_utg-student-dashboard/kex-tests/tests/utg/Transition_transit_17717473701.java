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

public class Transition_transit_17717473701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term7;

    public Transition_transit_17717473701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("utg.Version"));
        Object term5 = newInstance(Class.forName("java.util.Date"));
        setIntField(term1, term1.getClass(), "major", 568599855);
        setIntField(term1, term1.getClass(), "minor", 1162663216);
        setIntField(term1, term1.getClass(), "patch", 1484323161);
        setLongField(term5, term5.getClass(), "fastTime", 1345871412244L);
        setField(term5, term5.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "deprecateTime", term5);
        term7 = newInstance(Class.forName("utg.Version"));
        Object term11 = newInstance(Class.forName("java.util.Date"));
        setIntField(term7, term7.getClass(), "major", -1922583790);
        setIntField(term7, term7.getClass(), "minor", -616727354);
        setIntField(term7, term7.getClass(), "patch", -1955890973);
        setLongField(term11, term11.getClass(), "fastTime", 1480438351369L);
        setField(term11, term11.getClass(), "cdate", null);
        setField(term7, term7.getClass(), "deprecateTime", term11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utg.Transition");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("utg.Version");
        argTypes[1] = Class.forName("utg.Version");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term7;
        callMethod(klass, "transit", argTypes, null, args);
    }

};


