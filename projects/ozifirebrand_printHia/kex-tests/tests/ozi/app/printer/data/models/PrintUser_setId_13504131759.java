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

public class PrintUser_setId_13504131759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6999;

    public PrintUser_setId_13504131759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7181 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term7180 = ((Class) term7181).getDeclaredField((String) "USER");
        ((Field) term7180).setAccessible(true);
        Object enum26 = ((Field) term7180).get((Object) null);
        Class<? extends Object> term7360 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term7359 = ((Class) term7360).getDeclaredField((String) "ORDERED");
        ((Field) term7359).setAccessible(true);
        Object enum27 = ((Field) term7359).get((Object) null);
        Object term7082 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term7088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7089 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term7082, term7082.getClass(), "id", "");
        setField(term7082, term7082.getClass(), "imageUrl", "");
        setDoubleField(term7082, term7082.getClass(), "size", 0.016575281023182953);
        setIntField(term7082, term7082.getClass(), "quantity", 1193880199);
        setDoubleField(term7082, term7082.getClass(), "price", 0.5308350402051779);
        setField(term7088, term7088.getClass(), "date", null);
        setField(term7088, term7088.getClass(), "time", null);
        setField(term7082, term7082.getClass(), "orderDate", term7088);
        setField(term7089, term7089.getClass(), "date", null);
        setField(term7089, term7089.getClass(), "time", null);
        setField(term7082, term7082.getClass(), "deliveryDate", term7089);
        setBooleanField(term7082, term7082.getClass(), "ordered", false);
        setField(term7082, term7082.getClass(), "userId", "");
        setField(term7082, term7082.getClass(), "orderStatus", enum27);
        Class<? extends Object> term7583 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term7582 = ((Class) term7583).getDeclaredField((String) "ORDERED");
        ((Field) term7582).setAccessible(true);
        Object enum28 = ((Field) term7582).get((Object) null);
        Object term7094 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term7100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7101 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term7094, term7094.getClass(), "id", "");
        setField(term7094, term7094.getClass(), "imageUrl", "");
        setDoubleField(term7094, term7094.getClass(), "size", 0.7154795600170818);
        setIntField(term7094, term7094.getClass(), "quantity", -1087774327);
        setDoubleField(term7094, term7094.getClass(), "price", 0.6355029654528058);
        setField(term7100, term7100.getClass(), "date", null);
        setField(term7100, term7100.getClass(), "time", null);
        setField(term7094, term7094.getClass(), "orderDate", term7100);
        setField(term7101, term7101.getClass(), "date", null);
        setField(term7101, term7101.getClass(), "time", null);
        setField(term7094, term7094.getClass(), "deliveryDate", term7101);
        setBooleanField(term7094, term7094.getClass(), "ordered", true);
        setField(term7094, term7094.getClass(), "userId", "");
        setField(term7094, term7094.getClass(), "orderStatus", enum28);
        ArrayList term7080 = new ArrayList();
        ((ArrayList) term7080).add(term7082);
        ((ArrayList) term7080).add(term7094);
        term6999 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term6999, term6999.getClass(), "id", "ZfdXfCCFDf");
        setField(term6999, term6999.getClass(), "firstName", "MwwjNtdOFT");
        setField(term6999, term6999.getClass(), "lastName", "VYkqXKVlAJ");
        setField(term6999, term6999.getClass(), "password", "XkIoWJRNwN");
        setField(term6999, term6999.getClass(), "phoneNumber", "aNWLJdrZMq");
        setField(term6999, term6999.getClass(), "email", "HHmNoYxIGj");
        setField(term6999, term6999.getClass(), "role", enum26);
        setField(term6999, term6999.getClass(), "orders", term7080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DbiCVtPPCT";
        callMethod(klass, "setId", argTypes, term6999, args);
    }

};


