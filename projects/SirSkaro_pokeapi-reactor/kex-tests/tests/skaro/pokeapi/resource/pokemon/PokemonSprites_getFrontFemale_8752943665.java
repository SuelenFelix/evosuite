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

public class PokemonSprites_getFrontFemale_8752943665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18113;

    public PokemonSprites_getFrontFemale_8752943665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18113 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term18113, term18113.getClass(), "frontDefault", "drpBJuEKQG");
        setField(term18113, term18113.getClass(), "frontShiny", "GGpORnLrOW");
        setField(term18113, term18113.getClass(), "frontFemale", "gDGZwlpOZx");
        setField(term18113, term18113.getClass(), "frontShinyFemale", "gkDpxkHPDg");
        setField(term18113, term18113.getClass(), "backDefault", "pADwkrWiMW");
        setField(term18113, term18113.getClass(), "backShiny", "FDORDJuAXQ");
        setField(term18113, term18113.getClass(), "backFemale", "yjqoDeLBLg");
        setField(term18113, term18113.getClass(), "backShinyFemale", "DCepDqVwas");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrontFemale", argTypes, term18113, args);
    }

};


