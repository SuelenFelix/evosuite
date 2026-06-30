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

public class UserPlaylog_init_19760001150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208935;

    public UserPlaylog_init_19760001150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term208939 = new Long(-412186147449928821L);
        term208935 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term208937 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term208953 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term208954 = newInstance(Class.forName("java.time.LocalDate"));
        Object term208958 = newInstance(Class.forName("java.time.LocalTime"));
        Object term208963 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term208964 = newInstance(Class.forName("java.time.LocalDate"));
        Object term208968 = newInstance(Class.forName("java.time.LocalTime"));
        Object term208985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term208986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term208990 = newInstance(Class.forName("java.time.LocalTime"));
        Object term209046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209051 = newInstance(Class.forName("java.time.LocalTime"));
        Object term209094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209099 = newInstance(Class.forName("java.time.LocalTime"));
        Object term209140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209145 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term208935, term208935.getClass(), "id", -274830541904370339L);
        setLongField(term208937, term208937.getClass(), "id", -3823756632277492942L);
        setField(term208937, term208937.getClass(), "extId", term208939);
        setField(term208937, term208937.getClass(), "luid", "bgMqDcjsLV");
        setIntField(term208954, term208954.getClass(), "year", 2014);
        setShortField(term208954, term208954.getClass(), "month", (short) 8);
        setShortField(term208954, term208954.getClass(), "day", (short) 6);
        setField(term208953, term208953.getClass(), "date", term208954);
        setByteField(term208958, term208958.getClass(), "hour", (byte) 3);
        setByteField(term208958, term208958.getClass(), "minute", (byte) 41);
        setByteField(term208958, term208958.getClass(), "second", (byte) 15);
        setIntField(term208958, term208958.getClass(), "nano", 893872487);
        setField(term208953, term208953.getClass(), "time", term208958);
        setField(term208937, term208937.getClass(), "registerTime", term208953);
        setIntField(term208964, term208964.getClass(), "year", 2019);
        setShortField(term208964, term208964.getClass(), "month", (short) 2);
        setShortField(term208964, term208964.getClass(), "day", (short) 21);
        setField(term208963, term208963.getClass(), "date", term208964);
        setByteField(term208968, term208968.getClass(), "hour", (byte) 7);
        setByteField(term208968, term208968.getClass(), "minute", (byte) 57);
        setByteField(term208968, term208968.getClass(), "second", (byte) 22);
        setIntField(term208968, term208968.getClass(), "nano", 743961500);
        setField(term208963, term208963.getClass(), "time", term208968);
        setField(term208937, term208937.getClass(), "accessTime", term208963);
        setField(term208935, term208935.getClass(), "card", term208937);
        setField(term208935, term208935.getClass(), "userName", "zLEZEALrtb");
        setIntField(term208986, term208986.getClass(), "year", 2015);
        setShortField(term208986, term208986.getClass(), "month", (short) 1);
        setShortField(term208986, term208986.getClass(), "day", (short) 13);
        setField(term208985, term208985.getClass(), "date", term208986);
        setByteField(term208990, term208990.getClass(), "hour", (byte) 15);
        setByteField(term208990, term208990.getClass(), "minute", (byte) 24);
        setByteField(term208990, term208990.getClass(), "second", (byte) 59);
        setIntField(term208990, term208990.getClass(), "nano", 592263964);
        setField(term208985, term208985.getClass(), "time", term208990);
        setField(term208935, term208935.getClass(), "lastLoginDate", term208985);
        setBooleanField(term208935, term208935.getClass(), "isWebJoin", false);
        setField(term208935, term208935.getClass(), "webLimitDate", "fYrFVWJxMv");
        setIntField(term208935, term208935.getClass(), "level", 1655055649);
        setIntField(term208935, term208935.getClass(), "reincarnationNum", 782864661);
        setField(term208935, term208935.getClass(), "exp", "nctbaYsHdQ");
        setLongField(term208935, term208935.getClass(), "point", 3768946271590447122L);
        setLongField(term208935, term208935.getClass(), "totalPoint", -3105866075742210004L);
        setIntField(term208935, term208935.getClass(), "playCount", -628195221);
        setIntField(term208935, term208935.getClass(), "multiPlayCount", -204683138);
        setIntField(term208935, term208935.getClass(), "multiWinCount", -1466805424);
        setIntField(term208935, term208935.getClass(), "requestResCount", -1426893727);
        setIntField(term208935, term208935.getClass(), "acceptResCount", -388725939);
        setIntField(term208935, term208935.getClass(), "successResCount", -359314137);
        setIntField(term208935, term208935.getClass(), "playerRating", -1602360743);
        setIntField(term208935, term208935.getClass(), "highestRating", 297534999);
        setIntField(term208935, term208935.getClass(), "nameplateId", -1696655137);
        setIntField(term208935, term208935.getClass(), "frameId", -184941622);
        setIntField(term208935, term208935.getClass(), "characterId", 1975019241);
        setIntField(term208935, term208935.getClass(), "trophyId", -2140412944);
        setIntField(term208935, term208935.getClass(), "playedTutorialBit", 1286651308);
        setIntField(term208935, term208935.getClass(), "firstTutorialCancelNum", 833678431);
        setIntField(term208935, term208935.getClass(), "masterTutorialCancelNum", -628503839);
        setIntField(term208935, term208935.getClass(), "totalRepertoireCount", -1277150544);
        setIntField(term208935, term208935.getClass(), "totalMapNum", 1250324874);
        setLongField(term208935, term208935.getClass(), "totalHiScore", 5044780614134795929L);
        setLongField(term208935, term208935.getClass(), "totalBasicHighScore", 484211422990247322L);
        setLongField(term208935, term208935.getClass(), "totalAdvancedHighScore", 6944467326545185612L);
        setLongField(term208935, term208935.getClass(), "totalExpertHighScore", -1462881120810904068L);
        setLongField(term208935, term208935.getClass(), "totalMasterHighScore", -5973896292874312823L);
        setIntField(term209047, term209047.getClass(), "year", 2012);
        setShortField(term209047, term209047.getClass(), "month", (short) 9);
        setShortField(term209047, term209047.getClass(), "day", (short) 11);
        setField(term209046, term209046.getClass(), "date", term209047);
        setByteField(term209051, term209051.getClass(), "hour", (byte) 16);
        setByteField(term209051, term209051.getClass(), "minute", (byte) 43);
        setByteField(term209051, term209051.getClass(), "second", (byte) 35);
        setIntField(term209051, term209051.getClass(), "nano", 42861150);
        setField(term209046, term209046.getClass(), "time", term209051);
        setField(term208935, term208935.getClass(), "eventWatchedDate", term209046);
        setIntField(term208935, term208935.getClass(), "friendCount", 1178706689);
        setBooleanField(term208935, term208935.getClass(), "isMaimai", false);
        setField(term208935, term208935.getClass(), "firstGameId", "RejSdSVgkk");
        setField(term208935, term208935.getClass(), "firstRomVersion", "nhcRjrlhrI");
        setField(term208935, term208935.getClass(), "firstDataVersion", "tjxSuDIeTM");
        setIntField(term209095, term209095.getClass(), "year", 2015);
        setShortField(term209095, term209095.getClass(), "month", (short) 12);
        setShortField(term209095, term209095.getClass(), "day", (short) 15);
        setField(term209094, term209094.getClass(), "date", term209095);
        setByteField(term209099, term209099.getClass(), "hour", (byte) 5);
        setByteField(term209099, term209099.getClass(), "minute", (byte) 55);
        setByteField(term209099, term209099.getClass(), "second", (byte) 50);
        setIntField(term209099, term209099.getClass(), "nano", 437161821);
        setField(term209094, term209094.getClass(), "time", term209099);
        setField(term208935, term208935.getClass(), "firstPlayDate", term209094);
        setField(term208935, term208935.getClass(), "lastGameId", "daQBUXyGRt");
        setField(term208935, term208935.getClass(), "lastRomVersion", "TUbAuzVZQV");
        setField(term208935, term208935.getClass(), "lastDataVersion", "EkQvxsYMfN");
        setIntField(term209141, term209141.getClass(), "year", 2024);
        setShortField(term209141, term209141.getClass(), "month", (short) 3);
        setShortField(term209141, term209141.getClass(), "day", (short) 19);
        setField(term209140, term209140.getClass(), "date", term209141);
        setByteField(term209145, term209145.getClass(), "hour", (byte) 13);
        setByteField(term209145, term209145.getClass(), "minute", (byte) 18);
        setByteField(term209145, term209145.getClass(), "second", (byte) 32);
        setIntField(term209145, term209145.getClass(), "nano", 924916316);
        setField(term209140, term209140.getClass(), "time", term209145);
        setField(term208935, term208935.getClass(), "lastPlayDate", term209140);
        setIntField(term208935, term208935.getClass(), "lastPlaceId", -1020078059);
        setField(term208935, term208935.getClass(), "lastPlaceName", "pmEgYqGmTc");
        setField(term208935, term208935.getClass(), "lastRegionId", "tQFzyzdTDx");
        setField(term208935, term208935.getClass(), "lastRegionName", "WQQiwAqGaC");
        setField(term208935, term208935.getClass(), "lastAllNetId", "KLymDDZdBx");
        setField(term208935, term208935.getClass(), "lastClientId", "slKJAyLDtj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term208935;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


