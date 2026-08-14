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

public class UserDetail_setPlayerRating_60485638290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246538;
     Object term246887;

    public UserDetail_setPlayerRating_60485638290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term246542 = new Long(4096288569907305445L);
        Integer term246605 = new Integer(1600311664);
        Integer term246607 = new Integer(1505616296);
        Integer term246609 = new Integer(453453842);
        ArrayList term246603 = new ArrayList();
        ((ArrayList) term246603).add(term246605);
        ((ArrayList) term246603).add(term246607);
        ((ArrayList) term246603).add(term246609);
        Integer term246615 = new Integer(591356101);
        Integer term246617 = new Integer(1387849981);
        ArrayList term246613 = new ArrayList();
        ((ArrayList) term246613).add(term246615);
        ((ArrayList) term246613).add(term246617);
        term246538 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term246540 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term246556 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term246557 = newInstance(Class.forName("java.time.LocalDate"));
        Object term246561 = newInstance(Class.forName("java.time.LocalTime"));
        Object term246566 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term246567 = newInstance(Class.forName("java.time.LocalDate"));
        Object term246571 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term246538, term246538.getClass(), "id", -8393460810457481740L);
        setLongField(term246540, term246540.getClass(), "id", -3227276946443135473L);
        setField(term246540, term246540.getClass(), "extId", term246542);
        setField(term246540, term246540.getClass(), "luid", "YqccKZsgWh");
        setIntField(term246557, term246557.getClass(), "year", 2027);
        setShortField(term246557, term246557.getClass(), "month", (short) 8);
        setShortField(term246557, term246557.getClass(), "day", (short) 28);
        setField(term246556, term246556.getClass(), "date", term246557);
        setByteField(term246561, term246561.getClass(), "hour", (byte) 18);
        setByteField(term246561, term246561.getClass(), "minute", (byte) 28);
        setByteField(term246561, term246561.getClass(), "second", (byte) 45);
        setIntField(term246561, term246561.getClass(), "nano", 351559461);
        setField(term246556, term246556.getClass(), "time", term246561);
        setField(term246540, term246540.getClass(), "registerTime", term246556);
        setIntField(term246567, term246567.getClass(), "year", 2016);
        setShortField(term246567, term246567.getClass(), "month", (short) 9);
        setShortField(term246567, term246567.getClass(), "day", (short) 28);
        setField(term246566, term246566.getClass(), "date", term246567);
        setByteField(term246571, term246571.getClass(), "hour", (byte) 13);
        setByteField(term246571, term246571.getClass(), "minute", (byte) 19);
        setByteField(term246571, term246571.getClass(), "second", (byte) 21);
        setIntField(term246571, term246571.getClass(), "nano", 258693118);
        setField(term246566, term246566.getClass(), "time", term246571);
        setField(term246540, term246540.getClass(), "accessTime", term246566);
        setField(term246538, term246538.getClass(), "card", term246540);
        setField(term246538, term246538.getClass(), "userName", "tULmgjENgn");
        setIntField(term246538, term246538.getClass(), "isNetMember", 884431781);
        setIntField(term246538, term246538.getClass(), "iconId", -287142228);
        setIntField(term246538, term246538.getClass(), "plateId", -982713543);
        setIntField(term246538, term246538.getClass(), "titleId", 113516580);
        setIntField(term246538, term246538.getClass(), "partnerId", 515785947);
        setIntField(term246538, term246538.getClass(), "frameId", 1732018853);
        setIntField(term246538, term246538.getClass(), "selectMapId", 278763848);
        setIntField(term246538, term246538.getClass(), "totalAwake", -799242832);
        setIntField(term246538, term246538.getClass(), "gradeRating", -1423839734);
        setIntField(term246538, term246538.getClass(), "musicRating", -1314164926);
        setIntField(term246538, term246538.getClass(), "playerRating", 1543292290);
        setIntField(term246538, term246538.getClass(), "highestRating", -1850504566);
        setIntField(term246538, term246538.getClass(), "gradeRank", -798400528);
        setIntField(term246538, term246538.getClass(), "classRank", 2045226655);
        setIntField(term246538, term246538.getClass(), "courseRank", -1704065897);
        setField(term246538, term246538.getClass(), "charaSlot", term246603);
        setField(term246538, term246538.getClass(), "charaLockSlot", term246613);
        setLongField(term246538, term246538.getClass(), "contentBit", 1792795309279557206L);
        setIntField(term246538, term246538.getClass(), "playCount", 714518855);
        setField(term246538, term246538.getClass(), "eventWatchedDate", "zBwUyAokiE");
        setField(term246538, term246538.getClass(), "lastGameId", "pbdmztefxU");
        setField(term246538, term246538.getClass(), "lastRomVersion", "PuJpvbpDKR");
        setField(term246538, term246538.getClass(), "lastDataVersion", "aDywfjbiui");
        setField(term246538, term246538.getClass(), "lastLoginDate", "sjLStQGrFs");
        setField(term246538, term246538.getClass(), "lastPlayDate", "YTNLhcKYKW");
        setIntField(term246538, term246538.getClass(), "lastPlayCredit", 1746565740);
        setIntField(term246538, term246538.getClass(), "lastPlayMode", -1867698927);
        setIntField(term246538, term246538.getClass(), "lastPlaceId", 651844085);
        setField(term246538, term246538.getClass(), "lastPlaceName", "pSSwBgnrrm");
        setIntField(term246538, term246538.getClass(), "lastAllNetId", 1278789451);
        setIntField(term246538, term246538.getClass(), "lastRegionId", -1480106431);
        setField(term246538, term246538.getClass(), "lastRegionName", "CIecTelJYL");
        setField(term246538, term246538.getClass(), "lastClientId", "CRdlcDvmNm");
        setField(term246538, term246538.getClass(), "lastCountryCode", "KNCIEMtVHz");
        setIntField(term246538, term246538.getClass(), "lastSelectEMoney", -64517730);
        setIntField(term246538, term246538.getClass(), "lastSelectTicket", 1783779620);
        setIntField(term246538, term246538.getClass(), "lastSelectCourse", 709868634);
        setIntField(term246538, term246538.getClass(), "lastCountCourse", 1860316952);
        setField(term246538, term246538.getClass(), "firstGameId", "aHiCCXkIIc");
        setField(term246538, term246538.getClass(), "firstRomVersion", "nMtsxQIOdu");
        setField(term246538, term246538.getClass(), "firstDataVersion", "LndvtyUwdc");
        setField(term246538, term246538.getClass(), "firstPlayDate", "LnwCYOTQzr");
        setField(term246538, term246538.getClass(), "compatibleCmVersion", "EClPOOvOQZ");
        setField(term246538, term246538.getClass(), "dailyBonusDate", "pGQdokmFhs");
        setField(term246538, term246538.getClass(), "dailyCourseBonusDate", "VzYfsmeeBD");
        setField(term246538, term246538.getClass(), "lastPairLoginDate", "HjqSzxKjga");
        setField(term246538, term246538.getClass(), "lastTrialPlayDate", "ZgNgomDQwE");
        setIntField(term246538, term246538.getClass(), "playVsCount", -1357166161);
        setIntField(term246538, term246538.getClass(), "playSyncCount", -1627604622);
        setIntField(term246538, term246538.getClass(), "winCount", 713023342);
        setIntField(term246538, term246538.getClass(), "helpCount", 998011339);
        setIntField(term246538, term246538.getClass(), "comboCount", -1950215164);
        setLongField(term246538, term246538.getClass(), "totalDeluxscore", -7598465765601346467L);
        setLongField(term246538, term246538.getClass(), "totalBasicDeluxscore", 1796308232852785436L);
        setLongField(term246538, term246538.getClass(), "totalAdvancedDeluxscore", -4354038382152421458L);
        setLongField(term246538, term246538.getClass(), "totalExpertDeluxscore", -3021702620714918745L);
        setLongField(term246538, term246538.getClass(), "totalMasterDeluxscore", 4114675760855041936L);
        setLongField(term246538, term246538.getClass(), "totalReMasterDeluxscore", 8576463951600368767L);
        setIntField(term246538, term246538.getClass(), "totalSync", -708642862);
        setIntField(term246538, term246538.getClass(), "totalBasicSync", 1451070666);
        setIntField(term246538, term246538.getClass(), "totalAdvancedSync", 1051167456);
        setIntField(term246538, term246538.getClass(), "totalExpertSync", -600103193);
        setIntField(term246538, term246538.getClass(), "totalMasterSync", 1482035968);
        setIntField(term246538, term246538.getClass(), "totalReMasterSync", 172742990);
        setLongField(term246538, term246538.getClass(), "totalAchievement", -2842686096781901325L);
        setLongField(term246538, term246538.getClass(), "totalBasicAchievement", 3718326560852254547L);
        setLongField(term246538, term246538.getClass(), "totalAdvancedAchievement", -768492637543849274L);
        setLongField(term246538, term246538.getClass(), "totalExpertAchievement", 7610410063261059390L);
        setLongField(term246538, term246538.getClass(), "totalMasterAchievement", -6089079562974402078L);
        setLongField(term246538, term246538.getClass(), "totalReMasterAchievement", -8682509259109511605L);
        setLongField(term246538, term246538.getClass(), "playerOldRating", 3504012382699258663L);
        setLongField(term246538, term246538.getClass(), "playerNewRating", -836807378712266437L);
        setIntField(term246538, term246538.getClass(), "banState", -1602215597);
        setLongField(term246538, term246538.getClass(), "dateTime", 3589958953195738340L);
        term246887 = new Integer(-1966047836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term246887;
        callMethod(klass, "setPlayerRating", argTypes, term246538, args);
    }

};


