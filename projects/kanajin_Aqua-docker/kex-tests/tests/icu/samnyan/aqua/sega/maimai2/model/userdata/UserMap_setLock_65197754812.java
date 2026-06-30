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
import java.lang.Boolean;

public class UserMap_setLock_65197754812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580731;
     Object term581097;

    public UserMap_setLock_65197754812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term580737 = new Long(6383832776430121737L);
        Integer term580800 = new Integer(-550112969);
        Integer term580802 = new Integer(-552322473);
        Integer term580804 = new Integer(1170114628);
        ArrayList term580798 = new ArrayList();
        ((ArrayList) term580798).add(term580800);
        ((ArrayList) term580798).add(term580802);
        ((ArrayList) term580798).add(term580804);
        Integer term580810 = new Integer(-1506923134);
        Integer term580812 = new Integer(-689038383);
        Integer term580814 = new Integer(1931533980);
        Integer term580816 = new Integer(1998184383);
        Integer term580818 = new Integer(-2144790292);
        Integer term580820 = new Integer(51322657);
        Integer term580822 = new Integer(446655571);
        ArrayList term580808 = new ArrayList();
        ((ArrayList) term580808).add(term580810);
        ((ArrayList) term580808).add(term580812);
        ((ArrayList) term580808).add(term580814);
        ((ArrayList) term580808).add(term580816);
        ((ArrayList) term580808).add(term580818);
        ((ArrayList) term580808).add(term580820);
        ((ArrayList) term580808).add(term580822);
        term580731 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term580733 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term580735 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term580751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term580752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term580756 = newInstance(Class.forName("java.time.LocalTime"));
        Object term580761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term580762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term580766 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term580731, term580731.getClass(), "id", 8720285679181964840L);
        setLongField(term580733, term580733.getClass(), "id", -4242409814999900076L);
        setLongField(term580735, term580735.getClass(), "id", 7925398244990577645L);
        setField(term580735, term580735.getClass(), "extId", term580737);
        setField(term580735, term580735.getClass(), "luid", "uLYDwBCAjH");
        setIntField(term580752, term580752.getClass(), "year", 2012);
        setShortField(term580752, term580752.getClass(), "month", (short) 11);
        setShortField(term580752, term580752.getClass(), "day", (short) 23);
        setField(term580751, term580751.getClass(), "date", term580752);
        setByteField(term580756, term580756.getClass(), "hour", (byte) 23);
        setByteField(term580756, term580756.getClass(), "minute", (byte) 42);
        setByteField(term580756, term580756.getClass(), "second", (byte) 28);
        setIntField(term580756, term580756.getClass(), "nano", 672620461);
        setField(term580751, term580751.getClass(), "time", term580756);
        setField(term580735, term580735.getClass(), "registerTime", term580751);
        setIntField(term580762, term580762.getClass(), "year", 2014);
        setShortField(term580762, term580762.getClass(), "month", (short) 6);
        setShortField(term580762, term580762.getClass(), "day", (short) 1);
        setField(term580761, term580761.getClass(), "date", term580762);
        setByteField(term580766, term580766.getClass(), "hour", (byte) 10);
        setByteField(term580766, term580766.getClass(), "minute", (byte) 37);
        setByteField(term580766, term580766.getClass(), "second", (byte) 27);
        setIntField(term580766, term580766.getClass(), "nano", 894301972);
        setField(term580761, term580761.getClass(), "time", term580766);
        setField(term580735, term580735.getClass(), "accessTime", term580761);
        setField(term580733, term580733.getClass(), "card", term580735);
        setField(term580733, term580733.getClass(), "userName", "IkXFuHrqkT");
        setIntField(term580733, term580733.getClass(), "isNetMember", -1133915182);
        setIntField(term580733, term580733.getClass(), "iconId", 2066539341);
        setIntField(term580733, term580733.getClass(), "plateId", 1535359461);
        setIntField(term580733, term580733.getClass(), "titleId", -1923464069);
        setIntField(term580733, term580733.getClass(), "partnerId", -3006248);
        setIntField(term580733, term580733.getClass(), "frameId", 1799066714);
        setIntField(term580733, term580733.getClass(), "selectMapId", 853694829);
        setIntField(term580733, term580733.getClass(), "totalAwake", -461698054);
        setIntField(term580733, term580733.getClass(), "gradeRating", -1294512291);
        setIntField(term580733, term580733.getClass(), "musicRating", 1836727190);
        setIntField(term580733, term580733.getClass(), "playerRating", -1925603842);
        setIntField(term580733, term580733.getClass(), "highestRating", 340425848);
        setIntField(term580733, term580733.getClass(), "gradeRank", -2142597101);
        setIntField(term580733, term580733.getClass(), "classRank", -155009118);
        setIntField(term580733, term580733.getClass(), "courseRank", -1759968323);
        setField(term580733, term580733.getClass(), "charaSlot", term580798);
        setField(term580733, term580733.getClass(), "charaLockSlot", term580808);
        setLongField(term580733, term580733.getClass(), "contentBit", -3067892825867579339L);
        setIntField(term580733, term580733.getClass(), "playCount", 1335882149);
        setField(term580733, term580733.getClass(), "eventWatchedDate", "FblNYDjmMb");
        setField(term580733, term580733.getClass(), "lastGameId", "YGtTPBfLKU");
        setField(term580733, term580733.getClass(), "lastRomVersion", "uRwWnBPvAX");
        setField(term580733, term580733.getClass(), "lastDataVersion", "ITyMHAkiSC");
        setField(term580733, term580733.getClass(), "lastLoginDate", "neCkcmdEud");
        setField(term580733, term580733.getClass(), "lastPlayDate", "XdTTMZiNnV");
        setIntField(term580733, term580733.getClass(), "lastPlayCredit", -1494833422);
        setIntField(term580733, term580733.getClass(), "lastPlayMode", -1540348352);
        setIntField(term580733, term580733.getClass(), "lastPlaceId", -908718623);
        setField(term580733, term580733.getClass(), "lastPlaceName", "EcdpAfokPs");
        setIntField(term580733, term580733.getClass(), "lastAllNetId", -1726487873);
        setIntField(term580733, term580733.getClass(), "lastRegionId", 937301031);
        setField(term580733, term580733.getClass(), "lastRegionName", "sdIAxydLby");
        setField(term580733, term580733.getClass(), "lastClientId", "xeKWnlYlHJ");
        setField(term580733, term580733.getClass(), "lastCountryCode", "CwfGQFfbmP");
        setIntField(term580733, term580733.getClass(), "lastSelectEMoney", -278840263);
        setIntField(term580733, term580733.getClass(), "lastSelectTicket", 217357003);
        setIntField(term580733, term580733.getClass(), "lastSelectCourse", -1837521132);
        setIntField(term580733, term580733.getClass(), "lastCountCourse", 1970165836);
        setField(term580733, term580733.getClass(), "firstGameId", "rbUrQMczXz");
        setField(term580733, term580733.getClass(), "firstRomVersion", "zJmWKEAKRC");
        setField(term580733, term580733.getClass(), "firstDataVersion", "DWPNcRLDgM");
        setField(term580733, term580733.getClass(), "firstPlayDate", "uRLLOcfSMU");
        setField(term580733, term580733.getClass(), "compatibleCmVersion", "mCjXnGsPHD");
        setField(term580733, term580733.getClass(), "dailyBonusDate", "RwxXaHJFYr");
        setField(term580733, term580733.getClass(), "dailyCourseBonusDate", "fnrdqqadYz");
        setField(term580733, term580733.getClass(), "lastPairLoginDate", "RFhfqWsEsa");
        setField(term580733, term580733.getClass(), "lastTrialPlayDate", "zkibicBrkB");
        setIntField(term580733, term580733.getClass(), "playVsCount", -1167894655);
        setIntField(term580733, term580733.getClass(), "playSyncCount", 1689773401);
        setIntField(term580733, term580733.getClass(), "winCount", 689340102);
        setIntField(term580733, term580733.getClass(), "helpCount", -1511602214);
        setIntField(term580733, term580733.getClass(), "comboCount", -763062376);
        setLongField(term580733, term580733.getClass(), "totalDeluxscore", 2167014927861848739L);
        setLongField(term580733, term580733.getClass(), "totalBasicDeluxscore", -5043358903232667863L);
        setLongField(term580733, term580733.getClass(), "totalAdvancedDeluxscore", 1037295540647076305L);
        setLongField(term580733, term580733.getClass(), "totalExpertDeluxscore", -8616318314372419612L);
        setLongField(term580733, term580733.getClass(), "totalMasterDeluxscore", 8444346664321285873L);
        setLongField(term580733, term580733.getClass(), "totalReMasterDeluxscore", -5985963217606946197L);
        setIntField(term580733, term580733.getClass(), "totalSync", -1615739014);
        setIntField(term580733, term580733.getClass(), "totalBasicSync", -368450610);
        setIntField(term580733, term580733.getClass(), "totalAdvancedSync", -477847077);
        setIntField(term580733, term580733.getClass(), "totalExpertSync", 861882418);
        setIntField(term580733, term580733.getClass(), "totalMasterSync", 1147867653);
        setIntField(term580733, term580733.getClass(), "totalReMasterSync", 1094674242);
        setLongField(term580733, term580733.getClass(), "totalAchievement", -2982647834086261573L);
        setLongField(term580733, term580733.getClass(), "totalBasicAchievement", -465168826943643910L);
        setLongField(term580733, term580733.getClass(), "totalAdvancedAchievement", 5093432951024231081L);
        setLongField(term580733, term580733.getClass(), "totalExpertAchievement", -8278041835411809496L);
        setLongField(term580733, term580733.getClass(), "totalMasterAchievement", 8917778035712874679L);
        setLongField(term580733, term580733.getClass(), "totalReMasterAchievement", -4211796884331557560L);
        setLongField(term580733, term580733.getClass(), "playerOldRating", -755375313363172501L);
        setLongField(term580733, term580733.getClass(), "playerNewRating", 8161294784132260370L);
        setIntField(term580733, term580733.getClass(), "banState", 695033315);
        setLongField(term580733, term580733.getClass(), "dateTime", -5003078923624670188L);
        setField(term580731, term580731.getClass(), "user", term580733);
        setIntField(term580731, term580731.getClass(), "mapId", -463058407);
        setIntField(term580731, term580731.getClass(), "distance", 1989742022);
        setBooleanField(term580731, term580731.getClass(), "isLock", false);
        setBooleanField(term580731, term580731.getClass(), "isClear", false);
        setBooleanField(term580731, term580731.getClass(), "isComplete", true);
        term581097 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term581097;
        callMethod(klass, "setLock", argTypes, term580731, args);
    }

};


