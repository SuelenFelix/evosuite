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

public class UserMusicDetail_isSuccess_93805011615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94315;

    public UserMusicDetail_isSuccess_93805011615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term94321 = new Long(5465527210299101732L);
        term94315 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term94317 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term94319 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term94335 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94340 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94350 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94367 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94368 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94372 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94428 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94429 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94433 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94481 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94527 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term94315, term94315.getClass(), "id", -8433455023051048992L);
        setLongField(term94317, term94317.getClass(), "id", 2135057416650245432L);
        setLongField(term94319, term94319.getClass(), "id", -7977668399638006021L);
        setField(term94319, term94319.getClass(), "extId", term94321);
        setField(term94319, term94319.getClass(), "luid", "PCttFvFDzJ");
        setIntField(term94336, term94336.getClass(), "year", 2029);
        setShortField(term94336, term94336.getClass(), "month", (short) 5);
        setShortField(term94336, term94336.getClass(), "day", (short) 2);
        setField(term94335, term94335.getClass(), "date", term94336);
        setByteField(term94340, term94340.getClass(), "hour", (byte) 20);
        setByteField(term94340, term94340.getClass(), "minute", (byte) 38);
        setByteField(term94340, term94340.getClass(), "second", (byte) 19);
        setIntField(term94340, term94340.getClass(), "nano", 561424935);
        setField(term94335, term94335.getClass(), "time", term94340);
        setField(term94319, term94319.getClass(), "registerTime", term94335);
        setIntField(term94346, term94346.getClass(), "year", 2024);
        setShortField(term94346, term94346.getClass(), "month", (short) 3);
        setShortField(term94346, term94346.getClass(), "day", (short) 2);
        setField(term94345, term94345.getClass(), "date", term94346);
        setByteField(term94350, term94350.getClass(), "hour", (byte) 11);
        setByteField(term94350, term94350.getClass(), "minute", (byte) 6);
        setByteField(term94350, term94350.getClass(), "second", (byte) 30);
        setIntField(term94350, term94350.getClass(), "nano", 785775117);
        setField(term94345, term94345.getClass(), "time", term94350);
        setField(term94319, term94319.getClass(), "accessTime", term94345);
        setField(term94317, term94317.getClass(), "card", term94319);
        setField(term94317, term94317.getClass(), "userName", "fwAMmjMsDq");
        setIntField(term94368, term94368.getClass(), "year", 2014);
        setShortField(term94368, term94368.getClass(), "month", (short) 2);
        setShortField(term94368, term94368.getClass(), "day", (short) 16);
        setField(term94367, term94367.getClass(), "date", term94368);
        setByteField(term94372, term94372.getClass(), "hour", (byte) 2);
        setByteField(term94372, term94372.getClass(), "minute", (byte) 5);
        setByteField(term94372, term94372.getClass(), "second", (byte) 40);
        setIntField(term94372, term94372.getClass(), "nano", 166726202);
        setField(term94367, term94367.getClass(), "time", term94372);
        setField(term94317, term94317.getClass(), "lastLoginDate", term94367);
        setBooleanField(term94317, term94317.getClass(), "isWebJoin", true);
        setField(term94317, term94317.getClass(), "webLimitDate", "aqdKzesECj");
        setIntField(term94317, term94317.getClass(), "level", -422046674);
        setIntField(term94317, term94317.getClass(), "reincarnationNum", -1837895860);
        setField(term94317, term94317.getClass(), "exp", "voSygcVEYO");
        setLongField(term94317, term94317.getClass(), "point", -6264785127930873499L);
        setLongField(term94317, term94317.getClass(), "totalPoint", -3057089152637139157L);
        setIntField(term94317, term94317.getClass(), "playCount", 777103861);
        setIntField(term94317, term94317.getClass(), "multiPlayCount", 154973906);
        setIntField(term94317, term94317.getClass(), "multiWinCount", -307927063);
        setIntField(term94317, term94317.getClass(), "requestResCount", -1627954969);
        setIntField(term94317, term94317.getClass(), "acceptResCount", -984062764);
        setIntField(term94317, term94317.getClass(), "successResCount", -1115743900);
        setIntField(term94317, term94317.getClass(), "playerRating", 1859865234);
        setIntField(term94317, term94317.getClass(), "highestRating", -201519710);
        setIntField(term94317, term94317.getClass(), "nameplateId", 746214721);
        setIntField(term94317, term94317.getClass(), "frameId", 219641616);
        setIntField(term94317, term94317.getClass(), "characterId", -1933520989);
        setIntField(term94317, term94317.getClass(), "trophyId", 1458764208);
        setIntField(term94317, term94317.getClass(), "playedTutorialBit", 1367265936);
        setIntField(term94317, term94317.getClass(), "firstTutorialCancelNum", 1755253293);
        setIntField(term94317, term94317.getClass(), "masterTutorialCancelNum", 140215223);
        setIntField(term94317, term94317.getClass(), "totalRepertoireCount", 1754589351);
        setIntField(term94317, term94317.getClass(), "totalMapNum", 1600131068);
        setLongField(term94317, term94317.getClass(), "totalHiScore", 3094322609315685109L);
        setLongField(term94317, term94317.getClass(), "totalBasicHighScore", -1909960197370926856L);
        setLongField(term94317, term94317.getClass(), "totalAdvancedHighScore", -9121990928010625836L);
        setLongField(term94317, term94317.getClass(), "totalExpertHighScore", 1281090837858883601L);
        setLongField(term94317, term94317.getClass(), "totalMasterHighScore", -1930943711257094155L);
        setIntField(term94429, term94429.getClass(), "year", 2022);
        setShortField(term94429, term94429.getClass(), "month", (short) 5);
        setShortField(term94429, term94429.getClass(), "day", (short) 25);
        setField(term94428, term94428.getClass(), "date", term94429);
        setByteField(term94433, term94433.getClass(), "hour", (byte) 16);
        setByteField(term94433, term94433.getClass(), "minute", (byte) 4);
        setByteField(term94433, term94433.getClass(), "second", (byte) 53);
        setIntField(term94433, term94433.getClass(), "nano", 716039111);
        setField(term94428, term94428.getClass(), "time", term94433);
        setField(term94317, term94317.getClass(), "eventWatchedDate", term94428);
        setIntField(term94317, term94317.getClass(), "friendCount", 1652840562);
        setBooleanField(term94317, term94317.getClass(), "isMaimai", true);
        setField(term94317, term94317.getClass(), "firstGameId", "LfcceVKtWg");
        setField(term94317, term94317.getClass(), "firstRomVersion", "CNkueZBdYF");
        setField(term94317, term94317.getClass(), "firstDataVersion", "ZAjjJEUomV");
        setIntField(term94477, term94477.getClass(), "year", 2027);
        setShortField(term94477, term94477.getClass(), "month", (short) 6);
        setShortField(term94477, term94477.getClass(), "day", (short) 14);
        setField(term94476, term94476.getClass(), "date", term94477);
        setByteField(term94481, term94481.getClass(), "hour", (byte) 5);
        setByteField(term94481, term94481.getClass(), "minute", (byte) 37);
        setByteField(term94481, term94481.getClass(), "second", (byte) 15);
        setIntField(term94481, term94481.getClass(), "nano", 593611066);
        setField(term94476, term94476.getClass(), "time", term94481);
        setField(term94317, term94317.getClass(), "firstPlayDate", term94476);
        setField(term94317, term94317.getClass(), "lastGameId", "cHwZbezfEu");
        setField(term94317, term94317.getClass(), "lastRomVersion", "GuQzOBxsNv");
        setField(term94317, term94317.getClass(), "lastDataVersion", "YxcYXGDyZx");
        setIntField(term94523, term94523.getClass(), "year", 2020);
        setShortField(term94523, term94523.getClass(), "month", (short) 12);
        setShortField(term94523, term94523.getClass(), "day", (short) 11);
        setField(term94522, term94522.getClass(), "date", term94523);
        setByteField(term94527, term94527.getClass(), "hour", (byte) 3);
        setByteField(term94527, term94527.getClass(), "minute", (byte) 44);
        setByteField(term94527, term94527.getClass(), "second", (byte) 8);
        setIntField(term94527, term94527.getClass(), "nano", 966467180);
        setField(term94522, term94522.getClass(), "time", term94527);
        setField(term94317, term94317.getClass(), "lastPlayDate", term94522);
        setIntField(term94317, term94317.getClass(), "lastPlaceId", 2101098539);
        setField(term94317, term94317.getClass(), "lastPlaceName", "dubNMHmdjy");
        setField(term94317, term94317.getClass(), "lastRegionId", "vYzdCPfleW");
        setField(term94317, term94317.getClass(), "lastRegionName", "AXVMtieJQT");
        setField(term94317, term94317.getClass(), "lastAllNetId", "BKaXfQaGqm");
        setField(term94317, term94317.getClass(), "lastClientId", "OpadJlQqJc");
        setField(term94315, term94315.getClass(), "user", term94317);
        setIntField(term94315, term94315.getClass(), "musicId", 222587472);
        setIntField(term94315, term94315.getClass(), "level", -222360853);
        setIntField(term94315, term94315.getClass(), "playCount", -886522384);
        setIntField(term94315, term94315.getClass(), "scoreMax", -1780849406);
        setIntField(term94315, term94315.getClass(), "resRequestCount", -938188610);
        setIntField(term94315, term94315.getClass(), "resAcceptCount", 716282229);
        setIntField(term94315, term94315.getClass(), "resSuccessCount", -749259966);
        setIntField(term94315, term94315.getClass(), "missCount", 1042892041);
        setIntField(term94315, term94315.getClass(), "maxComboCount", 1690194849);
        setBooleanField(term94315, term94315.getClass(), "isFullCombo", true);
        setBooleanField(term94315, term94315.getClass(), "isAllJustice", false);
        setBooleanField(term94315, term94315.getClass(), "isSuccess", false);
        setIntField(term94315, term94315.getClass(), "fullChain", 411327783);
        setIntField(term94315, term94315.getClass(), "maxChain", -1499151614);
        setIntField(term94315, term94315.getClass(), "scoreRank", -417329093);
        setBooleanField(term94315, term94315.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term94315, args);
    }

};


