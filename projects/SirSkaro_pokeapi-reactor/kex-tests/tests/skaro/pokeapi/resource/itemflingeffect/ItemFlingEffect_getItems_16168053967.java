package skaro.pokeapi.resource.itemflingeffect;

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
import static skaro.pokeapi.resource.itemflingeffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ItemFlingEffect_getItems_16168053967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298;

    public ItemFlingEffect_getItems_16168053967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term299 = new Integer(-2038273078);
        Object term315 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term317 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term315, term315.getClass(), "effect", "");
        setField(term317, term317.getClass(), "name", null);
        setField(term317, term317.getClass(), "url", null);
        setField(term315, term315.getClass(), "language", term317);
        ArrayList term313 = new ArrayList();
        ((ArrayList) term313).add(term315);
        ArrayList term320 = new ArrayList();
        term298 = newInstance(Class.forName("skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect"));
        setField(term298, term298.getClass(), "id", term299);
        setField(term298, term298.getClass(), "name", "wGmYcqUkgE");
        setField(term298, term298.getClass(), "effectEntries", term313);
        setField(term298, term298.getClass(), "items", term320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItems", argTypes, term298, args);
    }

};


