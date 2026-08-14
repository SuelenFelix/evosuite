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

public class PokemonSprites_setFrontFemale_7722435506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18290;

    public PokemonSprites_setFrontFemale_7722435506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18290 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term18290, term18290.getClass(), "frontDefault", "wKIBUlfNCx");
        setField(term18290, term18290.getClass(), "frontShiny", "iGfMUWRvod");
        setField(term18290, term18290.getClass(), "frontFemale", "zUXaSvayQe");
        setField(term18290, term18290.getClass(), "frontShinyFemale", "bPVcnnQPSC");
        setField(term18290, term18290.getClass(), "backDefault", "PQLyoEKWSa");
        setField(term18290, term18290.getClass(), "backShiny", "HOgkhttJZS");
        setField(term18290, term18290.getClass(), "backFemale", "goqNSmXSSS");
        setField(term18290, term18290.getClass(), "backShinyFemale", "AkViBLdqXM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlxGFzEifL";
        callMethod(klass, "setFrontFemale", argTypes, term18290, args);
    }

};


