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
import java.lang.Long;

public class GamePresent_setPresentId_14935773558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18875;
     Object term18949;

    public GamePresent_setPresentId_14935773558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18875 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term18875, term18875.getClass(), "presentId", -9040825890007374809L);
        setField(term18875, term18875.getClass(), "presentName", "pdSvedKgPq");
        setIntField(term18875, term18875.getClass(), "rewardId", -1896376975);
        setIntField(term18875, term18875.getClass(), "stock", 729658803);
        setField(term18875, term18875.getClass(), "message", "epPTwvcoyb");
        setField(term18875, term18875.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term18875, term18875.getClass(), "endDate", "2099-01-01 05:00:00.0");
        term18949 = new Long(1368340889161782793L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term18949;
        callMethod(klass, "setPresentId", argTypes, term18875, args);
    }

};


