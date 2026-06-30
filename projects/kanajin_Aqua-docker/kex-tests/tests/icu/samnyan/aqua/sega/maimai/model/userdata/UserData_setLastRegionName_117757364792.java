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

public class UserData_setLastRegionName_117757364792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24517;

    public UserData_setLastRegionName_117757364792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24521 = new Long(-8463029266761149071L);
        term24517 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term24519 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term24535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24540 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24550 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term24517, term24517.getClass(), "id", 3412644969878030772L);
        setLongField(term24519, term24519.getClass(), "id", 6698455537431331246L);
        setField(term24519, term24519.getClass(), "extId", term24521);
        setField(term24519, term24519.getClass(), "luid", "GlPTiCMCGP");
        setIntField(term24536, term24536.getClass(), "year", 2021);
        setShortField(term24536, term24536.getClass(), "month", (short) 5);
        setShortField(term24536, term24536.getClass(), "day", (short) 6);
        setField(term24535, term24535.getClass(), "date", term24536);
        setByteField(term24540, term24540.getClass(), "hour", (byte) 21);
        setByteField(term24540, term24540.getClass(), "minute", (byte) 10);
        setByteField(term24540, term24540.getClass(), "second", (byte) 43);
        setIntField(term24540, term24540.getClass(), "nano", 123313014);
        setField(term24535, term24535.getClass(), "time", term24540);
        setField(term24519, term24519.getClass(), "registerTime", term24535);
        setIntField(term24546, term24546.getClass(), "year", 2011);
        setShortField(term24546, term24546.getClass(), "month", (short) 6);
        setShortField(term24546, term24546.getClass(), "day", (short) 21);
        setField(term24545, term24545.getClass(), "date", term24546);
        setByteField(term24550, term24550.getClass(), "hour", (byte) 3);
        setByteField(term24550, term24550.getClass(), "minute", (byte) 19);
        setByteField(term24550, term24550.getClass(), "second", (byte) 41);
        setIntField(term24550, term24550.getClass(), "nano", 920537748);
        setField(term24545, term24545.getClass(), "time", term24550);
        setField(term24519, term24519.getClass(), "accessTime", term24545);
        setField(term24517, term24517.getClass(), "card", term24519);
        setIntField(term24517, term24517.getClass(), "lastDataVersion", 2123597267);
        setField(term24517, term24517.getClass(), "userName", "jlcBpLoWfd");
        setIntField(term24517, term24517.getClass(), "point", -147077267);
        setIntField(term24517, term24517.getClass(), "totalPoint", -550222549);
        setIntField(term24517, term24517.getClass(), "iconId", -499576898);
        setIntField(term24517, term24517.getClass(), "nameplateId", -686129078);
        setIntField(term24517, term24517.getClass(), "frameId", 1016118972);
        setIntField(term24517, term24517.getClass(), "trophyId", 1276607451);
        setIntField(term24517, term24517.getClass(), "playCount", -547325184);
        setIntField(term24517, term24517.getClass(), "playVsCount", 1470261214);
        setIntField(term24517, term24517.getClass(), "playSyncCount", 1402619496);
        setIntField(term24517, term24517.getClass(), "winCount", 1253501512);
        setIntField(term24517, term24517.getClass(), "helpCount", 594655877);
        setIntField(term24517, term24517.getClass(), "comboCount", 281155455);
        setIntField(term24517, term24517.getClass(), "feverCount", 85079003);
        setIntField(term24517, term24517.getClass(), "totalHiScore", -2010823131);
        setIntField(term24517, term24517.getClass(), "totalEasyHighScore", -1368198865);
        setIntField(term24517, term24517.getClass(), "totalBasicHighScore", -14635574);
        setIntField(term24517, term24517.getClass(), "totalAdvancedHighScore", 2111644026);
        setIntField(term24517, term24517.getClass(), "totalExpertHighScore", 1000189054);
        setIntField(term24517, term24517.getClass(), "totalMasterHighScore", 832500285);
        setIntField(term24517, term24517.getClass(), "totalReMasterHighScore", 1519973734);
        setIntField(term24517, term24517.getClass(), "totalHighSync", -988300994);
        setIntField(term24517, term24517.getClass(), "totalEasySync", 1939692211);
        setIntField(term24517, term24517.getClass(), "totalBasicSync", 121806851);
        setIntField(term24517, term24517.getClass(), "totalAdvancedSync", 1753247664);
        setIntField(term24517, term24517.getClass(), "totalExpertSync", 521507971);
        setIntField(term24517, term24517.getClass(), "totalMasterSync", 1760654275);
        setIntField(term24517, term24517.getClass(), "totalReMasterSync", -1048247843);
        setIntField(term24517, term24517.getClass(), "playerRating", -545135207);
        setIntField(term24517, term24517.getClass(), "highestRating", 969786656);
        setIntField(term24517, term24517.getClass(), "rankAuthTailId", -1568320050);
        setField(term24517, term24517.getClass(), "eventWatchedDate", "oYymmLqbfJ");
        setField(term24517, term24517.getClass(), "webLimitDate", "YaDWphDOSz");
        setIntField(term24517, term24517.getClass(), "challengeTrackPhase", 398869857);
        setIntField(term24517, term24517.getClass(), "firstPlayBits", -2011847985);
        setField(term24517, term24517.getClass(), "lastPlayDate", "nnnmCgFBLw");
        setIntField(term24517, term24517.getClass(), "lastPlaceId", 1113480119);
        setField(term24517, term24517.getClass(), "lastPlaceName", "hSSCyNEhyH");
        setIntField(term24517, term24517.getClass(), "lastRegionId", -159235116);
        setField(term24517, term24517.getClass(), "lastRegionName", "jDFNSuvZqm");
        setField(term24517, term24517.getClass(), "lastClientId", "pLvkKHqNYX");
        setField(term24517, term24517.getClass(), "lastCountryCode", "PwqnuJJwjR");
        setIntField(term24517, term24517.getClass(), "eventPoint", 1280384723);
        setIntField(term24517, term24517.getClass(), "totalLv", 1755299610);
        setIntField(term24517, term24517.getClass(), "lastLoginBonusDay", 1141997389);
        setIntField(term24517, term24517.getClass(), "lastSurvivalBonusDay", -1491507262);
        setIntField(term24517, term24517.getClass(), "loginBonusLv", 1071463645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NFkbBiPeiw";
        callMethod(klass, "setLastRegionName", argTypes, term24517, args);
    }

};


