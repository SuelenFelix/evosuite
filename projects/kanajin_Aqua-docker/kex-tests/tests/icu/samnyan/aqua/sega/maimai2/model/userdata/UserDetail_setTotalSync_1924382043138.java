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

public class UserDetail_setTotalSync_1924382043138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4308317;
     Object term4308672;

    public UserDetail_setTotalSync_1924382043138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4308321 = new Long(-6205406662057862003L);
        Integer term4308384 = new Integer(-2047208630);
        Integer term4308386 = new Integer(1549289354);
        ArrayList term4308382 = new ArrayList();
        ((ArrayList) term4308382).add(term4308384);
        ((ArrayList) term4308382).add(term4308386);
        Integer term4308392 = new Integer(-1656094384);
        Integer term4308394 = new Integer(-1810376733);
        Integer term4308396 = new Integer(1564142914);
        Integer term4308398 = new Integer(-702106315);
        Integer term4308400 = new Integer(-350021779);
        Integer term4308402 = new Integer(1208670155);
        ArrayList term4308390 = new ArrayList();
        ((ArrayList) term4308390).add(term4308392);
        ((ArrayList) term4308390).add(term4308394);
        ((ArrayList) term4308390).add(term4308396);
        ((ArrayList) term4308390).add(term4308398);
        ((ArrayList) term4308390).add(term4308400);
        ((ArrayList) term4308390).add(term4308402);
        term4308317 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4308319 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4308335 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4308336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4308340 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4308345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4308346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4308350 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4308317, term4308317.getClass(), "id", 24925606375926306L);
        setLongField(term4308319, term4308319.getClass(), "id", -5375927605651585547L);
        setField(term4308319, term4308319.getClass(), "extId", term4308321);
        setField(term4308319, term4308319.getClass(), "luid", "LTFZyjLRDW");
        setIntField(term4308336, term4308336.getClass(), "year", 2029);
        setShortField(term4308336, term4308336.getClass(), "month", (short) 11);
        setShortField(term4308336, term4308336.getClass(), "day", (short) 12);
        setField(term4308335, term4308335.getClass(), "date", term4308336);
        setByteField(term4308340, term4308340.getClass(), "hour", (byte) 15);
        setByteField(term4308340, term4308340.getClass(), "minute", (byte) 55);
        setByteField(term4308340, term4308340.getClass(), "second", (byte) 37);
        setIntField(term4308340, term4308340.getClass(), "nano", 907797862);
        setField(term4308335, term4308335.getClass(), "time", term4308340);
        setField(term4308319, term4308319.getClass(), "registerTime", term4308335);
        setIntField(term4308346, term4308346.getClass(), "year", 2023);
        setShortField(term4308346, term4308346.getClass(), "month", (short) 7);
        setShortField(term4308346, term4308346.getClass(), "day", (short) 19);
        setField(term4308345, term4308345.getClass(), "date", term4308346);
        setByteField(term4308350, term4308350.getClass(), "hour", (byte) 3);
        setByteField(term4308350, term4308350.getClass(), "minute", (byte) 38);
        setByteField(term4308350, term4308350.getClass(), "second", (byte) 50);
        setIntField(term4308350, term4308350.getClass(), "nano", 518764757);
        setField(term4308345, term4308345.getClass(), "time", term4308350);
        setField(term4308319, term4308319.getClass(), "accessTime", term4308345);
        setField(term4308317, term4308317.getClass(), "card", term4308319);
        setField(term4308317, term4308317.getClass(), "userName", "AITjTdqVXD");
        setIntField(term4308317, term4308317.getClass(), "isNetMember", -104537067);
        setIntField(term4308317, term4308317.getClass(), "iconId", -923629708);
        setIntField(term4308317, term4308317.getClass(), "plateId", 1284800066);
        setIntField(term4308317, term4308317.getClass(), "titleId", 1684750367);
        setIntField(term4308317, term4308317.getClass(), "partnerId", 276430936);
        setIntField(term4308317, term4308317.getClass(), "frameId", 1947923638);
        setIntField(term4308317, term4308317.getClass(), "selectMapId", 68642283);
        setIntField(term4308317, term4308317.getClass(), "totalAwake", -858395471);
        setIntField(term4308317, term4308317.getClass(), "gradeRating", 1078989997);
        setIntField(term4308317, term4308317.getClass(), "musicRating", -889535831);
        setIntField(term4308317, term4308317.getClass(), "playerRating", 203856142);
        setIntField(term4308317, term4308317.getClass(), "highestRating", -1982128585);
        setIntField(term4308317, term4308317.getClass(), "gradeRank", -364284919);
        setIntField(term4308317, term4308317.getClass(), "classRank", 1551785686);
        setIntField(term4308317, term4308317.getClass(), "courseRank", -965133971);
        setField(term4308317, term4308317.getClass(), "charaSlot", term4308382);
        setField(term4308317, term4308317.getClass(), "charaLockSlot", term4308390);
        setLongField(term4308317, term4308317.getClass(), "contentBit", -6080308216727340858L);
        setIntField(term4308317, term4308317.getClass(), "playCount", 546481948);
        setField(term4308317, term4308317.getClass(), "eventWatchedDate", "bEqKDdFLTw");
        setField(term4308317, term4308317.getClass(), "lastGameId", "OBPsLkUSor");
        setField(term4308317, term4308317.getClass(), "lastRomVersion", "hkNXjVFGGF");
        setField(term4308317, term4308317.getClass(), "lastDataVersion", "oukfohEnWK");
        setField(term4308317, term4308317.getClass(), "lastLoginDate", "fuBEVBHkHS");
        setField(term4308317, term4308317.getClass(), "lastPlayDate", "FxyDsXcNaD");
        setIntField(term4308317, term4308317.getClass(), "lastPlayCredit", 932581470);
        setIntField(term4308317, term4308317.getClass(), "lastPlayMode", -1039745835);
        setIntField(term4308317, term4308317.getClass(), "lastPlaceId", 176841710);
        setField(term4308317, term4308317.getClass(), "lastPlaceName", "yEUvCQhLCY");
        setIntField(term4308317, term4308317.getClass(), "lastAllNetId", -2095851078);
        setIntField(term4308317, term4308317.getClass(), "lastRegionId", -248559623);
        setField(term4308317, term4308317.getClass(), "lastRegionName", "RcPozOQvJz");
        setField(term4308317, term4308317.getClass(), "lastClientId", "LXrTKPjvaG");
        setField(term4308317, term4308317.getClass(), "lastCountryCode", "niGekVbJAn");
        setIntField(term4308317, term4308317.getClass(), "lastSelectEMoney", 2004328926);
        setIntField(term4308317, term4308317.getClass(), "lastSelectTicket", 415394);
        setIntField(term4308317, term4308317.getClass(), "lastSelectCourse", -1530507252);
        setIntField(term4308317, term4308317.getClass(), "lastCountCourse", 1805165867);
        setField(term4308317, term4308317.getClass(), "firstGameId", "FhMBlXVnth");
        setField(term4308317, term4308317.getClass(), "firstRomVersion", "RuGYcOhJEN");
        setField(term4308317, term4308317.getClass(), "firstDataVersion", "aOvvlKUVyt");
        setField(term4308317, term4308317.getClass(), "firstPlayDate", "ahMdpgHlaP");
        setField(term4308317, term4308317.getClass(), "compatibleCmVersion", "kUuQNTDtaR");
        setField(term4308317, term4308317.getClass(), "dailyBonusDate", "IbKQzBIsQb");
        setField(term4308317, term4308317.getClass(), "dailyCourseBonusDate", "PISeshuebn");
        setField(term4308317, term4308317.getClass(), "lastPairLoginDate", "DTkrGHtPJo");
        setField(term4308317, term4308317.getClass(), "lastTrialPlayDate", "OCvGsIpHmV");
        setIntField(term4308317, term4308317.getClass(), "playVsCount", 1269208480);
        setIntField(term4308317, term4308317.getClass(), "playSyncCount", -2049608958);
        setIntField(term4308317, term4308317.getClass(), "winCount", 1288370856);
        setIntField(term4308317, term4308317.getClass(), "helpCount", -503679957);
        setIntField(term4308317, term4308317.getClass(), "comboCount", -209220527);
        setLongField(term4308317, term4308317.getClass(), "totalDeluxscore", 1387468561190857264L);
        setLongField(term4308317, term4308317.getClass(), "totalBasicDeluxscore", -2635295161789819710L);
        setLongField(term4308317, term4308317.getClass(), "totalAdvancedDeluxscore", -463571073102525850L);
        setLongField(term4308317, term4308317.getClass(), "totalExpertDeluxscore", -6935834545249669148L);
        setLongField(term4308317, term4308317.getClass(), "totalMasterDeluxscore", 7017691917931929329L);
        setLongField(term4308317, term4308317.getClass(), "totalReMasterDeluxscore", -9003355717062807437L);
        setIntField(term4308317, term4308317.getClass(), "totalSync", 526295163);
        setIntField(term4308317, term4308317.getClass(), "totalBasicSync", 158509803);
        setIntField(term4308317, term4308317.getClass(), "totalAdvancedSync", 531977018);
        setIntField(term4308317, term4308317.getClass(), "totalExpertSync", -357458426);
        setIntField(term4308317, term4308317.getClass(), "totalMasterSync", -1557212373);
        setIntField(term4308317, term4308317.getClass(), "totalReMasterSync", 1163299957);
        setLongField(term4308317, term4308317.getClass(), "totalAchievement", -2406066221188027183L);
        setLongField(term4308317, term4308317.getClass(), "totalBasicAchievement", 3530068850827810454L);
        setLongField(term4308317, term4308317.getClass(), "totalAdvancedAchievement", -5149988815975119956L);
        setLongField(term4308317, term4308317.getClass(), "totalExpertAchievement", -1055284146086210571L);
        setLongField(term4308317, term4308317.getClass(), "totalMasterAchievement", -3057288200011393003L);
        setLongField(term4308317, term4308317.getClass(), "totalReMasterAchievement", -6811497952665978464L);
        setLongField(term4308317, term4308317.getClass(), "playerOldRating", -4007130458935050736L);
        setLongField(term4308317, term4308317.getClass(), "playerNewRating", 2275416371286597679L);
        setIntField(term4308317, term4308317.getClass(), "banState", 131866888);
        setLongField(term4308317, term4308317.getClass(), "dateTime", 3782393107303614421L);
        term4308672 = new Integer(715611971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4308672;
        callMethod(klass, "setTotalSync", argTypes, term4308317, args);
    }

};


