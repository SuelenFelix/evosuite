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

public class Province_getName_7786886348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;

    public Province_getName_7786886348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term558 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term562 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term558, term558.getClass(), "name", "");
        setIntField(term558, term558.getClass(), "cost", -645429025);
        setIntField(term558, term558.getClass(), "production", -688213483);
        setField(term562, term562.getClass(), "name", null);
        setField(term562, term562.getClass(), "producers", null);
        setIntField(term562, term562.getClass(), "totalProduction", 644154104);
        setIntField(term562, term562.getClass(), "demand", 76650923);
        setIntField(term562, term562.getClass(), "price", 1003743923);
        setField(term558, term558.getClass(), "province", term562);
        Object term566 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term570 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term566, term566.getClass(), "name", "");
        setIntField(term566, term566.getClass(), "cost", 1887772522);
        setIntField(term566, term566.getClass(), "production", 354196060);
        setField(term570, term570.getClass(), "name", null);
        setField(term570, term570.getClass(), "producers", null);
        setIntField(term570, term570.getClass(), "totalProduction", 1639448749);
        setIntField(term570, term570.getClass(), "demand", 873659088);
        setIntField(term570, term570.getClass(), "price", -975748721);
        setField(term566, term566.getClass(), "province", term570);
        Object term574 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term578 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term574, term574.getClass(), "name", "");
        setIntField(term574, term574.getClass(), "cost", -1724487863);
        setIntField(term574, term574.getClass(), "production", -128490829);
        setField(term578, term578.getClass(), "name", null);
        setField(term578, term578.getClass(), "producers", null);
        setIntField(term578, term578.getClass(), "totalProduction", 0);
        setIntField(term578, term578.getClass(), "demand", 0);
        setIntField(term578, term578.getClass(), "price", 0);
        setField(term574, term574.getClass(), "province", term578);
        Object term582 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term586 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term582, term582.getClass(), "name", "");
        setIntField(term582, term582.getClass(), "cost", -1840305774);
        setIntField(term582, term582.getClass(), "production", 1365087144);
        setField(term586, term586.getClass(), "name", null);
        setField(term586, term586.getClass(), "producers", null);
        setIntField(term586, term586.getClass(), "totalProduction", 853609788);
        setIntField(term586, term586.getClass(), "demand", -197820800);
        setIntField(term586, term586.getClass(), "price", 723812297);
        setField(term582, term582.getClass(), "province", term586);
        Object term590 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term590, term590.getClass(), "name", "");
        setIntField(term590, term590.getClass(), "cost", -1488938905);
        setIntField(term590, term590.getClass(), "production", 1916544127);
        setField(term590, term590.getClass(), "province", term578);
        Object term594 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term598 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term594, term594.getClass(), "name", "");
        setIntField(term594, term594.getClass(), "cost", -2063365430);
        setIntField(term594, term594.getClass(), "production", 812570053);
        setField(term598, term598.getClass(), "name", null);
        setField(term598, term598.getClass(), "producers", null);
        setIntField(term598, term598.getClass(), "totalProduction", 0);
        setIntField(term598, term598.getClass(), "demand", 0);
        setIntField(term598, term598.getClass(), "price", 0);
        setField(term594, term594.getClass(), "province", term598);
        Object term602 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term606 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term602, term602.getClass(), "name", "");
        setIntField(term602, term602.getClass(), "cost", -1133405894);
        setIntField(term602, term602.getClass(), "production", 1289741214);
        setField(term606, term606.getClass(), "name", null);
        setField(term606, term606.getClass(), "producers", null);
        setIntField(term606, term606.getClass(), "totalProduction", 0);
        setIntField(term606, term606.getClass(), "demand", 0);
        setIntField(term606, term606.getClass(), "price", 0);
        setField(term602, term602.getClass(), "province", term606);
        ArrayList term556 = new ArrayList();
        ((ArrayList) term556).add(term558);
        ((ArrayList) term556).add(term566);
        ((ArrayList) term556).add(term574);
        ((ArrayList) term556).add(term582);
        ((ArrayList) term556).add(term590);
        ((ArrayList) term556).add(term594);
        ((ArrayList) term556).add(term566);
        ((ArrayList) term556).add(term602);
        ((ArrayList) term556).add(term594);
        term543 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term543, term543.getClass(), "name", "JppkknKVOw");
        setField(term543, term543.getClass(), "producers", term556);
        setIntField(term543, term543.getClass(), "totalProduction", 433248783);
        setIntField(term543, term543.getClass(), "demand", -507944154);
        setIntField(term543, term543.getClass(), "price", -1736183862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term543, args);
    }

};


