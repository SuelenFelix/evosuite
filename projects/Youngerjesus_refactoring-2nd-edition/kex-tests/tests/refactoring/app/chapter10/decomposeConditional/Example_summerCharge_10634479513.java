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

public class Example_summerCharge_10634479513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term78;

    public Example_summerCharge_10634479513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("refactoring.app.chapter10.decomposeConditional.Example"));
        setIntField(term75, term75.getClass(), "quantity", -1955890973);
        setIntField(term75, term75.getClass(), "charge", -2038273078);
        term78 = newInstance(Class.forName("refactoring.app.chapter10.decomposeConditional.Plan"));
        Object term79 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term80, term80.getClass(), "year", 2025);
        setShortField(term80, term80.getClass(), "month", (short) 4);
        setShortField(term80, term80.getClass(), "day", (short) 24);
        setField(term79, term79.getClass(), "date", term80);
        setByteField(term84, term84.getClass(), "hour", (byte) 18);
        setByteField(term84, term84.getClass(), "minute", (byte) 11);
        setByteField(term84, term84.getClass(), "second", (byte) 40);
        setIntField(term84, term84.getClass(), "nano", 137454929);
        setField(term79, term79.getClass(), "time", term84);
        setField(term78, term78.getClass(), "summerStart", term79);
        setIntField(term90, term90.getClass(), "year", 2024);
        setShortField(term90, term90.getClass(), "month", (short) 1);
        setShortField(term90, term90.getClass(), "day", (short) 24);
        setField(term89, term89.getClass(), "date", term90);
        setByteField(term94, term94.getClass(), "hour", (byte) 20);
        setByteField(term94, term94.getClass(), "minute", (byte) 28);
        setByteField(term94, term94.getClass(), "second", (byte) 39);
        setIntField(term94, term94.getClass(), "nano", 952728177);
        setField(term89, term89.getClass(), "time", term94);
        setField(term78, term78.getClass(), "summerEnd", term89);
        setDoubleField(term78, term78.getClass(), "summerRate", 0.28570734989730284);
        setDoubleField(term78, term78.getClass(), "regularRate", 0.40176586625454525);
        setIntField(term78, term78.getClass(), "regularServiceCharge", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.decomposeConditional.Example");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter10.decomposeConditional.Plan");
        Object[] args = new Object[1];
        args[0] = term78;
        callMethod(klass, "summerCharge", argTypes, term75, args);
    }

};


