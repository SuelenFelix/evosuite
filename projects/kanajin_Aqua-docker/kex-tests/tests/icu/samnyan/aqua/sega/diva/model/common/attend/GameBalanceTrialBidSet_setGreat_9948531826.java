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

public class GameBalanceTrialBidSet_setGreat_9948531826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201891;
     Object term1201904;

    public GameBalanceTrialBidSet_setGreat_9948531826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201891 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201892 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201895 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201898 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201901 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201892, term1201892.getClass(), "pay", -1160617732);
        setIntField(term1201892, term1201892.getClass(), "win", -1052809082);
        setField(term1201891, term1201891.getClass(), "clear", term1201892);
        setIntField(term1201895, term1201895.getClass(), "pay", 1732626045);
        setIntField(term1201895, term1201895.getClass(), "win", 1170001602);
        setField(term1201891, term1201891.getClass(), "great", term1201895);
        setIntField(term1201898, term1201898.getClass(), "pay", -826089412);
        setIntField(term1201898, term1201898.getClass(), "win", -471193407);
        setField(term1201891, term1201891.getClass(), "excellent", term1201898);
        setIntField(term1201901, term1201901.getClass(), "pay", -385802880);
        setIntField(term1201901, term1201901.getClass(), "win", -1586758614);
        setField(term1201891, term1201891.getClass(), "perfect", term1201901);
        term1201904 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201904, term1201904.getClass(), "pay", -330887925);
        setIntField(term1201904, term1201904.getClass(), "win", 361173099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid");
        Object[] args = new Object[1];
        args[0] = term1201904;
        callMethod(klass, "setGreat", argTypes, term1201891, args);
    }

};


