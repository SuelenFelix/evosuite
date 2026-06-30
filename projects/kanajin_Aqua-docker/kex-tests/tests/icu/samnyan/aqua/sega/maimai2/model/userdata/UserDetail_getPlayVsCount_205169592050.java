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

public class UserDetail_getPlayVsCount_205169592050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4257838;

    public UserDetail_getPlayVsCount_205169592050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4257842 = new Long(-862440733015005866L);
        Integer term4257905 = new Integer(-1249437874);
        Integer term4257907 = new Integer(721993587);
        ArrayList term4257903 = new ArrayList();
        ((ArrayList) term4257903).add(term4257905);
        ((ArrayList) term4257903).add(term4257907);
        Integer term4257913 = new Integer(-2115303175);
        Integer term4257915 = new Integer(958435482);
        Integer term4257917 = new Integer(-1013016284);
        Integer term4257919 = new Integer(2102415180);
        ArrayList term4257911 = new ArrayList();
        ((ArrayList) term4257911).add(term4257913);
        ((ArrayList) term4257911).add(term4257915);
        ((ArrayList) term4257911).add(term4257917);
        ((ArrayList) term4257911).add(term4257919);
        term4257838 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4257840 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4257856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4257857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4257861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4257866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4257867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4257871 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4257838, term4257838.getClass(), "id", -2515306735473517920L);
        setLongField(term4257840, term4257840.getClass(), "id", -2953940979800486579L);
        setField(term4257840, term4257840.getClass(), "extId", term4257842);
        setField(term4257840, term4257840.getClass(), "luid", "xgUWUKMPcA");
        setIntField(term4257857, term4257857.getClass(), "year", 2013);
        setShortField(term4257857, term4257857.getClass(), "month", (short) 7);
        setShortField(term4257857, term4257857.getClass(), "day", (short) 14);
        setField(term4257856, term4257856.getClass(), "date", term4257857);
        setByteField(term4257861, term4257861.getClass(), "hour", (byte) 23);
        setByteField(term4257861, term4257861.getClass(), "minute", (byte) 52);
        setByteField(term4257861, term4257861.getClass(), "second", (byte) 54);
        setIntField(term4257861, term4257861.getClass(), "nano", 644099348);
        setField(term4257856, term4257856.getClass(), "time", term4257861);
        setField(term4257840, term4257840.getClass(), "registerTime", term4257856);
        setIntField(term4257867, term4257867.getClass(), "year", 2027);
        setShortField(term4257867, term4257867.getClass(), "month", (short) 1);
        setShortField(term4257867, term4257867.getClass(), "day", (short) 5);
        setField(term4257866, term4257866.getClass(), "date", term4257867);
        setByteField(term4257871, term4257871.getClass(), "hour", (byte) 2);
        setByteField(term4257871, term4257871.getClass(), "minute", (byte) 59);
        setByteField(term4257871, term4257871.getClass(), "second", (byte) 41);
        setIntField(term4257871, term4257871.getClass(), "nano", 609672666);
        setField(term4257866, term4257866.getClass(), "time", term4257871);
        setField(term4257840, term4257840.getClass(), "accessTime", term4257866);
        setField(term4257838, term4257838.getClass(), "card", term4257840);
        setField(term4257838, term4257838.getClass(), "userName", "YXgYRMzWbR");
        setIntField(term4257838, term4257838.getClass(), "isNetMember", -1448305133);
        setIntField(term4257838, term4257838.getClass(), "iconId", -1566408309);
        setIntField(term4257838, term4257838.getClass(), "plateId", -443843800);
        setIntField(term4257838, term4257838.getClass(), "titleId", -1299104632);
        setIntField(term4257838, term4257838.getClass(), "partnerId", 999293206);
        setIntField(term4257838, term4257838.getClass(), "frameId", 721144034);
        setIntField(term4257838, term4257838.getClass(), "selectMapId", 1526930596);
        setIntField(term4257838, term4257838.getClass(), "totalAwake", -1004342900);
        setIntField(term4257838, term4257838.getClass(), "gradeRating", -1460104058);
        setIntField(term4257838, term4257838.getClass(), "musicRating", -30433214);
        setIntField(term4257838, term4257838.getClass(), "playerRating", 67924750);
        setIntField(term4257838, term4257838.getClass(), "highestRating", 1189527683);
        setIntField(term4257838, term4257838.getClass(), "gradeRank", 1464859893);
        setIntField(term4257838, term4257838.getClass(), "classRank", -1086647552);
        setIntField(term4257838, term4257838.getClass(), "courseRank", -962910201);
        setField(term4257838, term4257838.getClass(), "charaSlot", term4257903);
        setField(term4257838, term4257838.getClass(), "charaLockSlot", term4257911);
        setLongField(term4257838, term4257838.getClass(), "contentBit", 6829443961466952346L);
        setIntField(term4257838, term4257838.getClass(), "playCount", -1372900602);
        setField(term4257838, term4257838.getClass(), "eventWatchedDate", "uckDIepGYT");
        setField(term4257838, term4257838.getClass(), "lastGameId", "gXfDYxxdrU");
        setField(term4257838, term4257838.getClass(), "lastRomVersion", "EJAarbCDpa");
        setField(term4257838, term4257838.getClass(), "lastDataVersion", "wbhKpDRObi");
        setField(term4257838, term4257838.getClass(), "lastLoginDate", "cqFHtmXMEM");
        setField(term4257838, term4257838.getClass(), "lastPlayDate", "fJXHGfSacN");
        setIntField(term4257838, term4257838.getClass(), "lastPlayCredit", -1804294018);
        setIntField(term4257838, term4257838.getClass(), "lastPlayMode", -1531707733);
        setIntField(term4257838, term4257838.getClass(), "lastPlaceId", -1576990149);
        setField(term4257838, term4257838.getClass(), "lastPlaceName", "YIAAcTMXBf");
        setIntField(term4257838, term4257838.getClass(), "lastAllNetId", -1663355948);
        setIntField(term4257838, term4257838.getClass(), "lastRegionId", 179073872);
        setField(term4257838, term4257838.getClass(), "lastRegionName", "iNawtjjMrz");
        setField(term4257838, term4257838.getClass(), "lastClientId", "ArfAYZaBnj");
        setField(term4257838, term4257838.getClass(), "lastCountryCode", "bcoeBjLNqB");
        setIntField(term4257838, term4257838.getClass(), "lastSelectEMoney", -124274884);
        setIntField(term4257838, term4257838.getClass(), "lastSelectTicket", 962637690);
        setIntField(term4257838, term4257838.getClass(), "lastSelectCourse", -2027327444);
        setIntField(term4257838, term4257838.getClass(), "lastCountCourse", 561942636);
        setField(term4257838, term4257838.getClass(), "firstGameId", "jPVzkggnHd");
        setField(term4257838, term4257838.getClass(), "firstRomVersion", "hvrSDfwwVd");
        setField(term4257838, term4257838.getClass(), "firstDataVersion", "vszGinldGl");
        setField(term4257838, term4257838.getClass(), "firstPlayDate", "yPbhJZLTWT");
        setField(term4257838, term4257838.getClass(), "compatibleCmVersion", "bhMszATcZn");
        setField(term4257838, term4257838.getClass(), "dailyBonusDate", "ziOuIpZsIp");
        setField(term4257838, term4257838.getClass(), "dailyCourseBonusDate", "pXXMKZKTzp");
        setField(term4257838, term4257838.getClass(), "lastPairLoginDate", "cTDAdBVvoS");
        setField(term4257838, term4257838.getClass(), "lastTrialPlayDate", "rKchIlHfur");
        setIntField(term4257838, term4257838.getClass(), "playVsCount", -1461503349);
        setIntField(term4257838, term4257838.getClass(), "playSyncCount", 698717479);
        setIntField(term4257838, term4257838.getClass(), "winCount", -830473634);
        setIntField(term4257838, term4257838.getClass(), "helpCount", 1732033197);
        setIntField(term4257838, term4257838.getClass(), "comboCount", 548841219);
        setLongField(term4257838, term4257838.getClass(), "totalDeluxscore", 1482008249582340347L);
        setLongField(term4257838, term4257838.getClass(), "totalBasicDeluxscore", 2160972049544492991L);
        setLongField(term4257838, term4257838.getClass(), "totalAdvancedDeluxscore", 1387520671978618465L);
        setLongField(term4257838, term4257838.getClass(), "totalExpertDeluxscore", 2804010754980284954L);
        setLongField(term4257838, term4257838.getClass(), "totalMasterDeluxscore", 1379080454294878919L);
        setLongField(term4257838, term4257838.getClass(), "totalReMasterDeluxscore", -6337426665465214810L);
        setIntField(term4257838, term4257838.getClass(), "totalSync", -533503275);
        setIntField(term4257838, term4257838.getClass(), "totalBasicSync", 1194262943);
        setIntField(term4257838, term4257838.getClass(), "totalAdvancedSync", -989859319);
        setIntField(term4257838, term4257838.getClass(), "totalExpertSync", -273880679);
        setIntField(term4257838, term4257838.getClass(), "totalMasterSync", -1770769618);
        setIntField(term4257838, term4257838.getClass(), "totalReMasterSync", 330216221);
        setLongField(term4257838, term4257838.getClass(), "totalAchievement", -6459143361409868164L);
        setLongField(term4257838, term4257838.getClass(), "totalBasicAchievement", 6496845772619030547L);
        setLongField(term4257838, term4257838.getClass(), "totalAdvancedAchievement", -7926350150949561535L);
        setLongField(term4257838, term4257838.getClass(), "totalExpertAchievement", 6266450599649440202L);
        setLongField(term4257838, term4257838.getClass(), "totalMasterAchievement", 1889159823970530534L);
        setLongField(term4257838, term4257838.getClass(), "totalReMasterAchievement", 4428520646243450671L);
        setLongField(term4257838, term4257838.getClass(), "playerOldRating", 7798535882682771509L);
        setLongField(term4257838, term4257838.getClass(), "playerNewRating", 5727430931564348709L);
        setIntField(term4257838, term4257838.getClass(), "banState", -530757355);
        setLongField(term4257838, term4257838.getClass(), "dateTime", 938882952571575311L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayVsCount", argTypes, term4257838, args);
    }

};


