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

public class Item_setCategory_61661765060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7240;

    public Item_setCategory_61661765060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7240 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term7240, term7240.getClass(), "id", null);
        setField(term7240, term7240.getClass(), "name", null);
        setField(term7240, term7240.getClass(), "cost", null);
        setField(term7240, term7240.getClass(), "flingPower", null);
        setField(term7240, term7240.getClass(), "flingEffect", null);
        setField(term7240, term7240.getClass(), "attributes", null);
        setField(term7240, term7240.getClass(), "category", null);
        setField(term7240, term7240.getClass(), "effectEntries", null);
        setField(term7240, term7240.getClass(), "flavorTextEntries", null);
        setField(term7240, term7240.getClass(), "gameIndices", null);
        setField(term7240, term7240.getClass(), "names", null);
        setField(term7240, term7240.getClass(), "sprites", null);
        setField(term7240, term7240.getClass(), "heldByPokemon", null);
        setField(term7240, term7240.getClass(), "babyTriggerFor", null);
        setField(term7240, term7240.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCategory", argTypes, term7240, args);
    }

};


