package skaro.pokeapi.resource.item;

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
import static skaro.pokeapi.resource.item.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class ItemHolderPokemon_setPokemon_20468130132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7300;
     Object term7350;

    public ItemHolderPokemon_setPokemon_20468130132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7329 = new Integer(-423900705);
        Object term7328 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7331 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7328, term7328.getClass(), "rarity", term7329);
        setField(term7331, term7331.getClass(), "name", null);
        setField(term7331, term7331.getClass(), "url", null);
        setField(term7328, term7328.getClass(), "version", term7331);
        Integer term7333 = new Integer(-525570815);
        Object term7332 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7335 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7332, term7332.getClass(), "rarity", term7333);
        setField(term7335, term7335.getClass(), "name", null);
        setField(term7335, term7335.getClass(), "url", null);
        setField(term7332, term7332.getClass(), "version", term7335);
        Integer term7337 = new Integer(754055848);
        Object term7336 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7339 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7336, term7336.getClass(), "rarity", term7337);
        setField(term7339, term7339.getClass(), "name", null);
        setField(term7339, term7339.getClass(), "url", null);
        setField(term7336, term7336.getClass(), "version", term7339);
        Integer term7341 = new Integer(-19246901);
        Object term7340 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7343 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7340, term7340.getClass(), "rarity", term7341);
        setField(term7343, term7343.getClass(), "name", null);
        setField(term7343, term7343.getClass(), "url", null);
        setField(term7340, term7340.getClass(), "version", term7343);
        Integer term7345 = new Integer(-370828664);
        Object term7344 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7347 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7344, term7344.getClass(), "rarity", term7345);
        setField(term7347, term7347.getClass(), "name", null);
        setField(term7347, term7347.getClass(), "url", null);
        setField(term7344, term7344.getClass(), "version", term7347);
        ArrayList term7326 = new ArrayList();
        ((ArrayList) term7326).add(term7328);
        ((ArrayList) term7326).add(term7332);
        ((ArrayList) term7326).add(term7336);
        ((ArrayList) term7326).add(term7340);
        ((ArrayList) term7326).add(term7344);
        term7300 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon"));
        Object term7301 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7301, term7301.getClass(), "name", "hLVDOhfCKX");
        setField(term7301, term7301.getClass(), "url", "yXLTfzOgfX");
        setField(term7300, term7300.getClass(), "pokemon", term7301);
        setField(term7300, term7300.getClass(), "versionDetails", term7326);
        term7350 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7350, term7350.getClass(), "name", "PEUfeJaZTk");
        setField(term7350, term7350.getClass(), "url", "AIvyeIdskz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term7350;
        callMethod(klass, "setPokemon", argTypes, term7300, args);
    }

};


