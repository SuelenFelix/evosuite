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
import java.util.LinkedList;

public class PokemonHeldItem_setVersionDetails_2704741944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term842;
     Object term888;

    public PokemonHeldItem_setVersionDetails_2704741944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term872 = new Integer(-1179120542);
        Object term870 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term871 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term871, term871.getClass(), "name", null);
        setField(term871, term871.getClass(), "url", null);
        setField(term870, term870.getClass(), "version", term871);
        setField(term870, term870.getClass(), "rarity", term872);
        Integer term876 = new Integer(-73683645);
        Object term874 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term875 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term875, term875.getClass(), "name", null);
        setField(term875, term875.getClass(), "url", null);
        setField(term874, term874.getClass(), "version", term875);
        setField(term874, term874.getClass(), "rarity", term876);
        Integer term880 = new Integer(-226514366);
        Object term878 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term879 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term879, term879.getClass(), "name", null);
        setField(term879, term879.getClass(), "url", null);
        setField(term878, term878.getClass(), "version", term879);
        setField(term878, term878.getClass(), "rarity", term880);
        Integer term884 = new Integer(1193880199);
        Object term882 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term883 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term883, term883.getClass(), "name", null);
        setField(term883, term883.getClass(), "url", null);
        setField(term882, term882.getClass(), "version", term883);
        setField(term882, term882.getClass(), "rarity", term884);
        ArrayList term868 = new ArrayList();
        ((ArrayList) term868).add(term870);
        ((ArrayList) term868).add(term874);
        ((ArrayList) term868).add(term878);
        ((ArrayList) term868).add(term882);
        term842 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItem"));
        Object term843 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term843, term843.getClass(), "name", "hoicvmsovO");
        setField(term843, term843.getClass(), "url", "eqJfYWRaEL");
        setField(term842, term842.getClass(), "item", term843);
        setField(term842, term842.getClass(), "versionDetails", term868);
        Integer term895 = new Integer(-1087774327);
        Object term891 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term892 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term892, term892.getClass(), "name", "");
        setField(term892, term892.getClass(), "url", "");
        setField(term891, term891.getClass(), "version", term892);
        setField(term891, term891.getClass(), "rarity", term895);
        Integer term900 = new Integer(-1530420153);
        Object term898 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term899 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term899, term899.getClass(), "name", null);
        setField(term899, term899.getClass(), "url", null);
        setField(term898, term898.getClass(), "version", term899);
        setField(term898, term898.getClass(), "rarity", term900);
        Integer term904 = new Integer(-469968304);
        Object term903 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        setField(term903, term903.getClass(), "version", null);
        setField(term903, term903.getClass(), "rarity", term904);
        term888 = new LinkedList();
        ((LinkedList) term888).add(term891);
        ((LinkedList) term888).add(term898);
        ((LinkedList) term888).add(term903);
        ((LinkedList) term888).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term888;
        callMethod(klass, "setVersionDetails", argTypes, term842, args);
    }

};


