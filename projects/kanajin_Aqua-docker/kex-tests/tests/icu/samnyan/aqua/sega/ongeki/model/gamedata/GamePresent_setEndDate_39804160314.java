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

public class GamePresent_setEndDate_39804160314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19763;

    public GamePresent_setEndDate_39804160314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19763 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term19763, term19763.getClass(), "presentId", 1597484336218508869L);
        setField(term19763, term19763.getClass(), "presentName", "pDqgDbJoFw");
        setIntField(term19763, term19763.getClass(), "rewardId", 1102721075);
        setIntField(term19763, term19763.getClass(), "stock", -426764678);
        setField(term19763, term19763.getClass(), "message", "iVOvTzOxwt");
        setField(term19763, term19763.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term19763, term19763.getClass(), "endDate", "2099-01-01 05:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BjZQdecXvB";
        callMethod(klass, "setEndDate", argTypes, term19763, args);
    }

};


