package skaro.pokeapi.resource.berryflavor;

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
import static skaro.pokeapi.resource.berryflavor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class BerryFlavor_setNames_35548193412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141005;
     Object term141077;

    public BerryFlavor_setNames_35548193412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term141006 = new Integer(1507226462);
        Integer term141023 = new Integer(1948729123);
        Object term141022 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term141025 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term141022, term141022.getClass(), "potency", term141023);
        setField(term141025, term141025.getClass(), "name", null);
        setField(term141025, term141025.getClass(), "url", null);
        setField(term141022, term141022.getClass(), "berry", term141025);
        Integer term141027 = new Integer(-1745923386);
        Object term141026 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term141029 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term141026, term141026.getClass(), "potency", term141027);
        setField(term141029, term141029.getClass(), "name", null);
        setField(term141029, term141029.getClass(), "url", null);
        setField(term141026, term141026.getClass(), "berry", term141029);
        Integer term141031 = new Integer(391874700);
        Object term141030 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term141033 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term141030, term141030.getClass(), "potency", term141031);
        setField(term141033, term141033.getClass(), "name", null);
        setField(term141033, term141033.getClass(), "url", null);
        setField(term141030, term141030.getClass(), "berry", term141033);
        ArrayList term141020 = new ArrayList();
        ((ArrayList) term141020).add(term141022);
        ((ArrayList) term141020).add(term141026);
        ((ArrayList) term141020).add(term141030);
        Object term141063 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term141065 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term141063, term141063.getClass(), "name", "");
        setField(term141065, term141065.getClass(), "name", null);
        setField(term141065, term141065.getClass(), "url", null);
        setField(term141063, term141063.getClass(), "language", term141065);
        Object term141066 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term141068 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term141066, term141066.getClass(), "name", "");
        setField(term141068, term141068.getClass(), "name", null);
        setField(term141068, term141068.getClass(), "url", null);
        setField(term141066, term141066.getClass(), "language", term141068);
        Object term141069 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term141071 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term141069, term141069.getClass(), "name", "");
        setField(term141071, term141071.getClass(), "name", null);
        setField(term141071, term141071.getClass(), "url", null);
        setField(term141069, term141069.getClass(), "language", term141071);
        Object term141072 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term141074 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term141072, term141072.getClass(), "name", "");
        setField(term141074, term141074.getClass(), "name", null);
        setField(term141074, term141074.getClass(), "url", null);
        setField(term141072, term141072.getClass(), "language", term141074);
        ArrayList term141061 = new ArrayList();
        ((ArrayList) term141061).add(term141063);
        ((ArrayList) term141061).add(term141066);
        ((ArrayList) term141061).add(term141069);
        ((ArrayList) term141061).add(term141072);
        term141005 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term141036 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term141005, term141005.getClass(), "id", term141006);
        setField(term141005, term141005.getClass(), "name", "MvTdiQWZSU");
        setField(term141005, term141005.getClass(), "barries", term141020);
        setField(term141036, term141036.getClass(), "name", "MBQOpCiYQE");
        setField(term141036, term141036.getClass(), "url", "RmBXjBdzhI");
        setField(term141005, term141005.getClass(), "contestType", term141036);
        setField(term141005, term141005.getClass(), "names", term141061);
        Object term141080 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term141093 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term141080, term141080.getClass(), "name", "gUgUHMScoy");
        setField(term141093, term141093.getClass(), "name", "");
        setField(term141093, term141093.getClass(), "url", "");
        setField(term141080, term141080.getClass(), "language", term141093);
        Object term141097 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term141099 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term141097, term141097.getClass(), "name", "");
        setField(term141099, term141099.getClass(), "name", null);
        setField(term141099, term141099.getClass(), "url", null);
        setField(term141097, term141097.getClass(), "language", term141099);
        Object term141101 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term141101, term141101.getClass(), "name", null);
        setField(term141101, term141101.getClass(), "language", null);
        term141077 = new LinkedList();
        ((LinkedList) term141077).add(term141080);
        ((LinkedList) term141077).add(term141097);
        ((LinkedList) term141077).add(term141101);
        ((LinkedList) term141077).add((Object)null);
        ((LinkedList) term141077).add((Object)null);
        ((LinkedList) term141077).add((Object)null);
        ((LinkedList) term141077).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term141077;
        callMethod(klass, "setNames", argTypes, term141005, args);
    }

};


