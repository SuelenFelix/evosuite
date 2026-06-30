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

public class Customer_setCompany_5019143516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260;

    public Customer_setCompany_5019143516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term261 = new Integer(-1955890973);
        term260 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Customer"));
        setField(term260, term260.getClass(), "customerId", term261);
        setField(term260, term260.getClass(), "customerName", "uuaPigETmJ");
        setField(term260, term260.getClass(), "company", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "setCompany", argTypes, term260, args);
    }

};


