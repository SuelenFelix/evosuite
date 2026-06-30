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

public class UserAct_hashCode_46663006221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12641;

    public UserAct_hashCode_46663006221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12647 = new Long(8059786003080744426L);
        Integer term12710 = new Integer(1358829571);
        Integer term12712 = new Integer(991356662);
        Integer term12714 = new Integer(-506958186);
        Integer term12716 = new Integer(-507387516);
        Integer term12718 = new Integer(-1970452551);
        Integer term12720 = new Integer(-1896376975);
        Integer term12722 = new Integer(729658803);
        Integer term12724 = new Integer(114754804);
        ArrayList term12708 = new ArrayList();
        ((ArrayList) term12708).add(term12710);
        ((ArrayList) term12708).add(term12712);
        ((ArrayList) term12708).add(term12714);
        ((ArrayList) term12708).add(term12716);
        ((ArrayList) term12708).add(term12718);
        ((ArrayList) term12708).add(term12720);
        ((ArrayList) term12708).add(term12722);
        ((ArrayList) term12708).add(term12724);
        Integer term12730 = new Integer(1687361082);
        Integer term12732 = new Integer(584893196);
        Integer term12734 = new Integer(497269071);
        ArrayList term12728 = new ArrayList();
        ((ArrayList) term12728).add(term12730);
        ((ArrayList) term12728).add(term12732);
        ((ArrayList) term12728).add(term12734);
        term12641 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term12643 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term12645 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term12661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12666 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12676 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term12641, term12641.getClass(), "id", 4096288569907305445L);
        setLongField(term12643, term12643.getClass(), "id", 6940486570215409900L);
        setLongField(term12645, term12645.getClass(), "id", -7370364068296402536L);
        setField(term12645, term12645.getClass(), "extId", term12647);
        setField(term12645, term12645.getClass(), "luid", "tKmrUDURku");
        setIntField(term12662, term12662.getClass(), "year", 2020);
        setShortField(term12662, term12662.getClass(), "month", (short) 5);
        setShortField(term12662, term12662.getClass(), "day", (short) 18);
        setField(term12661, term12661.getClass(), "date", term12662);
        setByteField(term12666, term12666.getClass(), "hour", (byte) 5);
        setByteField(term12666, term12666.getClass(), "minute", (byte) 46);
        setByteField(term12666, term12666.getClass(), "second", (byte) 13);
        setIntField(term12666, term12666.getClass(), "nano", 45893173);
        setField(term12661, term12661.getClass(), "time", term12666);
        setField(term12645, term12645.getClass(), "registerTime", term12661);
        setIntField(term12672, term12672.getClass(), "year", 2017);
        setShortField(term12672, term12672.getClass(), "month", (short) 4);
        setShortField(term12672, term12672.getClass(), "day", (short) 3);
        setField(term12671, term12671.getClass(), "date", term12672);
        setByteField(term12676, term12676.getClass(), "hour", (byte) 6);
        setByteField(term12676, term12676.getClass(), "minute", (byte) 51);
        setByteField(term12676, term12676.getClass(), "second", (byte) 10);
        setIntField(term12676, term12676.getClass(), "nano", 316377166);
        setField(term12671, term12671.getClass(), "time", term12676);
        setField(term12645, term12645.getClass(), "accessTime", term12671);
        setField(term12643, term12643.getClass(), "card", term12645);
        setField(term12643, term12643.getClass(), "userName", "JeZbrwZmsP");
        setIntField(term12643, term12643.getClass(), "isNetMember", -1489991025);
        setIntField(term12643, term12643.getClass(), "iconId", -1542979444);
        setIntField(term12643, term12643.getClass(), "plateId", -1130401612);
        setIntField(term12643, term12643.getClass(), "titleId", -316771104);
        setIntField(term12643, term12643.getClass(), "partnerId", -1374527319);
        setIntField(term12643, term12643.getClass(), "frameId", -1735276919);
        setIntField(term12643, term12643.getClass(), "selectMapId", -712023865);
        setIntField(term12643, term12643.getClass(), "totalAwake", 613256157);
        setIntField(term12643, term12643.getClass(), "gradeRating", 454242689);
        setIntField(term12643, term12643.getClass(), "musicRating", 1798354517);
        setIntField(term12643, term12643.getClass(), "playerRating", -1495693617);
        setIntField(term12643, term12643.getClass(), "highestRating", -890538258);
        setIntField(term12643, term12643.getClass(), "gradeRank", -1085899912);
        setIntField(term12643, term12643.getClass(), "classRank", -1458980236);
        setIntField(term12643, term12643.getClass(), "courseRank", 890505372);
        setField(term12643, term12643.getClass(), "charaSlot", term12708);
        setField(term12643, term12643.getClass(), "charaLockSlot", term12728);
        setLongField(term12643, term12643.getClass(), "contentBit", -1084263688306617320L);
        setIntField(term12643, term12643.getClass(), "playCount", 2044137055);
        setField(term12643, term12643.getClass(), "eventWatchedDate", "bxyfeicqrK");
        setField(term12643, term12643.getClass(), "lastGameId", "vBnWPlsZMk");
        setField(term12643, term12643.getClass(), "lastRomVersion", "fIZsWucfXz");
        setField(term12643, term12643.getClass(), "lastDataVersion", "IApvtmfhnq");
        setField(term12643, term12643.getClass(), "lastLoginDate", "VSaNnhMpRc");
        setField(term12643, term12643.getClass(), "lastPlayDate", "QNjNTLlUaV");
        setIntField(term12643, term12643.getClass(), "lastPlayCredit", -1452324619);
        setIntField(term12643, term12643.getClass(), "lastPlayMode", -1121709274);
        setIntField(term12643, term12643.getClass(), "lastPlaceId", -532304223);
        setField(term12643, term12643.getClass(), "lastPlaceName", "hIYsRyOZxk");
        setIntField(term12643, term12643.getClass(), "lastAllNetId", 666218293);
        setIntField(term12643, term12643.getClass(), "lastRegionId", 1737876343);
        setField(term12643, term12643.getClass(), "lastRegionName", "RjNoEywJbC");
        setField(term12643, term12643.getClass(), "lastClientId", "RTTvrwwhou");
        setField(term12643, term12643.getClass(), "lastCountryCode", "lRORwXipuk");
        setIntField(term12643, term12643.getClass(), "lastSelectEMoney", -897937940);
        setIntField(term12643, term12643.getClass(), "lastSelectTicket", 1523261232);
        setIntField(term12643, term12643.getClass(), "lastSelectCourse", -428988337);
        setIntField(term12643, term12643.getClass(), "lastCountCourse", 48047085);
        setField(term12643, term12643.getClass(), "firstGameId", "fVdTcjgHdw");
        setField(term12643, term12643.getClass(), "firstRomVersion", "wwAwLLcLPp");
        setField(term12643, term12643.getClass(), "firstDataVersion", "nHpMKOmlpQ");
        setField(term12643, term12643.getClass(), "firstPlayDate", "fKhrQsJToZ");
        setField(term12643, term12643.getClass(), "compatibleCmVersion", "wsysQLGFnl");
        setField(term12643, term12643.getClass(), "dailyBonusDate", "ckQLZGFjMX");
        setField(term12643, term12643.getClass(), "dailyCourseBonusDate", "qphdrqUtNx");
        setField(term12643, term12643.getClass(), "lastPairLoginDate", "bwlLFAfNWx");
        setField(term12643, term12643.getClass(), "lastTrialPlayDate", "JWodNQzjjV");
        setIntField(term12643, term12643.getClass(), "playVsCount", 1902784843);
        setIntField(term12643, term12643.getClass(), "playSyncCount", 2021136615);
        setIntField(term12643, term12643.getClass(), "winCount", 1778570695);
        setIntField(term12643, term12643.getClass(), "helpCount", -1142164411);
        setIntField(term12643, term12643.getClass(), "comboCount", -1619435313);
        setLongField(term12643, term12643.getClass(), "totalDeluxscore", 1193381106528373019L);
        setLongField(term12643, term12643.getClass(), "totalBasicDeluxscore", -1365372122034008688L);
        setLongField(term12643, term12643.getClass(), "totalAdvancedDeluxscore", -6108006981756732593L);
        setLongField(term12643, term12643.getClass(), "totalExpertDeluxscore", -3565554762799701668L);
        setLongField(term12643, term12643.getClass(), "totalMasterDeluxscore", -6837989212848250735L);
        setLongField(term12643, term12643.getClass(), "totalReMasterDeluxscore", -4231979631084175364L);
        setIntField(term12643, term12643.getClass(), "totalSync", 1013801066);
        setIntField(term12643, term12643.getClass(), "totalBasicSync", 1512541853);
        setIntField(term12643, term12643.getClass(), "totalAdvancedSync", -965421502);
        setIntField(term12643, term12643.getClass(), "totalExpertSync", 1319026002);
        setIntField(term12643, term12643.getClass(), "totalMasterSync", -1368173231);
        setIntField(term12643, term12643.getClass(), "totalReMasterSync", 1956006038);
        setLongField(term12643, term12643.getClass(), "totalAchievement", 1634166935474035772L);
        setLongField(term12643, term12643.getClass(), "totalBasicAchievement", -2614906266506360948L);
        setLongField(term12643, term12643.getClass(), "totalAdvancedAchievement", 1133267598258375793L);
        setLongField(term12643, term12643.getClass(), "totalExpertAchievement", 2990264647913003810L);
        setLongField(term12643, term12643.getClass(), "totalMasterAchievement", -2195794659127490022L);
        setLongField(term12643, term12643.getClass(), "totalReMasterAchievement", 6142089107139955834L);
        setLongField(term12643, term12643.getClass(), "playerOldRating", -7506365302323354325L);
        setLongField(term12643, term12643.getClass(), "playerNewRating", -4693900822622913579L);
        setIntField(term12643, term12643.getClass(), "banState", -1062304878);
        setLongField(term12643, term12643.getClass(), "dateTime", -997945615782059734L);
        setField(term12641, term12641.getClass(), "user", term12643);
        setIntField(term12641, term12641.getClass(), "kind", -1377876610);
        setIntField(term12641, term12641.getClass(), "activityId", -1456184732);
        setLongField(term12641, term12641.getClass(), "sortNumber", -599981502351912419L);
        setIntField(term12641, term12641.getClass(), "param1", 1689228897);
        setIntField(term12641, term12641.getClass(), "param2", 892205855);
        setIntField(term12641, term12641.getClass(), "param3", 1955560079);
        setIntField(term12641, term12641.getClass(), "param4", -1330529019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12641, args);
    }

};


