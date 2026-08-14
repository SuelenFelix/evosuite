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

public class Order_setStatus_120101159810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2693;

    public Order_setStatus_120101159810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2694 = new Long(854087753192360238L);
        Long term2717 = new Long(-6246278604466261475L);
        Integer term2731 = new Integer(-1146679443);
        HashMap term2734 = new HashMap();
        Set<Object> term2778 =  ((Map) term2734).keySet();
        HashSet term2733 = new HashSet((Collection<? extends Object>) term2778);
        term2693 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term2696 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2700 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2716 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2693, term2693.getClass(), "id", term2694);
        setIntField(term2696, term2696.getClass(), "year", 2025);
        setShortField(term2696, term2696.getClass(), "month", (short) 4);
        setShortField(term2696, term2696.getClass(), "day", (short) 6);
        setField(term2693, term2693.getClass(), "orderDate", term2696);
        setIntField(term2700, term2700.getClass(), "year", 2028);
        setShortField(term2700, term2700.getClass(), "month", (short) 7);
        setShortField(term2700, term2700.getClass(), "day", (short) 25);
        setField(term2693, term2693.getClass(), "deliveryDate", term2700);
        setField(term2693, term2693.getClass(), "status", "CwZcgFJqMh");
        setField(term2716, term2716.getClass(), "id", term2717);
        setField(term2716, term2716.getClass(), "name", "RldCZqgRbO");
        setField(term2716, term2716.getClass(), "tier", term2731);
        setField(term2693, term2693.getClass(), "customer", term2716);
        setField(term2693, term2693.getClass(), "products", term2733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HuKdqrrxIm";
        callMethod(klass, "setStatus", argTypes, term2693, args);
    }

};


