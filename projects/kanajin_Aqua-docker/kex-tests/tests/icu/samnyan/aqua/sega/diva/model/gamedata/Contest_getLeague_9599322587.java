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

public class Contest_getLeague_9599322587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36952;

    public Contest_getLeague_9599322587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37134 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term37133 = ((Class) term37134).getDeclaredField((String) "ADVANCED");
        ((Field) term37133).setAccessible(true);
        Object enum73 = ((Field) term37133).get((Object) null);
        Class<? extends Object> term37440 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term37439 = ((Class) term37440).getDeclaredField((String) "SCORE");
        ((Field) term37439).setAccessible(true);
        Object enum74 = ((Field) term37439).get((Object) null);
        term36952 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term36955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36970 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term36952, term36952.getClass(), "id", 1431951992);
        setBooleanField(term36952, term36952.getClass(), "enable", true);
        setIntField(term36956, term36956.getClass(), "year", 2016);
        setShortField(term36956, term36956.getClass(), "month", (short) 6);
        setShortField(term36956, term36956.getClass(), "day", (short) 23);
        setField(term36955, term36955.getClass(), "date", term36956);
        setByteField(term36960, term36960.getClass(), "hour", (byte) 20);
        setByteField(term36960, term36960.getClass(), "minute", (byte) 51);
        setByteField(term36960, term36960.getClass(), "second", (byte) 43);
        setIntField(term36960, term36960.getClass(), "nano", 284389409);
        setField(term36955, term36955.getClass(), "time", term36960);
        setField(term36952, term36952.getClass(), "startTime", term36955);
        setIntField(term36966, term36966.getClass(), "year", 2014);
        setShortField(term36966, term36966.getClass(), "month", (short) 10);
        setShortField(term36966, term36966.getClass(), "day", (short) 7);
        setField(term36965, term36965.getClass(), "date", term36966);
        setByteField(term36970, term36970.getClass(), "hour", (byte) 12);
        setByteField(term36970, term36970.getClass(), "minute", (byte) 59);
        setByteField(term36970, term36970.getClass(), "second", (byte) 39);
        setIntField(term36970, term36970.getClass(), "nano", 603709306);
        setField(term36965, term36965.getClass(), "time", term36970);
        setField(term36952, term36952.getClass(), "endTime", term36965);
        setField(term36952, term36952.getClass(), "name", "GUXdlpmVNQ");
        setField(term36952, term36952.getClass(), "description", "QxSwOpnogl");
        setField(term36952, term36952.getClass(), "league", enum73);
        setIntField(term36952, term36952.getClass(), "stars", -1608123016);
        setIntField(term36952, term36952.getClass(), "minComplexity", -896473214);
        setIntField(term36952, term36952.getClass(), "maxComplexity", 401203924);
        setIntField(term36952, term36952.getClass(), "stages", -1212399479);
        setField(term36952, term36952.getClass(), "stageLimit", "wXeTrDfRqa");
        setField(term36952, term36952.getClass(), "normaType", enum74);
        setIntField(term36952, term36952.getClass(), "bronzeBorders", 2107679041);
        setIntField(term36952, term36952.getClass(), "sliverBorders", 2040965507);
        setIntField(term36952, term36952.getClass(), "goldBorders", -1281083262);
        setField(term36952, term36952.getClass(), "pvList", "QsFsmwqvwM");
        setField(term36952, term36952.getClass(), "pvDiffList", "pSDSdAjceB");
        setField(term36952, term36952.getClass(), "bronzeContestReward", "TGMaCYOqml");
        setField(term36952, term36952.getClass(), "sliverContestReward", "btqCBRPcNd");
        setField(term36952, term36952.getClass(), "goldContestReward", "LEbiLyVKDG");
        setField(term36952, term36952.getClass(), "contestEntryReward", "PzUzEwZhUT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLeague", argTypes, term36952, args);
    }

};


