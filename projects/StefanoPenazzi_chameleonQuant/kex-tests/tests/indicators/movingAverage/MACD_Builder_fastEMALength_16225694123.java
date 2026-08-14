package indicators.movingAverage;

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
import static indicators.movingAverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MACD_Builder_fastEMALength_16225694123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;
     Object term179;

    public MACD_Builder_fastEMALength_16225694123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163 = newInstance(Class.forName("indicators.movingAverage.MACD$Builder"));
        setField(term163, term163.getClass(), "ts", null);
        setIntField(term163, term163.getClass(), "fastEMALength", -883034806);
        setIntField(term163, term163.getClass(), "slowEMALength", 1585847225);
        setField(term163, term163.getClass(), "source", "SzjVpOQTyS");
        setIntField(term163, term163.getClass(), "signalLineLength", 597278769);
        term179 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("indicators.movingAverage.MACD$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term179;
        callMethod(klass, "fastEMALength", argTypes, term163, args);
    }

};


