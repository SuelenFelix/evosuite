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

public class Item_setMachines_180693075258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7239;

    public Item_setMachines_180693075258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7239 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term7239, term7239.getClass(), "id", null);
        setField(term7239, term7239.getClass(), "name", null);
        setField(term7239, term7239.getClass(), "cost", null);
        setField(term7239, term7239.getClass(), "flingPower", null);
        setField(term7239, term7239.getClass(), "flingEffect", null);
        setField(term7239, term7239.getClass(), "attributes", null);
        setField(term7239, term7239.getClass(), "category", null);
        setField(term7239, term7239.getClass(), "effectEntries", null);
        setField(term7239, term7239.getClass(), "flavorTextEntries", null);
        setField(term7239, term7239.getClass(), "gameIndices", null);
        setField(term7239, term7239.getClass(), "names", null);
        setField(term7239, term7239.getClass(), "sprites", null);
        setField(term7239, term7239.getClass(), "heldByPokemon", null);
        setField(term7239, term7239.getClass(), "babyTriggerFor", null);
        setField(term7239, term7239.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMachines", argTypes, term7239, args);
    }

};


