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

public class Order_setOrderDate_11829751158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2535;
     Object term2588;

    public Order_setOrderDate_11829751158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2536 = new Long(5255768275907389358L);
        Long term2559 = new Long(-8859332911664940963L);
        Integer term2573 = new Integer(880977281);
        HashMap term2576 = new HashMap();
        Set<Object> term2612 =  ((Map) term2576).keySet();
        HashSet term2575 = new HashSet((Collection<? extends Object>) term2612);
        term2535 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term2538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2558 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2535, term2535.getClass(), "id", term2536);
        setIntField(term2538, term2538.getClass(), "year", 2022);
        setShortField(term2538, term2538.getClass(), "month", (short) 5);
        setShortField(term2538, term2538.getClass(), "day", (short) 28);
        setField(term2535, term2535.getClass(), "orderDate", term2538);
        setIntField(term2542, term2542.getClass(), "year", 2020);
        setShortField(term2542, term2542.getClass(), "month", (short) 7);
        setShortField(term2542, term2542.getClass(), "day", (short) 26);
        setField(term2535, term2535.getClass(), "deliveryDate", term2542);
        setField(term2535, term2535.getClass(), "status", "crkNabVaWs");
        setField(term2558, term2558.getClass(), "id", term2559);
        setField(term2558, term2558.getClass(), "name", "qBcAJgrABE");
        setField(term2558, term2558.getClass(), "tier", term2573);
        setField(term2535, term2535.getClass(), "customer", term2558);
        setField(term2535, term2535.getClass(), "products", term2575);
        term2588 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2588, term2588.getClass(), "year", 2015);
        setShortField(term2588, term2588.getClass(), "month", (short) 12);
        setShortField(term2588, term2588.getClass(), "day", (short) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2588;
        callMethod(klass, "setOrderDate", argTypes, term2535, args);
    }

};


