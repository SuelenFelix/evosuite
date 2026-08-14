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

public class ChainLink_getSpecies_18391861786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470;

    public ChainLink_getSpecies_18391861786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term470 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.ChainLink"));
        setField(term470, term470.getClass(), "isBaby", null);
        setField(term470, term470.getClass(), "species", null);
        setField(term470, term470.getClass(), "evolutionDetails", null);
        setField(term470, term470.getClass(), "evolvesTo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.ChainLink");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpecies", argTypes, term470, args);
    }

};


