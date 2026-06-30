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

public class PrintUser_setEmail_199941721014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11432;

    public PrintUser_setEmail_199941721014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11637 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term11636 = ((Class) term11637).getDeclaredField((String) "ADMIN");
        ((Field) term11636).setAccessible(true);
        Object enum42 = ((Field) term11636).get((Object) null);
        Class<? extends Object> term11819 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term11818 = ((Class) term11819).getDeclaredField((String) "ORDERED");
        ((Field) term11818).setAccessible(true);
        Object enum43 = ((Field) term11818).get((Object) null);
        Object term11516 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term11522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11523 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term11516, term11516.getClass(), "id", "");
        setField(term11516, term11516.getClass(), "imageUrl", "");
        setDoubleField(term11516, term11516.getClass(), "size", 0.12764449157430724);
        setIntField(term11516, term11516.getClass(), "quantity", 2055867847);
        setDoubleField(term11516, term11516.getClass(), "price", 0.39446728256884744);
        setField(term11522, term11522.getClass(), "date", null);
        setField(term11522, term11522.getClass(), "time", null);
        setField(term11516, term11516.getClass(), "orderDate", term11522);
        setField(term11523, term11523.getClass(), "date", null);
        setField(term11523, term11523.getClass(), "time", null);
        setField(term11516, term11516.getClass(), "deliveryDate", term11523);
        setBooleanField(term11516, term11516.getClass(), "ordered", false);
        setField(term11516, term11516.getClass(), "userId", "");
        setField(term11516, term11516.getClass(), "orderStatus", enum43);
        Class<? extends Object> term12042 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term12041 = ((Class) term12042).getDeclaredField((String) "PENDING");
        ((Field) term12041).setAccessible(true);
        Object enum44 = ((Field) term12041).get((Object) null);
        Object term11528 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term11534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11535 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term11528, term11528.getClass(), "id", "");
        setField(term11528, term11528.getClass(), "imageUrl", "");
        setDoubleField(term11528, term11528.getClass(), "size", 0.7865909711092062);
        setIntField(term11528, term11528.getClass(), "quantity", -1048298087);
        setDoubleField(term11528, term11528.getClass(), "price", 0.06587158449170749);
        setField(term11534, term11534.getClass(), "date", null);
        setField(term11534, term11534.getClass(), "time", null);
        setField(term11528, term11528.getClass(), "orderDate", term11534);
        setField(term11535, term11535.getClass(), "date", null);
        setField(term11535, term11535.getClass(), "time", null);
        setField(term11528, term11528.getClass(), "deliveryDate", term11535);
        setBooleanField(term11528, term11528.getClass(), "ordered", true);
        setField(term11528, term11528.getClass(), "userId", "");
        setField(term11528, term11528.getClass(), "orderStatus", enum44);
        Class<? extends Object> term12265 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term12264 = ((Class) term12265).getDeclaredField((String) "PENDING");
        ((Field) term12264).setAccessible(true);
        Object enum45 = ((Field) term12264).get((Object) null);
        Object term11540 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term11546 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11547 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term11540, term11540.getClass(), "id", "");
        setField(term11540, term11540.getClass(), "imageUrl", "");
        setDoubleField(term11540, term11540.getClass(), "size", 0.0865998004187658);
        setIntField(term11540, term11540.getClass(), "quantity", 292681826);
        setDoubleField(term11540, term11540.getClass(), "price", 0.9628647861255637);
        setField(term11546, term11546.getClass(), "date", null);
        setField(term11546, term11546.getClass(), "time", null);
        setField(term11540, term11540.getClass(), "orderDate", term11546);
        setField(term11547, term11547.getClass(), "date", null);
        setField(term11547, term11547.getClass(), "time", null);
        setField(term11540, term11540.getClass(), "deliveryDate", term11547);
        setBooleanField(term11540, term11540.getClass(), "ordered", false);
        setField(term11540, term11540.getClass(), "userId", "");
        setField(term11540, term11540.getClass(), "orderStatus", enum45);
        Object term11552 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term11558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11559 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term11552, term11552.getClass(), "id", "");
        setField(term11552, term11552.getClass(), "imageUrl", "");
        setDoubleField(term11552, term11552.getClass(), "size", 0.623231822150205);
        setIntField(term11552, term11552.getClass(), "quantity", 458147407);
        setDoubleField(term11552, term11552.getClass(), "price", 0.09037487793444521);
        setField(term11558, term11558.getClass(), "date", null);
        setField(term11558, term11558.getClass(), "time", null);
        setField(term11552, term11552.getClass(), "orderDate", term11558);
        setField(term11559, term11559.getClass(), "date", null);
        setField(term11559, term11559.getClass(), "time", null);
        setField(term11552, term11552.getClass(), "deliveryDate", term11559);
        setBooleanField(term11552, term11552.getClass(), "ordered", false);
        setField(term11552, term11552.getClass(), "userId", "");
        setField(term11552, term11552.getClass(), "orderStatus", enum43);
        ArrayList term11514 = new ArrayList();
        ((ArrayList) term11514).add(term11516);
        ((ArrayList) term11514).add(term11528);
        ((ArrayList) term11514).add(term11540);
        ((ArrayList) term11514).add(term11552);
        term11432 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term11432, term11432.getClass(), "id", "PqtVXXZMqK");
        setField(term11432, term11432.getClass(), "firstName", "rYbtIDVdnd");
        setField(term11432, term11432.getClass(), "lastName", "UKAReurpHG");
        setField(term11432, term11432.getClass(), "password", "WVRMUmrljA");
        setField(term11432, term11432.getClass(), "phoneNumber", "NTlKJDDWlk");
        setField(term11432, term11432.getClass(), "email", "vOuMEpOQAg");
        setField(term11432, term11432.getClass(), "role", enum42);
        setField(term11432, term11432.getClass(), "orders", term11514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVbxuoDBcn";
        callMethod(klass, "setEmail", argTypes, term11432, args);
    }

};


