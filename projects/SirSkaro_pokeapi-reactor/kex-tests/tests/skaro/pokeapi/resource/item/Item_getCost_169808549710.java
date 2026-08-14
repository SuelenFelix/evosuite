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

public class Item_getCost_169808549710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1207;

    public Item_getCost_169808549710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1207 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term1207, term1207.getClass(), "id", null);
        setField(term1207, term1207.getClass(), "name", null);
        setField(term1207, term1207.getClass(), "cost", null);
        setField(term1207, term1207.getClass(), "flingPower", null);
        setField(term1207, term1207.getClass(), "flingEffect", null);
        setField(term1207, term1207.getClass(), "attributes", null);
        setField(term1207, term1207.getClass(), "category", null);
        setField(term1207, term1207.getClass(), "effectEntries", null);
        setField(term1207, term1207.getClass(), "flavorTextEntries", null);
        setField(term1207, term1207.getClass(), "gameIndices", null);
        setField(term1207, term1207.getClass(), "names", null);
        setField(term1207, term1207.getClass(), "sprites", null);
        setField(term1207, term1207.getClass(), "heldByPokemon", null);
        setField(term1207, term1207.getClass(), "babyTriggerFor", null);
        setField(term1207, term1207.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCost", argTypes, term1207, args);
    }

};


