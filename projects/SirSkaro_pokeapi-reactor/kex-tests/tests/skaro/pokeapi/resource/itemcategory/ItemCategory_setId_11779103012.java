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

public class ItemCategory_setId_11779103012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;
     Object term151;

    public ItemCategory_setId_11779103012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term92 = new Integer(1162663216);
        ArrayList term106 = new ArrayList();
        Object term112 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term114 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term112, term112.getClass(), "name", "");
        setField(term114, term114.getClass(), "name", null);
        setField(term114, term114.getClass(), "url", null);
        setField(term112, term112.getClass(), "language", term114);
        Object term115 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term117 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term115, term115.getClass(), "name", "");
        setField(term117, term117.getClass(), "name", null);
        setField(term117, term117.getClass(), "url", null);
        setField(term115, term115.getClass(), "language", term117);
        Object term118 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term120 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term118, term118.getClass(), "name", "");
        setField(term120, term120.getClass(), "name", null);
        setField(term120, term120.getClass(), "url", null);
        setField(term118, term118.getClass(), "language", term120);
        Object term121 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term123 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term121, term121.getClass(), "name", "");
        setField(term123, term123.getClass(), "name", null);
        setField(term123, term123.getClass(), "url", null);
        setField(term121, term121.getClass(), "language", term123);
        ArrayList term110 = new ArrayList();
        ((ArrayList) term110).add(term112);
        ((ArrayList) term110).add(term115);
        ((ArrayList) term110).add(term118);
        ((ArrayList) term110).add(term121);
        term91 = newInstance(Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory"));
        Object term126 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term91, term91.getClass(), "id", term92);
        setField(term91, term91.getClass(), "name", "aJlieCFVtF");
        setField(term91, term91.getClass(), "items", term106);
        setField(term91, term91.getClass(), "names", term110);
        setField(term126, term126.getClass(), "name", "IoAlmYsBwc");
        setField(term126, term126.getClass(), "url", "TEParAifyi");
        setField(term91, term91.getClass(), "pocket", term126);
        term151 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term151;
        callMethod(klass, "setId", argTypes, term91, args);
    }

};


