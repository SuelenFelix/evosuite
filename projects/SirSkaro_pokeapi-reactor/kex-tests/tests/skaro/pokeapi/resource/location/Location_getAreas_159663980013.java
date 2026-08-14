package skaro.pokeapi.resource.location;

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
import static skaro.pokeapi.resource.location.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Location_getAreas_159663980013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1219;

    public Location_getAreas_159663980013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1220 = new Integer(97029295);
        Object term1261 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1263 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1261, term1261.getClass(), "name", "");
        setField(term1263, term1263.getClass(), "name", null);
        setField(term1263, term1263.getClass(), "url", null);
        setField(term1261, term1261.getClass(), "language", term1263);
        Object term1264 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1266 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1264, term1264.getClass(), "name", "");
        setField(term1266, term1266.getClass(), "name", null);
        setField(term1266, term1266.getClass(), "url", null);
        setField(term1264, term1264.getClass(), "language", term1266);
        Object term1267 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1269 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1267, term1267.getClass(), "name", "");
        setField(term1269, term1269.getClass(), "name", null);
        setField(term1269, term1269.getClass(), "url", null);
        setField(term1267, term1267.getClass(), "language", term1269);
        Object term1270 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1272 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1270, term1270.getClass(), "name", "");
        setField(term1272, term1272.getClass(), "name", null);
        setField(term1272, term1272.getClass(), "url", null);
        setField(term1270, term1270.getClass(), "language", term1272);
        Object term1273 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1275 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1273, term1273.getClass(), "name", "");
        setField(term1275, term1275.getClass(), "name", null);
        setField(term1275, term1275.getClass(), "url", null);
        setField(term1273, term1273.getClass(), "language", term1275);
        Object term1276 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1278 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1276, term1276.getClass(), "name", "");
        setField(term1278, term1278.getClass(), "name", null);
        setField(term1278, term1278.getClass(), "url", null);
        setField(term1276, term1276.getClass(), "language", term1278);
        ArrayList term1259 = new ArrayList();
        ((ArrayList) term1259).add(term1261);
        ((ArrayList) term1259).add(term1264);
        ((ArrayList) term1259).add(term1267);
        ((ArrayList) term1259).add(term1270);
        ((ArrayList) term1259).add(term1273);
        ((ArrayList) term1259).add(term1276);
        Integer term1284 = new Integer(-1371869594);
        Object term1283 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term1286 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1283, term1283.getClass(), "gameIndex", term1284);
        setField(term1286, term1286.getClass(), "name", null);
        setField(term1286, term1286.getClass(), "url", null);
        setField(term1283, term1283.getClass(), "generation", term1286);
        Integer term1288 = new Integer(-2095575670);
        Object term1287 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term1290 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1287, term1287.getClass(), "gameIndex", term1288);
        setField(term1290, term1290.getClass(), "name", null);
        setField(term1290, term1290.getClass(), "url", null);
        setField(term1287, term1287.getClass(), "generation", term1290);
        ArrayList term1281 = new ArrayList();
        ((ArrayList) term1281).add(term1283);
        ((ArrayList) term1281).add(term1287);
        ArrayList term1293 = new ArrayList();
        term1219 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term1234 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1219, term1219.getClass(), "id", term1220);
        setField(term1219, term1219.getClass(), "name", "GrqozDKFOk");
        setField(term1234, term1234.getClass(), "name", "CFyoseFGLF");
        setField(term1234, term1234.getClass(), "url", "SFqCrhEWLm");
        setField(term1219, term1219.getClass(), "region", term1234);
        setField(term1219, term1219.getClass(), "names", term1259);
        setField(term1219, term1219.getClass(), "gameIndices", term1281);
        setField(term1219, term1219.getClass(), "areas", term1293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAreas", argTypes, term1219, args);
    }

};


