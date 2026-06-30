package online.devupgrade.sezon2.entities;

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
import static online.devupgrade.sezon2.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Order_Visit_16453136339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577;

    public Order_Visit_16453136339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term577 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Order"));
        setField(term577, term577.getClass(), "status", null);
        setField(term577, term577.getClass(), "id", null);
        setField(term577, term577.getClass(), "products", null);
        setField(term577, term577.getClass(), "discountEntities", null);
        setFloatField(term577, term577.getClass(), "price", 0.0F);
        setFloatField(term577, term577.getClass(), "pricePoPrzecinku", 0.0F);
        setBooleanField(term577, term577.getClass(), "isPriceGetOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("online.devupgrade.sezon2.helper.IVisitor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "Visit", argTypes, term577, args);
    }

};


