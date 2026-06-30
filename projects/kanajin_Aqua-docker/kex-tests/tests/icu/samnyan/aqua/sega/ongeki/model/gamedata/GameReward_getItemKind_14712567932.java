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

public class GameReward_getItemKind_14712567932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8425;

    public GameReward_getItemKind_14712567932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8447 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.ItemType");
        Field term8446 = ((Class) term8447).getDeclaredField((String) "LimitBreakItem");
        ((Field) term8446).setAccessible(true);
        Object enum2 = ((Field) term8446).get((Object) null);
        term8425 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameReward"));
        setLongField(term8425, term8425.getClass(), "rewardId", -1468719814009985452L);
        setField(term8425, term8425.getClass(), "itemKind", enum2);
        setIntField(term8425, term8425.getClass(), "itemId", 304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameReward");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItemKind", argTypes, term8425, args);
    }

};


