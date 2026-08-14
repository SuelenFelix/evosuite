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

public class Region_getPokedexes_122739809811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1080;

    public Region_getPokedexes_122739809811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1081 = new Integer(-522618178);
        ArrayList term1083 = new ArrayList();
        Object term1101 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1103 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1101, term1101.getClass(), "name", "");
        setField(term1103, term1103.getClass(), "name", null);
        setField(term1103, term1103.getClass(), "url", null);
        setField(term1101, term1101.getClass(), "language", term1103);
        Object term1104 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1106 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1104, term1104.getClass(), "name", "");
        setField(term1106, term1106.getClass(), "name", null);
        setField(term1106, term1106.getClass(), "url", null);
        setField(term1104, term1104.getClass(), "language", term1106);
        Object term1107 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1109 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1107, term1107.getClass(), "name", "");
        setField(term1109, term1109.getClass(), "name", null);
        setField(term1109, term1109.getClass(), "url", null);
        setField(term1107, term1107.getClass(), "language", term1109);
        Object term1110 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1112 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1110, term1110.getClass(), "name", "");
        setField(term1112, term1112.getClass(), "name", null);
        setField(term1112, term1112.getClass(), "url", null);
        setField(term1110, term1110.getClass(), "language", term1112);
        Object term1113 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1115 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1113, term1113.getClass(), "name", "");
        setField(term1115, term1115.getClass(), "name", null);
        setField(term1115, term1115.getClass(), "url", null);
        setField(term1113, term1113.getClass(), "language", term1115);
        Object term1116 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1118 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1116, term1116.getClass(), "name", "");
        setField(term1118, term1118.getClass(), "name", null);
        setField(term1118, term1118.getClass(), "url", null);
        setField(term1116, term1116.getClass(), "language", term1118);
        ArrayList term1099 = new ArrayList();
        ((ArrayList) term1099).add(term1101);
        ((ArrayList) term1099).add(term1104);
        ((ArrayList) term1099).add(term1107);
        ((ArrayList) term1099).add(term1110);
        ((ArrayList) term1099).add(term1113);
        ((ArrayList) term1099).add(term1116);
        ArrayList term1146 = new ArrayList();
        ArrayList term1150 = new ArrayList();
        term1080 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term1121 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1080, term1080.getClass(), "id", term1081);
        setField(term1080, term1080.getClass(), "locations", term1083);
        setField(term1080, term1080.getClass(), "name", "pXOkjyeIRb");
        setField(term1080, term1080.getClass(), "names", term1099);
        setField(term1121, term1121.getClass(), "name", "BRIVNtfUWU");
        setField(term1121, term1121.getClass(), "url", "DbiCVtPPCT");
        setField(term1080, term1080.getClass(), "mainGeneration", term1121);
        setField(term1080, term1080.getClass(), "pokedexes", term1146);
        setField(term1080, term1080.getClass(), "versionGroups", term1150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokedexes", argTypes, term1080, args);
    }

};


