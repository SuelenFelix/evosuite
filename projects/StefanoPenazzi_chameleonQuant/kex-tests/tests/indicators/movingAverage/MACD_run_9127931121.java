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

public class MACD_run_9127931121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public MACD_run_9127931121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("indicators.movingAverage.MACD"));
        setField(term1, term1.getClass(), "itsRef", null);
        setIntField(term1, term1.getClass(), "fastEMALength", 568599855);
        setIntField(term1, term1.getClass(), "slowEMALength", 1162663216);
        setField(term1, term1.getClass(), "source", "PAEBtnZtTD");
        setIntField(term1, term1.getClass(), "signalLineLength", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("indicators.movingAverage.MACD");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term1, args);
    }

};


