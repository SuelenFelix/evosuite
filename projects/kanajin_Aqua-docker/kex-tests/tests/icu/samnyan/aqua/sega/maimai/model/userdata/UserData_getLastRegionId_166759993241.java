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

public class UserData_getLastRegionId_166759993241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10825;

    public UserData_getLastRegionId_166759993241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10829 = new Long(-2068172595987555756L);
        term10825 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term10827 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term10843 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10844 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10848 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10853 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10854 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10858 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term10825, term10825.getClass(), "id", -1983291584002806658L);
        setLongField(term10827, term10827.getClass(), "id", 5946780097489996391L);
        setField(term10827, term10827.getClass(), "extId", term10829);
        setField(term10827, term10827.getClass(), "luid", "cSHGbqKqlN");
        setIntField(term10844, term10844.getClass(), "year", 2021);
        setShortField(term10844, term10844.getClass(), "month", (short) 3);
        setShortField(term10844, term10844.getClass(), "day", (short) 13);
        setField(term10843, term10843.getClass(), "date", term10844);
        setByteField(term10848, term10848.getClass(), "hour", (byte) 6);
        setByteField(term10848, term10848.getClass(), "minute", (byte) 25);
        setByteField(term10848, term10848.getClass(), "second", (byte) 42);
        setIntField(term10848, term10848.getClass(), "nano", 282924199);
        setField(term10843, term10843.getClass(), "time", term10848);
        setField(term10827, term10827.getClass(), "registerTime", term10843);
        setIntField(term10854, term10854.getClass(), "year", 2020);
        setShortField(term10854, term10854.getClass(), "month", (short) 10);
        setShortField(term10854, term10854.getClass(), "day", (short) 25);
        setField(term10853, term10853.getClass(), "date", term10854);
        setByteField(term10858, term10858.getClass(), "hour", (byte) 18);
        setByteField(term10858, term10858.getClass(), "minute", (byte) 22);
        setByteField(term10858, term10858.getClass(), "second", (byte) 30);
        setIntField(term10858, term10858.getClass(), "nano", 948592965);
        setField(term10853, term10853.getClass(), "time", term10858);
        setField(term10827, term10827.getClass(), "accessTime", term10853);
        setField(term10825, term10825.getClass(), "card", term10827);
        setIntField(term10825, term10825.getClass(), "lastDataVersion", -366198044);
        setField(term10825, term10825.getClass(), "userName", "pFAfANnxup");
        setIntField(term10825, term10825.getClass(), "point", -1350380769);
        setIntField(term10825, term10825.getClass(), "totalPoint", -1432215030);
        setIntField(term10825, term10825.getClass(), "iconId", 1233186320);
        setIntField(term10825, term10825.getClass(), "nameplateId", -1303269101);
        setIntField(term10825, term10825.getClass(), "frameId", 1435572720);
        setIntField(term10825, term10825.getClass(), "trophyId", 1437618365);
        setIntField(term10825, term10825.getClass(), "playCount", 1122535239);
        setIntField(term10825, term10825.getClass(), "playVsCount", 1158923260);
        setIntField(term10825, term10825.getClass(), "playSyncCount", 1633508772);
        setIntField(term10825, term10825.getClass(), "winCount", -545275970);
        setIntField(term10825, term10825.getClass(), "helpCount", 1355471365);
        setIntField(term10825, term10825.getClass(), "comboCount", -1746962742);
        setIntField(term10825, term10825.getClass(), "feverCount", -575810668);
        setIntField(term10825, term10825.getClass(), "totalHiScore", 256028547);
        setIntField(term10825, term10825.getClass(), "totalEasyHighScore", -750603024);
        setIntField(term10825, term10825.getClass(), "totalBasicHighScore", 1255234202);
        setIntField(term10825, term10825.getClass(), "totalAdvancedHighScore", -223786928);
        setIntField(term10825, term10825.getClass(), "totalExpertHighScore", 1703103733);
        setIntField(term10825, term10825.getClass(), "totalMasterHighScore", 1057562436);
        setIntField(term10825, term10825.getClass(), "totalReMasterHighScore", 646610000);
        setIntField(term10825, term10825.getClass(), "totalHighSync", 2003399396);
        setIntField(term10825, term10825.getClass(), "totalEasySync", 1223703911);
        setIntField(term10825, term10825.getClass(), "totalBasicSync", -1824905298);
        setIntField(term10825, term10825.getClass(), "totalAdvancedSync", -2062724184);
        setIntField(term10825, term10825.getClass(), "totalExpertSync", -716654499);
        setIntField(term10825, term10825.getClass(), "totalMasterSync", 1641117123);
        setIntField(term10825, term10825.getClass(), "totalReMasterSync", -1084408453);
        setIntField(term10825, term10825.getClass(), "playerRating", -1466822773);
        setIntField(term10825, term10825.getClass(), "highestRating", -230022261);
        setIntField(term10825, term10825.getClass(), "rankAuthTailId", 831967494);
        setField(term10825, term10825.getClass(), "eventWatchedDate", "FbSIUZyBXZ");
        setField(term10825, term10825.getClass(), "webLimitDate", "mhQDwIyrRi");
        setIntField(term10825, term10825.getClass(), "challengeTrackPhase", -1858635791);
        setIntField(term10825, term10825.getClass(), "firstPlayBits", 1919079331);
        setField(term10825, term10825.getClass(), "lastPlayDate", "HpZXWDPhlg");
        setIntField(term10825, term10825.getClass(), "lastPlaceId", 144872711);
        setField(term10825, term10825.getClass(), "lastPlaceName", "lBOokzEPfe");
        setIntField(term10825, term10825.getClass(), "lastRegionId", -720037395);
        setField(term10825, term10825.getClass(), "lastRegionName", "dtGZCsKXbW");
        setField(term10825, term10825.getClass(), "lastClientId", "bdyhHbDAmJ");
        setField(term10825, term10825.getClass(), "lastCountryCode", "BBXiTNHqGE");
        setIntField(term10825, term10825.getClass(), "eventPoint", 1232105469);
        setIntField(term10825, term10825.getClass(), "totalLv", -1547322575);
        setIntField(term10825, term10825.getClass(), "lastLoginBonusDay", -61444233);
        setIntField(term10825, term10825.getClass(), "lastSurvivalBonusDay", -400720912);
        setIntField(term10825, term10825.getClass(), "loginBonusLv", 1266192397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term10825, args);
    }

};


