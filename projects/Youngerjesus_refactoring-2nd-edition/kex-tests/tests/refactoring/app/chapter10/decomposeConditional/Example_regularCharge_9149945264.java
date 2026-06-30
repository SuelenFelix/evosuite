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

public class Example_regularCharge_9149945264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102;
     Object term105;

    public Example_regularCharge_9149945264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102 = newInstance(Class.forName("refactoring.app.chapter10.decomposeConditional.Example"));
        setIntField(term102, term102.getClass(), "quantity", -1339778481);
        setIntField(term102, term102.getClass(), "charge", 1725571209);
        term105 = newInstance(Class.forName("refactoring.app.chapter10.decomposeConditional.Plan"));
        Object term106 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term107, term107.getClass(), "year", 2029);
        setShortField(term107, term107.getClass(), "month", (short) 8);
        setShortField(term107, term107.getClass(), "day", (short) 29);
        setField(term106, term106.getClass(), "date", term107);
        setByteField(term111, term111.getClass(), "hour", (byte) 15);
        setByteField(term111, term111.getClass(), "minute", (byte) 50);
        setByteField(term111, term111.getClass(), "second", (byte) 1);
        setIntField(term111, term111.getClass(), "nano", 277971904);
        setField(term106, term106.getClass(), "time", term111);
        setField(term105, term105.getClass(), "summerStart", term106);
        setIntField(term117, term117.getClass(), "year", 2022);
        setShortField(term117, term117.getClass(), "month", (short) 11);
        setShortField(term117, term117.getClass(), "day", (short) 16);
        setField(term116, term116.getClass(), "date", term117);
        setByteField(term121, term121.getClass(), "hour", (byte) 15);
        setByteField(term121, term121.getClass(), "minute", (byte) 54);
        setByteField(term121, term121.getClass(), "second", (byte) 2);
        setIntField(term121, term121.getClass(), "nano", 733274103);
        setField(term116, term116.getClass(), "time", term121);
        setField(term105, term105.getClass(), "summerEnd", term116);
        setDoubleField(term105, term105.getClass(), "summerRate", 0.2641345529914265);
        setDoubleField(term105, term105.getClass(), "regularRate", 0.36923381893433327);
        setIntField(term105, term105.getClass(), "regularServiceCharge", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.decomposeConditional.Example");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter10.decomposeConditional.Plan");
        Object[] args = new Object[1];
        args[0] = term105;
        callMethod(klass, "regularCharge", argTypes, term102, args);
    }

};


