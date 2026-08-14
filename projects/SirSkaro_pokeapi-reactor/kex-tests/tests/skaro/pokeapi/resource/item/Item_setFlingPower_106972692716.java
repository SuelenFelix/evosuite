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

public class Item_setFlingPower_106972692716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920;

    public Item_setFlingPower_106972692716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1920 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term1920, term1920.getClass(), "id", null);
        setField(term1920, term1920.getClass(), "name", null);
        setField(term1920, term1920.getClass(), "cost", null);
        setField(term1920, term1920.getClass(), "flingPower", null);
        setField(term1920, term1920.getClass(), "flingEffect", null);
        setField(term1920, term1920.getClass(), "attributes", null);
        setField(term1920, term1920.getClass(), "category", null);
        setField(term1920, term1920.getClass(), "effectEntries", null);
        setField(term1920, term1920.getClass(), "flavorTextEntries", null);
        setField(term1920, term1920.getClass(), "gameIndices", null);
        setField(term1920, term1920.getClass(), "names", null);
        setField(term1920, term1920.getClass(), "sprites", null);
        setField(term1920, term1920.getClass(), "heldByPokemon", null);
        setField(term1920, term1920.getClass(), "babyTriggerFor", null);
        setField(term1920, term1920.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFlingPower", argTypes, term1920, args);
    }

};


