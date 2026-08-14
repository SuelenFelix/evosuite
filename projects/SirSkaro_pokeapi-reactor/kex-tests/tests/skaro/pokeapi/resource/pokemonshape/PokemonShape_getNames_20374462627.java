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

public class PokemonShape_getNames_20374462627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361;

    public PokemonShape_getNames_20374462627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term362 = new Integer(-2038273078);
        Object term378 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term380 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term378, term378.getClass(), "awesomeName", "");
        setField(term380, term380.getClass(), "name", null);
        setField(term380, term380.getClass(), "url", null);
        setField(term378, term378.getClass(), "language", term380);
        Object term381 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term383 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term381, term381.getClass(), "awesomeName", "");
        setField(term383, term383.getClass(), "name", null);
        setField(term383, term383.getClass(), "url", null);
        setField(term381, term381.getClass(), "language", term383);
        Object term384 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term386 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term384, term384.getClass(), "awesomeName", "");
        setField(term386, term386.getClass(), "name", null);
        setField(term386, term386.getClass(), "url", null);
        setField(term384, term384.getClass(), "language", term386);
        Object term387 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term389 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term387, term387.getClass(), "awesomeName", "");
        setField(term389, term389.getClass(), "name", null);
        setField(term389, term389.getClass(), "url", null);
        setField(term387, term387.getClass(), "language", term389);
        Object term390 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.AwesomeName"));
        Object term392 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term390, term390.getClass(), "awesomeName", "");
        setField(term392, term392.getClass(), "name", null);
        setField(term392, term392.getClass(), "url", null);
        setField(term390, term390.getClass(), "language", term392);
        ArrayList term376 = new ArrayList();
        ((ArrayList) term376).add(term378);
        ((ArrayList) term376).add(term381);
        ((ArrayList) term376).add(term384);
        ((ArrayList) term376).add(term387);
        ((ArrayList) term376).add(term390);
        Object term397 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term399 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term397, term397.getClass(), "name", "");
        setField(term399, term399.getClass(), "name", null);
        setField(term399, term399.getClass(), "url", null);
        setField(term397, term397.getClass(), "language", term399);
        Object term400 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term402 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term400, term400.getClass(), "name", "");
        setField(term402, term402.getClass(), "name", null);
        setField(term402, term402.getClass(), "url", null);
        setField(term400, term400.getClass(), "language", term402);
        Object term403 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term405 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term403, term403.getClass(), "name", "");
        setField(term405, term405.getClass(), "name", null);
        setField(term405, term405.getClass(), "url", null);
        setField(term403, term403.getClass(), "language", term405);
        Object term406 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term408 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term406, term406.getClass(), "name", "");
        setField(term408, term408.getClass(), "name", null);
        setField(term408, term408.getClass(), "url", null);
        setField(term406, term406.getClass(), "language", term408);
        ArrayList term395 = new ArrayList();
        ((ArrayList) term395).add(term397);
        ((ArrayList) term395).add(term400);
        ((ArrayList) term395).add(term403);
        ((ArrayList) term395).add(term406);
        ArrayList term411 = new ArrayList();
        term361 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape"));
        setField(term361, term361.getClass(), "id", term362);
        setField(term361, term361.getClass(), "name", "pORebkoRdD");
        setField(term361, term361.getClass(), "awesomeNames", term376);
        setField(term361, term361.getClass(), "names", term395);
        setField(term361, term361.getClass(), "pokemonSpecies", term411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term361, args);
    }

};


