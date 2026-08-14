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

public class Order_setDeliveryDate_8702336959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2613;
     Object term2668;

    public Order_setDeliveryDate_8702336959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2614 = new Long(5592372218942533021L);
        Long term2637 = new Long(8423938983545919786L);
        Integer term2651 = new Integer(-1618206977);
        HashMap term2654 = new HashMap();
        Set<Object> term2692 =  ((Map) term2654).keySet();
        HashSet term2653 = new HashSet((Collection<? extends Object>) term2692);
        term2613 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term2616 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2636 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2613, term2613.getClass(), "id", term2614);
        setIntField(term2616, term2616.getClass(), "year", 2022);
        setShortField(term2616, term2616.getClass(), "month", (short) 8);
        setShortField(term2616, term2616.getClass(), "day", (short) 2);
        setField(term2613, term2613.getClass(), "orderDate", term2616);
        setIntField(term2620, term2620.getClass(), "year", 2015);
        setShortField(term2620, term2620.getClass(), "month", (short) 5);
        setShortField(term2620, term2620.getClass(), "day", (short) 14);
        setField(term2613, term2613.getClass(), "deliveryDate", term2620);
        setField(term2613, term2613.getClass(), "status", "rbsXSOJFKW");
        setField(term2636, term2636.getClass(), "id", term2637);
        setField(term2636, term2636.getClass(), "name", "sAgGDoUNlf");
        setField(term2636, term2636.getClass(), "tier", term2651);
        setField(term2613, term2613.getClass(), "customer", term2636);
        setField(term2613, term2613.getClass(), "products", term2653);
        term2668 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2668, term2668.getClass(), "year", 2019);
        setShortField(term2668, term2668.getClass(), "month", (short) 9);
        setShortField(term2668, term2668.getClass(), "day", (short) 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2668;
        callMethod(klass, "setDeliveryDate", argTypes, term2613, args);
    }

};


