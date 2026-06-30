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

public class UserActivity_getParam3_19064560828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294878;

    public UserActivity_getParam3_19064560828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term294884 = new Long(-8605430501912680279L);
        term294878 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term294880 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term294882 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term294898 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term294899 = newInstance(Class.forName("java.time.LocalDate"));
        Object term294903 = newInstance(Class.forName("java.time.LocalTime"));
        Object term294908 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term294909 = newInstance(Class.forName("java.time.LocalDate"));
        Object term294913 = newInstance(Class.forName("java.time.LocalTime"));
        Object term294930 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term294931 = newInstance(Class.forName("java.time.LocalDate"));
        Object term294935 = newInstance(Class.forName("java.time.LocalTime"));
        Object term294991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term294992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term294996 = newInstance(Class.forName("java.time.LocalTime"));
        Object term295039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295044 = newInstance(Class.forName("java.time.LocalTime"));
        Object term295085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295090 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term294878, term294878.getClass(), "id", -7695239710538668939L);
        setLongField(term294880, term294880.getClass(), "id", 3015313255108144976L);
        setLongField(term294882, term294882.getClass(), "id", -6445201902102343423L);
        setField(term294882, term294882.getClass(), "extId", term294884);
        setField(term294882, term294882.getClass(), "luid", "sjLStQGrFs");
        setIntField(term294899, term294899.getClass(), "year", 2022);
        setShortField(term294899, term294899.getClass(), "month", (short) 6);
        setShortField(term294899, term294899.getClass(), "day", (short) 8);
        setField(term294898, term294898.getClass(), "date", term294899);
        setByteField(term294903, term294903.getClass(), "hour", (byte) 9);
        setByteField(term294903, term294903.getClass(), "minute", (byte) 13);
        setByteField(term294903, term294903.getClass(), "second", (byte) 55);
        setIntField(term294903, term294903.getClass(), "nano", 310011888);
        setField(term294898, term294898.getClass(), "time", term294903);
        setField(term294882, term294882.getClass(), "registerTime", term294898);
        setIntField(term294909, term294909.getClass(), "year", 2018);
        setShortField(term294909, term294909.getClass(), "month", (short) 7);
        setShortField(term294909, term294909.getClass(), "day", (short) 16);
        setField(term294908, term294908.getClass(), "date", term294909);
        setByteField(term294913, term294913.getClass(), "hour", (byte) 18);
        setByteField(term294913, term294913.getClass(), "minute", (byte) 49);
        setByteField(term294913, term294913.getClass(), "second", (byte) 48);
        setIntField(term294913, term294913.getClass(), "nano", 265057331);
        setField(term294908, term294908.getClass(), "time", term294913);
        setField(term294882, term294882.getClass(), "accessTime", term294908);
        setField(term294880, term294880.getClass(), "card", term294882);
        setField(term294880, term294880.getClass(), "userName", "YTNLhcKYKW");
        setIntField(term294931, term294931.getClass(), "year", 2016);
        setShortField(term294931, term294931.getClass(), "month", (short) 9);
        setShortField(term294931, term294931.getClass(), "day", (short) 1);
        setField(term294930, term294930.getClass(), "date", term294931);
        setByteField(term294935, term294935.getClass(), "hour", (byte) 3);
        setByteField(term294935, term294935.getClass(), "minute", (byte) 48);
        setByteField(term294935, term294935.getClass(), "second", (byte) 40);
        setIntField(term294935, term294935.getClass(), "nano", 147029097);
        setField(term294930, term294930.getClass(), "time", term294935);
        setField(term294880, term294880.getClass(), "lastLoginDate", term294930);
        setBooleanField(term294880, term294880.getClass(), "isWebJoin", false);
        setField(term294880, term294880.getClass(), "webLimitDate", "pSSwBgnrrm");
        setIntField(term294880, term294880.getClass(), "level", -721562174);
        setIntField(term294880, term294880.getClass(), "reincarnationNum", 388250530);
        setField(term294880, term294880.getClass(), "exp", "CIecTelJYL");
        setLongField(term294880, term294880.getClass(), "point", 1454316596500911577L);
        setLongField(term294880, term294880.getClass(), "totalPoint", -2111542580361798016L);
        setIntField(term294880, term294880.getClass(), "playCount", 1602460798);
        setIntField(term294880, term294880.getClass(), "multiPlayCount", 642817798);
        setIntField(term294880, term294880.getClass(), "multiWinCount", -1111363431);
        setIntField(term294880, term294880.getClass(), "requestResCount", -1286614190);
        setIntField(term294880, term294880.getClass(), "acceptResCount", -2077410887);
        setIntField(term294880, term294880.getClass(), "successResCount", -1955203822);
        setIntField(term294880, term294880.getClass(), "playerRating", 1396977392);
        setIntField(term294880, term294880.getClass(), "highestRating", -1677580127);
        setIntField(term294880, term294880.getClass(), "nameplateId", -256255169);
        setIntField(term294880, term294880.getClass(), "frameId", -1928244069);
        setIntField(term294880, term294880.getClass(), "characterId", -1683332471);
        setIntField(term294880, term294880.getClass(), "trophyId", 38870924);
        setIntField(term294880, term294880.getClass(), "playedTutorialBit", 379427802);
        setIntField(term294880, term294880.getClass(), "firstTutorialCancelNum", -1550927364);
        setIntField(term294880, term294880.getClass(), "masterTutorialCancelNum", -886384913);
        setIntField(term294880, term294880.getClass(), "totalRepertoireCount", -1933031867);
        setIntField(term294880, term294880.getClass(), "totalMapNum", 491284060);
        setLongField(term294880, term294880.getClass(), "totalHiScore", 2057875774041820508L);
        setLongField(term294880, term294880.getClass(), "totalBasicHighScore", 1156903350966631617L);
        setLongField(term294880, term294880.getClass(), "totalAdvancedHighScore", -8354491077748222406L);
        setLongField(term294880, term294880.getClass(), "totalExpertHighScore", -6434345679586157129L);
        setLongField(term294880, term294880.getClass(), "totalMasterHighScore", 3290723342049781600L);
        setIntField(term294992, term294992.getClass(), "year", 2019);
        setShortField(term294992, term294992.getClass(), "month", (short) 1);
        setShortField(term294992, term294992.getClass(), "day", (short) 7);
        setField(term294991, term294991.getClass(), "date", term294992);
        setByteField(term294996, term294996.getClass(), "hour", (byte) 5);
        setByteField(term294996, term294996.getClass(), "minute", (byte) 52);
        setByteField(term294996, term294996.getClass(), "second", (byte) 29);
        setIntField(term294996, term294996.getClass(), "nano", 613592272);
        setField(term294991, term294991.getClass(), "time", term294996);
        setField(term294880, term294880.getClass(), "eventWatchedDate", term294991);
        setIntField(term294880, term294880.getClass(), "friendCount", -866463269);
        setBooleanField(term294880, term294880.getClass(), "isMaimai", true);
        setField(term294880, term294880.getClass(), "firstGameId", "CRdlcDvmNm");
        setField(term294880, term294880.getClass(), "firstRomVersion", "KNCIEMtVHz");
        setField(term294880, term294880.getClass(), "firstDataVersion", "aHiCCXkIIc");
        setIntField(term295040, term295040.getClass(), "year", 2016);
        setShortField(term295040, term295040.getClass(), "month", (short) 8);
        setShortField(term295040, term295040.getClass(), "day", (short) 18);
        setField(term295039, term295039.getClass(), "date", term295040);
        setByteField(term295044, term295044.getClass(), "hour", (byte) 18);
        setByteField(term295044, term295044.getClass(), "minute", (byte) 30);
        setByteField(term295044, term295044.getClass(), "second", (byte) 28);
        setIntField(term295044, term295044.getClass(), "nano", 448759114);
        setField(term295039, term295039.getClass(), "time", term295044);
        setField(term294880, term294880.getClass(), "firstPlayDate", term295039);
        setField(term294880, term294880.getClass(), "lastGameId", "nMtsxQIOdu");
        setField(term294880, term294880.getClass(), "lastRomVersion", "LndvtyUwdc");
        setField(term294880, term294880.getClass(), "lastDataVersion", "LnwCYOTQzr");
        setIntField(term295086, term295086.getClass(), "year", 2022);
        setShortField(term295086, term295086.getClass(), "month", (short) 8);
        setShortField(term295086, term295086.getClass(), "day", (short) 11);
        setField(term295085, term295085.getClass(), "date", term295086);
        setByteField(term295090, term295090.getClass(), "hour", (byte) 1);
        setByteField(term295090, term295090.getClass(), "minute", (byte) 5);
        setByteField(term295090, term295090.getClass(), "second", (byte) 8);
        setIntField(term295090, term295090.getClass(), "nano", 742166755);
        setField(term295085, term295085.getClass(), "time", term295090);
        setField(term294880, term294880.getClass(), "lastPlayDate", term295085);
        setIntField(term294880, term294880.getClass(), "lastPlaceId", 2107415753);
        setField(term294880, term294880.getClass(), "lastPlaceName", "EClPOOvOQZ");
        setField(term294880, term294880.getClass(), "lastRegionId", "pGQdokmFhs");
        setField(term294880, term294880.getClass(), "lastRegionName", "VzYfsmeeBD");
        setField(term294880, term294880.getClass(), "lastAllNetId", "HjqSzxKjga");
        setField(term294880, term294880.getClass(), "lastClientId", "ZgNgomDQwE");
        setField(term294878, term294878.getClass(), "user", term294880);
        setIntField(term294878, term294878.getClass(), "kind", -956932114);
        setIntField(term294878, term294878.getClass(), "activityId", 1892033303);
        setIntField(term294878, term294878.getClass(), "sortNumber", -1411609718);
        setIntField(term294878, term294878.getClass(), "param1", 326153842);
        setIntField(term294878, term294878.getClass(), "param2", 100816803);
        setIntField(term294878, term294878.getClass(), "param3", 1731184786);
        setIntField(term294878, term294878.getClass(), "param4", 294317488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam3", argTypes, term294878, args);
    }

};


