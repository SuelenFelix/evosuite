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

public class UserFriendSeasonRanking_setPoint_187669217212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22547;
     Object term22930;

    public UserFriendSeasonRanking_setPoint_187669217212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22553 = new Long(-8708192233349544946L);
        Integer term22616 = new Integer(-220791533);
        ArrayList term22614 = new ArrayList();
        ((ArrayList) term22614).add(term22616);
        Integer term22622 = new Integer(1741500243);
        Integer term22624 = new Integer(-2070466617);
        Integer term22626 = new Integer(-1127721881);
        Integer term22628 = new Integer(1074848808);
        Integer term22630 = new Integer(-146054762);
        Integer term22632 = new Integer(798043553);
        ArrayList term22620 = new ArrayList();
        ((ArrayList) term22620).add(term22622);
        ((ArrayList) term22620).add(term22624);
        ((ArrayList) term22620).add(term22626);
        ((ArrayList) term22620).add(term22628);
        ((ArrayList) term22620).add(term22630);
        ((ArrayList) term22620).add(term22632);
        term22547 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term22549 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term22551 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term22567 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22568 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22572 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22582 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term22547, term22547.getClass(), "id", -3548672426577893003L);
        setLongField(term22549, term22549.getClass(), "id", 1592020674405941254L);
        setLongField(term22551, term22551.getClass(), "id", 4098407345651793258L);
        setField(term22551, term22551.getClass(), "extId", term22553);
        setField(term22551, term22551.getClass(), "luid", "kwteHWzwcc");
        setIntField(term22568, term22568.getClass(), "year", 2011);
        setShortField(term22568, term22568.getClass(), "month", (short) 8);
        setShortField(term22568, term22568.getClass(), "day", (short) 1);
        setField(term22567, term22567.getClass(), "date", term22568);
        setByteField(term22572, term22572.getClass(), "hour", (byte) 7);
        setByteField(term22572, term22572.getClass(), "minute", (byte) 2);
        setByteField(term22572, term22572.getClass(), "second", (byte) 46);
        setIntField(term22572, term22572.getClass(), "nano", 187178462);
        setField(term22567, term22567.getClass(), "time", term22572);
        setField(term22551, term22551.getClass(), "registerTime", term22567);
        setIntField(term22578, term22578.getClass(), "year", 2020);
        setShortField(term22578, term22578.getClass(), "month", (short) 9);
        setShortField(term22578, term22578.getClass(), "day", (short) 3);
        setField(term22577, term22577.getClass(), "date", term22578);
        setByteField(term22582, term22582.getClass(), "hour", (byte) 10);
        setByteField(term22582, term22582.getClass(), "minute", (byte) 44);
        setByteField(term22582, term22582.getClass(), "second", (byte) 5);
        setIntField(term22582, term22582.getClass(), "nano", 572560230);
        setField(term22577, term22577.getClass(), "time", term22582);
        setField(term22551, term22551.getClass(), "accessTime", term22577);
        setField(term22549, term22549.getClass(), "card", term22551);
        setField(term22549, term22549.getClass(), "userName", "uMsWXqNhln");
        setIntField(term22549, term22549.getClass(), "isNetMember", -947460705);
        setIntField(term22549, term22549.getClass(), "iconId", -1435758764);
        setIntField(term22549, term22549.getClass(), "plateId", 752858379);
        setIntField(term22549, term22549.getClass(), "titleId", -370819357);
        setIntField(term22549, term22549.getClass(), "partnerId", -71819242);
        setIntField(term22549, term22549.getClass(), "frameId", 1268893136);
        setIntField(term22549, term22549.getClass(), "selectMapId", -1472700822);
        setIntField(term22549, term22549.getClass(), "totalAwake", 1626670889);
        setIntField(term22549, term22549.getClass(), "gradeRating", -2117361140);
        setIntField(term22549, term22549.getClass(), "musicRating", 407708341);
        setIntField(term22549, term22549.getClass(), "playerRating", -287519200);
        setIntField(term22549, term22549.getClass(), "highestRating", -1490696181);
        setIntField(term22549, term22549.getClass(), "gradeRank", 623717232);
        setIntField(term22549, term22549.getClass(), "classRank", -1413291732);
        setIntField(term22549, term22549.getClass(), "courseRank", 203264365);
        setField(term22549, term22549.getClass(), "charaSlot", term22614);
        setField(term22549, term22549.getClass(), "charaLockSlot", term22620);
        setLongField(term22549, term22549.getClass(), "contentBit", 3128610259359668233L);
        setIntField(term22549, term22549.getClass(), "playCount", -1066281036);
        setField(term22549, term22549.getClass(), "eventWatchedDate", "MAnhIPOtHL");
        setField(term22549, term22549.getClass(), "lastGameId", "dikKjYjmRO");
        setField(term22549, term22549.getClass(), "lastRomVersion", "GJnnMDVnEP");
        setField(term22549, term22549.getClass(), "lastDataVersion", "zSMVllDpfk");
        setField(term22549, term22549.getClass(), "lastLoginDate", "iptRXVDoYE");
        setField(term22549, term22549.getClass(), "lastPlayDate", "kucsxnvbES");
        setIntField(term22549, term22549.getClass(), "lastPlayCredit", 30837706);
        setIntField(term22549, term22549.getClass(), "lastPlayMode", 379523101);
        setIntField(term22549, term22549.getClass(), "lastPlaceId", 1017354215);
        setField(term22549, term22549.getClass(), "lastPlaceName", "IdGzDFfcZf");
        setIntField(term22549, term22549.getClass(), "lastAllNetId", 695330987);
        setIntField(term22549, term22549.getClass(), "lastRegionId", -267289967);
        setField(term22549, term22549.getClass(), "lastRegionName", "KDdRNhZmnU");
        setField(term22549, term22549.getClass(), "lastClientId", "iMsqJaKlDC");
        setField(term22549, term22549.getClass(), "lastCountryCode", "aPkGHbZyjj");
        setIntField(term22549, term22549.getClass(), "lastSelectEMoney", 773432822);
        setIntField(term22549, term22549.getClass(), "lastSelectTicket", -488294922);
        setIntField(term22549, term22549.getClass(), "lastSelectCourse", -397161164);
        setIntField(term22549, term22549.getClass(), "lastCountCourse", -703717191);
        setField(term22549, term22549.getClass(), "firstGameId", "nSWdsVyJRI");
        setField(term22549, term22549.getClass(), "firstRomVersion", "JBOPGgGKnc");
        setField(term22549, term22549.getClass(), "firstDataVersion", "GlPTiCMCGP");
        setField(term22549, term22549.getClass(), "firstPlayDate", "jlcBpLoWfd");
        setField(term22549, term22549.getClass(), "compatibleCmVersion", "oYymmLqbfJ");
        setField(term22549, term22549.getClass(), "dailyBonusDate", "YaDWphDOSz");
        setField(term22549, term22549.getClass(), "dailyCourseBonusDate", "nnnmCgFBLw");
        setField(term22549, term22549.getClass(), "lastPairLoginDate", "hSSCyNEhyH");
        setField(term22549, term22549.getClass(), "lastTrialPlayDate", "jDFNSuvZqm");
        setIntField(term22549, term22549.getClass(), "playVsCount", -1255535445);
        setIntField(term22549, term22549.getClass(), "playSyncCount", -2033952124);
        setIntField(term22549, term22549.getClass(), "winCount", 560401653);
        setIntField(term22549, term22549.getClass(), "helpCount", 1633691536);
        setIntField(term22549, term22549.getClass(), "comboCount", 898165245);
        setLongField(term22549, term22549.getClass(), "totalDeluxscore", -7966859634511305171L);
        setLongField(term22549, term22549.getClass(), "totalBasicDeluxscore", 5885163998873132588L);
        setLongField(term22549, term22549.getClass(), "totalAdvancedDeluxscore", 2201264121669950608L);
        setLongField(term22549, term22549.getClass(), "totalExpertDeluxscore", 4911393165710268247L);
        setLongField(term22549, term22549.getClass(), "totalMasterDeluxscore", -836309941570511418L);
        setLongField(term22549, term22549.getClass(), "totalReMasterDeluxscore", -4851193391918639512L);
        setIntField(term22549, term22549.getClass(), "totalSync", 1810754549);
        setIntField(term22549, term22549.getClass(), "totalBasicSync", 338342107);
        setIntField(term22549, term22549.getClass(), "totalAdvancedSync", -650288950);
        setIntField(term22549, term22549.getClass(), "totalExpertSync", 433039357);
        setIntField(term22549, term22549.getClass(), "totalMasterSync", 1469939797);
        setIntField(term22549, term22549.getClass(), "totalReMasterSync", 252799294);
        setLongField(term22549, term22549.getClass(), "totalAchievement", -7163612258041042650L);
        setLongField(term22549, term22549.getClass(), "totalBasicAchievement", -7186158121023817313L);
        setLongField(term22549, term22549.getClass(), "totalAdvancedAchievement", -8510452367371037137L);
        setLongField(term22549, term22549.getClass(), "totalExpertAchievement", 2123432481270520381L);
        setLongField(term22549, term22549.getClass(), "totalMasterAchievement", 7205698466499430091L);
        setLongField(term22549, term22549.getClass(), "totalReMasterAchievement", -4868523627266698649L);
        setLongField(term22549, term22549.getClass(), "playerOldRating", 3228082303360203224L);
        setLongField(term22549, term22549.getClass(), "playerNewRating", 8845929725457841487L);
        setIntField(term22549, term22549.getClass(), "banState", -2072618022);
        setLongField(term22549, term22549.getClass(), "dateTime", 2599553846982918627L);
        setField(term22547, term22547.getClass(), "user", term22549);
        setIntField(term22547, term22547.getClass(), "seasonId", -269909549);
        setIntField(term22547, term22547.getClass(), "point", 686286032);
        setIntField(term22547, term22547.getClass(), "rank", -1277201854);
        setBooleanField(term22547, term22547.getClass(), "rewardGet", true);
        setField(term22547, term22547.getClass(), "userName", "pLvkKHqNYX");
        setField(term22547, term22547.getClass(), "recordDate", "PwqnuJJwjR");
        term22930 = new Integer(1691516034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22930;
        callMethod(klass, "setPoint", argTypes, term22547, args);
    }

};


