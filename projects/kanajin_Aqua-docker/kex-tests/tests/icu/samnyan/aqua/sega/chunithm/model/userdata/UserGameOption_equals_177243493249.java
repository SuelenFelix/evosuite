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

public class UserGameOption_equals_177243493249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71243;
     Object term71543;

    public UserGameOption_equals_177243493249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term71249 = new Long(-6432617521836576658L);
        term71243 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term71245 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term71247 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term71263 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71264 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71268 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71278 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71295 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71296 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71300 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71361 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71409 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71450 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71451 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71455 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term71243, term71243.getClass(), "id", 852818663192057236L);
        setLongField(term71245, term71245.getClass(), "id", -4175022778768613863L);
        setLongField(term71247, term71247.getClass(), "id", -4902671035184844892L);
        setField(term71247, term71247.getClass(), "extId", term71249);
        setField(term71247, term71247.getClass(), "luid", "PxinRhWgwT");
        setIntField(term71264, term71264.getClass(), "year", 2017);
        setShortField(term71264, term71264.getClass(), "month", (short) 8);
        setShortField(term71264, term71264.getClass(), "day", (short) 13);
        setField(term71263, term71263.getClass(), "date", term71264);
        setByteField(term71268, term71268.getClass(), "hour", (byte) 3);
        setByteField(term71268, term71268.getClass(), "minute", (byte) 9);
        setByteField(term71268, term71268.getClass(), "second", (byte) 24);
        setIntField(term71268, term71268.getClass(), "nano", 692710591);
        setField(term71263, term71263.getClass(), "time", term71268);
        setField(term71247, term71247.getClass(), "registerTime", term71263);
        setIntField(term71274, term71274.getClass(), "year", 2019);
        setShortField(term71274, term71274.getClass(), "month", (short) 6);
        setShortField(term71274, term71274.getClass(), "day", (short) 13);
        setField(term71273, term71273.getClass(), "date", term71274);
        setByteField(term71278, term71278.getClass(), "hour", (byte) 22);
        setByteField(term71278, term71278.getClass(), "minute", (byte) 53);
        setByteField(term71278, term71278.getClass(), "second", (byte) 1);
        setIntField(term71278, term71278.getClass(), "nano", 411931015);
        setField(term71273, term71273.getClass(), "time", term71278);
        setField(term71247, term71247.getClass(), "accessTime", term71273);
        setField(term71245, term71245.getClass(), "card", term71247);
        setField(term71245, term71245.getClass(), "userName", "pZcEKUNIXL");
        setIntField(term71296, term71296.getClass(), "year", 2012);
        setShortField(term71296, term71296.getClass(), "month", (short) 3);
        setShortField(term71296, term71296.getClass(), "day", (short) 6);
        setField(term71295, term71295.getClass(), "date", term71296);
        setByteField(term71300, term71300.getClass(), "hour", (byte) 8);
        setByteField(term71300, term71300.getClass(), "minute", (byte) 53);
        setByteField(term71300, term71300.getClass(), "second", (byte) 27);
        setIntField(term71300, term71300.getClass(), "nano", 49638302);
        setField(term71295, term71295.getClass(), "time", term71300);
        setField(term71245, term71245.getClass(), "lastLoginDate", term71295);
        setBooleanField(term71245, term71245.getClass(), "isWebJoin", true);
        setField(term71245, term71245.getClass(), "webLimitDate", "QbRtvZIDtW");
        setIntField(term71245, term71245.getClass(), "level", 1032926922);
        setIntField(term71245, term71245.getClass(), "reincarnationNum", -478839397);
        setField(term71245, term71245.getClass(), "exp", "fbsmDvjMqr");
        setLongField(term71245, term71245.getClass(), "point", -9006928175378855684L);
        setLongField(term71245, term71245.getClass(), "totalPoint", 4672743577102213082L);
        setIntField(term71245, term71245.getClass(), "playCount", -266762167);
        setIntField(term71245, term71245.getClass(), "multiPlayCount", -1341806138);
        setIntField(term71245, term71245.getClass(), "multiWinCount", 684728176);
        setIntField(term71245, term71245.getClass(), "requestResCount", 2089342829);
        setIntField(term71245, term71245.getClass(), "acceptResCount", 1201220971);
        setIntField(term71245, term71245.getClass(), "successResCount", -811460564);
        setIntField(term71245, term71245.getClass(), "playerRating", 1527746173);
        setIntField(term71245, term71245.getClass(), "highestRating", -1236801752);
        setIntField(term71245, term71245.getClass(), "nameplateId", -1407542097);
        setIntField(term71245, term71245.getClass(), "frameId", 844756084);
        setIntField(term71245, term71245.getClass(), "characterId", -1078424855);
        setIntField(term71245, term71245.getClass(), "trophyId", -17867996);
        setIntField(term71245, term71245.getClass(), "playedTutorialBit", -586625757);
        setIntField(term71245, term71245.getClass(), "firstTutorialCancelNum", -111956576);
        setIntField(term71245, term71245.getClass(), "masterTutorialCancelNum", 746489478);
        setIntField(term71245, term71245.getClass(), "totalRepertoireCount", 620249855);
        setIntField(term71245, term71245.getClass(), "totalMapNum", -1978063697);
        setLongField(term71245, term71245.getClass(), "totalHiScore", -359180515829782685L);
        setLongField(term71245, term71245.getClass(), "totalBasicHighScore", 9051152709789005898L);
        setLongField(term71245, term71245.getClass(), "totalAdvancedHighScore", 7523325429211619652L);
        setLongField(term71245, term71245.getClass(), "totalExpertHighScore", 2129332791275186868L);
        setLongField(term71245, term71245.getClass(), "totalMasterHighScore", 5292512705125717689L);
        setIntField(term71357, term71357.getClass(), "year", 2026);
        setShortField(term71357, term71357.getClass(), "month", (short) 5);
        setShortField(term71357, term71357.getClass(), "day", (short) 4);
        setField(term71356, term71356.getClass(), "date", term71357);
        setByteField(term71361, term71361.getClass(), "hour", (byte) 4);
        setByteField(term71361, term71361.getClass(), "minute", (byte) 39);
        setByteField(term71361, term71361.getClass(), "second", (byte) 57);
        setIntField(term71361, term71361.getClass(), "nano", 807455541);
        setField(term71356, term71356.getClass(), "time", term71361);
        setField(term71245, term71245.getClass(), "eventWatchedDate", term71356);
        setIntField(term71245, term71245.getClass(), "friendCount", -1375837847);
        setBooleanField(term71245, term71245.getClass(), "isMaimai", false);
        setField(term71245, term71245.getClass(), "firstGameId", "tycssGWZvU");
        setField(term71245, term71245.getClass(), "firstRomVersion", "jcvrILwbgt");
        setField(term71245, term71245.getClass(), "firstDataVersion", "AphrAHzPMC");
        setIntField(term71405, term71405.getClass(), "year", 2021);
        setShortField(term71405, term71405.getClass(), "month", (short) 4);
        setShortField(term71405, term71405.getClass(), "day", (short) 17);
        setField(term71404, term71404.getClass(), "date", term71405);
        setByteField(term71409, term71409.getClass(), "hour", (byte) 22);
        setByteField(term71409, term71409.getClass(), "minute", (byte) 34);
        setByteField(term71409, term71409.getClass(), "second", (byte) 19);
        setIntField(term71409, term71409.getClass(), "nano", 565497804);
        setField(term71404, term71404.getClass(), "time", term71409);
        setField(term71245, term71245.getClass(), "firstPlayDate", term71404);
        setField(term71245, term71245.getClass(), "lastGameId", "iwismCnYjB");
        setField(term71245, term71245.getClass(), "lastRomVersion", "GerBZdiruT");
        setField(term71245, term71245.getClass(), "lastDataVersion", "VzkPDPPGQl");
        setIntField(term71451, term71451.getClass(), "year", 2019);
        setShortField(term71451, term71451.getClass(), "month", (short) 11);
        setShortField(term71451, term71451.getClass(), "day", (short) 26);
        setField(term71450, term71450.getClass(), "date", term71451);
        setByteField(term71455, term71455.getClass(), "hour", (byte) 21);
        setByteField(term71455, term71455.getClass(), "minute", (byte) 16);
        setByteField(term71455, term71455.getClass(), "second", (byte) 42);
        setIntField(term71455, term71455.getClass(), "nano", 559995047);
        setField(term71450, term71450.getClass(), "time", term71455);
        setField(term71245, term71245.getClass(), "lastPlayDate", term71450);
        setIntField(term71245, term71245.getClass(), "lastPlaceId", 591972229);
        setField(term71245, term71245.getClass(), "lastPlaceName", "iojOXjfZFr");
        setField(term71245, term71245.getClass(), "lastRegionId", "yyrkuIYJKj");
        setField(term71245, term71245.getClass(), "lastRegionName", "reGIMbnrGF");
        setField(term71245, term71245.getClass(), "lastAllNetId", "yquSngBHqd");
        setField(term71245, term71245.getClass(), "lastClientId", "ZSdaJkZZPm");
        setField(term71243, term71243.getClass(), "user", term71245);
        setIntField(term71243, term71243.getClass(), "bgInfo", 1509332180);
        setIntField(term71243, term71243.getClass(), "fieldColor", 1537664818);
        setIntField(term71243, term71243.getClass(), "guideSound", -1542814057);
        setIntField(term71243, term71243.getClass(), "soundEffect", -813013442);
        setIntField(term71243, term71243.getClass(), "guideLine", 129913260);
        setIntField(term71243, term71243.getClass(), "speed", 1161032682);
        setIntField(term71243, term71243.getClass(), "optionSet", 345139347);
        setIntField(term71243, term71243.getClass(), "matching", 972415791);
        setIntField(term71243, term71243.getClass(), "judgePos", -263062220);
        setIntField(term71243, term71243.getClass(), "rating", -814910184);
        setIntField(term71243, term71243.getClass(), "judgeJustice", -82425798);
        setIntField(term71243, term71243.getClass(), "judgeAttack", 12949829);
        setIntField(term71243, term71243.getClass(), "headphone", 169106608);
        setIntField(term71243, term71243.getClass(), "playerLevel", 735667683);
        setIntField(term71243, term71243.getClass(), "successTap", -2099694093);
        setIntField(term71243, term71243.getClass(), "successExTap", -1230860198);
        setIntField(term71243, term71243.getClass(), "successSlideHold", -756895441);
        setIntField(term71243, term71243.getClass(), "successAir", -415493508);
        setIntField(term71243, term71243.getClass(), "successFlick", -2039940861);
        setIntField(term71243, term71243.getClass(), "successSkill", 1657238527);
        setIntField(term71243, term71243.getClass(), "successTapTimbre", -1118052096);
        setIntField(term71243, term71243.getClass(), "privacy", 789771906);
        term71543 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71543;
        callMethod(klass, "equals", argTypes, term71243, args);
    }

};


