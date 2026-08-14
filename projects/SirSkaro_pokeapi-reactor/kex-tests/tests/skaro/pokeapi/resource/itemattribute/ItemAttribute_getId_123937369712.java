package skaro.pokeapi.resource.itemattribute;

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
import static skaro.pokeapi.resource.itemattribute.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ItemAttribute_getId_123937369712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619;

    public ItemAttribute_getId_123937369712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term619 = newInstance(Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute"));
        setField(term619, term619.getClass(), "id", null);
        setField(term619, term619.getClass(), "name", null);
        setField(term619, term619.getClass(), "items", null);
        setField(term619, term619.getClass(), "names", null);
        setField(term619, term619.getClass(), "descriptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term619, args);
    }

};


