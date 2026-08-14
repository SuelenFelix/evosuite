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

public class Pokedex_getVersionGroups_164611230415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1704;

    public Pokedex_getVersionGroups_164611230415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1705 = new Integer(-1772434990);
        Boolean term1719 = new Boolean(false);
        ArrayList term1721 = new ArrayList();
        Object term1727 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1729 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1727, term1727.getClass(), "name", "");
        setField(term1729, term1729.getClass(), "name", null);
        setField(term1729, term1729.getClass(), "url", null);
        setField(term1727, term1727.getClass(), "language", term1729);
        Object term1730 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1732 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1730, term1730.getClass(), "name", "");
        setField(term1732, term1732.getClass(), "name", null);
        setField(term1732, term1732.getClass(), "url", null);
        setField(term1730, term1730.getClass(), "language", term1732);
        Object term1733 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1735 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1733, term1733.getClass(), "name", "");
        setField(term1735, term1735.getClass(), "name", null);
        setField(term1735, term1735.getClass(), "url", null);
        setField(term1733, term1733.getClass(), "language", term1735);
        Object term1736 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1738 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1736, term1736.getClass(), "name", "");
        setField(term1738, term1738.getClass(), "name", null);
        setField(term1738, term1738.getClass(), "url", null);
        setField(term1736, term1736.getClass(), "language", term1738);
        ArrayList term1725 = new ArrayList();
        ((ArrayList) term1725).add(term1727);
        ((ArrayList) term1725).add(term1730);
        ((ArrayList) term1725).add(term1733);
        ((ArrayList) term1725).add(term1736);
        ArrayList term1741 = new ArrayList();
        ArrayList term1770 = new ArrayList();
        term1704 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        Object term1745 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1704, term1704.getClass(), "id", term1705);
        setField(term1704, term1704.getClass(), "name", "NxgmYPzWCI");
        setField(term1704, term1704.getClass(), "isMainSeries", term1719);
        setField(term1704, term1704.getClass(), "descriptions", term1721);
        setField(term1704, term1704.getClass(), "names", term1725);
        setField(term1704, term1704.getClass(), "pokemonEntries", term1741);
        setField(term1745, term1745.getClass(), "name", "AyrEXuGrEj");
        setField(term1745, term1745.getClass(), "url", "yevIIoVYHq");
        setField(term1704, term1704.getClass(), "region", term1745);
        setField(term1704, term1704.getClass(), "versionGroups", term1770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroups", argTypes, term1704, args);
    }

};


