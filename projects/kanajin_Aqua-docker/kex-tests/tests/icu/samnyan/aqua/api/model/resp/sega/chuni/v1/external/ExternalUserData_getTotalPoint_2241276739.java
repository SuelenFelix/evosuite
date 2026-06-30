package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getTotalPoint_2241276739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3610;

    public ExternalUserData_getTotalPoint_2241276739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3610 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term3635 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3636 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3640 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3696 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3697 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3701 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3749 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3790 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3791 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3795 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3610, term3610.getClass(), "accessCode", "fWKJoSoCwE");
        setField(term3610, term3610.getClass(), "userName", "wfaXBpWAUH");
        setIntField(term3636, term3636.getClass(), "year", 2010);
        setShortField(term3636, term3636.getClass(), "month", (short) 1);
        setShortField(term3636, term3636.getClass(), "day", (short) 17);
        setField(term3635, term3635.getClass(), "date", term3636);
        setByteField(term3640, term3640.getClass(), "hour", (byte) 13);
        setByteField(term3640, term3640.getClass(), "minute", (byte) 5);
        setByteField(term3640, term3640.getClass(), "second", (byte) 51);
        setIntField(term3640, term3640.getClass(), "nano", 362260580);
        setField(term3635, term3635.getClass(), "time", term3640);
        setField(term3610, term3610.getClass(), "lastLoginDate", term3635);
        setBooleanField(term3610, term3610.getClass(), "isWebJoin", false);
        setField(term3610, term3610.getClass(), "webLimitDate", "VMeAzAHwZj");
        setIntField(term3610, term3610.getClass(), "level", 114754804);
        setIntField(term3610, term3610.getClass(), "reincarnationNum", 1687361082);
        setField(term3610, term3610.getClass(), "exp", "PznxWXsZME");
        setLongField(term3610, term3610.getClass(), "point", -1610676979013636850L);
        setLongField(term3610, term3610.getClass(), "totalPoint", 2062173786000223358L);
        setIntField(term3610, term3610.getClass(), "playCount", 584893196);
        setIntField(term3610, term3610.getClass(), "multiPlayCount", 497269071);
        setIntField(term3610, term3610.getClass(), "multiWinCount", -1899301124);
        setIntField(term3610, term3610.getClass(), "requestResCount", -1882480155);
        setIntField(term3610, term3610.getClass(), "acceptResCount", -1410220680);
        setIntField(term3610, term3610.getClass(), "successResCount", 389427431);
        setIntField(term3610, term3610.getClass(), "playerRating", -1945706126);
        setIntField(term3610, term3610.getClass(), "highestRating", 1152356969);
        setIntField(term3610, term3610.getClass(), "nameplateId", -1667990367);
        setIntField(term3610, term3610.getClass(), "frameId", -1214628358);
        setIntField(term3610, term3610.getClass(), "characterId", 1102721075);
        setIntField(term3610, term3610.getClass(), "trophyId", -426764678);
        setIntField(term3610, term3610.getClass(), "playedTutorialBit", -1222614956);
        setIntField(term3610, term3610.getClass(), "firstTutorialCancelNum", -1870495012);
        setIntField(term3610, term3610.getClass(), "masterTutorialCancelNum", -1310015129);
        setIntField(term3610, term3610.getClass(), "totalRepertoireCount", -2104981311);
        setIntField(term3610, term3610.getClass(), "totalMapNum", -571169753);
        setLongField(term3610, term3610.getClass(), "totalHiScore", -8658027316505137504L);
        setLongField(term3610, term3610.getClass(), "totalBasicHighScore", 414749984815662075L);
        setLongField(term3610, term3610.getClass(), "totalAdvancedHighScore", 463622836963501975L);
        setLongField(term3610, term3610.getClass(), "totalExpertHighScore", 305759998609888272L);
        setLongField(term3610, term3610.getClass(), "totalMasterHighScore", -8654565919063661957L);
        setIntField(term3697, term3697.getClass(), "year", 2010);
        setShortField(term3697, term3697.getClass(), "month", (short) 9);
        setShortField(term3697, term3697.getClass(), "day", (short) 28);
        setField(term3696, term3696.getClass(), "date", term3697);
        setByteField(term3701, term3701.getClass(), "hour", (byte) 6);
        setByteField(term3701, term3701.getClass(), "minute", (byte) 4);
        setByteField(term3701, term3701.getClass(), "second", (byte) 54);
        setIntField(term3701, term3701.getClass(), "nano", 604713782);
        setField(term3696, term3696.getClass(), "time", term3701);
        setField(term3610, term3610.getClass(), "eventWatchedDate", term3696);
        setIntField(term3610, term3610.getClass(), "friendCount", 318591690);
        setBooleanField(term3610, term3610.getClass(), "isMaimai", false);
        setField(term3610, term3610.getClass(), "firstGameId", "ZzIujlwVsw");
        setField(term3610, term3610.getClass(), "firstRomVersion", "LWyEaeIyAo");
        setField(term3610, term3610.getClass(), "firstDataVersion", "yVMkkQhvmN");
        setIntField(term3745, term3745.getClass(), "year", 2023);
        setShortField(term3745, term3745.getClass(), "month", (short) 7);
        setShortField(term3745, term3745.getClass(), "day", (short) 16);
        setField(term3744, term3744.getClass(), "date", term3745);
        setByteField(term3749, term3749.getClass(), "hour", (byte) 3);
        setByteField(term3749, term3749.getClass(), "minute", (byte) 1);
        setByteField(term3749, term3749.getClass(), "second", (byte) 19);
        setIntField(term3749, term3749.getClass(), "nano", 488629554);
        setField(term3744, term3744.getClass(), "time", term3749);
        setField(term3610, term3610.getClass(), "firstPlayDate", term3744);
        setField(term3610, term3610.getClass(), "lastGameId", "mvrkADEgpp");
        setField(term3610, term3610.getClass(), "lastRomVersion", "pXOkjyeIRb");
        setField(term3610, term3610.getClass(), "lastDataVersion", "GgZWSjxjyE");
        setIntField(term3791, term3791.getClass(), "year", 2018);
        setShortField(term3791, term3791.getClass(), "month", (short) 7);
        setShortField(term3791, term3791.getClass(), "day", (short) 12);
        setField(term3790, term3790.getClass(), "date", term3791);
        setByteField(term3795, term3795.getClass(), "hour", (byte) 1);
        setByteField(term3795, term3795.getClass(), "minute", (byte) 3);
        setByteField(term3795, term3795.getClass(), "second", (byte) 47);
        setIntField(term3795, term3795.getClass(), "nano", 2729929);
        setField(term3790, term3790.getClass(), "time", term3795);
        setField(term3610, term3610.getClass(), "lastPlayDate", term3790);
        setIntField(term3610, term3610.getClass(), "lastPlaceId", -165587447);
        setField(term3610, term3610.getClass(), "lastPlaceName", "EeBVbzjcCI");
        setField(term3610, term3610.getClass(), "lastRegionId", "UfQtPRyWRC");
        setField(term3610, term3610.getClass(), "lastRegionName", "FPvxVzzSvD");
        setField(term3610, term3610.getClass(), "lastAllNetId", "WHcwFgsGFC");
        setField(term3610, term3610.getClass(), "lastClientId", "HzqpegHiRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPoint", argTypes, term3610, args);
    }

};


