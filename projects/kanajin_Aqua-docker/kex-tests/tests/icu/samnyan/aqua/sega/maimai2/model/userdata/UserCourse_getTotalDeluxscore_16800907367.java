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

public class UserCourse_getTotalDeluxscore_16800907367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75425;

    public UserCourse_getTotalDeluxscore_16800907367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term75431 = new Long(5671808784468963649L);
        Integer term75494 = new Integer(-1823813592);
        Integer term75496 = new Integer(-1644358555);
        Integer term75498 = new Integer(-388591034);
        Integer term75500 = new Integer(-1270258033);
        Integer term75502 = new Integer(1677994069);
        Integer term75504 = new Integer(-439999692);
        ArrayList term75492 = new ArrayList();
        ((ArrayList) term75492).add(term75494);
        ((ArrayList) term75492).add(term75496);
        ((ArrayList) term75492).add(term75498);
        ((ArrayList) term75492).add(term75500);
        ((ArrayList) term75492).add(term75502);
        ((ArrayList) term75492).add(term75504);
        Integer term75510 = new Integer(924095007);
        Integer term75512 = new Integer(1302110708);
        Integer term75514 = new Integer(594705497);
        ArrayList term75508 = new ArrayList();
        ((ArrayList) term75508).add(term75510);
        ((ArrayList) term75508).add(term75512);
        ((ArrayList) term75508).add(term75514);
        term75425 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term75427 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term75429 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term75445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75450 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75460 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term75425, term75425.getClass(), "id", 1782263264310649624L);
        setLongField(term75427, term75427.getClass(), "id", -771085471756778777L);
        setLongField(term75429, term75429.getClass(), "id", 8407224691886601353L);
        setField(term75429, term75429.getClass(), "extId", term75431);
        setField(term75429, term75429.getClass(), "luid", "zItHVuBBzy");
        setIntField(term75446, term75446.getClass(), "year", 2018);
        setShortField(term75446, term75446.getClass(), "month", (short) 2);
        setShortField(term75446, term75446.getClass(), "day", (short) 4);
        setField(term75445, term75445.getClass(), "date", term75446);
        setByteField(term75450, term75450.getClass(), "hour", (byte) 5);
        setByteField(term75450, term75450.getClass(), "minute", (byte) 35);
        setByteField(term75450, term75450.getClass(), "second", (byte) 40);
        setIntField(term75450, term75450.getClass(), "nano", 354661894);
        setField(term75445, term75445.getClass(), "time", term75450);
        setField(term75429, term75429.getClass(), "registerTime", term75445);
        setIntField(term75456, term75456.getClass(), "year", 2010);
        setShortField(term75456, term75456.getClass(), "month", (short) 3);
        setShortField(term75456, term75456.getClass(), "day", (short) 23);
        setField(term75455, term75455.getClass(), "date", term75456);
        setByteField(term75460, term75460.getClass(), "hour", (byte) 17);
        setByteField(term75460, term75460.getClass(), "minute", (byte) 32);
        setByteField(term75460, term75460.getClass(), "second", (byte) 36);
        setIntField(term75460, term75460.getClass(), "nano", 470582535);
        setField(term75455, term75455.getClass(), "time", term75460);
        setField(term75429, term75429.getClass(), "accessTime", term75455);
        setField(term75427, term75427.getClass(), "card", term75429);
        setField(term75427, term75427.getClass(), "userName", "pQcdIREjlp");
        setIntField(term75427, term75427.getClass(), "isNetMember", -352388461);
        setIntField(term75427, term75427.getClass(), "iconId", -476722971);
        setIntField(term75427, term75427.getClass(), "plateId", -1727779935);
        setIntField(term75427, term75427.getClass(), "titleId", 621731188);
        setIntField(term75427, term75427.getClass(), "partnerId", 23497506);
        setIntField(term75427, term75427.getClass(), "frameId", 1359512268);
        setIntField(term75427, term75427.getClass(), "selectMapId", 738561796);
        setIntField(term75427, term75427.getClass(), "totalAwake", 1485449254);
        setIntField(term75427, term75427.getClass(), "gradeRating", 477896598);
        setIntField(term75427, term75427.getClass(), "musicRating", -123400618);
        setIntField(term75427, term75427.getClass(), "playerRating", -1368246630);
        setIntField(term75427, term75427.getClass(), "highestRating", -217114557);
        setIntField(term75427, term75427.getClass(), "gradeRank", 2000296922);
        setIntField(term75427, term75427.getClass(), "classRank", 356697128);
        setIntField(term75427, term75427.getClass(), "courseRank", 393726126);
        setField(term75427, term75427.getClass(), "charaSlot", term75492);
        setField(term75427, term75427.getClass(), "charaLockSlot", term75508);
        setLongField(term75427, term75427.getClass(), "contentBit", 2092148935299566168L);
        setIntField(term75427, term75427.getClass(), "playCount", 1781861518);
        setField(term75427, term75427.getClass(), "eventWatchedDate", "WjUrdNMIOj");
        setField(term75427, term75427.getClass(), "lastGameId", "aQUpwHjYvS");
        setField(term75427, term75427.getClass(), "lastRomVersion", "lvcTLkVhAN");
        setField(term75427, term75427.getClass(), "lastDataVersion", "BJJuVqxXjT");
        setField(term75427, term75427.getClass(), "lastLoginDate", "IvxbsFCczM");
        setField(term75427, term75427.getClass(), "lastPlayDate", "GkAaLUoaoL");
        setIntField(term75427, term75427.getClass(), "lastPlayCredit", 1767385935);
        setIntField(term75427, term75427.getClass(), "lastPlayMode", -1208709585);
        setIntField(term75427, term75427.getClass(), "lastPlaceId", 845734901);
        setField(term75427, term75427.getClass(), "lastPlaceName", "VSmPzUiFzd");
        setIntField(term75427, term75427.getClass(), "lastAllNetId", 1158068248);
        setIntField(term75427, term75427.getClass(), "lastRegionId", -404489980);
        setField(term75427, term75427.getClass(), "lastRegionName", "bLpZNCaWDB");
        setField(term75427, term75427.getClass(), "lastClientId", "knmwCEeMTY");
        setField(term75427, term75427.getClass(), "lastCountryCode", "qTiIgMQXbW");
        setIntField(term75427, term75427.getClass(), "lastSelectEMoney", -1501688381);
        setIntField(term75427, term75427.getClass(), "lastSelectTicket", -132991775);
        setIntField(term75427, term75427.getClass(), "lastSelectCourse", -1962135802);
        setIntField(term75427, term75427.getClass(), "lastCountCourse", -1867466972);
        setField(term75427, term75427.getClass(), "firstGameId", "rARmHDyRHE");
        setField(term75427, term75427.getClass(), "firstRomVersion", "bvybTJUNMY");
        setField(term75427, term75427.getClass(), "firstDataVersion", "MoGyMoOkMi");
        setField(term75427, term75427.getClass(), "firstPlayDate", "qDEvNqJeGg");
        setField(term75427, term75427.getClass(), "compatibleCmVersion", "fUxWNxirZc");
        setField(term75427, term75427.getClass(), "dailyBonusDate", "vHkrNjGRyv");
        setField(term75427, term75427.getClass(), "dailyCourseBonusDate", "PxGAOnzJzj");
        setField(term75427, term75427.getClass(), "lastPairLoginDate", "fQVSHtJlDS");
        setField(term75427, term75427.getClass(), "lastTrialPlayDate", "CGdXCWNTxp");
        setIntField(term75427, term75427.getClass(), "playVsCount", -462258168);
        setIntField(term75427, term75427.getClass(), "playSyncCount", -163181513);
        setIntField(term75427, term75427.getClass(), "winCount", 744651672);
        setIntField(term75427, term75427.getClass(), "helpCount", 66267567);
        setIntField(term75427, term75427.getClass(), "comboCount", 36897944);
        setLongField(term75427, term75427.getClass(), "totalDeluxscore", 6405038085604769458L);
        setLongField(term75427, term75427.getClass(), "totalBasicDeluxscore", 3588287041971902605L);
        setLongField(term75427, term75427.getClass(), "totalAdvancedDeluxscore", 1868058982770066711L);
        setLongField(term75427, term75427.getClass(), "totalExpertDeluxscore", -2110401611920536569L);
        setLongField(term75427, term75427.getClass(), "totalMasterDeluxscore", 9177575941340536961L);
        setLongField(term75427, term75427.getClass(), "totalReMasterDeluxscore", -1059614177994496314L);
        setIntField(term75427, term75427.getClass(), "totalSync", -1128084769);
        setIntField(term75427, term75427.getClass(), "totalBasicSync", 608763750);
        setIntField(term75427, term75427.getClass(), "totalAdvancedSync", 1116153965);
        setIntField(term75427, term75427.getClass(), "totalExpertSync", 406334046);
        setIntField(term75427, term75427.getClass(), "totalMasterSync", -1974618374);
        setIntField(term75427, term75427.getClass(), "totalReMasterSync", -1890769685);
        setLongField(term75427, term75427.getClass(), "totalAchievement", 6226372791837550337L);
        setLongField(term75427, term75427.getClass(), "totalBasicAchievement", 6525495646197522413L);
        setLongField(term75427, term75427.getClass(), "totalAdvancedAchievement", -8011235289697333196L);
        setLongField(term75427, term75427.getClass(), "totalExpertAchievement", -7330824948049319002L);
        setLongField(term75427, term75427.getClass(), "totalMasterAchievement", 4297489130688944583L);
        setLongField(term75427, term75427.getClass(), "totalReMasterAchievement", 8960957647363939651L);
        setLongField(term75427, term75427.getClass(), "playerOldRating", -7528632195747779L);
        setLongField(term75427, term75427.getClass(), "playerNewRating", -4184249863979858011L);
        setIntField(term75427, term75427.getClass(), "banState", 2109131806);
        setLongField(term75427, term75427.getClass(), "dateTime", -3524527156552491025L);
        setField(term75425, term75425.getClass(), "user", term75427);
        setIntField(term75425, term75425.getClass(), "courseId", -177412412);
        setBooleanField(term75425, term75425.getClass(), "isLastClear", true);
        setIntField(term75425, term75425.getClass(), "totalRestlife", -794423751);
        setIntField(term75425, term75425.getClass(), "totalAchievement", 968959303);
        setIntField(term75425, term75425.getClass(), "totalDeluxscore", -1104495882);
        setIntField(term75425, term75425.getClass(), "playCount", 723475216);
        setField(term75425, term75425.getClass(), "clearDate", "TUBgEnrcjn");
        setField(term75425, term75425.getClass(), "lastPlayDate", "eUhEGNLBOk");
        setIntField(term75425, term75425.getClass(), "bestAchievement", 1267820908);
        setField(term75425, term75425.getClass(), "bestAchievementDate", "UrLisdyvVs");
        setIntField(term75425, term75425.getClass(), "bestDeluxscore", 1119020608);
        setField(term75425, term75425.getClass(), "bestDeluxscoreDate", "VckRXyiShh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalDeluxscore", argTypes, term75425, args);
    }

};


