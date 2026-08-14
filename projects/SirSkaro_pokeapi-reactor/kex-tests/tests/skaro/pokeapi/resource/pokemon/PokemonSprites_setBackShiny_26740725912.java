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

public class PokemonSprites_setBackShiny_26740725912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19418;

    public PokemonSprites_setBackShiny_26740725912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19418 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term19418, term19418.getClass(), "frontDefault", "mRoEmuCJhW");
        setField(term19418, term19418.getClass(), "frontShiny", "JJUWbMXpyM");
        setField(term19418, term19418.getClass(), "frontFemale", "KDrRQWVXok");
        setField(term19418, term19418.getClass(), "frontShinyFemale", "oOOwvWgxtf");
        setField(term19418, term19418.getClass(), "backDefault", "ywoADeiUfF");
        setField(term19418, term19418.getClass(), "backShiny", "loHiudJxbt");
        setField(term19418, term19418.getClass(), "backFemale", "lRbxbybNew");
        setField(term19418, term19418.getClass(), "backShinyFemale", "WzGudiEARD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoefPqGtaj";
        callMethod(klass, "setBackShiny", argTypes, term19418, args);
    }

};


