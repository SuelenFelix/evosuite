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

public class UserExtend_init_21156170080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141378;

    public UserExtend_init_21156170080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term141382 = new Long(6902365338255307910L);
        Integer term141445 = new Integer(622731276);
        Integer term141447 = new Integer(-1302341502);
        Integer term141449 = new Integer(1113574554);
        Integer term141451 = new Integer(1685800093);
        Integer term141453 = new Integer(-318699441);
        Integer term141455 = new Integer(1381027809);
        Integer term141457 = new Integer(-371717995);
        Integer term141459 = new Integer(1713005479);
        ArrayList term141443 = new ArrayList();
        ((ArrayList) term141443).add(term141445);
        ((ArrayList) term141443).add(term141447);
        ((ArrayList) term141443).add(term141449);
        ((ArrayList) term141443).add(term141451);
        ((ArrayList) term141443).add(term141453);
        ((ArrayList) term141443).add(term141455);
        ((ArrayList) term141443).add(term141457);
        ((ArrayList) term141443).add(term141459);
        Integer term141465 = new Integer(-1948910444);
        Integer term141467 = new Integer(-1099061955);
        Integer term141469 = new Integer(-1672904007);
        Integer term141471 = new Integer(-217232010);
        Integer term141473 = new Integer(2053372601);
        Integer term141475 = new Integer(-1828855069);
        Integer term141477 = new Integer(-1213694931);
        ArrayList term141463 = new ArrayList();
        ((ArrayList) term141463).add(term141465);
        ((ArrayList) term141463).add(term141467);
        ((ArrayList) term141463).add(term141469);
        ((ArrayList) term141463).add(term141471);
        ((ArrayList) term141463).add(term141473);
        ((ArrayList) term141463).add(term141475);
        ((ArrayList) term141463).add(term141477);
        term141378 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term141380 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term141396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141401 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141411 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term141378, term141378.getClass(), "id", 5442777372425729608L);
        setLongField(term141380, term141380.getClass(), "id", -4170727101039793104L);
        setField(term141380, term141380.getClass(), "extId", term141382);
        setField(term141380, term141380.getClass(), "luid", "omHQnPTsZR");
        setIntField(term141397, term141397.getClass(), "year", 2010);
        setShortField(term141397, term141397.getClass(), "month", (short) 5);
        setShortField(term141397, term141397.getClass(), "day", (short) 27);
        setField(term141396, term141396.getClass(), "date", term141397);
        setByteField(term141401, term141401.getClass(), "hour", (byte) 12);
        setByteField(term141401, term141401.getClass(), "minute", (byte) 53);
        setByteField(term141401, term141401.getClass(), "second", (byte) 45);
        setIntField(term141401, term141401.getClass(), "nano", 508314626);
        setField(term141396, term141396.getClass(), "time", term141401);
        setField(term141380, term141380.getClass(), "registerTime", term141396);
        setIntField(term141407, term141407.getClass(), "year", 2028);
        setShortField(term141407, term141407.getClass(), "month", (short) 2);
        setShortField(term141407, term141407.getClass(), "day", (short) 29);
        setField(term141406, term141406.getClass(), "date", term141407);
        setByteField(term141411, term141411.getClass(), "hour", (byte) 9);
        setByteField(term141411, term141411.getClass(), "minute", (byte) 45);
        setByteField(term141411, term141411.getClass(), "second", (byte) 4);
        setIntField(term141411, term141411.getClass(), "nano", 508964901);
        setField(term141406, term141406.getClass(), "time", term141411);
        setField(term141380, term141380.getClass(), "accessTime", term141406);
        setField(term141378, term141378.getClass(), "card", term141380);
        setField(term141378, term141378.getClass(), "userName", "ffLERohsXA");
        setIntField(term141378, term141378.getClass(), "isNetMember", 1067606467);
        setIntField(term141378, term141378.getClass(), "iconId", -1111900633);
        setIntField(term141378, term141378.getClass(), "plateId", 113501041);
        setIntField(term141378, term141378.getClass(), "titleId", 1055313115);
        setIntField(term141378, term141378.getClass(), "partnerId", 611928031);
        setIntField(term141378, term141378.getClass(), "frameId", -1840936599);
        setIntField(term141378, term141378.getClass(), "selectMapId", 962187390);
        setIntField(term141378, term141378.getClass(), "totalAwake", -1537949190);
        setIntField(term141378, term141378.getClass(), "gradeRating", 1687498557);
        setIntField(term141378, term141378.getClass(), "musicRating", 1883200409);
        setIntField(term141378, term141378.getClass(), "playerRating", -1909739775);
        setIntField(term141378, term141378.getClass(), "highestRating", -1671310444);
        setIntField(term141378, term141378.getClass(), "gradeRank", 902257077);
        setIntField(term141378, term141378.getClass(), "classRank", -1582930822);
        setIntField(term141378, term141378.getClass(), "courseRank", 1105555311);
        setField(term141378, term141378.getClass(), "charaSlot", term141443);
        setField(term141378, term141378.getClass(), "charaLockSlot", term141463);
        setLongField(term141378, term141378.getClass(), "contentBit", 2425919301049553782L);
        setIntField(term141378, term141378.getClass(), "playCount", -1070743074);
        setField(term141378, term141378.getClass(), "eventWatchedDate", "zMTUAmZToL");
        setField(term141378, term141378.getClass(), "lastGameId", "lnDYutrxeh");
        setField(term141378, term141378.getClass(), "lastRomVersion", "cTHQspxtSw");
        setField(term141378, term141378.getClass(), "lastDataVersion", "RkPKoKjNWD");
        setField(term141378, term141378.getClass(), "lastLoginDate", "WWCtVebkwF");
        setField(term141378, term141378.getClass(), "lastPlayDate", "hEqFqciiYC");
        setIntField(term141378, term141378.getClass(), "lastPlayCredit", -897878983);
        setIntField(term141378, term141378.getClass(), "lastPlayMode", 2049311616);
        setIntField(term141378, term141378.getClass(), "lastPlaceId", -745539968);
        setField(term141378, term141378.getClass(), "lastPlaceName", "kMXoOfTYML");
        setIntField(term141378, term141378.getClass(), "lastAllNetId", 206348186);
        setIntField(term141378, term141378.getClass(), "lastRegionId", -983562694);
        setField(term141378, term141378.getClass(), "lastRegionName", "MXZXoFMvzy");
        setField(term141378, term141378.getClass(), "lastClientId", "OKprzLoTRc");
        setField(term141378, term141378.getClass(), "lastCountryCode", "gnyquIPoBE");
        setIntField(term141378, term141378.getClass(), "lastSelectEMoney", 1376849243);
        setIntField(term141378, term141378.getClass(), "lastSelectTicket", 511751479);
        setIntField(term141378, term141378.getClass(), "lastSelectCourse", -905042992);
        setIntField(term141378, term141378.getClass(), "lastCountCourse", 169603914);
        setField(term141378, term141378.getClass(), "firstGameId", "Teoezfwsmm");
        setField(term141378, term141378.getClass(), "firstRomVersion", "KmAyeYnpeZ");
        setField(term141378, term141378.getClass(), "firstDataVersion", "jPXLhQFRXw");
        setField(term141378, term141378.getClass(), "firstPlayDate", "awecmBkpdf");
        setField(term141378, term141378.getClass(), "compatibleCmVersion", "JpqRemAQer");
        setField(term141378, term141378.getClass(), "dailyBonusDate", "AiWObYbsEu");
        setField(term141378, term141378.getClass(), "dailyCourseBonusDate", "ZgWEffEuOS");
        setField(term141378, term141378.getClass(), "lastPairLoginDate", "ytfTCVidbO");
        setField(term141378, term141378.getClass(), "lastTrialPlayDate", "ZNBXGdVsZF");
        setIntField(term141378, term141378.getClass(), "playVsCount", 827545300);
        setIntField(term141378, term141378.getClass(), "playSyncCount", -111395552);
        setIntField(term141378, term141378.getClass(), "winCount", 997974718);
        setIntField(term141378, term141378.getClass(), "helpCount", 2024272642);
        setIntField(term141378, term141378.getClass(), "comboCount", 879794397);
        setLongField(term141378, term141378.getClass(), "totalDeluxscore", 4947114332289186760L);
        setLongField(term141378, term141378.getClass(), "totalBasicDeluxscore", 3438688892765738362L);
        setLongField(term141378, term141378.getClass(), "totalAdvancedDeluxscore", 5548942172756435328L);
        setLongField(term141378, term141378.getClass(), "totalExpertDeluxscore", 921962243596830906L);
        setLongField(term141378, term141378.getClass(), "totalMasterDeluxscore", 4734307196115855909L);
        setLongField(term141378, term141378.getClass(), "totalReMasterDeluxscore", 7771274437273050096L);
        setIntField(term141378, term141378.getClass(), "totalSync", -772320040);
        setIntField(term141378, term141378.getClass(), "totalBasicSync", -1806851572);
        setIntField(term141378, term141378.getClass(), "totalAdvancedSync", 686629669);
        setIntField(term141378, term141378.getClass(), "totalExpertSync", 1468334562);
        setIntField(term141378, term141378.getClass(), "totalMasterSync", 1888899282);
        setIntField(term141378, term141378.getClass(), "totalReMasterSync", -766362556);
        setLongField(term141378, term141378.getClass(), "totalAchievement", 3067561445859721614L);
        setLongField(term141378, term141378.getClass(), "totalBasicAchievement", -7437685790046877394L);
        setLongField(term141378, term141378.getClass(), "totalAdvancedAchievement", -4307414339795555000L);
        setLongField(term141378, term141378.getClass(), "totalExpertAchievement", -7540649381960807646L);
        setLongField(term141378, term141378.getClass(), "totalMasterAchievement", 6857953530991005045L);
        setLongField(term141378, term141378.getClass(), "totalReMasterAchievement", -4044998073854844261L);
        setLongField(term141378, term141378.getClass(), "playerOldRating", -4377201782345316368L);
        setLongField(term141378, term141378.getClass(), "playerNewRating", 4591494899495202891L);
        setIntField(term141378, term141378.getClass(), "banState", 314054661);
        setLongField(term141378, term141378.getClass(), "dateTime", 9004339418221265333L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term141378;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


