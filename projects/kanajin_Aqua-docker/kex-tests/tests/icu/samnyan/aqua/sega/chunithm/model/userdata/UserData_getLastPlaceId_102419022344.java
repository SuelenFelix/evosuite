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

public class UserData_getLastPlaceId_102419022344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148125;

    public UserData_getLastPlaceId_102419022344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term148129 = new Long(-7709317346333670618L);
        term148125 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term148127 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term148143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148148 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148158 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148180 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148241 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148284 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148285 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148289 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148335 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term148125, term148125.getClass(), "id", 4714001757937272987L);
        setLongField(term148127, term148127.getClass(), "id", 4834376760880884583L);
        setField(term148127, term148127.getClass(), "extId", term148129);
        setField(term148127, term148127.getClass(), "luid", "yigFKTPrsp");
        setIntField(term148144, term148144.getClass(), "year", 2020);
        setShortField(term148144, term148144.getClass(), "month", (short) 8);
        setShortField(term148144, term148144.getClass(), "day", (short) 5);
        setField(term148143, term148143.getClass(), "date", term148144);
        setByteField(term148148, term148148.getClass(), "hour", (byte) 13);
        setByteField(term148148, term148148.getClass(), "minute", (byte) 53);
        setByteField(term148148, term148148.getClass(), "second", (byte) 19);
        setIntField(term148148, term148148.getClass(), "nano", 29906993);
        setField(term148143, term148143.getClass(), "time", term148148);
        setField(term148127, term148127.getClass(), "registerTime", term148143);
        setIntField(term148154, term148154.getClass(), "year", 2020);
        setShortField(term148154, term148154.getClass(), "month", (short) 8);
        setShortField(term148154, term148154.getClass(), "day", (short) 17);
        setField(term148153, term148153.getClass(), "date", term148154);
        setByteField(term148158, term148158.getClass(), "hour", (byte) 15);
        setByteField(term148158, term148158.getClass(), "minute", (byte) 8);
        setByteField(term148158, term148158.getClass(), "second", (byte) 39);
        setIntField(term148158, term148158.getClass(), "nano", 458976173);
        setField(term148153, term148153.getClass(), "time", term148158);
        setField(term148127, term148127.getClass(), "accessTime", term148153);
        setField(term148125, term148125.getClass(), "card", term148127);
        setField(term148125, term148125.getClass(), "userName", "YpqweHjjwu");
        setIntField(term148176, term148176.getClass(), "year", 2012);
        setShortField(term148176, term148176.getClass(), "month", (short) 12);
        setShortField(term148176, term148176.getClass(), "day", (short) 17);
        setField(term148175, term148175.getClass(), "date", term148176);
        setByteField(term148180, term148180.getClass(), "hour", (byte) 18);
        setByteField(term148180, term148180.getClass(), "minute", (byte) 39);
        setByteField(term148180, term148180.getClass(), "second", (byte) 24);
        setIntField(term148180, term148180.getClass(), "nano", 373880543);
        setField(term148175, term148175.getClass(), "time", term148180);
        setField(term148125, term148125.getClass(), "lastLoginDate", term148175);
        setBooleanField(term148125, term148125.getClass(), "isWebJoin", true);
        setField(term148125, term148125.getClass(), "webLimitDate", "RMDWjokXpG");
        setIntField(term148125, term148125.getClass(), "level", 1872837544);
        setIntField(term148125, term148125.getClass(), "reincarnationNum", 1853027403);
        setField(term148125, term148125.getClass(), "exp", "INiyuixgdb");
        setLongField(term148125, term148125.getClass(), "point", -6570219387007034075L);
        setLongField(term148125, term148125.getClass(), "totalPoint", -3413579640035550114L);
        setIntField(term148125, term148125.getClass(), "playCount", 1076142687);
        setIntField(term148125, term148125.getClass(), "multiPlayCount", -1876139521);
        setIntField(term148125, term148125.getClass(), "multiWinCount", -241791599);
        setIntField(term148125, term148125.getClass(), "requestResCount", 176773103);
        setIntField(term148125, term148125.getClass(), "acceptResCount", -1103469317);
        setIntField(term148125, term148125.getClass(), "successResCount", 19350338);
        setIntField(term148125, term148125.getClass(), "playerRating", -1448947603);
        setIntField(term148125, term148125.getClass(), "highestRating", 741952810);
        setIntField(term148125, term148125.getClass(), "nameplateId", 1898180943);
        setIntField(term148125, term148125.getClass(), "frameId", -801187383);
        setIntField(term148125, term148125.getClass(), "characterId", -2118633501);
        setIntField(term148125, term148125.getClass(), "trophyId", 2007901309);
        setIntField(term148125, term148125.getClass(), "playedTutorialBit", -287540465);
        setIntField(term148125, term148125.getClass(), "firstTutorialCancelNum", -465195814);
        setIntField(term148125, term148125.getClass(), "masterTutorialCancelNum", -313554253);
        setIntField(term148125, term148125.getClass(), "totalRepertoireCount", -934314073);
        setIntField(term148125, term148125.getClass(), "totalMapNum", 1640531917);
        setLongField(term148125, term148125.getClass(), "totalHiScore", 4272894798367624363L);
        setLongField(term148125, term148125.getClass(), "totalBasicHighScore", -8629176539372583112L);
        setLongField(term148125, term148125.getClass(), "totalAdvancedHighScore", -4504123476834618959L);
        setLongField(term148125, term148125.getClass(), "totalExpertHighScore", 4324130988072072925L);
        setLongField(term148125, term148125.getClass(), "totalMasterHighScore", 1218466700428006458L);
        setIntField(term148237, term148237.getClass(), "year", 2012);
        setShortField(term148237, term148237.getClass(), "month", (short) 1);
        setShortField(term148237, term148237.getClass(), "day", (short) 18);
        setField(term148236, term148236.getClass(), "date", term148237);
        setByteField(term148241, term148241.getClass(), "hour", (byte) 20);
        setByteField(term148241, term148241.getClass(), "minute", (byte) 49);
        setByteField(term148241, term148241.getClass(), "second", (byte) 50);
        setIntField(term148241, term148241.getClass(), "nano", 434972868);
        setField(term148236, term148236.getClass(), "time", term148241);
        setField(term148125, term148125.getClass(), "eventWatchedDate", term148236);
        setIntField(term148125, term148125.getClass(), "friendCount", -871360111);
        setBooleanField(term148125, term148125.getClass(), "isMaimai", false);
        setField(term148125, term148125.getClass(), "firstGameId", "AbQcJaPuyu");
        setField(term148125, term148125.getClass(), "firstRomVersion", "SDJXoYNVym");
        setField(term148125, term148125.getClass(), "firstDataVersion", "ownnefVcXK");
        setIntField(term148285, term148285.getClass(), "year", 2022);
        setShortField(term148285, term148285.getClass(), "month", (short) 7);
        setShortField(term148285, term148285.getClass(), "day", (short) 4);
        setField(term148284, term148284.getClass(), "date", term148285);
        setByteField(term148289, term148289.getClass(), "hour", (byte) 8);
        setByteField(term148289, term148289.getClass(), "minute", (byte) 56);
        setByteField(term148289, term148289.getClass(), "second", (byte) 31);
        setIntField(term148289, term148289.getClass(), "nano", 661541581);
        setField(term148284, term148284.getClass(), "time", term148289);
        setField(term148125, term148125.getClass(), "firstPlayDate", term148284);
        setField(term148125, term148125.getClass(), "lastGameId", "KAtvRoxPvL");
        setField(term148125, term148125.getClass(), "lastRomVersion", "DfiGFdKcma");
        setField(term148125, term148125.getClass(), "lastDataVersion", "rUpZXYuqUO");
        setIntField(term148331, term148331.getClass(), "year", 2010);
        setShortField(term148331, term148331.getClass(), "month", (short) 8);
        setShortField(term148331, term148331.getClass(), "day", (short) 16);
        setField(term148330, term148330.getClass(), "date", term148331);
        setByteField(term148335, term148335.getClass(), "hour", (byte) 22);
        setByteField(term148335, term148335.getClass(), "minute", (byte) 39);
        setByteField(term148335, term148335.getClass(), "second", (byte) 54);
        setIntField(term148335, term148335.getClass(), "nano", 206380286);
        setField(term148330, term148330.getClass(), "time", term148335);
        setField(term148125, term148125.getClass(), "lastPlayDate", term148330);
        setIntField(term148125, term148125.getClass(), "lastPlaceId", 931050250);
        setField(term148125, term148125.getClass(), "lastPlaceName", "PyCZLyLBQT");
        setField(term148125, term148125.getClass(), "lastRegionId", "IVHMBjnDQQ");
        setField(term148125, term148125.getClass(), "lastRegionName", "CjQVEkBwOV");
        setField(term148125, term148125.getClass(), "lastAllNetId", "IMmDkISmvo");
        setField(term148125, term148125.getClass(), "lastClientId", "LBkNRvzfMR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceId", argTypes, term148125, args);
    }

};


