package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGeneralDataService_getByUserAndKey_10291346711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10316;

    public UserGeneralDataService_getByUserAndKey_10291346711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10320 = new Long(-5892135042702373494L);
        term10316 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term10318 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term10334 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10335 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10339 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10349 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10371 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10432 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10480 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10526 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term10316, term10316.getClass(), "id", -3130003589475815807L);
        setLongField(term10318, term10318.getClass(), "id", -5344598381371854750L);
        setField(term10318, term10318.getClass(), "extId", term10320);
        setField(term10318, term10318.getClass(), "luid", "vqnBkkxoIa");
        setIntField(term10335, term10335.getClass(), "year", 2029);
        setShortField(term10335, term10335.getClass(), "month", (short) 3);
        setShortField(term10335, term10335.getClass(), "day", (short) 3);
        setField(term10334, term10334.getClass(), "date", term10335);
        setByteField(term10339, term10339.getClass(), "hour", (byte) 2);
        setByteField(term10339, term10339.getClass(), "minute", (byte) 29);
        setByteField(term10339, term10339.getClass(), "second", (byte) 54);
        setIntField(term10339, term10339.getClass(), "nano", 846675209);
        setField(term10334, term10334.getClass(), "time", term10339);
        setField(term10318, term10318.getClass(), "registerTime", term10334);
        setIntField(term10345, term10345.getClass(), "year", 2013);
        setShortField(term10345, term10345.getClass(), "month", (short) 1);
        setShortField(term10345, term10345.getClass(), "day", (short) 17);
        setField(term10344, term10344.getClass(), "date", term10345);
        setByteField(term10349, term10349.getClass(), "hour", (byte) 19);
        setByteField(term10349, term10349.getClass(), "minute", (byte) 49);
        setByteField(term10349, term10349.getClass(), "second", (byte) 53);
        setIntField(term10349, term10349.getClass(), "nano", 217542739);
        setField(term10344, term10344.getClass(), "time", term10349);
        setField(term10318, term10318.getClass(), "accessTime", term10344);
        setField(term10316, term10316.getClass(), "card", term10318);
        setField(term10316, term10316.getClass(), "userName", "bycpZjxXFn");
        setIntField(term10367, term10367.getClass(), "year", 2025);
        setShortField(term10367, term10367.getClass(), "month", (short) 8);
        setShortField(term10367, term10367.getClass(), "day", (short) 8);
        setField(term10366, term10366.getClass(), "date", term10367);
        setByteField(term10371, term10371.getClass(), "hour", (byte) 12);
        setByteField(term10371, term10371.getClass(), "minute", (byte) 29);
        setByteField(term10371, term10371.getClass(), "second", (byte) 36);
        setIntField(term10371, term10371.getClass(), "nano", 329488602);
        setField(term10366, term10366.getClass(), "time", term10371);
        setField(term10316, term10316.getClass(), "lastLoginDate", term10366);
        setBooleanField(term10316, term10316.getClass(), "isWebJoin", false);
        setField(term10316, term10316.getClass(), "webLimitDate", "jQWttOAiwL");
        setIntField(term10316, term10316.getClass(), "level", 722787672);
        setIntField(term10316, term10316.getClass(), "reincarnationNum", 2077491675);
        setField(term10316, term10316.getClass(), "exp", "DzKFxEuEEC");
        setLongField(term10316, term10316.getClass(), "point", -3718250311794019732L);
        setLongField(term10316, term10316.getClass(), "totalPoint", -5935517391653614345L);
        setIntField(term10316, term10316.getClass(), "playCount", -1728316609);
        setIntField(term10316, term10316.getClass(), "multiPlayCount", 47118909);
        setIntField(term10316, term10316.getClass(), "multiWinCount", -2093707412);
        setIntField(term10316, term10316.getClass(), "requestResCount", -680627153);
        setIntField(term10316, term10316.getClass(), "acceptResCount", 722519669);
        setIntField(term10316, term10316.getClass(), "successResCount", -40335961);
        setIntField(term10316, term10316.getClass(), "playerRating", 175343605);
        setIntField(term10316, term10316.getClass(), "highestRating", 1050853183);
        setIntField(term10316, term10316.getClass(), "nameplateId", 848428785);
        setIntField(term10316, term10316.getClass(), "frameId", -1984436481);
        setIntField(term10316, term10316.getClass(), "characterId", -407582855);
        setIntField(term10316, term10316.getClass(), "trophyId", 1190753616);
        setIntField(term10316, term10316.getClass(), "playedTutorialBit", -752378450);
        setIntField(term10316, term10316.getClass(), "firstTutorialCancelNum", 848907965);
        setIntField(term10316, term10316.getClass(), "masterTutorialCancelNum", 1865070548);
        setIntField(term10316, term10316.getClass(), "totalRepertoireCount", 1904515443);
        setIntField(term10316, term10316.getClass(), "totalMapNum", 1361126430);
        setLongField(term10316, term10316.getClass(), "totalHiScore", -6521561238735301071L);
        setLongField(term10316, term10316.getClass(), "totalBasicHighScore", -6609679920238945303L);
        setLongField(term10316, term10316.getClass(), "totalAdvancedHighScore", -7296330380944173376L);
        setLongField(term10316, term10316.getClass(), "totalExpertHighScore", -8890284990655172580L);
        setLongField(term10316, term10316.getClass(), "totalMasterHighScore", -5951743062322506095L);
        setIntField(term10428, term10428.getClass(), "year", 2024);
        setShortField(term10428, term10428.getClass(), "month", (short) 7);
        setShortField(term10428, term10428.getClass(), "day", (short) 29);
        setField(term10427, term10427.getClass(), "date", term10428);
        setByteField(term10432, term10432.getClass(), "hour", (byte) 19);
        setByteField(term10432, term10432.getClass(), "minute", (byte) 15);
        setByteField(term10432, term10432.getClass(), "second", (byte) 16);
        setIntField(term10432, term10432.getClass(), "nano", 554834199);
        setField(term10427, term10427.getClass(), "time", term10432);
        setField(term10316, term10316.getClass(), "eventWatchedDate", term10427);
        setIntField(term10316, term10316.getClass(), "friendCount", 1728588701);
        setBooleanField(term10316, term10316.getClass(), "isMaimai", false);
        setField(term10316, term10316.getClass(), "firstGameId", "CAMnvfDLJL");
        setField(term10316, term10316.getClass(), "firstRomVersion", "mfHtgSbdjD");
        setField(term10316, term10316.getClass(), "firstDataVersion", "cmuaUiHMVL");
        setIntField(term10476, term10476.getClass(), "year", 2018);
        setShortField(term10476, term10476.getClass(), "month", (short) 2);
        setShortField(term10476, term10476.getClass(), "day", (short) 13);
        setField(term10475, term10475.getClass(), "date", term10476);
        setByteField(term10480, term10480.getClass(), "hour", (byte) 15);
        setByteField(term10480, term10480.getClass(), "minute", (byte) 1);
        setByteField(term10480, term10480.getClass(), "second", (byte) 45);
        setIntField(term10480, term10480.getClass(), "nano", 380020898);
        setField(term10475, term10475.getClass(), "time", term10480);
        setField(term10316, term10316.getClass(), "firstPlayDate", term10475);
        setField(term10316, term10316.getClass(), "lastGameId", "xjoSGPWUgu");
        setField(term10316, term10316.getClass(), "lastRomVersion", "uzmqjnOUXu");
        setField(term10316, term10316.getClass(), "lastDataVersion", "xeyjTOCOJb");
        setIntField(term10522, term10522.getClass(), "year", 2022);
        setShortField(term10522, term10522.getClass(), "month", (short) 8);
        setShortField(term10522, term10522.getClass(), "day", (short) 30);
        setField(term10521, term10521.getClass(), "date", term10522);
        setByteField(term10526, term10526.getClass(), "hour", (byte) 3);
        setByteField(term10526, term10526.getClass(), "minute", (byte) 13);
        setByteField(term10526, term10526.getClass(), "second", (byte) 34);
        setIntField(term10526, term10526.getClass(), "nano", 69286341);
        setField(term10521, term10521.getClass(), "time", term10526);
        setField(term10316, term10316.getClass(), "lastPlayDate", term10521);
        setIntField(term10316, term10316.getClass(), "lastPlaceId", -355769268);
        setField(term10316, term10316.getClass(), "lastPlaceName", "DGRqjjdhzy");
        setField(term10316, term10316.getClass(), "lastRegionId", "lQFkjJUPAR");
        setField(term10316, term10316.getClass(), "lastRegionName", "BsuVlGUUjV");
        setField(term10316, term10316.getClass(), "lastAllNetId", "bHHjfDCntT");
        setField(term10316, term10316.getClass(), "lastClientId", "sEphiduvkv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserGeneralDataService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term10316;
        args[1] = "PbLgCSAHce";
        callMethod(klass, "getByUserAndKey", argTypes, null, args);
    }

};


