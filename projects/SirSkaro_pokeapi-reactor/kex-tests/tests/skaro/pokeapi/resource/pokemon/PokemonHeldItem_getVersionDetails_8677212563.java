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

public class PokemonHeldItem_getVersionDetails_8677212563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term780;

    public PokemonHeldItem_getVersionDetails_8677212563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term810 = new Integer(-1275173084);
        Object term808 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term809 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term809, term809.getClass(), "name", null);
        setField(term809, term809.getClass(), "url", null);
        setField(term808, term808.getClass(), "version", term809);
        setField(term808, term808.getClass(), "rarity", term810);
        Integer term814 = new Integer(-244121226);
        Object term812 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term813 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term813, term813.getClass(), "name", null);
        setField(term813, term813.getClass(), "url", null);
        setField(term812, term812.getClass(), "version", term813);
        setField(term812, term812.getClass(), "rarity", term814);
        Integer term818 = new Integer(-203030934);
        Object term816 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term817 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term817, term817.getClass(), "name", null);
        setField(term817, term817.getClass(), "url", null);
        setField(term816, term816.getClass(), "version", term817);
        setField(term816, term816.getClass(), "rarity", term818);
        ArrayList term806 = new ArrayList();
        ((ArrayList) term806).add(term808);
        ((ArrayList) term806).add(term812);
        ((ArrayList) term806).add(term816);
        term780 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItem"));
        Object term781 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term781, term781.getClass(), "name", "onpbIeEKoi");
        setField(term781, term781.getClass(), "url", "YRHGsAkhxb");
        setField(term780, term780.getClass(), "item", term781);
        setField(term780, term780.getClass(), "versionDetails", term806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionDetails", argTypes, term780, args);
    }

};


