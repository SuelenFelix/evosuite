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

public class Item_getName_14229685766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term707;

    public Item_getName_14229685766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term707 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term707, term707.getClass(), "id", null);
        setField(term707, term707.getClass(), "name", null);
        setField(term707, term707.getClass(), "cost", null);
        setField(term707, term707.getClass(), "flingPower", null);
        setField(term707, term707.getClass(), "flingEffect", null);
        setField(term707, term707.getClass(), "attributes", null);
        setField(term707, term707.getClass(), "category", null);
        setField(term707, term707.getClass(), "effectEntries", null);
        setField(term707, term707.getClass(), "flavorTextEntries", null);
        setField(term707, term707.getClass(), "gameIndices", null);
        setField(term707, term707.getClass(), "names", null);
        setField(term707, term707.getClass(), "sprites", null);
        setField(term707, term707.getClass(), "heldByPokemon", null);
        setField(term707, term707.getClass(), "babyTriggerFor", null);
        setField(term707, term707.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term707, args);
    }

};


