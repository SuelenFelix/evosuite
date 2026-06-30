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

public class UserCharacter_init_15629907970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184577;

    public UserCharacter_init_15629907970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term184581 = new Long(-136372844051852955L);
        Integer term184644 = new Integer(-898083613);
        Integer term184646 = new Integer(1072590759);
        Integer term184648 = new Integer(-261873217);
        Integer term184650 = new Integer(275234848);
        Integer term184652 = new Integer(-400500781);
        Integer term184654 = new Integer(-1811725314);
        ArrayList term184642 = new ArrayList();
        ((ArrayList) term184642).add(term184644);
        ((ArrayList) term184642).add(term184646);
        ((ArrayList) term184642).add(term184648);
        ((ArrayList) term184642).add(term184650);
        ((ArrayList) term184642).add(term184652);
        ((ArrayList) term184642).add(term184654);
        Integer term184660 = new Integer(-1802258300);
        Integer term184662 = new Integer(-407739204);
        ArrayList term184658 = new ArrayList();
        ((ArrayList) term184658).add(term184660);
        ((ArrayList) term184658).add(term184662);
        term184577 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term184579 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term184595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term184596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term184600 = newInstance(Class.forName("java.time.LocalTime"));
        Object term184605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term184606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term184610 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term184577, term184577.getClass(), "id", -3202506619411872674L);
        setLongField(term184579, term184579.getClass(), "id", -1568734926667301919L);
        setField(term184579, term184579.getClass(), "extId", term184581);
        setField(term184579, term184579.getClass(), "luid", "bPkkpAUHEa");
        setIntField(term184596, term184596.getClass(), "year", 2025);
        setShortField(term184596, term184596.getClass(), "month", (short) 3);
        setShortField(term184596, term184596.getClass(), "day", (short) 2);
        setField(term184595, term184595.getClass(), "date", term184596);
        setByteField(term184600, term184600.getClass(), "hour", (byte) 23);
        setByteField(term184600, term184600.getClass(), "minute", (byte) 28);
        setByteField(term184600, term184600.getClass(), "second", (byte) 42);
        setIntField(term184600, term184600.getClass(), "nano", 204636448);
        setField(term184595, term184595.getClass(), "time", term184600);
        setField(term184579, term184579.getClass(), "registerTime", term184595);
        setIntField(term184606, term184606.getClass(), "year", 2023);
        setShortField(term184606, term184606.getClass(), "month", (short) 8);
        setShortField(term184606, term184606.getClass(), "day", (short) 30);
        setField(term184605, term184605.getClass(), "date", term184606);
        setByteField(term184610, term184610.getClass(), "hour", (byte) 9);
        setByteField(term184610, term184610.getClass(), "minute", (byte) 28);
        setByteField(term184610, term184610.getClass(), "second", (byte) 51);
        setIntField(term184610, term184610.getClass(), "nano", 285035808);
        setField(term184605, term184605.getClass(), "time", term184610);
        setField(term184579, term184579.getClass(), "accessTime", term184605);
        setField(term184577, term184577.getClass(), "card", term184579);
        setField(term184577, term184577.getClass(), "userName", "cUKOSJBBAw");
        setIntField(term184577, term184577.getClass(), "isNetMember", -1104509081);
        setIntField(term184577, term184577.getClass(), "iconId", 444190847);
        setIntField(term184577, term184577.getClass(), "plateId", 2111517446);
        setIntField(term184577, term184577.getClass(), "titleId", -39807030);
        setIntField(term184577, term184577.getClass(), "partnerId", -308723512);
        setIntField(term184577, term184577.getClass(), "frameId", -500062566);
        setIntField(term184577, term184577.getClass(), "selectMapId", -955513817);
        setIntField(term184577, term184577.getClass(), "totalAwake", -1864369159);
        setIntField(term184577, term184577.getClass(), "gradeRating", -1507868397);
        setIntField(term184577, term184577.getClass(), "musicRating", -525791468);
        setIntField(term184577, term184577.getClass(), "playerRating", 1134512930);
        setIntField(term184577, term184577.getClass(), "highestRating", -1582011061);
        setIntField(term184577, term184577.getClass(), "gradeRank", 1582993223);
        setIntField(term184577, term184577.getClass(), "classRank", 246696471);
        setIntField(term184577, term184577.getClass(), "courseRank", -316548746);
        setField(term184577, term184577.getClass(), "charaSlot", term184642);
        setField(term184577, term184577.getClass(), "charaLockSlot", term184658);
        setLongField(term184577, term184577.getClass(), "contentBit", 8404979198900872572L);
        setIntField(term184577, term184577.getClass(), "playCount", 352020388);
        setField(term184577, term184577.getClass(), "eventWatchedDate", "NFAztRXNmN");
        setField(term184577, term184577.getClass(), "lastGameId", "cOIEJbLIQI");
        setField(term184577, term184577.getClass(), "lastRomVersion", "TvYrMVmZHT");
        setField(term184577, term184577.getClass(), "lastDataVersion", "LpFLzVObNe");
        setField(term184577, term184577.getClass(), "lastLoginDate", "xSaAaiACTx");
        setField(term184577, term184577.getClass(), "lastPlayDate", "gsnDoCKSDa");
        setIntField(term184577, term184577.getClass(), "lastPlayCredit", -499509478);
        setIntField(term184577, term184577.getClass(), "lastPlayMode", 466328915);
        setIntField(term184577, term184577.getClass(), "lastPlaceId", -1590658996);
        setField(term184577, term184577.getClass(), "lastPlaceName", "igCjeeKwSN");
        setIntField(term184577, term184577.getClass(), "lastAllNetId", -1738020486);
        setIntField(term184577, term184577.getClass(), "lastRegionId", 140506413);
        setField(term184577, term184577.getClass(), "lastRegionName", "UwqxIAgbVI");
        setField(term184577, term184577.getClass(), "lastClientId", "ZNRLQRfFIP");
        setField(term184577, term184577.getClass(), "lastCountryCode", "bnnAetbkOZ");
        setIntField(term184577, term184577.getClass(), "lastSelectEMoney", -785678813);
        setIntField(term184577, term184577.getClass(), "lastSelectTicket", 1295397324);
        setIntField(term184577, term184577.getClass(), "lastSelectCourse", -1445387113);
        setIntField(term184577, term184577.getClass(), "lastCountCourse", -1584901503);
        setField(term184577, term184577.getClass(), "firstGameId", "wMjxNGGfFZ");
        setField(term184577, term184577.getClass(), "firstRomVersion", "wsirPqRrlc");
        setField(term184577, term184577.getClass(), "firstDataVersion", "gkEkytWJJj");
        setField(term184577, term184577.getClass(), "firstPlayDate", "KQaBgHpPTE");
        setField(term184577, term184577.getClass(), "compatibleCmVersion", "ftWAuQBFQb");
        setField(term184577, term184577.getClass(), "dailyBonusDate", "GDIImTLJuG");
        setField(term184577, term184577.getClass(), "dailyCourseBonusDate", "nGAQeiXMym");
        setField(term184577, term184577.getClass(), "lastPairLoginDate", "kUwXxbHTwL");
        setField(term184577, term184577.getClass(), "lastTrialPlayDate", "jyCeUOPFOB");
        setIntField(term184577, term184577.getClass(), "playVsCount", -1865762318);
        setIntField(term184577, term184577.getClass(), "playSyncCount", 431315883);
        setIntField(term184577, term184577.getClass(), "winCount", -1117456611);
        setIntField(term184577, term184577.getClass(), "helpCount", 459866921);
        setIntField(term184577, term184577.getClass(), "comboCount", -1981792037);
        setLongField(term184577, term184577.getClass(), "totalDeluxscore", 3663186706641799531L);
        setLongField(term184577, term184577.getClass(), "totalBasicDeluxscore", 2516991685981339429L);
        setLongField(term184577, term184577.getClass(), "totalAdvancedDeluxscore", -7553534160311859168L);
        setLongField(term184577, term184577.getClass(), "totalExpertDeluxscore", 2360637695125275815L);
        setLongField(term184577, term184577.getClass(), "totalMasterDeluxscore", 4067141811082925813L);
        setLongField(term184577, term184577.getClass(), "totalReMasterDeluxscore", -2948442217672242951L);
        setIntField(term184577, term184577.getClass(), "totalSync", 41826056);
        setIntField(term184577, term184577.getClass(), "totalBasicSync", 1336045771);
        setIntField(term184577, term184577.getClass(), "totalAdvancedSync", 282549313);
        setIntField(term184577, term184577.getClass(), "totalExpertSync", -332892529);
        setIntField(term184577, term184577.getClass(), "totalMasterSync", 1007630712);
        setIntField(term184577, term184577.getClass(), "totalReMasterSync", 1203824766);
        setLongField(term184577, term184577.getClass(), "totalAchievement", 5797750485291180901L);
        setLongField(term184577, term184577.getClass(), "totalBasicAchievement", 4303446906012330238L);
        setLongField(term184577, term184577.getClass(), "totalAdvancedAchievement", 3830648831449737036L);
        setLongField(term184577, term184577.getClass(), "totalExpertAchievement", -8881687333773912565L);
        setLongField(term184577, term184577.getClass(), "totalMasterAchievement", 5798023326474789142L);
        setLongField(term184577, term184577.getClass(), "totalReMasterAchievement", -3421826060398099290L);
        setLongField(term184577, term184577.getClass(), "playerOldRating", -6532658972813252072L);
        setLongField(term184577, term184577.getClass(), "playerNewRating", -7964720472911740015L);
        setIntField(term184577, term184577.getClass(), "banState", 413201694);
        setLongField(term184577, term184577.getClass(), "dateTime", -4050135177435410627L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term184577;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


