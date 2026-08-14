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

public class PokemonSprites_getBackShiny_43016469911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19241;

    public PokemonSprites_getBackShiny_43016469911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19241 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term19241, term19241.getClass(), "frontDefault", "SDbDgydVpg");
        setField(term19241, term19241.getClass(), "frontShiny", "EEMaiNkiOH");
        setField(term19241, term19241.getClass(), "frontFemale", "sFdmTylvqh");
        setField(term19241, term19241.getClass(), "frontShinyFemale", "rgniLaOaiz");
        setField(term19241, term19241.getClass(), "backDefault", "fzQzzdIOMC");
        setField(term19241, term19241.getClass(), "backShiny", "hLVDOhfCKX");
        setField(term19241, term19241.getClass(), "backFemale", "yXLTfzOgfX");
        setField(term19241, term19241.getClass(), "backShinyFemale", "MANlfBKTPY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBackShiny", argTypes, term19241, args);
    }

};


