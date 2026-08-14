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

public class UserDetail_getTotalAdvancedAchievement_211068325769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234591;

    public UserDetail_getTotalAdvancedAchievement_211068325769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234595 = new Long(-8992404862613425105L);
        Integer term234658 = new Integer(-1998106900);
        Integer term234660 = new Integer(-1628037152);
        Integer term234662 = new Integer(-1550570392);
        Integer term234664 = new Integer(-59951395);
        Integer term234666 = new Integer(-294114307);
        Integer term234668 = new Integer(-745407686);
        ArrayList term234656 = new ArrayList();
        ((ArrayList) term234656).add(term234658);
        ((ArrayList) term234656).add(term234660);
        ((ArrayList) term234656).add(term234662);
        ((ArrayList) term234656).add(term234664);
        ((ArrayList) term234656).add(term234666);
        ((ArrayList) term234656).add(term234668);
        Integer term234674 = new Integer(-1183051462);
        Integer term234676 = new Integer(-572029073);
        Integer term234678 = new Integer(1348271533);
        ArrayList term234672 = new ArrayList();
        ((ArrayList) term234672).add(term234674);
        ((ArrayList) term234672).add(term234676);
        ((ArrayList) term234672).add(term234678);
        term234591 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term234593 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term234609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term234610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term234614 = newInstance(Class.forName("java.time.LocalTime"));
        Object term234619 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term234620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term234624 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term234591, term234591.getClass(), "id", -979919897631219477L);
        setLongField(term234593, term234593.getClass(), "id", 4866401985210807179L);
        setField(term234593, term234593.getClass(), "extId", term234595);
        setField(term234593, term234593.getClass(), "luid", "IdUgmUtgOh");
        setIntField(term234610, term234610.getClass(), "year", 2025);
        setShortField(term234610, term234610.getClass(), "month", (short) 5);
        setShortField(term234610, term234610.getClass(), "day", (short) 7);
        setField(term234609, term234609.getClass(), "date", term234610);
        setByteField(term234614, term234614.getClass(), "hour", (byte) 9);
        setByteField(term234614, term234614.getClass(), "minute", (byte) 7);
        setByteField(term234614, term234614.getClass(), "second", (byte) 58);
        setIntField(term234614, term234614.getClass(), "nano", 974291074);
        setField(term234609, term234609.getClass(), "time", term234614);
        setField(term234593, term234593.getClass(), "registerTime", term234609);
        setIntField(term234620, term234620.getClass(), "year", 2026);
        setShortField(term234620, term234620.getClass(), "month", (short) 9);
        setShortField(term234620, term234620.getClass(), "day", (short) 29);
        setField(term234619, term234619.getClass(), "date", term234620);
        setByteField(term234624, term234624.getClass(), "hour", (byte) 18);
        setByteField(term234624, term234624.getClass(), "minute", (byte) 42);
        setByteField(term234624, term234624.getClass(), "second", (byte) 40);
        setIntField(term234624, term234624.getClass(), "nano", 611001144);
        setField(term234619, term234619.getClass(), "time", term234624);
        setField(term234593, term234593.getClass(), "accessTime", term234619);
        setField(term234591, term234591.getClass(), "card", term234593);
        setField(term234591, term234591.getClass(), "userName", "stsLmPJmam");
        setIntField(term234591, term234591.getClass(), "isNetMember", 985328761);
        setIntField(term234591, term234591.getClass(), "iconId", 1763151581);
        setIntField(term234591, term234591.getClass(), "plateId", -16270144);
        setIntField(term234591, term234591.getClass(), "titleId", -1976813344);
        setIntField(term234591, term234591.getClass(), "partnerId", -534356677);
        setIntField(term234591, term234591.getClass(), "frameId", 59076012);
        setIntField(term234591, term234591.getClass(), "selectMapId", -1884319919);
        setIntField(term234591, term234591.getClass(), "totalAwake", 1478112495);
        setIntField(term234591, term234591.getClass(), "gradeRating", -1985949720);
        setIntField(term234591, term234591.getClass(), "musicRating", -1847204793);
        setIntField(term234591, term234591.getClass(), "playerRating", 1070535972);
        setIntField(term234591, term234591.getClass(), "highestRating", -392119850);
        setIntField(term234591, term234591.getClass(), "gradeRank", -1219765617);
        setIntField(term234591, term234591.getClass(), "classRank", 1761410215);
        setIntField(term234591, term234591.getClass(), "courseRank", 152890697);
        setField(term234591, term234591.getClass(), "charaSlot", term234656);
        setField(term234591, term234591.getClass(), "charaLockSlot", term234672);
        setLongField(term234591, term234591.getClass(), "contentBit", 3897338907318958433L);
        setIntField(term234591, term234591.getClass(), "playCount", 567880137);
        setField(term234591, term234591.getClass(), "eventWatchedDate", "lDjAwfcizJ");
        setField(term234591, term234591.getClass(), "lastGameId", "RuBstopwlK");
        setField(term234591, term234591.getClass(), "lastRomVersion", "cqJKvoyWgQ");
        setField(term234591, term234591.getClass(), "lastDataVersion", "xyptaaXbVH");
        setField(term234591, term234591.getClass(), "lastLoginDate", "eoCqwPrMUZ");
        setField(term234591, term234591.getClass(), "lastPlayDate", "MwsrXwgDaj");
        setIntField(term234591, term234591.getClass(), "lastPlayCredit", 1044699382);
        setIntField(term234591, term234591.getClass(), "lastPlayMode", -1361865906);
        setIntField(term234591, term234591.getClass(), "lastPlaceId", -1811613830);
        setField(term234591, term234591.getClass(), "lastPlaceName", "sIqQcJerOj");
        setIntField(term234591, term234591.getClass(), "lastAllNetId", -962036081);
        setIntField(term234591, term234591.getClass(), "lastRegionId", -251705138);
        setField(term234591, term234591.getClass(), "lastRegionName", "RBAiZRRtZi");
        setField(term234591, term234591.getClass(), "lastClientId", "kKupIWONuC");
        setField(term234591, term234591.getClass(), "lastCountryCode", "FKrOhKRrun");
        setIntField(term234591, term234591.getClass(), "lastSelectEMoney", 1341608295);
        setIntField(term234591, term234591.getClass(), "lastSelectTicket", -271438483);
        setIntField(term234591, term234591.getClass(), "lastSelectCourse", -1421718976);
        setIntField(term234591, term234591.getClass(), "lastCountCourse", 1517040936);
        setField(term234591, term234591.getClass(), "firstGameId", "vZwGfsmNQs");
        setField(term234591, term234591.getClass(), "firstRomVersion", "vhETuHWQWg");
        setField(term234591, term234591.getClass(), "firstDataVersion", "dzcsjKTHpQ");
        setField(term234591, term234591.getClass(), "firstPlayDate", "nkYFOngZAC");
        setField(term234591, term234591.getClass(), "compatibleCmVersion", "dWlFYgFiIc");
        setField(term234591, term234591.getClass(), "dailyBonusDate", "noKFXgekjv");
        setField(term234591, term234591.getClass(), "dailyCourseBonusDate", "DDVjHRnQxN");
        setField(term234591, term234591.getClass(), "lastPairLoginDate", "cPwsHWZyan");
        setField(term234591, term234591.getClass(), "lastTrialPlayDate", "sVJDEsxIBv");
        setIntField(term234591, term234591.getClass(), "playVsCount", -1061313238);
        setIntField(term234591, term234591.getClass(), "playSyncCount", -1148437143);
        setIntField(term234591, term234591.getClass(), "winCount", 215253072);
        setIntField(term234591, term234591.getClass(), "helpCount", 812148008);
        setIntField(term234591, term234591.getClass(), "comboCount", -636265339);
        setLongField(term234591, term234591.getClass(), "totalDeluxscore", -6650702725181065560L);
        setLongField(term234591, term234591.getClass(), "totalBasicDeluxscore", 3905983226868506745L);
        setLongField(term234591, term234591.getClass(), "totalAdvancedDeluxscore", 8210318515961864995L);
        setLongField(term234591, term234591.getClass(), "totalExpertDeluxscore", -3771555949314802383L);
        setLongField(term234591, term234591.getClass(), "totalMasterDeluxscore", 2284085036211088827L);
        setLongField(term234591, term234591.getClass(), "totalReMasterDeluxscore", -362453079275456267L);
        setIntField(term234591, term234591.getClass(), "totalSync", 1987820060);
        setIntField(term234591, term234591.getClass(), "totalBasicSync", -1942467893);
        setIntField(term234591, term234591.getClass(), "totalAdvancedSync", -2091761161);
        setIntField(term234591, term234591.getClass(), "totalExpertSync", 1574487544);
        setIntField(term234591, term234591.getClass(), "totalMasterSync", -1423903830);
        setIntField(term234591, term234591.getClass(), "totalReMasterSync", -1232834591);
        setLongField(term234591, term234591.getClass(), "totalAchievement", -4242877906053577703L);
        setLongField(term234591, term234591.getClass(), "totalBasicAchievement", 993002974475670049L);
        setLongField(term234591, term234591.getClass(), "totalAdvancedAchievement", 5942873651038145772L);
        setLongField(term234591, term234591.getClass(), "totalExpertAchievement", -8067651270110686525L);
        setLongField(term234591, term234591.getClass(), "totalMasterAchievement", 2057585681704126038L);
        setLongField(term234591, term234591.getClass(), "totalReMasterAchievement", -1946000381839282266L);
        setLongField(term234591, term234591.getClass(), "playerOldRating", 3970819512954283654L);
        setLongField(term234591, term234591.getClass(), "playerNewRating", 1567501790944957323L);
        setIntField(term234591, term234591.getClass(), "banState", 2034477054);
        setLongField(term234591, term234591.getClass(), "dateTime", -166542082464095579L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedAchievement", argTypes, term234591, args);
    }

};


