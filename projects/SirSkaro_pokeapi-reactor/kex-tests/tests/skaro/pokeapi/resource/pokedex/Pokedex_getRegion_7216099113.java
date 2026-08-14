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

public class Pokedex_getRegion_7216099113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1461;

    public Pokedex_getRegion_7216099113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1462 = new Integer(972867650);
        Boolean term1476 = new Boolean(true);
        Object term1480 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1482 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1480, term1480.getClass(), "description", "");
        setField(term1482, term1482.getClass(), "name", null);
        setField(term1482, term1482.getClass(), "url", null);
        setField(term1480, term1480.getClass(), "language", term1482);
        Object term1483 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1485 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1483, term1483.getClass(), "description", "");
        setField(term1485, term1485.getClass(), "name", null);
        setField(term1485, term1485.getClass(), "url", null);
        setField(term1483, term1483.getClass(), "language", term1485);
        Object term1486 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1488 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1486, term1486.getClass(), "description", "");
        setField(term1488, term1488.getClass(), "name", null);
        setField(term1488, term1488.getClass(), "url", null);
        setField(term1486, term1486.getClass(), "language", term1488);
        Object term1489 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1491 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1489, term1489.getClass(), "description", "");
        setField(term1491, term1491.getClass(), "name", null);
        setField(term1491, term1491.getClass(), "url", null);
        setField(term1489, term1489.getClass(), "language", term1491);
        Object term1492 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1494 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1492, term1492.getClass(), "description", "");
        setField(term1494, term1494.getClass(), "name", null);
        setField(term1494, term1494.getClass(), "url", null);
        setField(term1492, term1492.getClass(), "language", term1494);
        Object term1495 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1497 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1495, term1495.getClass(), "description", "");
        setField(term1497, term1497.getClass(), "name", null);
        setField(term1497, term1497.getClass(), "url", null);
        setField(term1495, term1495.getClass(), "language", term1497);
        ArrayList term1478 = new ArrayList();
        ((ArrayList) term1478).add(term1480);
        ((ArrayList) term1478).add(term1483);
        ((ArrayList) term1478).add(term1486);
        ((ArrayList) term1478).add(term1489);
        ((ArrayList) term1478).add(term1492);
        ((ArrayList) term1478).add(term1495);
        Object term1502 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1504 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1502, term1502.getClass(), "name", "");
        setField(term1504, term1504.getClass(), "name", null);
        setField(term1504, term1504.getClass(), "url", null);
        setField(term1502, term1502.getClass(), "language", term1504);
        ArrayList term1500 = new ArrayList();
        ((ArrayList) term1500).add(term1502);
        Integer term1510 = new Integer(1655935355);
        Object term1509 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1512 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1509, term1509.getClass(), "entryNumber", term1510);
        setField(term1512, term1512.getClass(), "name", null);
        setField(term1512, term1512.getClass(), "url", null);
        setField(term1509, term1509.getClass(), "pokemonSpecies", term1512);
        Integer term1514 = new Integer(-481533957);
        Object term1513 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1516 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1513, term1513.getClass(), "entryNumber", term1514);
        setField(term1516, term1516.getClass(), "name", null);
        setField(term1516, term1516.getClass(), "url", null);
        setField(term1513, term1513.getClass(), "pokemonSpecies", term1516);
        Integer term1518 = new Integer(1240914516);
        Object term1517 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1520 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1517, term1517.getClass(), "entryNumber", term1518);
        setField(term1520, term1520.getClass(), "name", null);
        setField(term1520, term1520.getClass(), "url", null);
        setField(term1517, term1517.getClass(), "pokemonSpecies", term1520);
        Integer term1522 = new Integer(-1465035361);
        Object term1521 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1521, term1521.getClass(), "entryNumber", term1522);
        setField(term1521, term1521.getClass(), "pokemonSpecies", term1512);
        Integer term1525 = new Integer(1090617576);
        Object term1524 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1524, term1524.getClass(), "entryNumber", term1525);
        setField(term1524, term1524.getClass(), "pokemonSpecies", term1516);
        Integer term1528 = new Integer(-1547384488);
        Object term1527 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1527, term1527.getClass(), "entryNumber", term1528);
        setField(term1527, term1527.getClass(), "pokemonSpecies", term1482);
        Integer term1531 = new Integer(1442160736);
        Object term1530 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1530, term1530.getClass(), "entryNumber", term1531);
        setField(term1530, term1530.getClass(), "pokemonSpecies", term1497);
        ArrayList term1507 = new ArrayList();
        ((ArrayList) term1507).add(term1509);
        ((ArrayList) term1507).add(term1513);
        ((ArrayList) term1507).add(term1517);
        ((ArrayList) term1507).add(term1521);
        ((ArrayList) term1507).add(term1524);
        ((ArrayList) term1507).add(term1527);
        ((ArrayList) term1507).add(term1530);
        ArrayList term1535 = new ArrayList();
        term1461 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term1461, term1461.getClass(), "id", term1462);
        setField(term1461, term1461.getClass(), "name", "mGRiYhnMcR");
        setField(term1461, term1461.getClass(), "isMainSeries", term1476);
        setField(term1461, term1461.getClass(), "descriptions", term1478);
        setField(term1461, term1461.getClass(), "names", term1500);
        setField(term1461, term1461.getClass(), "pokemonEntries", term1507);
        setField(term1461, term1461.getClass(), "region", term1491);
        setField(term1461, term1461.getClass(), "versionGroups", term1535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion", argTypes, term1461, args);
    }

};


