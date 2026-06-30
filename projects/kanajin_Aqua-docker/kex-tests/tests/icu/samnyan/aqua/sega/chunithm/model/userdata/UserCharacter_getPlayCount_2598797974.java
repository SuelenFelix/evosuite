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

public class UserCharacter_getPlayCount_2598797974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109782;

    public UserCharacter_getPlayCount_2598797974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term109788 = new Long(6426732259596412988L);
        term109782 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term109784 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term109786 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term109802 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109803 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109807 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109812 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109813 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109817 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109834 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109835 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109839 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109900 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109943 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109944 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109948 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109994 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term109782, term109782.getClass(), "id", 89350465134424270L);
        setLongField(term109784, term109784.getClass(), "id", -7030038452195949121L);
        setLongField(term109786, term109786.getClass(), "id", 4415806668447757000L);
        setField(term109786, term109786.getClass(), "extId", term109788);
        setField(term109786, term109786.getClass(), "luid", "GcMaBtNShc");
        setIntField(term109803, term109803.getClass(), "year", 2028);
        setShortField(term109803, term109803.getClass(), "month", (short) 11);
        setShortField(term109803, term109803.getClass(), "day", (short) 11);
        setField(term109802, term109802.getClass(), "date", term109803);
        setByteField(term109807, term109807.getClass(), "hour", (byte) 22);
        setByteField(term109807, term109807.getClass(), "minute", (byte) 43);
        setByteField(term109807, term109807.getClass(), "second", (byte) 6);
        setIntField(term109807, term109807.getClass(), "nano", 620750633);
        setField(term109802, term109802.getClass(), "time", term109807);
        setField(term109786, term109786.getClass(), "registerTime", term109802);
        setIntField(term109813, term109813.getClass(), "year", 2014);
        setShortField(term109813, term109813.getClass(), "month", (short) 4);
        setShortField(term109813, term109813.getClass(), "day", (short) 5);
        setField(term109812, term109812.getClass(), "date", term109813);
        setByteField(term109817, term109817.getClass(), "hour", (byte) 16);
        setByteField(term109817, term109817.getClass(), "minute", (byte) 15);
        setByteField(term109817, term109817.getClass(), "second", (byte) 4);
        setIntField(term109817, term109817.getClass(), "nano", 176240374);
        setField(term109812, term109812.getClass(), "time", term109817);
        setField(term109786, term109786.getClass(), "accessTime", term109812);
        setField(term109784, term109784.getClass(), "card", term109786);
        setField(term109784, term109784.getClass(), "userName", "kqGufqJbqf");
        setIntField(term109835, term109835.getClass(), "year", 2024);
        setShortField(term109835, term109835.getClass(), "month", (short) 12);
        setShortField(term109835, term109835.getClass(), "day", (short) 3);
        setField(term109834, term109834.getClass(), "date", term109835);
        setByteField(term109839, term109839.getClass(), "hour", (byte) 14);
        setByteField(term109839, term109839.getClass(), "minute", (byte) 14);
        setByteField(term109839, term109839.getClass(), "second", (byte) 18);
        setIntField(term109839, term109839.getClass(), "nano", 793131232);
        setField(term109834, term109834.getClass(), "time", term109839);
        setField(term109784, term109784.getClass(), "lastLoginDate", term109834);
        setBooleanField(term109784, term109784.getClass(), "isWebJoin", true);
        setField(term109784, term109784.getClass(), "webLimitDate", "wqMYxsvXwx");
        setIntField(term109784, term109784.getClass(), "level", -58269650);
        setIntField(term109784, term109784.getClass(), "reincarnationNum", -1473226766);
        setField(term109784, term109784.getClass(), "exp", "qUfONYtlAU");
        setLongField(term109784, term109784.getClass(), "point", -2500203677269123718L);
        setLongField(term109784, term109784.getClass(), "totalPoint", 3008581308971566501L);
        setIntField(term109784, term109784.getClass(), "playCount", 675408622);
        setIntField(term109784, term109784.getClass(), "multiPlayCount", 1010137030);
        setIntField(term109784, term109784.getClass(), "multiWinCount", -1889642100);
        setIntField(term109784, term109784.getClass(), "requestResCount", 2145169938);
        setIntField(term109784, term109784.getClass(), "acceptResCount", 200649815);
        setIntField(term109784, term109784.getClass(), "successResCount", -825109684);
        setIntField(term109784, term109784.getClass(), "playerRating", -908737984);
        setIntField(term109784, term109784.getClass(), "highestRating", -1108486320);
        setIntField(term109784, term109784.getClass(), "nameplateId", -1175116960);
        setIntField(term109784, term109784.getClass(), "frameId", 1090620326);
        setIntField(term109784, term109784.getClass(), "characterId", 1832573352);
        setIntField(term109784, term109784.getClass(), "trophyId", 17102219);
        setIntField(term109784, term109784.getClass(), "playedTutorialBit", -436664138);
        setIntField(term109784, term109784.getClass(), "firstTutorialCancelNum", -1751086046);
        setIntField(term109784, term109784.getClass(), "masterTutorialCancelNum", -384847577);
        setIntField(term109784, term109784.getClass(), "totalRepertoireCount", -1036512897);
        setIntField(term109784, term109784.getClass(), "totalMapNum", -862201634);
        setLongField(term109784, term109784.getClass(), "totalHiScore", -8028700724672913769L);
        setLongField(term109784, term109784.getClass(), "totalBasicHighScore", 4968282128824824030L);
        setLongField(term109784, term109784.getClass(), "totalAdvancedHighScore", 8639639803357659892L);
        setLongField(term109784, term109784.getClass(), "totalExpertHighScore", -6699045864427523717L);
        setLongField(term109784, term109784.getClass(), "totalMasterHighScore", -8801341388592368658L);
        setIntField(term109896, term109896.getClass(), "year", 2017);
        setShortField(term109896, term109896.getClass(), "month", (short) 5);
        setShortField(term109896, term109896.getClass(), "day", (short) 6);
        setField(term109895, term109895.getClass(), "date", term109896);
        setByteField(term109900, term109900.getClass(), "hour", (byte) 13);
        setByteField(term109900, term109900.getClass(), "minute", (byte) 52);
        setByteField(term109900, term109900.getClass(), "second", (byte) 35);
        setIntField(term109900, term109900.getClass(), "nano", 8283927);
        setField(term109895, term109895.getClass(), "time", term109900);
        setField(term109784, term109784.getClass(), "eventWatchedDate", term109895);
        setIntField(term109784, term109784.getClass(), "friendCount", -1414284967);
        setBooleanField(term109784, term109784.getClass(), "isMaimai", true);
        setField(term109784, term109784.getClass(), "firstGameId", "QMHmlsCFoq");
        setField(term109784, term109784.getClass(), "firstRomVersion", "JlgbBmNibu");
        setField(term109784, term109784.getClass(), "firstDataVersion", "igRVOATJPd");
        setIntField(term109944, term109944.getClass(), "year", 2010);
        setShortField(term109944, term109944.getClass(), "month", (short) 12);
        setShortField(term109944, term109944.getClass(), "day", (short) 7);
        setField(term109943, term109943.getClass(), "date", term109944);
        setByteField(term109948, term109948.getClass(), "hour", (byte) 4);
        setByteField(term109948, term109948.getClass(), "minute", (byte) 15);
        setByteField(term109948, term109948.getClass(), "second", (byte) 36);
        setIntField(term109948, term109948.getClass(), "nano", 783217794);
        setField(term109943, term109943.getClass(), "time", term109948);
        setField(term109784, term109784.getClass(), "firstPlayDate", term109943);
        setField(term109784, term109784.getClass(), "lastGameId", "DYaMGxxqDk");
        setField(term109784, term109784.getClass(), "lastRomVersion", "kTRmkTQpRx");
        setField(term109784, term109784.getClass(), "lastDataVersion", "NmXGFQkgMo");
        setIntField(term109990, term109990.getClass(), "year", 2010);
        setShortField(term109990, term109990.getClass(), "month", (short) 6);
        setShortField(term109990, term109990.getClass(), "day", (short) 7);
        setField(term109989, term109989.getClass(), "date", term109990);
        setByteField(term109994, term109994.getClass(), "hour", (byte) 12);
        setByteField(term109994, term109994.getClass(), "minute", (byte) 23);
        setByteField(term109994, term109994.getClass(), "second", (byte) 28);
        setIntField(term109994, term109994.getClass(), "nano", 63850935);
        setField(term109989, term109989.getClass(), "time", term109994);
        setField(term109784, term109784.getClass(), "lastPlayDate", term109989);
        setIntField(term109784, term109784.getClass(), "lastPlaceId", 68026648);
        setField(term109784, term109784.getClass(), "lastPlaceName", "lBruaTAkIt");
        setField(term109784, term109784.getClass(), "lastRegionId", "pIQQBEGLOF");
        setField(term109784, term109784.getClass(), "lastRegionName", "DLYPXnIorY");
        setField(term109784, term109784.getClass(), "lastAllNetId", "MaEbckWDBJ");
        setField(term109784, term109784.getClass(), "lastClientId", "kxuScrxaGm");
        setField(term109782, term109782.getClass(), "user", term109784);
        setIntField(term109782, term109782.getClass(), "characterId", 851471025);
        setIntField(term109782, term109782.getClass(), "playCount", 310981701);
        setIntField(term109782, term109782.getClass(), "level", 1);
        setIntField(term109782, term109782.getClass(), "skillId", -1403596364);
        setIntField(term109782, term109782.getClass(), "friendshipExp", 1473665279);
        setBooleanField(term109782, term109782.getClass(), "isValid", true);
        setBooleanField(term109782, term109782.getClass(), "isNewMark", true);
        setIntField(term109782, term109782.getClass(), "param1", -758072942);
        setIntField(term109782, term109782.getClass(), "param2", -88429419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term109782, args);
    }

};


