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

public class UserDetail_getDailyCourseBonusDate_178333472448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222234;

    public UserDetail_getDailyCourseBonusDate_178333472448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term222238 = new Long(-4776514981294468834L);
        Integer term222301 = new Integer(-838891056);
        Integer term222303 = new Integer(-2133180225);
        Integer term222305 = new Integer(-1486915040);
        Integer term222307 = new Integer(-1960290626);
        Integer term222309 = new Integer(-1941903722);
        Integer term222311 = new Integer(491009356);
        ArrayList term222299 = new ArrayList();
        ((ArrayList) term222299).add(term222301);
        ((ArrayList) term222299).add(term222303);
        ((ArrayList) term222299).add(term222305);
        ((ArrayList) term222299).add(term222307);
        ((ArrayList) term222299).add(term222309);
        ((ArrayList) term222299).add(term222311);
        Integer term222317 = new Integer(1180952236);
        Integer term222319 = new Integer(1549827025);
        Integer term222321 = new Integer(523998499);
        Integer term222323 = new Integer(-808741755);
        Integer term222325 = new Integer(-1088446142);
        Integer term222327 = new Integer(342337914);
        Integer term222329 = new Integer(920216419);
        Integer term222331 = new Integer(-1576226952);
        ArrayList term222315 = new ArrayList();
        ((ArrayList) term222315).add(term222317);
        ((ArrayList) term222315).add(term222319);
        ((ArrayList) term222315).add(term222321);
        ((ArrayList) term222315).add(term222323);
        ((ArrayList) term222315).add(term222325);
        ((ArrayList) term222315).add(term222327);
        ((ArrayList) term222315).add(term222329);
        ((ArrayList) term222315).add(term222331);
        term222234 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term222236 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term222252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term222253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term222257 = newInstance(Class.forName("java.time.LocalTime"));
        Object term222262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term222263 = newInstance(Class.forName("java.time.LocalDate"));
        Object term222267 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term222234, term222234.getClass(), "id", -7692588761426354453L);
        setLongField(term222236, term222236.getClass(), "id", 5483033495350683432L);
        setField(term222236, term222236.getClass(), "extId", term222238);
        setField(term222236, term222236.getClass(), "luid", "BoCmrFdGJG");
        setIntField(term222253, term222253.getClass(), "year", 2020);
        setShortField(term222253, term222253.getClass(), "month", (short) 6);
        setShortField(term222253, term222253.getClass(), "day", (short) 2);
        setField(term222252, term222252.getClass(), "date", term222253);
        setByteField(term222257, term222257.getClass(), "hour", (byte) 10);
        setByteField(term222257, term222257.getClass(), "minute", (byte) 4);
        setByteField(term222257, term222257.getClass(), "second", (byte) 37);
        setIntField(term222257, term222257.getClass(), "nano", 482860495);
        setField(term222252, term222252.getClass(), "time", term222257);
        setField(term222236, term222236.getClass(), "registerTime", term222252);
        setIntField(term222263, term222263.getClass(), "year", 2027);
        setShortField(term222263, term222263.getClass(), "month", (short) 1);
        setShortField(term222263, term222263.getClass(), "day", (short) 9);
        setField(term222262, term222262.getClass(), "date", term222263);
        setByteField(term222267, term222267.getClass(), "hour", (byte) 3);
        setByteField(term222267, term222267.getClass(), "minute", (byte) 52);
        setByteField(term222267, term222267.getClass(), "second", (byte) 13);
        setIntField(term222267, term222267.getClass(), "nano", 357829313);
        setField(term222262, term222262.getClass(), "time", term222267);
        setField(term222236, term222236.getClass(), "accessTime", term222262);
        setField(term222234, term222234.getClass(), "card", term222236);
        setField(term222234, term222234.getClass(), "userName", "krDKyFENLG");
        setIntField(term222234, term222234.getClass(), "isNetMember", -1881871368);
        setIntField(term222234, term222234.getClass(), "iconId", -1725616340);
        setIntField(term222234, term222234.getClass(), "plateId", 1579393316);
        setIntField(term222234, term222234.getClass(), "titleId", 291434697);
        setIntField(term222234, term222234.getClass(), "partnerId", 1157245504);
        setIntField(term222234, term222234.getClass(), "frameId", -1468740029);
        setIntField(term222234, term222234.getClass(), "selectMapId", 1419365246);
        setIntField(term222234, term222234.getClass(), "totalAwake", -591173078);
        setIntField(term222234, term222234.getClass(), "gradeRating", 1565076807);
        setIntField(term222234, term222234.getClass(), "musicRating", 1016664474);
        setIntField(term222234, term222234.getClass(), "playerRating", -1410426998);
        setIntField(term222234, term222234.getClass(), "highestRating", 1213587618);
        setIntField(term222234, term222234.getClass(), "gradeRank", 980395350);
        setIntField(term222234, term222234.getClass(), "classRank", -941431124);
        setIntField(term222234, term222234.getClass(), "courseRank", 228698990);
        setField(term222234, term222234.getClass(), "charaSlot", term222299);
        setField(term222234, term222234.getClass(), "charaLockSlot", term222315);
        setLongField(term222234, term222234.getClass(), "contentBit", 3342244067405999240L);
        setIntField(term222234, term222234.getClass(), "playCount", -432537089);
        setField(term222234, term222234.getClass(), "eventWatchedDate", "uRTXSIWwGX");
        setField(term222234, term222234.getClass(), "lastGameId", "xBNbicbWsS");
        setField(term222234, term222234.getClass(), "lastRomVersion", "aBJVxtxQUV");
        setField(term222234, term222234.getClass(), "lastDataVersion", "EzBJFruxoe");
        setField(term222234, term222234.getClass(), "lastLoginDate", "TVmMvdipbq");
        setField(term222234, term222234.getClass(), "lastPlayDate", "effAsgGDhp");
        setIntField(term222234, term222234.getClass(), "lastPlayCredit", -1871594001);
        setIntField(term222234, term222234.getClass(), "lastPlayMode", -59629101);
        setIntField(term222234, term222234.getClass(), "lastPlaceId", -1074564020);
        setField(term222234, term222234.getClass(), "lastPlaceName", "hhtaPOFlgi");
        setIntField(term222234, term222234.getClass(), "lastAllNetId", -897257334);
        setIntField(term222234, term222234.getClass(), "lastRegionId", 761466913);
        setField(term222234, term222234.getClass(), "lastRegionName", "VbEAsGcxTC");
        setField(term222234, term222234.getClass(), "lastClientId", "gxUvvNtLkx");
        setField(term222234, term222234.getClass(), "lastCountryCode", "wGOlIqkDZq");
        setIntField(term222234, term222234.getClass(), "lastSelectEMoney", 1025254415);
        setIntField(term222234, term222234.getClass(), "lastSelectTicket", -1179135307);
        setIntField(term222234, term222234.getClass(), "lastSelectCourse", -706418583);
        setIntField(term222234, term222234.getClass(), "lastCountCourse", -1861491170);
        setField(term222234, term222234.getClass(), "firstGameId", "EJiSVehsWz");
        setField(term222234, term222234.getClass(), "firstRomVersion", "BSmqogTrfj");
        setField(term222234, term222234.getClass(), "firstDataVersion", "BXnsMmmfIG");
        setField(term222234, term222234.getClass(), "firstPlayDate", "XosGyziZMs");
        setField(term222234, term222234.getClass(), "compatibleCmVersion", "UjoiRiwpuv");
        setField(term222234, term222234.getClass(), "dailyBonusDate", "XbTprIRnaq");
        setField(term222234, term222234.getClass(), "dailyCourseBonusDate", "vpaIuPijLa");
        setField(term222234, term222234.getClass(), "lastPairLoginDate", "yvLFPtZSre");
        setField(term222234, term222234.getClass(), "lastTrialPlayDate", "wjgIjeboAE");
        setIntField(term222234, term222234.getClass(), "playVsCount", 1307613446);
        setIntField(term222234, term222234.getClass(), "playSyncCount", -1321035168);
        setIntField(term222234, term222234.getClass(), "winCount", 1558927173);
        setIntField(term222234, term222234.getClass(), "helpCount", -1134124022);
        setIntField(term222234, term222234.getClass(), "comboCount", -734162613);
        setLongField(term222234, term222234.getClass(), "totalDeluxscore", -7298604731354582631L);
        setLongField(term222234, term222234.getClass(), "totalBasicDeluxscore", -8820464091062875709L);
        setLongField(term222234, term222234.getClass(), "totalAdvancedDeluxscore", -5703762183346952605L);
        setLongField(term222234, term222234.getClass(), "totalExpertDeluxscore", 8657340983102677045L);
        setLongField(term222234, term222234.getClass(), "totalMasterDeluxscore", -1863074720646032217L);
        setLongField(term222234, term222234.getClass(), "totalReMasterDeluxscore", -8688273580923380979L);
        setIntField(term222234, term222234.getClass(), "totalSync", 2087704854);
        setIntField(term222234, term222234.getClass(), "totalBasicSync", 2085374508);
        setIntField(term222234, term222234.getClass(), "totalAdvancedSync", 323643925);
        setIntField(term222234, term222234.getClass(), "totalExpertSync", 2084863202);
        setIntField(term222234, term222234.getClass(), "totalMasterSync", 561322224);
        setIntField(term222234, term222234.getClass(), "totalReMasterSync", 1667257783);
        setLongField(term222234, term222234.getClass(), "totalAchievement", 2149110869830089681L);
        setLongField(term222234, term222234.getClass(), "totalBasicAchievement", 2190124280923227151L);
        setLongField(term222234, term222234.getClass(), "totalAdvancedAchievement", 8770509605736864321L);
        setLongField(term222234, term222234.getClass(), "totalExpertAchievement", 3148571922499562719L);
        setLongField(term222234, term222234.getClass(), "totalMasterAchievement", 3261256835924329005L);
        setLongField(term222234, term222234.getClass(), "totalReMasterAchievement", -1379458118352377729L);
        setLongField(term222234, term222234.getClass(), "playerOldRating", -4957808992481568572L);
        setLongField(term222234, term222234.getClass(), "playerNewRating", -7679615625814779626L);
        setIntField(term222234, term222234.getClass(), "banState", -766164021);
        setLongField(term222234, term222234.getClass(), "dateTime", -2882457524702747753L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDailyCourseBonusDate", argTypes, term222234, args);
    }

};


