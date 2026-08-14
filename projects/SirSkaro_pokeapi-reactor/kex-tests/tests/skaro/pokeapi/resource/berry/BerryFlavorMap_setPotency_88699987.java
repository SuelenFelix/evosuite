package skaro.pokeapi.resource.berry;

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
import static skaro.pokeapi.resource.berry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BerryFlavorMap_setPotency_88699987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5000;

    public BerryFlavorMap_setPotency_88699987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5000 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        setField(term5000, term5000.getClass(), "potency", null);
        setField(term5000, term5000.getClass(), "flavor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPotency", argTypes, term5000, args);
    }

};


