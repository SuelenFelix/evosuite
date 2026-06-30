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

public class PrintUser_canEqual_173101160218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14931;
     Object term15028;

    public PrintUser_canEqual_173101160218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15090 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term15089 = ((Class) term15090).getDeclaredField((String) "USER");
        ((Field) term15089).setAccessible(true);
        Object enum55 = ((Field) term15089).get((Object) null);
        Class<? extends Object> term15269 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term15268 = ((Class) term15269).getDeclaredField((String) "ORDERED");
        ((Field) term15268).setAccessible(true);
        Object enum56 = ((Field) term15268).get((Object) null);
        Object term15014 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term15020 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15021 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term15014, term15014.getClass(), "id", "");
        setField(term15014, term15014.getClass(), "imageUrl", "");
        setDoubleField(term15014, term15014.getClass(), "size", 0.7818620200430967);
        setIntField(term15014, term15014.getClass(), "quantity", -93135961);
        setDoubleField(term15014, term15014.getClass(), "price", 0.04640022995603543);
        setField(term15020, term15020.getClass(), "date", null);
        setField(term15020, term15020.getClass(), "time", null);
        setField(term15014, term15014.getClass(), "orderDate", term15020);
        setField(term15021, term15021.getClass(), "date", null);
        setField(term15021, term15021.getClass(), "time", null);
        setField(term15014, term15014.getClass(), "deliveryDate", term15021);
        setBooleanField(term15014, term15014.getClass(), "ordered", true);
        setField(term15014, term15014.getClass(), "userId", "");
        setField(term15014, term15014.getClass(), "orderStatus", enum56);
        ArrayList term15012 = new ArrayList();
        ((ArrayList) term15012).add(term15014);
        term14931 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term14931, term14931.getClass(), "id", "WxYUTuqmIq");
        setField(term14931, term14931.getClass(), "firstName", "OeQLvhVERT");
        setField(term14931, term14931.getClass(), "lastName", "IlvgFINwIa");
        setField(term14931, term14931.getClass(), "password", "GEJABPlHSI");
        setField(term14931, term14931.getClass(), "phoneNumber", "aQFUvuaYxd");
        setField(term14931, term14931.getClass(), "email", "zNFLXMifnS");
        setField(term14931, term14931.getClass(), "role", enum55);
        setField(term14931, term14931.getClass(), "orders", term15012);
        term15028 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15028;
        callMethod(klass, "canEqual", argTypes, term14931, args);
    }

};


