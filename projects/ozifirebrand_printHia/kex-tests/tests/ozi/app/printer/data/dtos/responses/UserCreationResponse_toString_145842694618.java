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

public class UserCreationResponse_toString_145842694618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20278;

    public UserCreationResponse_toString_145842694618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20458 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term20457 = ((Class) term20458).getDeclaredField((String) "USER");
        ((Field) term20457).setAccessible(true);
        Object enum73 = ((Field) term20457).get((Object) null);
        Class<? extends Object> term20637 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term20636 = ((Class) term20637).getDeclaredField((String) "ORDERED");
        ((Field) term20636).setAccessible(true);
        Object enum74 = ((Field) term20636).get((Object) null);
        Object term20349 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term20355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20356 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term20349, term20349.getClass(), "id", "");
        setField(term20349, term20349.getClass(), "imageUrl", "");
        setDoubleField(term20349, term20349.getClass(), "size", 0.8732511635701926);
        setIntField(term20349, term20349.getClass(), "quantity", -1347665717);
        setDoubleField(term20349, term20349.getClass(), "price", 0.8977760608415547);
        setField(term20355, term20355.getClass(), "date", null);
        setField(term20355, term20355.getClass(), "time", null);
        setField(term20349, term20349.getClass(), "orderDate", term20355);
        setField(term20356, term20356.getClass(), "date", null);
        setField(term20356, term20356.getClass(), "time", null);
        setField(term20349, term20349.getClass(), "deliveryDate", term20356);
        setBooleanField(term20349, term20349.getClass(), "ordered", true);
        setField(term20349, term20349.getClass(), "userId", "");
        setField(term20349, term20349.getClass(), "orderStatus", enum74);
        Class<? extends Object> term20860 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term20859 = ((Class) term20860).getDeclaredField((String) "ORDERED");
        ((Field) term20859).setAccessible(true);
        Object enum75 = ((Field) term20859).get((Object) null);
        Object term20361 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term20367 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20368 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term20361, term20361.getClass(), "id", "");
        setField(term20361, term20361.getClass(), "imageUrl", "");
        setDoubleField(term20361, term20361.getClass(), "size", 0.3107086749915061);
        setIntField(term20361, term20361.getClass(), "quantity", -1888585309);
        setDoubleField(term20361, term20361.getClass(), "price", 0.18330246984174836);
        setField(term20367, term20367.getClass(), "date", null);
        setField(term20367, term20367.getClass(), "time", null);
        setField(term20361, term20361.getClass(), "orderDate", term20367);
        setField(term20368, term20368.getClass(), "date", null);
        setField(term20368, term20368.getClass(), "time", null);
        setField(term20361, term20361.getClass(), "deliveryDate", term20368);
        setBooleanField(term20361, term20361.getClass(), "ordered", false);
        setField(term20361, term20361.getClass(), "userId", "");
        setField(term20361, term20361.getClass(), "orderStatus", enum75);
        Object term20373 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term20379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20380 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term20373, term20373.getClass(), "id", "");
        setField(term20373, term20373.getClass(), "imageUrl", "");
        setDoubleField(term20373, term20373.getClass(), "size", 0.1941255640189572);
        setIntField(term20373, term20373.getClass(), "quantity", 683666002);
        setDoubleField(term20373, term20373.getClass(), "price", 0.2889811903417371);
        setField(term20379, term20379.getClass(), "date", null);
        setField(term20379, term20379.getClass(), "time", null);
        setField(term20373, term20373.getClass(), "orderDate", term20379);
        setField(term20380, term20380.getClass(), "date", null);
        setField(term20380, term20380.getClass(), "time", null);
        setField(term20373, term20373.getClass(), "deliveryDate", term20380);
        setBooleanField(term20373, term20373.getClass(), "ordered", true);
        setField(term20373, term20373.getClass(), "userId", "");
        setField(term20373, term20373.getClass(), "orderStatus", enum74);
        Class<? extends Object> term21083 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term21082 = ((Class) term21083).getDeclaredField((String) "DELIVERED");
        ((Field) term21082).setAccessible(true);
        Object enum76 = ((Field) term21082).get((Object) null);
        Object term20383 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term20389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20390 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term20383, term20383.getClass(), "id", "");
        setField(term20383, term20383.getClass(), "imageUrl", "");
        setDoubleField(term20383, term20383.getClass(), "size", 0.7856101337088763);
        setIntField(term20383, term20383.getClass(), "quantity", 1596213415);
        setDoubleField(term20383, term20383.getClass(), "price", 0.1782857269567425);
        setField(term20389, term20389.getClass(), "date", null);
        setField(term20389, term20389.getClass(), "time", null);
        setField(term20383, term20383.getClass(), "orderDate", term20389);
        setField(term20390, term20390.getClass(), "date", null);
        setField(term20390, term20390.getClass(), "time", null);
        setField(term20383, term20383.getClass(), "deliveryDate", term20390);
        setBooleanField(term20383, term20383.getClass(), "ordered", false);
        setField(term20383, term20383.getClass(), "userId", "");
        setField(term20383, term20383.getClass(), "orderStatus", enum76);
        Object term20395 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term20401 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20402 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term20395, term20395.getClass(), "id", "");
        setField(term20395, term20395.getClass(), "imageUrl", "");
        setDoubleField(term20395, term20395.getClass(), "size", 0.17829386444171214);
        setIntField(term20395, term20395.getClass(), "quantity", -268815336);
        setDoubleField(term20395, term20395.getClass(), "price", 0.547995853732519);
        setField(term20401, term20401.getClass(), "date", null);
        setField(term20401, term20401.getClass(), "time", null);
        setField(term20395, term20395.getClass(), "orderDate", term20401);
        setField(term20402, term20402.getClass(), "date", null);
        setField(term20402, term20402.getClass(), "time", null);
        setField(term20395, term20395.getClass(), "deliveryDate", term20402);
        setBooleanField(term20395, term20395.getClass(), "ordered", true);
        setField(term20395, term20395.getClass(), "userId", "");
        setField(term20395, term20395.getClass(), "orderStatus", enum74);
        ArrayList term20347 = new ArrayList();
        ((ArrayList) term20347).add(term20349);
        ((ArrayList) term20347).add(term20361);
        ((ArrayList) term20347).add(term20373);
        ((ArrayList) term20347).add(term20383);
        ((ArrayList) term20347).add(term20395);
        term20278 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term20278, term20278.getClass(), "firstName", "mhQDwIyrRi");
        setField(term20278, term20278.getClass(), "lastName", "HpZXWDPhlg");
        setField(term20278, term20278.getClass(), "username", "lBOokzEPfe");
        setField(term20278, term20278.getClass(), "email", "dtGZCsKXbW");
        setField(term20278, term20278.getClass(), "id", "bdyhHbDAmJ");
        setField(term20278, term20278.getClass(), "role", enum73);
        setField(term20278, term20278.getClass(), "orders", term20347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term20278, args);
    }

};


