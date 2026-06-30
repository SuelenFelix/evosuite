package refactoring.app.chapter10.decomposeConditional;

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
import static refactoring.app.chapter10.decomposeConditional.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Example_calculatePayment_4968467311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term4;
     Object term28;

    public Example_calculatePayment_4968467311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter10.decomposeConditional.Example"));
        setIntField(term1, term1.getClass(), "quantity", 568599855);
        setIntField(term1, term1.getClass(), "charge", 1162663216);
        term4 = newInstance(Class.forName("refactoring.app.chapter10.decomposeConditional.Plan"));
        Object term5 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6, term6.getClass(), "year", 2012);
        setShortField(term6, term6.getClass(), "month", (short) 8);
        setShortField(term6, term6.getClass(), "day", (short) 25);
        setField(term5, term5.getClass(), "date", term6);
        setByteField(term10, term10.getClass(), "hour", (byte) 5);
        setByteField(term10, term10.getClass(), "minute", (byte) 20);
        setByteField(term10, term10.getClass(), "second", (byte) 50);
        setIntField(term10, term10.getClass(), "nano", 345595912);
        setField(term5, term5.getClass(), "time", term10);
        setField(term4, term4.getClass(), "summerStart", term5);
        setIntField(term16, term16.getClass(), "year", 2021);
        setShortField(term16, term16.getClass(), "month", (short) 1);
        setShortField(term16, term16.getClass(), "day", (short) 18);
        setField(term15, term15.getClass(), "date", term16);
        setByteField(term20, term20.getClass(), "hour", (byte) 13);
        setByteField(term20, term20.getClass(), "minute", (byte) 38);
        setByteField(term20, term20.getClass(), "second", (byte) 26);
        setIntField(term20, term20.getClass(), "nano", 544608644);
        setField(term15, term15.getClass(), "time", term20);
        setField(term4, term4.getClass(), "summerEnd", term15);
        setDoubleField(term4, term4.getClass(), "summerRate", 0.13238746331190498);
        setDoubleField(term4, term4.getClass(), "regularRate", 0.3455959125047594);
        setIntField(term4, term4.getClass(), "regularServiceCharge", 1484323161);
        term28 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29, term29.getClass(), "year", 2015);
        setShortField(term29, term29.getClass(), "month", (short) 9);
        setShortField(term29, term29.getClass(), "day", (short) 19);
        setField(term28, term28.getClass(), "date", term29);
        setByteField(term33, term33.getClass(), "hour", (byte) 9);
        setByteField(term33, term33.getClass(), "minute", (byte) 4);
        setByteField(term33, term33.getClass(), "second", (byte) 10);
        setIntField(term33, term33.getClass(), "nano", 401765865);
        setField(term28, term28.getClass(), "time", term33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.decomposeConditional.Example");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter10.decomposeConditional.Plan");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[2];
        args[0] = term4;
        args[1] = term28;
        callMethod(klass, "calculatePayment", argTypes, term1, args);
    }

};


