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

public class UserDetail_getLastRegionId_130494015733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214249;

    public UserDetail_getLastRegionId_130494015733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term214253 = new Long(-3806202176947356197L);
        Integer term214316 = new Integer(1071463645);
        Integer term214318 = new Integer(165616136);
        Integer term214320 = new Integer(887351836);
        Integer term214322 = new Integer(2002612399);
        Integer term214324 = new Integer(-1256668289);
        Integer term214326 = new Integer(-1377964851);
        Integer term214328 = new Integer(-1288314969);
        Integer term214330 = new Integer(-1625206430);
        Integer term214332 = new Integer(1599734340);
        ArrayList term214314 = new ArrayList();
        ((ArrayList) term214314).add(term214316);
        ((ArrayList) term214314).add(term214318);
        ((ArrayList) term214314).add(term214320);
        ((ArrayList) term214314).add(term214322);
        ((ArrayList) term214314).add(term214324);
        ((ArrayList) term214314).add(term214326);
        ((ArrayList) term214314).add(term214328);
        ((ArrayList) term214314).add(term214330);
        ((ArrayList) term214314).add(term214332);
        Integer term214338 = new Integer(1262425699);
        Integer term214340 = new Integer(-515051505);
        ArrayList term214336 = new ArrayList();
        ((ArrayList) term214336).add(term214338);
        ((ArrayList) term214336).add(term214340);
        term214249 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term214251 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term214267 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term214268 = newInstance(Class.forName("java.time.LocalDate"));
        Object term214272 = newInstance(Class.forName("java.time.LocalTime"));
        Object term214277 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term214278 = newInstance(Class.forName("java.time.LocalDate"));
        Object term214282 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term214249, term214249.getClass(), "id", 1367489226564827925L);
        setLongField(term214251, term214251.getClass(), "id", 5947163205971809021L);
        setField(term214251, term214251.getClass(), "extId", term214253);
        setField(term214251, term214251.getClass(), "luid", "ydVPRdqSbz");
        setIntField(term214268, term214268.getClass(), "year", 2017);
        setShortField(term214268, term214268.getClass(), "month", (short) 4);
        setShortField(term214268, term214268.getClass(), "day", (short) 7);
        setField(term214267, term214267.getClass(), "date", term214268);
        setByteField(term214272, term214272.getClass(), "hour", (byte) 21);
        setByteField(term214272, term214272.getClass(), "minute", (byte) 7);
        setByteField(term214272, term214272.getClass(), "second", (byte) 57);
        setIntField(term214272, term214272.getClass(), "nano", 229024114);
        setField(term214267, term214267.getClass(), "time", term214272);
        setField(term214251, term214251.getClass(), "registerTime", term214267);
        setIntField(term214278, term214278.getClass(), "year", 2019);
        setShortField(term214278, term214278.getClass(), "month", (short) 2);
        setShortField(term214278, term214278.getClass(), "day", (short) 24);
        setField(term214277, term214277.getClass(), "date", term214278);
        setByteField(term214282, term214282.getClass(), "hour", (byte) 1);
        setByteField(term214282, term214282.getClass(), "minute", (byte) 34);
        setByteField(term214282, term214282.getClass(), "second", (byte) 39);
        setIntField(term214282, term214282.getClass(), "nano", 549100800);
        setField(term214277, term214277.getClass(), "time", term214282);
        setField(term214251, term214251.getClass(), "accessTime", term214277);
        setField(term214249, term214249.getClass(), "card", term214251);
        setField(term214249, term214249.getClass(), "userName", "YyjhpSwPgx");
        setIntField(term214249, term214249.getClass(), "isNetMember", 1139363236);
        setIntField(term214249, term214249.getClass(), "iconId", 1218891668);
        setIntField(term214249, term214249.getClass(), "plateId", -2064671008);
        setIntField(term214249, term214249.getClass(), "titleId", 1799911486);
        setIntField(term214249, term214249.getClass(), "partnerId", -171214424);
        setIntField(term214249, term214249.getClass(), "frameId", -1028842378);
        setIntField(term214249, term214249.getClass(), "selectMapId", 1352006091);
        setIntField(term214249, term214249.getClass(), "totalAwake", -974628095);
        setIntField(term214249, term214249.getClass(), "gradeRating", 59950854);
        setIntField(term214249, term214249.getClass(), "musicRating", -952403503);
        setIntField(term214249, term214249.getClass(), "playerRating", 1665910999);
        setIntField(term214249, term214249.getClass(), "highestRating", 773753844);
        setIntField(term214249, term214249.getClass(), "gradeRank", 1562377644);
        setIntField(term214249, term214249.getClass(), "classRank", 188245897);
        setIntField(term214249, term214249.getClass(), "courseRank", -1571960696);
        setField(term214249, term214249.getClass(), "charaSlot", term214314);
        setField(term214249, term214249.getClass(), "charaLockSlot", term214336);
        setLongField(term214249, term214249.getClass(), "contentBit", -6575085788894320106L);
        setIntField(term214249, term214249.getClass(), "playCount", -1748371946);
        setField(term214249, term214249.getClass(), "eventWatchedDate", "qqGFEzKRQJ");
        setField(term214249, term214249.getClass(), "lastGameId", "EnqmBVdibE");
        setField(term214249, term214249.getClass(), "lastRomVersion", "WtdXCvHGYH");
        setField(term214249, term214249.getClass(), "lastDataVersion", "gmqhvueZEN");
        setField(term214249, term214249.getClass(), "lastLoginDate", "ZwoXDSRaAD");
        setField(term214249, term214249.getClass(), "lastPlayDate", "dNrgJAaxDz");
        setIntField(term214249, term214249.getClass(), "lastPlayCredit", 488706905);
        setIntField(term214249, term214249.getClass(), "lastPlayMode", -2075020297);
        setIntField(term214249, term214249.getClass(), "lastPlaceId", 1023590792);
        setField(term214249, term214249.getClass(), "lastPlaceName", "nIBSSVUWgF");
        setIntField(term214249, term214249.getClass(), "lastAllNetId", 292628417);
        setIntField(term214249, term214249.getClass(), "lastRegionId", 754216340);
        setField(term214249, term214249.getClass(), "lastRegionName", "EEMeFbUtEc");
        setField(term214249, term214249.getClass(), "lastClientId", "XHKUiKWOpX");
        setField(term214249, term214249.getClass(), "lastCountryCode", "JWhCXTgSAI");
        setIntField(term214249, term214249.getClass(), "lastSelectEMoney", -1024407352);
        setIntField(term214249, term214249.getClass(), "lastSelectTicket", 289742263);
        setIntField(term214249, term214249.getClass(), "lastSelectCourse", 1509344303);
        setIntField(term214249, term214249.getClass(), "lastCountCourse", 1042927327);
        setField(term214249, term214249.getClass(), "firstGameId", "FTXbFGiKvH");
        setField(term214249, term214249.getClass(), "firstRomVersion", "uWVGPefMEG");
        setField(term214249, term214249.getClass(), "firstDataVersion", "yOaHVoGecE");
        setField(term214249, term214249.getClass(), "firstPlayDate", "tIXSzEtAgp");
        setField(term214249, term214249.getClass(), "compatibleCmVersion", "XPssvVfWWa");
        setField(term214249, term214249.getClass(), "dailyBonusDate", "dGmZGBJHev");
        setField(term214249, term214249.getClass(), "dailyCourseBonusDate", "EwMbIXGRzh");
        setField(term214249, term214249.getClass(), "lastPairLoginDate", "PDDuUicfcG");
        setField(term214249, term214249.getClass(), "lastTrialPlayDate", "XrOsDpBdLQ");
        setIntField(term214249, term214249.getClass(), "playVsCount", -953392603);
        setIntField(term214249, term214249.getClass(), "playSyncCount", -1912063354);
        setIntField(term214249, term214249.getClass(), "winCount", -1503327936);
        setIntField(term214249, term214249.getClass(), "helpCount", 621306668);
        setIntField(term214249, term214249.getClass(), "comboCount", 234624020);
        setLongField(term214249, term214249.getClass(), "totalDeluxscore", 550987716231833754L);
        setLongField(term214249, term214249.getClass(), "totalBasicDeluxscore", 1195945709581994890L);
        setLongField(term214249, term214249.getClass(), "totalAdvancedDeluxscore", 2172784493932185308L);
        setLongField(term214249, term214249.getClass(), "totalExpertDeluxscore", 1474532962460105752L);
        setLongField(term214249, term214249.getClass(), "totalMasterDeluxscore", 1355498208876702210L);
        setLongField(term214249, term214249.getClass(), "totalReMasterDeluxscore", 3688474110239796801L);
        setIntField(term214249, term214249.getClass(), "totalSync", 1280314501);
        setIntField(term214249, term214249.getClass(), "totalBasicSync", 1690660217);
        setIntField(term214249, term214249.getClass(), "totalAdvancedSync", -1442537584);
        setIntField(term214249, term214249.getClass(), "totalExpertSync", -111918563);
        setIntField(term214249, term214249.getClass(), "totalMasterSync", 113698873);
        setIntField(term214249, term214249.getClass(), "totalReMasterSync", 885365328);
        setLongField(term214249, term214249.getClass(), "totalAchievement", 7893889106593423394L);
        setLongField(term214249, term214249.getClass(), "totalBasicAchievement", 8238829374400431080L);
        setLongField(term214249, term214249.getClass(), "totalAdvancedAchievement", 370702188152989771L);
        setLongField(term214249, term214249.getClass(), "totalExpertAchievement", 6630554467062889491L);
        setLongField(term214249, term214249.getClass(), "totalMasterAchievement", -3595600412432359442L);
        setLongField(term214249, term214249.getClass(), "totalReMasterAchievement", -1592016996022241037L);
        setLongField(term214249, term214249.getClass(), "playerOldRating", -1355077344395009415L);
        setLongField(term214249, term214249.getClass(), "playerNewRating", -319418651246501343L);
        setIntField(term214249, term214249.getClass(), "banState", 1334307126);
        setLongField(term214249, term214249.getClass(), "dateTime", -3596938536596832444L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term214249, args);
    }

};


