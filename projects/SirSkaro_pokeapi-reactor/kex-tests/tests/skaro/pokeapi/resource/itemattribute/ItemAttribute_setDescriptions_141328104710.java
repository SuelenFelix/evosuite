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

public class ItemAttribute_setDescriptions_141328104710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555;
     Object term606;

    public ItemAttribute_setDescriptions_141328104710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term556 = new Integer(1725571209);
        ArrayList term570 = new ArrayList();
        Object term576 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term578 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term576, term576.getClass(), "name", "");
        setField(term578, term578.getClass(), "name", null);
        setField(term578, term578.getClass(), "url", null);
        setField(term576, term576.getClass(), "language", term578);
        Object term579 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term581 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term579, term579.getClass(), "name", "");
        setField(term581, term581.getClass(), "name", null);
        setField(term581, term581.getClass(), "url", null);
        setField(term579, term579.getClass(), "language", term581);
        ArrayList term574 = new ArrayList();
        ((ArrayList) term574).add(term576);
        ((ArrayList) term574).add(term579);
        Object term586 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term588 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term586, term586.getClass(), "description", "");
        setField(term588, term588.getClass(), "name", null);
        setField(term588, term588.getClass(), "url", null);
        setField(term586, term586.getClass(), "language", term588);
        Object term589 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term591 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term589, term589.getClass(), "description", "");
        setField(term591, term591.getClass(), "name", null);
        setField(term591, term591.getClass(), "url", null);
        setField(term589, term589.getClass(), "language", term591);
        Object term592 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term594 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term592, term592.getClass(), "description", "");
        setField(term594, term594.getClass(), "name", null);
        setField(term594, term594.getClass(), "url", null);
        setField(term592, term592.getClass(), "language", term594);
        Object term595 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term597 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term595, term595.getClass(), "description", "");
        setField(term597, term597.getClass(), "name", null);
        setField(term597, term597.getClass(), "url", null);
        setField(term595, term595.getClass(), "language", term597);
        Object term598 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term600 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term598, term598.getClass(), "description", "");
        setField(term600, term600.getClass(), "name", null);
        setField(term600, term600.getClass(), "url", null);
        setField(term598, term598.getClass(), "language", term600);
        Object term601 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term603 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term601, term601.getClass(), "description", "");
        setField(term603, term603.getClass(), "name", null);
        setField(term603, term603.getClass(), "url", null);
        setField(term601, term601.getClass(), "language", term603);
        ArrayList term584 = new ArrayList();
        ((ArrayList) term584).add(term586);
        ((ArrayList) term584).add(term589);
        ((ArrayList) term584).add(term592);
        ((ArrayList) term584).add(term595);
        ((ArrayList) term584).add(term598);
        ((ArrayList) term584).add(term601);
        term555 = newInstance(Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute"));
        setField(term555, term555.getClass(), "id", term556);
        setField(term555, term555.getClass(), "name", "kGMQdqJYyB");
        setField(term555, term555.getClass(), "items", term570);
        setField(term555, term555.getClass(), "names", term574);
        setField(term555, term555.getClass(), "descriptions", term584);
        term606 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term606;
        callMethod(klass, "setDescriptions", argTypes, term555, args);
    }

};


