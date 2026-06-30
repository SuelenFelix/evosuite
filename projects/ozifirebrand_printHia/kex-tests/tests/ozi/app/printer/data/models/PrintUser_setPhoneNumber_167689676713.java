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

public class PrintUser_setPhoneNumber_167689676713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10339;

    public PrintUser_setPhoneNumber_167689676713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10563 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term10562 = ((Class) term10563).getDeclaredField((String) "USER");
        ((Field) term10562).setAccessible(true);
        Object enum38 = ((Field) term10562).get((Object) null);
        Class<? extends Object> term10742 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term10741 = ((Class) term10742).getDeclaredField((String) "DELIVERED");
        ((Field) term10741).setAccessible(true);
        Object enum39 = ((Field) term10741).get((Object) null);
        Object term10422 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term10428 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10429 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term10422, term10422.getClass(), "id", "");
        setField(term10422, term10422.getClass(), "imageUrl", "");
        setDoubleField(term10422, term10422.getClass(), "size", 0.16988691727397487);
        setIntField(term10422, term10422.getClass(), "quantity", -1968847291);
        setDoubleField(term10422, term10422.getClass(), "price", 0.39286935532362843);
        setField(term10428, term10428.getClass(), "date", null);
        setField(term10428, term10428.getClass(), "time", null);
        setField(term10422, term10422.getClass(), "orderDate", term10428);
        setField(term10429, term10429.getClass(), "date", null);
        setField(term10429, term10429.getClass(), "time", null);
        setField(term10422, term10422.getClass(), "deliveryDate", term10429);
        setBooleanField(term10422, term10422.getClass(), "ordered", true);
        setField(term10422, term10422.getClass(), "userId", "");
        setField(term10422, term10422.getClass(), "orderStatus", enum39);
        Class<? extends Object> term10971 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term10970 = ((Class) term10971).getDeclaredField((String) "ORDERED");
        ((Field) term10970).setAccessible(true);
        Object enum40 = ((Field) term10970).get((Object) null);
        Object term10434 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term10440 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10441 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term10434, term10434.getClass(), "id", "");
        setField(term10434, term10434.getClass(), "imageUrl", "");
        setDoubleField(term10434, term10434.getClass(), "size", 0.11577948268926874);
        setIntField(term10434, term10434.getClass(), "quantity", 579005622);
        setDoubleField(term10434, term10434.getClass(), "price", 0.5617009352394552);
        setField(term10440, term10440.getClass(), "date", null);
        setField(term10440, term10440.getClass(), "time", null);
        setField(term10434, term10434.getClass(), "orderDate", term10440);
        setField(term10441, term10441.getClass(), "date", null);
        setField(term10441, term10441.getClass(), "time", null);
        setField(term10434, term10434.getClass(), "deliveryDate", term10441);
        setBooleanField(term10434, term10434.getClass(), "ordered", false);
        setField(term10434, term10434.getClass(), "userId", "");
        setField(term10434, term10434.getClass(), "orderStatus", enum40);
        Class<? extends Object> term11194 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term11193 = ((Class) term11194).getDeclaredField((String) "DELIVERED");
        ((Field) term11193).setAccessible(true);
        Object enum41 = ((Field) term11193).get((Object) null);
        Object term10446 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term10452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10453 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term10446, term10446.getClass(), "id", "");
        setField(term10446, term10446.getClass(), "imageUrl", "");
        setDoubleField(term10446, term10446.getClass(), "size", 0.09067063848644474);
        setIntField(term10446, term10446.getClass(), "quantity", -14890619);
        setDoubleField(term10446, term10446.getClass(), "price", 0.268304014379393);
        setField(term10452, term10452.getClass(), "date", null);
        setField(term10452, term10452.getClass(), "time", null);
        setField(term10446, term10446.getClass(), "orderDate", term10452);
        setField(term10453, term10453.getClass(), "date", null);
        setField(term10453, term10453.getClass(), "time", null);
        setField(term10446, term10446.getClass(), "deliveryDate", term10453);
        setBooleanField(term10446, term10446.getClass(), "ordered", true);
        setField(term10446, term10446.getClass(), "userId", "");
        setField(term10446, term10446.getClass(), "orderStatus", enum41);
        Object term10458 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term10464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10465 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term10458, term10458.getClass(), "id", "");
        setField(term10458, term10458.getClass(), "imageUrl", "");
        setDoubleField(term10458, term10458.getClass(), "size", 0.7171972879282721);
        setIntField(term10458, term10458.getClass(), "quantity", 1632125673);
        setDoubleField(term10458, term10458.getClass(), "price", 0.9006361024877096);
        setField(term10464, term10464.getClass(), "date", null);
        setField(term10464, term10464.getClass(), "time", null);
        setField(term10458, term10458.getClass(), "orderDate", term10464);
        setField(term10465, term10465.getClass(), "date", null);
        setField(term10465, term10465.getClass(), "time", null);
        setField(term10458, term10458.getClass(), "deliveryDate", term10465);
        setBooleanField(term10458, term10458.getClass(), "ordered", false);
        setField(term10458, term10458.getClass(), "userId", "");
        setField(term10458, term10458.getClass(), "orderStatus", enum39);
        Object term10468 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term10474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10475 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term10468, term10468.getClass(), "id", "");
        setField(term10468, term10468.getClass(), "imageUrl", "");
        setDoubleField(term10468, term10468.getClass(), "size", 0.5644914462415626);
        setIntField(term10468, term10468.getClass(), "quantity", 454281060);
        setDoubleField(term10468, term10468.getClass(), "price", 0.509895859167191);
        setField(term10474, term10474.getClass(), "date", null);
        setField(term10474, term10474.getClass(), "time", null);
        setField(term10468, term10468.getClass(), "orderDate", term10474);
        setField(term10475, term10475.getClass(), "date", null);
        setField(term10475, term10475.getClass(), "time", null);
        setField(term10468, term10468.getClass(), "deliveryDate", term10475);
        setBooleanField(term10468, term10468.getClass(), "ordered", false);
        setField(term10468, term10468.getClass(), "userId", "");
        setField(term10468, term10468.getClass(), "orderStatus", enum40);
        Object term10478 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term10484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10485 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term10478, term10478.getClass(), "id", "");
        setField(term10478, term10478.getClass(), "imageUrl", "");
        setDoubleField(term10478, term10478.getClass(), "size", 0.07417792024383196);
        setIntField(term10478, term10478.getClass(), "quantity", -1786399638);
        setDoubleField(term10478, term10478.getClass(), "price", 0.686293604788188);
        setField(term10484, term10484.getClass(), "date", null);
        setField(term10484, term10484.getClass(), "time", null);
        setField(term10478, term10478.getClass(), "orderDate", term10484);
        setField(term10485, term10485.getClass(), "date", null);
        setField(term10485, term10485.getClass(), "time", null);
        setField(term10478, term10478.getClass(), "deliveryDate", term10485);
        setBooleanField(term10478, term10478.getClass(), "ordered", true);
        setField(term10478, term10478.getClass(), "userId", "");
        setField(term10478, term10478.getClass(), "orderStatus", enum41);
        ArrayList term10420 = new ArrayList();
        ((ArrayList) term10420).add(term10422);
        ((ArrayList) term10420).add(term10434);
        ((ArrayList) term10420).add(term10446);
        ((ArrayList) term10420).add(term10458);
        ((ArrayList) term10420).add(term10468);
        ((ArrayList) term10420).add(term10478);
        term10339 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term10339, term10339.getClass(), "id", "CFyoseFGLF");
        setField(term10339, term10339.getClass(), "firstName", "SFqCrhEWLm");
        setField(term10339, term10339.getClass(), "lastName", "GZdcJyZntS");
        setField(term10339, term10339.getClass(), "password", "OIHoJeysUi");
        setField(term10339, term10339.getClass(), "phoneNumber", "WXMWFDGcLB");
        setField(term10339, term10339.getClass(), "email", "wKWbJssZuG");
        setField(term10339, term10339.getClass(), "role", enum38);
        setField(term10339, term10339.getClass(), "orders", term10420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WBAOTqErtm";
        callMethod(klass, "setPhoneNumber", argTypes, term10339, args);
    }

};


