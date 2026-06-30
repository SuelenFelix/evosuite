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

public class UserData_getWinCount_154791015813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3433;

    public UserData_getWinCount_154791015813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3437 = new Long(2535595959091595249L);
        term3433 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3435 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3456 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3461 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3462 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3466 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3433, term3433.getClass(), "id", -7672528020740371001L);
        setLongField(term3435, term3435.getClass(), "id", -4502405999831680926L);
        setField(term3435, term3435.getClass(), "extId", term3437);
        setField(term3435, term3435.getClass(), "luid", "XylxrMBraH");
        setIntField(term3452, term3452.getClass(), "year", 2028);
        setShortField(term3452, term3452.getClass(), "month", (short) 10);
        setShortField(term3452, term3452.getClass(), "day", (short) 1);
        setField(term3451, term3451.getClass(), "date", term3452);
        setByteField(term3456, term3456.getClass(), "hour", (byte) 17);
        setByteField(term3456, term3456.getClass(), "minute", (byte) 29);
        setByteField(term3456, term3456.getClass(), "second", (byte) 30);
        setIntField(term3456, term3456.getClass(), "nano", 845472306);
        setField(term3451, term3451.getClass(), "time", term3456);
        setField(term3435, term3435.getClass(), "registerTime", term3451);
        setIntField(term3462, term3462.getClass(), "year", 2027);
        setShortField(term3462, term3462.getClass(), "month", (short) 2);
        setShortField(term3462, term3462.getClass(), "day", (short) 19);
        setField(term3461, term3461.getClass(), "date", term3462);
        setByteField(term3466, term3466.getClass(), "hour", (byte) 17);
        setByteField(term3466, term3466.getClass(), "minute", (byte) 37);
        setByteField(term3466, term3466.getClass(), "second", (byte) 27);
        setIntField(term3466, term3466.getClass(), "nano", 920380537);
        setField(term3461, term3461.getClass(), "time", term3466);
        setField(term3435, term3435.getClass(), "accessTime", term3461);
        setField(term3433, term3433.getClass(), "card", term3435);
        setIntField(term3433, term3433.getClass(), "lastDataVersion", 2027686272);
        setField(term3433, term3433.getClass(), "userName", "pORebkoRdD");
        setIntField(term3433, term3433.getClass(), "point", -1494356104);
        setIntField(term3433, term3433.getClass(), "totalPoint", -695279311);
        setIntField(term3433, term3433.getClass(), "iconId", 114279242);
        setIntField(term3433, term3433.getClass(), "nameplateId", 990883365);
        setIntField(term3433, term3433.getClass(), "frameId", 633598642);
        setIntField(term3433, term3433.getClass(), "trophyId", 1862841859);
        setIntField(term3433, term3433.getClass(), "playCount", -1114668574);
        setIntField(term3433, term3433.getClass(), "playVsCount", 514511037);
        setIntField(term3433, term3433.getClass(), "playSyncCount", 1713573821);
        setIntField(term3433, term3433.getClass(), "winCount", 1956590498);
        setIntField(term3433, term3433.getClass(), "helpCount", 1467356494);
        setIntField(term3433, term3433.getClass(), "comboCount", -26316536);
        setIntField(term3433, term3433.getClass(), "feverCount", 1716165145);
        setIntField(term3433, term3433.getClass(), "totalHiScore", 1692937831);
        setIntField(term3433, term3433.getClass(), "totalEasyHighScore", -1539747985);
        setIntField(term3433, term3433.getClass(), "totalBasicHighScore", -1982489643);
        setIntField(term3433, term3433.getClass(), "totalAdvancedHighScore", 550892835);
        setIntField(term3433, term3433.getClass(), "totalExpertHighScore", 1237549886);
        setIntField(term3433, term3433.getClass(), "totalMasterHighScore", -1945635750);
        setIntField(term3433, term3433.getClass(), "totalReMasterHighScore", -1622760744);
        setIntField(term3433, term3433.getClass(), "totalHighSync", 2068435279);
        setIntField(term3433, term3433.getClass(), "totalEasySync", -1556527718);
        setIntField(term3433, term3433.getClass(), "totalBasicSync", 895255351);
        setIntField(term3433, term3433.getClass(), "totalAdvancedSync", -1317044799);
        setIntField(term3433, term3433.getClass(), "totalExpertSync", -1428063820);
        setIntField(term3433, term3433.getClass(), "totalMasterSync", -1271375703);
        setIntField(term3433, term3433.getClass(), "totalReMasterSync", 1136208236);
        setIntField(term3433, term3433.getClass(), "playerRating", -1220630391);
        setIntField(term3433, term3433.getClass(), "highestRating", -995822131);
        setIntField(term3433, term3433.getClass(), "rankAuthTailId", -687282231);
        setField(term3433, term3433.getClass(), "eventWatchedDate", "mXGCWJDOqA");
        setField(term3433, term3433.getClass(), "webLimitDate", "dpNsDgfPso");
        setIntField(term3433, term3433.getClass(), "challengeTrackPhase", 1200440315);
        setIntField(term3433, term3433.getClass(), "firstPlayBits", 40571662);
        setField(term3433, term3433.getClass(), "lastPlayDate", "hCWPJQKpdc");
        setIntField(term3433, term3433.getClass(), "lastPlaceId", 1863910269);
        setField(term3433, term3433.getClass(), "lastPlaceName", "WzMEhMXkKx");
        setIntField(term3433, term3433.getClass(), "lastRegionId", 864645689);
        setField(term3433, term3433.getClass(), "lastRegionName", "XOiDvlDhdc");
        setField(term3433, term3433.getClass(), "lastClientId", "AdxvLJhNLe");
        setField(term3433, term3433.getClass(), "lastCountryCode", "lHfTrWKMPk");
        setIntField(term3433, term3433.getClass(), "eventPoint", 279384872);
        setIntField(term3433, term3433.getClass(), "totalLv", 1427305953);
        setIntField(term3433, term3433.getClass(), "lastLoginBonusDay", -781832877);
        setIntField(term3433, term3433.getClass(), "lastSurvivalBonusDay", 797203987);
        setIntField(term3433, term3433.getClass(), "loginBonusLv", 1973060703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWinCount", argTypes, term3433, args);
    }

};


