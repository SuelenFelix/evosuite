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

public class Item_setEffectEntries_11291841731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3878;

    public Item_setEffectEntries_11291841731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3878 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term3878, term3878.getClass(), "id", null);
        setField(term3878, term3878.getClass(), "name", null);
        setField(term3878, term3878.getClass(), "cost", null);
        setField(term3878, term3878.getClass(), "flingPower", null);
        setField(term3878, term3878.getClass(), "flingEffect", null);
        setField(term3878, term3878.getClass(), "attributes", null);
        setField(term3878, term3878.getClass(), "category", null);
        setField(term3878, term3878.getClass(), "effectEntries", null);
        setField(term3878, term3878.getClass(), "flavorTextEntries", null);
        setField(term3878, term3878.getClass(), "gameIndices", null);
        setField(term3878, term3878.getClass(), "names", null);
        setField(term3878, term3878.getClass(), "sprites", null);
        setField(term3878, term3878.getClass(), "heldByPokemon", null);
        setField(term3878, term3878.getClass(), "babyTriggerFor", null);
        setField(term3878, term3878.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEffectEntries", argTypes, term3878, args);
    }

};


