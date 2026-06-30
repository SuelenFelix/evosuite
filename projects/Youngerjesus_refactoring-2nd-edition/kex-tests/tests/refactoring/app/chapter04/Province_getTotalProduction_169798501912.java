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

public class Province_getTotalProduction_169798501912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844;

    public Province_getTotalProduction_169798501912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term859 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term863 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term859, term859.getClass(), "name", "");
        setIntField(term859, term859.getClass(), "cost", 470895808);
        setIntField(term859, term859.getClass(), "production", 1787325291);
        setField(term863, term863.getClass(), "name", null);
        setField(term863, term863.getClass(), "producers", null);
        setIntField(term863, term863.getClass(), "totalProduction", 1163761623);
        setIntField(term863, term863.getClass(), "demand", 718742281);
        setIntField(term863, term863.getClass(), "price", 1532723756);
        setField(term859, term859.getClass(), "province", term863);
        Object term867 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term871 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term867, term867.getClass(), "name", "");
        setIntField(term867, term867.getClass(), "cost", -728760750);
        setIntField(term867, term867.getClass(), "production", -1617383807);
        setField(term871, term871.getClass(), "name", null);
        setField(term871, term871.getClass(), "producers", null);
        setIntField(term871, term871.getClass(), "totalProduction", -1698809299);
        setIntField(term871, term871.getClass(), "demand", 401512128);
        setIntField(term871, term871.getClass(), "price", -2069930777);
        setField(term867, term867.getClass(), "province", term871);
        Object term875 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term879 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term875, term875.getClass(), "name", "");
        setIntField(term875, term875.getClass(), "cost", 1470349147);
        setIntField(term875, term875.getClass(), "production", -255317272);
        setField(term879, term879.getClass(), "name", null);
        setField(term879, term879.getClass(), "producers", null);
        setIntField(term879, term879.getClass(), "totalProduction", -348612876);
        setIntField(term879, term879.getClass(), "demand", 1302807565);
        setIntField(term879, term879.getClass(), "price", -838848221);
        setField(term875, term875.getClass(), "province", term879);
        Object term883 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term887 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term883, term883.getClass(), "name", "");
        setIntField(term883, term883.getClass(), "cost", 1543696412);
        setIntField(term883, term883.getClass(), "production", -1385748168);
        setField(term887, term887.getClass(), "name", null);
        setField(term887, term887.getClass(), "producers", null);
        setIntField(term887, term887.getClass(), "totalProduction", 0);
        setIntField(term887, term887.getClass(), "demand", 0);
        setIntField(term887, term887.getClass(), "price", 0);
        setField(term883, term883.getClass(), "province", term887);
        ArrayList term857 = new ArrayList();
        ((ArrayList) term857).add(term859);
        ((ArrayList) term857).add(term867);
        ((ArrayList) term857).add(term875);
        ((ArrayList) term857).add(term875);
        ((ArrayList) term857).add(term883);
        term844 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term844, term844.getClass(), "name", "qYzsiuXOgS");
        setField(term844, term844.getClass(), "producers", term857);
        setIntField(term844, term844.getClass(), "totalProduction", -124088550);
        setIntField(term844, term844.getClass(), "demand", 777492093);
        setIntField(term844, term844.getClass(), "price", 1414025609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalProduction", argTypes, term844, args);
    }

};


