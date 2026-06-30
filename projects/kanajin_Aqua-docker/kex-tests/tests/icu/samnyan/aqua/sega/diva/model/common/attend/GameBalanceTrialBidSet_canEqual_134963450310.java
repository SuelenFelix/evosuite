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

public class GameBalanceTrialBidSet_canEqual_134963450310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201953;
     Object term1201966;

    public GameBalanceTrialBidSet_canEqual_134963450310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201953 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201954 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201957 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201960 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201963 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201954, term1201954.getClass(), "pay", -1163095165);
        setIntField(term1201954, term1201954.getClass(), "win", -1628280119);
        setField(term1201953, term1201953.getClass(), "clear", term1201954);
        setIntField(term1201957, term1201957.getClass(), "pay", 485369772);
        setIntField(term1201957, term1201957.getClass(), "win", 206706693);
        setField(term1201953, term1201953.getClass(), "great", term1201957);
        setIntField(term1201960, term1201960.getClass(), "pay", -1952405457);
        setIntField(term1201960, term1201960.getClass(), "win", 1360392565);
        setField(term1201953, term1201953.getClass(), "excellent", term1201960);
        setIntField(term1201963, term1201963.getClass(), "pay", 913075171);
        setIntField(term1201963, term1201963.getClass(), "win", -726554653);
        setField(term1201953, term1201953.getClass(), "perfect", term1201963);
        term1201966 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1201966;
        callMethod(klass, "canEqual", argTypes, term1201953, args);
    }

};


