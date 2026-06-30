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

public class Contest_setId_142009048823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50840;
     Object term51010;

    public Contest_setId_142009048823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51033 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term51032 = ((Class) term51033).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term51032).setAccessible(true);
        Object enum105 = ((Field) term51032).get((Object) null);
        Class<? extends Object> term51351 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term51350 = ((Class) term51351).getDeclaredField((String) "PERCENTAGE");
        ((Field) term51350).setAccessible(true);
        Object enum106 = ((Field) term51350).get((Object) null);
        term50840 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term50843 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50844 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50848 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50853 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50854 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50858 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term50840, term50840.getClass(), "id", 722519669);
        setBooleanField(term50840, term50840.getClass(), "enable", false);
        setIntField(term50844, term50844.getClass(), "year", 2014);
        setShortField(term50844, term50844.getClass(), "month", (short) 5);
        setShortField(term50844, term50844.getClass(), "day", (short) 31);
        setField(term50843, term50843.getClass(), "date", term50844);
        setByteField(term50848, term50848.getClass(), "hour", (byte) 16);
        setByteField(term50848, term50848.getClass(), "minute", (byte) 3);
        setByteField(term50848, term50848.getClass(), "second", (byte) 14);
        setIntField(term50848, term50848.getClass(), "nano", 281059649);
        setField(term50843, term50843.getClass(), "time", term50848);
        setField(term50840, term50840.getClass(), "startTime", term50843);
        setIntField(term50854, term50854.getClass(), "year", 2010);
        setShortField(term50854, term50854.getClass(), "month", (short) 12);
        setShortField(term50854, term50854.getClass(), "day", (short) 30);
        setField(term50853, term50853.getClass(), "date", term50854);
        setByteField(term50858, term50858.getClass(), "hour", (byte) 17);
        setByteField(term50858, term50858.getClass(), "minute", (byte) 44);
        setByteField(term50858, term50858.getClass(), "second", (byte) 59);
        setIntField(term50858, term50858.getClass(), "nano", 881407895);
        setField(term50853, term50853.getClass(), "time", term50858);
        setField(term50840, term50840.getClass(), "endTime", term50853);
        setField(term50840, term50840.getClass(), "name", "ardfVpCueq");
        setField(term50840, term50840.getClass(), "description", "wEYAmGJIEF");
        setField(term50840, term50840.getClass(), "league", enum105);
        setIntField(term50840, term50840.getClass(), "stars", -40335961);
        setIntField(term50840, term50840.getClass(), "minComplexity", 175343605);
        setIntField(term50840, term50840.getClass(), "maxComplexity", 1050853183);
        setIntField(term50840, term50840.getClass(), "stages", 848428785);
        setField(term50840, term50840.getClass(), "stageLimit", "iXEhfXJomO");
        setField(term50840, term50840.getClass(), "normaType", enum106);
        setIntField(term50840, term50840.getClass(), "bronzeBorders", -1984436481);
        setIntField(term50840, term50840.getClass(), "sliverBorders", -407582855);
        setIntField(term50840, term50840.getClass(), "goldBorders", 1190753616);
        setField(term50840, term50840.getClass(), "pvList", "KEoUMzNdMA");
        setField(term50840, term50840.getClass(), "pvDiffList", "SOsGYAgpgW");
        setField(term50840, term50840.getClass(), "bronzeContestReward", "ZBafuLDRDM");
        setField(term50840, term50840.getClass(), "sliverContestReward", "VDnsNuhEvG");
        setField(term50840, term50840.getClass(), "goldContestReward", "DMrfMwXyYT");
        setField(term50840, term50840.getClass(), "contestEntryReward", "GAzZvzjuXP");
        term51010 = new Integer(-752378450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term51010;
        callMethod(klass, "setId", argTypes, term50840, args);
    }

};


