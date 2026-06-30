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

public class UserCharge_init_1346230820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120384;

    public UserCharge_init_1346230820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term120388 = new Long(-1000830646340880796L);
        Integer term120451 = new Integer(-1811706962);
        Integer term120453 = new Integer(-1242133071);
        Integer term120455 = new Integer(-455052015);
        ArrayList term120449 = new ArrayList();
        ((ArrayList) term120449).add(term120451);
        ((ArrayList) term120449).add(term120453);
        ((ArrayList) term120449).add(term120455);
        Integer term120461 = new Integer(-1322797287);
        Integer term120463 = new Integer(-615198242);
        Integer term120465 = new Integer(-491132382);
        ArrayList term120459 = new ArrayList();
        ((ArrayList) term120459).add(term120461);
        ((ArrayList) term120459).add(term120463);
        ((ArrayList) term120459).add(term120465);
        term120384 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term120386 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term120402 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120403 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120407 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120412 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120413 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120417 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term120384, term120384.getClass(), "id", 2565913054502508437L);
        setLongField(term120386, term120386.getClass(), "id", -454342664626660706L);
        setField(term120386, term120386.getClass(), "extId", term120388);
        setField(term120386, term120386.getClass(), "luid", "fDNpBZJcEK");
        setIntField(term120403, term120403.getClass(), "year", 2012);
        setShortField(term120403, term120403.getClass(), "month", (short) 7);
        setShortField(term120403, term120403.getClass(), "day", (short) 6);
        setField(term120402, term120402.getClass(), "date", term120403);
        setByteField(term120407, term120407.getClass(), "hour", (byte) 0);
        setByteField(term120407, term120407.getClass(), "minute", (byte) 48);
        setByteField(term120407, term120407.getClass(), "second", (byte) 16);
        setIntField(term120407, term120407.getClass(), "nano", 235139356);
        setField(term120402, term120402.getClass(), "time", term120407);
        setField(term120386, term120386.getClass(), "registerTime", term120402);
        setIntField(term120413, term120413.getClass(), "year", 2023);
        setShortField(term120413, term120413.getClass(), "month", (short) 2);
        setShortField(term120413, term120413.getClass(), "day", (short) 6);
        setField(term120412, term120412.getClass(), "date", term120413);
        setByteField(term120417, term120417.getClass(), "hour", (byte) 3);
        setByteField(term120417, term120417.getClass(), "minute", (byte) 1);
        setByteField(term120417, term120417.getClass(), "second", (byte) 52);
        setIntField(term120417, term120417.getClass(), "nano", 345404097);
        setField(term120412, term120412.getClass(), "time", term120417);
        setField(term120386, term120386.getClass(), "accessTime", term120412);
        setField(term120384, term120384.getClass(), "card", term120386);
        setField(term120384, term120384.getClass(), "userName", "jURNSwGUrp");
        setIntField(term120384, term120384.getClass(), "isNetMember", 1771106298);
        setIntField(term120384, term120384.getClass(), "iconId", 489428207);
        setIntField(term120384, term120384.getClass(), "plateId", -1189670798);
        setIntField(term120384, term120384.getClass(), "titleId", 1856659430);
        setIntField(term120384, term120384.getClass(), "partnerId", 1163865944);
        setIntField(term120384, term120384.getClass(), "frameId", 791409574);
        setIntField(term120384, term120384.getClass(), "selectMapId", 1650362015);
        setIntField(term120384, term120384.getClass(), "totalAwake", 1500712275);
        setIntField(term120384, term120384.getClass(), "gradeRating", 1770935991);
        setIntField(term120384, term120384.getClass(), "musicRating", -1431015722);
        setIntField(term120384, term120384.getClass(), "playerRating", 848351607);
        setIntField(term120384, term120384.getClass(), "highestRating", -273652793);
        setIntField(term120384, term120384.getClass(), "gradeRank", 765378004);
        setIntField(term120384, term120384.getClass(), "classRank", 831719919);
        setIntField(term120384, term120384.getClass(), "courseRank", 1340129291);
        setField(term120384, term120384.getClass(), "charaSlot", term120449);
        setField(term120384, term120384.getClass(), "charaLockSlot", term120459);
        setLongField(term120384, term120384.getClass(), "contentBit", -5121930167263789646L);
        setIntField(term120384, term120384.getClass(), "playCount", -1877793816);
        setField(term120384, term120384.getClass(), "eventWatchedDate", "nIWnIRXTGB");
        setField(term120384, term120384.getClass(), "lastGameId", "cjGGcykErb");
        setField(term120384, term120384.getClass(), "lastRomVersion", "ahJJxxxyVu");
        setField(term120384, term120384.getClass(), "lastDataVersion", "IABlyhoUtz");
        setField(term120384, term120384.getClass(), "lastLoginDate", "QDgkRKDgSY");
        setField(term120384, term120384.getClass(), "lastPlayDate", "SptxbRhzuT");
        setIntField(term120384, term120384.getClass(), "lastPlayCredit", 1815838239);
        setIntField(term120384, term120384.getClass(), "lastPlayMode", -897797215);
        setIntField(term120384, term120384.getClass(), "lastPlaceId", -1187799333);
        setField(term120384, term120384.getClass(), "lastPlaceName", "mIFDQhdALu");
        setIntField(term120384, term120384.getClass(), "lastAllNetId", -1222671412);
        setIntField(term120384, term120384.getClass(), "lastRegionId", 1753444798);
        setField(term120384, term120384.getClass(), "lastRegionName", "IfjNTGtdwY");
        setField(term120384, term120384.getClass(), "lastClientId", "ToupqTNDBq");
        setField(term120384, term120384.getClass(), "lastCountryCode", "yzFbLpPTrq");
        setIntField(term120384, term120384.getClass(), "lastSelectEMoney", -1511001461);
        setIntField(term120384, term120384.getClass(), "lastSelectTicket", -1668810633);
        setIntField(term120384, term120384.getClass(), "lastSelectCourse", -382694195);
        setIntField(term120384, term120384.getClass(), "lastCountCourse", -818635049);
        setField(term120384, term120384.getClass(), "firstGameId", "iYRIEjEhxB");
        setField(term120384, term120384.getClass(), "firstRomVersion", "EyLarnQiro");
        setField(term120384, term120384.getClass(), "firstDataVersion", "xPXCillnkF");
        setField(term120384, term120384.getClass(), "firstPlayDate", "UQdNECYgYF");
        setField(term120384, term120384.getClass(), "compatibleCmVersion", "tWKRqEdXvq");
        setField(term120384, term120384.getClass(), "dailyBonusDate", "IzICHEiRZJ");
        setField(term120384, term120384.getClass(), "dailyCourseBonusDate", "OVdPWRdMle");
        setField(term120384, term120384.getClass(), "lastPairLoginDate", "oimCfCnzdd");
        setField(term120384, term120384.getClass(), "lastTrialPlayDate", "kDhZwzBdJr");
        setIntField(term120384, term120384.getClass(), "playVsCount", 2059446583);
        setIntField(term120384, term120384.getClass(), "playSyncCount", -1921696663);
        setIntField(term120384, term120384.getClass(), "winCount", 687014558);
        setIntField(term120384, term120384.getClass(), "helpCount", -217279729);
        setIntField(term120384, term120384.getClass(), "comboCount", -1559780022);
        setLongField(term120384, term120384.getClass(), "totalDeluxscore", -5176212278898409578L);
        setLongField(term120384, term120384.getClass(), "totalBasicDeluxscore", 1522191658838512490L);
        setLongField(term120384, term120384.getClass(), "totalAdvancedDeluxscore", 1573287649333712014L);
        setLongField(term120384, term120384.getClass(), "totalExpertDeluxscore", -2264973412738223689L);
        setLongField(term120384, term120384.getClass(), "totalMasterDeluxscore", 798197790924820945L);
        setLongField(term120384, term120384.getClass(), "totalReMasterDeluxscore", 3817454964079565213L);
        setIntField(term120384, term120384.getClass(), "totalSync", 767848530);
        setIntField(term120384, term120384.getClass(), "totalBasicSync", 1958684579);
        setIntField(term120384, term120384.getClass(), "totalAdvancedSync", -1479249075);
        setIntField(term120384, term120384.getClass(), "totalExpertSync", -1222677001);
        setIntField(term120384, term120384.getClass(), "totalMasterSync", 931155794);
        setIntField(term120384, term120384.getClass(), "totalReMasterSync", 869921404);
        setLongField(term120384, term120384.getClass(), "totalAchievement", 204276416780080943L);
        setLongField(term120384, term120384.getClass(), "totalBasicAchievement", 2468873293569704115L);
        setLongField(term120384, term120384.getClass(), "totalAdvancedAchievement", -4627117639198460380L);
        setLongField(term120384, term120384.getClass(), "totalExpertAchievement", -7129102761188204063L);
        setLongField(term120384, term120384.getClass(), "totalMasterAchievement", 7205023166504172089L);
        setLongField(term120384, term120384.getClass(), "totalReMasterAchievement", -1992975559583541654L);
        setLongField(term120384, term120384.getClass(), "playerOldRating", -1078931920551242838L);
        setLongField(term120384, term120384.getClass(), "playerNewRating", -8575958299651392724L);
        setIntField(term120384, term120384.getClass(), "banState", 431473602);
        setLongField(term120384, term120384.getClass(), "dateTime", -9145745451304744888L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term120384;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


