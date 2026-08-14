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

public class ItemAttribute_setName_209279039615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622;

    public ItemAttribute_setName_209279039615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622 = newInstance(Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute"));
        setField(term622, term622.getClass(), "id", null);
        setField(term622, term622.getClass(), "name", null);
        setField(term622, term622.getClass(), "items", null);
        setField(term622, term622.getClass(), "names", null);
        setField(term622, term622.getClass(), "descriptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term622, args);
    }

};


