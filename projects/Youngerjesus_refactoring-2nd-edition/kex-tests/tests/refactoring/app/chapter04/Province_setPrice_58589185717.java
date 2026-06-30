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
import java.lang.Integer;

public class Province_setPrice_58589185717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1110;
     Object term1154;

    public Province_setPrice_58589185717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1125 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1129 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1125, term1125.getClass(), "name", "");
        setIntField(term1125, term1125.getClass(), "cost", 1136393691);
        setIntField(term1125, term1125.getClass(), "production", -1288536479);
        setField(term1129, term1129.getClass(), "name", null);
        setField(term1129, term1129.getClass(), "producers", null);
        setIntField(term1129, term1129.getClass(), "totalProduction", -1272268399);
        setIntField(term1129, term1129.getClass(), "demand", 1120271104);
        setIntField(term1129, term1129.getClass(), "price", -128435804);
        setField(term1125, term1125.getClass(), "province", term1129);
        Object term1133 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1137 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1133, term1133.getClass(), "name", "");
        setIntField(term1133, term1133.getClass(), "cost", -2093862988);
        setIntField(term1133, term1133.getClass(), "production", 1337828646);
        setField(term1137, term1137.getClass(), "name", null);
        setField(term1137, term1137.getClass(), "producers", null);
        setIntField(term1137, term1137.getClass(), "totalProduction", 1478914037);
        setIntField(term1137, term1137.getClass(), "demand", 1630231519);
        setIntField(term1137, term1137.getClass(), "price", 1460702778);
        setField(term1133, term1133.getClass(), "province", term1137);
        Object term1141 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1145 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1141, term1141.getClass(), "name", "");
        setIntField(term1141, term1141.getClass(), "cost", -834193529);
        setIntField(term1141, term1141.getClass(), "production", 335780735);
        setField(term1145, term1145.getClass(), "name", null);
        setField(term1145, term1145.getClass(), "producers", null);
        setIntField(term1145, term1145.getClass(), "totalProduction", 0);
        setIntField(term1145, term1145.getClass(), "demand", 0);
        setIntField(term1145, term1145.getClass(), "price", 0);
        setField(term1141, term1141.getClass(), "province", term1145);
        ArrayList term1123 = new ArrayList();
        ((ArrayList) term1123).add(term1125);
        ((ArrayList) term1123).add(term1133);
        ((ArrayList) term1123).add(term1141);
        term1110 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1110, term1110.getClass(), "name", "zNFLXMifnS");
        setField(term1110, term1110.getClass(), "producers", term1123);
        setIntField(term1110, term1110.getClass(), "totalProduction", 2136158480);
        setIntField(term1110, term1110.getClass(), "demand", 2118747457);
        setIntField(term1110, term1110.getClass(), "price", 1868344256);
        term1154 = new Integer(1857693976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1154;
        callMethod(klass, "setPrice", argTypes, term1110, args);
    }

};


