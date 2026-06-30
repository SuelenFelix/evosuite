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

public class Producer_getName_2741207922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1367;

    public Producer_getName_2741207922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1397 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1397, term1397.getClass(), "name", null);
        setIntField(term1397, term1397.getClass(), "cost", 1865070548);
        setIntField(term1397, term1397.getClass(), "production", 1904515443);
        setField(term1397, term1397.getClass(), "province", null);
        Object term1400 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1400, term1400.getClass(), "name", null);
        setIntField(term1400, term1400.getClass(), "cost", 0);
        setIntField(term1400, term1400.getClass(), "production", 0);
        setField(term1400, term1400.getClass(), "province", null);
        Object term1403 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1403, term1403.getClass(), "name", null);
        setIntField(term1403, term1403.getClass(), "cost", 0);
        setIntField(term1403, term1403.getClass(), "production", 0);
        setField(term1403, term1403.getClass(), "province", null);
        Object term1406 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1406, term1406.getClass(), "name", null);
        setIntField(term1406, term1406.getClass(), "cost", -355769268);
        setIntField(term1406, term1406.getClass(), "production", -114460662);
        setField(term1406, term1406.getClass(), "province", null);
        Object term1409 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1409, term1409.getClass(), "name", null);
        setIntField(term1409, term1409.getClass(), "cost", -355376034);
        setIntField(term1409, term1409.getClass(), "production", 588390599);
        setField(term1409, term1409.getClass(), "province", null);
        ArrayList term1395 = new ArrayList();
        ((ArrayList) term1395).add(term1397);
        ((ArrayList) term1395).add(term1400);
        ((ArrayList) term1395).add(term1403);
        ((ArrayList) term1395).add(term1403);
        ((ArrayList) term1395).add(term1406);
        ((ArrayList) term1395).add(term1409);
        ((ArrayList) term1395).add(term1409);
        ((ArrayList) term1395).add(term1397);
        term1367 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1382 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1367, term1367.getClass(), "name", "dAldIGYAXV");
        setIntField(term1367, term1367.getClass(), "cost", -752378450);
        setIntField(term1367, term1367.getClass(), "production", 848907965);
        setField(term1382, term1382.getClass(), "name", "mLwibAPEsa");
        setField(term1382, term1382.getClass(), "producers", term1395);
        setIntField(term1382, term1382.getClass(), "totalProduction", 154111854);
        setIntField(term1382, term1382.getClass(), "demand", 710986341);
        setIntField(term1382, term1382.getClass(), "price", -873958002);
        setField(term1367, term1367.getClass(), "province", term1382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Producer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1367, args);
    }

};


