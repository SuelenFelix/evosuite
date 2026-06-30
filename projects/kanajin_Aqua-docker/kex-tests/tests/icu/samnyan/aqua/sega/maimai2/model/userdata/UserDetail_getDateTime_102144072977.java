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

public class UserDetail_getDateTime_102144072977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238599;

    public UserDetail_getDateTime_102144072977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238603 = new Long(5845993504299821981L);
        Integer term238666 = new Integer(-166990524);
        Integer term238668 = new Integer(-1302306468);
        Integer term238670 = new Integer(-659361866);
        ArrayList term238664 = new ArrayList();
        ((ArrayList) term238664).add(term238666);
        ((ArrayList) term238664).add(term238668);
        ((ArrayList) term238664).add(term238670);
        Integer term238676 = new Integer(-2010825883);
        ArrayList term238674 = new ArrayList();
        ((ArrayList) term238674).add(term238676);
        term238599 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term238601 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term238617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term238618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term238622 = newInstance(Class.forName("java.time.LocalTime"));
        Object term238627 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term238628 = newInstance(Class.forName("java.time.LocalDate"));
        Object term238632 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term238599, term238599.getClass(), "id", 2056943687778017582L);
        setLongField(term238601, term238601.getClass(), "id", -9177442552131615889L);
        setField(term238601, term238601.getClass(), "extId", term238603);
        setField(term238601, term238601.getClass(), "luid", "cBntwyxQws");
        setIntField(term238618, term238618.getClass(), "year", 2023);
        setShortField(term238618, term238618.getClass(), "month", (short) 4);
        setShortField(term238618, term238618.getClass(), "day", (short) 2);
        setField(term238617, term238617.getClass(), "date", term238618);
        setByteField(term238622, term238622.getClass(), "hour", (byte) 1);
        setByteField(term238622, term238622.getClass(), "minute", (byte) 39);
        setByteField(term238622, term238622.getClass(), "second", (byte) 47);
        setIntField(term238622, term238622.getClass(), "nano", 89556491);
        setField(term238617, term238617.getClass(), "time", term238622);
        setField(term238601, term238601.getClass(), "registerTime", term238617);
        setIntField(term238628, term238628.getClass(), "year", 2015);
        setShortField(term238628, term238628.getClass(), "month", (short) 1);
        setShortField(term238628, term238628.getClass(), "day", (short) 20);
        setField(term238627, term238627.getClass(), "date", term238628);
        setByteField(term238632, term238632.getClass(), "hour", (byte) 6);
        setByteField(term238632, term238632.getClass(), "minute", (byte) 8);
        setByteField(term238632, term238632.getClass(), "second", (byte) 2);
        setIntField(term238632, term238632.getClass(), "nano", 595295831);
        setField(term238627, term238627.getClass(), "time", term238632);
        setField(term238601, term238601.getClass(), "accessTime", term238627);
        setField(term238599, term238599.getClass(), "card", term238601);
        setField(term238599, term238599.getClass(), "userName", "ctJmoieYHE");
        setIntField(term238599, term238599.getClass(), "isNetMember", 332481036);
        setIntField(term238599, term238599.getClass(), "iconId", -962070662);
        setIntField(term238599, term238599.getClass(), "plateId", -1257419523);
        setIntField(term238599, term238599.getClass(), "titleId", -1180293605);
        setIntField(term238599, term238599.getClass(), "partnerId", 1441290201);
        setIntField(term238599, term238599.getClass(), "frameId", -1067225283);
        setIntField(term238599, term238599.getClass(), "selectMapId", 1939913208);
        setIntField(term238599, term238599.getClass(), "totalAwake", 2000789813);
        setIntField(term238599, term238599.getClass(), "gradeRating", -1740920122);
        setIntField(term238599, term238599.getClass(), "musicRating", 306763791);
        setIntField(term238599, term238599.getClass(), "playerRating", 393909417);
        setIntField(term238599, term238599.getClass(), "highestRating", 682347070);
        setIntField(term238599, term238599.getClass(), "gradeRank", 1184037017);
        setIntField(term238599, term238599.getClass(), "classRank", 1807084039);
        setIntField(term238599, term238599.getClass(), "courseRank", 12248994);
        setField(term238599, term238599.getClass(), "charaSlot", term238664);
        setField(term238599, term238599.getClass(), "charaLockSlot", term238674);
        setLongField(term238599, term238599.getClass(), "contentBit", 8654317661012105805L);
        setIntField(term238599, term238599.getClass(), "playCount", 1548844480);
        setField(term238599, term238599.getClass(), "eventWatchedDate", "MGvYGOoYyh");
        setField(term238599, term238599.getClass(), "lastGameId", "akolIywpGZ");
        setField(term238599, term238599.getClass(), "lastRomVersion", "GnPGHkkqXj");
        setField(term238599, term238599.getClass(), "lastDataVersion", "yZrxnnzSIY");
        setField(term238599, term238599.getClass(), "lastLoginDate", "EIuiJILbFJ");
        setField(term238599, term238599.getClass(), "lastPlayDate", "gmnZmbmANj");
        setIntField(term238599, term238599.getClass(), "lastPlayCredit", 1696710568);
        setIntField(term238599, term238599.getClass(), "lastPlayMode", 224785444);
        setIntField(term238599, term238599.getClass(), "lastPlaceId", -330212578);
        setField(term238599, term238599.getClass(), "lastPlaceName", "ugFTLYkUZt");
        setIntField(term238599, term238599.getClass(), "lastAllNetId", -383799487);
        setIntField(term238599, term238599.getClass(), "lastRegionId", -96219237);
        setField(term238599, term238599.getClass(), "lastRegionName", "WHRCJzYcUs");
        setField(term238599, term238599.getClass(), "lastClientId", "eSqgLQrNqK");
        setField(term238599, term238599.getClass(), "lastCountryCode", "wOeEJTeZMX");
        setIntField(term238599, term238599.getClass(), "lastSelectEMoney", -1518626871);
        setIntField(term238599, term238599.getClass(), "lastSelectTicket", -914604698);
        setIntField(term238599, term238599.getClass(), "lastSelectCourse", 1800655832);
        setIntField(term238599, term238599.getClass(), "lastCountCourse", 191603316);
        setField(term238599, term238599.getClass(), "firstGameId", "AcApCVcwZJ");
        setField(term238599, term238599.getClass(), "firstRomVersion", "GAfAdudsTc");
        setField(term238599, term238599.getClass(), "firstDataVersion", "vTQRVHEEmB");
        setField(term238599, term238599.getClass(), "firstPlayDate", "vJrTjupsCk");
        setField(term238599, term238599.getClass(), "compatibleCmVersion", "guXghgolSm");
        setField(term238599, term238599.getClass(), "dailyBonusDate", "SMGxdSkULI");
        setField(term238599, term238599.getClass(), "dailyCourseBonusDate", "RMIhjBTBMG");
        setField(term238599, term238599.getClass(), "lastPairLoginDate", "YHgYdYacoD");
        setField(term238599, term238599.getClass(), "lastTrialPlayDate", "eNokNpUJyH");
        setIntField(term238599, term238599.getClass(), "playVsCount", -1398388889);
        setIntField(term238599, term238599.getClass(), "playSyncCount", -125489803);
        setIntField(term238599, term238599.getClass(), "winCount", 55566850);
        setIntField(term238599, term238599.getClass(), "helpCount", 78561748);
        setIntField(term238599, term238599.getClass(), "comboCount", -225149829);
        setLongField(term238599, term238599.getClass(), "totalDeluxscore", -1104754945357977101L);
        setLongField(term238599, term238599.getClass(), "totalBasicDeluxscore", 1682645377208333535L);
        setLongField(term238599, term238599.getClass(), "totalAdvancedDeluxscore", 2191692871588063335L);
        setLongField(term238599, term238599.getClass(), "totalExpertDeluxscore", -7771339983516427956L);
        setLongField(term238599, term238599.getClass(), "totalMasterDeluxscore", -8300584978896661351L);
        setLongField(term238599, term238599.getClass(), "totalReMasterDeluxscore", 4401791453251455267L);
        setIntField(term238599, term238599.getClass(), "totalSync", 147540958);
        setIntField(term238599, term238599.getClass(), "totalBasicSync", 839776949);
        setIntField(term238599, term238599.getClass(), "totalAdvancedSync", -1235436426);
        setIntField(term238599, term238599.getClass(), "totalExpertSync", 92199099);
        setIntField(term238599, term238599.getClass(), "totalMasterSync", -2101013011);
        setIntField(term238599, term238599.getClass(), "totalReMasterSync", -1006825547);
        setLongField(term238599, term238599.getClass(), "totalAchievement", 2278057665377216603L);
        setLongField(term238599, term238599.getClass(), "totalBasicAchievement", 4269739944840339807L);
        setLongField(term238599, term238599.getClass(), "totalAdvancedAchievement", -3560898757025753245L);
        setLongField(term238599, term238599.getClass(), "totalExpertAchievement", 7412925806905736427L);
        setLongField(term238599, term238599.getClass(), "totalMasterAchievement", -2346453456247005327L);
        setLongField(term238599, term238599.getClass(), "totalReMasterAchievement", -7000190049467073689L);
        setLongField(term238599, term238599.getClass(), "playerOldRating", 3233713390019638966L);
        setLongField(term238599, term238599.getClass(), "playerNewRating", -1283461724022001620L);
        setIntField(term238599, term238599.getClass(), "banState", -1076793344);
        setLongField(term238599, term238599.getClass(), "dateTime", -1660673699488400268L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateTime", argTypes, term238599, args);
    }

};


