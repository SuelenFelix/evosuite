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

public class UserDetail_getTotalBasicAchievement_72891240768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234024;

    public UserDetail_getTotalBasicAchievement_72891240768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234028 = new Long(-7423063312741500355L);
        Integer term234091 = new Integer(-1857786332);
        Integer term234093 = new Integer(1307491791);
        Integer term234095 = new Integer(445813516);
        Integer term234097 = new Integer(180030231);
        Integer term234099 = new Integer(645685543);
        Integer term234101 = new Integer(-704733432);
        Integer term234103 = new Integer(147233013);
        ArrayList term234089 = new ArrayList();
        ((ArrayList) term234089).add(term234091);
        ((ArrayList) term234089).add(term234093);
        ((ArrayList) term234089).add(term234095);
        ((ArrayList) term234089).add(term234097);
        ((ArrayList) term234089).add(term234099);
        ((ArrayList) term234089).add(term234101);
        ((ArrayList) term234089).add(term234103);
        Integer term234109 = new Integer(-828376022);
        Integer term234111 = new Integer(-1133227278);
        ArrayList term234107 = new ArrayList();
        ((ArrayList) term234107).add(term234109);
        ((ArrayList) term234107).add(term234111);
        term234024 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term234026 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term234042 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term234043 = newInstance(Class.forName("java.time.LocalDate"));
        Object term234047 = newInstance(Class.forName("java.time.LocalTime"));
        Object term234052 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term234053 = newInstance(Class.forName("java.time.LocalDate"));
        Object term234057 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term234024, term234024.getClass(), "id", -9166667637663056565L);
        setLongField(term234026, term234026.getClass(), "id", 9121959613346929090L);
        setField(term234026, term234026.getClass(), "extId", term234028);
        setField(term234026, term234026.getClass(), "luid", "NmhbsBItoX");
        setIntField(term234043, term234043.getClass(), "year", 2016);
        setShortField(term234043, term234043.getClass(), "month", (short) 6);
        setShortField(term234043, term234043.getClass(), "day", (short) 2);
        setField(term234042, term234042.getClass(), "date", term234043);
        setByteField(term234047, term234047.getClass(), "hour", (byte) 5);
        setByteField(term234047, term234047.getClass(), "minute", (byte) 24);
        setByteField(term234047, term234047.getClass(), "second", (byte) 28);
        setIntField(term234047, term234047.getClass(), "nano", 586692762);
        setField(term234042, term234042.getClass(), "time", term234047);
        setField(term234026, term234026.getClass(), "registerTime", term234042);
        setIntField(term234053, term234053.getClass(), "year", 2012);
        setShortField(term234053, term234053.getClass(), "month", (short) 3);
        setShortField(term234053, term234053.getClass(), "day", (short) 20);
        setField(term234052, term234052.getClass(), "date", term234053);
        setByteField(term234057, term234057.getClass(), "hour", (byte) 16);
        setByteField(term234057, term234057.getClass(), "minute", (byte) 41);
        setByteField(term234057, term234057.getClass(), "second", (byte) 13);
        setIntField(term234057, term234057.getClass(), "nano", 546552876);
        setField(term234052, term234052.getClass(), "time", term234057);
        setField(term234026, term234026.getClass(), "accessTime", term234052);
        setField(term234024, term234024.getClass(), "card", term234026);
        setField(term234024, term234024.getClass(), "userName", "mhLgHXafNK");
        setIntField(term234024, term234024.getClass(), "isNetMember", 1220247325);
        setIntField(term234024, term234024.getClass(), "iconId", 1778196538);
        setIntField(term234024, term234024.getClass(), "plateId", 1744440592);
        setIntField(term234024, term234024.getClass(), "titleId", 1945121505);
        setIntField(term234024, term234024.getClass(), "partnerId", -944730326);
        setIntField(term234024, term234024.getClass(), "frameId", -1773155590);
        setIntField(term234024, term234024.getClass(), "selectMapId", 153561632);
        setIntField(term234024, term234024.getClass(), "totalAwake", 216386937);
        setIntField(term234024, term234024.getClass(), "gradeRating", -261620665);
        setIntField(term234024, term234024.getClass(), "musicRating", -406858348);
        setIntField(term234024, term234024.getClass(), "playerRating", 533081936);
        setIntField(term234024, term234024.getClass(), "highestRating", -418681567);
        setIntField(term234024, term234024.getClass(), "gradeRank", -1387152349);
        setIntField(term234024, term234024.getClass(), "classRank", -1513582711);
        setIntField(term234024, term234024.getClass(), "courseRank", -1229638409);
        setField(term234024, term234024.getClass(), "charaSlot", term234089);
        setField(term234024, term234024.getClass(), "charaLockSlot", term234107);
        setLongField(term234024, term234024.getClass(), "contentBit", -3645821901336733540L);
        setIntField(term234024, term234024.getClass(), "playCount", 2066431097);
        setField(term234024, term234024.getClass(), "eventWatchedDate", "CTpcEYMWUA");
        setField(term234024, term234024.getClass(), "lastGameId", "cBLCFxQTwr");
        setField(term234024, term234024.getClass(), "lastRomVersion", "bAPuGgLDDP");
        setField(term234024, term234024.getClass(), "lastDataVersion", "zDqBWnYkse");
        setField(term234024, term234024.getClass(), "lastLoginDate", "aJCCJNpMCR");
        setField(term234024, term234024.getClass(), "lastPlayDate", "mMmhYmbxdG");
        setIntField(term234024, term234024.getClass(), "lastPlayCredit", 2133764630);
        setIntField(term234024, term234024.getClass(), "lastPlayMode", -1522058627);
        setIntField(term234024, term234024.getClass(), "lastPlaceId", 353441774);
        setField(term234024, term234024.getClass(), "lastPlaceName", "HryXzTbmTy");
        setIntField(term234024, term234024.getClass(), "lastAllNetId", -1461119207);
        setIntField(term234024, term234024.getClass(), "lastRegionId", 1443058018);
        setField(term234024, term234024.getClass(), "lastRegionName", "onBrOcbLBy");
        setField(term234024, term234024.getClass(), "lastClientId", "bRCSiJmxoG");
        setField(term234024, term234024.getClass(), "lastCountryCode", "gdETEfEDoV");
        setIntField(term234024, term234024.getClass(), "lastSelectEMoney", 943997229);
        setIntField(term234024, term234024.getClass(), "lastSelectTicket", -550430861);
        setIntField(term234024, term234024.getClass(), "lastSelectCourse", 401578910);
        setIntField(term234024, term234024.getClass(), "lastCountCourse", 1911986107);
        setField(term234024, term234024.getClass(), "firstGameId", "VxuAZfQUYL");
        setField(term234024, term234024.getClass(), "firstRomVersion", "JxFppbOcNK");
        setField(term234024, term234024.getClass(), "firstDataVersion", "VDRDLYjCJY");
        setField(term234024, term234024.getClass(), "firstPlayDate", "FAhGbTievR");
        setField(term234024, term234024.getClass(), "compatibleCmVersion", "BOZOuwzOXv");
        setField(term234024, term234024.getClass(), "dailyBonusDate", "FeQMOQDSJC");
        setField(term234024, term234024.getClass(), "dailyCourseBonusDate", "qpEcsAfmwm");
        setField(term234024, term234024.getClass(), "lastPairLoginDate", "bkirFxxFur");
        setField(term234024, term234024.getClass(), "lastTrialPlayDate", "lOSFadXpVo");
        setIntField(term234024, term234024.getClass(), "playVsCount", -1549506145);
        setIntField(term234024, term234024.getClass(), "playSyncCount", -970724016);
        setIntField(term234024, term234024.getClass(), "winCount", -854340858);
        setIntField(term234024, term234024.getClass(), "helpCount", -1642984440);
        setIntField(term234024, term234024.getClass(), "comboCount", 2122217114);
        setLongField(term234024, term234024.getClass(), "totalDeluxscore", -1867308017201037336L);
        setLongField(term234024, term234024.getClass(), "totalBasicDeluxscore", 6887437000471911754L);
        setLongField(term234024, term234024.getClass(), "totalAdvancedDeluxscore", -2366037304918024278L);
        setLongField(term234024, term234024.getClass(), "totalExpertDeluxscore", -1612372344470520709L);
        setLongField(term234024, term234024.getClass(), "totalMasterDeluxscore", 3781778764103717062L);
        setLongField(term234024, term234024.getClass(), "totalReMasterDeluxscore", -469901962958942628L);
        setIntField(term234024, term234024.getClass(), "totalSync", 2099495995);
        setIntField(term234024, term234024.getClass(), "totalBasicSync", -1203582659);
        setIntField(term234024, term234024.getClass(), "totalAdvancedSync", 435281259);
        setIntField(term234024, term234024.getClass(), "totalExpertSync", 2040851544);
        setIntField(term234024, term234024.getClass(), "totalMasterSync", -471289728);
        setIntField(term234024, term234024.getClass(), "totalReMasterSync", 1093833463);
        setLongField(term234024, term234024.getClass(), "totalAchievement", 4998701411149070298L);
        setLongField(term234024, term234024.getClass(), "totalBasicAchievement", 2824789005744869990L);
        setLongField(term234024, term234024.getClass(), "totalAdvancedAchievement", 4734111608222429771L);
        setLongField(term234024, term234024.getClass(), "totalExpertAchievement", -5977582233881841694L);
        setLongField(term234024, term234024.getClass(), "totalMasterAchievement", -8025764648906742680L);
        setLongField(term234024, term234024.getClass(), "totalReMasterAchievement", -6863590631487685970L);
        setLongField(term234024, term234024.getClass(), "playerOldRating", 5741254357015078350L);
        setLongField(term234024, term234024.getClass(), "playerNewRating", 9064678046081220673L);
        setIntField(term234024, term234024.getClass(), "banState", -1144078722);
        setLongField(term234024, term234024.getClass(), "dateTime", 1184649885524711437L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicAchievement", argTypes, term234024, args);
    }

};


