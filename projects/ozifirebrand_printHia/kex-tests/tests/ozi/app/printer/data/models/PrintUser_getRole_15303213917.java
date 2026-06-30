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

public class PrintUser_getRole_15303213917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5857;

    public PrintUser_getRole_15303213917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6038 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term6037 = ((Class) term6038).getDeclaredField((String) "ADMIN");
        ((Field) term6037).setAccessible(true);
        Object enum22 = ((Field) term6037).get((Object) null);
        Class<? extends Object> term6220 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term6219 = ((Class) term6220).getDeclaredField((String) "DELIVERED");
        ((Field) term6219).setAccessible(true);
        Object enum23 = ((Field) term6219).get((Object) null);
        Object term5941 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term5947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5948 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5941, term5941.getClass(), "id", "");
        setField(term5941, term5941.getClass(), "imageUrl", "");
        setDoubleField(term5941, term5941.getClass(), "size", 0.13246999699526574);
        setIntField(term5941, term5941.getClass(), "quantity", -1179120542);
        setDoubleField(term5941, term5941.getClass(), "price", 0.9126850255993704);
        setField(term5947, term5947.getClass(), "date", null);
        setField(term5947, term5947.getClass(), "time", null);
        setField(term5941, term5941.getClass(), "orderDate", term5947);
        setField(term5948, term5948.getClass(), "date", null);
        setField(term5948, term5948.getClass(), "time", null);
        setField(term5941, term5941.getClass(), "deliveryDate", term5948);
        setBooleanField(term5941, term5941.getClass(), "ordered", true);
        setField(term5941, term5941.getClass(), "userId", "");
        setField(term5941, term5941.getClass(), "orderStatus", enum23);
        Class<? extends Object> term6449 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term6448 = ((Class) term6449).getDeclaredField((String) "PENDING");
        ((Field) term6448).setAccessible(true);
        Object enum24 = ((Field) term6448).get((Object) null);
        Object term5953 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term5959 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5960 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5953, term5953.getClass(), "id", "");
        setField(term5953, term5953.getClass(), "imageUrl", "");
        setDoubleField(term5953, term5953.getClass(), "size", 0.11179067076100713);
        setIntField(term5953, term5953.getClass(), "quantity", -73683645);
        setDoubleField(term5953, term5953.getClass(), "price", 0.5306473989087822);
        setField(term5959, term5959.getClass(), "date", null);
        setField(term5959, term5959.getClass(), "time", null);
        setField(term5953, term5953.getClass(), "orderDate", term5959);
        setField(term5960, term5960.getClass(), "date", null);
        setField(term5960, term5960.getClass(), "time", null);
        setField(term5953, term5953.getClass(), "deliveryDate", term5960);
        setBooleanField(term5953, term5953.getClass(), "ordered", true);
        setField(term5953, term5953.getClass(), "userId", "");
        setField(term5953, term5953.getClass(), "orderStatus", enum24);
        Object term5965 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term5971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5972 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5965, term5965.getClass(), "id", "");
        setField(term5965, term5965.getClass(), "imageUrl", "");
        setDoubleField(term5965, term5965.getClass(), "size", 0.022483645678509023);
        setIntField(term5965, term5965.getClass(), "quantity", -226514366);
        setDoubleField(term5965, term5965.getClass(), "price", 0.025133051616627267);
        setField(term5971, term5971.getClass(), "date", null);
        setField(term5971, term5971.getClass(), "time", null);
        setField(term5965, term5965.getClass(), "orderDate", term5971);
        setField(term5972, term5972.getClass(), "date", null);
        setField(term5972, term5972.getClass(), "time", null);
        setField(term5965, term5965.getClass(), "deliveryDate", term5972);
        setBooleanField(term5965, term5965.getClass(), "ordered", true);
        setField(term5965, term5965.getClass(), "userId", "");
        setField(term5965, term5965.getClass(), "orderStatus", enum23);
        ArrayList term5939 = new ArrayList();
        ((ArrayList) term5939).add(term5941);
        ((ArrayList) term5939).add(term5953);
        ((ArrayList) term5939).add(term5965);
        term5857 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term5857, term5857.getClass(), "id", "OJJtVNPyKZ");
        setField(term5857, term5857.getClass(), "firstName", "AKNapTAfmD");
        setField(term5857, term5857.getClass(), "lastName", "xJgPlLxpgC");
        setField(term5857, term5857.getClass(), "password", "EYtfuJaxiM");
        setField(term5857, term5857.getClass(), "phoneNumber", "gCWtLVKVVe");
        setField(term5857, term5857.getClass(), "email", "fWKJoSoCwE");
        setField(term5857, term5857.getClass(), "role", enum22);
        setField(term5857, term5857.getClass(), "orders", term5939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term5857, args);
    }

};


