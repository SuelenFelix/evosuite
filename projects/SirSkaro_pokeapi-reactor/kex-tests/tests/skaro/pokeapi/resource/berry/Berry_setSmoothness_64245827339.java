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

public class Berry_setSmoothness_64245827339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4749;

    public Berry_setSmoothness_64245827339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4749 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        setField(term4749, term4749.getClass(), "id", null);
        setField(term4749, term4749.getClass(), "name", null);
        setField(term4749, term4749.getClass(), "growthTime", null);
        setField(term4749, term4749.getClass(), "maxHarvest", null);
        setField(term4749, term4749.getClass(), "naturalGiftPower", null);
        setField(term4749, term4749.getClass(), "size", null);
        setField(term4749, term4749.getClass(), "smoothness", null);
        setField(term4749, term4749.getClass(), "soilDryness", null);
        setField(term4749, term4749.getClass(), "firmness", null);
        setField(term4749, term4749.getClass(), "flavors", null);
        setField(term4749, term4749.getClass(), "item", null);
        setField(term4749, term4749.getClass(), "naturalGiftType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSmoothness", argTypes, term4749, args);
    }

};


