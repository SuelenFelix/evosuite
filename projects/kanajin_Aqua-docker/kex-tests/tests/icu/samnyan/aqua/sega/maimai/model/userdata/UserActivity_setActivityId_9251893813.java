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
import java.lang.Integer;

public class UserActivity_setActivityId_9251893813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47519;
     Object term47702;

    public UserActivity_setActivityId_9251893813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term47525 = new Long(1195529027276497124L);
        term47519 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term47521 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term47523 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term47539 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47540 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47544 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47549 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47550 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47554 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term47519, term47519.getClass(), "id", -8303973304709662279L);
        setLongField(term47521, term47521.getClass(), "id", 6853972830905120647L);
        setLongField(term47523, term47523.getClass(), "id", 1442167273909860961L);
        setField(term47523, term47523.getClass(), "extId", term47525);
        setField(term47523, term47523.getClass(), "luid", "BCAlJpNjIX");
        setIntField(term47540, term47540.getClass(), "year", 2014);
        setShortField(term47540, term47540.getClass(), "month", (short) 2);
        setShortField(term47540, term47540.getClass(), "day", (short) 18);
        setField(term47539, term47539.getClass(), "date", term47540);
        setByteField(term47544, term47544.getClass(), "hour", (byte) 4);
        setByteField(term47544, term47544.getClass(), "minute", (byte) 16);
        setByteField(term47544, term47544.getClass(), "second", (byte) 8);
        setIntField(term47544, term47544.getClass(), "nano", 486006871);
        setField(term47539, term47539.getClass(), "time", term47544);
        setField(term47523, term47523.getClass(), "registerTime", term47539);
        setIntField(term47550, term47550.getClass(), "year", 2024);
        setShortField(term47550, term47550.getClass(), "month", (short) 10);
        setShortField(term47550, term47550.getClass(), "day", (short) 8);
        setField(term47549, term47549.getClass(), "date", term47550);
        setByteField(term47554, term47554.getClass(), "hour", (byte) 19);
        setByteField(term47554, term47554.getClass(), "minute", (byte) 31);
        setByteField(term47554, term47554.getClass(), "second", (byte) 10);
        setIntField(term47554, term47554.getClass(), "nano", 930417883);
        setField(term47549, term47549.getClass(), "time", term47554);
        setField(term47523, term47523.getClass(), "accessTime", term47549);
        setField(term47521, term47521.getClass(), "card", term47523);
        setIntField(term47521, term47521.getClass(), "lastDataVersion", 444110876);
        setField(term47521, term47521.getClass(), "userName", "PKClfBAwUr");
        setIntField(term47521, term47521.getClass(), "point", 1331389613);
        setIntField(term47521, term47521.getClass(), "totalPoint", -112675568);
        setIntField(term47521, term47521.getClass(), "iconId", 1560144379);
        setIntField(term47521, term47521.getClass(), "nameplateId", 1375062894);
        setIntField(term47521, term47521.getClass(), "frameId", -1230393533);
        setIntField(term47521, term47521.getClass(), "trophyId", -1066801533);
        setIntField(term47521, term47521.getClass(), "playCount", -2069135847);
        setIntField(term47521, term47521.getClass(), "playVsCount", -2030631838);
        setIntField(term47521, term47521.getClass(), "playSyncCount", 1097564063);
        setIntField(term47521, term47521.getClass(), "winCount", 2087389339);
        setIntField(term47521, term47521.getClass(), "helpCount", 1125591053);
        setIntField(term47521, term47521.getClass(), "comboCount", -424318105);
        setIntField(term47521, term47521.getClass(), "feverCount", -1529748409);
        setIntField(term47521, term47521.getClass(), "totalHiScore", 755997989);
        setIntField(term47521, term47521.getClass(), "totalEasyHighScore", -794785945);
        setIntField(term47521, term47521.getClass(), "totalBasicHighScore", 1059904606);
        setIntField(term47521, term47521.getClass(), "totalAdvancedHighScore", 994860846);
        setIntField(term47521, term47521.getClass(), "totalExpertHighScore", 726731947);
        setIntField(term47521, term47521.getClass(), "totalMasterHighScore", -2009136728);
        setIntField(term47521, term47521.getClass(), "totalReMasterHighScore", 579864376);
        setIntField(term47521, term47521.getClass(), "totalHighSync", -1048697968);
        setIntField(term47521, term47521.getClass(), "totalEasySync", -892964431);
        setIntField(term47521, term47521.getClass(), "totalBasicSync", 1006790201);
        setIntField(term47521, term47521.getClass(), "totalAdvancedSync", 843806429);
        setIntField(term47521, term47521.getClass(), "totalExpertSync", 283696386);
        setIntField(term47521, term47521.getClass(), "totalMasterSync", 564614202);
        setIntField(term47521, term47521.getClass(), "totalReMasterSync", 677731743);
        setIntField(term47521, term47521.getClass(), "playerRating", 1693950543);
        setIntField(term47521, term47521.getClass(), "highestRating", 1754551236);
        setIntField(term47521, term47521.getClass(), "rankAuthTailId", -348120687);
        setField(term47521, term47521.getClass(), "eventWatchedDate", "JqbKrmVEMy");
        setField(term47521, term47521.getClass(), "webLimitDate", "VygCEWaefB");
        setIntField(term47521, term47521.getClass(), "challengeTrackPhase", -50653203);
        setIntField(term47521, term47521.getClass(), "firstPlayBits", 771255311);
        setField(term47521, term47521.getClass(), "lastPlayDate", "PqhYfEyDDA");
        setIntField(term47521, term47521.getClass(), "lastPlaceId", -1063550375);
        setField(term47521, term47521.getClass(), "lastPlaceName", "fSLHLeuNoa");
        setIntField(term47521, term47521.getClass(), "lastRegionId", 416754757);
        setField(term47521, term47521.getClass(), "lastRegionName", "IwgPFurObw");
        setField(term47521, term47521.getClass(), "lastClientId", "WLaHlrYQyz");
        setField(term47521, term47521.getClass(), "lastCountryCode", "CaeIUTuUFo");
        setIntField(term47521, term47521.getClass(), "eventPoint", -878383495);
        setIntField(term47521, term47521.getClass(), "totalLv", -1333087297);
        setIntField(term47521, term47521.getClass(), "lastLoginBonusDay", 855437401);
        setIntField(term47521, term47521.getClass(), "lastSurvivalBonusDay", 929964148);
        setIntField(term47521, term47521.getClass(), "loginBonusLv", 1226042578);
        setField(term47519, term47519.getClass(), "user", term47521);
        setIntField(term47519, term47519.getClass(), "kind", 1894178312);
        setIntField(term47519, term47519.getClass(), "activityId", 1804953221);
        setLongField(term47519, term47519.getClass(), "sortNumber", 6895382576300001141L);
        setIntField(term47519, term47519.getClass(), "param1", -1246078900);
        setIntField(term47519, term47519.getClass(), "param2", 488994033);
        setIntField(term47519, term47519.getClass(), "param3", 1059681981);
        setIntField(term47519, term47519.getClass(), "param4", 1611223068);
        term47702 = new Integer(1902439631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term47702;
        callMethod(klass, "setActivityId", argTypes, term47519, args);
    }

};


