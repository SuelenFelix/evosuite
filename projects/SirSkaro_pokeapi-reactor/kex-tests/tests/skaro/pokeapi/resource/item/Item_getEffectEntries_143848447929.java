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

public class Item_getEffectEntries_143848447929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3563;

    public Item_getEffectEntries_143848447929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3563 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term3563, term3563.getClass(), "id", null);
        setField(term3563, term3563.getClass(), "name", null);
        setField(term3563, term3563.getClass(), "cost", null);
        setField(term3563, term3563.getClass(), "flingPower", null);
        setField(term3563, term3563.getClass(), "flingEffect", null);
        setField(term3563, term3563.getClass(), "attributes", null);
        setField(term3563, term3563.getClass(), "category", null);
        setField(term3563, term3563.getClass(), "effectEntries", null);
        setField(term3563, term3563.getClass(), "flavorTextEntries", null);
        setField(term3563, term3563.getClass(), "gameIndices", null);
        setField(term3563, term3563.getClass(), "names", null);
        setField(term3563, term3563.getClass(), "sprites", null);
        setField(term3563, term3563.getClass(), "heldByPokemon", null);
        setField(term3563, term3563.getClass(), "babyTriggerFor", null);
        setField(term3563, term3563.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectEntries", argTypes, term3563, args);
    }

};


