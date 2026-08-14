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

public class Item_setName_11521221528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;

    public Item_setName_11521221528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term959 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term959, term959.getClass(), "id", null);
        setField(term959, term959.getClass(), "name", null);
        setField(term959, term959.getClass(), "cost", null);
        setField(term959, term959.getClass(), "flingPower", null);
        setField(term959, term959.getClass(), "flingEffect", null);
        setField(term959, term959.getClass(), "attributes", null);
        setField(term959, term959.getClass(), "category", null);
        setField(term959, term959.getClass(), "effectEntries", null);
        setField(term959, term959.getClass(), "flavorTextEntries", null);
        setField(term959, term959.getClass(), "gameIndices", null);
        setField(term959, term959.getClass(), "names", null);
        setField(term959, term959.getClass(), "sprites", null);
        setField(term959, term959.getClass(), "heldByPokemon", null);
        setField(term959, term959.getClass(), "babyTriggerFor", null);
        setField(term959, term959.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term959, args);
    }

};


