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

public class Item_setHeldByPokemon_48797016750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6292;

    public Item_setHeldByPokemon_48797016750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6292 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term6292, term6292.getClass(), "id", null);
        setField(term6292, term6292.getClass(), "name", null);
        setField(term6292, term6292.getClass(), "cost", null);
        setField(term6292, term6292.getClass(), "flingPower", null);
        setField(term6292, term6292.getClass(), "flingEffect", null);
        setField(term6292, term6292.getClass(), "attributes", null);
        setField(term6292, term6292.getClass(), "category", null);
        setField(term6292, term6292.getClass(), "effectEntries", null);
        setField(term6292, term6292.getClass(), "flavorTextEntries", null);
        setField(term6292, term6292.getClass(), "gameIndices", null);
        setField(term6292, term6292.getClass(), "names", null);
        setField(term6292, term6292.getClass(), "sprites", null);
        setField(term6292, term6292.getClass(), "heldByPokemon", null);
        setField(term6292, term6292.getClass(), "babyTriggerFor", null);
        setField(term6292, term6292.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHeldByPokemon", argTypes, term6292, args);
    }

};


