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

public class Contest_setMaxComplexity_30838811732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58793;
     Object term58958;

    public Contest_setMaxComplexity_30838811732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58981 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term58980 = ((Class) term58981).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term58980).setAccessible(true);
        Object enum123 = ((Field) term58980).get((Object) null);
        Class<? extends Object> term59299 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term59298 = ((Class) term59299).getDeclaredField((String) "SCORE");
        ((Field) term59298).setAccessible(true);
        Object enum124 = ((Field) term59298).get((Object) null);
        term58793 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term58796 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58797 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58801 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58806 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58811 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term58793, term58793.getClass(), "id", 682812715);
        setBooleanField(term58793, term58793.getClass(), "enable", true);
        setIntField(term58797, term58797.getClass(), "year", 2018);
        setShortField(term58797, term58797.getClass(), "month", (short) 9);
        setShortField(term58797, term58797.getClass(), "day", (short) 3);
        setField(term58796, term58796.getClass(), "date", term58797);
        setByteField(term58801, term58801.getClass(), "hour", (byte) 16);
        setByteField(term58801, term58801.getClass(), "minute", (byte) 48);
        setByteField(term58801, term58801.getClass(), "second", (byte) 45);
        setIntField(term58801, term58801.getClass(), "nano", 919694917);
        setField(term58796, term58796.getClass(), "time", term58801);
        setField(term58793, term58793.getClass(), "startTime", term58796);
        setIntField(term58807, term58807.getClass(), "year", 2021);
        setShortField(term58807, term58807.getClass(), "month", (short) 8);
        setShortField(term58807, term58807.getClass(), "day", (short) 23);
        setField(term58806, term58806.getClass(), "date", term58807);
        setByteField(term58811, term58811.getClass(), "hour", (byte) 15);
        setByteField(term58811, term58811.getClass(), "minute", (byte) 43);
        setByteField(term58811, term58811.getClass(), "second", (byte) 10);
        setIntField(term58811, term58811.getClass(), "nano", 893504165);
        setField(term58806, term58806.getClass(), "time", term58811);
        setField(term58793, term58793.getClass(), "endTime", term58806);
        setField(term58793, term58793.getClass(), "name", "rWOKjAUIvS");
        setField(term58793, term58793.getClass(), "description", "IcpfsIGlDf");
        setField(term58793, term58793.getClass(), "league", enum123);
        setIntField(term58793, term58793.getClass(), "stars", -1092883950);
        setIntField(term58793, term58793.getClass(), "minComplexity", 950385621);
        setIntField(term58793, term58793.getClass(), "maxComplexity", -232352320);
        setIntField(term58793, term58793.getClass(), "stages", -232333014);
        setField(term58793, term58793.getClass(), "stageLimit", "xCfGcRdHTK");
        setField(term58793, term58793.getClass(), "normaType", enum124);
        setIntField(term58793, term58793.getClass(), "bronzeBorders", -139694079);
        setIntField(term58793, term58793.getClass(), "sliverBorders", -1602072035);
        setIntField(term58793, term58793.getClass(), "goldBorders", 1902624392);
        setField(term58793, term58793.getClass(), "pvList", "KKHQCvKTvF");
        setField(term58793, term58793.getClass(), "pvDiffList", "XBhNIIxiNP");
        setField(term58793, term58793.getClass(), "bronzeContestReward", "JljyXnwkuC");
        setField(term58793, term58793.getClass(), "sliverContestReward", "XLOxkLyvMY");
        setField(term58793, term58793.getClass(), "goldContestReward", "pjUyKHjjKH");
        setField(term58793, term58793.getClass(), "contestEntryReward", "JApuaiAykc");
        term58958 = new Integer(904607217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term58958;
        callMethod(klass, "setMaxComplexity", argTypes, term58793, args);
    }

};


