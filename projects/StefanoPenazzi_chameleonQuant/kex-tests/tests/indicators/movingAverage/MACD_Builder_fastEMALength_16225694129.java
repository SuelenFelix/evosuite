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

public class MACD_Builder_fastEMALength_16225694129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255;
     Object term259;

    public MACD_Builder_fastEMALength_16225694129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255 = newInstance(Class.forName("indicators.movingAverage.MACD$Builder"));
        setField(term255, term255.getClass(), "ts", null);
        setIntField(term255, term255.getClass(), "fastEMALength", 0);
        setIntField(term255, term255.getClass(), "slowEMALength", 0);
        setField(term255, term255.getClass(), "source", null);
        setIntField(term255, term255.getClass(), "signalLineLength", 0);
        term259 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("indicators.movingAverage.MACD$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term259;
        callMethod(klass, "fastEMALength", argTypes, term255, args);
    }

};


