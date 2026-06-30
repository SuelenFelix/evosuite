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

public class InvoiceServiceImpl_deleteInvoice_3513312833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;
     Object term140;

    public InvoiceServiceImpl_deleteInvoice_3513312833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term115 = new Long(1L);
        Object term114 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term117 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term121 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term114, term114.getClass(), "id", term115);
        setField(term117, term117.getClass(), "intVal", null);
        setIntField(term117, term117.getClass(), "scale", 0);
        setIntField(term117, term117.getClass(), "precision", 0);
        setField(term117, term117.getClass(), "stringCache", null);
        setLongField(term117, term117.getClass(), "intCompact", 200L);
        setField(term114, term114.getClass(), "price", term117);
        setIntField(term121, term121.getClass(), "year", 2022);
        setShortField(term121, term121.getClass(), "month", (short) 10);
        setShortField(term121, term121.getClass(), "day", (short) 10);
        setField(term114, term114.getClass(), "date", term121);
        setField(term114, term114.getClass(), "name", "");
        Long term127 = new Long(2L);
        Object term126 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term129 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term133 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term126, term126.getClass(), "id", term127);
        setField(term129, term129.getClass(), "intVal", null);
        setIntField(term129, term129.getClass(), "scale", 0);
        setIntField(term129, term129.getClass(), "precision", 0);
        setField(term129, term129.getClass(), "stringCache", null);
        setLongField(term129, term129.getClass(), "intCompact", 500L);
        setField(term126, term126.getClass(), "price", term129);
        setIntField(term133, term133.getClass(), "year", 2025);
        setShortField(term133, term133.getClass(), "month", (short) 10);
        setShortField(term133, term133.getClass(), "day", (short) 10);
        setField(term126, term126.getClass(), "date", term133);
        setField(term126, term126.getClass(), "name", "");
        ArrayList term112 = new ArrayList();
        ((ArrayList) term112).add(term114);
        ((ArrayList) term112).add(term126);
        term111 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.InvoiceServiceImpl"));
        setField(term111, term111.getClass(), "invoiceList", term112);
        term140 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.InvoiceServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term140;
        callMethod(klass, "deleteInvoice", argTypes, term111, args);
    }

};


