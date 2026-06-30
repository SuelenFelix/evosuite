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

public class UserWebOption_getDispRate_9476520264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38341;

    public UserWebOption_getDispRate_9476520264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term38347 = new Long(-1214968196781083707L);
        term38341 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term38343 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term38345 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term38361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38366 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38376 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term38341, term38341.getClass(), "id", -5460517064177800852L);
        setLongField(term38343, term38343.getClass(), "id", -5242567610844514867L);
        setLongField(term38345, term38345.getClass(), "id", -2951854704066477061L);
        setField(term38345, term38345.getClass(), "extId", term38347);
        setField(term38345, term38345.getClass(), "luid", "kHxujKiCsr");
        setIntField(term38362, term38362.getClass(), "year", 2020);
        setShortField(term38362, term38362.getClass(), "month", (short) 10);
        setShortField(term38362, term38362.getClass(), "day", (short) 2);
        setField(term38361, term38361.getClass(), "date", term38362);
        setByteField(term38366, term38366.getClass(), "hour", (byte) 1);
        setByteField(term38366, term38366.getClass(), "minute", (byte) 41);
        setByteField(term38366, term38366.getClass(), "second", (byte) 48);
        setIntField(term38366, term38366.getClass(), "nano", 834720747);
        setField(term38361, term38361.getClass(), "time", term38366);
        setField(term38345, term38345.getClass(), "registerTime", term38361);
        setIntField(term38372, term38372.getClass(), "year", 2022);
        setShortField(term38372, term38372.getClass(), "month", (short) 3);
        setShortField(term38372, term38372.getClass(), "day", (short) 31);
        setField(term38371, term38371.getClass(), "date", term38372);
        setByteField(term38376, term38376.getClass(), "hour", (byte) 3);
        setByteField(term38376, term38376.getClass(), "minute", (byte) 43);
        setByteField(term38376, term38376.getClass(), "second", (byte) 28);
        setIntField(term38376, term38376.getClass(), "nano", 772790770);
        setField(term38371, term38371.getClass(), "time", term38376);
        setField(term38345, term38345.getClass(), "accessTime", term38371);
        setField(term38343, term38343.getClass(), "card", term38345);
        setIntField(term38343, term38343.getClass(), "lastDataVersion", -1224273100);
        setField(term38343, term38343.getClass(), "userName", "cseZveWowm");
        setIntField(term38343, term38343.getClass(), "point", -1428004018);
        setIntField(term38343, term38343.getClass(), "totalPoint", -296242927);
        setIntField(term38343, term38343.getClass(), "iconId", -1009003985);
        setIntField(term38343, term38343.getClass(), "nameplateId", 281679450);
        setIntField(term38343, term38343.getClass(), "frameId", -1773524930);
        setIntField(term38343, term38343.getClass(), "trophyId", 2053145277);
        setIntField(term38343, term38343.getClass(), "playCount", 472692952);
        setIntField(term38343, term38343.getClass(), "playVsCount", 140138500);
        setIntField(term38343, term38343.getClass(), "playSyncCount", -244584643);
        setIntField(term38343, term38343.getClass(), "winCount", 1557955716);
        setIntField(term38343, term38343.getClass(), "helpCount", -1628863633);
        setIntField(term38343, term38343.getClass(), "comboCount", -450265927);
        setIntField(term38343, term38343.getClass(), "feverCount", 914533606);
        setIntField(term38343, term38343.getClass(), "totalHiScore", 1857214977);
        setIntField(term38343, term38343.getClass(), "totalEasyHighScore", 756946672);
        setIntField(term38343, term38343.getClass(), "totalBasicHighScore", 1363323545);
        setIntField(term38343, term38343.getClass(), "totalAdvancedHighScore", -1090735178);
        setIntField(term38343, term38343.getClass(), "totalExpertHighScore", -651624649);
        setIntField(term38343, term38343.getClass(), "totalMasterHighScore", -888494532);
        setIntField(term38343, term38343.getClass(), "totalReMasterHighScore", 284122377);
        setIntField(term38343, term38343.getClass(), "totalHighSync", 1577003230);
        setIntField(term38343, term38343.getClass(), "totalEasySync", -2042495274);
        setIntField(term38343, term38343.getClass(), "totalBasicSync", 35579148);
        setIntField(term38343, term38343.getClass(), "totalAdvancedSync", -77377900);
        setIntField(term38343, term38343.getClass(), "totalExpertSync", 199979610);
        setIntField(term38343, term38343.getClass(), "totalMasterSync", -605796164);
        setIntField(term38343, term38343.getClass(), "totalReMasterSync", -931072478);
        setIntField(term38343, term38343.getClass(), "playerRating", 2032311568);
        setIntField(term38343, term38343.getClass(), "highestRating", 92598850);
        setIntField(term38343, term38343.getClass(), "rankAuthTailId", 1856498878);
        setField(term38343, term38343.getClass(), "eventWatchedDate", "idfslIPhgx");
        setField(term38343, term38343.getClass(), "webLimitDate", "HyFLOXeoDX");
        setIntField(term38343, term38343.getClass(), "challengeTrackPhase", 274237632);
        setIntField(term38343, term38343.getClass(), "firstPlayBits", -1033663489);
        setField(term38343, term38343.getClass(), "lastPlayDate", "crkNabVaWs");
        setIntField(term38343, term38343.getClass(), "lastPlaceId", 476488543);
        setField(term38343, term38343.getClass(), "lastPlaceName", "qBcAJgrABE");
        setIntField(term38343, term38343.getClass(), "lastRegionId", -1626915417);
        setField(term38343, term38343.getClass(), "lastRegionName", "JKdZuLFRwC");
        setField(term38343, term38343.getClass(), "lastClientId", "hfhLLoWnRU");
        setField(term38343, term38343.getClass(), "lastCountryCode", "RpofnOPYha");
        setIntField(term38343, term38343.getClass(), "eventPoint", 665442653);
        setIntField(term38343, term38343.getClass(), "totalLv", 803178808);
        setIntField(term38343, term38343.getClass(), "lastLoginBonusDay", 1767729920);
        setIntField(term38343, term38343.getClass(), "lastSurvivalBonusDay", -154656640);
        setIntField(term38343, term38343.getClass(), "loginBonusLv", 638814614);
        setField(term38341, term38341.getClass(), "user", term38343);
        setBooleanField(term38341, term38341.getClass(), "isNetMember", true);
        setIntField(term38341, term38341.getClass(), "dispRate", 832395207);
        setIntField(term38341, term38341.getClass(), "dispJudgeStyle", 1161114638);
        setIntField(term38341, term38341.getClass(), "dispRank", -1391162351);
        setIntField(term38341, term38341.getClass(), "dispHomeRanker", 863863650);
        setIntField(term38341, term38341.getClass(), "dispTotalLv", 326665488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispRate", argTypes, term38341, args);
    }

};


