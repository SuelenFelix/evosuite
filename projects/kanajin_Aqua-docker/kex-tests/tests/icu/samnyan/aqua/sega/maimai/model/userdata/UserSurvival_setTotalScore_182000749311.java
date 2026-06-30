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

public class UserSurvival_setTotalScore_182000749311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105131;
     Object term105312;

    public UserSurvival_setTotalScore_182000749311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term105137 = new Long(-8398381579707958144L);
        term105131 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term105133 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term105135 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term105151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105156 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105161 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105166 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term105131, term105131.getClass(), "id", -8980424779299328600L);
        setLongField(term105133, term105133.getClass(), "id", -7229609748965405580L);
        setLongField(term105135, term105135.getClass(), "id", 7507072654888524944L);
        setField(term105135, term105135.getClass(), "extId", term105137);
        setField(term105135, term105135.getClass(), "luid", "gIyzpvuRnO");
        setIntField(term105152, term105152.getClass(), "year", 2028);
        setShortField(term105152, term105152.getClass(), "month", (short) 10);
        setShortField(term105152, term105152.getClass(), "day", (short) 5);
        setField(term105151, term105151.getClass(), "date", term105152);
        setByteField(term105156, term105156.getClass(), "hour", (byte) 0);
        setByteField(term105156, term105156.getClass(), "minute", (byte) 53);
        setByteField(term105156, term105156.getClass(), "second", (byte) 18);
        setIntField(term105156, term105156.getClass(), "nano", 567999687);
        setField(term105151, term105151.getClass(), "time", term105156);
        setField(term105135, term105135.getClass(), "registerTime", term105151);
        setIntField(term105162, term105162.getClass(), "year", 2029);
        setShortField(term105162, term105162.getClass(), "month", (short) 7);
        setShortField(term105162, term105162.getClass(), "day", (short) 30);
        setField(term105161, term105161.getClass(), "date", term105162);
        setByteField(term105166, term105166.getClass(), "hour", (byte) 23);
        setByteField(term105166, term105166.getClass(), "minute", (byte) 35);
        setByteField(term105166, term105166.getClass(), "second", (byte) 35);
        setIntField(term105166, term105166.getClass(), "nano", 848673909);
        setField(term105161, term105161.getClass(), "time", term105166);
        setField(term105135, term105135.getClass(), "accessTime", term105161);
        setField(term105133, term105133.getClass(), "card", term105135);
        setIntField(term105133, term105133.getClass(), "lastDataVersion", 706564579);
        setField(term105133, term105133.getClass(), "userName", "oLFNhFdMBL");
        setIntField(term105133, term105133.getClass(), "point", 685229499);
        setIntField(term105133, term105133.getClass(), "totalPoint", -237452608);
        setIntField(term105133, term105133.getClass(), "iconId", -1948272200);
        setIntField(term105133, term105133.getClass(), "nameplateId", -1769055397);
        setIntField(term105133, term105133.getClass(), "frameId", -855345856);
        setIntField(term105133, term105133.getClass(), "trophyId", 466230959);
        setIntField(term105133, term105133.getClass(), "playCount", 771668035);
        setIntField(term105133, term105133.getClass(), "playVsCount", 1158875639);
        setIntField(term105133, term105133.getClass(), "playSyncCount", -33961488);
        setIntField(term105133, term105133.getClass(), "winCount", -1889485761);
        setIntField(term105133, term105133.getClass(), "helpCount", -1436656998);
        setIntField(term105133, term105133.getClass(), "comboCount", -314258295);
        setIntField(term105133, term105133.getClass(), "feverCount", -938986809);
        setIntField(term105133, term105133.getClass(), "totalHiScore", 1895347898);
        setIntField(term105133, term105133.getClass(), "totalEasyHighScore", 506296423);
        setIntField(term105133, term105133.getClass(), "totalBasicHighScore", -1284429911);
        setIntField(term105133, term105133.getClass(), "totalAdvancedHighScore", 1205489283);
        setIntField(term105133, term105133.getClass(), "totalExpertHighScore", 2075978505);
        setIntField(term105133, term105133.getClass(), "totalMasterHighScore", 330178792);
        setIntField(term105133, term105133.getClass(), "totalReMasterHighScore", 1545298429);
        setIntField(term105133, term105133.getClass(), "totalHighSync", -534750055);
        setIntField(term105133, term105133.getClass(), "totalEasySync", -1676589154);
        setIntField(term105133, term105133.getClass(), "totalBasicSync", 594573065);
        setIntField(term105133, term105133.getClass(), "totalAdvancedSync", 238432442);
        setIntField(term105133, term105133.getClass(), "totalExpertSync", 1053641068);
        setIntField(term105133, term105133.getClass(), "totalMasterSync", 1534572179);
        setIntField(term105133, term105133.getClass(), "totalReMasterSync", -1604928850);
        setIntField(term105133, term105133.getClass(), "playerRating", -1565710230);
        setIntField(term105133, term105133.getClass(), "highestRating", -1566848580);
        setIntField(term105133, term105133.getClass(), "rankAuthTailId", -136903149);
        setField(term105133, term105133.getClass(), "eventWatchedDate", "umJDDpmFWA");
        setField(term105133, term105133.getClass(), "webLimitDate", "BczZfNSwaD");
        setIntField(term105133, term105133.getClass(), "challengeTrackPhase", 700453711);
        setIntField(term105133, term105133.getClass(), "firstPlayBits", 1796077039);
        setField(term105133, term105133.getClass(), "lastPlayDate", "UqBrzYVNgu");
        setIntField(term105133, term105133.getClass(), "lastPlaceId", -2113586852);
        setField(term105133, term105133.getClass(), "lastPlaceName", "yETjenqbhE");
        setIntField(term105133, term105133.getClass(), "lastRegionId", -1398967560);
        setField(term105133, term105133.getClass(), "lastRegionName", "XzpzIeoooh");
        setField(term105133, term105133.getClass(), "lastClientId", "sbsbTdToVA");
        setField(term105133, term105133.getClass(), "lastCountryCode", "PTMnmtfPDP");
        setIntField(term105133, term105133.getClass(), "eventPoint", -553848886);
        setIntField(term105133, term105133.getClass(), "totalLv", -677534777);
        setIntField(term105133, term105133.getClass(), "lastLoginBonusDay", 825962791);
        setIntField(term105133, term105133.getClass(), "lastSurvivalBonusDay", 1873721781);
        setIntField(term105133, term105133.getClass(), "loginBonusLv", -32960653);
        setField(term105131, term105131.getClass(), "user", term105133);
        setIntField(term105131, term105131.getClass(), "survivalId", -416911471);
        setIntField(term105131, term105131.getClass(), "totalScore", -1202714572);
        setIntField(term105131, term105131.getClass(), "totalAchieve", -1196961418);
        setBooleanField(term105131, term105131.getClass(), "isClear", true);
        setBooleanField(term105131, term105131.getClass(), "isNoDamage", true);
        term105312 = new Integer(1387563120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term105312;
        callMethod(klass, "setTotalScore", argTypes, term105131, args);
    }

};


