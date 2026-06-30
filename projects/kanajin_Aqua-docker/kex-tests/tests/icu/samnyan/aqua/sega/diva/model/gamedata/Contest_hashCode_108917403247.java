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

public class Contest_hashCode_108917403247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72390;

    public Contest_hashCode_108917403247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term72572 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term72571 = ((Class) term72572).getDeclaredField((String) "BEGINNER");
        ((Field) term72571).setAccessible(true);
        Object enum154 = ((Field) term72571).get((Object) null);
        Class<? extends Object> term72878 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term72877 = ((Class) term72878).getDeclaredField((String) "SCORE");
        ((Field) term72877).setAccessible(true);
        Object enum155 = ((Field) term72877).get((Object) null);
        term72390 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term72393 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72394 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72398 = newInstance(Class.forName("java.time.LocalTime"));
        Object term72403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72408 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term72390, term72390.getClass(), "id", -1514240086);
        setBooleanField(term72390, term72390.getClass(), "enable", false);
        setIntField(term72394, term72394.getClass(), "year", 2019);
        setShortField(term72394, term72394.getClass(), "month", (short) 7);
        setShortField(term72394, term72394.getClass(), "day", (short) 4);
        setField(term72393, term72393.getClass(), "date", term72394);
        setByteField(term72398, term72398.getClass(), "hour", (byte) 19);
        setByteField(term72398, term72398.getClass(), "minute", (byte) 20);
        setByteField(term72398, term72398.getClass(), "second", (byte) 59);
        setIntField(term72398, term72398.getClass(), "nano", 246784352);
        setField(term72393, term72393.getClass(), "time", term72398);
        setField(term72390, term72390.getClass(), "startTime", term72393);
        setIntField(term72404, term72404.getClass(), "year", 2023);
        setShortField(term72404, term72404.getClass(), "month", (short) 7);
        setShortField(term72404, term72404.getClass(), "day", (short) 1);
        setField(term72403, term72403.getClass(), "date", term72404);
        setByteField(term72408, term72408.getClass(), "hour", (byte) 4);
        setByteField(term72408, term72408.getClass(), "minute", (byte) 33);
        setByteField(term72408, term72408.getClass(), "second", (byte) 9);
        setIntField(term72408, term72408.getClass(), "nano", 94365310);
        setField(term72403, term72403.getClass(), "time", term72408);
        setField(term72390, term72390.getClass(), "endTime", term72403);
        setField(term72390, term72390.getClass(), "name", "qZzSujRYqy");
        setField(term72390, term72390.getClass(), "description", "IJXeeXjhgd");
        setField(term72390, term72390.getClass(), "league", enum154);
        setIntField(term72390, term72390.getClass(), "stars", 2052244839);
        setIntField(term72390, term72390.getClass(), "minComplexity", -1763480506);
        setIntField(term72390, term72390.getClass(), "maxComplexity", -1541297110);
        setIntField(term72390, term72390.getClass(), "stages", -1581464804);
        setField(term72390, term72390.getClass(), "stageLimit", "QTDAUOmsVV");
        setField(term72390, term72390.getClass(), "normaType", enum155);
        setIntField(term72390, term72390.getClass(), "bronzeBorders", -1954937310);
        setIntField(term72390, term72390.getClass(), "sliverBorders", -460657407);
        setIntField(term72390, term72390.getClass(), "goldBorders", 941003590);
        setField(term72390, term72390.getClass(), "pvList", "ODrpsXzKlX");
        setField(term72390, term72390.getClass(), "pvDiffList", "xxswizwuwy");
        setField(term72390, term72390.getClass(), "bronzeContestReward", "QbkfeBvHco");
        setField(term72390, term72390.getClass(), "sliverContestReward", "lLaCGEQqCV");
        setField(term72390, term72390.getClass(), "goldContestReward", "bYFQVigzOV");
        setField(term72390, term72390.getClass(), "contestEntryReward", "TXKwwgcTVt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term72390, args);
    }

};


