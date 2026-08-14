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

public class Item_setCategory_61661765028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50748;

    public Item_setCategory_61661765028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50748 = newInstance(Class.forName("skaro.pokeapi.resource.item.Item"));
        setField(term50748, term50748.getClass(), "id", null);
        setField(term50748, term50748.getClass(), "name", null);
        setField(term50748, term50748.getClass(), "cost", null);
        setField(term50748, term50748.getClass(), "flingPower", null);
        setField(term50748, term50748.getClass(), "flingEffect", null);
        setField(term50748, term50748.getClass(), "attributes", null);
        setField(term50748, term50748.getClass(), "category", null);
        setField(term50748, term50748.getClass(), "effectEntries", null);
        setField(term50748, term50748.getClass(), "flavorTextEntries", null);
        setField(term50748, term50748.getClass(), "gameIndices", null);
        setField(term50748, term50748.getClass(), "names", null);
        setField(term50748, term50748.getClass(), "sprites", null);
        setField(term50748, term50748.getClass(), "heldByPokemon", null);
        setField(term50748, term50748.getClass(), "babyTriggerFor", null);
        setField(term50748, term50748.getClass(), "machines", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.item.Item");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCategory", argTypes, term50748, args);
    }

};


