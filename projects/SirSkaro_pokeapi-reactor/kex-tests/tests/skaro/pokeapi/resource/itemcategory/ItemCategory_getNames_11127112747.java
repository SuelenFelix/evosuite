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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ItemCategory_getNames_11127112747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574;

    public ItemCategory_getNames_11127112747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term575 = new Integer(-2038273078);
        ArrayList term589 = new ArrayList();
        ArrayList term593 = new ArrayList();
        term574 = newInstance(Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory"));
        Object term597 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term574, term574.getClass(), "id", term575);
        setField(term574, term574.getClass(), "name", "JiVRgTZvKc");
        setField(term574, term574.getClass(), "items", term589);
        setField(term574, term574.getClass(), "names", term593);
        setField(term597, term597.getClass(), "name", "XPKmummaqg");
        setField(term597, term597.getClass(), "url", "BKLfkLiZTH");
        setField(term574, term574.getClass(), "pocket", term597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term574, args);
    }

};


