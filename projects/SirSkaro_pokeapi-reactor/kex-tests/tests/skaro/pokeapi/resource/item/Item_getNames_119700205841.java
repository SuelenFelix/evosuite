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

public class Item_getNames_119700205841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5082;

    public Item_getNames_119700205841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5082 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term5082, term5082.getClass(), "id", null);
        setField(term5082, term5082.getClass(), "name", null);
        setField(term5082, term5082.getClass(), "cost", null);
        setField(term5082, term5082.getClass(), "flingPower", null);
        setField(term5082, term5082.getClass(), "flingEffect", null);
        setField(term5082, term5082.getClass(), "attributes", null);
        setField(term5082, term5082.getClass(), "category", null);
        setField(term5082, term5082.getClass(), "effectEntries", null);
        setField(term5082, term5082.getClass(), "flavorTextEntries", null);
        setField(term5082, term5082.getClass(), "gameIndices", null);
        setField(term5082, term5082.getClass(), "names", null);
        setField(term5082, term5082.getClass(), "sprites", null);
        setField(term5082, term5082.getClass(), "heldByPokemon", null);
        setField(term5082, term5082.getClass(), "babyTriggerFor", null);
        setField(term5082, term5082.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term5082, args);
    }

};


