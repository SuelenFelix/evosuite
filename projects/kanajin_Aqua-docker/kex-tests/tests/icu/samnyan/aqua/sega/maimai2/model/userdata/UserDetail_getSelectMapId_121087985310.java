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

public class UserDetail_getSelectMapId_121087985310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200732;

    public UserDetail_getSelectMapId_121087985310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term200736 = new Long(8765880103547975810L);
        Integer term200799 = new Integer(-97640679);
        Integer term200801 = new Integer(1484085042);
        Integer term200803 = new Integer(1777726456);
        Integer term200805 = new Integer(-1376824764);
        Integer term200807 = new Integer(-1173622754);
        ArrayList term200797 = new ArrayList();
        ((ArrayList) term200797).add(term200799);
        ((ArrayList) term200797).add(term200801);
        ((ArrayList) term200797).add(term200803);
        ((ArrayList) term200797).add(term200805);
        ((ArrayList) term200797).add(term200807);
        Integer term200813 = new Integer(-654564305);
        Integer term200815 = new Integer(-1985017499);
        Integer term200817 = new Integer(1959598890);
        Integer term200819 = new Integer(-920963609);
        ArrayList term200811 = new ArrayList();
        ((ArrayList) term200811).add(term200813);
        ((ArrayList) term200811).add(term200815);
        ((ArrayList) term200811).add(term200817);
        ((ArrayList) term200811).add(term200819);
        term200732 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term200734 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term200750 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term200751 = newInstance(Class.forName("java.time.LocalDate"));
        Object term200755 = newInstance(Class.forName("java.time.LocalTime"));
        Object term200760 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term200761 = newInstance(Class.forName("java.time.LocalDate"));
        Object term200765 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term200732, term200732.getClass(), "id", 2639211404788643317L);
        setLongField(term200734, term200734.getClass(), "id", -3986523968546940861L);
        setField(term200734, term200734.getClass(), "extId", term200736);
        setField(term200734, term200734.getClass(), "luid", "gKIhwGzXgE");
        setIntField(term200751, term200751.getClass(), "year", 2026);
        setShortField(term200751, term200751.getClass(), "month", (short) 11);
        setShortField(term200751, term200751.getClass(), "day", (short) 15);
        setField(term200750, term200750.getClass(), "date", term200751);
        setByteField(term200755, term200755.getClass(), "hour", (byte) 8);
        setByteField(term200755, term200755.getClass(), "minute", (byte) 24);
        setByteField(term200755, term200755.getClass(), "second", (byte) 53);
        setIntField(term200755, term200755.getClass(), "nano", 2108775);
        setField(term200750, term200750.getClass(), "time", term200755);
        setField(term200734, term200734.getClass(), "registerTime", term200750);
        setIntField(term200761, term200761.getClass(), "year", 2012);
        setShortField(term200761, term200761.getClass(), "month", (short) 5);
        setShortField(term200761, term200761.getClass(), "day", (short) 8);
        setField(term200760, term200760.getClass(), "date", term200761);
        setByteField(term200765, term200765.getClass(), "hour", (byte) 9);
        setByteField(term200765, term200765.getClass(), "minute", (byte) 56);
        setByteField(term200765, term200765.getClass(), "second", (byte) 42);
        setIntField(term200765, term200765.getClass(), "nano", 128569906);
        setField(term200760, term200760.getClass(), "time", term200765);
        setField(term200734, term200734.getClass(), "accessTime", term200760);
        setField(term200732, term200732.getClass(), "card", term200734);
        setField(term200732, term200732.getClass(), "userName", "leVwCLkoTR");
        setIntField(term200732, term200732.getClass(), "isNetMember", -1303194402);
        setIntField(term200732, term200732.getClass(), "iconId", -1332211856);
        setIntField(term200732, term200732.getClass(), "plateId", 213669888);
        setIntField(term200732, term200732.getClass(), "titleId", -1050684350);
        setIntField(term200732, term200732.getClass(), "partnerId", 1871723856);
        setIntField(term200732, term200732.getClass(), "frameId", -159300758);
        setIntField(term200732, term200732.getClass(), "selectMapId", 478919523);
        setIntField(term200732, term200732.getClass(), "totalAwake", -922902226);
        setIntField(term200732, term200732.getClass(), "gradeRating", -2136789857);
        setIntField(term200732, term200732.getClass(), "musicRating", 2107900783);
        setIntField(term200732, term200732.getClass(), "playerRating", 2014990351);
        setIntField(term200732, term200732.getClass(), "highestRating", 1711544909);
        setIntField(term200732, term200732.getClass(), "gradeRank", -257220805);
        setIntField(term200732, term200732.getClass(), "classRank", -32183821);
        setIntField(term200732, term200732.getClass(), "courseRank", 391771406);
        setField(term200732, term200732.getClass(), "charaSlot", term200797);
        setField(term200732, term200732.getClass(), "charaLockSlot", term200811);
        setLongField(term200732, term200732.getClass(), "contentBit", 2040798244583969156L);
        setIntField(term200732, term200732.getClass(), "playCount", 930395359);
        setField(term200732, term200732.getClass(), "eventWatchedDate", "EqQumiDCCr");
        setField(term200732, term200732.getClass(), "lastGameId", "ikcbldtizU");
        setField(term200732, term200732.getClass(), "lastRomVersion", "FtzAOfSRqB");
        setField(term200732, term200732.getClass(), "lastDataVersion", "wBlgBAWnHQ");
        setField(term200732, term200732.getClass(), "lastLoginDate", "hhGEkwjfPE");
        setField(term200732, term200732.getClass(), "lastPlayDate", "yopXbQQlPz");
        setIntField(term200732, term200732.getClass(), "lastPlayCredit", 510293262);
        setIntField(term200732, term200732.getClass(), "lastPlayMode", -71096217);
        setIntField(term200732, term200732.getClass(), "lastPlaceId", -1809406090);
        setField(term200732, term200732.getClass(), "lastPlaceName", "FJROuqPTEM");
        setIntField(term200732, term200732.getClass(), "lastAllNetId", -1783195316);
        setIntField(term200732, term200732.getClass(), "lastRegionId", -1932630543);
        setField(term200732, term200732.getClass(), "lastRegionName", "vgJzVBzfnf");
        setField(term200732, term200732.getClass(), "lastClientId", "TGtWGLIjKE");
        setField(term200732, term200732.getClass(), "lastCountryCode", "xtQvEPuLEO");
        setIntField(term200732, term200732.getClass(), "lastSelectEMoney", -1460939623);
        setIntField(term200732, term200732.getClass(), "lastSelectTicket", 1024871937);
        setIntField(term200732, term200732.getClass(), "lastSelectCourse", 1248282915);
        setIntField(term200732, term200732.getClass(), "lastCountCourse", 530401633);
        setField(term200732, term200732.getClass(), "firstGameId", "YhsQVJrDAO");
        setField(term200732, term200732.getClass(), "firstRomVersion", "buYyPaeFwG");
        setField(term200732, term200732.getClass(), "firstDataVersion", "JKgRRYHsFz");
        setField(term200732, term200732.getClass(), "firstPlayDate", "lReRMSdEjP");
        setField(term200732, term200732.getClass(), "compatibleCmVersion", "EyNabEtqKt");
        setField(term200732, term200732.getClass(), "dailyBonusDate", "nAQefeKYxB");
        setField(term200732, term200732.getClass(), "dailyCourseBonusDate", "kKddBtVsSD");
        setField(term200732, term200732.getClass(), "lastPairLoginDate", "yxIScJPqjr");
        setField(term200732, term200732.getClass(), "lastTrialPlayDate", "emjMEFGuQe");
        setIntField(term200732, term200732.getClass(), "playVsCount", -2102777765);
        setIntField(term200732, term200732.getClass(), "playSyncCount", 994126300);
        setIntField(term200732, term200732.getClass(), "winCount", -1753144993);
        setIntField(term200732, term200732.getClass(), "helpCount", -829086350);
        setIntField(term200732, term200732.getClass(), "comboCount", 1784256355);
        setLongField(term200732, term200732.getClass(), "totalDeluxscore", -6822217640569799687L);
        setLongField(term200732, term200732.getClass(), "totalBasicDeluxscore", 1075530383686298757L);
        setLongField(term200732, term200732.getClass(), "totalAdvancedDeluxscore", 4250412912426613100L);
        setLongField(term200732, term200732.getClass(), "totalExpertDeluxscore", 5159190121161740282L);
        setLongField(term200732, term200732.getClass(), "totalMasterDeluxscore", -8519906009423347259L);
        setLongField(term200732, term200732.getClass(), "totalReMasterDeluxscore", -6489651937391409571L);
        setIntField(term200732, term200732.getClass(), "totalSync", 1725956287);
        setIntField(term200732, term200732.getClass(), "totalBasicSync", -84853525);
        setIntField(term200732, term200732.getClass(), "totalAdvancedSync", -546326269);
        setIntField(term200732, term200732.getClass(), "totalExpertSync", 2053693297);
        setIntField(term200732, term200732.getClass(), "totalMasterSync", -1629858755);
        setIntField(term200732, term200732.getClass(), "totalReMasterSync", 357202791);
        setLongField(term200732, term200732.getClass(), "totalAchievement", 508850698309860517L);
        setLongField(term200732, term200732.getClass(), "totalBasicAchievement", -4869654863013458132L);
        setLongField(term200732, term200732.getClass(), "totalAdvancedAchievement", 4316236036287549765L);
        setLongField(term200732, term200732.getClass(), "totalExpertAchievement", -5350794827033786712L);
        setLongField(term200732, term200732.getClass(), "totalMasterAchievement", 69036866501516766L);
        setLongField(term200732, term200732.getClass(), "totalReMasterAchievement", 3411697775536637400L);
        setLongField(term200732, term200732.getClass(), "playerOldRating", 8263542389347483980L);
        setLongField(term200732, term200732.getClass(), "playerNewRating", -9056977522310889772L);
        setIntField(term200732, term200732.getClass(), "banState", 752907570);
        setLongField(term200732, term200732.getClass(), "dateTime", -1530333245013304595L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectMapId", argTypes, term200732, args);
    }

};


