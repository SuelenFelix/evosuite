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

public class GamePresent_setStartDate_156122439413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19605;

    public GamePresent_setStartDate_156122439413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19605 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term19605, term19605.getClass(), "presentId", 1215116475929634177L);
        setField(term19605, term19605.getClass(), "presentName", "VePIumgrrU");
        setIntField(term19605, term19605.getClass(), "rewardId", -1667990367);
        setIntField(term19605, term19605.getClass(), "stock", -1214628358);
        setField(term19605, term19605.getClass(), "message", "DPwIqlszZo");
        setField(term19605, term19605.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term19605, term19605.getClass(), "endDate", "2099-01-01 05:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mNgDshwZNc";
        callMethod(klass, "setStartDate", argTypes, term19605, args);
    }

};


