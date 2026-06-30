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

public class UserMusicDetail_setMusicId_119515581113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63023;
     Object term63396;

    public UserMusicDetail_setMusicId_119515581113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term63029 = new Long(-5216789073301458893L);
        Integer term63092 = new Integer(-232352320);
        Integer term63094 = new Integer(-232333014);
        Integer term63096 = new Integer(-139694079);
        Integer term63098 = new Integer(-1602072035);
        Integer term63100 = new Integer(1902624392);
        Integer term63102 = new Integer(904607217);
        Integer term63104 = new Integer(434914590);
        Integer term63106 = new Integer(1983756621);
        ArrayList term63090 = new ArrayList();
        ((ArrayList) term63090).add(term63092);
        ((ArrayList) term63090).add(term63094);
        ((ArrayList) term63090).add(term63096);
        ((ArrayList) term63090).add(term63098);
        ((ArrayList) term63090).add(term63100);
        ((ArrayList) term63090).add(term63102);
        ((ArrayList) term63090).add(term63104);
        ((ArrayList) term63090).add(term63106);
        Integer term63112 = new Integer(-2134711835);
        Integer term63114 = new Integer(-1641244494);
        Integer term63116 = new Integer(1124282188);
        Integer term63118 = new Integer(-489441521);
        ArrayList term63110 = new ArrayList();
        ((ArrayList) term63110).add(term63112);
        ((ArrayList) term63110).add(term63114);
        ((ArrayList) term63110).add(term63116);
        ((ArrayList) term63110).add(term63118);
        term63023 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term63025 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term63027 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term63043 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63044 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63048 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63053 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63054 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63058 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term63023, term63023.getClass(), "id", -8075121428376355007L);
        setLongField(term63025, term63025.getClass(), "id", 685138334744218828L);
        setLongField(term63027, term63027.getClass(), "id", -2769601758499543843L);
        setField(term63027, term63027.getClass(), "extId", term63029);
        setField(term63027, term63027.getClass(), "luid", "QSvdWzkkPx");
        setIntField(term63044, term63044.getClass(), "year", 2017);
        setShortField(term63044, term63044.getClass(), "month", (short) 8);
        setShortField(term63044, term63044.getClass(), "day", (short) 6);
        setField(term63043, term63043.getClass(), "date", term63044);
        setByteField(term63048, term63048.getClass(), "hour", (byte) 22);
        setByteField(term63048, term63048.getClass(), "minute", (byte) 46);
        setByteField(term63048, term63048.getClass(), "second", (byte) 47);
        setIntField(term63048, term63048.getClass(), "nano", 782967389);
        setField(term63043, term63043.getClass(), "time", term63048);
        setField(term63027, term63027.getClass(), "registerTime", term63043);
        setIntField(term63054, term63054.getClass(), "year", 2029);
        setShortField(term63054, term63054.getClass(), "month", (short) 3);
        setShortField(term63054, term63054.getClass(), "day", (short) 3);
        setField(term63053, term63053.getClass(), "date", term63054);
        setByteField(term63058, term63058.getClass(), "hour", (byte) 2);
        setByteField(term63058, term63058.getClass(), "minute", (byte) 29);
        setByteField(term63058, term63058.getClass(), "second", (byte) 54);
        setIntField(term63058, term63058.getClass(), "nano", 846675209);
        setField(term63053, term63053.getClass(), "time", term63058);
        setField(term63027, term63027.getClass(), "accessTime", term63053);
        setField(term63025, term63025.getClass(), "card", term63027);
        setField(term63025, term63025.getClass(), "userName", "vStdEtWvae");
        setIntField(term63025, term63025.getClass(), "isNetMember", 833153549);
        setIntField(term63025, term63025.getClass(), "iconId", 2031081082);
        setIntField(term63025, term63025.getClass(), "plateId", -595867565);
        setIntField(term63025, term63025.getClass(), "titleId", -1428615750);
        setIntField(term63025, term63025.getClass(), "partnerId", -247199850);
        setIntField(term63025, term63025.getClass(), "frameId", 1369708580);
        setIntField(term63025, term63025.getClass(), "selectMapId", -1943851319);
        setIntField(term63025, term63025.getClass(), "totalAwake", 1613470339);
        setIntField(term63025, term63025.getClass(), "gradeRating", 764077315);
        setIntField(term63025, term63025.getClass(), "musicRating", -127465158);
        setIntField(term63025, term63025.getClass(), "playerRating", -727010746);
        setIntField(term63025, term63025.getClass(), "highestRating", 1698984137);
        setIntField(term63025, term63025.getClass(), "gradeRank", 1539842378);
        setIntField(term63025, term63025.getClass(), "classRank", -2020812793);
        setIntField(term63025, term63025.getClass(), "courseRank", 1214417682);
        setField(term63025, term63025.getClass(), "charaSlot", term63090);
        setField(term63025, term63025.getClass(), "charaLockSlot", term63110);
        setLongField(term63025, term63025.getClass(), "contentBit", 2429296542899066013L);
        setIntField(term63025, term63025.getClass(), "playCount", -492639935);
        setField(term63025, term63025.getClass(), "eventWatchedDate", "iApJWgnQkP");
        setField(term63025, term63025.getClass(), "lastGameId", "kHKzzYJxiP");
        setField(term63025, term63025.getClass(), "lastRomVersion", "INFnBrMIka");
        setField(term63025, term63025.getClass(), "lastDataVersion", "EwmpEgdvZs");
        setField(term63025, term63025.getClass(), "lastLoginDate", "vRjHouXWLC");
        setField(term63025, term63025.getClass(), "lastPlayDate", "XghDInkWEe");
        setIntField(term63025, term63025.getClass(), "lastPlayCredit", 1013003846);
        setIntField(term63025, term63025.getClass(), "lastPlayMode", -1997703261);
        setIntField(term63025, term63025.getClass(), "lastPlaceId", 1822676900);
        setField(term63025, term63025.getClass(), "lastPlaceName", "zPDuGbsYGT");
        setIntField(term63025, term63025.getClass(), "lastAllNetId", 1807366282);
        setIntField(term63025, term63025.getClass(), "lastRegionId", 1352119826);
        setField(term63025, term63025.getClass(), "lastRegionName", "apnNoBOovC");
        setField(term63025, term63025.getClass(), "lastClientId", "SyGIHWAumE");
        setField(term63025, term63025.getClass(), "lastCountryCode", "bMQUwQqyMc");
        setIntField(term63025, term63025.getClass(), "lastSelectEMoney", 399848636);
        setIntField(term63025, term63025.getClass(), "lastSelectTicket", -1577579504);
        setIntField(term63025, term63025.getClass(), "lastSelectCourse", -1664214126);
        setIntField(term63025, term63025.getClass(), "lastCountCourse", -124745318);
        setField(term63025, term63025.getClass(), "firstGameId", "CVaGhXmAUN");
        setField(term63025, term63025.getClass(), "firstRomVersion", "KnclcuNYRb");
        setField(term63025, term63025.getClass(), "firstDataVersion", "UDZJbJPmCC");
        setField(term63025, term63025.getClass(), "firstPlayDate", "oVkgUUfHis");
        setField(term63025, term63025.getClass(), "compatibleCmVersion", "hoCKQzIOhx");
        setField(term63025, term63025.getClass(), "dailyBonusDate", "znUxTdEvUD");
        setField(term63025, term63025.getClass(), "dailyCourseBonusDate", "PvtJhtGffh");
        setField(term63025, term63025.getClass(), "lastPairLoginDate", "KReGJTSQuY");
        setField(term63025, term63025.getClass(), "lastTrialPlayDate", "hqZmoXoMuS");
        setIntField(term63025, term63025.getClass(), "playVsCount", 885215896);
        setIntField(term63025, term63025.getClass(), "playSyncCount", 1157850302);
        setIntField(term63025, term63025.getClass(), "winCount", -1748801993);
        setIntField(term63025, term63025.getClass(), "helpCount", -1351089042);
        setIntField(term63025, term63025.getClass(), "comboCount", -368642982);
        setLongField(term63025, term63025.getClass(), "totalDeluxscore", 5867985083377188636L);
        setLongField(term63025, term63025.getClass(), "totalBasicDeluxscore", 3127660879530812585L);
        setLongField(term63025, term63025.getClass(), "totalAdvancedDeluxscore", 8719003136272047601L);
        setLongField(term63025, term63025.getClass(), "totalExpertDeluxscore", -3080436486706724387L);
        setLongField(term63025, term63025.getClass(), "totalMasterDeluxscore", -4645138191058941101L);
        setLongField(term63025, term63025.getClass(), "totalReMasterDeluxscore", -7214804908928828361L);
        setIntField(term63025, term63025.getClass(), "totalSync", 1100435548);
        setIntField(term63025, term63025.getClass(), "totalBasicSync", 1930975280);
        setIntField(term63025, term63025.getClass(), "totalAdvancedSync", 1639113177);
        setIntField(term63025, term63025.getClass(), "totalExpertSync", -1469393277);
        setIntField(term63025, term63025.getClass(), "totalMasterSync", 1311573269);
        setIntField(term63025, term63025.getClass(), "totalReMasterSync", 1393744942);
        setLongField(term63025, term63025.getClass(), "totalAchievement", 8330781560568888679L);
        setLongField(term63025, term63025.getClass(), "totalBasicAchievement", -4718136580123793528L);
        setLongField(term63025, term63025.getClass(), "totalAdvancedAchievement", 5370230694464734941L);
        setLongField(term63025, term63025.getClass(), "totalExpertAchievement", -1887513396695229317L);
        setLongField(term63025, term63025.getClass(), "totalMasterAchievement", 4538748174903798169L);
        setLongField(term63025, term63025.getClass(), "totalReMasterAchievement", 8651853359004042709L);
        setLongField(term63025, term63025.getClass(), "playerOldRating", -2356268402672275562L);
        setLongField(term63025, term63025.getClass(), "playerNewRating", 4920060206553726462L);
        setIntField(term63025, term63025.getClass(), "banState", 528056114);
        setLongField(term63025, term63025.getClass(), "dateTime", -5089949977716478457L);
        setField(term63023, term63023.getClass(), "user", term63025);
        setIntField(term63023, term63023.getClass(), "musicId", 1730452667);
        setIntField(term63023, term63023.getClass(), "level", 760722690);
        setIntField(term63023, term63023.getClass(), "playCount", -714009282);
        setIntField(term63023, term63023.getClass(), "achievement", -1506023567);
        setIntField(term63023, term63023.getClass(), "comboStatus", 172275665);
        setIntField(term63023, term63023.getClass(), "syncStatus", 1472271840);
        setIntField(term63023, term63023.getClass(), "deluxscoreMax", -2050302351);
        setIntField(term63023, term63023.getClass(), "scoreRank", 1778549764);
        term63396 = new Integer(456140800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term63396;
        callMethod(klass, "setMusicId", argTypes, term63023, args);
    }

};


