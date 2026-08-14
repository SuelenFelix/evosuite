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

public class PokemonSprites_getBackShinyFemale_123851982515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19993;

    public PokemonSprites_getBackShinyFemale_123851982515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19993 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term19993, term19993.getClass(), "frontDefault", "ILoodMZrgR");
        setField(term19993, term19993.getClass(), "frontShiny", "XQiKmsCacK");
        setField(term19993, term19993.getClass(), "frontFemale", "cTCixEbHYT");
        setField(term19993, term19993.getClass(), "frontShinyFemale", "bqKksqtAdT");
        setField(term19993, term19993.getClass(), "backDefault", "jAIAdEmULK");
        setField(term19993, term19993.getClass(), "backShiny", "EuAshkmbna");
        setField(term19993, term19993.getClass(), "backFemale", "JwQlbBbGJR");
        setField(term19993, term19993.getClass(), "backShinyFemale", "HdWLwfVsAM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBackShinyFemale", argTypes, term19993, args);
    }

};


