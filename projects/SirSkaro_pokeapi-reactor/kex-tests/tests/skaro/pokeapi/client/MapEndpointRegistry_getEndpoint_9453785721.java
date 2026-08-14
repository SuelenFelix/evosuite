package skaro.pokeapi.client;

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
import static skaro.pokeapi.client.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class MapEndpointRegistry_getEndpoint_9453785721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;

    public MapEndpointRegistry_getEndpoint_9453785721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23 = new HashMap();
        term22 = newInstance(Class.forName("skaro.pokeapi.client.MapEndpointRegistry"));
        setField(term22, term22.getClass(), "endpoints", term23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.client.MapEndpointRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getEndpoint", argTypes, term22, args);
    }

};


