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

public class UserCourse_getParam1_64360358815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920328;

    public UserCourse_getParam1_64360358815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1920334 = new Long(-7393121202464432000L);
        term1920328 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1920330 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1920332 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1920348 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1920349 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1920353 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1920358 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1920359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1920363 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1920380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1920381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1920385 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1920441 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1920442 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1920446 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1920489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1920490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1920494 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1920535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1920536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1920540 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1920615 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1920616 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1920620 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1920328, term1920328.getClass(), "id", 6874127870519854872L);
        setLongField(term1920330, term1920330.getClass(), "id", 7381690333803434949L);
        setLongField(term1920332, term1920332.getClass(), "id", 84190265985054575L);
        setField(term1920332, term1920332.getClass(), "extId", term1920334);
        setField(term1920332, term1920332.getClass(), "luid", "wGBkTExsZZ");
        setIntField(term1920349, term1920349.getClass(), "year", 2021);
        setShortField(term1920349, term1920349.getClass(), "month", (short) 1);
        setShortField(term1920349, term1920349.getClass(), "day", (short) 15);
        setField(term1920348, term1920348.getClass(), "date", term1920349);
        setByteField(term1920353, term1920353.getClass(), "hour", (byte) 13);
        setByteField(term1920353, term1920353.getClass(), "minute", (byte) 39);
        setByteField(term1920353, term1920353.getClass(), "second", (byte) 39);
        setIntField(term1920353, term1920353.getClass(), "nano", 220701227);
        setField(term1920348, term1920348.getClass(), "time", term1920353);
        setField(term1920332, term1920332.getClass(), "registerTime", term1920348);
        setIntField(term1920359, term1920359.getClass(), "year", 2012);
        setShortField(term1920359, term1920359.getClass(), "month", (short) 8);
        setShortField(term1920359, term1920359.getClass(), "day", (short) 20);
        setField(term1920358, term1920358.getClass(), "date", term1920359);
        setByteField(term1920363, term1920363.getClass(), "hour", (byte) 14);
        setByteField(term1920363, term1920363.getClass(), "minute", (byte) 42);
        setByteField(term1920363, term1920363.getClass(), "second", (byte) 50);
        setIntField(term1920363, term1920363.getClass(), "nano", 574372927);
        setField(term1920358, term1920358.getClass(), "time", term1920363);
        setField(term1920332, term1920332.getClass(), "accessTime", term1920358);
        setField(term1920330, term1920330.getClass(), "card", term1920332);
        setField(term1920330, term1920330.getClass(), "userName", "pFcJquCWTj");
        setIntField(term1920381, term1920381.getClass(), "year", 2022);
        setShortField(term1920381, term1920381.getClass(), "month", (short) 7);
        setShortField(term1920381, term1920381.getClass(), "day", (short) 25);
        setField(term1920380, term1920380.getClass(), "date", term1920381);
        setByteField(term1920385, term1920385.getClass(), "hour", (byte) 2);
        setByteField(term1920385, term1920385.getClass(), "minute", (byte) 23);
        setByteField(term1920385, term1920385.getClass(), "second", (byte) 5);
        setIntField(term1920385, term1920385.getClass(), "nano", 784750756);
        setField(term1920380, term1920380.getClass(), "time", term1920385);
        setField(term1920330, term1920330.getClass(), "lastLoginDate", term1920380);
        setBooleanField(term1920330, term1920330.getClass(), "isWebJoin", true);
        setField(term1920330, term1920330.getClass(), "webLimitDate", "tDtsUJgKnF");
        setIntField(term1920330, term1920330.getClass(), "level", -1316572134);
        setIntField(term1920330, term1920330.getClass(), "reincarnationNum", 1777043357);
        setField(term1920330, term1920330.getClass(), "exp", "ownRtsCtrs");
        setLongField(term1920330, term1920330.getClass(), "point", 2970321205962381476L);
        setLongField(term1920330, term1920330.getClass(), "totalPoint", -3786161134546505383L);
        setIntField(term1920330, term1920330.getClass(), "playCount", 463366102);
        setIntField(term1920330, term1920330.getClass(), "multiPlayCount", 742360814);
        setIntField(term1920330, term1920330.getClass(), "multiWinCount", -1028940900);
        setIntField(term1920330, term1920330.getClass(), "requestResCount", 1692643681);
        setIntField(term1920330, term1920330.getClass(), "acceptResCount", -785042179);
        setIntField(term1920330, term1920330.getClass(), "successResCount", 1834032727);
        setIntField(term1920330, term1920330.getClass(), "playerRating", -1872563630);
        setIntField(term1920330, term1920330.getClass(), "highestRating", 341924951);
        setIntField(term1920330, term1920330.getClass(), "nameplateId", 1653000587);
        setIntField(term1920330, term1920330.getClass(), "frameId", 1243732278);
        setIntField(term1920330, term1920330.getClass(), "characterId", 1837426583);
        setIntField(term1920330, term1920330.getClass(), "trophyId", 1824989537);
        setIntField(term1920330, term1920330.getClass(), "playedTutorialBit", -416184177);
        setIntField(term1920330, term1920330.getClass(), "firstTutorialCancelNum", -1678323876);
        setIntField(term1920330, term1920330.getClass(), "masterTutorialCancelNum", 1717321994);
        setIntField(term1920330, term1920330.getClass(), "totalRepertoireCount", -1117683800);
        setIntField(term1920330, term1920330.getClass(), "totalMapNum", 684346173);
        setLongField(term1920330, term1920330.getClass(), "totalHiScore", 8154085920542841361L);
        setLongField(term1920330, term1920330.getClass(), "totalBasicHighScore", 2603839786324615289L);
        setLongField(term1920330, term1920330.getClass(), "totalAdvancedHighScore", -1018125452705800201L);
        setLongField(term1920330, term1920330.getClass(), "totalExpertHighScore", -5208556312697242428L);
        setLongField(term1920330, term1920330.getClass(), "totalMasterHighScore", 8378999215704487551L);
        setIntField(term1920442, term1920442.getClass(), "year", 2019);
        setShortField(term1920442, term1920442.getClass(), "month", (short) 10);
        setShortField(term1920442, term1920442.getClass(), "day", (short) 7);
        setField(term1920441, term1920441.getClass(), "date", term1920442);
        setByteField(term1920446, term1920446.getClass(), "hour", (byte) 1);
        setByteField(term1920446, term1920446.getClass(), "minute", (byte) 27);
        setByteField(term1920446, term1920446.getClass(), "second", (byte) 38);
        setIntField(term1920446, term1920446.getClass(), "nano", 796186196);
        setField(term1920441, term1920441.getClass(), "time", term1920446);
        setField(term1920330, term1920330.getClass(), "eventWatchedDate", term1920441);
        setIntField(term1920330, term1920330.getClass(), "friendCount", 1262168754);
        setBooleanField(term1920330, term1920330.getClass(), "isMaimai", true);
        setField(term1920330, term1920330.getClass(), "firstGameId", "ySZGsxlfxj");
        setField(term1920330, term1920330.getClass(), "firstRomVersion", "JTxaFfcwdZ");
        setField(term1920330, term1920330.getClass(), "firstDataVersion", "WDSdXMhhci");
        setIntField(term1920490, term1920490.getClass(), "year", 2022);
        setShortField(term1920490, term1920490.getClass(), "month", (short) 12);
        setShortField(term1920490, term1920490.getClass(), "day", (short) 18);
        setField(term1920489, term1920489.getClass(), "date", term1920490);
        setByteField(term1920494, term1920494.getClass(), "hour", (byte) 6);
        setByteField(term1920494, term1920494.getClass(), "minute", (byte) 53);
        setByteField(term1920494, term1920494.getClass(), "second", (byte) 52);
        setIntField(term1920494, term1920494.getClass(), "nano", 259435829);
        setField(term1920489, term1920489.getClass(), "time", term1920494);
        setField(term1920330, term1920330.getClass(), "firstPlayDate", term1920489);
        setField(term1920330, term1920330.getClass(), "lastGameId", "NfxzLTAzPw");
        setField(term1920330, term1920330.getClass(), "lastRomVersion", "vZdsiiCvEN");
        setField(term1920330, term1920330.getClass(), "lastDataVersion", "eKgJboPePq");
        setIntField(term1920536, term1920536.getClass(), "year", 2020);
        setShortField(term1920536, term1920536.getClass(), "month", (short) 5);
        setShortField(term1920536, term1920536.getClass(), "day", (short) 28);
        setField(term1920535, term1920535.getClass(), "date", term1920536);
        setByteField(term1920540, term1920540.getClass(), "hour", (byte) 14);
        setByteField(term1920540, term1920540.getClass(), "minute", (byte) 8);
        setByteField(term1920540, term1920540.getClass(), "second", (byte) 53);
        setIntField(term1920540, term1920540.getClass(), "nano", 390659155);
        setField(term1920535, term1920535.getClass(), "time", term1920540);
        setField(term1920330, term1920330.getClass(), "lastPlayDate", term1920535);
        setIntField(term1920330, term1920330.getClass(), "lastPlaceId", -2017489190);
        setField(term1920330, term1920330.getClass(), "lastPlaceName", "dGyNypTwsB");
        setField(term1920330, term1920330.getClass(), "lastRegionId", "yabNJFIAIB");
        setField(term1920330, term1920330.getClass(), "lastRegionName", "TlCkMNRWsM");
        setField(term1920330, term1920330.getClass(), "lastAllNetId", "uWaDHTAIpR");
        setField(term1920330, term1920330.getClass(), "lastClientId", "ABmImCMcUs");
        setField(term1920328, term1920328.getClass(), "user", term1920330);
        setIntField(term1920328, term1920328.getClass(), "courseId", -1043909241);
        setIntField(term1920328, term1920328.getClass(), "classId", 834500812);
        setIntField(term1920328, term1920328.getClass(), "playCount", 519973706);
        setIntField(term1920328, term1920328.getClass(), "scoreMax", -1982668733);
        setBooleanField(term1920328, term1920328.getClass(), "isFullCombo", true);
        setBooleanField(term1920328, term1920328.getClass(), "isAllJustice", false);
        setBooleanField(term1920328, term1920328.getClass(), "isSuccess", true);
        setIntField(term1920328, term1920328.getClass(), "scoreRank", 1076999370);
        setIntField(term1920328, term1920328.getClass(), "eventId", 1766799521);
        setIntField(term1920616, term1920616.getClass(), "year", 2020);
        setShortField(term1920616, term1920616.getClass(), "month", (short) 5);
        setShortField(term1920616, term1920616.getClass(), "day", (short) 14);
        setField(term1920615, term1920615.getClass(), "date", term1920616);
        setByteField(term1920620, term1920620.getClass(), "hour", (byte) 6);
        setByteField(term1920620, term1920620.getClass(), "minute", (byte) 18);
        setByteField(term1920620, term1920620.getClass(), "second", (byte) 24);
        setIntField(term1920620, term1920620.getClass(), "nano", 536809695);
        setField(term1920615, term1920615.getClass(), "time", term1920620);
        setField(term1920328, term1920328.getClass(), "lastPlayDate", term1920615);
        setIntField(term1920328, term1920328.getClass(), "param1", 1195694256);
        setIntField(term1920328, term1920328.getClass(), "param2", 1804713047);
        setIntField(term1920328, term1920328.getClass(), "param3", -2056509929);
        setIntField(term1920328, term1920328.getClass(), "param4", -597024083);
        setBooleanField(term1920328, term1920328.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam1", argTypes, term1920328, args);
    }

};


