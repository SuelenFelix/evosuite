package space.gavinklfong.demo.streamapi.models;

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
import static space.gavinklfong.demo.streamapi.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Order_OrderBuilder_id_19698578041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1120;
     Object term1171;

    public Order_OrderBuilder_id_19698578041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1121 = new Long(2287785643837657068L);
        Long term1144 = new Long(-7283193381993602128L);
        Integer term1158 = new Integer(-1888585309);
        HashMap term1161 = new HashMap();
        Set<Object> term1193 =  ((Map) term1161).keySet();
        HashSet term1160 = new HashSet((Collection<? extends Object>) term1193);
        term1120 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder"));
        Object term1123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1143 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term1120, term1120.getClass(), "id", term1121);
        setIntField(term1123, term1123.getClass(), "year", 2026);
        setShortField(term1123, term1123.getClass(), "month", (short) 2);
        setShortField(term1123, term1123.getClass(), "day", (short) 4);
        setField(term1120, term1120.getClass(), "orderDate", term1123);
        setIntField(term1127, term1127.getClass(), "year", 2013);
        setShortField(term1127, term1127.getClass(), "month", (short) 5);
        setShortField(term1127, term1127.getClass(), "day", (short) 7);
        setField(term1120, term1120.getClass(), "deliveryDate", term1127);
        setField(term1120, term1120.getClass(), "status", "bycpZjxXFn");
        setField(term1143, term1143.getClass(), "id", term1144);
        setField(term1143, term1143.getClass(), "name", "jQWttOAiwL");
        setField(term1143, term1143.getClass(), "tier", term1158);
        setField(term1120, term1120.getClass(), "customer", term1143);
        setField(term1120, term1120.getClass(), "products", term1160);
        term1171 = new Long(3104349415269466587L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1171;
        callMethod(klass, "id", argTypes, term1120, args);
    }

};


