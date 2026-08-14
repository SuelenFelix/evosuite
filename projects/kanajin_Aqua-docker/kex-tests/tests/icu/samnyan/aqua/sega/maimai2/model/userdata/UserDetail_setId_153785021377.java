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

public class UserDetail_setId_153785021377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239101;
     Object term239460;

    public UserDetail_setId_153785021377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239105 = new Long(-1528017371096319990L);
        Integer term239168 = new Integer(1230224947);
        Integer term239170 = new Integer(739759836);
        Integer term239172 = new Integer(-1233408249);
        Integer term239174 = new Integer(1252145496);
        ArrayList term239166 = new ArrayList();
        ((ArrayList) term239166).add(term239168);
        ((ArrayList) term239166).add(term239170);
        ((ArrayList) term239166).add(term239172);
        ((ArrayList) term239166).add(term239174);
        Integer term239180 = new Integer(-469940082);
        Integer term239182 = new Integer(-821294367);
        Integer term239184 = new Integer(-1260916319);
        Integer term239186 = new Integer(740454987);
        Integer term239188 = new Integer(-2100331324);
        Integer term239190 = new Integer(2062095733);
        ArrayList term239178 = new ArrayList();
        ((ArrayList) term239178).add(term239180);
        ((ArrayList) term239178).add(term239182);
        ((ArrayList) term239178).add(term239184);
        ((ArrayList) term239178).add(term239186);
        ((ArrayList) term239178).add(term239188);
        ((ArrayList) term239178).add(term239190);
        term239101 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term239103 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term239119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term239120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term239124 = newInstance(Class.forName("java.time.LocalTime"));
        Object term239129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term239130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term239134 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term239101, term239101.getClass(), "id", 6111573159222918541L);
        setLongField(term239103, term239103.getClass(), "id", -7241530248569778207L);
        setField(term239103, term239103.getClass(), "extId", term239105);
        setField(term239103, term239103.getClass(), "luid", "VVCfLfrbwI");
        setIntField(term239120, term239120.getClass(), "year", 2020);
        setShortField(term239120, term239120.getClass(), "month", (short) 12);
        setShortField(term239120, term239120.getClass(), "day", (short) 3);
        setField(term239119, term239119.getClass(), "date", term239120);
        setByteField(term239124, term239124.getClass(), "hour", (byte) 21);
        setByteField(term239124, term239124.getClass(), "minute", (byte) 9);
        setByteField(term239124, term239124.getClass(), "second", (byte) 18);
        setIntField(term239124, term239124.getClass(), "nano", 913732377);
        setField(term239119, term239119.getClass(), "time", term239124);
        setField(term239103, term239103.getClass(), "registerTime", term239119);
        setIntField(term239130, term239130.getClass(), "year", 2018);
        setShortField(term239130, term239130.getClass(), "month", (short) 12);
        setShortField(term239130, term239130.getClass(), "day", (short) 2);
        setField(term239129, term239129.getClass(), "date", term239130);
        setByteField(term239134, term239134.getClass(), "hour", (byte) 15);
        setByteField(term239134, term239134.getClass(), "minute", (byte) 7);
        setByteField(term239134, term239134.getClass(), "second", (byte) 32);
        setIntField(term239134, term239134.getClass(), "nano", 109301383);
        setField(term239129, term239129.getClass(), "time", term239134);
        setField(term239103, term239103.getClass(), "accessTime", term239129);
        setField(term239101, term239101.getClass(), "card", term239103);
        setField(term239101, term239101.getClass(), "userName", "pJBxuaCMAx");
        setIntField(term239101, term239101.getClass(), "isNetMember", -1800952181);
        setIntField(term239101, term239101.getClass(), "iconId", 1755467533);
        setIntField(term239101, term239101.getClass(), "plateId", -305063129);
        setIntField(term239101, term239101.getClass(), "titleId", 2054925050);
        setIntField(term239101, term239101.getClass(), "partnerId", 1265462453);
        setIntField(term239101, term239101.getClass(), "frameId", 1876466793);
        setIntField(term239101, term239101.getClass(), "selectMapId", -731464605);
        setIntField(term239101, term239101.getClass(), "totalAwake", -1071813858);
        setIntField(term239101, term239101.getClass(), "gradeRating", 1363577177);
        setIntField(term239101, term239101.getClass(), "musicRating", -43272492);
        setIntField(term239101, term239101.getClass(), "playerRating", -1971106290);
        setIntField(term239101, term239101.getClass(), "highestRating", 1004223441);
        setIntField(term239101, term239101.getClass(), "gradeRank", 904333346);
        setIntField(term239101, term239101.getClass(), "classRank", 1080841965);
        setIntField(term239101, term239101.getClass(), "courseRank", 1245170022);
        setField(term239101, term239101.getClass(), "charaSlot", term239166);
        setField(term239101, term239101.getClass(), "charaLockSlot", term239178);
        setLongField(term239101, term239101.getClass(), "contentBit", -7987599017171574688L);
        setIntField(term239101, term239101.getClass(), "playCount", 453277937);
        setField(term239101, term239101.getClass(), "eventWatchedDate", "oucuJZavwE");
        setField(term239101, term239101.getClass(), "lastGameId", "wZoQWYVMQg");
        setField(term239101, term239101.getClass(), "lastRomVersion", "WFCgxTJVwD");
        setField(term239101, term239101.getClass(), "lastDataVersion", "KUUxlthDsn");
        setField(term239101, term239101.getClass(), "lastLoginDate", "almiLtzMxP");
        setField(term239101, term239101.getClass(), "lastPlayDate", "qJJVKWtQic");
        setIntField(term239101, term239101.getClass(), "lastPlayCredit", -1489950790);
        setIntField(term239101, term239101.getClass(), "lastPlayMode", 1614233470);
        setIntField(term239101, term239101.getClass(), "lastPlaceId", 356387551);
        setField(term239101, term239101.getClass(), "lastPlaceName", "kugTVFFpsO");
        setIntField(term239101, term239101.getClass(), "lastAllNetId", -1328121391);
        setIntField(term239101, term239101.getClass(), "lastRegionId", -1549516161);
        setField(term239101, term239101.getClass(), "lastRegionName", "DWtHUNpDzA");
        setField(term239101, term239101.getClass(), "lastClientId", "rcBporRNoY");
        setField(term239101, term239101.getClass(), "lastCountryCode", "dsKVyjqQzX");
        setIntField(term239101, term239101.getClass(), "lastSelectEMoney", 951061028);
        setIntField(term239101, term239101.getClass(), "lastSelectTicket", -1928508433);
        setIntField(term239101, term239101.getClass(), "lastSelectCourse", 68741249);
        setIntField(term239101, term239101.getClass(), "lastCountCourse", -1492840842);
        setField(term239101, term239101.getClass(), "firstGameId", "NSLutnlusQ");
        setField(term239101, term239101.getClass(), "firstRomVersion", "ACojQtFFkc");
        setField(term239101, term239101.getClass(), "firstDataVersion", "fsNoWwYRcl");
        setField(term239101, term239101.getClass(), "firstPlayDate", "kmSalAbExi");
        setField(term239101, term239101.getClass(), "compatibleCmVersion", "WaoIDVIlvl");
        setField(term239101, term239101.getClass(), "dailyBonusDate", "ZjRzXtkOnD");
        setField(term239101, term239101.getClass(), "dailyCourseBonusDate", "aBYmFDsROK");
        setField(term239101, term239101.getClass(), "lastPairLoginDate", "GtdCGkdhcP");
        setField(term239101, term239101.getClass(), "lastTrialPlayDate", "hcCiadryUN");
        setIntField(term239101, term239101.getClass(), "playVsCount", 340367925);
        setIntField(term239101, term239101.getClass(), "playSyncCount", 1641801254);
        setIntField(term239101, term239101.getClass(), "winCount", -695088814);
        setIntField(term239101, term239101.getClass(), "helpCount", 2067097728);
        setIntField(term239101, term239101.getClass(), "comboCount", -462923299);
        setLongField(term239101, term239101.getClass(), "totalDeluxscore", 347247632880513361L);
        setLongField(term239101, term239101.getClass(), "totalBasicDeluxscore", 698729198094167996L);
        setLongField(term239101, term239101.getClass(), "totalAdvancedDeluxscore", -6294656200849059437L);
        setLongField(term239101, term239101.getClass(), "totalExpertDeluxscore", -4346683434300500733L);
        setLongField(term239101, term239101.getClass(), "totalMasterDeluxscore", 7583227759724852122L);
        setLongField(term239101, term239101.getClass(), "totalReMasterDeluxscore", -3306396944536453086L);
        setIntField(term239101, term239101.getClass(), "totalSync", 747746176);
        setIntField(term239101, term239101.getClass(), "totalBasicSync", -650905960);
        setIntField(term239101, term239101.getClass(), "totalAdvancedSync", 1138826954);
        setIntField(term239101, term239101.getClass(), "totalExpertSync", -1295473270);
        setIntField(term239101, term239101.getClass(), "totalMasterSync", 1947181054);
        setIntField(term239101, term239101.getClass(), "totalReMasterSync", -992799567);
        setLongField(term239101, term239101.getClass(), "totalAchievement", 924822094977762399L);
        setLongField(term239101, term239101.getClass(), "totalBasicAchievement", -7974368090518365161L);
        setLongField(term239101, term239101.getClass(), "totalAdvancedAchievement", 4943945303346433286L);
        setLongField(term239101, term239101.getClass(), "totalExpertAchievement", 7113219758730381235L);
        setLongField(term239101, term239101.getClass(), "totalMasterAchievement", -4427829357641129153L);
        setLongField(term239101, term239101.getClass(), "totalReMasterAchievement", 1511100057045227169L);
        setLongField(term239101, term239101.getClass(), "playerOldRating", -4719282477331956753L);
        setLongField(term239101, term239101.getClass(), "playerNewRating", 3132365892368129702L);
        setIntField(term239101, term239101.getClass(), "banState", 470314634);
        setLongField(term239101, term239101.getClass(), "dateTime", -7949089352615443442L);
        term239460 = new Long(6091614362645222697L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term239460;
        callMethod(klass, "setId", argTypes, term239101, args);
    }

};


