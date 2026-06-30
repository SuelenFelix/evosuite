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

public class UserData_setLastClientId_33656060093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24803;

    public UserData_setLastClientId_33656060093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24807 = new Long(3133860696238261492L);
        term24803 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term24805 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term24821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24826 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24836 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term24803, term24803.getClass(), "id", -8327432141027603933L);
        setLongField(term24805, term24805.getClass(), "id", -433040798405298080L);
        setField(term24805, term24805.getClass(), "extId", term24807);
        setField(term24805, term24805.getClass(), "luid", "tlRvilQyjJ");
        setIntField(term24822, term24822.getClass(), "year", 2020);
        setShortField(term24822, term24822.getClass(), "month", (short) 12);
        setShortField(term24822, term24822.getClass(), "day", (short) 30);
        setField(term24821, term24821.getClass(), "date", term24822);
        setByteField(term24826, term24826.getClass(), "hour", (byte) 2);
        setByteField(term24826, term24826.getClass(), "minute", (byte) 11);
        setByteField(term24826, term24826.getClass(), "second", (byte) 8);
        setIntField(term24826, term24826.getClass(), "nano", 528799251);
        setField(term24821, term24821.getClass(), "time", term24826);
        setField(term24805, term24805.getClass(), "registerTime", term24821);
        setIntField(term24832, term24832.getClass(), "year", 2027);
        setShortField(term24832, term24832.getClass(), "month", (short) 9);
        setShortField(term24832, term24832.getClass(), "day", (short) 29);
        setField(term24831, term24831.getClass(), "date", term24832);
        setByteField(term24836, term24836.getClass(), "hour", (byte) 19);
        setByteField(term24836, term24836.getClass(), "minute", (byte) 13);
        setByteField(term24836, term24836.getClass(), "second", (byte) 31);
        setIntField(term24836, term24836.getClass(), "nano", 854066575);
        setField(term24831, term24831.getClass(), "time", term24836);
        setField(term24805, term24805.getClass(), "accessTime", term24831);
        setField(term24803, term24803.getClass(), "card", term24805);
        setIntField(term24803, term24803.getClass(), "lastDataVersion", 165616136);
        setField(term24803, term24803.getClass(), "userName", "gwTUlYNpjM");
        setIntField(term24803, term24803.getClass(), "point", 887351836);
        setIntField(term24803, term24803.getClass(), "totalPoint", 2002612399);
        setIntField(term24803, term24803.getClass(), "iconId", -1256668289);
        setIntField(term24803, term24803.getClass(), "nameplateId", -1377964851);
        setIntField(term24803, term24803.getClass(), "frameId", -1288314969);
        setIntField(term24803, term24803.getClass(), "trophyId", -1625206430);
        setIntField(term24803, term24803.getClass(), "playCount", 1599734340);
        setIntField(term24803, term24803.getClass(), "playVsCount", 1262425699);
        setIntField(term24803, term24803.getClass(), "playSyncCount", -515051505);
        setIntField(term24803, term24803.getClass(), "winCount", -1071258857);
        setIntField(term24803, term24803.getClass(), "helpCount", 1274665398);
        setIntField(term24803, term24803.getClass(), "comboCount", -1093564935);
        setIntField(term24803, term24803.getClass(), "feverCount", -1092739931);
        setIntField(term24803, term24803.getClass(), "totalHiScore", 859336834);
        setIntField(term24803, term24803.getClass(), "totalEasyHighScore", -924154861);
        setIntField(term24803, term24803.getClass(), "totalBasicHighScore", -1878694006);
        setIntField(term24803, term24803.getClass(), "totalAdvancedHighScore", 1950167487);
        setIntField(term24803, term24803.getClass(), "totalExpertHighScore", 1031826708);
        setIntField(term24803, term24803.getClass(), "totalMasterHighScore", -735726273);
        setIntField(term24803, term24803.getClass(), "totalReMasterHighScore", 1618278091);
        setIntField(term24803, term24803.getClass(), "totalHighSync", -548967985);
        setIntField(term24803, term24803.getClass(), "totalEasySync", -1923425156);
        setIntField(term24803, term24803.getClass(), "totalBasicSync", 1237861885);
        setIntField(term24803, term24803.getClass(), "totalAdvancedSync", 1433214025);
        setIntField(term24803, term24803.getClass(), "totalExpertSync", 1424797105);
        setIntField(term24803, term24803.getClass(), "totalMasterSync", 386281072);
        setIntField(term24803, term24803.getClass(), "totalReMasterSync", -782180775);
        setIntField(term24803, term24803.getClass(), "playerRating", -1971308334);
        setIntField(term24803, term24803.getClass(), "highestRating", -2070149565);
        setIntField(term24803, term24803.getClass(), "rankAuthTailId", 1682543276);
        setField(term24803, term24803.getClass(), "eventWatchedDate", "uXYojRmxrM");
        setField(term24803, term24803.getClass(), "webLimitDate", "cxRwRcodud");
        setIntField(term24803, term24803.getClass(), "challengeTrackPhase", 156914536);
        setIntField(term24803, term24803.getClass(), "firstPlayBits", -1745894636);
        setField(term24803, term24803.getClass(), "lastPlayDate", "GDGBPlYeLn");
        setIntField(term24803, term24803.getClass(), "lastPlaceId", 571282234);
        setField(term24803, term24803.getClass(), "lastPlaceName", "jdQANIXSTq");
        setIntField(term24803, term24803.getClass(), "lastRegionId", 1131350330);
        setField(term24803, term24803.getClass(), "lastRegionName", "stVcZLTNpu");
        setField(term24803, term24803.getClass(), "lastClientId", "LgXdqWrsLL");
        setField(term24803, term24803.getClass(), "lastCountryCode", "bbHWyibNmy");
        setIntField(term24803, term24803.getClass(), "eventPoint", -1463702476);
        setIntField(term24803, term24803.getClass(), "totalLv", 90151812);
        setIntField(term24803, term24803.getClass(), "lastLoginBonusDay", -416703693);
        setIntField(term24803, term24803.getClass(), "lastSurvivalBonusDay", -1718111500);
        setIntField(term24803, term24803.getClass(), "loginBonusLv", 2134049264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vYYOYhWMWZ";
        callMethod(klass, "setLastClientId", argTypes, term24803, args);
    }

};


