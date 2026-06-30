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

public class UserData_getFriendCount_186445626634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143865;

    public UserData_getFriendCount_186445626634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term143869 = new Long(-6078481855513028760L);
        term143865 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term143867 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term143883 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143884 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143888 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143898 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143915 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143916 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143920 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143981 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144029 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144070 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144071 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144075 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term143865, term143865.getClass(), "id", -1704070927923118226L);
        setLongField(term143867, term143867.getClass(), "id", 6525218690517857760L);
        setField(term143867, term143867.getClass(), "extId", term143869);
        setField(term143867, term143867.getClass(), "luid", "aigtpfubEk");
        setIntField(term143884, term143884.getClass(), "year", 2013);
        setShortField(term143884, term143884.getClass(), "month", (short) 11);
        setShortField(term143884, term143884.getClass(), "day", (short) 14);
        setField(term143883, term143883.getClass(), "date", term143884);
        setByteField(term143888, term143888.getClass(), "hour", (byte) 5);
        setByteField(term143888, term143888.getClass(), "minute", (byte) 58);
        setByteField(term143888, term143888.getClass(), "second", (byte) 19);
        setIntField(term143888, term143888.getClass(), "nano", 3840837);
        setField(term143883, term143883.getClass(), "time", term143888);
        setField(term143867, term143867.getClass(), "registerTime", term143883);
        setIntField(term143894, term143894.getClass(), "year", 2011);
        setShortField(term143894, term143894.getClass(), "month", (short) 5);
        setShortField(term143894, term143894.getClass(), "day", (short) 5);
        setField(term143893, term143893.getClass(), "date", term143894);
        setByteField(term143898, term143898.getClass(), "hour", (byte) 21);
        setByteField(term143898, term143898.getClass(), "minute", (byte) 42);
        setByteField(term143898, term143898.getClass(), "second", (byte) 14);
        setIntField(term143898, term143898.getClass(), "nano", 17985013);
        setField(term143893, term143893.getClass(), "time", term143898);
        setField(term143867, term143867.getClass(), "accessTime", term143893);
        setField(term143865, term143865.getClass(), "card", term143867);
        setField(term143865, term143865.getClass(), "userName", "VkDDJVqlRm");
        setIntField(term143916, term143916.getClass(), "year", 2016);
        setShortField(term143916, term143916.getClass(), "month", (short) 8);
        setShortField(term143916, term143916.getClass(), "day", (short) 21);
        setField(term143915, term143915.getClass(), "date", term143916);
        setByteField(term143920, term143920.getClass(), "hour", (byte) 17);
        setByteField(term143920, term143920.getClass(), "minute", (byte) 15);
        setByteField(term143920, term143920.getClass(), "second", (byte) 35);
        setIntField(term143920, term143920.getClass(), "nano", 861979375);
        setField(term143915, term143915.getClass(), "time", term143920);
        setField(term143865, term143865.getClass(), "lastLoginDate", term143915);
        setBooleanField(term143865, term143865.getClass(), "isWebJoin", true);
        setField(term143865, term143865.getClass(), "webLimitDate", "SUGqIJvCrc");
        setIntField(term143865, term143865.getClass(), "level", 1734679414);
        setIntField(term143865, term143865.getClass(), "reincarnationNum", -1815657201);
        setField(term143865, term143865.getClass(), "exp", "TrQnxgLKzu");
        setLongField(term143865, term143865.getClass(), "point", 2364419711427198598L);
        setLongField(term143865, term143865.getClass(), "totalPoint", 4336444065655990676L);
        setIntField(term143865, term143865.getClass(), "playCount", -888163744);
        setIntField(term143865, term143865.getClass(), "multiPlayCount", 1589783137);
        setIntField(term143865, term143865.getClass(), "multiWinCount", 1822772585);
        setIntField(term143865, term143865.getClass(), "requestResCount", -1240567719);
        setIntField(term143865, term143865.getClass(), "acceptResCount", 444592925);
        setIntField(term143865, term143865.getClass(), "successResCount", 1533907913);
        setIntField(term143865, term143865.getClass(), "playerRating", 1834871797);
        setIntField(term143865, term143865.getClass(), "highestRating", 2074112074);
        setIntField(term143865, term143865.getClass(), "nameplateId", -1339856700);
        setIntField(term143865, term143865.getClass(), "frameId", -1979249214);
        setIntField(term143865, term143865.getClass(), "characterId", -793518315);
        setIntField(term143865, term143865.getClass(), "trophyId", 2091844914);
        setIntField(term143865, term143865.getClass(), "playedTutorialBit", 2021693700);
        setIntField(term143865, term143865.getClass(), "firstTutorialCancelNum", -1710809144);
        setIntField(term143865, term143865.getClass(), "masterTutorialCancelNum", -1253292706);
        setIntField(term143865, term143865.getClass(), "totalRepertoireCount", 1627263304);
        setIntField(term143865, term143865.getClass(), "totalMapNum", 2005816851);
        setLongField(term143865, term143865.getClass(), "totalHiScore", 4007346133763031616L);
        setLongField(term143865, term143865.getClass(), "totalBasicHighScore", -7343171770196184946L);
        setLongField(term143865, term143865.getClass(), "totalAdvancedHighScore", 5459829007364846914L);
        setLongField(term143865, term143865.getClass(), "totalExpertHighScore", 7148575471460448931L);
        setLongField(term143865, term143865.getClass(), "totalMasterHighScore", 8335887334290544891L);
        setIntField(term143977, term143977.getClass(), "year", 2022);
        setShortField(term143977, term143977.getClass(), "month", (short) 4);
        setShortField(term143977, term143977.getClass(), "day", (short) 25);
        setField(term143976, term143976.getClass(), "date", term143977);
        setByteField(term143981, term143981.getClass(), "hour", (byte) 6);
        setByteField(term143981, term143981.getClass(), "minute", (byte) 3);
        setByteField(term143981, term143981.getClass(), "second", (byte) 37);
        setIntField(term143981, term143981.getClass(), "nano", 298453680);
        setField(term143976, term143976.getClass(), "time", term143981);
        setField(term143865, term143865.getClass(), "eventWatchedDate", term143976);
        setIntField(term143865, term143865.getClass(), "friendCount", -293521593);
        setBooleanField(term143865, term143865.getClass(), "isMaimai", false);
        setField(term143865, term143865.getClass(), "firstGameId", "MsenaDqyDy");
        setField(term143865, term143865.getClass(), "firstRomVersion", "rKQXUHZdfd");
        setField(term143865, term143865.getClass(), "firstDataVersion", "gBuTBlOYRS");
        setIntField(term144025, term144025.getClass(), "year", 2019);
        setShortField(term144025, term144025.getClass(), "month", (short) 1);
        setShortField(term144025, term144025.getClass(), "day", (short) 9);
        setField(term144024, term144024.getClass(), "date", term144025);
        setByteField(term144029, term144029.getClass(), "hour", (byte) 4);
        setByteField(term144029, term144029.getClass(), "minute", (byte) 46);
        setByteField(term144029, term144029.getClass(), "second", (byte) 9);
        setIntField(term144029, term144029.getClass(), "nano", 916479000);
        setField(term144024, term144024.getClass(), "time", term144029);
        setField(term143865, term143865.getClass(), "firstPlayDate", term144024);
        setField(term143865, term143865.getClass(), "lastGameId", "mywuLwqGWK");
        setField(term143865, term143865.getClass(), "lastRomVersion", "ZySPRbJHwO");
        setField(term143865, term143865.getClass(), "lastDataVersion", "qVZzWMIpdZ");
        setIntField(term144071, term144071.getClass(), "year", 2014);
        setShortField(term144071, term144071.getClass(), "month", (short) 7);
        setShortField(term144071, term144071.getClass(), "day", (short) 2);
        setField(term144070, term144070.getClass(), "date", term144071);
        setByteField(term144075, term144075.getClass(), "hour", (byte) 9);
        setByteField(term144075, term144075.getClass(), "minute", (byte) 34);
        setByteField(term144075, term144075.getClass(), "second", (byte) 28);
        setIntField(term144075, term144075.getClass(), "nano", 303856990);
        setField(term144070, term144070.getClass(), "time", term144075);
        setField(term143865, term143865.getClass(), "lastPlayDate", term144070);
        setIntField(term143865, term143865.getClass(), "lastPlaceId", 1850801712);
        setField(term143865, term143865.getClass(), "lastPlaceName", "RVyPHqsjIQ");
        setField(term143865, term143865.getClass(), "lastRegionId", "HInKycRClK");
        setField(term143865, term143865.getClass(), "lastRegionName", "ovWYiKLJPi");
        setField(term143865, term143865.getClass(), "lastAllNetId", "KqOycFiFAf");
        setField(term143865, term143865.getClass(), "lastClientId", "pBstCdjkMe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFriendCount", argTypes, term143865, args);
    }

};


