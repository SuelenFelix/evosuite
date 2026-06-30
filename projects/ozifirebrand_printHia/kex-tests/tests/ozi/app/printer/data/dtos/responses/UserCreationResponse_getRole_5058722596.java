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

public class UserCreationResponse_getRole_5058722596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9888;

    public UserCreationResponse_getRole_5058722596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10089 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term10088 = ((Class) term10089).getDeclaredField((String) "ADMIN");
        ((Field) term10088).setAccessible(true);
        Object enum34 = ((Field) term10088).get((Object) null);
        Class<? extends Object> term10271 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term10270 = ((Class) term10271).getDeclaredField((String) "PENDING");
        ((Field) term10270).setAccessible(true);
        Object enum35 = ((Field) term10270).get((Object) null);
        Object term9960 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term9966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9967 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term9960, term9960.getClass(), "id", "");
        setField(term9960, term9960.getClass(), "imageUrl", "");
        setDoubleField(term9960, term9960.getClass(), "size", 0.24259014218848696);
        setIntField(term9960, term9960.getClass(), "quantity", -157887805);
        setDoubleField(term9960, term9960.getClass(), "price", 0.1544348383112728);
        setField(term9966, term9966.getClass(), "date", null);
        setField(term9966, term9966.getClass(), "time", null);
        setField(term9960, term9960.getClass(), "orderDate", term9966);
        setField(term9967, term9967.getClass(), "date", null);
        setField(term9967, term9967.getClass(), "time", null);
        setField(term9960, term9960.getClass(), "deliveryDate", term9967);
        setBooleanField(term9960, term9960.getClass(), "ordered", false);
        setField(term9960, term9960.getClass(), "userId", "");
        setField(term9960, term9960.getClass(), "orderStatus", enum35);
        Object term9972 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term9978 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9979 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term9972, term9972.getClass(), "id", "");
        setField(term9972, term9972.getClass(), "imageUrl", "");
        setDoubleField(term9972, term9972.getClass(), "size", 0.5187846213101265);
        setIntField(term9972, term9972.getClass(), "quantity", 1876565163);
        setDoubleField(term9972, term9972.getClass(), "price", 0.045893173090043815);
        setField(term9978, term9978.getClass(), "date", null);
        setField(term9978, term9978.getClass(), "time", null);
        setField(term9972, term9972.getClass(), "orderDate", term9978);
        setField(term9979, term9979.getClass(), "date", null);
        setField(term9979, term9979.getClass(), "time", null);
        setField(term9972, term9972.getClass(), "deliveryDate", term9979);
        setBooleanField(term9972, term9972.getClass(), "ordered", false);
        setField(term9972, term9972.getClass(), "userId", "");
        setField(term9972, term9972.getClass(), "orderStatus", enum35);
        Class<? extends Object> term10494 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term10493 = ((Class) term10494).getDeclaredField((String) "PENDING");
        ((Field) term10493).setAccessible(true);
        Object enum36 = ((Field) term10493).get((Object) null);
        Object term9982 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term9988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9989 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term9982, term9982.getClass(), "id", "");
        setField(term9982, term9982.getClass(), "imageUrl", "");
        setDoubleField(term9982, term9982.getClass(), "size", 0.3626177854778667);
        setIntField(term9982, term9982.getClass(), "quantity", -817164822);
        setDoubleField(term9982, term9982.getClass(), "price", 0.3163771663728089);
        setField(term9988, term9988.getClass(), "date", null);
        setField(term9988, term9988.getClass(), "time", null);
        setField(term9982, term9982.getClass(), "orderDate", term9988);
        setField(term9989, term9989.getClass(), "date", null);
        setField(term9989, term9989.getClass(), "time", null);
        setField(term9982, term9982.getClass(), "deliveryDate", term9989);
        setBooleanField(term9982, term9982.getClass(), "ordered", false);
        setField(term9982, term9982.getClass(), "userId", "");
        setField(term9982, term9982.getClass(), "orderStatus", enum36);
        Object term9994 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term10000 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10001 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term9994, term9994.getClass(), "id", "");
        setField(term9994, term9994.getClass(), "imageUrl", "");
        setDoubleField(term9994, term9994.getClass(), "size", 0.8819646072665548);
        setIntField(term9994, term9994.getClass(), "quantity", -1016503459);
        setDoubleField(term9994, term9994.getClass(), "price", 0.5412182593116958);
        setField(term10000, term10000.getClass(), "date", null);
        setField(term10000, term10000.getClass(), "time", null);
        setField(term9994, term9994.getClass(), "orderDate", term10000);
        setField(term10001, term10001.getClass(), "date", null);
        setField(term10001, term10001.getClass(), "time", null);
        setField(term9994, term9994.getClass(), "deliveryDate", term10001);
        setBooleanField(term9994, term9994.getClass(), "ordered", true);
        setField(term9994, term9994.getClass(), "userId", "");
        setField(term9994, term9994.getClass(), "orderStatus", enum35);
        Object term10004 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term10010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10011 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term10004, term10004.getClass(), "id", "");
        setField(term10004, term10004.getClass(), "imageUrl", "");
        setDoubleField(term10004, term10004.getClass(), "size", 0.16988691727397487);
        setIntField(term10004, term10004.getClass(), "quantity", -1968847291);
        setDoubleField(term10004, term10004.getClass(), "price", 0.39286935532362843);
        setField(term10010, term10010.getClass(), "date", null);
        setField(term10010, term10010.getClass(), "time", null);
        setField(term10004, term10004.getClass(), "orderDate", term10010);
        setField(term10011, term10011.getClass(), "date", null);
        setField(term10011, term10011.getClass(), "time", null);
        setField(term10004, term10004.getClass(), "deliveryDate", term10011);
        setBooleanField(term10004, term10004.getClass(), "ordered", true);
        setField(term10004, term10004.getClass(), "userId", "");
        setField(term10004, term10004.getClass(), "orderStatus", enum35);
        Class<? extends Object> term10717 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term10716 = ((Class) term10717).getDeclaredField((String) "ORDERED");
        ((Field) term10716).setAccessible(true);
        Object enum37 = ((Field) term10716).get((Object) null);
        Object term10014 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term10020 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10021 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term10014, term10014.getClass(), "id", "");
        setField(term10014, term10014.getClass(), "imageUrl", "");
        setDoubleField(term10014, term10014.getClass(), "size", 0.11577948268926874);
        setIntField(term10014, term10014.getClass(), "quantity", 579005622);
        setDoubleField(term10014, term10014.getClass(), "price", 0.5617009352394552);
        setField(term10020, term10020.getClass(), "date", null);
        setField(term10020, term10020.getClass(), "time", null);
        setField(term10014, term10014.getClass(), "orderDate", term10020);
        setField(term10021, term10021.getClass(), "date", null);
        setField(term10021, term10021.getClass(), "time", null);
        setField(term10014, term10014.getClass(), "deliveryDate", term10021);
        setBooleanField(term10014, term10014.getClass(), "ordered", true);
        setField(term10014, term10014.getClass(), "userId", "");
        setField(term10014, term10014.getClass(), "orderStatus", enum37);
        Object term10026 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term10032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10033 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term10026, term10026.getClass(), "id", "");
        setField(term10026, term10026.getClass(), "imageUrl", "");
        setDoubleField(term10026, term10026.getClass(), "size", 0.09067063848644474);
        setIntField(term10026, term10026.getClass(), "quantity", -14890619);
        setDoubleField(term10026, term10026.getClass(), "price", 0.268304014379393);
        setField(term10032, term10032.getClass(), "date", null);
        setField(term10032, term10032.getClass(), "time", null);
        setField(term10026, term10026.getClass(), "orderDate", term10032);
        setField(term10033, term10033.getClass(), "date", null);
        setField(term10033, term10033.getClass(), "time", null);
        setField(term10026, term10026.getClass(), "deliveryDate", term10033);
        setBooleanField(term10026, term10026.getClass(), "ordered", true);
        setField(term10026, term10026.getClass(), "userId", "");
        setField(term10026, term10026.getClass(), "orderStatus", enum36);
        ArrayList term9958 = new ArrayList();
        ((ArrayList) term9958).add(term9960);
        ((ArrayList) term9958).add(term9972);
        ((ArrayList) term9958).add(term9982);
        ((ArrayList) term9958).add(term9994);
        ((ArrayList) term9958).add(term10004);
        ((ArrayList) term9958).add(term10014);
        ((ArrayList) term9958).add(term10026);
        term9888 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term9888, term9888.getClass(), "firstName", "wfaXBpWAUH");
        setField(term9888, term9888.getClass(), "lastName", "VMeAzAHwZj");
        setField(term9888, term9888.getClass(), "username", "PznxWXsZME");
        setField(term9888, term9888.getClass(), "email", "ZzIujlwVsw");
        setField(term9888, term9888.getClass(), "id", "LWyEaeIyAo");
        setField(term9888, term9888.getClass(), "role", enum34);
        setField(term9888, term9888.getClass(), "orders", term9958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term9888, args);
    }

};


