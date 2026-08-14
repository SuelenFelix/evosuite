package legacyfighter.dietary;

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
import static legacyfighter.dietary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CustomerOrderGroup_getChilds_33959813515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38576;

    public CustomerOrderGroup_getChilds_33959813515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38576 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term38576, term38576.getClass(), "id", null);
        setField(term38576, term38576.getClass(), "orders", null);
        setField(term38576, term38576.getClass(), "description", null);
        setField(term38576, term38576.getClass(), "customer", null);
        setField(term38576, term38576.getClass(), "parent", null);
        setField(term38576, term38576.getClass(), "childs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChilds", argTypes, term38576, args);
    }

};


