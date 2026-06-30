package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class Contest_setBronzeBorders_58109530636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62599;
     Object term62764;

    public Contest_setBronzeBorders_58109530636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62787 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term62786 = ((Class) term62787).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term62786).setAccessible(true);
        Object enum132 = ((Field) term62786).get((Object) null);
        Class<? extends Object> term63105 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term63104 = ((Class) term63105).getDeclaredField((String) "SCORE");
        ((Field) term63104).setAccessible(true);
        Object enum133 = ((Field) term63104).get((Object) null);
        term62599 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term62602 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62603 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62607 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62617 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term62599, term62599.getClass(), "id", -316771104);
        setBooleanField(term62599, term62599.getClass(), "enable", false);
        setIntField(term62603, term62603.getClass(), "year", 2020);
        setShortField(term62603, term62603.getClass(), "month", (short) 5);
        setShortField(term62603, term62603.getClass(), "day", (short) 12);
        setField(term62602, term62602.getClass(), "date", term62603);
        setByteField(term62607, term62607.getClass(), "hour", (byte) 22);
        setByteField(term62607, term62607.getClass(), "minute", (byte) 7);
        setByteField(term62607, term62607.getClass(), "second", (byte) 49);
        setIntField(term62607, term62607.getClass(), "nano", 677355362);
        setField(term62602, term62602.getClass(), "time", term62607);
        setField(term62599, term62599.getClass(), "startTime", term62602);
        setIntField(term62613, term62613.getClass(), "year", 2010);
        setShortField(term62613, term62613.getClass(), "month", (short) 11);
        setShortField(term62613, term62613.getClass(), "day", (short) 1);
        setField(term62612, term62612.getClass(), "date", term62613);
        setByteField(term62617, term62617.getClass(), "hour", (byte) 5);
        setByteField(term62617, term62617.getClass(), "minute", (byte) 32);
        setByteField(term62617, term62617.getClass(), "second", (byte) 8);
        setIntField(term62617, term62617.getClass(), "nano", 918832231);
        setField(term62612, term62612.getClass(), "time", term62617);
        setField(term62599, term62599.getClass(), "endTime", term62612);
        setField(term62599, term62599.getClass(), "name", "nwKTRDmHWk");
        setField(term62599, term62599.getClass(), "description", "UueEixdrss");
        setField(term62599, term62599.getClass(), "league", enum132);
        setIntField(term62599, term62599.getClass(), "stars", -1374527319);
        setIntField(term62599, term62599.getClass(), "minComplexity", -1735276919);
        setIntField(term62599, term62599.getClass(), "maxComplexity", -712023865);
        setIntField(term62599, term62599.getClass(), "stages", 613256157);
        setField(term62599, term62599.getClass(), "stageLimit", "ceafBXJyBB");
        setField(term62599, term62599.getClass(), "normaType", enum133);
        setIntField(term62599, term62599.getClass(), "bronzeBorders", 454242689);
        setIntField(term62599, term62599.getClass(), "sliverBorders", 1798354517);
        setIntField(term62599, term62599.getClass(), "goldBorders", -1495693617);
        setField(term62599, term62599.getClass(), "pvList", "VNHIbCXqhH");
        setField(term62599, term62599.getClass(), "pvDiffList", "csnhUIxUaP");
        setField(term62599, term62599.getClass(), "bronzeContestReward", "fmWYICGnwt");
        setField(term62599, term62599.getClass(), "sliverContestReward", "FlZbOFNISk");
        setField(term62599, term62599.getClass(), "goldContestReward", "zDtePZrZQH");
        setField(term62599, term62599.getClass(), "contestEntryReward", "YPVZjrbvVl");
        term62764 = new Integer(-890538258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term62764;
        callMethod(klass, "setBronzeBorders", argTypes, term62599, args);
    }

};


