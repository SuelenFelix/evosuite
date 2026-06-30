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

public class Contest_getContestEntryReward_105518249922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49991;

    public Contest_getContestEntryReward_105518249922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50173 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term50172 = ((Class) term50173).getDeclaredField((String) "ADVANCED");
        ((Field) term50172).setAccessible(true);
        Object enum103 = ((Field) term50172).get((Object) null);
        Class<? extends Object> term50479 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term50478 = ((Class) term50479).getDeclaredField((String) "SCORE");
        ((Field) term50478).setAccessible(true);
        Object enum104 = ((Field) term50478).get((Object) null);
        term49991 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term49994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49999 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50004 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50005 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50009 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49991, term49991.getClass(), "id", 297582552);
        setBooleanField(term49991, term49991.getClass(), "enable", true);
        setIntField(term49995, term49995.getClass(), "year", 2017);
        setShortField(term49995, term49995.getClass(), "month", (short) 6);
        setShortField(term49995, term49995.getClass(), "day", (short) 28);
        setField(term49994, term49994.getClass(), "date", term49995);
        setByteField(term49999, term49999.getClass(), "hour", (byte) 8);
        setByteField(term49999, term49999.getClass(), "minute", (byte) 1);
        setByteField(term49999, term49999.getClass(), "second", (byte) 14);
        setIntField(term49999, term49999.getClass(), "nano", 501033715);
        setField(term49994, term49994.getClass(), "time", term49999);
        setField(term49991, term49991.getClass(), "startTime", term49994);
        setIntField(term50005, term50005.getClass(), "year", 2016);
        setShortField(term50005, term50005.getClass(), "month", (short) 10);
        setShortField(term50005, term50005.getClass(), "day", (short) 10);
        setField(term50004, term50004.getClass(), "date", term50005);
        setByteField(term50009, term50009.getClass(), "hour", (byte) 16);
        setByteField(term50009, term50009.getClass(), "minute", (byte) 7);
        setByteField(term50009, term50009.getClass(), "second", (byte) 16);
        setIntField(term50009, term50009.getClass(), "nano", 995200309);
        setField(term50004, term50004.getClass(), "time", term50009);
        setField(term49991, term49991.getClass(), "endTime", term50004);
        setField(term49991, term49991.getClass(), "name", "TIPSlmidwP");
        setField(term49991, term49991.getClass(), "description", "SRYeqWJJkR");
        setField(term49991, term49991.getClass(), "league", enum103);
        setIntField(term49991, term49991.getClass(), "stars", -1485916498);
        setIntField(term49991, term49991.getClass(), "minComplexity", 722787672);
        setIntField(term49991, term49991.getClass(), "maxComplexity", 2077491675);
        setIntField(term49991, term49991.getClass(), "stages", -1728316609);
        setField(term49991, term49991.getClass(), "stageLimit", "vUVScKcyFY");
        setField(term49991, term49991.getClass(), "normaType", enum104);
        setIntField(term49991, term49991.getClass(), "bronzeBorders", 47118909);
        setIntField(term49991, term49991.getClass(), "sliverBorders", -2093707412);
        setIntField(term49991, term49991.getClass(), "goldBorders", -680627153);
        setField(term49991, term49991.getClass(), "pvList", "DCSMbuGiaM");
        setField(term49991, term49991.getClass(), "pvDiffList", "wtOVzMPrFU");
        setField(term49991, term49991.getClass(), "bronzeContestReward", "CBnamgJrJS");
        setField(term49991, term49991.getClass(), "sliverContestReward", "uJhRRqAnDP");
        setField(term49991, term49991.getClass(), "goldContestReward", "hJCqADrhuV");
        setField(term49991, term49991.getClass(), "contestEntryReward", "RyPUBlRpNZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestEntryReward", argTypes, term49991, args);
    }

};


