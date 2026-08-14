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

public class Genus_setGenus_12162171307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584;

    public Genus_setGenus_12162171307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.Genus"));
        setField(term584, term584.getClass(), "genus", null);
        setField(term584, term584.getClass(), "language", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.Genus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGenus", argTypes, term584, args);
    }

};


