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

public class UserDetail_setPlayerRating_60485638291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246593;
     Object term246942;

    public UserDetail_setPlayerRating_60485638291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term246597 = new Long(4096288569907305445L);
        Integer term246660 = new Integer(1600311664);
        Integer term246662 = new Integer(1505616296);
        Integer term246664 = new Integer(453453842);
        ArrayList term246658 = new ArrayList();
        ((ArrayList) term246658).add(term246660);
        ((ArrayList) term246658).add(term246662);
        ((ArrayList) term246658).add(term246664);
        Integer term246670 = new Integer(591356101);
        Integer term246672 = new Integer(1387849981);
        ArrayList term246668 = new ArrayList();
        ((ArrayList) term246668).add(term246670);
        ((ArrayList) term246668).add(term246672);
        term246593 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term246595 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term246611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term246612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term246616 = newInstance(Class.forName("java.time.LocalTime"));
        Object term246621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term246622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term246626 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term246593, term246593.getClass(), "id", -8393460810457481740L);
        setLongField(term246595, term246595.getClass(), "id", -3227276946443135473L);
        setField(term246595, term246595.getClass(), "extId", term246597);
        setField(term246595, term246595.getClass(), "luid", "YqccKZsgWh");
        setIntField(term246612, term246612.getClass(), "year", 2027);
        setShortField(term246612, term246612.getClass(), "month", (short) 8);
        setShortField(term246612, term246612.getClass(), "day", (short) 28);
        setField(term246611, term246611.getClass(), "date", term246612);
        setByteField(term246616, term246616.getClass(), "hour", (byte) 18);
        setByteField(term246616, term246616.getClass(), "minute", (byte) 28);
        setByteField(term246616, term246616.getClass(), "second", (byte) 45);
        setIntField(term246616, term246616.getClass(), "nano", 351559461);
        setField(term246611, term246611.getClass(), "time", term246616);
        setField(term246595, term246595.getClass(), "registerTime", term246611);
        setIntField(term246622, term246622.getClass(), "year", 2016);
        setShortField(term246622, term246622.getClass(), "month", (short) 9);
        setShortField(term246622, term246622.getClass(), "day", (short) 28);
        setField(term246621, term246621.getClass(), "date", term246622);
        setByteField(term246626, term246626.getClass(), "hour", (byte) 13);
        setByteField(term246626, term246626.getClass(), "minute", (byte) 19);
        setByteField(term246626, term246626.getClass(), "second", (byte) 21);
        setIntField(term246626, term246626.getClass(), "nano", 258693118);
        setField(term246621, term246621.getClass(), "time", term246626);
        setField(term246595, term246595.getClass(), "accessTime", term246621);
        setField(term246593, term246593.getClass(), "card", term246595);
        setField(term246593, term246593.getClass(), "userName", "tULmgjENgn");
        setIntField(term246593, term246593.getClass(), "isNetMember", 884431781);
        setIntField(term246593, term246593.getClass(), "iconId", -287142228);
        setIntField(term246593, term246593.getClass(), "plateId", -982713543);
        setIntField(term246593, term246593.getClass(), "titleId", 113516580);
        setIntField(term246593, term246593.getClass(), "partnerId", 515785947);
        setIntField(term246593, term246593.getClass(), "frameId", 1732018853);
        setIntField(term246593, term246593.getClass(), "selectMapId", 278763848);
        setIntField(term246593, term246593.getClass(), "totalAwake", -799242832);
        setIntField(term246593, term246593.getClass(), "gradeRating", -1423839734);
        setIntField(term246593, term246593.getClass(), "musicRating", -1314164926);
        setIntField(term246593, term246593.getClass(), "playerRating", 1543292290);
        setIntField(term246593, term246593.getClass(), "highestRating", -1850504566);
        setIntField(term246593, term246593.getClass(), "gradeRank", -798400528);
        setIntField(term246593, term246593.getClass(), "classRank", 2045226655);
        setIntField(term246593, term246593.getClass(), "courseRank", -1704065897);
        setField(term246593, term246593.getClass(), "charaSlot", term246658);
        setField(term246593, term246593.getClass(), "charaLockSlot", term246668);
        setLongField(term246593, term246593.getClass(), "contentBit", 1792795309279557206L);
        setIntField(term246593, term246593.getClass(), "playCount", 714518855);
        setField(term246593, term246593.getClass(), "eventWatchedDate", "zBwUyAokiE");
        setField(term246593, term246593.getClass(), "lastGameId", "pbdmztefxU");
        setField(term246593, term246593.getClass(), "lastRomVersion", "PuJpvbpDKR");
        setField(term246593, term246593.getClass(), "lastDataVersion", "aDywfjbiui");
        setField(term246593, term246593.getClass(), "lastLoginDate", "sjLStQGrFs");
        setField(term246593, term246593.getClass(), "lastPlayDate", "YTNLhcKYKW");
        setIntField(term246593, term246593.getClass(), "lastPlayCredit", 1746565740);
        setIntField(term246593, term246593.getClass(), "lastPlayMode", -1867698927);
        setIntField(term246593, term246593.getClass(), "lastPlaceId", 651844085);
        setField(term246593, term246593.getClass(), "lastPlaceName", "pSSwBgnrrm");
        setIntField(term246593, term246593.getClass(), "lastAllNetId", 1278789451);
        setIntField(term246593, term246593.getClass(), "lastRegionId", -1480106431);
        setField(term246593, term246593.getClass(), "lastRegionName", "CIecTelJYL");
        setField(term246593, term246593.getClass(), "lastClientId", "CRdlcDvmNm");
        setField(term246593, term246593.getClass(), "lastCountryCode", "KNCIEMtVHz");
        setIntField(term246593, term246593.getClass(), "lastSelectEMoney", -64517730);
        setIntField(term246593, term246593.getClass(), "lastSelectTicket", 1783779620);
        setIntField(term246593, term246593.getClass(), "lastSelectCourse", 709868634);
        setIntField(term246593, term246593.getClass(), "lastCountCourse", 1860316952);
        setField(term246593, term246593.getClass(), "firstGameId", "aHiCCXkIIc");
        setField(term246593, term246593.getClass(), "firstRomVersion", "nMtsxQIOdu");
        setField(term246593, term246593.getClass(), "firstDataVersion", "LndvtyUwdc");
        setField(term246593, term246593.getClass(), "firstPlayDate", "LnwCYOTQzr");
        setField(term246593, term246593.getClass(), "compatibleCmVersion", "EClPOOvOQZ");
        setField(term246593, term246593.getClass(), "dailyBonusDate", "pGQdokmFhs");
        setField(term246593, term246593.getClass(), "dailyCourseBonusDate", "VzYfsmeeBD");
        setField(term246593, term246593.getClass(), "lastPairLoginDate", "HjqSzxKjga");
        setField(term246593, term246593.getClass(), "lastTrialPlayDate", "ZgNgomDQwE");
        setIntField(term246593, term246593.getClass(), "playVsCount", -1357166161);
        setIntField(term246593, term246593.getClass(), "playSyncCount", -1627604622);
        setIntField(term246593, term246593.getClass(), "winCount", 713023342);
        setIntField(term246593, term246593.getClass(), "helpCount", 998011339);
        setIntField(term246593, term246593.getClass(), "comboCount", -1950215164);
        setLongField(term246593, term246593.getClass(), "totalDeluxscore", -7598465765601346467L);
        setLongField(term246593, term246593.getClass(), "totalBasicDeluxscore", 1796308232852785436L);
        setLongField(term246593, term246593.getClass(), "totalAdvancedDeluxscore", -4354038382152421458L);
        setLongField(term246593, term246593.getClass(), "totalExpertDeluxscore", -3021702620714918745L);
        setLongField(term246593, term246593.getClass(), "totalMasterDeluxscore", 4114675760855041936L);
        setLongField(term246593, term246593.getClass(), "totalReMasterDeluxscore", 8576463951600368767L);
        setIntField(term246593, term246593.getClass(), "totalSync", -708642862);
        setIntField(term246593, term246593.getClass(), "totalBasicSync", 1451070666);
        setIntField(term246593, term246593.getClass(), "totalAdvancedSync", 1051167456);
        setIntField(term246593, term246593.getClass(), "totalExpertSync", -600103193);
        setIntField(term246593, term246593.getClass(), "totalMasterSync", 1482035968);
        setIntField(term246593, term246593.getClass(), "totalReMasterSync", 172742990);
        setLongField(term246593, term246593.getClass(), "totalAchievement", -2842686096781901325L);
        setLongField(term246593, term246593.getClass(), "totalBasicAchievement", 3718326560852254547L);
        setLongField(term246593, term246593.getClass(), "totalAdvancedAchievement", -768492637543849274L);
        setLongField(term246593, term246593.getClass(), "totalExpertAchievement", 7610410063261059390L);
        setLongField(term246593, term246593.getClass(), "totalMasterAchievement", -6089079562974402078L);
        setLongField(term246593, term246593.getClass(), "totalReMasterAchievement", -8682509259109511605L);
        setLongField(term246593, term246593.getClass(), "playerOldRating", 3504012382699258663L);
        setLongField(term246593, term246593.getClass(), "playerNewRating", -836807378712266437L);
        setIntField(term246593, term246593.getClass(), "banState", -1602215597);
        setLongField(term246593, term246593.getClass(), "dateTime", 3589958953195738340L);
        term246942 = new Integer(-1966047836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term246942;
        callMethod(klass, "setPlayerRating", argTypes, term246593, args);
    }

};


