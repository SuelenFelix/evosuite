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

public class Item_setCost_134346098112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1473;

    public Item_setCost_134346098112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1473 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term1473, term1473.getClass(), "id", null);
        setField(term1473, term1473.getClass(), "name", null);
        setField(term1473, term1473.getClass(), "cost", null);
        setField(term1473, term1473.getClass(), "flingPower", null);
        setField(term1473, term1473.getClass(), "flingEffect", null);
        setField(term1473, term1473.getClass(), "attributes", null);
        setField(term1473, term1473.getClass(), "category", null);
        setField(term1473, term1473.getClass(), "effectEntries", null);
        setField(term1473, term1473.getClass(), "flavorTextEntries", null);
        setField(term1473, term1473.getClass(), "gameIndices", null);
        setField(term1473, term1473.getClass(), "names", null);
        setField(term1473, term1473.getClass(), "sprites", null);
        setField(term1473, term1473.getClass(), "heldByPokemon", null);
        setField(term1473, term1473.getClass(), "babyTriggerFor", null);
        setField(term1473, term1473.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCost", argTypes, term1473, args);
    }

};


