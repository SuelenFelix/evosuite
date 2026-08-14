package skaro.pokeapi.resource.berryflavor;

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
import static skaro.pokeapi.resource.berryflavor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BerryFlavor_setBarries_82874720218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141171;

    public BerryFlavor_setBarries_82874720218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141171 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        setField(term141171, term141171.getClass(), "id", null);
        setField(term141171, term141171.getClass(), "name", null);
        setField(term141171, term141171.getClass(), "barries", null);
        setField(term141171, term141171.getClass(), "contestType", null);
        setField(term141171, term141171.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBarries", argTypes, term141171, args);
    }

};


