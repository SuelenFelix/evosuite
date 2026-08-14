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

public class ItemCategory_getItems_15069641945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397;

    public ItemCategory_getItems_15069641945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term398 = new Integer(-616727354);
        ArrayList term412 = new ArrayList();
        Object term418 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term420 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term418, term418.getClass(), "name", "");
        setField(term420, term420.getClass(), "name", null);
        setField(term420, term420.getClass(), "url", null);
        setField(term418, term418.getClass(), "language", term420);
        ArrayList term416 = new ArrayList();
        ((ArrayList) term416).add(term418);
        term397 = newInstance(Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory"));
        Object term423 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term397, term397.getClass(), "id", term398);
        setField(term397, term397.getClass(), "name", "KoyGrUJeJW");
        setField(term397, term397.getClass(), "items", term412);
        setField(term397, term397.getClass(), "names", term416);
        setField(term423, term423.getClass(), "name", "vQVyKLdtaz");
        setField(term423, term423.getClass(), "url", "OWKQODBLzb");
        setField(term397, term397.getClass(), "pocket", term423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItems", argTypes, term397, args);
    }

};


