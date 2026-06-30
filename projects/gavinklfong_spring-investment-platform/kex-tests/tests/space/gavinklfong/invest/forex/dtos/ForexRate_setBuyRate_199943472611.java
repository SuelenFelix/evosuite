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

public class ForexRate_setBuyRate_199943472611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25494;
     Object term25526;

    public ForexRate_setBuyRate_199943472611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25522 = new Double(0.7865909711092062);
        Double term25524 = new Double(0.06587158449170749);
        term25494 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25495 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25495, term25495.getClass(), "seconds", 1490956290L);
        setIntField(term25495, term25495.getClass(), "nanos", 70000000);
        setField(term25494, term25494.getClass(), "timestamp", term25495);
        setField(term25494, term25494.getClass(), "baseCurrency", "HHQcYMSBVc");
        setField(term25494, term25494.getClass(), "counterCurrency", "wdoqITnaAP");
        setField(term25494, term25494.getClass(), "buyRate", term25522);
        setField(term25494, term25494.getClass(), "sellRate", term25524);
        term25526 = new Double(0.0865998004187658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term25526;
        callMethod(klass, "setBuyRate", argTypes, term25494, args);
    }

};


