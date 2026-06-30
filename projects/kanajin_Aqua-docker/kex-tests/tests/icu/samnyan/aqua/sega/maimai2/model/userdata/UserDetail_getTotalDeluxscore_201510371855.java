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

public class UserDetail_getTotalDeluxscore_201510371855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4260645;

    public UserDetail_getTotalDeluxscore_201510371855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4260649 = new Long(-427204309460562393L);
        Integer term4260712 = new Integer(-1241552174);
        Integer term4260714 = new Integer(1571367099);
        Integer term4260716 = new Integer(-106290041);
        Integer term4260718 = new Integer(-1931235714);
        Integer term4260720 = new Integer(1975801653);
        Integer term4260722 = new Integer(-2017767309);
        ArrayList term4260710 = new ArrayList();
        ((ArrayList) term4260710).add(term4260712);
        ((ArrayList) term4260710).add(term4260714);
        ((ArrayList) term4260710).add(term4260716);
        ((ArrayList) term4260710).add(term4260718);
        ((ArrayList) term4260710).add(term4260720);
        ((ArrayList) term4260710).add(term4260722);
        Integer term4260728 = new Integer(1167998823);
        Integer term4260730 = new Integer(-464580200);
        Integer term4260732 = new Integer(-599457969);
        Integer term4260734 = new Integer(-1479981191);
        Integer term4260736 = new Integer(-2140535400);
        Integer term4260738 = new Integer(-1606011085);
        Integer term4260740 = new Integer(460089767);
        Integer term4260742 = new Integer(-243759577);
        Integer term4260744 = new Integer(1346767326);
        ArrayList term4260726 = new ArrayList();
        ((ArrayList) term4260726).add(term4260728);
        ((ArrayList) term4260726).add(term4260730);
        ((ArrayList) term4260726).add(term4260732);
        ((ArrayList) term4260726).add(term4260734);
        ((ArrayList) term4260726).add(term4260736);
        ((ArrayList) term4260726).add(term4260738);
        ((ArrayList) term4260726).add(term4260740);
        ((ArrayList) term4260726).add(term4260742);
        ((ArrayList) term4260726).add(term4260744);
        term4260645 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4260647 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4260663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4260664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4260668 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4260673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4260674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4260678 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4260645, term4260645.getClass(), "id", -8726075312776517687L);
        setLongField(term4260647, term4260647.getClass(), "id", 8924610302396365676L);
        setField(term4260647, term4260647.getClass(), "extId", term4260649);
        setField(term4260647, term4260647.getClass(), "luid", "icjoAgzFGX");
        setIntField(term4260664, term4260664.getClass(), "year", 2018);
        setShortField(term4260664, term4260664.getClass(), "month", (short) 1);
        setShortField(term4260664, term4260664.getClass(), "day", (short) 27);
        setField(term4260663, term4260663.getClass(), "date", term4260664);
        setByteField(term4260668, term4260668.getClass(), "hour", (byte) 7);
        setByteField(term4260668, term4260668.getClass(), "minute", (byte) 27);
        setByteField(term4260668, term4260668.getClass(), "second", (byte) 33);
        setIntField(term4260668, term4260668.getClass(), "nano", 683901972);
        setField(term4260663, term4260663.getClass(), "time", term4260668);
        setField(term4260647, term4260647.getClass(), "registerTime", term4260663);
        setIntField(term4260674, term4260674.getClass(), "year", 2017);
        setShortField(term4260674, term4260674.getClass(), "month", (short) 7);
        setShortField(term4260674, term4260674.getClass(), "day", (short) 4);
        setField(term4260673, term4260673.getClass(), "date", term4260674);
        setByteField(term4260678, term4260678.getClass(), "hour", (byte) 23);
        setByteField(term4260678, term4260678.getClass(), "minute", (byte) 48);
        setByteField(term4260678, term4260678.getClass(), "second", (byte) 1);
        setIntField(term4260678, term4260678.getClass(), "nano", 181275507);
        setField(term4260673, term4260673.getClass(), "time", term4260678);
        setField(term4260647, term4260647.getClass(), "accessTime", term4260673);
        setField(term4260645, term4260645.getClass(), "card", term4260647);
        setField(term4260645, term4260645.getClass(), "userName", "DgtFvFrUds");
        setIntField(term4260645, term4260645.getClass(), "isNetMember", -1244438228);
        setIntField(term4260645, term4260645.getClass(), "iconId", -1861658106);
        setIntField(term4260645, term4260645.getClass(), "plateId", 762563529);
        setIntField(term4260645, term4260645.getClass(), "titleId", -498635359);
        setIntField(term4260645, term4260645.getClass(), "partnerId", 1253916435);
        setIntField(term4260645, term4260645.getClass(), "frameId", 857927614);
        setIntField(term4260645, term4260645.getClass(), "selectMapId", -1565235741);
        setIntField(term4260645, term4260645.getClass(), "totalAwake", 1633145240);
        setIntField(term4260645, term4260645.getClass(), "gradeRating", -1953367387);
        setIntField(term4260645, term4260645.getClass(), "musicRating", 1519834833);
        setIntField(term4260645, term4260645.getClass(), "playerRating", 2051562286);
        setIntField(term4260645, term4260645.getClass(), "highestRating", -1418690063);
        setIntField(term4260645, term4260645.getClass(), "gradeRank", -528515484);
        setIntField(term4260645, term4260645.getClass(), "classRank", 48825999);
        setIntField(term4260645, term4260645.getClass(), "courseRank", -825140152);
        setField(term4260645, term4260645.getClass(), "charaSlot", term4260710);
        setField(term4260645, term4260645.getClass(), "charaLockSlot", term4260726);
        setLongField(term4260645, term4260645.getClass(), "contentBit", -625987590200799010L);
        setIntField(term4260645, term4260645.getClass(), "playCount", 1073249057);
        setField(term4260645, term4260645.getClass(), "eventWatchedDate", "tYzMcZWutZ");
        setField(term4260645, term4260645.getClass(), "lastGameId", "PZRoxUyRGc");
        setField(term4260645, term4260645.getClass(), "lastRomVersion", "yibsizPQii");
        setField(term4260645, term4260645.getClass(), "lastDataVersion", "YdMTLiiHOA");
        setField(term4260645, term4260645.getClass(), "lastLoginDate", "ttfcswbibq");
        setField(term4260645, term4260645.getClass(), "lastPlayDate", "EnHbtwbDJj");
        setIntField(term4260645, term4260645.getClass(), "lastPlayCredit", -523444193);
        setIntField(term4260645, term4260645.getClass(), "lastPlayMode", -1194517886);
        setIntField(term4260645, term4260645.getClass(), "lastPlaceId", -22219314);
        setField(term4260645, term4260645.getClass(), "lastPlaceName", "HtTewjcunv");
        setIntField(term4260645, term4260645.getClass(), "lastAllNetId", 1671660966);
        setIntField(term4260645, term4260645.getClass(), "lastRegionId", -1545699673);
        setField(term4260645, term4260645.getClass(), "lastRegionName", "WHEhOFZIeY");
        setField(term4260645, term4260645.getClass(), "lastClientId", "fnexlcwcUH");
        setField(term4260645, term4260645.getClass(), "lastCountryCode", "WKgWkAdGXP");
        setIntField(term4260645, term4260645.getClass(), "lastSelectEMoney", 1166454811);
        setIntField(term4260645, term4260645.getClass(), "lastSelectTicket", -1018312907);
        setIntField(term4260645, term4260645.getClass(), "lastSelectCourse", -1675557303);
        setIntField(term4260645, term4260645.getClass(), "lastCountCourse", 1886504648);
        setField(term4260645, term4260645.getClass(), "firstGameId", "UCSIFzzkur");
        setField(term4260645, term4260645.getClass(), "firstRomVersion", "CkHwPGiylf");
        setField(term4260645, term4260645.getClass(), "firstDataVersion", "pFAqagonjG");
        setField(term4260645, term4260645.getClass(), "firstPlayDate", "wlZrKPvJLB");
        setField(term4260645, term4260645.getClass(), "compatibleCmVersion", "MevLNdjWow");
        setField(term4260645, term4260645.getClass(), "dailyBonusDate", "NXKITikMuz");
        setField(term4260645, term4260645.getClass(), "dailyCourseBonusDate", "TVNJlPVfwC");
        setField(term4260645, term4260645.getClass(), "lastPairLoginDate", "ldawxJLOHu");
        setField(term4260645, term4260645.getClass(), "lastTrialPlayDate", "bOCeMDGigh");
        setIntField(term4260645, term4260645.getClass(), "playVsCount", 658471566);
        setIntField(term4260645, term4260645.getClass(), "playSyncCount", -772746535);
        setIntField(term4260645, term4260645.getClass(), "winCount", 766578340);
        setIntField(term4260645, term4260645.getClass(), "helpCount", -744762505);
        setIntField(term4260645, term4260645.getClass(), "comboCount", -414174983);
        setLongField(term4260645, term4260645.getClass(), "totalDeluxscore", -8002687049619351634L);
        setLongField(term4260645, term4260645.getClass(), "totalBasicDeluxscore", -5819779387985703128L);
        setLongField(term4260645, term4260645.getClass(), "totalAdvancedDeluxscore", 6901906795291349627L);
        setLongField(term4260645, term4260645.getClass(), "totalExpertDeluxscore", 3953349402711051366L);
        setLongField(term4260645, term4260645.getClass(), "totalMasterDeluxscore", 4666496573607541789L);
        setLongField(term4260645, term4260645.getClass(), "totalReMasterDeluxscore", 8618261227743883578L);
        setIntField(term4260645, term4260645.getClass(), "totalSync", -540066986);
        setIntField(term4260645, term4260645.getClass(), "totalBasicSync", -170167837);
        setIntField(term4260645, term4260645.getClass(), "totalAdvancedSync", 1511349575);
        setIntField(term4260645, term4260645.getClass(), "totalExpertSync", -1884833077);
        setIntField(term4260645, term4260645.getClass(), "totalMasterSync", -182582761);
        setIntField(term4260645, term4260645.getClass(), "totalReMasterSync", -1879252530);
        setLongField(term4260645, term4260645.getClass(), "totalAchievement", 1382295743512959743L);
        setLongField(term4260645, term4260645.getClass(), "totalBasicAchievement", 9179893382225561392L);
        setLongField(term4260645, term4260645.getClass(), "totalAdvancedAchievement", -6071789421465827506L);
        setLongField(term4260645, term4260645.getClass(), "totalExpertAchievement", 3501382793452402430L);
        setLongField(term4260645, term4260645.getClass(), "totalMasterAchievement", 6829275780381875420L);
        setLongField(term4260645, term4260645.getClass(), "totalReMasterAchievement", -8064439870275819763L);
        setLongField(term4260645, term4260645.getClass(), "playerOldRating", -1389834733199595704L);
        setLongField(term4260645, term4260645.getClass(), "playerNewRating", -8175179726773567944L);
        setIntField(term4260645, term4260645.getClass(), "banState", 538029346);
        setLongField(term4260645, term4260645.getClass(), "dateTime", -7123171843863909284L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalDeluxscore", argTypes, term4260645, args);
    }

};


