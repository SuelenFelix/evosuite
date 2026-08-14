package skaro.pokeapi.resource.pokedex;

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
import static skaro.pokeapi.resource.pokedex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class Pokedex_getPokemonEntries_181919105311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1276;

    public Pokedex_getPokemonEntries_181919105311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1277 = new Integer(-112921587);
        Boolean term1291 = new Boolean(true);
        Object term1295 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1297 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1295, term1295.getClass(), "description", "");
        setField(term1297, term1297.getClass(), "name", null);
        setField(term1297, term1297.getClass(), "url", null);
        setField(term1295, term1295.getClass(), "language", term1297);
        Object term1298 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1300 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1298, term1298.getClass(), "description", "");
        setField(term1300, term1300.getClass(), "name", null);
        setField(term1300, term1300.getClass(), "url", null);
        setField(term1298, term1298.getClass(), "language", term1300);
        Object term1301 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1303 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1301, term1301.getClass(), "description", "");
        setField(term1303, term1303.getClass(), "name", null);
        setField(term1303, term1303.getClass(), "url", null);
        setField(term1301, term1301.getClass(), "language", term1303);
        Object term1304 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1306 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1304, term1304.getClass(), "description", "");
        setField(term1306, term1306.getClass(), "name", null);
        setField(term1306, term1306.getClass(), "url", null);
        setField(term1304, term1304.getClass(), "language", term1306);
        Object term1307 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1309 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1307, term1307.getClass(), "description", "");
        setField(term1309, term1309.getClass(), "name", null);
        setField(term1309, term1309.getClass(), "url", null);
        setField(term1307, term1307.getClass(), "language", term1309);
        Object term1310 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1312 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1310, term1310.getClass(), "description", "");
        setField(term1312, term1312.getClass(), "name", null);
        setField(term1312, term1312.getClass(), "url", null);
        setField(term1310, term1310.getClass(), "language", term1312);
        Object term1313 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1315 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1313, term1313.getClass(), "description", "");
        setField(term1315, term1315.getClass(), "name", null);
        setField(term1315, term1315.getClass(), "url", null);
        setField(term1313, term1313.getClass(), "language", term1315);
        Object term1316 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1318 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1316, term1316.getClass(), "description", "");
        setField(term1318, term1318.getClass(), "name", null);
        setField(term1318, term1318.getClass(), "url", null);
        setField(term1316, term1316.getClass(), "language", term1318);
        ArrayList term1293 = new ArrayList();
        ((ArrayList) term1293).add(term1295);
        ((ArrayList) term1293).add(term1298);
        ((ArrayList) term1293).add(term1301);
        ((ArrayList) term1293).add(term1304);
        ((ArrayList) term1293).add(term1307);
        ((ArrayList) term1293).add(term1310);
        ((ArrayList) term1293).add(term1313);
        ((ArrayList) term1293).add(term1316);
        Object term1323 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1325 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1323, term1323.getClass(), "name", "");
        setField(term1325, term1325.getClass(), "name", null);
        setField(term1325, term1325.getClass(), "url", null);
        setField(term1323, term1323.getClass(), "language", term1325);
        Object term1326 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1328 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1326, term1326.getClass(), "name", "");
        setField(term1328, term1328.getClass(), "name", null);
        setField(term1328, term1328.getClass(), "url", null);
        setField(term1326, term1326.getClass(), "language", term1328);
        Object term1329 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1329, term1329.getClass(), "name", "");
        setField(term1329, term1329.getClass(), "language", term1318);
        Object term1331 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1331, term1331.getClass(), "name", "");
        setField(term1331, term1331.getClass(), "language", term1325);
        Object term1333 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1333, term1333.getClass(), "name", "");
        setField(term1333, term1333.getClass(), "language", term1297);
        Object term1335 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1335, term1335.getClass(), "name", "");
        setField(term1335, term1335.getClass(), "language", term1312);
        ArrayList term1321 = new ArrayList();
        ((ArrayList) term1321).add(term1323);
        ((ArrayList) term1321).add(term1326);
        ((ArrayList) term1321).add(term1329);
        ((ArrayList) term1321).add(term1331);
        ((ArrayList) term1321).add(term1333);
        ((ArrayList) term1321).add(term1335);
        Integer term1342 = new Integer(933028652);
        Object term1341 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1341, term1341.getClass(), "entryNumber", term1342);
        setField(term1341, term1341.getClass(), "pokemonSpecies", term1306);
        Integer term1345 = new Integer(287287233);
        Object term1344 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1344, term1344.getClass(), "entryNumber", term1345);
        setField(term1344, term1344.getClass(), "pokemonSpecies", term1300);
        ArrayList term1339 = new ArrayList();
        ((ArrayList) term1339).add(term1341);
        ((ArrayList) term1339).add(term1344);
        ArrayList term1349 = new ArrayList();
        term1276 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term1276, term1276.getClass(), "id", term1277);
        setField(term1276, term1276.getClass(), "name", "HHQcYMSBVc");
        setField(term1276, term1276.getClass(), "isMainSeries", term1291);
        setField(term1276, term1276.getClass(), "descriptions", term1293);
        setField(term1276, term1276.getClass(), "names", term1321);
        setField(term1276, term1276.getClass(), "pokemonEntries", term1339);
        setField(term1276, term1276.getClass(), "region", term1300);
        setField(term1276, term1276.getClass(), "versionGroups", term1349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemonEntries", argTypes, term1276, args);
    }

};


