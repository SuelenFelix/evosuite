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

public class ItemAttribute_getNames_2563338147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381;

    public ItemAttribute_getNames_2563338147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term382 = new Integer(-2038273078);
        ArrayList term396 = new ArrayList();
        Object term402 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term404 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term402, term402.getClass(), "name", "");
        setField(term404, term404.getClass(), "name", null);
        setField(term404, term404.getClass(), "url", null);
        setField(term402, term402.getClass(), "language", term404);
        Object term405 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term407 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term405, term405.getClass(), "name", "");
        setField(term407, term407.getClass(), "name", null);
        setField(term407, term407.getClass(), "url", null);
        setField(term405, term405.getClass(), "language", term407);
        Object term408 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term410 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term408, term408.getClass(), "name", "");
        setField(term410, term410.getClass(), "name", null);
        setField(term410, term410.getClass(), "url", null);
        setField(term408, term408.getClass(), "language", term410);
        Object term411 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term413 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term411, term411.getClass(), "name", "");
        setField(term413, term413.getClass(), "name", null);
        setField(term413, term413.getClass(), "url", null);
        setField(term411, term411.getClass(), "language", term413);
        ArrayList term400 = new ArrayList();
        ((ArrayList) term400).add(term402);
        ((ArrayList) term400).add(term405);
        ((ArrayList) term400).add(term408);
        ((ArrayList) term400).add(term411);
        Object term418 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term420 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term418, term418.getClass(), "description", "");
        setField(term420, term420.getClass(), "name", null);
        setField(term420, term420.getClass(), "url", null);
        setField(term418, term418.getClass(), "language", term420);
        ArrayList term416 = new ArrayList();
        ((ArrayList) term416).add(term418);
        term381 = newInstance(Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute"));
        setField(term381, term381.getClass(), "id", term382);
        setField(term381, term381.getClass(), "name", "gCWtLVKVVe");
        setField(term381, term381.getClass(), "items", term396);
        setField(term381, term381.getClass(), "names", term400);
        setField(term381, term381.getClass(), "descriptions", term416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term381, args);
    }

};


