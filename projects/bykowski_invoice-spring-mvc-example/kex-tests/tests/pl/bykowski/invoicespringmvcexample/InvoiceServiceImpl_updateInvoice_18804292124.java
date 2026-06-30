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

public class InvoiceServiceImpl_updateInvoice_18804292124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142;
     Object term171;

    public InvoiceServiceImpl_updateInvoice_18804292124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term146 = new Long(1L);
        Object term145 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term148 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term152 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term145, term145.getClass(), "id", term146);
        setField(term148, term148.getClass(), "intVal", null);
        setIntField(term148, term148.getClass(), "scale", 0);
        setIntField(term148, term148.getClass(), "precision", 0);
        setField(term148, term148.getClass(), "stringCache", null);
        setLongField(term148, term148.getClass(), "intCompact", 200L);
        setField(term145, term145.getClass(), "price", term148);
        setIntField(term152, term152.getClass(), "year", 2022);
        setShortField(term152, term152.getClass(), "month", (short) 10);
        setShortField(term152, term152.getClass(), "day", (short) 10);
        setField(term145, term145.getClass(), "date", term152);
        setField(term145, term145.getClass(), "name", "");
        Long term158 = new Long(2L);
        Object term157 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term160 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term164 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term157, term157.getClass(), "id", term158);
        setField(term160, term160.getClass(), "intVal", null);
        setIntField(term160, term160.getClass(), "scale", 0);
        setIntField(term160, term160.getClass(), "precision", 0);
        setField(term160, term160.getClass(), "stringCache", null);
        setLongField(term160, term160.getClass(), "intCompact", 500L);
        setField(term157, term157.getClass(), "price", term160);
        setIntField(term164, term164.getClass(), "year", 2025);
        setShortField(term164, term164.getClass(), "month", (short) 10);
        setShortField(term164, term164.getClass(), "day", (short) 10);
        setField(term157, term157.getClass(), "date", term164);
        setField(term157, term157.getClass(), "name", "");
        ArrayList term143 = new ArrayList();
        ((ArrayList) term143).add(term145);
        ((ArrayList) term143).add(term157);
        term142 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.InvoiceServiceImpl"));
        setField(term142, term142.getClass(), "invoiceList", term143);
        Long term172 = new Long(-8257434502486459194L);
        term171 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term174 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term175 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term177 = (int[]) newIntArray(6);
        Object term191 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term171, term171.getClass(), "id", term172);
        setIntField(term175, term175.getClass(), "signum", 1);
        setIntElement(term177, 0, 2364);
        setIntElement(term177, 1, -1446584625);
        setIntElement(term177, 2, 1957600567);
        setIntElement(term177, 3, -336418707);
        setIntElement(term177, 4, -1905211145);
        setIntElement(term177, 5, 86968353);
        setField(term175, term175.getClass(), "mag", term177);
        setIntField(term175, term175.getClass(), "bitCountPlusOne", 0);
        setIntField(term175, term175.getClass(), "bitLengthPlusOne", 0);
        setIntField(term175, term175.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term175, term175.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term174, term174.getClass(), "intVal", term175);
        setIntField(term174, term174.getClass(), "scale", 52);
        setIntField(term174, term174.getClass(), "precision", 0);
        setField(term174, term174.getClass(), "stringCache", null);
        setLongField(term174, term174.getClass(), "intCompact", -9223372036854775808L);
        setField(term171, term171.getClass(), "price", term174);
        setIntField(term191, term191.getClass(), "year", 2016);
        setShortField(term191, term191.getClass(), "month", (short) 11);
        setShortField(term191, term191.getClass(), "day", (short) 29);
        setField(term171, term171.getClass(), "date", term191);
        setField(term171, term171.getClass(), "name", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.InvoiceServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pl.bykowski.invoicespringmvcexample.Invoice");
        Object[] args = new Object[1];
        args[0] = term171;
        callMethod(klass, "updateInvoice", argTypes, term142, args);
    }

};


