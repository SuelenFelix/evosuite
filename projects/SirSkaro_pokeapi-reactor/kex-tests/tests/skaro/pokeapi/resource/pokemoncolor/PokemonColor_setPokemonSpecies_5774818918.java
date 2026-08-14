package skaro.pokeapi.resource.pokemoncolor;

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
import static skaro.pokeapi.resource.pokemoncolor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class PokemonColor_setPokemonSpecies_5774818918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334;
     Object term363;

    public PokemonColor_setPokemonSpecies_5774818918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term335 = new Integer(1227103734);
        Object term351 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term353 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term351, term351.getClass(), "name", "");
        setField(term353, term353.getClass(), "name", null);
        setField(term353, term353.getClass(), "url", null);
        setField(term351, term351.getClass(), "language", term353);
        Object term354 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term356 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term354, term354.getClass(), "name", "");
        setField(term356, term356.getClass(), "name", null);
        setField(term356, term356.getClass(), "url", null);
        setField(term354, term354.getClass(), "language", term356);
        ArrayList term349 = new ArrayList();
        ((ArrayList) term349).add(term351);
        ((ArrayList) term349).add(term354);
        ArrayList term359 = new ArrayList();
        term334 = newInstance(Class.forName("skaro.pokeapi.resource.pokemoncolor.PokemonColor"));
        setField(term334, term334.getClass(), "id", term335);
        setField(term334, term334.getClass(), "name", "bWWfajKbEX");
        setField(term334, term334.getClass(), "names", term349);
        setField(term334, term334.getClass(), "pokemonSpecies", term359);
        term363 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemoncolor.PokemonColor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term363;
        callMethod(klass, "setPokemonSpecies", argTypes, term334, args);
    }

};


