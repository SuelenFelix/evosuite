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

public class UserActivity_setKind_38680881612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47244;
     Object term47427;

    public UserActivity_setKind_38680881612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term47250 = new Long(4100236067313034103L);
        term47244 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term47246 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term47248 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term47264 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47265 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47269 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47274 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47275 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47279 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term47244, term47244.getClass(), "id", -2691996476200751382L);
        setLongField(term47246, term47246.getClass(), "id", -3806202176947356197L);
        setLongField(term47248, term47248.getClass(), "id", -5534222035915952617L);
        setField(term47248, term47248.getClass(), "extId", term47250);
        setField(term47248, term47248.getClass(), "luid", "ILoodMZrgR");
        setIntField(term47265, term47265.getClass(), "year", 2010);
        setShortField(term47265, term47265.getClass(), "month", (short) 5);
        setShortField(term47265, term47265.getClass(), "day", (short) 21);
        setField(term47264, term47264.getClass(), "date", term47265);
        setByteField(term47269, term47269.getClass(), "hour", (byte) 2);
        setByteField(term47269, term47269.getClass(), "minute", (byte) 7);
        setByteField(term47269, term47269.getClass(), "second", (byte) 22);
        setIntField(term47269, term47269.getClass(), "nano", 178273852);
        setField(term47264, term47264.getClass(), "time", term47269);
        setField(term47248, term47248.getClass(), "registerTime", term47264);
        setIntField(term47275, term47275.getClass(), "year", 2020);
        setShortField(term47275, term47275.getClass(), "month", (short) 7);
        setShortField(term47275, term47275.getClass(), "day", (short) 27);
        setField(term47274, term47274.getClass(), "date", term47275);
        setByteField(term47279, term47279.getClass(), "hour", (byte) 23);
        setByteField(term47279, term47279.getClass(), "minute", (byte) 41);
        setByteField(term47279, term47279.getClass(), "second", (byte) 32);
        setIntField(term47279, term47279.getClass(), "nano", 523353963);
        setField(term47274, term47274.getClass(), "time", term47279);
        setField(term47248, term47248.getClass(), "accessTime", term47274);
        setField(term47246, term47246.getClass(), "card", term47248);
        setIntField(term47246, term47246.getClass(), "lastDataVersion", -2000221306);
        setField(term47246, term47246.getClass(), "userName", "XQiKmsCacK");
        setIntField(term47246, term47246.getClass(), "point", -1480264652);
        setIntField(term47246, term47246.getClass(), "totalPoint", 950199901);
        setIntField(term47246, term47246.getClass(), "iconId", -566918920);
        setIntField(term47246, term47246.getClass(), "nameplateId", -516485250);
        setIntField(term47246, term47246.getClass(), "frameId", -1315484955);
        setIntField(term47246, term47246.getClass(), "trophyId", 1864285170);
        setIntField(term47246, term47246.getClass(), "playCount", -1621410076);
        setIntField(term47246, term47246.getClass(), "playVsCount", -239419301);
        setIntField(term47246, term47246.getClass(), "playSyncCount", 1572833583);
        setIntField(term47246, term47246.getClass(), "winCount", -404366819);
        setIntField(term47246, term47246.getClass(), "helpCount", 417600776);
        setIntField(term47246, term47246.getClass(), "comboCount", -821143832);
        setIntField(term47246, term47246.getClass(), "feverCount", -1416902664);
        setIntField(term47246, term47246.getClass(), "totalHiScore", -1435299233);
        setIntField(term47246, term47246.getClass(), "totalEasyHighScore", -1100306206);
        setIntField(term47246, term47246.getClass(), "totalBasicHighScore", 68958966);
        setIntField(term47246, term47246.getClass(), "totalAdvancedHighScore", 349586221);
        setIntField(term47246, term47246.getClass(), "totalExpertHighScore", -2038396357);
        setIntField(term47246, term47246.getClass(), "totalMasterHighScore", -1334161201);
        setIntField(term47246, term47246.getClass(), "totalReMasterHighScore", -2125960665);
        setIntField(term47246, term47246.getClass(), "totalHighSync", -755852794);
        setIntField(term47246, term47246.getClass(), "totalEasySync", -881250262);
        setIntField(term47246, term47246.getClass(), "totalBasicSync", 803280886);
        setIntField(term47246, term47246.getClass(), "totalAdvancedSync", -1274349559);
        setIntField(term47246, term47246.getClass(), "totalExpertSync", 620253070);
        setIntField(term47246, term47246.getClass(), "totalMasterSync", 391646161);
        setIntField(term47246, term47246.getClass(), "totalReMasterSync", 1556323428);
        setIntField(term47246, term47246.getClass(), "playerRating", -1121322138);
        setIntField(term47246, term47246.getClass(), "highestRating", 320229218);
        setIntField(term47246, term47246.getClass(), "rankAuthTailId", -416293515);
        setField(term47246, term47246.getClass(), "eventWatchedDate", "cTCixEbHYT");
        setField(term47246, term47246.getClass(), "webLimitDate", "bqKksqtAdT");
        setIntField(term47246, term47246.getClass(), "challengeTrackPhase", 814623608);
        setIntField(term47246, term47246.getClass(), "firstPlayBits", 1611955417);
        setField(term47246, term47246.getClass(), "lastPlayDate", "jAIAdEmULK");
        setIntField(term47246, term47246.getClass(), "lastPlaceId", 1393785528);
        setField(term47246, term47246.getClass(), "lastPlaceName", "EuAshkmbna");
        setIntField(term47246, term47246.getClass(), "lastRegionId", -666320722);
        setField(term47246, term47246.getClass(), "lastRegionName", "JwQlbBbGJR");
        setField(term47246, term47246.getClass(), "lastClientId", "HdWLwfVsAM");
        setField(term47246, term47246.getClass(), "lastCountryCode", "SxeKEdHXSl");
        setIntField(term47246, term47246.getClass(), "eventPoint", -307183487);
        setIntField(term47246, term47246.getClass(), "totalLv", 1944402596);
        setIntField(term47246, term47246.getClass(), "lastLoginBonusDay", 1104970147);
        setIntField(term47246, term47246.getClass(), "lastSurvivalBonusDay", -1654077862);
        setIntField(term47246, term47246.getClass(), "loginBonusLv", 1321847205);
        setField(term47244, term47244.getClass(), "user", term47246);
        setIntField(term47244, term47244.getClass(), "kind", -1616030271);
        setIntField(term47244, term47244.getClass(), "activityId", 222268564);
        setLongField(term47244, term47244.getClass(), "sortNumber", 8073378116544724166L);
        setIntField(term47244, term47244.getClass(), "param1", 465025492);
        setIntField(term47244, term47244.getClass(), "param2", 1522390788);
        setIntField(term47244, term47244.getClass(), "param3", -1659618250);
        setIntField(term47244, term47244.getClass(), "param4", -1678083548);
        term47427 = new Integer(-318929562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term47427;
        callMethod(klass, "setKind", argTypes, term47244, args);
    }

};


