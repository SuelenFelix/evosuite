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

public class Contest_setSliverBorders_163051052537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63466;
     Object term63627;

    public Contest_setSliverBorders_163051052537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63650 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term63649 = ((Class) term63650).getDeclaredField((String) "ADVANCED");
        ((Field) term63649).setAccessible(true);
        Object enum134 = ((Field) term63649).get((Object) null);
        Class<? extends Object> term63956 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term63955 = ((Class) term63956).getDeclaredField((String) "SCORE");
        ((Field) term63955).setAccessible(true);
        Object enum135 = ((Field) term63955).get((Object) null);
        term63466 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term63469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63474 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63479 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63480 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63484 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term63466, term63466.getClass(), "id", -1085899912);
        setBooleanField(term63466, term63466.getClass(), "enable", false);
        setIntField(term63470, term63470.getClass(), "year", 2026);
        setShortField(term63470, term63470.getClass(), "month", (short) 2);
        setShortField(term63470, term63470.getClass(), "day", (short) 5);
        setField(term63469, term63469.getClass(), "date", term63470);
        setByteField(term63474, term63474.getClass(), "hour", (byte) 1);
        setByteField(term63474, term63474.getClass(), "minute", (byte) 38);
        setByteField(term63474, term63474.getClass(), "second", (byte) 15);
        setIntField(term63474, term63474.getClass(), "nano", 167345230);
        setField(term63469, term63469.getClass(), "time", term63474);
        setField(term63466, term63466.getClass(), "startTime", term63469);
        setIntField(term63480, term63480.getClass(), "year", 2029);
        setShortField(term63480, term63480.getClass(), "month", (short) 6);
        setShortField(term63480, term63480.getClass(), "day", (short) 4);
        setField(term63479, term63479.getClass(), "date", term63480);
        setByteField(term63484, term63484.getClass(), "hour", (byte) 22);
        setByteField(term63484, term63484.getClass(), "minute", (byte) 1);
        setByteField(term63484, term63484.getClass(), "second", (byte) 38);
        setIntField(term63484, term63484.getClass(), "nano", 329228491);
        setField(term63479, term63479.getClass(), "time", term63484);
        setField(term63466, term63466.getClass(), "endTime", term63479);
        setField(term63466, term63466.getClass(), "name", "TWsXTUTREq");
        setField(term63466, term63466.getClass(), "description", "tVsPWASlsh");
        setField(term63466, term63466.getClass(), "league", enum134);
        setIntField(term63466, term63466.getClass(), "stars", -1458980236);
        setIntField(term63466, term63466.getClass(), "minComplexity", 890505372);
        setIntField(term63466, term63466.getClass(), "maxComplexity", 2044137055);
        setIntField(term63466, term63466.getClass(), "stages", -1452324619);
        setField(term63466, term63466.getClass(), "stageLimit", "PjZoebHrvq");
        setField(term63466, term63466.getClass(), "normaType", enum135);
        setIntField(term63466, term63466.getClass(), "bronzeBorders", -1121709274);
        setIntField(term63466, term63466.getClass(), "sliverBorders", -532304223);
        setIntField(term63466, term63466.getClass(), "goldBorders", 666218293);
        setField(term63466, term63466.getClass(), "pvList", "VwpicfUdWr");
        setField(term63466, term63466.getClass(), "pvDiffList", "UDKBkeWilS");
        setField(term63466, term63466.getClass(), "bronzeContestReward", "bNeNAYRdqb");
        setField(term63466, term63466.getClass(), "sliverContestReward", "dcGBEVfYLI");
        setField(term63466, term63466.getClass(), "goldContestReward", "AbYQkbUCWK");
        setField(term63466, term63466.getClass(), "contestEntryReward", "PjENVjWdrp");
        term63627 = new Integer(1737876343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term63627;
        callMethod(klass, "setSliverBorders", argTypes, term63466, args);
    }

};


