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

public class UserData_setTotalAdvancedHighScore_111772065170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18585;
     Object term18759;

    public UserData_setTotalAdvancedHighScore_111772065170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18589 = new Long(-6723783499250797216L);
        term18585 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term18587 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term18603 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18604 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18608 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18613 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18614 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18618 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term18585, term18585.getClass(), "id", -2924531382671518368L);
        setLongField(term18587, term18587.getClass(), "id", -3948863953565024517L);
        setField(term18587, term18587.getClass(), "extId", term18589);
        setField(term18587, term18587.getClass(), "luid", "iVOvTzOxwt");
        setIntField(term18604, term18604.getClass(), "year", 2010);
        setShortField(term18604, term18604.getClass(), "month", (short) 1);
        setShortField(term18604, term18604.getClass(), "day", (short) 10);
        setField(term18603, term18603.getClass(), "date", term18604);
        setByteField(term18608, term18608.getClass(), "hour", (byte) 12);
        setByteField(term18608, term18608.getClass(), "minute", (byte) 46);
        setByteField(term18608, term18608.getClass(), "second", (byte) 5);
        setIntField(term18608, term18608.getClass(), "nano", 540440953);
        setField(term18603, term18603.getClass(), "time", term18608);
        setField(term18587, term18587.getClass(), "registerTime", term18603);
        setIntField(term18614, term18614.getClass(), "year", 2028);
        setShortField(term18614, term18614.getClass(), "month", (short) 5);
        setShortField(term18614, term18614.getClass(), "day", (short) 7);
        setField(term18613, term18613.getClass(), "date", term18614);
        setByteField(term18618, term18618.getClass(), "hour", (byte) 7);
        setByteField(term18618, term18618.getClass(), "minute", (byte) 48);
        setByteField(term18618, term18618.getClass(), "second", (byte) 4);
        setIntField(term18618, term18618.getClass(), "nano", 380425174);
        setField(term18613, term18613.getClass(), "time", term18618);
        setField(term18587, term18587.getClass(), "accessTime", term18613);
        setField(term18585, term18585.getClass(), "card", term18587);
        setIntField(term18585, term18585.getClass(), "lastDataVersion", -906823990);
        setField(term18585, term18585.getClass(), "userName", "BjZQdecXvB");
        setIntField(term18585, term18585.getClass(), "point", -1670324779);
        setIntField(term18585, term18585.getClass(), "totalPoint", -1696838199);
        setIntField(term18585, term18585.getClass(), "iconId", -1286086755);
        setIntField(term18585, term18585.getClass(), "nameplateId", 724669093);
        setIntField(term18585, term18585.getClass(), "frameId", -2005743628);
        setIntField(term18585, term18585.getClass(), "trophyId", -1204207224);
        setIntField(term18585, term18585.getClass(), "playCount", -77932500);
        setIntField(term18585, term18585.getClass(), "playVsCount", -1558194793);
        setIntField(term18585, term18585.getClass(), "playSyncCount", -13354986);
        setIntField(term18585, term18585.getClass(), "winCount", -2134459880);
        setIntField(term18585, term18585.getClass(), "helpCount", -1811405838);
        setIntField(term18585, term18585.getClass(), "comboCount", 619484749);
        setIntField(term18585, term18585.getClass(), "feverCount", 490271003);
        setIntField(term18585, term18585.getClass(), "totalHiScore", 1541867826);
        setIntField(term18585, term18585.getClass(), "totalEasyHighScore", -137176190);
        setIntField(term18585, term18585.getClass(), "totalBasicHighScore", 348263044);
        setIntField(term18585, term18585.getClass(), "totalAdvancedHighScore", 1394815305);
        setIntField(term18585, term18585.getClass(), "totalExpertHighScore", -315070279);
        setIntField(term18585, term18585.getClass(), "totalMasterHighScore", 62449386);
        setIntField(term18585, term18585.getClass(), "totalReMasterHighScore", -1488558129);
        setIntField(term18585, term18585.getClass(), "totalHighSync", -929614389);
        setIntField(term18585, term18585.getClass(), "totalEasySync", 1585326879);
        setIntField(term18585, term18585.getClass(), "totalBasicSync", 1161195592);
        setIntField(term18585, term18585.getClass(), "totalAdvancedSync", -1012640616);
        setIntField(term18585, term18585.getClass(), "totalExpertSync", -552664740);
        setIntField(term18585, term18585.getClass(), "totalMasterSync", -1639838200);
        setIntField(term18585, term18585.getClass(), "totalReMasterSync", -60462175);
        setIntField(term18585, term18585.getClass(), "playerRating", 1315997028);
        setIntField(term18585, term18585.getClass(), "highestRating", 1268210239);
        setIntField(term18585, term18585.getClass(), "rankAuthTailId", -697986260);
        setField(term18585, term18585.getClass(), "eventWatchedDate", "iUkOOQhEkw");
        setField(term18585, term18585.getClass(), "webLimitDate", "wmVoFoUVmU");
        setIntField(term18585, term18585.getClass(), "challengeTrackPhase", -672315403);
        setIntField(term18585, term18585.getClass(), "firstPlayBits", 507507290);
        setField(term18585, term18585.getClass(), "lastPlayDate", "lLiSiPCciB");
        setIntField(term18585, term18585.getClass(), "lastPlaceId", 9057138);
        setField(term18585, term18585.getClass(), "lastPlaceName", "PsMKIIEwdR");
        setIntField(term18585, term18585.getClass(), "lastRegionId", 2130019201);
        setField(term18585, term18585.getClass(), "lastRegionName", "RbQmXqfXAT");
        setField(term18585, term18585.getClass(), "lastClientId", "fcCAsvfBbe");
        setField(term18585, term18585.getClass(), "lastCountryCode", "mUNcKUxghj");
        setIntField(term18585, term18585.getClass(), "eventPoint", 504634766);
        setIntField(term18585, term18585.getClass(), "totalLv", 1963462917);
        setIntField(term18585, term18585.getClass(), "lastLoginBonusDay", 552203554);
        setIntField(term18585, term18585.getClass(), "lastSurvivalBonusDay", 1645215896);
        setIntField(term18585, term18585.getClass(), "loginBonusLv", -914100840);
        term18759 = new Integer(1806294616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18759;
        callMethod(klass, "setTotalAdvancedHighScore", argTypes, term18585, args);
    }

};


