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

public class UserDetail_setClassRank_185684118493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4282339;
     Object term4282696;

    public UserDetail_setClassRank_185684118493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4282343 = new Long(-3802999224635376611L);
        Integer term4282406 = new Integer(-1345750324);
        Integer term4282408 = new Integer(-329240379);
        Integer term4282410 = new Integer(706310223);
        Integer term4282412 = new Integer(1503842864);
        Integer term4282414 = new Integer(1395180612);
        Integer term4282416 = new Integer(1625598443);
        Integer term4282418 = new Integer(-38394649);
        Integer term4282420 = new Integer(1832189880);
        ArrayList term4282404 = new ArrayList();
        ((ArrayList) term4282404).add(term4282406);
        ((ArrayList) term4282404).add(term4282408);
        ((ArrayList) term4282404).add(term4282410);
        ((ArrayList) term4282404).add(term4282412);
        ((ArrayList) term4282404).add(term4282414);
        ((ArrayList) term4282404).add(term4282416);
        ((ArrayList) term4282404).add(term4282418);
        ((ArrayList) term4282404).add(term4282420);
        Integer term4282426 = new Integer(-2087697431);
        ArrayList term4282424 = new ArrayList();
        ((ArrayList) term4282424).add(term4282426);
        term4282339 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4282341 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4282357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4282358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4282362 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4282367 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4282368 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4282372 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4282339, term4282339.getClass(), "id", -4932848480766026545L);
        setLongField(term4282341, term4282341.getClass(), "id", -4633449979219821339L);
        setField(term4282341, term4282341.getClass(), "extId", term4282343);
        setField(term4282341, term4282341.getClass(), "luid", "acgHBNYxkt");
        setIntField(term4282358, term4282358.getClass(), "year", 2026);
        setShortField(term4282358, term4282358.getClass(), "month", (short) 9);
        setShortField(term4282358, term4282358.getClass(), "day", (short) 1);
        setField(term4282357, term4282357.getClass(), "date", term4282358);
        setByteField(term4282362, term4282362.getClass(), "hour", (byte) 0);
        setByteField(term4282362, term4282362.getClass(), "minute", (byte) 35);
        setByteField(term4282362, term4282362.getClass(), "second", (byte) 52);
        setIntField(term4282362, term4282362.getClass(), "nano", 605389126);
        setField(term4282357, term4282357.getClass(), "time", term4282362);
        setField(term4282341, term4282341.getClass(), "registerTime", term4282357);
        setIntField(term4282368, term4282368.getClass(), "year", 2018);
        setShortField(term4282368, term4282368.getClass(), "month", (short) 5);
        setShortField(term4282368, term4282368.getClass(), "day", (short) 10);
        setField(term4282367, term4282367.getClass(), "date", term4282368);
        setByteField(term4282372, term4282372.getClass(), "hour", (byte) 11);
        setByteField(term4282372, term4282372.getClass(), "minute", (byte) 17);
        setByteField(term4282372, term4282372.getClass(), "second", (byte) 54);
        setIntField(term4282372, term4282372.getClass(), "nano", 309591182);
        setField(term4282367, term4282367.getClass(), "time", term4282372);
        setField(term4282341, term4282341.getClass(), "accessTime", term4282367);
        setField(term4282339, term4282339.getClass(), "card", term4282341);
        setField(term4282339, term4282339.getClass(), "userName", "dAsTzTCvMD");
        setIntField(term4282339, term4282339.getClass(), "isNetMember", -565486386);
        setIntField(term4282339, term4282339.getClass(), "iconId", 311875954);
        setIntField(term4282339, term4282339.getClass(), "plateId", -1069547554);
        setIntField(term4282339, term4282339.getClass(), "titleId", 488607709);
        setIntField(term4282339, term4282339.getClass(), "partnerId", 1873994017);
        setIntField(term4282339, term4282339.getClass(), "frameId", -792220297);
        setIntField(term4282339, term4282339.getClass(), "selectMapId", 1763475186);
        setIntField(term4282339, term4282339.getClass(), "totalAwake", 1998648633);
        setIntField(term4282339, term4282339.getClass(), "gradeRating", -646832294);
        setIntField(term4282339, term4282339.getClass(), "musicRating", -541246146);
        setIntField(term4282339, term4282339.getClass(), "playerRating", -2104667560);
        setIntField(term4282339, term4282339.getClass(), "highestRating", 2053187413);
        setIntField(term4282339, term4282339.getClass(), "gradeRank", -627899429);
        setIntField(term4282339, term4282339.getClass(), "classRank", 397623625);
        setIntField(term4282339, term4282339.getClass(), "courseRank", 1395243678);
        setField(term4282339, term4282339.getClass(), "charaSlot", term4282404);
        setField(term4282339, term4282339.getClass(), "charaLockSlot", term4282424);
        setLongField(term4282339, term4282339.getClass(), "contentBit", -2483550354122771946L);
        setIntField(term4282339, term4282339.getClass(), "playCount", 1021273862);
        setField(term4282339, term4282339.getClass(), "eventWatchedDate", "JOjflbaIYU");
        setField(term4282339, term4282339.getClass(), "lastGameId", "fIVTMyQmzF");
        setField(term4282339, term4282339.getClass(), "lastRomVersion", "JphpHHhRJL");
        setField(term4282339, term4282339.getClass(), "lastDataVersion", "ujdsKmNNfu");
        setField(term4282339, term4282339.getClass(), "lastLoginDate", "cndRlGhMCO");
        setField(term4282339, term4282339.getClass(), "lastPlayDate", "oUYDjPzYce");
        setIntField(term4282339, term4282339.getClass(), "lastPlayCredit", 348784980);
        setIntField(term4282339, term4282339.getClass(), "lastPlayMode", 417014725);
        setIntField(term4282339, term4282339.getClass(), "lastPlaceId", -1910212165);
        setField(term4282339, term4282339.getClass(), "lastPlaceName", "mtjUusLCoO");
        setIntField(term4282339, term4282339.getClass(), "lastAllNetId", 2055832798);
        setIntField(term4282339, term4282339.getClass(), "lastRegionId", 91874700);
        setField(term4282339, term4282339.getClass(), "lastRegionName", "gHZIRQNcmM");
        setField(term4282339, term4282339.getClass(), "lastClientId", "YnKWlkbEvL");
        setField(term4282339, term4282339.getClass(), "lastCountryCode", "rgnpqetjqA");
        setIntField(term4282339, term4282339.getClass(), "lastSelectEMoney", -606820354);
        setIntField(term4282339, term4282339.getClass(), "lastSelectTicket", 873289587);
        setIntField(term4282339, term4282339.getClass(), "lastSelectCourse", -389867582);
        setIntField(term4282339, term4282339.getClass(), "lastCountCourse", -1178681759);
        setField(term4282339, term4282339.getClass(), "firstGameId", "kWcFdtMCGW");
        setField(term4282339, term4282339.getClass(), "firstRomVersion", "tIwEaYvfhE");
        setField(term4282339, term4282339.getClass(), "firstDataVersion", "UGzeeuRAEn");
        setField(term4282339, term4282339.getClass(), "firstPlayDate", "dqWEFmPMpt");
        setField(term4282339, term4282339.getClass(), "compatibleCmVersion", "wwcqXNaIza");
        setField(term4282339, term4282339.getClass(), "dailyBonusDate", "hpMvbsnAyn");
        setField(term4282339, term4282339.getClass(), "dailyCourseBonusDate", "dhDWNRxzzn");
        setField(term4282339, term4282339.getClass(), "lastPairLoginDate", "tLupBfGSOd");
        setField(term4282339, term4282339.getClass(), "lastTrialPlayDate", "JtrhFcLHUN");
        setIntField(term4282339, term4282339.getClass(), "playVsCount", -1010494188);
        setIntField(term4282339, term4282339.getClass(), "playSyncCount", -1929639937);
        setIntField(term4282339, term4282339.getClass(), "winCount", 487655610);
        setIntField(term4282339, term4282339.getClass(), "helpCount", -460772595);
        setIntField(term4282339, term4282339.getClass(), "comboCount", 1839847407);
        setLongField(term4282339, term4282339.getClass(), "totalDeluxscore", 3809129169963324818L);
        setLongField(term4282339, term4282339.getClass(), "totalBasicDeluxscore", -894939665232885284L);
        setLongField(term4282339, term4282339.getClass(), "totalAdvancedDeluxscore", -607117436711975610L);
        setLongField(term4282339, term4282339.getClass(), "totalExpertDeluxscore", -1123520641230703898L);
        setLongField(term4282339, term4282339.getClass(), "totalMasterDeluxscore", -2067009530047822551L);
        setLongField(term4282339, term4282339.getClass(), "totalReMasterDeluxscore", 8097829888259075447L);
        setIntField(term4282339, term4282339.getClass(), "totalSync", -1859102484);
        setIntField(term4282339, term4282339.getClass(), "totalBasicSync", 466716680);
        setIntField(term4282339, term4282339.getClass(), "totalAdvancedSync", 798066090);
        setIntField(term4282339, term4282339.getClass(), "totalExpertSync", 1625215087);
        setIntField(term4282339, term4282339.getClass(), "totalMasterSync", -7485373);
        setIntField(term4282339, term4282339.getClass(), "totalReMasterSync", -2116698245);
        setLongField(term4282339, term4282339.getClass(), "totalAchievement", 2910273352448319102L);
        setLongField(term4282339, term4282339.getClass(), "totalBasicAchievement", 3556659495476517658L);
        setLongField(term4282339, term4282339.getClass(), "totalAdvancedAchievement", -4183137657774298620L);
        setLongField(term4282339, term4282339.getClass(), "totalExpertAchievement", 5443471471837882015L);
        setLongField(term4282339, term4282339.getClass(), "totalMasterAchievement", 6971047956103618974L);
        setLongField(term4282339, term4282339.getClass(), "totalReMasterAchievement", 208892587683293282L);
        setLongField(term4282339, term4282339.getClass(), "playerOldRating", -8025243946267449291L);
        setLongField(term4282339, term4282339.getClass(), "playerNewRating", -8911581664667579694L);
        setIntField(term4282339, term4282339.getClass(), "banState", 1164988663);
        setLongField(term4282339, term4282339.getClass(), "dateTime", -4134779895760606243L);
        term4282696 = new Integer(262127080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4282696;
        callMethod(klass, "setClassRank", argTypes, term4282339, args);
    }

};


