package ozi.app.printer.data.dtos.responses;

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
import static ozi.app.printer.data.dtos.responses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class UserCreationResponse_canEqual_30518204816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18179;
     Object term18319;

    public UserCreationResponse_canEqual_30518204816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18371 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term18370 = ((Class) term18371).getDeclaredField((String) "ADMIN");
        ((Field) term18370).setAccessible(true);
        Object enum65 = ((Field) term18370).get((Object) null);
        Class<? extends Object> term18553 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term18552 = ((Class) term18553).getDeclaredField((String) "PENDING");
        ((Field) term18552).setAccessible(true);
        Object enum66 = ((Field) term18552).get((Object) null);
        Object term18251 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term18257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18258 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term18251, term18251.getClass(), "id", "");
        setField(term18251, term18251.getClass(), "imageUrl", "");
        setDoubleField(term18251, term18251.getClass(), "size", 0.7046974927834232);
        setIntField(term18251, term18251.getClass(), "quantity", 1442160736);
        setDoubleField(term18251, term18251.getClass(), "price", 0.6896952303224777);
        setField(term18257, term18257.getClass(), "date", null);
        setField(term18257, term18257.getClass(), "time", null);
        setField(term18251, term18251.getClass(), "orderDate", term18257);
        setField(term18258, term18258.getClass(), "date", null);
        setField(term18258, term18258.getClass(), "time", null);
        setField(term18251, term18251.getClass(), "deliveryDate", term18258);
        setBooleanField(term18251, term18251.getClass(), "ordered", false);
        setField(term18251, term18251.getClass(), "userId", "");
        setField(term18251, term18251.getClass(), "orderStatus", enum66);
        Class<? extends Object> term18776 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term18775 = ((Class) term18776).getDeclaredField((String) "DELIVERED");
        ((Field) term18775).setAccessible(true);
        Object enum67 = ((Field) term18775).get((Object) null);
        Object term18263 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term18269 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18270 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term18263, term18263.getClass(), "id", "");
        setField(term18263, term18263.getClass(), "imageUrl", "");
        setDoubleField(term18263, term18263.getClass(), "size", 0.6693176553622628);
        setIntField(term18263, term18263.getClass(), "quantity", 1114000454);
        setDoubleField(term18263, term18263.getClass(), "price", 0.2962868255626906);
        setField(term18269, term18269.getClass(), "date", null);
        setField(term18269, term18269.getClass(), "time", null);
        setField(term18263, term18263.getClass(), "orderDate", term18269);
        setField(term18270, term18270.getClass(), "date", null);
        setField(term18270, term18270.getClass(), "time", null);
        setField(term18263, term18263.getClass(), "deliveryDate", term18270);
        setBooleanField(term18263, term18263.getClass(), "ordered", false);
        setField(term18263, term18263.getClass(), "userId", "");
        setField(term18263, term18263.getClass(), "orderStatus", enum67);
        Object term18275 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term18281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18282 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term18275, term18275.getClass(), "id", "");
        setField(term18275, term18275.getClass(), "imageUrl", "");
        setDoubleField(term18275, term18275.getClass(), "size", 0.25474180574060834);
        setIntField(term18275, term18275.getClass(), "quantity", -556405712);
        setDoubleField(term18275, term18275.getClass(), "price", 0.9957585718901875);
        setField(term18281, term18281.getClass(), "date", null);
        setField(term18281, term18281.getClass(), "time", null);
        setField(term18275, term18275.getClass(), "orderDate", term18281);
        setField(term18282, term18282.getClass(), "date", null);
        setField(term18282, term18282.getClass(), "time", null);
        setField(term18275, term18275.getClass(), "deliveryDate", term18282);
        setBooleanField(term18275, term18275.getClass(), "ordered", false);
        setField(term18275, term18275.getClass(), "userId", "");
        setField(term18275, term18275.getClass(), "orderStatus", enum67);
        Class<? extends Object> term19005 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term19004 = ((Class) term19005).getDeclaredField((String) "ORDERED");
        ((Field) term19004).setAccessible(true);
        Object enum68 = ((Field) term19004).get((Object) null);
        Object term18285 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term18291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18292 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term18285, term18285.getClass(), "id", "");
        setField(term18285, term18285.getClass(), "imageUrl", "");
        setDoubleField(term18285, term18285.getClass(), "size", 0.16755811343784477);
        setIntField(term18285, term18285.getClass(), "quantity", -1772434990);
        setDoubleField(term18285, term18285.getClass(), "price", 0.9090793968999221);
        setField(term18291, term18291.getClass(), "date", null);
        setField(term18291, term18291.getClass(), "time", null);
        setField(term18285, term18285.getClass(), "orderDate", term18291);
        setField(term18292, term18292.getClass(), "date", null);
        setField(term18292, term18292.getClass(), "time", null);
        setField(term18285, term18285.getClass(), "deliveryDate", term18292);
        setBooleanField(term18285, term18285.getClass(), "ordered", false);
        setField(term18285, term18285.getClass(), "userId", "");
        setField(term18285, term18285.getClass(), "orderStatus", enum68);
        Object term18297 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term18303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18304 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term18297, term18297.getClass(), "id", "");
        setField(term18297, term18297.getClass(), "imageUrl", "");
        setDoubleField(term18297, term18297.getClass(), "size", 0.25997329921466494);
        setIntField(term18297, term18297.getClass(), "quantity", -1845499264);
        setDoubleField(term18297, term18297.getClass(), "price", 0.7814864708383836);
        setField(term18303, term18303.getClass(), "date", null);
        setField(term18303, term18303.getClass(), "time", null);
        setField(term18297, term18297.getClass(), "orderDate", term18303);
        setField(term18304, term18304.getClass(), "date", null);
        setField(term18304, term18304.getClass(), "time", null);
        setField(term18297, term18297.getClass(), "deliveryDate", term18304);
        setBooleanField(term18297, term18297.getClass(), "ordered", false);
        setField(term18297, term18297.getClass(), "userId", "");
        setField(term18297, term18297.getClass(), "orderStatus", enum68);
        Object term18307 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term18313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18314 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term18307, term18307.getClass(), "id", "");
        setField(term18307, term18307.getClass(), "imageUrl", "");
        setDoubleField(term18307, term18307.getClass(), "size", 0.5657654165545906);
        setIntField(term18307, term18307.getClass(), "quantity", -505439934);
        setDoubleField(term18307, term18307.getClass(), "price", 0.6382060245198228);
        setField(term18313, term18313.getClass(), "date", null);
        setField(term18313, term18313.getClass(), "time", null);
        setField(term18307, term18307.getClass(), "orderDate", term18313);
        setField(term18314, term18314.getClass(), "date", null);
        setField(term18314, term18314.getClass(), "time", null);
        setField(term18307, term18307.getClass(), "deliveryDate", term18314);
        setBooleanField(term18307, term18307.getClass(), "ordered", false);
        setField(term18307, term18307.getClass(), "userId", "");
        setField(term18307, term18307.getClass(), "orderStatus", enum66);
        ArrayList term18249 = new ArrayList();
        ((ArrayList) term18249).add(term18251);
        ((ArrayList) term18249).add(term18263);
        ((ArrayList) term18249).add(term18275);
        ((ArrayList) term18249).add(term18285);
        ((ArrayList) term18249).add(term18297);
        ((ArrayList) term18249).add(term18307);
        term18179 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term18179, term18179.getClass(), "firstName", "YAXkVjQZcV");
        setField(term18179, term18179.getClass(), "lastName", "pumvwBWvpy");
        setField(term18179, term18179.getClass(), "username", "HwLHeGLyhe");
        setField(term18179, term18179.getClass(), "email", "RDnkgWkcbz");
        setField(term18179, term18179.getClass(), "id", "IBpaxltauX");
        setField(term18179, term18179.getClass(), "role", enum65);
        setField(term18179, term18179.getClass(), "orders", term18249);
        term18319 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18319;
        callMethod(klass, "canEqual", argTypes, term18179, args);
    }

};


