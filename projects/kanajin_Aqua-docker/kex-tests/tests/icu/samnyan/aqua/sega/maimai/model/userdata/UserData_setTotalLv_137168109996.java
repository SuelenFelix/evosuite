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

public class UserData_setTotalLv_137168109996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25641;
     Object term25815;

    public UserData_setTotalLv_137168109996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25645 = new Long(-8085190702504231560L);
        term25641 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term25643 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term25659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25664 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25674 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term25641, term25641.getClass(), "id", 4394651392080968777L);
        setLongField(term25643, term25643.getClass(), "id", -7310273014364148916L);
        setField(term25643, term25643.getClass(), "extId", term25645);
        setField(term25643, term25643.getClass(), "luid", "wIuJvIvEMb");
        setIntField(term25660, term25660.getClass(), "year", 2021);
        setShortField(term25660, term25660.getClass(), "month", (short) 12);
        setShortField(term25660, term25660.getClass(), "day", (short) 23);
        setField(term25659, term25659.getClass(), "date", term25660);
        setByteField(term25664, term25664.getClass(), "hour", (byte) 18);
        setByteField(term25664, term25664.getClass(), "minute", (byte) 52);
        setByteField(term25664, term25664.getClass(), "second", (byte) 27);
        setIntField(term25664, term25664.getClass(), "nano", 512484524);
        setField(term25659, term25659.getClass(), "time", term25664);
        setField(term25643, term25643.getClass(), "registerTime", term25659);
        setIntField(term25670, term25670.getClass(), "year", 2012);
        setShortField(term25670, term25670.getClass(), "month", (short) 6);
        setShortField(term25670, term25670.getClass(), "day", (short) 25);
        setField(term25669, term25669.getClass(), "date", term25670);
        setByteField(term25674, term25674.getClass(), "hour", (byte) 2);
        setByteField(term25674, term25674.getClass(), "minute", (byte) 21);
        setByteField(term25674, term25674.getClass(), "second", (byte) 28);
        setIntField(term25674, term25674.getClass(), "nano", 605177282);
        setField(term25669, term25669.getClass(), "time", term25674);
        setField(term25643, term25643.getClass(), "accessTime", term25669);
        setField(term25641, term25641.getClass(), "card", term25643);
        setIntField(term25641, term25641.getClass(), "lastDataVersion", -838891056);
        setField(term25641, term25641.getClass(), "userName", "EyojsbSjWT");
        setIntField(term25641, term25641.getClass(), "point", -2133180225);
        setIntField(term25641, term25641.getClass(), "totalPoint", -1486915040);
        setIntField(term25641, term25641.getClass(), "iconId", -1960290626);
        setIntField(term25641, term25641.getClass(), "nameplateId", -1941903722);
        setIntField(term25641, term25641.getClass(), "frameId", 491009356);
        setIntField(term25641, term25641.getClass(), "trophyId", 1180952236);
        setIntField(term25641, term25641.getClass(), "playCount", 1549827025);
        setIntField(term25641, term25641.getClass(), "playVsCount", 523998499);
        setIntField(term25641, term25641.getClass(), "playSyncCount", -808741755);
        setIntField(term25641, term25641.getClass(), "winCount", -1088446142);
        setIntField(term25641, term25641.getClass(), "helpCount", 342337914);
        setIntField(term25641, term25641.getClass(), "comboCount", 920216419);
        setIntField(term25641, term25641.getClass(), "feverCount", -1576226952);
        setIntField(term25641, term25641.getClass(), "totalHiScore", 1555746325);
        setIntField(term25641, term25641.getClass(), "totalEasyHighScore", -1910031809);
        setIntField(term25641, term25641.getClass(), "totalBasicHighScore", 1270786654);
        setIntField(term25641, term25641.getClass(), "totalAdvancedHighScore", -1971037654);
        setIntField(term25641, term25641.getClass(), "totalExpertHighScore", -1001929512);
        setIntField(term25641, term25641.getClass(), "totalMasterHighScore", 1783875922);
        setIntField(term25641, term25641.getClass(), "totalReMasterHighScore", -1504060723);
        setIntField(term25641, term25641.getClass(), "totalHighSync", 1458290326);
        setIntField(term25641, term25641.getClass(), "totalEasySync", 1025606001);
        setIntField(term25641, term25641.getClass(), "totalBasicSync", -1227561158);
        setIntField(term25641, term25641.getClass(), "totalAdvancedSync", -1853440273);
        setIntField(term25641, term25641.getClass(), "totalExpertSync", 1884281846);
        setIntField(term25641, term25641.getClass(), "totalMasterSync", -1779176468);
        setIntField(term25641, term25641.getClass(), "totalReMasterSync", -790563662);
        setIntField(term25641, term25641.getClass(), "playerRating", 692290973);
        setIntField(term25641, term25641.getClass(), "highestRating", 344667712);
        setIntField(term25641, term25641.getClass(), "rankAuthTailId", 921447346);
        setField(term25641, term25641.getClass(), "eventWatchedDate", "szGicGyWDL");
        setField(term25641, term25641.getClass(), "webLimitDate", "lkdvUiYwRq");
        setIntField(term25641, term25641.getClass(), "challengeTrackPhase", 1514227664);
        setIntField(term25641, term25641.getClass(), "firstPlayBits", 2000874140);
        setField(term25641, term25641.getClass(), "lastPlayDate", "XuxkPrpfND");
        setIntField(term25641, term25641.getClass(), "lastPlaceId", -701728269);
        setField(term25641, term25641.getClass(), "lastPlaceName", "OxNXeKMDje");
        setIntField(term25641, term25641.getClass(), "lastRegionId", -1094813190);
        setField(term25641, term25641.getClass(), "lastRegionName", "hGTqHomrbc");
        setField(term25641, term25641.getClass(), "lastClientId", "NNMBrIWEBw");
        setField(term25641, term25641.getClass(), "lastCountryCode", "GrTaccOQzl");
        setIntField(term25641, term25641.getClass(), "eventPoint", -355401879);
        setIntField(term25641, term25641.getClass(), "totalLv", -1878519758);
        setIntField(term25641, term25641.getClass(), "lastLoginBonusDay", -214099950);
        setIntField(term25641, term25641.getClass(), "lastSurvivalBonusDay", -1324210306);
        setIntField(term25641, term25641.getClass(), "loginBonusLv", -1148507981);
        term25815 = new Integer(149806587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25815;
        callMethod(klass, "setTotalLv", argTypes, term25641, args);
    }

};


