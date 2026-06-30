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

public class UserData_getLastPlaceId_71413030539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10297;

    public UserData_getLastPlaceId_71413030539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10301 = new Long(5907001541142728739L);
        term10297 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term10299 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term10315 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10320 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10330 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term10297, term10297.getClass(), "id", 7862575738391801707L);
        setLongField(term10299, term10299.getClass(), "id", 50358265865610362L);
        setField(term10299, term10299.getClass(), "extId", term10301);
        setField(term10299, term10299.getClass(), "luid", "zsWKWiTFuo");
        setIntField(term10316, term10316.getClass(), "year", 2020);
        setShortField(term10316, term10316.getClass(), "month", (short) 8);
        setShortField(term10316, term10316.getClass(), "day", (short) 16);
        setField(term10315, term10315.getClass(), "date", term10316);
        setByteField(term10320, term10320.getClass(), "hour", (byte) 4);
        setByteField(term10320, term10320.getClass(), "minute", (byte) 37);
        setByteField(term10320, term10320.getClass(), "second", (byte) 19);
        setIntField(term10320, term10320.getClass(), "nano", 605410923);
        setField(term10315, term10315.getClass(), "time", term10320);
        setField(term10299, term10299.getClass(), "registerTime", term10315);
        setIntField(term10326, term10326.getClass(), "year", 2028);
        setShortField(term10326, term10326.getClass(), "month", (short) 5);
        setShortField(term10326, term10326.getClass(), "day", (short) 2);
        setField(term10325, term10325.getClass(), "date", term10326);
        setByteField(term10330, term10330.getClass(), "hour", (byte) 2);
        setByteField(term10330, term10330.getClass(), "minute", (byte) 59);
        setByteField(term10330, term10330.getClass(), "second", (byte) 30);
        setIntField(term10330, term10330.getClass(), "nano", 222274238);
        setField(term10325, term10325.getClass(), "time", term10330);
        setField(term10299, term10299.getClass(), "accessTime", term10325);
        setField(term10297, term10297.getClass(), "card", term10299);
        setIntField(term10297, term10297.getClass(), "lastDataVersion", 1086383182);
        setField(term10297, term10297.getClass(), "userName", "UPUbwyHQKN");
        setIntField(term10297, term10297.getClass(), "point", 1425319286);
        setIntField(term10297, term10297.getClass(), "totalPoint", 1729919228);
        setIntField(term10297, term10297.getClass(), "iconId", 872351195);
        setIntField(term10297, term10297.getClass(), "nameplateId", -1664328399);
        setIntField(term10297, term10297.getClass(), "frameId", 1422430512);
        setIntField(term10297, term10297.getClass(), "trophyId", 1796581482);
        setIntField(term10297, term10297.getClass(), "playCount", 1286440081);
        setIntField(term10297, term10297.getClass(), "playVsCount", -928538452);
        setIntField(term10297, term10297.getClass(), "playSyncCount", -1313207353);
        setIntField(term10297, term10297.getClass(), "winCount", 402612318);
        setIntField(term10297, term10297.getClass(), "helpCount", -1628481565);
        setIntField(term10297, term10297.getClass(), "comboCount", -217226756);
        setIntField(term10297, term10297.getClass(), "feverCount", 1608000247);
        setIntField(term10297, term10297.getClass(), "totalHiScore", 1354560887);
        setIntField(term10297, term10297.getClass(), "totalEasyHighScore", -749474542);
        setIntField(term10297, term10297.getClass(), "totalBasicHighScore", -47907780);
        setIntField(term10297, term10297.getClass(), "totalAdvancedHighScore", 1131462369);
        setIntField(term10297, term10297.getClass(), "totalExpertHighScore", -1161206731);
        setIntField(term10297, term10297.getClass(), "totalMasterHighScore", -992847709);
        setIntField(term10297, term10297.getClass(), "totalReMasterHighScore", 1125156671);
        setIntField(term10297, term10297.getClass(), "totalHighSync", 1203107925);
        setIntField(term10297, term10297.getClass(), "totalEasySync", 1825448944);
        setIntField(term10297, term10297.getClass(), "totalBasicSync", 1769496642);
        setIntField(term10297, term10297.getClass(), "totalAdvancedSync", -947460705);
        setIntField(term10297, term10297.getClass(), "totalExpertSync", -1435758764);
        setIntField(term10297, term10297.getClass(), "totalMasterSync", 752858379);
        setIntField(term10297, term10297.getClass(), "totalReMasterSync", -370819357);
        setIntField(term10297, term10297.getClass(), "playerRating", -71819242);
        setIntField(term10297, term10297.getClass(), "highestRating", 1268893136);
        setIntField(term10297, term10297.getClass(), "rankAuthTailId", -1472700822);
        setField(term10297, term10297.getClass(), "eventWatchedDate", "lgQkrXANyI");
        setField(term10297, term10297.getClass(), "webLimitDate", "MeTmRZXErV");
        setIntField(term10297, term10297.getClass(), "challengeTrackPhase", 1626670889);
        setIntField(term10297, term10297.getClass(), "firstPlayBits", -2117361140);
        setField(term10297, term10297.getClass(), "lastPlayDate", "jNxbVmoZgq");
        setIntField(term10297, term10297.getClass(), "lastPlaceId", 407708341);
        setField(term10297, term10297.getClass(), "lastPlaceName", "PvmBHIXaMY");
        setIntField(term10297, term10297.getClass(), "lastRegionId", -287519200);
        setField(term10297, term10297.getClass(), "lastRegionName", "hulYxtowxw");
        setField(term10297, term10297.getClass(), "lastClientId", "GNEmuHPNcU");
        setField(term10297, term10297.getClass(), "lastCountryCode", "IoSfuKDFRe");
        setIntField(term10297, term10297.getClass(), "eventPoint", -1490696181);
        setIntField(term10297, term10297.getClass(), "totalLv", 623717232);
        setIntField(term10297, term10297.getClass(), "lastLoginBonusDay", -1413291732);
        setIntField(term10297, term10297.getClass(), "lastSurvivalBonusDay", 203264365);
        setIntField(term10297, term10297.getClass(), "loginBonusLv", -1066281036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceId", argTypes, term10297, args);
    }

};


