package skaro.pokeapi.resource.region;

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
import static skaro.pokeapi.resource.region.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Region_getName_7632906565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;

    public Region_getName_7632906565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term390 = new Integer(-616727354);
        ArrayList term392 = new ArrayList();
        Object term410 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term412 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term410, term410.getClass(), "name", "");
        setField(term412, term412.getClass(), "name", null);
        setField(term412, term412.getClass(), "url", null);
        setField(term410, term410.getClass(), "language", term412);
        Object term413 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term415 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term413, term413.getClass(), "name", "");
        setField(term415, term415.getClass(), "name", null);
        setField(term415, term415.getClass(), "url", null);
        setField(term413, term413.getClass(), "language", term415);
        Object term416 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term418 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term416, term416.getClass(), "name", "");
        setField(term418, term418.getClass(), "name", null);
        setField(term418, term418.getClass(), "url", null);
        setField(term416, term416.getClass(), "language", term418);
        Object term419 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term421 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term419, term419.getClass(), "name", "");
        setField(term421, term421.getClass(), "name", null);
        setField(term421, term421.getClass(), "url", null);
        setField(term419, term419.getClass(), "language", term421);
        Object term422 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term424 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term422, term422.getClass(), "name", "");
        setField(term424, term424.getClass(), "name", null);
        setField(term424, term424.getClass(), "url", null);
        setField(term422, term422.getClass(), "language", term424);
        ArrayList term408 = new ArrayList();
        ((ArrayList) term408).add(term410);
        ((ArrayList) term408).add(term413);
        ((ArrayList) term408).add(term416);
        ((ArrayList) term408).add(term419);
        ((ArrayList) term408).add(term422);
        ArrayList term452 = new ArrayList();
        ArrayList term456 = new ArrayList();
        term389 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term427 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term389, term389.getClass(), "id", term390);
        setField(term389, term389.getClass(), "locations", term392);
        setField(term389, term389.getClass(), "name", "UiUYnPrcCi");
        setField(term389, term389.getClass(), "names", term408);
        setField(term427, term427.getClass(), "name", "TJmVBGfTML");
        setField(term427, term427.getClass(), "url", "tPlsykYBqO");
        setField(term389, term389.getClass(), "mainGeneration", term427);
        setField(term389, term389.getClass(), "pokedexes", term452);
        setField(term389, term389.getClass(), "versionGroups", term456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term389, args);
    }

};


