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

public class InvoiceDao_save_9248596803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2918;
     Object term2920;

    public InvoiceDao_save_9248596803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2918 = newInstance(Class.forName("tudelft.mocks.invoice.InvoiceDao"));
        Object term2919 = newInstance(Class.forName("tudelft.mocks.invoice.DatabaseConnection"));
        setField(term2918, term2918.getClass(), "connection", term2919);
        term2920 = newInstance(Class.forName("tudelft.mocks.invoice.Invoice"));
        setField(term2920, term2920.getClass(), "customer", "EGtDIRbSSb");
        setIntField(term2920, term2920.getClass(), "value", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.mocks.invoice.InvoiceDao");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tudelft.mocks.invoice.Invoice");
        Object[] args = new Object[1];
        args[0] = term2920;
        callMethod(klass, "save", argTypes, term2918, args);
    }

};


