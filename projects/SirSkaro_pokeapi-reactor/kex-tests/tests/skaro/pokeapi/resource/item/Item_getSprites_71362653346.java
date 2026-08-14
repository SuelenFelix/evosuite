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

public class Item_getSprites_71362653346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52948;

    public Item_getSprites_71362653346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52948 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term52948, term52948.getClass(), "id", null);
        setField(term52948, term52948.getClass(), "name", null);
        setField(term52948, term52948.getClass(), "cost", null);
        setField(term52948, term52948.getClass(), "flingPower", null);
        setField(term52948, term52948.getClass(), "flingEffect", null);
        setField(term52948, term52948.getClass(), "attributes", null);
        setField(term52948, term52948.getClass(), "category", null);
        setField(term52948, term52948.getClass(), "effectEntries", null);
        setField(term52948, term52948.getClass(), "flavorTextEntries", null);
        setField(term52948, term52948.getClass(), "gameIndices", null);
        setField(term52948, term52948.getClass(), "names", null);
        setField(term52948, term52948.getClass(), "sprites", null);
        setField(term52948, term52948.getClass(), "heldByPokemon", null);
        setField(term52948, term52948.getClass(), "babyTriggerFor", null);
        setField(term52948, term52948.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSprites", argTypes, term52948, args);
    }

};


