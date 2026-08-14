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
import java.lang.Double;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Product_hashCode_146105670713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term822;

    public Product_hashCode_146105670713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term823 = new Long(3752337209837437327L);
        Double term849 = new Double(0.03699061125289671);
        HashMap term852 = new HashMap();
        Set<Object> term888 =  ((Map) term852).keySet();
        HashSet term851 = new HashSet((Collection<? extends Object>) term888);
        term822 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term822, term822.getClass(), "id", term823);
        setField(term822, term822.getClass(), "name", "rIPMBcrNqB");
        setField(term822, term822.getClass(), "category", "UDaboHZHhz");
        setField(term822, term822.getClass(), "price", term849);
        setField(term822, term822.getClass(), "orders", term851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term822, args);
    }

};


