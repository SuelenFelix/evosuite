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

public class GamePresent_canEqual_69956592216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20058;
     Object term20132;

    public GamePresent_canEqual_69956592216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20058 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term20058, term20058.getClass(), "presentId", -6950146046121430355L);
        setField(term20058, term20058.getClass(), "presentName", "lLiSiPCciB");
        setIntField(term20058, term20058.getClass(), "rewardId", -1310015129);
        setIntField(term20058, term20058.getClass(), "stock", -2104981311);
        setField(term20058, term20058.getClass(), "message", "PsMKIIEwdR");
        setField(term20058, term20058.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term20058, term20058.getClass(), "endDate", "2099-01-01 05:00:00.0");
        term20132 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20132;
        callMethod(klass, "canEqual", argTypes, term20058, args);
    }

};


