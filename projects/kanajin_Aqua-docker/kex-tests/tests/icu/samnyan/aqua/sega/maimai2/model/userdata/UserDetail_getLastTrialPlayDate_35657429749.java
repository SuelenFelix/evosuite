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

public class UserDetail_getLastTrialPlayDate_35657429749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4257271;

    public UserDetail_getLastTrialPlayDate_35657429749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4257275 = new Long(102470579642992799L);
        Integer term4257338 = new Integer(673019945);
        Integer term4257340 = new Integer(-1161638748);
        Integer term4257342 = new Integer(2056200144);
        Integer term4257344 = new Integer(-1167348988);
        Integer term4257346 = new Integer(426804739);
        Integer term4257348 = new Integer(-2012164979);
        Integer term4257350 = new Integer(-786030720);
        Integer term4257352 = new Integer(-1294339480);
        ArrayList term4257336 = new ArrayList();
        ((ArrayList) term4257336).add(term4257338);
        ((ArrayList) term4257336).add(term4257340);
        ((ArrayList) term4257336).add(term4257342);
        ((ArrayList) term4257336).add(term4257344);
        ((ArrayList) term4257336).add(term4257346);
        ((ArrayList) term4257336).add(term4257348);
        ((ArrayList) term4257336).add(term4257350);
        ((ArrayList) term4257336).add(term4257352);
        Integer term4257358 = new Integer(-858509937);
        ArrayList term4257356 = new ArrayList();
        ((ArrayList) term4257356).add(term4257358);
        term4257271 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4257273 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4257289 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4257290 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4257294 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4257299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4257300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4257304 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4257271, term4257271.getClass(), "id", 7335280668965090821L);
        setLongField(term4257273, term4257273.getClass(), "id", 8324260434838301614L);
        setField(term4257273, term4257273.getClass(), "extId", term4257275);
        setField(term4257273, term4257273.getClass(), "luid", "cNHUyoNnMc");
        setIntField(term4257290, term4257290.getClass(), "year", 2018);
        setShortField(term4257290, term4257290.getClass(), "month", (short) 7);
        setShortField(term4257290, term4257290.getClass(), "day", (short) 13);
        setField(term4257289, term4257289.getClass(), "date", term4257290);
        setByteField(term4257294, term4257294.getClass(), "hour", (byte) 6);
        setByteField(term4257294, term4257294.getClass(), "minute", (byte) 39);
        setByteField(term4257294, term4257294.getClass(), "second", (byte) 40);
        setIntField(term4257294, term4257294.getClass(), "nano", 831656989);
        setField(term4257289, term4257289.getClass(), "time", term4257294);
        setField(term4257273, term4257273.getClass(), "registerTime", term4257289);
        setIntField(term4257300, term4257300.getClass(), "year", 2017);
        setShortField(term4257300, term4257300.getClass(), "month", (short) 4);
        setShortField(term4257300, term4257300.getClass(), "day", (short) 9);
        setField(term4257299, term4257299.getClass(), "date", term4257300);
        setByteField(term4257304, term4257304.getClass(), "hour", (byte) 4);
        setByteField(term4257304, term4257304.getClass(), "minute", (byte) 14);
        setByteField(term4257304, term4257304.getClass(), "second", (byte) 17);
        setIntField(term4257304, term4257304.getClass(), "nano", 751905255);
        setField(term4257299, term4257299.getClass(), "time", term4257304);
        setField(term4257273, term4257273.getClass(), "accessTime", term4257299);
        setField(term4257271, term4257271.getClass(), "card", term4257273);
        setField(term4257271, term4257271.getClass(), "userName", "UUlVrCHdSi");
        setIntField(term4257271, term4257271.getClass(), "isNetMember", 1653287595);
        setIntField(term4257271, term4257271.getClass(), "iconId", 356238832);
        setIntField(term4257271, term4257271.getClass(), "plateId", 1795965213);
        setIntField(term4257271, term4257271.getClass(), "titleId", 1954793106);
        setIntField(term4257271, term4257271.getClass(), "partnerId", -1790623880);
        setIntField(term4257271, term4257271.getClass(), "frameId", -1016945483);
        setIntField(term4257271, term4257271.getClass(), "selectMapId", 67570331);
        setIntField(term4257271, term4257271.getClass(), "totalAwake", 927521824);
        setIntField(term4257271, term4257271.getClass(), "gradeRating", 1210965943);
        setIntField(term4257271, term4257271.getClass(), "musicRating", -2037191904);
        setIntField(term4257271, term4257271.getClass(), "playerRating", 144698632);
        setIntField(term4257271, term4257271.getClass(), "highestRating", 8196744);
        setIntField(term4257271, term4257271.getClass(), "gradeRank", -181394);
        setIntField(term4257271, term4257271.getClass(), "classRank", -1577512503);
        setIntField(term4257271, term4257271.getClass(), "courseRank", -1005427541);
        setField(term4257271, term4257271.getClass(), "charaSlot", term4257336);
        setField(term4257271, term4257271.getClass(), "charaLockSlot", term4257356);
        setLongField(term4257271, term4257271.getClass(), "contentBit", -7519873415184920612L);
        setIntField(term4257271, term4257271.getClass(), "playCount", -731036853);
        setField(term4257271, term4257271.getClass(), "eventWatchedDate", "GHwRGqsotQ");
        setField(term4257271, term4257271.getClass(), "lastGameId", "dHdyjLhFAt");
        setField(term4257271, term4257271.getClass(), "lastRomVersion", "yzkDaoVRtt");
        setField(term4257271, term4257271.getClass(), "lastDataVersion", "guRypCkUtA");
        setField(term4257271, term4257271.getClass(), "lastLoginDate", "MSjVrxscIk");
        setField(term4257271, term4257271.getClass(), "lastPlayDate", "INitvIcSYD");
        setIntField(term4257271, term4257271.getClass(), "lastPlayCredit", -1408259257);
        setIntField(term4257271, term4257271.getClass(), "lastPlayMode", -951141009);
        setIntField(term4257271, term4257271.getClass(), "lastPlaceId", 1174201458);
        setField(term4257271, term4257271.getClass(), "lastPlaceName", "HINJFegqzf");
        setIntField(term4257271, term4257271.getClass(), "lastAllNetId", 1864300263);
        setIntField(term4257271, term4257271.getClass(), "lastRegionId", -332197537);
        setField(term4257271, term4257271.getClass(), "lastRegionName", "jAiJcUuybx");
        setField(term4257271, term4257271.getClass(), "lastClientId", "DJQThXUAbA");
        setField(term4257271, term4257271.getClass(), "lastCountryCode", "ksckKDnuRD");
        setIntField(term4257271, term4257271.getClass(), "lastSelectEMoney", 1874555197);
        setIntField(term4257271, term4257271.getClass(), "lastSelectTicket", 1759892706);
        setIntField(term4257271, term4257271.getClass(), "lastSelectCourse", 686828228);
        setIntField(term4257271, term4257271.getClass(), "lastCountCourse", 447279966);
        setField(term4257271, term4257271.getClass(), "firstGameId", "KwQNLTQIKm");
        setField(term4257271, term4257271.getClass(), "firstRomVersion", "TJllcKBznC");
        setField(term4257271, term4257271.getClass(), "firstDataVersion", "nFxQtkOonn");
        setField(term4257271, term4257271.getClass(), "firstPlayDate", "dyFljxmxeE");
        setField(term4257271, term4257271.getClass(), "compatibleCmVersion", "PTctvEnYwz");
        setField(term4257271, term4257271.getClass(), "dailyBonusDate", "JXLuqSgsOo");
        setField(term4257271, term4257271.getClass(), "dailyCourseBonusDate", "ZEVmAsFych");
        setField(term4257271, term4257271.getClass(), "lastPairLoginDate", "sOaWXHRpGz");
        setField(term4257271, term4257271.getClass(), "lastTrialPlayDate", "NhttkXlfGg");
        setIntField(term4257271, term4257271.getClass(), "playVsCount", 1687658830);
        setIntField(term4257271, term4257271.getClass(), "playSyncCount", -644018616);
        setIntField(term4257271, term4257271.getClass(), "winCount", 1859326292);
        setIntField(term4257271, term4257271.getClass(), "helpCount", -2056805945);
        setIntField(term4257271, term4257271.getClass(), "comboCount", -1024464525);
        setLongField(term4257271, term4257271.getClass(), "totalDeluxscore", -1659047416523845798L);
        setLongField(term4257271, term4257271.getClass(), "totalBasicDeluxscore", 3472266109891439136L);
        setLongField(term4257271, term4257271.getClass(), "totalAdvancedDeluxscore", 9107248203530532186L);
        setLongField(term4257271, term4257271.getClass(), "totalExpertDeluxscore", -1506492496888786531L);
        setLongField(term4257271, term4257271.getClass(), "totalMasterDeluxscore", 904447406654136299L);
        setLongField(term4257271, term4257271.getClass(), "totalReMasterDeluxscore", 6589161278612923502L);
        setIntField(term4257271, term4257271.getClass(), "totalSync", -302104012);
        setIntField(term4257271, term4257271.getClass(), "totalBasicSync", -1396494219);
        setIntField(term4257271, term4257271.getClass(), "totalAdvancedSync", 930480272);
        setIntField(term4257271, term4257271.getClass(), "totalExpertSync", 1849584691);
        setIntField(term4257271, term4257271.getClass(), "totalMasterSync", 418121767);
        setIntField(term4257271, term4257271.getClass(), "totalReMasterSync", 184779289);
        setLongField(term4257271, term4257271.getClass(), "totalAchievement", 8255794572809823252L);
        setLongField(term4257271, term4257271.getClass(), "totalBasicAchievement", 4951389154107191930L);
        setLongField(term4257271, term4257271.getClass(), "totalAdvancedAchievement", -3503405893026322494L);
        setLongField(term4257271, term4257271.getClass(), "totalExpertAchievement", -1169965016348483007L);
        setLongField(term4257271, term4257271.getClass(), "totalMasterAchievement", 5169103453843988020L);
        setLongField(term4257271, term4257271.getClass(), "totalReMasterAchievement", -4127955125054988840L);
        setLongField(term4257271, term4257271.getClass(), "playerOldRating", 6847354128356353689L);
        setLongField(term4257271, term4257271.getClass(), "playerNewRating", 6243385293822331954L);
        setIntField(term4257271, term4257271.getClass(), "banState", -1394424587);
        setLongField(term4257271, term4257271.getClass(), "dateTime", 1428447497055498486L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastTrialPlayDate", argTypes, term4257271, args);
    }

};


