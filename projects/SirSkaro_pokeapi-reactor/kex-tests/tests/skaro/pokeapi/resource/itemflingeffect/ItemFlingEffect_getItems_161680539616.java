package skaro.pokeapi.resource.itemflingeffect;

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
import static skaro.pokeapi.resource.itemflingeffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ItemFlingEffect_getItems_161680539616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382;

    public ItemFlingEffect_getItems_161680539616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term382 = newInstance(Class.forName("skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect"));
        setField(term382, term382.getClass(), "id", null);
        setField(term382, term382.getClass(), "name", null);
        setField(term382, term382.getClass(), "effectEntries", null);
        setField(term382, term382.getClass(), "items", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItems", argTypes, term382, args);
    }

};


