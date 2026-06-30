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

public class GameBalanceTrialBidSet_getGreat_15606246102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201836;

    public GameBalanceTrialBidSet_getGreat_15606246102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201836 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201837 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201840 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201843 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201846 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201837, term1201837.getClass(), "pay", 1135085165);
        setIntField(term1201837, term1201837.getClass(), "win", 1081670047);
        setField(term1201836, term1201836.getClass(), "clear", term1201837);
        setIntField(term1201840, term1201840.getClass(), "pay", -860649807);
        setIntField(term1201840, term1201840.getClass(), "win", -1819129363);
        setField(term1201836, term1201836.getClass(), "great", term1201840);
        setIntField(term1201843, term1201843.getClass(), "pay", -1550724527);
        setIntField(term1201843, term1201843.getClass(), "win", 1011578592);
        setField(term1201836, term1201836.getClass(), "excellent", term1201843);
        setIntField(term1201846, term1201846.getClass(), "pay", 282209253);
        setIntField(term1201846, term1201846.getClass(), "win", -106062526);
        setField(term1201836, term1201836.getClass(), "perfect", term1201846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGreat", argTypes, term1201836, args);
    }

};


