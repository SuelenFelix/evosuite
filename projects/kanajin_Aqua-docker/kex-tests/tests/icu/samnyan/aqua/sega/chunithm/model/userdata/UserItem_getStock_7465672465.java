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

public class UserItem_getStock_7465672465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123207;

    public UserItem_getStock_7465672465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term123213 = new Long(-3277773415369003529L);
        term123207 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term123209 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term123211 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term123227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123232 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123242 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123264 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123373 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123419 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term123207, term123207.getClass(), "id", 1493991027927867330L);
        setLongField(term123209, term123209.getClass(), "id", -2211824773087441240L);
        setLongField(term123211, term123211.getClass(), "id", -227938851357677611L);
        setField(term123211, term123211.getClass(), "extId", term123213);
        setField(term123211, term123211.getClass(), "luid", "nXIqTwQhkl");
        setIntField(term123228, term123228.getClass(), "year", 2029);
        setShortField(term123228, term123228.getClass(), "month", (short) 10);
        setShortField(term123228, term123228.getClass(), "day", (short) 25);
        setField(term123227, term123227.getClass(), "date", term123228);
        setByteField(term123232, term123232.getClass(), "hour", (byte) 13);
        setByteField(term123232, term123232.getClass(), "minute", (byte) 14);
        setByteField(term123232, term123232.getClass(), "second", (byte) 54);
        setIntField(term123232, term123232.getClass(), "nano", 845860001);
        setField(term123227, term123227.getClass(), "time", term123232);
        setField(term123211, term123211.getClass(), "registerTime", term123227);
        setIntField(term123238, term123238.getClass(), "year", 2014);
        setShortField(term123238, term123238.getClass(), "month", (short) 3);
        setShortField(term123238, term123238.getClass(), "day", (short) 17);
        setField(term123237, term123237.getClass(), "date", term123238);
        setByteField(term123242, term123242.getClass(), "hour", (byte) 19);
        setByteField(term123242, term123242.getClass(), "minute", (byte) 47);
        setByteField(term123242, term123242.getClass(), "second", (byte) 9);
        setIntField(term123242, term123242.getClass(), "nano", 271312880);
        setField(term123237, term123237.getClass(), "time", term123242);
        setField(term123211, term123211.getClass(), "accessTime", term123237);
        setField(term123209, term123209.getClass(), "card", term123211);
        setField(term123209, term123209.getClass(), "userName", "TwSWGxsbpT");
        setIntField(term123260, term123260.getClass(), "year", 2022);
        setShortField(term123260, term123260.getClass(), "month", (short) 9);
        setShortField(term123260, term123260.getClass(), "day", (short) 23);
        setField(term123259, term123259.getClass(), "date", term123260);
        setByteField(term123264, term123264.getClass(), "hour", (byte) 9);
        setByteField(term123264, term123264.getClass(), "minute", (byte) 58);
        setByteField(term123264, term123264.getClass(), "second", (byte) 40);
        setIntField(term123264, term123264.getClass(), "nano", 542827427);
        setField(term123259, term123259.getClass(), "time", term123264);
        setField(term123209, term123209.getClass(), "lastLoginDate", term123259);
        setBooleanField(term123209, term123209.getClass(), "isWebJoin", true);
        setField(term123209, term123209.getClass(), "webLimitDate", "hfUAGLGTYY");
        setIntField(term123209, term123209.getClass(), "level", -25573615);
        setIntField(term123209, term123209.getClass(), "reincarnationNum", -1429138211);
        setField(term123209, term123209.getClass(), "exp", "pjXjkGlBZo");
        setLongField(term123209, term123209.getClass(), "point", 8977912935219434305L);
        setLongField(term123209, term123209.getClass(), "totalPoint", 5474159458400902959L);
        setIntField(term123209, term123209.getClass(), "playCount", -458414349);
        setIntField(term123209, term123209.getClass(), "multiPlayCount", 1500512047);
        setIntField(term123209, term123209.getClass(), "multiWinCount", 1803572922);
        setIntField(term123209, term123209.getClass(), "requestResCount", 1045176591);
        setIntField(term123209, term123209.getClass(), "acceptResCount", -19497212);
        setIntField(term123209, term123209.getClass(), "successResCount", 1768312184);
        setIntField(term123209, term123209.getClass(), "playerRating", -1540801809);
        setIntField(term123209, term123209.getClass(), "highestRating", -1968650604);
        setIntField(term123209, term123209.getClass(), "nameplateId", -1080069977);
        setIntField(term123209, term123209.getClass(), "frameId", -581052818);
        setIntField(term123209, term123209.getClass(), "characterId", -1783757760);
        setIntField(term123209, term123209.getClass(), "trophyId", 1252467087);
        setIntField(term123209, term123209.getClass(), "playedTutorialBit", 1051291530);
        setIntField(term123209, term123209.getClass(), "firstTutorialCancelNum", -203097399);
        setIntField(term123209, term123209.getClass(), "masterTutorialCancelNum", 620198648);
        setIntField(term123209, term123209.getClass(), "totalRepertoireCount", 1593407362);
        setIntField(term123209, term123209.getClass(), "totalMapNum", 689506008);
        setLongField(term123209, term123209.getClass(), "totalHiScore", -5190905799542005717L);
        setLongField(term123209, term123209.getClass(), "totalBasicHighScore", -5832306759320914230L);
        setLongField(term123209, term123209.getClass(), "totalAdvancedHighScore", -2056599550418122679L);
        setLongField(term123209, term123209.getClass(), "totalExpertHighScore", -5763013479597334672L);
        setLongField(term123209, term123209.getClass(), "totalMasterHighScore", 8973659121888341355L);
        setIntField(term123321, term123321.getClass(), "year", 2011);
        setShortField(term123321, term123321.getClass(), "month", (short) 3);
        setShortField(term123321, term123321.getClass(), "day", (short) 16);
        setField(term123320, term123320.getClass(), "date", term123321);
        setByteField(term123325, term123325.getClass(), "hour", (byte) 16);
        setByteField(term123325, term123325.getClass(), "minute", (byte) 29);
        setByteField(term123325, term123325.getClass(), "second", (byte) 38);
        setIntField(term123325, term123325.getClass(), "nano", 14620604);
        setField(term123320, term123320.getClass(), "time", term123325);
        setField(term123209, term123209.getClass(), "eventWatchedDate", term123320);
        setIntField(term123209, term123209.getClass(), "friendCount", 580048439);
        setBooleanField(term123209, term123209.getClass(), "isMaimai", true);
        setField(term123209, term123209.getClass(), "firstGameId", "pHNOfQlhKa");
        setField(term123209, term123209.getClass(), "firstRomVersion", "rsZnYHnYCE");
        setField(term123209, term123209.getClass(), "firstDataVersion", "xVlcioeikJ");
        setIntField(term123369, term123369.getClass(), "year", 2018);
        setShortField(term123369, term123369.getClass(), "month", (short) 11);
        setShortField(term123369, term123369.getClass(), "day", (short) 9);
        setField(term123368, term123368.getClass(), "date", term123369);
        setByteField(term123373, term123373.getClass(), "hour", (byte) 9);
        setByteField(term123373, term123373.getClass(), "minute", (byte) 14);
        setByteField(term123373, term123373.getClass(), "second", (byte) 40);
        setIntField(term123373, term123373.getClass(), "nano", 836017823);
        setField(term123368, term123368.getClass(), "time", term123373);
        setField(term123209, term123209.getClass(), "firstPlayDate", term123368);
        setField(term123209, term123209.getClass(), "lastGameId", "nDWnDqypnc");
        setField(term123209, term123209.getClass(), "lastRomVersion", "YUysoEeBVh");
        setField(term123209, term123209.getClass(), "lastDataVersion", "UALDaFojXX");
        setIntField(term123415, term123415.getClass(), "year", 2023);
        setShortField(term123415, term123415.getClass(), "month", (short) 3);
        setShortField(term123415, term123415.getClass(), "day", (short) 4);
        setField(term123414, term123414.getClass(), "date", term123415);
        setByteField(term123419, term123419.getClass(), "hour", (byte) 11);
        setByteField(term123419, term123419.getClass(), "minute", (byte) 54);
        setByteField(term123419, term123419.getClass(), "second", (byte) 37);
        setIntField(term123419, term123419.getClass(), "nano", 114580747);
        setField(term123414, term123414.getClass(), "time", term123419);
        setField(term123209, term123209.getClass(), "lastPlayDate", term123414);
        setIntField(term123209, term123209.getClass(), "lastPlaceId", 534108526);
        setField(term123209, term123209.getClass(), "lastPlaceName", "zfXUaOpwPJ");
        setField(term123209, term123209.getClass(), "lastRegionId", "AdOVSTNkEG");
        setField(term123209, term123209.getClass(), "lastRegionName", "BTnZZOfDVg");
        setField(term123209, term123209.getClass(), "lastAllNetId", "ntMbgqrkHY");
        setField(term123209, term123209.getClass(), "lastClientId", "ysjcSaLtGI");
        setField(term123207, term123207.getClass(), "user", term123209);
        setIntField(term123207, term123207.getClass(), "itemKind", -1525906157);
        setIntField(term123207, term123207.getClass(), "itemId", -747827797);
        setIntField(term123207, term123207.getClass(), "stock", 1);
        setBooleanField(term123207, term123207.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStock", argTypes, term123207, args);
    }

};


