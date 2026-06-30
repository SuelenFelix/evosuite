package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserMusicDetail_toString_59953570628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187933;

    public UserMusicDetail_toString_59953570628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term187939 = new Long(1528628920302068646L);
        term187933 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term187935 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term187937 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term187953 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187954 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187958 = newInstance(Class.forName("java.time.LocalTime"));
        Object term187963 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187964 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187968 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term187933, term187933.getClass(), "id", 634576993708159924L);
        setLongField(term187935, term187935.getClass(), "id", 9144301579937337002L);
        setLongField(term187937, term187937.getClass(), "id", -7592880897361848994L);
        setField(term187937, term187937.getClass(), "extId", term187939);
        setField(term187937, term187937.getClass(), "luid", "EoYFVoOjqB");
        setIntField(term187954, term187954.getClass(), "year", 2018);
        setShortField(term187954, term187954.getClass(), "month", (short) 5);
        setShortField(term187954, term187954.getClass(), "day", (short) 10);
        setField(term187953, term187953.getClass(), "date", term187954);
        setByteField(term187958, term187958.getClass(), "hour", (byte) 4);
        setByteField(term187958, term187958.getClass(), "minute", (byte) 24);
        setByteField(term187958, term187958.getClass(), "second", (byte) 13);
        setIntField(term187958, term187958.getClass(), "nano", 683622181);
        setField(term187953, term187953.getClass(), "time", term187958);
        setField(term187937, term187937.getClass(), "registerTime", term187953);
        setIntField(term187964, term187964.getClass(), "year", 2020);
        setShortField(term187964, term187964.getClass(), "month", (short) 3);
        setShortField(term187964, term187964.getClass(), "day", (short) 27);
        setField(term187963, term187963.getClass(), "date", term187964);
        setByteField(term187968, term187968.getClass(), "hour", (byte) 13);
        setByteField(term187968, term187968.getClass(), "minute", (byte) 32);
        setByteField(term187968, term187968.getClass(), "second", (byte) 57);
        setIntField(term187968, term187968.getClass(), "nano", 463263039);
        setField(term187963, term187963.getClass(), "time", term187968);
        setField(term187937, term187937.getClass(), "accessTime", term187963);
        setField(term187935, term187935.getClass(), "card", term187937);
        setIntField(term187935, term187935.getClass(), "lastDataVersion", 146341391);
        setField(term187935, term187935.getClass(), "userName", "fWgDjgGWKF");
        setIntField(term187935, term187935.getClass(), "point", -1773867480);
        setIntField(term187935, term187935.getClass(), "totalPoint", 735724109);
        setIntField(term187935, term187935.getClass(), "iconId", 1189122749);
        setIntField(term187935, term187935.getClass(), "nameplateId", -439217465);
        setIntField(term187935, term187935.getClass(), "frameId", 1277764455);
        setIntField(term187935, term187935.getClass(), "trophyId", -542048331);
        setIntField(term187935, term187935.getClass(), "playCount", 1238286958);
        setIntField(term187935, term187935.getClass(), "playVsCount", -944665805);
        setIntField(term187935, term187935.getClass(), "playSyncCount", 618905752);
        setIntField(term187935, term187935.getClass(), "winCount", -453977448);
        setIntField(term187935, term187935.getClass(), "helpCount", -2098862591);
        setIntField(term187935, term187935.getClass(), "comboCount", -1471620493);
        setIntField(term187935, term187935.getClass(), "feverCount", -484325069);
        setIntField(term187935, term187935.getClass(), "totalHiScore", 1614600757);
        setIntField(term187935, term187935.getClass(), "totalEasyHighScore", -1745581845);
        setIntField(term187935, term187935.getClass(), "totalBasicHighScore", -1928986675);
        setIntField(term187935, term187935.getClass(), "totalAdvancedHighScore", 360617774);
        setIntField(term187935, term187935.getClass(), "totalExpertHighScore", 1610539203);
        setIntField(term187935, term187935.getClass(), "totalMasterHighScore", 683919505);
        setIntField(term187935, term187935.getClass(), "totalReMasterHighScore", -1351852644);
        setIntField(term187935, term187935.getClass(), "totalHighSync", 1906743531);
        setIntField(term187935, term187935.getClass(), "totalEasySync", -1493344895);
        setIntField(term187935, term187935.getClass(), "totalBasicSync", 289545927);
        setIntField(term187935, term187935.getClass(), "totalAdvancedSync", 1156549512);
        setIntField(term187935, term187935.getClass(), "totalExpertSync", 1699580240);
        setIntField(term187935, term187935.getClass(), "totalMasterSync", -1798206453);
        setIntField(term187935, term187935.getClass(), "totalReMasterSync", -634269550);
        setIntField(term187935, term187935.getClass(), "playerRating", 1164744694);
        setIntField(term187935, term187935.getClass(), "highestRating", 2005763639);
        setIntField(term187935, term187935.getClass(), "rankAuthTailId", 1706153199);
        setField(term187935, term187935.getClass(), "eventWatchedDate", "KNErrLdCwq");
        setField(term187935, term187935.getClass(), "webLimitDate", "IKFlEJMbOn");
        setIntField(term187935, term187935.getClass(), "challengeTrackPhase", 361301301);
        setIntField(term187935, term187935.getClass(), "firstPlayBits", -999199550);
        setField(term187935, term187935.getClass(), "lastPlayDate", "aymyhPMjnn");
        setIntField(term187935, term187935.getClass(), "lastPlaceId", 1589029129);
        setField(term187935, term187935.getClass(), "lastPlaceName", "aPlaqiCEzR");
        setIntField(term187935, term187935.getClass(), "lastRegionId", -299293824);
        setField(term187935, term187935.getClass(), "lastRegionName", "upFIfXmPHr");
        setField(term187935, term187935.getClass(), "lastClientId", "yWkVkdyYbu");
        setField(term187935, term187935.getClass(), "lastCountryCode", "HKfJtemhMV");
        setIntField(term187935, term187935.getClass(), "eventPoint", -99759765);
        setIntField(term187935, term187935.getClass(), "totalLv", 1481198379);
        setIntField(term187935, term187935.getClass(), "lastLoginBonusDay", -185793115);
        setIntField(term187935, term187935.getClass(), "lastSurvivalBonusDay", 1737311465);
        setIntField(term187935, term187935.getClass(), "loginBonusLv", -912751888);
        setField(term187933, term187933.getClass(), "user", term187935);
        setIntField(term187933, term187933.getClass(), "musicId", 1304466190);
        setIntField(term187933, term187933.getClass(), "level", -479382651);
        setIntField(term187933, term187933.getClass(), "playCount", -1802263420);
        setIntField(term187933, term187933.getClass(), "scoreMax", 2064357446);
        setIntField(term187933, term187933.getClass(), "syncRateMax", 671172951);
        setBooleanField(term187933, term187933.getClass(), "isAllPerfect", true);
        setIntField(term187933, term187933.getClass(), "isAllPerfectPlus", -1087519453);
        setIntField(term187933, term187933.getClass(), "fullCombo", -880477844);
        setIntField(term187933, term187933.getClass(), "maxFever", -591966027);
        setIntField(term187933, term187933.getClass(), "achievement", -66252364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term187933, args);
    }

};


