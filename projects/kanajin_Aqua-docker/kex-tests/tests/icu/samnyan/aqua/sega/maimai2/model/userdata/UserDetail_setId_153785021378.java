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

public class UserDetail_setId_153785021378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239156;
     Object term239515;

    public UserDetail_setId_153785021378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239160 = new Long(-1528017371096319990L);
        Integer term239223 = new Integer(1230224947);
        Integer term239225 = new Integer(739759836);
        Integer term239227 = new Integer(-1233408249);
        Integer term239229 = new Integer(1252145496);
        ArrayList term239221 = new ArrayList();
        ((ArrayList) term239221).add(term239223);
        ((ArrayList) term239221).add(term239225);
        ((ArrayList) term239221).add(term239227);
        ((ArrayList) term239221).add(term239229);
        Integer term239235 = new Integer(-469940082);
        Integer term239237 = new Integer(-821294367);
        Integer term239239 = new Integer(-1260916319);
        Integer term239241 = new Integer(740454987);
        Integer term239243 = new Integer(-2100331324);
        Integer term239245 = new Integer(2062095733);
        ArrayList term239233 = new ArrayList();
        ((ArrayList) term239233).add(term239235);
        ((ArrayList) term239233).add(term239237);
        ((ArrayList) term239233).add(term239239);
        ((ArrayList) term239233).add(term239241);
        ((ArrayList) term239233).add(term239243);
        ((ArrayList) term239233).add(term239245);
        term239156 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term239158 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term239174 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term239175 = newInstance(Class.forName("java.time.LocalDate"));
        Object term239179 = newInstance(Class.forName("java.time.LocalTime"));
        Object term239184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term239185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term239189 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term239156, term239156.getClass(), "id", 6111573159222918541L);
        setLongField(term239158, term239158.getClass(), "id", -7241530248569778207L);
        setField(term239158, term239158.getClass(), "extId", term239160);
        setField(term239158, term239158.getClass(), "luid", "VVCfLfrbwI");
        setIntField(term239175, term239175.getClass(), "year", 2020);
        setShortField(term239175, term239175.getClass(), "month", (short) 12);
        setShortField(term239175, term239175.getClass(), "day", (short) 3);
        setField(term239174, term239174.getClass(), "date", term239175);
        setByteField(term239179, term239179.getClass(), "hour", (byte) 21);
        setByteField(term239179, term239179.getClass(), "minute", (byte) 9);
        setByteField(term239179, term239179.getClass(), "second", (byte) 18);
        setIntField(term239179, term239179.getClass(), "nano", 913732377);
        setField(term239174, term239174.getClass(), "time", term239179);
        setField(term239158, term239158.getClass(), "registerTime", term239174);
        setIntField(term239185, term239185.getClass(), "year", 2018);
        setShortField(term239185, term239185.getClass(), "month", (short) 12);
        setShortField(term239185, term239185.getClass(), "day", (short) 2);
        setField(term239184, term239184.getClass(), "date", term239185);
        setByteField(term239189, term239189.getClass(), "hour", (byte) 15);
        setByteField(term239189, term239189.getClass(), "minute", (byte) 7);
        setByteField(term239189, term239189.getClass(), "second", (byte) 32);
        setIntField(term239189, term239189.getClass(), "nano", 109301383);
        setField(term239184, term239184.getClass(), "time", term239189);
        setField(term239158, term239158.getClass(), "accessTime", term239184);
        setField(term239156, term239156.getClass(), "card", term239158);
        setField(term239156, term239156.getClass(), "userName", "pJBxuaCMAx");
        setIntField(term239156, term239156.getClass(), "isNetMember", -1800952181);
        setIntField(term239156, term239156.getClass(), "iconId", 1755467533);
        setIntField(term239156, term239156.getClass(), "plateId", -305063129);
        setIntField(term239156, term239156.getClass(), "titleId", 2054925050);
        setIntField(term239156, term239156.getClass(), "partnerId", 1265462453);
        setIntField(term239156, term239156.getClass(), "frameId", 1876466793);
        setIntField(term239156, term239156.getClass(), "selectMapId", -731464605);
        setIntField(term239156, term239156.getClass(), "totalAwake", -1071813858);
        setIntField(term239156, term239156.getClass(), "gradeRating", 1363577177);
        setIntField(term239156, term239156.getClass(), "musicRating", -43272492);
        setIntField(term239156, term239156.getClass(), "playerRating", -1971106290);
        setIntField(term239156, term239156.getClass(), "highestRating", 1004223441);
        setIntField(term239156, term239156.getClass(), "gradeRank", 904333346);
        setIntField(term239156, term239156.getClass(), "classRank", 1080841965);
        setIntField(term239156, term239156.getClass(), "courseRank", 1245170022);
        setField(term239156, term239156.getClass(), "charaSlot", term239221);
        setField(term239156, term239156.getClass(), "charaLockSlot", term239233);
        setLongField(term239156, term239156.getClass(), "contentBit", -7987599017171574688L);
        setIntField(term239156, term239156.getClass(), "playCount", 453277937);
        setField(term239156, term239156.getClass(), "eventWatchedDate", "oucuJZavwE");
        setField(term239156, term239156.getClass(), "lastGameId", "wZoQWYVMQg");
        setField(term239156, term239156.getClass(), "lastRomVersion", "WFCgxTJVwD");
        setField(term239156, term239156.getClass(), "lastDataVersion", "KUUxlthDsn");
        setField(term239156, term239156.getClass(), "lastLoginDate", "almiLtzMxP");
        setField(term239156, term239156.getClass(), "lastPlayDate", "qJJVKWtQic");
        setIntField(term239156, term239156.getClass(), "lastPlayCredit", -1489950790);
        setIntField(term239156, term239156.getClass(), "lastPlayMode", 1614233470);
        setIntField(term239156, term239156.getClass(), "lastPlaceId", 356387551);
        setField(term239156, term239156.getClass(), "lastPlaceName", "kugTVFFpsO");
        setIntField(term239156, term239156.getClass(), "lastAllNetId", -1328121391);
        setIntField(term239156, term239156.getClass(), "lastRegionId", -1549516161);
        setField(term239156, term239156.getClass(), "lastRegionName", "DWtHUNpDzA");
        setField(term239156, term239156.getClass(), "lastClientId", "rcBporRNoY");
        setField(term239156, term239156.getClass(), "lastCountryCode", "dsKVyjqQzX");
        setIntField(term239156, term239156.getClass(), "lastSelectEMoney", 951061028);
        setIntField(term239156, term239156.getClass(), "lastSelectTicket", -1928508433);
        setIntField(term239156, term239156.getClass(), "lastSelectCourse", 68741249);
        setIntField(term239156, term239156.getClass(), "lastCountCourse", -1492840842);
        setField(term239156, term239156.getClass(), "firstGameId", "NSLutnlusQ");
        setField(term239156, term239156.getClass(), "firstRomVersion", "ACojQtFFkc");
        setField(term239156, term239156.getClass(), "firstDataVersion", "fsNoWwYRcl");
        setField(term239156, term239156.getClass(), "firstPlayDate", "kmSalAbExi");
        setField(term239156, term239156.getClass(), "compatibleCmVersion", "WaoIDVIlvl");
        setField(term239156, term239156.getClass(), "dailyBonusDate", "ZjRzXtkOnD");
        setField(term239156, term239156.getClass(), "dailyCourseBonusDate", "aBYmFDsROK");
        setField(term239156, term239156.getClass(), "lastPairLoginDate", "GtdCGkdhcP");
        setField(term239156, term239156.getClass(), "lastTrialPlayDate", "hcCiadryUN");
        setIntField(term239156, term239156.getClass(), "playVsCount", 340367925);
        setIntField(term239156, term239156.getClass(), "playSyncCount", 1641801254);
        setIntField(term239156, term239156.getClass(), "winCount", -695088814);
        setIntField(term239156, term239156.getClass(), "helpCount", 2067097728);
        setIntField(term239156, term239156.getClass(), "comboCount", -462923299);
        setLongField(term239156, term239156.getClass(), "totalDeluxscore", 347247632880513361L);
        setLongField(term239156, term239156.getClass(), "totalBasicDeluxscore", 698729198094167996L);
        setLongField(term239156, term239156.getClass(), "totalAdvancedDeluxscore", -6294656200849059437L);
        setLongField(term239156, term239156.getClass(), "totalExpertDeluxscore", -4346683434300500733L);
        setLongField(term239156, term239156.getClass(), "totalMasterDeluxscore", 7583227759724852122L);
        setLongField(term239156, term239156.getClass(), "totalReMasterDeluxscore", -3306396944536453086L);
        setIntField(term239156, term239156.getClass(), "totalSync", 747746176);
        setIntField(term239156, term239156.getClass(), "totalBasicSync", -650905960);
        setIntField(term239156, term239156.getClass(), "totalAdvancedSync", 1138826954);
        setIntField(term239156, term239156.getClass(), "totalExpertSync", -1295473270);
        setIntField(term239156, term239156.getClass(), "totalMasterSync", 1947181054);
        setIntField(term239156, term239156.getClass(), "totalReMasterSync", -992799567);
        setLongField(term239156, term239156.getClass(), "totalAchievement", 924822094977762399L);
        setLongField(term239156, term239156.getClass(), "totalBasicAchievement", -7974368090518365161L);
        setLongField(term239156, term239156.getClass(), "totalAdvancedAchievement", 4943945303346433286L);
        setLongField(term239156, term239156.getClass(), "totalExpertAchievement", 7113219758730381235L);
        setLongField(term239156, term239156.getClass(), "totalMasterAchievement", -4427829357641129153L);
        setLongField(term239156, term239156.getClass(), "totalReMasterAchievement", 1511100057045227169L);
        setLongField(term239156, term239156.getClass(), "playerOldRating", -4719282477331956753L);
        setLongField(term239156, term239156.getClass(), "playerNewRating", 3132365892368129702L);
        setIntField(term239156, term239156.getClass(), "banState", 470314634);
        setLongField(term239156, term239156.getClass(), "dateTime", -7949089352615443442L);
        term239515 = new Long(6091614362645222697L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term239515;
        callMethod(klass, "setId", argTypes, term239156, args);
    }

};


