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

public class Pokedex_setRegion_39087323114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1549;
     Object term1629;

    public Pokedex_setRegion_39087323114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1550 = new Integer(1114000454);
        Boolean term1564 = new Boolean(false);
        Object term1568 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1570 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1568, term1568.getClass(), "description", "");
        setField(term1570, term1570.getClass(), "name", null);
        setField(term1570, term1570.getClass(), "url", null);
        setField(term1568, term1568.getClass(), "language", term1570);
        ArrayList term1566 = new ArrayList();
        ((ArrayList) term1566).add(term1568);
        Object term1575 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1577 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1575, term1575.getClass(), "name", "");
        setField(term1577, term1577.getClass(), "name", null);
        setField(term1577, term1577.getClass(), "url", null);
        setField(term1575, term1575.getClass(), "language", term1577);
        Object term1578 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1580 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1578, term1578.getClass(), "name", "");
        setField(term1580, term1580.getClass(), "name", null);
        setField(term1580, term1580.getClass(), "url", null);
        setField(term1578, term1578.getClass(), "language", term1580);
        Object term1581 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1583 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1581, term1581.getClass(), "name", "");
        setField(term1583, term1583.getClass(), "name", null);
        setField(term1583, term1583.getClass(), "url", null);
        setField(term1581, term1581.getClass(), "language", term1583);
        Object term1584 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1586 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1584, term1584.getClass(), "name", "");
        setField(term1586, term1586.getClass(), "name", null);
        setField(term1586, term1586.getClass(), "url", null);
        setField(term1584, term1584.getClass(), "language", term1586);
        Object term1587 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1589 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1587, term1587.getClass(), "name", "");
        setField(term1589, term1589.getClass(), "name", null);
        setField(term1589, term1589.getClass(), "url", null);
        setField(term1587, term1587.getClass(), "language", term1589);
        ArrayList term1573 = new ArrayList();
        ((ArrayList) term1573).add(term1575);
        ((ArrayList) term1573).add(term1578);
        ((ArrayList) term1573).add(term1581);
        ((ArrayList) term1573).add(term1584);
        ((ArrayList) term1573).add(term1587);
        Integer term1595 = new Integer(-556405712);
        Object term1594 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1597 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1594, term1594.getClass(), "entryNumber", term1595);
        setField(term1597, term1597.getClass(), "name", null);
        setField(term1597, term1597.getClass(), "url", null);
        setField(term1594, term1594.getClass(), "pokemonSpecies", term1597);
        ArrayList term1592 = new ArrayList();
        ((ArrayList) term1592).add(term1594);
        ArrayList term1625 = new ArrayList();
        term1549 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        Object term1600 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1549, term1549.getClass(), "id", term1550);
        setField(term1549, term1549.getClass(), "name", "GsWxOwXvSu");
        setField(term1549, term1549.getClass(), "isMainSeries", term1564);
        setField(term1549, term1549.getClass(), "descriptions", term1566);
        setField(term1549, term1549.getClass(), "names", term1573);
        setField(term1549, term1549.getClass(), "pokemonEntries", term1592);
        setField(term1600, term1600.getClass(), "name", "dwlZSxlXOo");
        setField(term1600, term1600.getClass(), "url", "lKrEAkypza");
        setField(term1549, term1549.getClass(), "region", term1600);
        setField(term1549, term1549.getClass(), "versionGroups", term1625);
        term1629 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1629, term1629.getClass(), "name", "YsUtbngnRO");
        setField(term1629, term1629.getClass(), "url", "JisaWUxcNb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term1629;
        callMethod(klass, "setRegion", argTypes, term1549, args);
    }

};


