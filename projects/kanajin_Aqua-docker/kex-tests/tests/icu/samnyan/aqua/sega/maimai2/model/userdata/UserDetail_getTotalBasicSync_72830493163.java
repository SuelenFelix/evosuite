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

public class UserDetail_getTotalBasicSync_72830493163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230711;

    public UserDetail_getTotalBasicSync_72830493163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term230715 = new Long(-8211859616692114655L);
        ArrayList term230776 = new ArrayList();
        ArrayList term230780 = new ArrayList();
        term230711 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term230713 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term230729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term230730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term230734 = newInstance(Class.forName("java.time.LocalTime"));
        Object term230739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term230740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term230744 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term230711, term230711.getClass(), "id", -427204309460562393L);
        setLongField(term230713, term230713.getClass(), "id", 1107316092196427982L);
        setField(term230713, term230713.getClass(), "extId", term230715);
        setField(term230713, term230713.getClass(), "luid", "aVDrDdxPOi");
        setIntField(term230730, term230730.getClass(), "year", 2014);
        setShortField(term230730, term230730.getClass(), "month", (short) 12);
        setShortField(term230730, term230730.getClass(), "day", (short) 10);
        setField(term230729, term230729.getClass(), "date", term230730);
        setByteField(term230734, term230734.getClass(), "hour", (byte) 0);
        setByteField(term230734, term230734.getClass(), "minute", (byte) 19);
        setByteField(term230734, term230734.getClass(), "second", (byte) 30);
        setIntField(term230734, term230734.getClass(), "nano", 874948769);
        setField(term230729, term230729.getClass(), "time", term230734);
        setField(term230713, term230713.getClass(), "registerTime", term230729);
        setIntField(term230740, term230740.getClass(), "year", 2016);
        setShortField(term230740, term230740.getClass(), "month", (short) 1);
        setShortField(term230740, term230740.getClass(), "day", (short) 29);
        setField(term230739, term230739.getClass(), "date", term230740);
        setByteField(term230744, term230744.getClass(), "hour", (byte) 12);
        setByteField(term230744, term230744.getClass(), "minute", (byte) 41);
        setByteField(term230744, term230744.getClass(), "second", (byte) 10);
        setIntField(term230744, term230744.getClass(), "nano", 153443383);
        setField(term230739, term230739.getClass(), "time", term230744);
        setField(term230713, term230713.getClass(), "accessTime", term230739);
        setField(term230711, term230711.getClass(), "card", term230713);
        setField(term230711, term230711.getClass(), "userName", "oITjUIRshR");
        setIntField(term230711, term230711.getClass(), "isNetMember", -237452608);
        setIntField(term230711, term230711.getClass(), "iconId", -1948272200);
        setIntField(term230711, term230711.getClass(), "plateId", -1769055397);
        setIntField(term230711, term230711.getClass(), "titleId", -855345856);
        setIntField(term230711, term230711.getClass(), "partnerId", 466230959);
        setIntField(term230711, term230711.getClass(), "frameId", 771668035);
        setIntField(term230711, term230711.getClass(), "selectMapId", 1158875639);
        setIntField(term230711, term230711.getClass(), "totalAwake", -33961488);
        setIntField(term230711, term230711.getClass(), "gradeRating", -1889485761);
        setIntField(term230711, term230711.getClass(), "musicRating", -1436656998);
        setIntField(term230711, term230711.getClass(), "playerRating", -314258295);
        setIntField(term230711, term230711.getClass(), "highestRating", -938986809);
        setIntField(term230711, term230711.getClass(), "gradeRank", 1895347898);
        setIntField(term230711, term230711.getClass(), "classRank", 506296423);
        setIntField(term230711, term230711.getClass(), "courseRank", -1284429911);
        setField(term230711, term230711.getClass(), "charaSlot", term230776);
        setField(term230711, term230711.getClass(), "charaLockSlot", term230780);
        setLongField(term230711, term230711.getClass(), "contentBit", -8751876474956580823L);
        setIntField(term230711, term230711.getClass(), "playCount", 1205489283);
        setField(term230711, term230711.getClass(), "eventWatchedDate", "hqufcWbQWl");
        setField(term230711, term230711.getClass(), "lastGameId", "QTsNLbRMRj");
        setField(term230711, term230711.getClass(), "lastRomVersion", "xpyCHBkNpU");
        setField(term230711, term230711.getClass(), "lastDataVersion", "PyaqPUUlJN");
        setField(term230711, term230711.getClass(), "lastLoginDate", "LvnrPakeWs");
        setField(term230711, term230711.getClass(), "lastPlayDate", "URueWxydQv");
        setIntField(term230711, term230711.getClass(), "lastPlayCredit", 2075978505);
        setIntField(term230711, term230711.getClass(), "lastPlayMode", 330178792);
        setIntField(term230711, term230711.getClass(), "lastPlaceId", 1545298429);
        setField(term230711, term230711.getClass(), "lastPlaceName", "TjjpnchLTB");
        setIntField(term230711, term230711.getClass(), "lastAllNetId", -534750055);
        setIntField(term230711, term230711.getClass(), "lastRegionId", -1676589154);
        setField(term230711, term230711.getClass(), "lastRegionName", "nEKWQEesJO");
        setField(term230711, term230711.getClass(), "lastClientId", "xOKXQZHixc");
        setField(term230711, term230711.getClass(), "lastCountryCode", "oDEauryLsd");
        setIntField(term230711, term230711.getClass(), "lastSelectEMoney", 594573065);
        setIntField(term230711, term230711.getClass(), "lastSelectTicket", 238432442);
        setIntField(term230711, term230711.getClass(), "lastSelectCourse", 1053641068);
        setIntField(term230711, term230711.getClass(), "lastCountCourse", 1534572179);
        setField(term230711, term230711.getClass(), "firstGameId", "FNdPPGkJAQ");
        setField(term230711, term230711.getClass(), "firstRomVersion", "KLfGLavjuw");
        setField(term230711, term230711.getClass(), "firstDataVersion", "QKrxGrDGYI");
        setField(term230711, term230711.getClass(), "firstPlayDate", "PCykSpNbZJ");
        setField(term230711, term230711.getClass(), "compatibleCmVersion", "joQLIHDujG");
        setField(term230711, term230711.getClass(), "dailyBonusDate", "yvvGTFDzWl");
        setField(term230711, term230711.getClass(), "dailyCourseBonusDate", "smEWGoimYP");
        setField(term230711, term230711.getClass(), "lastPairLoginDate", "QViiWIrVBm");
        setField(term230711, term230711.getClass(), "lastTrialPlayDate", "kzXrBwaqJb");
        setIntField(term230711, term230711.getClass(), "playVsCount", -1604928850);
        setIntField(term230711, term230711.getClass(), "playSyncCount", -1565710230);
        setIntField(term230711, term230711.getClass(), "winCount", -1566848580);
        setIntField(term230711, term230711.getClass(), "helpCount", -136903149);
        setIntField(term230711, term230711.getClass(), "comboCount", 700453711);
        setLongField(term230711, term230711.getClass(), "totalDeluxscore", -4989200430370185264L);
        setLongField(term230711, term230711.getClass(), "totalBasicDeluxscore", -5013725726051891709L);
        setLongField(term230711, term230711.getClass(), "totalAdvancedDeluxscore", -8642182779747557504L);
        setLongField(term230711, term230711.getClass(), "totalExpertDeluxscore", -5559145737380156017L);
        setLongField(term230711, term230711.getClass(), "totalMasterDeluxscore", -5366294806491775117L);
        setLongField(term230711, term230711.getClass(), "totalReMasterDeluxscore", -9085157956791529318L);
        setIntField(term230711, term230711.getClass(), "totalSync", 1796077039);
        setIntField(term230711, term230711.getClass(), "totalBasicSync", -2113586852);
        setIntField(term230711, term230711.getClass(), "totalAdvancedSync", -1398967560);
        setIntField(term230711, term230711.getClass(), "totalExpertSync", -553848886);
        setIntField(term230711, term230711.getClass(), "totalMasterSync", -677534777);
        setIntField(term230711, term230711.getClass(), "totalReMasterSync", 825962791);
        setLongField(term230711, term230711.getClass(), "totalAchievement", -4350871807993032884L);
        setLongField(term230711, term230711.getClass(), "totalBasicAchievement", 1924669448645583780L);
        setLongField(term230711, term230711.getClass(), "totalAdvancedAchievement", -3309188536440842983L);
        setLongField(term230711, term230711.getClass(), "totalExpertAchievement", -925747124046021405L);
        setLongField(term230711, term230711.getClass(), "totalMasterAchievement", -7951746157411525124L);
        setLongField(term230711, term230711.getClass(), "totalReMasterAchievement", 686910339691253646L);
        setLongField(term230711, term230711.getClass(), "playerOldRating", 766037242790737165L);
        setLongField(term230711, term230711.getClass(), "playerNewRating", -6241115025902069929L);
        setIntField(term230711, term230711.getClass(), "banState", 1873721781);
        setLongField(term230711, term230711.getClass(), "dateTime", -741178090091846530L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicSync", argTypes, term230711, args);
    }

};


