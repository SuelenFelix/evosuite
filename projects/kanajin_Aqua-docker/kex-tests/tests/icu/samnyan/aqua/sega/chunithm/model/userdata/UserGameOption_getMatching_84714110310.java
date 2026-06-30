package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGameOption_getMatching_84714110310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53221;

    public UserGameOption_getMatching_84714110310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53227 = new Long(846579494941632714L);
        term53221 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term53223 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term53225 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term53241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53278 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53334 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53335 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53339 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53387 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53428 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53429 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53433 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term53221, term53221.getClass(), "id", -5824480506846704461L);
        setLongField(term53223, term53223.getClass(), "id", 3429445910087803709L);
        setLongField(term53225, term53225.getClass(), "id", 6844542874326058740L);
        setField(term53225, term53225.getClass(), "extId", term53227);
        setField(term53225, term53225.getClass(), "luid", "zzfzxQYlis");
        setIntField(term53242, term53242.getClass(), "year", 2018);
        setShortField(term53242, term53242.getClass(), "month", (short) 2);
        setShortField(term53242, term53242.getClass(), "day", (short) 15);
        setField(term53241, term53241.getClass(), "date", term53242);
        setByteField(term53246, term53246.getClass(), "hour", (byte) 16);
        setByteField(term53246, term53246.getClass(), "minute", (byte) 4);
        setByteField(term53246, term53246.getClass(), "second", (byte) 19);
        setIntField(term53246, term53246.getClass(), "nano", 538124451);
        setField(term53241, term53241.getClass(), "time", term53246);
        setField(term53225, term53225.getClass(), "registerTime", term53241);
        setIntField(term53252, term53252.getClass(), "year", 2013);
        setShortField(term53252, term53252.getClass(), "month", (short) 10);
        setShortField(term53252, term53252.getClass(), "day", (short) 20);
        setField(term53251, term53251.getClass(), "date", term53252);
        setByteField(term53256, term53256.getClass(), "hour", (byte) 11);
        setByteField(term53256, term53256.getClass(), "minute", (byte) 17);
        setByteField(term53256, term53256.getClass(), "second", (byte) 1);
        setIntField(term53256, term53256.getClass(), "nano", 266879040);
        setField(term53251, term53251.getClass(), "time", term53256);
        setField(term53225, term53225.getClass(), "accessTime", term53251);
        setField(term53223, term53223.getClass(), "card", term53225);
        setField(term53223, term53223.getClass(), "userName", "TJJQwVEzxz");
        setIntField(term53274, term53274.getClass(), "year", 2022);
        setShortField(term53274, term53274.getClass(), "month", (short) 6);
        setShortField(term53274, term53274.getClass(), "day", (short) 2);
        setField(term53273, term53273.getClass(), "date", term53274);
        setByteField(term53278, term53278.getClass(), "hour", (byte) 18);
        setByteField(term53278, term53278.getClass(), "minute", (byte) 14);
        setByteField(term53278, term53278.getClass(), "second", (byte) 42);
        setIntField(term53278, term53278.getClass(), "nano", 593545677);
        setField(term53273, term53273.getClass(), "time", term53278);
        setField(term53223, term53223.getClass(), "lastLoginDate", term53273);
        setBooleanField(term53223, term53223.getClass(), "isWebJoin", false);
        setField(term53223, term53223.getClass(), "webLimitDate", "kHtEHBrsFo");
        setIntField(term53223, term53223.getClass(), "level", 871491464);
        setIntField(term53223, term53223.getClass(), "reincarnationNum", 1250354269);
        setField(term53223, term53223.getClass(), "exp", "EmAvkhGlPV");
        setLongField(term53223, term53223.getClass(), "point", -7486371039960699202L);
        setLongField(term53223, term53223.getClass(), "totalPoint", 3936368864173279345L);
        setIntField(term53223, term53223.getClass(), "playCount", 695748317);
        setIntField(term53223, term53223.getClass(), "multiPlayCount", -439470959);
        setIntField(term53223, term53223.getClass(), "multiWinCount", -248472453);
        setIntField(term53223, term53223.getClass(), "requestResCount", 1056759659);
        setIntField(term53223, term53223.getClass(), "acceptResCount", -233313895);
        setIntField(term53223, term53223.getClass(), "successResCount", 2014416586);
        setIntField(term53223, term53223.getClass(), "playerRating", 1614071253);
        setIntField(term53223, term53223.getClass(), "highestRating", -548611489);
        setIntField(term53223, term53223.getClass(), "nameplateId", 792588182);
        setIntField(term53223, term53223.getClass(), "frameId", 1145540785);
        setIntField(term53223, term53223.getClass(), "characterId", -1255440898);
        setIntField(term53223, term53223.getClass(), "trophyId", -1185096329);
        setIntField(term53223, term53223.getClass(), "playedTutorialBit", -2051822073);
        setIntField(term53223, term53223.getClass(), "firstTutorialCancelNum", -838891056);
        setIntField(term53223, term53223.getClass(), "masterTutorialCancelNum", -2133180225);
        setIntField(term53223, term53223.getClass(), "totalRepertoireCount", -1486915040);
        setIntField(term53223, term53223.getClass(), "totalMapNum", -1960290626);
        setLongField(term53223, term53223.getClass(), "totalHiScore", 6993652740699384445L);
        setLongField(term53223, term53223.getClass(), "totalBasicHighScore", -1750953812188769604L);
        setLongField(term53223, term53223.getClass(), "totalAdvancedHighScore", -2708952612032666340L);
        setLongField(term53223, term53223.getClass(), "totalExpertHighScore", -1148993446345293581L);
        setLongField(term53223, term53223.getClass(), "totalMasterHighScore", 6614269735692083780L);
        setIntField(term53335, term53335.getClass(), "year", 2010);
        setShortField(term53335, term53335.getClass(), "month", (short) 7);
        setShortField(term53335, term53335.getClass(), "day", (short) 19);
        setField(term53334, term53334.getClass(), "date", term53335);
        setByteField(term53339, term53339.getClass(), "hour", (byte) 16);
        setByteField(term53339, term53339.getClass(), "minute", (byte) 23);
        setByteField(term53339, term53339.getClass(), "second", (byte) 11);
        setIntField(term53339, term53339.getClass(), "nano", 638450755);
        setField(term53334, term53334.getClass(), "time", term53339);
        setField(term53223, term53223.getClass(), "eventWatchedDate", term53334);
        setIntField(term53223, term53223.getClass(), "friendCount", -1941903722);
        setBooleanField(term53223, term53223.getClass(), "isMaimai", true);
        setField(term53223, term53223.getClass(), "firstGameId", "mBrbyQVzve");
        setField(term53223, term53223.getClass(), "firstRomVersion", "FQODEbQeKa");
        setField(term53223, term53223.getClass(), "firstDataVersion", "iLsUPvsdys");
        setIntField(term53383, term53383.getClass(), "year", 2010);
        setShortField(term53383, term53383.getClass(), "month", (short) 8);
        setShortField(term53383, term53383.getClass(), "day", (short) 29);
        setField(term53382, term53382.getClass(), "date", term53383);
        setByteField(term53387, term53387.getClass(), "hour", (byte) 14);
        setByteField(term53387, term53387.getClass(), "minute", (byte) 6);
        setByteField(term53387, term53387.getClass(), "second", (byte) 52);
        setIntField(term53387, term53387.getClass(), "nano", 882272618);
        setField(term53382, term53382.getClass(), "time", term53387);
        setField(term53223, term53223.getClass(), "firstPlayDate", term53382);
        setField(term53223, term53223.getClass(), "lastGameId", "zsglFxvzdp");
        setField(term53223, term53223.getClass(), "lastRomVersion", "zhXtSGLnJR");
        setField(term53223, term53223.getClass(), "lastDataVersion", "XlNXxsYNss");
        setIntField(term53429, term53429.getClass(), "year", 2011);
        setShortField(term53429, term53429.getClass(), "month", (short) 3);
        setShortField(term53429, term53429.getClass(), "day", (short) 21);
        setField(term53428, term53428.getClass(), "date", term53429);
        setByteField(term53433, term53433.getClass(), "hour", (byte) 10);
        setByteField(term53433, term53433.getClass(), "minute", (byte) 56);
        setByteField(term53433, term53433.getClass(), "second", (byte) 39);
        setIntField(term53433, term53433.getClass(), "nano", 54553750);
        setField(term53428, term53428.getClass(), "time", term53433);
        setField(term53223, term53223.getClass(), "lastPlayDate", term53428);
        setIntField(term53223, term53223.getClass(), "lastPlaceId", 491009356);
        setField(term53223, term53223.getClass(), "lastPlaceName", "jheRZWjuaB");
        setField(term53223, term53223.getClass(), "lastRegionId", "IERziToRSQ");
        setField(term53223, term53223.getClass(), "lastRegionName", "mDTRMwjBpc");
        setField(term53223, term53223.getClass(), "lastAllNetId", "sCLAuKoiVL");
        setField(term53223, term53223.getClass(), "lastClientId", "pFWiDEnVnU");
        setField(term53221, term53221.getClass(), "user", term53223);
        setIntField(term53221, term53221.getClass(), "bgInfo", 1180952236);
        setIntField(term53221, term53221.getClass(), "fieldColor", 1549827025);
        setIntField(term53221, term53221.getClass(), "guideSound", 523998499);
        setIntField(term53221, term53221.getClass(), "soundEffect", -808741755);
        setIntField(term53221, term53221.getClass(), "guideLine", -1088446142);
        setIntField(term53221, term53221.getClass(), "speed", 342337914);
        setIntField(term53221, term53221.getClass(), "optionSet", 920216419);
        setIntField(term53221, term53221.getClass(), "matching", -1576226952);
        setIntField(term53221, term53221.getClass(), "judgePos", 1555746325);
        setIntField(term53221, term53221.getClass(), "rating", -1910031809);
        setIntField(term53221, term53221.getClass(), "judgeJustice", 1270786654);
        setIntField(term53221, term53221.getClass(), "judgeAttack", -1971037654);
        setIntField(term53221, term53221.getClass(), "headphone", -1001929512);
        setIntField(term53221, term53221.getClass(), "playerLevel", 1783875922);
        setIntField(term53221, term53221.getClass(), "successTap", -1504060723);
        setIntField(term53221, term53221.getClass(), "successExTap", 1458290326);
        setIntField(term53221, term53221.getClass(), "successSlideHold", 1025606001);
        setIntField(term53221, term53221.getClass(), "successAir", -1227561158);
        setIntField(term53221, term53221.getClass(), "successFlick", -1853440273);
        setIntField(term53221, term53221.getClass(), "successSkill", 1884281846);
        setIntField(term53221, term53221.getClass(), "successTapTimbre", -1779176468);
        setIntField(term53221, term53221.getClass(), "privacy", -790563662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatching", argTypes, term53221, args);
    }

};


