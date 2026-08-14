package skaro.pokeapi;

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
import static skaro.pokeapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokeApiReactorNonCachingConfiguration_pokeApiClient_5084348353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38472;

    public PokeApiReactorNonCachingConfiguration_pokeApiClient_5084348353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38472 = newInstance(Class.forName("skaro.pokeapi.PokeApiReactorNonCachingConfiguration"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.PokeApiReactorNonCachingConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.client.PokeApiEntityFactory");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "pokeApiClient", argTypes, term38472, args);
    }

};


