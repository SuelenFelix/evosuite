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

public class MACD_Builder_slowEMALength_405890554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191;
     Object term207;

    public MACD_Builder_slowEMALength_405890554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191 = newInstance(Class.forName("indicators.movingAverage.MACD$Builder"));
        setField(term191, term191.getClass(), "ts", null);
        setIntField(term191, term191.getClass(), "fastEMALength", -1456670397);
        setIntField(term191, term191.getClass(), "slowEMALength", 1622346318);
        setField(term191, term191.getClass(), "source", "MjGYSRKTNF");
        setIntField(term191, term191.getClass(), "signalLineLength", 1048535127);
        term207 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("indicators.movingAverage.MACD$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term207;
        callMethod(klass, "slowEMALength", argTypes, term191, args);
    }

};


