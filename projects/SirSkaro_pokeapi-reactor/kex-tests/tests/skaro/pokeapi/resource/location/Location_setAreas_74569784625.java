package skaro.pokeapi.resource.location;

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
import static skaro.pokeapi.resource.location.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Location_setAreas_74569784625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1503;

    public Location_setAreas_74569784625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1503 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        setField(term1503, term1503.getClass(), "id", null);
        setField(term1503, term1503.getClass(), "name", null);
        setField(term1503, term1503.getClass(), "region", null);
        setField(term1503, term1503.getClass(), "names", null);
        setField(term1503, term1503.getClass(), "gameIndices", null);
        setField(term1503, term1503.getClass(), "areas", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAreas", argTypes, term1503, args);
    }

};


