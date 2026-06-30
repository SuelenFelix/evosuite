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

public class GameBalanceTrialBidSet_toString_41397449112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201980;

    public GameBalanceTrialBidSet_toString_41397449112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201980 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1201981 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201984 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201987 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1201990 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1201981, term1201981.getClass(), "pay", 133927161);
        setIntField(term1201981, term1201981.getClass(), "win", -52073544);
        setField(term1201980, term1201980.getClass(), "clear", term1201981);
        setIntField(term1201984, term1201984.getClass(), "pay", -1020933250);
        setIntField(term1201984, term1201984.getClass(), "win", 1605355568);
        setField(term1201980, term1201980.getClass(), "great", term1201984);
        setIntField(term1201987, term1201987.getClass(), "pay", 500028205);
        setIntField(term1201987, term1201987.getClass(), "win", 1984806553);
        setField(term1201980, term1201980.getClass(), "excellent", term1201987);
        setIntField(term1201990, term1201990.getClass(), "pay", 443477086);
        setIntField(term1201990, term1201990.getClass(), "win", 1494911207);
        setField(term1201980, term1201980.getClass(), "perfect", term1201990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1201980, args);
    }

};


