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

public class UserDetail_getTotalAdvancedSync_47644116564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231260;

    public UserDetail_getTotalAdvancedSync_47644116564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term231264 = new Long(7487838449539103993L);
        Integer term231327 = new Integer(528505320);
        Integer term231329 = new Integer(1255256909);
        Integer term231331 = new Integer(1364268540);
        Integer term231333 = new Integer(1613417207);
        Integer term231335 = new Integer(-267884738);
        Integer term231337 = new Integer(1701113802);
        Integer term231339 = new Integer(2142343992);
        ArrayList term231325 = new ArrayList();
        ((ArrayList) term231325).add(term231327);
        ((ArrayList) term231325).add(term231329);
        ((ArrayList) term231325).add(term231331);
        ((ArrayList) term231325).add(term231333);
        ((ArrayList) term231325).add(term231335);
        ((ArrayList) term231325).add(term231337);
        ((ArrayList) term231325).add(term231339);
        Integer term231345 = new Integer(-875414289);
        Integer term231347 = new Integer(510025419);
        Integer term231349 = new Integer(768579195);
        Integer term231351 = new Integer(935186156);
        ArrayList term231343 = new ArrayList();
        ((ArrayList) term231343).add(term231345);
        ((ArrayList) term231343).add(term231347);
        ((ArrayList) term231343).add(term231349);
        ((ArrayList) term231343).add(term231351);
        term231260 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term231262 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term231278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term231279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231283 = newInstance(Class.forName("java.time.LocalTime"));
        Object term231288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term231289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231293 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term231260, term231260.getClass(), "id", -7820629957062019016L);
        setLongField(term231262, term231262.getClass(), "id", 8546808375918306560L);
        setField(term231262, term231262.getClass(), "extId", term231264);
        setField(term231262, term231262.getClass(), "luid", "AxcOeEhUhX");
        setIntField(term231279, term231279.getClass(), "year", 2024);
        setShortField(term231279, term231279.getClass(), "month", (short) 5);
        setShortField(term231279, term231279.getClass(), "day", (short) 2);
        setField(term231278, term231278.getClass(), "date", term231279);
        setByteField(term231283, term231283.getClass(), "hour", (byte) 16);
        setByteField(term231283, term231283.getClass(), "minute", (byte) 41);
        setByteField(term231283, term231283.getClass(), "second", (byte) 21);
        setIntField(term231283, term231283.getClass(), "nano", 463370731);
        setField(term231278, term231278.getClass(), "time", term231283);
        setField(term231262, term231262.getClass(), "registerTime", term231278);
        setIntField(term231289, term231289.getClass(), "year", 2027);
        setShortField(term231289, term231289.getClass(), "month", (short) 10);
        setShortField(term231289, term231289.getClass(), "day", (short) 4);
        setField(term231288, term231288.getClass(), "date", term231289);
        setByteField(term231293, term231293.getClass(), "hour", (byte) 23);
        setByteField(term231293, term231293.getClass(), "minute", (byte) 48);
        setByteField(term231293, term231293.getClass(), "second", (byte) 10);
        setIntField(term231293, term231293.getClass(), "nano", 256586329);
        setField(term231288, term231288.getClass(), "time", term231293);
        setField(term231262, term231262.getClass(), "accessTime", term231288);
        setField(term231260, term231260.getClass(), "card", term231262);
        setField(term231260, term231260.getClass(), "userName", "iFdFaQoJtd");
        setIntField(term231260, term231260.getClass(), "isNetMember", -32960653);
        setIntField(term231260, term231260.getClass(), "iconId", -416911471);
        setIntField(term231260, term231260.getClass(), "plateId", -1202714572);
        setIntField(term231260, term231260.getClass(), "titleId", -1196961418);
        setIntField(term231260, term231260.getClass(), "partnerId", 1387563120);
        setIntField(term231260, term231260.getClass(), "frameId", 76477391);
        setIntField(term231260, term231260.getClass(), "selectMapId", 1959375944);
        setIntField(term231260, term231260.getClass(), "totalAwake", -989809275);
        setIntField(term231260, term231260.getClass(), "gradeRating", -198811836);
        setIntField(term231260, term231260.getClass(), "musicRating", 538159596);
        setIntField(term231260, term231260.getClass(), "playerRating", -711082612);
        setIntField(term231260, term231260.getClass(), "highestRating", -1053368081);
        setIntField(term231260, term231260.getClass(), "gradeRank", 708346792);
        setIntField(term231260, term231260.getClass(), "classRank", -402126719);
        setIntField(term231260, term231260.getClass(), "courseRank", -447989377);
        setField(term231260, term231260.getClass(), "charaSlot", term231325);
        setField(term231260, term231260.getClass(), "charaLockSlot", term231343);
        setLongField(term231260, term231260.getClass(), "contentBit", -2296694108636965262L);
        setIntField(term231260, term231260.getClass(), "playCount", -995008409);
        setField(term231260, term231260.getClass(), "eventWatchedDate", "jwbrWhGlmx");
        setField(term231260, term231260.getClass(), "lastGameId", "aFJwRTUFYs");
        setField(term231260, term231260.getClass(), "lastRomVersion", "QHNzIgBvry");
        setField(term231260, term231260.getClass(), "lastDataVersion", "SfLSyAmQEZ");
        setField(term231260, term231260.getClass(), "lastLoginDate", "tqNLzZCPHl");
        setField(term231260, term231260.getClass(), "lastPlayDate", "hYTyaZYHNE");
        setIntField(term231260, term231260.getClass(), "lastPlayCredit", -875149663);
        setIntField(term231260, term231260.getClass(), "lastPlayMode", 127189459);
        setIntField(term231260, term231260.getClass(), "lastPlaceId", 112918829);
        setField(term231260, term231260.getClass(), "lastPlaceName", "LAxSnBvfkM");
        setIntField(term231260, term231260.getClass(), "lastAllNetId", 1035574889);
        setIntField(term231260, term231260.getClass(), "lastRegionId", 679714254);
        setField(term231260, term231260.getClass(), "lastRegionName", "RLAVSPcIgS");
        setField(term231260, term231260.getClass(), "lastClientId", "kUCclcwUXz");
        setField(term231260, term231260.getClass(), "lastCountryCode", "QeLmDPNEJJ");
        setIntField(term231260, term231260.getClass(), "lastSelectEMoney", 87877280);
        setIntField(term231260, term231260.getClass(), "lastSelectTicket", 1439798945);
        setIntField(term231260, term231260.getClass(), "lastSelectCourse", 1123175842);
        setIntField(term231260, term231260.getClass(), "lastCountCourse", 1522845698);
        setField(term231260, term231260.getClass(), "firstGameId", "vKCMbZqDQh");
        setField(term231260, term231260.getClass(), "firstRomVersion", "jplaiEGqAX");
        setField(term231260, term231260.getClass(), "firstDataVersion", "jBEIjwXBat");
        setField(term231260, term231260.getClass(), "firstPlayDate", "YoXZiTWIfq");
        setField(term231260, term231260.getClass(), "compatibleCmVersion", "axiEfmpYKn");
        setField(term231260, term231260.getClass(), "dailyBonusDate", "qHOoQEXGDJ");
        setField(term231260, term231260.getClass(), "dailyCourseBonusDate", "KicaFputVc");
        setField(term231260, term231260.getClass(), "lastPairLoginDate", "LTKjLSGpcQ");
        setField(term231260, term231260.getClass(), "lastTrialPlayDate", "aTxAeHZsQJ");
        setIntField(term231260, term231260.getClass(), "playVsCount", -2025066214);
        setIntField(term231260, term231260.getClass(), "playSyncCount", 1206480279);
        setIntField(term231260, term231260.getClass(), "winCount", -496495218);
        setIntField(term231260, term231260.getClass(), "helpCount", 1283663634);
        setIntField(term231260, term231260.getClass(), "comboCount", 1978334259);
        setLongField(term231260, term231260.getClass(), "totalDeluxscore", 115184320156573542L);
        setLongField(term231260, term231260.getClass(), "totalBasicDeluxscore", -5192352240739849518L);
        setLongField(term231260, term231260.getClass(), "totalAdvancedDeluxscore", 6748970300109104263L);
        setLongField(term231260, term231260.getClass(), "totalExpertDeluxscore", -8294594230521407691L);
        setLongField(term231260, term231260.getClass(), "totalMasterDeluxscore", -8666244601924927641L);
        setLongField(term231260, term231260.getClass(), "totalReMasterDeluxscore", -1995356765968597169L);
        setIntField(term231260, term231260.getClass(), "totalSync", 690850678);
        setIntField(term231260, term231260.getClass(), "totalBasicSync", 2045633891);
        setIntField(term231260, term231260.getClass(), "totalAdvancedSync", 1795515119);
        setIntField(term231260, term231260.getClass(), "totalExpertSync", 968600347);
        setIntField(term231260, term231260.getClass(), "totalMasterSync", -700468612);
        setIntField(term231260, term231260.getClass(), "totalReMasterSync", 321982765);
        setLongField(term231260, term231260.getClass(), "totalAchievement", -6356470816180664936L);
        setLongField(term231260, term231260.getClass(), "totalBasicAchievement", -6897765086628386393L);
        setLongField(term231260, term231260.getClass(), "totalAdvancedAchievement", -1046939409955026466L);
        setLongField(term231260, term231260.getClass(), "totalExpertAchievement", -8985083735056061211L);
        setLongField(term231260, term231260.getClass(), "totalMasterAchievement", -4116568912512494319L);
        setLongField(term231260, term231260.getClass(), "totalReMasterAchievement", -1391513918138897073L);
        setLongField(term231260, term231260.getClass(), "playerOldRating", -8061662383472277177L);
        setLongField(term231260, term231260.getClass(), "playerNewRating", 7156880244966092433L);
        setIntField(term231260, term231260.getClass(), "banState", 48114166);
        setLongField(term231260, term231260.getClass(), "dateTime", -5395570594601954511L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedSync", argTypes, term231260, args);
    }

};


