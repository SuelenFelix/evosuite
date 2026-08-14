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

public class ItemCategory_getName_13386777923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;

    public ItemCategory_getName_13386777923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term184 = new Integer(391863371);
        ArrayList term198 = new ArrayList();
        Object term204 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term206 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term204, term204.getClass(), "name", "");
        setField(term206, term206.getClass(), "name", null);
        setField(term206, term206.getClass(), "url", null);
        setField(term204, term204.getClass(), "language", term206);
        Object term207 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term209 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term207, term207.getClass(), "name", "");
        setField(term209, term209.getClass(), "name", null);
        setField(term209, term209.getClass(), "url", null);
        setField(term207, term207.getClass(), "language", term209);
        Object term210 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term212 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term210, term210.getClass(), "name", "");
        setField(term212, term212.getClass(), "name", null);
        setField(term212, term212.getClass(), "url", null);
        setField(term210, term210.getClass(), "language", term212);
        Object term213 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term215 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term213, term213.getClass(), "name", "");
        setField(term215, term215.getClass(), "name", null);
        setField(term215, term215.getClass(), "url", null);
        setField(term213, term213.getClass(), "language", term215);
        Object term216 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term218 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term216, term216.getClass(), "name", "");
        setField(term218, term218.getClass(), "name", null);
        setField(term218, term218.getClass(), "url", null);
        setField(term216, term216.getClass(), "language", term218);
        Object term219 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term221 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term219, term219.getClass(), "name", "");
        setField(term221, term221.getClass(), "name", null);
        setField(term221, term221.getClass(), "url", null);
        setField(term219, term219.getClass(), "language", term221);
        ArrayList term202 = new ArrayList();
        ((ArrayList) term202).add(term204);
        ((ArrayList) term202).add(term207);
        ((ArrayList) term202).add(term210);
        ((ArrayList) term202).add(term213);
        ((ArrayList) term202).add(term216);
        ((ArrayList) term202).add(term219);
        term183 = newInstance(Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory"));
        Object term224 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term183, term183.getClass(), "id", term184);
        setField(term183, term183.getClass(), "name", "OWDIEULEFu");
        setField(term183, term183.getClass(), "items", term198);
        setField(term183, term183.getClass(), "names", term202);
        setField(term224, term224.getClass(), "name", "jDtqGUpnZN");
        setField(term224, term224.getClass(), "url", "nGKItKLYNC");
        setField(term183, term183.getClass(), "pocket", term224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term183, args);
    }

};


