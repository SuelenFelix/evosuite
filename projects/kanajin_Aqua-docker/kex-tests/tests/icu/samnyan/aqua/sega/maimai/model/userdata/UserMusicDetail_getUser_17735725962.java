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

public class UserMusicDetail_getUser_17735725962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180469;

    public UserMusicDetail_getUser_17735725962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term180475 = new Long(2018084438165711668L);
        term180469 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term180471 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term180473 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term180489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180494 = newInstance(Class.forName("java.time.LocalTime"));
        Object term180499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180504 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term180469, term180469.getClass(), "id", 2771276802933392082L);
        setLongField(term180471, term180471.getClass(), "id", 9159382852866553531L);
        setLongField(term180473, term180473.getClass(), "id", 308309058288153545L);
        setField(term180473, term180473.getClass(), "extId", term180475);
        setField(term180473, term180473.getClass(), "luid", "oKzUOrAFFo");
        setIntField(term180490, term180490.getClass(), "year", 2025);
        setShortField(term180490, term180490.getClass(), "month", (short) 11);
        setShortField(term180490, term180490.getClass(), "day", (short) 3);
        setField(term180489, term180489.getClass(), "date", term180490);
        setByteField(term180494, term180494.getClass(), "hour", (byte) 17);
        setByteField(term180494, term180494.getClass(), "minute", (byte) 26);
        setByteField(term180494, term180494.getClass(), "second", (byte) 59);
        setIntField(term180494, term180494.getClass(), "nano", 407915348);
        setField(term180489, term180489.getClass(), "time", term180494);
        setField(term180473, term180473.getClass(), "registerTime", term180489);
        setIntField(term180500, term180500.getClass(), "year", 2029);
        setShortField(term180500, term180500.getClass(), "month", (short) 1);
        setShortField(term180500, term180500.getClass(), "day", (short) 21);
        setField(term180499, term180499.getClass(), "date", term180500);
        setByteField(term180504, term180504.getClass(), "hour", (byte) 6);
        setByteField(term180504, term180504.getClass(), "minute", (byte) 41);
        setByteField(term180504, term180504.getClass(), "second", (byte) 38);
        setIntField(term180504, term180504.getClass(), "nano", 30400186);
        setField(term180499, term180499.getClass(), "time", term180504);
        setField(term180473, term180473.getClass(), "accessTime", term180499);
        setField(term180471, term180471.getClass(), "card", term180473);
        setIntField(term180471, term180471.getClass(), "lastDataVersion", -1599386659);
        setField(term180471, term180471.getClass(), "userName", "cShhTkvRUF");
        setIntField(term180471, term180471.getClass(), "point", 991547499);
        setIntField(term180471, term180471.getClass(), "totalPoint", 1425276715);
        setIntField(term180471, term180471.getClass(), "iconId", 369505230);
        setIntField(term180471, term180471.getClass(), "nameplateId", 1996016254);
        setIntField(term180471, term180471.getClass(), "frameId", -7867264);
        setIntField(term180471, term180471.getClass(), "trophyId", -1909793085);
        setIntField(term180471, term180471.getClass(), "playCount", -960566966);
        setIntField(term180471, term180471.getClass(), "playVsCount", 1443956212);
        setIntField(term180471, term180471.getClass(), "playSyncCount", 291348140);
        setIntField(term180471, term180471.getClass(), "winCount", -2028613982);
        setIntField(term180471, term180471.getClass(), "helpCount", -1860440923);
        setIntField(term180471, term180471.getClass(), "comboCount", 222745107);
        setIntField(term180471, term180471.getClass(), "feverCount", -497278405);
        setIntField(term180471, term180471.getClass(), "totalHiScore", -1402893871);
        setIntField(term180471, term180471.getClass(), "totalEasyHighScore", -716636804);
        setIntField(term180471, term180471.getClass(), "totalBasicHighScore", 1638578151);
        setIntField(term180471, term180471.getClass(), "totalAdvancedHighScore", 1348253719);
        setIntField(term180471, term180471.getClass(), "totalExpertHighScore", -1208599271);
        setIntField(term180471, term180471.getClass(), "totalMasterHighScore", 313459654);
        setIntField(term180471, term180471.getClass(), "totalReMasterHighScore", -315069737);
        setIntField(term180471, term180471.getClass(), "totalHighSync", -1206274283);
        setIntField(term180471, term180471.getClass(), "totalEasySync", 1051720389);
        setIntField(term180471, term180471.getClass(), "totalBasicSync", -1473285556);
        setIntField(term180471, term180471.getClass(), "totalAdvancedSync", -1383863290);
        setIntField(term180471, term180471.getClass(), "totalExpertSync", -1696432757);
        setIntField(term180471, term180471.getClass(), "totalMasterSync", -1908136277);
        setIntField(term180471, term180471.getClass(), "totalReMasterSync", 2039405655);
        setIntField(term180471, term180471.getClass(), "playerRating", 1317732348);
        setIntField(term180471, term180471.getClass(), "highestRating", 1420550181);
        setIntField(term180471, term180471.getClass(), "rankAuthTailId", -113041811);
        setField(term180471, term180471.getClass(), "eventWatchedDate", "qgiseKtoqu");
        setField(term180471, term180471.getClass(), "webLimitDate", "FfGmyAKSaB");
        setIntField(term180471, term180471.getClass(), "challengeTrackPhase", -536431958);
        setIntField(term180471, term180471.getClass(), "firstPlayBits", 1366678149);
        setField(term180471, term180471.getClass(), "lastPlayDate", "icoPCGhgWH");
        setIntField(term180471, term180471.getClass(), "lastPlaceId", -457690632);
        setField(term180471, term180471.getClass(), "lastPlaceName", "CHQBuYSRSj");
        setIntField(term180471, term180471.getClass(), "lastRegionId", 139829756);
        setField(term180471, term180471.getClass(), "lastRegionName", "UyXrmrYEff");
        setField(term180471, term180471.getClass(), "lastClientId", "hKmKbZReWq");
        setField(term180471, term180471.getClass(), "lastCountryCode", "dVNQlaRjno");
        setIntField(term180471, term180471.getClass(), "eventPoint", -1627300942);
        setIntField(term180471, term180471.getClass(), "totalLv", -1503910695);
        setIntField(term180471, term180471.getClass(), "lastLoginBonusDay", 1261386199);
        setIntField(term180471, term180471.getClass(), "lastSurvivalBonusDay", -607535011);
        setIntField(term180471, term180471.getClass(), "loginBonusLv", 1182997243);
        setField(term180469, term180469.getClass(), "user", term180471);
        setIntField(term180469, term180469.getClass(), "musicId", -909000196);
        setIntField(term180469, term180469.getClass(), "level", 1521461477);
        setIntField(term180469, term180469.getClass(), "playCount", -1082438481);
        setIntField(term180469, term180469.getClass(), "scoreMax", 1576369126);
        setIntField(term180469, term180469.getClass(), "syncRateMax", 894498151);
        setBooleanField(term180469, term180469.getClass(), "isAllPerfect", false);
        setIntField(term180469, term180469.getClass(), "isAllPerfectPlus", -882317717);
        setIntField(term180469, term180469.getClass(), "fullCombo", 962600812);
        setIntField(term180469, term180469.getClass(), "maxFever", -1154337895);
        setIntField(term180469, term180469.getClass(), "achievement", 449695720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term180469, args);
    }

};


