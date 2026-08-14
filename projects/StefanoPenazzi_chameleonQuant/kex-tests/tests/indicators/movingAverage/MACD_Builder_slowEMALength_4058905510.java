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

public class MACD_Builder_slowEMALength_4058905510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;
     Object term265;

    public MACD_Builder_slowEMALength_4058905510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261 = newInstance(Class.forName("indicators.movingAverage.MACD$Builder"));
        setField(term261, term261.getClass(), "ts", null);
        setIntField(term261, term261.getClass(), "fastEMALength", 0);
        setIntField(term261, term261.getClass(), "slowEMALength", 0);
        setField(term261, term261.getClass(), "source", null);
        setIntField(term261, term261.getClass(), "signalLineLength", 0);
        term265 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("indicators.movingAverage.MACD$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term265;
        callMethod(klass, "slowEMALength", argTypes, term261, args);
    }

};


