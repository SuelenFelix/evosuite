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

public class UserDetail_getCharaLockSlot_186903456420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206390;

    public UserDetail_getCharaLockSlot_186903456420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term206394 = new Long(-629491722907628764L);
        Integer term206457 = new Integer(-1460628462);
        Integer term206459 = new Integer(-1466838817);
        Integer term206461 = new Integer(-1308667183);
        Integer term206463 = new Integer(-1936073165);
        Integer term206465 = new Integer(2145615477);
        Integer term206467 = new Integer(1806729907);
        Integer term206469 = new Integer(-182792320);
        Integer term206471 = new Integer(409164749);
        ArrayList term206455 = new ArrayList();
        ((ArrayList) term206455).add(term206457);
        ((ArrayList) term206455).add(term206459);
        ((ArrayList) term206455).add(term206461);
        ((ArrayList) term206455).add(term206463);
        ((ArrayList) term206455).add(term206465);
        ((ArrayList) term206455).add(term206467);
        ((ArrayList) term206455).add(term206469);
        ((ArrayList) term206455).add(term206471);
        Integer term206477 = new Integer(896581942);
        Integer term206479 = new Integer(108670537);
        Integer term206481 = new Integer(-94326012);
        Integer term206483 = new Integer(-665192132);
        ArrayList term206475 = new ArrayList();
        ((ArrayList) term206475).add(term206477);
        ((ArrayList) term206475).add(term206479);
        ((ArrayList) term206475).add(term206481);
        ((ArrayList) term206475).add(term206483);
        term206390 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term206392 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term206408 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term206409 = newInstance(Class.forName("java.time.LocalDate"));
        Object term206413 = newInstance(Class.forName("java.time.LocalTime"));
        Object term206418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term206419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term206423 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term206390, term206390.getClass(), "id", 7118207130851662360L);
        setLongField(term206392, term206392.getClass(), "id", -7333602000853268873L);
        setField(term206392, term206392.getClass(), "extId", term206394);
        setField(term206392, term206392.getClass(), "luid", "jIXGRosYml");
        setIntField(term206409, term206409.getClass(), "year", 2024);
        setShortField(term206409, term206409.getClass(), "month", (short) 12);
        setShortField(term206409, term206409.getClass(), "day", (short) 29);
        setField(term206408, term206408.getClass(), "date", term206409);
        setByteField(term206413, term206413.getClass(), "hour", (byte) 22);
        setByteField(term206413, term206413.getClass(), "minute", (byte) 7);
        setByteField(term206413, term206413.getClass(), "second", (byte) 1);
        setIntField(term206413, term206413.getClass(), "nano", 924286363);
        setField(term206408, term206408.getClass(), "time", term206413);
        setField(term206392, term206392.getClass(), "registerTime", term206408);
        setIntField(term206419, term206419.getClass(), "year", 2011);
        setShortField(term206419, term206419.getClass(), "month", (short) 12);
        setShortField(term206419, term206419.getClass(), "day", (short) 13);
        setField(term206418, term206418.getClass(), "date", term206419);
        setByteField(term206423, term206423.getClass(), "hour", (byte) 4);
        setByteField(term206423, term206423.getClass(), "minute", (byte) 19);
        setByteField(term206423, term206423.getClass(), "second", (byte) 3);
        setIntField(term206423, term206423.getClass(), "nano", 325415099);
        setField(term206418, term206418.getClass(), "time", term206423);
        setField(term206392, term206392.getClass(), "accessTime", term206418);
        setField(term206390, term206390.getClass(), "card", term206392);
        setField(term206390, term206390.getClass(), "userName", "GChVbEilUy");
        setIntField(term206390, term206390.getClass(), "isNetMember", 1650761692);
        setIntField(term206390, term206390.getClass(), "iconId", -888914454);
        setIntField(term206390, term206390.getClass(), "plateId", -1836369853);
        setIntField(term206390, term206390.getClass(), "titleId", -2069140329);
        setIntField(term206390, term206390.getClass(), "partnerId", -1240410704);
        setIntField(term206390, term206390.getClass(), "frameId", 946474812);
        setIntField(term206390, term206390.getClass(), "selectMapId", 1102379330);
        setIntField(term206390, term206390.getClass(), "totalAwake", -1473411882);
        setIntField(term206390, term206390.getClass(), "gradeRating", 1302685636);
        setIntField(term206390, term206390.getClass(), "musicRating", -1202675628);
        setIntField(term206390, term206390.getClass(), "playerRating", -117044732);
        setIntField(term206390, term206390.getClass(), "highestRating", -912545932);
        setIntField(term206390, term206390.getClass(), "gradeRank", -323859);
        setIntField(term206390, term206390.getClass(), "classRank", 181699558);
        setIntField(term206390, term206390.getClass(), "courseRank", -258863944);
        setField(term206390, term206390.getClass(), "charaSlot", term206455);
        setField(term206390, term206390.getClass(), "charaLockSlot", term206475);
        setLongField(term206390, term206390.getClass(), "contentBit", 5324115370347537200L);
        setIntField(term206390, term206390.getClass(), "playCount", 634023528);
        setField(term206390, term206390.getClass(), "eventWatchedDate", "JkoBKGFKfm");
        setField(term206390, term206390.getClass(), "lastGameId", "lIJcHqZuye");
        setField(term206390, term206390.getClass(), "lastRomVersion", "jhvlWlsOEZ");
        setField(term206390, term206390.getClass(), "lastDataVersion", "xGHScipsIm");
        setField(term206390, term206390.getClass(), "lastLoginDate", "BrfDvbpnrx");
        setField(term206390, term206390.getClass(), "lastPlayDate", "BQFebJlaPW");
        setIntField(term206390, term206390.getClass(), "lastPlayCredit", -1426549826);
        setIntField(term206390, term206390.getClass(), "lastPlayMode", 1932134326);
        setIntField(term206390, term206390.getClass(), "lastPlaceId", -909738839);
        setField(term206390, term206390.getClass(), "lastPlaceName", "HHyJeOajSI");
        setIntField(term206390, term206390.getClass(), "lastAllNetId", 271645048);
        setIntField(term206390, term206390.getClass(), "lastRegionId", 1234306330);
        setField(term206390, term206390.getClass(), "lastRegionName", "hVvOTNVpNh");
        setField(term206390, term206390.getClass(), "lastClientId", "LvvjfqJUIY");
        setField(term206390, term206390.getClass(), "lastCountryCode", "vBvjSGwIXW");
        setIntField(term206390, term206390.getClass(), "lastSelectEMoney", 146827683);
        setIntField(term206390, term206390.getClass(), "lastSelectTicket", 347724024);
        setIntField(term206390, term206390.getClass(), "lastSelectCourse", 1273746652);
        setIntField(term206390, term206390.getClass(), "lastCountCourse", 1282163721);
        setField(term206390, term206390.getClass(), "firstGameId", "LWyvyTfkti");
        setField(term206390, term206390.getClass(), "firstRomVersion", "CDwdGEqnKv");
        setField(term206390, term206390.getClass(), "firstDataVersion", "BTzFdjZWKY");
        setField(term206390, term206390.getClass(), "firstPlayDate", "JJJyoZGMOL");
        setField(term206390, term206390.getClass(), "compatibleCmVersion", "erxVkfpiRk");
        setField(term206390, term206390.getClass(), "dailyBonusDate", "ehNaioRZVE");
        setField(term206390, term206390.getClass(), "dailyCourseBonusDate", "UttjyRKHwn");
        setField(term206390, term206390.getClass(), "lastPairLoginDate", "IyJjCUddkw");
        setField(term206390, term206390.getClass(), "lastTrialPlayDate", "heIrYPNcWE");
        setIntField(term206390, term206390.getClass(), "playVsCount", 603248870);
        setIntField(term206390, term206390.getClass(), "playSyncCount", -1909045622);
        setIntField(term206390, term206390.getClass(), "winCount", -390781407);
        setIntField(term206390, term206390.getClass(), "helpCount", -1039337265);
        setIntField(term206390, term206390.getClass(), "comboCount", -685914213);
        setLongField(term206390, term206390.getClass(), "totalDeluxscore", -1031690816663361709L);
        setLongField(term206390, term206390.getClass(), "totalBasicDeluxscore", -8704969733298716750L);
        setLongField(term206390, term206390.getClass(), "totalAdvancedDeluxscore", -3384354359532522329L);
        setLongField(term206390, term206390.getClass(), "totalExpertDeluxscore", 2388267345399324768L);
        setLongField(term206390, term206390.getClass(), "totalMasterDeluxscore", 320740926381311842L);
        setLongField(term206390, term206390.getClass(), "totalReMasterDeluxscore", -3923648646183771872L);
        setIntField(term206390, term206390.getClass(), "totalSync", 1920458051);
        setIntField(term206390, term206390.getClass(), "totalBasicSync", -1153940656);
        setIntField(term206390, term206390.getClass(), "totalAdvancedSync", 963396922);
        setIntField(term206390, term206390.getClass(), "totalExpertSync", -1975824255);
        setIntField(term206390, term206390.getClass(), "totalMasterSync", 191239283);
        setIntField(term206390, term206390.getClass(), "totalReMasterSync", 367335503);
        setLongField(term206390, term206390.getClass(), "totalAchievement", -385192334019668780L);
        setLongField(term206390, term206390.getClass(), "totalBasicAchievement", 8841131133960236803L);
        setLongField(term206390, term206390.getClass(), "totalAdvancedAchievement", -7441555227944374707L);
        setLongField(term206390, term206390.getClass(), "totalExpertAchievement", 1333815261980166786L);
        setLongField(term206390, term206390.getClass(), "totalMasterAchievement", -2216846611014871291L);
        setLongField(term206390, term206390.getClass(), "totalReMasterAchievement", 2388734666140215817L);
        setLongField(term206390, term206390.getClass(), "playerOldRating", 8399679939883897915L);
        setLongField(term206390, term206390.getClass(), "playerNewRating", 8115609489953325241L);
        setIntField(term206390, term206390.getClass(), "banState", -1858156484);
        setLongField(term206390, term206390.getClass(), "dateTime", 4476216855495072671L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharaLockSlot", argTypes, term206390, args);
    }

};


