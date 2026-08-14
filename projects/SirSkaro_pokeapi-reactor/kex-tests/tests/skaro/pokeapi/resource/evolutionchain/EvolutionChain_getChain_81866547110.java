package skaro.pokeapi.resource.evolutionchain;

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
import static skaro.pokeapi.resource.evolutionchain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EvolutionChain_getChain_81866547110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126564;

    public EvolutionChain_getChain_81866547110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126564 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionChain"));
        setField(term126564, term126564.getClass(), "id", null);
        setField(term126564, term126564.getClass(), "item", null);
        setField(term126564, term126564.getClass(), "chain", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionChain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChain", argTypes, term126564, args);
    }

};


