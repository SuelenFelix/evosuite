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

public class UserDetail_getFirstRomVersion_174479611142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4253336;

    public UserDetail_getFirstRomVersion_174479611142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4253340 = new Long(6227673003320806424L);
        Integer term4253403 = new Integer(-1837027129);
        Integer term4253405 = new Integer(1406186846);
        Integer term4253407 = new Integer(-709701767);
        Integer term4253409 = new Integer(1445634110);
        Integer term4253411 = new Integer(430916113);
        Integer term4253413 = new Integer(-62605968);
        Integer term4253415 = new Integer(743020447);
        Integer term4253417 = new Integer(-227812702);
        ArrayList term4253401 = new ArrayList();
        ((ArrayList) term4253401).add(term4253403);
        ((ArrayList) term4253401).add(term4253405);
        ((ArrayList) term4253401).add(term4253407);
        ((ArrayList) term4253401).add(term4253409);
        ((ArrayList) term4253401).add(term4253411);
        ((ArrayList) term4253401).add(term4253413);
        ((ArrayList) term4253401).add(term4253415);
        ((ArrayList) term4253401).add(term4253417);
        Integer term4253423 = new Integer(-1688725575);
        Integer term4253425 = new Integer(-821504884);
        Integer term4253427 = new Integer(628485113);
        ArrayList term4253421 = new ArrayList();
        ((ArrayList) term4253421).add(term4253423);
        ((ArrayList) term4253421).add(term4253425);
        ((ArrayList) term4253421).add(term4253427);
        term4253336 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4253338 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4253354 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4253355 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4253359 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4253364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4253365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4253369 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4253336, term4253336.getClass(), "id", -5209222177532255453L);
        setLongField(term4253338, term4253338.getClass(), "id", 4585005139443374388L);
        setField(term4253338, term4253338.getClass(), "extId", term4253340);
        setField(term4253338, term4253338.getClass(), "luid", "aEXvmYbANw");
        setIntField(term4253355, term4253355.getClass(), "year", 2028);
        setShortField(term4253355, term4253355.getClass(), "month", (short) 6);
        setShortField(term4253355, term4253355.getClass(), "day", (short) 8);
        setField(term4253354, term4253354.getClass(), "date", term4253355);
        setByteField(term4253359, term4253359.getClass(), "hour", (byte) 16);
        setByteField(term4253359, term4253359.getClass(), "minute", (byte) 22);
        setByteField(term4253359, term4253359.getClass(), "second", (byte) 35);
        setIntField(term4253359, term4253359.getClass(), "nano", 659949986);
        setField(term4253354, term4253354.getClass(), "time", term4253359);
        setField(term4253338, term4253338.getClass(), "registerTime", term4253354);
        setIntField(term4253365, term4253365.getClass(), "year", 2021);
        setShortField(term4253365, term4253365.getClass(), "month", (short) 1);
        setShortField(term4253365, term4253365.getClass(), "day", (short) 26);
        setField(term4253364, term4253364.getClass(), "date", term4253365);
        setByteField(term4253369, term4253369.getClass(), "hour", (byte) 11);
        setByteField(term4253369, term4253369.getClass(), "minute", (byte) 48);
        setByteField(term4253369, term4253369.getClass(), "second", (byte) 8);
        setIntField(term4253369, term4253369.getClass(), "nano", 1856766);
        setField(term4253364, term4253364.getClass(), "time", term4253369);
        setField(term4253338, term4253338.getClass(), "accessTime", term4253364);
        setField(term4253336, term4253336.getClass(), "card", term4253338);
        setField(term4253336, term4253336.getClass(), "userName", "NBZHIRFnox");
        setIntField(term4253336, term4253336.getClass(), "isNetMember", 935366241);
        setIntField(term4253336, term4253336.getClass(), "iconId", 723399761);
        setIntField(term4253336, term4253336.getClass(), "plateId", 1084920279);
        setIntField(term4253336, term4253336.getClass(), "titleId", 346608532);
        setIntField(term4253336, term4253336.getClass(), "partnerId", -1839413802);
        setIntField(term4253336, term4253336.getClass(), "frameId", -152125556);
        setIntField(term4253336, term4253336.getClass(), "selectMapId", -972269020);
        setIntField(term4253336, term4253336.getClass(), "totalAwake", -283142823);
        setIntField(term4253336, term4253336.getClass(), "gradeRating", -844331673);
        setIntField(term4253336, term4253336.getClass(), "musicRating", 434121910);
        setIntField(term4253336, term4253336.getClass(), "playerRating", 315072492);
        setIntField(term4253336, term4253336.getClass(), "highestRating", -222819357);
        setIntField(term4253336, term4253336.getClass(), "gradeRank", -1758275850);
        setIntField(term4253336, term4253336.getClass(), "classRank", 1323885529);
        setIntField(term4253336, term4253336.getClass(), "courseRank", -373306818);
        setField(term4253336, term4253336.getClass(), "charaSlot", term4253401);
        setField(term4253336, term4253336.getClass(), "charaLockSlot", term4253421);
        setLongField(term4253336, term4253336.getClass(), "contentBit", -146074360670398503L);
        setIntField(term4253336, term4253336.getClass(), "playCount", 519489896);
        setField(term4253336, term4253336.getClass(), "eventWatchedDate", "kfoecpXETx");
        setField(term4253336, term4253336.getClass(), "lastGameId", "vWVpqXKhKE");
        setField(term4253336, term4253336.getClass(), "lastRomVersion", "DSAetXSTnn");
        setField(term4253336, term4253336.getClass(), "lastDataVersion", "vkOCEQyUoL");
        setField(term4253336, term4253336.getClass(), "lastLoginDate", "jMcklahmGz");
        setField(term4253336, term4253336.getClass(), "lastPlayDate", "PDnPspepXN");
        setIntField(term4253336, term4253336.getClass(), "lastPlayCredit", 1067000202);
        setIntField(term4253336, term4253336.getClass(), "lastPlayMode", -856783122);
        setIntField(term4253336, term4253336.getClass(), "lastPlaceId", -489693560);
        setField(term4253336, term4253336.getClass(), "lastPlaceName", "HjjDtUrIlL");
        setIntField(term4253336, term4253336.getClass(), "lastAllNetId", -1820689470);
        setIntField(term4253336, term4253336.getClass(), "lastRegionId", -979341487);
        setField(term4253336, term4253336.getClass(), "lastRegionName", "MQebVgHlvn");
        setField(term4253336, term4253336.getClass(), "lastClientId", "ibvVxyhtpS");
        setField(term4253336, term4253336.getClass(), "lastCountryCode", "jsrqhffzvN");
        setIntField(term4253336, term4253336.getClass(), "lastSelectEMoney", -1206363757);
        setIntField(term4253336, term4253336.getClass(), "lastSelectTicket", 1711038523);
        setIntField(term4253336, term4253336.getClass(), "lastSelectCourse", -1235911361);
        setIntField(term4253336, term4253336.getClass(), "lastCountCourse", -36532249);
        setField(term4253336, term4253336.getClass(), "firstGameId", "cTubcycSqy");
        setField(term4253336, term4253336.getClass(), "firstRomVersion", "qriAwqKDmE");
        setField(term4253336, term4253336.getClass(), "firstDataVersion", "AZainoYbaF");
        setField(term4253336, term4253336.getClass(), "firstPlayDate", "vfHuXztDZt");
        setField(term4253336, term4253336.getClass(), "compatibleCmVersion", "bnglCQzShm");
        setField(term4253336, term4253336.getClass(), "dailyBonusDate", "wKfEwQiOyM");
        setField(term4253336, term4253336.getClass(), "dailyCourseBonusDate", "fCrqbrHRZI");
        setField(term4253336, term4253336.getClass(), "lastPairLoginDate", "qfNGxJJNpp");
        setField(term4253336, term4253336.getClass(), "lastTrialPlayDate", "PgbggFRfwz");
        setIntField(term4253336, term4253336.getClass(), "playVsCount", -1145835527);
        setIntField(term4253336, term4253336.getClass(), "playSyncCount", -2014247249);
        setIntField(term4253336, term4253336.getClass(), "winCount", 1831804596);
        setIntField(term4253336, term4253336.getClass(), "helpCount", 1890360024);
        setIntField(term4253336, term4253336.getClass(), "comboCount", -1656661725);
        setLongField(term4253336, term4253336.getClass(), "totalDeluxscore", 7744601530145099908L);
        setLongField(term4253336, term4253336.getClass(), "totalBasicDeluxscore", 1857699918878718080L);
        setLongField(term4253336, term4253336.getClass(), "totalAdvancedDeluxscore", -939713594508407948L);
        setLongField(term4253336, term4253336.getClass(), "totalExpertDeluxscore", -4671800166994151519L);
        setLongField(term4253336, term4253336.getClass(), "totalMasterDeluxscore", -8491583674542432005L);
        setLongField(term4253336, term4253336.getClass(), "totalReMasterDeluxscore", -940706906273853291L);
        setIntField(term4253336, term4253336.getClass(), "totalSync", -1811321533);
        setIntField(term4253336, term4253336.getClass(), "totalBasicSync", 1248263896);
        setIntField(term4253336, term4253336.getClass(), "totalAdvancedSync", -1399810461);
        setIntField(term4253336, term4253336.getClass(), "totalExpertSync", -254068660);
        setIntField(term4253336, term4253336.getClass(), "totalMasterSync", 1920082376);
        setIntField(term4253336, term4253336.getClass(), "totalReMasterSync", -1203371314);
        setLongField(term4253336, term4253336.getClass(), "totalAchievement", 8370316248748795894L);
        setLongField(term4253336, term4253336.getClass(), "totalBasicAchievement", -5386713900794897334L);
        setLongField(term4253336, term4253336.getClass(), "totalAdvancedAchievement", -4277534836148526188L);
        setLongField(term4253336, term4253336.getClass(), "totalExpertAchievement", -3215617139080679866L);
        setLongField(term4253336, term4253336.getClass(), "totalMasterAchievement", -4515587995847372301L);
        setLongField(term4253336, term4253336.getClass(), "totalReMasterAchievement", -5465650442062922260L);
        setLongField(term4253336, term4253336.getClass(), "playerOldRating", 6645325068478480651L);
        setLongField(term4253336, term4253336.getClass(), "playerNewRating", 852496091417518078L);
        setIntField(term4253336, term4253336.getClass(), "banState", 694437505);
        setLongField(term4253336, term4253336.getClass(), "dateTime", 8051596167954550218L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstRomVersion", argTypes, term4253336, args);
    }

};


