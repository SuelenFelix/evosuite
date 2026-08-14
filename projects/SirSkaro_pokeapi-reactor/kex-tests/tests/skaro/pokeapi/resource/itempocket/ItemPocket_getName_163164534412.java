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

public class ItemPocket_getName_163164534412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396;

    public ItemPocket_getName_163164534412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term396 = newInstance(Class.forName("skaro.pokeapi.resource.itempocket.ItemPocket"));
        setField(term396, term396.getClass(), "id", null);
        setField(term396, term396.getClass(), "name", null);
        setField(term396, term396.getClass(), "categories", null);
        setField(term396, term396.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itempocket.ItemPocket");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term396, args);
    }

};


