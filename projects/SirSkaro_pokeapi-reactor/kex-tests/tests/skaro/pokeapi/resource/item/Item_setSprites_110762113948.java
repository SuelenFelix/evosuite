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

public class Item_setSprites_110762113948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53210;

    public Item_setSprites_110762113948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53210 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term53210, term53210.getClass(), "id", null);
        setField(term53210, term53210.getClass(), "name", null);
        setField(term53210, term53210.getClass(), "cost", null);
        setField(term53210, term53210.getClass(), "flingPower", null);
        setField(term53210, term53210.getClass(), "flingEffect", null);
        setField(term53210, term53210.getClass(), "attributes", null);
        setField(term53210, term53210.getClass(), "category", null);
        setField(term53210, term53210.getClass(), "effectEntries", null);
        setField(term53210, term53210.getClass(), "flavorTextEntries", null);
        setField(term53210, term53210.getClass(), "gameIndices", null);
        setField(term53210, term53210.getClass(), "names", null);
        setField(term53210, term53210.getClass(), "sprites", null);
        setField(term53210, term53210.getClass(), "heldByPokemon", null);
        setField(term53210, term53210.getClass(), "babyTriggerFor", null);
        setField(term53210, term53210.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.item.ItemSprites");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSprites", argTypes, term53210, args);
    }

};


