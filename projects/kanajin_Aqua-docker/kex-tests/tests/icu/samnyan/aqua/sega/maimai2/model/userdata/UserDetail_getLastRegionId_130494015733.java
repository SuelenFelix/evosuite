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

public class UserDetail_getLastRegionId_130494015733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4248233;

    public UserDetail_getLastRegionId_130494015733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4248237 = new Long(8365898684422346232L);
        ArrayList term4248298 = new ArrayList();
        Integer term4248304 = new Integer(1738463601);
        Integer term4248306 = new Integer(-1010128268);
        Integer term4248308 = new Integer(-2057175143);
        Integer term4248310 = new Integer(1430166837);
        Integer term4248312 = new Integer(-1161108991);
        Integer term4248314 = new Integer(-2024150009);
        Integer term4248316 = new Integer(1182356135);
        Integer term4248318 = new Integer(313863614);
        Integer term4248320 = new Integer(-927688075);
        ArrayList term4248302 = new ArrayList();
        ((ArrayList) term4248302).add(term4248304);
        ((ArrayList) term4248302).add(term4248306);
        ((ArrayList) term4248302).add(term4248308);
        ((ArrayList) term4248302).add(term4248310);
        ((ArrayList) term4248302).add(term4248312);
        ((ArrayList) term4248302).add(term4248314);
        ((ArrayList) term4248302).add(term4248316);
        ((ArrayList) term4248302).add(term4248318);
        ((ArrayList) term4248302).add(term4248320);
        term4248233 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4248235 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4248251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4248252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4248256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4248261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4248262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4248266 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4248233, term4248233.getClass(), "id", -415475970332748489L);
        setLongField(term4248235, term4248235.getClass(), "id", 5437029414745512617L);
        setField(term4248235, term4248235.getClass(), "extId", term4248237);
        setField(term4248235, term4248235.getClass(), "luid", "hVVGpaGvNZ");
        setIntField(term4248252, term4248252.getClass(), "year", 2013);
        setShortField(term4248252, term4248252.getClass(), "month", (short) 2);
        setShortField(term4248252, term4248252.getClass(), "day", (short) 10);
        setField(term4248251, term4248251.getClass(), "date", term4248252);
        setByteField(term4248256, term4248256.getClass(), "hour", (byte) 22);
        setByteField(term4248256, term4248256.getClass(), "minute", (byte) 53);
        setByteField(term4248256, term4248256.getClass(), "second", (byte) 34);
        setIntField(term4248256, term4248256.getClass(), "nano", 333574227);
        setField(term4248251, term4248251.getClass(), "time", term4248256);
        setField(term4248235, term4248235.getClass(), "registerTime", term4248251);
        setIntField(term4248262, term4248262.getClass(), "year", 2028);
        setShortField(term4248262, term4248262.getClass(), "month", (short) 6);
        setShortField(term4248262, term4248262.getClass(), "day", (short) 28);
        setField(term4248261, term4248261.getClass(), "date", term4248262);
        setByteField(term4248266, term4248266.getClass(), "hour", (byte) 18);
        setByteField(term4248266, term4248266.getClass(), "minute", (byte) 0);
        setByteField(term4248266, term4248266.getClass(), "second", (byte) 34);
        setIntField(term4248266, term4248266.getClass(), "nano", 716167754);
        setField(term4248261, term4248261.getClass(), "time", term4248266);
        setField(term4248235, term4248235.getClass(), "accessTime", term4248261);
        setField(term4248233, term4248233.getClass(), "card", term4248235);
        setField(term4248233, term4248233.getClass(), "userName", "ghPnxSXLao");
        setIntField(term4248233, term4248233.getClass(), "isNetMember", -1341746501);
        setIntField(term4248233, term4248233.getClass(), "iconId", 1301134220);
        setIntField(term4248233, term4248233.getClass(), "plateId", -1449637210);
        setIntField(term4248233, term4248233.getClass(), "titleId", -1589785689);
        setIntField(term4248233, term4248233.getClass(), "partnerId", -1119236436);
        setIntField(term4248233, term4248233.getClass(), "frameId", -150074642);
        setIntField(term4248233, term4248233.getClass(), "selectMapId", -834853552);
        setIntField(term4248233, term4248233.getClass(), "totalAwake", -1729536812);
        setIntField(term4248233, term4248233.getClass(), "gradeRating", 1600769624);
        setIntField(term4248233, term4248233.getClass(), "musicRating", -1130273005);
        setIntField(term4248233, term4248233.getClass(), "playerRating", -1063120229);
        setIntField(term4248233, term4248233.getClass(), "highestRating", -497166620);
        setIntField(term4248233, term4248233.getClass(), "gradeRank", 1747646070);
        setIntField(term4248233, term4248233.getClass(), "classRank", -95424237);
        setIntField(term4248233, term4248233.getClass(), "courseRank", -1380777832);
        setField(term4248233, term4248233.getClass(), "charaSlot", term4248298);
        setField(term4248233, term4248233.getClass(), "charaLockSlot", term4248302);
        setLongField(term4248233, term4248233.getClass(), "contentBit", -5789768730635777686L);
        setIntField(term4248233, term4248233.getClass(), "playCount", -1783279857);
        setField(term4248233, term4248233.getClass(), "eventWatchedDate", "mMbMYUVsZd");
        setField(term4248233, term4248233.getClass(), "lastGameId", "KiwRRDoREO");
        setField(term4248233, term4248233.getClass(), "lastRomVersion", "xeAUnfYtjn");
        setField(term4248233, term4248233.getClass(), "lastDataVersion", "PzTwAQnqTa");
        setField(term4248233, term4248233.getClass(), "lastLoginDate", "ZeOuhjKRkq");
        setField(term4248233, term4248233.getClass(), "lastPlayDate", "FbLuSmZOAA");
        setIntField(term4248233, term4248233.getClass(), "lastPlayCredit", -749072307);
        setIntField(term4248233, term4248233.getClass(), "lastPlayMode", 1735793506);
        setIntField(term4248233, term4248233.getClass(), "lastPlaceId", 724748651);
        setField(term4248233, term4248233.getClass(), "lastPlaceName", "xsmBJMDPFm");
        setIntField(term4248233, term4248233.getClass(), "lastAllNetId", 434416192);
        setIntField(term4248233, term4248233.getClass(), "lastRegionId", 307984778);
        setField(term4248233, term4248233.getClass(), "lastRegionName", "GtglWLazNU");
        setField(term4248233, term4248233.getClass(), "lastClientId", "yqXevheHzp");
        setField(term4248233, term4248233.getClass(), "lastCountryCode", "osLARrKowO");
        setIntField(term4248233, term4248233.getClass(), "lastSelectEMoney", -685474036);
        setIntField(term4248233, term4248233.getClass(), "lastSelectTicket", -858515139);
        setIntField(term4248233, term4248233.getClass(), "lastSelectCourse", -1814118918);
        setIntField(term4248233, term4248233.getClass(), "lastCountCourse", -136512172);
        setField(term4248233, term4248233.getClass(), "firstGameId", "oWBcyJZlpV");
        setField(term4248233, term4248233.getClass(), "firstRomVersion", "BlhYoixHNh");
        setField(term4248233, term4248233.getClass(), "firstDataVersion", "hEuccpIDPV");
        setField(term4248233, term4248233.getClass(), "firstPlayDate", "rteDRXuHKL");
        setField(term4248233, term4248233.getClass(), "compatibleCmVersion", "RpHTPpyIpJ");
        setField(term4248233, term4248233.getClass(), "dailyBonusDate", "SWcGQyExWf");
        setField(term4248233, term4248233.getClass(), "dailyCourseBonusDate", "XjLIdFYrJi");
        setField(term4248233, term4248233.getClass(), "lastPairLoginDate", "qeKbGqJgzV");
        setField(term4248233, term4248233.getClass(), "lastTrialPlayDate", "otGJcMIEbq");
        setIntField(term4248233, term4248233.getClass(), "playVsCount", -766426815);
        setIntField(term4248233, term4248233.getClass(), "playSyncCount", 975585143);
        setIntField(term4248233, term4248233.getClass(), "winCount", -196207751);
        setIntField(term4248233, term4248233.getClass(), "helpCount", -106714467);
        setIntField(term4248233, term4248233.getClass(), "comboCount", -126104300);
        setLongField(term4248233, term4248233.getClass(), "totalDeluxscore", -8874110174534900915L);
        setLongField(term4248233, term4248233.getClass(), "totalBasicDeluxscore", -4940941959674134902L);
        setLongField(term4248233, term4248233.getClass(), "totalAdvancedDeluxscore", 2399527443787014187L);
        setLongField(term4248233, term4248233.getClass(), "totalExpertDeluxscore", 2297826487270322591L);
        setLongField(term4248233, term4248233.getClass(), "totalMasterDeluxscore", -2547699362707196900L);
        setLongField(term4248233, term4248233.getClass(), "totalReMasterDeluxscore", -827145999666661186L);
        setIntField(term4248233, term4248233.getClass(), "totalSync", -1511956692);
        setIntField(term4248233, term4248233.getClass(), "totalBasicSync", 2038294807);
        setIntField(term4248233, term4248233.getClass(), "totalAdvancedSync", -735036485);
        setIntField(term4248233, term4248233.getClass(), "totalExpertSync", 908846463);
        setIntField(term4248233, term4248233.getClass(), "totalMasterSync", 1071690454);
        setIntField(term4248233, term4248233.getClass(), "totalReMasterSync", -1850970639);
        setLongField(term4248233, term4248233.getClass(), "totalAchievement", -2696661925733006718L);
        setLongField(term4248233, term4248233.getClass(), "totalBasicAchievement", -2811892345680142451L);
        setLongField(term4248233, term4248233.getClass(), "totalAdvancedAchievement", 2362495962231851367L);
        setLongField(term4248233, term4248233.getClass(), "totalExpertAchievement", 7098989393512810503L);
        setLongField(term4248233, term4248233.getClass(), "totalMasterAchievement", -6934129155830171162L);
        setLongField(term4248233, term4248233.getClass(), "totalReMasterAchievement", -4070306237829082244L);
        setLongField(term4248233, term4248233.getClass(), "playerOldRating", -8704514817545096503L);
        setLongField(term4248233, term4248233.getClass(), "playerNewRating", 4560944951774779355L);
        setIntField(term4248233, term4248233.getClass(), "banState", 76145462);
        setLongField(term4248233, term4248233.getClass(), "dateTime", 3033904399560163699L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term4248233, args);
    }

};


