package legacyfighter.dietary;

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
import static legacyfighter.dietary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class Order_getItems_5575045910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1349;

    public Order_getItems_5575045910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1350 = new Long(-2644215923136513282L);
        Class<? extends Object> term1498 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term1497 = ((Class) term1498).getDeclaredField((String) "Returned");
        ((Field) term1497).setAccessible(true);
        Object enum1 = ((Field) term1497).get((Object) null);
        Class<? extends Object> term1790 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term1789 = ((Class) term1790).getDeclaredField((String) "Regular_Batch");
        ((Field) term1789).setAccessible(true);
        Object enum2 = ((Field) term1789).get((Object) null);
        Long term1382 = new Long(-1468719814009985452L);
        HashMap term1385 = new HashMap();
        Set<Object> term2020 =  ((Map) term1385).keySet();
        HashSet term1384 = new HashSet((Collection<? extends Object>) term2020);
        Long term1404 = new Long(682356318767179819L);
        Class<? extends Object> term2042 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term2041 = ((Class) term2042).getDeclaredField((String) "Person");
        ((Field) term2041).setAccessible(true);
        Object enum3 = ((Field) term2041).get((Object) null);
        HashMap term1424 = new HashMap();
        Set<Object> term2241 =  ((Map) term1424).keySet();
        HashSet term1423 = new HashSet((Collection<? extends Object>) term2241);
        Object term1432 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        setField(term1432, term1432.getClass(), "id", null);
        setField(term1432, term1432.getClass(), "price", null);
        setField(term1432, term1432.getClass(), "order", null);
        setField(term1432, term1432.getClass(), "product", null);
        setIntField(term1432, term1432.getClass(), "quantity", 0);
        Object term1434 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        setField(term1434, term1434.getClass(), "id", null);
        setField(term1434, term1434.getClass(), "price", null);
        setField(term1434, term1434.getClass(), "order", null);
        setField(term1434, term1434.getClass(), "product", null);
        setIntField(term1434, term1434.getClass(), "quantity", 0);
        Object term1436 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        setField(term1436, term1436.getClass(), "id", null);
        setField(term1436, term1436.getClass(), "price", null);
        setField(term1436, term1436.getClass(), "order", null);
        setField(term1436, term1436.getClass(), "product", null);
        setIntField(term1436, term1436.getClass(), "quantity", 0);
        Object term1438 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        setField(term1438, term1438.getClass(), "id", null);
        setField(term1438, term1438.getClass(), "price", null);
        setField(term1438, term1438.getClass(), "order", null);
        setField(term1438, term1438.getClass(), "product", null);
        setIntField(term1438, term1438.getClass(), "quantity", 0);
        Object term1440 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        setField(term1440, term1440.getClass(), "id", null);
        setField(term1440, term1440.getClass(), "price", null);
        setField(term1440, term1440.getClass(), "order", null);
        setField(term1440, term1440.getClass(), "product", null);
        setIntField(term1440, term1440.getClass(), "quantity", 0);
        Object term1442 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        setField(term1442, term1442.getClass(), "id", null);
        setField(term1442, term1442.getClass(), "price", null);
        setField(term1442, term1442.getClass(), "order", null);
        setField(term1442, term1442.getClass(), "product", null);
        setIntField(term1442, term1442.getClass(), "quantity", 0);
        ArrayList term1430 = new ArrayList();
        ((ArrayList) term1430).add(term1432);
        ((ArrayList) term1430).add(term1434);
        ((ArrayList) term1430).add(term1436);
        ((ArrayList) term1430).add(term1438);
        ((ArrayList) term1430).add(term1440);
        ((ArrayList) term1430).add(term1442);
        ((ArrayList) term1430).add(term1438);
        ((ArrayList) term1430).add(term1434);
        ArrayList term1446 = new ArrayList();
        term1349 = newInstance(Class.forName("legacyfighter.dietary.Order"));
        Object term1381 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term1403 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term1421 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term1422 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term1450 = newInstance(Class.forName("java.time.Instant"));
        setField(term1349, term1349.getClass(), "id", term1350);
        setField(term1349, term1349.getClass(), "orderState", enum1);
        setField(term1349, term1349.getClass(), "orderType", enum2);
        setField(term1381, term1381.getClass(), "id", term1382);
        setField(term1381, term1381.getClass(), "orders", term1384);
        setField(term1381, term1381.getClass(), "description", "kBdSllIBVz");
        setField(term1403, term1403.getClass(), "id", term1404);
        setField(term1403, term1403.getClass(), "name", "TJmVBGfTML");
        setField(term1403, term1403.getClass(), "type", enum3);
        setField(term1421, term1421.getClass(), "id", null);
        setField(term1421, term1421.getClass(), "orders", null);
        setField(term1421, term1421.getClass(), "description", null);
        setField(term1421, term1421.getClass(), "customer", null);
        setField(term1421, term1421.getClass(), "parent", null);
        setField(term1421, term1421.getClass(), "childs", null);
        setField(term1403, term1403.getClass(), "customerOrderGroup", term1421);
        setField(term1381, term1381.getClass(), "customer", term1403);
        setField(term1422, term1422.getClass(), "id", null);
        setField(term1422, term1422.getClass(), "orders", null);
        setField(term1422, term1422.getClass(), "description", null);
        setField(term1422, term1422.getClass(), "customer", null);
        setField(term1422, term1422.getClass(), "parent", null);
        setField(term1422, term1422.getClass(), "childs", null);
        setField(term1381, term1381.getClass(), "parent", term1422);
        setField(term1381, term1381.getClass(), "childs", term1423);
        setField(term1349, term1349.getClass(), "customerOrderGroup", term1381);
        setField(term1349, term1349.getClass(), "items", term1430);
        setField(term1349, term1349.getClass(), "taxRules", term1446);
        setLongField(term1450, term1450.getClass(), "seconds", 1630952644L);
        setIntField(term1450, term1450.getClass(), "nanos", 759000000);
        setField(term1349, term1349.getClass(), "confirmationTimestamp", term1450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItems", argTypes, term1349, args);
    }

};


