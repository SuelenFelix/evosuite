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

public class UserMusicDetail_getSyncStatus_14369427988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59567;

    public UserMusicDetail_getSyncStatus_14369427988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term59573 = new Long(3133860696238261492L);
        Integer term59636 = new Integer(-1286686332);
        Integer term59638 = new Integer(-284885486);
        Integer term59640 = new Integer(1791984446);
        Integer term59642 = new Integer(804070622);
        Integer term59644 = new Integer(1850364894);
        ArrayList term59634 = new ArrayList();
        ((ArrayList) term59634).add(term59636);
        ((ArrayList) term59634).add(term59638);
        ((ArrayList) term59634).add(term59640);
        ((ArrayList) term59634).add(term59642);
        ((ArrayList) term59634).add(term59644);
        Integer term59650 = new Integer(915367534);
        Integer term59652 = new Integer(1949983666);
        Integer term59654 = new Integer(154111854);
        Integer term59656 = new Integer(710986341);
        Integer term59658 = new Integer(-873958002);
        Integer term59660 = new Integer(-1780848958);
        Integer term59662 = new Integer(1235045850);
        Integer term59664 = new Integer(-75143033);
        ArrayList term59648 = new ArrayList();
        ((ArrayList) term59648).add(term59650);
        ((ArrayList) term59648).add(term59652);
        ((ArrayList) term59648).add(term59654);
        ((ArrayList) term59648).add(term59656);
        ((ArrayList) term59648).add(term59658);
        ((ArrayList) term59648).add(term59660);
        ((ArrayList) term59648).add(term59662);
        ((ArrayList) term59648).add(term59664);
        term59567 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term59569 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term59571 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term59587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59592 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59597 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59598 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59602 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term59567, term59567.getClass(), "id", -640045267052655713L);
        setLongField(term59569, term59569.getClass(), "id", -2692345938390249037L);
        setLongField(term59571, term59571.getClass(), "id", -5292926065434569211L);
        setField(term59571, term59571.getClass(), "extId", term59573);
        setField(term59571, term59571.getClass(), "luid", "fcLnKXxzfM");
        setIntField(term59588, term59588.getClass(), "year", 2020);
        setShortField(term59588, term59588.getClass(), "month", (short) 12);
        setShortField(term59588, term59588.getClass(), "day", (short) 30);
        setField(term59587, term59587.getClass(), "date", term59588);
        setByteField(term59592, term59592.getClass(), "hour", (byte) 2);
        setByteField(term59592, term59592.getClass(), "minute", (byte) 11);
        setByteField(term59592, term59592.getClass(), "second", (byte) 8);
        setIntField(term59592, term59592.getClass(), "nano", 528799251);
        setField(term59587, term59587.getClass(), "time", term59592);
        setField(term59571, term59571.getClass(), "registerTime", term59587);
        setIntField(term59598, term59598.getClass(), "year", 2027);
        setShortField(term59598, term59598.getClass(), "month", (short) 9);
        setShortField(term59598, term59598.getClass(), "day", (short) 29);
        setField(term59597, term59597.getClass(), "date", term59598);
        setByteField(term59602, term59602.getClass(), "hour", (byte) 19);
        setByteField(term59602, term59602.getClass(), "minute", (byte) 13);
        setByteField(term59602, term59602.getClass(), "second", (byte) 31);
        setIntField(term59602, term59602.getClass(), "nano", 854066575);
        setField(term59597, term59597.getClass(), "time", term59602);
        setField(term59571, term59571.getClass(), "accessTime", term59597);
        setField(term59569, term59569.getClass(), "card", term59571);
        setField(term59569, term59569.getClass(), "userName", "FtyaWnfsgn");
        setIntField(term59569, term59569.getClass(), "isNetMember", -1122695171);
        setIntField(term59569, term59569.getClass(), "iconId", -1304945951);
        setIntField(term59569, term59569.getClass(), "plateId", 1324880713);
        setIntField(term59569, term59569.getClass(), "titleId", -331841554);
        setIntField(term59569, term59569.getClass(), "partnerId", 913848623);
        setIntField(term59569, term59569.getClass(), "frameId", 1449221084);
        setIntField(term59569, term59569.getClass(), "selectMapId", -217809217);
        setIntField(term59569, term59569.getClass(), "totalAwake", -473949548);
        setIntField(term59569, term59569.getClass(), "gradeRating", 1898831696);
        setIntField(term59569, term59569.getClass(), "musicRating", 1811064455);
        setIntField(term59569, term59569.getClass(), "playerRating", 1183674366);
        setIntField(term59569, term59569.getClass(), "highestRating", 2120314865);
        setIntField(term59569, term59569.getClass(), "gradeRank", -1783088801);
        setIntField(term59569, term59569.getClass(), "classRank", 353452001);
        setIntField(term59569, term59569.getClass(), "courseRank", -1160759211);
        setField(term59569, term59569.getClass(), "charaSlot", term59634);
        setField(term59569, term59569.getClass(), "charaLockSlot", term59648);
        setLongField(term59569, term59569.getClass(), "contentBit", 346757673772711087L);
        setIntField(term59569, term59569.getClass(), "playCount", 118302577);
        setField(term59569, term59569.getClass(), "eventWatchedDate", "qphbpPdwrD");
        setField(term59569, term59569.getClass(), "lastGameId", "xHdHafzFSM");
        setField(term59569, term59569.getClass(), "lastRomVersion", "fAsiOEKVaH");
        setField(term59569, term59569.getClass(), "lastDataVersion", "EltrILhEwT");
        setField(term59569, term59569.getClass(), "lastLoginDate", "wCcSeUJzhg");
        setField(term59569, term59569.getClass(), "lastPlayDate", "HlVHAsOBmJ");
        setIntField(term59569, term59569.getClass(), "lastPlayCredit", -1192086944);
        setIntField(term59569, term59569.getClass(), "lastPlayMode", 1689097670);
        setIntField(term59569, term59569.getClass(), "lastPlaceId", -229058840);
        setField(term59569, term59569.getClass(), "lastPlaceName", "nyThJEXHhd");
        setIntField(term59569, term59569.getClass(), "lastAllNetId", -445086770);
        setIntField(term59569, term59569.getClass(), "lastRegionId", 1555977804);
        setField(term59569, term59569.getClass(), "lastRegionName", "TRfRRMMCZw");
        setField(term59569, term59569.getClass(), "lastClientId", "rwbfUcOMVc");
        setField(term59569, term59569.getClass(), "lastCountryCode", "ljTkNgJRUl");
        setIntField(term59569, term59569.getClass(), "lastSelectEMoney", -1039875364);
        setIntField(term59569, term59569.getClass(), "lastSelectTicket", -908724029);
        setIntField(term59569, term59569.getClass(), "lastSelectCourse", 1122198417);
        setIntField(term59569, term59569.getClass(), "lastCountCourse", 1853596233);
        setField(term59569, term59569.getClass(), "firstGameId", "siRXAywvyp");
        setField(term59569, term59569.getClass(), "firstRomVersion", "ZRLaReQeFg");
        setField(term59569, term59569.getClass(), "firstDataVersion", "cOcXspUxKR");
        setField(term59569, term59569.getClass(), "firstPlayDate", "JNzgWUmqtl");
        setField(term59569, term59569.getClass(), "compatibleCmVersion", "UxVfWaXiSr");
        setField(term59569, term59569.getClass(), "dailyBonusDate", "yTrvklotrs");
        setField(term59569, term59569.getClass(), "dailyCourseBonusDate", "kNkFIdfwqs");
        setField(term59569, term59569.getClass(), "lastPairLoginDate", "sHLdqoTjnP");
        setField(term59569, term59569.getClass(), "lastTrialPlayDate", "UakuVGzEav");
        setIntField(term59569, term59569.getClass(), "playVsCount", 995880114);
        setIntField(term59569, term59569.getClass(), "playSyncCount", -375101902);
        setIntField(term59569, term59569.getClass(), "winCount", -400603688);
        setIntField(term59569, term59569.getClass(), "helpCount", 2063246363);
        setIntField(term59569, term59569.getClass(), "comboCount", 1989206053);
        setLongField(term59569, term59569.getClass(), "totalDeluxscore", -1912308523656007793L);
        setLongField(term59569, term59569.getClass(), "totalBasicDeluxscore", 1577272117979272714L);
        setLongField(term59569, term59569.getClass(), "totalAdvancedDeluxscore", 2167034694898722303L);
        setLongField(term59569, term59569.getClass(), "totalExpertDeluxscore", 5116667900739377769L);
        setLongField(term59569, term59569.getClass(), "totalMasterDeluxscore", 7850317217678882393L);
        setLongField(term59569, term59569.getClass(), "totalReMasterDeluxscore", -166310229318189286L);
        setIntField(term59569, term59569.getClass(), "totalSync", 68383055);
        setIntField(term59569, term59569.getClass(), "totalBasicSync", -2072291494);
        setIntField(term59569, term59569.getClass(), "totalAdvancedSync", 1818270937);
        setIntField(term59569, term59569.getClass(), "totalExpertSync", -1309831162);
        setIntField(term59569, term59569.getClass(), "totalMasterSync", 711539163);
        setIntField(term59569, term59569.getClass(), "totalReMasterSync", 351652776);
        setLongField(term59569, term59569.getClass(), "totalAchievement", 1735840139746449096L);
        setLongField(term59569, term59569.getClass(), "totalBasicAchievement", 2159730973728155805L);
        setLongField(term59569, term59569.getClass(), "totalAdvancedAchievement", -1486135171566437695L);
        setLongField(term59569, term59569.getClass(), "totalExpertAchievement", 5383609177501042021L);
        setLongField(term59569, term59569.getClass(), "totalMasterAchievement", 2779814845687231848L);
        setLongField(term59569, term59569.getClass(), "totalReMasterAchievement", -6273351477363617569L);
        setLongField(term59569, term59569.getClass(), "playerOldRating", -5620682754269520333L);
        setLongField(term59569, term59569.getClass(), "playerNewRating", 9215348305313170099L);
        setIntField(term59569, term59569.getClass(), "banState", 319658723);
        setLongField(term59569, term59569.getClass(), "dateTime", -785087035950801971L);
        setField(term59567, term59567.getClass(), "user", term59569);
        setIntField(term59567, term59567.getClass(), "musicId", 1315068409);
        setIntField(term59567, term59567.getClass(), "level", 1002887761);
        setIntField(term59567, term59567.getClass(), "playCount", 38995637);
        setIntField(term59567, term59567.getClass(), "achievement", -2106212589);
        setIntField(term59567, term59567.getClass(), "comboStatus", 1881486751);
        setIntField(term59567, term59567.getClass(), "syncStatus", -92679624);
        setIntField(term59567, term59567.getClass(), "deluxscoreMax", 935287448);
        setIntField(term59567, term59567.getClass(), "scoreRank", -315809486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSyncStatus", argTypes, term59567, args);
    }

};


