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

public class UserGameOptionEx_getExt4_8944065086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312271;

    public UserGameOptionEx_getExt4_8944065086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term312277 = new Long(-4370635295110591519L);
        term312271 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term312273 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term312275 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term312291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312296 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312328 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312385 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312389 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312437 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312478 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312479 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312483 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term312271, term312271.getClass(), "id", -772135562955984228L);
        setLongField(term312273, term312273.getClass(), "id", -8435453295822372001L);
        setLongField(term312275, term312275.getClass(), "id", 4870926120312695851L);
        setField(term312275, term312275.getClass(), "extId", term312277);
        setField(term312275, term312275.getClass(), "luid", "xUMqyqCvcb");
        setIntField(term312292, term312292.getClass(), "year", 2021);
        setShortField(term312292, term312292.getClass(), "month", (short) 5);
        setShortField(term312292, term312292.getClass(), "day", (short) 5);
        setField(term312291, term312291.getClass(), "date", term312292);
        setByteField(term312296, term312296.getClass(), "hour", (byte) 10);
        setByteField(term312296, term312296.getClass(), "minute", (byte) 32);
        setByteField(term312296, term312296.getClass(), "second", (byte) 21);
        setIntField(term312296, term312296.getClass(), "nano", 18824336);
        setField(term312291, term312291.getClass(), "time", term312296);
        setField(term312275, term312275.getClass(), "registerTime", term312291);
        setIntField(term312302, term312302.getClass(), "year", 2010);
        setShortField(term312302, term312302.getClass(), "month", (short) 10);
        setShortField(term312302, term312302.getClass(), "day", (short) 4);
        setField(term312301, term312301.getClass(), "date", term312302);
        setByteField(term312306, term312306.getClass(), "hour", (byte) 17);
        setByteField(term312306, term312306.getClass(), "minute", (byte) 42);
        setByteField(term312306, term312306.getClass(), "second", (byte) 53);
        setIntField(term312306, term312306.getClass(), "nano", 658766003);
        setField(term312301, term312301.getClass(), "time", term312306);
        setField(term312275, term312275.getClass(), "accessTime", term312301);
        setField(term312273, term312273.getClass(), "card", term312275);
        setField(term312273, term312273.getClass(), "userName", "UQNPJMVgtC");
        setIntField(term312324, term312324.getClass(), "year", 2025);
        setShortField(term312324, term312324.getClass(), "month", (short) 4);
        setShortField(term312324, term312324.getClass(), "day", (short) 16);
        setField(term312323, term312323.getClass(), "date", term312324);
        setByteField(term312328, term312328.getClass(), "hour", (byte) 10);
        setByteField(term312328, term312328.getClass(), "minute", (byte) 57);
        setByteField(term312328, term312328.getClass(), "second", (byte) 30);
        setIntField(term312328, term312328.getClass(), "nano", 411087591);
        setField(term312323, term312323.getClass(), "time", term312328);
        setField(term312273, term312273.getClass(), "lastLoginDate", term312323);
        setBooleanField(term312273, term312273.getClass(), "isWebJoin", false);
        setField(term312273, term312273.getClass(), "webLimitDate", "YxqBgErhNo");
        setIntField(term312273, term312273.getClass(), "level", -914765958);
        setIntField(term312273, term312273.getClass(), "reincarnationNum", -1658583299);
        setField(term312273, term312273.getClass(), "exp", "WquZFpGWYY");
        setLongField(term312273, term312273.getClass(), "point", 5624875115325952335L);
        setLongField(term312273, term312273.getClass(), "totalPoint", -9080310106055827773L);
        setIntField(term312273, term312273.getClass(), "playCount", -1470316088);
        setIntField(term312273, term312273.getClass(), "multiPlayCount", 1649132902);
        setIntField(term312273, term312273.getClass(), "multiWinCount", -1640921587);
        setIntField(term312273, term312273.getClass(), "requestResCount", 354457503);
        setIntField(term312273, term312273.getClass(), "acceptResCount", -318555635);
        setIntField(term312273, term312273.getClass(), "successResCount", -992479651);
        setIntField(term312273, term312273.getClass(), "playerRating", -906890843);
        setIntField(term312273, term312273.getClass(), "highestRating", 2050265443);
        setIntField(term312273, term312273.getClass(), "nameplateId", -696653076);
        setIntField(term312273, term312273.getClass(), "frameId", -725167428);
        setIntField(term312273, term312273.getClass(), "characterId", 1868591980);
        setIntField(term312273, term312273.getClass(), "trophyId", 112121751);
        setIntField(term312273, term312273.getClass(), "playedTutorialBit", 311304856);
        setIntField(term312273, term312273.getClass(), "firstTutorialCancelNum", -1007674417);
        setIntField(term312273, term312273.getClass(), "masterTutorialCancelNum", 502633973);
        setIntField(term312273, term312273.getClass(), "totalRepertoireCount", 1851928682);
        setIntField(term312273, term312273.getClass(), "totalMapNum", 84669830);
        setLongField(term312273, term312273.getClass(), "totalHiScore", 7747202674379406098L);
        setLongField(term312273, term312273.getClass(), "totalBasicHighScore", -3120913720963099689L);
        setLongField(term312273, term312273.getClass(), "totalAdvancedHighScore", -4836831199613890387L);
        setLongField(term312273, term312273.getClass(), "totalExpertHighScore", -5985091787359828019L);
        setLongField(term312273, term312273.getClass(), "totalMasterHighScore", -1556371026742712412L);
        setIntField(term312385, term312385.getClass(), "year", 2026);
        setShortField(term312385, term312385.getClass(), "month", (short) 6);
        setShortField(term312385, term312385.getClass(), "day", (short) 2);
        setField(term312384, term312384.getClass(), "date", term312385);
        setByteField(term312389, term312389.getClass(), "hour", (byte) 11);
        setByteField(term312389, term312389.getClass(), "minute", (byte) 18);
        setByteField(term312389, term312389.getClass(), "second", (byte) 54);
        setIntField(term312389, term312389.getClass(), "nano", 50134712);
        setField(term312384, term312384.getClass(), "time", term312389);
        setField(term312273, term312273.getClass(), "eventWatchedDate", term312384);
        setIntField(term312273, term312273.getClass(), "friendCount", -1604812137);
        setBooleanField(term312273, term312273.getClass(), "isMaimai", true);
        setField(term312273, term312273.getClass(), "firstGameId", "DVdLunspbQ");
        setField(term312273, term312273.getClass(), "firstRomVersion", "OUQVWAHprD");
        setField(term312273, term312273.getClass(), "firstDataVersion", "ptFvDczffY");
        setIntField(term312433, term312433.getClass(), "year", 2021);
        setShortField(term312433, term312433.getClass(), "month", (short) 5);
        setShortField(term312433, term312433.getClass(), "day", (short) 10);
        setField(term312432, term312432.getClass(), "date", term312433);
        setByteField(term312437, term312437.getClass(), "hour", (byte) 16);
        setByteField(term312437, term312437.getClass(), "minute", (byte) 18);
        setByteField(term312437, term312437.getClass(), "second", (byte) 11);
        setIntField(term312437, term312437.getClass(), "nano", 268011810);
        setField(term312432, term312432.getClass(), "time", term312437);
        setField(term312273, term312273.getClass(), "firstPlayDate", term312432);
        setField(term312273, term312273.getClass(), "lastGameId", "yDXeFOuvlq");
        setField(term312273, term312273.getClass(), "lastRomVersion", "gvnDtiMlxS");
        setField(term312273, term312273.getClass(), "lastDataVersion", "UQbUgGUwXM");
        setIntField(term312479, term312479.getClass(), "year", 2017);
        setShortField(term312479, term312479.getClass(), "month", (short) 9);
        setShortField(term312479, term312479.getClass(), "day", (short) 18);
        setField(term312478, term312478.getClass(), "date", term312479);
        setByteField(term312483, term312483.getClass(), "hour", (byte) 6);
        setByteField(term312483, term312483.getClass(), "minute", (byte) 7);
        setByteField(term312483, term312483.getClass(), "second", (byte) 20);
        setIntField(term312483, term312483.getClass(), "nano", 759966889);
        setField(term312478, term312478.getClass(), "time", term312483);
        setField(term312273, term312273.getClass(), "lastPlayDate", term312478);
        setIntField(term312273, term312273.getClass(), "lastPlaceId", -331363457);
        setField(term312273, term312273.getClass(), "lastPlaceName", "IsNPwCcyyl");
        setField(term312273, term312273.getClass(), "lastRegionId", "zoWVYvefpE");
        setField(term312273, term312273.getClass(), "lastRegionName", "qxWXWoDENr");
        setField(term312273, term312273.getClass(), "lastAllNetId", "mEuPBmaYON");
        setField(term312273, term312273.getClass(), "lastClientId", "ObPGyohonw");
        setField(term312271, term312271.getClass(), "user", term312273);
        setIntField(term312271, term312271.getClass(), "ext1", -907753498);
        setIntField(term312271, term312271.getClass(), "ext2", 1382037583);
        setIntField(term312271, term312271.getClass(), "ext3", -136583713);
        setIntField(term312271, term312271.getClass(), "ext4", -1382689671);
        setIntField(term312271, term312271.getClass(), "ext5", -1253020131);
        setIntField(term312271, term312271.getClass(), "ext6", 524661722);
        setIntField(term312271, term312271.getClass(), "ext7", -621486703);
        setIntField(term312271, term312271.getClass(), "ext8", -1314223543);
        setIntField(term312271, term312271.getClass(), "ext9", -1895037790);
        setIntField(term312271, term312271.getClass(), "ext10", 1137637306);
        setIntField(term312271, term312271.getClass(), "ext11", 388048709);
        setIntField(term312271, term312271.getClass(), "ext12", 1263276616);
        setIntField(term312271, term312271.getClass(), "ext13", 515493691);
        setIntField(term312271, term312271.getClass(), "ext14", -112169260);
        setIntField(term312271, term312271.getClass(), "ext15", -783824870);
        setIntField(term312271, term312271.getClass(), "ext16", 1471462673);
        setIntField(term312271, term312271.getClass(), "ext17", -1511154732);
        setIntField(term312271, term312271.getClass(), "ext18", 214211140);
        setIntField(term312271, term312271.getClass(), "ext19", 159315913);
        setIntField(term312271, term312271.getClass(), "ext20", 963909115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt4", argTypes, term312271, args);
    }

};


