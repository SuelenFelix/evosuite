package ozi.app.printer.mapper;

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
import static ozi.app.printer.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Mapper_map_8096425122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;

    public Mapper_map_8096425122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term309 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term308 = ((Class) term309).getDeclaredField((String) "USER");
        ((Field) term308).setAccessible(true);
        Object enum0 = ((Field) term308).get((Object) null);
        Class<? extends Object> term523 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term522 = ((Class) term523).getDeclaredField((String) "PENDING");
        ((Field) term522).setAccessible(true);
        Object enum1 = ((Field) term522).get((Object) null);
        Object term173 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term173, term173.getClass(), "id", "");
        setField(term173, term173.getClass(), "imageUrl", "");
        setDoubleField(term173, term173.getClass(), "size", 0.13238746331190498);
        setIntField(term173, term173.getClass(), "quantity", 568599855);
        setDoubleField(term173, term173.getClass(), "price", 0.3455959125047594);
        setField(term179, term179.getClass(), "date", null);
        setField(term179, term179.getClass(), "time", null);
        setField(term173, term173.getClass(), "orderDate", term179);
        setField(term180, term180.getClass(), "date", null);
        setField(term180, term180.getClass(), "time", null);
        setField(term173, term173.getClass(), "deliveryDate", term180);
        setBooleanField(term173, term173.getClass(), "ordered", false);
        setField(term173, term173.getClass(), "userId", "");
        setField(term173, term173.getClass(), "orderStatus", enum1);
        Class<? extends Object> term746 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term745 = ((Class) term746).getDeclaredField((String) "DELIVERED");
        ((Field) term745).setAccessible(true);
        Object enum2 = ((Field) term745).get((Object) null);
        Object term185 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term192 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term185, term185.getClass(), "id", "");
        setField(term185, term185.getClass(), "imageUrl", "");
        setDoubleField(term185, term185.getClass(), "size", 0.5523635872663106);
        setIntField(term185, term185.getClass(), "quantity", 1162663216);
        setDoubleField(term185, term185.getClass(), "price", 0.544608645520025);
        setField(term191, term191.getClass(), "date", null);
        setField(term191, term191.getClass(), "time", null);
        setField(term185, term185.getClass(), "orderDate", term191);
        setField(term192, term192.getClass(), "date", null);
        setField(term192, term192.getClass(), "time", null);
        setField(term185, term185.getClass(), "deliveryDate", term192);
        setBooleanField(term185, term185.getClass(), "ordered", false);
        setField(term185, term185.getClass(), "userId", "");
        setField(term185, term185.getClass(), "orderStatus", enum2);
        Object term197 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term197, term197.getClass(), "id", "");
        setField(term197, term197.getClass(), "imageUrl", "");
        setDoubleField(term197, term197.getClass(), "size", 0.28570734989730284);
        setIntField(term197, term197.getClass(), "quantity", 1484323161);
        setDoubleField(term197, term197.getClass(), "price", 0.40176586625454525);
        setField(term203, term203.getClass(), "date", null);
        setField(term203, term203.getClass(), "time", null);
        setField(term197, term197.getClass(), "orderDate", term203);
        setField(term204, term204.getClass(), "date", null);
        setField(term204, term204.getClass(), "time", null);
        setField(term197, term197.getClass(), "deliveryDate", term204);
        setBooleanField(term197, term197.getClass(), "ordered", false);
        setField(term197, term197.getClass(), "userId", "");
        setField(term197, term197.getClass(), "orderStatus", enum1);
        Object term207 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term214 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term207, term207.getClass(), "id", "");
        setField(term207, term207.getClass(), "imageUrl", "");
        setDoubleField(term207, term207.getClass(), "size", 0.2641345529914265);
        setIntField(term207, term207.getClass(), "quantity", 391863371);
        setDoubleField(term207, term207.getClass(), "price", 0.36923381893433327);
        setField(term213, term213.getClass(), "date", null);
        setField(term213, term213.getClass(), "time", null);
        setField(term207, term207.getClass(), "orderDate", term213);
        setField(term214, term214.getClass(), "date", null);
        setField(term214, term214.getClass(), "time", null);
        setField(term207, term207.getClass(), "deliveryDate", term214);
        setBooleanField(term207, term207.getClass(), "ordered", false);
        setField(term207, term207.getClass(), "userId", "");
        setField(term207, term207.getClass(), "orderStatus", enum2);
        Class<? extends Object> term975 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term974 = ((Class) term975).getDeclaredField((String) "ORDERED");
        ((Field) term974).setAccessible(true);
        Object enum3 = ((Field) term974).get((Object) null);
        Object term217 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term224 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term217, term217.getClass(), "id", "");
        setField(term217, term217.getClass(), "imageUrl", "");
        setDoubleField(term217, term217.getClass(), "size", 0.6076495596892013);
        setIntField(term217, term217.getClass(), "quantity", -1922583790);
        setDoubleField(term217, term217.getClass(), "price", 0.37773193782763337);
        setField(term223, term223.getClass(), "date", null);
        setField(term223, term223.getClass(), "time", null);
        setField(term217, term217.getClass(), "orderDate", term223);
        setField(term224, term224.getClass(), "date", null);
        setField(term224, term224.getClass(), "time", null);
        setField(term217, term217.getClass(), "deliveryDate", term224);
        setBooleanField(term217, term217.getClass(), "ordered", true);
        setField(term217, term217.getClass(), "userId", "");
        setField(term217, term217.getClass(), "orderStatus", enum3);
        ArrayList term171 = new ArrayList();
        ((ArrayList) term171).add(term173);
        ((ArrayList) term171).add(term185);
        ((ArrayList) term171).add(term197);
        ((ArrayList) term171).add(term207);
        ((ArrayList) term171).add(term217);
        term90 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term90, term90.getClass(), "id", "jJCZpVmanW");
        setField(term90, term90.getClass(), "firstName", "EGtDIRbSSb");
        setField(term90, term90.getClass(), "lastName", "SzjVpOQTyS");
        setField(term90, term90.getClass(), "password", "MjGYSRKTNF");
        setField(term90, term90.getClass(), "phoneNumber", "hRNSzYYIrc");
        setField(term90, term90.getClass(), "email", "RMFIsYGgne");
        setField(term90, term90.getClass(), "role", enum0);
        setField(term90, term90.getClass(), "orders", term171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.mapper.Mapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.models.PrintUser");
        Object[] args = new Object[1];
        args[0] = term90;
        callMethod(klass, "map", argTypes, null, args);
    }

};


