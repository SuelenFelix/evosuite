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

public class GameBalanceTrialBidSet_hashCode_9678519911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201967;

    public GameBalanceTrialBidSet_hashCode_9678519911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201967 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201968 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201971 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201974 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201977 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201968, term1201968.getClass(), "pay", -167696935);
        setIntField(term1201968, term1201968.getClass(), "win", -490826447);
        setField(term1201967, term1201967.getClass(), "clear", term1201968);
        setIntField(term1201971, term1201971.getClass(), "pay", -9625824);
        setIntField(term1201971, term1201971.getClass(), "win", 393008755);
        setField(term1201967, term1201967.getClass(), "great", term1201971);
        setIntField(term1201974, term1201974.getClass(), "pay", -739137969);
        setIntField(term1201974, term1201974.getClass(), "win", 2076710277);
        setField(term1201967, term1201967.getClass(), "excellent", term1201974);
        setIntField(term1201977, term1201977.getClass(), "pay", -282334334);
        setIntField(term1201977, term1201977.getClass(), "win", -435550913);
        setField(term1201967, term1201967.getClass(), "perfect", term1201977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1201967, args);
    }

};


