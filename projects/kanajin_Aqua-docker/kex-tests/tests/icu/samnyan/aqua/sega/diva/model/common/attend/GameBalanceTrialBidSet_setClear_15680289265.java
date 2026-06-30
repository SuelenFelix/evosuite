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

public class GameBalanceTrialBidSet_setClear_15680289265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201875;
     Object term1201888;

    public GameBalanceTrialBidSet_setClear_15680289265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201875 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201876 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201879 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201882 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201885 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201876, term1201876.getClass(), "pay", -2025767558);
        setIntField(term1201876, term1201876.getClass(), "win", 1058399111);
        setField(term1201875, term1201875.getClass(), "clear", term1201876);
        setIntField(term1201879, term1201879.getClass(), "pay", 474439987);
        setIntField(term1201879, term1201879.getClass(), "win", -1294719048);
        setField(term1201875, term1201875.getClass(), "great", term1201879);
        setIntField(term1201882, term1201882.getClass(), "pay", -975220410);
        setIntField(term1201882, term1201882.getClass(), "win", -1800295497);
        setField(term1201875, term1201875.getClass(), "excellent", term1201882);
        setIntField(term1201885, term1201885.getClass(), "pay", -862067533);
        setIntField(term1201885, term1201885.getClass(), "win", -1021732922);
        setField(term1201875, term1201875.getClass(), "perfect", term1201885);
        term1201888 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201888, term1201888.getClass(), "pay", -749666337);
        setIntField(term1201888, term1201888.getClass(), "win", -138673738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid");
        Object[] args = new Object[1];
        args[0] = term1201888;
        callMethod(klass, "setClear", argTypes, term1201875, args);
    }

};


