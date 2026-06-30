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

public class Contest_getMinComplexity_19524793439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38666;

    public Contest_getMinComplexity_19524793439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38848 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term38847 = ((Class) term38848).getDeclaredField((String) "ADVANCED");
        ((Field) term38847).setAccessible(true);
        Object enum77 = ((Field) term38847).get((Object) null);
        Class<? extends Object> term39154 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term39153 = ((Class) term39154).getDeclaredField((String) "SCORE");
        ((Field) term39153).setAccessible(true);
        Object enum78 = ((Field) term39153).get((Object) null);
        term38666 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term38669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38674 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38679 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38680 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38684 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term38666, term38666.getClass(), "id", 868908117);
        setBooleanField(term38666, term38666.getClass(), "enable", true);
        setIntField(term38670, term38670.getClass(), "year", 2027);
        setShortField(term38670, term38670.getClass(), "month", (short) 6);
        setShortField(term38670, term38670.getClass(), "day", (short) 20);
        setField(term38669, term38669.getClass(), "date", term38670);
        setByteField(term38674, term38674.getClass(), "hour", (byte) 23);
        setByteField(term38674, term38674.getClass(), "minute", (byte) 21);
        setByteField(term38674, term38674.getClass(), "second", (byte) 6);
        setIntField(term38674, term38674.getClass(), "nano", 897776059);
        setField(term38669, term38669.getClass(), "time", term38674);
        setField(term38666, term38666.getClass(), "startTime", term38669);
        setIntField(term38680, term38680.getClass(), "year", 2016);
        setShortField(term38680, term38680.getClass(), "month", (short) 3);
        setShortField(term38680, term38680.getClass(), "day", (short) 20);
        setField(term38679, term38679.getClass(), "date", term38680);
        setByteField(term38684, term38684.getClass(), "hour", (byte) 0);
        setByteField(term38684, term38684.getClass(), "minute", (byte) 54);
        setByteField(term38684, term38684.getClass(), "second", (byte) 6);
        setIntField(term38684, term38684.getClass(), "nano", 183302469);
        setField(term38679, term38679.getClass(), "time", term38684);
        setField(term38666, term38666.getClass(), "endTime", term38679);
        setField(term38666, term38666.getClass(), "name", "ADhlvQDtuh");
        setField(term38666, term38666.getClass(), "description", "rvUfMhtNrD");
        setField(term38666, term38666.getClass(), "league", enum77);
        setIntField(term38666, term38666.getClass(), "stars", 1789351397);
        setIntField(term38666, term38666.getClass(), "minComplexity", 2145528170);
        setIntField(term38666, term38666.getClass(), "maxComplexity", -585773976);
        setIntField(term38666, term38666.getClass(), "stages", 852806940);
        setField(term38666, term38666.getClass(), "stageLimit", "tVJNKfGPYg");
        setField(term38666, term38666.getClass(), "normaType", enum78);
        setIntField(term38666, term38666.getClass(), "bronzeBorders", 698551724);
        setIntField(term38666, term38666.getClass(), "sliverBorders", -1631048635);
        setIntField(term38666, term38666.getClass(), "goldBorders", 1342808731);
        setField(term38666, term38666.getClass(), "pvList", "AlAUNSOTmH");
        setField(term38666, term38666.getClass(), "pvDiffList", "IeuSZGvhvH");
        setField(term38666, term38666.getClass(), "bronzeContestReward", "zCejWZdaIc");
        setField(term38666, term38666.getClass(), "sliverContestReward", "aCfzlsgXhB");
        setField(term38666, term38666.getClass(), "goldContestReward", "HmhoMiUgEv");
        setField(term38666, term38666.getClass(), "contestEntryReward", "MuJvYyPzjX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinComplexity", argTypes, term38666, args);
    }

};


