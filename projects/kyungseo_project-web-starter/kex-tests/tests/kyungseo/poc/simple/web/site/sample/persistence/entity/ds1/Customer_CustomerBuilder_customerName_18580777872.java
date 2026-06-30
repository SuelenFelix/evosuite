package kyungseo.poc.simple.web.site.sample.persistence.entity.ds1;

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
import static kyungseo.poc.simple.web.site.sample.persistence.entity.ds1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Customer_CustomerBuilder_customerName_18580777872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;

    public Customer_CustomerBuilder_customerName_18580777872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term51 = new Integer(1484323161);
        term50 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.persistence.entity.ds1.Customer$CustomerBuilder"));
        setField(term50, term50.getClass(), "customerId", term51);
        setField(term50, term50.getClass(), "customerName", "MuLcgQHgqz");
        setField(term50, term50.getClass(), "company", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.persistence.entity.ds1.Customer$CustomerBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "customerName", argTypes, term50, args);
    }

};


