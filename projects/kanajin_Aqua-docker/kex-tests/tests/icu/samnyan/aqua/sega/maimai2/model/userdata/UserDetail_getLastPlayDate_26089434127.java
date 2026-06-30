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

public class UserDetail_getLastPlayDate_26089434127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4244813;

    public UserDetail_getLastPlayDate_26089434127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4244817 = new Long(-873800016362220906L);
        Integer term4244880 = new Integer(502026234);
        Integer term4244882 = new Integer(-871479292);
        Integer term4244884 = new Integer(-1077764191);
        Integer term4244886 = new Integer(1374586510);
        Integer term4244888 = new Integer(-354597292);
        ArrayList term4244878 = new ArrayList();
        ((ArrayList) term4244878).add(term4244880);
        ((ArrayList) term4244878).add(term4244882);
        ((ArrayList) term4244878).add(term4244884);
        ((ArrayList) term4244878).add(term4244886);
        ((ArrayList) term4244878).add(term4244888);
        Integer term4244894 = new Integer(-581675259);
        Integer term4244896 = new Integer(-495803538);
        Integer term4244898 = new Integer(-168864726);
        Integer term4244900 = new Integer(970702834);
        Integer term4244902 = new Integer(-863293599);
        Integer term4244904 = new Integer(-416844310);
        Integer term4244906 = new Integer(-609565612);
        ArrayList term4244892 = new ArrayList();
        ((ArrayList) term4244892).add(term4244894);
        ((ArrayList) term4244892).add(term4244896);
        ((ArrayList) term4244892).add(term4244898);
        ((ArrayList) term4244892).add(term4244900);
        ((ArrayList) term4244892).add(term4244902);
        ((ArrayList) term4244892).add(term4244904);
        ((ArrayList) term4244892).add(term4244906);
        term4244813 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4244815 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4244831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4244832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4244836 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4244841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4244842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4244846 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4244813, term4244813.getClass(), "id", 5184638994530863080L);
        setLongField(term4244815, term4244815.getClass(), "id", 1973152721669502336L);
        setField(term4244815, term4244815.getClass(), "extId", term4244817);
        setField(term4244815, term4244815.getClass(), "luid", "VuAwGMWEaU");
        setIntField(term4244832, term4244832.getClass(), "year", 2028);
        setShortField(term4244832, term4244832.getClass(), "month", (short) 6);
        setShortField(term4244832, term4244832.getClass(), "day", (short) 30);
        setField(term4244831, term4244831.getClass(), "date", term4244832);
        setByteField(term4244836, term4244836.getClass(), "hour", (byte) 22);
        setByteField(term4244836, term4244836.getClass(), "minute", (byte) 50);
        setByteField(term4244836, term4244836.getClass(), "second", (byte) 52);
        setIntField(term4244836, term4244836.getClass(), "nano", 412343500);
        setField(term4244831, term4244831.getClass(), "time", term4244836);
        setField(term4244815, term4244815.getClass(), "registerTime", term4244831);
        setIntField(term4244842, term4244842.getClass(), "year", 2027);
        setShortField(term4244842, term4244842.getClass(), "month", (short) 5);
        setShortField(term4244842, term4244842.getClass(), "day", (short) 6);
        setField(term4244841, term4244841.getClass(), "date", term4244842);
        setByteField(term4244846, term4244846.getClass(), "hour", (byte) 5);
        setByteField(term4244846, term4244846.getClass(), "minute", (byte) 47);
        setByteField(term4244846, term4244846.getClass(), "second", (byte) 9);
        setIntField(term4244846, term4244846.getClass(), "nano", 781339088);
        setField(term4244841, term4244841.getClass(), "time", term4244846);
        setField(term4244815, term4244815.getClass(), "accessTime", term4244841);
        setField(term4244813, term4244813.getClass(), "card", term4244815);
        setField(term4244813, term4244813.getClass(), "userName", "PbURRvyYfq");
        setIntField(term4244813, term4244813.getClass(), "isNetMember", 1644719675);
        setIntField(term4244813, term4244813.getClass(), "iconId", 578928807);
        setIntField(term4244813, term4244813.getClass(), "plateId", 1548997475);
        setIntField(term4244813, term4244813.getClass(), "titleId", -1677396707);
        setIntField(term4244813, term4244813.getClass(), "partnerId", -1386268687);
        setIntField(term4244813, term4244813.getClass(), "frameId", -1941533147);
        setIntField(term4244813, term4244813.getClass(), "selectMapId", 1310923095);
        setIntField(term4244813, term4244813.getClass(), "totalAwake", -977799857);
        setIntField(term4244813, term4244813.getClass(), "gradeRating", 1012565650);
        setIntField(term4244813, term4244813.getClass(), "musicRating", 224826271);
        setIntField(term4244813, term4244813.getClass(), "playerRating", -1915140049);
        setIntField(term4244813, term4244813.getClass(), "highestRating", 2072743915);
        setIntField(term4244813, term4244813.getClass(), "gradeRank", 513687337);
        setIntField(term4244813, term4244813.getClass(), "classRank", 145533630);
        setIntField(term4244813, term4244813.getClass(), "courseRank", -1440925251);
        setField(term4244813, term4244813.getClass(), "charaSlot", term4244878);
        setField(term4244813, term4244813.getClass(), "charaLockSlot", term4244892);
        setLongField(term4244813, term4244813.getClass(), "contentBit", 5871909889157674276L);
        setIntField(term4244813, term4244813.getClass(), "playCount", -775340508);
        setField(term4244813, term4244813.getClass(), "eventWatchedDate", "sFtnfgLbPL");
        setField(term4244813, term4244813.getClass(), "lastGameId", "DhXwcxiJwX");
        setField(term4244813, term4244813.getClass(), "lastRomVersion", "cwTEaWamDY");
        setField(term4244813, term4244813.getClass(), "lastDataVersion", "kAYcrVayCS");
        setField(term4244813, term4244813.getClass(), "lastLoginDate", "PiuMcHHlTv");
        setField(term4244813, term4244813.getClass(), "lastPlayDate", "raFmSKRNVi");
        setIntField(term4244813, term4244813.getClass(), "lastPlayCredit", -440178574);
        setIntField(term4244813, term4244813.getClass(), "lastPlayMode", 893981186);
        setIntField(term4244813, term4244813.getClass(), "lastPlaceId", -1096181032);
        setField(term4244813, term4244813.getClass(), "lastPlaceName", "oWpUdOLiWM");
        setIntField(term4244813, term4244813.getClass(), "lastAllNetId", 337185260);
        setIntField(term4244813, term4244813.getClass(), "lastRegionId", -1715811628);
        setField(term4244813, term4244813.getClass(), "lastRegionName", "XYrutPlygx");
        setField(term4244813, term4244813.getClass(), "lastClientId", "nyKuoFBEey");
        setField(term4244813, term4244813.getClass(), "lastCountryCode", "ZXkviBBHVy");
        setIntField(term4244813, term4244813.getClass(), "lastSelectEMoney", 1433714589);
        setIntField(term4244813, term4244813.getClass(), "lastSelectTicket", 377491056);
        setIntField(term4244813, term4244813.getClass(), "lastSelectCourse", 1966830963);
        setIntField(term4244813, term4244813.getClass(), "lastCountCourse", 1990531981);
        setField(term4244813, term4244813.getClass(), "firstGameId", "uJYwdVjMpu");
        setField(term4244813, term4244813.getClass(), "firstRomVersion", "rgrahSLdaz");
        setField(term4244813, term4244813.getClass(), "firstDataVersion", "cYWCkjnAvr");
        setField(term4244813, term4244813.getClass(), "firstPlayDate", "yHfmWvnEhh");
        setField(term4244813, term4244813.getClass(), "compatibleCmVersion", "aWjMYzcKPL");
        setField(term4244813, term4244813.getClass(), "dailyBonusDate", "qHSldanNgt");
        setField(term4244813, term4244813.getClass(), "dailyCourseBonusDate", "EqGrxqlNQs");
        setField(term4244813, term4244813.getClass(), "lastPairLoginDate", "GZRbuftVNH");
        setField(term4244813, term4244813.getClass(), "lastTrialPlayDate", "zfBIeYqHDS");
        setIntField(term4244813, term4244813.getClass(), "playVsCount", 775716510);
        setIntField(term4244813, term4244813.getClass(), "playSyncCount", 1052962275);
        setIntField(term4244813, term4244813.getClass(), "winCount", -570698003);
        setIntField(term4244813, term4244813.getClass(), "helpCount", 1495672622);
        setIntField(term4244813, term4244813.getClass(), "comboCount", 436091474);
        setLongField(term4244813, term4244813.getClass(), "totalDeluxscore", -7250474144164485397L);
        setLongField(term4244813, term4244813.getClass(), "totalBasicDeluxscore", 4571772589747770068L);
        setLongField(term4244813, term4244813.getClass(), "totalAdvancedDeluxscore", -2393018613222563951L);
        setLongField(term4244813, term4244813.getClass(), "totalExpertDeluxscore", -8491277469240879840L);
        setLongField(term4244813, term4244813.getClass(), "totalMasterDeluxscore", 3501587820992892625L);
        setLongField(term4244813, term4244813.getClass(), "totalReMasterDeluxscore", -6509694350362162011L);
        setIntField(term4244813, term4244813.getClass(), "totalSync", 804928142);
        setIntField(term4244813, term4244813.getClass(), "totalBasicSync", 2097556632);
        setIntField(term4244813, term4244813.getClass(), "totalAdvancedSync", 77311818);
        setIntField(term4244813, term4244813.getClass(), "totalExpertSync", -1293607962);
        setIntField(term4244813, term4244813.getClass(), "totalMasterSync", -222456667);
        setIntField(term4244813, term4244813.getClass(), "totalReMasterSync", -92820227);
        setLongField(term4244813, term4244813.getClass(), "totalAchievement", -8184337328234685900L);
        setLongField(term4244813, term4244813.getClass(), "totalBasicAchievement", -2205680598081744523L);
        setLongField(term4244813, term4244813.getClass(), "totalAdvancedAchievement", 7862010987728333338L);
        setLongField(term4244813, term4244813.getClass(), "totalExpertAchievement", -9105796355020301726L);
        setLongField(term4244813, term4244813.getClass(), "totalMasterAchievement", 2295856884170235029L);
        setLongField(term4244813, term4244813.getClass(), "totalReMasterAchievement", 1555536961264911484L);
        setLongField(term4244813, term4244813.getClass(), "playerOldRating", 3868856163535569556L);
        setLongField(term4244813, term4244813.getClass(), "playerNewRating", -152082887218295081L);
        setIntField(term4244813, term4244813.getClass(), "banState", -268963990);
        setLongField(term4244813, term4244813.getClass(), "dateTime", -1617939266755785917L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term4244813, args);
    }

};


