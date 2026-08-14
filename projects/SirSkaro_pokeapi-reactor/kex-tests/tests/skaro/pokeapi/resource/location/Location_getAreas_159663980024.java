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

public class Location_getAreas_159663980024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1502;

    public Location_getAreas_159663980024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1502 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        setField(term1502, term1502.getClass(), "id", null);
        setField(term1502, term1502.getClass(), "name", null);
        setField(term1502, term1502.getClass(), "region", null);
        setField(term1502, term1502.getClass(), "names", null);
        setField(term1502, term1502.getClass(), "gameIndices", null);
        setField(term1502, term1502.getClass(), "areas", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAreas", argTypes, term1502, args);
    }

};


