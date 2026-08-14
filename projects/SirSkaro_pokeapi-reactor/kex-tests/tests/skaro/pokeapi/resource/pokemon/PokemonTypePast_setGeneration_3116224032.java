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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class PokemonTypePast_setGeneration_3116224032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16404;
     Object term16462;

    public PokemonTypePast_setGeneration_3116224032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16433 = new Integer(-1483966656);
        Object term16432 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16435 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16432, term16432.getClass(), "slot", term16433);
        setField(term16435, term16435.getClass(), "name", null);
        setField(term16435, term16435.getClass(), "url", null);
        setField(term16432, term16432.getClass(), "type", term16435);
        Integer term16437 = new Integer(-334260786);
        Object term16436 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16439 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16436, term16436.getClass(), "slot", term16437);
        setField(term16439, term16439.getClass(), "name", null);
        setField(term16439, term16439.getClass(), "url", null);
        setField(term16436, term16436.getClass(), "type", term16439);
        Integer term16441 = new Integer(-765890956);
        Object term16440 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16443 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16440, term16440.getClass(), "slot", term16441);
        setField(term16443, term16443.getClass(), "name", null);
        setField(term16443, term16443.getClass(), "url", null);
        setField(term16440, term16440.getClass(), "type", term16443);
        Integer term16445 = new Integer(-214452542);
        Object term16444 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16447 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16444, term16444.getClass(), "slot", term16445);
        setField(term16447, term16447.getClass(), "name", null);
        setField(term16447, term16447.getClass(), "url", null);
        setField(term16444, term16444.getClass(), "type", term16447);
        Integer term16449 = new Integer(-21429773);
        Object term16448 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16451 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16448, term16448.getClass(), "slot", term16449);
        setField(term16451, term16451.getClass(), "name", null);
        setField(term16451, term16451.getClass(), "url", null);
        setField(term16448, term16448.getClass(), "type", term16451);
        Integer term16453 = new Integer(1774728742);
        Object term16452 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16455 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16452, term16452.getClass(), "slot", term16453);
        setField(term16455, term16455.getClass(), "name", null);
        setField(term16455, term16455.getClass(), "url", null);
        setField(term16452, term16452.getClass(), "type", term16455);
        Integer term16457 = new Integer(-1822211508);
        Object term16456 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term16459 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16456, term16456.getClass(), "slot", term16457);
        setField(term16459, term16459.getClass(), "name", null);
        setField(term16459, term16459.getClass(), "url", null);
        setField(term16456, term16456.getClass(), "type", term16459);
        ArrayList term16430 = new ArrayList();
        ((ArrayList) term16430).add(term16432);
        ((ArrayList) term16430).add(term16436);
        ((ArrayList) term16430).add(term16440);
        ((ArrayList) term16430).add(term16444);
        ((ArrayList) term16430).add(term16448);
        ((ArrayList) term16430).add(term16452);
        ((ArrayList) term16430).add(term16456);
        term16404 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonTypePast"));
        Object term16405 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16405, term16405.getClass(), "name", "kadRHthQRD");
        setField(term16405, term16405.getClass(), "url", "cGbJSRSpNn");
        setField(term16404, term16404.getClass(), "generation", term16405);
        setField(term16404, term16404.getClass(), "types", term16430);
        term16462 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16462, term16462.getClass(), "name", "GLxLHUsuLw");
        setField(term16462, term16462.getClass(), "url", "HuKdqrrxIm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonTypePast");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term16462;
        callMethod(klass, "setGeneration", argTypes, term16404, args);
    }

};


