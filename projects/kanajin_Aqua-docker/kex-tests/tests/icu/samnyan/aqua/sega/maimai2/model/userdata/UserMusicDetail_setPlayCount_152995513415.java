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

public class UserMusicDetail_setPlayCount_152995513415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64177;
     Object term64558;

    public UserMusicDetail_setPlayCount_152995513415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term64183 = new Long(-8033714905181142681L);
        Integer term64246 = new Integer(-383508597);
        Integer term64248 = new Integer(-819372164);
        Integer term64250 = new Integer(958132675);
        Integer term64252 = new Integer(-689879283);
        Integer term64254 = new Integer(1985432430);
        Integer term64256 = new Integer(-1769933499);
        Integer term64258 = new Integer(-1510932472);
        Integer term64260 = new Integer(1970654816);
        ArrayList term64244 = new ArrayList();
        ((ArrayList) term64244).add(term64246);
        ((ArrayList) term64244).add(term64248);
        ((ArrayList) term64244).add(term64250);
        ((ArrayList) term64244).add(term64252);
        ((ArrayList) term64244).add(term64254);
        ((ArrayList) term64244).add(term64256);
        ((ArrayList) term64244).add(term64258);
        ((ArrayList) term64244).add(term64260);
        Integer term64266 = new Integer(1354781442);
        Integer term64268 = new Integer(-393590701);
        Integer term64270 = new Integer(86344574);
        Integer term64272 = new Integer(-829441157);
        Integer term64274 = new Integer(-1489991025);
        Integer term64276 = new Integer(-1542979444);
        Integer term64278 = new Integer(-1130401612);
        Integer term64280 = new Integer(-316771104);
        ArrayList term64264 = new ArrayList();
        ((ArrayList) term64264).add(term64266);
        ((ArrayList) term64264).add(term64268);
        ((ArrayList) term64264).add(term64270);
        ((ArrayList) term64264).add(term64272);
        ((ArrayList) term64264).add(term64274);
        ((ArrayList) term64264).add(term64276);
        ((ArrayList) term64264).add(term64278);
        ((ArrayList) term64264).add(term64280);
        term64177 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term64179 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term64181 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term64197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64202 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64207 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64208 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64212 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term64177, term64177.getClass(), "id", -5687439958444660557L);
        setLongField(term64179, term64179.getClass(), "id", 643414393920888432L);
        setLongField(term64181, term64181.getClass(), "id", -3982367954172699860L);
        setField(term64181, term64181.getClass(), "extId", term64183);
        setField(term64181, term64181.getClass(), "luid", "YsWgGEhEmC");
        setIntField(term64198, term64198.getClass(), "year", 2024);
        setShortField(term64198, term64198.getClass(), "month", (short) 7);
        setShortField(term64198, term64198.getClass(), "day", (short) 29);
        setField(term64197, term64197.getClass(), "date", term64198);
        setByteField(term64202, term64202.getClass(), "hour", (byte) 19);
        setByteField(term64202, term64202.getClass(), "minute", (byte) 15);
        setByteField(term64202, term64202.getClass(), "second", (byte) 16);
        setIntField(term64202, term64202.getClass(), "nano", 554834199);
        setField(term64197, term64197.getClass(), "time", term64202);
        setField(term64181, term64181.getClass(), "registerTime", term64197);
        setIntField(term64208, term64208.getClass(), "year", 2018);
        setShortField(term64208, term64208.getClass(), "month", (short) 2);
        setShortField(term64208, term64208.getClass(), "day", (short) 13);
        setField(term64207, term64207.getClass(), "date", term64208);
        setByteField(term64212, term64212.getClass(), "hour", (byte) 15);
        setByteField(term64212, term64212.getClass(), "minute", (byte) 1);
        setByteField(term64212, term64212.getClass(), "second", (byte) 45);
        setIntField(term64212, term64212.getClass(), "nano", 380020898);
        setField(term64207, term64207.getClass(), "time", term64212);
        setField(term64181, term64181.getClass(), "accessTime", term64207);
        setField(term64179, term64179.getClass(), "card", term64181);
        setField(term64179, term64179.getClass(), "userName", "PBcepqkBBV");
        setIntField(term64179, term64179.getClass(), "isNetMember", 1724189490);
        setIntField(term64179, term64179.getClass(), "iconId", -850819450);
        setIntField(term64179, term64179.getClass(), "plateId", 1652716990);
        setIntField(term64179, term64179.getClass(), "titleId", 958228032);
        setIntField(term64179, term64179.getClass(), "partnerId", 624789164);
        setIntField(term64179, term64179.getClass(), "frameId", 117919201);
        setIntField(term64179, term64179.getClass(), "selectMapId", 1389237948);
        setIntField(term64179, term64179.getClass(), "totalAwake", 866670285);
        setIntField(term64179, term64179.getClass(), "gradeRating", -2004076717);
        setIntField(term64179, term64179.getClass(), "musicRating", -1695237959);
        setIntField(term64179, term64179.getClass(), "playerRating", 1317356126);
        setIntField(term64179, term64179.getClass(), "highestRating", 2058932005);
        setIntField(term64179, term64179.getClass(), "gradeRank", -773196588);
        setIntField(term64179, term64179.getClass(), "classRank", -1082451840);
        setIntField(term64179, term64179.getClass(), "courseRank", 120368183);
        setField(term64179, term64179.getClass(), "charaSlot", term64244);
        setField(term64179, term64179.getClass(), "charaLockSlot", term64264);
        setLongField(term64179, term64179.getClass(), "contentBit", 7153115868701511726L);
        setIntField(term64179, term64179.getClass(), "playCount", 1721841052);
        setField(term64179, term64179.getClass(), "eventWatchedDate", "mukHRKZmND");
        setField(term64179, term64179.getClass(), "lastGameId", "WVPSokrFPV");
        setField(term64179, term64179.getClass(), "lastRomVersion", "jELmrpQCNf");
        setField(term64179, term64179.getClass(), "lastDataVersion", "NkjAcBXmmT");
        setField(term64179, term64179.getClass(), "lastLoginDate", "KgtGJGInhu");
        setField(term64179, term64179.getClass(), "lastPlayDate", "mVHDjrsMAV");
        setIntField(term64179, term64179.getClass(), "lastPlayCredit", -1801745263);
        setIntField(term64179, term64179.getClass(), "lastPlayMode", 1232286807);
        setIntField(term64179, term64179.getClass(), "lastPlaceId", -507386961);
        setField(term64179, term64179.getClass(), "lastPlaceName", "rjWnqcjYuU");
        setIntField(term64179, term64179.getClass(), "lastAllNetId", -476320083);
        setIntField(term64179, term64179.getClass(), "lastRegionId", -2100928588);
        setField(term64179, term64179.getClass(), "lastRegionName", "JhszTkUWCg");
        setField(term64179, term64179.getClass(), "lastClientId", "gfNPCeiULY");
        setField(term64179, term64179.getClass(), "lastCountryCode", "aUJLXfcWME");
        setIntField(term64179, term64179.getClass(), "lastSelectEMoney", -81621107);
        setIntField(term64179, term64179.getClass(), "lastSelectTicket", -1617104329);
        setIntField(term64179, term64179.getClass(), "lastSelectCourse", -34705122);
        setIntField(term64179, term64179.getClass(), "lastCountCourse", 1705528966);
        setField(term64179, term64179.getClass(), "firstGameId", "ixeIpUaVug");
        setField(term64179, term64179.getClass(), "firstRomVersion", "TELyWFMBJv");
        setField(term64179, term64179.getClass(), "firstDataVersion", "bIqbgRdzpB");
        setField(term64179, term64179.getClass(), "firstPlayDate", "FIUbHJmAEj");
        setField(term64179, term64179.getClass(), "compatibleCmVersion", "mJrFDaDdyY");
        setField(term64179, term64179.getClass(), "dailyBonusDate", "HqyBQNuLnz");
        setField(term64179, term64179.getClass(), "dailyCourseBonusDate", "xWkZKbrvmX");
        setField(term64179, term64179.getClass(), "lastPairLoginDate", "PTEWoxLNqQ");
        setField(term64179, term64179.getClass(), "lastTrialPlayDate", "XiAUBffMZP");
        setIntField(term64179, term64179.getClass(), "playVsCount", 988288101);
        setIntField(term64179, term64179.getClass(), "playSyncCount", -1408161596);
        setIntField(term64179, term64179.getClass(), "winCount", 1726412898);
        setIntField(term64179, term64179.getClass(), "helpCount", -669874944);
        setIntField(term64179, term64179.getClass(), "comboCount", -1111349476);
        setLongField(term64179, term64179.getClass(), "totalDeluxscore", 3042394513611697851L);
        setLongField(term64179, term64179.getClass(), "totalBasicDeluxscore", 4021900249730695810L);
        setLongField(term64179, term64179.getClass(), "totalAdvancedDeluxscore", 3053042769254952980L);
        setLongField(term64179, term64179.getClass(), "totalExpertDeluxscore", -1613345286663863879L);
        setLongField(term64179, term64179.getClass(), "totalMasterDeluxscore", -8834993911974447264L);
        setLongField(term64179, term64179.getClass(), "totalReMasterDeluxscore", 2641309860463903358L);
        setIntField(term64179, term64179.getClass(), "totalSync", 742969465);
        setIntField(term64179, term64179.getClass(), "totalBasicSync", -1810335427);
        setIntField(term64179, term64179.getClass(), "totalAdvancedSync", 803994786);
        setIntField(term64179, term64179.getClass(), "totalExpertSync", -1141611223);
        setIntField(term64179, term64179.getClass(), "totalMasterSync", -1637961050);
        setIntField(term64179, term64179.getClass(), "totalReMasterSync", 1515109550);
        setLongField(term64179, term64179.getClass(), "totalAchievement", -7886022676278295268L);
        setLongField(term64179, term64179.getClass(), "totalBasicAchievement", 3856313132425831260L);
        setLongField(term64179, term64179.getClass(), "totalAdvancedAchievement", 4915114639652309312L);
        setLongField(term64179, term64179.getClass(), "totalExpertAchievement", 8639233526934323841L);
        setLongField(term64179, term64179.getClass(), "totalMasterAchievement", 1837377990745487524L);
        setLongField(term64179, term64179.getClass(), "totalReMasterAchievement", 7253514194157710276L);
        setLongField(term64179, term64179.getClass(), "playerOldRating", -4401374981717945185L);
        setLongField(term64179, term64179.getClass(), "playerNewRating", -5673034399804562712L);
        setIntField(term64179, term64179.getClass(), "banState", 1249494915);
        setLongField(term64179, term64179.getClass(), "dateTime", 4829676996843735281L);
        setField(term64177, term64177.getClass(), "user", term64179);
        setIntField(term64177, term64177.getClass(), "musicId", 1840485574);
        setIntField(term64177, term64177.getClass(), "level", -1384928271);
        setIntField(term64177, term64177.getClass(), "playCount", 1760478472);
        setIntField(term64177, term64177.getClass(), "achievement", 611874985);
        setIntField(term64177, term64177.getClass(), "comboStatus", -1490909009);
        setIntField(term64177, term64177.getClass(), "syncStatus", -1045578030);
        setIntField(term64177, term64177.getClass(), "deluxscoreMax", 1595269473);
        setIntField(term64177, term64177.getClass(), "scoreRank", 1542667674);
        term64558 = new Integer(1314061353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term64558;
        callMethod(klass, "setPlayCount", argTypes, term64177, args);
    }

};


