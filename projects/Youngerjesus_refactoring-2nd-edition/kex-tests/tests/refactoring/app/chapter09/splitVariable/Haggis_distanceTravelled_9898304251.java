package refactoring.app.chapter09.splitVariable;

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
import static refactoring.app.chapter09.splitVariable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Haggis_distanceTravelled_9898304251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term7;

    public Haggis_distanceTravelled_9898304251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter09.splitVariable.Haggis"));
        term2 = newInstance(Class.forName("refactoring.app.chapter09.splitVariable.Scenario"));
        setIntField(term2, term2.getClass(), "primaryForce", 568599855);
        setIntField(term2, term2.getClass(), "delay", 1162663216);
        setIntField(term2, term2.getClass(), "secondaryForce", 1484323161);
        setIntField(term2, term2.getClass(), "mass", 391863371);
        term7 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter09.splitVariable.Haggis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter09.splitVariable.Scenario");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term7;
        callMethod(klass, "distanceTravelled", argTypes, term1, args);
    }

};


