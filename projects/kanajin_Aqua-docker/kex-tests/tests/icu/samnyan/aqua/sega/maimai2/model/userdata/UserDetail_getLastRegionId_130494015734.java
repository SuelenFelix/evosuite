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

public class UserDetail_getLastRegionId_130494015734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214304;

    public UserDetail_getLastRegionId_130494015734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term214308 = new Long(-3806202176947356197L);
        Integer term214371 = new Integer(1071463645);
        Integer term214373 = new Integer(165616136);
        Integer term214375 = new Integer(887351836);
        Integer term214377 = new Integer(2002612399);
        Integer term214379 = new Integer(-1256668289);
        Integer term214381 = new Integer(-1377964851);
        Integer term214383 = new Integer(-1288314969);
        Integer term214385 = new Integer(-1625206430);
        Integer term214387 = new Integer(1599734340);
        ArrayList term214369 = new ArrayList();
        ((ArrayList) term214369).add(term214371);
        ((ArrayList) term214369).add(term214373);
        ((ArrayList) term214369).add(term214375);
        ((ArrayList) term214369).add(term214377);
        ((ArrayList) term214369).add(term214379);
        ((ArrayList) term214369).add(term214381);
        ((ArrayList) term214369).add(term214383);
        ((ArrayList) term214369).add(term214385);
        ((ArrayList) term214369).add(term214387);
        Integer term214393 = new Integer(1262425699);
        Integer term214395 = new Integer(-515051505);
        ArrayList term214391 = new ArrayList();
        ((ArrayList) term214391).add(term214393);
        ((ArrayList) term214391).add(term214395);
        term214304 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term214306 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term214322 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term214323 = newInstance(Class.forName("java.time.LocalDate"));
        Object term214327 = newInstance(Class.forName("java.time.LocalTime"));
        Object term214332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term214333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term214337 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term214304, term214304.getClass(), "id", 1367489226564827925L);
        setLongField(term214306, term214306.getClass(), "id", 5947163205971809021L);
        setField(term214306, term214306.getClass(), "extId", term214308);
        setField(term214306, term214306.getClass(), "luid", "ydVPRdqSbz");
        setIntField(term214323, term214323.getClass(), "year", 2017);
        setShortField(term214323, term214323.getClass(), "month", (short) 4);
        setShortField(term214323, term214323.getClass(), "day", (short) 7);
        setField(term214322, term214322.getClass(), "date", term214323);
        setByteField(term214327, term214327.getClass(), "hour", (byte) 21);
        setByteField(term214327, term214327.getClass(), "minute", (byte) 7);
        setByteField(term214327, term214327.getClass(), "second", (byte) 57);
        setIntField(term214327, term214327.getClass(), "nano", 229024114);
        setField(term214322, term214322.getClass(), "time", term214327);
        setField(term214306, term214306.getClass(), "registerTime", term214322);
        setIntField(term214333, term214333.getClass(), "year", 2019);
        setShortField(term214333, term214333.getClass(), "month", (short) 2);
        setShortField(term214333, term214333.getClass(), "day", (short) 24);
        setField(term214332, term214332.getClass(), "date", term214333);
        setByteField(term214337, term214337.getClass(), "hour", (byte) 1);
        setByteField(term214337, term214337.getClass(), "minute", (byte) 34);
        setByteField(term214337, term214337.getClass(), "second", (byte) 39);
        setIntField(term214337, term214337.getClass(), "nano", 549100800);
        setField(term214332, term214332.getClass(), "time", term214337);
        setField(term214306, term214306.getClass(), "accessTime", term214332);
        setField(term214304, term214304.getClass(), "card", term214306);
        setField(term214304, term214304.getClass(), "userName", "YyjhpSwPgx");
        setIntField(term214304, term214304.getClass(), "isNetMember", 1139363236);
        setIntField(term214304, term214304.getClass(), "iconId", 1218891668);
        setIntField(term214304, term214304.getClass(), "plateId", -2064671008);
        setIntField(term214304, term214304.getClass(), "titleId", 1799911486);
        setIntField(term214304, term214304.getClass(), "partnerId", -171214424);
        setIntField(term214304, term214304.getClass(), "frameId", -1028842378);
        setIntField(term214304, term214304.getClass(), "selectMapId", 1352006091);
        setIntField(term214304, term214304.getClass(), "totalAwake", -974628095);
        setIntField(term214304, term214304.getClass(), "gradeRating", 59950854);
        setIntField(term214304, term214304.getClass(), "musicRating", -952403503);
        setIntField(term214304, term214304.getClass(), "playerRating", 1665910999);
        setIntField(term214304, term214304.getClass(), "highestRating", 773753844);
        setIntField(term214304, term214304.getClass(), "gradeRank", 1562377644);
        setIntField(term214304, term214304.getClass(), "classRank", 188245897);
        setIntField(term214304, term214304.getClass(), "courseRank", -1571960696);
        setField(term214304, term214304.getClass(), "charaSlot", term214369);
        setField(term214304, term214304.getClass(), "charaLockSlot", term214391);
        setLongField(term214304, term214304.getClass(), "contentBit", -6575085788894320106L);
        setIntField(term214304, term214304.getClass(), "playCount", -1748371946);
        setField(term214304, term214304.getClass(), "eventWatchedDate", "qqGFEzKRQJ");
        setField(term214304, term214304.getClass(), "lastGameId", "EnqmBVdibE");
        setField(term214304, term214304.getClass(), "lastRomVersion", "WtdXCvHGYH");
        setField(term214304, term214304.getClass(), "lastDataVersion", "gmqhvueZEN");
        setField(term214304, term214304.getClass(), "lastLoginDate", "ZwoXDSRaAD");
        setField(term214304, term214304.getClass(), "lastPlayDate", "dNrgJAaxDz");
        setIntField(term214304, term214304.getClass(), "lastPlayCredit", 488706905);
        setIntField(term214304, term214304.getClass(), "lastPlayMode", -2075020297);
        setIntField(term214304, term214304.getClass(), "lastPlaceId", 1023590792);
        setField(term214304, term214304.getClass(), "lastPlaceName", "nIBSSVUWgF");
        setIntField(term214304, term214304.getClass(), "lastAllNetId", 292628417);
        setIntField(term214304, term214304.getClass(), "lastRegionId", 754216340);
        setField(term214304, term214304.getClass(), "lastRegionName", "EEMeFbUtEc");
        setField(term214304, term214304.getClass(), "lastClientId", "XHKUiKWOpX");
        setField(term214304, term214304.getClass(), "lastCountryCode", "JWhCXTgSAI");
        setIntField(term214304, term214304.getClass(), "lastSelectEMoney", -1024407352);
        setIntField(term214304, term214304.getClass(), "lastSelectTicket", 289742263);
        setIntField(term214304, term214304.getClass(), "lastSelectCourse", 1509344303);
        setIntField(term214304, term214304.getClass(), "lastCountCourse", 1042927327);
        setField(term214304, term214304.getClass(), "firstGameId", "FTXbFGiKvH");
        setField(term214304, term214304.getClass(), "firstRomVersion", "uWVGPefMEG");
        setField(term214304, term214304.getClass(), "firstDataVersion", "yOaHVoGecE");
        setField(term214304, term214304.getClass(), "firstPlayDate", "tIXSzEtAgp");
        setField(term214304, term214304.getClass(), "compatibleCmVersion", "XPssvVfWWa");
        setField(term214304, term214304.getClass(), "dailyBonusDate", "dGmZGBJHev");
        setField(term214304, term214304.getClass(), "dailyCourseBonusDate", "EwMbIXGRzh");
        setField(term214304, term214304.getClass(), "lastPairLoginDate", "PDDuUicfcG");
        setField(term214304, term214304.getClass(), "lastTrialPlayDate", "XrOsDpBdLQ");
        setIntField(term214304, term214304.getClass(), "playVsCount", -953392603);
        setIntField(term214304, term214304.getClass(), "playSyncCount", -1912063354);
        setIntField(term214304, term214304.getClass(), "winCount", -1503327936);
        setIntField(term214304, term214304.getClass(), "helpCount", 621306668);
        setIntField(term214304, term214304.getClass(), "comboCount", 234624020);
        setLongField(term214304, term214304.getClass(), "totalDeluxscore", 550987716231833754L);
        setLongField(term214304, term214304.getClass(), "totalBasicDeluxscore", 1195945709581994890L);
        setLongField(term214304, term214304.getClass(), "totalAdvancedDeluxscore", 2172784493932185308L);
        setLongField(term214304, term214304.getClass(), "totalExpertDeluxscore", 1474532962460105752L);
        setLongField(term214304, term214304.getClass(), "totalMasterDeluxscore", 1355498208876702210L);
        setLongField(term214304, term214304.getClass(), "totalReMasterDeluxscore", 3688474110239796801L);
        setIntField(term214304, term214304.getClass(), "totalSync", 1280314501);
        setIntField(term214304, term214304.getClass(), "totalBasicSync", 1690660217);
        setIntField(term214304, term214304.getClass(), "totalAdvancedSync", -1442537584);
        setIntField(term214304, term214304.getClass(), "totalExpertSync", -111918563);
        setIntField(term214304, term214304.getClass(), "totalMasterSync", 113698873);
        setIntField(term214304, term214304.getClass(), "totalReMasterSync", 885365328);
        setLongField(term214304, term214304.getClass(), "totalAchievement", 7893889106593423394L);
        setLongField(term214304, term214304.getClass(), "totalBasicAchievement", 8238829374400431080L);
        setLongField(term214304, term214304.getClass(), "totalAdvancedAchievement", 370702188152989771L);
        setLongField(term214304, term214304.getClass(), "totalExpertAchievement", 6630554467062889491L);
        setLongField(term214304, term214304.getClass(), "totalMasterAchievement", -3595600412432359442L);
        setLongField(term214304, term214304.getClass(), "totalReMasterAchievement", -1592016996022241037L);
        setLongField(term214304, term214304.getClass(), "playerOldRating", -1355077344395009415L);
        setLongField(term214304, term214304.getClass(), "playerNewRating", -319418651246501343L);
        setIntField(term214304, term214304.getClass(), "banState", 1334307126);
        setLongField(term214304, term214304.getClass(), "dateTime", -3596938536596832444L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term214304, args);
    }

};


