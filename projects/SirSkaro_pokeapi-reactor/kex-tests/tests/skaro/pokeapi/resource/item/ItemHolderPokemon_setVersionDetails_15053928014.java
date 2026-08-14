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
import java.util.LinkedList;

public class ItemHolderPokemon_setVersionDetails_15053928014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7493;
     Object term7535;

    public ItemHolderPokemon_setVersionDetails_15053928014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7522 = new Integer(-688213483);
        Object term7521 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7524 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7521, term7521.getClass(), "rarity", term7522);
        setField(term7524, term7524.getClass(), "name", null);
        setField(term7524, term7524.getClass(), "url", null);
        setField(term7521, term7521.getClass(), "version", term7524);
        Integer term7526 = new Integer(644154104);
        Object term7525 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7528 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7525, term7525.getClass(), "rarity", term7526);
        setField(term7528, term7528.getClass(), "name", null);
        setField(term7528, term7528.getClass(), "url", null);
        setField(term7525, term7525.getClass(), "version", term7528);
        Integer term7530 = new Integer(76650923);
        Object term7529 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7532 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7529, term7529.getClass(), "rarity", term7530);
        setField(term7532, term7532.getClass(), "name", null);
        setField(term7532, term7532.getClass(), "url", null);
        setField(term7529, term7529.getClass(), "version", term7532);
        ArrayList term7519 = new ArrayList();
        ((ArrayList) term7519).add(term7521);
        ((ArrayList) term7519).add(term7525);
        ((ArrayList) term7519).add(term7529);
        term7493 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon"));
        Object term7494 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7494, term7494.getClass(), "name", "bqKksqtAdT");
        setField(term7494, term7494.getClass(), "url", "jAIAdEmULK");
        setField(term7493, term7493.getClass(), "pokemon", term7494);
        setField(term7493, term7493.getClass(), "versionDetails", term7519);
        term7535 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term7535;
        callMethod(klass, "setVersionDetails", argTypes, term7493, args);
    }

};


