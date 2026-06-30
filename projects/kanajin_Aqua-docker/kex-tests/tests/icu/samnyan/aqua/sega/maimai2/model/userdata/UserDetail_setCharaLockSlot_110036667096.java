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
import java.util.LinkedList;

public class UserDetail_setCharaLockSlot_110036667096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4284047;
     Object term4284408;

    public UserDetail_setCharaLockSlot_110036667096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4284051 = new Long(-4726990010795804697L);
        Integer term4284114 = new Integer(987790925);
        Integer term4284116 = new Integer(1502837369);
        ArrayList term4284112 = new ArrayList();
        ((ArrayList) term4284112).add(term4284114);
        ((ArrayList) term4284112).add(term4284116);
        Integer term4284122 = new Integer(980943695);
        Integer term4284124 = new Integer(1100165285);
        Integer term4284126 = new Integer(-686406135);
        Integer term4284128 = new Integer(-287429580);
        Integer term4284130 = new Integer(-1517877256);
        Integer term4284132 = new Integer(1926230705);
        Integer term4284134 = new Integer(230249356);
        Integer term4284136 = new Integer(81634969);
        Integer term4284138 = new Integer(-564270021);
        ArrayList term4284120 = new ArrayList();
        ((ArrayList) term4284120).add(term4284122);
        ((ArrayList) term4284120).add(term4284124);
        ((ArrayList) term4284120).add(term4284126);
        ((ArrayList) term4284120).add(term4284128);
        ((ArrayList) term4284120).add(term4284130);
        ((ArrayList) term4284120).add(term4284132);
        ((ArrayList) term4284120).add(term4284134);
        ((ArrayList) term4284120).add(term4284136);
        ((ArrayList) term4284120).add(term4284138);
        term4284047 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4284049 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4284065 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4284066 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4284070 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4284075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4284076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4284080 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4284047, term4284047.getClass(), "id", -1134104361973581866L);
        setLongField(term4284049, term4284049.getClass(), "id", 5778281178825978351L);
        setField(term4284049, term4284049.getClass(), "extId", term4284051);
        setField(term4284049, term4284049.getClass(), "luid", "jZubLyBstC");
        setIntField(term4284066, term4284066.getClass(), "year", 2028);
        setShortField(term4284066, term4284066.getClass(), "month", (short) 5);
        setShortField(term4284066, term4284066.getClass(), "day", (short) 9);
        setField(term4284065, term4284065.getClass(), "date", term4284066);
        setByteField(term4284070, term4284070.getClass(), "hour", (byte) 21);
        setByteField(term4284070, term4284070.getClass(), "minute", (byte) 10);
        setByteField(term4284070, term4284070.getClass(), "second", (byte) 32);
        setIntField(term4284070, term4284070.getClass(), "nano", 848338510);
        setField(term4284065, term4284065.getClass(), "time", term4284070);
        setField(term4284049, term4284049.getClass(), "registerTime", term4284065);
        setIntField(term4284076, term4284076.getClass(), "year", 2026);
        setShortField(term4284076, term4284076.getClass(), "month", (short) 4);
        setShortField(term4284076, term4284076.getClass(), "day", (short) 11);
        setField(term4284075, term4284075.getClass(), "date", term4284076);
        setByteField(term4284080, term4284080.getClass(), "hour", (byte) 0);
        setByteField(term4284080, term4284080.getClass(), "minute", (byte) 9);
        setByteField(term4284080, term4284080.getClass(), "second", (byte) 4);
        setIntField(term4284080, term4284080.getClass(), "nano", 221844627);
        setField(term4284075, term4284075.getClass(), "time", term4284080);
        setField(term4284049, term4284049.getClass(), "accessTime", term4284075);
        setField(term4284047, term4284047.getClass(), "card", term4284049);
        setField(term4284047, term4284047.getClass(), "userName", "BERVvtDjHx");
        setIntField(term4284047, term4284047.getClass(), "isNetMember", -1028132101);
        setIntField(term4284047, term4284047.getClass(), "iconId", -1416214703);
        setIntField(term4284047, term4284047.getClass(), "plateId", -1102736185);
        setIntField(term4284047, term4284047.getClass(), "titleId", 578353570);
        setIntField(term4284047, term4284047.getClass(), "partnerId", -102475703);
        setIntField(term4284047, term4284047.getClass(), "frameId", 2141974313);
        setIntField(term4284047, term4284047.getClass(), "selectMapId", 1273201841);
        setIntField(term4284047, term4284047.getClass(), "totalAwake", -1757660715);
        setIntField(term4284047, term4284047.getClass(), "gradeRating", -336695653);
        setIntField(term4284047, term4284047.getClass(), "musicRating", -1428097521);
        setIntField(term4284047, term4284047.getClass(), "playerRating", 931363275);
        setIntField(term4284047, term4284047.getClass(), "highestRating", 1910364561);
        setIntField(term4284047, term4284047.getClass(), "gradeRank", -931040904);
        setIntField(term4284047, term4284047.getClass(), "classRank", 1052776151);
        setIntField(term4284047, term4284047.getClass(), "courseRank", 203394851);
        setField(term4284047, term4284047.getClass(), "charaSlot", term4284112);
        setField(term4284047, term4284047.getClass(), "charaLockSlot", term4284120);
        setLongField(term4284047, term4284047.getClass(), "contentBit", -6988798380988423370L);
        setIntField(term4284047, term4284047.getClass(), "playCount", -615104347);
        setField(term4284047, term4284047.getClass(), "eventWatchedDate", "vXxiLACQdA");
        setField(term4284047, term4284047.getClass(), "lastGameId", "ElasLuWaaY");
        setField(term4284047, term4284047.getClass(), "lastRomVersion", "BeWeDohTaY");
        setField(term4284047, term4284047.getClass(), "lastDataVersion", "aUucsLKHGX");
        setField(term4284047, term4284047.getClass(), "lastLoginDate", "MPIQxVcXJN");
        setField(term4284047, term4284047.getClass(), "lastPlayDate", "oDPtTjGamQ");
        setIntField(term4284047, term4284047.getClass(), "lastPlayCredit", 1230543678);
        setIntField(term4284047, term4284047.getClass(), "lastPlayMode", -935621841);
        setIntField(term4284047, term4284047.getClass(), "lastPlaceId", 1349384247);
        setField(term4284047, term4284047.getClass(), "lastPlaceName", "HlGgixrJce");
        setIntField(term4284047, term4284047.getClass(), "lastAllNetId", -1411554073);
        setIntField(term4284047, term4284047.getClass(), "lastRegionId", -1153339489);
        setField(term4284047, term4284047.getClass(), "lastRegionName", "FgPUsoOaNj");
        setField(term4284047, term4284047.getClass(), "lastClientId", "URNpwxMISG");
        setField(term4284047, term4284047.getClass(), "lastCountryCode", "vJFdokgOvA");
        setIntField(term4284047, term4284047.getClass(), "lastSelectEMoney", 1870329603);
        setIntField(term4284047, term4284047.getClass(), "lastSelectTicket", -885386618);
        setIntField(term4284047, term4284047.getClass(), "lastSelectCourse", 387071539);
        setIntField(term4284047, term4284047.getClass(), "lastCountCourse", 684964171);
        setField(term4284047, term4284047.getClass(), "firstGameId", "UqXqdtpTZJ");
        setField(term4284047, term4284047.getClass(), "firstRomVersion", "JBOHkGXMfl");
        setField(term4284047, term4284047.getClass(), "firstDataVersion", "LxOLGIrJMS");
        setField(term4284047, term4284047.getClass(), "firstPlayDate", "iwflvKarUU");
        setField(term4284047, term4284047.getClass(), "compatibleCmVersion", "xexexXFGkS");
        setField(term4284047, term4284047.getClass(), "dailyBonusDate", "xlgjlUunRP");
        setField(term4284047, term4284047.getClass(), "dailyCourseBonusDate", "qmitwddjFe");
        setField(term4284047, term4284047.getClass(), "lastPairLoginDate", "DXCHdhvAEN");
        setField(term4284047, term4284047.getClass(), "lastTrialPlayDate", "EdpELPryJE");
        setIntField(term4284047, term4284047.getClass(), "playVsCount", 1880237602);
        setIntField(term4284047, term4284047.getClass(), "playSyncCount", -331056028);
        setIntField(term4284047, term4284047.getClass(), "winCount", -1957235020);
        setIntField(term4284047, term4284047.getClass(), "helpCount", -1094766866);
        setIntField(term4284047, term4284047.getClass(), "comboCount", 959676449);
        setLongField(term4284047, term4284047.getClass(), "totalDeluxscore", 7643458319589383667L);
        setLongField(term4284047, term4284047.getClass(), "totalBasicDeluxscore", 1577264418994691220L);
        setLongField(term4284047, term4284047.getClass(), "totalAdvancedDeluxscore", 9183605726914366790L);
        setLongField(term4284047, term4284047.getClass(), "totalExpertDeluxscore", -7249276313709292488L);
        setLongField(term4284047, term4284047.getClass(), "totalMasterDeluxscore", -6659280502306974929L);
        setLongField(term4284047, term4284047.getClass(), "totalReMasterDeluxscore", 5724833872843393363L);
        setIntField(term4284047, term4284047.getClass(), "totalSync", 1678591246);
        setIntField(term4284047, term4284047.getClass(), "totalBasicSync", -1534502046);
        setIntField(term4284047, term4284047.getClass(), "totalAdvancedSync", 186250077);
        setIntField(term4284047, term4284047.getClass(), "totalExpertSync", 825972351);
        setIntField(term4284047, term4284047.getClass(), "totalMasterSync", -813135363);
        setIntField(term4284047, term4284047.getClass(), "totalReMasterSync", 1857245386);
        setLongField(term4284047, term4284047.getClass(), "totalAchievement", 2953435028236131421L);
        setLongField(term4284047, term4284047.getClass(), "totalBasicAchievement", 8591124663637451915L);
        setLongField(term4284047, term4284047.getClass(), "totalAdvancedAchievement", 1642349869561902859L);
        setLongField(term4284047, term4284047.getClass(), "totalExpertAchievement", -209330366558275913L);
        setLongField(term4284047, term4284047.getClass(), "totalMasterAchievement", -6854488960109184674L);
        setLongField(term4284047, term4284047.getClass(), "totalReMasterAchievement", -1145190811219615769L);
        setLongField(term4284047, term4284047.getClass(), "playerOldRating", -4652730534019798511L);
        setLongField(term4284047, term4284047.getClass(), "playerNewRating", -3837457868489579866L);
        setIntField(term4284047, term4284047.getClass(), "banState", -2011536117);
        setLongField(term4284047, term4284047.getClass(), "dateTime", -2122534414793224365L);
        Integer term4284411 = new Integer(-711410886);
        Integer term4284414 = new Integer(1905282682);
        Integer term4284417 = new Integer(1714255787);
        Integer term4284420 = new Integer(257119068);
        term4284408 = new LinkedList();
        ((LinkedList) term4284408).add(term4284411);
        ((LinkedList) term4284408).add(term4284414);
        ((LinkedList) term4284408).add(term4284417);
        ((LinkedList) term4284408).add(term4284420);
        ((LinkedList) term4284408).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4284408;
        callMethod(klass, "setCharaLockSlot", argTypes, term4284047, args);
    }

};


