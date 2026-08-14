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

public class UserDetail_getTotalReMasterAchievement_93664770072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236294;

    public UserDetail_getTotalReMasterAchievement_93664770072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236298 = new Long(3643973882575578879L);
        Integer term236361 = new Integer(-1128978986);
        Integer term236363 = new Integer(192962115);
        Integer term236365 = new Integer(1531205463);
        Integer term236367 = new Integer(586115489);
        Integer term236369 = new Integer(1377331021);
        Integer term236371 = new Integer(1915536131);
        ArrayList term236359 = new ArrayList();
        ((ArrayList) term236359).add(term236361);
        ((ArrayList) term236359).add(term236363);
        ((ArrayList) term236359).add(term236365);
        ((ArrayList) term236359).add(term236367);
        ((ArrayList) term236359).add(term236369);
        ((ArrayList) term236359).add(term236371);
        Integer term236377 = new Integer(936561631);
        Integer term236379 = new Integer(-160474197);
        Integer term236381 = new Integer(279768924);
        ArrayList term236375 = new ArrayList();
        ((ArrayList) term236375).add(term236377);
        ((ArrayList) term236375).add(term236379);
        ((ArrayList) term236375).add(term236381);
        term236294 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term236296 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term236312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term236313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236317 = newInstance(Class.forName("java.time.LocalTime"));
        Object term236322 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term236323 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236327 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term236294, term236294.getClass(), "id", 218984008209321665L);
        setLongField(term236296, term236296.getClass(), "id", -7522319046970408025L);
        setField(term236296, term236296.getClass(), "extId", term236298);
        setField(term236296, term236296.getClass(), "luid", "pTbgOtvRFl");
        setIntField(term236313, term236313.getClass(), "year", 2026);
        setShortField(term236313, term236313.getClass(), "month", (short) 6);
        setShortField(term236313, term236313.getClass(), "day", (short) 16);
        setField(term236312, term236312.getClass(), "date", term236313);
        setByteField(term236317, term236317.getClass(), "hour", (byte) 23);
        setByteField(term236317, term236317.getClass(), "minute", (byte) 43);
        setByteField(term236317, term236317.getClass(), "second", (byte) 38);
        setIntField(term236317, term236317.getClass(), "nano", 395188532);
        setField(term236312, term236312.getClass(), "time", term236317);
        setField(term236296, term236296.getClass(), "registerTime", term236312);
        setIntField(term236323, term236323.getClass(), "year", 2010);
        setShortField(term236323, term236323.getClass(), "month", (short) 12);
        setShortField(term236323, term236323.getClass(), "day", (short) 4);
        setField(term236322, term236322.getClass(), "date", term236323);
        setByteField(term236327, term236327.getClass(), "hour", (byte) 18);
        setByteField(term236327, term236327.getClass(), "minute", (byte) 23);
        setByteField(term236327, term236327.getClass(), "second", (byte) 50);
        setIntField(term236327, term236327.getClass(), "nano", 773671553);
        setField(term236322, term236322.getClass(), "time", term236327);
        setField(term236296, term236296.getClass(), "accessTime", term236322);
        setField(term236294, term236294.getClass(), "card", term236296);
        setField(term236294, term236294.getClass(), "userName", "uYsCAnuGyO");
        setIntField(term236294, term236294.getClass(), "isNetMember", -997394743);
        setIntField(term236294, term236294.getClass(), "iconId", -2121530653);
        setIntField(term236294, term236294.getClass(), "plateId", 1319282638);
        setIntField(term236294, term236294.getClass(), "titleId", -949477062);
        setIntField(term236294, term236294.getClass(), "partnerId", -1991471366);
        setIntField(term236294, term236294.getClass(), "frameId", -951732964);
        setIntField(term236294, term236294.getClass(), "selectMapId", 810582577);
        setIntField(term236294, term236294.getClass(), "totalAwake", -481913428);
        setIntField(term236294, term236294.getClass(), "gradeRating", 1878857053);
        setIntField(term236294, term236294.getClass(), "musicRating", -1703968608);
        setIntField(term236294, term236294.getClass(), "playerRating", -1516989582);
        setIntField(term236294, term236294.getClass(), "highestRating", -1473571403);
        setIntField(term236294, term236294.getClass(), "gradeRank", -33345447);
        setIntField(term236294, term236294.getClass(), "classRank", -473865390);
        setIntField(term236294, term236294.getClass(), "courseRank", 1560849509);
        setField(term236294, term236294.getClass(), "charaSlot", term236359);
        setField(term236294, term236294.getClass(), "charaLockSlot", term236375);
        setLongField(term236294, term236294.getClass(), "contentBit", -5590687905785932678L);
        setIntField(term236294, term236294.getClass(), "playCount", 548082671);
        setField(term236294, term236294.getClass(), "eventWatchedDate", "iHpqtMMAFo");
        setField(term236294, term236294.getClass(), "lastGameId", "AzJPrFTejS");
        setField(term236294, term236294.getClass(), "lastRomVersion", "WqNyoizhju");
        setField(term236294, term236294.getClass(), "lastDataVersion", "SyBEMBeZJe");
        setField(term236294, term236294.getClass(), "lastLoginDate", "UpFaZAcdPU");
        setField(term236294, term236294.getClass(), "lastPlayDate", "WLooWdtMun");
        setIntField(term236294, term236294.getClass(), "lastPlayCredit", 143341138);
        setIntField(term236294, term236294.getClass(), "lastPlayMode", 673245946);
        setIntField(term236294, term236294.getClass(), "lastPlaceId", -425351471);
        setField(term236294, term236294.getClass(), "lastPlaceName", "nMoLefpNTs");
        setIntField(term236294, term236294.getClass(), "lastAllNetId", -1117580978);
        setIntField(term236294, term236294.getClass(), "lastRegionId", 208521517);
        setField(term236294, term236294.getClass(), "lastRegionName", "bScsAMGfKs");
        setField(term236294, term236294.getClass(), "lastClientId", "GSFfACqjye");
        setField(term236294, term236294.getClass(), "lastCountryCode", "WNiXGNcYjm");
        setIntField(term236294, term236294.getClass(), "lastSelectEMoney", 778044540);
        setIntField(term236294, term236294.getClass(), "lastSelectTicket", -803580264);
        setIntField(term236294, term236294.getClass(), "lastSelectCourse", 131178867);
        setIntField(term236294, term236294.getClass(), "lastCountCourse", -255580652);
        setField(term236294, term236294.getClass(), "firstGameId", "nmtwfmagfX");
        setField(term236294, term236294.getClass(), "firstRomVersion", "kiIMTOKJXF");
        setField(term236294, term236294.getClass(), "firstDataVersion", "LVSwXfrvcg");
        setField(term236294, term236294.getClass(), "firstPlayDate", "ewjLmrzsVO");
        setField(term236294, term236294.getClass(), "compatibleCmVersion", "ViYeKNhFKg");
        setField(term236294, term236294.getClass(), "dailyBonusDate", "SXFyTzXeaj");
        setField(term236294, term236294.getClass(), "dailyCourseBonusDate", "gRfwDGnUeI");
        setField(term236294, term236294.getClass(), "lastPairLoginDate", "AzIgoJKPKf");
        setField(term236294, term236294.getClass(), "lastTrialPlayDate", "DoekyfIrat");
        setIntField(term236294, term236294.getClass(), "playVsCount", -1732441524);
        setIntField(term236294, term236294.getClass(), "playSyncCount", -130160357);
        setIntField(term236294, term236294.getClass(), "winCount", -1813127102);
        setIntField(term236294, term236294.getClass(), "helpCount", -838128266);
        setIntField(term236294, term236294.getClass(), "comboCount", 61916705);
        setLongField(term236294, term236294.getClass(), "totalDeluxscore", -5818970464137804543L);
        setLongField(term236294, term236294.getClass(), "totalBasicDeluxscore", 6216563288198425050L);
        setLongField(term236294, term236294.getClass(), "totalAdvancedDeluxscore", 5115792555939417744L);
        setLongField(term236294, term236294.getClass(), "totalExpertDeluxscore", -6423809871120776825L);
        setLongField(term236294, term236294.getClass(), "totalMasterDeluxscore", 919517685710364664L);
        setLongField(term236294, term236294.getClass(), "totalReMasterDeluxscore", 4757880362679397439L);
        setIntField(term236294, term236294.getClass(), "totalSync", 1816024796);
        setIntField(term236294, term236294.getClass(), "totalBasicSync", -499700559);
        setIntField(term236294, term236294.getClass(), "totalAdvancedSync", 1679845201);
        setIntField(term236294, term236294.getClass(), "totalExpertSync", 2066635240);
        setIntField(term236294, term236294.getClass(), "totalMasterSync", 403819364);
        setIntField(term236294, term236294.getClass(), "totalReMasterSync", -511361821);
        setLongField(term236294, term236294.getClass(), "totalAchievement", 199962027033346897L);
        setLongField(term236294, term236294.getClass(), "totalBasicAchievement", -1930446810556827108L);
        setLongField(term236294, term236294.getClass(), "totalAdvancedAchievement", -6571677302957237750L);
        setLongField(term236294, term236294.getClass(), "totalExpertAchievement", -1266972511083779048L);
        setLongField(term236294, term236294.getClass(), "totalMasterAchievement", -5684915513934212085L);
        setLongField(term236294, term236294.getClass(), "totalReMasterAchievement", 2578504569388169682L);
        setLongField(term236294, term236294.getClass(), "playerOldRating", -2925538166644968167L);
        setLongField(term236294, term236294.getClass(), "playerNewRating", -1285327709543010415L);
        setIntField(term236294, term236294.getClass(), "banState", 743737267);
        setLongField(term236294, term236294.getClass(), "dateTime", 5069719888200469631L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalReMasterAchievement", argTypes, term236294, args);
    }

};


