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

public class UserDetail_setFrameId_143832626886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243748;
     Object term244099;

    public UserDetail_setFrameId_143832626886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term243752 = new Long(-3753621038448351550L);
        Integer term243815 = new Integer(578623316);
        ArrayList term243813 = new ArrayList();
        ((ArrayList) term243813).add(term243815);
        Integer term243821 = new Integer(-676216760);
        Integer term243823 = new Integer(1859109121);
        Integer term243825 = new Integer(1727853532);
        Integer term243827 = new Integer(-54706718);
        Integer term243829 = new Integer(461863345);
        ArrayList term243819 = new ArrayList();
        ((ArrayList) term243819).add(term243821);
        ((ArrayList) term243819).add(term243823);
        ((ArrayList) term243819).add(term243825);
        ((ArrayList) term243819).add(term243827);
        ((ArrayList) term243819).add(term243829);
        term243748 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term243750 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term243766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term243767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term243771 = newInstance(Class.forName("java.time.LocalTime"));
        Object term243776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term243777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term243781 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term243748, term243748.getClass(), "id", 599444933192886140L);
        setLongField(term243750, term243750.getClass(), "id", 5246783537287005422L);
        setField(term243750, term243750.getClass(), "extId", term243752);
        setField(term243750, term243750.getClass(), "luid", "XMRXETuILP");
        setIntField(term243767, term243767.getClass(), "year", 2028);
        setShortField(term243767, term243767.getClass(), "month", (short) 11);
        setShortField(term243767, term243767.getClass(), "day", (short) 9);
        setField(term243766, term243766.getClass(), "date", term243767);
        setByteField(term243771, term243771.getClass(), "hour", (byte) 7);
        setByteField(term243771, term243771.getClass(), "minute", (byte) 38);
        setByteField(term243771, term243771.getClass(), "second", (byte) 24);
        setIntField(term243771, term243771.getClass(), "nano", 528146857);
        setField(term243766, term243766.getClass(), "time", term243771);
        setField(term243750, term243750.getClass(), "registerTime", term243766);
        setIntField(term243777, term243777.getClass(), "year", 2025);
        setShortField(term243777, term243777.getClass(), "month", (short) 3);
        setShortField(term243777, term243777.getClass(), "day", (short) 6);
        setField(term243776, term243776.getClass(), "date", term243777);
        setByteField(term243781, term243781.getClass(), "hour", (byte) 12);
        setByteField(term243781, term243781.getClass(), "minute", (byte) 2);
        setByteField(term243781, term243781.getClass(), "second", (byte) 23);
        setIntField(term243781, term243781.getClass(), "nano", 463787680);
        setField(term243776, term243776.getClass(), "time", term243781);
        setField(term243750, term243750.getClass(), "accessTime", term243776);
        setField(term243748, term243748.getClass(), "card", term243750);
        setField(term243748, term243748.getClass(), "userName", "DMmgjHjqVC");
        setIntField(term243748, term243748.getClass(), "isNetMember", 716498836);
        setIntField(term243748, term243748.getClass(), "iconId", 1637065629);
        setIntField(term243748, term243748.getClass(), "plateId", 1466957213);
        setIntField(term243748, term243748.getClass(), "titleId", -2036201838);
        setIntField(term243748, term243748.getClass(), "partnerId", 1407642731);
        setIntField(term243748, term243748.getClass(), "frameId", -14910696);
        setIntField(term243748, term243748.getClass(), "selectMapId", -292154386);
        setIntField(term243748, term243748.getClass(), "totalAwake", -1599571798);
        setIntField(term243748, term243748.getClass(), "gradeRating", 69185638);
        setIntField(term243748, term243748.getClass(), "musicRating", -2087614374);
        setIntField(term243748, term243748.getClass(), "playerRating", -429008252);
        setIntField(term243748, term243748.getClass(), "highestRating", 2095561765);
        setIntField(term243748, term243748.getClass(), "gradeRank", -874380115);
        setIntField(term243748, term243748.getClass(), "classRank", 489952093);
        setIntField(term243748, term243748.getClass(), "courseRank", 860886224);
        setField(term243748, term243748.getClass(), "charaSlot", term243813);
        setField(term243748, term243748.getClass(), "charaLockSlot", term243819);
        setLongField(term243748, term243748.getClass(), "contentBit", -1740703418742781714L);
        setIntField(term243748, term243748.getClass(), "playCount", -187851938);
        setField(term243748, term243748.getClass(), "eventWatchedDate", "wYIvugRJpW");
        setField(term243748, term243748.getClass(), "lastGameId", "DRgRlMubyd");
        setField(term243748, term243748.getClass(), "lastRomVersion", "IuKHVDtAZk");
        setField(term243748, term243748.getClass(), "lastDataVersion", "HmynvbqVMU");
        setField(term243748, term243748.getClass(), "lastLoginDate", "WdCGTBlIAP");
        setField(term243748, term243748.getClass(), "lastPlayDate", "iVUpDfebIC");
        setIntField(term243748, term243748.getClass(), "lastPlayCredit", -1426453409);
        setIntField(term243748, term243748.getClass(), "lastPlayMode", 307700009);
        setIntField(term243748, term243748.getClass(), "lastPlaceId", -21762966);
        setField(term243748, term243748.getClass(), "lastPlaceName", "zPvXjjgNMX");
        setIntField(term243748, term243748.getClass(), "lastAllNetId", -1469517921);
        setIntField(term243748, term243748.getClass(), "lastRegionId", 1698773498);
        setField(term243748, term243748.getClass(), "lastRegionName", "sdwmwidvzL");
        setField(term243748, term243748.getClass(), "lastClientId", "chMmILhjdD");
        setField(term243748, term243748.getClass(), "lastCountryCode", "alatWSHAtR");
        setIntField(term243748, term243748.getClass(), "lastSelectEMoney", 1051340647);
        setIntField(term243748, term243748.getClass(), "lastSelectTicket", 1761068817);
        setIntField(term243748, term243748.getClass(), "lastSelectCourse", -1260103469);
        setIntField(term243748, term243748.getClass(), "lastCountCourse", -405127424);
        setField(term243748, term243748.getClass(), "firstGameId", "TazhZNYNKv");
        setField(term243748, term243748.getClass(), "firstRomVersion", "BWFimCbVSH");
        setField(term243748, term243748.getClass(), "firstDataVersion", "eSdRlAUiRy");
        setField(term243748, term243748.getClass(), "firstPlayDate", "oPbrBDThmz");
        setField(term243748, term243748.getClass(), "compatibleCmVersion", "ZODtqxzDCW");
        setField(term243748, term243748.getClass(), "dailyBonusDate", "zkZJHDoPhw");
        setField(term243748, term243748.getClass(), "dailyCourseBonusDate", "HQgXhFPwUc");
        setField(term243748, term243748.getClass(), "lastPairLoginDate", "aMWamnhwTr");
        setField(term243748, term243748.getClass(), "lastTrialPlayDate", "HaHCKzGZQv");
        setIntField(term243748, term243748.getClass(), "playVsCount", 708547892);
        setIntField(term243748, term243748.getClass(), "playSyncCount", -1814890256);
        setIntField(term243748, term243748.getClass(), "winCount", -1681376129);
        setIntField(term243748, term243748.getClass(), "helpCount", -1404448298);
        setIntField(term243748, term243748.getClass(), "comboCount", -1560306376);
        setLongField(term243748, term243748.getClass(), "totalDeluxscore", 5291202944139913648L);
        setLongField(term243748, term243748.getClass(), "totalBasicDeluxscore", -6271151078269170523L);
        setLongField(term243748, term243748.getClass(), "totalAdvancedDeluxscore", -8287439525177334161L);
        setLongField(term243748, term243748.getClass(), "totalExpertDeluxscore", -8548607791349704176L);
        setLongField(term243748, term243748.getClass(), "totalMasterDeluxscore", 7150780687999434869L);
        setLongField(term243748, term243748.getClass(), "totalReMasterDeluxscore", 2127401902317144527L);
        setIntField(term243748, term243748.getClass(), "totalSync", -994453726);
        setIntField(term243748, term243748.getClass(), "totalBasicSync", 1508458483);
        setIntField(term243748, term243748.getClass(), "totalAdvancedSync", 2109435374);
        setIntField(term243748, term243748.getClass(), "totalExpertSync", -655971082);
        setIntField(term243748, term243748.getClass(), "totalMasterSync", 1527901816);
        setIntField(term243748, term243748.getClass(), "totalReMasterSync", -1719160388);
        setLongField(term243748, term243748.getClass(), "totalAchievement", 7064133533790538840L);
        setLongField(term243748, term243748.getClass(), "totalBasicAchievement", -1851540297096208267L);
        setLongField(term243748, term243748.getClass(), "totalAdvancedAchievement", 4569745463126700122L);
        setLongField(term243748, term243748.getClass(), "totalExpertAchievement", 431541280374600079L);
        setLongField(term243748, term243748.getClass(), "totalMasterAchievement", -8442365660719994606L);
        setLongField(term243748, term243748.getClass(), "totalReMasterAchievement", 7870710616239156965L);
        setLongField(term243748, term243748.getClass(), "playerOldRating", 5811117959162115147L);
        setLongField(term243748, term243748.getClass(), "playerNewRating", 5200645867492517887L);
        setIntField(term243748, term243748.getClass(), "banState", -670076376);
        setLongField(term243748, term243748.getClass(), "dateTime", 6673866830106969643L);
        term244099 = new Integer(1113460068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term244099;
        callMethod(klass, "setFrameId", argTypes, term243748, args);
    }

};


