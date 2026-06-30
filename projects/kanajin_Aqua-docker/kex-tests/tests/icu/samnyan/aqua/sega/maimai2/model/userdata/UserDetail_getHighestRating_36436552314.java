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

public class UserDetail_getHighestRating_36436552314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4237430;

    public UserDetail_getHighestRating_36436552314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4237434 = new Long(-3549201925417898505L);
        Integer term4237497 = new Integer(-1171001349);
        Integer term4237499 = new Integer(-171268418);
        Integer term4237501 = new Integer(-512014955);
        Integer term4237503 = new Integer(727682522);
        Integer term4237505 = new Integer(-948539005);
        ArrayList term4237495 = new ArrayList();
        ((ArrayList) term4237495).add(term4237497);
        ((ArrayList) term4237495).add(term4237499);
        ((ArrayList) term4237495).add(term4237501);
        ((ArrayList) term4237495).add(term4237503);
        ((ArrayList) term4237495).add(term4237505);
        Integer term4237511 = new Integer(-109851814);
        Integer term4237513 = new Integer(-1512846192);
        Integer term4237515 = new Integer(1915662147);
        Integer term4237517 = new Integer(1574061857);
        Integer term4237519 = new Integer(1496265790);
        Integer term4237521 = new Integer(-1548575078);
        Integer term4237523 = new Integer(80031735);
        Integer term4237525 = new Integer(-1471664971);
        ArrayList term4237509 = new ArrayList();
        ((ArrayList) term4237509).add(term4237511);
        ((ArrayList) term4237509).add(term4237513);
        ((ArrayList) term4237509).add(term4237515);
        ((ArrayList) term4237509).add(term4237517);
        ((ArrayList) term4237509).add(term4237519);
        ((ArrayList) term4237509).add(term4237521);
        ((ArrayList) term4237509).add(term4237523);
        ((ArrayList) term4237509).add(term4237525);
        term4237430 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4237432 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4237448 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4237449 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4237453 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4237458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4237459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4237463 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4237430, term4237430.getClass(), "id", 2229204553175462310L);
        setLongField(term4237432, term4237432.getClass(), "id", 7173762877278610861L);
        setField(term4237432, term4237432.getClass(), "extId", term4237434);
        setField(term4237432, term4237432.getClass(), "luid", "IkMXMdqyiH");
        setIntField(term4237449, term4237449.getClass(), "year", 2012);
        setShortField(term4237449, term4237449.getClass(), "month", (short) 2);
        setShortField(term4237449, term4237449.getClass(), "day", (short) 16);
        setField(term4237448, term4237448.getClass(), "date", term4237449);
        setByteField(term4237453, term4237453.getClass(), "hour", (byte) 19);
        setByteField(term4237453, term4237453.getClass(), "minute", (byte) 49);
        setByteField(term4237453, term4237453.getClass(), "second", (byte) 48);
        setIntField(term4237453, term4237453.getClass(), "nano", 44451269);
        setField(term4237448, term4237448.getClass(), "time", term4237453);
        setField(term4237432, term4237432.getClass(), "registerTime", term4237448);
        setIntField(term4237459, term4237459.getClass(), "year", 2011);
        setShortField(term4237459, term4237459.getClass(), "month", (short) 3);
        setShortField(term4237459, term4237459.getClass(), "day", (short) 30);
        setField(term4237458, term4237458.getClass(), "date", term4237459);
        setByteField(term4237463, term4237463.getClass(), "hour", (byte) 7);
        setByteField(term4237463, term4237463.getClass(), "minute", (byte) 59);
        setByteField(term4237463, term4237463.getClass(), "second", (byte) 3);
        setIntField(term4237463, term4237463.getClass(), "nano", 729178251);
        setField(term4237458, term4237458.getClass(), "time", term4237463);
        setField(term4237432, term4237432.getClass(), "accessTime", term4237458);
        setField(term4237430, term4237430.getClass(), "card", term4237432);
        setField(term4237430, term4237430.getClass(), "userName", "WhyeqiFrWJ");
        setIntField(term4237430, term4237430.getClass(), "isNetMember", -25628503);
        setIntField(term4237430, term4237430.getClass(), "iconId", 1386203219);
        setIntField(term4237430, term4237430.getClass(), "plateId", 1951494180);
        setIntField(term4237430, term4237430.getClass(), "titleId", -815892778);
        setIntField(term4237430, term4237430.getClass(), "partnerId", 895738479);
        setIntField(term4237430, term4237430.getClass(), "frameId", 974968819);
        setIntField(term4237430, term4237430.getClass(), "selectMapId", -1126892534);
        setIntField(term4237430, term4237430.getClass(), "totalAwake", -2021965195);
        setIntField(term4237430, term4237430.getClass(), "gradeRating", -1282947210);
        setIntField(term4237430, term4237430.getClass(), "musicRating", 1919054305);
        setIntField(term4237430, term4237430.getClass(), "playerRating", 1835398019);
        setIntField(term4237430, term4237430.getClass(), "highestRating", 532093823);
        setIntField(term4237430, term4237430.getClass(), "gradeRank", 477323660);
        setIntField(term4237430, term4237430.getClass(), "classRank", -822040364);
        setIntField(term4237430, term4237430.getClass(), "courseRank", 169696669);
        setField(term4237430, term4237430.getClass(), "charaSlot", term4237495);
        setField(term4237430, term4237430.getClass(), "charaLockSlot", term4237509);
        setLongField(term4237430, term4237430.getClass(), "contentBit", -3815305396171567211L);
        setIntField(term4237430, term4237430.getClass(), "playCount", 1679833727);
        setField(term4237430, term4237430.getClass(), "eventWatchedDate", "afeYEjUTNg");
        setField(term4237430, term4237430.getClass(), "lastGameId", "JSLeXqpcDe");
        setField(term4237430, term4237430.getClass(), "lastRomVersion", "lbYqBpgzkS");
        setField(term4237430, term4237430.getClass(), "lastDataVersion", "WmziqYKdKs");
        setField(term4237430, term4237430.getClass(), "lastLoginDate", "OaBnYbOsAD");
        setField(term4237430, term4237430.getClass(), "lastPlayDate", "LXTDzkyEXJ");
        setIntField(term4237430, term4237430.getClass(), "lastPlayCredit", 671521559);
        setIntField(term4237430, term4237430.getClass(), "lastPlayMode", 1751753170);
        setIntField(term4237430, term4237430.getClass(), "lastPlaceId", -569648553);
        setField(term4237430, term4237430.getClass(), "lastPlaceName", "gilOMhnGNQ");
        setIntField(term4237430, term4237430.getClass(), "lastAllNetId", -1636983643);
        setIntField(term4237430, term4237430.getClass(), "lastRegionId", -2055172006);
        setField(term4237430, term4237430.getClass(), "lastRegionName", "ITTKYvMqul");
        setField(term4237430, term4237430.getClass(), "lastClientId", "Pkqnojpioe");
        setField(term4237430, term4237430.getClass(), "lastCountryCode", "yktdfDvFVi");
        setIntField(term4237430, term4237430.getClass(), "lastSelectEMoney", 1743691307);
        setIntField(term4237430, term4237430.getClass(), "lastSelectTicket", -237496442);
        setIntField(term4237430, term4237430.getClass(), "lastSelectCourse", 1856741595);
        setIntField(term4237430, term4237430.getClass(), "lastCountCourse", 1485727990);
        setField(term4237430, term4237430.getClass(), "firstGameId", "ikpNUANiyg");
        setField(term4237430, term4237430.getClass(), "firstRomVersion", "GCDUccNNjs");
        setField(term4237430, term4237430.getClass(), "firstDataVersion", "hodJtZnRtO");
        setField(term4237430, term4237430.getClass(), "firstPlayDate", "dgEeGFRkDA");
        setField(term4237430, term4237430.getClass(), "compatibleCmVersion", "iXsjkbdgxn");
        setField(term4237430, term4237430.getClass(), "dailyBonusDate", "MIQSdyDuOJ");
        setField(term4237430, term4237430.getClass(), "dailyCourseBonusDate", "OYdMnxTcWh");
        setField(term4237430, term4237430.getClass(), "lastPairLoginDate", "UilVRzGIqp");
        setField(term4237430, term4237430.getClass(), "lastTrialPlayDate", "NQWbQwEIAC");
        setIntField(term4237430, term4237430.getClass(), "playVsCount", -1674628952);
        setIntField(term4237430, term4237430.getClass(), "playSyncCount", 1289039868);
        setIntField(term4237430, term4237430.getClass(), "winCount", -2006130151);
        setIntField(term4237430, term4237430.getClass(), "helpCount", -928004684);
        setIntField(term4237430, term4237430.getClass(), "comboCount", -366341628);
        setLongField(term4237430, term4237430.getClass(), "totalDeluxscore", -5851575741392462726L);
        setLongField(term4237430, term4237430.getClass(), "totalBasicDeluxscore", 5159281062594938279L);
        setLongField(term4237430, term4237430.getClass(), "totalAdvancedDeluxscore", -2838689938489052859L);
        setLongField(term4237430, term4237430.getClass(), "totalExpertDeluxscore", -6188187998080398081L);
        setLongField(term4237430, term4237430.getClass(), "totalMasterDeluxscore", 1184696316443945413L);
        setLongField(term4237430, term4237430.getClass(), "totalReMasterDeluxscore", 3017038215447861278L);
        setIntField(term4237430, term4237430.getClass(), "totalSync", -1426237210);
        setIntField(term4237430, term4237430.getClass(), "totalBasicSync", -159522056);
        setIntField(term4237430, term4237430.getClass(), "totalAdvancedSync", -984758655);
        setIntField(term4237430, term4237430.getClass(), "totalExpertSync", 2116176027);
        setIntField(term4237430, term4237430.getClass(), "totalMasterSync", -501251723);
        setIntField(term4237430, term4237430.getClass(), "totalReMasterSync", -1880138107);
        setLongField(term4237430, term4237430.getClass(), "totalAchievement", -7755395934986103128L);
        setLongField(term4237430, term4237430.getClass(), "totalBasicAchievement", -5668106080378724179L);
        setLongField(term4237430, term4237430.getClass(), "totalAdvancedAchievement", -5897324039814061826L);
        setLongField(term4237430, term4237430.getClass(), "totalExpertAchievement", -8685474893100561031L);
        setLongField(term4237430, term4237430.getClass(), "totalMasterAchievement", 8410804786513201623L);
        setLongField(term4237430, term4237430.getClass(), "totalReMasterAchievement", -1752541429862419266L);
        setLongField(term4237430, term4237430.getClass(), "playerOldRating", 2060186705039638570L);
        setLongField(term4237430, term4237430.getClass(), "playerNewRating", 9147169595271560871L);
        setIntField(term4237430, term4237430.getClass(), "banState", 2066607289);
        setLongField(term4237430, term4237430.getClass(), "dateTime", 7780559528714268920L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term4237430, args);
    }

};


