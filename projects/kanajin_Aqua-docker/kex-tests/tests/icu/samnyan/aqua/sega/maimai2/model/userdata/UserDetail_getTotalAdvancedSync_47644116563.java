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

public class UserDetail_getTotalAdvancedSync_47644116563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231205;

    public UserDetail_getTotalAdvancedSync_47644116563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term231209 = new Long(7487838449539103993L);
        Integer term231272 = new Integer(528505320);
        Integer term231274 = new Integer(1255256909);
        Integer term231276 = new Integer(1364268540);
        Integer term231278 = new Integer(1613417207);
        Integer term231280 = new Integer(-267884738);
        Integer term231282 = new Integer(1701113802);
        Integer term231284 = new Integer(2142343992);
        ArrayList term231270 = new ArrayList();
        ((ArrayList) term231270).add(term231272);
        ((ArrayList) term231270).add(term231274);
        ((ArrayList) term231270).add(term231276);
        ((ArrayList) term231270).add(term231278);
        ((ArrayList) term231270).add(term231280);
        ((ArrayList) term231270).add(term231282);
        ((ArrayList) term231270).add(term231284);
        Integer term231290 = new Integer(-875414289);
        Integer term231292 = new Integer(510025419);
        Integer term231294 = new Integer(768579195);
        Integer term231296 = new Integer(935186156);
        ArrayList term231288 = new ArrayList();
        ((ArrayList) term231288).add(term231290);
        ((ArrayList) term231288).add(term231292);
        ((ArrayList) term231288).add(term231294);
        ((ArrayList) term231288).add(term231296);
        term231205 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term231207 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term231223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term231224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231228 = newInstance(Class.forName("java.time.LocalTime"));
        Object term231233 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term231234 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231238 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term231205, term231205.getClass(), "id", -7820629957062019016L);
        setLongField(term231207, term231207.getClass(), "id", 8546808375918306560L);
        setField(term231207, term231207.getClass(), "extId", term231209);
        setField(term231207, term231207.getClass(), "luid", "AxcOeEhUhX");
        setIntField(term231224, term231224.getClass(), "year", 2024);
        setShortField(term231224, term231224.getClass(), "month", (short) 5);
        setShortField(term231224, term231224.getClass(), "day", (short) 2);
        setField(term231223, term231223.getClass(), "date", term231224);
        setByteField(term231228, term231228.getClass(), "hour", (byte) 16);
        setByteField(term231228, term231228.getClass(), "minute", (byte) 41);
        setByteField(term231228, term231228.getClass(), "second", (byte) 21);
        setIntField(term231228, term231228.getClass(), "nano", 463370731);
        setField(term231223, term231223.getClass(), "time", term231228);
        setField(term231207, term231207.getClass(), "registerTime", term231223);
        setIntField(term231234, term231234.getClass(), "year", 2027);
        setShortField(term231234, term231234.getClass(), "month", (short) 10);
        setShortField(term231234, term231234.getClass(), "day", (short) 4);
        setField(term231233, term231233.getClass(), "date", term231234);
        setByteField(term231238, term231238.getClass(), "hour", (byte) 23);
        setByteField(term231238, term231238.getClass(), "minute", (byte) 48);
        setByteField(term231238, term231238.getClass(), "second", (byte) 10);
        setIntField(term231238, term231238.getClass(), "nano", 256586329);
        setField(term231233, term231233.getClass(), "time", term231238);
        setField(term231207, term231207.getClass(), "accessTime", term231233);
        setField(term231205, term231205.getClass(), "card", term231207);
        setField(term231205, term231205.getClass(), "userName", "iFdFaQoJtd");
        setIntField(term231205, term231205.getClass(), "isNetMember", -32960653);
        setIntField(term231205, term231205.getClass(), "iconId", -416911471);
        setIntField(term231205, term231205.getClass(), "plateId", -1202714572);
        setIntField(term231205, term231205.getClass(), "titleId", -1196961418);
        setIntField(term231205, term231205.getClass(), "partnerId", 1387563120);
        setIntField(term231205, term231205.getClass(), "frameId", 76477391);
        setIntField(term231205, term231205.getClass(), "selectMapId", 1959375944);
        setIntField(term231205, term231205.getClass(), "totalAwake", -989809275);
        setIntField(term231205, term231205.getClass(), "gradeRating", -198811836);
        setIntField(term231205, term231205.getClass(), "musicRating", 538159596);
        setIntField(term231205, term231205.getClass(), "playerRating", -711082612);
        setIntField(term231205, term231205.getClass(), "highestRating", -1053368081);
        setIntField(term231205, term231205.getClass(), "gradeRank", 708346792);
        setIntField(term231205, term231205.getClass(), "classRank", -402126719);
        setIntField(term231205, term231205.getClass(), "courseRank", -447989377);
        setField(term231205, term231205.getClass(), "charaSlot", term231270);
        setField(term231205, term231205.getClass(), "charaLockSlot", term231288);
        setLongField(term231205, term231205.getClass(), "contentBit", -2296694108636965262L);
        setIntField(term231205, term231205.getClass(), "playCount", -995008409);
        setField(term231205, term231205.getClass(), "eventWatchedDate", "jwbrWhGlmx");
        setField(term231205, term231205.getClass(), "lastGameId", "aFJwRTUFYs");
        setField(term231205, term231205.getClass(), "lastRomVersion", "QHNzIgBvry");
        setField(term231205, term231205.getClass(), "lastDataVersion", "SfLSyAmQEZ");
        setField(term231205, term231205.getClass(), "lastLoginDate", "tqNLzZCPHl");
        setField(term231205, term231205.getClass(), "lastPlayDate", "hYTyaZYHNE");
        setIntField(term231205, term231205.getClass(), "lastPlayCredit", -875149663);
        setIntField(term231205, term231205.getClass(), "lastPlayMode", 127189459);
        setIntField(term231205, term231205.getClass(), "lastPlaceId", 112918829);
        setField(term231205, term231205.getClass(), "lastPlaceName", "LAxSnBvfkM");
        setIntField(term231205, term231205.getClass(), "lastAllNetId", 1035574889);
        setIntField(term231205, term231205.getClass(), "lastRegionId", 679714254);
        setField(term231205, term231205.getClass(), "lastRegionName", "RLAVSPcIgS");
        setField(term231205, term231205.getClass(), "lastClientId", "kUCclcwUXz");
        setField(term231205, term231205.getClass(), "lastCountryCode", "QeLmDPNEJJ");
        setIntField(term231205, term231205.getClass(), "lastSelectEMoney", 87877280);
        setIntField(term231205, term231205.getClass(), "lastSelectTicket", 1439798945);
        setIntField(term231205, term231205.getClass(), "lastSelectCourse", 1123175842);
        setIntField(term231205, term231205.getClass(), "lastCountCourse", 1522845698);
        setField(term231205, term231205.getClass(), "firstGameId", "vKCMbZqDQh");
        setField(term231205, term231205.getClass(), "firstRomVersion", "jplaiEGqAX");
        setField(term231205, term231205.getClass(), "firstDataVersion", "jBEIjwXBat");
        setField(term231205, term231205.getClass(), "firstPlayDate", "YoXZiTWIfq");
        setField(term231205, term231205.getClass(), "compatibleCmVersion", "axiEfmpYKn");
        setField(term231205, term231205.getClass(), "dailyBonusDate", "qHOoQEXGDJ");
        setField(term231205, term231205.getClass(), "dailyCourseBonusDate", "KicaFputVc");
        setField(term231205, term231205.getClass(), "lastPairLoginDate", "LTKjLSGpcQ");
        setField(term231205, term231205.getClass(), "lastTrialPlayDate", "aTxAeHZsQJ");
        setIntField(term231205, term231205.getClass(), "playVsCount", -2025066214);
        setIntField(term231205, term231205.getClass(), "playSyncCount", 1206480279);
        setIntField(term231205, term231205.getClass(), "winCount", -496495218);
        setIntField(term231205, term231205.getClass(), "helpCount", 1283663634);
        setIntField(term231205, term231205.getClass(), "comboCount", 1978334259);
        setLongField(term231205, term231205.getClass(), "totalDeluxscore", 115184320156573542L);
        setLongField(term231205, term231205.getClass(), "totalBasicDeluxscore", -5192352240739849518L);
        setLongField(term231205, term231205.getClass(), "totalAdvancedDeluxscore", 6748970300109104263L);
        setLongField(term231205, term231205.getClass(), "totalExpertDeluxscore", -8294594230521407691L);
        setLongField(term231205, term231205.getClass(), "totalMasterDeluxscore", -8666244601924927641L);
        setLongField(term231205, term231205.getClass(), "totalReMasterDeluxscore", -1995356765968597169L);
        setIntField(term231205, term231205.getClass(), "totalSync", 690850678);
        setIntField(term231205, term231205.getClass(), "totalBasicSync", 2045633891);
        setIntField(term231205, term231205.getClass(), "totalAdvancedSync", 1795515119);
        setIntField(term231205, term231205.getClass(), "totalExpertSync", 968600347);
        setIntField(term231205, term231205.getClass(), "totalMasterSync", -700468612);
        setIntField(term231205, term231205.getClass(), "totalReMasterSync", 321982765);
        setLongField(term231205, term231205.getClass(), "totalAchievement", -6356470816180664936L);
        setLongField(term231205, term231205.getClass(), "totalBasicAchievement", -6897765086628386393L);
        setLongField(term231205, term231205.getClass(), "totalAdvancedAchievement", -1046939409955026466L);
        setLongField(term231205, term231205.getClass(), "totalExpertAchievement", -8985083735056061211L);
        setLongField(term231205, term231205.getClass(), "totalMasterAchievement", -4116568912512494319L);
        setLongField(term231205, term231205.getClass(), "totalReMasterAchievement", -1391513918138897073L);
        setLongField(term231205, term231205.getClass(), "playerOldRating", -8061662383472277177L);
        setLongField(term231205, term231205.getClass(), "playerNewRating", 7156880244966092433L);
        setIntField(term231205, term231205.getClass(), "banState", 48114166);
        setLongField(term231205, term231205.getClass(), "dateTime", -5395570594601954511L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedSync", argTypes, term231205, args);
    }

};


