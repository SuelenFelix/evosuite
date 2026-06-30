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

public class UserAct_getParam1_7816412036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3440;

    public UserAct_getParam1_7816412036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3446 = new Long(4872422362414183754L);
        Integer term3509 = new Integer(1632125673);
        Integer term3511 = new Integer(454281060);
        Integer term3513 = new Integer(-1786399638);
        Integer term3515 = new Integer(2055867847);
        Integer term3517 = new Integer(-1048298087);
        ArrayList term3507 = new ArrayList();
        ((ArrayList) term3507).add(term3509);
        ((ArrayList) term3507).add(term3511);
        ((ArrayList) term3507).add(term3513);
        ((ArrayList) term3507).add(term3515);
        ((ArrayList) term3507).add(term3517);
        Integer term3523 = new Integer(292681826);
        Integer term3525 = new Integer(458147407);
        ArrayList term3521 = new ArrayList();
        ((ArrayList) term3521).add(term3523);
        ((ArrayList) term3521).add(term3525);
        term3440 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term3442 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term3444 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3460 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3461 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3465 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3470 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3471 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3475 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3440, term3440.getClass(), "id", -5386201758403679145L);
        setLongField(term3442, term3442.getClass(), "id", -7268507582722666254L);
        setLongField(term3444, term3444.getClass(), "id", 5671808784468963649L);
        setField(term3444, term3444.getClass(), "extId", term3446);
        setField(term3444, term3444.getClass(), "luid", "JDaAnsVTGV");
        setIntField(term3461, term3461.getClass(), "year", 2012);
        setShortField(term3461, term3461.getClass(), "month", (short) 9);
        setShortField(term3461, term3461.getClass(), "day", (short) 11);
        setField(term3460, term3460.getClass(), "date", term3461);
        setByteField(term3465, term3465.getClass(), "hour", (byte) 22);
        setByteField(term3465, term3465.getClass(), "minute", (byte) 10);
        setByteField(term3465, term3465.getClass(), "second", (byte) 8);
        setIntField(term3465, term3465.getClass(), "nano", 380008862);
        setField(term3460, term3460.getClass(), "time", term3465);
        setField(term3444, term3444.getClass(), "registerTime", term3460);
        setIntField(term3471, term3471.getClass(), "year", 2021);
        setShortField(term3471, term3471.getClass(), "month", (short) 9);
        setShortField(term3471, term3471.getClass(), "day", (short) 7);
        setField(term3470, term3470.getClass(), "date", term3471);
        setByteField(term3475, term3475.getClass(), "hour", (byte) 5);
        setByteField(term3475, term3475.getClass(), "minute", (byte) 25);
        setByteField(term3475, term3475.getClass(), "second", (byte) 7);
        setIntField(term3475, term3475.getClass(), "nano", 755924076);
        setField(term3470, term3470.getClass(), "time", term3475);
        setField(term3444, term3444.getClass(), "accessTime", term3470);
        setField(term3442, term3442.getClass(), "card", term3444);
        setField(term3442, term3442.getClass(), "userName", "mLUZFTfjle");
        setIntField(term3442, term3442.getClass(), "isNetMember", 1935707624);
        setIntField(term3442, term3442.getClass(), "iconId", 1507074215);
        setIntField(term3442, term3442.getClass(), "plateId", -282881827);
        setIntField(term3442, term3442.getClass(), "titleId", -1183353915);
        setIntField(term3442, term3442.getClass(), "partnerId", -420030135);
        setIntField(term3442, term3442.getClass(), "frameId", 267763294);
        setIntField(term3442, term3442.getClass(), "selectMapId", -1497710478);
        setIntField(term3442, term3442.getClass(), "totalAwake", 49950830);
        setIntField(term3442, term3442.getClass(), "gradeRating", -525257914);
        setIntField(term3442, term3442.getClass(), "musicRating", 147209682);
        setIntField(term3442, term3442.getClass(), "playerRating", 34470066);
        setIntField(term3442, term3442.getClass(), "highestRating", 2058711405);
        setIntField(term3442, term3442.getClass(), "gradeRank", 1743683601);
        setIntField(term3442, term3442.getClass(), "classRank", -945116798);
        setIntField(term3442, term3442.getClass(), "courseRank", 1593461795);
        setField(term3442, term3442.getClass(), "charaSlot", term3507);
        setField(term3442, term3442.getClass(), "charaLockSlot", term3521);
        setLongField(term3442, term3442.getClass(), "contentBit", 2297097306706899827L);
        setIntField(term3442, term3442.getClass(), "playCount", 515182546);
        setField(term3442, term3442.getClass(), "eventWatchedDate", "xIeFjkHkOe");
        setField(term3442, term3442.getClass(), "lastGameId", "SdCKLMIYnX");
        setField(term3442, term3442.getClass(), "lastRomVersion", "OJJtVNPyKZ");
        setField(term3442, term3442.getClass(), "lastDataVersion", "AKNapTAfmD");
        setField(term3442, term3442.getClass(), "lastLoginDate", "xJgPlLxpgC");
        setField(term3442, term3442.getClass(), "lastPlayDate", "EYtfuJaxiM");
        setIntField(term3442, term3442.getClass(), "lastPlayCredit", -936895502);
        setIntField(term3442, term3442.getClass(), "lastPlayMode", -129547140);
        setIntField(term3442, term3442.getClass(), "lastPlaceId", 199287428);
        setField(term3442, term3442.getClass(), "lastPlaceName", "gCWtLVKVVe");
        setIntField(term3442, term3442.getClass(), "lastAllNetId", -1195339592);
        setIntField(term3442, term3442.getClass(), "lastRegionId", -376422566);
        setField(term3442, term3442.getClass(), "lastRegionName", "fWKJoSoCwE");
        setField(term3442, term3442.getClass(), "lastClientId", "wfaXBpWAUH");
        setField(term3442, term3442.getClass(), "lastCountryCode", "VMeAzAHwZj");
        setIntField(term3442, term3442.getClass(), "lastSelectEMoney", 306847454);
        setIntField(term3442, term3442.getClass(), "lastSelectTicket", 1745276158);
        setIntField(term3442, term3442.getClass(), "lastSelectCourse", 2009020256);
        setIntField(term3442, term3442.getClass(), "lastCountCourse", 2049577015);
        setField(term3442, term3442.getClass(), "firstGameId", "PznxWXsZME");
        setField(term3442, term3442.getClass(), "firstRomVersion", "ZzIujlwVsw");
        setField(term3442, term3442.getClass(), "firstDataVersion", "LWyEaeIyAo");
        setField(term3442, term3442.getClass(), "firstPlayDate", "yVMkkQhvmN");
        setField(term3442, term3442.getClass(), "compatibleCmVersion", "mvrkADEgpp");
        setField(term3442, term3442.getClass(), "dailyBonusDate", "pXOkjyeIRb");
        setField(term3442, term3442.getClass(), "dailyCourseBonusDate", "GgZWSjxjyE");
        setField(term3442, term3442.getClass(), "lastPairLoginDate", "EeBVbzjcCI");
        setField(term3442, term3442.getClass(), "lastTrialPlayDate", "UfQtPRyWRC");
        setIntField(term3442, term3442.getClass(), "playVsCount", 1236004505);
        setIntField(term3442, term3442.getClass(), "playSyncCount", 1050765721);
        setIntField(term3442, term3442.getClass(), "winCount", 474518942);
        setIntField(term3442, term3442.getClass(), "helpCount", -1656687479);
        setIntField(term3442, term3442.getClass(), "comboCount", -249614216);
        setLongField(term3442, term3442.getClass(), "totalDeluxscore", -900457279156388404L);
        setLongField(term3442, term3442.getClass(), "totalBasicDeluxscore", 1084801489398441516L);
        setLongField(term3442, term3442.getClass(), "totalAdvancedDeluxscore", 6273754186658578034L);
        setLongField(term3442, term3442.getClass(), "totalExpertDeluxscore", 3620247240684476031L);
        setLongField(term3442, term3442.getClass(), "totalMasterDeluxscore", 8313800941204938919L);
        setLongField(term3442, term3442.getClass(), "totalReMasterDeluxscore", -1214968196781083707L);
        setIntField(term3442, term3442.getClass(), "totalSync", 1870727665);
        setIntField(term3442, term3442.getClass(), "totalBasicSync", -519881101);
        setIntField(term3442, term3442.getClass(), "totalAdvancedSync", -680920524);
        setIntField(term3442, term3442.getClass(), "totalExpertSync", -916335264);
        setIntField(term3442, term3442.getClass(), "totalMasterSync", -919416536);
        setIntField(term3442, term3442.getClass(), "totalReMasterSync", -43417861);
        setLongField(term3442, term3442.getClass(), "totalAchievement", -1804015692891701666L);
        setLongField(term3442, term3442.getClass(), "totalBasicAchievement", -6432617521836576658L);
        setLongField(term3442, term3442.getClass(), "totalAdvancedAchievement", -2255965562447970862L);
        setLongField(term3442, term3442.getClass(), "totalExpertAchievement", 148047808219672941L);
        setLongField(term3442, term3442.getClass(), "totalMasterAchievement", 7489064039921396098L);
        setLongField(term3442, term3442.getClass(), "totalReMasterAchievement", 6843866297465638866L);
        setLongField(term3442, term3442.getClass(), "playerOldRating", -4023935540989049732L);
        setLongField(term3442, term3442.getClass(), "playerNewRating", 855932984568615096L);
        setIntField(term3442, term3442.getClass(), "banState", -1533843432);
        setLongField(term3442, term3442.getClass(), "dateTime", -1616722610139554082L);
        setField(term3440, term3440.getClass(), "user", term3442);
        setIntField(term3440, term3440.getClass(), "kind", -123338791);
        setIntField(term3440, term3440.getClass(), "activityId", -1467089634);
        setLongField(term3440, term3440.getClass(), "sortNumber", 7495904023107549024L);
        setIntField(term3440, term3440.getClass(), "param1", 413548937);
        setIntField(term3440, term3440.getClass(), "param2", 1901317214);
        setIntField(term3440, term3440.getClass(), "param3", 1166710220);
        setIntField(term3440, term3440.getClass(), "param4", -1070592289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam1", argTypes, term3440, args);
    }

};


