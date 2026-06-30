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

public class UserGameOptionService_getByUser_10786010391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7232;

    public UserGameOptionService_getByUser_10786010391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7236 = new Long(-4502405999831680926L);
        term7232 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term7234 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term7250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7255 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7260 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7261 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7265 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7287 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7343 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7344 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7348 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7391 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7392 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7396 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7442 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term7232, term7232.getClass(), "id", 6906379511067694917L);
        setLongField(term7234, term7234.getClass(), "id", -9204303423581447271L);
        setField(term7234, term7234.getClass(), "extId", term7236);
        setField(term7234, term7234.getClass(), "luid", "oKwCDqywym");
        setIntField(term7251, term7251.getClass(), "year", 2025);
        setShortField(term7251, term7251.getClass(), "month", (short) 10);
        setShortField(term7251, term7251.getClass(), "day", (short) 30);
        setField(term7250, term7250.getClass(), "date", term7251);
        setByteField(term7255, term7255.getClass(), "hour", (byte) 1);
        setByteField(term7255, term7255.getClass(), "minute", (byte) 4);
        setByteField(term7255, term7255.getClass(), "second", (byte) 18);
        setIntField(term7255, term7255.getClass(), "nano", 717716253);
        setField(term7250, term7250.getClass(), "time", term7255);
        setField(term7234, term7234.getClass(), "registerTime", term7250);
        setIntField(term7261, term7261.getClass(), "year", 2019);
        setShortField(term7261, term7261.getClass(), "month", (short) 7);
        setShortField(term7261, term7261.getClass(), "day", (short) 4);
        setField(term7260, term7260.getClass(), "date", term7261);
        setByteField(term7265, term7265.getClass(), "hour", (byte) 19);
        setByteField(term7265, term7265.getClass(), "minute", (byte) 20);
        setByteField(term7265, term7265.getClass(), "second", (byte) 59);
        setIntField(term7265, term7265.getClass(), "nano", 246784352);
        setField(term7260, term7260.getClass(), "time", term7265);
        setField(term7234, term7234.getClass(), "accessTime", term7260);
        setField(term7232, term7232.getClass(), "card", term7234);
        setField(term7232, term7232.getClass(), "userName", "zjZYTddemL");
        setIntField(term7283, term7283.getClass(), "year", 2023);
        setShortField(term7283, term7283.getClass(), "month", (short) 7);
        setShortField(term7283, term7283.getClass(), "day", (short) 1);
        setField(term7282, term7282.getClass(), "date", term7283);
        setByteField(term7287, term7287.getClass(), "hour", (byte) 4);
        setByteField(term7287, term7287.getClass(), "minute", (byte) 33);
        setByteField(term7287, term7287.getClass(), "second", (byte) 9);
        setIntField(term7287, term7287.getClass(), "nano", 94365310);
        setField(term7282, term7282.getClass(), "time", term7287);
        setField(term7232, term7232.getClass(), "lastLoginDate", term7282);
        setBooleanField(term7232, term7232.getClass(), "isWebJoin", false);
        setField(term7232, term7232.getClass(), "webLimitDate", "QtrylgCLiF");
        setIntField(term7232, term7232.getClass(), "level", -2129828854);
        setIntField(term7232, term7232.getClass(), "reincarnationNum", -47438786);
        setField(term7232, term7232.getClass(), "exp", "orEuhCStGM");
        setLongField(term7232, term7232.getClass(), "point", 6248239231585852341L);
        setLongField(term7232, term7232.getClass(), "totalPoint", -88538481937688851L);
        setIntField(term7232, term7232.getClass(), "playCount", -1955400589);
        setIntField(term7232, term7232.getClass(), "multiPlayCount", 626179200);
        setIntField(term7232, term7232.getClass(), "multiWinCount", -511077684);
        setIntField(term7232, term7232.getClass(), "requestResCount", -711507760);
        setIntField(term7232, term7232.getClass(), "acceptResCount", 1053773809);
        setIntField(term7232, term7232.getClass(), "successResCount", 924127883);
        setIntField(term7232, term7232.getClass(), "playerRating", -751079123);
        setIntField(term7232, term7232.getClass(), "highestRating", -110837188);
        setIntField(term7232, term7232.getClass(), "nameplateId", -271094506);
        setIntField(term7232, term7232.getClass(), "frameId", 455632030);
        setIntField(term7232, term7232.getClass(), "characterId", -1632929393);
        setIntField(term7232, term7232.getClass(), "trophyId", -431440129);
        setIntField(term7232, term7232.getClass(), "playedTutorialBit", -763576148);
        setIntField(term7232, term7232.getClass(), "firstTutorialCancelNum", 1568948514);
        setIntField(term7232, term7232.getClass(), "masterTutorialCancelNum", -1511130237);
        setIntField(term7232, term7232.getClass(), "totalRepertoireCount", 452088587);
        setIntField(term7232, term7232.getClass(), "totalMapNum", -1630069454);
        setLongField(term7232, term7232.getClass(), "totalHiScore", 4069264186851023313L);
        setLongField(term7232, term7232.getClass(), "totalBasicHighScore", 5184635470881147510L);
        setLongField(term7232, term7232.getClass(), "totalAdvancedHighScore", 918397384129253729L);
        setLongField(term7232, term7232.getClass(), "totalExpertHighScore", -2187638136407967948L);
        setLongField(term7232, term7232.getClass(), "totalMasterHighScore", 8708846223293804408L);
        setIntField(term7344, term7344.getClass(), "year", 2013);
        setShortField(term7344, term7344.getClass(), "month", (short) 10);
        setShortField(term7344, term7344.getClass(), "day", (short) 7);
        setField(term7343, term7343.getClass(), "date", term7344);
        setByteField(term7348, term7348.getClass(), "hour", (byte) 12);
        setByteField(term7348, term7348.getClass(), "minute", (byte) 2);
        setByteField(term7348, term7348.getClass(), "second", (byte) 42);
        setIntField(term7348, term7348.getClass(), "nano", 202308437);
        setField(term7343, term7343.getClass(), "time", term7348);
        setField(term7232, term7232.getClass(), "eventWatchedDate", term7343);
        setIntField(term7232, term7232.getClass(), "friendCount", 1499735894);
        setBooleanField(term7232, term7232.getClass(), "isMaimai", false);
        setField(term7232, term7232.getClass(), "firstGameId", "HhEaSXWvrY");
        setField(term7232, term7232.getClass(), "firstRomVersion", "CVRGEomOth");
        setField(term7232, term7232.getClass(), "firstDataVersion", "vSeruUyNWX");
        setIntField(term7392, term7392.getClass(), "year", 2019);
        setShortField(term7392, term7392.getClass(), "month", (short) 12);
        setShortField(term7392, term7392.getClass(), "day", (short) 29);
        setField(term7391, term7391.getClass(), "date", term7392);
        setByteField(term7396, term7396.getClass(), "hour", (byte) 16);
        setByteField(term7396, term7396.getClass(), "minute", (byte) 10);
        setByteField(term7396, term7396.getClass(), "second", (byte) 1);
        setIntField(term7396, term7396.getClass(), "nano", 198559584);
        setField(term7391, term7391.getClass(), "time", term7396);
        setField(term7232, term7232.getClass(), "firstPlayDate", term7391);
        setField(term7232, term7232.getClass(), "lastGameId", "UkKvaeJfEC");
        setField(term7232, term7232.getClass(), "lastRomVersion", "WPxXsahPRq");
        setField(term7232, term7232.getClass(), "lastDataVersion", "IENRuqmwUU");
        setIntField(term7438, term7438.getClass(), "year", 2022);
        setShortField(term7438, term7438.getClass(), "month", (short) 5);
        setShortField(term7438, term7438.getClass(), "day", (short) 29);
        setField(term7437, term7437.getClass(), "date", term7438);
        setByteField(term7442, term7442.getClass(), "hour", (byte) 11);
        setByteField(term7442, term7442.getClass(), "minute", (byte) 41);
        setByteField(term7442, term7442.getClass(), "second", (byte) 43);
        setIntField(term7442, term7442.getClass(), "nano", 984890757);
        setField(term7437, term7437.getClass(), "time", term7442);
        setField(term7232, term7232.getClass(), "lastPlayDate", term7437);
        setIntField(term7232, term7232.getClass(), "lastPlaceId", 716486048);
        setField(term7232, term7232.getClass(), "lastPlaceName", "GsWxOwXvSu");
        setField(term7232, term7232.getClass(), "lastRegionId", "bKBSncrMEZ");
        setField(term7232, term7232.getClass(), "lastRegionName", "yeSXGqQExb");
        setField(term7232, term7232.getClass(), "lastAllNetId", "uXYcXVYJZM");
        setField(term7232, term7232.getClass(), "lastClientId", "BJhjdJUhkz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserGameOptionService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term7232;
        callMethod(klass, "getByUser", argTypes, null, args);
    }

};


