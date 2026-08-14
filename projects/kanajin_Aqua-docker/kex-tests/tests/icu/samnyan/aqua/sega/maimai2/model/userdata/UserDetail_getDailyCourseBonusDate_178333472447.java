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

public class UserDetail_getDailyCourseBonusDate_178333472447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222179;

    public UserDetail_getDailyCourseBonusDate_178333472447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term222183 = new Long(-4776514981294468834L);
        Integer term222246 = new Integer(-838891056);
        Integer term222248 = new Integer(-2133180225);
        Integer term222250 = new Integer(-1486915040);
        Integer term222252 = new Integer(-1960290626);
        Integer term222254 = new Integer(-1941903722);
        Integer term222256 = new Integer(491009356);
        ArrayList term222244 = new ArrayList();
        ((ArrayList) term222244).add(term222246);
        ((ArrayList) term222244).add(term222248);
        ((ArrayList) term222244).add(term222250);
        ((ArrayList) term222244).add(term222252);
        ((ArrayList) term222244).add(term222254);
        ((ArrayList) term222244).add(term222256);
        Integer term222262 = new Integer(1180952236);
        Integer term222264 = new Integer(1549827025);
        Integer term222266 = new Integer(523998499);
        Integer term222268 = new Integer(-808741755);
        Integer term222270 = new Integer(-1088446142);
        Integer term222272 = new Integer(342337914);
        Integer term222274 = new Integer(920216419);
        Integer term222276 = new Integer(-1576226952);
        ArrayList term222260 = new ArrayList();
        ((ArrayList) term222260).add(term222262);
        ((ArrayList) term222260).add(term222264);
        ((ArrayList) term222260).add(term222266);
        ((ArrayList) term222260).add(term222268);
        ((ArrayList) term222260).add(term222270);
        ((ArrayList) term222260).add(term222272);
        ((ArrayList) term222260).add(term222274);
        ((ArrayList) term222260).add(term222276);
        term222179 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term222181 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term222197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term222198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term222202 = newInstance(Class.forName("java.time.LocalTime"));
        Object term222207 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term222208 = newInstance(Class.forName("java.time.LocalDate"));
        Object term222212 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term222179, term222179.getClass(), "id", -7692588761426354453L);
        setLongField(term222181, term222181.getClass(), "id", 5483033495350683432L);
        setField(term222181, term222181.getClass(), "extId", term222183);
        setField(term222181, term222181.getClass(), "luid", "BoCmrFdGJG");
        setIntField(term222198, term222198.getClass(), "year", 2020);
        setShortField(term222198, term222198.getClass(), "month", (short) 6);
        setShortField(term222198, term222198.getClass(), "day", (short) 2);
        setField(term222197, term222197.getClass(), "date", term222198);
        setByteField(term222202, term222202.getClass(), "hour", (byte) 10);
        setByteField(term222202, term222202.getClass(), "minute", (byte) 4);
        setByteField(term222202, term222202.getClass(), "second", (byte) 37);
        setIntField(term222202, term222202.getClass(), "nano", 482860495);
        setField(term222197, term222197.getClass(), "time", term222202);
        setField(term222181, term222181.getClass(), "registerTime", term222197);
        setIntField(term222208, term222208.getClass(), "year", 2027);
        setShortField(term222208, term222208.getClass(), "month", (short) 1);
        setShortField(term222208, term222208.getClass(), "day", (short) 9);
        setField(term222207, term222207.getClass(), "date", term222208);
        setByteField(term222212, term222212.getClass(), "hour", (byte) 3);
        setByteField(term222212, term222212.getClass(), "minute", (byte) 52);
        setByteField(term222212, term222212.getClass(), "second", (byte) 13);
        setIntField(term222212, term222212.getClass(), "nano", 357829313);
        setField(term222207, term222207.getClass(), "time", term222212);
        setField(term222181, term222181.getClass(), "accessTime", term222207);
        setField(term222179, term222179.getClass(), "card", term222181);
        setField(term222179, term222179.getClass(), "userName", "krDKyFENLG");
        setIntField(term222179, term222179.getClass(), "isNetMember", -1881871368);
        setIntField(term222179, term222179.getClass(), "iconId", -1725616340);
        setIntField(term222179, term222179.getClass(), "plateId", 1579393316);
        setIntField(term222179, term222179.getClass(), "titleId", 291434697);
        setIntField(term222179, term222179.getClass(), "partnerId", 1157245504);
        setIntField(term222179, term222179.getClass(), "frameId", -1468740029);
        setIntField(term222179, term222179.getClass(), "selectMapId", 1419365246);
        setIntField(term222179, term222179.getClass(), "totalAwake", -591173078);
        setIntField(term222179, term222179.getClass(), "gradeRating", 1565076807);
        setIntField(term222179, term222179.getClass(), "musicRating", 1016664474);
        setIntField(term222179, term222179.getClass(), "playerRating", -1410426998);
        setIntField(term222179, term222179.getClass(), "highestRating", 1213587618);
        setIntField(term222179, term222179.getClass(), "gradeRank", 980395350);
        setIntField(term222179, term222179.getClass(), "classRank", -941431124);
        setIntField(term222179, term222179.getClass(), "courseRank", 228698990);
        setField(term222179, term222179.getClass(), "charaSlot", term222244);
        setField(term222179, term222179.getClass(), "charaLockSlot", term222260);
        setLongField(term222179, term222179.getClass(), "contentBit", 3342244067405999240L);
        setIntField(term222179, term222179.getClass(), "playCount", -432537089);
        setField(term222179, term222179.getClass(), "eventWatchedDate", "uRTXSIWwGX");
        setField(term222179, term222179.getClass(), "lastGameId", "xBNbicbWsS");
        setField(term222179, term222179.getClass(), "lastRomVersion", "aBJVxtxQUV");
        setField(term222179, term222179.getClass(), "lastDataVersion", "EzBJFruxoe");
        setField(term222179, term222179.getClass(), "lastLoginDate", "TVmMvdipbq");
        setField(term222179, term222179.getClass(), "lastPlayDate", "effAsgGDhp");
        setIntField(term222179, term222179.getClass(), "lastPlayCredit", -1871594001);
        setIntField(term222179, term222179.getClass(), "lastPlayMode", -59629101);
        setIntField(term222179, term222179.getClass(), "lastPlaceId", -1074564020);
        setField(term222179, term222179.getClass(), "lastPlaceName", "hhtaPOFlgi");
        setIntField(term222179, term222179.getClass(), "lastAllNetId", -897257334);
        setIntField(term222179, term222179.getClass(), "lastRegionId", 761466913);
        setField(term222179, term222179.getClass(), "lastRegionName", "VbEAsGcxTC");
        setField(term222179, term222179.getClass(), "lastClientId", "gxUvvNtLkx");
        setField(term222179, term222179.getClass(), "lastCountryCode", "wGOlIqkDZq");
        setIntField(term222179, term222179.getClass(), "lastSelectEMoney", 1025254415);
        setIntField(term222179, term222179.getClass(), "lastSelectTicket", -1179135307);
        setIntField(term222179, term222179.getClass(), "lastSelectCourse", -706418583);
        setIntField(term222179, term222179.getClass(), "lastCountCourse", -1861491170);
        setField(term222179, term222179.getClass(), "firstGameId", "EJiSVehsWz");
        setField(term222179, term222179.getClass(), "firstRomVersion", "BSmqogTrfj");
        setField(term222179, term222179.getClass(), "firstDataVersion", "BXnsMmmfIG");
        setField(term222179, term222179.getClass(), "firstPlayDate", "XosGyziZMs");
        setField(term222179, term222179.getClass(), "compatibleCmVersion", "UjoiRiwpuv");
        setField(term222179, term222179.getClass(), "dailyBonusDate", "XbTprIRnaq");
        setField(term222179, term222179.getClass(), "dailyCourseBonusDate", "vpaIuPijLa");
        setField(term222179, term222179.getClass(), "lastPairLoginDate", "yvLFPtZSre");
        setField(term222179, term222179.getClass(), "lastTrialPlayDate", "wjgIjeboAE");
        setIntField(term222179, term222179.getClass(), "playVsCount", 1307613446);
        setIntField(term222179, term222179.getClass(), "playSyncCount", -1321035168);
        setIntField(term222179, term222179.getClass(), "winCount", 1558927173);
        setIntField(term222179, term222179.getClass(), "helpCount", -1134124022);
        setIntField(term222179, term222179.getClass(), "comboCount", -734162613);
        setLongField(term222179, term222179.getClass(), "totalDeluxscore", -7298604731354582631L);
        setLongField(term222179, term222179.getClass(), "totalBasicDeluxscore", -8820464091062875709L);
        setLongField(term222179, term222179.getClass(), "totalAdvancedDeluxscore", -5703762183346952605L);
        setLongField(term222179, term222179.getClass(), "totalExpertDeluxscore", 8657340983102677045L);
        setLongField(term222179, term222179.getClass(), "totalMasterDeluxscore", -1863074720646032217L);
        setLongField(term222179, term222179.getClass(), "totalReMasterDeluxscore", -8688273580923380979L);
        setIntField(term222179, term222179.getClass(), "totalSync", 2087704854);
        setIntField(term222179, term222179.getClass(), "totalBasicSync", 2085374508);
        setIntField(term222179, term222179.getClass(), "totalAdvancedSync", 323643925);
        setIntField(term222179, term222179.getClass(), "totalExpertSync", 2084863202);
        setIntField(term222179, term222179.getClass(), "totalMasterSync", 561322224);
        setIntField(term222179, term222179.getClass(), "totalReMasterSync", 1667257783);
        setLongField(term222179, term222179.getClass(), "totalAchievement", 2149110869830089681L);
        setLongField(term222179, term222179.getClass(), "totalBasicAchievement", 2190124280923227151L);
        setLongField(term222179, term222179.getClass(), "totalAdvancedAchievement", 8770509605736864321L);
        setLongField(term222179, term222179.getClass(), "totalExpertAchievement", 3148571922499562719L);
        setLongField(term222179, term222179.getClass(), "totalMasterAchievement", 3261256835924329005L);
        setLongField(term222179, term222179.getClass(), "totalReMasterAchievement", -1379458118352377729L);
        setLongField(term222179, term222179.getClass(), "playerOldRating", -4957808992481568572L);
        setLongField(term222179, term222179.getClass(), "playerNewRating", -7679615625814779626L);
        setIntField(term222179, term222179.getClass(), "banState", -766164021);
        setLongField(term222179, term222179.getClass(), "dateTime", -2882457524702747753L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDailyCourseBonusDate", argTypes, term222179, args);
    }

};


