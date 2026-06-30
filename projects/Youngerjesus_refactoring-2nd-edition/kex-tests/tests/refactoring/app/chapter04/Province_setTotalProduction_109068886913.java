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

public class Province_setTotalProduction_109068886913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906;
     Object term950;

    public Province_setTotalProduction_109068886913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term921 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term925 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term921, term921.getClass(), "name", "");
        setIntField(term921, term921.getClass(), "cost", 255145822);
        setIntField(term921, term921.getClass(), "production", -573608449);
        setField(term925, term925.getClass(), "name", null);
        setField(term925, term925.getClass(), "producers", null);
        setIntField(term925, term925.getClass(), "totalProduction", -1790275458);
        setIntField(term925, term925.getClass(), "demand", -497534255);
        setIntField(term925, term925.getClass(), "price", 1588942911);
        setField(term921, term921.getClass(), "province", term925);
        Object term929 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term933 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term929, term929.getClass(), "name", "");
        setIntField(term929, term929.getClass(), "cost", 1010721666);
        setIntField(term929, term929.getClass(), "production", 27043781);
        setField(term933, term933.getClass(), "name", null);
        setField(term933, term933.getClass(), "producers", null);
        setIntField(term933, term933.getClass(), "totalProduction", 633765954);
        setIntField(term933, term933.getClass(), "demand", 269110087);
        setIntField(term933, term933.getClass(), "price", 1545119095);
        setField(term929, term929.getClass(), "province", term933);
        Object term937 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term941 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term937, term937.getClass(), "name", "");
        setIntField(term937, term937.getClass(), "cost", 1104108112);
        setIntField(term937, term937.getClass(), "production", 1648665618);
        setField(term941, term941.getClass(), "name", null);
        setField(term941, term941.getClass(), "producers", null);
        setIntField(term941, term941.getClass(), "totalProduction", 993627098);
        setIntField(term941, term941.getClass(), "demand", 872295704);
        setIntField(term941, term941.getClass(), "price", 86041387);
        setField(term937, term937.getClass(), "province", term941);
        ArrayList term919 = new ArrayList();
        ((ArrayList) term919).add(term921);
        ((ArrayList) term919).add(term929);
        ((ArrayList) term919).add(term937);
        ((ArrayList) term919).add(term937);
        term906 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term906, term906.getClass(), "name", "onQLVONGuf");
        setField(term906, term906.getClass(), "producers", term919);
        setIntField(term906, term906.getClass(), "totalProduction", -2129828854);
        setIntField(term906, term906.getClass(), "demand", -47438786);
        setIntField(term906, term906.getClass(), "price", -1955400589);
        term950 = new Integer(626179200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term950;
        callMethod(klass, "setTotalProduction", argTypes, term906, args);
    }

};


