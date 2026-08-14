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
import java.util.LinkedList;

public class ItemCategory_setNames_8399183768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652;
     Object term721;

    public ItemCategory_setNames_8399183768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term653 = new Integer(1227103734);
        ArrayList term667 = new ArrayList();
        Object term673 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term675 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term673, term673.getClass(), "name", "");
        setField(term675, term675.getClass(), "name", null);
        setField(term675, term675.getClass(), "url", null);
        setField(term673, term673.getClass(), "language", term675);
        Object term676 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term678 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term676, term676.getClass(), "name", "");
        setField(term678, term678.getClass(), "name", null);
        setField(term678, term678.getClass(), "url", null);
        setField(term676, term676.getClass(), "language", term678);
        Object term679 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term681 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term679, term679.getClass(), "name", "");
        setField(term681, term681.getClass(), "name", null);
        setField(term681, term681.getClass(), "url", null);
        setField(term679, term679.getClass(), "language", term681);
        Object term682 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term684 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term682, term682.getClass(), "name", "");
        setField(term684, term684.getClass(), "name", null);
        setField(term684, term684.getClass(), "url", null);
        setField(term682, term682.getClass(), "language", term684);
        Object term685 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term687 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term685, term685.getClass(), "name", "");
        setField(term687, term687.getClass(), "name", null);
        setField(term687, term687.getClass(), "url", null);
        setField(term685, term685.getClass(), "language", term687);
        Object term688 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term690 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term688, term688.getClass(), "name", "");
        setField(term690, term690.getClass(), "name", null);
        setField(term690, term690.getClass(), "url", null);
        setField(term688, term688.getClass(), "language", term690);
        Object term691 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term693 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term691, term691.getClass(), "name", "");
        setField(term693, term693.getClass(), "name", null);
        setField(term693, term693.getClass(), "url", null);
        setField(term691, term691.getClass(), "language", term693);
        ArrayList term671 = new ArrayList();
        ((ArrayList) term671).add(term673);
        ((ArrayList) term671).add(term676);
        ((ArrayList) term671).add(term679);
        ((ArrayList) term671).add(term682);
        ((ArrayList) term671).add(term685);
        ((ArrayList) term671).add(term688);
        ((ArrayList) term671).add(term691);
        term652 = newInstance(Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory"));
        Object term696 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term652, term652.getClass(), "id", term653);
        setField(term652, term652.getClass(), "name", "SPpkrGcPRr");
        setField(term652, term652.getClass(), "items", term667);
        setField(term652, term652.getClass(), "names", term671);
        setField(term696, term696.getClass(), "name", "WzMEhMXkKx");
        setField(term696, term696.getClass(), "url", "XOiDvlDhdc");
        setField(term652, term652.getClass(), "pocket", term696);
        term721 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term721;
        callMethod(klass, "setNames", argTypes, term652, args);
    }

};


