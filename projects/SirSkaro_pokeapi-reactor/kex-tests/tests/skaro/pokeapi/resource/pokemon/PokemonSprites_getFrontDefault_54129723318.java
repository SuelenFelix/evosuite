package skaro.pokeapi.resource.pokemon;

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
import static skaro.pokeapi.resource.pokemon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokemonSprites_getFrontDefault_54129723318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20369;

    public PokemonSprites_getFrontDefault_54129723318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20369 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term20369, term20369.getClass(), "frontDefault", null);
        setField(term20369, term20369.getClass(), "frontShiny", null);
        setField(term20369, term20369.getClass(), "frontFemale", null);
        setField(term20369, term20369.getClass(), "frontShinyFemale", null);
        setField(term20369, term20369.getClass(), "backDefault", null);
        setField(term20369, term20369.getClass(), "backShiny", null);
        setField(term20369, term20369.getClass(), "backFemale", null);
        setField(term20369, term20369.getClass(), "backShinyFemale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrontDefault", argTypes, term20369, args);
    }

};


