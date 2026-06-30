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

public class Contest_toString_57841434248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73239;

    public Contest_toString_57841434248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73435 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term73434 = ((Class) term73435).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term73434).setAccessible(true);
        Object enum156 = ((Field) term73434).get((Object) null);
        Class<? extends Object> term73753 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term73752 = ((Class) term73753).getDeclaredField((String) "COOL_PERCENTAGE");
        ((Field) term73752).setAccessible(true);
        Object enum157 = ((Field) term73752).get((Object) null);
        term73239 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term73242 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73243 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73247 = newInstance(Class.forName("java.time.LocalTime"));
        Object term73252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73257 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term73239, term73239.getClass(), "id", -1825624890);
        setBooleanField(term73239, term73239.getClass(), "enable", false);
        setIntField(term73243, term73243.getClass(), "year", 2013);
        setShortField(term73243, term73243.getClass(), "month", (short) 10);
        setShortField(term73243, term73243.getClass(), "day", (short) 7);
        setField(term73242, term73242.getClass(), "date", term73243);
        setByteField(term73247, term73247.getClass(), "hour", (byte) 12);
        setByteField(term73247, term73247.getClass(), "minute", (byte) 2);
        setByteField(term73247, term73247.getClass(), "second", (byte) 42);
        setIntField(term73247, term73247.getClass(), "nano", 202308437);
        setField(term73242, term73242.getClass(), "time", term73247);
        setField(term73239, term73239.getClass(), "startTime", term73242);
        setIntField(term73253, term73253.getClass(), "year", 2019);
        setShortField(term73253, term73253.getClass(), "month", (short) 12);
        setShortField(term73253, term73253.getClass(), "day", (short) 29);
        setField(term73252, term73252.getClass(), "date", term73253);
        setByteField(term73257, term73257.getClass(), "hour", (byte) 16);
        setByteField(term73257, term73257.getClass(), "minute", (byte) 10);
        setByteField(term73257, term73257.getClass(), "second", (byte) 1);
        setIntField(term73257, term73257.getClass(), "nano", 198559584);
        setField(term73252, term73252.getClass(), "time", term73257);
        setField(term73239, term73239.getClass(), "endTime", term73252);
        setField(term73239, term73239.getClass(), "name", "FgaHDSytdu");
        setField(term73239, term73239.getClass(), "description", "cmIDVqeLNI");
        setField(term73239, term73239.getClass(), "league", enum156);
        setIntField(term73239, term73239.getClass(), "stars", 413214164);
        setIntField(term73239, term73239.getClass(), "minComplexity", 355911655);
        setIntField(term73239, term73239.getClass(), "maxComplexity", 1811833766);
        setIntField(term73239, term73239.getClass(), "stages", 735987104);
        setField(term73239, term73239.getClass(), "stageLimit", "XoYlWxsjIF");
        setField(term73239, term73239.getClass(), "normaType", enum157);
        setIntField(term73239, term73239.getClass(), "bronzeBorders", -1784072578);
        setIntField(term73239, term73239.getClass(), "sliverBorders", 2011764585);
        setIntField(term73239, term73239.getClass(), "goldBorders", -860680764);
        setField(term73239, term73239.getClass(), "pvList", "xkIacuRHpE");
        setField(term73239, term73239.getClass(), "pvDiffList", "xFULXQCABK");
        setField(term73239, term73239.getClass(), "bronzeContestReward", "ONotPjASxK");
        setField(term73239, term73239.getClass(), "sliverContestReward", "LzgtTgYOFG");
        setField(term73239, term73239.getClass(), "goldContestReward", "ouCBOakoEl");
        setField(term73239, term73239.getClass(), "contestEntryReward", "wQVWUCbSgW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term73239, args);
    }

};


