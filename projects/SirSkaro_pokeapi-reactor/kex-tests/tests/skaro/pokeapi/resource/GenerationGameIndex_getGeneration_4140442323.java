package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class GenerationGameIndex_getGeneration_4140442323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132593;

    public GenerationGameIndex_getGeneration_4140442323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term132594 = new Integer(746214721);
        term132593 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term132596 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term132593, term132593.getClass(), "gameIndex", term132594);
        setField(term132596, term132596.getClass(), "name", "sBvAdANYZO");
        setField(term132596, term132596.getClass(), "url", "KFsCrydnYx");
        setField(term132593, term132593.getClass(), "generation", term132596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.GenerationGameIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneration", argTypes, term132593, args);
    }

};


