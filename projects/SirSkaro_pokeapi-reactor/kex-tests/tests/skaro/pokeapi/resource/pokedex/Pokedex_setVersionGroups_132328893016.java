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

public class Pokedex_setVersionGroups_132328893016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1804;
     Object term1871;

    public Pokedex_setVersionGroups_132328893016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1805 = new Integer(-1845499264);
        Boolean term1819 = new Boolean(true);
        Object term1823 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1825 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1823, term1823.getClass(), "description", "");
        setField(term1825, term1825.getClass(), "name", null);
        setField(term1825, term1825.getClass(), "url", null);
        setField(term1823, term1823.getClass(), "language", term1825);
        Object term1826 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1828 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1826, term1826.getClass(), "description", "");
        setField(term1828, term1828.getClass(), "name", null);
        setField(term1828, term1828.getClass(), "url", null);
        setField(term1826, term1826.getClass(), "language", term1828);
        Object term1829 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1831 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1829, term1829.getClass(), "description", "");
        setField(term1831, term1831.getClass(), "name", null);
        setField(term1831, term1831.getClass(), "url", null);
        setField(term1829, term1829.getClass(), "language", term1831);
        Object term1832 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1834 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1832, term1832.getClass(), "description", "");
        setField(term1834, term1834.getClass(), "name", null);
        setField(term1834, term1834.getClass(), "url", null);
        setField(term1832, term1832.getClass(), "language", term1834);
        ArrayList term1821 = new ArrayList();
        ((ArrayList) term1821).add(term1823);
        ((ArrayList) term1821).add(term1826);
        ((ArrayList) term1821).add(term1829);
        ((ArrayList) term1821).add(term1832);
        Object term1839 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1841 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1839, term1839.getClass(), "name", "");
        setField(term1841, term1841.getClass(), "name", null);
        setField(term1841, term1841.getClass(), "url", null);
        setField(term1839, term1839.getClass(), "language", term1841);
        Object term1842 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1844 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1842, term1842.getClass(), "name", "");
        setField(term1844, term1844.getClass(), "name", null);
        setField(term1844, term1844.getClass(), "url", null);
        setField(term1842, term1842.getClass(), "language", term1844);
        Object term1845 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1847 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1845, term1845.getClass(), "name", "");
        setField(term1847, term1847.getClass(), "name", null);
        setField(term1847, term1847.getClass(), "url", null);
        setField(term1845, term1845.getClass(), "language", term1847);
        Object term1848 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1850 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1848, term1848.getClass(), "name", "");
        setField(term1850, term1850.getClass(), "name", null);
        setField(term1850, term1850.getClass(), "url", null);
        setField(term1848, term1848.getClass(), "language", term1850);
        Object term1851 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1853 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1851, term1851.getClass(), "name", "");
        setField(term1853, term1853.getClass(), "name", null);
        setField(term1853, term1853.getClass(), "url", null);
        setField(term1851, term1851.getClass(), "language", term1853);
        Object term1854 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1856 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1854, term1854.getClass(), "name", "");
        setField(term1856, term1856.getClass(), "name", null);
        setField(term1856, term1856.getClass(), "url", null);
        setField(term1854, term1854.getClass(), "language", term1856);
        Object term1857 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1857, term1857.getClass(), "name", "");
        setField(term1857, term1857.getClass(), "language", term1850);
        Object term1859 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1859, term1859.getClass(), "name", "");
        setField(term1859, term1859.getClass(), "language", term1853);
        ArrayList term1837 = new ArrayList();
        ((ArrayList) term1837).add(term1839);
        ((ArrayList) term1837).add(term1842);
        ((ArrayList) term1837).add(term1845);
        ((ArrayList) term1837).add(term1848);
        ((ArrayList) term1837).add(term1851);
        ((ArrayList) term1837).add(term1854);
        ((ArrayList) term1837).add(term1857);
        ((ArrayList) term1837).add(term1859);
        ArrayList term1863 = new ArrayList();
        ArrayList term1867 = new ArrayList();
        term1804 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term1804, term1804.getClass(), "id", term1805);
        setField(term1804, term1804.getClass(), "name", "UuYWMTqWTV");
        setField(term1804, term1804.getClass(), "isMainSeries", term1819);
        setField(term1804, term1804.getClass(), "descriptions", term1821);
        setField(term1804, term1804.getClass(), "names", term1837);
        setField(term1804, term1804.getClass(), "pokemonEntries", term1863);
        setField(term1804, term1804.getClass(), "region", term1825);
        setField(term1804, term1804.getClass(), "versionGroups", term1867);
        Object term1874 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1874, term1874.getClass(), "name", "AGXoIndFnm");
        setField(term1874, term1874.getClass(), "url", "mwmFMNEzkK");
        Object term1900 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1900, term1900.getClass(), "name", "");
        setField(term1900, term1900.getClass(), "url", "");
        Object term1904 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1904, term1904.getClass(), "name", null);
        setField(term1904, term1904.getClass(), "url", null);
        term1871 = new LinkedList();
        ((LinkedList) term1871).add(term1874);
        ((LinkedList) term1871).add(term1900);
        ((LinkedList) term1871).add(term1904);
        ((LinkedList) term1871).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1871;
        callMethod(klass, "setVersionGroups", argTypes, term1804, args);
    }

};


