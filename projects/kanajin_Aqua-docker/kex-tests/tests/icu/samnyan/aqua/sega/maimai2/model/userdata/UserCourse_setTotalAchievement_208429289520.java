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

public class UserCourse_setTotalAchievement_208429289520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84567;
     Object term84976;

    public UserCourse_setTotalAchievement_208429289520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term84573 = new Long(-4023935540989049732L);
        ArrayList term84634 = new ArrayList();
        Integer term84640 = new Integer(1151963130);
        Integer term84642 = new Integer(-1855819749);
        Integer term84644 = new Integer(1059048043);
        Integer term84646 = new Integer(537273345);
        Integer term84648 = new Integer(-346107257);
        Integer term84650 = new Integer(-1577393360);
        ArrayList term84638 = new ArrayList();
        ((ArrayList) term84638).add(term84640);
        ((ArrayList) term84638).add(term84642);
        ((ArrayList) term84638).add(term84644);
        ((ArrayList) term84638).add(term84646);
        ((ArrayList) term84638).add(term84648);
        ((ArrayList) term84638).add(term84650);
        term84567 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term84569 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term84571 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term84587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84592 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84597 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84598 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84602 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term84567, term84567.getClass(), "id", 9010920462347251642L);
        setLongField(term84569, term84569.getClass(), "id", 9164839186810859146L);
        setLongField(term84571, term84571.getClass(), "id", -3178643500157507028L);
        setField(term84571, term84571.getClass(), "extId", term84573);
        setField(term84571, term84571.getClass(), "luid", "QGWHwsqzqh");
        setIntField(term84588, term84588.getClass(), "year", 2012);
        setShortField(term84588, term84588.getClass(), "month", (short) 2);
        setShortField(term84588, term84588.getClass(), "day", (short) 18);
        setField(term84587, term84587.getClass(), "date", term84588);
        setByteField(term84592, term84592.getClass(), "hour", (byte) 4);
        setByteField(term84592, term84592.getClass(), "minute", (byte) 27);
        setByteField(term84592, term84592.getClass(), "second", (byte) 19);
        setIntField(term84592, term84592.getClass(), "nano", 948215601);
        setField(term84587, term84587.getClass(), "time", term84592);
        setField(term84571, term84571.getClass(), "registerTime", term84587);
        setIntField(term84598, term84598.getClass(), "year", 2029);
        setShortField(term84598, term84598.getClass(), "month", (short) 11);
        setShortField(term84598, term84598.getClass(), "day", (short) 23);
        setField(term84597, term84597.getClass(), "date", term84598);
        setByteField(term84602, term84602.getClass(), "hour", (byte) 18);
        setByteField(term84602, term84602.getClass(), "minute", (byte) 47);
        setByteField(term84602, term84602.getClass(), "second", (byte) 36);
        setIntField(term84602, term84602.getClass(), "nano", 43248731);
        setField(term84597, term84597.getClass(), "time", term84602);
        setField(term84571, term84571.getClass(), "accessTime", term84597);
        setField(term84569, term84569.getClass(), "card", term84571);
        setField(term84569, term84569.getClass(), "userName", "HToXzWGnjh");
        setIntField(term84569, term84569.getClass(), "isNetMember", -910332885);
        setIntField(term84569, term84569.getClass(), "iconId", 186607713);
        setIntField(term84569, term84569.getClass(), "plateId", -400018942);
        setIntField(term84569, term84569.getClass(), "titleId", -101025934);
        setIntField(term84569, term84569.getClass(), "partnerId", 1587463337);
        setIntField(term84569, term84569.getClass(), "frameId", 463114370);
        setIntField(term84569, term84569.getClass(), "selectMapId", 1541842334);
        setIntField(term84569, term84569.getClass(), "totalAwake", 947697692);
        setIntField(term84569, term84569.getClass(), "gradeRating", -372056343);
        setIntField(term84569, term84569.getClass(), "musicRating", 625501454);
        setIntField(term84569, term84569.getClass(), "playerRating", -1941817273);
        setIntField(term84569, term84569.getClass(), "highestRating", -919598814);
        setIntField(term84569, term84569.getClass(), "gradeRank", -1521283679);
        setIntField(term84569, term84569.getClass(), "classRank", 1502377250);
        setIntField(term84569, term84569.getClass(), "courseRank", 1581416400);
        setField(term84569, term84569.getClass(), "charaSlot", term84634);
        setField(term84569, term84569.getClass(), "charaLockSlot", term84638);
        setLongField(term84569, term84569.getClass(), "contentBit", -595230351619160986L);
        setIntField(term84569, term84569.getClass(), "playCount", 1963777573);
        setField(term84569, term84569.getClass(), "eventWatchedDate", "ymGhnCkAFG");
        setField(term84569, term84569.getClass(), "lastGameId", "JYQEoThPjD");
        setField(term84569, term84569.getClass(), "lastRomVersion", "uUYeaeRaCx");
        setField(term84569, term84569.getClass(), "lastDataVersion", "oCpxzVdxcV");
        setField(term84569, term84569.getClass(), "lastLoginDate", "PzNtQwCbTD");
        setField(term84569, term84569.getClass(), "lastPlayDate", "wQAefimNLh");
        setIntField(term84569, term84569.getClass(), "lastPlayCredit", -998538950);
        setIntField(term84569, term84569.getClass(), "lastPlayMode", 1644825964);
        setIntField(term84569, term84569.getClass(), "lastPlaceId", -331554346);
        setField(term84569, term84569.getClass(), "lastPlaceName", "NDFbtxRRgi");
        setIntField(term84569, term84569.getClass(), "lastAllNetId", -774907545);
        setIntField(term84569, term84569.getClass(), "lastRegionId", -2104980850);
        setField(term84569, term84569.getClass(), "lastRegionName", "vasBXGWtux");
        setField(term84569, term84569.getClass(), "lastClientId", "UfUIICYJWk");
        setField(term84569, term84569.getClass(), "lastCountryCode", "vuGxdvURpp");
        setIntField(term84569, term84569.getClass(), "lastSelectEMoney", -1700414059);
        setIntField(term84569, term84569.getClass(), "lastSelectTicket", 894475811);
        setIntField(term84569, term84569.getClass(), "lastSelectCourse", -1219489703);
        setIntField(term84569, term84569.getClass(), "lastCountCourse", 710854131);
        setField(term84569, term84569.getClass(), "firstGameId", "zUgAERZZFZ");
        setField(term84569, term84569.getClass(), "firstRomVersion", "QhkdVFKaoy");
        setField(term84569, term84569.getClass(), "firstDataVersion", "WCQDPwVjsS");
        setField(term84569, term84569.getClass(), "firstPlayDate", "XkZOYFvTGI");
        setField(term84569, term84569.getClass(), "compatibleCmVersion", "NifhlBZIDF");
        setField(term84569, term84569.getClass(), "dailyBonusDate", "vKEgtSbaYp");
        setField(term84569, term84569.getClass(), "dailyCourseBonusDate", "FnjEwOlAkC");
        setField(term84569, term84569.getClass(), "lastPairLoginDate", "ZsGqLnRMml");
        setField(term84569, term84569.getClass(), "lastTrialPlayDate", "BTXsqJgjjs");
        setIntField(term84569, term84569.getClass(), "playVsCount", 1477787899);
        setIntField(term84569, term84569.getClass(), "playSyncCount", 296655703);
        setIntField(term84569, term84569.getClass(), "winCount", -1558411918);
        setIntField(term84569, term84569.getClass(), "helpCount", 595358328);
        setIntField(term84569, term84569.getClass(), "comboCount", -1447510365);
        setLongField(term84569, term84569.getClass(), "totalDeluxscore", -5444968106400021040L);
        setLongField(term84569, term84569.getClass(), "totalBasicDeluxscore", 2514186329283267145L);
        setLongField(term84569, term84569.getClass(), "totalAdvancedDeluxscore", 38977818512796233L);
        setLongField(term84569, term84569.getClass(), "totalExpertDeluxscore", 672879829116719924L);
        setLongField(term84569, term84569.getClass(), "totalMasterDeluxscore", -6133230556162838255L);
        setLongField(term84569, term84569.getClass(), "totalReMasterDeluxscore", -4333639116826995110L);
        setIntField(term84569, term84569.getClass(), "totalSync", 2021579205);
        setIntField(term84569, term84569.getClass(), "totalBasicSync", 1117186881);
        setIntField(term84569, term84569.getClass(), "totalAdvancedSync", -116229778);
        setIntField(term84569, term84569.getClass(), "totalExpertSync", 1102287982);
        setIntField(term84569, term84569.getClass(), "totalMasterSync", 82817178);
        setIntField(term84569, term84569.getClass(), "totalReMasterSync", 1619985605);
        setLongField(term84569, term84569.getClass(), "totalAchievement", -7617231570937544003L);
        setLongField(term84569, term84569.getClass(), "totalBasicAchievement", 2030200770029836292L);
        setLongField(term84569, term84569.getClass(), "totalAdvancedAchievement", -1050483041230879612L);
        setLongField(term84569, term84569.getClass(), "totalExpertAchievement", -6995916033829012295L);
        setLongField(term84569, term84569.getClass(), "totalMasterAchievement", 3927891930720164353L);
        setLongField(term84569, term84569.getClass(), "totalReMasterAchievement", 3251061202419362457L);
        setLongField(term84569, term84569.getClass(), "playerOldRating", -4684671918758363337L);
        setLongField(term84569, term84569.getClass(), "playerNewRating", -3816054957330703095L);
        setIntField(term84569, term84569.getClass(), "banState", -1020794327);
        setLongField(term84569, term84569.getClass(), "dateTime", 6773177296493870806L);
        setField(term84567, term84567.getClass(), "user", term84569);
        setIntField(term84567, term84567.getClass(), "courseId", 719987081);
        setBooleanField(term84567, term84567.getClass(), "isLastClear", true);
        setIntField(term84567, term84567.getClass(), "totalRestlife", -1306969788);
        setIntField(term84567, term84567.getClass(), "totalAchievement", -272419076);
        setIntField(term84567, term84567.getClass(), "totalDeluxscore", -1366102520);
        setIntField(term84567, term84567.getClass(), "playCount", -991083478);
        setField(term84567, term84567.getClass(), "clearDate", "OjFRpvsLzi");
        setField(term84567, term84567.getClass(), "lastPlayDate", "kugZgYRWcG");
        setIntField(term84567, term84567.getClass(), "bestAchievement", -1423864560);
        setField(term84567, term84567.getClass(), "bestAchievementDate", "OzucqAMebQ");
        setIntField(term84567, term84567.getClass(), "bestDeluxscore", 1155538873);
        setField(term84567, term84567.getClass(), "bestDeluxscoreDate", "VecourIOHN");
        term84976 = new Integer(868120753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term84976;
        callMethod(klass, "setTotalAchievement", argTypes, term84567, args);
    }

};


