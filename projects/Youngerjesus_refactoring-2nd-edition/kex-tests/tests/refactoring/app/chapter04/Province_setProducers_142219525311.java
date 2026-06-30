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
import java.util.LinkedList;

public class Province_setProducers_142219525311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term795;
     Object term831;

    public Province_setProducers_142219525311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term810 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term814 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term810, term810.getClass(), "name", "");
        setIntField(term810, term810.getClass(), "cost", -1224443634);
        setIntField(term810, term810.getClass(), "production", 1048451946);
        setField(term814, term814.getClass(), "name", null);
        setField(term814, term814.getClass(), "producers", null);
        setIntField(term814, term814.getClass(), "totalProduction", -457396133);
        setIntField(term814, term814.getClass(), "demand", -1793950607);
        setIntField(term814, term814.getClass(), "price", 1091954101);
        setField(term810, term810.getClass(), "province", term814);
        Object term818 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term822 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term818, term818.getClass(), "name", "");
        setIntField(term818, term818.getClass(), "cost", -1912429941);
        setIntField(term818, term818.getClass(), "production", 1801052257);
        setField(term822, term822.getClass(), "name", null);
        setField(term822, term822.getClass(), "producers", null);
        setIntField(term822, term822.getClass(), "totalProduction", 0);
        setIntField(term822, term822.getClass(), "demand", 0);
        setIntField(term822, term822.getClass(), "price", 0);
        setField(term818, term818.getClass(), "province", term822);
        ArrayList term808 = new ArrayList();
        ((ArrayList) term808).add(term810);
        ((ArrayList) term808).add(term818);
        term795 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term795, term795.getClass(), "name", "OcJCIDNIXA");
        setField(term795, term795.getClass(), "producers", term808);
        setIntField(term795, term795.getClass(), "totalProduction", 1895143076);
        setIntField(term795, term795.getClass(), "demand", 1981860404);
        setIntField(term795, term795.getClass(), "price", 732174235);
        term831 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term831;
        callMethod(klass, "setProducers", argTypes, term795, args);
    }

};


