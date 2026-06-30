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

public class GameBalanceParameter_getExtremetrials_187156506523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2239;

    public GameBalanceParameter_getExtremetrials_187156506523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2239 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter"));
        setIntField(term2239, term2239.getClass(), "name_change_price", 0);
        setField(term2239, term2239.getClass(), "easy_trials", null);
        setField(term2239, term2239.getClass(), "normal_trials", null);
        setField(term2239, term2239.getClass(), "hard_trials", null);
        setField(term2239, term2239.getClass(), "extreme_trials", null);
        setField(term2239, term2239.getClass(), "extra_extreme_trials", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtreme_trials", argTypes, term2239, args);
    }

};


