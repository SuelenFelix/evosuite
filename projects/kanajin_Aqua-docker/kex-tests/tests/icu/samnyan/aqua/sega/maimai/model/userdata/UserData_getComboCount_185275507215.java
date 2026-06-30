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

public class UserData_getComboCount_185275507215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3961;

    public UserData_getComboCount_185275507215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3965 = new Long(-872011222785455006L);
        term3961 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3963 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3979 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3980 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3984 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3994 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3961, term3961.getClass(), "id", 6855071767938501807L);
        setLongField(term3963, term3963.getClass(), "id", -5892135042702373494L);
        setField(term3963, term3963.getClass(), "extId", term3965);
        setField(term3963, term3963.getClass(), "luid", "fWKJoSoCwE");
        setIntField(term3980, term3980.getClass(), "year", 2016);
        setShortField(term3980, term3980.getClass(), "month", (short) 6);
        setShortField(term3980, term3980.getClass(), "day", (short) 15);
        setField(term3979, term3979.getClass(), "date", term3980);
        setByteField(term3984, term3984.getClass(), "hour", (byte) 21);
        setByteField(term3984, term3984.getClass(), "minute", (byte) 23);
        setByteField(term3984, term3984.getClass(), "second", (byte) 23);
        setIntField(term3984, term3984.getClass(), "nano", 433372070);
        setField(term3979, term3979.getClass(), "time", term3984);
        setField(term3963, term3963.getClass(), "registerTime", term3979);
        setIntField(term3990, term3990.getClass(), "year", 2012);
        setShortField(term3990, term3990.getClass(), "month", (short) 8);
        setShortField(term3990, term3990.getClass(), "day", (short) 25);
        setField(term3989, term3989.getClass(), "date", term3990);
        setByteField(term3994, term3994.getClass(), "hour", (byte) 19);
        setByteField(term3994, term3994.getClass(), "minute", (byte) 49);
        setByteField(term3994, term3994.getClass(), "second", (byte) 8);
        setIntField(term3994, term3994.getClass(), "nano", 912685024);
        setField(term3989, term3989.getClass(), "time", term3994);
        setField(term3963, term3963.getClass(), "accessTime", term3989);
        setField(term3961, term3961.getClass(), "card", term3963);
        setIntField(term3961, term3961.getClass(), "lastDataVersion", 1091954101);
        setField(term3961, term3961.getClass(), "userName", "wfaXBpWAUH");
        setIntField(term3961, term3961.getClass(), "point", 1895143076);
        setIntField(term3961, term3961.getClass(), "totalPoint", 1981860404);
        setIntField(term3961, term3961.getClass(), "iconId", 732174235);
        setIntField(term3961, term3961.getClass(), "nameplateId", 470895808);
        setIntField(term3961, term3961.getClass(), "frameId", 1787325291);
        setIntField(term3961, term3961.getClass(), "trophyId", 1470349147);
        setIntField(term3961, term3961.getClass(), "playCount", -255317272);
        setIntField(term3961, term3961.getClass(), "playVsCount", -706253892);
        setIntField(term3961, term3961.getClass(), "playSyncCount", -1341439819);
        setIntField(term3961, term3961.getClass(), "winCount", -728760750);
        setIntField(term3961, term3961.getClass(), "helpCount", -1617383807);
        setIntField(term3961, term3961.getClass(), "comboCount", -1244386281);
        setIntField(term3961, term3961.getClass(), "feverCount", -885788574);
        setIntField(term3961, term3961.getClass(), "totalHiScore", -865722613);
        setIntField(term3961, term3961.getClass(), "totalEasyHighScore", -1551355284);
        setIntField(term3961, term3961.getClass(), "totalBasicHighScore", -1381970335);
        setIntField(term3961, term3961.getClass(), "totalAdvancedHighScore", 1213549815);
        setIntField(term3961, term3961.getClass(), "totalExpertHighScore", -1518419301);
        setIntField(term3961, term3961.getClass(), "totalMasterHighScore", 674879025);
        setIntField(term3961, term3961.getClass(), "totalReMasterHighScore", -1538936030);
        setIntField(term3961, term3961.getClass(), "totalHighSync", -752870423);
        setIntField(term3961, term3961.getClass(), "totalEasySync", -1698809299);
        setIntField(term3961, term3961.getClass(), "totalBasicSync", 401512128);
        setIntField(term3961, term3961.getClass(), "totalAdvancedSync", -2069930777);
        setIntField(term3961, term3961.getClass(), "totalExpertSync", 1543696412);
        setIntField(term3961, term3961.getClass(), "totalMasterSync", -1385748168);
        setIntField(term3961, term3961.getClass(), "totalReMasterSync", -270592367);
        setIntField(term3961, term3961.getClass(), "playerRating", 178847646);
        setIntField(term3961, term3961.getClass(), "highestRating", 273590437);
        setIntField(term3961, term3961.getClass(), "rankAuthTailId", -348612876);
        setField(term3961, term3961.getClass(), "eventWatchedDate", "VMeAzAHwZj");
        setField(term3961, term3961.getClass(), "webLimitDate", "PznxWXsZME");
        setIntField(term3961, term3961.getClass(), "challengeTrackPhase", 1302807565);
        setIntField(term3961, term3961.getClass(), "firstPlayBits", -838848221);
        setField(term3961, term3961.getClass(), "lastPlayDate", "ZzIujlwVsw");
        setIntField(term3961, term3961.getClass(), "lastPlaceId", 1163761623);
        setField(term3961, term3961.getClass(), "lastPlaceName", "LWyEaeIyAo");
        setIntField(term3961, term3961.getClass(), "lastRegionId", 718742281);
        setField(term3961, term3961.getClass(), "lastRegionName", "yVMkkQhvmN");
        setField(term3961, term3961.getClass(), "lastClientId", "mvrkADEgpp");
        setField(term3961, term3961.getClass(), "lastCountryCode", "pXOkjyeIRb");
        setIntField(term3961, term3961.getClass(), "eventPoint", 1532723756);
        setIntField(term3961, term3961.getClass(), "totalLv", -124088550);
        setIntField(term3961, term3961.getClass(), "lastLoginBonusDay", 777492093);
        setIntField(term3961, term3961.getClass(), "lastSurvivalBonusDay", 1414025609);
        setIntField(term3961, term3961.getClass(), "loginBonusLv", 255145822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComboCount", argTypes, term3961, args);
    }

};


