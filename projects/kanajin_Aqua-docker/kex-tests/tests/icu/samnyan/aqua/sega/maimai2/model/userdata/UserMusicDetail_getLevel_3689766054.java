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

public class UserMusicDetail_getLevel_3689766054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57251;

    public UserMusicDetail_getLevel_3689766054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57257 = new Long(6689117472719450333L);
        ArrayList term57318 = new ArrayList();
        Integer term57324 = new Integer(376834234);
        Integer term57326 = new Integer(-1911972560);
        Integer term57328 = new Integer(-642716895);
        Integer term57330 = new Integer(1743398246);
        Integer term57332 = new Integer(-934658823);
        Integer term57334 = new Integer(1632177303);
        Integer term57336 = new Integer(-802592348);
        ArrayList term57322 = new ArrayList();
        ((ArrayList) term57322).add(term57324);
        ((ArrayList) term57322).add(term57326);
        ((ArrayList) term57322).add(term57328);
        ((ArrayList) term57322).add(term57330);
        ((ArrayList) term57322).add(term57332);
        ((ArrayList) term57322).add(term57334);
        ((ArrayList) term57322).add(term57336);
        term57251 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term57253 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term57255 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term57271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57276 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57286 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term57251, term57251.getClass(), "id", -1719297732277781462L);
        setLongField(term57253, term57253.getClass(), "id", 2341406897372304425L);
        setLongField(term57255, term57255.getClass(), "id", -2558783251634097471L);
        setField(term57255, term57255.getClass(), "extId", term57257);
        setField(term57255, term57255.getClass(), "luid", "RlIgxHiNOB");
        setIntField(term57272, term57272.getClass(), "year", 2013);
        setShortField(term57272, term57272.getClass(), "month", (short) 10);
        setShortField(term57272, term57272.getClass(), "day", (short) 7);
        setField(term57271, term57271.getClass(), "date", term57272);
        setByteField(term57276, term57276.getClass(), "hour", (byte) 12);
        setByteField(term57276, term57276.getClass(), "minute", (byte) 2);
        setByteField(term57276, term57276.getClass(), "second", (byte) 42);
        setIntField(term57276, term57276.getClass(), "nano", 202308437);
        setField(term57271, term57271.getClass(), "time", term57276);
        setField(term57255, term57255.getClass(), "registerTime", term57271);
        setIntField(term57282, term57282.getClass(), "year", 2019);
        setShortField(term57282, term57282.getClass(), "month", (short) 12);
        setShortField(term57282, term57282.getClass(), "day", (short) 29);
        setField(term57281, term57281.getClass(), "date", term57282);
        setByteField(term57286, term57286.getClass(), "hour", (byte) 16);
        setByteField(term57286, term57286.getClass(), "minute", (byte) 10);
        setByteField(term57286, term57286.getClass(), "second", (byte) 1);
        setIntField(term57286, term57286.getClass(), "nano", 198559584);
        setField(term57281, term57281.getClass(), "time", term57286);
        setField(term57255, term57255.getClass(), "accessTime", term57281);
        setField(term57253, term57253.getClass(), "card", term57255);
        setField(term57253, term57253.getClass(), "userName", "kSpBCSqyfl");
        setIntField(term57253, term57253.getClass(), "isNetMember", 1496015170);
        setIntField(term57253, term57253.getClass(), "iconId", 412507839);
        setIntField(term57253, term57253.getClass(), "plateId", -143522206);
        setIntField(term57253, term57253.getClass(), "titleId", 70726858);
        setIntField(term57253, term57253.getClass(), "partnerId", -1883665560);
        setIntField(term57253, term57253.getClass(), "frameId", -1304361419);
        setIntField(term57253, term57253.getClass(), "selectMapId", -1253063552);
        setIntField(term57253, term57253.getClass(), "totalAwake", 11874750);
        setIntField(term57253, term57253.getClass(), "gradeRating", -920088882);
        setIntField(term57253, term57253.getClass(), "musicRating", -1963888580);
        setIntField(term57253, term57253.getClass(), "playerRating", 885969140);
        setIntField(term57253, term57253.getClass(), "highestRating", -573115224);
        setIntField(term57253, term57253.getClass(), "gradeRank", 716083613);
        setIntField(term57253, term57253.getClass(), "classRank", 236114197);
        setIntField(term57253, term57253.getClass(), "courseRank", -1633292626);
        setField(term57253, term57253.getClass(), "charaSlot", term57318);
        setField(term57253, term57253.getClass(), "charaLockSlot", term57322);
        setLongField(term57253, term57253.getClass(), "contentBit", -1057119189849263277L);
        setIntField(term57253, term57253.getClass(), "playCount", 689769597);
        setField(term57253, term57253.getClass(), "eventWatchedDate", "OUrtbTvuiW");
        setField(term57253, term57253.getClass(), "lastGameId", "UnkpYLSsCR");
        setField(term57253, term57253.getClass(), "lastRomVersion", "AaxnITALtd");
        setField(term57253, term57253.getClass(), "lastDataVersion", "RdnRRpWglh");
        setField(term57253, term57253.getClass(), "lastLoginDate", "YcXTXuOFYV");
        setField(term57253, term57253.getClass(), "lastPlayDate", "HGhIlMCaKM");
        setIntField(term57253, term57253.getClass(), "lastPlayCredit", -1219602723);
        setIntField(term57253, term57253.getClass(), "lastPlayMode", 1668201364);
        setIntField(term57253, term57253.getClass(), "lastPlaceId", -548343635);
        setField(term57253, term57253.getClass(), "lastPlaceName", "pPxivEPfHY");
        setIntField(term57253, term57253.getClass(), "lastAllNetId", -590979324);
        setIntField(term57253, term57253.getClass(), "lastRegionId", -1745427158);
        setField(term57253, term57253.getClass(), "lastRegionName", "BiitfiJmRW");
        setField(term57253, term57253.getClass(), "lastClientId", "ILHarzuGbn");
        setField(term57253, term57253.getClass(), "lastCountryCode", "uNGHHAwCFL");
        setIntField(term57253, term57253.getClass(), "lastSelectEMoney", 1516032954);
        setIntField(term57253, term57253.getClass(), "lastSelectTicket", -1945165354);
        setIntField(term57253, term57253.getClass(), "lastSelectCourse", 14341670);
        setIntField(term57253, term57253.getClass(), "lastCountCourse", -144022361);
        setField(term57253, term57253.getClass(), "firstGameId", "fbshyuUfqy");
        setField(term57253, term57253.getClass(), "firstRomVersion", "eupNcihLEw");
        setField(term57253, term57253.getClass(), "firstDataVersion", "iFFcolxwcm");
        setField(term57253, term57253.getClass(), "firstPlayDate", "bAsZBSqnyM");
        setField(term57253, term57253.getClass(), "compatibleCmVersion", "urrmpQzmTU");
        setField(term57253, term57253.getClass(), "dailyBonusDate", "GWoZyTTlNx");
        setField(term57253, term57253.getClass(), "dailyCourseBonusDate", "ntUYcalSmz");
        setField(term57253, term57253.getClass(), "lastPairLoginDate", "lnZXLpyQoO");
        setField(term57253, term57253.getClass(), "lastTrialPlayDate", "lOIEIGbwPj");
        setIntField(term57253, term57253.getClass(), "playVsCount", -1419212893);
        setIntField(term57253, term57253.getClass(), "playSyncCount", -457189882);
        setIntField(term57253, term57253.getClass(), "winCount", -1227023001);
        setIntField(term57253, term57253.getClass(), "helpCount", -622827471);
        setIntField(term57253, term57253.getClass(), "comboCount", -1759579486);
        setLongField(term57253, term57253.getClass(), "totalDeluxscore", -8704154300958772604L);
        setLongField(term57253, term57253.getClass(), "totalBasicDeluxscore", -4450089717153471904L);
        setLongField(term57253, term57253.getClass(), "totalAdvancedDeluxscore", 8555372807363389523L);
        setLongField(term57253, term57253.getClass(), "totalExpertDeluxscore", 4135693817001955957L);
        setLongField(term57253, term57253.getClass(), "totalMasterDeluxscore", -3822804973679381574L);
        setLongField(term57253, term57253.getClass(), "totalReMasterDeluxscore", 8503915599730893579L);
        setIntField(term57253, term57253.getClass(), "totalSync", 147748970);
        setIntField(term57253, term57253.getClass(), "totalBasicSync", -459525196);
        setIntField(term57253, term57253.getClass(), "totalAdvancedSync", 2129073623);
        setIntField(term57253, term57253.getClass(), "totalExpertSync", -1623896406);
        setIntField(term57253, term57253.getClass(), "totalMasterSync", -1767855347);
        setIntField(term57253, term57253.getClass(), "totalReMasterSync", 2061882718);
        setLongField(term57253, term57253.getClass(), "totalAchievement", 995860001169768274L);
        setLongField(term57253, term57253.getClass(), "totalBasicAchievement", 1369830788516662006L);
        setLongField(term57253, term57253.getClass(), "totalAdvancedAchievement", 6127011005231905639L);
        setLongField(term57253, term57253.getClass(), "totalExpertAchievement", -8925131548818125405L);
        setLongField(term57253, term57253.getClass(), "totalMasterAchievement", 5793505030039838427L);
        setLongField(term57253, term57253.getClass(), "totalReMasterAchievement", 104869345921695905L);
        setLongField(term57253, term57253.getClass(), "playerOldRating", -5803631481953709495L);
        setLongField(term57253, term57253.getClass(), "playerNewRating", -4983190578576857758L);
        setIntField(term57253, term57253.getClass(), "banState", -263593334);
        setLongField(term57253, term57253.getClass(), "dateTime", 1551212309300619628L);
        setField(term57251, term57251.getClass(), "user", term57253);
        setIntField(term57251, term57251.getClass(), "musicId", 257595375);
        setIntField(term57251, term57251.getClass(), "level", 1494109106);
        setIntField(term57251, term57251.getClass(), "playCount", 1902576230);
        setIntField(term57251, term57251.getClass(), "achievement", -1040460528);
        setIntField(term57251, term57251.getClass(), "comboStatus", 990725836);
        setIntField(term57251, term57251.getClass(), "syncStatus", -1231785501);
        setIntField(term57251, term57251.getClass(), "deluxscoreMax", -2112346885);
        setIntField(term57251, term57251.getClass(), "scoreRank", -26311618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term57251, args);
    }

};


