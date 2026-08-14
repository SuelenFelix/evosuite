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

public class UserDetail_setTotalExpertDeluxscore_1701720050135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272481;
     Object term272834;

    public UserDetail_setTotalExpertDeluxscore_1701720050135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term272485 = new Long(8680715663951713735L);
        Integer term272548 = new Integer(-63936889);
        Integer term272550 = new Integer(1893773732);
        Integer term272552 = new Integer(-1854658170);
        Integer term272554 = new Integer(-383472550);
        ArrayList term272546 = new ArrayList();
        ((ArrayList) term272546).add(term272548);
        ((ArrayList) term272546).add(term272550);
        ((ArrayList) term272546).add(term272552);
        ((ArrayList) term272546).add(term272554);
        Integer term272560 = new Integer(1184946577);
        Integer term272562 = new Integer(1076103120);
        Integer term272564 = new Integer(414965503);
        ArrayList term272558 = new ArrayList();
        ((ArrayList) term272558).add(term272560);
        ((ArrayList) term272558).add(term272562);
        ((ArrayList) term272558).add(term272564);
        term272481 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term272483 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term272499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term272500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272504 = newInstance(Class.forName("java.time.LocalTime"));
        Object term272509 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term272510 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272514 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term272481, term272481.getClass(), "id", -4205599486737030311L);
        setLongField(term272483, term272483.getClass(), "id", 438014298279693109L);
        setField(term272483, term272483.getClass(), "extId", term272485);
        setField(term272483, term272483.getClass(), "luid", "EAGSkuusTi");
        setIntField(term272500, term272500.getClass(), "year", 2027);
        setShortField(term272500, term272500.getClass(), "month", (short) 12);
        setShortField(term272500, term272500.getClass(), "day", (short) 16);
        setField(term272499, term272499.getClass(), "date", term272500);
        setByteField(term272504, term272504.getClass(), "hour", (byte) 10);
        setByteField(term272504, term272504.getClass(), "minute", (byte) 23);
        setByteField(term272504, term272504.getClass(), "second", (byte) 56);
        setIntField(term272504, term272504.getClass(), "nano", 246046035);
        setField(term272499, term272499.getClass(), "time", term272504);
        setField(term272483, term272483.getClass(), "registerTime", term272499);
        setIntField(term272510, term272510.getClass(), "year", 2019);
        setShortField(term272510, term272510.getClass(), "month", (short) 5);
        setShortField(term272510, term272510.getClass(), "day", (short) 20);
        setField(term272509, term272509.getClass(), "date", term272510);
        setByteField(term272514, term272514.getClass(), "hour", (byte) 15);
        setByteField(term272514, term272514.getClass(), "minute", (byte) 28);
        setByteField(term272514, term272514.getClass(), "second", (byte) 36);
        setIntField(term272514, term272514.getClass(), "nano", 872266428);
        setField(term272509, term272509.getClass(), "time", term272514);
        setField(term272483, term272483.getClass(), "accessTime", term272509);
        setField(term272481, term272481.getClass(), "card", term272483);
        setField(term272481, term272481.getClass(), "userName", "nLcDCcZnti");
        setIntField(term272481, term272481.getClass(), "isNetMember", -2077410887);
        setIntField(term272481, term272481.getClass(), "iconId", -1955203822);
        setIntField(term272481, term272481.getClass(), "plateId", 1396977392);
        setIntField(term272481, term272481.getClass(), "titleId", -1677580127);
        setIntField(term272481, term272481.getClass(), "partnerId", -256255169);
        setIntField(term272481, term272481.getClass(), "frameId", -1928244069);
        setIntField(term272481, term272481.getClass(), "selectMapId", -1683332471);
        setIntField(term272481, term272481.getClass(), "totalAwake", 38870924);
        setIntField(term272481, term272481.getClass(), "gradeRating", 379427802);
        setIntField(term272481, term272481.getClass(), "musicRating", -1550927364);
        setIntField(term272481, term272481.getClass(), "playerRating", -886384913);
        setIntField(term272481, term272481.getClass(), "highestRating", -1933031867);
        setIntField(term272481, term272481.getClass(), "gradeRank", 491284060);
        setIntField(term272481, term272481.getClass(), "classRank", -866463269);
        setIntField(term272481, term272481.getClass(), "courseRank", 2107415753);
        setField(term272481, term272481.getClass(), "charaSlot", term272546);
        setField(term272481, term272481.getClass(), "charaLockSlot", term272558);
        setLongField(term272481, term272481.getClass(), "contentBit", 6283583937674438691L);
        setIntField(term272481, term272481.getClass(), "playCount", -956932114);
        setField(term272481, term272481.getClass(), "eventWatchedDate", "cMdtJSLDoI");
        setField(term272481, term272481.getClass(), "lastGameId", "OEbkXHDUoo");
        setField(term272481, term272481.getClass(), "lastRomVersion", "UyjyaUEUez");
        setField(term272481, term272481.getClass(), "lastDataVersion", "CXqnqOaCpS");
        setField(term272481, term272481.getClass(), "lastLoginDate", "YdWKzbJowD");
        setField(term272481, term272481.getClass(), "lastPlayDate", "CvmHBQYzyE");
        setIntField(term272481, term272481.getClass(), "lastPlayCredit", 1892033303);
        setIntField(term272481, term272481.getClass(), "lastPlayMode", -1411609718);
        setIntField(term272481, term272481.getClass(), "lastPlaceId", 326153842);
        setField(term272481, term272481.getClass(), "lastPlaceName", "xXJogHyQGl");
        setIntField(term272481, term272481.getClass(), "lastAllNetId", 100816803);
        setIntField(term272481, term272481.getClass(), "lastRegionId", 1731184786);
        setField(term272481, term272481.getClass(), "lastRegionName", "AiiSXqnafr");
        setField(term272481, term272481.getClass(), "lastClientId", "hKYdhUsiDC");
        setField(term272481, term272481.getClass(), "lastCountryCode", "whjpwSMlSP");
        setIntField(term272481, term272481.getClass(), "lastSelectEMoney", 294317488);
        setIntField(term272481, term272481.getClass(), "lastSelectTicket", -885458488);
        setIntField(term272481, term272481.getClass(), "lastSelectCourse", 2104352702);
        setIntField(term272481, term272481.getClass(), "lastCountCourse", -1118813318);
        setField(term272481, term272481.getClass(), "firstGameId", "CWWvGZMEId");
        setField(term272481, term272481.getClass(), "firstRomVersion", "uhdVsaXySd");
        setField(term272481, term272481.getClass(), "firstDataVersion", "evnloNxsNi");
        setField(term272481, term272481.getClass(), "firstPlayDate", "kLCuIvMMCV");
        setField(term272481, term272481.getClass(), "compatibleCmVersion", "KXSxokRDON");
        setField(term272481, term272481.getClass(), "dailyBonusDate", "eGlkGTQepc");
        setField(term272481, term272481.getClass(), "dailyCourseBonusDate", "DcEhRkuwFV");
        setField(term272481, term272481.getClass(), "lastPairLoginDate", "bLkMoMyLsr");
        setField(term272481, term272481.getClass(), "lastTrialPlayDate", "fMTcYTqwCd");
        setIntField(term272481, term272481.getClass(), "playVsCount", -1619455704);
        setIntField(term272481, term272481.getClass(), "playSyncCount", -572867773);
        setIntField(term272481, term272481.getClass(), "winCount", -724811435);
        setIntField(term272481, term272481.getClass(), "helpCount", 1503357399);
        setIntField(term272481, term272481.getClass(), "comboCount", -135502296);
        setLongField(term272481, term272481.getClass(), "totalDeluxscore", -3600465774703724309L);
        setLongField(term272481, term272481.getClass(), "totalBasicDeluxscore", -5365573477435473762L);
        setLongField(term272481, term272481.getClass(), "totalAdvancedDeluxscore", 1327127741525707822L);
        setLongField(term272481, term272481.getClass(), "totalExpertDeluxscore", 4123248256505041797L);
        setLongField(term272481, term272481.getClass(), "totalMasterDeluxscore", -8614442904308573894L);
        setLongField(term272481, term272481.getClass(), "totalReMasterDeluxscore", -7423174717739301809L);
        setIntField(term272481, term272481.getClass(), "totalSync", -556231095);
        setIntField(term272481, term272481.getClass(), "totalBasicSync", -157802489);
        setIntField(term272481, term272481.getClass(), "totalAdvancedSync", -607883905);
        setIntField(term272481, term272481.getClass(), "totalExpertSync", 640657317);
        setIntField(term272481, term272481.getClass(), "totalMasterSync", -50338111);
        setIntField(term272481, term272481.getClass(), "totalReMasterSync", -507824648);
        setLongField(term272481, term272481.getClass(), "totalAchievement", 8925847356196807076L);
        setLongField(term272481, term272481.getClass(), "totalBasicAchievement", 7181764834412549881L);
        setLongField(term272481, term272481.getClass(), "totalAdvancedAchievement", -5650041113709713472L);
        setLongField(term272481, term272481.getClass(), "totalExpertAchievement", -318073710460941304L);
        setLongField(term272481, term272481.getClass(), "totalMasterAchievement", -6604981815460391866L);
        setLongField(term272481, term272481.getClass(), "totalReMasterAchievement", -6836151137033127730L);
        setLongField(term272481, term272481.getClass(), "playerOldRating", -6974566131394981325L);
        setLongField(term272481, term272481.getClass(), "playerNewRating", 3913519163631706091L);
        setIntField(term272481, term272481.getClass(), "banState", -1843101234);
        setLongField(term272481, term272481.getClass(), "dateTime", 8939253797122524396L);
        term272834 = new Long(-1439208551493841386L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term272834;
        callMethod(klass, "setTotalExpertDeluxscore", argTypes, term272481, args);
    }

};


