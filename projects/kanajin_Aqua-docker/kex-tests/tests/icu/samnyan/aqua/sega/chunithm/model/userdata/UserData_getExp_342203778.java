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

public class UserData_getExp_342203778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132789;

    public UserData_getExp_342203778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term132793 = new Long(4255811647459029682L);
        term132789 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term132791 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term132807 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132808 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132812 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132822 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132844 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132900 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132901 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132905 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132948 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132949 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132953 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132999 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term132789, term132789.getClass(), "id", -694309572389702668L);
        setLongField(term132791, term132791.getClass(), "id", 5257435816251102013L);
        setField(term132791, term132791.getClass(), "extId", term132793);
        setField(term132791, term132791.getClass(), "luid", "NxbQJWSXQu");
        setIntField(term132808, term132808.getClass(), "year", 2023);
        setShortField(term132808, term132808.getClass(), "month", (short) 1);
        setShortField(term132808, term132808.getClass(), "day", (short) 25);
        setField(term132807, term132807.getClass(), "date", term132808);
        setByteField(term132812, term132812.getClass(), "hour", (byte) 22);
        setByteField(term132812, term132812.getClass(), "minute", (byte) 19);
        setByteField(term132812, term132812.getClass(), "second", (byte) 20);
        setIntField(term132812, term132812.getClass(), "nano", 70906678);
        setField(term132807, term132807.getClass(), "time", term132812);
        setField(term132791, term132791.getClass(), "registerTime", term132807);
        setIntField(term132818, term132818.getClass(), "year", 2028);
        setShortField(term132818, term132818.getClass(), "month", (short) 10);
        setShortField(term132818, term132818.getClass(), "day", (short) 22);
        setField(term132817, term132817.getClass(), "date", term132818);
        setByteField(term132822, term132822.getClass(), "hour", (byte) 1);
        setByteField(term132822, term132822.getClass(), "minute", (byte) 18);
        setByteField(term132822, term132822.getClass(), "second", (byte) 46);
        setIntField(term132822, term132822.getClass(), "nano", 439817966);
        setField(term132817, term132817.getClass(), "time", term132822);
        setField(term132791, term132791.getClass(), "accessTime", term132817);
        setField(term132789, term132789.getClass(), "card", term132791);
        setField(term132789, term132789.getClass(), "userName", "ByfIvofaQE");
        setIntField(term132840, term132840.getClass(), "year", 2019);
        setShortField(term132840, term132840.getClass(), "month", (short) 5);
        setShortField(term132840, term132840.getClass(), "day", (short) 2);
        setField(term132839, term132839.getClass(), "date", term132840);
        setByteField(term132844, term132844.getClass(), "hour", (byte) 22);
        setByteField(term132844, term132844.getClass(), "minute", (byte) 0);
        setByteField(term132844, term132844.getClass(), "second", (byte) 24);
        setIntField(term132844, term132844.getClass(), "nano", 489512842);
        setField(term132839, term132839.getClass(), "time", term132844);
        setField(term132789, term132789.getClass(), "lastLoginDate", term132839);
        setBooleanField(term132789, term132789.getClass(), "isWebJoin", true);
        setField(term132789, term132789.getClass(), "webLimitDate", "xvhHgJLoQS");
        setIntField(term132789, term132789.getClass(), "level", -1924640207);
        setIntField(term132789, term132789.getClass(), "reincarnationNum", -1337500518);
        setField(term132789, term132789.getClass(), "exp", "bKSYtrrxDp");
        setLongField(term132789, term132789.getClass(), "point", 2254797667827153109L);
        setLongField(term132789, term132789.getClass(), "totalPoint", 2060510242405205727L);
        setIntField(term132789, term132789.getClass(), "playCount", 1075950264);
        setIntField(term132789, term132789.getClass(), "multiPlayCount", 2023667585);
        setIntField(term132789, term132789.getClass(), "multiWinCount", -1457367270);
        setIntField(term132789, term132789.getClass(), "requestResCount", 599933959);
        setIntField(term132789, term132789.getClass(), "acceptResCount", 1546898322);
        setIntField(term132789, term132789.getClass(), "successResCount", 1681670795);
        setIntField(term132789, term132789.getClass(), "playerRating", 371953556);
        setIntField(term132789, term132789.getClass(), "highestRating", 1627368933);
        setIntField(term132789, term132789.getClass(), "nameplateId", -976378630);
        setIntField(term132789, term132789.getClass(), "frameId", -1198631435);
        setIntField(term132789, term132789.getClass(), "characterId", 243073628);
        setIntField(term132789, term132789.getClass(), "trophyId", 12526162);
        setIntField(term132789, term132789.getClass(), "playedTutorialBit", 1392375010);
        setIntField(term132789, term132789.getClass(), "firstTutorialCancelNum", -1993971761);
        setIntField(term132789, term132789.getClass(), "masterTutorialCancelNum", 1389251335);
        setIntField(term132789, term132789.getClass(), "totalRepertoireCount", -921428041);
        setIntField(term132789, term132789.getClass(), "totalMapNum", 61264180);
        setLongField(term132789, term132789.getClass(), "totalHiScore", 7247674325364556051L);
        setLongField(term132789, term132789.getClass(), "totalBasicHighScore", 329075143180309928L);
        setLongField(term132789, term132789.getClass(), "totalAdvancedHighScore", -8203373005676064618L);
        setLongField(term132789, term132789.getClass(), "totalExpertHighScore", -2387931839279962287L);
        setLongField(term132789, term132789.getClass(), "totalMasterHighScore", -781213565213959299L);
        setIntField(term132901, term132901.getClass(), "year", 2022);
        setShortField(term132901, term132901.getClass(), "month", (short) 2);
        setShortField(term132901, term132901.getClass(), "day", (short) 13);
        setField(term132900, term132900.getClass(), "date", term132901);
        setByteField(term132905, term132905.getClass(), "hour", (byte) 23);
        setByteField(term132905, term132905.getClass(), "minute", (byte) 45);
        setByteField(term132905, term132905.getClass(), "second", (byte) 24);
        setIntField(term132905, term132905.getClass(), "nano", 403337978);
        setField(term132900, term132900.getClass(), "time", term132905);
        setField(term132789, term132789.getClass(), "eventWatchedDate", term132900);
        setIntField(term132789, term132789.getClass(), "friendCount", -1036194324);
        setBooleanField(term132789, term132789.getClass(), "isMaimai", true);
        setField(term132789, term132789.getClass(), "firstGameId", "fQYVEGPLIF");
        setField(term132789, term132789.getClass(), "firstRomVersion", "qRwTBVZctS");
        setField(term132789, term132789.getClass(), "firstDataVersion", "BRBDbdsahC");
        setIntField(term132949, term132949.getClass(), "year", 2025);
        setShortField(term132949, term132949.getClass(), "month", (short) 1);
        setShortField(term132949, term132949.getClass(), "day", (short) 28);
        setField(term132948, term132948.getClass(), "date", term132949);
        setByteField(term132953, term132953.getClass(), "hour", (byte) 20);
        setByteField(term132953, term132953.getClass(), "minute", (byte) 16);
        setByteField(term132953, term132953.getClass(), "second", (byte) 20);
        setIntField(term132953, term132953.getClass(), "nano", 692625956);
        setField(term132948, term132948.getClass(), "time", term132953);
        setField(term132789, term132789.getClass(), "firstPlayDate", term132948);
        setField(term132789, term132789.getClass(), "lastGameId", "TQAFOeWgvq");
        setField(term132789, term132789.getClass(), "lastRomVersion", "AtYIxbvLDg");
        setField(term132789, term132789.getClass(), "lastDataVersion", "rQdqhBCIJv");
        setIntField(term132995, term132995.getClass(), "year", 2016);
        setShortField(term132995, term132995.getClass(), "month", (short) 8);
        setShortField(term132995, term132995.getClass(), "day", (short) 8);
        setField(term132994, term132994.getClass(), "date", term132995);
        setByteField(term132999, term132999.getClass(), "hour", (byte) 9);
        setByteField(term132999, term132999.getClass(), "minute", (byte) 15);
        setByteField(term132999, term132999.getClass(), "second", (byte) 42);
        setIntField(term132999, term132999.getClass(), "nano", 408668564);
        setField(term132994, term132994.getClass(), "time", term132999);
        setField(term132789, term132789.getClass(), "lastPlayDate", term132994);
        setIntField(term132789, term132789.getClass(), "lastPlaceId", -486471150);
        setField(term132789, term132789.getClass(), "lastPlaceName", "OWnGgqSmUN");
        setField(term132789, term132789.getClass(), "lastRegionId", "BLSUZfTILp");
        setField(term132789, term132789.getClass(), "lastRegionName", "tlymfAhXiZ");
        setField(term132789, term132789.getClass(), "lastAllNetId", "rlLIYBJlxU");
        setField(term132789, term132789.getClass(), "lastClientId", "jtfkxwFefh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term132789, args);
    }

};


