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

public class UserActivity_toString_27509460322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49990;

    public UserActivity_toString_27509460322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49996 = new Long(4616440478358528406L);
        term49990 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term49992 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term49994 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term50010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50011 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50015 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50020 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50021 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50025 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term49990, term49990.getClass(), "id", -1750555031444556464L);
        setLongField(term49992, term49992.getClass(), "id", -3231440836116263235L);
        setLongField(term49994, term49994.getClass(), "id", 8010417010297313651L);
        setField(term49994, term49994.getClass(), "extId", term49996);
        setField(term49994, term49994.getClass(), "luid", "PhGPFLIMKH");
        setIntField(term50011, term50011.getClass(), "year", 2016);
        setShortField(term50011, term50011.getClass(), "month", (short) 2);
        setShortField(term50011, term50011.getClass(), "day", (short) 12);
        setField(term50010, term50010.getClass(), "date", term50011);
        setByteField(term50015, term50015.getClass(), "hour", (byte) 7);
        setByteField(term50015, term50015.getClass(), "minute", (byte) 16);
        setByteField(term50015, term50015.getClass(), "second", (byte) 55);
        setIntField(term50015, term50015.getClass(), "nano", 690063047);
        setField(term50010, term50010.getClass(), "time", term50015);
        setField(term49994, term49994.getClass(), "registerTime", term50010);
        setIntField(term50021, term50021.getClass(), "year", 2019);
        setShortField(term50021, term50021.getClass(), "month", (short) 3);
        setShortField(term50021, term50021.getClass(), "day", (short) 19);
        setField(term50020, term50020.getClass(), "date", term50021);
        setByteField(term50025, term50025.getClass(), "hour", (byte) 19);
        setByteField(term50025, term50025.getClass(), "minute", (byte) 24);
        setByteField(term50025, term50025.getClass(), "second", (byte) 21);
        setIntField(term50025, term50025.getClass(), "nano", 765889037);
        setField(term50020, term50020.getClass(), "time", term50025);
        setField(term49994, term49994.getClass(), "accessTime", term50020);
        setField(term49992, term49992.getClass(), "card", term49994);
        setIntField(term49992, term49992.getClass(), "lastDataVersion", -1793939688);
        setField(term49992, term49992.getClass(), "userName", "pWCYcLhoms");
        setIntField(term49992, term49992.getClass(), "point", 432386815);
        setIntField(term49992, term49992.getClass(), "totalPoint", -1854296181);
        setIntField(term49992, term49992.getClass(), "iconId", -265101443);
        setIntField(term49992, term49992.getClass(), "nameplateId", -1887921614);
        setIntField(term49992, term49992.getClass(), "frameId", -794058997);
        setIntField(term49992, term49992.getClass(), "trophyId", -847704743);
        setIntField(term49992, term49992.getClass(), "playCount", -996528310);
        setIntField(term49992, term49992.getClass(), "playVsCount", 94400416);
        setIntField(term49992, term49992.getClass(), "playSyncCount", 581671837);
        setIntField(term49992, term49992.getClass(), "winCount", 1416940652);
        setIntField(term49992, term49992.getClass(), "helpCount", 2087868215);
        setIntField(term49992, term49992.getClass(), "comboCount", 261545140);
        setIntField(term49992, term49992.getClass(), "feverCount", -422046674);
        setIntField(term49992, term49992.getClass(), "totalHiScore", -1837895860);
        setIntField(term49992, term49992.getClass(), "totalEasyHighScore", 777103861);
        setIntField(term49992, term49992.getClass(), "totalBasicHighScore", 154973906);
        setIntField(term49992, term49992.getClass(), "totalAdvancedHighScore", -307927063);
        setIntField(term49992, term49992.getClass(), "totalExpertHighScore", -1627954969);
        setIntField(term49992, term49992.getClass(), "totalMasterHighScore", -984062764);
        setIntField(term49992, term49992.getClass(), "totalReMasterHighScore", -1115743900);
        setIntField(term49992, term49992.getClass(), "totalHighSync", 1859865234);
        setIntField(term49992, term49992.getClass(), "totalEasySync", -201519710);
        setIntField(term49992, term49992.getClass(), "totalBasicSync", 746214721);
        setIntField(term49992, term49992.getClass(), "totalAdvancedSync", 219641616);
        setIntField(term49992, term49992.getClass(), "totalExpertSync", -1933520989);
        setIntField(term49992, term49992.getClass(), "totalMasterSync", 1458764208);
        setIntField(term49992, term49992.getClass(), "totalReMasterSync", 1367265936);
        setIntField(term49992, term49992.getClass(), "playerRating", 1755253293);
        setIntField(term49992, term49992.getClass(), "highestRating", 140215223);
        setIntField(term49992, term49992.getClass(), "rankAuthTailId", 1754589351);
        setField(term49992, term49992.getClass(), "eventWatchedDate", "IWNJVfvTuw");
        setField(term49992, term49992.getClass(), "webLimitDate", "DLpKfwPpvr");
        setIntField(term49992, term49992.getClass(), "challengeTrackPhase", 1600131068);
        setIntField(term49992, term49992.getClass(), "firstPlayBits", 1652840562);
        setField(term49992, term49992.getClass(), "lastPlayDate", "DLFXidLbuT");
        setIntField(term49992, term49992.getClass(), "lastPlaceId", 2101098539);
        setField(term49992, term49992.getClass(), "lastPlaceName", "FjkxfTXGIH");
        setIntField(term49992, term49992.getClass(), "lastRegionId", 222587472);
        setField(term49992, term49992.getClass(), "lastRegionName", "KJkWSFFnmR");
        setField(term49992, term49992.getClass(), "lastClientId", "FBYRIDZvmW");
        setField(term49992, term49992.getClass(), "lastCountryCode", "IyjLfrDZrV");
        setIntField(term49992, term49992.getClass(), "eventPoint", -222360853);
        setIntField(term49992, term49992.getClass(), "totalLv", -886522384);
        setIntField(term49992, term49992.getClass(), "lastLoginBonusDay", -1780849406);
        setIntField(term49992, term49992.getClass(), "lastSurvivalBonusDay", -938188610);
        setIntField(term49992, term49992.getClass(), "loginBonusLv", 716282229);
        setField(term49990, term49990.getClass(), "user", term49992);
        setIntField(term49990, term49990.getClass(), "kind", -749259966);
        setIntField(term49990, term49990.getClass(), "activityId", 1042892041);
        setLongField(term49990, term49990.getClass(), "sortNumber", 5845993504299821981L);
        setIntField(term49990, term49990.getClass(), "param1", 1690194849);
        setIntField(term49990, term49990.getClass(), "param2", 411327783);
        setIntField(term49990, term49990.getClass(), "param3", -1499151614);
        setIntField(term49990, term49990.getClass(), "param4", -417329093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term49990, args);
    }

};


