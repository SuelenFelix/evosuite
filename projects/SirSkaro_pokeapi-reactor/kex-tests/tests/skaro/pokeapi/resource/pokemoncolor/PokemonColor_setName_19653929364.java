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

public class PokemonColor_setName_19653929364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129;

    public PokemonColor_setName_19653929364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term130 = new Integer(-1922583790);
        Object term146 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term148 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term146, term146.getClass(), "name", "");
        setField(term148, term148.getClass(), "name", null);
        setField(term148, term148.getClass(), "url", null);
        setField(term146, term146.getClass(), "language", term148);
        Object term149 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term151 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term149, term149.getClass(), "name", "");
        setField(term151, term151.getClass(), "name", null);
        setField(term151, term151.getClass(), "url", null);
        setField(term149, term149.getClass(), "language", term151);
        ArrayList term144 = new ArrayList();
        ((ArrayList) term144).add(term146);
        ((ArrayList) term144).add(term149);
        ArrayList term154 = new ArrayList();
        term129 = newInstance(Class.forName("skaro.pokeapi.resource.pokemoncolor.PokemonColor"));
        setField(term129, term129.getClass(), "id", term130);
        setField(term129, term129.getClass(), "name", "OWDIEULEFu");
        setField(term129, term129.getClass(), "names", term144);
        setField(term129, term129.getClass(), "pokemonSpecies", term154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemoncolor.PokemonColor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "setName", argTypes, term129, args);
    }

};


