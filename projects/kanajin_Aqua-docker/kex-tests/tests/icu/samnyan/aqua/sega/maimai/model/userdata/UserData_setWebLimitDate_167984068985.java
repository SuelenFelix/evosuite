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

public class UserData_setWebLimitDate_167984068985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22595;

    public UserData_setWebLimitDate_167984068985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22599 = new Long(4474998035090263139L);
        term22595 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term22597 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term22613 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22614 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22618 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22628 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term22595, term22595.getClass(), "id", -3730936709704460408L);
        setLongField(term22597, term22597.getClass(), "id", -8614778293741404325L);
        setField(term22597, term22597.getClass(), "extId", term22599);
        setField(term22597, term22597.getClass(), "luid", "uOJFOUcNvv");
        setIntField(term22614, term22614.getClass(), "year", 2026);
        setShortField(term22614, term22614.getClass(), "month", (short) 7);
        setShortField(term22614, term22614.getClass(), "day", (short) 4);
        setField(term22613, term22613.getClass(), "date", term22614);
        setByteField(term22618, term22618.getClass(), "hour", (byte) 8);
        setByteField(term22618, term22618.getClass(), "minute", (byte) 51);
        setByteField(term22618, term22618.getClass(), "second", (byte) 9);
        setIntField(term22618, term22618.getClass(), "nano", 936880887);
        setField(term22613, term22613.getClass(), "time", term22618);
        setField(term22597, term22597.getClass(), "registerTime", term22613);
        setIntField(term22624, term22624.getClass(), "year", 2022);
        setShortField(term22624, term22624.getClass(), "month", (short) 5);
        setShortField(term22624, term22624.getClass(), "day", (short) 26);
        setField(term22623, term22623.getClass(), "date", term22624);
        setByteField(term22628, term22628.getClass(), "hour", (byte) 6);
        setByteField(term22628, term22628.getClass(), "minute", (byte) 54);
        setByteField(term22628, term22628.getClass(), "second", (byte) 49);
        setIntField(term22628, term22628.getClass(), "nano", 822216068);
        setField(term22623, term22623.getClass(), "time", term22628);
        setField(term22597, term22597.getClass(), "accessTime", term22623);
        setField(term22595, term22595.getClass(), "card", term22597);
        setIntField(term22595, term22595.getClass(), "lastDataVersion", 1508089655);
        setField(term22595, term22595.getClass(), "userName", "tkmmGweDwJ");
        setIntField(term22595, term22595.getClass(), "point", 1344738281);
        setIntField(term22595, term22595.getClass(), "totalPoint", 2137586016);
        setIntField(term22595, term22595.getClass(), "iconId", 718944255);
        setIntField(term22595, term22595.getClass(), "nameplateId", -255278880);
        setIntField(term22595, term22595.getClass(), "frameId", 978936508);
        setIntField(term22595, term22595.getClass(), "trophyId", -782282859);
        setIntField(term22595, term22595.getClass(), "playCount", -289872820);
        setIntField(term22595, term22595.getClass(), "playVsCount", 999463901);
        setIntField(term22595, term22595.getClass(), "playSyncCount", -1558642750);
        setIntField(term22595, term22595.getClass(), "winCount", 1177832973);
        setIntField(term22595, term22595.getClass(), "helpCount", -808639910);
        setIntField(term22595, term22595.getClass(), "comboCount", -2087767976);
        setIntField(term22595, term22595.getClass(), "feverCount", 1541808857);
        setIntField(term22595, term22595.getClass(), "totalHiScore", 2007310608);
        setIntField(term22595, term22595.getClass(), "totalEasyHighScore", 462157519);
        setIntField(term22595, term22595.getClass(), "totalBasicHighScore", -875956888);
        setIntField(term22595, term22595.getClass(), "totalAdvancedHighScore", 65647821);
        setIntField(term22595, term22595.getClass(), "totalExpertHighScore", -1289614562);
        setIntField(term22595, term22595.getClass(), "totalMasterHighScore", 201090501);
        setIntField(term22595, term22595.getClass(), "totalReMasterHighScore", -1397182025);
        setIntField(term22595, term22595.getClass(), "totalHighSync", -899619534);
        setIntField(term22595, term22595.getClass(), "totalEasySync", 1638508595);
        setIntField(term22595, term22595.getClass(), "totalBasicSync", -114151747);
        setIntField(term22595, term22595.getClass(), "totalAdvancedSync", -2025145756);
        setIntField(term22595, term22595.getClass(), "totalExpertSync", -1865692813);
        setIntField(term22595, term22595.getClass(), "totalMasterSync", 1996398924);
        setIntField(term22595, term22595.getClass(), "totalReMasterSync", -400305198);
        setIntField(term22595, term22595.getClass(), "playerRating", 1551023146);
        setIntField(term22595, term22595.getClass(), "highestRating", 545151275);
        setIntField(term22595, term22595.getClass(), "rankAuthTailId", -125397975);
        setField(term22595, term22595.getClass(), "eventWatchedDate", "pMfTuAFXxg");
        setField(term22595, term22595.getClass(), "webLimitDate", "XCZmhkblRc");
        setIntField(term22595, term22595.getClass(), "challengeTrackPhase", -595763151);
        setIntField(term22595, term22595.getClass(), "firstPlayBits", -1927187775);
        setField(term22595, term22595.getClass(), "lastPlayDate", "gFUWMydGCU");
        setIntField(term22595, term22595.getClass(), "lastPlaceId", -246129741);
        setField(term22595, term22595.getClass(), "lastPlaceName", "LLegSTfqJt");
        setIntField(term22595, term22595.getClass(), "lastRegionId", -1681312941);
        setField(term22595, term22595.getClass(), "lastRegionName", "XQfmqLbqHS");
        setField(term22595, term22595.getClass(), "lastClientId", "jLVLqQSjqg");
        setField(term22595, term22595.getClass(), "lastCountryCode", "JKGueoHesL");
        setIntField(term22595, term22595.getClass(), "eventPoint", -2026593848);
        setIntField(term22595, term22595.getClass(), "totalLv", -1523977596);
        setIntField(term22595, term22595.getClass(), "lastLoginBonusDay", -1036117253);
        setIntField(term22595, term22595.getClass(), "lastSurvivalBonusDay", -697114016);
        setIntField(term22595, term22595.getClass(), "loginBonusLv", 1991952957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CRAUqtVBkU";
        callMethod(klass, "setWebLimitDate", argTypes, term22595, args);
    }

};


