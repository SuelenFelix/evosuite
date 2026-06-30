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

public class UserDetail_getLastPlaceId_35147053031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212613;

    public UserDetail_getLastPlaceId_35147053031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term212617 = new Long(-8692119547314358088L);
        Integer term212680 = new Integer(2111644026);
        Integer term212682 = new Integer(1000189054);
        Integer term212684 = new Integer(832500285);
        Integer term212686 = new Integer(1519973734);
        Integer term212688 = new Integer(-988300994);
        Integer term212690 = new Integer(1939692211);
        ArrayList term212678 = new ArrayList();
        ((ArrayList) term212678).add(term212680);
        ((ArrayList) term212678).add(term212682);
        ((ArrayList) term212678).add(term212684);
        ((ArrayList) term212678).add(term212686);
        ((ArrayList) term212678).add(term212688);
        ((ArrayList) term212678).add(term212690);
        Integer term212696 = new Integer(121806851);
        Integer term212698 = new Integer(1753247664);
        Integer term212700 = new Integer(521507971);
        ArrayList term212694 = new ArrayList();
        ((ArrayList) term212694).add(term212696);
        ((ArrayList) term212694).add(term212698);
        ((ArrayList) term212694).add(term212700);
        term212613 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term212615 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term212631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212636 = newInstance(Class.forName("java.time.LocalTime"));
        Object term212641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212646 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term212613, term212613.getClass(), "id", 8743516917770723308L);
        setLongField(term212615, term212615.getClass(), "id", 102207236902364060L);
        setField(term212615, term212615.getClass(), "extId", term212617);
        setField(term212615, term212615.getClass(), "luid", "QoyCMcsWuL");
        setIntField(term212632, term212632.getClass(), "year", 2018);
        setShortField(term212632, term212632.getClass(), "month", (short) 10);
        setShortField(term212632, term212632.getClass(), "day", (short) 20);
        setField(term212631, term212631.getClass(), "date", term212632);
        setByteField(term212636, term212636.getClass(), "hour", (byte) 3);
        setByteField(term212636, term212636.getClass(), "minute", (byte) 46);
        setByteField(term212636, term212636.getClass(), "second", (byte) 11);
        setIntField(term212636, term212636.getClass(), "nano", 355046607);
        setField(term212631, term212631.getClass(), "time", term212636);
        setField(term212615, term212615.getClass(), "registerTime", term212631);
        setIntField(term212642, term212642.getClass(), "year", 2021);
        setShortField(term212642, term212642.getClass(), "month", (short) 6);
        setShortField(term212642, term212642.getClass(), "day", (short) 25);
        setField(term212641, term212641.getClass(), "date", term212642);
        setByteField(term212646, term212646.getClass(), "hour", (byte) 14);
        setByteField(term212646, term212646.getClass(), "minute", (byte) 46);
        setByteField(term212646, term212646.getClass(), "second", (byte) 35);
        setIntField(term212646, term212646.getClass(), "nano", 585866950);
        setField(term212641, term212641.getClass(), "time", term212646);
        setField(term212615, term212615.getClass(), "accessTime", term212641);
        setField(term212613, term212613.getClass(), "card", term212615);
        setField(term212613, term212613.getClass(), "userName", "KjoVNpOOoZ");
        setIntField(term212613, term212613.getClass(), "isNetMember", -1595184661);
        setIntField(term212613, term212613.getClass(), "iconId", -1926551151);
        setIntField(term212613, term212613.getClass(), "plateId", -515301751);
        setIntField(term212613, term212613.getClass(), "titleId", -1631583570);
        setIntField(term212613, term212613.getClass(), "partnerId", 1842224897);
        setIntField(term212613, term212613.getClass(), "frameId", 484137454);
        setIntField(term212613, term212613.getClass(), "selectMapId", -1073010447);
        setIntField(term212613, term212613.getClass(), "totalAwake", 2051289757);
        setIntField(term212613, term212613.getClass(), "gradeRating", 1076073722);
        setIntField(term212613, term212613.getClass(), "musicRating", -14378708);
        setIntField(term212613, term212613.getClass(), "playerRating", 1455425247);
        setIntField(term212613, term212613.getClass(), "highestRating", 1225276779);
        setIntField(term212613, term212613.getClass(), "gradeRank", -1640653355);
        setIntField(term212613, term212613.getClass(), "classRank", -648278413);
        setIntField(term212613, term212613.getClass(), "courseRank", -1181202031);
        setField(term212613, term212613.getClass(), "charaSlot", term212678);
        setField(term212613, term212613.getClass(), "charaLockSlot", term212694);
        setLongField(term212613, term212613.getClass(), "contentBit", -3247320536656625115L);
        setIntField(term212613, term212613.getClass(), "playCount", -439859067);
        setField(term212613, term212613.getClass(), "eventWatchedDate", "qDvYyZIIiE");
        setField(term212613, term212613.getClass(), "lastGameId", "SbRAoCBVGP");
        setField(term212613, term212613.getClass(), "lastRomVersion", "HclccjprFO");
        setField(term212613, term212613.getClass(), "lastDataVersion", "RLZJRUvKro");
        setField(term212613, term212613.getClass(), "lastLoginDate", "HnZyrFcTzU");
        setField(term212613, term212613.getClass(), "lastPlayDate", "vYpnOXPUYb");
        setIntField(term212613, term212613.getClass(), "lastPlayCredit", -66207086);
        setIntField(term212613, term212613.getClass(), "lastPlayMode", -1284058526);
        setIntField(term212613, term212613.getClass(), "lastPlaceId", 862234803);
        setField(term212613, term212613.getClass(), "lastPlaceName", "eNcLVmdcrb");
        setIntField(term212613, term212613.getClass(), "lastAllNetId", -616491282);
        setIntField(term212613, term212613.getClass(), "lastRegionId", -58881768);
        setField(term212613, term212613.getClass(), "lastRegionName", "eyyvakBPDY");
        setField(term212613, term212613.getClass(), "lastClientId", "pgrKkzImqT");
        setField(term212613, term212613.getClass(), "lastCountryCode", "YxpvBVNzee");
        setIntField(term212613, term212613.getClass(), "lastSelectEMoney", 1032489246);
        setIntField(term212613, term212613.getClass(), "lastSelectTicket", -902458143);
        setIntField(term212613, term212613.getClass(), "lastSelectCourse", -1015807113);
        setIntField(term212613, term212613.getClass(), "lastCountCourse", -741690280);
        setField(term212613, term212613.getClass(), "firstGameId", "WUgEHvRzvB");
        setField(term212613, term212613.getClass(), "firstRomVersion", "LNBCBBwyDn");
        setField(term212613, term212613.getClass(), "firstDataVersion", "JxjVrfRyGz");
        setField(term212613, term212613.getClass(), "firstPlayDate", "HqYNKFpUaJ");
        setField(term212613, term212613.getClass(), "compatibleCmVersion", "xxkaAaaxNn");
        setField(term212613, term212613.getClass(), "dailyBonusDate", "jNASLqTvPp");
        setField(term212613, term212613.getClass(), "dailyCourseBonusDate", "AHNKKPXlJN");
        setField(term212613, term212613.getClass(), "lastPairLoginDate", "wnLqhwRrXu");
        setField(term212613, term212613.getClass(), "lastTrialPlayDate", "IBSEipeGNO");
        setIntField(term212613, term212613.getClass(), "playVsCount", -302708306);
        setIntField(term212613, term212613.getClass(), "playSyncCount", -805114262);
        setIntField(term212613, term212613.getClass(), "winCount", 32762414);
        setIntField(term212613, term212613.getClass(), "helpCount", -2095258959);
        setIntField(term212613, term212613.getClass(), "comboCount", -2021218682);
        setLongField(term212613, term212613.getClass(), "totalDeluxscore", -7850300064339484966L);
        setLongField(term212613, term212613.getClass(), "totalBasicDeluxscore", -3458328871397273171L);
        setLongField(term212613, term212613.getClass(), "totalAdvancedDeluxscore", -4587416835160858680L);
        setLongField(term212613, term212613.getClass(), "totalExpertDeluxscore", 4121717066786632792L);
        setLongField(term212613, term212613.getClass(), "totalMasterDeluxscore", -4147115952306361673L);
        setLongField(term212613, term212613.getClass(), "totalReMasterDeluxscore", -6204257729362345112L);
        setIntField(term212613, term212613.getClass(), "totalSync", 1079108695);
        setIntField(term212613, term212613.getClass(), "totalBasicSync", -1181567725);
        setIntField(term212613, term212613.getClass(), "totalAdvancedSync", 767307414);
        setIntField(term212613, term212613.getClass(), "totalExpertSync", -122688671);
        setIntField(term212613, term212613.getClass(), "totalMasterSync", -1230291029);
        setIntField(term212613, term212613.getClass(), "totalReMasterSync", 1594785809);
        setLongField(term212613, term212613.getClass(), "totalAchievement", 3794289278916493181L);
        setLongField(term212613, term212613.getClass(), "totalBasicAchievement", 5313279882563398231L);
        setLongField(term212613, term212613.getClass(), "totalAdvancedAchievement", -36905419201306652L);
        setLongField(term212613, term212613.getClass(), "totalExpertAchievement", 8225305627650584019L);
        setLongField(term212613, term212613.getClass(), "totalMasterAchievement", 2457879867609405509L);
        setLongField(term212613, term212613.getClass(), "totalReMasterAchievement", 2070054875226545929L);
        setLongField(term212613, term212613.getClass(), "playerOldRating", -5433011372879614353L);
        setLongField(term212613, term212613.getClass(), "playerNewRating", -5015259105569013979L);
        setIntField(term212613, term212613.getClass(), "banState", -670648979);
        setLongField(term212613, term212613.getClass(), "dateTime", -6000318703654544692L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceId", argTypes, term212613, args);
    }

};


