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

public class GamePresent_setRewardId_1589806110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19171;
     Object term19245;

    public GamePresent_setRewardId_1589806110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19171 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term19171, term19171.getClass(), "presentId", 2354625302846375590L);
        setField(term19171, term19171.getClass(), "presentName", "wgRGBNrTGP");
        setIntField(term19171, term19171.getClass(), "rewardId", 584893196);
        setIntField(term19171, term19171.getClass(), "stock", 497269071);
        setField(term19171, term19171.getClass(), "message", "FIdNVptZpW");
        setField(term19171, term19171.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term19171, term19171.getClass(), "endDate", "2099-01-01 05:00:00.0");
        term19245 = new Integer(-1899301124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19245;
        callMethod(klass, "setRewardId", argTypes, term19171, args);
    }

};


