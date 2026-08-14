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

public class Item_getGameIndices_142061019960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53894;

    public Item_getGameIndices_142061019960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53894 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term53894, term53894.getClass(), "id", null);
        setField(term53894, term53894.getClass(), "name", null);
        setField(term53894, term53894.getClass(), "cost", null);
        setField(term53894, term53894.getClass(), "flingPower", null);
        setField(term53894, term53894.getClass(), "flingEffect", null);
        setField(term53894, term53894.getClass(), "attributes", null);
        setField(term53894, term53894.getClass(), "category", null);
        setField(term53894, term53894.getClass(), "effectEntries", null);
        setField(term53894, term53894.getClass(), "flavorTextEntries", null);
        setField(term53894, term53894.getClass(), "gameIndices", null);
        setField(term53894, term53894.getClass(), "names", null);
        setField(term53894, term53894.getClass(), "sprites", null);
        setField(term53894, term53894.getClass(), "heldByPokemon", null);
        setField(term53894, term53894.getClass(), "babyTriggerFor", null);
        setField(term53894, term53894.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameIndices", argTypes, term53894, args);
    }

};


