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

public class UserCreationResponse_getLastName_17522221352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6439;

    public UserCreationResponse_getLastName_17522221352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6597 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term6596 = ((Class) term6597).getDeclaredField((String) "USER");
        ((Field) term6596).setAccessible(true);
        Object enum21 = ((Field) term6596).get((Object) null);
        Class<? extends Object> term6776 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term6775 = ((Class) term6776).getDeclaredField((String) "DELIVERED");
        ((Field) term6775).setAccessible(true);
        Object enum22 = ((Field) term6775).get((Object) null);
        Object term6510 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term6516 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6517 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term6510, term6510.getClass(), "id", "");
        setField(term6510, term6510.getClass(), "imageUrl", "");
        setDoubleField(term6510, term6510.getClass(), "size", 0.8823181080774973);
        setIntField(term6510, term6510.getClass(), "quantity", -117576464);
        setDoubleField(term6510, term6510.getClass(), "price", 0.2192450926212024);
        setField(term6516, term6516.getClass(), "date", null);
        setField(term6516, term6516.getClass(), "time", null);
        setField(term6510, term6510.getClass(), "orderDate", term6516);
        setField(term6517, term6517.getClass(), "date", null);
        setField(term6517, term6517.getClass(), "time", null);
        setField(term6510, term6510.getClass(), "deliveryDate", term6517);
        setBooleanField(term6510, term6510.getClass(), "ordered", true);
        setField(term6510, term6510.getClass(), "userId", "");
        setField(term6510, term6510.getClass(), "orderStatus", enum22);
        Object term6522 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term6528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6529 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term6522, term6522.getClass(), "id", "");
        setField(term6522, term6522.getClass(), "imageUrl", "");
        setDoubleField(term6522, term6522.getClass(), "size", 0.7591353014991907);
        setIntField(term6522, term6522.getClass(), "quantity", -1007160944);
        setDoubleField(term6522, term6522.getClass(), "price", 0.791695029600875);
        setField(term6528, term6528.getClass(), "date", null);
        setField(term6528, term6528.getClass(), "time", null);
        setField(term6522, term6522.getClass(), "orderDate", term6528);
        setField(term6529, term6529.getClass(), "date", null);
        setField(term6529, term6529.getClass(), "time", null);
        setField(term6522, term6522.getClass(), "deliveryDate", term6529);
        setBooleanField(term6522, term6522.getClass(), "ordered", true);
        setField(term6522, term6522.getClass(), "userId", "");
        setField(term6522, term6522.getClass(), "orderStatus", enum22);
        Class<? extends Object> term7005 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term7004 = ((Class) term7005).getDeclaredField((String) "ORDERED");
        ((Field) term7004).setAccessible(true);
        Object enum23 = ((Field) term7004).get((Object) null);
        Object term6532 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term6538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6539 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term6532, term6532.getClass(), "id", "");
        setField(term6532, term6532.getClass(), "imageUrl", "");
        setDoubleField(term6532, term6532.getClass(), "size", 0.6862221294683138);
        setIntField(term6532, term6532.getClass(), "quantity", 1135664017);
        setDoubleField(term6532, term6532.getClass(), "price", 0.15917839663695388);
        setField(term6538, term6538.getClass(), "date", null);
        setField(term6538, term6538.getClass(), "time", null);
        setField(term6532, term6532.getClass(), "orderDate", term6538);
        setField(term6539, term6539.getClass(), "date", null);
        setField(term6539, term6539.getClass(), "time", null);
        setField(term6532, term6532.getClass(), "deliveryDate", term6539);
        setBooleanField(term6532, term6532.getClass(), "ordered", true);
        setField(term6532, term6532.getClass(), "userId", "");
        setField(term6532, term6532.getClass(), "orderStatus", enum23);
        ArrayList term6508 = new ArrayList();
        ((ArrayList) term6508).add(term6510);
        ((ArrayList) term6508).add(term6522);
        ((ArrayList) term6508).add(term6532);
        term6439 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term6439, term6439.getClass(), "firstName", "ffYhPOzlUs");
        setField(term6439, term6439.getClass(), "lastName", "MLqYREekMl");
        setField(term6439, term6439.getClass(), "username", "ytSBIKXogI");
        setField(term6439, term6439.getClass(), "email", "nHXjMycHlU");
        setField(term6439, term6439.getClass(), "id", "ieCtQFdkii");
        setField(term6439, term6439.getClass(), "role", enum21);
        setField(term6439, term6439.getClass(), "orders", term6508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term6439, args);
    }

};


