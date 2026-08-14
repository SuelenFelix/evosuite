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

public class PokemonSprites_setBackShinyFemale_173287723116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20170;

    public PokemonSprites_setBackShinyFemale_173287723116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20170 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term20170, term20170.getClass(), "frontDefault", "SxeKEdHXSl");
        setField(term20170, term20170.getClass(), "frontShiny", "BCAlJpNjIX");
        setField(term20170, term20170.getClass(), "frontFemale", "PKClfBAwUr");
        setField(term20170, term20170.getClass(), "frontShinyFemale", "JqbKrmVEMy");
        setField(term20170, term20170.getClass(), "backDefault", "VygCEWaefB");
        setField(term20170, term20170.getClass(), "backShiny", "PqhYfEyDDA");
        setField(term20170, term20170.getClass(), "backFemale", "fSLHLeuNoa");
        setField(term20170, term20170.getClass(), "backShinyFemale", "IwgPFurObw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WLaHlrYQyz";
        callMethod(klass, "setBackShinyFemale", argTypes, term20170, args);
    }

};


