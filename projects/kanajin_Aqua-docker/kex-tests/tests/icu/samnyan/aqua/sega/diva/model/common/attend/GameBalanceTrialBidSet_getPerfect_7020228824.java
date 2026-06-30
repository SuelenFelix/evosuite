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

public class GameBalanceTrialBidSet_getPerfect_7020228824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201862;

    public GameBalanceTrialBidSet_getPerfect_7020228824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201862 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201863 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201866 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201869 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201872 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201863, term1201863.getClass(), "pay", -922994175);
        setIntField(term1201863, term1201863.getClass(), "win", 253050140);
        setField(term1201862, term1201862.getClass(), "clear", term1201863);
        setIntField(term1201866, term1201866.getClass(), "pay", 718389237);
        setIntField(term1201866, term1201866.getClass(), "win", -1304491573);
        setField(term1201862, term1201862.getClass(), "great", term1201866);
        setIntField(term1201869, term1201869.getClass(), "pay", -1730613671);
        setIntField(term1201869, term1201869.getClass(), "win", -149357706);
        setField(term1201862, term1201862.getClass(), "excellent", term1201869);
        setIntField(term1201872, term1201872.getClass(), "pay", 1940727941);
        setIntField(term1201872, term1201872.getClass(), "win", 1850110106);
        setField(term1201862, term1201862.getClass(), "perfect", term1201872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerfect", argTypes, term1201862, args);
    }

};


