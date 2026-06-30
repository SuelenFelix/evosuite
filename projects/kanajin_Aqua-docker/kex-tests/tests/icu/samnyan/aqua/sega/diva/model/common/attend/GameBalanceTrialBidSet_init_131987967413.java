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

public class GameBalanceTrialBidSet_init_131987967413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201993;
     Object term1201996;
     Object term1201999;
     Object term1202002;

    public GameBalanceTrialBidSet_init_131987967413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201993 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201993, term1201993.getClass(), "pay", -691058238);
        setIntField(term1201993, term1201993.getClass(), "win", 962481788);
        term1201996 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201996, term1201996.getClass(), "pay", 2103428076);
        setIntField(term1201996, term1201996.getClass(), "win", 1019116654);
        term1201999 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201999, term1201999.getClass(), "pay", -965365790);
        setIntField(term1201999, term1201999.getClass(), "win", -2019517053);
        term1202002 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1202002, term1202002.getClass(), "pay", -2112795286);
        setIntField(term1202002, term1202002.getClass(), "win", -77541617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid");
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid");
        Object[] args = new Object[4];
        args[0] = term1201993;
        args[1] = term1201996;
        args[2] = term1201999;
        args[3] = term1202002;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


