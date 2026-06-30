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

public class GamePresent_setRewardId_1589806131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20605;
     Object term20609;

    public GamePresent_setRewardId_1589806131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20605 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term20605, term20605.getClass(), "presentId", 0L);
        setField(term20605, term20605.getClass(), "presentName", null);
        setIntField(term20605, term20605.getClass(), "rewardId", 0);
        setIntField(term20605, term20605.getClass(), "stock", 0);
        setField(term20605, term20605.getClass(), "message", null);
        setField(term20605, term20605.getClass(), "startDate", null);
        setField(term20605, term20605.getClass(), "endDate", null);
        term20609 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20609;
        callMethod(klass, "setRewardId", argTypes, term20605, args);
    }

};


