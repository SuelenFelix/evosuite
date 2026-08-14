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

public class Item_setFlavorTextEntries_201410030936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51827;

    public Item_setFlavorTextEntries_201410030936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51827 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term51827, term51827.getClass(), "id", null);
        setField(term51827, term51827.getClass(), "name", null);
        setField(term51827, term51827.getClass(), "cost", null);
        setField(term51827, term51827.getClass(), "flingPower", null);
        setField(term51827, term51827.getClass(), "flingEffect", null);
        setField(term51827, term51827.getClass(), "attributes", null);
        setField(term51827, term51827.getClass(), "category", null);
        setField(term51827, term51827.getClass(), "effectEntries", null);
        setField(term51827, term51827.getClass(), "flavorTextEntries", null);
        setField(term51827, term51827.getClass(), "gameIndices", null);
        setField(term51827, term51827.getClass(), "names", null);
        setField(term51827, term51827.getClass(), "sprites", null);
        setField(term51827, term51827.getClass(), "heldByPokemon", null);
        setField(term51827, term51827.getClass(), "babyTriggerFor", null);
        setField(term51827, term51827.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFlavorTextEntries", argTypes, term51827, args);
    }

};


