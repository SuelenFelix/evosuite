package skaro.pokeapi.resource.itemcategory;

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
import static skaro.pokeapi.resource.itemcategory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ItemCategory_setPocket_204385879921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term994;

    public ItemCategory_setPocket_204385879921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term994 = newInstance(Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory"));
        setField(term994, term994.getClass(), "id", null);
        setField(term994, term994.getClass(), "name", null);
        setField(term994, term994.getClass(), "items", null);
        setField(term994, term994.getClass(), "names", null);
        setField(term994, term994.getClass(), "pocket", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPocket", argTypes, term994, args);
    }

};


