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

public class ForexRate_getCounterCurrency_5222936335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25135;

    public ForexRate_getCounterCurrency_5222936335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25163 = new Double(0.11577948268926874);
        Double term25165 = new Double(0.5617009352394552);
        term25135 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25136 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25136, term25136.getClass(), "seconds", 1276505397L);
        setIntField(term25136, term25136.getClass(), "nanos", 937000000);
        setField(term25135, term25135.getClass(), "timestamp", term25136);
        setField(term25135, term25135.getClass(), "baseCurrency", "EdPAvpluZg");
        setField(term25135, term25135.getClass(), "counterCurrency", "DzHVBMqWtE");
        setField(term25135, term25135.getClass(), "buyRate", term25163);
        setField(term25135, term25135.getClass(), "sellRate", term25165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCounterCurrency", argTypes, term25135, args);
    }

};


