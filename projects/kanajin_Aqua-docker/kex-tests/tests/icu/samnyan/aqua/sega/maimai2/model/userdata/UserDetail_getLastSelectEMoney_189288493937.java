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

public class UserDetail_getLastSelectEMoney_189288493937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216507;

    public UserDetail_getLastSelectEMoney_189288493937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term216511 = new Long(6853972830905120647L);
        Integer term216574 = new Integer(1682543276);
        Integer term216576 = new Integer(156914536);
        ArrayList term216572 = new ArrayList();
        ((ArrayList) term216572).add(term216574);
        ((ArrayList) term216572).add(term216576);
        Integer term216582 = new Integer(-1745894636);
        Integer term216584 = new Integer(571282234);
        Integer term216586 = new Integer(1131350330);
        Integer term216588 = new Integer(-1463702476);
        Integer term216590 = new Integer(90151812);
        Integer term216592 = new Integer(-416703693);
        Integer term216594 = new Integer(-1718111500);
        Integer term216596 = new Integer(2134049264);
        ArrayList term216580 = new ArrayList();
        ((ArrayList) term216580).add(term216582);
        ((ArrayList) term216580).add(term216584);
        ((ArrayList) term216580).add(term216586);
        ((ArrayList) term216580).add(term216588);
        ((ArrayList) term216580).add(term216590);
        ((ArrayList) term216580).add(term216592);
        ((ArrayList) term216580).add(term216594);
        ((ArrayList) term216580).add(term216596);
        term216507 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term216509 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term216525 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term216526 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216530 = newInstance(Class.forName("java.time.LocalTime"));
        Object term216535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term216536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216540 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term216507, term216507.getClass(), "id", 1328309579961114471L);
        setLongField(term216509, term216509.getClass(), "id", 5015032571762374279L);
        setField(term216509, term216509.getClass(), "extId", term216511);
        setField(term216509, term216509.getClass(), "luid", "IUwWcCDHby");
        setIntField(term216526, term216526.getClass(), "year", 2011);
        setShortField(term216526, term216526.getClass(), "month", (short) 12);
        setShortField(term216526, term216526.getClass(), "day", (short) 8);
        setField(term216525, term216525.getClass(), "date", term216526);
        setByteField(term216530, term216530.getClass(), "hour", (byte) 14);
        setByteField(term216530, term216530.getClass(), "minute", (byte) 21);
        setByteField(term216530, term216530.getClass(), "second", (byte) 41);
        setIntField(term216530, term216530.getClass(), "nano", 831066682);
        setField(term216525, term216525.getClass(), "time", term216530);
        setField(term216509, term216509.getClass(), "registerTime", term216525);
        setIntField(term216536, term216536.getClass(), "year", 2018);
        setShortField(term216536, term216536.getClass(), "month", (short) 12);
        setShortField(term216536, term216536.getClass(), "day", (short) 8);
        setField(term216535, term216535.getClass(), "date", term216536);
        setByteField(term216540, term216540.getClass(), "hour", (byte) 14);
        setByteField(term216540, term216540.getClass(), "minute", (byte) 50);
        setByteField(term216540, term216540.getClass(), "second", (byte) 10);
        setIntField(term216540, term216540.getClass(), "nano", 698726170);
        setField(term216535, term216535.getClass(), "time", term216540);
        setField(term216509, term216509.getClass(), "accessTime", term216535);
        setField(term216507, term216507.getClass(), "card", term216509);
        setField(term216507, term216507.getClass(), "userName", "PxmOkaAbkD");
        setIntField(term216507, term216507.getClass(), "isNetMember", 1477888487);
        setIntField(term216507, term216507.getClass(), "iconId", -960025607);
        setIntField(term216507, term216507.getClass(), "plateId", -610981578);
        setIntField(term216507, term216507.getClass(), "titleId", -63470209);
        setIntField(term216507, term216507.getClass(), "partnerId", -466622881);
        setIntField(term216507, term216507.getClass(), "frameId", 1191081545);
        setIntField(term216507, term216507.getClass(), "selectMapId", 1005504997);
        setIntField(term216507, term216507.getClass(), "totalAwake", -1900158526);
        setIntField(term216507, term216507.getClass(), "gradeRating", -1670882565);
        setIntField(term216507, term216507.getClass(), "musicRating", -1505581092);
        setIntField(term216507, term216507.getClass(), "playerRating", 547730411);
        setIntField(term216507, term216507.getClass(), "highestRating", 352716947);
        setIntField(term216507, term216507.getClass(), "gradeRank", 1942797432);
        setIntField(term216507, term216507.getClass(), "classRank", -190935358);
        setIntField(term216507, term216507.getClass(), "courseRank", -1392130122);
        setField(term216507, term216507.getClass(), "charaSlot", term216572);
        setField(term216507, term216507.getClass(), "charaLockSlot", term216580);
        setLongField(term216507, term216507.getClass(), "contentBit", 3950055695438813172L);
        setIntField(term216507, term216507.getClass(), "playCount", 152610093);
        setField(term216507, term216507.getClass(), "eventWatchedDate", "HydtLkUggc");
        setField(term216507, term216507.getClass(), "lastGameId", "xqFhlNGPNf");
        setField(term216507, term216507.getClass(), "lastRomVersion", "inJfaygIHT");
        setField(term216507, term216507.getClass(), "lastDataVersion", "LSmdmNXNmK");
        setField(term216507, term216507.getClass(), "lastLoginDate", "ouSqIuBxkU");
        setField(term216507, term216507.getClass(), "lastPlayDate", "PIskQzLbQC");
        setIntField(term216507, term216507.getClass(), "lastPlayCredit", -1115692502);
        setIntField(term216507, term216507.getClass(), "lastPlayMode", -128305422);
        setIntField(term216507, term216507.getClass(), "lastPlaceId", -1647436228);
        setField(term216507, term216507.getClass(), "lastPlaceName", "WCPEcCgFoc");
        setIntField(term216507, term216507.getClass(), "lastAllNetId", 601867451);
        setIntField(term216507, term216507.getClass(), "lastRegionId", -241946575);
        setField(term216507, term216507.getClass(), "lastRegionName", "blPfauFjyv");
        setField(term216507, term216507.getClass(), "lastClientId", "aOmbiqwZmO");
        setField(term216507, term216507.getClass(), "lastCountryCode", "netNaxYVrg");
        setIntField(term216507, term216507.getClass(), "lastSelectEMoney", -1223017876);
        setIntField(term216507, term216507.getClass(), "lastSelectTicket", -424247215);
        setIntField(term216507, term216507.getClass(), "lastSelectCourse", 832576798);
        setIntField(term216507, term216507.getClass(), "lastCountCourse", 1324536041);
        setField(term216507, term216507.getClass(), "firstGameId", "XWUTqAyuzX");
        setField(term216507, term216507.getClass(), "firstRomVersion", "MlpwpDqxJh");
        setField(term216507, term216507.getClass(), "firstDataVersion", "uRSkQPTqHT");
        setField(term216507, term216507.getClass(), "firstPlayDate", "aqOjPWQHVj");
        setField(term216507, term216507.getClass(), "compatibleCmVersion", "oHxEQPShRZ");
        setField(term216507, term216507.getClass(), "dailyBonusDate", "kbHGRhfzpJ");
        setField(term216507, term216507.getClass(), "dailyCourseBonusDate", "fzmlaqqlVL");
        setField(term216507, term216507.getClass(), "lastPairLoginDate", "pNqXqMrFlN");
        setField(term216507, term216507.getClass(), "lastTrialPlayDate", "jlbLKlLQqw");
        setIntField(term216507, term216507.getClass(), "playVsCount", -1310625886);
        setIntField(term216507, term216507.getClass(), "playSyncCount", 1040482108);
        setIntField(term216507, term216507.getClass(), "winCount", 1962507245);
        setIntField(term216507, term216507.getClass(), "helpCount", 905482662);
        setIntField(term216507, term216507.getClass(), "comboCount", -166421996);
        setLongField(term216507, term216507.getClass(), "totalDeluxscore", 4680259969871678964L);
        setLongField(term216507, term216507.getClass(), "totalBasicDeluxscore", -8079535623511099869L);
        setLongField(term216507, term216507.getClass(), "totalAdvancedDeluxscore", 6213783664737876106L);
        setLongField(term216507, term216507.getClass(), "totalExpertDeluxscore", 2941511442376352105L);
        setLongField(term216507, term216507.getClass(), "totalMasterDeluxscore", 8292155882032188482L);
        setLongField(term216507, term216507.getClass(), "totalReMasterDeluxscore", -2940506771296398549L);
        setIntField(term216507, term216507.getClass(), "totalSync", -1157561721);
        setIntField(term216507, term216507.getClass(), "totalBasicSync", 1406181821);
        setIntField(term216507, term216507.getClass(), "totalAdvancedSync", -38316383);
        setIntField(term216507, term216507.getClass(), "totalExpertSync", 896926009);
        setIntField(term216507, term216507.getClass(), "totalMasterSync", -405250282);
        setIntField(term216507, term216507.getClass(), "totalReMasterSync", -421196383);
        setLongField(term216507, term216507.getClass(), "totalAchievement", 2939024897212707706L);
        setLongField(term216507, term216507.getClass(), "totalBasicAchievement", -3659857262692638404L);
        setLongField(term216507, term216507.getClass(), "totalAdvancedAchievement", 6836079585650107676L);
        setLongField(term216507, term216507.getClass(), "totalExpertAchievement", 8848500472054344868L);
        setLongField(term216507, term216507.getClass(), "totalMasterAchievement", -9012690193533322497L);
        setLongField(term216507, term216507.getClass(), "totalReMasterAchievement", 4804149465943210147L);
        setLongField(term216507, term216507.getClass(), "playerOldRating", -713771074791912819L);
        setLongField(term216507, term216507.getClass(), "playerNewRating", 3753828460538899957L);
        setIntField(term216507, term216507.getClass(), "banState", -1052354004);
        setLongField(term216507, term216507.getClass(), "dateTime", 2236842408211489701L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastSelectEMoney", argTypes, term216507, args);
    }

};


