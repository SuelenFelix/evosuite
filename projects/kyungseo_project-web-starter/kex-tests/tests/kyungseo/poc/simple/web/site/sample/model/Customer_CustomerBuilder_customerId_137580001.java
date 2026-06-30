package kyungseo.poc.simple.web.site.sample.model;

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
import static kyungseo.poc.simple.web.site.sample.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Customer_CustomerBuilder_customerId_137580001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1121;
     Object term1148;

    public Customer_CustomerBuilder_customerId_137580001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1122 = new Integer(-1339778481);
        term1121 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Customer$CustomerBuilder"));
        setField(term1121, term1121.getClass(), "customerId", term1122);
        setField(term1121, term1121.getClass(), "customerName", "AijpHYOFuy");
        setField(term1121, term1121.getClass(), "company", "SbAoxhfrkn");
        term1148 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Customer$CustomerBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1148;
        callMethod(klass, "customerId", argTypes, term1121, args);
    }

};


