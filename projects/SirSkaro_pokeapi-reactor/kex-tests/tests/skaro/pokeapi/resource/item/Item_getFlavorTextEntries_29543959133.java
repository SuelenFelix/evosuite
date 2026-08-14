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

public class Item_getFlavorTextEntries_29543959133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4128;

    public Item_getFlavorTextEntries_29543959133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4128 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term4128, term4128.getClass(), "id", null);
        setField(term4128, term4128.getClass(), "name", null);
        setField(term4128, term4128.getClass(), "cost", null);
        setField(term4128, term4128.getClass(), "flingPower", null);
        setField(term4128, term4128.getClass(), "flingEffect", null);
        setField(term4128, term4128.getClass(), "attributes", null);
        setField(term4128, term4128.getClass(), "category", null);
        setField(term4128, term4128.getClass(), "effectEntries", null);
        setField(term4128, term4128.getClass(), "flavorTextEntries", null);
        setField(term4128, term4128.getClass(), "gameIndices", null);
        setField(term4128, term4128.getClass(), "names", null);
        setField(term4128, term4128.getClass(), "sprites", null);
        setField(term4128, term4128.getClass(), "heldByPokemon", null);
        setField(term4128, term4128.getClass(), "babyTriggerFor", null);
        setField(term4128, term4128.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlavorTextEntries", argTypes, term4128, args);
    }

};


