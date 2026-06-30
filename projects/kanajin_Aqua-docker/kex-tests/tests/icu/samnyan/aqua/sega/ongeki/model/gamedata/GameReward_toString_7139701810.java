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
import java.lang.String;
import java.lang.Object;

public class GameReward_toString_7139701810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11040;

    public GameReward_toString_7139701810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11055 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.ItemType");
        Field term11054 = ((Class) term11055).getDeclaredField((String) "Present");
        ((Field) term11054).setAccessible(true);
        Object enum11 = ((Field) term11054).get((Object) null);
        term11040 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameReward"));
        setLongField(term11040, term11040.getClass(), "rewardId", 2062173786000223358L);
        setField(term11040, term11040.getClass(), "itemKind", enum11);
        setIntField(term11040, term11040.getClass(), "itemId", -615654495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameReward");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term11040, args);
    }

};


