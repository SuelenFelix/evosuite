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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Producer_init_15013299981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1283;
     Object term1285;
     Object term1287;

    public Producer_init_15013299981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1283 = new Integer(-932147928);
        term1285 = new Integer(487369012);
        Object term1302 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1306 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1302, term1302.getClass(), "name", "");
        setIntField(term1302, term1302.getClass(), "cost", -179238712);
        setIntField(term1302, term1302.getClass(), "production", -2018735535);
        setField(term1306, term1306.getClass(), "name", null);
        setField(term1306, term1306.getClass(), "producers", null);
        setIntField(term1306, term1306.getClass(), "totalProduction", 175343605);
        setIntField(term1306, term1306.getClass(), "demand", 1050853183);
        setIntField(term1306, term1306.getClass(), "price", 848428785);
        setField(term1302, term1302.getClass(), "province", term1306);
        Object term1310 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1314 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1310, term1310.getClass(), "name", "");
        setIntField(term1310, term1310.getClass(), "cost", -934658823);
        setIntField(term1310, term1310.getClass(), "production", 1632177303);
        setField(term1314, term1314.getClass(), "name", null);
        setField(term1314, term1314.getClass(), "producers", null);
        setIntField(term1314, term1314.getClass(), "totalProduction", 0);
        setIntField(term1314, term1314.getClass(), "demand", 0);
        setIntField(term1314, term1314.getClass(), "price", 0);
        setField(term1310, term1310.getClass(), "province", term1314);
        Object term1318 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1322 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1318, term1318.getClass(), "name", "");
        setIntField(term1318, term1318.getClass(), "cost", 1415142780);
        setIntField(term1318, term1318.getClass(), "production", -574105759);
        setField(term1322, term1322.getClass(), "name", null);
        setField(term1322, term1322.getClass(), "producers", null);
        setIntField(term1322, term1322.getClass(), "totalProduction", 0);
        setIntField(term1322, term1322.getClass(), "demand", 0);
        setIntField(term1322, term1322.getClass(), "price", 0);
        setField(term1318, term1318.getClass(), "province", term1322);
        Object term1326 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1330 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1326, term1326.getClass(), "name", "");
        setIntField(term1326, term1326.getClass(), "cost", 654195547);
        setIntField(term1326, term1326.getClass(), "production", 1622857008);
        setField(term1330, term1330.getClass(), "name", null);
        setField(term1330, term1330.getClass(), "producers", null);
        setIntField(term1330, term1330.getClass(), "totalProduction", -1728316609);
        setIntField(term1330, term1330.getClass(), "demand", 47118909);
        setIntField(term1330, term1330.getClass(), "price", -2093707412);
        setField(term1326, term1326.getClass(), "province", term1330);
        Object term1334 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1338 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1334, term1334.getClass(), "name", "");
        setIntField(term1334, term1334.getClass(), "cost", -944986533);
        setIntField(term1334, term1334.getClass(), "production", 1894454926);
        setField(term1338, term1338.getClass(), "name", null);
        setField(term1338, term1338.getClass(), "producers", null);
        setIntField(term1338, term1338.getClass(), "totalProduction", 0);
        setIntField(term1338, term1338.getClass(), "demand", 0);
        setIntField(term1338, term1338.getClass(), "price", 0);
        setField(term1334, term1334.getClass(), "province", term1338);
        ArrayList term1300 = new ArrayList();
        ((ArrayList) term1300).add(term1302);
        ((ArrayList) term1300).add(term1310);
        ((ArrayList) term1300).add(term1318);
        ((ArrayList) term1300).add(term1326);
        ((ArrayList) term1300).add(term1334);
        term1287 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1287, term1287.getClass(), "name", "lZIgPZPgTu");
        setField(term1287, term1287.getClass(), "producers", term1300);
        setIntField(term1287, term1287.getClass(), "totalProduction", -1984436481);
        setIntField(term1287, term1287.getClass(), "demand", -407582855);
        setIntField(term1287, term1287.getClass(), "price", 1190753616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Producer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("refactoring.app.chapter04.Province");
        Object[] args = new Object[4];
        args[0] = "TXyHhqeCjR";
        args[1] = term1283;
        args[2] = term1285;
        args[3] = term1287;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


