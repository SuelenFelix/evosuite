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

public class UserData_getCard_9688991441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;

    public UserData_getCard_9688991441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term269 = new Long(6375119433582206027L);
        term265 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term267 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term294 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term265, term265.getClass(), "id", -8257434502486459194L);
        setLongField(term267, term267.getClass(), "id", -8400487765614892086L);
        setField(term267, term267.getClass(), "extId", term269);
        setField(term267, term267.getClass(), "luid", "RMFIsYGgne");
        setIntField(term284, term284.getClass(), "year", 2015);
        setShortField(term284, term284.getClass(), "month", (short) 9);
        setShortField(term284, term284.getClass(), "day", (short) 19);
        setField(term283, term283.getClass(), "date", term284);
        setByteField(term288, term288.getClass(), "hour", (byte) 9);
        setByteField(term288, term288.getClass(), "minute", (byte) 4);
        setByteField(term288, term288.getClass(), "second", (byte) 10);
        setIntField(term288, term288.getClass(), "nano", 401765865);
        setField(term283, term283.getClass(), "time", term288);
        setField(term267, term267.getClass(), "registerTime", term283);
        setIntField(term294, term294.getClass(), "year", 2015);
        setShortField(term294, term294.getClass(), "month", (short) 4);
        setShortField(term294, term294.getClass(), "day", (short) 14);
        setField(term293, term293.getClass(), "date", term294);
        setByteField(term298, term298.getClass(), "hour", (byte) 18);
        setByteField(term298, term298.getClass(), "minute", (byte) 24);
        setByteField(term298, term298.getClass(), "second", (byte) 32);
        setIntField(term298, term298.getClass(), "nano", 369233818);
        setField(term293, term293.getClass(), "time", term298);
        setField(term267, term267.getClass(), "accessTime", term293);
        setField(term265, term265.getClass(), "card", term267);
        setIntField(term265, term265.getClass(), "lastDataVersion", 1962444399);
        setField(term265, term265.getClass(), "userName", "NRdvgJlhkX");
        setIntField(term265, term265.getClass(), "point", 767834723);
        setIntField(term265, term265.getClass(), "totalPoint", -602026508);
        setIntField(term265, term265.getClass(), "iconId", -157887805);
        setIntField(term265, term265.getClass(), "nameplateId", 1876565163);
        setIntField(term265, term265.getClass(), "frameId", -817164822);
        setIntField(term265, term265.getClass(), "trophyId", -1016503459);
        setIntField(term265, term265.getClass(), "playCount", -1968847291);
        setIntField(term265, term265.getClass(), "playVsCount", 579005622);
        setIntField(term265, term265.getClass(), "playSyncCount", -14890619);
        setIntField(term265, term265.getClass(), "winCount", 1632125673);
        setIntField(term265, term265.getClass(), "helpCount", 454281060);
        setIntField(term265, term265.getClass(), "comboCount", -1786399638);
        setIntField(term265, term265.getClass(), "feverCount", 2055867847);
        setIntField(term265, term265.getClass(), "totalHiScore", -1048298087);
        setIntField(term265, term265.getClass(), "totalEasyHighScore", 292681826);
        setIntField(term265, term265.getClass(), "totalBasicHighScore", 458147407);
        setIntField(term265, term265.getClass(), "totalAdvancedHighScore", -184153539);
        setIntField(term265, term265.getClass(), "totalExpertHighScore", 493620644);
        setIntField(term265, term265.getClass(), "totalMasterHighScore", 1328271830);
        setIntField(term265, term265.getClass(), "totalReMasterHighScore", 1596070772);
        setIntField(term265, term265.getClass(), "totalHighSync", 97029295);
        setIntField(term265, term265.getClass(), "totalEasySync", -1371869594);
        setIntField(term265, term265.getClass(), "totalBasicSync", -2095575670);
        setIntField(term265, term265.getClass(), "totalAdvancedSync", 1225272962);
        setIntField(term265, term265.getClass(), "totalExpertSync", 1324040357);
        setIntField(term265, term265.getClass(), "totalMasterSync", -1588772968);
        setIntField(term265, term265.getClass(), "totalReMasterSync", -93135961);
        setIntField(term265, term265.getClass(), "playerRating", -112921587);
        setIntField(term265, term265.getClass(), "highestRating", 933028652);
        setIntField(term265, term265.getClass(), "rankAuthTailId", 287287233);
        setField(term265, term265.getClass(), "eventWatchedDate", "uuaPigETmJ");
        setField(term265, term265.getClass(), "webLimitDate", "MxlszYVzRf");
        setIntField(term265, term265.getClass(), "challengeTrackPhase", 962840079);
        setIntField(term265, term265.getClass(), "firstPlayBits", 1540719661);
        setField(term265, term265.getClass(), "lastPlayDate", "LQFpaHEwXR");
        setIntField(term265, term265.getClass(), "lastPlaceId", 1265463001);
        setField(term265, term265.getClass(), "lastPlaceName", "oVcInYnLWB");
        setIntField(term265, term265.getClass(), "lastRegionId", 335112684);
        setField(term265, term265.getClass(), "lastRegionName", "aJlieCFVtF");
        setField(term265, term265.getClass(), "lastClientId", "ZiaGIbnzTs");
        setField(term265, term265.getClass(), "lastCountryCode", "tbcdzjIfER");
        setIntField(term265, term265.getClass(), "eventPoint", 1551099402);
        setIntField(term265, term265.getClass(), "totalLv", -2027534003);
        setIntField(term265, term265.getClass(), "lastLoginBonusDay", 1063420942);
        setIntField(term265, term265.getClass(), "lastSurvivalBonusDay", 1375330971);
        setIntField(term265, term265.getClass(), "loginBonusLv", -478195677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCard", argTypes, term265, args);
    }

};


