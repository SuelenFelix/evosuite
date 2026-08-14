package skaro.pokeapi.resource.pokemonshape;

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
import static skaro.pokeapi.resource.pokemonshape.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class PokemonShape_getName_18114797443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public PokemonShape_getName_18114797443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term120 = new Integer(391863371);
        Object term136 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term138 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term136, term136.getClass(), "awesomeName", "");
        setField(term138, term138.getClass(), "name", null);
        setField(term138, term138.getClass(), "url", null);
        setField(term136, term136.getClass(), "language", term138);
        Object term139 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term141 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term139, term139.getClass(), "awesomeName", "");
        setField(term141, term141.getClass(), "name", null);
        setField(term141, term141.getClass(), "url", null);
        setField(term139, term139.getClass(), "language", term141);
        ArrayList term134 = new ArrayList();
        ((ArrayList) term134).add(term136);
        ((ArrayList) term134).add(term139);
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
        Object term152 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term154 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term152, term152.getClass(), "name", "");
        setField(term154, term154.getClass(), "name", null);
        setField(term154, term154.getClass(), "url", null);
        setField(term152, term152.getClass(), "language", term154);
        Object term155 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term157 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term155, term155.getClass(), "name", "");
        setField(term157, term157.getClass(), "name", null);
        setField(term157, term157.getClass(), "url", null);
        setField(term155, term155.getClass(), "language", term157);
        Object term158 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term160 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term158, term158.getClass(), "name", "");
        setField(term160, term160.getClass(), "name", null);
        setField(term160, term160.getClass(), "url", null);
        setField(term158, term158.getClass(), "language", term160);
        Object term161 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term163 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term161, term161.getClass(), "name", "");
        setField(term163, term163.getClass(), "name", null);
        setField(term163, term163.getClass(), "url", null);
        setField(term161, term161.getClass(), "language", term163);
        ArrayList term144 = new ArrayList();
        ((ArrayList) term144).add(term146);
        ((ArrayList) term144).add(term149);
        ((ArrayList) term144).add(term152);
        ((ArrayList) term144).add(term155);
        ((ArrayList) term144).add(term158);
        ((ArrayList) term144).add(term161);
        ArrayList term166 = new ArrayList();
        term119 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape"));
        setField(term119, term119.getClass(), "id", term120);
        setField(term119, term119.getClass(), "name", "BndsHwAFMv");
        setField(term119, term119.getClass(), "awesomeNames", term134);
        setField(term119, term119.getClass(), "names", term144);
        setField(term119, term119.getClass(), "pokemonSpecies", term166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term119, args);
    }

};


