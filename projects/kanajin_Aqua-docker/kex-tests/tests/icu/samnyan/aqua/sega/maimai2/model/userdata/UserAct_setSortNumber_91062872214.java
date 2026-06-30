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

public class UserAct_setSortNumber_91062872214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8599;
     Object term8971;

    public UserAct_setSortNumber_91062872214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8605 = new Long(-872011222785455006L);
        Integer term8668 = new Integer(1386130016);
        Integer term8670 = new Integer(1072005683);
        Integer term8672 = new Integer(1861318859);
        Integer term8674 = new Integer(1474524152);
        Integer term8676 = new Integer(568954359);
        Integer term8678 = new Integer(53410913);
        ArrayList term8666 = new ArrayList();
        ((ArrayList) term8666).add(term8668);
        ((ArrayList) term8666).add(term8670);
        ((ArrayList) term8666).add(term8672);
        ((ArrayList) term8666).add(term8674);
        ((ArrayList) term8666).add(term8676);
        ((ArrayList) term8666).add(term8678);
        Integer term8684 = new Integer(-375014958);
        Integer term8686 = new Integer(1107176718);
        Integer term8688 = new Integer(480137250);
        Integer term8690 = new Integer(-341152642);
        Integer term8692 = new Integer(-2015854073);
        Integer term8694 = new Integer(538259104);
        ArrayList term8682 = new ArrayList();
        ((ArrayList) term8682).add(term8684);
        ((ArrayList) term8682).add(term8686);
        ((ArrayList) term8682).add(term8688);
        ((ArrayList) term8682).add(term8690);
        ((ArrayList) term8682).add(term8692);
        ((ArrayList) term8682).add(term8694);
        term8599 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term8601 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term8603 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term8619 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8624 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8634 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term8599, term8599.getClass(), "id", -1481367303699139651L);
        setLongField(term8601, term8601.getClass(), "id", -7709317346333670618L);
        setLongField(term8603, term8603.getClass(), "id", -1964501434345816975L);
        setField(term8603, term8603.getClass(), "extId", term8605);
        setField(term8603, term8603.getClass(), "luid", "zNFLXMifnS");
        setIntField(term8620, term8620.getClass(), "year", 2016);
        setShortField(term8620, term8620.getClass(), "month", (short) 6);
        setShortField(term8620, term8620.getClass(), "day", (short) 15);
        setField(term8619, term8619.getClass(), "date", term8620);
        setByteField(term8624, term8624.getClass(), "hour", (byte) 21);
        setByteField(term8624, term8624.getClass(), "minute", (byte) 23);
        setByteField(term8624, term8624.getClass(), "second", (byte) 23);
        setIntField(term8624, term8624.getClass(), "nano", 433372070);
        setField(term8619, term8619.getClass(), "time", term8624);
        setField(term8603, term8603.getClass(), "registerTime", term8619);
        setIntField(term8630, term8630.getClass(), "year", 2012);
        setShortField(term8630, term8630.getClass(), "month", (short) 8);
        setShortField(term8630, term8630.getClass(), "day", (short) 25);
        setField(term8629, term8629.getClass(), "date", term8630);
        setByteField(term8634, term8634.getClass(), "hour", (byte) 19);
        setByteField(term8634, term8634.getClass(), "minute", (byte) 49);
        setByteField(term8634, term8634.getClass(), "second", (byte) 8);
        setIntField(term8634, term8634.getClass(), "nano", 912685024);
        setField(term8629, term8629.getClass(), "time", term8634);
        setField(term8603, term8603.getClass(), "accessTime", term8629);
        setField(term8601, term8601.getClass(), "card", term8603);
        setField(term8601, term8601.getClass(), "userName", "HHQcYMSBVc");
        setIntField(term8601, term8601.getClass(), "isNetMember", 1532723756);
        setIntField(term8601, term8601.getClass(), "iconId", -124088550);
        setIntField(term8601, term8601.getClass(), "plateId", 777492093);
        setIntField(term8601, term8601.getClass(), "titleId", 1414025609);
        setIntField(term8601, term8601.getClass(), "partnerId", 255145822);
        setIntField(term8601, term8601.getClass(), "frameId", -573608449);
        setIntField(term8601, term8601.getClass(), "selectMapId", -1660057757);
        setIntField(term8601, term8601.getClass(), "totalAwake", 1816273440);
        setIntField(term8601, term8601.getClass(), "gradeRating", -96541009);
        setIntField(term8601, term8601.getClass(), "musicRating", -43719302);
        setIntField(term8601, term8601.getClass(), "playerRating", 1024134939);
        setIntField(term8601, term8601.getClass(), "highestRating", 109078154);
        setIntField(term8601, term8601.getClass(), "gradeRank", -314165467);
        setIntField(term8601, term8601.getClass(), "classRank", 963694071);
        setIntField(term8601, term8601.getClass(), "courseRank", -995785731);
        setField(term8601, term8601.getClass(), "charaSlot", term8666);
        setField(term8601, term8601.getClass(), "charaLockSlot", term8682);
        setLongField(term8601, term8601.getClass(), "contentBit", 4689907154423223972L);
        setIntField(term8601, term8601.getClass(), "playCount", 1349815364);
        setField(term8601, term8601.getClass(), "eventWatchedDate", "wdoqITnaAP");
        setField(term8601, term8601.getClass(), "lastGameId", "rIPMBcrNqB");
        setField(term8601, term8601.getClass(), "lastRomVersion", "UDaboHZHhz");
        setField(term8601, term8601.getClass(), "lastDataVersion", "nRvKihUSPj");
        setField(term8601, term8601.getClass(), "lastLoginDate", "BbNeQJpYPr");
        setField(term8601, term8601.getClass(), "lastPlayDate", "riMtzCoxNj");
        setIntField(term8601, term8601.getClass(), "lastPlayCredit", 2128383340);
        setIntField(term8601, term8601.getClass(), "lastPlayMode", 1238598518);
        setIntField(term8601, term8601.getClass(), "lastPlaceId", -558146961);
        setField(term8601, term8601.getClass(), "lastPlaceName", "YAXkVjQZcV");
        setIntField(term8601, term8601.getClass(), "lastAllNetId", 1505480070);
        setIntField(term8601, term8601.getClass(), "lastRegionId", -829088844);
        setField(term8601, term8601.getClass(), "lastRegionName", "pumvwBWvpy");
        setField(term8601, term8601.getClass(), "lastClientId", "HwLHeGLyhe");
        setField(term8601, term8601.getClass(), "lastCountryCode", "RDnkgWkcbz");
        setIntField(term8601, term8601.getClass(), "lastSelectEMoney", -31751777);
        setIntField(term8601, term8601.getClass(), "lastSelectTicket", -246967963);
        setIntField(term8601, term8601.getClass(), "lastSelectCourse", -1777140369);
        setIntField(term8601, term8601.getClass(), "lastCountCourse", 993627098);
        setField(term8601, term8601.getClass(), "firstGameId", "IBpaxltauX");
        setField(term8601, term8601.getClass(), "firstRomVersion", "hePqROaplw");
        setField(term8601, term8601.getClass(), "firstDataVersion", "PJcSNDruWd");
        setField(term8601, term8601.getClass(), "firstPlayDate", "VVNNlAePXF");
        setField(term8601, term8601.getClass(), "compatibleCmVersion", "jnwVnmKAFv");
        setField(term8601, term8601.getClass(), "dailyBonusDate", "TXyHhqeCjR");
        setField(term8601, term8601.getClass(), "dailyCourseBonusDate", "lZIgPZPgTu");
        setField(term8601, term8601.getClass(), "lastPairLoginDate", "iuCxnHGMoW");
        setField(term8601, term8601.getClass(), "lastTrialPlayDate", "GPSEWEDSTo");
        setIntField(term8601, term8601.getClass(), "playVsCount", 872295704);
        setIntField(term8601, term8601.getClass(), "playSyncCount", 86041387);
        setIntField(term8601, term8601.getClass(), "winCount", 1010721666);
        setIntField(term8601, term8601.getClass(), "helpCount", 27043781);
        setIntField(term8601, term8601.getClass(), "comboCount", -1367122405);
        setLongField(term8601, term8601.getClass(), "totalDeluxscore", 8512025621149521819L);
        setLongField(term8601, term8601.getClass(), "totalBasicDeluxscore", 2022482096970820459L);
        setLongField(term8601, term8601.getClass(), "totalAdvancedDeluxscore", 6315101499811179240L);
        setLongField(term8601, term8601.getClass(), "totalExpertDeluxscore", -3033337370154155851L);
        setLongField(term8601, term8601.getClass(), "totalMasterDeluxscore", -3130003589475815807L);
        setLongField(term8601, term8601.getClass(), "totalReMasterDeluxscore", -5344598381371854750L);
        setIntField(term8601, term8601.getClass(), "totalSync", -1703625118);
        setIntField(term8601, term8601.getClass(), "totalBasicSync", 1104108112);
        setIntField(term8601, term8601.getClass(), "totalAdvancedSync", 1648665618);
        setIntField(term8601, term8601.getClass(), "totalExpertSync", 633765954);
        setIntField(term8601, term8601.getClass(), "totalMasterSync", 269110087);
        setIntField(term8601, term8601.getClass(), "totalReMasterSync", 1545119095);
        setLongField(term8601, term8601.getClass(), "totalAchievement", -3718250311794019732L);
        setLongField(term8601, term8601.getClass(), "totalBasicAchievement", -5935517391653614345L);
        setLongField(term8601, term8601.getClass(), "totalAdvancedAchievement", -6521561238735301071L);
        setLongField(term8601, term8601.getClass(), "totalExpertAchievement", -6609679920238945303L);
        setLongField(term8601, term8601.getClass(), "totalMasterAchievement", -7296330380944173376L);
        setLongField(term8601, term8601.getClass(), "totalReMasterAchievement", -8890284990655172580L);
        setLongField(term8601, term8601.getClass(), "playerOldRating", -5951743062322506095L);
        setLongField(term8601, term8601.getClass(), "playerNewRating", 768144790810175653L);
        setIntField(term8601, term8601.getClass(), "banState", 1671229683);
        setLongField(term8601, term8601.getClass(), "dateTime", -1497280900081695731L);
        setField(term8599, term8599.getClass(), "user", term8601);
        setIntField(term8599, term8599.getClass(), "kind", 34167717);
        setIntField(term8599, term8599.getClass(), "activityId", -514195141);
        setLongField(term8599, term8599.getClass(), "sortNumber", -3602825674339018793L);
        setIntField(term8599, term8599.getClass(), "param1", -297946422);
        setIntField(term8599, term8599.getClass(), "param2", 385463636);
        setIntField(term8599, term8599.getClass(), "param3", -1677599962);
        setIntField(term8599, term8599.getClass(), "param4", -1790275458);
        term8971 = new Long(3086974592680165932L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term8971;
        callMethod(klass, "setSortNumber", argTypes, term8599, args);
    }

};


