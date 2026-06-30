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

public class ForexRate_getSpread_1067369470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24928;

    public ForexRate_getSpread_1067369470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term24956 = new Double(0.5187846213101265);
        Double term24958 = new Double(0.045893173090043815);
        term24928 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term24929 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term24929, term24929.getClass(), "seconds", 1345923503L);
        setIntField(term24929, term24929.getClass(), "nanos", 543000000);
        setField(term24928, term24928.getClass(), "timestamp", term24929);
        setField(term24928, term24928.getClass(), "baseCurrency", "DIbeDHICho");
        setField(term24928, term24928.getClass(), "counterCurrency", "dJGPlmSRnz");
        setField(term24928, term24928.getClass(), "buyRate", term24956);
        setField(term24928, term24928.getClass(), "sellRate", term24958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpread", argTypes, term24928, args);
    }

};


