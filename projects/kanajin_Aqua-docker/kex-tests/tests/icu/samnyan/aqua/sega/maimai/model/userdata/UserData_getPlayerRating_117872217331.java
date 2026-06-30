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

public class UserData_getPlayerRating_117872217331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8185;

    public UserData_getPlayerRating_117872217331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8189 = new Long(-5892135042702373494L);
        term8185 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term8187 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term8203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8218 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term8185, term8185.getClass(), "id", 2443640364875054177L);
        setLongField(term8187, term8187.getClass(), "id", -1610676979013636850L);
        setField(term8187, term8187.getClass(), "extId", term8189);
        setField(term8187, term8187.getClass(), "luid", "TweMFhxNdj");
        setIntField(term8204, term8204.getClass(), "year", 2016);
        setShortField(term8204, term8204.getClass(), "month", (short) 10);
        setShortField(term8204, term8204.getClass(), "day", (short) 20);
        setField(term8203, term8203.getClass(), "date", term8204);
        setByteField(term8208, term8208.getClass(), "hour", (byte) 18);
        setByteField(term8208, term8208.getClass(), "minute", (byte) 39);
        setByteField(term8208, term8208.getClass(), "second", (byte) 1);
        setIntField(term8208, term8208.getClass(), "nano", 196253988);
        setField(term8203, term8203.getClass(), "time", term8208);
        setField(term8187, term8187.getClass(), "registerTime", term8203);
        setIntField(term8214, term8214.getClass(), "year", 2019);
        setShortField(term8214, term8214.getClass(), "month", (short) 1);
        setShortField(term8214, term8214.getClass(), "day", (short) 6);
        setField(term8213, term8213.getClass(), "date", term8214);
        setByteField(term8218, term8218.getClass(), "hour", (byte) 18);
        setByteField(term8218, term8218.getClass(), "minute", (byte) 8);
        setByteField(term8218, term8218.getClass(), "second", (byte) 46);
        setIntField(term8218, term8218.getClass(), "nano", 934136445);
        setField(term8213, term8213.getClass(), "time", term8218);
        setField(term8187, term8187.getClass(), "accessTime", term8213);
        setField(term8185, term8185.getClass(), "card", term8187);
        setIntField(term8185, term8185.getClass(), "lastDataVersion", 939889496);
        setField(term8185, term8185.getClass(), "userName", "NBrvVzvQHe");
        setIntField(term8185, term8185.getClass(), "point", -495242269);
        setIntField(term8185, term8185.getClass(), "totalPoint", 932810106);
        setIntField(term8185, term8185.getClass(), "iconId", -2138801137);
        setIntField(term8185, term8185.getClass(), "nameplateId", -1470115841);
        setIntField(term8185, term8185.getClass(), "frameId", 480909331);
        setIntField(term8185, term8185.getClass(), "trophyId", -2024983877);
        setIntField(term8185, term8185.getClass(), "playCount", 1757149811);
        setIntField(term8185, term8185.getClass(), "playVsCount", 1505375686);
        setIntField(term8185, term8185.getClass(), "playSyncCount", -132005524);
        setIntField(term8185, term8185.getClass(), "winCount", -1235127374);
        setIntField(term8185, term8185.getClass(), "helpCount", -2077814162);
        setIntField(term8185, term8185.getClass(), "comboCount", 444514470);
        setIntField(term8185, term8185.getClass(), "feverCount", -147055177);
        setIntField(term8185, term8185.getClass(), "totalHiScore", 1979044375);
        setIntField(term8185, term8185.getClass(), "totalEasyHighScore", 961252909);
        setIntField(term8185, term8185.getClass(), "totalBasicHighScore", 1455842357);
        setIntField(term8185, term8185.getClass(), "totalAdvancedHighScore", 1349806561);
        setIntField(term8185, term8185.getClass(), "totalExpertHighScore", 923905351);
        setIntField(term8185, term8185.getClass(), "totalMasterHighScore", 428360161);
        setIntField(term8185, term8185.getClass(), "totalReMasterHighScore", 631528579);
        setIntField(term8185, term8185.getClass(), "totalHighSync", -1652091834);
        setIntField(term8185, term8185.getClass(), "totalEasySync", -282021579);
        setIntField(term8185, term8185.getClass(), "totalBasicSync", -1652588127);
        setIntField(term8185, term8185.getClass(), "totalAdvancedSync", -1902823385);
        setIntField(term8185, term8185.getClass(), "totalExpertSync", -784924879);
        setIntField(term8185, term8185.getClass(), "totalMasterSync", -1062027102);
        setIntField(term8185, term8185.getClass(), "totalReMasterSync", 1763217806);
        setIntField(term8185, term8185.getClass(), "playerRating", 1644949396);
        setIntField(term8185, term8185.getClass(), "highestRating", -2017073245);
        setIntField(term8185, term8185.getClass(), "rankAuthTailId", 522440332);
        setField(term8185, term8185.getClass(), "eventWatchedDate", "FjOiNAfBOc");
        setField(term8185, term8185.getClass(), "webLimitDate", "iCCsaLHohG");
        setIntField(term8185, term8185.getClass(), "challengeTrackPhase", 1516598327);
        setIntField(term8185, term8185.getClass(), "firstPlayBits", 82353584);
        setField(term8185, term8185.getClass(), "lastPlayDate", "NJhGgctbdj");
        setIntField(term8185, term8185.getClass(), "lastPlaceId", -758778797);
        setField(term8185, term8185.getClass(), "lastPlaceName", "MYWYUeLGOp");
        setIntField(term8185, term8185.getClass(), "lastRegionId", 765680355);
        setField(term8185, term8185.getClass(), "lastRegionName", "tsTGdgQYUL");
        setField(term8185, term8185.getClass(), "lastClientId", "TtGbVmKcnX");
        setField(term8185, term8185.getClass(), "lastCountryCode", "GJVkUrCVdD");
        setIntField(term8185, term8185.getClass(), "eventPoint", -1012090049);
        setIntField(term8185, term8185.getClass(), "totalLv", -2025214553);
        setIntField(term8185, term8185.getClass(), "lastLoginBonusDay", -154750730);
        setIntField(term8185, term8185.getClass(), "lastSurvivalBonusDay", -2047179134);
        setIntField(term8185, term8185.getClass(), "loginBonusLv", 44908093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term8185, args);
    }

};


