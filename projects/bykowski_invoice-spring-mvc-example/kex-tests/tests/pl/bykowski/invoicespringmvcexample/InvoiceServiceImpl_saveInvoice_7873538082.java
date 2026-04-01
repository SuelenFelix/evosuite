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

public class InvoiceServiceImpl_saveInvoice_7873538082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;
     Object term59;

    public InvoiceServiceImpl_saveInvoice_7873538082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34 = new Long(1L);
        Object term33 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term36 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term40 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33, term33.getClass(), "id", term34);
        setField(term36, term36.getClass(), "intVal", null);
        setIntField(term36, term36.getClass(), "scale", 0);
        setIntField(term36, term36.getClass(), "precision", 0);
        setField(term36, term36.getClass(), "stringCache", null);
        setLongField(term36, term36.getClass(), "intCompact", 200L);
        setField(term33, term33.getClass(), "price", term36);
        setIntField(term40, term40.getClass(), "year", 2022);
        setShortField(term40, term40.getClass(), "month", (short) 10);
        setShortField(term40, term40.getClass(), "day", (short) 10);
        setField(term33, term33.getClass(), "date", term40);
        setField(term33, term33.getClass(), "name", "");
        Long term46 = new Long(2L);
        Object term45 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term48 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term52 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term45, term45.getClass(), "id", term46);
        setField(term48, term48.getClass(), "intVal", null);
        setIntField(term48, term48.getClass(), "scale", 0);
        setIntField(term48, term48.getClass(), "precision", 0);
        setField(term48, term48.getClass(), "stringCache", null);
        setLongField(term48, term48.getClass(), "intCompact", 500L);
        setField(term45, term45.getClass(), "price", term48);
        setIntField(term52, term52.getClass(), "year", 2025);
        setShortField(term52, term52.getClass(), "month", (short) 10);
        setShortField(term52, term52.getClass(), "day", (short) 10);
        setField(term45, term45.getClass(), "date", term52);
        setField(term45, term45.getClass(), "name", "");
        ArrayList term31 = new ArrayList();
        ((ArrayList) term31).add(term33);
        ((ArrayList) term31).add(term45);
        term30 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.InvoiceServiceImpl"));
        setField(term30, term30.getClass(), "invoiceList", term31);
        Long term60 = new Long(2442117782898005296L);
        term59 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term62 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term63 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term65 = (int[]) newIntArray(6);
        Object term79 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term59, term59.getClass(), "id", term60);
        setIntField(term63, term63.getClass(), "signum", 1);
        setIntElement(term65, 0, 9058);
        setIntElement(term65, 1, 1365043541);
        setIntElement(term65, 2, 1239861896);
        setIntElement(term65, 3, -1338148297);
        setIntElement(term65, 4, -418263970);
        setIntElement(term65, 5, -265097411);
        setField(term63, term63.getClass(), "mag", term65);
        setIntField(term63, term63.getClass(), "bitCountPlusOne", 0);
        setIntField(term63, term63.getClass(), "bitLengthPlusOne", 0);
        setIntField(term63, term63.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term63, term63.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term62, term62.getClass(), "intVal", term63);
        setIntField(term62, term62.getClass(), "scale", 53);
        setIntField(term62, term62.getClass(), "precision", 0);
        setField(term62, term62.getClass(), "stringCache", null);
        setLongField(term62, term62.getClass(), "intCompact", -9223372036854775808L);
        setField(term59, term59.getClass(), "price", term62);
        setIntField(term79, term79.getClass(), "year", 2012);
        setShortField(term79, term79.getClass(), "month", (short) 8);
        setShortField(term79, term79.getClass(), "day", (short) 25);
        setField(term59, term59.getClass(), "date", term79);
        setField(term59, term59.getClass(), "name", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.InvoiceServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pl.bykowski.invoicespringmvcexample.Invoice");
        Object[] args = new Object[1];
        args[0] = term59;
        callMethod(klass, "saveInvoice", argTypes, term30, args);
    }

};


