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

public class GameBalanceTrialBidSet_getExcellent_19747665173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201849;

    public GameBalanceTrialBidSet_getExcellent_19747665173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201849 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201850 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201853 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201856 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201859 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201850, term1201850.getClass(), "pay", -1806006475);
        setIntField(term1201850, term1201850.getClass(), "win", 72695927);
        setField(term1201849, term1201849.getClass(), "clear", term1201850);
        setIntField(term1201853, term1201853.getClass(), "pay", -61153862);
        setIntField(term1201853, term1201853.getClass(), "win", -777015636);
        setField(term1201849, term1201849.getClass(), "great", term1201853);
        setIntField(term1201856, term1201856.getClass(), "pay", 2142498110);
        setIntField(term1201856, term1201856.getClass(), "win", -110190253);
        setField(term1201849, term1201849.getClass(), "excellent", term1201856);
        setIntField(term1201859, term1201859.getClass(), "pay", -205939105);
        setIntField(term1201859, term1201859.getClass(), "win", 1995839529);
        setField(term1201849, term1201849.getClass(), "perfect", term1201859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcellent", argTypes, term1201849, args);
    }

};


