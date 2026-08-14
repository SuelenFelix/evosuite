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

public class UserDetail_getSelectMapId_12108798539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200677;

    public UserDetail_getSelectMapId_12108798539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term200681 = new Long(8765880103547975810L);
        Integer term200744 = new Integer(-97640679);
        Integer term200746 = new Integer(1484085042);
        Integer term200748 = new Integer(1777726456);
        Integer term200750 = new Integer(-1376824764);
        Integer term200752 = new Integer(-1173622754);
        ArrayList term200742 = new ArrayList();
        ((ArrayList) term200742).add(term200744);
        ((ArrayList) term200742).add(term200746);
        ((ArrayList) term200742).add(term200748);
        ((ArrayList) term200742).add(term200750);
        ((ArrayList) term200742).add(term200752);
        Integer term200758 = new Integer(-654564305);
        Integer term200760 = new Integer(-1985017499);
        Integer term200762 = new Integer(1959598890);
        Integer term200764 = new Integer(-920963609);
        ArrayList term200756 = new ArrayList();
        ((ArrayList) term200756).add(term200758);
        ((ArrayList) term200756).add(term200760);
        ((ArrayList) term200756).add(term200762);
        ((ArrayList) term200756).add(term200764);
        term200677 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term200679 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term200695 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term200696 = newInstance(Class.forName("java.time.LocalDate"));
        Object term200700 = newInstance(Class.forName("java.time.LocalTime"));
        Object term200705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term200706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term200710 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term200677, term200677.getClass(), "id", 2639211404788643317L);
        setLongField(term200679, term200679.getClass(), "id", -3986523968546940861L);
        setField(term200679, term200679.getClass(), "extId", term200681);
        setField(term200679, term200679.getClass(), "luid", "gKIhwGzXgE");
        setIntField(term200696, term200696.getClass(), "year", 2026);
        setShortField(term200696, term200696.getClass(), "month", (short) 11);
        setShortField(term200696, term200696.getClass(), "day", (short) 15);
        setField(term200695, term200695.getClass(), "date", term200696);
        setByteField(term200700, term200700.getClass(), "hour", (byte) 8);
        setByteField(term200700, term200700.getClass(), "minute", (byte) 24);
        setByteField(term200700, term200700.getClass(), "second", (byte) 53);
        setIntField(term200700, term200700.getClass(), "nano", 2108775);
        setField(term200695, term200695.getClass(), "time", term200700);
        setField(term200679, term200679.getClass(), "registerTime", term200695);
        setIntField(term200706, term200706.getClass(), "year", 2012);
        setShortField(term200706, term200706.getClass(), "month", (short) 5);
        setShortField(term200706, term200706.getClass(), "day", (short) 8);
        setField(term200705, term200705.getClass(), "date", term200706);
        setByteField(term200710, term200710.getClass(), "hour", (byte) 9);
        setByteField(term200710, term200710.getClass(), "minute", (byte) 56);
        setByteField(term200710, term200710.getClass(), "second", (byte) 42);
        setIntField(term200710, term200710.getClass(), "nano", 128569906);
        setField(term200705, term200705.getClass(), "time", term200710);
        setField(term200679, term200679.getClass(), "accessTime", term200705);
        setField(term200677, term200677.getClass(), "card", term200679);
        setField(term200677, term200677.getClass(), "userName", "leVwCLkoTR");
        setIntField(term200677, term200677.getClass(), "isNetMember", -1303194402);
        setIntField(term200677, term200677.getClass(), "iconId", -1332211856);
        setIntField(term200677, term200677.getClass(), "plateId", 213669888);
        setIntField(term200677, term200677.getClass(), "titleId", -1050684350);
        setIntField(term200677, term200677.getClass(), "partnerId", 1871723856);
        setIntField(term200677, term200677.getClass(), "frameId", -159300758);
        setIntField(term200677, term200677.getClass(), "selectMapId", 478919523);
        setIntField(term200677, term200677.getClass(), "totalAwake", -922902226);
        setIntField(term200677, term200677.getClass(), "gradeRating", -2136789857);
        setIntField(term200677, term200677.getClass(), "musicRating", 2107900783);
        setIntField(term200677, term200677.getClass(), "playerRating", 2014990351);
        setIntField(term200677, term200677.getClass(), "highestRating", 1711544909);
        setIntField(term200677, term200677.getClass(), "gradeRank", -257220805);
        setIntField(term200677, term200677.getClass(), "classRank", -32183821);
        setIntField(term200677, term200677.getClass(), "courseRank", 391771406);
        setField(term200677, term200677.getClass(), "charaSlot", term200742);
        setField(term200677, term200677.getClass(), "charaLockSlot", term200756);
        setLongField(term200677, term200677.getClass(), "contentBit", 2040798244583969156L);
        setIntField(term200677, term200677.getClass(), "playCount", 930395359);
        setField(term200677, term200677.getClass(), "eventWatchedDate", "EqQumiDCCr");
        setField(term200677, term200677.getClass(), "lastGameId", "ikcbldtizU");
        setField(term200677, term200677.getClass(), "lastRomVersion", "FtzAOfSRqB");
        setField(term200677, term200677.getClass(), "lastDataVersion", "wBlgBAWnHQ");
        setField(term200677, term200677.getClass(), "lastLoginDate", "hhGEkwjfPE");
        setField(term200677, term200677.getClass(), "lastPlayDate", "yopXbQQlPz");
        setIntField(term200677, term200677.getClass(), "lastPlayCredit", 510293262);
        setIntField(term200677, term200677.getClass(), "lastPlayMode", -71096217);
        setIntField(term200677, term200677.getClass(), "lastPlaceId", -1809406090);
        setField(term200677, term200677.getClass(), "lastPlaceName", "FJROuqPTEM");
        setIntField(term200677, term200677.getClass(), "lastAllNetId", -1783195316);
        setIntField(term200677, term200677.getClass(), "lastRegionId", -1932630543);
        setField(term200677, term200677.getClass(), "lastRegionName", "vgJzVBzfnf");
        setField(term200677, term200677.getClass(), "lastClientId", "TGtWGLIjKE");
        setField(term200677, term200677.getClass(), "lastCountryCode", "xtQvEPuLEO");
        setIntField(term200677, term200677.getClass(), "lastSelectEMoney", -1460939623);
        setIntField(term200677, term200677.getClass(), "lastSelectTicket", 1024871937);
        setIntField(term200677, term200677.getClass(), "lastSelectCourse", 1248282915);
        setIntField(term200677, term200677.getClass(), "lastCountCourse", 530401633);
        setField(term200677, term200677.getClass(), "firstGameId", "YhsQVJrDAO");
        setField(term200677, term200677.getClass(), "firstRomVersion", "buYyPaeFwG");
        setField(term200677, term200677.getClass(), "firstDataVersion", "JKgRRYHsFz");
        setField(term200677, term200677.getClass(), "firstPlayDate", "lReRMSdEjP");
        setField(term200677, term200677.getClass(), "compatibleCmVersion", "EyNabEtqKt");
        setField(term200677, term200677.getClass(), "dailyBonusDate", "nAQefeKYxB");
        setField(term200677, term200677.getClass(), "dailyCourseBonusDate", "kKddBtVsSD");
        setField(term200677, term200677.getClass(), "lastPairLoginDate", "yxIScJPqjr");
        setField(term200677, term200677.getClass(), "lastTrialPlayDate", "emjMEFGuQe");
        setIntField(term200677, term200677.getClass(), "playVsCount", -2102777765);
        setIntField(term200677, term200677.getClass(), "playSyncCount", 994126300);
        setIntField(term200677, term200677.getClass(), "winCount", -1753144993);
        setIntField(term200677, term200677.getClass(), "helpCount", -829086350);
        setIntField(term200677, term200677.getClass(), "comboCount", 1784256355);
        setLongField(term200677, term200677.getClass(), "totalDeluxscore", -6822217640569799687L);
        setLongField(term200677, term200677.getClass(), "totalBasicDeluxscore", 1075530383686298757L);
        setLongField(term200677, term200677.getClass(), "totalAdvancedDeluxscore", 4250412912426613100L);
        setLongField(term200677, term200677.getClass(), "totalExpertDeluxscore", 5159190121161740282L);
        setLongField(term200677, term200677.getClass(), "totalMasterDeluxscore", -8519906009423347259L);
        setLongField(term200677, term200677.getClass(), "totalReMasterDeluxscore", -6489651937391409571L);
        setIntField(term200677, term200677.getClass(), "totalSync", 1725956287);
        setIntField(term200677, term200677.getClass(), "totalBasicSync", -84853525);
        setIntField(term200677, term200677.getClass(), "totalAdvancedSync", -546326269);
        setIntField(term200677, term200677.getClass(), "totalExpertSync", 2053693297);
        setIntField(term200677, term200677.getClass(), "totalMasterSync", -1629858755);
        setIntField(term200677, term200677.getClass(), "totalReMasterSync", 357202791);
        setLongField(term200677, term200677.getClass(), "totalAchievement", 508850698309860517L);
        setLongField(term200677, term200677.getClass(), "totalBasicAchievement", -4869654863013458132L);
        setLongField(term200677, term200677.getClass(), "totalAdvancedAchievement", 4316236036287549765L);
        setLongField(term200677, term200677.getClass(), "totalExpertAchievement", -5350794827033786712L);
        setLongField(term200677, term200677.getClass(), "totalMasterAchievement", 69036866501516766L);
        setLongField(term200677, term200677.getClass(), "totalReMasterAchievement", 3411697775536637400L);
        setLongField(term200677, term200677.getClass(), "playerOldRating", 8263542389347483980L);
        setLongField(term200677, term200677.getClass(), "playerNewRating", -9056977522310889772L);
        setIntField(term200677, term200677.getClass(), "banState", 752907570);
        setLongField(term200677, term200677.getClass(), "dateTime", -1530333245013304595L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectMapId", argTypes, term200677, args);
    }

};


