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

public class Contest_setBronzeContestReward_53022612541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66986;

    public Contest_setBronzeContestReward_53022612541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67189 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term67188 = ((Class) term67189).getDeclaredField((String) "PROFESSIONAL");
        ((Field) term67188).setAccessible(true);
        Object enum142 = ((Field) term67188).get((Object) null);
        Class<? extends Object> term67507 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term67506 = ((Class) term67507).getDeclaredField((String) "PERCENTAGE");
        ((Field) term67506).setAccessible(true);
        Object enum143 = ((Field) term67506).get((Object) null);
        term66986 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        Object term66989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67004 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term66986, term66986.getClass(), "id", 1459628013);
        setBooleanField(term66986, term66986.getClass(), "enable", false);
        setIntField(term66990, term66990.getClass(), "year", 2023);
        setShortField(term66990, term66990.getClass(), "month", (short) 8);
        setShortField(term66990, term66990.getClass(), "day", (short) 21);
        setField(term66989, term66989.getClass(), "date", term66990);
        setByteField(term66994, term66994.getClass(), "hour", (byte) 10);
        setByteField(term66994, term66994.getClass(), "minute", (byte) 36);
        setByteField(term66994, term66994.getClass(), "second", (byte) 15);
        setIntField(term66994, term66994.getClass(), "nano", 257070204);
        setField(term66989, term66989.getClass(), "time", term66994);
        setField(term66986, term66986.getClass(), "startTime", term66989);
        setIntField(term67000, term67000.getClass(), "year", 2012);
        setShortField(term67000, term67000.getClass(), "month", (short) 12);
        setShortField(term67000, term67000.getClass(), "day", (short) 14);
        setField(term66999, term66999.getClass(), "date", term67000);
        setByteField(term67004, term67004.getClass(), "hour", (byte) 1);
        setByteField(term67004, term67004.getClass(), "minute", (byte) 47);
        setByteField(term67004, term67004.getClass(), "second", (byte) 3);
        setIntField(term67004, term67004.getClass(), "nano", 359751066);
        setField(term66999, term66999.getClass(), "time", term67004);
        setField(term66986, term66986.getClass(), "endTime", term66999);
        setField(term66986, term66986.getClass(), "name", "JINAWGBEol");
        setField(term66986, term66986.getClass(), "description", "HZRzxVDGhV");
        setField(term66986, term66986.getClass(), "league", enum142);
        setIntField(term66986, term66986.getClass(), "stars", -1641507499);
        setIntField(term66986, term66986.getClass(), "minComplexity", -33436796);
        setIntField(term66986, term66986.getClass(), "maxComplexity", -1527326823);
        setIntField(term66986, term66986.getClass(), "stages", 469871899);
        setField(term66986, term66986.getClass(), "stageLimit", "wOWOSBOjln");
        setField(term66986, term66986.getClass(), "normaType", enum143);
        setIntField(term66986, term66986.getClass(), "bronzeBorders", -1348703436);
        setIntField(term66986, term66986.getClass(), "sliverBorders", -2027012650);
        setIntField(term66986, term66986.getClass(), "goldBorders", 1343432022);
        setField(term66986, term66986.getClass(), "pvList", "iVXUeGctUB");
        setField(term66986, term66986.getClass(), "pvDiffList", "bmLiVLNmZC");
        setField(term66986, term66986.getClass(), "bronzeContestReward", "ORExcUfatr");
        setField(term66986, term66986.getClass(), "sliverContestReward", "cUonKmQWCB");
        setField(term66986, term66986.getClass(), "goldContestReward", "CvbqWuRute");
        setField(term66986, term66986.getClass(), "contestEntryReward", "yuvBFZQJBJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "prymoiXBsv";
        callMethod(klass, "setBronzeContestReward", argTypes, term66986, args);
    }

};


