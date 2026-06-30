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

public class ForexRate_getBuyRate_10536869506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25187;

    public ForexRate_getBuyRate_10536869506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25215 = new Double(0.09067063848644474);
        Double term25217 = new Double(0.268304014379393);
        term25187 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25188 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25188, term25188.getClass(), "seconds", 1278177575L);
        setIntField(term25188, term25188.getClass(), "nanos", 793000000);
        setField(term25187, term25187.getClass(), "timestamp", term25188);
        setField(term25187, term25187.getClass(), "baseCurrency", "THZSpzBRYP");
        setField(term25187, term25187.getClass(), "counterCurrency", "ZfBIVGBQOE");
        setField(term25187, term25187.getClass(), "buyRate", term25215);
        setField(term25187, term25187.getClass(), "sellRate", term25217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBuyRate", argTypes, term25187, args);
    }

};


