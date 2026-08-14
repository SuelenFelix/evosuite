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

public class Item_setBabyTriggerFor_201654191554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6758;

    public Item_setBabyTriggerFor_201654191554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6758 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term6758, term6758.getClass(), "id", null);
        setField(term6758, term6758.getClass(), "name", null);
        setField(term6758, term6758.getClass(), "cost", null);
        setField(term6758, term6758.getClass(), "flingPower", null);
        setField(term6758, term6758.getClass(), "flingEffect", null);
        setField(term6758, term6758.getClass(), "attributes", null);
        setField(term6758, term6758.getClass(), "category", null);
        setField(term6758, term6758.getClass(), "effectEntries", null);
        setField(term6758, term6758.getClass(), "flavorTextEntries", null);
        setField(term6758, term6758.getClass(), "gameIndices", null);
        setField(term6758, term6758.getClass(), "names", null);
        setField(term6758, term6758.getClass(), "sprites", null);
        setField(term6758, term6758.getClass(), "heldByPokemon", null);
        setField(term6758, term6758.getClass(), "babyTriggerFor", null);
        setField(term6758, term6758.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.ApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBabyTriggerFor", argTypes, term6758, args);
    }

};


