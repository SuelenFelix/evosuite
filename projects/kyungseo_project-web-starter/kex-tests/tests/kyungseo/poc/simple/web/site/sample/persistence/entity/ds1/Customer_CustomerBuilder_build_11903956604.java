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

public class Customer_CustomerBuilder_build_11903956604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188;

    public Customer_CustomerBuilder_build_11903956604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term189 = new Integer(-1922583790);
        term188 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.persistence.entity.ds1.Customer$CustomerBuilder"));
        setField(term188, term188.getClass(), "customerId", term189);
        setField(term188, term188.getClass(), "customerName", "hRNSzYYIrc");
        setField(term188, term188.getClass(), "company", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.persistence.entity.ds1.Customer$CustomerBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term188, args);
    }

};


