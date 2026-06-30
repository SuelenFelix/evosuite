package space.gavinklfong.invest.forex.dtos;

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
import static space.gavinklfong.invest.forex.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class ForexRate_ForexRateBuilder_toString_13111476417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13773;

    public ForexRate_ForexRateBuilder_toString_13111476417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term13801 = new Double(0.2852810965221698);
        Double term13803 = new Double(0.6300849762307866);
        term13773 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder"));
        Object term13774 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term13774, term13774.getClass(), "seconds", 1495357463L);
        setIntField(term13774, term13774.getClass(), "nanos", 288000000);
        setField(term13773, term13773.getClass(), "timestamp", term13774);
        setField(term13773, term13773.getClass(), "baseCurrency", "yVMkkQhvmN");
        setField(term13773, term13773.getClass(), "counterCurrency", "mvrkADEgpp");
        setField(term13773, term13773.getClass(), "buyRate", term13801);
        setField(term13773, term13773.getClass(), "sellRate", term13803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13773, args);
    }

};


