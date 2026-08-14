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

public class UserDetail_equals_1420099990154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283284;
     Object term283647;

    public UserDetail_equals_1420099990154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term283288 = new Long(-354905832180781372L);
        Integer term283351 = new Integer(-1717455505);
        Integer term283353 = new Integer(1898536358);
        Integer term283355 = new Integer(1296009499);
        Integer term283357 = new Integer(-427335137);
        Integer term283359 = new Integer(9865038);
        Integer term283361 = new Integer(1202401386);
        Integer term283363 = new Integer(1173310137);
        Integer term283365 = new Integer(957107652);
        ArrayList term283349 = new ArrayList();
        ((ArrayList) term283349).add(term283351);
        ((ArrayList) term283349).add(term283353);
        ((ArrayList) term283349).add(term283355);
        ((ArrayList) term283349).add(term283357);
        ((ArrayList) term283349).add(term283359);
        ((ArrayList) term283349).add(term283361);
        ((ArrayList) term283349).add(term283363);
        ((ArrayList) term283349).add(term283365);
        Integer term283371 = new Integer(292629613);
        Integer term283373 = new Integer(1420755413);
        Integer term283375 = new Integer(-755973893);
        Integer term283377 = new Integer(-890311309);
        ArrayList term283369 = new ArrayList();
        ((ArrayList) term283369).add(term283371);
        ((ArrayList) term283369).add(term283373);
        ((ArrayList) term283369).add(term283375);
        ((ArrayList) term283369).add(term283377);
        term283284 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term283286 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term283302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283307 = newInstance(Class.forName("java.time.LocalTime"));
        Object term283312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283317 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term283284, term283284.getClass(), "id", -2817374342783832456L);
        setLongField(term283286, term283286.getClass(), "id", -7383737643708747224L);
        setField(term283286, term283286.getClass(), "extId", term283288);
        setField(term283286, term283286.getClass(), "luid", "tJAUsTSKkk");
        setIntField(term283303, term283303.getClass(), "year", 2010);
        setShortField(term283303, term283303.getClass(), "month", (short) 3);
        setShortField(term283303, term283303.getClass(), "day", (short) 31);
        setField(term283302, term283302.getClass(), "date", term283303);
        setByteField(term283307, term283307.getClass(), "hour", (byte) 13);
        setByteField(term283307, term283307.getClass(), "minute", (byte) 35);
        setByteField(term283307, term283307.getClass(), "second", (byte) 45);
        setIntField(term283307, term283307.getClass(), "nano", 154359665);
        setField(term283302, term283302.getClass(), "time", term283307);
        setField(term283286, term283286.getClass(), "registerTime", term283302);
        setIntField(term283313, term283313.getClass(), "year", 2014);
        setShortField(term283313, term283313.getClass(), "month", (short) 11);
        setShortField(term283313, term283313.getClass(), "day", (short) 7);
        setField(term283312, term283312.getClass(), "date", term283313);
        setByteField(term283317, term283317.getClass(), "hour", (byte) 8);
        setByteField(term283317, term283317.getClass(), "minute", (byte) 9);
        setByteField(term283317, term283317.getClass(), "second", (byte) 37);
        setIntField(term283317, term283317.getClass(), "nano", 366421600);
        setField(term283312, term283312.getClass(), "time", term283317);
        setField(term283286, term283286.getClass(), "accessTime", term283312);
        setField(term283284, term283284.getClass(), "card", term283286);
        setField(term283284, term283284.getClass(), "userName", "VEHiNYtljb");
        setIntField(term283284, term283284.getClass(), "isNetMember", 1237862596);
        setIntField(term283284, term283284.getClass(), "iconId", -1393307484);
        setIntField(term283284, term283284.getClass(), "plateId", -1622786371);
        setIntField(term283284, term283284.getClass(), "titleId", -227208597);
        setIntField(term283284, term283284.getClass(), "partnerId", 1224191712);
        setIntField(term283284, term283284.getClass(), "frameId", -635900964);
        setIntField(term283284, term283284.getClass(), "selectMapId", -257307819);
        setIntField(term283284, term283284.getClass(), "totalAwake", 2121002514);
        setIntField(term283284, term283284.getClass(), "gradeRating", 116421144);
        setIntField(term283284, term283284.getClass(), "musicRating", 1133487857);
        setIntField(term283284, term283284.getClass(), "playerRating", -589717643);
        setIntField(term283284, term283284.getClass(), "highestRating", -955082715);
        setIntField(term283284, term283284.getClass(), "gradeRank", 151818114);
        setIntField(term283284, term283284.getClass(), "classRank", 1950783244);
        setIntField(term283284, term283284.getClass(), "courseRank", 768139455);
        setField(term283284, term283284.getClass(), "charaSlot", term283349);
        setField(term283284, term283284.getClass(), "charaLockSlot", term283369);
        setLongField(term283284, term283284.getClass(), "contentBit", 4782274577724891769L);
        setIntField(term283284, term283284.getClass(), "playCount", -1410773451);
        setField(term283284, term283284.getClass(), "eventWatchedDate", "suoEAqekUb");
        setField(term283284, term283284.getClass(), "lastGameId", "qmZEKiXqxP");
        setField(term283284, term283284.getClass(), "lastRomVersion", "lAuVFraTOT");
        setField(term283284, term283284.getClass(), "lastDataVersion", "LyyBpbZJne");
        setField(term283284, term283284.getClass(), "lastLoginDate", "olEGCxILaf");
        setField(term283284, term283284.getClass(), "lastPlayDate", "fYdHEyfDKW");
        setIntField(term283284, term283284.getClass(), "lastPlayCredit", -223197318);
        setIntField(term283284, term283284.getClass(), "lastPlayMode", 405548368);
        setIntField(term283284, term283284.getClass(), "lastPlaceId", 1711997114);
        setField(term283284, term283284.getClass(), "lastPlaceName", "BsoNPgPWxB");
        setIntField(term283284, term283284.getClass(), "lastAllNetId", 1871798985);
        setIntField(term283284, term283284.getClass(), "lastRegionId", 1941308595);
        setField(term283284, term283284.getClass(), "lastRegionName", "XuOYnJFkpi");
        setField(term283284, term283284.getClass(), "lastClientId", "AaOTgwWOzi");
        setField(term283284, term283284.getClass(), "lastCountryCode", "dMxQjRJrxH");
        setIntField(term283284, term283284.getClass(), "lastSelectEMoney", -806743454);
        setIntField(term283284, term283284.getClass(), "lastSelectTicket", 293751820);
        setIntField(term283284, term283284.getClass(), "lastSelectCourse", 45674117);
        setIntField(term283284, term283284.getClass(), "lastCountCourse", 1963663502);
        setField(term283284, term283284.getClass(), "firstGameId", "zBVwgwrJiX");
        setField(term283284, term283284.getClass(), "firstRomVersion", "uznaIdtDlm");
        setField(term283284, term283284.getClass(), "firstDataVersion", "AzrXzATJtC");
        setField(term283284, term283284.getClass(), "firstPlayDate", "kIQZerlYlr");
        setField(term283284, term283284.getClass(), "compatibleCmVersion", "YMfXRIYvot");
        setField(term283284, term283284.getClass(), "dailyBonusDate", "FiFXJqBXdC");
        setField(term283284, term283284.getClass(), "dailyCourseBonusDate", "yxWimtmvkl");
        setField(term283284, term283284.getClass(), "lastPairLoginDate", "PUzanajQSP");
        setField(term283284, term283284.getClass(), "lastTrialPlayDate", "yxepsSOVzF");
        setIntField(term283284, term283284.getClass(), "playVsCount", -570673621);
        setIntField(term283284, term283284.getClass(), "playSyncCount", -1324631832);
        setIntField(term283284, term283284.getClass(), "winCount", -1565659256);
        setIntField(term283284, term283284.getClass(), "helpCount", 1942755502);
        setIntField(term283284, term283284.getClass(), "comboCount", 96638940);
        setLongField(term283284, term283284.getClass(), "totalDeluxscore", -5010370737836244619L);
        setLongField(term283284, term283284.getClass(), "totalBasicDeluxscore", -2829341670362269526L);
        setLongField(term283284, term283284.getClass(), "totalAdvancedDeluxscore", 1472760900284991933L);
        setLongField(term283284, term283284.getClass(), "totalExpertDeluxscore", 8273765169897837582L);
        setLongField(term283284, term283284.getClass(), "totalMasterDeluxscore", -8782587854015097598L);
        setLongField(term283284, term283284.getClass(), "totalReMasterDeluxscore", 7272019478537381104L);
        setIntField(term283284, term283284.getClass(), "totalSync", -1972066107);
        setIntField(term283284, term283284.getClass(), "totalBasicSync", -621184234);
        setIntField(term283284, term283284.getClass(), "totalAdvancedSync", -1709700660);
        setIntField(term283284, term283284.getClass(), "totalExpertSync", 832113202);
        setIntField(term283284, term283284.getClass(), "totalMasterSync", -1583443632);
        setIntField(term283284, term283284.getClass(), "totalReMasterSync", -62265993);
        setLongField(term283284, term283284.getClass(), "totalAchievement", -5296724240458200891L);
        setLongField(term283284, term283284.getClass(), "totalBasicAchievement", -1576282907014115105L);
        setLongField(term283284, term283284.getClass(), "totalAdvancedAchievement", -5137243742847518808L);
        setLongField(term283284, term283284.getClass(), "totalExpertAchievement", -2856025696037251335L);
        setLongField(term283284, term283284.getClass(), "totalMasterAchievement", 5484286418179975508L);
        setLongField(term283284, term283284.getClass(), "totalReMasterAchievement", 8649137888779367532L);
        setLongField(term283284, term283284.getClass(), "playerOldRating", 3900300410219052188L);
        setLongField(term283284, term283284.getClass(), "playerNewRating", 1655870298753813817L);
        setIntField(term283284, term283284.getClass(), "banState", 1053590471);
        setLongField(term283284, term283284.getClass(), "dateTime", 2357241028119955426L);
        term283647 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term283647;
        callMethod(klass, "equals", argTypes, term283284, args);
    }

};


