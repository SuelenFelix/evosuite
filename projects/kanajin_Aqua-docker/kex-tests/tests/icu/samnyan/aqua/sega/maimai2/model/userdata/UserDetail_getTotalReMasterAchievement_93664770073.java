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

public class UserDetail_getTotalReMasterAchievement_93664770073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236349;

    public UserDetail_getTotalReMasterAchievement_93664770073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236353 = new Long(3643973882575578879L);
        Integer term236416 = new Integer(-1128978986);
        Integer term236418 = new Integer(192962115);
        Integer term236420 = new Integer(1531205463);
        Integer term236422 = new Integer(586115489);
        Integer term236424 = new Integer(1377331021);
        Integer term236426 = new Integer(1915536131);
        ArrayList term236414 = new ArrayList();
        ((ArrayList) term236414).add(term236416);
        ((ArrayList) term236414).add(term236418);
        ((ArrayList) term236414).add(term236420);
        ((ArrayList) term236414).add(term236422);
        ((ArrayList) term236414).add(term236424);
        ((ArrayList) term236414).add(term236426);
        Integer term236432 = new Integer(936561631);
        Integer term236434 = new Integer(-160474197);
        Integer term236436 = new Integer(279768924);
        ArrayList term236430 = new ArrayList();
        ((ArrayList) term236430).add(term236432);
        ((ArrayList) term236430).add(term236434);
        ((ArrayList) term236430).add(term236436);
        term236349 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term236351 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term236367 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term236368 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236372 = newInstance(Class.forName("java.time.LocalTime"));
        Object term236377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term236378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236382 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term236349, term236349.getClass(), "id", 218984008209321665L);
        setLongField(term236351, term236351.getClass(), "id", -7522319046970408025L);
        setField(term236351, term236351.getClass(), "extId", term236353);
        setField(term236351, term236351.getClass(), "luid", "pTbgOtvRFl");
        setIntField(term236368, term236368.getClass(), "year", 2026);
        setShortField(term236368, term236368.getClass(), "month", (short) 6);
        setShortField(term236368, term236368.getClass(), "day", (short) 16);
        setField(term236367, term236367.getClass(), "date", term236368);
        setByteField(term236372, term236372.getClass(), "hour", (byte) 23);
        setByteField(term236372, term236372.getClass(), "minute", (byte) 43);
        setByteField(term236372, term236372.getClass(), "second", (byte) 38);
        setIntField(term236372, term236372.getClass(), "nano", 395188532);
        setField(term236367, term236367.getClass(), "time", term236372);
        setField(term236351, term236351.getClass(), "registerTime", term236367);
        setIntField(term236378, term236378.getClass(), "year", 2010);
        setShortField(term236378, term236378.getClass(), "month", (short) 12);
        setShortField(term236378, term236378.getClass(), "day", (short) 4);
        setField(term236377, term236377.getClass(), "date", term236378);
        setByteField(term236382, term236382.getClass(), "hour", (byte) 18);
        setByteField(term236382, term236382.getClass(), "minute", (byte) 23);
        setByteField(term236382, term236382.getClass(), "second", (byte) 50);
        setIntField(term236382, term236382.getClass(), "nano", 773671553);
        setField(term236377, term236377.getClass(), "time", term236382);
        setField(term236351, term236351.getClass(), "accessTime", term236377);
        setField(term236349, term236349.getClass(), "card", term236351);
        setField(term236349, term236349.getClass(), "userName", "uYsCAnuGyO");
        setIntField(term236349, term236349.getClass(), "isNetMember", -997394743);
        setIntField(term236349, term236349.getClass(), "iconId", -2121530653);
        setIntField(term236349, term236349.getClass(), "plateId", 1319282638);
        setIntField(term236349, term236349.getClass(), "titleId", -949477062);
        setIntField(term236349, term236349.getClass(), "partnerId", -1991471366);
        setIntField(term236349, term236349.getClass(), "frameId", -951732964);
        setIntField(term236349, term236349.getClass(), "selectMapId", 810582577);
        setIntField(term236349, term236349.getClass(), "totalAwake", -481913428);
        setIntField(term236349, term236349.getClass(), "gradeRating", 1878857053);
        setIntField(term236349, term236349.getClass(), "musicRating", -1703968608);
        setIntField(term236349, term236349.getClass(), "playerRating", -1516989582);
        setIntField(term236349, term236349.getClass(), "highestRating", -1473571403);
        setIntField(term236349, term236349.getClass(), "gradeRank", -33345447);
        setIntField(term236349, term236349.getClass(), "classRank", -473865390);
        setIntField(term236349, term236349.getClass(), "courseRank", 1560849509);
        setField(term236349, term236349.getClass(), "charaSlot", term236414);
        setField(term236349, term236349.getClass(), "charaLockSlot", term236430);
        setLongField(term236349, term236349.getClass(), "contentBit", -5590687905785932678L);
        setIntField(term236349, term236349.getClass(), "playCount", 548082671);
        setField(term236349, term236349.getClass(), "eventWatchedDate", "iHpqtMMAFo");
        setField(term236349, term236349.getClass(), "lastGameId", "AzJPrFTejS");
        setField(term236349, term236349.getClass(), "lastRomVersion", "WqNyoizhju");
        setField(term236349, term236349.getClass(), "lastDataVersion", "SyBEMBeZJe");
        setField(term236349, term236349.getClass(), "lastLoginDate", "UpFaZAcdPU");
        setField(term236349, term236349.getClass(), "lastPlayDate", "WLooWdtMun");
        setIntField(term236349, term236349.getClass(), "lastPlayCredit", 143341138);
        setIntField(term236349, term236349.getClass(), "lastPlayMode", 673245946);
        setIntField(term236349, term236349.getClass(), "lastPlaceId", -425351471);
        setField(term236349, term236349.getClass(), "lastPlaceName", "nMoLefpNTs");
        setIntField(term236349, term236349.getClass(), "lastAllNetId", -1117580978);
        setIntField(term236349, term236349.getClass(), "lastRegionId", 208521517);
        setField(term236349, term236349.getClass(), "lastRegionName", "bScsAMGfKs");
        setField(term236349, term236349.getClass(), "lastClientId", "GSFfACqjye");
        setField(term236349, term236349.getClass(), "lastCountryCode", "WNiXGNcYjm");
        setIntField(term236349, term236349.getClass(), "lastSelectEMoney", 778044540);
        setIntField(term236349, term236349.getClass(), "lastSelectTicket", -803580264);
        setIntField(term236349, term236349.getClass(), "lastSelectCourse", 131178867);
        setIntField(term236349, term236349.getClass(), "lastCountCourse", -255580652);
        setField(term236349, term236349.getClass(), "firstGameId", "nmtwfmagfX");
        setField(term236349, term236349.getClass(), "firstRomVersion", "kiIMTOKJXF");
        setField(term236349, term236349.getClass(), "firstDataVersion", "LVSwXfrvcg");
        setField(term236349, term236349.getClass(), "firstPlayDate", "ewjLmrzsVO");
        setField(term236349, term236349.getClass(), "compatibleCmVersion", "ViYeKNhFKg");
        setField(term236349, term236349.getClass(), "dailyBonusDate", "SXFyTzXeaj");
        setField(term236349, term236349.getClass(), "dailyCourseBonusDate", "gRfwDGnUeI");
        setField(term236349, term236349.getClass(), "lastPairLoginDate", "AzIgoJKPKf");
        setField(term236349, term236349.getClass(), "lastTrialPlayDate", "DoekyfIrat");
        setIntField(term236349, term236349.getClass(), "playVsCount", -1732441524);
        setIntField(term236349, term236349.getClass(), "playSyncCount", -130160357);
        setIntField(term236349, term236349.getClass(), "winCount", -1813127102);
        setIntField(term236349, term236349.getClass(), "helpCount", -838128266);
        setIntField(term236349, term236349.getClass(), "comboCount", 61916705);
        setLongField(term236349, term236349.getClass(), "totalDeluxscore", -5818970464137804543L);
        setLongField(term236349, term236349.getClass(), "totalBasicDeluxscore", 6216563288198425050L);
        setLongField(term236349, term236349.getClass(), "totalAdvancedDeluxscore", 5115792555939417744L);
        setLongField(term236349, term236349.getClass(), "totalExpertDeluxscore", -6423809871120776825L);
        setLongField(term236349, term236349.getClass(), "totalMasterDeluxscore", 919517685710364664L);
        setLongField(term236349, term236349.getClass(), "totalReMasterDeluxscore", 4757880362679397439L);
        setIntField(term236349, term236349.getClass(), "totalSync", 1816024796);
        setIntField(term236349, term236349.getClass(), "totalBasicSync", -499700559);
        setIntField(term236349, term236349.getClass(), "totalAdvancedSync", 1679845201);
        setIntField(term236349, term236349.getClass(), "totalExpertSync", 2066635240);
        setIntField(term236349, term236349.getClass(), "totalMasterSync", 403819364);
        setIntField(term236349, term236349.getClass(), "totalReMasterSync", -511361821);
        setLongField(term236349, term236349.getClass(), "totalAchievement", 199962027033346897L);
        setLongField(term236349, term236349.getClass(), "totalBasicAchievement", -1930446810556827108L);
        setLongField(term236349, term236349.getClass(), "totalAdvancedAchievement", -6571677302957237750L);
        setLongField(term236349, term236349.getClass(), "totalExpertAchievement", -1266972511083779048L);
        setLongField(term236349, term236349.getClass(), "totalMasterAchievement", -5684915513934212085L);
        setLongField(term236349, term236349.getClass(), "totalReMasterAchievement", 2578504569388169682L);
        setLongField(term236349, term236349.getClass(), "playerOldRating", -2925538166644968167L);
        setLongField(term236349, term236349.getClass(), "playerNewRating", -1285327709543010415L);
        setIntField(term236349, term236349.getClass(), "banState", 743737267);
        setLongField(term236349, term236349.getClass(), "dateTime", 5069719888200469631L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalReMasterAchievement", argTypes, term236349, args);
    }

};


