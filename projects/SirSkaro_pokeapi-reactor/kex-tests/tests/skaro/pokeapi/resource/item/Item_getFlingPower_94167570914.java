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

public class Item_getFlingPower_94167570914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1680;

    public Item_getFlingPower_94167570914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1680 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term1680, term1680.getClass(), "id", null);
        setField(term1680, term1680.getClass(), "name", null);
        setField(term1680, term1680.getClass(), "cost", null);
        setField(term1680, term1680.getClass(), "flingPower", null);
        setField(term1680, term1680.getClass(), "flingEffect", null);
        setField(term1680, term1680.getClass(), "attributes", null);
        setField(term1680, term1680.getClass(), "category", null);
        setField(term1680, term1680.getClass(), "effectEntries", null);
        setField(term1680, term1680.getClass(), "flavorTextEntries", null);
        setField(term1680, term1680.getClass(), "gameIndices", null);
        setField(term1680, term1680.getClass(), "names", null);
        setField(term1680, term1680.getClass(), "sprites", null);
        setField(term1680, term1680.getClass(), "heldByPokemon", null);
        setField(term1680, term1680.getClass(), "babyTriggerFor", null);
        setField(term1680, term1680.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlingPower", argTypes, term1680, args);
    }

};


