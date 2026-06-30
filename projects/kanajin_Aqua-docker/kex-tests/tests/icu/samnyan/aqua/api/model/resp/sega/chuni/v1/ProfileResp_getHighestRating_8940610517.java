package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProfileResp_getHighestRating_8940610517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582;

    public ProfileResp_getHighestRating_8940610517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term582 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term624 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term625 = newInstance(Class.forName("java.time.LocalDate"));
        Object term629 = newInstance(Class.forName("java.time.LocalTime"));
        Object term634 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term635 = newInstance(Class.forName("java.time.LocalDate"));
        Object term639 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term582, term582.getClass(), "userName", "oVcInYnLWB");
        setIntField(term582, term582.getClass(), "level", 1063420942);
        setField(term582, term582.getClass(), "exp", "aJlieCFVtF");
        setLongField(term582, term582.getClass(), "point", -3842548265506930260L);
        setLongField(term582, term582.getClass(), "totalPoint", -5788180182343976541L);
        setIntField(term582, term582.getClass(), "playCount", 1375330971);
        setIntField(term582, term582.getClass(), "playerRating", -478195677);
        setIntField(term582, term582.getClass(), "highestRating", 972867650);
        setIntField(term582, term582.getClass(), "nameplateId", 1655935355);
        setIntField(term582, term582.getClass(), "frameId", -481533957);
        setIntField(term582, term582.getClass(), "characterId", 1240914516);
        setIntField(term582, term582.getClass(), "trophyId", -1465035361);
        setIntField(term582, term582.getClass(), "totalMapNum", 1090617576);
        setLongField(term582, term582.getClass(), "totalHiScore", 2936323121573284007L);
        setLongField(term582, term582.getClass(), "totalBasicHighScore", -1154553077993834885L);
        setLongField(term582, term582.getClass(), "totalAdvancedHighScore", -2850532706972744550L);
        setLongField(term582, term582.getClass(), "totalExpertHighScore", -2644215923136513282L);
        setLongField(term582, term582.getClass(), "totalMasterHighScore", -1468719814009985452L);
        setIntField(term582, term582.getClass(), "friendCount", -1547384488);
        setIntField(term625, term625.getClass(), "year", 2012);
        setShortField(term625, term625.getClass(), "month", (short) 2);
        setShortField(term625, term625.getClass(), "day", (short) 19);
        setField(term624, term624.getClass(), "date", term625);
        setByteField(term629, term629.getClass(), "hour", (byte) 8);
        setByteField(term629, term629.getClass(), "minute", (byte) 4);
        setByteField(term629, term629.getClass(), "second", (byte) 43);
        setIntField(term629, term629.getClass(), "nano", 114930008);
        setField(term624, term624.getClass(), "time", term629);
        setField(term582, term582.getClass(), "firstPlayDate", term624);
        setIntField(term635, term635.getClass(), "year", 2017);
        setShortField(term635, term635.getClass(), "month", (short) 6);
        setShortField(term635, term635.getClass(), "day", (short) 8);
        setField(term634, term634.getClass(), "date", term635);
        setByteField(term639, term639.getClass(), "hour", (byte) 0);
        setByteField(term639, term639.getClass(), "minute", (byte) 18);
        setByteField(term639, term639.getClass(), "second", (byte) 55);
        setIntField(term639, term639.getClass(), "nano", 680586717);
        setField(term634, term634.getClass(), "time", term639);
        setField(term582, term582.getClass(), "lastPlayDate", term634);
        setIntField(term582, term582.getClass(), "courseClass", 1442160736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term582, args);
    }

};


