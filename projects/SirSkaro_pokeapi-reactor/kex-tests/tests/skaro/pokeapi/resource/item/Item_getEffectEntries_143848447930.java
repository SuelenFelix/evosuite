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

public class Item_getEffectEntries_143848447930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50985;

    public Item_getEffectEntries_143848447930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50985 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term50985, term50985.getClass(), "id", null);
        setField(term50985, term50985.getClass(), "name", null);
        setField(term50985, term50985.getClass(), "cost", null);
        setField(term50985, term50985.getClass(), "flingPower", null);
        setField(term50985, term50985.getClass(), "flingEffect", null);
        setField(term50985, term50985.getClass(), "attributes", null);
        setField(term50985, term50985.getClass(), "category", null);
        setField(term50985, term50985.getClass(), "effectEntries", null);
        setField(term50985, term50985.getClass(), "flavorTextEntries", null);
        setField(term50985, term50985.getClass(), "gameIndices", null);
        setField(term50985, term50985.getClass(), "names", null);
        setField(term50985, term50985.getClass(), "sprites", null);
        setField(term50985, term50985.getClass(), "heldByPokemon", null);
        setField(term50985, term50985.getClass(), "babyTriggerFor", null);
        setField(term50985, term50985.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectEntries", argTypes, term50985, args);
    }

};


