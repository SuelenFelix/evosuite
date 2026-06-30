package icu.samnyan.aqua.sega.diva.model.common.attend;

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
import static icu.samnyan.aqua.sega.diva.model.common.attend.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameBalanceTrialBidSet_equals_5454718749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201939;
     Object term1201952;

    public GameBalanceTrialBidSet_equals_5454718749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201939 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201940 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201943 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201946 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201949 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201940, term1201940.getClass(), "pay", 884566190);
        setIntField(term1201940, term1201940.getClass(), "win", 552929896);
        setField(term1201939, term1201939.getClass(), "clear", term1201940);
        setIntField(term1201943, term1201943.getClass(), "pay", -1978823251);
        setIntField(term1201943, term1201943.getClass(), "win", -1975593639);
        setField(term1201939, term1201939.getClass(), "great", term1201943);
        setIntField(term1201946, term1201946.getClass(), "pay", 389906570);
        setIntField(term1201946, term1201946.getClass(), "win", 164920289);
        setField(term1201939, term1201939.getClass(), "excellent", term1201946);
        setIntField(term1201949, term1201949.getClass(), "pay", 1868076421);
        setIntField(term1201949, term1201949.getClass(), "win", 226099843);
        setField(term1201939, term1201939.getClass(), "perfect", term1201949);
        term1201952 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1201952;
        callMethod(klass, "equals", argTypes, term1201939, args);
    }

};


