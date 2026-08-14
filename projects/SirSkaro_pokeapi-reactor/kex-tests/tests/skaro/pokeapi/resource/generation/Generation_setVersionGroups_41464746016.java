package skaro.pokeapi.resource.generation;

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
import static skaro.pokeapi.resource.generation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Generation_setVersionGroups_41464746016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1233;
     Object term1293;

    public Generation_setVersionGroups_41464746016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1234 = new Integer(-1685132342);
        ArrayList term1248 = new ArrayList();
        Object term1254 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1256 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1254, term1254.getClass(), "name", "");
        setField(term1256, term1256.getClass(), "name", null);
        setField(term1256, term1256.getClass(), "url", null);
        setField(term1254, term1254.getClass(), "language", term1256);
        Object term1257 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1259 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1257, term1257.getClass(), "name", "");
        setField(term1259, term1259.getClass(), "name", null);
        setField(term1259, term1259.getClass(), "url", null);
        setField(term1257, term1257.getClass(), "language", term1259);
        Object term1260 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1262 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1260, term1260.getClass(), "name", "");
        setField(term1262, term1262.getClass(), "name", null);
        setField(term1262, term1262.getClass(), "url", null);
        setField(term1260, term1260.getClass(), "language", term1262);
        Object term1263 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1265 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1263, term1263.getClass(), "name", "");
        setField(term1265, term1265.getClass(), "name", null);
        setField(term1265, term1265.getClass(), "url", null);
        setField(term1263, term1263.getClass(), "language", term1265);
        Object term1266 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1268 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1266, term1266.getClass(), "name", "");
        setField(term1268, term1268.getClass(), "name", null);
        setField(term1268, term1268.getClass(), "url", null);
        setField(term1266, term1266.getClass(), "language", term1268);
        Object term1269 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1271 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1269, term1269.getClass(), "name", "");
        setField(term1271, term1271.getClass(), "name", null);
        setField(term1271, term1271.getClass(), "url", null);
        setField(term1269, term1269.getClass(), "language", term1271);
        Object term1272 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1274 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1272, term1272.getClass(), "name", "");
        setField(term1274, term1274.getClass(), "name", null);
        setField(term1274, term1274.getClass(), "url", null);
        setField(term1272, term1272.getClass(), "language", term1274);
        ArrayList term1252 = new ArrayList();
        ((ArrayList) term1252).add(term1254);
        ((ArrayList) term1252).add(term1257);
        ((ArrayList) term1252).add(term1260);
        ((ArrayList) term1252).add(term1263);
        ((ArrayList) term1252).add(term1266);
        ((ArrayList) term1252).add(term1269);
        ((ArrayList) term1252).add(term1272);
        ArrayList term1277 = new ArrayList();
        ArrayList term1281 = new ArrayList();
        ArrayList term1285 = new ArrayList();
        ArrayList term1289 = new ArrayList();
        term1233 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term1233, term1233.getClass(), "id", term1234);
        setField(term1233, term1233.getClass(), "name", "tsTGdgQYUL");
        setField(term1233, term1233.getClass(), "abilities", term1248);
        setField(term1233, term1233.getClass(), "names", term1252);
        setField(term1233, term1233.getClass(), "moves", term1277);
        setField(term1233, term1233.getClass(), "pokemonSpecies", term1281);
        setField(term1233, term1233.getClass(), "types", term1285);
        setField(term1233, term1233.getClass(), "versionGroups", term1289);
        term1293 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1293;
        callMethod(klass, "setVersionGroups", argTypes, term1233, args);
    }

};


