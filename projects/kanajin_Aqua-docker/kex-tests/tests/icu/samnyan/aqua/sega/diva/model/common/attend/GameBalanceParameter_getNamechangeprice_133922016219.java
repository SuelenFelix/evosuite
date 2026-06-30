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

public class GameBalanceParameter_getNamechangeprice_133922016219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2231;

    public GameBalanceParameter_getNamechangeprice_133922016219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2231 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter"));
        setIntField(term2231, term2231.getClass(), "name_change_price", 0);
        setField(term2231, term2231.getClass(), "easy_trials", null);
        setField(term2231, term2231.getClass(), "normal_trials", null);
        setField(term2231, term2231.getClass(), "hard_trials", null);
        setField(term2231, term2231.getClass(), "extreme_trials", null);
        setField(term2231, term2231.getClass(), "extra_extreme_trials", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName_change_price", argTypes, term2231, args);
    }

};


