package skaro.pokeapi.resource.version;

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
import static skaro.pokeapi.resource.version.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Version_setName_16928378304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;

    public Version_setName_16928378304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term262 = new Integer(-1922583790);
        Object term278 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term280 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term278, term278.getClass(), "name", "");
        setField(term280, term280.getClass(), "name", null);
        setField(term280, term280.getClass(), "url", null);
        setField(term278, term278.getClass(), "language", term280);
        Object term281 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term283 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term281, term281.getClass(), "name", "");
        setField(term283, term283.getClass(), "name", null);
        setField(term283, term283.getClass(), "url", null);
        setField(term281, term281.getClass(), "language", term283);
        Object term284 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term286 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term284, term284.getClass(), "name", "");
        setField(term286, term286.getClass(), "name", null);
        setField(term286, term286.getClass(), "url", null);
        setField(term284, term284.getClass(), "language", term286);
        Object term287 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term289 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term287, term287.getClass(), "name", "");
        setField(term289, term289.getClass(), "name", null);
        setField(term289, term289.getClass(), "url", null);
        setField(term287, term287.getClass(), "language", term289);
        ArrayList term276 = new ArrayList();
        ((ArrayList) term276).add(term278);
        ((ArrayList) term276).add(term281);
        ((ArrayList) term276).add(term284);
        ((ArrayList) term276).add(term287);
        term261 = newInstance(Class.forName("skaro.pokeapi.resource.version.Version"));
        Object term292 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term261, term261.getClass(), "id", term262);
        setField(term261, term261.getClass(), "name", "GzFkzHGYFt");
        setField(term261, term261.getClass(), "names", term276);
        setField(term292, term292.getClass(), "name", "ytSBIKXogI");
        setField(term292, term292.getClass(), "url", "nHXjMycHlU");
        setField(term261, term261.getClass(), "versionGroup", term292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.version.Version");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        callMethod(klass, "setName", argTypes, term261, args);
    }

};


