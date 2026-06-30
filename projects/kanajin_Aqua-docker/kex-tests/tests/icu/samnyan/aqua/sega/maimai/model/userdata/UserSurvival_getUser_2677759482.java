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

public class UserSurvival_getUser_2677759482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102424;

    public UserSurvival_getUser_2677759482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term102430 = new Long(4341016500855678917L);
        term102424 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term102426 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term102428 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term102444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102449 = newInstance(Class.forName("java.time.LocalTime"));
        Object term102454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102459 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term102424, term102424.getClass(), "id", -6514877903832915932L);
        setLongField(term102426, term102426.getClass(), "id", -6735965016116114681L);
        setLongField(term102428, term102428.getClass(), "id", 4813306236521164153L);
        setField(term102428, term102428.getClass(), "extId", term102430);
        setField(term102428, term102428.getClass(), "luid", "gQlDPvSqrX");
        setIntField(term102445, term102445.getClass(), "year", 2021);
        setShortField(term102445, term102445.getClass(), "month", (short) 10);
        setShortField(term102445, term102445.getClass(), "day", (short) 12);
        setField(term102444, term102444.getClass(), "date", term102445);
        setByteField(term102449, term102449.getClass(), "hour", (byte) 10);
        setByteField(term102449, term102449.getClass(), "minute", (byte) 35);
        setByteField(term102449, term102449.getClass(), "second", (byte) 54);
        setIntField(term102449, term102449.getClass(), "nano", 943613873);
        setField(term102444, term102444.getClass(), "time", term102449);
        setField(term102428, term102428.getClass(), "registerTime", term102444);
        setIntField(term102455, term102455.getClass(), "year", 2014);
        setShortField(term102455, term102455.getClass(), "month", (short) 12);
        setShortField(term102455, term102455.getClass(), "day", (short) 24);
        setField(term102454, term102454.getClass(), "date", term102455);
        setByteField(term102459, term102459.getClass(), "hour", (byte) 14);
        setByteField(term102459, term102459.getClass(), "minute", (byte) 18);
        setByteField(term102459, term102459.getClass(), "second", (byte) 26);
        setIntField(term102459, term102459.getClass(), "nano", 945081214);
        setField(term102454, term102454.getClass(), "time", term102459);
        setField(term102428, term102428.getClass(), "accessTime", term102454);
        setField(term102426, term102426.getClass(), "card", term102428);
        setIntField(term102426, term102426.getClass(), "lastDataVersion", 802170906);
        setField(term102426, term102426.getClass(), "userName", "EnYnZHmIml");
        setIntField(term102426, term102426.getClass(), "point", 39907880);
        setIntField(term102426, term102426.getClass(), "totalPoint", 358366676);
        setIntField(term102426, term102426.getClass(), "iconId", -18998104);
        setIntField(term102426, term102426.getClass(), "nameplateId", -1335254334);
        setIntField(term102426, term102426.getClass(), "frameId", 2039605156);
        setIntField(term102426, term102426.getClass(), "trophyId", -1335894442);
        setIntField(term102426, term102426.getClass(), "playCount", 269878407);
        setIntField(term102426, term102426.getClass(), "playVsCount", 1951853449);
        setIntField(term102426, term102426.getClass(), "playSyncCount", -1576630796);
        setIntField(term102426, term102426.getClass(), "winCount", -1476732663);
        setIntField(term102426, term102426.getClass(), "helpCount", 1985555115);
        setIntField(term102426, term102426.getClass(), "comboCount", 2017881557);
        setIntField(term102426, term102426.getClass(), "feverCount", 1409539871);
        setIntField(term102426, term102426.getClass(), "totalHiScore", -252004629);
        setIntField(term102426, term102426.getClass(), "totalEasyHighScore", 1176748358);
        setIntField(term102426, term102426.getClass(), "totalBasicHighScore", -888350999);
        setIntField(term102426, term102426.getClass(), "totalAdvancedHighScore", 2010116469);
        setIntField(term102426, term102426.getClass(), "totalExpertHighScore", 564948);
        setIntField(term102426, term102426.getClass(), "totalMasterHighScore", -515527615);
        setIntField(term102426, term102426.getClass(), "totalReMasterHighScore", 1444212583);
        setIntField(term102426, term102426.getClass(), "totalHighSync", -663888705);
        setIntField(term102426, term102426.getClass(), "totalEasySync", -1081559918);
        setIntField(term102426, term102426.getClass(), "totalBasicSync", 1135106965);
        setIntField(term102426, term102426.getClass(), "totalAdvancedSync", 1832192277);
        setIntField(term102426, term102426.getClass(), "totalExpertSync", 1254864568);
        setIntField(term102426, term102426.getClass(), "totalMasterSync", -571619755);
        setIntField(term102426, term102426.getClass(), "totalReMasterSync", 451376857);
        setIntField(term102426, term102426.getClass(), "playerRating", -1991834397);
        setIntField(term102426, term102426.getClass(), "highestRating", -1181437252);
        setIntField(term102426, term102426.getClass(), "rankAuthTailId", 1473244237);
        setField(term102426, term102426.getClass(), "eventWatchedDate", "jvhvoAISsw");
        setField(term102426, term102426.getClass(), "webLimitDate", "NkOntrweCo");
        setIntField(term102426, term102426.getClass(), "challengeTrackPhase", 1217408539);
        setIntField(term102426, term102426.getClass(), "firstPlayBits", -80988884);
        setField(term102426, term102426.getClass(), "lastPlayDate", "hVtvnBKztu");
        setIntField(term102426, term102426.getClass(), "lastPlaceId", 1775341759);
        setField(term102426, term102426.getClass(), "lastPlaceName", "VOpwlWudOv");
        setIntField(term102426, term102426.getClass(), "lastRegionId", -1260716399);
        setField(term102426, term102426.getClass(), "lastRegionName", "eEXpzGjDgl");
        setField(term102426, term102426.getClass(), "lastClientId", "vGLuBgtHzA");
        setField(term102426, term102426.getClass(), "lastCountryCode", "iOiyjODkqg");
        setIntField(term102426, term102426.getClass(), "eventPoint", 2009351154);
        setIntField(term102426, term102426.getClass(), "totalLv", -1078550468);
        setIntField(term102426, term102426.getClass(), "lastLoginBonusDay", -1867741312);
        setIntField(term102426, term102426.getClass(), "lastSurvivalBonusDay", -795605694);
        setIntField(term102426, term102426.getClass(), "loginBonusLv", -1791286061);
        setField(term102424, term102424.getClass(), "user", term102426);
        setIntField(term102424, term102424.getClass(), "survivalId", -326801646);
        setIntField(term102424, term102424.getClass(), "totalScore", 1716329981);
        setIntField(term102424, term102424.getClass(), "totalAchieve", 1984104176);
        setBooleanField(term102424, term102424.getClass(), "isClear", true);
        setBooleanField(term102424, term102424.getClass(), "isNoDamage", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term102424, args);
    }

};


