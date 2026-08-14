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

public class ItemHolderPokemon_getPokemon_2918695871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7242;

    public ItemHolderPokemon_getPokemon_2918695871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7271 = new Integer(1374790203);
        Object term7270 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7273 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7270, term7270.getClass(), "rarity", term7271);
        setField(term7273, term7273.getClass(), "name", null);
        setField(term7273, term7273.getClass(), "url", null);
        setField(term7270, term7270.getClass(), "version", term7273);
        Integer term7275 = new Integer(1160010161);
        Object term7274 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemonVersionDetail"));
        Object term7277 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7274, term7274.getClass(), "rarity", term7275);
        setField(term7277, term7277.getClass(), "name", null);
        setField(term7277, term7277.getClass(), "url", null);
        setField(term7274, term7274.getClass(), "version", term7277);
        ArrayList term7268 = new ArrayList();
        ((ArrayList) term7268).add(term7270);
        ((ArrayList) term7268).add(term7274);
        term7242 = newInstance(Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon"));
        Object term7243 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7243, term7243.getClass(), "name", "PECfBejlfo");
        setField(term7243, term7243.getClass(), "url", "SDbDgydVpg");
        setField(term7242, term7242.getClass(), "pokemon", term7243);
        setField(term7242, term7242.getClass(), "versionDetails", term7268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.ItemHolderPokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemon", argTypes, term7242, args);
    }

};


