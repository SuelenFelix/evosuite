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

public class UserCourse_getUser_10498496493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178931;

    public UserCourse_getUser_10498496493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term178937 = new Long(9214973322210954344L);
        term178931 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term178933 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term178935 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term178951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term178952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term178956 = newInstance(Class.forName("java.time.LocalTime"));
        Object term178961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term178962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term178966 = newInstance(Class.forName("java.time.LocalTime"));
        Object term178983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term178984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term178988 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179044 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179045 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179049 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179092 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179093 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179097 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179138 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179139 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179143 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179223 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term178931, term178931.getClass(), "id", -8161974836877108744L);
        setLongField(term178933, term178933.getClass(), "id", 2414751913272857198L);
        setLongField(term178935, term178935.getClass(), "id", 5631636010149656965L);
        setField(term178935, term178935.getClass(), "extId", term178937);
        setField(term178935, term178935.getClass(), "luid", "FMZNzLOxGT");
        setIntField(term178952, term178952.getClass(), "year", 2029);
        setShortField(term178952, term178952.getClass(), "month", (short) 4);
        setShortField(term178952, term178952.getClass(), "day", (short) 5);
        setField(term178951, term178951.getClass(), "date", term178952);
        setByteField(term178956, term178956.getClass(), "hour", (byte) 15);
        setByteField(term178956, term178956.getClass(), "minute", (byte) 51);
        setByteField(term178956, term178956.getClass(), "second", (byte) 36);
        setIntField(term178956, term178956.getClass(), "nano", 774030270);
        setField(term178951, term178951.getClass(), "time", term178956);
        setField(term178935, term178935.getClass(), "registerTime", term178951);
        setIntField(term178962, term178962.getClass(), "year", 2012);
        setShortField(term178962, term178962.getClass(), "month", (short) 2);
        setShortField(term178962, term178962.getClass(), "day", (short) 29);
        setField(term178961, term178961.getClass(), "date", term178962);
        setByteField(term178966, term178966.getClass(), "hour", (byte) 22);
        setByteField(term178966, term178966.getClass(), "minute", (byte) 14);
        setByteField(term178966, term178966.getClass(), "second", (byte) 39);
        setIntField(term178966, term178966.getClass(), "nano", 334271021);
        setField(term178961, term178961.getClass(), "time", term178966);
        setField(term178935, term178935.getClass(), "accessTime", term178961);
        setField(term178933, term178933.getClass(), "card", term178935);
        setField(term178933, term178933.getClass(), "userName", "bIZUmZXLHa");
        setIntField(term178984, term178984.getClass(), "year", 2015);
        setShortField(term178984, term178984.getClass(), "month", (short) 11);
        setShortField(term178984, term178984.getClass(), "day", (short) 17);
        setField(term178983, term178983.getClass(), "date", term178984);
        setByteField(term178988, term178988.getClass(), "hour", (byte) 19);
        setByteField(term178988, term178988.getClass(), "minute", (byte) 12);
        setByteField(term178988, term178988.getClass(), "second", (byte) 39);
        setIntField(term178988, term178988.getClass(), "nano", 718470186);
        setField(term178983, term178983.getClass(), "time", term178988);
        setField(term178933, term178933.getClass(), "lastLoginDate", term178983);
        setBooleanField(term178933, term178933.getClass(), "isWebJoin", true);
        setField(term178933, term178933.getClass(), "webLimitDate", "TEwHZNjLIs");
        setIntField(term178933, term178933.getClass(), "level", -1406782851);
        setIntField(term178933, term178933.getClass(), "reincarnationNum", 1353299927);
        setField(term178933, term178933.getClass(), "exp", "kRMGFXXrsP");
        setLongField(term178933, term178933.getClass(), "point", 9083023389109779559L);
        setLongField(term178933, term178933.getClass(), "totalPoint", 5259536683055374610L);
        setIntField(term178933, term178933.getClass(), "playCount", 545259984);
        setIntField(term178933, term178933.getClass(), "multiPlayCount", -795371078);
        setIntField(term178933, term178933.getClass(), "multiWinCount", -441521491);
        setIntField(term178933, term178933.getClass(), "requestResCount", 1603903916);
        setIntField(term178933, term178933.getClass(), "acceptResCount", -1285876400);
        setIntField(term178933, term178933.getClass(), "successResCount", -1903604663);
        setIntField(term178933, term178933.getClass(), "playerRating", 1210371629);
        setIntField(term178933, term178933.getClass(), "highestRating", 909735321);
        setIntField(term178933, term178933.getClass(), "nameplateId", -151853480);
        setIntField(term178933, term178933.getClass(), "frameId", -945363618);
        setIntField(term178933, term178933.getClass(), "characterId", 1670927534);
        setIntField(term178933, term178933.getClass(), "trophyId", 946393999);
        setIntField(term178933, term178933.getClass(), "playedTutorialBit", 254472233);
        setIntField(term178933, term178933.getClass(), "firstTutorialCancelNum", 972028226);
        setIntField(term178933, term178933.getClass(), "masterTutorialCancelNum", 1113134594);
        setIntField(term178933, term178933.getClass(), "totalRepertoireCount", 551145368);
        setIntField(term178933, term178933.getClass(), "totalMapNum", -589024624);
        setLongField(term178933, term178933.getClass(), "totalHiScore", -6261765077527362927L);
        setLongField(term178933, term178933.getClass(), "totalBasicHighScore", -5033229053418942258L);
        setLongField(term178933, term178933.getClass(), "totalAdvancedHighScore", 2634970689877661559L);
        setLongField(term178933, term178933.getClass(), "totalExpertHighScore", -299054155457724028L);
        setLongField(term178933, term178933.getClass(), "totalMasterHighScore", 6592361866954566506L);
        setIntField(term179045, term179045.getClass(), "year", 2018);
        setShortField(term179045, term179045.getClass(), "month", (short) 4);
        setShortField(term179045, term179045.getClass(), "day", (short) 4);
        setField(term179044, term179044.getClass(), "date", term179045);
        setByteField(term179049, term179049.getClass(), "hour", (byte) 16);
        setByteField(term179049, term179049.getClass(), "minute", (byte) 42);
        setByteField(term179049, term179049.getClass(), "second", (byte) 48);
        setIntField(term179049, term179049.getClass(), "nano", 910572550);
        setField(term179044, term179044.getClass(), "time", term179049);
        setField(term178933, term178933.getClass(), "eventWatchedDate", term179044);
        setIntField(term178933, term178933.getClass(), "friendCount", -248083088);
        setBooleanField(term178933, term178933.getClass(), "isMaimai", false);
        setField(term178933, term178933.getClass(), "firstGameId", "FuwXaCGDKr");
        setField(term178933, term178933.getClass(), "firstRomVersion", "nYbOYHyjHP");
        setField(term178933, term178933.getClass(), "firstDataVersion", "ANCcbJNtSR");
        setIntField(term179093, term179093.getClass(), "year", 2010);
        setShortField(term179093, term179093.getClass(), "month", (short) 11);
        setShortField(term179093, term179093.getClass(), "day", (short) 3);
        setField(term179092, term179092.getClass(), "date", term179093);
        setByteField(term179097, term179097.getClass(), "hour", (byte) 12);
        setByteField(term179097, term179097.getClass(), "minute", (byte) 40);
        setByteField(term179097, term179097.getClass(), "second", (byte) 53);
        setIntField(term179097, term179097.getClass(), "nano", 633368876);
        setField(term179092, term179092.getClass(), "time", term179097);
        setField(term178933, term178933.getClass(), "firstPlayDate", term179092);
        setField(term178933, term178933.getClass(), "lastGameId", "EXhULLeGjO");
        setField(term178933, term178933.getClass(), "lastRomVersion", "ipiLtEOSGh");
        setField(term178933, term178933.getClass(), "lastDataVersion", "mBJiiQCxaL");
        setIntField(term179139, term179139.getClass(), "year", 2023);
        setShortField(term179139, term179139.getClass(), "month", (short) 3);
        setShortField(term179139, term179139.getClass(), "day", (short) 23);
        setField(term179138, term179138.getClass(), "date", term179139);
        setByteField(term179143, term179143.getClass(), "hour", (byte) 1);
        setByteField(term179143, term179143.getClass(), "minute", (byte) 44);
        setByteField(term179143, term179143.getClass(), "second", (byte) 44);
        setIntField(term179143, term179143.getClass(), "nano", 201328127);
        setField(term179138, term179138.getClass(), "time", term179143);
        setField(term178933, term178933.getClass(), "lastPlayDate", term179138);
        setIntField(term178933, term178933.getClass(), "lastPlaceId", -1418231293);
        setField(term178933, term178933.getClass(), "lastPlaceName", "DsIfGQndOB");
        setField(term178933, term178933.getClass(), "lastRegionId", "bKVDCtrRgI");
        setField(term178933, term178933.getClass(), "lastRegionName", "ZbxzwEYXdm");
        setField(term178933, term178933.getClass(), "lastAllNetId", "kJPYWHclZM");
        setField(term178933, term178933.getClass(), "lastClientId", "azYtVoulhq");
        setField(term178931, term178931.getClass(), "user", term178933);
        setIntField(term178931, term178931.getClass(), "courseId", 464721379);
        setIntField(term178931, term178931.getClass(), "classId", -1679784341);
        setIntField(term178931, term178931.getClass(), "playCount", 545828052);
        setIntField(term178931, term178931.getClass(), "scoreMax", 1204794034);
        setBooleanField(term178931, term178931.getClass(), "isFullCombo", false);
        setBooleanField(term178931, term178931.getClass(), "isAllJustice", true);
        setBooleanField(term178931, term178931.getClass(), "isSuccess", false);
        setIntField(term178931, term178931.getClass(), "scoreRank", 908573728);
        setIntField(term178931, term178931.getClass(), "eventId", -1645726101);
        setIntField(term179219, term179219.getClass(), "year", 2025);
        setShortField(term179219, term179219.getClass(), "month", (short) 7);
        setShortField(term179219, term179219.getClass(), "day", (short) 8);
        setField(term179218, term179218.getClass(), "date", term179219);
        setByteField(term179223, term179223.getClass(), "hour", (byte) 6);
        setByteField(term179223, term179223.getClass(), "minute", (byte) 13);
        setByteField(term179223, term179223.getClass(), "second", (byte) 46);
        setIntField(term179223, term179223.getClass(), "nano", 626146989);
        setField(term179218, term179218.getClass(), "time", term179223);
        setField(term178931, term178931.getClass(), "lastPlayDate", term179218);
        setIntField(term178931, term178931.getClass(), "param1", 1696762677);
        setIntField(term178931, term178931.getClass(), "param2", -169034590);
        setIntField(term178931, term178931.getClass(), "param3", 615142414);
        setIntField(term178931, term178931.getClass(), "param4", 162127898);
        setBooleanField(term178931, term178931.getClass(), "isClear", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term178931, args);
    }

};


