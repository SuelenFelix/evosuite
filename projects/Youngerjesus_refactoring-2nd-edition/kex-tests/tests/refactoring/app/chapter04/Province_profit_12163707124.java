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

public class Province_profit_12163707124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279;

    public Province_profit_12163707124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term294 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term298 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term294, term294.getClass(), "name", "");
        setIntField(term294, term294.getClass(), "cost", 413548937);
        setIntField(term294, term294.getClass(), "production", 1901317214);
        setField(term298, term298.getClass(), "name", null);
        setField(term298, term298.getClass(), "producers", null);
        setIntField(term298, term298.getClass(), "totalProduction", -1697741155);
        setIntField(term298, term298.getClass(), "demand", 1295839803);
        setIntField(term298, term298.getClass(), "price", -1891015523);
        setField(term294, term294.getClass(), "province", term298);
        ArrayList term292 = new ArrayList();
        ((ArrayList) term292).add(term294);
        term279 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term279, term279.getClass(), "name", "pORebkoRdD");
        setField(term279, term279.getClass(), "producers", term292);
        setIntField(term279, term279.getClass(), "totalProduction", -1560631747);
        setIntField(term279, term279.getClass(), "demand", 1215150180);
        setIntField(term279, term279.getClass(), "price", -1422859977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "profit", argTypes, term279, args);
    }

};


