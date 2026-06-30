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

public class GameBalanceTrialBidSet_getArr_17133529890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201810;

    public GameBalanceTrialBidSet_getArr_17133529890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201810 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201811 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201814 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201817 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201820 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201811, term1201811.getClass(), "pay", -1863538905);
        setIntField(term1201811, term1201811.getClass(), "win", -707918712);
        setField(term1201810, term1201810.getClass(), "clear", term1201811);
        setIntField(term1201814, term1201814.getClass(), "pay", 1134487149);
        setIntField(term1201814, term1201814.getClass(), "win", -1618468597);
        setField(term1201810, term1201810.getClass(), "great", term1201814);
        setIntField(term1201817, term1201817.getClass(), "pay", -326110824);
        setIntField(term1201817, term1201817.getClass(), "win", -318161992);
        setField(term1201810, term1201810.getClass(), "excellent", term1201817);
        setIntField(term1201820, term1201820.getClass(), "pay", -365620152);
        setIntField(term1201820, term1201820.getClass(), "win", -1044010551);
        setField(term1201810, term1201810.getClass(), "perfect", term1201820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArr", argTypes, term1201810, args);
    }

};


