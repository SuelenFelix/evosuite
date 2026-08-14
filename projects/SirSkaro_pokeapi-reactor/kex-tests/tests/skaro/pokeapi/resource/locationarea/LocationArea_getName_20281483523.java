package skaro.pokeapi.resource.locationarea;

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
import static skaro.pokeapi.resource.locationarea.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class LocationArea_getName_20281483523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1212;

    public LocationArea_getName_20281483523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1213 = new Integer(1870727665);
        Integer term1227 = new Integer(-519881101);
        ArrayList term1233 = new ArrayList();
        ((ArrayList) term1233).add((Object)null);
        ((ArrayList) term1233).add((Object)null);
        Object term1231 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate"));
        Object term1232 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1232, term1232.getClass(), "name", null);
        setField(term1232, term1232.getClass(), "url", null);
        setField(term1231, term1231.getClass(), "encounterMethod", term1232);
        setField(term1231, term1231.getClass(), "versionDetails", term1233);
        ArrayList term1238 = new ArrayList();
        ((ArrayList) term1238).add((Object)null);
        ((ArrayList) term1238).add((Object)null);
        ((ArrayList) term1238).add((Object)null);
        ((ArrayList) term1238).add((Object)null);
        ((ArrayList) term1238).add((Object)null);
        ((ArrayList) term1238).add((Object)null);
        ((ArrayList) term1238).add((Object)null);
        ((ArrayList) term1238).add((Object)null);
        Object term1236 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate"));
        Object term1237 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1237, term1237.getClass(), "name", null);
        setField(term1237, term1237.getClass(), "url", null);
        setField(term1236, term1236.getClass(), "encounterMethod", term1237);
        setField(term1236, term1236.getClass(), "versionDetails", term1238);
        ArrayList term1229 = new ArrayList();
        ((ArrayList) term1229).add(term1231);
        ((ArrayList) term1229).add(term1236);
        Object term1245 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1247 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1245, term1245.getClass(), "name", "");
        setField(term1247, term1247.getClass(), "name", null);
        setField(term1247, term1247.getClass(), "url", null);
        setField(term1245, term1245.getClass(), "language", term1247);
        Object term1248 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1248, term1248.getClass(), "name", "");
        setField(term1248, term1248.getClass(), "language", term1237);
        Object term1250 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1252 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1250, term1250.getClass(), "name", "");
        setField(term1252, term1252.getClass(), "name", null);
        setField(term1252, term1252.getClass(), "url", null);
        setField(term1250, term1250.getClass(), "language", term1252);
        Object term1253 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1253, term1253.getClass(), "name", "");
        setField(term1253, term1253.getClass(), "language", term1252);
        Object term1255 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1257 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1255, term1255.getClass(), "name", "");
        setField(term1257, term1257.getClass(), "name", null);
        setField(term1257, term1257.getClass(), "url", null);
        setField(term1255, term1255.getClass(), "language", term1257);
        ArrayList term1243 = new ArrayList();
        ((ArrayList) term1243).add(term1245);
        ((ArrayList) term1243).add(term1248);
        ((ArrayList) term1243).add(term1250);
        ((ArrayList) term1243).add(term1253);
        ((ArrayList) term1243).add(term1255);
        ArrayList term1264 = new ArrayList();
        ((ArrayList) term1264).add((Object)null);
        ((ArrayList) term1264).add((Object)null);
        ((ArrayList) term1264).add((Object)null);
        ((ArrayList) term1264).add((Object)null);
        ((ArrayList) term1264).add((Object)null);
        ((ArrayList) term1264).add((Object)null);
        Object term1262 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        Object term1263 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1263, term1263.getClass(), "name", null);
        setField(term1263, term1263.getClass(), "url", null);
        setField(term1262, term1262.getClass(), "pokemon", term1263);
        setField(term1262, term1262.getClass(), "versionDetails", term1264);
        ArrayList term1268 = new ArrayList();
        ((ArrayList) term1268).add((Object)null);
        ((ArrayList) term1268).add((Object)null);
        ((ArrayList) term1268).add((Object)null);
        ((ArrayList) term1268).add((Object)null);
        ((ArrayList) term1268).add((Object)null);
        ((ArrayList) term1268).add((Object)null);
        Object term1267 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        setField(term1267, term1267.getClass(), "pokemon", term1252);
        setField(term1267, term1267.getClass(), "versionDetails", term1268);
        ArrayList term1272 = new ArrayList();
        ((ArrayList) term1272).add((Object)null);
        Object term1271 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        setField(term1271, term1271.getClass(), "pokemon", term1257);
        setField(term1271, term1271.getClass(), "versionDetails", term1272);
        ArrayList term1277 = new ArrayList();
        ((ArrayList) term1277).add((Object)null);
        ((ArrayList) term1277).add((Object)null);
        Object term1275 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        Object term1276 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1276, term1276.getClass(), "name", null);
        setField(term1276, term1276.getClass(), "url", null);
        setField(term1275, term1275.getClass(), "pokemon", term1276);
        setField(term1275, term1275.getClass(), "versionDetails", term1277);
        ArrayList term1282 = new ArrayList();
        ((ArrayList) term1282).add((Object)null);
        ((ArrayList) term1282).add((Object)null);
        ((ArrayList) term1282).add((Object)null);
        ((ArrayList) term1282).add((Object)null);
        Object term1280 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        Object term1281 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1281, term1281.getClass(), "name", null);
        setField(term1281, term1281.getClass(), "url", null);
        setField(term1280, term1280.getClass(), "pokemon", term1281);
        setField(term1280, term1280.getClass(), "versionDetails", term1282);
        ArrayList term1286 = new ArrayList();
        ((ArrayList) term1286).add((Object)null);
        ((ArrayList) term1286).add((Object)null);
        ((ArrayList) term1286).add((Object)null);
        ((ArrayList) term1286).add((Object)null);
        Object term1285 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.PokemonEncounter"));
        setField(term1285, term1285.getClass(), "pokemon", term1252);
        setField(term1285, term1285.getClass(), "versionDetails", term1286);
        ArrayList term1260 = new ArrayList();
        ((ArrayList) term1260).add(term1262);
        ((ArrayList) term1260).add(term1267);
        ((ArrayList) term1260).add(term1271);
        ((ArrayList) term1260).add(term1275);
        ((ArrayList) term1260).add(term1280);
        ((ArrayList) term1260).add(term1285);
        term1212 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.LocationArea"));
        setField(term1212, term1212.getClass(), "Id", term1213);
        setField(term1212, term1212.getClass(), "name", "RMsXuyzKJV");
        setField(term1212, term1212.getClass(), "gameIndex", term1227);
        setField(term1212, term1212.getClass(), "encoutnerMethodRates", term1229);
        setField(term1212, term1212.getClass(), "location", term1232);
        setField(term1212, term1212.getClass(), "names", term1243);
        setField(term1212, term1212.getClass(), "pokemonEncounters", term1260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.LocationArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1212, args);
    }

};


