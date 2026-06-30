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

public class Contest_setSliverContestReward_132528746842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67893;

    public Contest_setSliverContestReward_132528746842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68096 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term68095 = ((Class) term68096).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term68095).setAccessible(true);
        Object enum144 = ((Field) term68095).get((Object) null);
        Class<? extends Object> term68414 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term68413 = ((Class) term68414).getDeclaredField((String) "PERCENTAGE");
        ((Field) term68413).setAccessible(true);
        Object enum145 = ((Field) term68413).get((Object) null);
        term67893 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term67896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67901 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67906 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67907 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67911 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term67893, term67893.getClass(), "id", -1767079160);
        setBooleanField(term67893, term67893.getClass(), "enable", true);
        setIntField(term67897, term67897.getClass(), "year", 2010);
        setShortField(term67897, term67897.getClass(), "month", (short) 2);
        setShortField(term67897, term67897.getClass(), "day", (short) 28);
        setField(term67896, term67896.getClass(), "date", term67897);
        setByteField(term67901, term67901.getClass(), "hour", (byte) 2);
        setByteField(term67901, term67901.getClass(), "minute", (byte) 54);
        setByteField(term67901, term67901.getClass(), "second", (byte) 48);
        setIntField(term67901, term67901.getClass(), "nano", 930628940);
        setField(term67896, term67896.getClass(), "time", term67901);
        setField(term67893, term67893.getClass(), "startTime", term67896);
        setIntField(term67907, term67907.getClass(), "year", 2022);
        setShortField(term67907, term67907.getClass(), "month", (short) 3);
        setShortField(term67907, term67907.getClass(), "day", (short) 11);
        setField(term67906, term67906.getClass(), "date", term67907);
        setByteField(term67911, term67911.getClass(), "hour", (byte) 7);
        setByteField(term67911, term67911.getClass(), "minute", (byte) 12);
        setByteField(term67911, term67911.getClass(), "second", (byte) 56);
        setIntField(term67911, term67911.getClass(), "nano", 884158779);
        setField(term67906, term67906.getClass(), "time", term67911);
        setField(term67893, term67893.getClass(), "endTime", term67906);
        setField(term67893, term67893.getClass(), "name", "XVkgypnsVx");
        setField(term67893, term67893.getClass(), "description", "TwXzbEYFtG");
        setField(term67893, term67893.getClass(), "league", enum144);
        setIntField(term67893, term67893.getClass(), "stars", -201010601);
        setIntField(term67893, term67893.getClass(), "minComplexity", 2060027076);
        setIntField(term67893, term67893.getClass(), "maxComplexity", 2084868811);
        setIntField(term67893, term67893.getClass(), "stages", 314478878);
        setField(term67893, term67893.getClass(), "stageLimit", "mRdoimcRwz");
        setField(term67893, term67893.getClass(), "normaType", enum145);
        setIntField(term67893, term67893.getClass(), "bronzeBorders", 1425342686);
        setIntField(term67893, term67893.getClass(), "sliverBorders", -1042470635);
        setIntField(term67893, term67893.getClass(), "goldBorders", -524352937);
        setField(term67893, term67893.getClass(), "pvList", "dxJDKuPPPM");
        setField(term67893, term67893.getClass(), "pvDiffList", "rXBuuDWXsm");
        setField(term67893, term67893.getClass(), "bronzeContestReward", "VSvKttZYSC");
        setField(term67893, term67893.getClass(), "sliverContestReward", "bbwxScASWL");
        setField(term67893, term67893.getClass(), "goldContestReward", "BXJdQmJvFh");
        setField(term67893, term67893.getClass(), "contestEntryReward", "bsPTRsievL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LPLRACmzWM";
        callMethod(klass, "setSliverContestReward", argTypes, term67893, args);
    }

};


