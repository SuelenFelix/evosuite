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

public class GameBalanceTrialBidSet_getClear_21338003541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201823;

    public GameBalanceTrialBidSet_getClear_21338003541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201823 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201824 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201827 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201830 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201833 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201824, term1201824.getClass(), "pay", 157047316);
        setIntField(term1201824, term1201824.getClass(), "win", -1783848416);
        setField(term1201823, term1201823.getClass(), "clear", term1201824);
        setIntField(term1201827, term1201827.getClass(), "pay", -1364623301);
        setIntField(term1201827, term1201827.getClass(), "win", 534635076);
        setField(term1201823, term1201823.getClass(), "great", term1201827);
        setIntField(term1201830, term1201830.getClass(), "pay", 1083334723);
        setIntField(term1201830, term1201830.getClass(), "win", 804804472);
        setField(term1201823, term1201823.getClass(), "excellent", term1201830);
        setIntField(term1201833, term1201833.getClass(), "pay", -1220767953);
        setIntField(term1201833, term1201833.getClass(), "win", -1682673638);
        setField(term1201823, term1201823.getClass(), "perfect", term1201833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClear", argTypes, term1201823, args);
    }

};


