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

public class UserDetail_getBanState_166129641675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4272029;

    public UserDetail_getBanState_166129641675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4272033 = new Long(-2296694108636965262L);
        Integer term4272096 = new Integer(1393305038);
        Integer term4272098 = new Integer(2110534824);
        Integer term4272100 = new Integer(-67895231);
        Integer term4272102 = new Integer(275822795);
        Integer term4272104 = new Integer(1508399117);
        ArrayList term4272094 = new ArrayList();
        ((ArrayList) term4272094).add(term4272096);
        ((ArrayList) term4272094).add(term4272098);
        ((ArrayList) term4272094).add(term4272100);
        ((ArrayList) term4272094).add(term4272102);
        ((ArrayList) term4272094).add(term4272104);
        Integer term4272110 = new Integer(-228155380);
        Integer term4272112 = new Integer(-2124766997);
        Integer term4272114 = new Integer(1133047506);
        Integer term4272116 = new Integer(2126443403);
        ArrayList term4272108 = new ArrayList();
        ((ArrayList) term4272108).add(term4272110);
        ((ArrayList) term4272108).add(term4272112);
        ((ArrayList) term4272108).add(term4272114);
        ((ArrayList) term4272108).add(term4272116);
        term4272029 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4272031 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4272047 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4272048 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4272052 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4272057 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4272058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4272062 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4272029, term4272029.getClass(), "id", 1910845377901860716L);
        setLongField(term4272031, term4272031.getClass(), "id", 6400901945178356612L);
        setField(term4272031, term4272031.getClass(), "extId", term4272033);
        setField(term4272031, term4272031.getClass(), "luid", "BzykyvGTIC");
        setIntField(term4272048, term4272048.getClass(), "year", 2013);
        setShortField(term4272048, term4272048.getClass(), "month", (short) 3);
        setShortField(term4272048, term4272048.getClass(), "day", (short) 29);
        setField(term4272047, term4272047.getClass(), "date", term4272048);
        setByteField(term4272052, term4272052.getClass(), "hour", (byte) 6);
        setByteField(term4272052, term4272052.getClass(), "minute", (byte) 25);
        setByteField(term4272052, term4272052.getClass(), "second", (byte) 40);
        setIntField(term4272052, term4272052.getClass(), "nano", 941417258);
        setField(term4272047, term4272047.getClass(), "time", term4272052);
        setField(term4272031, term4272031.getClass(), "registerTime", term4272047);
        setIntField(term4272058, term4272058.getClass(), "year", 2023);
        setShortField(term4272058, term4272058.getClass(), "month", (short) 10);
        setShortField(term4272058, term4272058.getClass(), "day", (short) 26);
        setField(term4272057, term4272057.getClass(), "date", term4272058);
        setByteField(term4272062, term4272062.getClass(), "hour", (byte) 4);
        setByteField(term4272062, term4272062.getClass(), "minute", (byte) 1);
        setByteField(term4272062, term4272062.getClass(), "second", (byte) 5);
        setIntField(term4272062, term4272062.getClass(), "nano", 208082342);
        setField(term4272057, term4272057.getClass(), "time", term4272062);
        setField(term4272031, term4272031.getClass(), "accessTime", term4272057);
        setField(term4272029, term4272029.getClass(), "card", term4272031);
        setField(term4272029, term4272029.getClass(), "userName", "eKIeEFZXhL");
        setIntField(term4272029, term4272029.getClass(), "isNetMember", -1852581836);
        setIntField(term4272029, term4272029.getClass(), "iconId", -1216010945);
        setIntField(term4272029, term4272029.getClass(), "plateId", -756700901);
        setIntField(term4272029, term4272029.getClass(), "titleId", -1359272966);
        setIntField(term4272029, term4272029.getClass(), "partnerId", 2079752801);
        setIntField(term4272029, term4272029.getClass(), "frameId", 2115629181);
        setIntField(term4272029, term4272029.getClass(), "selectMapId", 812695170);
        setIntField(term4272029, term4272029.getClass(), "totalAwake", 99374907);
        setIntField(term4272029, term4272029.getClass(), "gradeRating", 1832485554);
        setIntField(term4272029, term4272029.getClass(), "musicRating", -1840636569);
        setIntField(term4272029, term4272029.getClass(), "playerRating", 1257885270);
        setIntField(term4272029, term4272029.getClass(), "highestRating", 27925871);
        setIntField(term4272029, term4272029.getClass(), "gradeRank", 840727069);
        setIntField(term4272029, term4272029.getClass(), "classRank", -852972875);
        setIntField(term4272029, term4272029.getClass(), "courseRank", 184480716);
        setField(term4272029, term4272029.getClass(), "charaSlot", term4272094);
        setField(term4272029, term4272029.getClass(), "charaLockSlot", term4272108);
        setLongField(term4272029, term4272029.getClass(), "contentBit", -4204497166770005805L);
        setIntField(term4272029, term4272029.getClass(), "playCount", 2099755249);
        setField(term4272029, term4272029.getClass(), "eventWatchedDate", "kVyHgVjALn");
        setField(term4272029, term4272029.getClass(), "lastGameId", "WSJtfsvdUT");
        setField(term4272029, term4272029.getClass(), "lastRomVersion", "zsqdiDlEah");
        setField(term4272029, term4272029.getClass(), "lastDataVersion", "FVrvRsWowC");
        setField(term4272029, term4272029.getClass(), "lastLoginDate", "iQvezjqbQg");
        setField(term4272029, term4272029.getClass(), "lastPlayDate", "jLQIBdCyCn");
        setIntField(term4272029, term4272029.getClass(), "lastPlayCredit", -1087365381);
        setIntField(term4272029, term4272029.getClass(), "lastPlayMode", -570106395);
        setIntField(term4272029, term4272029.getClass(), "lastPlaceId", -1496453041);
        setField(term4272029, term4272029.getClass(), "lastPlaceName", "XIRucXDUYS");
        setIntField(term4272029, term4272029.getClass(), "lastAllNetId", -1431500726);
        setIntField(term4272029, term4272029.getClass(), "lastRegionId", -727291909);
        setField(term4272029, term4272029.getClass(), "lastRegionName", "tsEtimvhEC");
        setField(term4272029, term4272029.getClass(), "lastClientId", "qvKHtCDhyG");
        setField(term4272029, term4272029.getClass(), "lastCountryCode", "lguHhMbvMe");
        setIntField(term4272029, term4272029.getClass(), "lastSelectEMoney", 1100203290);
        setIntField(term4272029, term4272029.getClass(), "lastSelectTicket", -1609346672);
        setIntField(term4272029, term4272029.getClass(), "lastSelectCourse", 409973935);
        setIntField(term4272029, term4272029.getClass(), "lastCountCourse", -318377382);
        setField(term4272029, term4272029.getClass(), "firstGameId", "XkkJYCylwt");
        setField(term4272029, term4272029.getClass(), "firstRomVersion", "rVXQBEPgsH");
        setField(term4272029, term4272029.getClass(), "firstDataVersion", "EluiiYwtVK");
        setField(term4272029, term4272029.getClass(), "firstPlayDate", "fuLVYcsbwU");
        setField(term4272029, term4272029.getClass(), "compatibleCmVersion", "PskoJiFsxp");
        setField(term4272029, term4272029.getClass(), "dailyBonusDate", "TNbtsaBrcD");
        setField(term4272029, term4272029.getClass(), "dailyCourseBonusDate", "oEEULtsCLs");
        setField(term4272029, term4272029.getClass(), "lastPairLoginDate", "eBQQPazpRO");
        setField(term4272029, term4272029.getClass(), "lastTrialPlayDate", "VXOArcDHQZ");
        setIntField(term4272029, term4272029.getClass(), "playVsCount", 1645572929);
        setIntField(term4272029, term4272029.getClass(), "playSyncCount", -1863490335);
        setIntField(term4272029, term4272029.getClass(), "winCount", 833766606);
        setIntField(term4272029, term4272029.getClass(), "helpCount", 1727076176);
        setIntField(term4272029, term4272029.getClass(), "comboCount", -1655743883);
        setLongField(term4272029, term4272029.getClass(), "totalDeluxscore", -3218703982265373166L);
        setLongField(term4272029, term4272029.getClass(), "totalBasicDeluxscore", -4833627252319973975L);
        setLongField(term4272029, term4272029.getClass(), "totalAdvancedDeluxscore", -3436044858411804830L);
        setLongField(term4272029, term4272029.getClass(), "totalExpertDeluxscore", -6860128815141426977L);
        setLongField(term4272029, term4272029.getClass(), "totalMasterDeluxscore", -8867858636054192002L);
        setLongField(term4272029, term4272029.getClass(), "totalReMasterDeluxscore", 3362009709687757470L);
        setIntField(term4272029, term4272029.getClass(), "totalSync", -1326806077);
        setIntField(term4272029, term4272029.getClass(), "totalBasicSync", -1350887479);
        setIntField(term4272029, term4272029.getClass(), "totalAdvancedSync", -935041843);
        setIntField(term4272029, term4272029.getClass(), "totalExpertSync", -1763219292);
        setIntField(term4272029, term4272029.getClass(), "totalMasterSync", 1623180733);
        setIntField(term4272029, term4272029.getClass(), "totalReMasterSync", -57570174);
        setLongField(term4272029, term4272029.getClass(), "totalAchievement", 224827320413017949L);
        setLongField(term4272029, term4272029.getClass(), "totalBasicAchievement", 4803271860159121222L);
        setLongField(term4272029, term4272029.getClass(), "totalAdvancedAchievement", 431440647970613129L);
        setLongField(term4272029, term4272029.getClass(), "totalExpertAchievement", -197035784388597069L);
        setLongField(term4272029, term4272029.getClass(), "totalMasterAchievement", -2645521054608885503L);
        setLongField(term4272029, term4272029.getClass(), "totalReMasterAchievement", 2512978777751235521L);
        setLongField(term4272029, term4272029.getClass(), "playerOldRating", -7818907955717383840L);
        setLongField(term4272029, term4272029.getClass(), "playerNewRating", -537875656695192558L);
        setIntField(term4272029, term4272029.getClass(), "banState", -321426076);
        setLongField(term4272029, term4272029.getClass(), "dateTime", 7820046213320282941L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBanState", argTypes, term4272029, args);
    }

};


