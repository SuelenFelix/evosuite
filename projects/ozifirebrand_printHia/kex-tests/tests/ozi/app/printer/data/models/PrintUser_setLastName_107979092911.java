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

public class PrintUser_setLastName_107979092911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8906;

    public PrintUser_setLastName_107979092911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9086 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term9085 = ((Class) term9086).getDeclaredField((String) "USER");
        ((Field) term9085).setAccessible(true);
        Object enum33 = ((Field) term9085).get((Object) null);
        Class<? extends Object> term9265 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term9264 = ((Class) term9265).getDeclaredField((String) "DELIVERED");
        ((Field) term9264).setAccessible(true);
        Object enum34 = ((Field) term9264).get((Object) null);
        Object term8989 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term8995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8996 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term8989, term8989.getClass(), "id", "");
        setField(term8989, term8989.getClass(), "imageUrl", "");
        setDoubleField(term8989, term8989.getClass(), "size", 0.53094494792755);
        setIntField(term8989, term8989.getClass(), "quantity", -602026508);
        setDoubleField(term8989, term8989.getClass(), "price", 0.146431486357265);
        setField(term8995, term8995.getClass(), "date", null);
        setField(term8995, term8995.getClass(), "time", null);
        setField(term8989, term8989.getClass(), "orderDate", term8995);
        setField(term8996, term8996.getClass(), "date", null);
        setField(term8996, term8996.getClass(), "time", null);
        setField(term8989, term8989.getClass(), "deliveryDate", term8996);
        setBooleanField(term8989, term8989.getClass(), "ordered", true);
        setField(term8989, term8989.getClass(), "userId", "");
        setField(term8989, term8989.getClass(), "orderStatus", enum34);
        Object term9001 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term9007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9008 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term9001, term9001.getClass(), "id", "");
        setField(term9001, term9001.getClass(), "imageUrl", "");
        setDoubleField(term9001, term9001.getClass(), "size", 0.24259014218848696);
        setIntField(term9001, term9001.getClass(), "quantity", -157887805);
        setDoubleField(term9001, term9001.getClass(), "price", 0.1544348383112728);
        setField(term9007, term9007.getClass(), "date", null);
        setField(term9007, term9007.getClass(), "time", null);
        setField(term9001, term9001.getClass(), "orderDate", term9007);
        setField(term9008, term9008.getClass(), "date", null);
        setField(term9008, term9008.getClass(), "time", null);
        setField(term9001, term9001.getClass(), "deliveryDate", term9008);
        setBooleanField(term9001, term9001.getClass(), "ordered", true);
        setField(term9001, term9001.getClass(), "userId", "");
        setField(term9001, term9001.getClass(), "orderStatus", enum34);
        ArrayList term8987 = new ArrayList();
        ((ArrayList) term8987).add(term8989);
        ((ArrayList) term8987).add(term9001);
        term8906 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term8906, term8906.getClass(), "id", "vKQukfbJUd");
        setField(term8906, term8906.getClass(), "firstName", "lFRJFUMVbx");
        setField(term8906, term8906.getClass(), "lastName", "sZdUNdggUW");
        setField(term8906, term8906.getClass(), "password", "OqbwYQfvAe");
        setField(term8906, term8906.getClass(), "phoneNumber", "tRxZafjqIx");
        setField(term8906, term8906.getClass(), "email", "DhjNLmRMCu");
        setField(term8906, term8906.getClass(), "role", enum33);
        setField(term8906, term8906.getClass(), "orders", term8987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nhoHrZfnIN";
        callMethod(klass, "setLastName", argTypes, term8906, args);
    }

};


