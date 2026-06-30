package ozi.app.printer.data.models;

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
import static ozi.app.printer.data.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PrintUser_getFirstName_14861722292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1253;

    public PrintUser_getFirstName_14861722292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1445 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term1444 = ((Class) term1445).getDeclaredField((String) "USER");
        ((Field) term1444).setAccessible(true);
        Object enum5 = ((Field) term1444).get((Object) null);
        Class<? extends Object> term1624 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term1623 = ((Class) term1624).getDeclaredField((String) "ORDERED");
        ((Field) term1623).setAccessible(true);
        Object enum6 = ((Field) term1623).get((Object) null);
        Object term1336 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term1342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1343 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term1336, term1336.getClass(), "id", "");
        setField(term1336, term1336.getClass(), "imageUrl", "");
        setDoubleField(term1336, term1336.getClass(), "size", 0.6076495596892013);
        setIntField(term1336, term1336.getClass(), "quantity", -1922583790);
        setDoubleField(term1336, term1336.getClass(), "price", 0.37773193782763337);
        setField(term1342, term1342.getClass(), "date", null);
        setField(term1342, term1342.getClass(), "time", null);
        setField(term1336, term1336.getClass(), "orderDate", term1342);
        setField(term1343, term1343.getClass(), "date", null);
        setField(term1343, term1343.getClass(), "time", null);
        setField(term1336, term1336.getClass(), "deliveryDate", term1343);
        setBooleanField(term1336, term1336.getClass(), "ordered", true);
        setField(term1336, term1336.getClass(), "userId", "");
        setField(term1336, term1336.getClass(), "orderStatus", enum6);
        Class<? extends Object> term1847 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term1846 = ((Class) term1847).getDeclaredField((String) "ORDERED");
        ((Field) term1846).setAccessible(true);
        Object enum7 = ((Field) term1846).get((Object) null);
        Object term1348 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term1354 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1355 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term1348, term1348.getClass(), "id", "");
        setField(term1348, term1348.getClass(), "imageUrl", "");
        setDoubleField(term1348, term1348.getClass(), "size", 0.8474802076607362);
        setIntField(term1348, term1348.getClass(), "quantity", -616727354);
        setDoubleField(term1348, term1348.getClass(), "price", 0.5183269973490326);
        setField(term1354, term1354.getClass(), "date", null);
        setField(term1354, term1354.getClass(), "time", null);
        setField(term1348, term1348.getClass(), "orderDate", term1354);
        setField(term1355, term1355.getClass(), "date", null);
        setField(term1355, term1355.getClass(), "time", null);
        setField(term1348, term1348.getClass(), "deliveryDate", term1355);
        setBooleanField(term1348, term1348.getClass(), "ordered", true);
        setField(term1348, term1348.getClass(), "userId", "");
        setField(term1348, term1348.getClass(), "orderStatus", enum7);
        Class<? extends Object> term2070 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term2069 = ((Class) term2070).getDeclaredField((String) "PENDING");
        ((Field) term2069).setAccessible(true);
        Object enum8 = ((Field) term2069).get((Object) null);
        Object term1360 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term1366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1367 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term1360, term1360.getClass(), "id", "");
        setField(term1360, term1360.getClass(), "imageUrl", "");
        setDoubleField(term1360, term1360.getClass(), "size", 0.7655020693602768);
        setIntField(term1360, term1360.getClass(), "quantity", -1955890973);
        setDoubleField(term1360, term1360.getClass(), "price", 0.1374549299694151);
        setField(term1366, term1366.getClass(), "date", null);
        setField(term1366, term1366.getClass(), "time", null);
        setField(term1360, term1360.getClass(), "orderDate", term1366);
        setField(term1367, term1367.getClass(), "date", null);
        setField(term1367, term1367.getClass(), "time", null);
        setField(term1360, term1360.getClass(), "deliveryDate", term1367);
        setBooleanField(term1360, term1360.getClass(), "ordered", true);
        setField(term1360, term1360.getClass(), "userId", "");
        setField(term1360, term1360.getClass(), "orderStatus", enum8);
        Object term1372 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term1378 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1379 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term1372, term1372.getClass(), "id", "");
        setField(term1372, term1372.getClass(), "imageUrl", "");
        setDoubleField(term1372, term1372.getClass(), "size", 0.7031006357544823);
        setIntField(term1372, term1372.getClass(), "quantity", -2038273078);
        setDoubleField(term1372, term1372.getClass(), "price", 0.9527281779865117);
        setField(term1378, term1378.getClass(), "date", null);
        setField(term1378, term1378.getClass(), "time", null);
        setField(term1372, term1372.getClass(), "orderDate", term1378);
        setField(term1379, term1379.getClass(), "date", null);
        setField(term1379, term1379.getClass(), "time", null);
        setField(term1372, term1372.getClass(), "deliveryDate", term1379);
        setBooleanField(term1372, term1372.getClass(), "ordered", true);
        setField(term1372, term1372.getClass(), "userId", "");
        setField(term1372, term1372.getClass(), "orderStatus", enum6);
        ArrayList term1334 = new ArrayList();
        ((ArrayList) term1334).add(term1336);
        ((ArrayList) term1334).add(term1348);
        ((ArrayList) term1334).add(term1360);
        ((ArrayList) term1334).add(term1372);
        term1253 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term1253, term1253.getClass(), "id", "pCTimMblYc");
        setField(term1253, term1253.getClass(), "firstName", "hNxWaHcfhY");
        setField(term1253, term1253.getClass(), "lastName", "RkybSrpybU");
        setField(term1253, term1253.getClass(), "password", "xOEqzGAmDU");
        setField(term1253, term1253.getClass(), "phoneNumber", "eZFUvlxvGV");
        setField(term1253, term1253.getClass(), "email", "BYqFIqCKAV");
        setField(term1253, term1253.getClass(), "role", enum5);
        setField(term1253, term1253.getClass(), "orders", term1334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term1253, args);
    }

};


