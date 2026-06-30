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

public class PrintUser_getPhoneNumber_17799475835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4231;

    public PrintUser_getPhoneNumber_17799475835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4444 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term4443 = ((Class) term4444).getDeclaredField((String) "ADMIN");
        ((Field) term4443).setAccessible(true);
        Object enum16 = ((Field) term4443).get((Object) null);
        Class<? extends Object> term4626 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term4625 = ((Class) term4626).getDeclaredField((String) "ORDERED");
        ((Field) term4625).setAccessible(true);
        Object enum17 = ((Field) term4625).get((Object) null);
        Object term4315 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term4321 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4322 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4315, term4315.getClass(), "id", "");
        setField(term4315, term4315.getClass(), "imageUrl", "");
        setDoubleField(term4315, term4315.getClass(), "size", 0.7591353014991907);
        setIntField(term4315, term4315.getClass(), "quantity", -1007160944);
        setDoubleField(term4315, term4315.getClass(), "price", 0.791695029600875);
        setField(term4321, term4321.getClass(), "date", null);
        setField(term4321, term4321.getClass(), "time", null);
        setField(term4315, term4315.getClass(), "orderDate", term4321);
        setField(term4322, term4322.getClass(), "date", null);
        setField(term4322, term4322.getClass(), "time", null);
        setField(term4315, term4315.getClass(), "deliveryDate", term4322);
        setBooleanField(term4315, term4315.getClass(), "ordered", true);
        setField(term4315, term4315.getClass(), "userId", "");
        setField(term4315, term4315.getClass(), "orderStatus", enum17);
        Class<? extends Object> term4849 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term4848 = ((Class) term4849).getDeclaredField((String) "PENDING");
        ((Field) term4848).setAccessible(true);
        Object enum18 = ((Field) term4848).get((Object) null);
        Object term4327 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term4333 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4334 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4327, term4327.getClass(), "id", "");
        setField(term4327, term4327.getClass(), "imageUrl", "");
        setDoubleField(term4327, term4327.getClass(), "size", 0.6862221294683138);
        setIntField(term4327, term4327.getClass(), "quantity", 1135664017);
        setDoubleField(term4327, term4327.getClass(), "price", 0.15917839663695388);
        setField(term4333, term4333.getClass(), "date", null);
        setField(term4333, term4333.getClass(), "time", null);
        setField(term4327, term4327.getClass(), "orderDate", term4333);
        setField(term4334, term4334.getClass(), "date", null);
        setField(term4334, term4334.getClass(), "time", null);
        setField(term4327, term4327.getClass(), "deliveryDate", term4334);
        setBooleanField(term4327, term4327.getClass(), "ordered", false);
        setField(term4327, term4327.getClass(), "userId", "");
        setField(term4327, term4327.getClass(), "orderStatus", enum18);
        Object term4339 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term4345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4346 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4339, term4339.getClass(), "id", "");
        setField(term4339, term4339.getClass(), "imageUrl", "");
        setDoubleField(term4339, term4339.getClass(), "size", 0.9374115574082594);
        setIntField(term4339, term4339.getClass(), "quantity", 590364439);
        setDoubleField(term4339, term4339.getClass(), "price", 0.8454723071922143);
        setField(term4345, term4345.getClass(), "date", null);
        setField(term4345, term4345.getClass(), "time", null);
        setField(term4339, term4339.getClass(), "orderDate", term4345);
        setField(term4346, term4346.getClass(), "date", null);
        setField(term4346, term4346.getClass(), "time", null);
        setField(term4339, term4339.getClass(), "deliveryDate", term4346);
        setBooleanField(term4339, term4339.getClass(), "ordered", false);
        setField(term4339, term4339.getClass(), "userId", "");
        setField(term4339, term4339.getClass(), "orderStatus", enum18);
        Object term4349 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term4355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4356 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4349, term4349.getClass(), "id", "");
        setField(term4349, term4349.getClass(), "imageUrl", "");
        setDoubleField(term4349, term4349.getClass(), "size", 0.8566567697571895);
        setIntField(term4349, term4349.getClass(), "quantity", 865208305);
        setDoubleField(term4349, term4349.getClass(), "price", 0.9203805380592256);
        setField(term4355, term4355.getClass(), "date", null);
        setField(term4355, term4355.getClass(), "time", null);
        setField(term4349, term4349.getClass(), "orderDate", term4355);
        setField(term4356, term4356.getClass(), "date", null);
        setField(term4356, term4356.getClass(), "time", null);
        setField(term4349, term4349.getClass(), "deliveryDate", term4356);
        setBooleanField(term4349, term4349.getClass(), "ordered", false);
        setField(term4349, term4349.getClass(), "userId", "");
        setField(term4349, term4349.getClass(), "orderStatus", enum18);
        Object term4359 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term4365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4366 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4359, term4359.getClass(), "id", "");
        setField(term4359, term4359.getClass(), "imageUrl", "");
        setDoubleField(term4359, term4359.getClass(), "size", 0.5804948995371725);
        setIntField(term4359, term4359.getClass(), "quantity", -1275173084);
        setDoubleField(term4359, term4359.getClass(), "price", 0.20737514139742264);
        setField(term4365, term4365.getClass(), "date", null);
        setField(term4365, term4365.getClass(), "time", null);
        setField(term4359, term4359.getClass(), "orderDate", term4365);
        setField(term4366, term4366.getClass(), "date", null);
        setField(term4366, term4366.getClass(), "time", null);
        setField(term4359, term4359.getClass(), "deliveryDate", term4366);
        setBooleanField(term4359, term4359.getClass(), "ordered", true);
        setField(term4359, term4359.getClass(), "userId", "");
        setField(term4359, term4359.getClass(), "orderStatus", enum17);
        Class<? extends Object> term5072 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term5071 = ((Class) term5072).getDeclaredField((String) "PENDING");
        ((Field) term5071).setAccessible(true);
        Object enum19 = ((Field) term5071).get((Object) null);
        Object term4369 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term4375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4376 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4369, term4369.getClass(), "id", "");
        setField(term4369, term4369.getClass(), "imageUrl", "");
        setDoubleField(term4369, term4369.getClass(), "size", 0.7919370314903882);
        setIntField(term4369, term4369.getClass(), "quantity", -244121226);
        setDoubleField(term4369, term4369.getClass(), "price", 0.2109867221632754);
        setField(term4375, term4375.getClass(), "date", null);
        setField(term4375, term4375.getClass(), "time", null);
        setField(term4369, term4369.getClass(), "orderDate", term4375);
        setField(term4376, term4376.getClass(), "date", null);
        setField(term4376, term4376.getClass(), "time", null);
        setField(term4369, term4369.getClass(), "deliveryDate", term4376);
        setBooleanField(term4369, term4369.getClass(), "ordered", true);
        setField(term4369, term4369.getClass(), "userId", "");
        setField(term4369, term4369.getClass(), "orderStatus", enum19);
        ArrayList term4313 = new ArrayList();
        ((ArrayList) term4313).add(term4315);
        ((ArrayList) term4313).add(term4327);
        ((ArrayList) term4313).add(term4339);
        ((ArrayList) term4313).add(term4349);
        ((ArrayList) term4313).add(term4359);
        ((ArrayList) term4313).add(term4369);
        term4231 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term4231, term4231.getClass(), "id", "JiVRgTZvKc");
        setField(term4231, term4231.getClass(), "firstName", "XPKmummaqg");
        setField(term4231, term4231.getClass(), "lastName", "BKLfkLiZTH");
        setField(term4231, term4231.getClass(), "password", "SPpkrGcPRr");
        setField(term4231, term4231.getClass(), "phoneNumber", "sEccwbJKYE");
        setField(term4231, term4231.getClass(), "email", "AWRooQKkdW");
        setField(term4231, term4231.getClass(), "role", enum16);
        setField(term4231, term4231.getClass(), "orders", term4313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhoneNumber", argTypes, term4231, args);
    }

};


