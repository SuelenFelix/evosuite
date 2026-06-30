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

public class Province_demandValue_17465444425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317;

    public Province_demandValue_17465444425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term332 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term336 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term332, term332.getClass(), "name", "");
        setIntField(term332, term332.getClass(), "cost", -1972436591);
        setIntField(term332, term332.getClass(), "production", 68922753);
        setField(term336, term336.getClass(), "name", null);
        setField(term336, term336.getClass(), "producers", null);
        setIntField(term336, term336.getClass(), "totalProduction", -220791533);
        setIntField(term336, term336.getClass(), "demand", 1741500243);
        setIntField(term336, term336.getClass(), "price", -2070466617);
        setField(term332, term332.getClass(), "province", term336);
        Object term340 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term344 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term340, term340.getClass(), "name", "");
        setIntField(term340, term340.getClass(), "cost", -1127721881);
        setIntField(term340, term340.getClass(), "production", 1074848808);
        setField(term344, term344.getClass(), "name", null);
        setField(term344, term344.getClass(), "producers", null);
        setIntField(term344, term344.getClass(), "totalProduction", -1553893255);
        setIntField(term344, term344.getClass(), "demand", 1303442927);
        setIntField(term344, term344.getClass(), "price", 794568325);
        setField(term340, term340.getClass(), "province", term344);
        Object term348 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term352 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term348, term348.getClass(), "name", "");
        setIntField(term348, term348.getClass(), "cost", -1813280137);
        setIntField(term348, term348.getClass(), "production", 719656595);
        setField(term352, term352.getClass(), "name", null);
        setField(term352, term352.getClass(), "producers", null);
        setIntField(term352, term352.getClass(), "totalProduction", 0);
        setIntField(term352, term352.getClass(), "demand", 0);
        setIntField(term352, term352.getClass(), "price", 0);
        setField(term348, term348.getClass(), "province", term352);
        Object term356 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term360 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term356, term356.getClass(), "name", "");
        setIntField(term356, term356.getClass(), "cost", 533197381);
        setIntField(term356, term356.getClass(), "production", 1048271679);
        setField(term360, term360.getClass(), "name", null);
        setField(term360, term360.getClass(), "producers", null);
        setIntField(term360, term360.getClass(), "totalProduction", 1116576792);
        setIntField(term360, term360.getClass(), "demand", -942194446);
        setIntField(term360, term360.getClass(), "price", -938508470);
        setField(term356, term356.getClass(), "province", term360);
        Object term364 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term368 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term364, term364.getClass(), "name", "");
        setIntField(term364, term364.getClass(), "cost", -1529797673);
        setIntField(term364, term364.getClass(), "production", -868676396);
        setField(term368, term368.getClass(), "name", null);
        setField(term368, term368.getClass(), "producers", null);
        setIntField(term368, term368.getClass(), "totalProduction", 1922684808);
        setIntField(term368, term368.getClass(), "demand", -2005784375);
        setIntField(term368, term368.getClass(), "price", -288604325);
        setField(term364, term364.getClass(), "province", term368);
        Object term372 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term372, term372.getClass(), "name", "");
        setIntField(term372, term372.getClass(), "cost", -1332748804);
        setIntField(term372, term372.getClass(), "production", 1774507971);
        setField(term372, term372.getClass(), "province", term352);
        ArrayList term330 = new ArrayList();
        ((ArrayList) term330).add(term332);
        ((ArrayList) term330).add(term340);
        ((ArrayList) term330).add(term348);
        ((ArrayList) term330).add(term356);
        ((ArrayList) term330).add(term364);
        ((ArrayList) term330).add(term364);
        ((ArrayList) term330).add(term340);
        ((ArrayList) term330).add(term372);
        term317 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term317, term317.getClass(), "name", "fWKJoSoCwE");
        setField(term317, term317.getClass(), "producers", term330);
        setIntField(term317, term317.getClass(), "totalProduction", -434468428);
        setIntField(term317, term317.getClass(), "demand", 1559605714);
        setIntField(term317, term317.getClass(), "price", 1146601902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "demandValue", argTypes, term317, args);
    }

};


