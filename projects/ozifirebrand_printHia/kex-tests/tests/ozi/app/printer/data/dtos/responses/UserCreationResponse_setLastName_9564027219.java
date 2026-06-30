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

public class UserCreationResponse_setLastName_9564027219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12284;

    public UserCreationResponse_setLastName_9564027219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12432 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term12431 = ((Class) term12432).getDeclaredField((String) "USER");
        ((Field) term12431).setAccessible(true);
        Object enum43 = ((Field) term12431).get((Object) null);
        Class<? extends Object> term12611 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term12610 = ((Class) term12611).getDeclaredField((String) "PENDING");
        ((Field) term12610).setAccessible(true);
        Object enum44 = ((Field) term12610).get((Object) null);
        Object term12355 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term12361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12362 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term12355, term12355.getClass(), "id", "");
        setField(term12355, term12355.getClass(), "imageUrl", "");
        setDoubleField(term12355, term12355.getClass(), "size", 0.12764449157430724);
        setIntField(term12355, term12355.getClass(), "quantity", 2055867847);
        setDoubleField(term12355, term12355.getClass(), "price", 0.39446728256884744);
        setField(term12361, term12361.getClass(), "date", null);
        setField(term12361, term12361.getClass(), "time", null);
        setField(term12355, term12355.getClass(), "orderDate", term12361);
        setField(term12362, term12362.getClass(), "date", null);
        setField(term12362, term12362.getClass(), "time", null);
        setField(term12355, term12355.getClass(), "deliveryDate", term12362);
        setBooleanField(term12355, term12355.getClass(), "ordered", true);
        setField(term12355, term12355.getClass(), "userId", "");
        setField(term12355, term12355.getClass(), "orderStatus", enum44);
        ArrayList term12353 = new ArrayList();
        ((ArrayList) term12353).add(term12355);
        term12284 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term12284, term12284.getClass(), "firstName", "kVEZMHmRtR");
        setField(term12284, term12284.getClass(), "lastName", "ekxGuOYIwi");
        setField(term12284, term12284.getClass(), "username", "RbVQXSpxXy");
        setField(term12284, term12284.getClass(), "email", "YpJbIgJWWv");
        setField(term12284, term12284.getClass(), "id", "JppkknKVOw");
        setField(term12284, term12284.getClass(), "role", enum43);
        setField(term12284, term12284.getClass(), "orders", term12353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lFRJFUMVbx";
        callMethod(klass, "setLastName", argTypes, term12284, args);
    }

};


