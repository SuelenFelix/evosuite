package skaro.pokeapi.resource.itempocket;

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
import static skaro.pokeapi.resource.itempocket.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ItemPocket_setNames_54695082417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401;

    public ItemPocket_setNames_54695082417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term401 = newInstance(Class.forName("skaro.pokeapi.resource.itempocket.ItemPocket"));
        setField(term401, term401.getClass(), "id", null);
        setField(term401, term401.getClass(), "name", null);
        setField(term401, term401.getClass(), "categories", null);
        setField(term401, term401.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itempocket.ItemPocket");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNames", argTypes, term401, args);
    }

};


