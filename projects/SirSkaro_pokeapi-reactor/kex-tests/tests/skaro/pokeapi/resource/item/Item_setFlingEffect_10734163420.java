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

public class Item_setFlingEffect_10734163420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2386;

    public Item_setFlingEffect_10734163420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2386 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term2386, term2386.getClass(), "id", null);
        setField(term2386, term2386.getClass(), "name", null);
        setField(term2386, term2386.getClass(), "cost", null);
        setField(term2386, term2386.getClass(), "flingPower", null);
        setField(term2386, term2386.getClass(), "flingEffect", null);
        setField(term2386, term2386.getClass(), "attributes", null);
        setField(term2386, term2386.getClass(), "category", null);
        setField(term2386, term2386.getClass(), "effectEntries", null);
        setField(term2386, term2386.getClass(), "flavorTextEntries", null);
        setField(term2386, term2386.getClass(), "gameIndices", null);
        setField(term2386, term2386.getClass(), "names", null);
        setField(term2386, term2386.getClass(), "sprites", null);
        setField(term2386, term2386.getClass(), "heldByPokemon", null);
        setField(term2386, term2386.getClass(), "babyTriggerFor", null);
        setField(term2386, term2386.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFlingEffect", argTypes, term2386, args);
    }

};


