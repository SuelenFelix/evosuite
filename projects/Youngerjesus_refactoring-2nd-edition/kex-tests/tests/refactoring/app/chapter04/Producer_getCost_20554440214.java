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

public class Producer_getCost_20554440214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1526;

    public Producer_getCost_20554440214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1556 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1556, term1556.getClass(), "name", null);
        setIntField(term1556, term1556.getClass(), "cost", -985334541);
        setIntField(term1556, term1556.getClass(), "production", -1870004228);
        setField(term1556, term1556.getClass(), "province", null);
        Object term1559 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1559, term1559.getClass(), "name", null);
        setIntField(term1559, term1559.getClass(), "cost", 263859424);
        setIntField(term1559, term1559.getClass(), "production", 1436978289);
        setField(term1559, term1559.getClass(), "province", null);
        Object term1562 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1562, term1562.getClass(), "name", null);
        setIntField(term1562, term1562.getClass(), "cost", 0);
        setIntField(term1562, term1562.getClass(), "production", 0);
        setField(term1562, term1562.getClass(), "province", null);
        Object term1565 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1565, term1565.getClass(), "name", null);
        setIntField(term1565, term1565.getClass(), "cost", -1092883950);
        setIntField(term1565, term1565.getClass(), "production", 950385621);
        setField(term1565, term1565.getClass(), "province", null);
        Object term1568 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1568, term1568.getClass(), "name", null);
        setIntField(term1568, term1568.getClass(), "cost", -608830309);
        setIntField(term1568, term1568.getClass(), "production", -537786484);
        setField(term1568, term1568.getClass(), "province", null);
        ArrayList term1554 = new ArrayList();
        ((ArrayList) term1554).add(term1556);
        ((ArrayList) term1554).add(term1559);
        ((ArrayList) term1554).add(term1562);
        ((ArrayList) term1554).add(term1565);
        ((ArrayList) term1554).add(term1565);
        ((ArrayList) term1554).add(term1568);
        ((ArrayList) term1554).add(term1559);
        ((ArrayList) term1554).add(term1559);
        term1526 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1541 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1526, term1526.getClass(), "name", "pFAfANnxup");
        setIntField(term1526, term1526.getClass(), "cost", -1592093430);
        setIntField(term1526, term1526.getClass(), "production", 1178214545);
        setField(term1541, term1541.getClass(), "name", "FbSIUZyBXZ");
        setField(term1541, term1541.getClass(), "producers", term1554);
        setIntField(term1541, term1541.getClass(), "totalProduction", 225873732);
        setIntField(term1541, term1541.getClass(), "demand", 529879356);
        setIntField(term1541, term1541.getClass(), "price", 18072182);
        setField(term1526, term1526.getClass(), "province", term1541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Producer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCost", argTypes, term1526, args);
    }

};


