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

public class UserMapService_save_7058816370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1352;

    public UserMapService_save_7058816370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1358 = new Long(5270370404989704783L);
        term1352 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term1354 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1356 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1372 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1377 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1387 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1409 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1470 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1514 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1518 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1564 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1352, term1352.getClass(), "id", 1967728129628047933L);
        setLongField(term1354, term1354.getClass(), "id", 2120084523938730454L);
        setLongField(term1356, term1356.getClass(), "id", 6855071767938501807L);
        setField(term1356, term1356.getClass(), "extId", term1358);
        setField(term1356, term1356.getClass(), "luid", "LvtrsXUliU");
        setIntField(term1373, term1373.getClass(), "year", 2014);
        setShortField(term1373, term1373.getClass(), "month", (short) 7);
        setShortField(term1373, term1373.getClass(), "day", (short) 13);
        setField(term1372, term1372.getClass(), "date", term1373);
        setByteField(term1377, term1377.getClass(), "hour", (byte) 21);
        setByteField(term1377, term1377.getClass(), "minute", (byte) 46);
        setByteField(term1377, term1377.getClass(), "second", (byte) 0);
        setIntField(term1377, term1377.getClass(), "nano", 887884128);
        setField(term1372, term1372.getClass(), "time", term1377);
        setField(term1356, term1356.getClass(), "registerTime", term1372);
        setIntField(term1383, term1383.getClass(), "year", 2023);
        setShortField(term1383, term1383.getClass(), "month", (short) 3);
        setShortField(term1383, term1383.getClass(), "day", (short) 7);
        setField(term1382, term1382.getClass(), "date", term1383);
        setByteField(term1387, term1387.getClass(), "hour", (byte) 21);
        setByteField(term1387, term1387.getClass(), "minute", (byte) 15);
        setByteField(term1387, term1387.getClass(), "second", (byte) 43);
        setIntField(term1387, term1387.getClass(), "nano", 639721472);
        setField(term1382, term1382.getClass(), "time", term1387);
        setField(term1356, term1356.getClass(), "accessTime", term1382);
        setField(term1354, term1354.getClass(), "card", term1356);
        setField(term1354, term1354.getClass(), "userName", "xLbjWUgOIL");
        setIntField(term1405, term1405.getClass(), "year", 2015);
        setShortField(term1405, term1405.getClass(), "month", (short) 3);
        setShortField(term1405, term1405.getClass(), "day", (short) 10);
        setField(term1404, term1404.getClass(), "date", term1405);
        setByteField(term1409, term1409.getClass(), "hour", (byte) 23);
        setByteField(term1409, term1409.getClass(), "minute", (byte) 34);
        setByteField(term1409, term1409.getClass(), "second", (byte) 44);
        setIntField(term1409, term1409.getClass(), "nano", 587322824);
        setField(term1404, term1404.getClass(), "time", term1409);
        setField(term1354, term1354.getClass(), "lastLoginDate", term1404);
        setBooleanField(term1354, term1354.getClass(), "isWebJoin", true);
        setField(term1354, term1354.getClass(), "webLimitDate", "jDtqGUpnZN");
        setIntField(term1354, term1354.getClass(), "level", -2095575670);
        setIntField(term1354, term1354.getClass(), "reincarnationNum", 1225272962);
        setField(term1354, term1354.getClass(), "exp", "nGKItKLYNC");
        setLongField(term1354, term1354.getClass(), "point", -5892135042702373494L);
        setLongField(term1354, term1354.getClass(), "totalPoint", 5262507301787091109L);
        setIntField(term1354, term1354.getClass(), "playCount", 1324040357);
        setIntField(term1354, term1354.getClass(), "multiPlayCount", -1588772968);
        setIntField(term1354, term1354.getClass(), "multiWinCount", -93135961);
        setIntField(term1354, term1354.getClass(), "requestResCount", -112921587);
        setIntField(term1354, term1354.getClass(), "acceptResCount", 933028652);
        setIntField(term1354, term1354.getClass(), "successResCount", 287287233);
        setIntField(term1354, term1354.getClass(), "playerRating", 962840079);
        setIntField(term1354, term1354.getClass(), "highestRating", 1540719661);
        setIntField(term1354, term1354.getClass(), "nameplateId", 1265463001);
        setIntField(term1354, term1354.getClass(), "frameId", 335112684);
        setIntField(term1354, term1354.getClass(), "characterId", 1551099402);
        setIntField(term1354, term1354.getClass(), "trophyId", -2027534003);
        setIntField(term1354, term1354.getClass(), "playedTutorialBit", 1063420942);
        setIntField(term1354, term1354.getClass(), "firstTutorialCancelNum", 1375330971);
        setIntField(term1354, term1354.getClass(), "masterTutorialCancelNum", -478195677);
        setIntField(term1354, term1354.getClass(), "totalRepertoireCount", 972867650);
        setIntField(term1354, term1354.getClass(), "totalMapNum", 1655935355);
        setLongField(term1354, term1354.getClass(), "totalHiScore", -6823727938421990489L);
        setLongField(term1354, term1354.getClass(), "totalBasicHighScore", -484994522244390100L);
        setLongField(term1354, term1354.getClass(), "totalAdvancedHighScore", 1233889271256172047L);
        setLongField(term1354, term1354.getClass(), "totalExpertHighScore", 6617340557564669657L);
        setLongField(term1354, term1354.getClass(), "totalMasterHighScore", 1439298019805881866L);
        setIntField(term1466, term1466.getClass(), "year", 2027);
        setShortField(term1466, term1466.getClass(), "month", (short) 8);
        setShortField(term1466, term1466.getClass(), "day", (short) 26);
        setField(term1465, term1465.getClass(), "date", term1466);
        setByteField(term1470, term1470.getClass(), "hour", (byte) 5);
        setByteField(term1470, term1470.getClass(), "minute", (byte) 11);
        setByteField(term1470, term1470.getClass(), "second", (byte) 9);
        setIntField(term1470, term1470.getClass(), "nano", 219245092);
        setField(term1465, term1465.getClass(), "time", term1470);
        setField(term1354, term1354.getClass(), "eventWatchedDate", term1465);
        setIntField(term1354, term1354.getClass(), "friendCount", -481533957);
        setBooleanField(term1354, term1354.getClass(), "isMaimai", true);
        setField(term1354, term1354.getClass(), "firstGameId", "UiUYnPrcCi");
        setField(term1354, term1354.getClass(), "firstRomVersion", "UoYtihxVaS");
        setField(term1354, term1354.getClass(), "firstDataVersion", "JDswTTCZHV");
        setIntField(term1514, term1514.getClass(), "year", 2025);
        setShortField(term1514, term1514.getClass(), "month", (short) 3);
        setShortField(term1514, term1514.getClass(), "day", (short) 9);
        setField(term1513, term1513.getClass(), "date", term1514);
        setByteField(term1518, term1518.getClass(), "hour", (byte) 5);
        setByteField(term1518, term1518.getClass(), "minute", (byte) 49);
        setByteField(term1518, term1518.getClass(), "second", (byte) 12);
        setIntField(term1518, term1518.getClass(), "nano", 791695028);
        setField(term1513, term1513.getClass(), "time", term1518);
        setField(term1354, term1354.getClass(), "firstPlayDate", term1513);
        setField(term1354, term1354.getClass(), "lastGameId", "onpbIeEKoi");
        setField(term1354, term1354.getClass(), "lastRomVersion", "YRHGsAkhxb");
        setField(term1354, term1354.getClass(), "lastDataVersion", "ffYhPOzlUs");
        setIntField(term1560, term1560.getClass(), "year", 2023);
        setShortField(term1560, term1560.getClass(), "month", (short) 9);
        setShortField(term1560, term1560.getClass(), "day", (short) 23);
        setField(term1559, term1559.getClass(), "date", term1560);
        setByteField(term1564, term1564.getClass(), "hour", (byte) 12);
        setByteField(term1564, term1564.getClass(), "minute", (byte) 55);
        setByteField(term1564, term1564.getClass(), "second", (byte) 58);
        setIntField(term1564, term1564.getClass(), "nano", 159178396);
        setField(term1559, term1559.getClass(), "time", term1564);
        setField(term1354, term1354.getClass(), "lastPlayDate", term1559);
        setIntField(term1354, term1354.getClass(), "lastPlaceId", 1240914516);
        setField(term1354, term1354.getClass(), "lastPlaceName", "MLqYREekMl");
        setField(term1354, term1354.getClass(), "lastRegionId", "ytSBIKXogI");
        setField(term1354, term1354.getClass(), "lastRegionName", "nHXjMycHlU");
        setField(term1354, term1354.getClass(), "lastAllNetId", "ieCtQFdkii");
        setField(term1354, term1354.getClass(), "lastClientId", "dEnhdmILtU");
        setField(term1352, term1352.getClass(), "user", term1354);
        setIntField(term1352, term1352.getClass(), "mapId", -1465035361);
        setIntField(term1352, term1352.getClass(), "position", 1090617576);
        setBooleanField(term1352, term1352.getClass(), "isClear", false);
        setIntField(term1352, term1352.getClass(), "areaId", -1547384488);
        setIntField(term1352, term1352.getClass(), "routeNumber", 1442160736);
        setIntField(term1352, term1352.getClass(), "eventId", 1114000454);
        setIntField(term1352, term1352.getClass(), "rate", -556405712);
        setIntField(term1352, term1352.getClass(), "statusCount", -1772434990);
        setBooleanField(term1352, term1352.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserMapService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Object[] args = new Object[1];
        args[0] = term1352;
        callMethod(klass, "save", argTypes, null, args);
    }

};


