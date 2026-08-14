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
import java.util.LinkedList;

public class Pokedex_setPokemonEntries_68099560312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1363;
     Object term1448;

    public Pokedex_setPokemonEntries_68099560312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1364 = new Integer(962840079);
        Boolean term1378 = new Boolean(false);
        Object term1382 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1384 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1382, term1382.getClass(), "description", "");
        setField(term1384, term1384.getClass(), "name", null);
        setField(term1384, term1384.getClass(), "url", null);
        setField(term1382, term1382.getClass(), "language", term1384);
        Object term1385 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1387 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1385, term1385.getClass(), "description", "");
        setField(term1387, term1387.getClass(), "name", null);
        setField(term1387, term1387.getClass(), "url", null);
        setField(term1385, term1385.getClass(), "language", term1387);
        Object term1388 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1390 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1388, term1388.getClass(), "description", "");
        setField(term1390, term1390.getClass(), "name", null);
        setField(term1390, term1390.getClass(), "url", null);
        setField(term1388, term1388.getClass(), "language", term1390);
        ArrayList term1380 = new ArrayList();
        ((ArrayList) term1380).add(term1382);
        ((ArrayList) term1380).add(term1385);
        ((ArrayList) term1380).add(term1388);
        Object term1395 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1397 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1395, term1395.getClass(), "name", "");
        setField(term1397, term1397.getClass(), "name", null);
        setField(term1397, term1397.getClass(), "url", null);
        setField(term1395, term1395.getClass(), "language", term1397);
        Object term1398 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1400 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1398, term1398.getClass(), "name", "");
        setField(term1400, term1400.getClass(), "name", null);
        setField(term1400, term1400.getClass(), "url", null);
        setField(term1398, term1398.getClass(), "language", term1400);
        Object term1401 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1403 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1401, term1401.getClass(), "name", "");
        setField(term1403, term1403.getClass(), "name", null);
        setField(term1403, term1403.getClass(), "url", null);
        setField(term1401, term1401.getClass(), "language", term1403);
        Object term1404 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1406 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1404, term1404.getClass(), "name", "");
        setField(term1406, term1406.getClass(), "name", null);
        setField(term1406, term1406.getClass(), "url", null);
        setField(term1404, term1404.getClass(), "language", term1406);
        Object term1407 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1409 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1407, term1407.getClass(), "name", "");
        setField(term1409, term1409.getClass(), "name", null);
        setField(term1409, term1409.getClass(), "url", null);
        setField(term1407, term1407.getClass(), "language", term1409);
        Object term1410 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1412 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1410, term1410.getClass(), "name", "");
        setField(term1412, term1412.getClass(), "name", null);
        setField(term1412, term1412.getClass(), "url", null);
        setField(term1410, term1410.getClass(), "language", term1412);
        ArrayList term1393 = new ArrayList();
        ((ArrayList) term1393).add(term1395);
        ((ArrayList) term1393).add(term1398);
        ((ArrayList) term1393).add(term1401);
        ((ArrayList) term1393).add(term1404);
        ((ArrayList) term1393).add(term1407);
        ((ArrayList) term1393).add(term1410);
        Integer term1418 = new Integer(1540719661);
        Object term1417 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1420 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1417, term1417.getClass(), "entryNumber", term1418);
        setField(term1420, term1420.getClass(), "name", null);
        setField(term1420, term1420.getClass(), "url", null);
        setField(term1417, term1417.getClass(), "pokemonSpecies", term1420);
        Integer term1422 = new Integer(1265463001);
        Object term1421 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1421, term1421.getClass(), "entryNumber", term1422);
        setField(term1421, term1421.getClass(), "pokemonSpecies", term1409);
        Integer term1425 = new Integer(335112684);
        Object term1424 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1424, term1424.getClass(), "entryNumber", term1425);
        setField(term1424, term1424.getClass(), "pokemonSpecies", term1412);
        Integer term1428 = new Integer(1551099402);
        Object term1427 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1427, term1427.getClass(), "entryNumber", term1428);
        setField(term1427, term1427.getClass(), "pokemonSpecies", term1384);
        Integer term1431 = new Integer(-2027534003);
        Object term1430 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1430, term1430.getClass(), "entryNumber", term1431);
        setField(term1430, term1430.getClass(), "pokemonSpecies", term1403);
        Integer term1434 = new Integer(1063420942);
        Object term1433 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1433, term1433.getClass(), "entryNumber", term1434);
        setField(term1433, term1433.getClass(), "pokemonSpecies", term1397);
        Integer term1437 = new Integer(1375330971);
        Object term1436 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1436, term1436.getClass(), "entryNumber", term1437);
        setField(term1436, term1436.getClass(), "pokemonSpecies", term1387);
        Integer term1440 = new Integer(-478195677);
        Object term1439 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1439, term1439.getClass(), "entryNumber", term1440);
        setField(term1439, term1439.getClass(), "pokemonSpecies", term1387);
        ArrayList term1415 = new ArrayList();
        ((ArrayList) term1415).add(term1417);
        ((ArrayList) term1415).add(term1421);
        ((ArrayList) term1415).add(term1424);
        ((ArrayList) term1415).add(term1427);
        ((ArrayList) term1415).add(term1430);
        ((ArrayList) term1415).add(term1433);
        ((ArrayList) term1415).add(term1436);
        ((ArrayList) term1415).add(term1439);
        ArrayList term1444 = new ArrayList();
        term1363 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term1363, term1363.getClass(), "id", term1364);
        setField(term1363, term1363.getClass(), "name", "zsWKWiTFuo");
        setField(term1363, term1363.getClass(), "isMainSeries", term1378);
        setField(term1363, term1363.getClass(), "descriptions", term1380);
        setField(term1363, term1363.getClass(), "names", term1393);
        setField(term1363, term1363.getClass(), "pokemonEntries", term1415);
        setField(term1363, term1363.getClass(), "region", term1420);
        setField(term1363, term1363.getClass(), "versionGroups", term1444);
        term1448 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1448;
        callMethod(klass, "setPokemonEntries", argTypes, term1363, args);
    }

};


