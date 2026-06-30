package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserMusicDetail_toString_92415154041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106321;

    public UserMusicDetail_toString_92415154041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term106327 = new Long(3580984732036213717L);
        term106321 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term106323 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term106325 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term106341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106346 = newInstance(Class.forName("java.time.LocalTime"));
        Object term106351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term106373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106378 = newInstance(Class.forName("java.time.LocalTime"));
        Object term106434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106439 = newInstance(Class.forName("java.time.LocalTime"));
        Object term106482 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106483 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106487 = newInstance(Class.forName("java.time.LocalTime"));
        Object term106528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106533 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term106321, term106321.getClass(), "id", -4680821240344884981L);
        setLongField(term106323, term106323.getClass(), "id", -8385708193105823464L);
        setLongField(term106325, term106325.getClass(), "id", -2012019122711382177L);
        setField(term106325, term106325.getClass(), "extId", term106327);
        setField(term106325, term106325.getClass(), "luid", "SAKoORlZVA");
        setIntField(term106342, term106342.getClass(), "year", 2012);
        setShortField(term106342, term106342.getClass(), "month", (short) 4);
        setShortField(term106342, term106342.getClass(), "day", (short) 11);
        setField(term106341, term106341.getClass(), "date", term106342);
        setByteField(term106346, term106346.getClass(), "hour", (byte) 8);
        setByteField(term106346, term106346.getClass(), "minute", (byte) 39);
        setByteField(term106346, term106346.getClass(), "second", (byte) 15);
        setIntField(term106346, term106346.getClass(), "nano", 771140262);
        setField(term106341, term106341.getClass(), "time", term106346);
        setField(term106325, term106325.getClass(), "registerTime", term106341);
        setIntField(term106352, term106352.getClass(), "year", 2025);
        setShortField(term106352, term106352.getClass(), "month", (short) 2);
        setShortField(term106352, term106352.getClass(), "day", (short) 28);
        setField(term106351, term106351.getClass(), "date", term106352);
        setByteField(term106356, term106356.getClass(), "hour", (byte) 9);
        setByteField(term106356, term106356.getClass(), "minute", (byte) 31);
        setByteField(term106356, term106356.getClass(), "second", (byte) 25);
        setIntField(term106356, term106356.getClass(), "nano", 744387778);
        setField(term106351, term106351.getClass(), "time", term106356);
        setField(term106325, term106325.getClass(), "accessTime", term106351);
        setField(term106323, term106323.getClass(), "card", term106325);
        setField(term106323, term106323.getClass(), "userName", "HhYVbmMRiN");
        setIntField(term106374, term106374.getClass(), "year", 2029);
        setShortField(term106374, term106374.getClass(), "month", (short) 10);
        setShortField(term106374, term106374.getClass(), "day", (short) 12);
        setField(term106373, term106373.getClass(), "date", term106374);
        setByteField(term106378, term106378.getClass(), "hour", (byte) 7);
        setByteField(term106378, term106378.getClass(), "minute", (byte) 16);
        setByteField(term106378, term106378.getClass(), "second", (byte) 52);
        setIntField(term106378, term106378.getClass(), "nano", 896178046);
        setField(term106373, term106373.getClass(), "time", term106378);
        setField(term106323, term106323.getClass(), "lastLoginDate", term106373);
        setBooleanField(term106323, term106323.getClass(), "isWebJoin", false);
        setField(term106323, term106323.getClass(), "webLimitDate", "UYEVBNEKyf");
        setIntField(term106323, term106323.getClass(), "level", -689038383);
        setIntField(term106323, term106323.getClass(), "reincarnationNum", 1931533980);
        setField(term106323, term106323.getClass(), "exp", "EXduYtKPaE");
        setLongField(term106323, term106323.getClass(), "point", -6278768630298938602L);
        setLongField(term106323, term106323.getClass(), "totalPoint", -7332230070564634620L);
        setIntField(term106323, term106323.getClass(), "playCount", 1998184383);
        setIntField(term106323, term106323.getClass(), "multiPlayCount", -2144790292);
        setIntField(term106323, term106323.getClass(), "multiWinCount", 51322657);
        setIntField(term106323, term106323.getClass(), "requestResCount", 446655571);
        setIntField(term106323, term106323.getClass(), "acceptResCount", -103286218);
        setIntField(term106323, term106323.getClass(), "successResCount", 1899730567);
        setIntField(term106323, term106323.getClass(), "playerRating", -658153436);
        setIntField(term106323, term106323.getClass(), "highestRating", 2119366240);
        setIntField(term106323, term106323.getClass(), "nameplateId", -233596948);
        setIntField(term106323, term106323.getClass(), "frameId", -187512293);
        setIntField(term106323, term106323.getClass(), "characterId", 829156189);
        setIntField(term106323, term106323.getClass(), "trophyId", -745642050);
        setIntField(term106323, term106323.getClass(), "playedTutorialBit", 1498249247);
        setIntField(term106323, term106323.getClass(), "firstTutorialCancelNum", 2032424716);
        setIntField(term106323, term106323.getClass(), "masterTutorialCancelNum", 1201741322);
        setIntField(term106323, term106323.getClass(), "totalRepertoireCount", 1106593440);
        setIntField(term106323, term106323.getClass(), "totalMapNum", -1644050596);
        setLongField(term106323, term106323.getClass(), "totalHiScore", -1514321226080897639L);
        setLongField(term106323, term106323.getClass(), "totalBasicHighScore", 3335901515267393294L);
        setLongField(term106323, term106323.getClass(), "totalAdvancedHighScore", 7450604331368897074L);
        setLongField(term106323, term106323.getClass(), "totalExpertHighScore", 9082900970492935893L);
        setLongField(term106323, term106323.getClass(), "totalMasterHighScore", -2789586359029154063L);
        setIntField(term106435, term106435.getClass(), "year", 2021);
        setShortField(term106435, term106435.getClass(), "month", (short) 3);
        setShortField(term106435, term106435.getClass(), "day", (short) 21);
        setField(term106434, term106434.getClass(), "date", term106435);
        setByteField(term106439, term106439.getClass(), "hour", (byte) 2);
        setByteField(term106439, term106439.getClass(), "minute", (byte) 34);
        setByteField(term106439, term106439.getClass(), "second", (byte) 7);
        setIntField(term106439, term106439.getClass(), "nano", 155612598);
        setField(term106434, term106434.getClass(), "time", term106439);
        setField(term106323, term106323.getClass(), "eventWatchedDate", term106434);
        setIntField(term106323, term106323.getClass(), "friendCount", 543019558);
        setBooleanField(term106323, term106323.getClass(), "isMaimai", false);
        setField(term106323, term106323.getClass(), "firstGameId", "UVMEqArKpY");
        setField(term106323, term106323.getClass(), "firstRomVersion", "fLbDziHEHK");
        setField(term106323, term106323.getClass(), "firstDataVersion", "lzRecPiQNU");
        setIntField(term106483, term106483.getClass(), "year", 2021);
        setShortField(term106483, term106483.getClass(), "month", (short) 7);
        setShortField(term106483, term106483.getClass(), "day", (short) 2);
        setField(term106482, term106482.getClass(), "date", term106483);
        setByteField(term106487, term106487.getClass(), "hour", (byte) 17);
        setByteField(term106487, term106487.getClass(), "minute", (byte) 54);
        setByteField(term106487, term106487.getClass(), "second", (byte) 6);
        setIntField(term106487, term106487.getClass(), "nano", 550039456);
        setField(term106482, term106482.getClass(), "time", term106487);
        setField(term106323, term106323.getClass(), "firstPlayDate", term106482);
        setField(term106323, term106323.getClass(), "lastGameId", "CVfKmjoLKq");
        setField(term106323, term106323.getClass(), "lastRomVersion", "zvqciKTUAl");
        setField(term106323, term106323.getClass(), "lastDataVersion", "hvNiDuvOYJ");
        setIntField(term106529, term106529.getClass(), "year", 2016);
        setShortField(term106529, term106529.getClass(), "month", (short) 8);
        setShortField(term106529, term106529.getClass(), "day", (short) 18);
        setField(term106528, term106528.getClass(), "date", term106529);
        setByteField(term106533, term106533.getClass(), "hour", (byte) 15);
        setByteField(term106533, term106533.getClass(), "minute", (byte) 58);
        setByteField(term106533, term106533.getClass(), "second", (byte) 7);
        setIntField(term106533, term106533.getClass(), "nano", 542469927);
        setField(term106528, term106528.getClass(), "time", term106533);
        setField(term106323, term106323.getClass(), "lastPlayDate", term106528);
        setIntField(term106323, term106323.getClass(), "lastPlaceId", 1902128793);
        setField(term106323, term106323.getClass(), "lastPlaceName", "unTIyPhfcW");
        setField(term106323, term106323.getClass(), "lastRegionId", "McPsgamHga");
        setField(term106323, term106323.getClass(), "lastRegionName", "wiqxbqDkJU");
        setField(term106323, term106323.getClass(), "lastAllNetId", "psNunGzDVf");
        setField(term106323, term106323.getClass(), "lastClientId", "YFOetAfnRt");
        setField(term106321, term106321.getClass(), "user", term106323);
        setIntField(term106321, term106321.getClass(), "musicId", 1944258008);
        setIntField(term106321, term106321.getClass(), "level", -1292525809);
        setIntField(term106321, term106321.getClass(), "playCount", -642577507);
        setIntField(term106321, term106321.getClass(), "scoreMax", 1430669401);
        setIntField(term106321, term106321.getClass(), "resRequestCount", -39090052);
        setIntField(term106321, term106321.getClass(), "resAcceptCount", -1893438887);
        setIntField(term106321, term106321.getClass(), "resSuccessCount", -310872754);
        setIntField(term106321, term106321.getClass(), "missCount", -2006897036);
        setIntField(term106321, term106321.getClass(), "maxComboCount", 99466182);
        setBooleanField(term106321, term106321.getClass(), "isFullCombo", false);
        setBooleanField(term106321, term106321.getClass(), "isAllJustice", false);
        setBooleanField(term106321, term106321.getClass(), "isSuccess", false);
        setIntField(term106321, term106321.getClass(), "fullChain", -1520548826);
        setIntField(term106321, term106321.getClass(), "maxChain", 1183263051);
        setIntField(term106321, term106321.getClass(), "scoreRank", 626039325);
        setBooleanField(term106321, term106321.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term106321, args);
    }

};


