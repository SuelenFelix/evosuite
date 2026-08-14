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

public class ItemAttribute_getItems_6505867345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283;

    public ItemAttribute_getItems_6505867345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term284 = new Integer(-616727354);
        ArrayList term298 = new ArrayList();
        Object term304 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term306 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term304, term304.getClass(), "name", "");
        setField(term306, term306.getClass(), "name", null);
        setField(term306, term306.getClass(), "url", null);
        setField(term304, term304.getClass(), "language", term306);
        Object term307 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term309 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term307, term307.getClass(), "name", "");
        setField(term309, term309.getClass(), "name", null);
        setField(term309, term309.getClass(), "url", null);
        setField(term307, term307.getClass(), "language", term309);
        ArrayList term302 = new ArrayList();
        ((ArrayList) term302).add(term304);
        ((ArrayList) term302).add(term307);
        Object term314 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term316 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term314, term314.getClass(), "description", "");
        setField(term316, term316.getClass(), "name", null);
        setField(term316, term316.getClass(), "url", null);
        setField(term314, term314.getClass(), "language", term316);
        Object term317 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term319 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term317, term317.getClass(), "description", "");
        setField(term319, term319.getClass(), "name", null);
        setField(term319, term319.getClass(), "url", null);
        setField(term317, term317.getClass(), "language", term319);
        Object term320 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term322 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term320, term320.getClass(), "description", "");
        setField(term322, term322.getClass(), "name", null);
        setField(term322, term322.getClass(), "url", null);
        setField(term320, term320.getClass(), "language", term322);
        ArrayList term312 = new ArrayList();
        ((ArrayList) term312).add(term314);
        ((ArrayList) term312).add(term317);
        ((ArrayList) term312).add(term320);
        term283 = newInstance(Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute"));
        setField(term283, term283.getClass(), "id", term284);
        setField(term283, term283.getClass(), "name", "SJiQaLvSKv");
        setField(term283, term283.getClass(), "items", term298);
        setField(term283, term283.getClass(), "names", term302);
        setField(term283, term283.getClass(), "descriptions", term312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItems", argTypes, term283, args);
    }

};


