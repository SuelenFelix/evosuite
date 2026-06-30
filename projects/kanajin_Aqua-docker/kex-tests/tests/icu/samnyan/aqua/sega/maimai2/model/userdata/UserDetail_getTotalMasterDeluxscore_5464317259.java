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

public class UserDetail_getTotalMasterDeluxscore_5464317259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4262911;

    public UserDetail_getTotalMasterDeluxscore_5464317259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4262915 = new Long(-5013725726051891709L);
        Integer term4262978 = new Integer(-381558021);
        Integer term4262980 = new Integer(1819668222);
        Integer term4262982 = new Integer(655578194);
        Integer term4262984 = new Integer(132693406);
        ArrayList term4262976 = new ArrayList();
        ((ArrayList) term4262976).add(term4262978);
        ((ArrayList) term4262976).add(term4262980);
        ((ArrayList) term4262976).add(term4262982);
        ((ArrayList) term4262976).add(term4262984);
        Integer term4262990 = new Integer(-1100588127);
        Integer term4262992 = new Integer(1035089895);
        Integer term4262994 = new Integer(4217888);
        ArrayList term4262988 = new ArrayList();
        ((ArrayList) term4262988).add(term4262990);
        ((ArrayList) term4262988).add(term4262992);
        ((ArrayList) term4262988).add(term4262994);
        term4262911 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4262913 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4262929 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4262930 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4262934 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4262939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4262940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4262944 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4262911, term4262911.getClass(), "id", -8642617505103789703L);
        setLongField(term4262913, term4262913.getClass(), "id", 953624822009997335L);
        setField(term4262913, term4262913.getClass(), "extId", term4262915);
        setField(term4262913, term4262913.getClass(), "luid", "dKiYDKrLKW");
        setIntField(term4262930, term4262930.getClass(), "year", 2010);
        setShortField(term4262930, term4262930.getClass(), "month", (short) 3);
        setShortField(term4262930, term4262930.getClass(), "day", (short) 2);
        setField(term4262929, term4262929.getClass(), "date", term4262930);
        setByteField(term4262934, term4262934.getClass(), "hour", (byte) 23);
        setByteField(term4262934, term4262934.getClass(), "minute", (byte) 57);
        setByteField(term4262934, term4262934.getClass(), "second", (byte) 24);
        setIntField(term4262934, term4262934.getClass(), "nano", 405042597);
        setField(term4262929, term4262929.getClass(), "time", term4262934);
        setField(term4262913, term4262913.getClass(), "registerTime", term4262929);
        setIntField(term4262940, term4262940.getClass(), "year", 2024);
        setShortField(term4262940, term4262940.getClass(), "month", (short) 9);
        setShortField(term4262940, term4262940.getClass(), "day", (short) 23);
        setField(term4262939, term4262939.getClass(), "date", term4262940);
        setByteField(term4262944, term4262944.getClass(), "hour", (byte) 11);
        setByteField(term4262944, term4262944.getClass(), "minute", (byte) 12);
        setByteField(term4262944, term4262944.getClass(), "second", (byte) 13);
        setIntField(term4262944, term4262944.getClass(), "nano", 915192374);
        setField(term4262939, term4262939.getClass(), "time", term4262944);
        setField(term4262913, term4262913.getClass(), "accessTime", term4262939);
        setField(term4262911, term4262911.getClass(), "card", term4262913);
        setField(term4262911, term4262911.getClass(), "userName", "WoMIdLlkKg");
        setIntField(term4262911, term4262911.getClass(), "isNetMember", -1698397258);
        setIntField(term4262911, term4262911.getClass(), "iconId", -731136174);
        setIntField(term4262911, term4262911.getClass(), "plateId", -1358276691);
        setIntField(term4262911, term4262911.getClass(), "titleId", 747608791);
        setIntField(term4262911, term4262911.getClass(), "partnerId", -1454822273);
        setIntField(term4262911, term4262911.getClass(), "frameId", 1551279438);
        setIntField(term4262911, term4262911.getClass(), "selectMapId", -1297901094);
        setIntField(term4262911, term4262911.getClass(), "totalAwake", -672970570);
        setIntField(term4262911, term4262911.getClass(), "gradeRating", 2144856880);
        setIntField(term4262911, term4262911.getClass(), "musicRating", 1719167435);
        setIntField(term4262911, term4262911.getClass(), "playerRating", -1562238978);
        setIntField(term4262911, term4262911.getClass(), "highestRating", -122937226);
        setIntField(term4262911, term4262911.getClass(), "gradeRank", 446505862);
        setIntField(term4262911, term4262911.getClass(), "classRank", -716848065);
        setIntField(term4262911, term4262911.getClass(), "courseRank", 303804140);
        setField(term4262911, term4262911.getClass(), "charaSlot", term4262976);
        setField(term4262911, term4262911.getClass(), "charaLockSlot", term4262988);
        setLongField(term4262911, term4262911.getClass(), "contentBit", -3852853591345149618L);
        setIntField(term4262911, term4262911.getClass(), "playCount", -1112967386);
        setField(term4262911, term4262911.getClass(), "eventWatchedDate", "qISAUPBDyg");
        setField(term4262911, term4262911.getClass(), "lastGameId", "nJfoLDgPvx");
        setField(term4262911, term4262911.getClass(), "lastRomVersion", "SAFZJXJGKY");
        setField(term4262911, term4262911.getClass(), "lastDataVersion", "wEHMNewbee");
        setField(term4262911, term4262911.getClass(), "lastLoginDate", "pxSdHCShVC");
        setField(term4262911, term4262911.getClass(), "lastPlayDate", "jzdnzCXcXw");
        setIntField(term4262911, term4262911.getClass(), "lastPlayCredit", -337751025);
        setIntField(term4262911, term4262911.getClass(), "lastPlayMode", -1900239983);
        setIntField(term4262911, term4262911.getClass(), "lastPlaceId", -1774826340);
        setField(term4262911, term4262911.getClass(), "lastPlaceName", "GqFGBamWKa");
        setIntField(term4262911, term4262911.getClass(), "lastAllNetId", 275043888);
        setIntField(term4262911, term4262911.getClass(), "lastRegionId", 495921188);
        setField(term4262911, term4262911.getClass(), "lastRegionName", "pzTHIkBpjP");
        setField(term4262911, term4262911.getClass(), "lastClientId", "SFXWCnLZLX");
        setField(term4262911, term4262911.getClass(), "lastCountryCode", "numHnhmYSw");
        setIntField(term4262911, term4262911.getClass(), "lastSelectEMoney", 2068712192);
        setIntField(term4262911, term4262911.getClass(), "lastSelectTicket", -855628478);
        setIntField(term4262911, term4262911.getClass(), "lastSelectCourse", -320963362);
        setIntField(term4262911, term4262911.getClass(), "lastCountCourse", -1076808426);
        setField(term4262911, term4262911.getClass(), "firstGameId", "MlxYsdqvME");
        setField(term4262911, term4262911.getClass(), "firstRomVersion", "WdLKTJedXc");
        setField(term4262911, term4262911.getClass(), "firstDataVersion", "LVXqSiAaxU");
        setField(term4262911, term4262911.getClass(), "firstPlayDate", "EdfAxDJPng");
        setField(term4262911, term4262911.getClass(), "compatibleCmVersion", "NAjaRbIgxx");
        setField(term4262911, term4262911.getClass(), "dailyBonusDate", "VMBQebxfRh");
        setField(term4262911, term4262911.getClass(), "dailyCourseBonusDate", "CcdoyGHBpx");
        setField(term4262911, term4262911.getClass(), "lastPairLoginDate", "LuAQqLOyqk");
        setField(term4262911, term4262911.getClass(), "lastTrialPlayDate", "iCfpDuVVMA");
        setIntField(term4262911, term4262911.getClass(), "playVsCount", -1706141372);
        setIntField(term4262911, term4262911.getClass(), "playSyncCount", -277336676);
        setIntField(term4262911, term4262911.getClass(), "winCount", -691931616);
        setIntField(term4262911, term4262911.getClass(), "helpCount", -141175129);
        setIntField(term4262911, term4262911.getClass(), "comboCount", 467688946);
        setLongField(term4262911, term4262911.getClass(), "totalDeluxscore", -7263197324653428277L);
        setLongField(term4262911, term4262911.getClass(), "totalBasicDeluxscore", -203558344017312600L);
        setLongField(term4262911, term4262911.getClass(), "totalAdvancedDeluxscore", -6125428572923573890L);
        setLongField(term4262911, term4262911.getClass(), "totalExpertDeluxscore", -6123979280325625801L);
        setLongField(term4262911, term4262911.getClass(), "totalMasterDeluxscore", 4969321974594668119L);
        setLongField(term4262911, term4262911.getClass(), "totalReMasterDeluxscore", -7291093821998840417L);
        setIntField(term4262911, term4262911.getClass(), "totalSync", -2142366069);
        setIntField(term4262911, term4262911.getClass(), "totalBasicSync", -14170484);
        setIntField(term4262911, term4262911.getClass(), "totalAdvancedSync", -132325700);
        setIntField(term4262911, term4262911.getClass(), "totalExpertSync", 2142363940);
        setIntField(term4262911, term4262911.getClass(), "totalMasterSync", 120940005);
        setIntField(term4262911, term4262911.getClass(), "totalReMasterSync", 1790277285);
        setLongField(term4262911, term4262911.getClass(), "totalAchievement", -985092213619414487L);
        setLongField(term4262911, term4262911.getClass(), "totalBasicAchievement", -9113845121907581317L);
        setLongField(term4262911, term4262911.getClass(), "totalAdvancedAchievement", -3261070423759100391L);
        setLongField(term4262911, term4262911.getClass(), "totalExpertAchievement", -8666883139705150556L);
        setLongField(term4262911, term4262911.getClass(), "totalMasterAchievement", 1647713617109591428L);
        setLongField(term4262911, term4262911.getClass(), "totalReMasterAchievement", -3971591648844827470L);
        setLongField(term4262911, term4262911.getClass(), "playerOldRating", 7172243674439734047L);
        setLongField(term4262911, term4262911.getClass(), "playerNewRating", 8513059206837203906L);
        setIntField(term4262911, term4262911.getClass(), "banState", 1988234319);
        setLongField(term4262911, term4262911.getClass(), "dateTime", -9199199806372950945L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterDeluxscore", argTypes, term4262911, args);
    }

};


