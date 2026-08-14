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
import java.lang.Boolean;
import java.lang.Object;

public class PokemonSpeciesVariety_setIsDefault_15311951812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term77;

    public PokemonSpeciesVariety_setIsDefault_15311951812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term50 = new Boolean(false);
        term49 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpeciesVariety"));
        Object term52 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term49, term49.getClass(), "isDefault", term50);
        setField(term52, term52.getClass(), "name", "MuLcgQHgqz");
        setField(term52, term52.getClass(), "url", "xxtlPwDYFs");
        setField(term49, term49.getClass(), "pokemon", term52);
        term77 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpeciesVariety");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term77;
        callMethod(klass, "setIsDefault", argTypes, term49, args);
    }

};


