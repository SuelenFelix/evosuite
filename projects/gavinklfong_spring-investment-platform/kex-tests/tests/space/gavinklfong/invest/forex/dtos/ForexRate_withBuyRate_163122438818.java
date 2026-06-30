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

public class ForexRate_withBuyRate_163122438818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25812;
     Object term25844;

    public ForexRate_withBuyRate_163122438818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25840 = new Double(0.9511861072660375);
        Double term25842 = new Double(0.05880719443135807);
        term25812 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25813 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25813, term25813.getClass(), "seconds", 1264037800L);
        setIntField(term25813, term25813.getClass(), "nanos", 343000000);
        setField(term25812, term25812.getClass(), "timestamp", term25813);
        setField(term25812, term25812.getClass(), "baseCurrency", "hePqROaplw");
        setField(term25812, term25812.getClass(), "counterCurrency", "PJcSNDruWd");
        setField(term25812, term25812.getClass(), "buyRate", term25840);
        setField(term25812, term25812.getClass(), "sellRate", term25842);
        term25844 = new Double(0.34010089048558567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term25844;
        callMethod(klass, "withBuyRate", argTypes, term25812, args);
    }

};


