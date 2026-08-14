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

public class UserDetail_getTotalMasterSync_191374247765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232333;

    public UserDetail_getTotalMasterSync_191374247765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term232337 = new Long(-6771377873268167033L);
        Integer term232400 = new Integer(-666074929);
        Integer term232402 = new Integer(1263172764);
        Integer term232404 = new Integer(294155442);
        ArrayList term232398 = new ArrayList();
        ((ArrayList) term232398).add(term232400);
        ((ArrayList) term232398).add(term232402);
        ((ArrayList) term232398).add(term232404);
        Integer term232410 = new Integer(-790860079);
        Integer term232412 = new Integer(52653332);
        Integer term232414 = new Integer(605369567);
        Integer term232416 = new Integer(662969700);
        Integer term232418 = new Integer(-907171757);
        Integer term232420 = new Integer(1041315057);
        Integer term232422 = new Integer(5602462);
        ArrayList term232408 = new ArrayList();
        ((ArrayList) term232408).add(term232410);
        ((ArrayList) term232408).add(term232412);
        ((ArrayList) term232408).add(term232414);
        ((ArrayList) term232408).add(term232416);
        ((ArrayList) term232408).add(term232418);
        ((ArrayList) term232408).add(term232420);
        ((ArrayList) term232408).add(term232422);
        term232333 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term232335 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term232351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term232361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232366 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term232333, term232333.getClass(), "id", -790773781296622829L);
        setLongField(term232335, term232335.getClass(), "id", 2766432648605092542L);
        setField(term232335, term232335.getClass(), "extId", term232337);
        setField(term232335, term232335.getClass(), "luid", "RZwoyRjDOK");
        setIntField(term232352, term232352.getClass(), "year", 2029);
        setShortField(term232352, term232352.getClass(), "month", (short) 7);
        setShortField(term232352, term232352.getClass(), "day", (short) 8);
        setField(term232351, term232351.getClass(), "date", term232352);
        setByteField(term232356, term232356.getClass(), "hour", (byte) 17);
        setByteField(term232356, term232356.getClass(), "minute", (byte) 0);
        setByteField(term232356, term232356.getClass(), "second", (byte) 26);
        setIntField(term232356, term232356.getClass(), "nano", 789866170);
        setField(term232351, term232351.getClass(), "time", term232356);
        setField(term232335, term232335.getClass(), "registerTime", term232351);
        setIntField(term232362, term232362.getClass(), "year", 2010);
        setShortField(term232362, term232362.getClass(), "month", (short) 3);
        setShortField(term232362, term232362.getClass(), "day", (short) 28);
        setField(term232361, term232361.getClass(), "date", term232362);
        setByteField(term232366, term232366.getClass(), "hour", (byte) 22);
        setByteField(term232366, term232366.getClass(), "minute", (byte) 36);
        setByteField(term232366, term232366.getClass(), "second", (byte) 47);
        setIntField(term232366, term232366.getClass(), "nano", 84020683);
        setField(term232361, term232361.getClass(), "time", term232366);
        setField(term232335, term232335.getClass(), "accessTime", term232361);
        setField(term232333, term232333.getClass(), "card", term232335);
        setField(term232333, term232333.getClass(), "userName", "TinAcWXQIH");
        setIntField(term232333, term232333.getClass(), "isNetMember", -1723849008);
        setIntField(term232333, term232333.getClass(), "iconId", -5850264);
        setIntField(term232333, term232333.getClass(), "plateId", 1397968591);
        setIntField(term232333, term232333.getClass(), "titleId", 1636497723);
        setIntField(term232333, term232333.getClass(), "partnerId", 162449955);
        setIntField(term232333, term232333.getClass(), "frameId", -633552703);
        setIntField(term232333, term232333.getClass(), "selectMapId", -144541448);
        setIntField(term232333, term232333.getClass(), "totalAwake", 1604182220);
        setIntField(term232333, term232333.getClass(), "gradeRating", -1337178466);
        setIntField(term232333, term232333.getClass(), "musicRating", 1589240744);
        setIntField(term232333, term232333.getClass(), "playerRating", 1935113637);
        setIntField(term232333, term232333.getClass(), "highestRating", -792570091);
        setIntField(term232333, term232333.getClass(), "gradeRank", -840204320);
        setIntField(term232333, term232333.getClass(), "classRank", 571759309);
        setIntField(term232333, term232333.getClass(), "courseRank", -544118437);
        setField(term232333, term232333.getClass(), "charaSlot", term232398);
        setField(term232333, term232333.getClass(), "charaLockSlot", term232408);
        setLongField(term232333, term232333.getClass(), "contentBit", -7418127502854503493L);
        setIntField(term232333, term232333.getClass(), "playCount", -1070783506);
        setField(term232333, term232333.getClass(), "eventWatchedDate", "fAiOxsidjq");
        setField(term232333, term232333.getClass(), "lastGameId", "zZrLslNfIn");
        setField(term232333, term232333.getClass(), "lastRomVersion", "GqIrvlDQGl");
        setField(term232333, term232333.getClass(), "lastDataVersion", "OXxIPHzoVa");
        setField(term232333, term232333.getClass(), "lastLoginDate", "VABzGvaFoV");
        setField(term232333, term232333.getClass(), "lastPlayDate", "OJfzqZgyhr");
        setIntField(term232333, term232333.getClass(), "lastPlayCredit", 908939387);
        setIntField(term232333, term232333.getClass(), "lastPlayMode", 546442739);
        setIntField(term232333, term232333.getClass(), "lastPlaceId", 986125029);
        setField(term232333, term232333.getClass(), "lastPlaceName", "veGctJDCVu");
        setIntField(term232333, term232333.getClass(), "lastAllNetId", -242915796);
        setIntField(term232333, term232333.getClass(), "lastRegionId", 798178790);
        setField(term232333, term232333.getClass(), "lastRegionName", "qWiNHIOSQh");
        setField(term232333, term232333.getClass(), "lastClientId", "iyKXXnfbdP");
        setField(term232333, term232333.getClass(), "lastCountryCode", "GrnLzQSLgP");
        setIntField(term232333, term232333.getClass(), "lastSelectEMoney", 1885105361);
        setIntField(term232333, term232333.getClass(), "lastSelectTicket", 406483559);
        setIntField(term232333, term232333.getClass(), "lastSelectCourse", -882073821);
        setIntField(term232333, term232333.getClass(), "lastCountCourse", -1619724361);
        setField(term232333, term232333.getClass(), "firstGameId", "rSNlwQrRPz");
        setField(term232333, term232333.getClass(), "firstRomVersion", "xKEzbRMPpP");
        setField(term232333, term232333.getClass(), "firstDataVersion", "mxNOSqFuhi");
        setField(term232333, term232333.getClass(), "firstPlayDate", "PAZrXfKSSy");
        setField(term232333, term232333.getClass(), "compatibleCmVersion", "tsZmZiLwvf");
        setField(term232333, term232333.getClass(), "dailyBonusDate", "PcMXaJAFsa");
        setField(term232333, term232333.getClass(), "dailyCourseBonusDate", "prPCXDaclm");
        setField(term232333, term232333.getClass(), "lastPairLoginDate", "HpYrZqtpjz");
        setField(term232333, term232333.getClass(), "lastTrialPlayDate", "dHWPzCnTgu");
        setIntField(term232333, term232333.getClass(), "playVsCount", -448769991);
        setIntField(term232333, term232333.getClass(), "playSyncCount", -2115906125);
        setIntField(term232333, term232333.getClass(), "winCount", -1115852180);
        setIntField(term232333, term232333.getClass(), "helpCount", 410129937);
        setIntField(term232333, term232333.getClass(), "comboCount", -1826076292);
        setLongField(term232333, term232333.getClass(), "totalDeluxscore", 2056940966441733881L);
        setLongField(term232333, term232333.getClass(), "totalBasicDeluxscore", -5567998152506692170L);
        setLongField(term232333, term232333.getClass(), "totalAdvancedDeluxscore", 1588032528014963437L);
        setLongField(term232333, term232333.getClass(), "totalExpertDeluxscore", 5609222796474002227L);
        setLongField(term232333, term232333.getClass(), "totalMasterDeluxscore", -9190628802748301406L);
        setLongField(term232333, term232333.getClass(), "totalReMasterDeluxscore", 3603248734833458364L);
        setIntField(term232333, term232333.getClass(), "totalSync", 1375700443);
        setIntField(term232333, term232333.getClass(), "totalBasicSync", -1592779289);
        setIntField(term232333, term232333.getClass(), "totalAdvancedSync", -1382233254);
        setIntField(term232333, term232333.getClass(), "totalExpertSync", -52296693);
        setIntField(term232333, term232333.getClass(), "totalMasterSync", -1374309882);
        setIntField(term232333, term232333.getClass(), "totalReMasterSync", -1954550269);
        setLongField(term232333, term232333.getClass(), "totalAchievement", 6548056565582320757L);
        setLongField(term232333, term232333.getClass(), "totalBasicAchievement", 7497491354611378876L);
        setLongField(term232333, term232333.getClass(), "totalAdvancedAchievement", 349006973694791230L);
        setLongField(term232333, term232333.getClass(), "totalExpertAchievement", 7628536876459883328L);
        setLongField(term232333, term232333.getClass(), "totalMasterAchievement", 1624185261238942901L);
        setLongField(term232333, term232333.getClass(), "totalReMasterAchievement", -8750773609970352127L);
        setLongField(term232333, term232333.getClass(), "playerOldRating", 6012110850487716369L);
        setLongField(term232333, term232333.getClass(), "playerNewRating", -6620434607349317470L);
        setIntField(term232333, term232333.getClass(), "banState", 120683825);
        setLongField(term232333, term232333.getClass(), "dateTime", 8598124661374154993L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterSync", argTypes, term232333, args);
    }

};


