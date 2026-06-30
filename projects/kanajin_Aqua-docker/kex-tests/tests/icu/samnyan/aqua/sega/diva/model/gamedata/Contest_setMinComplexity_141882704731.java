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

public class Contest_setMinComplexity_141882704731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57906;
     Object term58076;

    public Contest_setMinComplexity_141882704731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58099 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term58098 = ((Class) term58099).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term58098).setAccessible(true);
        Object enum121 = ((Field) term58098).get((Object) null);
        Class<? extends Object> term58417 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term58416 = ((Class) term58417).getDeclaredField((String) "PERCENTAGE");
        ((Field) term58416).setAccessible(true);
        Object enum122 = ((Field) term58416).get((Object) null);
        term57906 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term57909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57914 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57919 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57920 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57924 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term57906, term57906.getClass(), "id", 263859424);
        setBooleanField(term57906, term57906.getClass(), "enable", false);
        setIntField(term57910, term57910.getClass(), "year", 2018);
        setShortField(term57910, term57910.getClass(), "month", (short) 5);
        setShortField(term57910, term57910.getClass(), "day", (short) 22);
        setField(term57909, term57909.getClass(), "date", term57910);
        setByteField(term57914, term57914.getClass(), "hour", (byte) 16);
        setByteField(term57914, term57914.getClass(), "minute", (byte) 46);
        setByteField(term57914, term57914.getClass(), "second", (byte) 48);
        setIntField(term57914, term57914.getClass(), "nano", 72983043);
        setField(term57909, term57909.getClass(), "time", term57914);
        setField(term57906, term57906.getClass(), "startTime", term57909);
        setIntField(term57920, term57920.getClass(), "year", 2022);
        setShortField(term57920, term57920.getClass(), "month", (short) 3);
        setShortField(term57920, term57920.getClass(), "day", (short) 16);
        setField(term57919, term57919.getClass(), "date", term57920);
        setByteField(term57924, term57924.getClass(), "hour", (byte) 16);
        setByteField(term57924, term57924.getClass(), "minute", (byte) 35);
        setByteField(term57924, term57924.getClass(), "second", (byte) 38);
        setIntField(term57924, term57924.getClass(), "nano", 79329968);
        setField(term57919, term57919.getClass(), "time", term57924);
        setField(term57906, term57906.getClass(), "endTime", term57919);
        setField(term57906, term57906.getClass(), "name", "dyqukIBJxC");
        setField(term57906, term57906.getClass(), "description", "MVMiGQdgnX");
        setField(term57906, term57906.getClass(), "league", enum121);
        setIntField(term57906, term57906.getClass(), "stars", 1436978289);
        setIntField(term57906, term57906.getClass(), "minComplexity", 696225243);
        setIntField(term57906, term57906.getClass(), "maxComplexity", -1421649118);
        setIntField(term57906, term57906.getClass(), "stages", -511248284);
        setField(term57906, term57906.getClass(), "stageLimit", "cQnJIENJHe");
        setField(term57906, term57906.getClass(), "normaType", enum122);
        setIntField(term57906, term57906.getClass(), "bronzeBorders", 788630042);
        setIntField(term57906, term57906.getClass(), "sliverBorders", 1430066560);
        setIntField(term57906, term57906.getClass(), "goldBorders", 836734074);
        setField(term57906, term57906.getClass(), "pvList", "ExjdCvAxlG");
        setField(term57906, term57906.getClass(), "pvDiffList", "moMySSiBuB");
        setField(term57906, term57906.getClass(), "bronzeContestReward", "iuuazALDWB");
        setField(term57906, term57906.getClass(), "sliverContestReward", "GqehccUels");
        setField(term57906, term57906.getClass(), "goldContestReward", "llbDGujrPe");
        setField(term57906, term57906.getClass(), "contestEntryReward", "QEoeITwBfz");
        term58076 = new Integer(-1747711865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term58076;
        callMethod(klass, "setMinComplexity", argTypes, term57906, args);
    }

};


