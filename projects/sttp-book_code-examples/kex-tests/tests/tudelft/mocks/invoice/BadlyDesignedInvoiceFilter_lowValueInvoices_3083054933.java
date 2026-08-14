package tudelft.mocks.invoice;

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
import static tudelft.mocks.invoice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BadlyDesignedInvoiceFilter_lowValueInvoices_3083054933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8;

    public BadlyDesignedInvoiceFilter_lowValueInvoices_3083054933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8 = newInstance(Class.forName("tudelft.mocks.invoice.BadlyDesignedInvoiceFilter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.mocks.invoice.BadlyDesignedInvoiceFilter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "lowValueInvoices", argTypes, term8, args);
    }

};


