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

public class PrintUser_setFirstName_164892966910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7815;

    public PrintUser_setFirstName_164892966910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8040 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term8039 = ((Class) term8040).getDeclaredField((String) "ADMIN");
        ((Field) term8039).setAccessible(true);
        Object enum29 = ((Field) term8039).get((Object) null);
        Class<? extends Object> term8222 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term8221 = ((Class) term8222).getDeclaredField((String) "PENDING");
        ((Field) term8221).setAccessible(true);
        Object enum30 = ((Field) term8221).get((Object) null);
        Object term7899 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term7905 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7906 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term7899, term7899.getClass(), "id", "");
        setField(term7899, term7899.getClass(), "imageUrl", "");
        setDoubleField(term7899, term7899.getClass(), "size", 0.0022646783892913414);
        setIntField(term7899, term7899.getClass(), "quantity", -1530420153);
        setDoubleField(term7899, term7899.getClass(), "price", 0.36226058076369927);
        setField(term7905, term7905.getClass(), "date", null);
        setField(term7905, term7905.getClass(), "time", null);
        setField(term7899, term7899.getClass(), "orderDate", term7905);
        setField(term7906, term7906.getClass(), "date", null);
        setField(term7906, term7906.getClass(), "time", null);
        setField(term7899, term7899.getClass(), "deliveryDate", term7906);
        setBooleanField(term7899, term7899.getClass(), "ordered", true);
        setField(term7899, term7899.getClass(), "userId", "");
        setField(term7899, term7899.getClass(), "orderStatus", enum30);
        Object term7911 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term7917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7918 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term7911, term7911.getClass(), "id", "");
        setField(term7911, term7911.getClass(), "imageUrl", "");
        setDoubleField(term7911, term7911.getClass(), "size", 0.03699061125289671);
        setIntField(term7911, term7911.getClass(), "quantity", -469968304);
        setDoubleField(term7911, term7911.getClass(), "price", 0.6047137830113202);
        setField(term7917, term7917.getClass(), "date", null);
        setField(term7917, term7917.getClass(), "time", null);
        setField(term7911, term7911.getClass(), "orderDate", term7917);
        setField(term7918, term7918.getClass(), "date", null);
        setField(term7918, term7918.getClass(), "time", null);
        setField(term7911, term7911.getClass(), "deliveryDate", term7918);
        setBooleanField(term7911, term7911.getClass(), "ordered", true);
        setField(term7911, term7911.getClass(), "userId", "");
        setField(term7911, term7911.getClass(), "orderStatus", enum30);
        Object term7921 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term7927 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7928 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term7921, term7921.getClass(), "id", "");
        setField(term7921, term7921.getClass(), "imageUrl", "");
        setDoubleField(term7921, term7921.getClass(), "size", 0.6767213143579776);
        setIntField(term7921, term7921.getClass(), "quantity", -1145578966);
        setDoubleField(term7921, term7921.getClass(), "price", 0.48862955528902696);
        setField(term7927, term7927.getClass(), "date", null);
        setField(term7927, term7927.getClass(), "time", null);
        setField(term7921, term7921.getClass(), "orderDate", term7927);
        setField(term7928, term7928.getClass(), "date", null);
        setField(term7928, term7928.getClass(), "time", null);
        setField(term7921, term7921.getClass(), "deliveryDate", term7928);
        setBooleanField(term7921, term7921.getClass(), "ordered", true);
        setField(term7921, term7921.getClass(), "userId", "");
        setField(term7921, term7921.getClass(), "orderStatus", enum30);
        Object term7931 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term7937 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7938 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term7931, term7931.getClass(), "id", "");
        setField(term7931, term7931.getClass(), "imageUrl", "");
        setDoubleField(term7931, term7931.getClass(), "size", 0.426231085465289);
        setIntField(term7931, term7931.getClass(), "quantity", 679763016);
        setDoubleField(term7931, term7931.getClass(), "price", 0.0027299293098262956);
        setField(term7937, term7937.getClass(), "date", null);
        setField(term7937, term7937.getClass(), "time", null);
        setField(term7931, term7931.getClass(), "orderDate", term7937);
        setField(term7938, term7938.getClass(), "date", null);
        setField(term7938, term7938.getClass(), "time", null);
        setField(term7931, term7931.getClass(), "deliveryDate", term7938);
        setBooleanField(term7931, term7931.getClass(), "ordered", false);
        setField(term7931, term7931.getClass(), "userId", "");
        setField(term7931, term7931.getClass(), "orderStatus", enum30);
        Class<? extends Object> term8445 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term8444 = ((Class) term8445).getDeclaredField((String) "DELIVERED");
        ((Field) term8444).setAccessible(true);
        Object enum31 = ((Field) term8444).get((Object) null);
        Object term7941 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term7947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7948 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term7941, term7941.getClass(), "id", "");
        setField(term7941, term7941.getClass(), "imageUrl", "");
        setDoubleField(term7941, term7941.getClass(), "size", 0.29874017652881824);
        setIntField(term7941, term7941.getClass(), "quantity", 1962444399);
        setDoubleField(term7941, term7941.getClass(), "price", 0.32554480512985284);
        setField(term7947, term7947.getClass(), "date", null);
        setField(term7947, term7947.getClass(), "time", null);
        setField(term7941, term7941.getClass(), "orderDate", term7947);
        setField(term7948, term7948.getClass(), "date", null);
        setField(term7948, term7948.getClass(), "time", null);
        setField(term7941, term7941.getClass(), "deliveryDate", term7948);
        setBooleanField(term7941, term7941.getClass(), "ordered", false);
        setField(term7941, term7941.getClass(), "userId", "");
        setField(term7941, term7941.getClass(), "orderStatus", enum31);
        Class<? extends Object> term8674 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term8673 = ((Class) term8674).getDeclaredField((String) "PENDING");
        ((Field) term8673).setAccessible(true);
        Object enum32 = ((Field) term8673).get((Object) null);
        Object term7953 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term7959 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7960 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term7953, term7953.getClass(), "id", "");
        setField(term7953, term7953.getClass(), "imageUrl", "");
        setDoubleField(term7953, term7953.getClass(), "size", 0.8924855581421237);
        setIntField(term7953, term7953.getClass(), "quantity", 767834723);
        setDoubleField(term7953, term7953.getClass(), "price", 0.32237559209193944);
        setField(term7959, term7959.getClass(), "date", null);
        setField(term7959, term7959.getClass(), "time", null);
        setField(term7953, term7953.getClass(), "orderDate", term7959);
        setField(term7960, term7960.getClass(), "date", null);
        setField(term7960, term7960.getClass(), "time", null);
        setField(term7953, term7953.getClass(), "deliveryDate", term7960);
        setBooleanField(term7953, term7953.getClass(), "ordered", false);
        setField(term7953, term7953.getClass(), "userId", "");
        setField(term7953, term7953.getClass(), "orderStatus", enum32);
        ArrayList term7897 = new ArrayList();
        ((ArrayList) term7897).add(term7899);
        ((ArrayList) term7897).add(term7911);
        ((ArrayList) term7897).add(term7921);
        ((ArrayList) term7897).add(term7931);
        ((ArrayList) term7897).add(term7941);
        ((ArrayList) term7897).add(term7953);
        term7815 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term7815, term7815.getClass(), "id", "WzFopsaDuG");
        setField(term7815, term7815.getClass(), "firstName", "PapWxkhEWe");
        setField(term7815, term7815.getClass(), "lastName", "smnHEqRFRx");
        setField(term7815, term7815.getClass(), "password", "XYtryyobou");
        setField(term7815, term7815.getClass(), "phoneNumber", "OYbzXylRWW");
        setField(term7815, term7815.getClass(), "email", "DSNsTGYXDF");
        setField(term7815, term7815.getClass(), "role", enum29);
        setField(term7815, term7815.getClass(), "orders", term7897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kNqaJKIATy";
        callMethod(klass, "setFirstName", argTypes, term7815, args);
    }

};


