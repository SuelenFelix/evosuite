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

public class UserDetail_getLastSelectEMoney_189288493938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216562;

    public UserDetail_getLastSelectEMoney_189288493938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term216566 = new Long(6853972830905120647L);
        Integer term216629 = new Integer(1682543276);
        Integer term216631 = new Integer(156914536);
        ArrayList term216627 = new ArrayList();
        ((ArrayList) term216627).add(term216629);
        ((ArrayList) term216627).add(term216631);
        Integer term216637 = new Integer(-1745894636);
        Integer term216639 = new Integer(571282234);
        Integer term216641 = new Integer(1131350330);
        Integer term216643 = new Integer(-1463702476);
        Integer term216645 = new Integer(90151812);
        Integer term216647 = new Integer(-416703693);
        Integer term216649 = new Integer(-1718111500);
        Integer term216651 = new Integer(2134049264);
        ArrayList term216635 = new ArrayList();
        ((ArrayList) term216635).add(term216637);
        ((ArrayList) term216635).add(term216639);
        ((ArrayList) term216635).add(term216641);
        ((ArrayList) term216635).add(term216643);
        ((ArrayList) term216635).add(term216645);
        ((ArrayList) term216635).add(term216647);
        ((ArrayList) term216635).add(term216649);
        ((ArrayList) term216635).add(term216651);
        term216562 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term216564 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term216580 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term216581 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216585 = newInstance(Class.forName("java.time.LocalTime"));
        Object term216590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term216591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216595 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term216562, term216562.getClass(), "id", 1328309579961114471L);
        setLongField(term216564, term216564.getClass(), "id", 5015032571762374279L);
        setField(term216564, term216564.getClass(), "extId", term216566);
        setField(term216564, term216564.getClass(), "luid", "IUwWcCDHby");
        setIntField(term216581, term216581.getClass(), "year", 2011);
        setShortField(term216581, term216581.getClass(), "month", (short) 12);
        setShortField(term216581, term216581.getClass(), "day", (short) 8);
        setField(term216580, term216580.getClass(), "date", term216581);
        setByteField(term216585, term216585.getClass(), "hour", (byte) 14);
        setByteField(term216585, term216585.getClass(), "minute", (byte) 21);
        setByteField(term216585, term216585.getClass(), "second", (byte) 41);
        setIntField(term216585, term216585.getClass(), "nano", 831066682);
        setField(term216580, term216580.getClass(), "time", term216585);
        setField(term216564, term216564.getClass(), "registerTime", term216580);
        setIntField(term216591, term216591.getClass(), "year", 2018);
        setShortField(term216591, term216591.getClass(), "month", (short) 12);
        setShortField(term216591, term216591.getClass(), "day", (short) 8);
        setField(term216590, term216590.getClass(), "date", term216591);
        setByteField(term216595, term216595.getClass(), "hour", (byte) 14);
        setByteField(term216595, term216595.getClass(), "minute", (byte) 50);
        setByteField(term216595, term216595.getClass(), "second", (byte) 10);
        setIntField(term216595, term216595.getClass(), "nano", 698726170);
        setField(term216590, term216590.getClass(), "time", term216595);
        setField(term216564, term216564.getClass(), "accessTime", term216590);
        setField(term216562, term216562.getClass(), "card", term216564);
        setField(term216562, term216562.getClass(), "userName", "PxmOkaAbkD");
        setIntField(term216562, term216562.getClass(), "isNetMember", 1477888487);
        setIntField(term216562, term216562.getClass(), "iconId", -960025607);
        setIntField(term216562, term216562.getClass(), "plateId", -610981578);
        setIntField(term216562, term216562.getClass(), "titleId", -63470209);
        setIntField(term216562, term216562.getClass(), "partnerId", -466622881);
        setIntField(term216562, term216562.getClass(), "frameId", 1191081545);
        setIntField(term216562, term216562.getClass(), "selectMapId", 1005504997);
        setIntField(term216562, term216562.getClass(), "totalAwake", -1900158526);
        setIntField(term216562, term216562.getClass(), "gradeRating", -1670882565);
        setIntField(term216562, term216562.getClass(), "musicRating", -1505581092);
        setIntField(term216562, term216562.getClass(), "playerRating", 547730411);
        setIntField(term216562, term216562.getClass(), "highestRating", 352716947);
        setIntField(term216562, term216562.getClass(), "gradeRank", 1942797432);
        setIntField(term216562, term216562.getClass(), "classRank", -190935358);
        setIntField(term216562, term216562.getClass(), "courseRank", -1392130122);
        setField(term216562, term216562.getClass(), "charaSlot", term216627);
        setField(term216562, term216562.getClass(), "charaLockSlot", term216635);
        setLongField(term216562, term216562.getClass(), "contentBit", 3950055695438813172L);
        setIntField(term216562, term216562.getClass(), "playCount", 152610093);
        setField(term216562, term216562.getClass(), "eventWatchedDate", "HydtLkUggc");
        setField(term216562, term216562.getClass(), "lastGameId", "xqFhlNGPNf");
        setField(term216562, term216562.getClass(), "lastRomVersion", "inJfaygIHT");
        setField(term216562, term216562.getClass(), "lastDataVersion", "LSmdmNXNmK");
        setField(term216562, term216562.getClass(), "lastLoginDate", "ouSqIuBxkU");
        setField(term216562, term216562.getClass(), "lastPlayDate", "PIskQzLbQC");
        setIntField(term216562, term216562.getClass(), "lastPlayCredit", -1115692502);
        setIntField(term216562, term216562.getClass(), "lastPlayMode", -128305422);
        setIntField(term216562, term216562.getClass(), "lastPlaceId", -1647436228);
        setField(term216562, term216562.getClass(), "lastPlaceName", "WCPEcCgFoc");
        setIntField(term216562, term216562.getClass(), "lastAllNetId", 601867451);
        setIntField(term216562, term216562.getClass(), "lastRegionId", -241946575);
        setField(term216562, term216562.getClass(), "lastRegionName", "blPfauFjyv");
        setField(term216562, term216562.getClass(), "lastClientId", "aOmbiqwZmO");
        setField(term216562, term216562.getClass(), "lastCountryCode", "netNaxYVrg");
        setIntField(term216562, term216562.getClass(), "lastSelectEMoney", -1223017876);
        setIntField(term216562, term216562.getClass(), "lastSelectTicket", -424247215);
        setIntField(term216562, term216562.getClass(), "lastSelectCourse", 832576798);
        setIntField(term216562, term216562.getClass(), "lastCountCourse", 1324536041);
        setField(term216562, term216562.getClass(), "firstGameId", "XWUTqAyuzX");
        setField(term216562, term216562.getClass(), "firstRomVersion", "MlpwpDqxJh");
        setField(term216562, term216562.getClass(), "firstDataVersion", "uRSkQPTqHT");
        setField(term216562, term216562.getClass(), "firstPlayDate", "aqOjPWQHVj");
        setField(term216562, term216562.getClass(), "compatibleCmVersion", "oHxEQPShRZ");
        setField(term216562, term216562.getClass(), "dailyBonusDate", "kbHGRhfzpJ");
        setField(term216562, term216562.getClass(), "dailyCourseBonusDate", "fzmlaqqlVL");
        setField(term216562, term216562.getClass(), "lastPairLoginDate", "pNqXqMrFlN");
        setField(term216562, term216562.getClass(), "lastTrialPlayDate", "jlbLKlLQqw");
        setIntField(term216562, term216562.getClass(), "playVsCount", -1310625886);
        setIntField(term216562, term216562.getClass(), "playSyncCount", 1040482108);
        setIntField(term216562, term216562.getClass(), "winCount", 1962507245);
        setIntField(term216562, term216562.getClass(), "helpCount", 905482662);
        setIntField(term216562, term216562.getClass(), "comboCount", -166421996);
        setLongField(term216562, term216562.getClass(), "totalDeluxscore", 4680259969871678964L);
        setLongField(term216562, term216562.getClass(), "totalBasicDeluxscore", -8079535623511099869L);
        setLongField(term216562, term216562.getClass(), "totalAdvancedDeluxscore", 6213783664737876106L);
        setLongField(term216562, term216562.getClass(), "totalExpertDeluxscore", 2941511442376352105L);
        setLongField(term216562, term216562.getClass(), "totalMasterDeluxscore", 8292155882032188482L);
        setLongField(term216562, term216562.getClass(), "totalReMasterDeluxscore", -2940506771296398549L);
        setIntField(term216562, term216562.getClass(), "totalSync", -1157561721);
        setIntField(term216562, term216562.getClass(), "totalBasicSync", 1406181821);
        setIntField(term216562, term216562.getClass(), "totalAdvancedSync", -38316383);
        setIntField(term216562, term216562.getClass(), "totalExpertSync", 896926009);
        setIntField(term216562, term216562.getClass(), "totalMasterSync", -405250282);
        setIntField(term216562, term216562.getClass(), "totalReMasterSync", -421196383);
        setLongField(term216562, term216562.getClass(), "totalAchievement", 2939024897212707706L);
        setLongField(term216562, term216562.getClass(), "totalBasicAchievement", -3659857262692638404L);
        setLongField(term216562, term216562.getClass(), "totalAdvancedAchievement", 6836079585650107676L);
        setLongField(term216562, term216562.getClass(), "totalExpertAchievement", 8848500472054344868L);
        setLongField(term216562, term216562.getClass(), "totalMasterAchievement", -9012690193533322497L);
        setLongField(term216562, term216562.getClass(), "totalReMasterAchievement", 4804149465943210147L);
        setLongField(term216562, term216562.getClass(), "playerOldRating", -713771074791912819L);
        setLongField(term216562, term216562.getClass(), "playerNewRating", 3753828460538899957L);
        setIntField(term216562, term216562.getClass(), "banState", -1052354004);
        setLongField(term216562, term216562.getClass(), "dateTime", 2236842408211489701L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastSelectEMoney", argTypes, term216562, args);
    }

};


