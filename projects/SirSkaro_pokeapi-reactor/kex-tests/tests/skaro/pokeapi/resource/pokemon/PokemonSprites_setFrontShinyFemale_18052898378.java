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

public class PokemonSprites_setFrontShinyFemale_18052898378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18666;

    public PokemonSprites_setFrontShinyFemale_18052898378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18666 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term18666, term18666.getClass(), "frontDefault", "XKMXfDZajw");
        setField(term18666, term18666.getClass(), "frontShiny", "avZoBQSrBy");
        setField(term18666, term18666.getClass(), "frontFemale", "KIXGeHXdwi");
        setField(term18666, term18666.getClass(), "frontShinyFemale", "tTfdvLMwEE");
        setField(term18666, term18666.getClass(), "backDefault", "DiSkERzqOE");
        setField(term18666, term18666.getClass(), "backShiny", "hPSZZeYqHQ");
        setField(term18666, term18666.getClass(), "backFemale", "scReMUKyGq");
        setField(term18666, term18666.getClass(), "backShinyFemale", "FmIpnxjRxA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FTjxxGvyun";
        callMethod(klass, "setFrontShinyFemale", argTypes, term18666, args);
    }

};


