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

public class PrintUser_setRole_94553292915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12497;
     Object enum46;

    public PrintUser_setRole_94553292915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12707 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term12706 = ((Class) term12707).getDeclaredField((String) "USER");
        ((Field) term12706).setAccessible(true);
        enum46 = ((Field) term12706).get((Object) null);
        Class<? extends Object> term12886 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term12885 = ((Class) term12886).getDeclaredField((String) "PENDING");
        ((Field) term12885).setAccessible(true);
        Object enum47 = ((Field) term12885).get((Object) null);
        Object term12580 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term12586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12587 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term12580, term12580.getClass(), "id", "");
        setField(term12580, term12580.getClass(), "imageUrl", "");
        setDoubleField(term12580, term12580.getClass(), "size", 0.6561919196821765);
        setIntField(term12580, term12580.getClass(), "quantity", -184153539);
        setDoubleField(term12580, term12580.getClass(), "price", 0.7330178886612495);
        setField(term12586, term12586.getClass(), "date", null);
        setField(term12586, term12586.getClass(), "time", null);
        setField(term12580, term12580.getClass(), "orderDate", term12586);
        setField(term12587, term12587.getClass(), "date", null);
        setField(term12587, term12587.getClass(), "time", null);
        setField(term12580, term12580.getClass(), "deliveryDate", term12587);
        setBooleanField(term12580, term12580.getClass(), "ordered", true);
        setField(term12580, term12580.getClass(), "userId", "");
        setField(term12580, term12580.getClass(), "orderStatus", enum47);
        Class<? extends Object> term13109 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term13108 = ((Class) term13109).getDeclaredField((String) "ORDERED");
        ((Field) term13108).setAccessible(true);
        Object enum48 = ((Field) term13108).get((Object) null);
        Object term12592 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term12598 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12599 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term12592, term12592.getClass(), "id", "");
        setField(term12592, term12592.getClass(), "imageUrl", "");
        setDoubleField(term12592, term12592.getClass(), "size", 0.7618164754425794);
        setIntField(term12592, term12592.getClass(), "quantity", 493620644);
        setDoubleField(term12592, term12592.getClass(), "price", 0.7385589312559342);
        setField(term12598, term12598.getClass(), "date", null);
        setField(term12598, term12598.getClass(), "time", null);
        setField(term12592, term12592.getClass(), "orderDate", term12598);
        setField(term12599, term12599.getClass(), "date", null);
        setField(term12599, term12599.getClass(), "time", null);
        setField(term12592, term12592.getClass(), "deliveryDate", term12599);
        setBooleanField(term12592, term12592.getClass(), "ordered", false);
        setField(term12592, term12592.getClass(), "userId", "");
        setField(term12592, term12592.getClass(), "orderStatus", enum48);
        Object term12604 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term12610 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12611 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term12604, term12604.getClass(), "id", "");
        setField(term12604, term12604.getClass(), "imageUrl", "");
        setDoubleField(term12604, term12604.getClass(), "size", 0.7080134263823477);
        setIntField(term12604, term12604.getClass(), "quantity", 1328271830);
        setDoubleField(term12604, term12604.getClass(), "price", 0.6059734092898602);
        setField(term12610, term12610.getClass(), "date", null);
        setField(term12610, term12610.getClass(), "time", null);
        setField(term12604, term12604.getClass(), "orderDate", term12610);
        setField(term12611, term12611.getClass(), "date", null);
        setField(term12611, term12611.getClass(), "time", null);
        setField(term12604, term12604.getClass(), "deliveryDate", term12611);
        setBooleanField(term12604, term12604.getClass(), "ordered", false);
        setField(term12604, term12604.getClass(), "userId", "");
        setField(term12604, term12604.getClass(), "orderStatus", enum48);
        Object term12614 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term12620 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12621 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term12614, term12614.getClass(), "id", "");
        setField(term12614, term12614.getClass(), "imageUrl", "");
        setDoubleField(term12614, term12614.getClass(), "size", 0.3074693824288357);
        setIntField(term12614, term12614.getClass(), "quantity", 1596070772);
        setDoubleField(term12614, term12614.getClass(), "price", 0.1245258965512791);
        setField(term12620, term12620.getClass(), "date", null);
        setField(term12620, term12620.getClass(), "time", null);
        setField(term12614, term12614.getClass(), "orderDate", term12620);
        setField(term12621, term12621.getClass(), "date", null);
        setField(term12621, term12621.getClass(), "time", null);
        setField(term12614, term12614.getClass(), "deliveryDate", term12621);
        setBooleanField(term12614, term12614.getClass(), "ordered", false);
        setField(term12614, term12614.getClass(), "userId", "");
        setField(term12614, term12614.getClass(), "orderStatus", enum48);
        Object term12624 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term12630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12631 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term12624, term12624.getClass(), "id", "");
        setField(term12624, term12624.getClass(), "imageUrl", "");
        setDoubleField(term12624, term12624.getClass(), "size", 0.9511861072660375);
        setIntField(term12624, term12624.getClass(), "quantity", 97029295);
        setDoubleField(term12624, term12624.getClass(), "price", 0.05880719443135807);
        setField(term12630, term12630.getClass(), "date", null);
        setField(term12630, term12630.getClass(), "time", null);
        setField(term12624, term12624.getClass(), "orderDate", term12630);
        setField(term12631, term12631.getClass(), "date", null);
        setField(term12631, term12631.getClass(), "time", null);
        setField(term12624, term12624.getClass(), "deliveryDate", term12631);
        setBooleanField(term12624, term12624.getClass(), "ordered", false);
        setField(term12624, term12624.getClass(), "userId", "");
        setField(term12624, term12624.getClass(), "orderStatus", enum47);
        Object term12634 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term12640 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12641 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term12634, term12634.getClass(), "id", "");
        setField(term12634, term12634.getClass(), "imageUrl", "");
        setDoubleField(term12634, term12634.getClass(), "size", 0.34010089048558567);
        setIntField(term12634, term12634.getClass(), "quantity", -1371869594);
        setDoubleField(term12634, term12634.getClass(), "price", 0.19625398866403143);
        setField(term12640, term12640.getClass(), "date", null);
        setField(term12640, term12640.getClass(), "time", null);
        setField(term12634, term12634.getClass(), "orderDate", term12640);
        setField(term12641, term12641.getClass(), "date", null);
        setField(term12641, term12641.getClass(), "time", null);
        setField(term12634, term12634.getClass(), "deliveryDate", term12641);
        setBooleanField(term12634, term12634.getClass(), "ordered", true);
        setField(term12634, term12634.getClass(), "userId", "");
        setField(term12634, term12634.getClass(), "orderStatus", enum48);
        ArrayList term12578 = new ArrayList();
        ((ArrayList) term12578).add(term12580);
        ((ArrayList) term12578).add(term12592);
        ((ArrayList) term12578).add(term12604);
        ((ArrayList) term12578).add(term12614);
        ((ArrayList) term12578).add(term12624);
        ((ArrayList) term12578).add(term12634);
        term12497 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term12497, term12497.getClass(), "id", "pvDEABOxLt");
        setField(term12497, term12497.getClass(), "firstName", "beAMpkroCQ");
        setField(term12497, term12497.getClass(), "lastName", "uSUvKAyuvd");
        setField(term12497, term12497.getClass(), "password", "onQLVONGuf");
        setField(term12497, term12497.getClass(), "phoneNumber", "SOrEHbcbmn");
        setField(term12497, term12497.getClass(), "email", "bnsyeQXFdu");
        setField(term12497, term12497.getClass(), "role", enum46);
        setField(term12497, term12497.getClass(), "orders", term12578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.models.Role");
        Object[] args = new Object[1];
        args[0] = enum46;
        callMethod(klass, "setRole", argTypes, term12497, args);
    }

};


