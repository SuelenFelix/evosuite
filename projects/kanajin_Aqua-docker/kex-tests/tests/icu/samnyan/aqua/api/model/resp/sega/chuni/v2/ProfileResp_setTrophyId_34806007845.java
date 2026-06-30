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
import java.lang.Integer;

public class ProfileResp_setTrophyId_34806007845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119960;
     Object term120035;

    public ProfileResp_setTrophyId_34806007845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119960 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term120003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120004 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120008 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120013 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120018 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term119960, term119960.getClass(), "userName", "OqAYoPyLDR");
        setIntField(term119960, term119960.getClass(), "level", 1654412455);
        setField(term119960, term119960.getClass(), "exp", "WeWWdLzBLg");
        setLongField(term119960, term119960.getClass(), "point", 5942903947023249939L);
        setLongField(term119960, term119960.getClass(), "totalPoint", 5691134758421980957L);
        setIntField(term119960, term119960.getClass(), "playCount", -787646150);
        setIntField(term119960, term119960.getClass(), "playerRating", 1349359069);
        setIntField(term119960, term119960.getClass(), "highestRating", -125612303);
        setIntField(term119960, term119960.getClass(), "nameplateId", 1609168894);
        setIntField(term119960, term119960.getClass(), "frameId", -1647372);
        setIntField(term119960, term119960.getClass(), "characterId", 2122725070);
        setIntField(term119960, term119960.getClass(), "trophyId", -599329490);
        setIntField(term119960, term119960.getClass(), "totalMapNum", 572191903);
        setLongField(term119960, term119960.getClass(), "totalHiScore", -7425210775721443271L);
        setLongField(term119960, term119960.getClass(), "totalBasicHighScore", 922585489945514753L);
        setLongField(term119960, term119960.getClass(), "totalAdvancedHighScore", -2452492363070783282L);
        setLongField(term119960, term119960.getClass(), "totalExpertHighScore", 4124241067661990336L);
        setLongField(term119960, term119960.getClass(), "totalMasterHighScore", 1298941820973868632L);
        setLongField(term119960, term119960.getClass(), "totalUltimaHighScore", -1608929094615847791L);
        setIntField(term119960, term119960.getClass(), "friendCount", -1803676362);
        setIntField(term120004, term120004.getClass(), "year", 2021);
        setShortField(term120004, term120004.getClass(), "month", (short) 6);
        setShortField(term120004, term120004.getClass(), "day", (short) 19);
        setField(term120003, term120003.getClass(), "date", term120004);
        setByteField(term120008, term120008.getClass(), "hour", (byte) 23);
        setByteField(term120008, term120008.getClass(), "minute", (byte) 25);
        setByteField(term120008, term120008.getClass(), "second", (byte) 7);
        setIntField(term120008, term120008.getClass(), "nano", 591956739);
        setField(term120003, term120003.getClass(), "time", term120008);
        setField(term119960, term119960.getClass(), "firstPlayDate", term120003);
        setIntField(term120014, term120014.getClass(), "year", 2028);
        setShortField(term120014, term120014.getClass(), "month", (short) 8);
        setShortField(term120014, term120014.getClass(), "day", (short) 10);
        setField(term120013, term120013.getClass(), "date", term120014);
        setByteField(term120018, term120018.getClass(), "hour", (byte) 15);
        setByteField(term120018, term120018.getClass(), "minute", (byte) 18);
        setByteField(term120018, term120018.getClass(), "second", (byte) 44);
        setIntField(term120018, term120018.getClass(), "nano", 474644494);
        setField(term120013, term120013.getClass(), "time", term120018);
        setField(term119960, term119960.getClass(), "lastPlayDate", term120013);
        setIntField(term119960, term119960.getClass(), "courseClass", -1784319289);
        setIntField(term119960, term119960.getClass(), "overPowerPoint", -2075111095);
        setIntField(term119960, term119960.getClass(), "overPowerRate", 1935916362);
        setIntField(term119960, term119960.getClass(), "mapIconId", -1081441143);
        setIntField(term119960, term119960.getClass(), "voiceId", -1789701403);
        setIntField(term119960, term119960.getClass(), "avatarWear", 540777612);
        setIntField(term119960, term119960.getClass(), "avatarHead", 1162910445);
        setIntField(term119960, term119960.getClass(), "avatarFace", -392947330);
        setIntField(term119960, term119960.getClass(), "avatarSkin", 1301585037);
        setIntField(term119960, term119960.getClass(), "avatarItem", -304156320);
        setIntField(term119960, term119960.getClass(), "avatarFront", -1127614611);
        setIntField(term119960, term119960.getClass(), "avatarBack", -1952236502);
        term120035 = new Integer(1360602065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term120035;
        callMethod(klass, "setTrophyId", argTypes, term119960, args);
    }

};


