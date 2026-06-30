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

public class UserOption_init_6492515040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50773;

    public UserOption_init_6492515040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term50777 = new Long(4502292577098212311L);
        term50773 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term50775 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term50791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50796 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50801 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50802 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50806 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term50773, term50773.getClass(), "id", 2287449183416662404L);
        setLongField(term50775, term50775.getClass(), "id", -1223573843683081410L);
        setField(term50775, term50775.getClass(), "extId", term50777);
        setField(term50775, term50775.getClass(), "luid", "aEZAnHuGSR");
        setIntField(term50792, term50792.getClass(), "year", 2026);
        setShortField(term50792, term50792.getClass(), "month", (short) 7);
        setShortField(term50792, term50792.getClass(), "day", (short) 18);
        setField(term50791, term50791.getClass(), "date", term50792);
        setByteField(term50796, term50796.getClass(), "hour", (byte) 14);
        setByteField(term50796, term50796.getClass(), "minute", (byte) 29);
        setByteField(term50796, term50796.getClass(), "second", (byte) 53);
        setIntField(term50796, term50796.getClass(), "nano", 285756900);
        setField(term50791, term50791.getClass(), "time", term50796);
        setField(term50775, term50775.getClass(), "registerTime", term50791);
        setIntField(term50802, term50802.getClass(), "year", 2012);
        setShortField(term50802, term50802.getClass(), "month", (short) 2);
        setShortField(term50802, term50802.getClass(), "day", (short) 2);
        setField(term50801, term50801.getClass(), "date", term50802);
        setByteField(term50806, term50806.getClass(), "hour", (byte) 4);
        setByteField(term50806, term50806.getClass(), "minute", (byte) 19);
        setByteField(term50806, term50806.getClass(), "second", (byte) 58);
        setIntField(term50806, term50806.getClass(), "nano", 550709112);
        setField(term50801, term50801.getClass(), "time", term50806);
        setField(term50775, term50775.getClass(), "accessTime", term50801);
        setField(term50773, term50773.getClass(), "card", term50775);
        setIntField(term50773, term50773.getClass(), "lastDataVersion", 1999151227);
        setField(term50773, term50773.getClass(), "userName", "uMzGGnJFYF");
        setIntField(term50773, term50773.getClass(), "point", 288964365);
        setIntField(term50773, term50773.getClass(), "totalPoint", -586935630);
        setIntField(term50773, term50773.getClass(), "iconId", 833837720);
        setIntField(term50773, term50773.getClass(), "nameplateId", 640367895);
        setIntField(term50773, term50773.getClass(), "frameId", -1613119246);
        setIntField(term50773, term50773.getClass(), "trophyId", -580412864);
        setIntField(term50773, term50773.getClass(), "playCount", 1286437691);
        setIntField(term50773, term50773.getClass(), "playVsCount", -447971579);
        setIntField(term50773, term50773.getClass(), "playSyncCount", -2040992903);
        setIntField(term50773, term50773.getClass(), "winCount", -366879890);
        setIntField(term50773, term50773.getClass(), "helpCount", 2127723603);
        setIntField(term50773, term50773.getClass(), "comboCount", 1512218420);
        setIntField(term50773, term50773.getClass(), "feverCount", 745526581);
        setIntField(term50773, term50773.getClass(), "totalHiScore", -699594655);
        setIntField(term50773, term50773.getClass(), "totalEasyHighScore", -1851012399);
        setIntField(term50773, term50773.getClass(), "totalBasicHighScore", -116319790);
        setIntField(term50773, term50773.getClass(), "totalAdvancedHighScore", -1988687324);
        setIntField(term50773, term50773.getClass(), "totalExpertHighScore", -57909074);
        setIntField(term50773, term50773.getClass(), "totalMasterHighScore", 1592412);
        setIntField(term50773, term50773.getClass(), "totalReMasterHighScore", -743417086);
        setIntField(term50773, term50773.getClass(), "totalHighSync", 2040843352);
        setIntField(term50773, term50773.getClass(), "totalEasySync", 1204883248);
        setIntField(term50773, term50773.getClass(), "totalBasicSync", -388281703);
        setIntField(term50773, term50773.getClass(), "totalAdvancedSync", 565641932);
        setIntField(term50773, term50773.getClass(), "totalExpertSync", -648267047);
        setIntField(term50773, term50773.getClass(), "totalMasterSync", -2094100197);
        setIntField(term50773, term50773.getClass(), "totalReMasterSync", 1058557611);
        setIntField(term50773, term50773.getClass(), "playerRating", 43971669);
        setIntField(term50773, term50773.getClass(), "highestRating", 1611498185);
        setIntField(term50773, term50773.getClass(), "rankAuthTailId", 2091252305);
        setField(term50773, term50773.getClass(), "eventWatchedDate", "iAIRLRjFkP");
        setField(term50773, term50773.getClass(), "webLimitDate", "cdXvvxXVTz");
        setIntField(term50773, term50773.getClass(), "challengeTrackPhase", 263368957);
        setIntField(term50773, term50773.getClass(), "firstPlayBits", 1664066639);
        setField(term50773, term50773.getClass(), "lastPlayDate", "tXsfWIqIPn");
        setIntField(term50773, term50773.getClass(), "lastPlaceId", -1987739959);
        setField(term50773, term50773.getClass(), "lastPlaceName", "tDmfqEyHaN");
        setIntField(term50773, term50773.getClass(), "lastRegionId", -1921996045);
        setField(term50773, term50773.getClass(), "lastRegionName", "mTSMXFkWRr");
        setField(term50773, term50773.getClass(), "lastClientId", "qdIiMKwfzT");
        setField(term50773, term50773.getClass(), "lastCountryCode", "qrmUWIxufo");
        setIntField(term50773, term50773.getClass(), "eventPoint", 1689248062);
        setIntField(term50773, term50773.getClass(), "totalLv", -155559246);
        setIntField(term50773, term50773.getClass(), "lastLoginBonusDay", -2121439077);
        setIntField(term50773, term50773.getClass(), "lastSurvivalBonusDay", 1640516155);
        setIntField(term50773, term50773.getClass(), "loginBonusLv", 338143917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term50773;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


