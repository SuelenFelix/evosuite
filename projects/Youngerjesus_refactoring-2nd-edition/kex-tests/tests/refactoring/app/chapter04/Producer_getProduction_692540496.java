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

public class Producer_getProduction_692540496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1659;

    public Producer_getProduction_692540496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1689 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1689, term1689.getClass(), "name", null);
        setIntField(term1689, term1689.getClass(), "cost", 1902784843);
        setIntField(term1689, term1689.getClass(), "production", 2021136615);
        setField(term1689, term1689.getClass(), "province", null);
        Object term1692 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1692, term1692.getClass(), "name", null);
        setIntField(term1692, term1692.getClass(), "cost", -1062304878);
        setIntField(term1692, term1692.getClass(), "production", -1377876610);
        setField(term1692, term1692.getClass(), "province", null);
        Object term1695 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1695, term1695.getClass(), "name", null);
        setIntField(term1695, term1695.getClass(), "cost", 0);
        setIntField(term1695, term1695.getClass(), "production", 0);
        setField(term1695, term1695.getClass(), "province", null);
        Object term1698 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1698, term1698.getClass(), "name", null);
        setIntField(term1698, term1698.getClass(), "cost", 0);
        setIntField(term1698, term1698.getClass(), "production", 0);
        setField(term1698, term1698.getClass(), "province", null);
        Object term1701 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1701, term1701.getClass(), "name", null);
        setIntField(term1701, term1701.getClass(), "cost", 1778570695);
        setIntField(term1701, term1701.getClass(), "production", -1142164411);
        setField(term1701, term1701.getClass(), "province", null);
        Object term1704 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1704, term1704.getClass(), "name", null);
        setIntField(term1704, term1704.getClass(), "cost", 1512541853);
        setIntField(term1704, term1704.getClass(), "production", -965421502);
        setField(term1704, term1704.getClass(), "province", null);
        ArrayList term1687 = new ArrayList();
        ((ArrayList) term1687).add(term1689);
        ((ArrayList) term1687).add(term1692);
        ((ArrayList) term1687).add(term1695);
        ((ArrayList) term1687).add(term1698);
        ((ArrayList) term1687).add(term1701);
        ((ArrayList) term1687).add(term1704);
        term1659 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1674 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1659, term1659.getClass(), "name", "sOdkipUKRu");
        setIntField(term1659, term1659.getClass(), "cost", -428988337);
        setIntField(term1659, term1659.getClass(), "production", 48047085);
        setField(term1674, term1674.getClass(), "name", "oKwCDqywym");
        setField(term1674, term1674.getClass(), "producers", term1687);
        setIntField(term1674, term1674.getClass(), "totalProduction", 469871899);
        setIntField(term1674, term1674.getClass(), "demand", -1348703436);
        setIntField(term1674, term1674.getClass(), "price", -2027012650);
        setField(term1659, term1659.getClass(), "province", term1674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Producer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProduction", argTypes, term1659, args);
    }

};


