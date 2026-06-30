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

public class UserCreationResponse_getId_9861445475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8837;

    public UserCreationResponse_getId_9861445475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9038 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term9037 = ((Class) term9038).getDeclaredField((String) "ADMIN");
        ((Field) term9037).setAccessible(true);
        Object enum30 = ((Field) term9037).get((Object) null);
        Class<? extends Object> term9220 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term9219 = ((Class) term9220).getDeclaredField((String) "ORDERED");
        ((Field) term9219).setAccessible(true);
        Object enum31 = ((Field) term9219).get((Object) null);
        Object term8909 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term8915 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8916 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term8909, term8909.getClass(), "id", "");
        setField(term8909, term8909.getClass(), "imageUrl", "");
        setDoubleField(term8909, term8909.getClass(), "size", 0.0022646783892913414);
        setIntField(term8909, term8909.getClass(), "quantity", -1530420153);
        setDoubleField(term8909, term8909.getClass(), "price", 0.36226058076369927);
        setField(term8915, term8915.getClass(), "date", null);
        setField(term8915, term8915.getClass(), "time", null);
        setField(term8909, term8909.getClass(), "orderDate", term8915);
        setField(term8916, term8916.getClass(), "date", null);
        setField(term8916, term8916.getClass(), "time", null);
        setField(term8909, term8909.getClass(), "deliveryDate", term8916);
        setBooleanField(term8909, term8909.getClass(), "ordered", false);
        setField(term8909, term8909.getClass(), "userId", "");
        setField(term8909, term8909.getClass(), "orderStatus", enum31);
        Object term8921 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term8927 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8928 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term8921, term8921.getClass(), "id", "");
        setField(term8921, term8921.getClass(), "imageUrl", "");
        setDoubleField(term8921, term8921.getClass(), "size", 0.03699061125289671);
        setIntField(term8921, term8921.getClass(), "quantity", -469968304);
        setDoubleField(term8921, term8921.getClass(), "price", 0.6047137830113202);
        setField(term8927, term8927.getClass(), "date", null);
        setField(term8927, term8927.getClass(), "time", null);
        setField(term8921, term8921.getClass(), "orderDate", term8927);
        setField(term8928, term8928.getClass(), "date", null);
        setField(term8928, term8928.getClass(), "time", null);
        setField(term8921, term8921.getClass(), "deliveryDate", term8928);
        setBooleanField(term8921, term8921.getClass(), "ordered", false);
        setField(term8921, term8921.getClass(), "userId", "");
        setField(term8921, term8921.getClass(), "orderStatus", enum31);
        Object term8931 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term8937 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8938 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term8931, term8931.getClass(), "id", "");
        setField(term8931, term8931.getClass(), "imageUrl", "");
        setDoubleField(term8931, term8931.getClass(), "size", 0.6767213143579776);
        setIntField(term8931, term8931.getClass(), "quantity", -1145578966);
        setDoubleField(term8931, term8931.getClass(), "price", 0.48862955528902696);
        setField(term8937, term8937.getClass(), "date", null);
        setField(term8937, term8937.getClass(), "time", null);
        setField(term8931, term8931.getClass(), "orderDate", term8937);
        setField(term8938, term8938.getClass(), "date", null);
        setField(term8938, term8938.getClass(), "time", null);
        setField(term8931, term8931.getClass(), "deliveryDate", term8938);
        setBooleanField(term8931, term8931.getClass(), "ordered", true);
        setField(term8931, term8931.getClass(), "userId", "");
        setField(term8931, term8931.getClass(), "orderStatus", enum31);
        Object term8941 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term8947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8948 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term8941, term8941.getClass(), "id", "");
        setField(term8941, term8941.getClass(), "imageUrl", "");
        setDoubleField(term8941, term8941.getClass(), "size", 0.426231085465289);
        setIntField(term8941, term8941.getClass(), "quantity", 679763016);
        setDoubleField(term8941, term8941.getClass(), "price", 0.0027299293098262956);
        setField(term8947, term8947.getClass(), "date", null);
        setField(term8947, term8947.getClass(), "time", null);
        setField(term8941, term8941.getClass(), "orderDate", term8947);
        setField(term8948, term8948.getClass(), "date", null);
        setField(term8948, term8948.getClass(), "time", null);
        setField(term8941, term8941.getClass(), "deliveryDate", term8948);
        setBooleanField(term8941, term8941.getClass(), "ordered", true);
        setField(term8941, term8941.getClass(), "userId", "");
        setField(term8941, term8941.getClass(), "orderStatus", enum31);
        Class<? extends Object> term9443 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term9442 = ((Class) term9443).getDeclaredField((String) "PENDING");
        ((Field) term9442).setAccessible(true);
        Object enum32 = ((Field) term9442).get((Object) null);
        Object term8951 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term8957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8958 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term8951, term8951.getClass(), "id", "");
        setField(term8951, term8951.getClass(), "imageUrl", "");
        setDoubleField(term8951, term8951.getClass(), "size", 0.29874017652881824);
        setIntField(term8951, term8951.getClass(), "quantity", 1962444399);
        setDoubleField(term8951, term8951.getClass(), "price", 0.32554480512985284);
        setField(term8957, term8957.getClass(), "date", null);
        setField(term8957, term8957.getClass(), "time", null);
        setField(term8951, term8951.getClass(), "orderDate", term8957);
        setField(term8958, term8958.getClass(), "date", null);
        setField(term8958, term8958.getClass(), "time", null);
        setField(term8951, term8951.getClass(), "deliveryDate", term8958);
        setBooleanField(term8951, term8951.getClass(), "ordered", true);
        setField(term8951, term8951.getClass(), "userId", "");
        setField(term8951, term8951.getClass(), "orderStatus", enum32);
        Class<? extends Object> term9666 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term9665 = ((Class) term9666).getDeclaredField((String) "PENDING");
        ((Field) term9665).setAccessible(true);
        Object enum33 = ((Field) term9665).get((Object) null);
        Object term8963 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term8969 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8970 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term8963, term8963.getClass(), "id", "");
        setField(term8963, term8963.getClass(), "imageUrl", "");
        setDoubleField(term8963, term8963.getClass(), "size", 0.8924855581421237);
        setIntField(term8963, term8963.getClass(), "quantity", 767834723);
        setDoubleField(term8963, term8963.getClass(), "price", 0.32237559209193944);
        setField(term8969, term8969.getClass(), "date", null);
        setField(term8969, term8969.getClass(), "time", null);
        setField(term8963, term8963.getClass(), "orderDate", term8969);
        setField(term8970, term8970.getClass(), "date", null);
        setField(term8970, term8970.getClass(), "time", null);
        setField(term8963, term8963.getClass(), "deliveryDate", term8970);
        setBooleanField(term8963, term8963.getClass(), "ordered", true);
        setField(term8963, term8963.getClass(), "userId", "");
        setField(term8963, term8963.getClass(), "orderStatus", enum33);
        Object term8975 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term8981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8982 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term8975, term8975.getClass(), "id", "");
        setField(term8975, term8975.getClass(), "imageUrl", "");
        setDoubleField(term8975, term8975.getClass(), "size", 0.53094494792755);
        setIntField(term8975, term8975.getClass(), "quantity", -602026508);
        setDoubleField(term8975, term8975.getClass(), "price", 0.146431486357265);
        setField(term8981, term8981.getClass(), "date", null);
        setField(term8981, term8981.getClass(), "time", null);
        setField(term8975, term8975.getClass(), "orderDate", term8981);
        setField(term8982, term8982.getClass(), "date", null);
        setField(term8982, term8982.getClass(), "time", null);
        setField(term8975, term8975.getClass(), "deliveryDate", term8982);
        setBooleanField(term8975, term8975.getClass(), "ordered", true);
        setField(term8975, term8975.getClass(), "userId", "");
        setField(term8975, term8975.getClass(), "orderStatus", enum32);
        ArrayList term8907 = new ArrayList();
        ((ArrayList) term8907).add(term8909);
        ((ArrayList) term8907).add(term8921);
        ((ArrayList) term8907).add(term8931);
        ((ArrayList) term8907).add(term8941);
        ((ArrayList) term8907).add(term8951);
        ((ArrayList) term8907).add(term8963);
        ((ArrayList) term8907).add(term8975);
        term8837 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term8837, term8837.getClass(), "firstName", "eVpkWxjuki");
        setField(term8837, term8837.getClass(), "lastName", "SJiQaLvSKv");
        setField(term8837, term8837.getClass(), "username", "OEXDRUKcFl");
        setField(term8837, term8837.getClass(), "email", "RYdKCNNMBR");
        setField(term8837, term8837.getClass(), "id", "yGtHPyvYiQ");
        setField(term8837, term8837.getClass(), "role", enum30);
        setField(term8837, term8837.getClass(), "orders", term8907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term8837, args);
    }

};


