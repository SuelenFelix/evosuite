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

public class GameBalanceTrialBidSet_setPerfect_2515611548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201923;
     Object term1201936;

    public GameBalanceTrialBidSet_setPerfect_2515611548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201923 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201924 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201927 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201930 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201933 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201924, term1201924.getClass(), "pay", -1200236448);
        setIntField(term1201924, term1201924.getClass(), "win", -2035160855);
        setField(term1201923, term1201923.getClass(), "clear", term1201924);
        setIntField(term1201927, term1201927.getClass(), "pay", 85469476);
        setIntField(term1201927, term1201927.getClass(), "win", -479796361);
        setField(term1201923, term1201923.getClass(), "great", term1201927);
        setIntField(term1201930, term1201930.getClass(), "pay", 1710966503);
        setIntField(term1201930, term1201930.getClass(), "win", 250539524);
        setField(term1201923, term1201923.getClass(), "excellent", term1201930);
        setIntField(term1201933, term1201933.getClass(), "pay", 1091668337);
        setIntField(term1201933, term1201933.getClass(), "win", -930987009);
        setField(term1201923, term1201923.getClass(), "perfect", term1201933);
        term1201936 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201936, term1201936.getClass(), "pay", -1188102943);
        setIntField(term1201936, term1201936.getClass(), "win", 1522011186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid");
        Object[] args = new Object[1];
        args[0] = term1201936;
        callMethod(klass, "setPerfect", argTypes, term1201923, args);
    }

};


