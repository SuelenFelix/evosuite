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

public class GameReward_hashCode_5821567089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10724;

    public GameReward_hashCode_5821567089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10745 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.ItemType");
        Field term10744 = ((Class) term10745).getDeclaredField((String) "AlmightyJewel");
        ((Field) term10744).setAccessible(true);
        Object enum10 = ((Field) term10744).get((Object) null);
        term10724 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameReward"));
        setLongField(term10724, term10724.getClass(), "rewardId", -1610676979013636850L);
        setField(term10724, term10724.getClass(), "itemKind", enum10);
        setIntField(term10724, term10724.getClass(), "itemId", 339854490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameReward");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10724, args);
    }

};


