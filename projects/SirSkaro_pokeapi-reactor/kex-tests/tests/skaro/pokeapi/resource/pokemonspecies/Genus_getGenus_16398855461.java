package skaro.pokeapi.resource.pokemonspecies;

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
import static skaro.pokeapi.resource.pokemonspecies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Genus_getGenus_16398855461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;

    public Genus_getGenus_16398855461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.Genus"));
        Object term257 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term244, term244.getClass(), "genus", "MxlszYVzRf");
        setField(term257, term257.getClass(), "name", "LQFpaHEwXR");
        setField(term257, term257.getClass(), "url", "oVcInYnLWB");
        setField(term244, term244.getClass(), "language", term257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.Genus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenus", argTypes, term244, args);
    }

};


