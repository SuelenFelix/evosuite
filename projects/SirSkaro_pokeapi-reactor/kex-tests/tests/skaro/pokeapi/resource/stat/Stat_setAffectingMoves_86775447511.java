package skaro.pokeapi.resource.stat;

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
import static skaro.pokeapi.resource.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class Stat_setAffectingMoves_86775447511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1814;
     Object term1918;

    public Stat_setAffectingMoves_86775447511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1815 = new Integer(-343325701);
        Integer term1829 = new Integer(107945604);
        Boolean term1831 = new Boolean(false);
        Integer term1837 = new Integer(-1963464809);
        Object term1836 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1836, term1836.getClass(), "change", term1837);
        setField(term1836, term1836.getClass(), "move", null);
        Integer term1840 = new Integer(71190297);
        Object term1839 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1839, term1839.getClass(), "change", term1840);
        setField(term1839, term1839.getClass(), "move", null);
        Integer term1843 = new Integer(1202361360);
        Object term1842 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1842, term1842.getClass(), "change", term1843);
        setField(term1842, term1842.getClass(), "move", null);
        Integer term1846 = new Integer(-2015048153);
        Object term1845 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1845, term1845.getClass(), "change", term1846);
        setField(term1845, term1845.getClass(), "move", null);
        Integer term1849 = new Integer(-2063457669);
        Object term1848 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1848, term1848.getClass(), "change", term1849);
        setField(term1848, term1848.getClass(), "move", null);
        ArrayList term1834 = new ArrayList();
        ((ArrayList) term1834).add(term1836);
        ((ArrayList) term1834).add(term1839);
        ((ArrayList) term1834).add(term1842);
        ((ArrayList) term1834).add(term1845);
        ((ArrayList) term1834).add(term1848);
        Integer term1856 = new Integer(-1222006000);
        Object term1855 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1855, term1855.getClass(), "change", term1856);
        setField(term1855, term1855.getClass(), "move", null);
        ArrayList term1853 = new ArrayList();
        ((ArrayList) term1853).add(term1855);
        ArrayList term1861 = new ArrayList();
        ArrayList term1865 = new ArrayList();
        ArrayList term1869 = new ArrayList();
        Object term1900 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1902 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1900, term1900.getClass(), "name", "");
        setField(term1902, term1902.getClass(), "name", null);
        setField(term1902, term1902.getClass(), "url", null);
        setField(term1900, term1900.getClass(), "language", term1902);
        Object term1903 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1905 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1903, term1903.getClass(), "name", "");
        setField(term1905, term1905.getClass(), "name", null);
        setField(term1905, term1905.getClass(), "url", null);
        setField(term1903, term1903.getClass(), "language", term1905);
        Object term1906 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1908 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1906, term1906.getClass(), "name", "");
        setField(term1908, term1908.getClass(), "name", null);
        setField(term1908, term1908.getClass(), "url", null);
        setField(term1906, term1906.getClass(), "language", term1908);
        Object term1909 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1909, term1909.getClass(), "name", "");
        setField(term1909, term1909.getClass(), "language", term1902);
        Object term1911 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1911, term1911.getClass(), "name", "");
        setField(term1911, term1911.getClass(), "language", term1905);
        Object term1913 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1915 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1913, term1913.getClass(), "name", "");
        setField(term1915, term1915.getClass(), "name", null);
        setField(term1915, term1915.getClass(), "url", null);
        setField(term1913, term1913.getClass(), "language", term1915);
        ArrayList term1898 = new ArrayList();
        ((ArrayList) term1898).add(term1900);
        ((ArrayList) term1898).add(term1903);
        ((ArrayList) term1898).add(term1906);
        ((ArrayList) term1898).add(term1909);
        ((ArrayList) term1898).add(term1911);
        ((ArrayList) term1898).add(term1913);
        term1814 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term1833 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term1860 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term1873 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1814, term1814.getClass(), "id", term1815);
        setField(term1814, term1814.getClass(), "name", "fzeqPnzpnt");
        setField(term1814, term1814.getClass(), "gameIndex", term1829);
        setField(term1814, term1814.getClass(), "isBattleOnly", term1831);
        setField(term1833, term1833.getClass(), "increase", term1834);
        setField(term1833, term1833.getClass(), "decrease", term1853);
        setField(term1814, term1814.getClass(), "affectingMoves", term1833);
        setField(term1860, term1860.getClass(), "increase", term1861);
        setField(term1860, term1860.getClass(), "decrease", term1865);
        setField(term1814, term1814.getClass(), "affectingNatures", term1860);
        setField(term1814, term1814.getClass(), "characteristics", term1869);
        setField(term1873, term1873.getClass(), "name", "lgQkrXANyI");
        setField(term1873, term1873.getClass(), "url", "MeTmRZXErV");
        setField(term1814, term1814.getClass(), "moveDamageClass", term1873);
        setField(term1814, term1814.getClass(), "names", term1898);
        Integer term1922 = new Integer(2095798786);
        Object term1921 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term1924 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1921, term1921.getClass(), "change", term1922);
        setField(term1924, term1924.getClass(), "name", null);
        setField(term1924, term1924.getClass(), "url", null);
        setField(term1921, term1921.getClass(), "move", term1924);
        Integer term1926 = new Integer(-1565502840);
        Object term1925 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term1928 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1925, term1925.getClass(), "change", term1926);
        setField(term1928, term1928.getClass(), "name", null);
        setField(term1928, term1928.getClass(), "url", null);
        setField(term1925, term1925.getClass(), "move", term1928);
        Integer term1930 = new Integer(344323424);
        Object term1929 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term1932 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1929, term1929.getClass(), "change", term1930);
        setField(term1932, term1932.getClass(), "name", null);
        setField(term1932, term1932.getClass(), "url", null);
        setField(term1929, term1929.getClass(), "move", term1932);
        Integer term1934 = new Integer(9726679);
        Object term1933 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term1936 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1933, term1933.getClass(), "change", term1934);
        setField(term1936, term1936.getClass(), "name", null);
        setField(term1936, term1936.getClass(), "url", null);
        setField(term1933, term1933.getClass(), "move", term1936);
        Integer term1938 = new Integer(-25637976);
        Object term1937 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term1940 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1937, term1937.getClass(), "change", term1938);
        setField(term1940, term1940.getClass(), "name", null);
        setField(term1940, term1940.getClass(), "url", null);
        setField(term1937, term1937.getClass(), "move", term1940);
        Integer term1942 = new Integer(1555897383);
        Object term1941 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term1944 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1941, term1941.getClass(), "change", term1942);
        setField(term1944, term1944.getClass(), "name", null);
        setField(term1944, term1944.getClass(), "url", null);
        setField(term1941, term1941.getClass(), "move", term1944);
        Integer term1946 = new Integer(202001407);
        Object term1945 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term1948 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1945, term1945.getClass(), "change", term1946);
        setField(term1948, term1948.getClass(), "name", null);
        setField(term1948, term1948.getClass(), "url", null);
        setField(term1945, term1945.getClass(), "move", term1948);
        ArrayList term1919 = new ArrayList();
        ((ArrayList) term1919).add(term1921);
        ((ArrayList) term1919).add(term1925);
        ((ArrayList) term1919).add(term1929);
        ((ArrayList) term1919).add(term1933);
        ((ArrayList) term1919).add(term1937);
        ((ArrayList) term1919).add(term1941);
        ((ArrayList) term1919).add(term1945);
        ArrayList term1951 = new ArrayList();
        term1918 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        setField(term1918, term1918.getClass(), "increase", term1919);
        setField(term1918, term1918.getClass(), "decrease", term1951);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets");
        Object[] args = new Object[1];
        args[0] = term1918;
        callMethod(klass, "setAffectingMoves", argTypes, term1814, args);
    }

};


