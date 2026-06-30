package refactoring.app.chapter04;

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
import static refactoring.app.chapter04.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Producer_setProvince_3320441759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1868;
     Object term1924;

    public Producer_setProvince_3320441759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1898 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1898, term1898.getClass(), "name", null);
        setIntField(term1898, term1898.getClass(), "cost", 593962063);
        setIntField(term1898, term1898.getClass(), "production", -1485826786);
        setField(term1898, term1898.getClass(), "province", null);
        Object term1901 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1901, term1901.getClass(), "name", null);
        setIntField(term1901, term1901.getClass(), "cost", 0);
        setIntField(term1901, term1901.getClass(), "production", 0);
        setField(term1901, term1901.getClass(), "province", null);
        Object term1904 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1904, term1904.getClass(), "name", null);
        setIntField(term1904, term1904.getClass(), "cost", 0);
        setIntField(term1904, term1904.getClass(), "production", 0);
        setField(term1904, term1904.getClass(), "province", null);
        Object term1907 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1907, term1907.getClass(), "name", null);
        setIntField(term1907, term1907.getClass(), "cost", 0);
        setIntField(term1907, term1907.getClass(), "production", 0);
        setField(term1907, term1907.getClass(), "province", null);
        Object term1910 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1910, term1910.getClass(), "name", null);
        setIntField(term1910, term1910.getClass(), "cost", -1549952664);
        setIntField(term1910, term1910.getClass(), "production", 148394188);
        setField(term1910, term1910.getClass(), "province", null);
        Object term1913 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1913, term1913.getClass(), "name", null);
        setIntField(term1913, term1913.getClass(), "cost", 0);
        setIntField(term1913, term1913.getClass(), "production", 0);
        setField(term1913, term1913.getClass(), "province", null);
        Object term1916 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1916, term1916.getClass(), "name", null);
        setIntField(term1916, term1916.getClass(), "cost", 0);
        setIntField(term1916, term1916.getClass(), "production", 0);
        setField(term1916, term1916.getClass(), "province", null);
        ArrayList term1896 = new ArrayList();
        ((ArrayList) term1896).add(term1898);
        ((ArrayList) term1896).add(term1901);
        ((ArrayList) term1896).add(term1904);
        ((ArrayList) term1896).add(term1907);
        ((ArrayList) term1896).add(term1910);
        ((ArrayList) term1896).add(term1901);
        ((ArrayList) term1896).add(term1913);
        ((ArrayList) term1896).add(term1898);
        ((ArrayList) term1896).add(term1916);
        term1868 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1883 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1868, term1868.getClass(), "name", "XjDhvToxJy");
        setIntField(term1868, term1868.getClass(), "cost", 157967613);
        setIntField(term1868, term1868.getClass(), "production", 811839399);
        setField(term1883, term1883.getClass(), "name", "nxSTJflLQy");
        setField(term1883, term1883.getClass(), "producers", term1896);
        setIntField(term1883, term1883.getClass(), "totalProduction", 1077647088);
        setIntField(term1883, term1883.getClass(), "demand", -705176810);
        setIntField(term1883, term1883.getClass(), "price", -1584779593);
        setField(term1868, term1868.getClass(), "province", term1883);
        Object term1939 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1943 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1939, term1939.getClass(), "name", "");
        setIntField(term1939, term1939.getClass(), "cost", 303007547);
        setIntField(term1939, term1939.getClass(), "production", 1498738343);
        setField(term1943, term1943.getClass(), "name", null);
        setField(term1943, term1943.getClass(), "producers", null);
        setIntField(term1943, term1943.getClass(), "totalProduction", -439999692);
        setIntField(term1943, term1943.getClass(), "demand", 924095007);
        setIntField(term1943, term1943.getClass(), "price", 1302110708);
        setField(term1939, term1939.getClass(), "province", term1943);
        Object term1947 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1951 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1947, term1947.getClass(), "name", "");
        setIntField(term1947, term1947.getClass(), "cost", 1064185088);
        setIntField(term1947, term1947.getClass(), "production", -1249782654);
        setField(term1951, term1951.getClass(), "name", null);
        setField(term1951, term1951.getClass(), "producers", null);
        setIntField(term1951, term1951.getClass(), "totalProduction", 0);
        setIntField(term1951, term1951.getClass(), "demand", 0);
        setIntField(term1951, term1951.getClass(), "price", 0);
        setField(term1947, term1947.getClass(), "province", term1951);
        Object term1955 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1959 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1955, term1955.getClass(), "name", "");
        setIntField(term1955, term1955.getClass(), "cost", -1635571857);
        setIntField(term1955, term1955.getClass(), "production", 1407309162);
        setField(term1959, term1959.getClass(), "name", null);
        setField(term1959, term1959.getClass(), "producers", null);
        setIntField(term1959, term1959.getClass(), "totalProduction", -388591034);
        setIntField(term1959, term1959.getClass(), "demand", -1270258033);
        setIntField(term1959, term1959.getClass(), "price", 1677994069);
        setField(term1955, term1955.getClass(), "province", term1959);
        Object term1963 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1967 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1963, term1963.getClass(), "name", "");
        setIntField(term1963, term1963.getClass(), "cost", 793345010);
        setIntField(term1963, term1963.getClass(), "production", -2092117838);
        setField(term1967, term1967.getClass(), "name", null);
        setField(term1967, term1967.getClass(), "producers", null);
        setIntField(term1967, term1967.getClass(), "totalProduction", 0);
        setIntField(term1967, term1967.getClass(), "demand", 0);
        setIntField(term1967, term1967.getClass(), "price", 0);
        setField(term1963, term1963.getClass(), "province", term1967);
        Object term1971 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1975 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1971, term1971.getClass(), "name", "");
        setIntField(term1971, term1971.getClass(), "cost", -1731921726);
        setIntField(term1971, term1971.getClass(), "production", 919994471);
        setField(term1975, term1975.getClass(), "name", null);
        setField(term1975, term1975.getClass(), "producers", null);
        setIntField(term1975, term1975.getClass(), "totalProduction", 0);
        setIntField(term1975, term1975.getClass(), "demand", 0);
        setIntField(term1975, term1975.getClass(), "price", 0);
        setField(term1971, term1971.getClass(), "province", term1975);
        Object term1979 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1979, term1979.getClass(), "name", "");
        setIntField(term1979, term1979.getClass(), "cost", 183531701);
        setIntField(term1979, term1979.getClass(), "production", -974923743);
        setField(term1979, term1979.getClass(), "province", term1967);
        Object term1983 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1987 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1983, term1983.getClass(), "name", "");
        setIntField(term1983, term1983.getClass(), "cost", -534033672);
        setIntField(term1983, term1983.getClass(), "production", -1162790806);
        setField(term1987, term1987.getClass(), "name", null);
        setField(term1987, term1987.getClass(), "producers", null);
        setIntField(term1987, term1987.getClass(), "totalProduction", 1077223540);
        setIntField(term1987, term1987.getClass(), "demand", -1823813592);
        setIntField(term1987, term1987.getClass(), "price", -1644358555);
        setField(term1983, term1983.getClass(), "province", term1987);
        ArrayList term1937 = new ArrayList();
        ((ArrayList) term1937).add(term1939);
        ((ArrayList) term1937).add(term1947);
        ((ArrayList) term1937).add(term1955);
        ((ArrayList) term1937).add(term1963);
        ((ArrayList) term1937).add(term1963);
        ((ArrayList) term1937).add(term1971);
        ((ArrayList) term1937).add(term1979);
        ((ArrayList) term1937).add(term1983);
        ((ArrayList) term1937).add(term1963);
        term1924 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1924, term1924.getClass(), "name", "mKaHyMybrK");
        setField(term1924, term1924.getClass(), "producers", term1937);
        setIntField(term1924, term1924.getClass(), "totalProduction", 594705497);
        setIntField(term1924, term1924.getClass(), "demand", -600102466);
        setIntField(term1924, term1924.getClass(), "price", -899986714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Producer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter04.Province");
        Object[] args = new Object[1];
        args[0] = term1924;
        callMethod(klass, "setProvince", argTypes, term1868, args);
    }

};


