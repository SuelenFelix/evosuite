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

public class UserMusicDetail_setIsAllPerfectPlus_142446924521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185991;
     Object term186177;

    public UserMusicDetail_setIsAllPerfectPlus_142446924521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term185997 = new Long(-9133417318192430290L);
        term185991 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term185993 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term185995 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term186011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186016 = newInstance(Class.forName("java.time.LocalTime"));
        Object term186021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186026 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term185991, term185991.getClass(), "id", -1836910095716864258L);
        setLongField(term185993, term185993.getClass(), "id", 6409577068638937956L);
        setLongField(term185995, term185995.getClass(), "id", -1680886152207238363L);
        setField(term185995, term185995.getClass(), "extId", term185997);
        setField(term185995, term185995.getClass(), "luid", "zlBxjMwVHV");
        setIntField(term186012, term186012.getClass(), "year", 2027);
        setShortField(term186012, term186012.getClass(), "month", (short) 7);
        setShortField(term186012, term186012.getClass(), "day", (short) 2);
        setField(term186011, term186011.getClass(), "date", term186012);
        setByteField(term186016, term186016.getClass(), "hour", (byte) 10);
        setByteField(term186016, term186016.getClass(), "minute", (byte) 18);
        setByteField(term186016, term186016.getClass(), "second", (byte) 58);
        setIntField(term186016, term186016.getClass(), "nano", 936854550);
        setField(term186011, term186011.getClass(), "time", term186016);
        setField(term185995, term185995.getClass(), "registerTime", term186011);
        setIntField(term186022, term186022.getClass(), "year", 2027);
        setShortField(term186022, term186022.getClass(), "month", (short) 10);
        setShortField(term186022, term186022.getClass(), "day", (short) 29);
        setField(term186021, term186021.getClass(), "date", term186022);
        setByteField(term186026, term186026.getClass(), "hour", (byte) 13);
        setByteField(term186026, term186026.getClass(), "minute", (byte) 15);
        setByteField(term186026, term186026.getClass(), "second", (byte) 53);
        setIntField(term186026, term186026.getClass(), "nano", 202971857);
        setField(term186021, term186021.getClass(), "time", term186026);
        setField(term185995, term185995.getClass(), "accessTime", term186021);
        setField(term185993, term185993.getClass(), "card", term185995);
        setIntField(term185993, term185993.getClass(), "lastDataVersion", 1884250161);
        setField(term185993, term185993.getClass(), "userName", "rsBwYUCWbo");
        setIntField(term185993, term185993.getClass(), "point", 360688226);
        setIntField(term185993, term185993.getClass(), "totalPoint", 1243255681);
        setIntField(term185993, term185993.getClass(), "iconId", 914332222);
        setIntField(term185993, term185993.getClass(), "nameplateId", -1828546613);
        setIntField(term185993, term185993.getClass(), "frameId", 504996191);
        setIntField(term185993, term185993.getClass(), "trophyId", 1703207922);
        setIntField(term185993, term185993.getClass(), "playCount", 256783421);
        setIntField(term185993, term185993.getClass(), "playVsCount", 704150609);
        setIntField(term185993, term185993.getClass(), "playSyncCount", 70614388);
        setIntField(term185993, term185993.getClass(), "winCount", -882660209);
        setIntField(term185993, term185993.getClass(), "helpCount", 1188968497);
        setIntField(term185993, term185993.getClass(), "comboCount", -2082244283);
        setIntField(term185993, term185993.getClass(), "feverCount", 822711451);
        setIntField(term185993, term185993.getClass(), "totalHiScore", 1734713430);
        setIntField(term185993, term185993.getClass(), "totalEasyHighScore", 567547655);
        setIntField(term185993, term185993.getClass(), "totalBasicHighScore", -785228496);
        setIntField(term185993, term185993.getClass(), "totalAdvancedHighScore", 1631388659);
        setIntField(term185993, term185993.getClass(), "totalExpertHighScore", -1632350638);
        setIntField(term185993, term185993.getClass(), "totalMasterHighScore", 911576601);
        setIntField(term185993, term185993.getClass(), "totalReMasterHighScore", -714548283);
        setIntField(term185993, term185993.getClass(), "totalHighSync", -575442660);
        setIntField(term185993, term185993.getClass(), "totalEasySync", -1613305240);
        setIntField(term185993, term185993.getClass(), "totalBasicSync", 1017723551);
        setIntField(term185993, term185993.getClass(), "totalAdvancedSync", -1602515386);
        setIntField(term185993, term185993.getClass(), "totalExpertSync", 608373956);
        setIntField(term185993, term185993.getClass(), "totalMasterSync", 1995595343);
        setIntField(term185993, term185993.getClass(), "totalReMasterSync", 1702326373);
        setIntField(term185993, term185993.getClass(), "playerRating", -1891559898);
        setIntField(term185993, term185993.getClass(), "highestRating", -466638206);
        setIntField(term185993, term185993.getClass(), "rankAuthTailId", -183834912);
        setField(term185993, term185993.getClass(), "eventWatchedDate", "VFJXkkRgdr");
        setField(term185993, term185993.getClass(), "webLimitDate", "LdsHLBFuxE");
        setIntField(term185993, term185993.getClass(), "challengeTrackPhase", -1229633602);
        setIntField(term185993, term185993.getClass(), "firstPlayBits", 2130724335);
        setField(term185993, term185993.getClass(), "lastPlayDate", "WdDBobmXbb");
        setIntField(term185993, term185993.getClass(), "lastPlaceId", 345965026);
        setField(term185993, term185993.getClass(), "lastPlaceName", "LDbfuLlLaY");
        setIntField(term185993, term185993.getClass(), "lastRegionId", 141279631);
        setField(term185993, term185993.getClass(), "lastRegionName", "TdtRhjRbpE");
        setField(term185993, term185993.getClass(), "lastClientId", "QKqgZRJSAe");
        setField(term185993, term185993.getClass(), "lastCountryCode", "NndiRNwUco");
        setIntField(term185993, term185993.getClass(), "eventPoint", 1130239672);
        setIntField(term185993, term185993.getClass(), "totalLv", -29526939);
        setIntField(term185993, term185993.getClass(), "lastLoginBonusDay", 300379328);
        setIntField(term185993, term185993.getClass(), "lastSurvivalBonusDay", 1134407225);
        setIntField(term185993, term185993.getClass(), "loginBonusLv", -1280390768);
        setField(term185991, term185991.getClass(), "user", term185993);
        setIntField(term185991, term185991.getClass(), "musicId", -1033413141);
        setIntField(term185991, term185991.getClass(), "level", -1965312295);
        setIntField(term185991, term185991.getClass(), "playCount", -1214428897);
        setIntField(term185991, term185991.getClass(), "scoreMax", 1993985640);
        setIntField(term185991, term185991.getClass(), "syncRateMax", -651806682);
        setBooleanField(term185991, term185991.getClass(), "isAllPerfect", false);
        setIntField(term185991, term185991.getClass(), "isAllPerfectPlus", -565456226);
        setIntField(term185991, term185991.getClass(), "fullCombo", -242319054);
        setIntField(term185991, term185991.getClass(), "maxFever", 56723510);
        setIntField(term185991, term185991.getClass(), "achievement", -485106720);
        term186177 = new Integer(-1273264309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term186177;
        callMethod(klass, "setIsAllPerfectPlus", argTypes, term185991, args);
    }

};


