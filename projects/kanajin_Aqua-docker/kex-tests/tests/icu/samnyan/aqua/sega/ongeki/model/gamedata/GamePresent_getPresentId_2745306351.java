package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GamePresent_getPresentId_2745306351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17923;

    public GamePresent_getPresentId_2745306351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17923 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term17923, term17923.getClass(), "presentId", 2135754395358000892L);
        setField(term17923, term17923.getClass(), "presentName", "ecHEQufXoq");
        setIntField(term17923, term17923.getClass(), "rewardId", -601863069);
        setIntField(term17923, term17923.getClass(), "stock", 663292551);
        setField(term17923, term17923.getClass(), "message", "btBLMvHzJg");
        setField(term17923, term17923.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term17923, term17923.getClass(), "endDate", "2099-01-01 05:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPresentId", argTypes, term17923, args);
    }

};


