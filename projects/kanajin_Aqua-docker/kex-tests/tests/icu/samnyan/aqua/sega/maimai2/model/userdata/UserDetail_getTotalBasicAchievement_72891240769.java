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

public class UserDetail_getTotalBasicAchievement_72891240769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234079;

    public UserDetail_getTotalBasicAchievement_72891240769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234083 = new Long(-7423063312741500355L);
        Integer term234146 = new Integer(-1857786332);
        Integer term234148 = new Integer(1307491791);
        Integer term234150 = new Integer(445813516);
        Integer term234152 = new Integer(180030231);
        Integer term234154 = new Integer(645685543);
        Integer term234156 = new Integer(-704733432);
        Integer term234158 = new Integer(147233013);
        ArrayList term234144 = new ArrayList();
        ((ArrayList) term234144).add(term234146);
        ((ArrayList) term234144).add(term234148);
        ((ArrayList) term234144).add(term234150);
        ((ArrayList) term234144).add(term234152);
        ((ArrayList) term234144).add(term234154);
        ((ArrayList) term234144).add(term234156);
        ((ArrayList) term234144).add(term234158);
        Integer term234164 = new Integer(-828376022);
        Integer term234166 = new Integer(-1133227278);
        ArrayList term234162 = new ArrayList();
        ((ArrayList) term234162).add(term234164);
        ((ArrayList) term234162).add(term234166);
        term234079 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term234081 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term234097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term234098 = newInstance(Class.forName("java.time.LocalDate"));
        Object term234102 = newInstance(Class.forName("java.time.LocalTime"));
        Object term234107 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term234108 = newInstance(Class.forName("java.time.LocalDate"));
        Object term234112 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term234079, term234079.getClass(), "id", -9166667637663056565L);
        setLongField(term234081, term234081.getClass(), "id", 9121959613346929090L);
        setField(term234081, term234081.getClass(), "extId", term234083);
        setField(term234081, term234081.getClass(), "luid", "NmhbsBItoX");
        setIntField(term234098, term234098.getClass(), "year", 2016);
        setShortField(term234098, term234098.getClass(), "month", (short) 6);
        setShortField(term234098, term234098.getClass(), "day", (short) 2);
        setField(term234097, term234097.getClass(), "date", term234098);
        setByteField(term234102, term234102.getClass(), "hour", (byte) 5);
        setByteField(term234102, term234102.getClass(), "minute", (byte) 24);
        setByteField(term234102, term234102.getClass(), "second", (byte) 28);
        setIntField(term234102, term234102.getClass(), "nano", 586692762);
        setField(term234097, term234097.getClass(), "time", term234102);
        setField(term234081, term234081.getClass(), "registerTime", term234097);
        setIntField(term234108, term234108.getClass(), "year", 2012);
        setShortField(term234108, term234108.getClass(), "month", (short) 3);
        setShortField(term234108, term234108.getClass(), "day", (short) 20);
        setField(term234107, term234107.getClass(), "date", term234108);
        setByteField(term234112, term234112.getClass(), "hour", (byte) 16);
        setByteField(term234112, term234112.getClass(), "minute", (byte) 41);
        setByteField(term234112, term234112.getClass(), "second", (byte) 13);
        setIntField(term234112, term234112.getClass(), "nano", 546552876);
        setField(term234107, term234107.getClass(), "time", term234112);
        setField(term234081, term234081.getClass(), "accessTime", term234107);
        setField(term234079, term234079.getClass(), "card", term234081);
        setField(term234079, term234079.getClass(), "userName", "mhLgHXafNK");
        setIntField(term234079, term234079.getClass(), "isNetMember", 1220247325);
        setIntField(term234079, term234079.getClass(), "iconId", 1778196538);
        setIntField(term234079, term234079.getClass(), "plateId", 1744440592);
        setIntField(term234079, term234079.getClass(), "titleId", 1945121505);
        setIntField(term234079, term234079.getClass(), "partnerId", -944730326);
        setIntField(term234079, term234079.getClass(), "frameId", -1773155590);
        setIntField(term234079, term234079.getClass(), "selectMapId", 153561632);
        setIntField(term234079, term234079.getClass(), "totalAwake", 216386937);
        setIntField(term234079, term234079.getClass(), "gradeRating", -261620665);
        setIntField(term234079, term234079.getClass(), "musicRating", -406858348);
        setIntField(term234079, term234079.getClass(), "playerRating", 533081936);
        setIntField(term234079, term234079.getClass(), "highestRating", -418681567);
        setIntField(term234079, term234079.getClass(), "gradeRank", -1387152349);
        setIntField(term234079, term234079.getClass(), "classRank", -1513582711);
        setIntField(term234079, term234079.getClass(), "courseRank", -1229638409);
        setField(term234079, term234079.getClass(), "charaSlot", term234144);
        setField(term234079, term234079.getClass(), "charaLockSlot", term234162);
        setLongField(term234079, term234079.getClass(), "contentBit", -3645821901336733540L);
        setIntField(term234079, term234079.getClass(), "playCount", 2066431097);
        setField(term234079, term234079.getClass(), "eventWatchedDate", "CTpcEYMWUA");
        setField(term234079, term234079.getClass(), "lastGameId", "cBLCFxQTwr");
        setField(term234079, term234079.getClass(), "lastRomVersion", "bAPuGgLDDP");
        setField(term234079, term234079.getClass(), "lastDataVersion", "zDqBWnYkse");
        setField(term234079, term234079.getClass(), "lastLoginDate", "aJCCJNpMCR");
        setField(term234079, term234079.getClass(), "lastPlayDate", "mMmhYmbxdG");
        setIntField(term234079, term234079.getClass(), "lastPlayCredit", 2133764630);
        setIntField(term234079, term234079.getClass(), "lastPlayMode", -1522058627);
        setIntField(term234079, term234079.getClass(), "lastPlaceId", 353441774);
        setField(term234079, term234079.getClass(), "lastPlaceName", "HryXzTbmTy");
        setIntField(term234079, term234079.getClass(), "lastAllNetId", -1461119207);
        setIntField(term234079, term234079.getClass(), "lastRegionId", 1443058018);
        setField(term234079, term234079.getClass(), "lastRegionName", "onBrOcbLBy");
        setField(term234079, term234079.getClass(), "lastClientId", "bRCSiJmxoG");
        setField(term234079, term234079.getClass(), "lastCountryCode", "gdETEfEDoV");
        setIntField(term234079, term234079.getClass(), "lastSelectEMoney", 943997229);
        setIntField(term234079, term234079.getClass(), "lastSelectTicket", -550430861);
        setIntField(term234079, term234079.getClass(), "lastSelectCourse", 401578910);
        setIntField(term234079, term234079.getClass(), "lastCountCourse", 1911986107);
        setField(term234079, term234079.getClass(), "firstGameId", "VxuAZfQUYL");
        setField(term234079, term234079.getClass(), "firstRomVersion", "JxFppbOcNK");
        setField(term234079, term234079.getClass(), "firstDataVersion", "VDRDLYjCJY");
        setField(term234079, term234079.getClass(), "firstPlayDate", "FAhGbTievR");
        setField(term234079, term234079.getClass(), "compatibleCmVersion", "BOZOuwzOXv");
        setField(term234079, term234079.getClass(), "dailyBonusDate", "FeQMOQDSJC");
        setField(term234079, term234079.getClass(), "dailyCourseBonusDate", "qpEcsAfmwm");
        setField(term234079, term234079.getClass(), "lastPairLoginDate", "bkirFxxFur");
        setField(term234079, term234079.getClass(), "lastTrialPlayDate", "lOSFadXpVo");
        setIntField(term234079, term234079.getClass(), "playVsCount", -1549506145);
        setIntField(term234079, term234079.getClass(), "playSyncCount", -970724016);
        setIntField(term234079, term234079.getClass(), "winCount", -854340858);
        setIntField(term234079, term234079.getClass(), "helpCount", -1642984440);
        setIntField(term234079, term234079.getClass(), "comboCount", 2122217114);
        setLongField(term234079, term234079.getClass(), "totalDeluxscore", -1867308017201037336L);
        setLongField(term234079, term234079.getClass(), "totalBasicDeluxscore", 6887437000471911754L);
        setLongField(term234079, term234079.getClass(), "totalAdvancedDeluxscore", -2366037304918024278L);
        setLongField(term234079, term234079.getClass(), "totalExpertDeluxscore", -1612372344470520709L);
        setLongField(term234079, term234079.getClass(), "totalMasterDeluxscore", 3781778764103717062L);
        setLongField(term234079, term234079.getClass(), "totalReMasterDeluxscore", -469901962958942628L);
        setIntField(term234079, term234079.getClass(), "totalSync", 2099495995);
        setIntField(term234079, term234079.getClass(), "totalBasicSync", -1203582659);
        setIntField(term234079, term234079.getClass(), "totalAdvancedSync", 435281259);
        setIntField(term234079, term234079.getClass(), "totalExpertSync", 2040851544);
        setIntField(term234079, term234079.getClass(), "totalMasterSync", -471289728);
        setIntField(term234079, term234079.getClass(), "totalReMasterSync", 1093833463);
        setLongField(term234079, term234079.getClass(), "totalAchievement", 4998701411149070298L);
        setLongField(term234079, term234079.getClass(), "totalBasicAchievement", 2824789005744869990L);
        setLongField(term234079, term234079.getClass(), "totalAdvancedAchievement", 4734111608222429771L);
        setLongField(term234079, term234079.getClass(), "totalExpertAchievement", -5977582233881841694L);
        setLongField(term234079, term234079.getClass(), "totalMasterAchievement", -8025764648906742680L);
        setLongField(term234079, term234079.getClass(), "totalReMasterAchievement", -6863590631487685970L);
        setLongField(term234079, term234079.getClass(), "playerOldRating", 5741254357015078350L);
        setLongField(term234079, term234079.getClass(), "playerNewRating", 9064678046081220673L);
        setIntField(term234079, term234079.getClass(), "banState", -1144078722);
        setLongField(term234079, term234079.getClass(), "dateTime", 1184649885524711437L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicAchievement", argTypes, term234079, args);
    }

};


