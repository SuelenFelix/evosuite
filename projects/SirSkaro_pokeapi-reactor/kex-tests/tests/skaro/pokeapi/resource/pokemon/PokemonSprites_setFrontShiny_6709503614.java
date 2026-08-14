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

public class PokemonSprites_setFrontShiny_6709503614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17914;

    public PokemonSprites_setFrontShiny_6709503614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17914 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term17914, term17914.getClass(), "frontDefault", "YXORpHCDcd");
        setField(term17914, term17914.getClass(), "frontShiny", "XzZbAcRADD");
        setField(term17914, term17914.getClass(), "frontFemale", "UqSNWSoTRy");
        setField(term17914, term17914.getClass(), "frontShinyFemale", "VesRqDfjMa");
        setField(term17914, term17914.getClass(), "backDefault", "AQTTebOiZR");
        setField(term17914, term17914.getClass(), "backShiny", "mgeIhswNtk");
        setField(term17914, term17914.getClass(), "backFemale", "QwKYpiVQlL");
        setField(term17914, term17914.getClass(), "backShinyFemale", "kSGsHNQQoW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MWezlyjdaG";
        callMethod(klass, "setFrontShiny", argTypes, term17914, args);
    }

};


