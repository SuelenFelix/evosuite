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

public class UserData_getTotalEasySync_123249028425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6601;

    public UserData_getTotalEasySync_123249028425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6605 = new Long(7009926388951271268L);
        term6601 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term6603 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term6619 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6624 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6634 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term6601, term6601.getClass(), "id", -5788180182343976541L);
        setLongField(term6603, term6603.getClass(), "id", 2936323121573284007L);
        setField(term6603, term6603.getClass(), "extId", term6605);
        setField(term6603, term6603.getClass(), "luid", "qCpEbQDHdF");
        setIntField(term6620, term6620.getClass(), "year", 2024);
        setShortField(term6620, term6620.getClass(), "month", (short) 5);
        setShortField(term6620, term6620.getClass(), "day", (short) 6);
        setField(term6619, term6619.getClass(), "date", term6620);
        setByteField(term6624, term6624.getClass(), "hour", (byte) 20);
        setByteField(term6624, term6624.getClass(), "minute", (byte) 14);
        setByteField(term6624, term6624.getClass(), "second", (byte) 27);
        setIntField(term6624, term6624.getClass(), "nano", 900636101);
        setField(term6619, term6619.getClass(), "time", term6624);
        setField(term6603, term6603.getClass(), "registerTime", term6619);
        setIntField(term6630, term6630.getClass(), "year", 2021);
        setShortField(term6630, term6630.getClass(), "month", (short) 4);
        setShortField(term6630, term6630.getClass(), "day", (short) 17);
        setField(term6629, term6629.getClass(), "date", term6630);
        setByteField(term6634, term6634.getClass(), "hour", (byte) 4);
        setByteField(term6634, term6634.getClass(), "minute", (byte) 11);
        setByteField(term6634, term6634.getClass(), "second", (byte) 16);
        setIntField(term6634, term6634.getClass(), "nano", 509895858);
        setField(term6629, term6629.getClass(), "time", term6634);
        setField(term6603, term6603.getClass(), "accessTime", term6629);
        setField(term6601, term6601.getClass(), "card", term6603);
        setIntField(term6601, term6601.getClass(), "lastDataVersion", -1042470635);
        setField(term6601, term6601.getClass(), "userName", "AHbZyFOmlo");
        setIntField(term6601, term6601.getClass(), "point", -524352937);
        setIntField(term6601, term6601.getClass(), "totalPoint", 1472218987);
        setIntField(term6601, term6601.getClass(), "iconId", 805176809);
        setIntField(term6601, term6601.getClass(), "nameplateId", -82632953);
        setIntField(term6601, term6601.getClass(), "frameId", -1473876284);
        setIntField(term6601, term6601.getClass(), "trophyId", -1389314671);
        setIntField(term6601, term6601.getClass(), "playCount", -499699841);
        setIntField(term6601, term6601.getClass(), "playVsCount", 360972386);
        setIntField(term6601, term6601.getClass(), "playSyncCount", -2063884849);
        setIntField(term6601, term6601.getClass(), "winCount", 1054887169);
        setIntField(term6601, term6601.getClass(), "helpCount", 692873905);
        setIntField(term6601, term6601.getClass(), "comboCount", 1734759369);
        setIntField(term6601, term6601.getClass(), "feverCount", 1841493736);
        setIntField(term6601, term6601.getClass(), "totalHiScore", 320739944);
        setIntField(term6601, term6601.getClass(), "totalEasyHighScore", 760218111);
        setIntField(term6601, term6601.getClass(), "totalBasicHighScore", -1986366126);
        setIntField(term6601, term6601.getClass(), "totalAdvancedHighScore", -1963228619);
        setIntField(term6601, term6601.getClass(), "totalExpertHighScore", -709868952);
        setIntField(term6601, term6601.getClass(), "totalMasterHighScore", 847207929);
        setIntField(term6601, term6601.getClass(), "totalReMasterHighScore", -1665928103);
        setIntField(term6601, term6601.getClass(), "totalHighSync", 1574458332);
        setIntField(term6601, term6601.getClass(), "totalEasySync", -975856245);
        setIntField(term6601, term6601.getClass(), "totalBasicSync", -1023366103);
        setIntField(term6601, term6601.getClass(), "totalAdvancedSync", 81427089);
        setIntField(term6601, term6601.getClass(), "totalExpertSync", 755951489);
        setIntField(term6601, term6601.getClass(), "totalMasterSync", 1175146356);
        setIntField(term6601, term6601.getClass(), "totalReMasterSync", -2137419728);
        setIntField(term6601, term6601.getClass(), "playerRating", 1558810715);
        setIntField(term6601, term6601.getClass(), "highestRating", -382652403);
        setIntField(term6601, term6601.getClass(), "rankAuthTailId", -2126539433);
        setField(term6601, term6601.getClass(), "eventWatchedDate", "TwfWVQGiIj");
        setField(term6601, term6601.getClass(), "webLimitDate", "gUvcueTURF");
        setIntField(term6601, term6601.getClass(), "challengeTrackPhase", 196952878);
        setIntField(term6601, term6601.getClass(), "firstPlayBits", 802673242);
        setField(term6601, term6601.getClass(), "lastPlayDate", "EwQBhZjCIT");
        setIntField(term6601, term6601.getClass(), "lastPlaceId", -1808638031);
        setField(term6601, term6601.getClass(), "lastPlaceName", "aSkmSwTnEw");
        setIntField(term6601, term6601.getClass(), "lastRegionId", -1514240086);
        setField(term6601, term6601.getClass(), "lastRegionName", "xvkbvaEGYd");
        setField(term6601, term6601.getClass(), "lastClientId", "HBGNxdNURv");
        setField(term6601, term6601.getClass(), "lastCountryCode", "mfCpTPPQQm");
        setIntField(term6601, term6601.getClass(), "eventPoint", 2052244839);
        setIntField(term6601, term6601.getClass(), "totalLv", -1763480506);
        setIntField(term6601, term6601.getClass(), "lastLoginBonusDay", -1541297110);
        setIntField(term6601, term6601.getClass(), "lastSurvivalBonusDay", -1581464804);
        setIntField(term6601, term6601.getClass(), "loginBonusLv", -1954937310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalEasySync", argTypes, term6601, args);
    }

};


