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

public class UserData_getLastClientId_65778022443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11353;

    public UserData_getLastClientId_65778022443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11357 = new Long(-6645965768855543712L);
        term11353 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term11355 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term11371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11376 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11386 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term11353, term11353.getClass(), "id", 4474998035090263139L);
        setLongField(term11355, term11355.getClass(), "id", 2848819812340321742L);
        setField(term11355, term11355.getClass(), "extId", term11357);
        setField(term11355, term11355.getClass(), "luid", "zLMTXDQHYH");
        setIntField(term11372, term11372.getClass(), "year", 2025);
        setShortField(term11372, term11372.getClass(), "month", (short) 12);
        setShortField(term11372, term11372.getClass(), "day", (short) 16);
        setField(term11371, term11371.getClass(), "date", term11372);
        setByteField(term11376, term11376.getClass(), "hour", (byte) 7);
        setByteField(term11376, term11376.getClass(), "minute", (byte) 53);
        setByteField(term11376, term11376.getClass(), "second", (byte) 23);
        setIntField(term11376, term11376.getClass(), "nano", 532991944);
        setField(term11371, term11371.getClass(), "time", term11376);
        setField(term11355, term11355.getClass(), "registerTime", term11371);
        setIntField(term11382, term11382.getClass(), "year", 2024);
        setShortField(term11382, term11382.getClass(), "month", (short) 2);
        setShortField(term11382, term11382.getClass(), "day", (short) 5);
        setField(term11381, term11381.getClass(), "date", term11382);
        setByteField(term11386, term11386.getClass(), "hour", (byte) 12);
        setByteField(term11386, term11386.getClass(), "minute", (byte) 28);
        setByteField(term11386, term11386.getClass(), "second", (byte) 37);
        setIntField(term11386, term11386.getClass(), "nano", 689695229);
        setField(term11381, term11381.getClass(), "time", term11386);
        setField(term11355, term11355.getClass(), "accessTime", term11381);
        setField(term11353, term11353.getClass(), "card", term11355);
        setIntField(term11353, term11353.getClass(), "lastDataVersion", 2111611214);
        setField(term11353, term11353.getClass(), "userName", "PqywFWJlpE");
        setIntField(term11353, term11353.getClass(), "point", -2031129784);
        setIntField(term11353, term11353.getClass(), "totalPoint", 251039122);
        setIntField(term11353, term11353.getClass(), "iconId", 459471826);
        setIntField(term11353, term11353.getClass(), "nameplateId", -1054011286);
        setIntField(term11353, term11353.getClass(), "frameId", -1640361091);
        setIntField(term11353, term11353.getClass(), "trophyId", -1908164516);
        setIntField(term11353, term11353.getClass(), "playCount", -1343269854);
        setIntField(term11353, term11353.getClass(), "playVsCount", -731459309);
        setIntField(term11353, term11353.getClass(), "playSyncCount", -913468095);
        setIntField(term11353, term11353.getClass(), "winCount", 38489871);
        setIntField(term11353, term11353.getClass(), "helpCount", -1667787735);
        setIntField(term11353, term11353.getClass(), "comboCount", 1841765799);
        setIntField(term11353, term11353.getClass(), "feverCount", 72160200);
        setIntField(term11353, term11353.getClass(), "totalHiScore", -1870567623);
        setIntField(term11353, term11353.getClass(), "totalEasyHighScore", -1442923471);
        setIntField(term11353, term11353.getClass(), "totalBasicHighScore", -434247549);
        setIntField(term11353, term11353.getClass(), "totalAdvancedHighScore", 1246505552);
        setIntField(term11353, term11353.getClass(), "totalExpertHighScore", -1456497810);
        setIntField(term11353, term11353.getClass(), "totalMasterHighScore", 61954667);
        setIntField(term11353, term11353.getClass(), "totalReMasterHighScore", -919022885);
        setIntField(term11353, term11353.getClass(), "totalHighSync", -1836286878);
        setIntField(term11353, term11353.getClass(), "totalEasySync", 276336694);
        setIntField(term11353, term11353.getClass(), "totalBasicSync", 1627938506);
        setIntField(term11353, term11353.getClass(), "totalAdvancedSync", 386284750);
        setIntField(term11353, term11353.getClass(), "totalExpertSync", 906856023);
        setIntField(term11353, term11353.getClass(), "totalMasterSync", 198857801);
        setIntField(term11353, term11353.getClass(), "totalReMasterSync", 1342884142);
        setIntField(term11353, term11353.getClass(), "playerRating", -1454325068);
        setIntField(term11353, term11353.getClass(), "highestRating", 346714653);
        setIntField(term11353, term11353.getClass(), "rankAuthTailId", 2121928697);
        setField(term11353, term11353.getClass(), "eventWatchedDate", "OzXRsFGTIp");
        setField(term11353, term11353.getClass(), "webLimitDate", "TjWpyghUWN");
        setIntField(term11353, term11353.getClass(), "challengeTrackPhase", -1741056571);
        setIntField(term11353, term11353.getClass(), "firstPlayBits", 522501050);
        setField(term11353, term11353.getClass(), "lastPlayDate", "dkZFDZxcde");
        setIntField(term11353, term11353.getClass(), "lastPlaceId", 125432890);
        setField(term11353, term11353.getClass(), "lastPlaceName", "WXcZEtUKlI");
        setIntField(term11353, term11353.getClass(), "lastRegionId", -197740561);
        setField(term11353, term11353.getClass(), "lastRegionName", "IkpjUOuWQU");
        setField(term11353, term11353.getClass(), "lastClientId", "boSSpezHeU");
        setField(term11353, term11353.getClass(), "lastCountryCode", "OUeBWNTQDh");
        setIntField(term11353, term11353.getClass(), "eventPoint", -1811706962);
        setIntField(term11353, term11353.getClass(), "totalLv", -1242133071);
        setIntField(term11353, term11353.getClass(), "lastLoginBonusDay", -455052015);
        setIntField(term11353, term11353.getClass(), "lastSurvivalBonusDay", -1322797287);
        setIntField(term11353, term11353.getClass(), "loginBonusLv", -615198242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastClientId", argTypes, term11353, args);
    }

};


