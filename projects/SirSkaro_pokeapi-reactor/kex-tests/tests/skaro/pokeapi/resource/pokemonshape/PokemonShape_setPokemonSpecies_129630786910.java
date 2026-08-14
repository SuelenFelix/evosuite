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
import java.util.LinkedList;

public class PokemonShape_setPokemonSpecies_129630786910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558;
     Object term612;

    public PokemonShape_setPokemonSpecies_129630786910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term559 = new Integer(1725571209);
        Object term575 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term577 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term575, term575.getClass(), "awesomeName", "");
        setField(term577, term577.getClass(), "name", null);
        setField(term577, term577.getClass(), "url", null);
        setField(term575, term575.getClass(), "language", term577);
        Object term578 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term580 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term578, term578.getClass(), "awesomeName", "");
        setField(term580, term580.getClass(), "name", null);
        setField(term580, term580.getClass(), "url", null);
        setField(term578, term578.getClass(), "language", term580);
        Object term581 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term583 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term581, term581.getClass(), "awesomeName", "");
        setField(term583, term583.getClass(), "name", null);
        setField(term583, term583.getClass(), "url", null);
        setField(term581, term581.getClass(), "language", term583);
        Object term584 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term586 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term584, term584.getClass(), "awesomeName", "");
        setField(term586, term586.getClass(), "name", null);
        setField(term586, term586.getClass(), "url", null);
        setField(term584, term584.getClass(), "language", term586);
        Object term587 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term589 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term587, term587.getClass(), "awesomeName", "");
        setField(term589, term589.getClass(), "name", null);
        setField(term589, term589.getClass(), "url", null);
        setField(term587, term587.getClass(), "language", term589);
        Object term590 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term592 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term590, term590.getClass(), "awesomeName", "");
        setField(term592, term592.getClass(), "name", null);
        setField(term592, term592.getClass(), "url", null);
        setField(term590, term590.getClass(), "language", term592);
        Object term593 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term595 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term593, term593.getClass(), "awesomeName", "");
        setField(term595, term595.getClass(), "name", null);
        setField(term595, term595.getClass(), "url", null);
        setField(term593, term593.getClass(), "language", term595);
        ArrayList term573 = new ArrayList();
        ((ArrayList) term573).add(term575);
        ((ArrayList) term573).add(term578);
        ((ArrayList) term573).add(term581);
        ((ArrayList) term573).add(term584);
        ((ArrayList) term573).add(term587);
        ((ArrayList) term573).add(term590);
        ((ArrayList) term573).add(term593);
        Object term600 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term602 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term600, term600.getClass(), "name", "");
        setField(term602, term602.getClass(), "name", null);
        setField(term602, term602.getClass(), "url", null);
        setField(term600, term600.getClass(), "language", term602);
        Object term603 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term605 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term603, term603.getClass(), "name", "");
        setField(term605, term605.getClass(), "name", null);
        setField(term605, term605.getClass(), "url", null);
        setField(term603, term603.getClass(), "language", term605);
        ArrayList term598 = new ArrayList();
        ((ArrayList) term598).add(term600);
        ((ArrayList) term598).add(term603);
        ArrayList term608 = new ArrayList();
        term558 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape"));
        setField(term558, term558.getClass(), "id", term559);
        setField(term558, term558.getClass(), "name", "tXfQjSqDzN");
        setField(term558, term558.getClass(), "awesomeNames", term573);
        setField(term558, term558.getClass(), "names", term598);
        setField(term558, term558.getClass(), "pokemonSpecies", term608);
        term612 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term612;
        callMethod(klass, "setPokemonSpecies", argTypes, term558, args);
    }

};


