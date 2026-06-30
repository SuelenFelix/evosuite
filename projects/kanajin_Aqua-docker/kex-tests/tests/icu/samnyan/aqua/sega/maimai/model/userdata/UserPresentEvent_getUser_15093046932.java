package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserPresentEvent_getUser_15093046932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97173;

    public UserPresentEvent_getUser_15093046932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term97179 = new Long(-8890284990655172580L);
        term97173 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term97175 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term97177 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term97193 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97194 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97198 = newInstance(Class.forName("java.time.LocalTime"));
        Object term97203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97208 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term97173, term97173.getClass(), "id", 8819168165968601827L);
        setLongField(term97175, term97175.getClass(), "id", -5212780037221633520L);
        setLongField(term97177, term97177.getClass(), "id", -1622196407723421321L);
        setField(term97177, term97177.getClass(), "extId", term97179);
        setField(term97177, term97177.getClass(), "luid", "QYNTEJcWIQ");
        setIntField(term97194, term97194.getClass(), "year", 2022);
        setShortField(term97194, term97194.getClass(), "month", (short) 4);
        setShortField(term97194, term97194.getClass(), "day", (short) 26);
        setField(term97193, term97193.getClass(), "date", term97194);
        setByteField(term97198, term97198.getClass(), "hour", (byte) 4);
        setByteField(term97198, term97198.getClass(), "minute", (byte) 26);
        setByteField(term97198, term97198.getClass(), "second", (byte) 22);
        setIntField(term97198, term97198.getClass(), "nano", 390695663);
        setField(term97193, term97193.getClass(), "time", term97198);
        setField(term97177, term97177.getClass(), "registerTime", term97193);
        setIntField(term97204, term97204.getClass(), "year", 2019);
        setShortField(term97204, term97204.getClass(), "month", (short) 10);
        setShortField(term97204, term97204.getClass(), "day", (short) 7);
        setField(term97203, term97203.getClass(), "date", term97204);
        setByteField(term97208, term97208.getClass(), "hour", (byte) 17);
        setByteField(term97208, term97208.getClass(), "minute", (byte) 16);
        setByteField(term97208, term97208.getClass(), "second", (byte) 55);
        setIntField(term97208, term97208.getClass(), "nano", 967207750);
        setField(term97203, term97203.getClass(), "time", term97208);
        setField(term97177, term97177.getClass(), "accessTime", term97203);
        setField(term97175, term97175.getClass(), "card", term97177);
        setIntField(term97175, term97175.getClass(), "lastDataVersion", 2119087446);
        setField(term97175, term97175.getClass(), "userName", "SbdSVclvuX");
        setIntField(term97175, term97175.getClass(), "point", -14672184);
        setIntField(term97175, term97175.getClass(), "totalPoint", -1230971844);
        setIntField(term97175, term97175.getClass(), "iconId", 1597389967);
        setIntField(term97175, term97175.getClass(), "nameplateId", -1597870129);
        setIntField(term97175, term97175.getClass(), "frameId", -225312817);
        setIntField(term97175, term97175.getClass(), "trophyId", -1260130532);
        setIntField(term97175, term97175.getClass(), "playCount", 1087742967);
        setIntField(term97175, term97175.getClass(), "playVsCount", -627819349);
        setIntField(term97175, term97175.getClass(), "playSyncCount", 800478138);
        setIntField(term97175, term97175.getClass(), "winCount", -1710282313);
        setIntField(term97175, term97175.getClass(), "helpCount", 206796423);
        setIntField(term97175, term97175.getClass(), "comboCount", 1775312686);
        setIntField(term97175, term97175.getClass(), "feverCount", 260588054);
        setIntField(term97175, term97175.getClass(), "totalHiScore", -1349711909);
        setIntField(term97175, term97175.getClass(), "totalEasyHighScore", -1813258003);
        setIntField(term97175, term97175.getClass(), "totalBasicHighScore", -2049220956);
        setIntField(term97175, term97175.getClass(), "totalAdvancedHighScore", -274830075);
        setIntField(term97175, term97175.getClass(), "totalExpertHighScore", 1931556045);
        setIntField(term97175, term97175.getClass(), "totalMasterHighScore", 1036137976);
        setIntField(term97175, term97175.getClass(), "totalReMasterHighScore", 1761376146);
        setIntField(term97175, term97175.getClass(), "totalHighSync", -671916958);
        setIntField(term97175, term97175.getClass(), "totalEasySync", 984646048);
        setIntField(term97175, term97175.getClass(), "totalBasicSync", 1422149722);
        setIntField(term97175, term97175.getClass(), "totalAdvancedSync", -1131910097);
        setIntField(term97175, term97175.getClass(), "totalExpertSync", 52885289);
        setIntField(term97175, term97175.getClass(), "totalMasterSync", -1419678518);
        setIntField(term97175, term97175.getClass(), "totalReMasterSync", 1338186927);
        setIntField(term97175, term97175.getClass(), "playerRating", -1576982510);
        setIntField(term97175, term97175.getClass(), "highestRating", -1877758186);
        setIntField(term97175, term97175.getClass(), "rankAuthTailId", -830140684);
        setField(term97175, term97175.getClass(), "eventWatchedDate", "QpoSxHFuJh");
        setField(term97175, term97175.getClass(), "webLimitDate", "GLAJgnHQMo");
        setIntField(term97175, term97175.getClass(), "challengeTrackPhase", 685127614);
        setIntField(term97175, term97175.getClass(), "firstPlayBits", 1063250731);
        setField(term97175, term97175.getClass(), "lastPlayDate", "nDzlNeexNi");
        setIntField(term97175, term97175.getClass(), "lastPlaceId", 1679311499);
        setField(term97175, term97175.getClass(), "lastPlaceName", "XhILAYdtGS");
        setIntField(term97175, term97175.getClass(), "lastRegionId", 627147024);
        setField(term97175, term97175.getClass(), "lastRegionName", "ZRWORAfStn");
        setField(term97175, term97175.getClass(), "lastClientId", "loCxNBoGfW");
        setField(term97175, term97175.getClass(), "lastCountryCode", "PGVYUjJrZh");
        setIntField(term97175, term97175.getClass(), "eventPoint", 347016445);
        setIntField(term97175, term97175.getClass(), "totalLv", 479588343);
        setIntField(term97175, term97175.getClass(), "lastLoginBonusDay", -534693706);
        setIntField(term97175, term97175.getClass(), "lastSurvivalBonusDay", -319549520);
        setIntField(term97175, term97175.getClass(), "loginBonusLv", -2731686);
        setField(term97173, term97173.getClass(), "user", term97175);
        setIntField(term97173, term97173.getClass(), "presentEventId", -743128849);
        setIntField(term97173, term97173.getClass(), "point", 2106293234);
        setIntField(term97173, term97173.getClass(), "presentCount", -1923952746);
        setIntField(term97173, term97173.getClass(), "rate", -148556232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term97173, args);
    }

};


