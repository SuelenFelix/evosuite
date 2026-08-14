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

public class PokemonSpeciesVariety_getIsDefault_20499842396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240;

    public PokemonSpeciesVariety_getIsDefault_20499842396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpeciesVariety"));
        setField(term240, term240.getClass(), "isDefault", null);
        setField(term240, term240.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpeciesVariety");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsDefault", argTypes, term240, args);
    }

};


