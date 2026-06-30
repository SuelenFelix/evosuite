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

public class UserData_setTotalExpertHighScore_128689888371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18851;
     Object term19025;

    public UserData_setTotalExpertHighScore_128689888371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18855 = new Long(41775768178052008L);
        term18851 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term18853 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term18869 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18870 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18874 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18884 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term18851, term18851.getClass(), "id", -6587807377747738663L);
        setLongField(term18853, term18853.getClass(), "id", -6301101997917060727L);
        setField(term18853, term18853.getClass(), "extId", term18855);
        setField(term18853, term18853.getClass(), "luid", "lnvLKbtveE");
        setIntField(term18870, term18870.getClass(), "year", 2023);
        setShortField(term18870, term18870.getClass(), "month", (short) 5);
        setShortField(term18870, term18870.getClass(), "day", (short) 31);
        setField(term18869, term18869.getClass(), "date", term18870);
        setByteField(term18874, term18874.getClass(), "hour", (byte) 13);
        setByteField(term18874, term18874.getClass(), "minute", (byte) 29);
        setByteField(term18874, term18874.getClass(), "second", (byte) 29);
        setIntField(term18874, term18874.getClass(), "nano", 621312201);
        setField(term18869, term18869.getClass(), "time", term18874);
        setField(term18853, term18853.getClass(), "registerTime", term18869);
        setIntField(term18880, term18880.getClass(), "year", 2020);
        setShortField(term18880, term18880.getClass(), "month", (short) 10);
        setShortField(term18880, term18880.getClass(), "day", (short) 26);
        setField(term18879, term18879.getClass(), "date", term18880);
        setByteField(term18884, term18884.getClass(), "hour", (byte) 10);
        setByteField(term18884, term18884.getClass(), "minute", (byte) 50);
        setByteField(term18884, term18884.getClass(), "second", (byte) 16);
        setIntField(term18884, term18884.getClass(), "nano", 613429);
        setField(term18879, term18879.getClass(), "time", term18884);
        setField(term18853, term18853.getClass(), "accessTime", term18879);
        setField(term18851, term18851.getClass(), "card", term18853);
        setIntField(term18851, term18851.getClass(), "lastDataVersion", 1766086753);
        setField(term18851, term18851.getClass(), "userName", "FfrrEhTHzQ");
        setIntField(term18851, term18851.getClass(), "point", -1211119545);
        setIntField(term18851, term18851.getClass(), "totalPoint", 1584121590);
        setIntField(term18851, term18851.getClass(), "iconId", 1133839602);
        setIntField(term18851, term18851.getClass(), "nameplateId", -986002923);
        setIntField(term18851, term18851.getClass(), "frameId", 724930183);
        setIntField(term18851, term18851.getClass(), "trophyId", 1053680722);
        setIntField(term18851, term18851.getClass(), "playCount", -1920949340);
        setIntField(term18851, term18851.getClass(), "playVsCount", 1211730228);
        setIntField(term18851, term18851.getClass(), "playSyncCount", 892506528);
        setIntField(term18851, term18851.getClass(), "winCount", -1203169418);
        setIntField(term18851, term18851.getClass(), "helpCount", -938772433);
        setIntField(term18851, term18851.getClass(), "comboCount", 46527533);
        setIntField(term18851, term18851.getClass(), "feverCount", 1199950979);
        setIntField(term18851, term18851.getClass(), "totalHiScore", 733812186);
        setIntField(term18851, term18851.getClass(), "totalEasyHighScore", -840076719);
        setIntField(term18851, term18851.getClass(), "totalBasicHighScore", 2002762153);
        setIntField(term18851, term18851.getClass(), "totalAdvancedHighScore", -531666058);
        setIntField(term18851, term18851.getClass(), "totalExpertHighScore", -1659995523);
        setIntField(term18851, term18851.getClass(), "totalMasterHighScore", -1384058110);
        setIntField(term18851, term18851.getClass(), "totalReMasterHighScore", -109584269);
        setIntField(term18851, term18851.getClass(), "totalHighSync", -682334474);
        setIntField(term18851, term18851.getClass(), "totalEasySync", -666332937);
        setIntField(term18851, term18851.getClass(), "totalBasicSync", 1661615099);
        setIntField(term18851, term18851.getClass(), "totalAdvancedSync", 1908136627);
        setIntField(term18851, term18851.getClass(), "totalExpertSync", 824600792);
        setIntField(term18851, term18851.getClass(), "totalMasterSync", -1498923569);
        setIntField(term18851, term18851.getClass(), "totalReMasterSync", 1082643319);
        setIntField(term18851, term18851.getClass(), "playerRating", -1138616222);
        setIntField(term18851, term18851.getClass(), "highestRating", 285368240);
        setIntField(term18851, term18851.getClass(), "rankAuthTailId", 1526503433);
        setField(term18851, term18851.getClass(), "eventWatchedDate", "LXnDNrMsqT");
        setField(term18851, term18851.getClass(), "webLimitDate", "ZLQamJFBmu");
        setIntField(term18851, term18851.getClass(), "challengeTrackPhase", 1765728316);
        setIntField(term18851, term18851.getClass(), "firstPlayBits", -1459041031);
        setField(term18851, term18851.getClass(), "lastPlayDate", "ZWcOCwKNvd");
        setIntField(term18851, term18851.getClass(), "lastPlaceId", 846881911);
        setField(term18851, term18851.getClass(), "lastPlaceName", "GTmoNrziyc");
        setIntField(term18851, term18851.getClass(), "lastRegionId", 780077059);
        setField(term18851, term18851.getClass(), "lastRegionName", "LvztehSlhM");
        setField(term18851, term18851.getClass(), "lastClientId", "njvnWFTMxN");
        setField(term18851, term18851.getClass(), "lastCountryCode", "fLRqcTSfzF");
        setIntField(term18851, term18851.getClass(), "eventPoint", -924663332);
        setIntField(term18851, term18851.getClass(), "totalLv", 579787883);
        setIntField(term18851, term18851.getClass(), "lastLoginBonusDay", -1104816537);
        setIntField(term18851, term18851.getClass(), "lastSurvivalBonusDay", 1997406081);
        setIntField(term18851, term18851.getClass(), "loginBonusLv", -160995016);
        term19025 = new Integer(-849730731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19025;
        callMethod(klass, "setTotalExpertHighScore", argTypes, term18851, args);
    }

};


