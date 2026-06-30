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

public class UserDetail_getLastPlaceId_35147053030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4246528;

    public UserDetail_getLastPlaceId_35147053030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4246532 = new Long(-6954793213065040205L);
        Integer term4246595 = new Integer(555694422);
        Integer term4246597 = new Integer(-1555435028);
        Integer term4246599 = new Integer(-1501344759);
        Integer term4246601 = new Integer(-429485955);
        Integer term4246603 = new Integer(-1666329424);
        Integer term4246605 = new Integer(-1283755218);
        ArrayList term4246593 = new ArrayList();
        ((ArrayList) term4246593).add(term4246595);
        ((ArrayList) term4246593).add(term4246597);
        ((ArrayList) term4246593).add(term4246599);
        ((ArrayList) term4246593).add(term4246601);
        ((ArrayList) term4246593).add(term4246603);
        ((ArrayList) term4246593).add(term4246605);
        Integer term4246611 = new Integer(-1544800993);
        Integer term4246613 = new Integer(532107043);
        Integer term4246615 = new Integer(-1800024865);
        Integer term4246617 = new Integer(1555494796);
        Integer term4246619 = new Integer(-1304585657);
        ArrayList term4246609 = new ArrayList();
        ((ArrayList) term4246609).add(term4246611);
        ((ArrayList) term4246609).add(term4246613);
        ((ArrayList) term4246609).add(term4246615);
        ((ArrayList) term4246609).add(term4246617);
        ((ArrayList) term4246609).add(term4246619);
        term4246528 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4246530 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4246546 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4246547 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4246551 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4246556 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4246557 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4246561 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4246528, term4246528.getClass(), "id", 4478496471589755934L);
        setLongField(term4246530, term4246530.getClass(), "id", 5056581910953106597L);
        setField(term4246530, term4246530.getClass(), "extId", term4246532);
        setField(term4246530, term4246530.getClass(), "luid", "yVBWTQvVfb");
        setIntField(term4246547, term4246547.getClass(), "year", 2010);
        setShortField(term4246547, term4246547.getClass(), "month", (short) 11);
        setShortField(term4246547, term4246547.getClass(), "day", (short) 30);
        setField(term4246546, term4246546.getClass(), "date", term4246547);
        setByteField(term4246551, term4246551.getClass(), "hour", (byte) 11);
        setByteField(term4246551, term4246551.getClass(), "minute", (byte) 54);
        setByteField(term4246551, term4246551.getClass(), "second", (byte) 2);
        setIntField(term4246551, term4246551.getClass(), "nano", 233229697);
        setField(term4246546, term4246546.getClass(), "time", term4246551);
        setField(term4246530, term4246530.getClass(), "registerTime", term4246546);
        setIntField(term4246557, term4246557.getClass(), "year", 2020);
        setShortField(term4246557, term4246557.getClass(), "month", (short) 10);
        setShortField(term4246557, term4246557.getClass(), "day", (short) 4);
        setField(term4246556, term4246556.getClass(), "date", term4246557);
        setByteField(term4246561, term4246561.getClass(), "hour", (byte) 16);
        setByteField(term4246561, term4246561.getClass(), "minute", (byte) 48);
        setByteField(term4246561, term4246561.getClass(), "second", (byte) 43);
        setIntField(term4246561, term4246561.getClass(), "nano", 925600360);
        setField(term4246556, term4246556.getClass(), "time", term4246561);
        setField(term4246530, term4246530.getClass(), "accessTime", term4246556);
        setField(term4246528, term4246528.getClass(), "card", term4246530);
        setField(term4246528, term4246528.getClass(), "userName", "obguQYcsWe");
        setIntField(term4246528, term4246528.getClass(), "isNetMember", -976521895);
        setIntField(term4246528, term4246528.getClass(), "iconId", -947620778);
        setIntField(term4246528, term4246528.getClass(), "plateId", -1939175507);
        setIntField(term4246528, term4246528.getClass(), "titleId", 1686755663);
        setIntField(term4246528, term4246528.getClass(), "partnerId", 1509123497);
        setIntField(term4246528, term4246528.getClass(), "frameId", 185572671);
        setIntField(term4246528, term4246528.getClass(), "selectMapId", 1500694981);
        setIntField(term4246528, term4246528.getClass(), "totalAwake", -1719582338);
        setIntField(term4246528, term4246528.getClass(), "gradeRating", -1258435152);
        setIntField(term4246528, term4246528.getClass(), "musicRating", -1079940844);
        setIntField(term4246528, term4246528.getClass(), "playerRating", 1481268088);
        setIntField(term4246528, term4246528.getClass(), "highestRating", -1526993681);
        setIntField(term4246528, term4246528.getClass(), "gradeRank", 1576849336);
        setIntField(term4246528, term4246528.getClass(), "classRank", -106541630);
        setIntField(term4246528, term4246528.getClass(), "courseRank", -1835943654);
        setField(term4246528, term4246528.getClass(), "charaSlot", term4246593);
        setField(term4246528, term4246528.getClass(), "charaLockSlot", term4246609);
        setLongField(term4246528, term4246528.getClass(), "contentBit", -3676669922697763121L);
        setIntField(term4246528, term4246528.getClass(), "playCount", -760414067);
        setField(term4246528, term4246528.getClass(), "eventWatchedDate", "VqPhCzYwkY");
        setField(term4246528, term4246528.getClass(), "lastGameId", "phdjwjoQwh");
        setField(term4246528, term4246528.getClass(), "lastRomVersion", "joYgjWbCaQ");
        setField(term4246528, term4246528.getClass(), "lastDataVersion", "VNnnweTfeT");
        setField(term4246528, term4246528.getClass(), "lastLoginDate", "vBEhDIgQyG");
        setField(term4246528, term4246528.getClass(), "lastPlayDate", "XxvIFBEaLU");
        setIntField(term4246528, term4246528.getClass(), "lastPlayCredit", -1714151052);
        setIntField(term4246528, term4246528.getClass(), "lastPlayMode", 1976643098);
        setIntField(term4246528, term4246528.getClass(), "lastPlaceId", -1330059457);
        setField(term4246528, term4246528.getClass(), "lastPlaceName", "JJHxZozSqZ");
        setIntField(term4246528, term4246528.getClass(), "lastAllNetId", -777835782);
        setIntField(term4246528, term4246528.getClass(), "lastRegionId", -1716456893);
        setField(term4246528, term4246528.getClass(), "lastRegionName", "AQrQNXTeZs");
        setField(term4246528, term4246528.getClass(), "lastClientId", "AQSZegAXjl");
        setField(term4246528, term4246528.getClass(), "lastCountryCode", "CPkzkbpiKj");
        setIntField(term4246528, term4246528.getClass(), "lastSelectEMoney", 1505328324);
        setIntField(term4246528, term4246528.getClass(), "lastSelectTicket", -508851037);
        setIntField(term4246528, term4246528.getClass(), "lastSelectCourse", -1912438110);
        setIntField(term4246528, term4246528.getClass(), "lastCountCourse", 1059287477);
        setField(term4246528, term4246528.getClass(), "firstGameId", "qURPOFUBmH");
        setField(term4246528, term4246528.getClass(), "firstRomVersion", "HYowzVYLxN");
        setField(term4246528, term4246528.getClass(), "firstDataVersion", "rxucTcLCNR");
        setField(term4246528, term4246528.getClass(), "firstPlayDate", "byMImihwZx");
        setField(term4246528, term4246528.getClass(), "compatibleCmVersion", "jzdIYjkRKO");
        setField(term4246528, term4246528.getClass(), "dailyBonusDate", "nUqkFCzeVq");
        setField(term4246528, term4246528.getClass(), "dailyCourseBonusDate", "flFszaPCQU");
        setField(term4246528, term4246528.getClass(), "lastPairLoginDate", "ABrIPXhAQB");
        setField(term4246528, term4246528.getClass(), "lastTrialPlayDate", "fEXgHnlcTA");
        setIntField(term4246528, term4246528.getClass(), "playVsCount", 457448052);
        setIntField(term4246528, term4246528.getClass(), "playSyncCount", -1979038134);
        setIntField(term4246528, term4246528.getClass(), "winCount", 389394702);
        setIntField(term4246528, term4246528.getClass(), "helpCount", 359381581);
        setIntField(term4246528, term4246528.getClass(), "comboCount", 637494108);
        setLongField(term4246528, term4246528.getClass(), "totalDeluxscore", -6613636123399438854L);
        setLongField(term4246528, term4246528.getClass(), "totalBasicDeluxscore", -5243684310927288905L);
        setLongField(term4246528, term4246528.getClass(), "totalAdvancedDeluxscore", -5462723668166116326L);
        setLongField(term4246528, term4246528.getClass(), "totalExpertDeluxscore", 446387551375632125L);
        setLongField(term4246528, term4246528.getClass(), "totalMasterDeluxscore", -8284384503741082783L);
        setLongField(term4246528, term4246528.getClass(), "totalReMasterDeluxscore", 7140056914337685094L);
        setIntField(term4246528, term4246528.getClass(), "totalSync", 1600297448);
        setIntField(term4246528, term4246528.getClass(), "totalBasicSync", -1498022027);
        setIntField(term4246528, term4246528.getClass(), "totalAdvancedSync", -530307960);
        setIntField(term4246528, term4246528.getClass(), "totalExpertSync", 992878561);
        setIntField(term4246528, term4246528.getClass(), "totalMasterSync", 520694402);
        setIntField(term4246528, term4246528.getClass(), "totalReMasterSync", 1164908696);
        setLongField(term4246528, term4246528.getClass(), "totalAchievement", 5703494872878748003L);
        setLongField(term4246528, term4246528.getClass(), "totalBasicAchievement", 4165781035056748319L);
        setLongField(term4246528, term4246528.getClass(), "totalAdvancedAchievement", 7081551539563464273L);
        setLongField(term4246528, term4246528.getClass(), "totalExpertAchievement", 5065421432061832634L);
        setLongField(term4246528, term4246528.getClass(), "totalMasterAchievement", -4646753734276159328L);
        setLongField(term4246528, term4246528.getClass(), "totalReMasterAchievement", -7118504953179961738L);
        setLongField(term4246528, term4246528.getClass(), "playerOldRating", 8639287127360114411L);
        setLongField(term4246528, term4246528.getClass(), "playerNewRating", -1947372425720728637L);
        setIntField(term4246528, term4246528.getClass(), "banState", 797918750);
        setLongField(term4246528, term4246528.getClass(), "dateTime", -7419272465280670696L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceId", argTypes, term4246528, args);
    }

};


