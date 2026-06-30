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

public class UserActivity_setSortNumber_67966374714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47794;
     Object term47977;

    public UserActivity_setSortNumber_67966374714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term47800 = new Long(-2783999800714825789L);
        term47794 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term47796 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term47798 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term47814 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47815 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47819 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47824 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47825 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47829 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term47794, term47794.getClass(), "id", 9062006526792682783L);
        setLongField(term47796, term47796.getClass(), "id", -7400951017937830861L);
        setLongField(term47798, term47798.getClass(), "id", -8993073054427011802L);
        setField(term47798, term47798.getClass(), "extId", term47800);
        setField(term47798, term47798.getClass(), "luid", "rzoDGjHkzG");
        setIntField(term47815, term47815.getClass(), "year", 2028);
        setShortField(term47815, term47815.getClass(), "month", (short) 6);
        setShortField(term47815, term47815.getClass(), "day", (short) 21);
        setField(term47814, term47814.getClass(), "date", term47815);
        setByteField(term47819, term47819.getClass(), "hour", (byte) 2);
        setByteField(term47819, term47819.getClass(), "minute", (byte) 38);
        setByteField(term47819, term47819.getClass(), "second", (byte) 11);
        setIntField(term47819, term47819.getClass(), "nano", 40256095);
        setField(term47814, term47814.getClass(), "time", term47819);
        setField(term47798, term47798.getClass(), "registerTime", term47814);
        setIntField(term47825, term47825.getClass(), "year", 2017);
        setShortField(term47825, term47825.getClass(), "month", (short) 5);
        setShortField(term47825, term47825.getClass(), "day", (short) 17);
        setField(term47824, term47824.getClass(), "date", term47825);
        setByteField(term47829, term47829.getClass(), "hour", (byte) 22);
        setByteField(term47829, term47829.getClass(), "minute", (byte) 56);
        setByteField(term47829, term47829.getClass(), "second", (byte) 28);
        setIntField(term47829, term47829.getClass(), "nano", 581659115);
        setField(term47824, term47824.getClass(), "time", term47829);
        setField(term47798, term47798.getClass(), "accessTime", term47824);
        setField(term47796, term47796.getClass(), "card", term47798);
        setIntField(term47796, term47796.getClass(), "lastDataVersion", -18255187);
        setField(term47796, term47796.getClass(), "userName", "NsphHxYiuC");
        setIntField(term47796, term47796.getClass(), "point", -1088335552);
        setIntField(term47796, term47796.getClass(), "totalPoint", -405643924);
        setIntField(term47796, term47796.getClass(), "iconId", -312877355);
        setIntField(term47796, term47796.getClass(), "nameplateId", -1575759244);
        setIntField(term47796, term47796.getClass(), "frameId", -130757852);
        setIntField(term47796, term47796.getClass(), "trophyId", -1578353749);
        setIntField(term47796, term47796.getClass(), "playCount", -1729440681);
        setIntField(term47796, term47796.getClass(), "playVsCount", -1451086024);
        setIntField(term47796, term47796.getClass(), "playSyncCount", -1484385005);
        setIntField(term47796, term47796.getClass(), "winCount", 1911846407);
        setIntField(term47796, term47796.getClass(), "helpCount", -1861622294);
        setIntField(term47796, term47796.getClass(), "comboCount", -1348867162);
        setIntField(term47796, term47796.getClass(), "feverCount", -1365727758);
        setIntField(term47796, term47796.getClass(), "totalHiScore", -1623272453);
        setIntField(term47796, term47796.getClass(), "totalEasyHighScore", -165330808);
        setIntField(term47796, term47796.getClass(), "totalBasicHighScore", 1087515293);
        setIntField(term47796, term47796.getClass(), "totalAdvancedHighScore", 1480080450);
        setIntField(term47796, term47796.getClass(), "totalExpertHighScore", -1230976797);
        setIntField(term47796, term47796.getClass(), "totalMasterHighScore", 175415190);
        setIntField(term47796, term47796.getClass(), "totalReMasterHighScore", 1375754973);
        setIntField(term47796, term47796.getClass(), "totalHighSync", 1585713609);
        setIntField(term47796, term47796.getClass(), "totalEasySync", 13355218);
        setIntField(term47796, term47796.getClass(), "totalBasicSync", -904535263);
        setIntField(term47796, term47796.getClass(), "totalAdvancedSync", 842353151);
        setIntField(term47796, term47796.getClass(), "totalExpertSync", -1777916559);
        setIntField(term47796, term47796.getClass(), "totalMasterSync", 70751907);
        setIntField(term47796, term47796.getClass(), "totalReMasterSync", 275138155);
        setIntField(term47796, term47796.getClass(), "playerRating", 1382281892);
        setIntField(term47796, term47796.getClass(), "highestRating", -51331217);
        setIntField(term47796, term47796.getClass(), "rankAuthTailId", -803545267);
        setField(term47796, term47796.getClass(), "eventWatchedDate", "XYJztkznbY");
        setField(term47796, term47796.getClass(), "webLimitDate", "NeTiWVoyjZ");
        setIntField(term47796, term47796.getClass(), "challengeTrackPhase", -388367706);
        setIntField(term47796, term47796.getClass(), "firstPlayBits", 183138801);
        setField(term47796, term47796.getClass(), "lastPlayDate", "CGeclMyIOP");
        setIntField(term47796, term47796.getClass(), "lastPlaceId", 688821159);
        setField(term47796, term47796.getClass(), "lastPlaceName", "yyWOYvIBsp");
        setIntField(term47796, term47796.getClass(), "lastRegionId", -150882692);
        setField(term47796, term47796.getClass(), "lastRegionName", "mmpgARMYFV");
        setField(term47796, term47796.getClass(), "lastClientId", "NUqhsZprdZ");
        setField(term47796, term47796.getClass(), "lastCountryCode", "jkzgCqWJrA");
        setIntField(term47796, term47796.getClass(), "eventPoint", -1519638017);
        setIntField(term47796, term47796.getClass(), "totalLv", 195629114);
        setIntField(term47796, term47796.getClass(), "lastLoginBonusDay", -849598898);
        setIntField(term47796, term47796.getClass(), "lastSurvivalBonusDay", 1081526364);
        setIntField(term47796, term47796.getClass(), "loginBonusLv", 1306371805);
        setField(term47794, term47794.getClass(), "user", term47796);
        setIntField(term47794, term47794.getClass(), "kind", -1780897540);
        setIntField(term47794, term47794.getClass(), "activityId", 1460754129);
        setLongField(term47794, term47794.getClass(), "sortNumber", 2287785643837657068L);
        setIntField(term47794, term47794.getClass(), "param1", 1529697463);
        setIntField(term47794, term47794.getClass(), "param2", 26790762);
        setIntField(term47794, term47794.getClass(), "param3", 1788263953);
        setIntField(term47794, term47794.getClass(), "param4", -1672203019);
        term47977 = new Long(-7283193381993602128L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term47977;
        callMethod(klass, "setSortNumber", argTypes, term47794, args);
    }

};


