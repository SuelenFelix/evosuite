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
import java.util.ArrayList;
import java.lang.Object;

public class Province_satisfiedDemand_15694081776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391;

    public Province_satisfiedDemand_15694081776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term406 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term410 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term406, term406.getClass(), "name", "");
        setIntField(term406, term406.getClass(), "cost", -1938881385);
        setIntField(term406, term406.getClass(), "production", -1629418973);
        setField(term410, term410.getClass(), "name", null);
        setField(term410, term410.getClass(), "producers", null);
        setIntField(term410, term410.getClass(), "totalProduction", 833762980);
        setIntField(term410, term410.getClass(), "demand", 320711637);
        setIntField(term410, term410.getClass(), "price", 1241164745);
        setField(term406, term406.getClass(), "province", term410);
        Object term414 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term418 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term414, term414.getClass(), "name", "");
        setIntField(term414, term414.getClass(), "cost", -350454594);
        setIntField(term414, term414.getClass(), "production", -1148142995);
        setField(term418, term418.getClass(), "name", null);
        setField(term418, term418.getClass(), "producers", null);
        setIntField(term418, term418.getClass(), "totalProduction", -439048495);
        setIntField(term418, term418.getClass(), "demand", -1849105286);
        setIntField(term418, term418.getClass(), "price", 1334483645);
        setField(term414, term414.getClass(), "province", term418);
        Object term422 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term426 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term422, term422.getClass(), "name", "");
        setIntField(term422, term422.getClass(), "cost", 1390820006);
        setIntField(term422, term422.getClass(), "production", -828982065);
        setField(term426, term426.getClass(), "name", null);
        setField(term426, term426.getClass(), "producers", null);
        setIntField(term426, term426.getClass(), "totalProduction", 0);
        setIntField(term426, term426.getClass(), "demand", 0);
        setIntField(term426, term426.getClass(), "price", 0);
        setField(term422, term422.getClass(), "province", term426);
        Object term430 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term434 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term430, term430.getClass(), "name", "");
        setIntField(term430, term430.getClass(), "cost", -1702055571);
        setIntField(term430, term430.getClass(), "production", -944542900);
        setField(term434, term434.getClass(), "name", null);
        setField(term434, term434.getClass(), "producers", null);
        setIntField(term434, term434.getClass(), "totalProduction", 0);
        setIntField(term434, term434.getClass(), "demand", 0);
        setIntField(term434, term434.getClass(), "price", 0);
        setField(term430, term430.getClass(), "province", term434);
        Object term438 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term442 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term438, term438.getClass(), "name", "");
        setIntField(term438, term438.getClass(), "cost", 301401782);
        setIntField(term438, term438.getClass(), "production", 1988605357);
        setField(term442, term442.getClass(), "name", null);
        setField(term442, term442.getClass(), "producers", null);
        setIntField(term442, term442.getClass(), "totalProduction", 0);
        setIntField(term442, term442.getClass(), "demand", 0);
        setIntField(term442, term442.getClass(), "price", 0);
        setField(term438, term438.getClass(), "province", term442);
        Object term446 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term450 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term446, term446.getClass(), "name", "");
        setIntField(term446, term446.getClass(), "cost", -233024044);
        setIntField(term446, term446.getClass(), "production", 1820784228);
        setField(term450, term450.getClass(), "name", null);
        setField(term450, term450.getClass(), "producers", null);
        setIntField(term450, term450.getClass(), "totalProduction", 2063762142);
        setIntField(term450, term450.getClass(), "demand", 1658391716);
        setIntField(term450, term450.getClass(), "price", 2143282300);
        setField(term446, term446.getClass(), "province", term450);
        ArrayList term404 = new ArrayList();
        ((ArrayList) term404).add(term406);
        ((ArrayList) term404).add(term414);
        ((ArrayList) term404).add(term422);
        ((ArrayList) term404).add(term430);
        ((ArrayList) term404).add(term438);
        ((ArrayList) term404).add(term438);
        ((ArrayList) term404).add(term446);
        ((ArrayList) term404).add(term422);
        ((ArrayList) term404).add(term422);
        term391 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term391, term391.getClass(), "name", "VYkqXKVlAJ");
        setField(term391, term391.getClass(), "producers", term404);
        setIntField(term391, term391.getClass(), "totalProduction", 1723148410);
        setIntField(term391, term391.getClass(), "demand", -920797484);
        setIntField(term391, term391.getClass(), "price", -1631697577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "satisfiedDemand", argTypes, term391, args);
    }

};


