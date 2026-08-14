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

public class PokemonHeldItem_getItem_2617095801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599;

    public PokemonHeldItem_getItem_2617095801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term629 = new Integer(1048535127);
        Object term627 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term628 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term628, term628.getClass(), "name", null);
        setField(term628, term628.getClass(), "url", null);
        setField(term627, term627.getClass(), "version", term628);
        setField(term627, term627.getClass(), "rarity", term629);
        Integer term633 = new Integer(-655067527);
        Object term631 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term632 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term632, term632.getClass(), "name", null);
        setField(term632, term632.getClass(), "url", null);
        setField(term631, term631.getClass(), "version", term632);
        setField(term631, term631.getClass(), "rarity", term633);
        Integer term637 = new Integer(-6029667);
        Object term635 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term636 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term636, term636.getClass(), "name", null);
        setField(term636, term636.getClass(), "url", null);
        setField(term635, term635.getClass(), "version", term636);
        setField(term635, term635.getClass(), "rarity", term637);
        Integer term641 = new Integer(-2068769794);
        Object term639 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term640 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term640, term640.getClass(), "name", null);
        setField(term640, term640.getClass(), "url", null);
        setField(term639, term639.getClass(), "version", term640);
        setField(term639, term639.getClass(), "rarity", term641);
        Integer term645 = new Integer(-117576464);
        Object term643 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term644 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term644, term644.getClass(), "name", null);
        setField(term644, term644.getClass(), "url", null);
        setField(term643, term643.getClass(), "version", term644);
        setField(term643, term643.getClass(), "rarity", term645);
        ArrayList term625 = new ArrayList();
        ((ArrayList) term625).add(term627);
        ((ArrayList) term625).add(term631);
        ((ArrayList) term625).add(term635);
        ((ArrayList) term625).add(term639);
        ((ArrayList) term625).add(term643);
        term599 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItem"));
        Object term600 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term600, term600.getClass(), "name", "IoAlmYsBwc");
        setField(term600, term600.getClass(), "url", "TEParAifyi");
        setField(term599, term599.getClass(), "item", term600);
        setField(term599, term599.getClass(), "versionDetails", term625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItem", argTypes, term599, args);
    }

};


