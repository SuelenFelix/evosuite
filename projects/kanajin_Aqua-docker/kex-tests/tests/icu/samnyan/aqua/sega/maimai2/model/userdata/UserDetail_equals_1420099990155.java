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

public class UserDetail_equals_1420099990155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283339;
     Object term283702;

    public UserDetail_equals_1420099990155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term283343 = new Long(-354905832180781372L);
        Integer term283406 = new Integer(-1717455505);
        Integer term283408 = new Integer(1898536358);
        Integer term283410 = new Integer(1296009499);
        Integer term283412 = new Integer(-427335137);
        Integer term283414 = new Integer(9865038);
        Integer term283416 = new Integer(1202401386);
        Integer term283418 = new Integer(1173310137);
        Integer term283420 = new Integer(957107652);
        ArrayList term283404 = new ArrayList();
        ((ArrayList) term283404).add(term283406);
        ((ArrayList) term283404).add(term283408);
        ((ArrayList) term283404).add(term283410);
        ((ArrayList) term283404).add(term283412);
        ((ArrayList) term283404).add(term283414);
        ((ArrayList) term283404).add(term283416);
        ((ArrayList) term283404).add(term283418);
        ((ArrayList) term283404).add(term283420);
        Integer term283426 = new Integer(292629613);
        Integer term283428 = new Integer(1420755413);
        Integer term283430 = new Integer(-755973893);
        Integer term283432 = new Integer(-890311309);
        ArrayList term283424 = new ArrayList();
        ((ArrayList) term283424).add(term283426);
        ((ArrayList) term283424).add(term283428);
        ((ArrayList) term283424).add(term283430);
        ((ArrayList) term283424).add(term283432);
        term283339 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term283341 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term283357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283362 = newInstance(Class.forName("java.time.LocalTime"));
        Object term283367 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283368 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283372 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term283339, term283339.getClass(), "id", -2817374342783832456L);
        setLongField(term283341, term283341.getClass(), "id", -7383737643708747224L);
        setField(term283341, term283341.getClass(), "extId", term283343);
        setField(term283341, term283341.getClass(), "luid", "tJAUsTSKkk");
        setIntField(term283358, term283358.getClass(), "year", 2010);
        setShortField(term283358, term283358.getClass(), "month", (short) 3);
        setShortField(term283358, term283358.getClass(), "day", (short) 31);
        setField(term283357, term283357.getClass(), "date", term283358);
        setByteField(term283362, term283362.getClass(), "hour", (byte) 13);
        setByteField(term283362, term283362.getClass(), "minute", (byte) 35);
        setByteField(term283362, term283362.getClass(), "second", (byte) 45);
        setIntField(term283362, term283362.getClass(), "nano", 154359665);
        setField(term283357, term283357.getClass(), "time", term283362);
        setField(term283341, term283341.getClass(), "registerTime", term283357);
        setIntField(term283368, term283368.getClass(), "year", 2014);
        setShortField(term283368, term283368.getClass(), "month", (short) 11);
        setShortField(term283368, term283368.getClass(), "day", (short) 7);
        setField(term283367, term283367.getClass(), "date", term283368);
        setByteField(term283372, term283372.getClass(), "hour", (byte) 8);
        setByteField(term283372, term283372.getClass(), "minute", (byte) 9);
        setByteField(term283372, term283372.getClass(), "second", (byte) 37);
        setIntField(term283372, term283372.getClass(), "nano", 366421600);
        setField(term283367, term283367.getClass(), "time", term283372);
        setField(term283341, term283341.getClass(), "accessTime", term283367);
        setField(term283339, term283339.getClass(), "card", term283341);
        setField(term283339, term283339.getClass(), "userName", "VEHiNYtljb");
        setIntField(term283339, term283339.getClass(), "isNetMember", 1237862596);
        setIntField(term283339, term283339.getClass(), "iconId", -1393307484);
        setIntField(term283339, term283339.getClass(), "plateId", -1622786371);
        setIntField(term283339, term283339.getClass(), "titleId", -227208597);
        setIntField(term283339, term283339.getClass(), "partnerId", 1224191712);
        setIntField(term283339, term283339.getClass(), "frameId", -635900964);
        setIntField(term283339, term283339.getClass(), "selectMapId", -257307819);
        setIntField(term283339, term283339.getClass(), "totalAwake", 2121002514);
        setIntField(term283339, term283339.getClass(), "gradeRating", 116421144);
        setIntField(term283339, term283339.getClass(), "musicRating", 1133487857);
        setIntField(term283339, term283339.getClass(), "playerRating", -589717643);
        setIntField(term283339, term283339.getClass(), "highestRating", -955082715);
        setIntField(term283339, term283339.getClass(), "gradeRank", 151818114);
        setIntField(term283339, term283339.getClass(), "classRank", 1950783244);
        setIntField(term283339, term283339.getClass(), "courseRank", 768139455);
        setField(term283339, term283339.getClass(), "charaSlot", term283404);
        setField(term283339, term283339.getClass(), "charaLockSlot", term283424);
        setLongField(term283339, term283339.getClass(), "contentBit", 4782274577724891769L);
        setIntField(term283339, term283339.getClass(), "playCount", -1410773451);
        setField(term283339, term283339.getClass(), "eventWatchedDate", "suoEAqekUb");
        setField(term283339, term283339.getClass(), "lastGameId", "qmZEKiXqxP");
        setField(term283339, term283339.getClass(), "lastRomVersion", "lAuVFraTOT");
        setField(term283339, term283339.getClass(), "lastDataVersion", "LyyBpbZJne");
        setField(term283339, term283339.getClass(), "lastLoginDate", "olEGCxILaf");
        setField(term283339, term283339.getClass(), "lastPlayDate", "fYdHEyfDKW");
        setIntField(term283339, term283339.getClass(), "lastPlayCredit", -223197318);
        setIntField(term283339, term283339.getClass(), "lastPlayMode", 405548368);
        setIntField(term283339, term283339.getClass(), "lastPlaceId", 1711997114);
        setField(term283339, term283339.getClass(), "lastPlaceName", "BsoNPgPWxB");
        setIntField(term283339, term283339.getClass(), "lastAllNetId", 1871798985);
        setIntField(term283339, term283339.getClass(), "lastRegionId", 1941308595);
        setField(term283339, term283339.getClass(), "lastRegionName", "XuOYnJFkpi");
        setField(term283339, term283339.getClass(), "lastClientId", "AaOTgwWOzi");
        setField(term283339, term283339.getClass(), "lastCountryCode", "dMxQjRJrxH");
        setIntField(term283339, term283339.getClass(), "lastSelectEMoney", -806743454);
        setIntField(term283339, term283339.getClass(), "lastSelectTicket", 293751820);
        setIntField(term283339, term283339.getClass(), "lastSelectCourse", 45674117);
        setIntField(term283339, term283339.getClass(), "lastCountCourse", 1963663502);
        setField(term283339, term283339.getClass(), "firstGameId", "zBVwgwrJiX");
        setField(term283339, term283339.getClass(), "firstRomVersion", "uznaIdtDlm");
        setField(term283339, term283339.getClass(), "firstDataVersion", "AzrXzATJtC");
        setField(term283339, term283339.getClass(), "firstPlayDate", "kIQZerlYlr");
        setField(term283339, term283339.getClass(), "compatibleCmVersion", "YMfXRIYvot");
        setField(term283339, term283339.getClass(), "dailyBonusDate", "FiFXJqBXdC");
        setField(term283339, term283339.getClass(), "dailyCourseBonusDate", "yxWimtmvkl");
        setField(term283339, term283339.getClass(), "lastPairLoginDate", "PUzanajQSP");
        setField(term283339, term283339.getClass(), "lastTrialPlayDate", "yxepsSOVzF");
        setIntField(term283339, term283339.getClass(), "playVsCount", -570673621);
        setIntField(term283339, term283339.getClass(), "playSyncCount", -1324631832);
        setIntField(term283339, term283339.getClass(), "winCount", -1565659256);
        setIntField(term283339, term283339.getClass(), "helpCount", 1942755502);
        setIntField(term283339, term283339.getClass(), "comboCount", 96638940);
        setLongField(term283339, term283339.getClass(), "totalDeluxscore", -5010370737836244619L);
        setLongField(term283339, term283339.getClass(), "totalBasicDeluxscore", -2829341670362269526L);
        setLongField(term283339, term283339.getClass(), "totalAdvancedDeluxscore", 1472760900284991933L);
        setLongField(term283339, term283339.getClass(), "totalExpertDeluxscore", 8273765169897837582L);
        setLongField(term283339, term283339.getClass(), "totalMasterDeluxscore", -8782587854015097598L);
        setLongField(term283339, term283339.getClass(), "totalReMasterDeluxscore", 7272019478537381104L);
        setIntField(term283339, term283339.getClass(), "totalSync", -1972066107);
        setIntField(term283339, term283339.getClass(), "totalBasicSync", -621184234);
        setIntField(term283339, term283339.getClass(), "totalAdvancedSync", -1709700660);
        setIntField(term283339, term283339.getClass(), "totalExpertSync", 832113202);
        setIntField(term283339, term283339.getClass(), "totalMasterSync", -1583443632);
        setIntField(term283339, term283339.getClass(), "totalReMasterSync", -62265993);
        setLongField(term283339, term283339.getClass(), "totalAchievement", -5296724240458200891L);
        setLongField(term283339, term283339.getClass(), "totalBasicAchievement", -1576282907014115105L);
        setLongField(term283339, term283339.getClass(), "totalAdvancedAchievement", -5137243742847518808L);
        setLongField(term283339, term283339.getClass(), "totalExpertAchievement", -2856025696037251335L);
        setLongField(term283339, term283339.getClass(), "totalMasterAchievement", 5484286418179975508L);
        setLongField(term283339, term283339.getClass(), "totalReMasterAchievement", 8649137888779367532L);
        setLongField(term283339, term283339.getClass(), "playerOldRating", 3900300410219052188L);
        setLongField(term283339, term283339.getClass(), "playerNewRating", 1655870298753813817L);
        setIntField(term283339, term283339.getClass(), "banState", 1053590471);
        setLongField(term283339, term283339.getClass(), "dateTime", 2357241028119955426L);
        term283702 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term283702;
        callMethod(klass, "equals", argTypes, term283339, args);
    }

};


