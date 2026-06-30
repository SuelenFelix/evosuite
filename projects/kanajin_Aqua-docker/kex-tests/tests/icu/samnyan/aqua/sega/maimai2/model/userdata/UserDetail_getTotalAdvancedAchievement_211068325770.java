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

public class UserDetail_getTotalAdvancedAchievement_211068325770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234646;

    public UserDetail_getTotalAdvancedAchievement_211068325770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234650 = new Long(-8992404862613425105L);
        Integer term234713 = new Integer(-1998106900);
        Integer term234715 = new Integer(-1628037152);
        Integer term234717 = new Integer(-1550570392);
        Integer term234719 = new Integer(-59951395);
        Integer term234721 = new Integer(-294114307);
        Integer term234723 = new Integer(-745407686);
        ArrayList term234711 = new ArrayList();
        ((ArrayList) term234711).add(term234713);
        ((ArrayList) term234711).add(term234715);
        ((ArrayList) term234711).add(term234717);
        ((ArrayList) term234711).add(term234719);
        ((ArrayList) term234711).add(term234721);
        ((ArrayList) term234711).add(term234723);
        Integer term234729 = new Integer(-1183051462);
        Integer term234731 = new Integer(-572029073);
        Integer term234733 = new Integer(1348271533);
        ArrayList term234727 = new ArrayList();
        ((ArrayList) term234727).add(term234729);
        ((ArrayList) term234727).add(term234731);
        ((ArrayList) term234727).add(term234733);
        term234646 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term234648 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term234664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term234665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term234669 = newInstance(Class.forName("java.time.LocalTime"));
        Object term234674 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term234675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term234679 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term234646, term234646.getClass(), "id", -979919897631219477L);
        setLongField(term234648, term234648.getClass(), "id", 4866401985210807179L);
        setField(term234648, term234648.getClass(), "extId", term234650);
        setField(term234648, term234648.getClass(), "luid", "IdUgmUtgOh");
        setIntField(term234665, term234665.getClass(), "year", 2025);
        setShortField(term234665, term234665.getClass(), "month", (short) 5);
        setShortField(term234665, term234665.getClass(), "day", (short) 7);
        setField(term234664, term234664.getClass(), "date", term234665);
        setByteField(term234669, term234669.getClass(), "hour", (byte) 9);
        setByteField(term234669, term234669.getClass(), "minute", (byte) 7);
        setByteField(term234669, term234669.getClass(), "second", (byte) 58);
        setIntField(term234669, term234669.getClass(), "nano", 974291074);
        setField(term234664, term234664.getClass(), "time", term234669);
        setField(term234648, term234648.getClass(), "registerTime", term234664);
        setIntField(term234675, term234675.getClass(), "year", 2026);
        setShortField(term234675, term234675.getClass(), "month", (short) 9);
        setShortField(term234675, term234675.getClass(), "day", (short) 29);
        setField(term234674, term234674.getClass(), "date", term234675);
        setByteField(term234679, term234679.getClass(), "hour", (byte) 18);
        setByteField(term234679, term234679.getClass(), "minute", (byte) 42);
        setByteField(term234679, term234679.getClass(), "second", (byte) 40);
        setIntField(term234679, term234679.getClass(), "nano", 611001144);
        setField(term234674, term234674.getClass(), "time", term234679);
        setField(term234648, term234648.getClass(), "accessTime", term234674);
        setField(term234646, term234646.getClass(), "card", term234648);
        setField(term234646, term234646.getClass(), "userName", "stsLmPJmam");
        setIntField(term234646, term234646.getClass(), "isNetMember", 985328761);
        setIntField(term234646, term234646.getClass(), "iconId", 1763151581);
        setIntField(term234646, term234646.getClass(), "plateId", -16270144);
        setIntField(term234646, term234646.getClass(), "titleId", -1976813344);
        setIntField(term234646, term234646.getClass(), "partnerId", -534356677);
        setIntField(term234646, term234646.getClass(), "frameId", 59076012);
        setIntField(term234646, term234646.getClass(), "selectMapId", -1884319919);
        setIntField(term234646, term234646.getClass(), "totalAwake", 1478112495);
        setIntField(term234646, term234646.getClass(), "gradeRating", -1985949720);
        setIntField(term234646, term234646.getClass(), "musicRating", -1847204793);
        setIntField(term234646, term234646.getClass(), "playerRating", 1070535972);
        setIntField(term234646, term234646.getClass(), "highestRating", -392119850);
        setIntField(term234646, term234646.getClass(), "gradeRank", -1219765617);
        setIntField(term234646, term234646.getClass(), "classRank", 1761410215);
        setIntField(term234646, term234646.getClass(), "courseRank", 152890697);
        setField(term234646, term234646.getClass(), "charaSlot", term234711);
        setField(term234646, term234646.getClass(), "charaLockSlot", term234727);
        setLongField(term234646, term234646.getClass(), "contentBit", 3897338907318958433L);
        setIntField(term234646, term234646.getClass(), "playCount", 567880137);
        setField(term234646, term234646.getClass(), "eventWatchedDate", "lDjAwfcizJ");
        setField(term234646, term234646.getClass(), "lastGameId", "RuBstopwlK");
        setField(term234646, term234646.getClass(), "lastRomVersion", "cqJKvoyWgQ");
        setField(term234646, term234646.getClass(), "lastDataVersion", "xyptaaXbVH");
        setField(term234646, term234646.getClass(), "lastLoginDate", "eoCqwPrMUZ");
        setField(term234646, term234646.getClass(), "lastPlayDate", "MwsrXwgDaj");
        setIntField(term234646, term234646.getClass(), "lastPlayCredit", 1044699382);
        setIntField(term234646, term234646.getClass(), "lastPlayMode", -1361865906);
        setIntField(term234646, term234646.getClass(), "lastPlaceId", -1811613830);
        setField(term234646, term234646.getClass(), "lastPlaceName", "sIqQcJerOj");
        setIntField(term234646, term234646.getClass(), "lastAllNetId", -962036081);
        setIntField(term234646, term234646.getClass(), "lastRegionId", -251705138);
        setField(term234646, term234646.getClass(), "lastRegionName", "RBAiZRRtZi");
        setField(term234646, term234646.getClass(), "lastClientId", "kKupIWONuC");
        setField(term234646, term234646.getClass(), "lastCountryCode", "FKrOhKRrun");
        setIntField(term234646, term234646.getClass(), "lastSelectEMoney", 1341608295);
        setIntField(term234646, term234646.getClass(), "lastSelectTicket", -271438483);
        setIntField(term234646, term234646.getClass(), "lastSelectCourse", -1421718976);
        setIntField(term234646, term234646.getClass(), "lastCountCourse", 1517040936);
        setField(term234646, term234646.getClass(), "firstGameId", "vZwGfsmNQs");
        setField(term234646, term234646.getClass(), "firstRomVersion", "vhETuHWQWg");
        setField(term234646, term234646.getClass(), "firstDataVersion", "dzcsjKTHpQ");
        setField(term234646, term234646.getClass(), "firstPlayDate", "nkYFOngZAC");
        setField(term234646, term234646.getClass(), "compatibleCmVersion", "dWlFYgFiIc");
        setField(term234646, term234646.getClass(), "dailyBonusDate", "noKFXgekjv");
        setField(term234646, term234646.getClass(), "dailyCourseBonusDate", "DDVjHRnQxN");
        setField(term234646, term234646.getClass(), "lastPairLoginDate", "cPwsHWZyan");
        setField(term234646, term234646.getClass(), "lastTrialPlayDate", "sVJDEsxIBv");
        setIntField(term234646, term234646.getClass(), "playVsCount", -1061313238);
        setIntField(term234646, term234646.getClass(), "playSyncCount", -1148437143);
        setIntField(term234646, term234646.getClass(), "winCount", 215253072);
        setIntField(term234646, term234646.getClass(), "helpCount", 812148008);
        setIntField(term234646, term234646.getClass(), "comboCount", -636265339);
        setLongField(term234646, term234646.getClass(), "totalDeluxscore", -6650702725181065560L);
        setLongField(term234646, term234646.getClass(), "totalBasicDeluxscore", 3905983226868506745L);
        setLongField(term234646, term234646.getClass(), "totalAdvancedDeluxscore", 8210318515961864995L);
        setLongField(term234646, term234646.getClass(), "totalExpertDeluxscore", -3771555949314802383L);
        setLongField(term234646, term234646.getClass(), "totalMasterDeluxscore", 2284085036211088827L);
        setLongField(term234646, term234646.getClass(), "totalReMasterDeluxscore", -362453079275456267L);
        setIntField(term234646, term234646.getClass(), "totalSync", 1987820060);
        setIntField(term234646, term234646.getClass(), "totalBasicSync", -1942467893);
        setIntField(term234646, term234646.getClass(), "totalAdvancedSync", -2091761161);
        setIntField(term234646, term234646.getClass(), "totalExpertSync", 1574487544);
        setIntField(term234646, term234646.getClass(), "totalMasterSync", -1423903830);
        setIntField(term234646, term234646.getClass(), "totalReMasterSync", -1232834591);
        setLongField(term234646, term234646.getClass(), "totalAchievement", -4242877906053577703L);
        setLongField(term234646, term234646.getClass(), "totalBasicAchievement", 993002974475670049L);
        setLongField(term234646, term234646.getClass(), "totalAdvancedAchievement", 5942873651038145772L);
        setLongField(term234646, term234646.getClass(), "totalExpertAchievement", -8067651270110686525L);
        setLongField(term234646, term234646.getClass(), "totalMasterAchievement", 2057585681704126038L);
        setLongField(term234646, term234646.getClass(), "totalReMasterAchievement", -1946000381839282266L);
        setLongField(term234646, term234646.getClass(), "playerOldRating", 3970819512954283654L);
        setLongField(term234646, term234646.getClass(), "playerNewRating", 1567501790944957323L);
        setIntField(term234646, term234646.getClass(), "banState", 2034477054);
        setLongField(term234646, term234646.getClass(), "dateTime", -166542082464095579L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedAchievement", argTypes, term234646, args);
    }

};


