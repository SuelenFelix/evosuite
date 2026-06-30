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

public class Contest_getBronzeBorders_150475621214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43015;

    public Contest_getBronzeBorders_150475621214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43211 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term43210 = ((Class) term43211).getDeclaredField((String) "INTERMEDIATE");
        ((Field) term43210).setAccessible(true);
        Object enum87 = ((Field) term43210).get((Object) null);
        Class<? extends Object> term43529 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term43528 = ((Class) term43529).getDeclaredField((String) "COOL_PERCENTAGE");
        ((Field) term43528).setAccessible(true);
        Object enum88 = ((Field) term43528).get((Object) null);
        term43015 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term43018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43023 = newInstance(Class.forName("java.time.LocalTime"));
        Object term43028 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43029 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43033 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term43015, term43015.getClass(), "id", -1288536479);
        setBooleanField(term43015, term43015.getClass(), "enable", true);
        setIntField(term43019, term43019.getClass(), "year", 2029);
        setShortField(term43019, term43019.getClass(), "month", (short) 7);
        setShortField(term43019, term43019.getClass(), "day", (short) 19);
        setField(term43018, term43018.getClass(), "date", term43019);
        setByteField(term43023, term43023.getClass(), "hour", (byte) 17);
        setByteField(term43023, term43023.getClass(), "minute", (byte) 37);
        setByteField(term43023, term43023.getClass(), "second", (byte) 21);
        setIntField(term43023, term43023.getClass(), "nano", 320093277);
        setField(term43018, term43018.getClass(), "time", term43023);
        setField(term43015, term43015.getClass(), "startTime", term43018);
        setIntField(term43029, term43029.getClass(), "year", 2028);
        setShortField(term43029, term43029.getClass(), "month", (short) 1);
        setShortField(term43029, term43029.getClass(), "day", (short) 11);
        setField(term43028, term43028.getClass(), "date", term43029);
        setByteField(term43033, term43033.getClass(), "hour", (byte) 22);
        setByteField(term43033, term43033.getClass(), "minute", (byte) 3);
        setByteField(term43033, term43033.getClass(), "second", (byte) 39);
        setIntField(term43033, term43033.getClass(), "nano", 175567313);
        setField(term43028, term43028.getClass(), "time", term43033);
        setField(term43015, term43015.getClass(), "endTime", term43028);
        setField(term43015, term43015.getClass(), "name", "laQWfyDqCq");
        setField(term43015, term43015.getClass(), "description", "gMFGfpbPZE");
        setField(term43015, term43015.getClass(), "league", enum87);
        setIntField(term43015, term43015.getClass(), "stars", 1092038167);
        setIntField(term43015, term43015.getClass(), "minComplexity", 1879729823);
        setIntField(term43015, term43015.getClass(), "maxComplexity", 1443855558);
        setIntField(term43015, term43015.getClass(), "stages", -1933419449);
        setField(term43015, term43015.getClass(), "stageLimit", "QcfydYbOGP");
        setField(term43015, term43015.getClass(), "normaType", enum88);
        setIntField(term43015, term43015.getClass(), "bronzeBorders", -1804322375);
        setIntField(term43015, term43015.getClass(), "sliverBorders", 1595814906);
        setIntField(term43015, term43015.getClass(), "goldBorders", -834193529);
        setField(term43015, term43015.getClass(), "pvList", "FdMzwKizAk");
        setField(term43015, term43015.getClass(), "pvDiffList", "jjwHVTqCkP");
        setField(term43015, term43015.getClass(), "bronzeContestReward", "uUAkxSFPyL");
        setField(term43015, term43015.getClass(), "sliverContestReward", "XfzbAdTaCO");
        setField(term43015, term43015.getClass(), "goldContestReward", "rDcGfVDmsE");
        setField(term43015, term43015.getClass(), "contestEntryReward", "agspBqCjgG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBronzeBorders", argTypes, term43015, args);
    }

};


