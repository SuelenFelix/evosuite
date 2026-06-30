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

public class ForexRate_ForexRateBuilder_baseCurrency_19553699822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13465;

    public ForexRate_ForexRateBuilder_baseCurrency_19553699822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term13493 = new Double(0.4569171842750229);
        Double term13495 = new Double(0.8598297828918529);
        term13465 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder"));
        Object term13466 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term13466, term13466.getClass(), "seconds", 1610940182L);
        setIntField(term13466, term13466.getClass(), "nanos", 830000000);
        setField(term13465, term13465.getClass(), "timestamp", term13466);
        setField(term13465, term13465.getClass(), "baseCurrency", "SdCKLMIYnX");
        setField(term13465, term13465.getClass(), "counterCurrency", "OJJtVNPyKZ");
        setField(term13465, term13465.getClass(), "buyRate", term13493);
        setField(term13465, term13465.getClass(), "sellRate", term13495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AKNapTAfmD";
        callMethod(klass, "baseCurrency", argTypes, term13465, args);
    }

};


