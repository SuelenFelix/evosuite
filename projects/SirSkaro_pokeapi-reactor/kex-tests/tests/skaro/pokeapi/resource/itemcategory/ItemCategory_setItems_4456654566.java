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

public class ItemCategory_setItems_4456654566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478;
     Object term541;

    public ItemCategory_setItems_4456654566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term479 = new Integer(-1955890973);
        ArrayList term493 = new ArrayList();
        Object term499 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term501 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term499, term499.getClass(), "name", "");
        setField(term501, term501.getClass(), "name", null);
        setField(term501, term501.getClass(), "url", null);
        setField(term499, term499.getClass(), "language", term501);
        Object term502 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term504 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term502, term502.getClass(), "name", "");
        setField(term504, term504.getClass(), "name", null);
        setField(term504, term504.getClass(), "url", null);
        setField(term502, term502.getClass(), "language", term504);
        Object term505 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term507 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term505, term505.getClass(), "name", "");
        setField(term507, term507.getClass(), "name", null);
        setField(term507, term507.getClass(), "url", null);
        setField(term505, term505.getClass(), "language", term507);
        Object term508 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term510 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term508, term508.getClass(), "name", "");
        setField(term510, term510.getClass(), "name", null);
        setField(term510, term510.getClass(), "url", null);
        setField(term508, term508.getClass(), "language", term510);
        Object term511 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term513 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term511, term511.getClass(), "name", "");
        setField(term513, term513.getClass(), "name", null);
        setField(term513, term513.getClass(), "url", null);
        setField(term511, term511.getClass(), "language", term513);
        ArrayList term497 = new ArrayList();
        ((ArrayList) term497).add(term499);
        ((ArrayList) term497).add(term502);
        ((ArrayList) term497).add(term505);
        ((ArrayList) term497).add(term508);
        ((ArrayList) term497).add(term511);
        term478 = newInstance(Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory"));
        Object term516 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term478, term478.getClass(), "id", term479);
        setField(term478, term478.getClass(), "name", "wGmYcqUkgE");
        setField(term478, term478.getClass(), "items", term493);
        setField(term478, term478.getClass(), "names", term497);
        setField(term516, term516.getClass(), "name", "DfISiziTgG");
        setField(term516, term516.getClass(), "url", "XqgfKFvPSD");
        setField(term478, term478.getClass(), "pocket", term516);
        term541 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term541;
        callMethod(klass, "setItems", argTypes, term478, args);
    }

};


