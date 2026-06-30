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

public class UserGeneralData_setId_2724276045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109261;
     Object term109461;

    public UserGeneralData_setId_2724276045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term109267 = new Long(-5207216109884759743L);
        term109261 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData"));
        Object term109263 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term109265 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term109281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109286 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109296 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term109261, term109261.getClass(), "id", -971944383326299487L);
        setLongField(term109263, term109263.getClass(), "id", -5921915827741960720L);
        setLongField(term109265, term109265.getClass(), "id", -2480054455719869328L);
        setField(term109265, term109265.getClass(), "extId", term109267);
        setField(term109265, term109265.getClass(), "luid", "WPaMGzqiDs");
        setIntField(term109282, term109282.getClass(), "year", 2015);
        setShortField(term109282, term109282.getClass(), "month", (short) 5);
        setShortField(term109282, term109282.getClass(), "day", (short) 30);
        setField(term109281, term109281.getClass(), "date", term109282);
        setByteField(term109286, term109286.getClass(), "hour", (byte) 6);
        setByteField(term109286, term109286.getClass(), "minute", (byte) 20);
        setByteField(term109286, term109286.getClass(), "second", (byte) 29);
        setIntField(term109286, term109286.getClass(), "nano", 871322714);
        setField(term109281, term109281.getClass(), "time", term109286);
        setField(term109265, term109265.getClass(), "registerTime", term109281);
        setIntField(term109292, term109292.getClass(), "year", 2029);
        setShortField(term109292, term109292.getClass(), "month", (short) 9);
        setShortField(term109292, term109292.getClass(), "day", (short) 21);
        setField(term109291, term109291.getClass(), "date", term109292);
        setByteField(term109296, term109296.getClass(), "hour", (byte) 3);
        setByteField(term109296, term109296.getClass(), "minute", (byte) 36);
        setByteField(term109296, term109296.getClass(), "second", (byte) 11);
        setIntField(term109296, term109296.getClass(), "nano", 295278203);
        setField(term109291, term109291.getClass(), "time", term109296);
        setField(term109265, term109265.getClass(), "accessTime", term109291);
        setField(term109263, term109263.getClass(), "card", term109265);
        setIntField(term109263, term109263.getClass(), "lastDataVersion", 1138826954);
        setField(term109263, term109263.getClass(), "userName", "YtgjAWKCrQ");
        setIntField(term109263, term109263.getClass(), "point", -1295473270);
        setIntField(term109263, term109263.getClass(), "totalPoint", 1947181054);
        setIntField(term109263, term109263.getClass(), "iconId", -992799567);
        setIntField(term109263, term109263.getClass(), "nameplateId", 470314634);
        setIntField(term109263, term109263.getClass(), "frameId", 475400585);
        setIntField(term109263, term109263.getClass(), "trophyId", 1734754418);
        setIntField(term109263, term109263.getClass(), "playCount", -1839971770);
        setIntField(term109263, term109263.getClass(), "playVsCount", 935864551);
        setIntField(term109263, term109263.getClass(), "playSyncCount", 763770353);
        setIntField(term109263, term109263.getClass(), "winCount", -169966950);
        setIntField(term109263, term109263.getClass(), "helpCount", 788728016);
        setIntField(term109263, term109263.getClass(), "comboCount", 776647480);
        setIntField(term109263, term109263.getClass(), "feverCount", -1407923009);
        setIntField(term109263, term109263.getClass(), "totalHiScore", 810863217);
        setIntField(term109263, term109263.getClass(), "totalEasyHighScore", -1373220514);
        setIntField(term109263, term109263.getClass(), "totalBasicHighScore", -2033428879);
        setIntField(term109263, term109263.getClass(), "totalAdvancedHighScore", -668242366);
        setIntField(term109263, term109263.getClass(), "totalExpertHighScore", -1499983680);
        setIntField(term109263, term109263.getClass(), "totalMasterHighScore", 141123988);
        setIntField(term109263, term109263.getClass(), "totalReMasterHighScore", 1129353689);
        setIntField(term109263, term109263.getClass(), "totalHighSync", -1177311303);
        setIntField(term109263, term109263.getClass(), "totalEasySync", -192686342);
        setIntField(term109263, term109263.getClass(), "totalBasicSync", 543761654);
        setIntField(term109263, term109263.getClass(), "totalAdvancedSync", 1129145600);
        setIntField(term109263, term109263.getClass(), "totalExpertSync", -851007430);
        setIntField(term109263, term109263.getClass(), "totalMasterSync", 916784201);
        setIntField(term109263, term109263.getClass(), "totalReMasterSync", -1309260186);
        setIntField(term109263, term109263.getClass(), "playerRating", -2090023696);
        setIntField(term109263, term109263.getClass(), "highestRating", 461955028);
        setIntField(term109263, term109263.getClass(), "rankAuthTailId", 1118240740);
        setField(term109263, term109263.getClass(), "eventWatchedDate", "dVyyhFtNgV");
        setField(term109263, term109263.getClass(), "webLimitDate", "YBBxUpUwzX");
        setIntField(term109263, term109263.getClass(), "challengeTrackPhase", 2074140139);
        setIntField(term109263, term109263.getClass(), "firstPlayBits", 1960030370);
        setField(term109263, term109263.getClass(), "lastPlayDate", "ZujOTiubuf");
        setIntField(term109263, term109263.getClass(), "lastPlaceId", -1291981576);
        setField(term109263, term109263.getClass(), "lastPlaceName", "groJdWOLGJ");
        setIntField(term109263, term109263.getClass(), "lastRegionId", 1976016035);
        setField(term109263, term109263.getClass(), "lastRegionName", "zzCCDeuyOo");
        setField(term109263, term109263.getClass(), "lastClientId", "ixrDOyTkCB");
        setField(term109263, term109263.getClass(), "lastCountryCode", "PvrMbFoCJF");
        setIntField(term109263, term109263.getClass(), "eventPoint", -802507085);
        setIntField(term109263, term109263.getClass(), "totalLv", -1721657165);
        setIntField(term109263, term109263.getClass(), "lastLoginBonusDay", -679248876);
        setIntField(term109263, term109263.getClass(), "lastSurvivalBonusDay", -1201296940);
        setIntField(term109263, term109263.getClass(), "loginBonusLv", -1949732518);
        setField(term109261, term109261.getClass(), "user", term109263);
        setField(term109261, term109261.getClass(), "propertyKey", "UJOrVYoraU");
        setField(term109261, term109261.getClass(), "propertyValue", "iVSQwPmTaa");
        term109461 = new Long(8637380632328451251L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term109461;
        callMethod(klass, "setId", argTypes, term109261, args);
    }

};


