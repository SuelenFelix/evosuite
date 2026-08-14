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

public class Item_setAttributes_36441914724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2848;

    public Item_setAttributes_36441914724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2848 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term2848, term2848.getClass(), "id", null);
        setField(term2848, term2848.getClass(), "name", null);
        setField(term2848, term2848.getClass(), "cost", null);
        setField(term2848, term2848.getClass(), "flingPower", null);
        setField(term2848, term2848.getClass(), "flingEffect", null);
        setField(term2848, term2848.getClass(), "attributes", null);
        setField(term2848, term2848.getClass(), "category", null);
        setField(term2848, term2848.getClass(), "effectEntries", null);
        setField(term2848, term2848.getClass(), "flavorTextEntries", null);
        setField(term2848, term2848.getClass(), "gameIndices", null);
        setField(term2848, term2848.getClass(), "names", null);
        setField(term2848, term2848.getClass(), "sprites", null);
        setField(term2848, term2848.getClass(), "heldByPokemon", null);
        setField(term2848, term2848.getClass(), "babyTriggerFor", null);
        setField(term2848, term2848.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAttributes", argTypes, term2848, args);
    }

};


