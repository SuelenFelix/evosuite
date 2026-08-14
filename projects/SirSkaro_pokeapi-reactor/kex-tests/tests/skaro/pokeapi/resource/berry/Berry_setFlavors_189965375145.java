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

public class Berry_setFlavors_189965375145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4755;

    public Berry_setFlavors_189965375145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4755 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        setField(term4755, term4755.getClass(), "id", null);
        setField(term4755, term4755.getClass(), "name", null);
        setField(term4755, term4755.getClass(), "growthTime", null);
        setField(term4755, term4755.getClass(), "maxHarvest", null);
        setField(term4755, term4755.getClass(), "naturalGiftPower", null);
        setField(term4755, term4755.getClass(), "size", null);
        setField(term4755, term4755.getClass(), "smoothness", null);
        setField(term4755, term4755.getClass(), "soilDryness", null);
        setField(term4755, term4755.getClass(), "firmness", null);
        setField(term4755, term4755.getClass(), "flavors", null);
        setField(term4755, term4755.getClass(), "item", null);
        setField(term4755, term4755.getClass(), "naturalGiftType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFlavors", argTypes, term4755, args);
    }

};


