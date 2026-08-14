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
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Order_init_68671275018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3278;
     Object term3280;
     Object term3284;
     Object term3300;
     Object term3317;

    public Order_init_68671275018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3278 = new Long(-1059217926759861865L);
        term3280 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3280, term3280.getClass(), "year", 2026);
        setShortField(term3280, term3280.getClass(), "month", (short) 7);
        setShortField(term3280, term3280.getClass(), "day", (short) 17);
        term3284 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3284, term3284.getClass(), "year", 2015);
        setShortField(term3284, term3284.getClass(), "month", (short) 9);
        setShortField(term3284, term3284.getClass(), "day", (short) 19);
        Long term3301 = new Long(4331712795558033930L);
        Integer term3315 = new Integer(515182546);
        term3300 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term3300, term3300.getClass(), "id", term3301);
        setField(term3300, term3300.getClass(), "name", "MANlfBKTPY");
        setField(term3300, term3300.getClass(), "tier", term3315);
        HashMap term3318 = new HashMap();
        Set<Object> term3343 =  ((Map) term3318).keySet();
        term3317 = new HashSet((Collection<? extends Object>) term3343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.time.LocalDate");
        argTypes[2] = Class.forName("java.time.LocalDate");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("space.gavinklfong.demo.streamapi.models.Customer");
        argTypes[5] = Class.forName("java.util.Set");
        Object[] args = new Object[6];
        args[0] = term3278;
        args[1] = term3280;
        args[2] = term3284;
        args[3] = "yXLTfzOgfX";
        args[4] = term3300;
        args[5] = term3317;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


