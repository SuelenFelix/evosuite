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

public class UserDetail_getDateTime_102144072976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238544;

    public UserDetail_getDateTime_102144072976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238548 = new Long(5845993504299821981L);
        Integer term238611 = new Integer(-166990524);
        Integer term238613 = new Integer(-1302306468);
        Integer term238615 = new Integer(-659361866);
        ArrayList term238609 = new ArrayList();
        ((ArrayList) term238609).add(term238611);
        ((ArrayList) term238609).add(term238613);
        ((ArrayList) term238609).add(term238615);
        Integer term238621 = new Integer(-2010825883);
        ArrayList term238619 = new ArrayList();
        ((ArrayList) term238619).add(term238621);
        term238544 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term238546 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term238562 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term238563 = newInstance(Class.forName("java.time.LocalDate"));
        Object term238567 = newInstance(Class.forName("java.time.LocalTime"));
        Object term238572 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term238573 = newInstance(Class.forName("java.time.LocalDate"));
        Object term238577 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term238544, term238544.getClass(), "id", 2056943687778017582L);
        setLongField(term238546, term238546.getClass(), "id", -9177442552131615889L);
        setField(term238546, term238546.getClass(), "extId", term238548);
        setField(term238546, term238546.getClass(), "luid", "cBntwyxQws");
        setIntField(term238563, term238563.getClass(), "year", 2023);
        setShortField(term238563, term238563.getClass(), "month", (short) 4);
        setShortField(term238563, term238563.getClass(), "day", (short) 2);
        setField(term238562, term238562.getClass(), "date", term238563);
        setByteField(term238567, term238567.getClass(), "hour", (byte) 1);
        setByteField(term238567, term238567.getClass(), "minute", (byte) 39);
        setByteField(term238567, term238567.getClass(), "second", (byte) 47);
        setIntField(term238567, term238567.getClass(), "nano", 89556491);
        setField(term238562, term238562.getClass(), "time", term238567);
        setField(term238546, term238546.getClass(), "registerTime", term238562);
        setIntField(term238573, term238573.getClass(), "year", 2015);
        setShortField(term238573, term238573.getClass(), "month", (short) 1);
        setShortField(term238573, term238573.getClass(), "day", (short) 20);
        setField(term238572, term238572.getClass(), "date", term238573);
        setByteField(term238577, term238577.getClass(), "hour", (byte) 6);
        setByteField(term238577, term238577.getClass(), "minute", (byte) 8);
        setByteField(term238577, term238577.getClass(), "second", (byte) 2);
        setIntField(term238577, term238577.getClass(), "nano", 595295831);
        setField(term238572, term238572.getClass(), "time", term238577);
        setField(term238546, term238546.getClass(), "accessTime", term238572);
        setField(term238544, term238544.getClass(), "card", term238546);
        setField(term238544, term238544.getClass(), "userName", "ctJmoieYHE");
        setIntField(term238544, term238544.getClass(), "isNetMember", 332481036);
        setIntField(term238544, term238544.getClass(), "iconId", -962070662);
        setIntField(term238544, term238544.getClass(), "plateId", -1257419523);
        setIntField(term238544, term238544.getClass(), "titleId", -1180293605);
        setIntField(term238544, term238544.getClass(), "partnerId", 1441290201);
        setIntField(term238544, term238544.getClass(), "frameId", -1067225283);
        setIntField(term238544, term238544.getClass(), "selectMapId", 1939913208);
        setIntField(term238544, term238544.getClass(), "totalAwake", 2000789813);
        setIntField(term238544, term238544.getClass(), "gradeRating", -1740920122);
        setIntField(term238544, term238544.getClass(), "musicRating", 306763791);
        setIntField(term238544, term238544.getClass(), "playerRating", 393909417);
        setIntField(term238544, term238544.getClass(), "highestRating", 682347070);
        setIntField(term238544, term238544.getClass(), "gradeRank", 1184037017);
        setIntField(term238544, term238544.getClass(), "classRank", 1807084039);
        setIntField(term238544, term238544.getClass(), "courseRank", 12248994);
        setField(term238544, term238544.getClass(), "charaSlot", term238609);
        setField(term238544, term238544.getClass(), "charaLockSlot", term238619);
        setLongField(term238544, term238544.getClass(), "contentBit", 8654317661012105805L);
        setIntField(term238544, term238544.getClass(), "playCount", 1548844480);
        setField(term238544, term238544.getClass(), "eventWatchedDate", "MGvYGOoYyh");
        setField(term238544, term238544.getClass(), "lastGameId", "akolIywpGZ");
        setField(term238544, term238544.getClass(), "lastRomVersion", "GnPGHkkqXj");
        setField(term238544, term238544.getClass(), "lastDataVersion", "yZrxnnzSIY");
        setField(term238544, term238544.getClass(), "lastLoginDate", "EIuiJILbFJ");
        setField(term238544, term238544.getClass(), "lastPlayDate", "gmnZmbmANj");
        setIntField(term238544, term238544.getClass(), "lastPlayCredit", 1696710568);
        setIntField(term238544, term238544.getClass(), "lastPlayMode", 224785444);
        setIntField(term238544, term238544.getClass(), "lastPlaceId", -330212578);
        setField(term238544, term238544.getClass(), "lastPlaceName", "ugFTLYkUZt");
        setIntField(term238544, term238544.getClass(), "lastAllNetId", -383799487);
        setIntField(term238544, term238544.getClass(), "lastRegionId", -96219237);
        setField(term238544, term238544.getClass(), "lastRegionName", "WHRCJzYcUs");
        setField(term238544, term238544.getClass(), "lastClientId", "eSqgLQrNqK");
        setField(term238544, term238544.getClass(), "lastCountryCode", "wOeEJTeZMX");
        setIntField(term238544, term238544.getClass(), "lastSelectEMoney", -1518626871);
        setIntField(term238544, term238544.getClass(), "lastSelectTicket", -914604698);
        setIntField(term238544, term238544.getClass(), "lastSelectCourse", 1800655832);
        setIntField(term238544, term238544.getClass(), "lastCountCourse", 191603316);
        setField(term238544, term238544.getClass(), "firstGameId", "AcApCVcwZJ");
        setField(term238544, term238544.getClass(), "firstRomVersion", "GAfAdudsTc");
        setField(term238544, term238544.getClass(), "firstDataVersion", "vTQRVHEEmB");
        setField(term238544, term238544.getClass(), "firstPlayDate", "vJrTjupsCk");
        setField(term238544, term238544.getClass(), "compatibleCmVersion", "guXghgolSm");
        setField(term238544, term238544.getClass(), "dailyBonusDate", "SMGxdSkULI");
        setField(term238544, term238544.getClass(), "dailyCourseBonusDate", "RMIhjBTBMG");
        setField(term238544, term238544.getClass(), "lastPairLoginDate", "YHgYdYacoD");
        setField(term238544, term238544.getClass(), "lastTrialPlayDate", "eNokNpUJyH");
        setIntField(term238544, term238544.getClass(), "playVsCount", -1398388889);
        setIntField(term238544, term238544.getClass(), "playSyncCount", -125489803);
        setIntField(term238544, term238544.getClass(), "winCount", 55566850);
        setIntField(term238544, term238544.getClass(), "helpCount", 78561748);
        setIntField(term238544, term238544.getClass(), "comboCount", -225149829);
        setLongField(term238544, term238544.getClass(), "totalDeluxscore", -1104754945357977101L);
        setLongField(term238544, term238544.getClass(), "totalBasicDeluxscore", 1682645377208333535L);
        setLongField(term238544, term238544.getClass(), "totalAdvancedDeluxscore", 2191692871588063335L);
        setLongField(term238544, term238544.getClass(), "totalExpertDeluxscore", -7771339983516427956L);
        setLongField(term238544, term238544.getClass(), "totalMasterDeluxscore", -8300584978896661351L);
        setLongField(term238544, term238544.getClass(), "totalReMasterDeluxscore", 4401791453251455267L);
        setIntField(term238544, term238544.getClass(), "totalSync", 147540958);
        setIntField(term238544, term238544.getClass(), "totalBasicSync", 839776949);
        setIntField(term238544, term238544.getClass(), "totalAdvancedSync", -1235436426);
        setIntField(term238544, term238544.getClass(), "totalExpertSync", 92199099);
        setIntField(term238544, term238544.getClass(), "totalMasterSync", -2101013011);
        setIntField(term238544, term238544.getClass(), "totalReMasterSync", -1006825547);
        setLongField(term238544, term238544.getClass(), "totalAchievement", 2278057665377216603L);
        setLongField(term238544, term238544.getClass(), "totalBasicAchievement", 4269739944840339807L);
        setLongField(term238544, term238544.getClass(), "totalAdvancedAchievement", -3560898757025753245L);
        setLongField(term238544, term238544.getClass(), "totalExpertAchievement", 7412925806905736427L);
        setLongField(term238544, term238544.getClass(), "totalMasterAchievement", -2346453456247005327L);
        setLongField(term238544, term238544.getClass(), "totalReMasterAchievement", -7000190049467073689L);
        setLongField(term238544, term238544.getClass(), "playerOldRating", 3233713390019638966L);
        setLongField(term238544, term238544.getClass(), "playerNewRating", -1283461724022001620L);
        setIntField(term238544, term238544.getClass(), "banState", -1076793344);
        setLongField(term238544, term238544.getClass(), "dateTime", -1660673699488400268L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateTime", argTypes, term238544, args);
    }

};


