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

public class Item_getFlingEffect_153149239418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2139;

    public Item_getFlingEffect_153149239418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2139 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term2139, term2139.getClass(), "id", null);
        setField(term2139, term2139.getClass(), "name", null);
        setField(term2139, term2139.getClass(), "cost", null);
        setField(term2139, term2139.getClass(), "flingPower", null);
        setField(term2139, term2139.getClass(), "flingEffect", null);
        setField(term2139, term2139.getClass(), "attributes", null);
        setField(term2139, term2139.getClass(), "category", null);
        setField(term2139, term2139.getClass(), "effectEntries", null);
        setField(term2139, term2139.getClass(), "flavorTextEntries", null);
        setField(term2139, term2139.getClass(), "gameIndices", null);
        setField(term2139, term2139.getClass(), "names", null);
        setField(term2139, term2139.getClass(), "sprites", null);
        setField(term2139, term2139.getClass(), "heldByPokemon", null);
        setField(term2139, term2139.getClass(), "babyTriggerFor", null);
        setField(term2139, term2139.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlingEffect", argTypes, term2139, args);
    }

};


