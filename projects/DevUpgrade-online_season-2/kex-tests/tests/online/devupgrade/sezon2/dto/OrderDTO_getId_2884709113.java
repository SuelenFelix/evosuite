package online.devupgrade.sezon2.dto;

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
import static online.devupgrade.sezon2.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class OrderDTO_getId_2884709113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1221;

    public OrderDTO_getId_2884709113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1222 = new Integer(-1179120542);
        term1221 = newInstance(Class.forName("online.devupgrade.sezon2.dto.OrderDTO"));
        setField(term1221, term1221.getClass(), "id", term1222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.dto.OrderDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1221, args);
    }

};


