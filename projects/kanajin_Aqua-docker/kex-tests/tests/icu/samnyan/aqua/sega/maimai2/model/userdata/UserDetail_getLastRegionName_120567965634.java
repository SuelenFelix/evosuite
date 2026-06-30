package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getLastRegionName_120567965634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4248800;

    public UserDetail_getLastRegionName_120567965634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4248804 = new Long(-1386887337337605945L);
        Integer term4248867 = new Integer(1980560798);
        Integer term4248869 = new Integer(1048342124);
        Integer term4248871 = new Integer(-535149999);
        Integer term4248873 = new Integer(1350386277);
        Integer term4248875 = new Integer(-1834376367);
        Integer term4248877 = new Integer(-942813197);
        Integer term4248879 = new Integer(1374395557);
        ArrayList term4248865 = new ArrayList();
        ((ArrayList) term4248865).add(term4248867);
        ((ArrayList) term4248865).add(term4248869);
        ((ArrayList) term4248865).add(term4248871);
        ((ArrayList) term4248865).add(term4248873);
        ((ArrayList) term4248865).add(term4248875);
        ((ArrayList) term4248865).add(term4248877);
        ((ArrayList) term4248865).add(term4248879);
        Integer term4248885 = new Integer(1293688614);
        Integer term4248887 = new Integer(151983912);
        ArrayList term4248883 = new ArrayList();
        ((ArrayList) term4248883).add(term4248885);
        ((ArrayList) term4248883).add(term4248887);
        term4248800 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4248802 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4248818 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4248819 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4248823 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4248828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4248829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4248833 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4248800, term4248800.getClass(), "id", 2201867079080027443L);
        setLongField(term4248802, term4248802.getClass(), "id", 410128064905432320L);
        setField(term4248802, term4248802.getClass(), "extId", term4248804);
        setField(term4248802, term4248802.getClass(), "luid", "fTohiDQIla");
        setIntField(term4248819, term4248819.getClass(), "year", 2010);
        setShortField(term4248819, term4248819.getClass(), "month", (short) 9);
        setShortField(term4248819, term4248819.getClass(), "day", (short) 10);
        setField(term4248818, term4248818.getClass(), "date", term4248819);
        setByteField(term4248823, term4248823.getClass(), "hour", (byte) 19);
        setByteField(term4248823, term4248823.getClass(), "minute", (byte) 7);
        setByteField(term4248823, term4248823.getClass(), "second", (byte) 44);
        setIntField(term4248823, term4248823.getClass(), "nano", 946994634);
        setField(term4248818, term4248818.getClass(), "time", term4248823);
        setField(term4248802, term4248802.getClass(), "registerTime", term4248818);
        setIntField(term4248829, term4248829.getClass(), "year", 2019);
        setShortField(term4248829, term4248829.getClass(), "month", (short) 5);
        setShortField(term4248829, term4248829.getClass(), "day", (short) 12);
        setField(term4248828, term4248828.getClass(), "date", term4248829);
        setByteField(term4248833, term4248833.getClass(), "hour", (byte) 15);
        setByteField(term4248833, term4248833.getClass(), "minute", (byte) 6);
        setByteField(term4248833, term4248833.getClass(), "second", (byte) 58);
        setIntField(term4248833, term4248833.getClass(), "nano", 399481348);
        setField(term4248828, term4248828.getClass(), "time", term4248833);
        setField(term4248802, term4248802.getClass(), "accessTime", term4248828);
        setField(term4248800, term4248800.getClass(), "card", term4248802);
        setField(term4248800, term4248800.getClass(), "userName", "jTKToHDizm");
        setIntField(term4248800, term4248800.getClass(), "isNetMember", 2143376298);
        setIntField(term4248800, term4248800.getClass(), "iconId", -187639996);
        setIntField(term4248800, term4248800.getClass(), "plateId", -1064815670);
        setIntField(term4248800, term4248800.getClass(), "titleId", -517434909);
        setIntField(term4248800, term4248800.getClass(), "partnerId", -627460756);
        setIntField(term4248800, term4248800.getClass(), "frameId", 612585939);
        setIntField(term4248800, term4248800.getClass(), "selectMapId", 457368366);
        setIntField(term4248800, term4248800.getClass(), "totalAwake", -1997206991);
        setIntField(term4248800, term4248800.getClass(), "gradeRating", -622448623);
        setIntField(term4248800, term4248800.getClass(), "musicRating", -113785380);
        setIntField(term4248800, term4248800.getClass(), "playerRating", 397622746);
        setIntField(term4248800, term4248800.getClass(), "highestRating", 669406402);
        setIntField(term4248800, term4248800.getClass(), "gradeRank", 568527710);
        setIntField(term4248800, term4248800.getClass(), "classRank", 2050919788);
        setIntField(term4248800, term4248800.getClass(), "courseRank", 1857149787);
        setField(term4248800, term4248800.getClass(), "charaSlot", term4248865);
        setField(term4248800, term4248800.getClass(), "charaLockSlot", term4248883);
        setLongField(term4248800, term4248800.getClass(), "contentBit", 476918540111683447L);
        setIntField(term4248800, term4248800.getClass(), "playCount", -920032707);
        setField(term4248800, term4248800.getClass(), "eventWatchedDate", "sfggQjFtEw");
        setField(term4248800, term4248800.getClass(), "lastGameId", "JnoVXgHBrk");
        setField(term4248800, term4248800.getClass(), "lastRomVersion", "SewtkDLxFc");
        setField(term4248800, term4248800.getClass(), "lastDataVersion", "QCBWPSQWax");
        setField(term4248800, term4248800.getClass(), "lastLoginDate", "pyuHEnHfFT");
        setField(term4248800, term4248800.getClass(), "lastPlayDate", "LmrTzVZFMJ");
        setIntField(term4248800, term4248800.getClass(), "lastPlayCredit", -490768175);
        setIntField(term4248800, term4248800.getClass(), "lastPlayMode", 174041402);
        setIntField(term4248800, term4248800.getClass(), "lastPlaceId", 913476596);
        setField(term4248800, term4248800.getClass(), "lastPlaceName", "ArEFqAozPA");
        setIntField(term4248800, term4248800.getClass(), "lastAllNetId", -1069996446);
        setIntField(term4248800, term4248800.getClass(), "lastRegionId", -1801188564);
        setField(term4248800, term4248800.getClass(), "lastRegionName", "MazwzwswZD");
        setField(term4248800, term4248800.getClass(), "lastClientId", "CJCgQXkzlH");
        setField(term4248800, term4248800.getClass(), "lastCountryCode", "aPNnlnTrbs");
        setIntField(term4248800, term4248800.getClass(), "lastSelectEMoney", -1448330283);
        setIntField(term4248800, term4248800.getClass(), "lastSelectTicket", -917076540);
        setIntField(term4248800, term4248800.getClass(), "lastSelectCourse", -1709582242);
        setIntField(term4248800, term4248800.getClass(), "lastCountCourse", 304783924);
        setField(term4248800, term4248800.getClass(), "firstGameId", "QBeZCQfljB");
        setField(term4248800, term4248800.getClass(), "firstRomVersion", "FHYaeLGchW");
        setField(term4248800, term4248800.getClass(), "firstDataVersion", "QfsMXJVvUA");
        setField(term4248800, term4248800.getClass(), "firstPlayDate", "sPgXpNKTGJ");
        setField(term4248800, term4248800.getClass(), "compatibleCmVersion", "ttLwUMGclJ");
        setField(term4248800, term4248800.getClass(), "dailyBonusDate", "AWebAWXkxF");
        setField(term4248800, term4248800.getClass(), "dailyCourseBonusDate", "AnkFSAZrXR");
        setField(term4248800, term4248800.getClass(), "lastPairLoginDate", "wePsuJORSR");
        setField(term4248800, term4248800.getClass(), "lastTrialPlayDate", "bbFwXTyeYI");
        setIntField(term4248800, term4248800.getClass(), "playVsCount", 1779434525);
        setIntField(term4248800, term4248800.getClass(), "playSyncCount", -1764638680);
        setIntField(term4248800, term4248800.getClass(), "winCount", 390923360);
        setIntField(term4248800, term4248800.getClass(), "helpCount", -763179338);
        setIntField(term4248800, term4248800.getClass(), "comboCount", 559647475);
        setLongField(term4248800, term4248800.getClass(), "totalDeluxscore", 5965193981256290218L);
        setLongField(term4248800, term4248800.getClass(), "totalBasicDeluxscore", 8768980504119931009L);
        setLongField(term4248800, term4248800.getClass(), "totalAdvancedDeluxscore", 6376618650353877614L);
        setLongField(term4248800, term4248800.getClass(), "totalExpertDeluxscore", -7722898626874403239L);
        setLongField(term4248800, term4248800.getClass(), "totalMasterDeluxscore", -1831848861232095506L);
        setLongField(term4248800, term4248800.getClass(), "totalReMasterDeluxscore", 7697751294703456694L);
        setIntField(term4248800, term4248800.getClass(), "totalSync", 1354768734);
        setIntField(term4248800, term4248800.getClass(), "totalBasicSync", 1262955115);
        setIntField(term4248800, term4248800.getClass(), "totalAdvancedSync", 1118433994);
        setIntField(term4248800, term4248800.getClass(), "totalExpertSync", -1982400461);
        setIntField(term4248800, term4248800.getClass(), "totalMasterSync", -1641192854);
        setIntField(term4248800, term4248800.getClass(), "totalReMasterSync", 544908909);
        setLongField(term4248800, term4248800.getClass(), "totalAchievement", -8519335040809755751L);
        setLongField(term4248800, term4248800.getClass(), "totalBasicAchievement", -5791613367710861116L);
        setLongField(term4248800, term4248800.getClass(), "totalAdvancedAchievement", 4884175626184001032L);
        setLongField(term4248800, term4248800.getClass(), "totalExpertAchievement", -3328570745571266009L);
        setLongField(term4248800, term4248800.getClass(), "totalMasterAchievement", -7584984913368621141L);
        setLongField(term4248800, term4248800.getClass(), "totalReMasterAchievement", -2393898828794618817L);
        setLongField(term4248800, term4248800.getClass(), "playerOldRating", 4600435446421790884L);
        setLongField(term4248800, term4248800.getClass(), "playerNewRating", 4989005329041335469L);
        setIntField(term4248800, term4248800.getClass(), "banState", -1378966949);
        setLongField(term4248800, term4248800.getClass(), "dateTime", -410296448225688334L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionName", argTypes, term4248800, args);
    }

};


