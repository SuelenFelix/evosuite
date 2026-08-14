package skaro.pokeapi.resource.pokemonform;

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
import static skaro.pokeapi.resource.pokemonform.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokemonFormSprites_setBackShiny_1189219718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term690;

    public PokemonFormSprites_setBackShiny_1189219718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term690 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        setField(term690, term690.getClass(), "frontDefault", "dWRymuLBtr");
        setField(term690, term690.getClass(), "frontShiny", "AijpHYOFuy");
        setField(term690, term690.getClass(), "backDefault", "SbAoxhfrkn");
        setField(term690, term690.getClass(), "backShiny", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Ghbwtircqb";
        callMethod(klass, "setBackShiny", argTypes, term690, args);
    }

};


