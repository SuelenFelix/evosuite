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

public class UserData_setWinCount_77015169263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16723;
     Object term16897;

    public UserData_setWinCount_77015169263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16727 = new Long(2062173786000223358L);
        term16723 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term16725 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term16741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16746 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16756 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term16723, term16723.getClass(), "id", -1804015692891701666L);
        setLongField(term16725, term16725.getClass(), "id", -6432617521836576658L);
        setField(term16725, term16725.getClass(), "extId", term16727);
        setField(term16725, term16725.getClass(), "luid", "lJoltmsadS");
        setIntField(term16742, term16742.getClass(), "year", 2014);
        setShortField(term16742, term16742.getClass(), "month", (short) 5);
        setShortField(term16742, term16742.getClass(), "day", (short) 31);
        setField(term16741, term16741.getClass(), "date", term16742);
        setByteField(term16746, term16746.getClass(), "hour", (byte) 16);
        setByteField(term16746, term16746.getClass(), "minute", (byte) 3);
        setByteField(term16746, term16746.getClass(), "second", (byte) 14);
        setIntField(term16746, term16746.getClass(), "nano", 281059649);
        setField(term16741, term16741.getClass(), "time", term16746);
        setField(term16725, term16725.getClass(), "registerTime", term16741);
        setIntField(term16752, term16752.getClass(), "year", 2010);
        setShortField(term16752, term16752.getClass(), "month", (short) 12);
        setShortField(term16752, term16752.getClass(), "day", (short) 30);
        setField(term16751, term16751.getClass(), "date", term16752);
        setByteField(term16756, term16756.getClass(), "hour", (byte) 17);
        setByteField(term16756, term16756.getClass(), "minute", (byte) 44);
        setByteField(term16756, term16756.getClass(), "second", (byte) 59);
        setIntField(term16756, term16756.getClass(), "nano", 881407895);
        setField(term16751, term16751.getClass(), "time", term16756);
        setField(term16725, term16725.getClass(), "accessTime", term16751);
        setField(term16723, term16723.getClass(), "card", term16725);
        setIntField(term16723, term16723.getClass(), "lastDataVersion", 971309393);
        setField(term16723, term16723.getClass(), "userName", "mvfDtZNEHr");
        setIntField(term16723, term16723.getClass(), "point", 1506905403);
        setIntField(term16723, term16723.getClass(), "totalPoint", 1022586170);
        setIntField(term16723, term16723.getClass(), "iconId", -175612916);
        setIntField(term16723, term16723.getClass(), "nameplateId", -1966814722);
        setIntField(term16723, term16723.getClass(), "frameId", -2040048430);
        setIntField(term16723, term16723.getClass(), "trophyId", 795243460);
        setIntField(term16723, term16723.getClass(), "playCount", 1116550927);
        setIntField(term16723, term16723.getClass(), "playVsCount", -1500511650);
        setIntField(term16723, term16723.getClass(), "playSyncCount", 1722619795);
        setIntField(term16723, term16723.getClass(), "winCount", 558598813);
        setIntField(term16723, term16723.getClass(), "helpCount", -282356982);
        setIntField(term16723, term16723.getClass(), "comboCount", 1060240374);
        setIntField(term16723, term16723.getClass(), "feverCount", 2119043046);
        setIntField(term16723, term16723.getClass(), "totalHiScore", 375507053);
        setIntField(term16723, term16723.getClass(), "totalEasyHighScore", 1803067672);
        setIntField(term16723, term16723.getClass(), "totalBasicHighScore", -844822506);
        setIntField(term16723, term16723.getClass(), "totalAdvancedHighScore", -586687174);
        setIntField(term16723, term16723.getClass(), "totalExpertHighScore", 583343799);
        setIntField(term16723, term16723.getClass(), "totalMasterHighScore", 1831635466);
        setIntField(term16723, term16723.getClass(), "totalReMasterHighScore", -981606069);
        setIntField(term16723, term16723.getClass(), "totalHighSync", 548729456);
        setIntField(term16723, term16723.getClass(), "totalEasySync", 482026097);
        setIntField(term16723, term16723.getClass(), "totalBasicSync", -528954009);
        setIntField(term16723, term16723.getClass(), "totalAdvancedSync", -918570985);
        setIntField(term16723, term16723.getClass(), "totalExpertSync", 242181753);
        setIntField(term16723, term16723.getClass(), "totalMasterSync", -1356117545);
        setIntField(term16723, term16723.getClass(), "totalReMasterSync", -1539896141);
        setIntField(term16723, term16723.getClass(), "playerRating", 798480099);
        setIntField(term16723, term16723.getClass(), "highestRating", -1624038595);
        setIntField(term16723, term16723.getClass(), "rankAuthTailId", 1593619323);
        setField(term16723, term16723.getClass(), "eventWatchedDate", "bvSgmFUDOU");
        setField(term16723, term16723.getClass(), "webLimitDate", "XMHwbfiHRl");
        setIntField(term16723, term16723.getClass(), "challengeTrackPhase", -232601868);
        setIntField(term16723, term16723.getClass(), "firstPlayBits", -1743056588);
        setField(term16723, term16723.getClass(), "lastPlayDate", "bucTnYicnp");
        setIntField(term16723, term16723.getClass(), "lastPlaceId", 576646846);
        setField(term16723, term16723.getClass(), "lastPlaceName", "EkgprvqZlM");
        setIntField(term16723, term16723.getClass(), "lastRegionId", 916507296);
        setField(term16723, term16723.getClass(), "lastRegionName", "fbnKvthhOz");
        setField(term16723, term16723.getClass(), "lastClientId", "PGfCDJTBek");
        setField(term16723, term16723.getClass(), "lastCountryCode", "ZwjARhAtHC");
        setIntField(term16723, term16723.getClass(), "eventPoint", 1307887729);
        setIntField(term16723, term16723.getClass(), "totalLv", 1628336669);
        setIntField(term16723, term16723.getClass(), "lastLoginBonusDay", 466807421);
        setIntField(term16723, term16723.getClass(), "lastSurvivalBonusDay", -407675703);
        setIntField(term16723, term16723.getClass(), "loginBonusLv", -429960516);
        term16897 = new Integer(-630727180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16897;
        callMethod(klass, "setWinCount", argTypes, term16723, args);
    }

};


