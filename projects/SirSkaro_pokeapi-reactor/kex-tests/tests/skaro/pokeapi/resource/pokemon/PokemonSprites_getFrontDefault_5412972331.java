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

public class PokemonSprites_getFrontDefault_5412972331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17361;

    public PokemonSprites_getFrontDefault_5412972331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17361 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term17361, term17361.getClass(), "frontDefault", "QZfhwDBzyR");
        setField(term17361, term17361.getClass(), "frontShiny", "HvnMmAOZev");
        setField(term17361, term17361.getClass(), "frontFemale", "JTPAQsfRtT");
        setField(term17361, term17361.getClass(), "frontShinyFemale", "otxkkKfDfl");
        setField(term17361, term17361.getClass(), "backDefault", "bqIuFFFwnP");
        setField(term17361, term17361.getClass(), "backShiny", "hDxvvVgGlk");
        setField(term17361, term17361.getClass(), "backFemale", "XdjSvjaTqk");
        setField(term17361, term17361.getClass(), "backShinyFemale", "ukrlYVcvsg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrontDefault", argTypes, term17361, args);
    }

};


