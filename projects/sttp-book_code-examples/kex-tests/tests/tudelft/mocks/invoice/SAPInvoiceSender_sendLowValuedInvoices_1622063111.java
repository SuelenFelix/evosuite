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
import java.lang.Object;

public class SAPInvoiceSender_sendLowValuedInvoices_1622063111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;

    public SAPInvoiceSender_sendLowValuedInvoices_1622063111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("tudelft.mocks.invoice.SAPInvoiceSender"));
        Object term3 = newInstance(Class.forName("tudelft.mocks.invoice.InvoiceFilter"));
        setField(term3, term3.getClass(), "issuedInvoices", null);
        setField(term2, term2.getClass(), "filter", term3);
        setField(term2, term2.getClass(), "sap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.mocks.invoice.SAPInvoiceSender");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sendLowValuedInvoices", argTypes, term2, args);
    }

};


