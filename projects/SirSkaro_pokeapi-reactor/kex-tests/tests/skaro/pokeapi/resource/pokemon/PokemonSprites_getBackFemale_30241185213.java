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

public class PokemonSprites_getBackFemale_30241185213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19617;

    public PokemonSprites_getBackFemale_30241185213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19617 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term19617, term19617.getClass(), "frontDefault", "YMmtjELJuB");
        setField(term19617, term19617.getClass(), "frontShiny", "FzyIShiOmb");
        setField(term19617, term19617.getClass(), "frontFemale", "PEUfeJaZTk");
        setField(term19617, term19617.getClass(), "frontShinyFemale", "AIvyeIdskz");
        setField(term19617, term19617.getClass(), "backDefault", "iSQqMWMRlU");
        setField(term19617, term19617.getClass(), "backShiny", "djWEnlbOXu");
        setField(term19617, term19617.getClass(), "backFemale", "MvDMzQBWME");
        setField(term19617, term19617.getClass(), "backShinyFemale", "sZyAwmdGVS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBackFemale", argTypes, term19617, args);
    }

};


