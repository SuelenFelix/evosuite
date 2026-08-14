package skaro.pokeapi.resource.gender;

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
import static skaro.pokeapi.resource.gender.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class PokemonSpeciesGender_setPokemonSpecies_9190677694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147;
     Object term175;

    public PokemonSpeciesGender_setPokemonSpecies_9190677694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term148 = new Integer(-1922583790);
        term147 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term150 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term147, term147.getClass(), "rate", term148);
        setField(term150, term150.getClass(), "name", "SzjVpOQTyS");
        setField(term150, term150.getClass(), "url", "MjGYSRKTNF");
        setField(term147, term147.getClass(), "pokemonSpecies", term150);
        term175 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term175, term175.getClass(), "name", "NRdvgJlhkX");
        setField(term175, term175.getClass(), "url", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term175;
        callMethod(klass, "setPokemonSpecies", argTypes, term147, args);
    }

};


