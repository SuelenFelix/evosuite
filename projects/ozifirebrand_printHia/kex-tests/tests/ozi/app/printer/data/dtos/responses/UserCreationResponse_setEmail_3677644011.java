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

public class UserCreationResponse_setEmail_3677644011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13926;

    public UserCreationResponse_setEmail_3677644011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14074 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term14073 = ((Class) term14074).getDeclaredField((String) "USER");
        ((Field) term14073).setAccessible(true);
        Object enum49 = ((Field) term14073).get((Object) null);
        Class<? extends Object> term14253 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term14252 = ((Class) term14253).getDeclaredField((String) "PENDING");
        ((Field) term14252).setAccessible(true);
        Object enum50 = ((Field) term14252).get((Object) null);
        Object term13997 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term14003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14004 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term13997, term13997.getClass(), "id", "");
        setField(term13997, term13997.getClass(), "imageUrl", "");
        setDoubleField(term13997, term13997.getClass(), "size", 0.34010089048558567);
        setIntField(term13997, term13997.getClass(), "quantity", -1371869594);
        setDoubleField(term13997, term13997.getClass(), "price", 0.19625398866403143);
        setField(term14003, term14003.getClass(), "date", null);
        setField(term14003, term14003.getClass(), "time", null);
        setField(term13997, term13997.getClass(), "orderDate", term14003);
        setField(term14004, term14004.getClass(), "date", null);
        setField(term14004, term14004.getClass(), "time", null);
        setField(term13997, term13997.getClass(), "deliveryDate", term14004);
        setBooleanField(term13997, term13997.getClass(), "ordered", false);
        setField(term13997, term13997.getClass(), "userId", "");
        setField(term13997, term13997.getClass(), "orderStatus", enum50);
        ArrayList term13995 = new ArrayList();
        ((ArrayList) term13995).add(term13997);
        term13926 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term13926, term13926.getClass(), "firstName", "OIHoJeysUi");
        setField(term13926, term13926.getClass(), "lastName", "WXMWFDGcLB");
        setField(term13926, term13926.getClass(), "username", "wKWbJssZuG");
        setField(term13926, term13926.getClass(), "email", "NzBMMhkhpT");
        setField(term13926, term13926.getClass(), "id", "qCpEbQDHdF");
        setField(term13926, term13926.getClass(), "role", enum49);
        setField(term13926, term13926.getClass(), "orders", term13995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EwQBhZjCIT";
        callMethod(klass, "setEmail", argTypes, term13926, args);
    }

};


