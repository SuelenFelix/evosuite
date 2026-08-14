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

public class Item_setGameIndices_530021939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4881;

    public Item_setGameIndices_530021939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4881 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term4881, term4881.getClass(), "id", null);
        setField(term4881, term4881.getClass(), "name", null);
        setField(term4881, term4881.getClass(), "cost", null);
        setField(term4881, term4881.getClass(), "flingPower", null);
        setField(term4881, term4881.getClass(), "flingEffect", null);
        setField(term4881, term4881.getClass(), "attributes", null);
        setField(term4881, term4881.getClass(), "category", null);
        setField(term4881, term4881.getClass(), "effectEntries", null);
        setField(term4881, term4881.getClass(), "flavorTextEntries", null);
        setField(term4881, term4881.getClass(), "gameIndices", null);
        setField(term4881, term4881.getClass(), "names", null);
        setField(term4881, term4881.getClass(), "sprites", null);
        setField(term4881, term4881.getClass(), "heldByPokemon", null);
        setField(term4881, term4881.getClass(), "babyTriggerFor", null);
        setField(term4881, term4881.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGameIndices", argTypes, term4881, args);
    }

};


