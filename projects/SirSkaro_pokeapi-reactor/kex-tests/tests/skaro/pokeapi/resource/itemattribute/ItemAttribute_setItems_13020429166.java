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

public class ItemAttribute_setItems_13020429166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335;
     Object term368;

    public ItemAttribute_setItems_13020429166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term336 = new Integer(-1955890973);
        ArrayList term350 = new ArrayList();
        ArrayList term354 = new ArrayList();
        Object term360 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term362 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term360, term360.getClass(), "description", "");
        setField(term362, term362.getClass(), "name", null);
        setField(term362, term362.getClass(), "url", null);
        setField(term360, term360.getClass(), "language", term362);
        Object term363 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term365 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term363, term363.getClass(), "description", "");
        setField(term365, term365.getClass(), "name", null);
        setField(term365, term365.getClass(), "url", null);
        setField(term363, term363.getClass(), "language", term365);
        ArrayList term358 = new ArrayList();
        ((ArrayList) term358).add(term360);
        ((ArrayList) term358).add(term363);
        term335 = newInstance(Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute"));
        setField(term335, term335.getClass(), "id", term336);
        setField(term335, term335.getClass(), "name", "mLUZFTfjle");
        setField(term335, term335.getClass(), "items", term350);
        setField(term335, term335.getClass(), "names", term354);
        setField(term335, term335.getClass(), "descriptions", term358);
        term368 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term368;
        callMethod(klass, "setItems", argTypes, term335, args);
    }

};


