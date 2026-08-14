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

public class UserDetail_getCharaLockSlot_186903456419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206335;

    public UserDetail_getCharaLockSlot_186903456419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term206339 = new Long(-629491722907628764L);
        Integer term206402 = new Integer(-1460628462);
        Integer term206404 = new Integer(-1466838817);
        Integer term206406 = new Integer(-1308667183);
        Integer term206408 = new Integer(-1936073165);
        Integer term206410 = new Integer(2145615477);
        Integer term206412 = new Integer(1806729907);
        Integer term206414 = new Integer(-182792320);
        Integer term206416 = new Integer(409164749);
        ArrayList term206400 = new ArrayList();
        ((ArrayList) term206400).add(term206402);
        ((ArrayList) term206400).add(term206404);
        ((ArrayList) term206400).add(term206406);
        ((ArrayList) term206400).add(term206408);
        ((ArrayList) term206400).add(term206410);
        ((ArrayList) term206400).add(term206412);
        ((ArrayList) term206400).add(term206414);
        ((ArrayList) term206400).add(term206416);
        Integer term206422 = new Integer(896581942);
        Integer term206424 = new Integer(108670537);
        Integer term206426 = new Integer(-94326012);
        Integer term206428 = new Integer(-665192132);
        ArrayList term206420 = new ArrayList();
        ((ArrayList) term206420).add(term206422);
        ((ArrayList) term206420).add(term206424);
        ((ArrayList) term206420).add(term206426);
        ((ArrayList) term206420).add(term206428);
        term206335 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term206337 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term206353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term206354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term206358 = newInstance(Class.forName("java.time.LocalTime"));
        Object term206363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term206364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term206368 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term206335, term206335.getClass(), "id", 7118207130851662360L);
        setLongField(term206337, term206337.getClass(), "id", -7333602000853268873L);
        setField(term206337, term206337.getClass(), "extId", term206339);
        setField(term206337, term206337.getClass(), "luid", "jIXGRosYml");
        setIntField(term206354, term206354.getClass(), "year", 2024);
        setShortField(term206354, term206354.getClass(), "month", (short) 12);
        setShortField(term206354, term206354.getClass(), "day", (short) 29);
        setField(term206353, term206353.getClass(), "date", term206354);
        setByteField(term206358, term206358.getClass(), "hour", (byte) 22);
        setByteField(term206358, term206358.getClass(), "minute", (byte) 7);
        setByteField(term206358, term206358.getClass(), "second", (byte) 1);
        setIntField(term206358, term206358.getClass(), "nano", 924286363);
        setField(term206353, term206353.getClass(), "time", term206358);
        setField(term206337, term206337.getClass(), "registerTime", term206353);
        setIntField(term206364, term206364.getClass(), "year", 2011);
        setShortField(term206364, term206364.getClass(), "month", (short) 12);
        setShortField(term206364, term206364.getClass(), "day", (short) 13);
        setField(term206363, term206363.getClass(), "date", term206364);
        setByteField(term206368, term206368.getClass(), "hour", (byte) 4);
        setByteField(term206368, term206368.getClass(), "minute", (byte) 19);
        setByteField(term206368, term206368.getClass(), "second", (byte) 3);
        setIntField(term206368, term206368.getClass(), "nano", 325415099);
        setField(term206363, term206363.getClass(), "time", term206368);
        setField(term206337, term206337.getClass(), "accessTime", term206363);
        setField(term206335, term206335.getClass(), "card", term206337);
        setField(term206335, term206335.getClass(), "userName", "GChVbEilUy");
        setIntField(term206335, term206335.getClass(), "isNetMember", 1650761692);
        setIntField(term206335, term206335.getClass(), "iconId", -888914454);
        setIntField(term206335, term206335.getClass(), "plateId", -1836369853);
        setIntField(term206335, term206335.getClass(), "titleId", -2069140329);
        setIntField(term206335, term206335.getClass(), "partnerId", -1240410704);
        setIntField(term206335, term206335.getClass(), "frameId", 946474812);
        setIntField(term206335, term206335.getClass(), "selectMapId", 1102379330);
        setIntField(term206335, term206335.getClass(), "totalAwake", -1473411882);
        setIntField(term206335, term206335.getClass(), "gradeRating", 1302685636);
        setIntField(term206335, term206335.getClass(), "musicRating", -1202675628);
        setIntField(term206335, term206335.getClass(), "playerRating", -117044732);
        setIntField(term206335, term206335.getClass(), "highestRating", -912545932);
        setIntField(term206335, term206335.getClass(), "gradeRank", -323859);
        setIntField(term206335, term206335.getClass(), "classRank", 181699558);
        setIntField(term206335, term206335.getClass(), "courseRank", -258863944);
        setField(term206335, term206335.getClass(), "charaSlot", term206400);
        setField(term206335, term206335.getClass(), "charaLockSlot", term206420);
        setLongField(term206335, term206335.getClass(), "contentBit", 5324115370347537200L);
        setIntField(term206335, term206335.getClass(), "playCount", 634023528);
        setField(term206335, term206335.getClass(), "eventWatchedDate", "JkoBKGFKfm");
        setField(term206335, term206335.getClass(), "lastGameId", "lIJcHqZuye");
        setField(term206335, term206335.getClass(), "lastRomVersion", "jhvlWlsOEZ");
        setField(term206335, term206335.getClass(), "lastDataVersion", "xGHScipsIm");
        setField(term206335, term206335.getClass(), "lastLoginDate", "BrfDvbpnrx");
        setField(term206335, term206335.getClass(), "lastPlayDate", "BQFebJlaPW");
        setIntField(term206335, term206335.getClass(), "lastPlayCredit", -1426549826);
        setIntField(term206335, term206335.getClass(), "lastPlayMode", 1932134326);
        setIntField(term206335, term206335.getClass(), "lastPlaceId", -909738839);
        setField(term206335, term206335.getClass(), "lastPlaceName", "HHyJeOajSI");
        setIntField(term206335, term206335.getClass(), "lastAllNetId", 271645048);
        setIntField(term206335, term206335.getClass(), "lastRegionId", 1234306330);
        setField(term206335, term206335.getClass(), "lastRegionName", "hVvOTNVpNh");
        setField(term206335, term206335.getClass(), "lastClientId", "LvvjfqJUIY");
        setField(term206335, term206335.getClass(), "lastCountryCode", "vBvjSGwIXW");
        setIntField(term206335, term206335.getClass(), "lastSelectEMoney", 146827683);
        setIntField(term206335, term206335.getClass(), "lastSelectTicket", 347724024);
        setIntField(term206335, term206335.getClass(), "lastSelectCourse", 1273746652);
        setIntField(term206335, term206335.getClass(), "lastCountCourse", 1282163721);
        setField(term206335, term206335.getClass(), "firstGameId", "LWyvyTfkti");
        setField(term206335, term206335.getClass(), "firstRomVersion", "CDwdGEqnKv");
        setField(term206335, term206335.getClass(), "firstDataVersion", "BTzFdjZWKY");
        setField(term206335, term206335.getClass(), "firstPlayDate", "JJJyoZGMOL");
        setField(term206335, term206335.getClass(), "compatibleCmVersion", "erxVkfpiRk");
        setField(term206335, term206335.getClass(), "dailyBonusDate", "ehNaioRZVE");
        setField(term206335, term206335.getClass(), "dailyCourseBonusDate", "UttjyRKHwn");
        setField(term206335, term206335.getClass(), "lastPairLoginDate", "IyJjCUddkw");
        setField(term206335, term206335.getClass(), "lastTrialPlayDate", "heIrYPNcWE");
        setIntField(term206335, term206335.getClass(), "playVsCount", 603248870);
        setIntField(term206335, term206335.getClass(), "playSyncCount", -1909045622);
        setIntField(term206335, term206335.getClass(), "winCount", -390781407);
        setIntField(term206335, term206335.getClass(), "helpCount", -1039337265);
        setIntField(term206335, term206335.getClass(), "comboCount", -685914213);
        setLongField(term206335, term206335.getClass(), "totalDeluxscore", -1031690816663361709L);
        setLongField(term206335, term206335.getClass(), "totalBasicDeluxscore", -8704969733298716750L);
        setLongField(term206335, term206335.getClass(), "totalAdvancedDeluxscore", -3384354359532522329L);
        setLongField(term206335, term206335.getClass(), "totalExpertDeluxscore", 2388267345399324768L);
        setLongField(term206335, term206335.getClass(), "totalMasterDeluxscore", 320740926381311842L);
        setLongField(term206335, term206335.getClass(), "totalReMasterDeluxscore", -3923648646183771872L);
        setIntField(term206335, term206335.getClass(), "totalSync", 1920458051);
        setIntField(term206335, term206335.getClass(), "totalBasicSync", -1153940656);
        setIntField(term206335, term206335.getClass(), "totalAdvancedSync", 963396922);
        setIntField(term206335, term206335.getClass(), "totalExpertSync", -1975824255);
        setIntField(term206335, term206335.getClass(), "totalMasterSync", 191239283);
        setIntField(term206335, term206335.getClass(), "totalReMasterSync", 367335503);
        setLongField(term206335, term206335.getClass(), "totalAchievement", -385192334019668780L);
        setLongField(term206335, term206335.getClass(), "totalBasicAchievement", 8841131133960236803L);
        setLongField(term206335, term206335.getClass(), "totalAdvancedAchievement", -7441555227944374707L);
        setLongField(term206335, term206335.getClass(), "totalExpertAchievement", 1333815261980166786L);
        setLongField(term206335, term206335.getClass(), "totalMasterAchievement", -2216846611014871291L);
        setLongField(term206335, term206335.getClass(), "totalReMasterAchievement", 2388734666140215817L);
        setLongField(term206335, term206335.getClass(), "playerOldRating", 8399679939883897915L);
        setLongField(term206335, term206335.getClass(), "playerNewRating", 8115609489953325241L);
        setIntField(term206335, term206335.getClass(), "banState", -1858156484);
        setLongField(term206335, term206335.getClass(), "dateTime", 4476216855495072671L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharaLockSlot", argTypes, term206335, args);
    }

};


