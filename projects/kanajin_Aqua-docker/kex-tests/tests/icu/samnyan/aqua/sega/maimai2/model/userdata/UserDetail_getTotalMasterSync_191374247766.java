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

public class UserDetail_getTotalMasterSync_191374247766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232388;

    public UserDetail_getTotalMasterSync_191374247766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term232392 = new Long(-6771377873268167033L);
        Integer term232455 = new Integer(-666074929);
        Integer term232457 = new Integer(1263172764);
        Integer term232459 = new Integer(294155442);
        ArrayList term232453 = new ArrayList();
        ((ArrayList) term232453).add(term232455);
        ((ArrayList) term232453).add(term232457);
        ((ArrayList) term232453).add(term232459);
        Integer term232465 = new Integer(-790860079);
        Integer term232467 = new Integer(52653332);
        Integer term232469 = new Integer(605369567);
        Integer term232471 = new Integer(662969700);
        Integer term232473 = new Integer(-907171757);
        Integer term232475 = new Integer(1041315057);
        Integer term232477 = new Integer(5602462);
        ArrayList term232463 = new ArrayList();
        ((ArrayList) term232463).add(term232465);
        ((ArrayList) term232463).add(term232467);
        ((ArrayList) term232463).add(term232469);
        ((ArrayList) term232463).add(term232471);
        ((ArrayList) term232463).add(term232473);
        ((ArrayList) term232463).add(term232475);
        ((ArrayList) term232463).add(term232477);
        term232388 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term232390 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term232406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232411 = newInstance(Class.forName("java.time.LocalTime"));
        Object term232416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232421 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term232388, term232388.getClass(), "id", -790773781296622829L);
        setLongField(term232390, term232390.getClass(), "id", 2766432648605092542L);
        setField(term232390, term232390.getClass(), "extId", term232392);
        setField(term232390, term232390.getClass(), "luid", "RZwoyRjDOK");
        setIntField(term232407, term232407.getClass(), "year", 2029);
        setShortField(term232407, term232407.getClass(), "month", (short) 7);
        setShortField(term232407, term232407.getClass(), "day", (short) 8);
        setField(term232406, term232406.getClass(), "date", term232407);
        setByteField(term232411, term232411.getClass(), "hour", (byte) 17);
        setByteField(term232411, term232411.getClass(), "minute", (byte) 0);
        setByteField(term232411, term232411.getClass(), "second", (byte) 26);
        setIntField(term232411, term232411.getClass(), "nano", 789866170);
        setField(term232406, term232406.getClass(), "time", term232411);
        setField(term232390, term232390.getClass(), "registerTime", term232406);
        setIntField(term232417, term232417.getClass(), "year", 2010);
        setShortField(term232417, term232417.getClass(), "month", (short) 3);
        setShortField(term232417, term232417.getClass(), "day", (short) 28);
        setField(term232416, term232416.getClass(), "date", term232417);
        setByteField(term232421, term232421.getClass(), "hour", (byte) 22);
        setByteField(term232421, term232421.getClass(), "minute", (byte) 36);
        setByteField(term232421, term232421.getClass(), "second", (byte) 47);
        setIntField(term232421, term232421.getClass(), "nano", 84020683);
        setField(term232416, term232416.getClass(), "time", term232421);
        setField(term232390, term232390.getClass(), "accessTime", term232416);
        setField(term232388, term232388.getClass(), "card", term232390);
        setField(term232388, term232388.getClass(), "userName", "TinAcWXQIH");
        setIntField(term232388, term232388.getClass(), "isNetMember", -1723849008);
        setIntField(term232388, term232388.getClass(), "iconId", -5850264);
        setIntField(term232388, term232388.getClass(), "plateId", 1397968591);
        setIntField(term232388, term232388.getClass(), "titleId", 1636497723);
        setIntField(term232388, term232388.getClass(), "partnerId", 162449955);
        setIntField(term232388, term232388.getClass(), "frameId", -633552703);
        setIntField(term232388, term232388.getClass(), "selectMapId", -144541448);
        setIntField(term232388, term232388.getClass(), "totalAwake", 1604182220);
        setIntField(term232388, term232388.getClass(), "gradeRating", -1337178466);
        setIntField(term232388, term232388.getClass(), "musicRating", 1589240744);
        setIntField(term232388, term232388.getClass(), "playerRating", 1935113637);
        setIntField(term232388, term232388.getClass(), "highestRating", -792570091);
        setIntField(term232388, term232388.getClass(), "gradeRank", -840204320);
        setIntField(term232388, term232388.getClass(), "classRank", 571759309);
        setIntField(term232388, term232388.getClass(), "courseRank", -544118437);
        setField(term232388, term232388.getClass(), "charaSlot", term232453);
        setField(term232388, term232388.getClass(), "charaLockSlot", term232463);
        setLongField(term232388, term232388.getClass(), "contentBit", -7418127502854503493L);
        setIntField(term232388, term232388.getClass(), "playCount", -1070783506);
        setField(term232388, term232388.getClass(), "eventWatchedDate", "fAiOxsidjq");
        setField(term232388, term232388.getClass(), "lastGameId", "zZrLslNfIn");
        setField(term232388, term232388.getClass(), "lastRomVersion", "GqIrvlDQGl");
        setField(term232388, term232388.getClass(), "lastDataVersion", "OXxIPHzoVa");
        setField(term232388, term232388.getClass(), "lastLoginDate", "VABzGvaFoV");
        setField(term232388, term232388.getClass(), "lastPlayDate", "OJfzqZgyhr");
        setIntField(term232388, term232388.getClass(), "lastPlayCredit", 908939387);
        setIntField(term232388, term232388.getClass(), "lastPlayMode", 546442739);
        setIntField(term232388, term232388.getClass(), "lastPlaceId", 986125029);
        setField(term232388, term232388.getClass(), "lastPlaceName", "veGctJDCVu");
        setIntField(term232388, term232388.getClass(), "lastAllNetId", -242915796);
        setIntField(term232388, term232388.getClass(), "lastRegionId", 798178790);
        setField(term232388, term232388.getClass(), "lastRegionName", "qWiNHIOSQh");
        setField(term232388, term232388.getClass(), "lastClientId", "iyKXXnfbdP");
        setField(term232388, term232388.getClass(), "lastCountryCode", "GrnLzQSLgP");
        setIntField(term232388, term232388.getClass(), "lastSelectEMoney", 1885105361);
        setIntField(term232388, term232388.getClass(), "lastSelectTicket", 406483559);
        setIntField(term232388, term232388.getClass(), "lastSelectCourse", -882073821);
        setIntField(term232388, term232388.getClass(), "lastCountCourse", -1619724361);
        setField(term232388, term232388.getClass(), "firstGameId", "rSNlwQrRPz");
        setField(term232388, term232388.getClass(), "firstRomVersion", "xKEzbRMPpP");
        setField(term232388, term232388.getClass(), "firstDataVersion", "mxNOSqFuhi");
        setField(term232388, term232388.getClass(), "firstPlayDate", "PAZrXfKSSy");
        setField(term232388, term232388.getClass(), "compatibleCmVersion", "tsZmZiLwvf");
        setField(term232388, term232388.getClass(), "dailyBonusDate", "PcMXaJAFsa");
        setField(term232388, term232388.getClass(), "dailyCourseBonusDate", "prPCXDaclm");
        setField(term232388, term232388.getClass(), "lastPairLoginDate", "HpYrZqtpjz");
        setField(term232388, term232388.getClass(), "lastTrialPlayDate", "dHWPzCnTgu");
        setIntField(term232388, term232388.getClass(), "playVsCount", -448769991);
        setIntField(term232388, term232388.getClass(), "playSyncCount", -2115906125);
        setIntField(term232388, term232388.getClass(), "winCount", -1115852180);
        setIntField(term232388, term232388.getClass(), "helpCount", 410129937);
        setIntField(term232388, term232388.getClass(), "comboCount", -1826076292);
        setLongField(term232388, term232388.getClass(), "totalDeluxscore", 2056940966441733881L);
        setLongField(term232388, term232388.getClass(), "totalBasicDeluxscore", -5567998152506692170L);
        setLongField(term232388, term232388.getClass(), "totalAdvancedDeluxscore", 1588032528014963437L);
        setLongField(term232388, term232388.getClass(), "totalExpertDeluxscore", 5609222796474002227L);
        setLongField(term232388, term232388.getClass(), "totalMasterDeluxscore", -9190628802748301406L);
        setLongField(term232388, term232388.getClass(), "totalReMasterDeluxscore", 3603248734833458364L);
        setIntField(term232388, term232388.getClass(), "totalSync", 1375700443);
        setIntField(term232388, term232388.getClass(), "totalBasicSync", -1592779289);
        setIntField(term232388, term232388.getClass(), "totalAdvancedSync", -1382233254);
        setIntField(term232388, term232388.getClass(), "totalExpertSync", -52296693);
        setIntField(term232388, term232388.getClass(), "totalMasterSync", -1374309882);
        setIntField(term232388, term232388.getClass(), "totalReMasterSync", -1954550269);
        setLongField(term232388, term232388.getClass(), "totalAchievement", 6548056565582320757L);
        setLongField(term232388, term232388.getClass(), "totalBasicAchievement", 7497491354611378876L);
        setLongField(term232388, term232388.getClass(), "totalAdvancedAchievement", 349006973694791230L);
        setLongField(term232388, term232388.getClass(), "totalExpertAchievement", 7628536876459883328L);
        setLongField(term232388, term232388.getClass(), "totalMasterAchievement", 1624185261238942901L);
        setLongField(term232388, term232388.getClass(), "totalReMasterAchievement", -8750773609970352127L);
        setLongField(term232388, term232388.getClass(), "playerOldRating", 6012110850487716369L);
        setLongField(term232388, term232388.getClass(), "playerNewRating", -6620434607349317470L);
        setIntField(term232388, term232388.getClass(), "banState", 120683825);
        setLongField(term232388, term232388.getClass(), "dateTime", 8598124661374154993L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterSync", argTypes, term232388, args);
    }

};


