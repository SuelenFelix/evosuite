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
import java.util.LinkedList;

public class UserCreationResponse_setOrders_194580597214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16306;
     Object term16433;

    public UserCreationResponse_setOrders_194580597214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16487 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term16486 = ((Class) term16487).getDeclaredField((String) "USER");
        ((Field) term16486).setAccessible(true);
        Object enum58 = ((Field) term16486).get((Object) null);
        Class<? extends Object> term16666 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term16665 = ((Class) term16666).getDeclaredField((String) "PENDING");
        ((Field) term16665).setAccessible(true);
        Object enum59 = ((Field) term16665).get((Object) null);
        Object term16377 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term16383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16384 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term16377, term16377.getClass(), "id", "");
        setField(term16377, term16377.getClass(), "imageUrl", "");
        setDoubleField(term16377, term16377.getClass(), "size", 0.44268490778872205);
        setIntField(term16377, term16377.getClass(), "quantity", 1265463001);
        setDoubleField(term16377, term16377.getClass(), "price", 0.7507333108648018);
        setField(term16383, term16383.getClass(), "date", null);
        setField(term16383, term16383.getClass(), "time", null);
        setField(term16377, term16377.getClass(), "orderDate", term16383);
        setField(term16384, term16384.getClass(), "date", null);
        setField(term16384, term16384.getClass(), "time", null);
        setField(term16377, term16377.getClass(), "deliveryDate", term16384);
        setBooleanField(term16377, term16377.getClass(), "ordered", false);
        setField(term16377, term16377.getClass(), "userId", "");
        setField(term16377, term16377.getClass(), "orderStatus", enum59);
        Object term16389 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term16395 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16396 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term16389, term16389.getClass(), "id", "");
        setField(term16389, term16389.getClass(), "imageUrl", "");
        setDoubleField(term16389, term16389.getClass(), "size", 0.007493740494434409);
        setIntField(term16389, term16389.getClass(), "quantity", 335112684);
        setDoubleField(term16389, term16389.getClass(), "price", 0.29172553321356776);
        setField(term16395, term16395.getClass(), "date", null);
        setField(term16395, term16395.getClass(), "time", null);
        setField(term16389, term16389.getClass(), "orderDate", term16395);
        setField(term16396, term16396.getClass(), "date", null);
        setField(term16396, term16396.getClass(), "time", null);
        setField(term16389, term16389.getClass(), "deliveryDate", term16396);
        setBooleanField(term16389, term16389.getClass(), "ordered", false);
        setField(term16389, term16389.getClass(), "userId", "");
        setField(term16389, term16389.getClass(), "orderStatus", enum59);
        Object term16399 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term16405 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16406 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term16399, term16399.getClass(), "id", "");
        setField(term16399, term16399.getClass(), "imageUrl", "");
        setDoubleField(term16399, term16399.getClass(), "size", 0.9276995636844321);
        setIntField(term16399, term16399.getClass(), "quantity", 1551099402);
        setDoubleField(term16399, term16399.getClass(), "price", 0.7636130748477434);
        setField(term16405, term16405.getClass(), "date", null);
        setField(term16405, term16405.getClass(), "time", null);
        setField(term16399, term16399.getClass(), "orderDate", term16405);
        setField(term16406, term16406.getClass(), "date", null);
        setField(term16406, term16406.getClass(), "time", null);
        setField(term16399, term16399.getClass(), "deliveryDate", term16406);
        setBooleanField(term16399, term16399.getClass(), "ordered", true);
        setField(term16399, term16399.getClass(), "userId", "");
        setField(term16399, term16399.getClass(), "orderStatus", enum59);
        Class<? extends Object> term16889 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term16888 = ((Class) term16889).getDeclaredField((String) "ORDERED");
        ((Field) term16888).setAccessible(true);
        Object enum60 = ((Field) term16888).get((Object) null);
        Object term16409 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term16415 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16416 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term16409, term16409.getClass(), "id", "");
        setField(term16409, term16409.getClass(), "imageUrl", "");
        setDoubleField(term16409, term16409.getClass(), "size", 0.07901636960861558);
        setIntField(term16409, term16409.getClass(), "quantity", -2027534003);
        setDoubleField(term16409, term16409.getClass(), "price", 0.18717846301066243);
        setField(term16415, term16415.getClass(), "date", null);
        setField(term16415, term16415.getClass(), "time", null);
        setField(term16409, term16409.getClass(), "orderDate", term16415);
        setField(term16416, term16416.getClass(), "date", null);
        setField(term16416, term16416.getClass(), "time", null);
        setField(term16409, term16409.getClass(), "deliveryDate", term16416);
        setBooleanField(term16409, term16409.getClass(), "ordered", false);
        setField(term16409, term16409.getClass(), "userId", "");
        setField(term16409, term16409.getClass(), "orderStatus", enum60);
        Object term16421 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term16427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16428 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term16421, term16421.getClass(), "id", "");
        setField(term16421, term16421.getClass(), "imageUrl", "");
        setDoubleField(term16421, term16421.getClass(), "size", 0.5335953039331021);
        setIntField(term16421, term16421.getClass(), "quantity", 1063420942);
        setDoubleField(term16421, term16421.getClass(), "price", 0.5725602309856443);
        setField(term16427, term16427.getClass(), "date", null);
        setField(term16427, term16427.getClass(), "time", null);
        setField(term16421, term16421.getClass(), "orderDate", term16427);
        setField(term16428, term16428.getClass(), "date", null);
        setField(term16428, term16428.getClass(), "time", null);
        setField(term16421, term16421.getClass(), "deliveryDate", term16428);
        setBooleanField(term16421, term16421.getClass(), "ordered", false);
        setField(term16421, term16421.getClass(), "userId", "");
        setField(term16421, term16421.getClass(), "orderStatus", enum60);
        ArrayList term16375 = new ArrayList();
        ((ArrayList) term16375).add(term16377);
        ((ArrayList) term16375).add(term16389);
        ((ArrayList) term16375).add(term16399);
        ((ArrayList) term16375).add(term16409);
        ((ArrayList) term16375).add(term16421);
        term16306 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term16306, term16306.getClass(), "firstName", "ywmcuThdfL");
        setField(term16306, term16306.getClass(), "lastName", "GBOEuByOfr");
        setField(term16306, term16306.getClass(), "username", "NHbOFFjyVK");
        setField(term16306, term16306.getClass(), "email", "zaloBqlrSo");
        setField(term16306, term16306.getClass(), "id", "vvoLrMGCoN");
        setField(term16306, term16306.getClass(), "role", enum58);
        setField(term16306, term16306.getClass(), "orders", term16375);
        term16433 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term16433;
        callMethod(klass, "setOrders", argTypes, term16306, args);
    }

};


