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

public class UserMusicDetail_setPlayCount_197626880417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184879;
     Object term185065;

    public UserMusicDetail_setPlayCount_197626880417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term184885 = new Long(-4191270658895729623L);
        term184879 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term184881 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term184883 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term184899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term184900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term184904 = newInstance(Class.forName("java.time.LocalTime"));
        Object term184909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term184910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term184914 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term184879, term184879.getClass(), "id", 3094322609315685109L);
        setLongField(term184881, term184881.getClass(), "id", -1909960197370926856L);
        setLongField(term184883, term184883.getClass(), "id", -9121990928010625836L);
        setField(term184883, term184883.getClass(), "extId", term184885);
        setField(term184883, term184883.getClass(), "luid", "nuqtGxTogL");
        setIntField(term184900, term184900.getClass(), "year", 2016);
        setShortField(term184900, term184900.getClass(), "month", (short) 2);
        setShortField(term184900, term184900.getClass(), "day", (short) 7);
        setField(term184899, term184899.getClass(), "date", term184900);
        setByteField(term184904, term184904.getClass(), "hour", (byte) 6);
        setByteField(term184904, term184904.getClass(), "minute", (byte) 40);
        setByteField(term184904, term184904.getClass(), "second", (byte) 12);
        setIntField(term184904, term184904.getClass(), "nano", 507363205);
        setField(term184899, term184899.getClass(), "time", term184904);
        setField(term184883, term184883.getClass(), "registerTime", term184899);
        setIntField(term184910, term184910.getClass(), "year", 2024);
        setShortField(term184910, term184910.getClass(), "month", (short) 3);
        setShortField(term184910, term184910.getClass(), "day", (short) 31);
        setField(term184909, term184909.getClass(), "date", term184910);
        setByteField(term184914, term184914.getClass(), "hour", (byte) 22);
        setByteField(term184914, term184914.getClass(), "minute", (byte) 44);
        setByteField(term184914, term184914.getClass(), "second", (byte) 36);
        setIntField(term184914, term184914.getClass(), "nano", 617693280);
        setField(term184909, term184909.getClass(), "time", term184914);
        setField(term184883, term184883.getClass(), "accessTime", term184909);
        setField(term184881, term184881.getClass(), "card", term184883);
        setIntField(term184881, term184881.getClass(), "lastDataVersion", 1021914688);
        setField(term184881, term184881.getClass(), "userName", "jaTZlmEwYn");
        setIntField(term184881, term184881.getClass(), "point", -2052966052);
        setIntField(term184881, term184881.getClass(), "totalPoint", -251118454);
        setIntField(term184881, term184881.getClass(), "iconId", 79166172);
        setIntField(term184881, term184881.getClass(), "nameplateId", -951357105);
        setIntField(term184881, term184881.getClass(), "frameId", 1963867246);
        setIntField(term184881, term184881.getClass(), "trophyId", -1893477627);
        setIntField(term184881, term184881.getClass(), "playCount", -605407350);
        setIntField(term184881, term184881.getClass(), "playVsCount", 2146650417);
        setIntField(term184881, term184881.getClass(), "playSyncCount", 842732819);
        setIntField(term184881, term184881.getClass(), "winCount", 1021455955);
        setIntField(term184881, term184881.getClass(), "helpCount", 322365127);
        setIntField(term184881, term184881.getClass(), "comboCount", 360140333);
        setIntField(term184881, term184881.getClass(), "feverCount", -2099817912);
        setIntField(term184881, term184881.getClass(), "totalHiScore", -787875796);
        setIntField(term184881, term184881.getClass(), "totalEasyHighScore", 1768295910);
        setIntField(term184881, term184881.getClass(), "totalBasicHighScore", -2075146489);
        setIntField(term184881, term184881.getClass(), "totalAdvancedHighScore", 1293414290);
        setIntField(term184881, term184881.getClass(), "totalExpertHighScore", 909867465);
        setIntField(term184881, term184881.getClass(), "totalMasterHighScore", -1263040353);
        setIntField(term184881, term184881.getClass(), "totalReMasterHighScore", -2018867235);
        setIntField(term184881, term184881.getClass(), "totalHighSync", 1066446147);
        setIntField(term184881, term184881.getClass(), "totalEasySync", -1744090915);
        setIntField(term184881, term184881.getClass(), "totalBasicSync", 395437295);
        setIntField(term184881, term184881.getClass(), "totalAdvancedSync", -1885509070);
        setIntField(term184881, term184881.getClass(), "totalExpertSync", 117647611);
        setIntField(term184881, term184881.getClass(), "totalMasterSync", 1843810245);
        setIntField(term184881, term184881.getClass(), "totalReMasterSync", 719886652);
        setIntField(term184881, term184881.getClass(), "playerRating", -998264245);
        setIntField(term184881, term184881.getClass(), "highestRating", 1307081329);
        setIntField(term184881, term184881.getClass(), "rankAuthTailId", 1748083965);
        setField(term184881, term184881.getClass(), "eventWatchedDate", "YLEdXlSrOR");
        setField(term184881, term184881.getClass(), "webLimitDate", "yiNDXYaPYF");
        setIntField(term184881, term184881.getClass(), "challengeTrackPhase", -951256901);
        setIntField(term184881, term184881.getClass(), "firstPlayBits", -488376903);
        setField(term184881, term184881.getClass(), "lastPlayDate", "lQfbJGzgkN");
        setIntField(term184881, term184881.getClass(), "lastPlaceId", -747546509);
        setField(term184881, term184881.getClass(), "lastPlaceName", "vCTyZdNoZR");
        setIntField(term184881, term184881.getClass(), "lastRegionId", -196352554);
        setField(term184881, term184881.getClass(), "lastRegionName", "CUvKslUjGD");
        setField(term184881, term184881.getClass(), "lastClientId", "WIGBWJtmAB");
        setField(term184881, term184881.getClass(), "lastCountryCode", "QBaceAmfVr");
        setIntField(term184881, term184881.getClass(), "eventPoint", 653232661);
        setIntField(term184881, term184881.getClass(), "totalLv", 20010807);
        setIntField(term184881, term184881.getClass(), "lastLoginBonusDay", 955583018);
        setIntField(term184881, term184881.getClass(), "lastSurvivalBonusDay", -1002633115);
        setIntField(term184881, term184881.getClass(), "loginBonusLv", -955407288);
        setField(term184879, term184879.getClass(), "user", term184881);
        setIntField(term184879, term184879.getClass(), "musicId", 1618226101);
        setIntField(term184879, term184879.getClass(), "level", -444094301);
        setIntField(term184879, term184879.getClass(), "playCount", -1841506114);
        setIntField(term184879, term184879.getClass(), "scoreMax", 10581451);
        setIntField(term184879, term184879.getClass(), "syncRateMax", 1659591860);
        setBooleanField(term184879, term184879.getClass(), "isAllPerfect", true);
        setIntField(term184879, term184879.getClass(), "isAllPerfectPlus", -2081131382);
        setIntField(term184879, term184879.getClass(), "fullCombo", -1241016990);
        setIntField(term184879, term184879.getClass(), "maxFever", 1961417205);
        setIntField(term184879, term184879.getClass(), "achievement", 1431903188);
        term185065 = new Integer(534856759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term185065;
        callMethod(klass, "setPlayCount", argTypes, term184879, args);
    }

};


