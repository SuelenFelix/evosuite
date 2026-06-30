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

public class UserDetail_setTotalExpertDeluxscore_1701720050136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272536;
     Object term272889;

    public UserDetail_setTotalExpertDeluxscore_1701720050136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term272540 = new Long(8680715663951713735L);
        Integer term272603 = new Integer(-63936889);
        Integer term272605 = new Integer(1893773732);
        Integer term272607 = new Integer(-1854658170);
        Integer term272609 = new Integer(-383472550);
        ArrayList term272601 = new ArrayList();
        ((ArrayList) term272601).add(term272603);
        ((ArrayList) term272601).add(term272605);
        ((ArrayList) term272601).add(term272607);
        ((ArrayList) term272601).add(term272609);
        Integer term272615 = new Integer(1184946577);
        Integer term272617 = new Integer(1076103120);
        Integer term272619 = new Integer(414965503);
        ArrayList term272613 = new ArrayList();
        ((ArrayList) term272613).add(term272615);
        ((ArrayList) term272613).add(term272617);
        ((ArrayList) term272613).add(term272619);
        term272536 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term272538 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term272554 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term272555 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272559 = newInstance(Class.forName("java.time.LocalTime"));
        Object term272564 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term272565 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272569 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term272536, term272536.getClass(), "id", -4205599486737030311L);
        setLongField(term272538, term272538.getClass(), "id", 438014298279693109L);
        setField(term272538, term272538.getClass(), "extId", term272540);
        setField(term272538, term272538.getClass(), "luid", "EAGSkuusTi");
        setIntField(term272555, term272555.getClass(), "year", 2027);
        setShortField(term272555, term272555.getClass(), "month", (short) 12);
        setShortField(term272555, term272555.getClass(), "day", (short) 16);
        setField(term272554, term272554.getClass(), "date", term272555);
        setByteField(term272559, term272559.getClass(), "hour", (byte) 10);
        setByteField(term272559, term272559.getClass(), "minute", (byte) 23);
        setByteField(term272559, term272559.getClass(), "second", (byte) 56);
        setIntField(term272559, term272559.getClass(), "nano", 246046035);
        setField(term272554, term272554.getClass(), "time", term272559);
        setField(term272538, term272538.getClass(), "registerTime", term272554);
        setIntField(term272565, term272565.getClass(), "year", 2019);
        setShortField(term272565, term272565.getClass(), "month", (short) 5);
        setShortField(term272565, term272565.getClass(), "day", (short) 20);
        setField(term272564, term272564.getClass(), "date", term272565);
        setByteField(term272569, term272569.getClass(), "hour", (byte) 15);
        setByteField(term272569, term272569.getClass(), "minute", (byte) 28);
        setByteField(term272569, term272569.getClass(), "second", (byte) 36);
        setIntField(term272569, term272569.getClass(), "nano", 872266428);
        setField(term272564, term272564.getClass(), "time", term272569);
        setField(term272538, term272538.getClass(), "accessTime", term272564);
        setField(term272536, term272536.getClass(), "card", term272538);
        setField(term272536, term272536.getClass(), "userName", "nLcDCcZnti");
        setIntField(term272536, term272536.getClass(), "isNetMember", -2077410887);
        setIntField(term272536, term272536.getClass(), "iconId", -1955203822);
        setIntField(term272536, term272536.getClass(), "plateId", 1396977392);
        setIntField(term272536, term272536.getClass(), "titleId", -1677580127);
        setIntField(term272536, term272536.getClass(), "partnerId", -256255169);
        setIntField(term272536, term272536.getClass(), "frameId", -1928244069);
        setIntField(term272536, term272536.getClass(), "selectMapId", -1683332471);
        setIntField(term272536, term272536.getClass(), "totalAwake", 38870924);
        setIntField(term272536, term272536.getClass(), "gradeRating", 379427802);
        setIntField(term272536, term272536.getClass(), "musicRating", -1550927364);
        setIntField(term272536, term272536.getClass(), "playerRating", -886384913);
        setIntField(term272536, term272536.getClass(), "highestRating", -1933031867);
        setIntField(term272536, term272536.getClass(), "gradeRank", 491284060);
        setIntField(term272536, term272536.getClass(), "classRank", -866463269);
        setIntField(term272536, term272536.getClass(), "courseRank", 2107415753);
        setField(term272536, term272536.getClass(), "charaSlot", term272601);
        setField(term272536, term272536.getClass(), "charaLockSlot", term272613);
        setLongField(term272536, term272536.getClass(), "contentBit", 6283583937674438691L);
        setIntField(term272536, term272536.getClass(), "playCount", -956932114);
        setField(term272536, term272536.getClass(), "eventWatchedDate", "cMdtJSLDoI");
        setField(term272536, term272536.getClass(), "lastGameId", "OEbkXHDUoo");
        setField(term272536, term272536.getClass(), "lastRomVersion", "UyjyaUEUez");
        setField(term272536, term272536.getClass(), "lastDataVersion", "CXqnqOaCpS");
        setField(term272536, term272536.getClass(), "lastLoginDate", "YdWKzbJowD");
        setField(term272536, term272536.getClass(), "lastPlayDate", "CvmHBQYzyE");
        setIntField(term272536, term272536.getClass(), "lastPlayCredit", 1892033303);
        setIntField(term272536, term272536.getClass(), "lastPlayMode", -1411609718);
        setIntField(term272536, term272536.getClass(), "lastPlaceId", 326153842);
        setField(term272536, term272536.getClass(), "lastPlaceName", "xXJogHyQGl");
        setIntField(term272536, term272536.getClass(), "lastAllNetId", 100816803);
        setIntField(term272536, term272536.getClass(), "lastRegionId", 1731184786);
        setField(term272536, term272536.getClass(), "lastRegionName", "AiiSXqnafr");
        setField(term272536, term272536.getClass(), "lastClientId", "hKYdhUsiDC");
        setField(term272536, term272536.getClass(), "lastCountryCode", "whjpwSMlSP");
        setIntField(term272536, term272536.getClass(), "lastSelectEMoney", 294317488);
        setIntField(term272536, term272536.getClass(), "lastSelectTicket", -885458488);
        setIntField(term272536, term272536.getClass(), "lastSelectCourse", 2104352702);
        setIntField(term272536, term272536.getClass(), "lastCountCourse", -1118813318);
        setField(term272536, term272536.getClass(), "firstGameId", "CWWvGZMEId");
        setField(term272536, term272536.getClass(), "firstRomVersion", "uhdVsaXySd");
        setField(term272536, term272536.getClass(), "firstDataVersion", "evnloNxsNi");
        setField(term272536, term272536.getClass(), "firstPlayDate", "kLCuIvMMCV");
        setField(term272536, term272536.getClass(), "compatibleCmVersion", "KXSxokRDON");
        setField(term272536, term272536.getClass(), "dailyBonusDate", "eGlkGTQepc");
        setField(term272536, term272536.getClass(), "dailyCourseBonusDate", "DcEhRkuwFV");
        setField(term272536, term272536.getClass(), "lastPairLoginDate", "bLkMoMyLsr");
        setField(term272536, term272536.getClass(), "lastTrialPlayDate", "fMTcYTqwCd");
        setIntField(term272536, term272536.getClass(), "playVsCount", -1619455704);
        setIntField(term272536, term272536.getClass(), "playSyncCount", -572867773);
        setIntField(term272536, term272536.getClass(), "winCount", -724811435);
        setIntField(term272536, term272536.getClass(), "helpCount", 1503357399);
        setIntField(term272536, term272536.getClass(), "comboCount", -135502296);
        setLongField(term272536, term272536.getClass(), "totalDeluxscore", -3600465774703724309L);
        setLongField(term272536, term272536.getClass(), "totalBasicDeluxscore", -5365573477435473762L);
        setLongField(term272536, term272536.getClass(), "totalAdvancedDeluxscore", 1327127741525707822L);
        setLongField(term272536, term272536.getClass(), "totalExpertDeluxscore", 4123248256505041797L);
        setLongField(term272536, term272536.getClass(), "totalMasterDeluxscore", -8614442904308573894L);
        setLongField(term272536, term272536.getClass(), "totalReMasterDeluxscore", -7423174717739301809L);
        setIntField(term272536, term272536.getClass(), "totalSync", -556231095);
        setIntField(term272536, term272536.getClass(), "totalBasicSync", -157802489);
        setIntField(term272536, term272536.getClass(), "totalAdvancedSync", -607883905);
        setIntField(term272536, term272536.getClass(), "totalExpertSync", 640657317);
        setIntField(term272536, term272536.getClass(), "totalMasterSync", -50338111);
        setIntField(term272536, term272536.getClass(), "totalReMasterSync", -507824648);
        setLongField(term272536, term272536.getClass(), "totalAchievement", 8925847356196807076L);
        setLongField(term272536, term272536.getClass(), "totalBasicAchievement", 7181764834412549881L);
        setLongField(term272536, term272536.getClass(), "totalAdvancedAchievement", -5650041113709713472L);
        setLongField(term272536, term272536.getClass(), "totalExpertAchievement", -318073710460941304L);
        setLongField(term272536, term272536.getClass(), "totalMasterAchievement", -6604981815460391866L);
        setLongField(term272536, term272536.getClass(), "totalReMasterAchievement", -6836151137033127730L);
        setLongField(term272536, term272536.getClass(), "playerOldRating", -6974566131394981325L);
        setLongField(term272536, term272536.getClass(), "playerNewRating", 3913519163631706091L);
        setIntField(term272536, term272536.getClass(), "banState", -1843101234);
        setLongField(term272536, term272536.getClass(), "dateTime", 8939253797122524396L);
        term272889 = new Long(-1439208551493841386L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term272889;
        callMethod(klass, "setTotalExpertDeluxscore", argTypes, term272536, args);
    }

};


