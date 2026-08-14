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

public class SAPInvoiceSender_init_7615265050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SAPInvoiceSender_init_7615265050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("tudelft.mocks.invoice.InvoiceFilter"));
        setField(term1, term1.getClass(), "issuedInvoices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.mocks.invoice.SAPInvoiceSender");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tudelft.mocks.invoice.InvoiceFilter");
        argTypes[1] = Class.forName("tudelft.mocks.invoice.SAP");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


