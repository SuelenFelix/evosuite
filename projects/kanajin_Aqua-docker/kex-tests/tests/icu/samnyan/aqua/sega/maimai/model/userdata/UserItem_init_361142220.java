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

public class UserItem_init_361142220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84295;

    public UserItem_init_361142220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term84299 = new Long(-113028659747841511L);
        term84295 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term84297 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term84313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84318 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84328 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term84295, term84295.getClass(), "id", 2923644849350978175L);
        setLongField(term84297, term84297.getClass(), "id", -575923088526116016L);
        setField(term84297, term84297.getClass(), "extId", term84299);
        setField(term84297, term84297.getClass(), "luid", "TLlyjzxJUz");
        setIntField(term84314, term84314.getClass(), "year", 2027);
        setShortField(term84314, term84314.getClass(), "month", (short) 1);
        setShortField(term84314, term84314.getClass(), "day", (short) 12);
        setField(term84313, term84313.getClass(), "date", term84314);
        setByteField(term84318, term84318.getClass(), "hour", (byte) 12);
        setByteField(term84318, term84318.getClass(), "minute", (byte) 12);
        setByteField(term84318, term84318.getClass(), "second", (byte) 21);
        setIntField(term84318, term84318.getClass(), "nano", 77791222);
        setField(term84313, term84313.getClass(), "time", term84318);
        setField(term84297, term84297.getClass(), "registerTime", term84313);
        setIntField(term84324, term84324.getClass(), "year", 2018);
        setShortField(term84324, term84324.getClass(), "month", (short) 8);
        setShortField(term84324, term84324.getClass(), "day", (short) 2);
        setField(term84323, term84323.getClass(), "date", term84324);
        setByteField(term84328, term84328.getClass(), "hour", (byte) 20);
        setByteField(term84328, term84328.getClass(), "minute", (byte) 18);
        setByteField(term84328, term84328.getClass(), "second", (byte) 22);
        setIntField(term84328, term84328.getClass(), "nano", 639407296);
        setField(term84323, term84323.getClass(), "time", term84328);
        setField(term84297, term84297.getClass(), "accessTime", term84323);
        setField(term84295, term84295.getClass(), "card", term84297);
        setIntField(term84295, term84295.getClass(), "lastDataVersion", -1774169672);
        setField(term84295, term84295.getClass(), "userName", "YclIWGPKZY");
        setIntField(term84295, term84295.getClass(), "point", 768874655);
        setIntField(term84295, term84295.getClass(), "totalPoint", -920087874);
        setIntField(term84295, term84295.getClass(), "iconId", 284757557);
        setIntField(term84295, term84295.getClass(), "nameplateId", 1694715875);
        setIntField(term84295, term84295.getClass(), "frameId", 579768201);
        setIntField(term84295, term84295.getClass(), "trophyId", -584126552);
        setIntField(term84295, term84295.getClass(), "playCount", -1113474160);
        setIntField(term84295, term84295.getClass(), "playVsCount", 1340976691);
        setIntField(term84295, term84295.getClass(), "playSyncCount", 1699954409);
        setIntField(term84295, term84295.getClass(), "winCount", -857186547);
        setIntField(term84295, term84295.getClass(), "helpCount", 1049037053);
        setIntField(term84295, term84295.getClass(), "comboCount", 1720540106);
        setIntField(term84295, term84295.getClass(), "feverCount", -1295721309);
        setIntField(term84295, term84295.getClass(), "totalHiScore", -346108267);
        setIntField(term84295, term84295.getClass(), "totalEasyHighScore", -451546456);
        setIntField(term84295, term84295.getClass(), "totalBasicHighScore", -152767747);
        setIntField(term84295, term84295.getClass(), "totalAdvancedHighScore", -1245573396);
        setIntField(term84295, term84295.getClass(), "totalExpertHighScore", -195140496);
        setIntField(term84295, term84295.getClass(), "totalMasterHighScore", 76299512);
        setIntField(term84295, term84295.getClass(), "totalReMasterHighScore", -1077055159);
        setIntField(term84295, term84295.getClass(), "totalHighSync", 1932916529);
        setIntField(term84295, term84295.getClass(), "totalEasySync", 322533988);
        setIntField(term84295, term84295.getClass(), "totalBasicSync", -1251060713);
        setIntField(term84295, term84295.getClass(), "totalAdvancedSync", -1767441785);
        setIntField(term84295, term84295.getClass(), "totalExpertSync", -1314126025);
        setIntField(term84295, term84295.getClass(), "totalMasterSync", -2090289623);
        setIntField(term84295, term84295.getClass(), "totalReMasterSync", 1425874865);
        setIntField(term84295, term84295.getClass(), "playerRating", -1183442081);
        setIntField(term84295, term84295.getClass(), "highestRating", 342459522);
        setIntField(term84295, term84295.getClass(), "rankAuthTailId", -559688972);
        setField(term84295, term84295.getClass(), "eventWatchedDate", "gChBjLUhbg");
        setField(term84295, term84295.getClass(), "webLimitDate", "enWkULOykY");
        setIntField(term84295, term84295.getClass(), "challengeTrackPhase", 927911674);
        setIntField(term84295, term84295.getClass(), "firstPlayBits", 1986936570);
        setField(term84295, term84295.getClass(), "lastPlayDate", "BPdcafiAQX");
        setIntField(term84295, term84295.getClass(), "lastPlaceId", 1896963579);
        setField(term84295, term84295.getClass(), "lastPlaceName", "GvmOxwMrOk");
        setIntField(term84295, term84295.getClass(), "lastRegionId", -255528879);
        setField(term84295, term84295.getClass(), "lastRegionName", "WXUKmhwFsK");
        setField(term84295, term84295.getClass(), "lastClientId", "OcfokBTzZZ");
        setField(term84295, term84295.getClass(), "lastCountryCode", "zeBhlhyhkL");
        setIntField(term84295, term84295.getClass(), "eventPoint", -1688608522);
        setIntField(term84295, term84295.getClass(), "totalLv", -1799271429);
        setIntField(term84295, term84295.getClass(), "lastLoginBonusDay", 1073559500);
        setIntField(term84295, term84295.getClass(), "lastSurvivalBonusDay", 1016166965);
        setIntField(term84295, term84295.getClass(), "loginBonusLv", -9310988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term84295;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


