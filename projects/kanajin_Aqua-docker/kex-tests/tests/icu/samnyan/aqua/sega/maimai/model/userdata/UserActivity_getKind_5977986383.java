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

public class UserActivity_getKind_5977986383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44521;

    public UserActivity_getKind_5977986383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term44527 = new Long(5381386339318883012L);
        term44521 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term44523 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term44525 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term44541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44546 = newInstance(Class.forName("java.time.LocalTime"));
        Object term44551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44556 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term44521, term44521.getClass(), "id", -9147545274054597570L);
        setLongField(term44523, term44523.getClass(), "id", -8398381579707958144L);
        setLongField(term44525, term44525.getClass(), "id", -2195061939206930224L);
        setField(term44525, term44525.getClass(), "extId", term44527);
        setField(term44525, term44525.getClass(), "luid", "AQTTebOiZR");
        setIntField(term44542, term44542.getClass(), "year", 2018);
        setShortField(term44542, term44542.getClass(), "month", (short) 12);
        setShortField(term44542, term44542.getClass(), "day", (short) 17);
        setField(term44541, term44541.getClass(), "date", term44542);
        setByteField(term44546, term44546.getClass(), "hour", (byte) 2);
        setByteField(term44546, term44546.getClass(), "minute", (byte) 8);
        setByteField(term44546, term44546.getClass(), "second", (byte) 33);
        setIntField(term44546, term44546.getClass(), "nano", 799805513);
        setField(term44541, term44541.getClass(), "time", term44546);
        setField(term44525, term44525.getClass(), "registerTime", term44541);
        setIntField(term44552, term44552.getClass(), "year", 2015);
        setShortField(term44552, term44552.getClass(), "month", (short) 12);
        setShortField(term44552, term44552.getClass(), "day", (short) 18);
        setField(term44551, term44551.getClass(), "date", term44552);
        setByteField(term44556, term44556.getClass(), "hour", (byte) 21);
        setByteField(term44556, term44556.getClass(), "minute", (byte) 45);
        setByteField(term44556, term44556.getClass(), "second", (byte) 43);
        setIntField(term44556, term44556.getClass(), "nano", 629261984);
        setField(term44551, term44551.getClass(), "time", term44556);
        setField(term44525, term44525.getClass(), "accessTime", term44551);
        setField(term44523, term44523.getClass(), "card", term44525);
        setIntField(term44523, term44523.getClass(), "lastDataVersion", -1395828554);
        setField(term44523, term44523.getClass(), "userName", "mgeIhswNtk");
        setIntField(term44523, term44523.getClass(), "point", -2081139415);
        setIntField(term44523, term44523.getClass(), "totalPoint", 22197373);
        setIntField(term44523, term44523.getClass(), "iconId", 872043914);
        setIntField(term44523, term44523.getClass(), "nameplateId", -1710077493);
        setIntField(term44523, term44523.getClass(), "frameId", -634148056);
        setIntField(term44523, term44523.getClass(), "trophyId", -1791932674);
        setIntField(term44523, term44523.getClass(), "playCount", -2069953525);
        setIntField(term44523, term44523.getClass(), "playVsCount", -1911653858);
        setIntField(term44523, term44523.getClass(), "playSyncCount", 1817540520);
        setIntField(term44523, term44523.getClass(), "winCount", 83060289);
        setIntField(term44523, term44523.getClass(), "helpCount", -2109132583);
        setIntField(term44523, term44523.getClass(), "comboCount", -1992824713);
        setIntField(term44523, term44523.getClass(), "feverCount", 1482207601);
        setIntField(term44523, term44523.getClass(), "totalHiScore", 1943923769);
        setIntField(term44523, term44523.getClass(), "totalEasyHighScore", 125133530);
        setIntField(term44523, term44523.getClass(), "totalBasicHighScore", -1931017542);
        setIntField(term44523, term44523.getClass(), "totalAdvancedHighScore", -619243163);
        setIntField(term44523, term44523.getClass(), "totalExpertHighScore", 228873608);
        setIntField(term44523, term44523.getClass(), "totalMasterHighScore", 1629097013);
        setIntField(term44523, term44523.getClass(), "totalReMasterHighScore", 875017307);
        setIntField(term44523, term44523.getClass(), "totalHighSync", 523540965);
        setIntField(term44523, term44523.getClass(), "totalEasySync", -633850097);
        setIntField(term44523, term44523.getClass(), "totalBasicSync", -1643146660);
        setIntField(term44523, term44523.getClass(), "totalAdvancedSync", -706189295);
        setIntField(term44523, term44523.getClass(), "totalExpertSync", -1332037518);
        setIntField(term44523, term44523.getClass(), "totalMasterSync", -861800248);
        setIntField(term44523, term44523.getClass(), "totalReMasterSync", -1398648244);
        setIntField(term44523, term44523.getClass(), "playerRating", 850063561);
        setIntField(term44523, term44523.getClass(), "highestRating", -1157169769);
        setIntField(term44523, term44523.getClass(), "rankAuthTailId", -718673454);
        setField(term44523, term44523.getClass(), "eventWatchedDate", "QwKYpiVQlL");
        setField(term44523, term44523.getClass(), "webLimitDate", "kSGsHNQQoW");
        setIntField(term44523, term44523.getClass(), "challengeTrackPhase", -662035181);
        setIntField(term44523, term44523.getClass(), "firstPlayBits", 430345693);
        setField(term44523, term44523.getClass(), "lastPlayDate", "MWezlyjdaG");
        setIntField(term44523, term44523.getClass(), "lastPlaceId", -516065529);
        setField(term44523, term44523.getClass(), "lastPlaceName", "drpBJuEKQG");
        setIntField(term44523, term44523.getClass(), "lastRegionId", 334889421);
        setField(term44523, term44523.getClass(), "lastRegionName", "GGpORnLrOW");
        setField(term44523, term44523.getClass(), "lastClientId", "gDGZwlpOZx");
        setField(term44523, term44523.getClass(), "lastCountryCode", "gkDpxkHPDg");
        setIntField(term44523, term44523.getClass(), "eventPoint", 624371858);
        setIntField(term44523, term44523.getClass(), "totalLv", -460751227);
        setIntField(term44523, term44523.getClass(), "lastLoginBonusDay", 1608431617);
        setIntField(term44523, term44523.getClass(), "lastSurvivalBonusDay", 112321383);
        setIntField(term44523, term44523.getClass(), "loginBonusLv", 1763430532);
        setField(term44521, term44521.getClass(), "user", term44523);
        setIntField(term44521, term44521.getClass(), "kind", -923019123);
        setIntField(term44521, term44521.getClass(), "activityId", 1425210363);
        setLongField(term44521, term44521.getClass(), "sortNumber", 4525924047960478347L);
        setIntField(term44521, term44521.getClass(), "param1", 656143415);
        setIntField(term44521, term44521.getClass(), "param2", 1654162366);
        setIntField(term44521, term44521.getClass(), "param3", 1659672136);
        setIntField(term44521, term44521.getClass(), "param4", 1379028862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKind", argTypes, term44521, args);
    }

};


