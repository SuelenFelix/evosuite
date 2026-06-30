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

public class GameBalanceTrialBid_hashCode_195767004517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1449196;

    public GameBalanceTrialBid_hashCode_195767004517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1449196 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1449196, term1449196.getClass(), "pay", 0);
        setIntField(term1449196, term1449196.getClass(), "win", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1449196, args);
    }

};


