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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class ItemAttribute_setNames_16962958368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433;
     Object term481;

    public ItemAttribute_setNames_16962958368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term434 = new Integer(1227103734);
        ArrayList term448 = new ArrayList();
        Object term454 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term456 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term454, term454.getClass(), "name", "");
        setField(term456, term456.getClass(), "name", null);
        setField(term456, term456.getClass(), "url", null);
        setField(term454, term454.getClass(), "language", term456);
        Object term457 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term459 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term457, term457.getClass(), "name", "");
        setField(term459, term459.getClass(), "name", null);
        setField(term459, term459.getClass(), "url", null);
        setField(term457, term457.getClass(), "language", term459);
        Object term460 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term462 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term460, term460.getClass(), "name", "");
        setField(term462, term462.getClass(), "name", null);
        setField(term462, term462.getClass(), "url", null);
        setField(term460, term460.getClass(), "language", term462);
        Object term463 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term465 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term463, term463.getClass(), "name", "");
        setField(term465, term465.getClass(), "name", null);
        setField(term465, term465.getClass(), "url", null);
        setField(term463, term463.getClass(), "language", term465);
        Object term466 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term468 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term466, term466.getClass(), "name", "");
        setField(term468, term468.getClass(), "name", null);
        setField(term468, term468.getClass(), "url", null);
        setField(term466, term466.getClass(), "language", term468);
        Object term469 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term471 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term469, term469.getClass(), "name", "");
        setField(term471, term471.getClass(), "name", null);
        setField(term471, term471.getClass(), "url", null);
        setField(term469, term469.getClass(), "language", term471);
        ArrayList term452 = new ArrayList();
        ((ArrayList) term452).add(term454);
        ((ArrayList) term452).add(term457);
        ((ArrayList) term452).add(term460);
        ((ArrayList) term452).add(term463);
        ((ArrayList) term452).add(term466);
        ((ArrayList) term452).add(term469);
        Object term476 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term478 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term476, term476.getClass(), "description", "");
        setField(term478, term478.getClass(), "name", null);
        setField(term478, term478.getClass(), "url", null);
        setField(term476, term476.getClass(), "language", term478);
        ArrayList term474 = new ArrayList();
        ((ArrayList) term474).add(term476);
        term433 = newInstance(Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute"));
        setField(term433, term433.getClass(), "id", term434);
        setField(term433, term433.getClass(), "name", "jwsfVjMoJT");
        setField(term433, term433.getClass(), "items", term448);
        setField(term433, term433.getClass(), "names", term452);
        setField(term433, term433.getClass(), "descriptions", term474);
        term481 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term481;
        callMethod(klass, "setNames", argTypes, term433, args);
    }

};


