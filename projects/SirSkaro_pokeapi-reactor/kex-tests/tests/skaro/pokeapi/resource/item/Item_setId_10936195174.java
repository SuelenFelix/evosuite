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

public class Item_setId_10936195174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472;

    public Item_setId_10936195174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term472 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term472, term472.getClass(), "id", null);
        setField(term472, term472.getClass(), "name", null);
        setField(term472, term472.getClass(), "cost", null);
        setField(term472, term472.getClass(), "flingPower", null);
        setField(term472, term472.getClass(), "flingEffect", null);
        setField(term472, term472.getClass(), "attributes", null);
        setField(term472, term472.getClass(), "category", null);
        setField(term472, term472.getClass(), "effectEntries", null);
        setField(term472, term472.getClass(), "flavorTextEntries", null);
        setField(term472, term472.getClass(), "gameIndices", null);
        setField(term472, term472.getClass(), "names", null);
        setField(term472, term472.getClass(), "sprites", null);
        setField(term472, term472.getClass(), "heldByPokemon", null);
        setField(term472, term472.getClass(), "babyTriggerFor", null);
        setField(term472, term472.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term472, args);
    }

};


