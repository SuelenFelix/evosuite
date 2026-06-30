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

public class UserCreationResponse_setRole_109066072113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15578;
     Object enum57;

    public UserCreationResponse_setRole_109066072113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15723 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term15722 = ((Class) term15723).getDeclaredField((String) "USER");
        ((Field) term15722).setAccessible(true);
        Object enum55 = ((Field) term15722).get((Object) null);
        Class<? extends Object> term15902 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term15901 = ((Class) term15902).getDeclaredField((String) "ORDERED");
        ((Field) term15901).setAccessible(true);
        Object enum56 = ((Field) term15901).get((Object) null);
        Object term15649 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term15655 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15656 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term15649, term15649.getClass(), "id", "");
        setField(term15649, term15649.getClass(), "imageUrl", "");
        setDoubleField(term15649, term15649.getClass(), "size", 0.6428742553484879);
        setIntField(term15649, term15649.getClass(), "quantity", 1540719661);
        setDoubleField(term15649, term15649.getClass(), "price", 0.6584165706677267);
        setField(term15655, term15655.getClass(), "date", null);
        setField(term15655, term15655.getClass(), "time", null);
        setField(term15649, term15649.getClass(), "orderDate", term15655);
        setField(term15656, term15656.getClass(), "date", null);
        setField(term15656, term15656.getClass(), "time", null);
        setField(term15649, term15649.getClass(), "deliveryDate", term15656);
        setBooleanField(term15649, term15649.getClass(), "ordered", true);
        setField(term15649, term15649.getClass(), "userId", "");
        setField(term15649, term15649.getClass(), "orderStatus", enum56);
        ArrayList term15647 = new ArrayList();
        ((ArrayList) term15647).add(term15649);
        term15578 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term15578, term15578.getClass(), "firstName", "beAMpkroCQ");
        setField(term15578, term15578.getClass(), "lastName", "uSUvKAyuvd");
        setField(term15578, term15578.getClass(), "username", "onQLVONGuf");
        setField(term15578, term15578.getClass(), "email", "SOrEHbcbmn");
        setField(term15578, term15578.getClass(), "id", "bnsyeQXFdu");
        setField(term15578, term15578.getClass(), "role", enum55);
        setField(term15578, term15578.getClass(), "orders", term15647);
        Class<? extends Object> term16125 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term16124 = ((Class) term16125).getDeclaredField((String) "ADMIN");
        ((Field) term16124).setAccessible(true);
        enum57 = ((Field) term16124).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.models.Role");
        Object[] args = new Object[1];
        args[0] = enum57;
        callMethod(klass, "setRole", argTypes, term15578, args);
    }

};


