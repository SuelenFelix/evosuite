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

public class Item_getMachines_62726713061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53895;

    public Item_getMachines_62726713061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53895 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term53895, term53895.getClass(), "id", null);
        setField(term53895, term53895.getClass(), "name", null);
        setField(term53895, term53895.getClass(), "cost", null);
        setField(term53895, term53895.getClass(), "flingPower", null);
        setField(term53895, term53895.getClass(), "flingEffect", null);
        setField(term53895, term53895.getClass(), "attributes", null);
        setField(term53895, term53895.getClass(), "category", null);
        setField(term53895, term53895.getClass(), "effectEntries", null);
        setField(term53895, term53895.getClass(), "flavorTextEntries", null);
        setField(term53895, term53895.getClass(), "gameIndices", null);
        setField(term53895, term53895.getClass(), "names", null);
        setField(term53895, term53895.getClass(), "sprites", null);
        setField(term53895, term53895.getClass(), "heldByPokemon", null);
        setField(term53895, term53895.getClass(), "babyTriggerFor", null);
        setField(term53895, term53895.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMachines", argTypes, term53895, args);
    }

};


