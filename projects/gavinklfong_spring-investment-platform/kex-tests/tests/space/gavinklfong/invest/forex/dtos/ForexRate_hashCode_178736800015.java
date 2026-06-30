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

public class ForexRate_hashCode_178736800015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25708;

    public ForexRate_hashCode_178736800015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25736 = new Double(0.7080134263823477);
        Double term25738 = new Double(0.6059734092898602);
        term25708 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25709 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25709, term25709.getClass(), "seconds", 1570714321L);
        setIntField(term25709, term25709.getClass(), "nanos", 79000000);
        setField(term25708, term25708.getClass(), "timestamp", term25709);
        setField(term25708, term25708.getClass(), "baseCurrency", "pumvwBWvpy");
        setField(term25708, term25708.getClass(), "counterCurrency", "HwLHeGLyhe");
        setField(term25708, term25708.getClass(), "buyRate", term25736);
        setField(term25708, term25708.getClass(), "sellRate", term25738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term25708, args);
    }

};


