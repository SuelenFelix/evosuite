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
     Object term212558;

    public UserDetail_getLastPlaceId_35147053030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term212562 = new Long(-8692119547314358088L);
        Integer term212625 = new Integer(2111644026);
        Integer term212627 = new Integer(1000189054);
        Integer term212629 = new Integer(832500285);
        Integer term212631 = new Integer(1519973734);
        Integer term212633 = new Integer(-988300994);
        Integer term212635 = new Integer(1939692211);
        ArrayList term212623 = new ArrayList();
        ((ArrayList) term212623).add(term212625);
        ((ArrayList) term212623).add(term212627);
        ((ArrayList) term212623).add(term212629);
        ((ArrayList) term212623).add(term212631);
        ((ArrayList) term212623).add(term212633);
        ((ArrayList) term212623).add(term212635);
        Integer term212641 = new Integer(121806851);
        Integer term212643 = new Integer(1753247664);
        Integer term212645 = new Integer(521507971);
        ArrayList term212639 = new ArrayList();
        ((ArrayList) term212639).add(term212641);
        ((ArrayList) term212639).add(term212643);
        ((ArrayList) term212639).add(term212645);
        term212558 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term212560 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term212576 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212581 = newInstance(Class.forName("java.time.LocalTime"));
        Object term212586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212587 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212591 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term212558, term212558.getClass(), "id", 8743516917770723308L);
        setLongField(term212560, term212560.getClass(), "id", 102207236902364060L);
        setField(term212560, term212560.getClass(), "extId", term212562);
        setField(term212560, term212560.getClass(), "luid", "QoyCMcsWuL");
        setIntField(term212577, term212577.getClass(), "year", 2018);
        setShortField(term212577, term212577.getClass(), "month", (short) 10);
        setShortField(term212577, term212577.getClass(), "day", (short) 20);
        setField(term212576, term212576.getClass(), "date", term212577);
        setByteField(term212581, term212581.getClass(), "hour", (byte) 3);
        setByteField(term212581, term212581.getClass(), "minute", (byte) 46);
        setByteField(term212581, term212581.getClass(), "second", (byte) 11);
        setIntField(term212581, term212581.getClass(), "nano", 355046607);
        setField(term212576, term212576.getClass(), "time", term212581);
        setField(term212560, term212560.getClass(), "registerTime", term212576);
        setIntField(term212587, term212587.getClass(), "year", 2021);
        setShortField(term212587, term212587.getClass(), "month", (short) 6);
        setShortField(term212587, term212587.getClass(), "day", (short) 25);
        setField(term212586, term212586.getClass(), "date", term212587);
        setByteField(term212591, term212591.getClass(), "hour", (byte) 14);
        setByteField(term212591, term212591.getClass(), "minute", (byte) 46);
        setByteField(term212591, term212591.getClass(), "second", (byte) 35);
        setIntField(term212591, term212591.getClass(), "nano", 585866950);
        setField(term212586, term212586.getClass(), "time", term212591);
        setField(term212560, term212560.getClass(), "accessTime", term212586);
        setField(term212558, term212558.getClass(), "card", term212560);
        setField(term212558, term212558.getClass(), "userName", "KjoVNpOOoZ");
        setIntField(term212558, term212558.getClass(), "isNetMember", -1595184661);
        setIntField(term212558, term212558.getClass(), "iconId", -1926551151);
        setIntField(term212558, term212558.getClass(), "plateId", -515301751);
        setIntField(term212558, term212558.getClass(), "titleId", -1631583570);
        setIntField(term212558, term212558.getClass(), "partnerId", 1842224897);
        setIntField(term212558, term212558.getClass(), "frameId", 484137454);
        setIntField(term212558, term212558.getClass(), "selectMapId", -1073010447);
        setIntField(term212558, term212558.getClass(), "totalAwake", 2051289757);
        setIntField(term212558, term212558.getClass(), "gradeRating", 1076073722);
        setIntField(term212558, term212558.getClass(), "musicRating", -14378708);
        setIntField(term212558, term212558.getClass(), "playerRating", 1455425247);
        setIntField(term212558, term212558.getClass(), "highestRating", 1225276779);
        setIntField(term212558, term212558.getClass(), "gradeRank", -1640653355);
        setIntField(term212558, term212558.getClass(), "classRank", -648278413);
        setIntField(term212558, term212558.getClass(), "courseRank", -1181202031);
        setField(term212558, term212558.getClass(), "charaSlot", term212623);
        setField(term212558, term212558.getClass(), "charaLockSlot", term212639);
        setLongField(term212558, term212558.getClass(), "contentBit", -3247320536656625115L);
        setIntField(term212558, term212558.getClass(), "playCount", -439859067);
        setField(term212558, term212558.getClass(), "eventWatchedDate", "qDvYyZIIiE");
        setField(term212558, term212558.getClass(), "lastGameId", "SbRAoCBVGP");
        setField(term212558, term212558.getClass(), "lastRomVersion", "HclccjprFO");
        setField(term212558, term212558.getClass(), "lastDataVersion", "RLZJRUvKro");
        setField(term212558, term212558.getClass(), "lastLoginDate", "HnZyrFcTzU");
        setField(term212558, term212558.getClass(), "lastPlayDate", "vYpnOXPUYb");
        setIntField(term212558, term212558.getClass(), "lastPlayCredit", -66207086);
        setIntField(term212558, term212558.getClass(), "lastPlayMode", -1284058526);
        setIntField(term212558, term212558.getClass(), "lastPlaceId", 862234803);
        setField(term212558, term212558.getClass(), "lastPlaceName", "eNcLVmdcrb");
        setIntField(term212558, term212558.getClass(), "lastAllNetId", -616491282);
        setIntField(term212558, term212558.getClass(), "lastRegionId", -58881768);
        setField(term212558, term212558.getClass(), "lastRegionName", "eyyvakBPDY");
        setField(term212558, term212558.getClass(), "lastClientId", "pgrKkzImqT");
        setField(term212558, term212558.getClass(), "lastCountryCode", "YxpvBVNzee");
        setIntField(term212558, term212558.getClass(), "lastSelectEMoney", 1032489246);
        setIntField(term212558, term212558.getClass(), "lastSelectTicket", -902458143);
        setIntField(term212558, term212558.getClass(), "lastSelectCourse", -1015807113);
        setIntField(term212558, term212558.getClass(), "lastCountCourse", -741690280);
        setField(term212558, term212558.getClass(), "firstGameId", "WUgEHvRzvB");
        setField(term212558, term212558.getClass(), "firstRomVersion", "LNBCBBwyDn");
        setField(term212558, term212558.getClass(), "firstDataVersion", "JxjVrfRyGz");
        setField(term212558, term212558.getClass(), "firstPlayDate", "HqYNKFpUaJ");
        setField(term212558, term212558.getClass(), "compatibleCmVersion", "xxkaAaaxNn");
        setField(term212558, term212558.getClass(), "dailyBonusDate", "jNASLqTvPp");
        setField(term212558, term212558.getClass(), "dailyCourseBonusDate", "AHNKKPXlJN");
        setField(term212558, term212558.getClass(), "lastPairLoginDate", "wnLqhwRrXu");
        setField(term212558, term212558.getClass(), "lastTrialPlayDate", "IBSEipeGNO");
        setIntField(term212558, term212558.getClass(), "playVsCount", -302708306);
        setIntField(term212558, term212558.getClass(), "playSyncCount", -805114262);
        setIntField(term212558, term212558.getClass(), "winCount", 32762414);
        setIntField(term212558, term212558.getClass(), "helpCount", -2095258959);
        setIntField(term212558, term212558.getClass(), "comboCount", -2021218682);
        setLongField(term212558, term212558.getClass(), "totalDeluxscore", -7850300064339484966L);
        setLongField(term212558, term212558.getClass(), "totalBasicDeluxscore", -3458328871397273171L);
        setLongField(term212558, term212558.getClass(), "totalAdvancedDeluxscore", -4587416835160858680L);
        setLongField(term212558, term212558.getClass(), "totalExpertDeluxscore", 4121717066786632792L);
        setLongField(term212558, term212558.getClass(), "totalMasterDeluxscore", -4147115952306361673L);
        setLongField(term212558, term212558.getClass(), "totalReMasterDeluxscore", -6204257729362345112L);
        setIntField(term212558, term212558.getClass(), "totalSync", 1079108695);
        setIntField(term212558, term212558.getClass(), "totalBasicSync", -1181567725);
        setIntField(term212558, term212558.getClass(), "totalAdvancedSync", 767307414);
        setIntField(term212558, term212558.getClass(), "totalExpertSync", -122688671);
        setIntField(term212558, term212558.getClass(), "totalMasterSync", -1230291029);
        setIntField(term212558, term212558.getClass(), "totalReMasterSync", 1594785809);
        setLongField(term212558, term212558.getClass(), "totalAchievement", 3794289278916493181L);
        setLongField(term212558, term212558.getClass(), "totalBasicAchievement", 5313279882563398231L);
        setLongField(term212558, term212558.getClass(), "totalAdvancedAchievement", -36905419201306652L);
        setLongField(term212558, term212558.getClass(), "totalExpertAchievement", 8225305627650584019L);
        setLongField(term212558, term212558.getClass(), "totalMasterAchievement", 2457879867609405509L);
        setLongField(term212558, term212558.getClass(), "totalReMasterAchievement", 2070054875226545929L);
        setLongField(term212558, term212558.getClass(), "playerOldRating", -5433011372879614353L);
        setLongField(term212558, term212558.getClass(), "playerNewRating", -5015259105569013979L);
        setIntField(term212558, term212558.getClass(), "banState", -670648979);
        setLongField(term212558, term212558.getClass(), "dateTime", -6000318703654544692L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceId", argTypes, term212558, args);
    }

};


