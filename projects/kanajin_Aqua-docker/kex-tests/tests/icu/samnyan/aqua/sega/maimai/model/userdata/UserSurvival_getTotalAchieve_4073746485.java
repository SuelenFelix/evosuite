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

public class UserSurvival_getTotalAchieve_4073746485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103237;

    public UserSurvival_getTotalAchieve_4073746485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term103243 = new Long(2722004046017350471L);
        term103237 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term103239 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term103241 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term103257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103262 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103267 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103268 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103272 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term103237, term103237.getClass(), "id", -7012409967252303497L);
        setLongField(term103239, term103239.getClass(), "id", 1203458433789323993L);
        setLongField(term103241, term103241.getClass(), "id", -8021019578361035942L);
        setField(term103241, term103241.getClass(), "extId", term103243);
        setField(term103241, term103241.getClass(), "luid", "xtNmObxmHy");
        setIntField(term103258, term103258.getClass(), "year", 2023);
        setShortField(term103258, term103258.getClass(), "month", (short) 5);
        setShortField(term103258, term103258.getClass(), "day", (short) 24);
        setField(term103257, term103257.getClass(), "date", term103258);
        setByteField(term103262, term103262.getClass(), "hour", (byte) 7);
        setByteField(term103262, term103262.getClass(), "minute", (byte) 37);
        setByteField(term103262, term103262.getClass(), "second", (byte) 7);
        setIntField(term103262, term103262.getClass(), "nano", 648887020);
        setField(term103257, term103257.getClass(), "time", term103262);
        setField(term103241, term103241.getClass(), "registerTime", term103257);
        setIntField(term103268, term103268.getClass(), "year", 2029);
        setShortField(term103268, term103268.getClass(), "month", (short) 8);
        setShortField(term103268, term103268.getClass(), "day", (short) 9);
        setField(term103267, term103267.getClass(), "date", term103268);
        setByteField(term103272, term103272.getClass(), "hour", (byte) 15);
        setByteField(term103272, term103272.getClass(), "minute", (byte) 45);
        setByteField(term103272, term103272.getClass(), "second", (byte) 28);
        setIntField(term103272, term103272.getClass(), "nano", 584909169);
        setField(term103267, term103267.getClass(), "time", term103272);
        setField(term103241, term103241.getClass(), "accessTime", term103267);
        setField(term103239, term103239.getClass(), "card", term103241);
        setIntField(term103239, term103239.getClass(), "lastDataVersion", -135506333);
        setField(term103239, term103239.getClass(), "userName", "nComTwhtzu");
        setIntField(term103239, term103239.getClass(), "point", 1938906824);
        setIntField(term103239, term103239.getClass(), "totalPoint", -1898614835);
        setIntField(term103239, term103239.getClass(), "iconId", -102506456);
        setIntField(term103239, term103239.getClass(), "nameplateId", -1813716447);
        setIntField(term103239, term103239.getClass(), "frameId", -1548567396);
        setIntField(term103239, term103239.getClass(), "trophyId", -1192782958);
        setIntField(term103239, term103239.getClass(), "playCount", 1654390448);
        setIntField(term103239, term103239.getClass(), "playVsCount", 1172969270);
        setIntField(term103239, term103239.getClass(), "playSyncCount", -742134992);
        setIntField(term103239, term103239.getClass(), "winCount", 1533756452);
        setIntField(term103239, term103239.getClass(), "helpCount", -1888445182);
        setIntField(term103239, term103239.getClass(), "comboCount", 166690129);
        setIntField(term103239, term103239.getClass(), "feverCount", 242187277);
        setIntField(term103239, term103239.getClass(), "totalHiScore", 1023640987);
        setIntField(term103239, term103239.getClass(), "totalEasyHighScore", -63686617);
        setIntField(term103239, term103239.getClass(), "totalBasicHighScore", 895105769);
        setIntField(term103239, term103239.getClass(), "totalAdvancedHighScore", -241787119);
        setIntField(term103239, term103239.getClass(), "totalExpertHighScore", -405191607);
        setIntField(term103239, term103239.getClass(), "totalMasterHighScore", -1381524213);
        setIntField(term103239, term103239.getClass(), "totalReMasterHighScore", -519703952);
        setIntField(term103239, term103239.getClass(), "totalHighSync", 890243475);
        setIntField(term103239, term103239.getClass(), "totalEasySync", -641853683);
        setIntField(term103239, term103239.getClass(), "totalBasicSync", -397533636);
        setIntField(term103239, term103239.getClass(), "totalAdvancedSync", -224543032);
        setIntField(term103239, term103239.getClass(), "totalExpertSync", -347362358);
        setIntField(term103239, term103239.getClass(), "totalMasterSync", 252203752);
        setIntField(term103239, term103239.getClass(), "totalReMasterSync", 1848173042);
        setIntField(term103239, term103239.getClass(), "playerRating", 287572725);
        setIntField(term103239, term103239.getClass(), "highestRating", 900847726);
        setIntField(term103239, term103239.getClass(), "rankAuthTailId", 266617808);
        setField(term103239, term103239.getClass(), "eventWatchedDate", "gXyUtfRzMt");
        setField(term103239, term103239.getClass(), "webLimitDate", "RUmloTNkOF");
        setIntField(term103239, term103239.getClass(), "challengeTrackPhase", 1590332494);
        setIntField(term103239, term103239.getClass(), "firstPlayBits", -1493499628);
        setField(term103239, term103239.getClass(), "lastPlayDate", "xlEdrgoOEf");
        setIntField(term103239, term103239.getClass(), "lastPlaceId", -1696939361);
        setField(term103239, term103239.getClass(), "lastPlaceName", "DfKLAuTNTf");
        setIntField(term103239, term103239.getClass(), "lastRegionId", 1195351748);
        setField(term103239, term103239.getClass(), "lastRegionName", "lWuRJaTZQB");
        setField(term103239, term103239.getClass(), "lastClientId", "jiQYzmbdOz");
        setField(term103239, term103239.getClass(), "lastCountryCode", "HBnovMFfRR");
        setIntField(term103239, term103239.getClass(), "eventPoint", 1149553126);
        setIntField(term103239, term103239.getClass(), "totalLv", -1838453620);
        setIntField(term103239, term103239.getClass(), "lastLoginBonusDay", -148539898);
        setIntField(term103239, term103239.getClass(), "lastSurvivalBonusDay", 254902560);
        setIntField(term103239, term103239.getClass(), "loginBonusLv", 92634753);
        setField(term103237, term103237.getClass(), "user", term103239);
        setIntField(term103237, term103237.getClass(), "survivalId", 465922946);
        setIntField(term103237, term103237.getClass(), "totalScore", -553407174);
        setIntField(term103237, term103237.getClass(), "totalAchieve", 168988978);
        setBooleanField(term103237, term103237.getClass(), "isClear", false);
        setBooleanField(term103237, term103237.getClass(), "isNoDamage", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAchieve", argTypes, term103237, args);
    }

};


