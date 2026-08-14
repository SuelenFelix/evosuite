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
import java.util.LinkedList;

public class Version_setNames_20893323906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446;
     Object term508;

    public Version_setNames_20893323906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term447 = new Integer(-1955890973);
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
        Object term472 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term474 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term472, term472.getClass(), "name", "");
        setField(term474, term474.getClass(), "name", null);
        setField(term474, term474.getClass(), "url", null);
        setField(term472, term472.getClass(), "language", term474);
        Object term475 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term477 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term475, term475.getClass(), "name", "");
        setField(term477, term477.getClass(), "name", null);
        setField(term477, term477.getClass(), "url", null);
        setField(term475, term475.getClass(), "language", term477);
        Object term478 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term480 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term478, term478.getClass(), "name", "");
        setField(term480, term480.getClass(), "name", null);
        setField(term480, term480.getClass(), "url", null);
        setField(term478, term478.getClass(), "language", term480);
        ArrayList term461 = new ArrayList();
        ((ArrayList) term461).add(term463);
        ((ArrayList) term461).add(term466);
        ((ArrayList) term461).add(term469);
        ((ArrayList) term461).add(term472);
        ((ArrayList) term461).add(term475);
        ((ArrayList) term461).add(term478);
        term446 = newInstance(Class.forName("skaro.pokeapi.resource.version.Version"));
        Object term483 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term446, term446.getClass(), "id", term447);
        setField(term446, term446.getClass(), "name", "TJmVBGfTML");
        setField(term446, term446.getClass(), "names", term461);
        setField(term483, term483.getClass(), "name", "PHvxnGHptP");
        setField(term483, term483.getClass(), "url", "TimdotUuNC");
        setField(term446, term446.getClass(), "versionGroup", term483);
        Object term511 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term524 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term511, term511.getClass(), "name", "PkWMRdJcBb");
        setField(term524, term524.getClass(), "name", "");
        setField(term524, term524.getClass(), "url", "");
        setField(term511, term511.getClass(), "language", term524);
        Object term528 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term530 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term528, term528.getClass(), "name", "");
        setField(term530, term530.getClass(), "name", null);
        setField(term530, term530.getClass(), "url", null);
        setField(term528, term528.getClass(), "language", term530);
        Object term532 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term532, term532.getClass(), "name", null);
        setField(term532, term532.getClass(), "language", null);
        term508 = new LinkedList();
        ((LinkedList) term508).add(term511);
        ((LinkedList) term508).add(term528);
        ((LinkedList) term508).add(term532);
        ((LinkedList) term508).add((Object)null);
        ((LinkedList) term508).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.version.Version");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term508;
        callMethod(klass, "setNames", argTypes, term446, args);
    }

};


