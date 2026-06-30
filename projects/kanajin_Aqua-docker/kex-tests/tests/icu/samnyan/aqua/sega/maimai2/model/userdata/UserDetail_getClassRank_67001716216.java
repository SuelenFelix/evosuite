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

public class UserDetail_getClassRank_67001716216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4238564;

    public UserDetail_getClassRank_67001716216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4238568 = new Long(8571899324184902990L);
        Integer term4238631 = new Integer(-1572119625);
        Integer term4238633 = new Integer(248535854);
        Integer term4238635 = new Integer(-1512718729);
        Integer term4238637 = new Integer(-1550333717);
        ArrayList term4238629 = new ArrayList();
        ((ArrayList) term4238629).add(term4238631);
        ((ArrayList) term4238629).add(term4238633);
        ((ArrayList) term4238629).add(term4238635);
        ((ArrayList) term4238629).add(term4238637);
        Integer term4238643 = new Integer(1700458639);
        Integer term4238645 = new Integer(2109100178);
        ArrayList term4238641 = new ArrayList();
        ((ArrayList) term4238641).add(term4238643);
        ((ArrayList) term4238641).add(term4238645);
        term4238564 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4238566 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4238582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4238583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4238587 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4238592 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4238593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4238597 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4238564, term4238564.getClass(), "id", 7706348540523454989L);
        setLongField(term4238566, term4238566.getClass(), "id", -7700010337819497511L);
        setField(term4238566, term4238566.getClass(), "extId", term4238568);
        setField(term4238566, term4238566.getClass(), "luid", "uRTPJMPsYb");
        setIntField(term4238583, term4238583.getClass(), "year", 2014);
        setShortField(term4238583, term4238583.getClass(), "month", (short) 10);
        setShortField(term4238583, term4238583.getClass(), "day", (short) 1);
        setField(term4238582, term4238582.getClass(), "date", term4238583);
        setByteField(term4238587, term4238587.getClass(), "hour", (byte) 2);
        setByteField(term4238587, term4238587.getClass(), "minute", (byte) 22);
        setByteField(term4238587, term4238587.getClass(), "second", (byte) 47);
        setIntField(term4238587, term4238587.getClass(), "nano", 141632097);
        setField(term4238582, term4238582.getClass(), "time", term4238587);
        setField(term4238566, term4238566.getClass(), "registerTime", term4238582);
        setIntField(term4238593, term4238593.getClass(), "year", 2013);
        setShortField(term4238593, term4238593.getClass(), "month", (short) 7);
        setShortField(term4238593, term4238593.getClass(), "day", (short) 10);
        setField(term4238592, term4238592.getClass(), "date", term4238593);
        setByteField(term4238597, term4238597.getClass(), "hour", (byte) 15);
        setByteField(term4238597, term4238597.getClass(), "minute", (byte) 5);
        setByteField(term4238597, term4238597.getClass(), "second", (byte) 8);
        setIntField(term4238597, term4238597.getClass(), "nano", 726654394);
        setField(term4238592, term4238592.getClass(), "time", term4238597);
        setField(term4238566, term4238566.getClass(), "accessTime", term4238592);
        setField(term4238564, term4238564.getClass(), "card", term4238566);
        setField(term4238564, term4238564.getClass(), "userName", "dFeLqkYJnr");
        setIntField(term4238564, term4238564.getClass(), "isNetMember", -757927073);
        setIntField(term4238564, term4238564.getClass(), "iconId", 655956733);
        setIntField(term4238564, term4238564.getClass(), "plateId", -1387823181);
        setIntField(term4238564, term4238564.getClass(), "titleId", 832442283);
        setIntField(term4238564, term4238564.getClass(), "partnerId", 1251581464);
        setIntField(term4238564, term4238564.getClass(), "frameId", -249607351);
        setIntField(term4238564, term4238564.getClass(), "selectMapId", -1256984417);
        setIntField(term4238564, term4238564.getClass(), "totalAwake", -1502371801);
        setIntField(term4238564, term4238564.getClass(), "gradeRating", 95885277);
        setIntField(term4238564, term4238564.getClass(), "musicRating", 824261203);
        setIntField(term4238564, term4238564.getClass(), "playerRating", 180330537);
        setIntField(term4238564, term4238564.getClass(), "highestRating", -1483551353);
        setIntField(term4238564, term4238564.getClass(), "gradeRank", 169148680);
        setIntField(term4238564, term4238564.getClass(), "classRank", -1942019784);
        setIntField(term4238564, term4238564.getClass(), "courseRank", 291919383);
        setField(term4238564, term4238564.getClass(), "charaSlot", term4238629);
        setField(term4238564, term4238564.getClass(), "charaLockSlot", term4238641);
        setLongField(term4238564, term4238564.getClass(), "contentBit", -9188376296099892340L);
        setIntField(term4238564, term4238564.getClass(), "playCount", 1120252393);
        setField(term4238564, term4238564.getClass(), "eventWatchedDate", "RrdXCVpBKP");
        setField(term4238564, term4238564.getClass(), "lastGameId", "MUXFUXQMnI");
        setField(term4238564, term4238564.getClass(), "lastRomVersion", "sXmYPtdBTG");
        setField(term4238564, term4238564.getClass(), "lastDataVersion", "KFRebEPfuG");
        setField(term4238564, term4238564.getClass(), "lastLoginDate", "HyEoqTVIeT");
        setField(term4238564, term4238564.getClass(), "lastPlayDate", "UkNnXjkZaE");
        setIntField(term4238564, term4238564.getClass(), "lastPlayCredit", 321358637);
        setIntField(term4238564, term4238564.getClass(), "lastPlayMode", 390489189);
        setIntField(term4238564, term4238564.getClass(), "lastPlaceId", 1987948947);
        setField(term4238564, term4238564.getClass(), "lastPlaceName", "FXqaOuspjm");
        setIntField(term4238564, term4238564.getClass(), "lastAllNetId", -1517932901);
        setIntField(term4238564, term4238564.getClass(), "lastRegionId", 540945023);
        setField(term4238564, term4238564.getClass(), "lastRegionName", "wVKXsbppJN");
        setField(term4238564, term4238564.getClass(), "lastClientId", "MdTptXcEKk");
        setField(term4238564, term4238564.getClass(), "lastCountryCode", "nNCVncBnxL");
        setIntField(term4238564, term4238564.getClass(), "lastSelectEMoney", -1365445850);
        setIntField(term4238564, term4238564.getClass(), "lastSelectTicket", -1923361998);
        setIntField(term4238564, term4238564.getClass(), "lastSelectCourse", 1170466764);
        setIntField(term4238564, term4238564.getClass(), "lastCountCourse", -756844174);
        setField(term4238564, term4238564.getClass(), "firstGameId", "HjpYnSpylt");
        setField(term4238564, term4238564.getClass(), "firstRomVersion", "VyBCznyWpy");
        setField(term4238564, term4238564.getClass(), "firstDataVersion", "ksWgOYJNNR");
        setField(term4238564, term4238564.getClass(), "firstPlayDate", "KlyCjlvnHt");
        setField(term4238564, term4238564.getClass(), "compatibleCmVersion", "mEjrluFJFq");
        setField(term4238564, term4238564.getClass(), "dailyBonusDate", "SwCQnPtQlT");
        setField(term4238564, term4238564.getClass(), "dailyCourseBonusDate", "DVepquAqJb");
        setField(term4238564, term4238564.getClass(), "lastPairLoginDate", "hHTGhthCJM");
        setField(term4238564, term4238564.getClass(), "lastTrialPlayDate", "TlAUZkHVzF");
        setIntField(term4238564, term4238564.getClass(), "playVsCount", 1590332540);
        setIntField(term4238564, term4238564.getClass(), "playSyncCount", 1894785842);
        setIntField(term4238564, term4238564.getClass(), "winCount", -27146362);
        setIntField(term4238564, term4238564.getClass(), "helpCount", -1528483166);
        setIntField(term4238564, term4238564.getClass(), "comboCount", -1500447438);
        setLongField(term4238564, term4238564.getClass(), "totalDeluxscore", -4278431431331605708L);
        setLongField(term4238564, term4238564.getClass(), "totalBasicDeluxscore", 5730330216921483741L);
        setLongField(term4238564, term4238564.getClass(), "totalAdvancedDeluxscore", 7776090397997138599L);
        setLongField(term4238564, term4238564.getClass(), "totalExpertDeluxscore", 5972078281796009226L);
        setLongField(term4238564, term4238564.getClass(), "totalMasterDeluxscore", 6311431230001496645L);
        setLongField(term4238564, term4238564.getClass(), "totalReMasterDeluxscore", -1134045240510638968L);
        setIntField(term4238564, term4238564.getClass(), "totalSync", -2108966909);
        setIntField(term4238564, term4238564.getClass(), "totalBasicSync", 1964260315);
        setIntField(term4238564, term4238564.getClass(), "totalAdvancedSync", 1674011890);
        setIntField(term4238564, term4238564.getClass(), "totalExpertSync", -788419790);
        setIntField(term4238564, term4238564.getClass(), "totalMasterSync", 1751851272);
        setIntField(term4238564, term4238564.getClass(), "totalReMasterSync", 875078750);
        setLongField(term4238564, term4238564.getClass(), "totalAchievement", 6168554465806573154L);
        setLongField(term4238564, term4238564.getClass(), "totalBasicAchievement", 1095820878108110197L);
        setLongField(term4238564, term4238564.getClass(), "totalAdvancedAchievement", 4951665394941968762L);
        setLongField(term4238564, term4238564.getClass(), "totalExpertAchievement", 3419849468699509024L);
        setLongField(term4238564, term4238564.getClass(), "totalMasterAchievement", 8401383976902477905L);
        setLongField(term4238564, term4238564.getClass(), "totalReMasterAchievement", -747965632432877618L);
        setLongField(term4238564, term4238564.getClass(), "playerOldRating", 2345989343027950682L);
        setLongField(term4238564, term4238564.getClass(), "playerNewRating", -7859357489929014341L);
        setIntField(term4238564, term4238564.getClass(), "banState", -705411592);
        setLongField(term4238564, term4238564.getClass(), "dateTime", -6885053213634764708L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassRank", argTypes, term4238564, args);
    }

};


