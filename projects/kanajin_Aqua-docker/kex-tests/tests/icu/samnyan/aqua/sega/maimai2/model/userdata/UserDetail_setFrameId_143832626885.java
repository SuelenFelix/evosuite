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

public class UserDetail_setFrameId_143832626885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243693;
     Object term244044;

    public UserDetail_setFrameId_143832626885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term243697 = new Long(-3753621038448351550L);
        Integer term243760 = new Integer(578623316);
        ArrayList term243758 = new ArrayList();
        ((ArrayList) term243758).add(term243760);
        Integer term243766 = new Integer(-676216760);
        Integer term243768 = new Integer(1859109121);
        Integer term243770 = new Integer(1727853532);
        Integer term243772 = new Integer(-54706718);
        Integer term243774 = new Integer(461863345);
        ArrayList term243764 = new ArrayList();
        ((ArrayList) term243764).add(term243766);
        ((ArrayList) term243764).add(term243768);
        ((ArrayList) term243764).add(term243770);
        ((ArrayList) term243764).add(term243772);
        ((ArrayList) term243764).add(term243774);
        term243693 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term243695 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term243711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term243712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term243716 = newInstance(Class.forName("java.time.LocalTime"));
        Object term243721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term243722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term243726 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term243693, term243693.getClass(), "id", 599444933192886140L);
        setLongField(term243695, term243695.getClass(), "id", 5246783537287005422L);
        setField(term243695, term243695.getClass(), "extId", term243697);
        setField(term243695, term243695.getClass(), "luid", "XMRXETuILP");
        setIntField(term243712, term243712.getClass(), "year", 2028);
        setShortField(term243712, term243712.getClass(), "month", (short) 11);
        setShortField(term243712, term243712.getClass(), "day", (short) 9);
        setField(term243711, term243711.getClass(), "date", term243712);
        setByteField(term243716, term243716.getClass(), "hour", (byte) 7);
        setByteField(term243716, term243716.getClass(), "minute", (byte) 38);
        setByteField(term243716, term243716.getClass(), "second", (byte) 24);
        setIntField(term243716, term243716.getClass(), "nano", 528146857);
        setField(term243711, term243711.getClass(), "time", term243716);
        setField(term243695, term243695.getClass(), "registerTime", term243711);
        setIntField(term243722, term243722.getClass(), "year", 2025);
        setShortField(term243722, term243722.getClass(), "month", (short) 3);
        setShortField(term243722, term243722.getClass(), "day", (short) 6);
        setField(term243721, term243721.getClass(), "date", term243722);
        setByteField(term243726, term243726.getClass(), "hour", (byte) 12);
        setByteField(term243726, term243726.getClass(), "minute", (byte) 2);
        setByteField(term243726, term243726.getClass(), "second", (byte) 23);
        setIntField(term243726, term243726.getClass(), "nano", 463787680);
        setField(term243721, term243721.getClass(), "time", term243726);
        setField(term243695, term243695.getClass(), "accessTime", term243721);
        setField(term243693, term243693.getClass(), "card", term243695);
        setField(term243693, term243693.getClass(), "userName", "DMmgjHjqVC");
        setIntField(term243693, term243693.getClass(), "isNetMember", 716498836);
        setIntField(term243693, term243693.getClass(), "iconId", 1637065629);
        setIntField(term243693, term243693.getClass(), "plateId", 1466957213);
        setIntField(term243693, term243693.getClass(), "titleId", -2036201838);
        setIntField(term243693, term243693.getClass(), "partnerId", 1407642731);
        setIntField(term243693, term243693.getClass(), "frameId", -14910696);
        setIntField(term243693, term243693.getClass(), "selectMapId", -292154386);
        setIntField(term243693, term243693.getClass(), "totalAwake", -1599571798);
        setIntField(term243693, term243693.getClass(), "gradeRating", 69185638);
        setIntField(term243693, term243693.getClass(), "musicRating", -2087614374);
        setIntField(term243693, term243693.getClass(), "playerRating", -429008252);
        setIntField(term243693, term243693.getClass(), "highestRating", 2095561765);
        setIntField(term243693, term243693.getClass(), "gradeRank", -874380115);
        setIntField(term243693, term243693.getClass(), "classRank", 489952093);
        setIntField(term243693, term243693.getClass(), "courseRank", 860886224);
        setField(term243693, term243693.getClass(), "charaSlot", term243758);
        setField(term243693, term243693.getClass(), "charaLockSlot", term243764);
        setLongField(term243693, term243693.getClass(), "contentBit", -1740703418742781714L);
        setIntField(term243693, term243693.getClass(), "playCount", -187851938);
        setField(term243693, term243693.getClass(), "eventWatchedDate", "wYIvugRJpW");
        setField(term243693, term243693.getClass(), "lastGameId", "DRgRlMubyd");
        setField(term243693, term243693.getClass(), "lastRomVersion", "IuKHVDtAZk");
        setField(term243693, term243693.getClass(), "lastDataVersion", "HmynvbqVMU");
        setField(term243693, term243693.getClass(), "lastLoginDate", "WdCGTBlIAP");
        setField(term243693, term243693.getClass(), "lastPlayDate", "iVUpDfebIC");
        setIntField(term243693, term243693.getClass(), "lastPlayCredit", -1426453409);
        setIntField(term243693, term243693.getClass(), "lastPlayMode", 307700009);
        setIntField(term243693, term243693.getClass(), "lastPlaceId", -21762966);
        setField(term243693, term243693.getClass(), "lastPlaceName", "zPvXjjgNMX");
        setIntField(term243693, term243693.getClass(), "lastAllNetId", -1469517921);
        setIntField(term243693, term243693.getClass(), "lastRegionId", 1698773498);
        setField(term243693, term243693.getClass(), "lastRegionName", "sdwmwidvzL");
        setField(term243693, term243693.getClass(), "lastClientId", "chMmILhjdD");
        setField(term243693, term243693.getClass(), "lastCountryCode", "alatWSHAtR");
        setIntField(term243693, term243693.getClass(), "lastSelectEMoney", 1051340647);
        setIntField(term243693, term243693.getClass(), "lastSelectTicket", 1761068817);
        setIntField(term243693, term243693.getClass(), "lastSelectCourse", -1260103469);
        setIntField(term243693, term243693.getClass(), "lastCountCourse", -405127424);
        setField(term243693, term243693.getClass(), "firstGameId", "TazhZNYNKv");
        setField(term243693, term243693.getClass(), "firstRomVersion", "BWFimCbVSH");
        setField(term243693, term243693.getClass(), "firstDataVersion", "eSdRlAUiRy");
        setField(term243693, term243693.getClass(), "firstPlayDate", "oPbrBDThmz");
        setField(term243693, term243693.getClass(), "compatibleCmVersion", "ZODtqxzDCW");
        setField(term243693, term243693.getClass(), "dailyBonusDate", "zkZJHDoPhw");
        setField(term243693, term243693.getClass(), "dailyCourseBonusDate", "HQgXhFPwUc");
        setField(term243693, term243693.getClass(), "lastPairLoginDate", "aMWamnhwTr");
        setField(term243693, term243693.getClass(), "lastTrialPlayDate", "HaHCKzGZQv");
        setIntField(term243693, term243693.getClass(), "playVsCount", 708547892);
        setIntField(term243693, term243693.getClass(), "playSyncCount", -1814890256);
        setIntField(term243693, term243693.getClass(), "winCount", -1681376129);
        setIntField(term243693, term243693.getClass(), "helpCount", -1404448298);
        setIntField(term243693, term243693.getClass(), "comboCount", -1560306376);
        setLongField(term243693, term243693.getClass(), "totalDeluxscore", 5291202944139913648L);
        setLongField(term243693, term243693.getClass(), "totalBasicDeluxscore", -6271151078269170523L);
        setLongField(term243693, term243693.getClass(), "totalAdvancedDeluxscore", -8287439525177334161L);
        setLongField(term243693, term243693.getClass(), "totalExpertDeluxscore", -8548607791349704176L);
        setLongField(term243693, term243693.getClass(), "totalMasterDeluxscore", 7150780687999434869L);
        setLongField(term243693, term243693.getClass(), "totalReMasterDeluxscore", 2127401902317144527L);
        setIntField(term243693, term243693.getClass(), "totalSync", -994453726);
        setIntField(term243693, term243693.getClass(), "totalBasicSync", 1508458483);
        setIntField(term243693, term243693.getClass(), "totalAdvancedSync", 2109435374);
        setIntField(term243693, term243693.getClass(), "totalExpertSync", -655971082);
        setIntField(term243693, term243693.getClass(), "totalMasterSync", 1527901816);
        setIntField(term243693, term243693.getClass(), "totalReMasterSync", -1719160388);
        setLongField(term243693, term243693.getClass(), "totalAchievement", 7064133533790538840L);
        setLongField(term243693, term243693.getClass(), "totalBasicAchievement", -1851540297096208267L);
        setLongField(term243693, term243693.getClass(), "totalAdvancedAchievement", 4569745463126700122L);
        setLongField(term243693, term243693.getClass(), "totalExpertAchievement", 431541280374600079L);
        setLongField(term243693, term243693.getClass(), "totalMasterAchievement", -8442365660719994606L);
        setLongField(term243693, term243693.getClass(), "totalReMasterAchievement", 7870710616239156965L);
        setLongField(term243693, term243693.getClass(), "playerOldRating", 5811117959162115147L);
        setLongField(term243693, term243693.getClass(), "playerNewRating", 5200645867492517887L);
        setIntField(term243693, term243693.getClass(), "banState", -670076376);
        setLongField(term243693, term243693.getClass(), "dateTime", 6673866830106969643L);
        term244044 = new Integer(1113460068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term244044;
        callMethod(klass, "setFrameId", argTypes, term243693, args);
    }

};


