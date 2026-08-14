package skaro.pokeapi.resource.contesttype;

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
import static skaro.pokeapi.resource.contesttype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ContestName_getName_4692293918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630;

    public ContestName_getName_4692293918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term630 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        setField(term630, term630.getClass(), "name", null);
        setField(term630, term630.getClass(), "color", null);
        setField(term630, term630.getClass(), "language", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term630, args);
    }

};


