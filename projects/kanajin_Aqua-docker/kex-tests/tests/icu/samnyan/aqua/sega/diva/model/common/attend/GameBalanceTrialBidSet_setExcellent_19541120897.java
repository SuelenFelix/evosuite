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

public class GameBalanceTrialBidSet_setExcellent_19541120897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201907;
     Object term1201920;

    public GameBalanceTrialBidSet_setExcellent_19541120897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201907 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201908 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201911 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201914 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201917 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201908, term1201908.getClass(), "pay", 1789229512);
        setIntField(term1201908, term1201908.getClass(), "win", -431850483);
        setField(term1201907, term1201907.getClass(), "clear", term1201908);
        setIntField(term1201911, term1201911.getClass(), "pay", -2105473566);
        setIntField(term1201911, term1201911.getClass(), "win", 513818884);
        setField(term1201907, term1201907.getClass(), "great", term1201911);
        setIntField(term1201914, term1201914.getClass(), "pay", 1964871492);
        setIntField(term1201914, term1201914.getClass(), "win", -989029785);
        setField(term1201907, term1201907.getClass(), "excellent", term1201914);
        setIntField(term1201917, term1201917.getClass(), "pay", 1386443726);
        setIntField(term1201917, term1201917.getClass(), "win", 1183459392);
        setField(term1201907, term1201907.getClass(), "perfect", term1201917);
        term1201920 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201920, term1201920.getClass(), "pay", 1606330569);
        setIntField(term1201920, term1201920.getClass(), "win", -1100883379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid");
        Object[] args = new Object[1];
        args[0] = term1201920;
        callMethod(klass, "setExcellent", argTypes, term1201907, args);
    }

};


