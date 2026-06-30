package pl.bykowski.invoicespringmvcexample;

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
import static pl.bykowski.invoicespringmvcexample.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class InvoiceServiceImpl_getAllInvoices_4731643581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public InvoiceServiceImpl_getAllInvoices_4731643581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5 = new Long(1L);
        Object term4 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term7 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term4, term4.getClass(), "id", term5);
        setField(term7, term7.getClass(), "intVal", null);
        setIntField(term7, term7.getClass(), "scale", 0);
        setIntField(term7, term7.getClass(), "precision", 0);
        setField(term7, term7.getClass(), "stringCache", null);
        setLongField(term7, term7.getClass(), "intCompact", 200L);
        setField(term4, term4.getClass(), "price", term7);
        setIntField(term11, term11.getClass(), "year", 2022);
        setShortField(term11, term11.getClass(), "month", (short) 10);
        setShortField(term11, term11.getClass(), "day", (short) 10);
        setField(term4, term4.getClass(), "date", term11);
        setField(term4, term4.getClass(), "name", "");
        Long term17 = new Long(2L);
        Object term16 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term19 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term23 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term16, term16.getClass(), "id", term17);
        setField(term19, term19.getClass(), "intVal", null);
        setIntField(term19, term19.getClass(), "scale", 0);
        setIntField(term19, term19.getClass(), "precision", 0);
        setField(term19, term19.getClass(), "stringCache", null);
        setLongField(term19, term19.getClass(), "intCompact", 500L);
        setField(term16, term16.getClass(), "price", term19);
        setIntField(term23, term23.getClass(), "year", 2025);
        setShortField(term23, term23.getClass(), "month", (short) 10);
        setShortField(term23, term23.getClass(), "day", (short) 10);
        setField(term16, term16.getClass(), "date", term23);
        setField(term16, term16.getClass(), "name", "");
        ArrayList term2 = new ArrayList();
        ((ArrayList) term2).add(term4);
        ((ArrayList) term2).add(term16);
        term1 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.InvoiceServiceImpl"));
        setField(term1, term1.getClass(), "invoiceList", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.InvoiceServiceImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllInvoices", argTypes, term1, args);
    }

};


