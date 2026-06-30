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

public class UserCreationResponse_getOrders_20322087427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10939;

    public UserCreationResponse_getOrders_20322087427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11088 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term11087 = ((Class) term11088).getDeclaredField((String) "ADMIN");
        ((Field) term11087).setAccessible(true);
        Object enum38 = ((Field) term11087).get((Object) null);
        Class<? extends Object> term11270 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term11269 = ((Class) term11270).getDeclaredField((String) "PENDING");
        ((Field) term11269).setAccessible(true);
        Object enum39 = ((Field) term11269).get((Object) null);
        Object term11011 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term11017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11018 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term11011, term11011.getClass(), "id", "");
        setField(term11011, term11011.getClass(), "imageUrl", "");
        setDoubleField(term11011, term11011.getClass(), "size", 0.7171972879282721);
        setIntField(term11011, term11011.getClass(), "quantity", 1632125673);
        setDoubleField(term11011, term11011.getClass(), "price", 0.9006361024877096);
        setField(term11017, term11017.getClass(), "date", null);
        setField(term11017, term11017.getClass(), "time", null);
        setField(term11011, term11011.getClass(), "orderDate", term11017);
        setField(term11018, term11018.getClass(), "date", null);
        setField(term11018, term11018.getClass(), "time", null);
        setField(term11011, term11011.getClass(), "deliveryDate", term11018);
        setBooleanField(term11011, term11011.getClass(), "ordered", true);
        setField(term11011, term11011.getClass(), "userId", "");
        setField(term11011, term11011.getClass(), "orderStatus", enum39);
        Class<? extends Object> term11493 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term11492 = ((Class) term11493).getDeclaredField((String) "DELIVERED");
        ((Field) term11492).setAccessible(true);
        Object enum40 = ((Field) term11492).get((Object) null);
        Object term11023 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term11029 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11030 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term11023, term11023.getClass(), "id", "");
        setField(term11023, term11023.getClass(), "imageUrl", "");
        setDoubleField(term11023, term11023.getClass(), "size", 0.5644914462415626);
        setIntField(term11023, term11023.getClass(), "quantity", 454281060);
        setDoubleField(term11023, term11023.getClass(), "price", 0.509895859167191);
        setField(term11029, term11029.getClass(), "date", null);
        setField(term11029, term11029.getClass(), "time", null);
        setField(term11023, term11023.getClass(), "orderDate", term11029);
        setField(term11030, term11030.getClass(), "date", null);
        setField(term11030, term11030.getClass(), "time", null);
        setField(term11023, term11023.getClass(), "deliveryDate", term11030);
        setBooleanField(term11023, term11023.getClass(), "ordered", true);
        setField(term11023, term11023.getClass(), "userId", "");
        setField(term11023, term11023.getClass(), "orderStatus", enum40);
        ArrayList term11009 = new ArrayList();
        ((ArrayList) term11009).add(term11011);
        ((ArrayList) term11009).add(term11023);
        term10939 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term10939, term10939.getClass(), "firstName", "BRIVNtfUWU");
        setField(term10939, term10939.getClass(), "lastName", "DbiCVtPPCT");
        setField(term10939, term10939.getClass(), "username", "WzFopsaDuG");
        setField(term10939, term10939.getClass(), "email", "PapWxkhEWe");
        setField(term10939, term10939.getClass(), "id", "smnHEqRFRx");
        setField(term10939, term10939.getClass(), "role", enum38);
        setField(term10939, term10939.getClass(), "orders", term11009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrders", argTypes, term10939, args);
    }

};


