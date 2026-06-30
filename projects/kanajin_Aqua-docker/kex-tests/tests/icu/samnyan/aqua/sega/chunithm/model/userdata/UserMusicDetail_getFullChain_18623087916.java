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

public class UserMusicDetail_getFullChain_18623087916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94759;

    public UserMusicDetail_getFullChain_18623087916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term94765 = new Long(4699157009689333952L);
        term94759 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term94761 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term94763 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term94779 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94780 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94784 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94789 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94790 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94794 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94811 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94812 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94816 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94872 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94873 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94877 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94920 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94921 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94925 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94971 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term94759, term94759.getClass(), "id", 8895118820871384465L);
        setLongField(term94761, term94761.getClass(), "id", -1133623154868596434L);
        setLongField(term94763, term94763.getClass(), "id", -7907370981376515453L);
        setField(term94763, term94763.getClass(), "extId", term94765);
        setField(term94763, term94763.getClass(), "luid", "ZXdFbwHLvQ");
        setIntField(term94780, term94780.getClass(), "year", 2027);
        setShortField(term94780, term94780.getClass(), "month", (short) 11);
        setShortField(term94780, term94780.getClass(), "day", (short) 16);
        setField(term94779, term94779.getClass(), "date", term94780);
        setByteField(term94784, term94784.getClass(), "hour", (byte) 7);
        setByteField(term94784, term94784.getClass(), "minute", (byte) 0);
        setByteField(term94784, term94784.getClass(), "second", (byte) 56);
        setIntField(term94784, term94784.getClass(), "nano", 854986675);
        setField(term94779, term94779.getClass(), "time", term94784);
        setField(term94763, term94763.getClass(), "registerTime", term94779);
        setIntField(term94790, term94790.getClass(), "year", 2010);
        setShortField(term94790, term94790.getClass(), "month", (short) 9);
        setShortField(term94790, term94790.getClass(), "day", (short) 9);
        setField(term94789, term94789.getClass(), "date", term94790);
        setByteField(term94794, term94794.getClass(), "hour", (byte) 7);
        setByteField(term94794, term94794.getClass(), "minute", (byte) 55);
        setByteField(term94794, term94794.getClass(), "second", (byte) 11);
        setIntField(term94794, term94794.getClass(), "nano", 495713585);
        setField(term94789, term94789.getClass(), "time", term94794);
        setField(term94763, term94763.getClass(), "accessTime", term94789);
        setField(term94761, term94761.getClass(), "card", term94763);
        setField(term94761, term94761.getClass(), "userName", "VEastYHDbF");
        setIntField(term94812, term94812.getClass(), "year", 2021);
        setShortField(term94812, term94812.getClass(), "month", (short) 10);
        setShortField(term94812, term94812.getClass(), "day", (short) 8);
        setField(term94811, term94811.getClass(), "date", term94812);
        setByteField(term94816, term94816.getClass(), "hour", (byte) 18);
        setByteField(term94816, term94816.getClass(), "minute", (byte) 29);
        setByteField(term94816, term94816.getClass(), "second", (byte) 57);
        setIntField(term94816, term94816.getClass(), "nano", 938627392);
        setField(term94811, term94811.getClass(), "time", term94816);
        setField(term94761, term94761.getClass(), "lastLoginDate", term94811);
        setBooleanField(term94761, term94761.getClass(), "isWebJoin", true);
        setField(term94761, term94761.getClass(), "webLimitDate", "CVrxrIRbBP");
        setIntField(term94761, term94761.getClass(), "level", -1454824229);
        setIntField(term94761, term94761.getClass(), "reincarnationNum", -94200317);
        setField(term94761, term94761.getClass(), "exp", "qMveUiByVL");
        setLongField(term94761, term94761.getClass(), "point", 912529279953387872L);
        setLongField(term94761, term94761.getClass(), "totalPoint", 6140052465174132392L);
        setIntField(term94761, term94761.getClass(), "playCount", -1822530946);
        setIntField(term94761, term94761.getClass(), "multiPlayCount", 362870886);
        setIntField(term94761, term94761.getClass(), "multiWinCount", -728892845);
        setIntField(term94761, term94761.getClass(), "requestResCount", -344829493);
        setIntField(term94761, term94761.getClass(), "acceptResCount", -542170709);
        setIntField(term94761, term94761.getClass(), "successResCount", 1069599758);
        setIntField(term94761, term94761.getClass(), "playerRating", 339833097);
        setIntField(term94761, term94761.getClass(), "highestRating", -669854850);
        setIntField(term94761, term94761.getClass(), "nameplateId", -958077351);
        setIntField(term94761, term94761.getClass(), "frameId", 254501776);
        setIntField(term94761, term94761.getClass(), "characterId", -655069845);
        setIntField(term94761, term94761.getClass(), "trophyId", -489615582);
        setIntField(term94761, term94761.getClass(), "playedTutorialBit", 627648167);
        setIntField(term94761, term94761.getClass(), "firstTutorialCancelNum", -1937818486);
        setIntField(term94761, term94761.getClass(), "masterTutorialCancelNum", -1847517978);
        setIntField(term94761, term94761.getClass(), "totalRepertoireCount", 1452025284);
        setIntField(term94761, term94761.getClass(), "totalMapNum", 694572730);
        setLongField(term94761, term94761.getClass(), "totalHiScore", 3429269088703450074L);
        setLongField(term94761, term94761.getClass(), "totalBasicHighScore", 5075494854539116407L);
        setLongField(term94761, term94761.getClass(), "totalAdvancedHighScore", -1836910095716864258L);
        setLongField(term94761, term94761.getClass(), "totalExpertHighScore", 6409577068638937956L);
        setLongField(term94761, term94761.getClass(), "totalMasterHighScore", -1680886152207238363L);
        setIntField(term94873, term94873.getClass(), "year", 2016);
        setShortField(term94873, term94873.getClass(), "month", (short) 12);
        setShortField(term94873, term94873.getClass(), "day", (short) 16);
        setField(term94872, term94872.getClass(), "date", term94873);
        setByteField(term94877, term94877.getClass(), "hour", (byte) 13);
        setByteField(term94877, term94877.getClass(), "minute", (byte) 41);
        setByteField(term94877, term94877.getClass(), "second", (byte) 6);
        setIntField(term94877, term94877.getClass(), "nano", 757748904);
        setField(term94872, term94872.getClass(), "time", term94877);
        setField(term94761, term94761.getClass(), "eventWatchedDate", term94872);
        setIntField(term94761, term94761.getClass(), "friendCount", 809297786);
        setBooleanField(term94761, term94761.getClass(), "isMaimai", true);
        setField(term94761, term94761.getClass(), "firstGameId", "VfhPQKCIrE");
        setField(term94761, term94761.getClass(), "firstRomVersion", "RUgpUeqcGS");
        setField(term94761, term94761.getClass(), "firstDataVersion", "ufopOhWQkB");
        setIntField(term94921, term94921.getClass(), "year", 2024);
        setShortField(term94921, term94921.getClass(), "month", (short) 4);
        setShortField(term94921, term94921.getClass(), "day", (short) 7);
        setField(term94920, term94920.getClass(), "date", term94921);
        setByteField(term94925, term94925.getClass(), "hour", (byte) 15);
        setByteField(term94925, term94925.getClass(), "minute", (byte) 47);
        setByteField(term94925, term94925.getClass(), "second", (byte) 40);
        setIntField(term94925, term94925.getClass(), "nano", 993873846);
        setField(term94920, term94920.getClass(), "time", term94925);
        setField(term94761, term94761.getClass(), "firstPlayDate", term94920);
        setField(term94761, term94761.getClass(), "lastGameId", "RqVPcaMpxk");
        setField(term94761, term94761.getClass(), "lastRomVersion", "zOsnJKDwhL");
        setField(term94761, term94761.getClass(), "lastDataVersion", "VCOuRNQveV");
        setIntField(term94967, term94967.getClass(), "year", 2029);
        setShortField(term94967, term94967.getClass(), "month", (short) 5);
        setShortField(term94967, term94967.getClass(), "day", (short) 2);
        setField(term94966, term94966.getClass(), "date", term94967);
        setByteField(term94971, term94971.getClass(), "hour", (byte) 19);
        setByteField(term94971, term94971.getClass(), "minute", (byte) 50);
        setByteField(term94971, term94971.getClass(), "second", (byte) 46);
        setIntField(term94971, term94971.getClass(), "nano", 326633709);
        setField(term94966, term94966.getClass(), "time", term94971);
        setField(term94761, term94761.getClass(), "lastPlayDate", term94966);
        setIntField(term94761, term94761.getClass(), "lastPlaceId", 1250819263);
        setField(term94761, term94761.getClass(), "lastPlaceName", "wOBUMePcSQ");
        setField(term94761, term94761.getClass(), "lastRegionId", "SkfJvbcpSy");
        setField(term94761, term94761.getClass(), "lastRegionName", "NQVfrHmuUQ");
        setField(term94761, term94761.getClass(), "lastAllNetId", "BxUEPMTBxW");
        setField(term94761, term94761.getClass(), "lastClientId", "OkwcYhqTPO");
        setField(term94759, term94759.getClass(), "user", term94761);
        setIntField(term94759, term94759.getClass(), "musicId", 1618070973);
        setIntField(term94759, term94759.getClass(), "level", -127271511);
        setIntField(term94759, term94759.getClass(), "playCount", -259183708);
        setIntField(term94759, term94759.getClass(), "scoreMax", 1520040482);
        setIntField(term94759, term94759.getClass(), "resRequestCount", 959050550);
        setIntField(term94759, term94759.getClass(), "resAcceptCount", -622942789);
        setIntField(term94759, term94759.getClass(), "resSuccessCount", -638909127);
        setIntField(term94759, term94759.getClass(), "missCount", -1583218821);
        setIntField(term94759, term94759.getClass(), "maxComboCount", 66936045);
        setBooleanField(term94759, term94759.getClass(), "isFullCombo", false);
        setBooleanField(term94759, term94759.getClass(), "isAllJustice", true);
        setBooleanField(term94759, term94759.getClass(), "isSuccess", true);
        setIntField(term94759, term94759.getClass(), "fullChain", -734520364);
        setIntField(term94759, term94759.getClass(), "maxChain", -1309875787);
        setIntField(term94759, term94759.getClass(), "scoreRank", 123831044);
        setBooleanField(term94759, term94759.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullChain", argTypes, term94759, args);
    }

};


