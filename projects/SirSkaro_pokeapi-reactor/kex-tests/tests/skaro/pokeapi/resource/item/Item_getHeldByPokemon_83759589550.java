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

public class Item_getHeldByPokemon_83759589550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53458;

    public Item_getHeldByPokemon_83759589550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53458 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term53458, term53458.getClass(), "id", null);
        setField(term53458, term53458.getClass(), "name", null);
        setField(term53458, term53458.getClass(), "cost", null);
        setField(term53458, term53458.getClass(), "flingPower", null);
        setField(term53458, term53458.getClass(), "flingEffect", null);
        setField(term53458, term53458.getClass(), "attributes", null);
        setField(term53458, term53458.getClass(), "category", null);
        setField(term53458, term53458.getClass(), "effectEntries", null);
        setField(term53458, term53458.getClass(), "flavorTextEntries", null);
        setField(term53458, term53458.getClass(), "gameIndices", null);
        setField(term53458, term53458.getClass(), "names", null);
        setField(term53458, term53458.getClass(), "sprites", null);
        setField(term53458, term53458.getClass(), "heldByPokemon", null);
        setField(term53458, term53458.getClass(), "babyTriggerFor", null);
        setField(term53458, term53458.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeldByPokemon", argTypes, term53458, args);
    }

};


