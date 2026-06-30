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
import java.lang.Integer;

public class GamePresent_setStock_106241319511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19309;
     Object term19383;

    public GamePresent_setStock_106241319511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19309 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term19309, term19309.getClass(), "presentId", 7276637106827860087L);
        setField(term19309, term19309.getClass(), "presentName", "rQjxAhisjm");
        setIntField(term19309, term19309.getClass(), "rewardId", -1882480155);
        setIntField(term19309, term19309.getClass(), "stock", -1410220680);
        setField(term19309, term19309.getClass(), "message", "ZDhASPHjDG");
        setField(term19309, term19309.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term19309, term19309.getClass(), "endDate", "2099-01-01 05:00:00.0");
        term19383 = new Integer(389427431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19383;
        callMethod(klass, "setStock", argTypes, term19309, args);
    }

};


