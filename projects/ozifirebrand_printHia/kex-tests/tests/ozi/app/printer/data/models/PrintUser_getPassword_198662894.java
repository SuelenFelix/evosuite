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

public class PrintUser_getPassword_198662894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3387;

    public PrintUser_getPassword_198662894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3607 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term3606 = ((Class) term3607).getDeclaredField((String) "USER");
        ((Field) term3606).setAccessible(true);
        Object enum13 = ((Field) term3606).get((Object) null);
        Class<? extends Object> term3786 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term3785 = ((Class) term3786).getDeclaredField((String) "ORDERED");
        ((Field) term3785).setAccessible(true);
        Object enum14 = ((Field) term3785).get((Object) null);
        Object term3470 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term3476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3477 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term3470, term3470.getClass(), "id", "");
        setField(term3470, term3470.getClass(), "imageUrl", "");
        setDoubleField(term3470, term3470.getClass(), "size", 0.9737083944266686);
        setIntField(term3470, term3470.getClass(), "quantity", -1456670397);
        setDoubleField(term3470, term3470.getClass(), "price", 0.0668892744806211);
        setField(term3476, term3476.getClass(), "date", null);
        setField(term3476, term3476.getClass(), "time", null);
        setField(term3470, term3470.getClass(), "orderDate", term3476);
        setField(term3477, term3477.getClass(), "date", null);
        setField(term3477, term3477.getClass(), "time", null);
        setField(term3470, term3470.getClass(), "deliveryDate", term3477);
        setBooleanField(term3470, term3470.getClass(), "ordered", true);
        setField(term3470, term3470.getClass(), "userId", "");
        setField(term3470, term3470.getClass(), "orderStatus", enum14);
        Object term3482 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term3488 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3489 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term3482, term3482.getClass(), "id", "");
        setField(term3482, term3482.getClass(), "imageUrl", "");
        setDoubleField(term3482, term3482.getClass(), "size", 0.3587267442738795);
        setIntField(term3482, term3482.getClass(), "quantity", 1622346318);
        setDoubleField(term3482, term3482.getClass(), "price", 0.07802449704920456);
        setField(term3488, term3488.getClass(), "date", null);
        setField(term3488, term3488.getClass(), "time", null);
        setField(term3482, term3482.getClass(), "orderDate", term3488);
        setField(term3489, term3489.getClass(), "date", null);
        setField(term3489, term3489.getClass(), "time", null);
        setField(term3482, term3482.getClass(), "deliveryDate", term3489);
        setBooleanField(term3482, term3482.getClass(), "ordered", false);
        setField(term3482, term3482.getClass(), "userId", "");
        setField(term3482, term3482.getClass(), "orderStatus", enum14);
        Class<? extends Object> term4009 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term4008 = ((Class) term4009).getDeclaredField((String) "PENDING");
        ((Field) term4008).setAccessible(true);
        Object enum15 = ((Field) term4008).get((Object) null);
        Object term3492 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term3498 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3499 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term3492, term3492.getClass(), "id", "");
        setField(term3492, term3492.getClass(), "imageUrl", "");
        setDoubleField(term3492, term3492.getClass(), "size", 0.5279279537140873);
        setIntField(term3492, term3492.getClass(), "quantity", 1048535127);
        setDoubleField(term3492, term3492.getClass(), "price", 0.3202192021706908);
        setField(term3498, term3498.getClass(), "date", null);
        setField(term3498, term3498.getClass(), "time", null);
        setField(term3492, term3492.getClass(), "orderDate", term3498);
        setField(term3499, term3499.getClass(), "date", null);
        setField(term3499, term3499.getClass(), "time", null);
        setField(term3492, term3492.getClass(), "deliveryDate", term3499);
        setBooleanField(term3492, term3492.getClass(), "ordered", false);
        setField(term3492, term3492.getClass(), "userId", "");
        setField(term3492, term3492.getClass(), "orderStatus", enum15);
        Object term3504 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term3510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3511 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term3504, term3504.getClass(), "id", "");
        setField(term3504, term3504.getClass(), "imageUrl", "");
        setDoubleField(term3504, term3504.getClass(), "size", 0.22651340641904605);
        setIntField(term3504, term3504.getClass(), "quantity", -655067527);
        setDoubleField(term3504, term3504.getClass(), "price", 0.8878841294187743);
        setField(term3510, term3510.getClass(), "date", null);
        setField(term3510, term3510.getClass(), "time", null);
        setField(term3504, term3504.getClass(), "orderDate", term3510);
        setField(term3511, term3511.getClass(), "date", null);
        setField(term3511, term3511.getClass(), "time", null);
        setField(term3504, term3504.getClass(), "deliveryDate", term3511);
        setBooleanField(term3504, term3504.getClass(), "ordered", true);
        setField(term3504, term3504.getClass(), "userId", "");
        setField(term3504, term3504.getClass(), "orderStatus", enum15);
        Object term3514 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term3520 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3521 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term3514, term3514.getClass(), "id", "");
        setField(term3514, term3514.getClass(), "imageUrl", "");
        setDoubleField(term3514, term3514.getClass(), "size", 0.6588948704887806);
        setIntField(term3514, term3514.getClass(), "quantity", -6029667);
        setDoubleField(term3514, term3514.getClass(), "price", 0.6397214730945112);
        setField(term3520, term3520.getClass(), "date", null);
        setField(term3520, term3520.getClass(), "time", null);
        setField(term3514, term3514.getClass(), "orderDate", term3520);
        setField(term3521, term3521.getClass(), "date", null);
        setField(term3521, term3521.getClass(), "time", null);
        setField(term3514, term3514.getClass(), "deliveryDate", term3521);
        setBooleanField(term3514, term3514.getClass(), "ordered", true);
        setField(term3514, term3514.getClass(), "userId", "");
        setField(term3514, term3514.getClass(), "orderStatus", enum14);
        Object term3524 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term3530 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3531 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term3524, term3524.getClass(), "id", "");
        setField(term3524, term3524.getClass(), "imageUrl", "");
        setDoubleField(term3524, term3524.getClass(), "size", 0.25937345430928016);
        setIntField(term3524, term3524.getClass(), "quantity", -2068769794);
        setDoubleField(term3524, term3524.getClass(), "price", 0.5873228247510078);
        setField(term3530, term3530.getClass(), "date", null);
        setField(term3530, term3530.getClass(), "time", null);
        setField(term3524, term3524.getClass(), "orderDate", term3530);
        setField(term3531, term3531.getClass(), "date", null);
        setField(term3531, term3531.getClass(), "time", null);
        setField(term3524, term3524.getClass(), "deliveryDate", term3531);
        setBooleanField(term3524, term3524.getClass(), "ordered", true);
        setField(term3524, term3524.getClass(), "userId", "");
        setField(term3524, term3524.getClass(), "orderStatus", enum14);
        Object term3534 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term3540 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3541 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term3534, term3534.getClass(), "id", "");
        setField(term3534, term3534.getClass(), "imageUrl", "");
        setDoubleField(term3534, term3534.getClass(), "size", 0.8823181080774973);
        setIntField(term3534, term3534.getClass(), "quantity", -117576464);
        setDoubleField(term3534, term3534.getClass(), "price", 0.2192450926212024);
        setField(term3540, term3540.getClass(), "date", null);
        setField(term3540, term3540.getClass(), "time", null);
        setField(term3534, term3534.getClass(), "orderDate", term3540);
        setField(term3541, term3541.getClass(), "date", null);
        setField(term3541, term3541.getClass(), "time", null);
        setField(term3534, term3534.getClass(), "deliveryDate", term3541);
        setBooleanField(term3534, term3534.getClass(), "ordered", true);
        setField(term3534, term3534.getClass(), "userId", "");
        setField(term3534, term3534.getClass(), "orderStatus", enum15);
        ArrayList term3468 = new ArrayList();
        ((ArrayList) term3468).add(term3470);
        ((ArrayList) term3468).add(term3482);
        ((ArrayList) term3468).add(term3492);
        ((ArrayList) term3468).add(term3504);
        ((ArrayList) term3468).add(term3514);
        ((ArrayList) term3468).add(term3524);
        ((ArrayList) term3468).add(term3534);
        term3387 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term3387, term3387.getClass(), "id", "whBvTVIIlC");
        setField(term3387, term3387.getClass(), "firstName", "IgRJUzaCwW");
        setField(term3387, term3387.getClass(), "lastName", "JUmudUmaaV");
        setField(term3387, term3387.getClass(), "password", "KoyGrUJeJW");
        setField(term3387, term3387.getClass(), "phoneNumber", "HqBOwkVqjD");
        setField(term3387, term3387.getClass(), "email", "MAcUBcBckh");
        setField(term3387, term3387.getClass(), "role", enum13);
        setField(term3387, term3387.getClass(), "orders", term3468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term3387, args);
    }

};


