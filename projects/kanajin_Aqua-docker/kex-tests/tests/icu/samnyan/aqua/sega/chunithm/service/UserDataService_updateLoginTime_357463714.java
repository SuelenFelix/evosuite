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

public class UserDataService_updateLoginTime_357463714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921;

    public UserDataService_updateLoginTime_357463714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term925 = new Long(-8400487765614892086L);
        term921 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term923 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term944 = newInstance(Class.forName("java.time.LocalTime"));
        Object term949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term954 = newInstance(Class.forName("java.time.LocalTime"));
        Object term971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term976 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1037 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1080 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1085 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1131 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term921, term921.getClass(), "id", -4920224193275732920L);
        setLongField(term923, term923.getClass(), "id", 8428634514691209827L);
        setField(term923, term923.getClass(), "extId", term925);
        setField(term923, term923.getClass(), "luid", "AijpHYOFuy");
        setIntField(term940, term940.getClass(), "year", 2012);
        setShortField(term940, term940.getClass(), "month", (short) 2);
        setShortField(term940, term940.getClass(), "day", (short) 19);
        setField(term939, term939.getClass(), "date", term940);
        setByteField(term944, term944.getClass(), "hour", (byte) 8);
        setByteField(term944, term944.getClass(), "minute", (byte) 4);
        setByteField(term944, term944.getClass(), "second", (byte) 43);
        setIntField(term944, term944.getClass(), "nano", 114930008);
        setField(term939, term939.getClass(), "time", term944);
        setField(term923, term923.getClass(), "registerTime", term939);
        setIntField(term950, term950.getClass(), "year", 2017);
        setShortField(term950, term950.getClass(), "month", (short) 6);
        setShortField(term950, term950.getClass(), "day", (short) 8);
        setField(term949, term949.getClass(), "date", term950);
        setByteField(term954, term954.getClass(), "hour", (byte) 0);
        setByteField(term954, term954.getClass(), "minute", (byte) 18);
        setByteField(term954, term954.getClass(), "second", (byte) 55);
        setIntField(term954, term954.getClass(), "nano", 680586717);
        setField(term949, term949.getClass(), "time", term954);
        setField(term923, term923.getClass(), "accessTime", term949);
        setField(term921, term921.getClass(), "card", term923);
        setField(term921, term921.getClass(), "userName", "SbAoxhfrkn");
        setIntField(term972, term972.getClass(), "year", 2015);
        setShortField(term972, term972.getClass(), "month", (short) 9);
        setShortField(term972, term972.getClass(), "day", (short) 16);
        setField(term971, term971.getClass(), "date", term972);
        setByteField(term976, term976.getClass(), "hour", (byte) 6);
        setByteField(term976, term976.getClass(), "minute", (byte) 19);
        setByteField(term976, term976.getClass(), "second", (byte) 42);
        setIntField(term976, term976.getClass(), "nano", 630084975);
        setField(term971, term971.getClass(), "time", term976);
        setField(term921, term921.getClass(), "lastLoginDate", term971);
        setBooleanField(term921, term921.getClass(), "isWebJoin", true);
        setField(term921, term921.getClass(), "webLimitDate", "kuTXqwMtDB");
        setIntField(term921, term921.getClass(), "level", -602026508);
        setIntField(term921, term921.getClass(), "reincarnationNum", -157887805);
        setField(term921, term921.getClass(), "exp", "Ghbwtircqb");
        setLongField(term921, term921.getClass(), "point", -2585684163342970173L);
        setLongField(term921, term921.getClass(), "totalPoint", 8059786003080744426L);
        setIntField(term921, term921.getClass(), "playCount", 1876565163);
        setIntField(term921, term921.getClass(), "multiPlayCount", -817164822);
        setIntField(term921, term921.getClass(), "multiWinCount", -1016503459);
        setIntField(term921, term921.getClass(), "requestResCount", -1968847291);
        setIntField(term921, term921.getClass(), "acceptResCount", 579005622);
        setIntField(term921, term921.getClass(), "successResCount", -14890619);
        setIntField(term921, term921.getClass(), "playerRating", 1632125673);
        setIntField(term921, term921.getClass(), "highestRating", 454281060);
        setIntField(term921, term921.getClass(), "nameplateId", -1786399638);
        setIntField(term921, term921.getClass(), "frameId", 2055867847);
        setIntField(term921, term921.getClass(), "characterId", -1048298087);
        setIntField(term921, term921.getClass(), "trophyId", 292681826);
        setIntField(term921, term921.getClass(), "playedTutorialBit", 458147407);
        setIntField(term921, term921.getClass(), "firstTutorialCancelNum", -184153539);
        setIntField(term921, term921.getClass(), "masterTutorialCancelNum", 493620644);
        setIntField(term921, term921.getClass(), "totalRepertoireCount", 1328271830);
        setIntField(term921, term921.getClass(), "totalMapNum", 1596070772);
        setLongField(term921, term921.getClass(), "totalHiScore", -4365849114644724155L);
        setLongField(term921, term921.getClass(), "totalBasicHighScore", 2486810210675247493L);
        setLongField(term921, term921.getClass(), "totalAdvancedHighScore", 7009926388951271268L);
        setLongField(term921, term921.getClass(), "totalExpertHighScore", -7672528020740371001L);
        setLongField(term921, term921.getClass(), "totalMasterHighScore", -4502405999831680926L);
        setIntField(term1033, term1033.getClass(), "year", 2029);
        setShortField(term1033, term1033.getClass(), "month", (short) 6);
        setShortField(term1033, term1033.getClass(), "day", (short) 23);
        setField(term1032, term1032.getClass(), "date", term1033);
        setByteField(term1037, term1037.getClass(), "hour", (byte) 21);
        setByteField(term1037, term1037.getClass(), "minute", (byte) 55);
        setByteField(term1037, term1037.getClass(), "second", (byte) 27);
        setIntField(term1037, term1037.getClass(), "nano", 66889274);
        setField(term1032, term1032.getClass(), "time", term1037);
        setField(term921, term921.getClass(), "eventWatchedDate", term1032);
        setIntField(term921, term921.getClass(), "friendCount", 97029295);
        setBooleanField(term921, term921.getClass(), "isMaimai", true);
        setField(term921, term921.getClass(), "firstGameId", "xrwlQZdwCp");
        setField(term921, term921.getClass(), "firstRomVersion", "IDCWpPLRkE");
        setField(term921, term921.getClass(), "firstDataVersion", "nyiiPDVjAc");
        setIntField(term1081, term1081.getClass(), "year", 2017);
        setShortField(term1081, term1081.getClass(), "month", (short) 3);
        setShortField(term1081, term1081.getClass(), "day", (short) 5);
        setField(term1080, term1080.getClass(), "date", term1081);
        setByteField(term1085, term1085.getClass(), "hour", (byte) 20);
        setByteField(term1085, term1085.getClass(), "minute", (byte) 34);
        setByteField(term1085, term1085.getClass(), "second", (byte) 55);
        setIntField(term1085, term1085.getClass(), "nano", 78024496);
        setField(term1080, term1080.getClass(), "time", term1085);
        setField(term921, term921.getClass(), "firstPlayDate", term1080);
        setField(term921, term921.getClass(), "lastGameId", "aKnKipADSo");
        setField(term921, term921.getClass(), "lastRomVersion", "wSQxaModmm");
        setField(term921, term921.getClass(), "lastDataVersion", "UlajhuVLaP");
        setIntField(term1127, term1127.getClass(), "year", 2020);
        setShortField(term1127, term1127.getClass(), "month", (short) 7);
        setShortField(term1127, term1127.getClass(), "day", (short) 24);
        setField(term1126, term1126.getClass(), "date", term1127);
        setByteField(term1131, term1131.getClass(), "hour", (byte) 0);
        setByteField(term1131, term1131.getClass(), "minute", (byte) 59);
        setByteField(term1131, term1131.getClass(), "second", (byte) 56);
        setIntField(term1131, term1131.getClass(), "nano", 320219201);
        setField(term1126, term1126.getClass(), "time", term1131);
        setField(term921, term921.getClass(), "lastPlayDate", term1126);
        setIntField(term921, term921.getClass(), "lastPlaceId", -1371869594);
        setField(term921, term921.getClass(), "lastPlaceName", "gGSMzuGICf");
        setField(term921, term921.getClass(), "lastRegionId", "hxCBltsObl");
        setField(term921, term921.getClass(), "lastRegionName", "BndsHwAFMv");
        setField(term921, term921.getClass(), "lastAllNetId", "GzFkzHGYFt");
        setField(term921, term921.getClass(), "lastClientId", "tShwQLRGNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserDataService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term921;
        callMethod(klass, "updateLoginTime", argTypes, null, args);
    }

};


