package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProfileResp_getFirstPlayDate_87876173220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117523;

    public ProfileResp_getFirstPlayDate_87876173220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117523 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term117566 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117567 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117571 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117576 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117581 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term117523, term117523.getClass(), "userName", "nVkuONqxFg");
        setIntField(term117523, term117523.getClass(), "level", -354347448);
        setField(term117523, term117523.getClass(), "exp", "JBPNAgHgey");
        setLongField(term117523, term117523.getClass(), "point", 7554651752347702837L);
        setLongField(term117523, term117523.getClass(), "totalPoint", 4606173792606034286L);
        setIntField(term117523, term117523.getClass(), "playCount", 2100984342);
        setIntField(term117523, term117523.getClass(), "playerRating", -1857881883);
        setIntField(term117523, term117523.getClass(), "highestRating", -1349763809);
        setIntField(term117523, term117523.getClass(), "nameplateId", -1908819286);
        setIntField(term117523, term117523.getClass(), "frameId", 1559210438);
        setIntField(term117523, term117523.getClass(), "characterId", 636306086);
        setIntField(term117523, term117523.getClass(), "trophyId", -1910447346);
        setIntField(term117523, term117523.getClass(), "totalMapNum", -2007198875);
        setLongField(term117523, term117523.getClass(), "totalHiScore", -6040050173440547733L);
        setLongField(term117523, term117523.getClass(), "totalBasicHighScore", -6854077062848517634L);
        setLongField(term117523, term117523.getClass(), "totalAdvancedHighScore", 6000592757438147771L);
        setLongField(term117523, term117523.getClass(), "totalExpertHighScore", 349646802409059185L);
        setLongField(term117523, term117523.getClass(), "totalMasterHighScore", 7073772449355072737L);
        setLongField(term117523, term117523.getClass(), "totalUltimaHighScore", -284959417941334238L);
        setIntField(term117523, term117523.getClass(), "friendCount", -375038705);
        setIntField(term117567, term117567.getClass(), "year", 2027);
        setShortField(term117567, term117567.getClass(), "month", (short) 10);
        setShortField(term117567, term117567.getClass(), "day", (short) 19);
        setField(term117566, term117566.getClass(), "date", term117567);
        setByteField(term117571, term117571.getClass(), "hour", (byte) 21);
        setByteField(term117571, term117571.getClass(), "minute", (byte) 58);
        setByteField(term117571, term117571.getClass(), "second", (byte) 52);
        setIntField(term117571, term117571.getClass(), "nano", 371951031);
        setField(term117566, term117566.getClass(), "time", term117571);
        setField(term117523, term117523.getClass(), "firstPlayDate", term117566);
        setIntField(term117577, term117577.getClass(), "year", 2026);
        setShortField(term117577, term117577.getClass(), "month", (short) 8);
        setShortField(term117577, term117577.getClass(), "day", (short) 25);
        setField(term117576, term117576.getClass(), "date", term117577);
        setByteField(term117581, term117581.getClass(), "hour", (byte) 7);
        setByteField(term117581, term117581.getClass(), "minute", (byte) 6);
        setByteField(term117581, term117581.getClass(), "second", (byte) 47);
        setIntField(term117581, term117581.getClass(), "nano", 266271277);
        setField(term117576, term117576.getClass(), "time", term117581);
        setField(term117523, term117523.getClass(), "lastPlayDate", term117576);
        setIntField(term117523, term117523.getClass(), "courseClass", 831221083);
        setIntField(term117523, term117523.getClass(), "overPowerPoint", 1256263689);
        setIntField(term117523, term117523.getClass(), "overPowerRate", 1109261531);
        setIntField(term117523, term117523.getClass(), "mapIconId", -362593147);
        setIntField(term117523, term117523.getClass(), "voiceId", -2106931493);
        setIntField(term117523, term117523.getClass(), "avatarWear", -111444445);
        setIntField(term117523, term117523.getClass(), "avatarHead", 1113632031);
        setIntField(term117523, term117523.getClass(), "avatarFace", 1435393);
        setIntField(term117523, term117523.getClass(), "avatarSkin", 1010051463);
        setIntField(term117523, term117523.getClass(), "avatarItem", 1391555563);
        setIntField(term117523, term117523.getClass(), "avatarFront", 348756355);
        setIntField(term117523, term117523.getClass(), "avatarBack", 2094684580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstPlayDate", argTypes, term117523, args);
    }

};


