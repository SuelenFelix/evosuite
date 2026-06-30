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

public class UserGameOptionEx_init_20588478570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309605;

    public UserGameOptionEx_init_20588478570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term309609 = new Long(-6759247883224780481L);
        term309605 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term309607 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term309623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309628 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309638 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309655 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309656 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309660 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309721 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309764 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309765 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309769 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309815 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term309605, term309605.getClass(), "id", -7964720472911740015L);
        setLongField(term309607, term309607.getClass(), "id", -4050135177435410627L);
        setField(term309607, term309607.getClass(), "extId", term309609);
        setField(term309607, term309607.getClass(), "luid", "wCLSYvOrxz");
        setIntField(term309624, term309624.getClass(), "year", 2015);
        setShortField(term309624, term309624.getClass(), "month", (short) 5);
        setShortField(term309624, term309624.getClass(), "day", (short) 31);
        setField(term309623, term309623.getClass(), "date", term309624);
        setByteField(term309628, term309628.getClass(), "hour", (byte) 2);
        setByteField(term309628, term309628.getClass(), "minute", (byte) 38);
        setByteField(term309628, term309628.getClass(), "second", (byte) 16);
        setIntField(term309628, term309628.getClass(), "nano", 281216410);
        setField(term309623, term309623.getClass(), "time", term309628);
        setField(term309607, term309607.getClass(), "registerTime", term309623);
        setIntField(term309634, term309634.getClass(), "year", 2019);
        setShortField(term309634, term309634.getClass(), "month", (short) 3);
        setShortField(term309634, term309634.getClass(), "day", (short) 9);
        setField(term309633, term309633.getClass(), "date", term309634);
        setByteField(term309638, term309638.getClass(), "hour", (byte) 9);
        setByteField(term309638, term309638.getClass(), "minute", (byte) 3);
        setByteField(term309638, term309638.getClass(), "second", (byte) 18);
        setIntField(term309638, term309638.getClass(), "nano", 144434732);
        setField(term309633, term309633.getClass(), "time", term309638);
        setField(term309607, term309607.getClass(), "accessTime", term309633);
        setField(term309605, term309605.getClass(), "card", term309607);
        setField(term309605, term309605.getClass(), "userName", "rzlCRHVFsA");
        setIntField(term309656, term309656.getClass(), "year", 2023);
        setShortField(term309656, term309656.getClass(), "month", (short) 7);
        setShortField(term309656, term309656.getClass(), "day", (short) 3);
        setField(term309655, term309655.getClass(), "date", term309656);
        setByteField(term309660, term309660.getClass(), "hour", (byte) 8);
        setByteField(term309660, term309660.getClass(), "minute", (byte) 6);
        setByteField(term309660, term309660.getClass(), "second", (byte) 58);
        setIntField(term309660, term309660.getClass(), "nano", 148503372);
        setField(term309655, term309655.getClass(), "time", term309660);
        setField(term309605, term309605.getClass(), "lastLoginDate", term309655);
        setBooleanField(term309605, term309605.getClass(), "isWebJoin", true);
        setField(term309605, term309605.getClass(), "webLimitDate", "XICyfUgpjZ");
        setIntField(term309605, term309605.getClass(), "level", 1671428088);
        setIntField(term309605, term309605.getClass(), "reincarnationNum", 477930898);
        setField(term309605, term309605.getClass(), "exp", "SOwukZbyqx");
        setLongField(term309605, term309605.getClass(), "point", 5737078000461135622L);
        setLongField(term309605, term309605.getClass(), "totalPoint", -6039686681211056155L);
        setIntField(term309605, term309605.getClass(), "playCount", 656357625);
        setIntField(term309605, term309605.getClass(), "multiPlayCount", -385957661);
        setIntField(term309605, term309605.getClass(), "multiWinCount", 90100853);
        setIntField(term309605, term309605.getClass(), "requestResCount", -1993108184);
        setIntField(term309605, term309605.getClass(), "acceptResCount", 344348342);
        setIntField(term309605, term309605.getClass(), "successResCount", -95921105);
        setIntField(term309605, term309605.getClass(), "playerRating", 1276621447);
        setIntField(term309605, term309605.getClass(), "highestRating", 428970345);
        setIntField(term309605, term309605.getClass(), "nameplateId", -2048440469);
        setIntField(term309605, term309605.getClass(), "frameId", 339566160);
        setIntField(term309605, term309605.getClass(), "characterId", -200219756);
        setIntField(term309605, term309605.getClass(), "trophyId", 1980380973);
        setIntField(term309605, term309605.getClass(), "playedTutorialBit", 1256516454);
        setIntField(term309605, term309605.getClass(), "firstTutorialCancelNum", 561573899);
        setIntField(term309605, term309605.getClass(), "masterTutorialCancelNum", 443868866);
        setIntField(term309605, term309605.getClass(), "totalRepertoireCount", -264992055);
        setIntField(term309605, term309605.getClass(), "totalMapNum", -958770054);
        setLongField(term309605, term309605.getClass(), "totalHiScore", 1885391251428799555L);
        setLongField(term309605, term309605.getClass(), "totalBasicHighScore", 1036262200586004233L);
        setLongField(term309605, term309605.getClass(), "totalAdvancedHighScore", -8209613851123558072L);
        setLongField(term309605, term309605.getClass(), "totalExpertHighScore", -8531264660522466654L);
        setLongField(term309605, term309605.getClass(), "totalMasterHighScore", -822573573543723810L);
        setIntField(term309717, term309717.getClass(), "year", 2011);
        setShortField(term309717, term309717.getClass(), "month", (short) 5);
        setShortField(term309717, term309717.getClass(), "day", (short) 7);
        setField(term309716, term309716.getClass(), "date", term309717);
        setByteField(term309721, term309721.getClass(), "hour", (byte) 9);
        setByteField(term309721, term309721.getClass(), "minute", (byte) 36);
        setByteField(term309721, term309721.getClass(), "second", (byte) 26);
        setIntField(term309721, term309721.getClass(), "nano", 923342751);
        setField(term309716, term309716.getClass(), "time", term309721);
        setField(term309605, term309605.getClass(), "eventWatchedDate", term309716);
        setIntField(term309605, term309605.getClass(), "friendCount", 2141108908);
        setBooleanField(term309605, term309605.getClass(), "isMaimai", true);
        setField(term309605, term309605.getClass(), "firstGameId", "BPCRnKSWXh");
        setField(term309605, term309605.getClass(), "firstRomVersion", "QawFvvoVNe");
        setField(term309605, term309605.getClass(), "firstDataVersion", "JMmYwwRqLn");
        setIntField(term309765, term309765.getClass(), "year", 2017);
        setShortField(term309765, term309765.getClass(), "month", (short) 1);
        setShortField(term309765, term309765.getClass(), "day", (short) 2);
        setField(term309764, term309764.getClass(), "date", term309765);
        setByteField(term309769, term309769.getClass(), "hour", (byte) 3);
        setByteField(term309769, term309769.getClass(), "minute", (byte) 4);
        setByteField(term309769, term309769.getClass(), "second", (byte) 12);
        setIntField(term309769, term309769.getClass(), "nano", 378489136);
        setField(term309764, term309764.getClass(), "time", term309769);
        setField(term309605, term309605.getClass(), "firstPlayDate", term309764);
        setField(term309605, term309605.getClass(), "lastGameId", "wiHmWKChBU");
        setField(term309605, term309605.getClass(), "lastRomVersion", "slHIDqbhVK");
        setField(term309605, term309605.getClass(), "lastDataVersion", "lcdIOwjGRb");
        setIntField(term309811, term309811.getClass(), "year", 2018);
        setShortField(term309811, term309811.getClass(), "month", (short) 7);
        setShortField(term309811, term309811.getClass(), "day", (short) 14);
        setField(term309810, term309810.getClass(), "date", term309811);
        setByteField(term309815, term309815.getClass(), "hour", (byte) 15);
        setByteField(term309815, term309815.getClass(), "minute", (byte) 59);
        setByteField(term309815, term309815.getClass(), "second", (byte) 13);
        setIntField(term309815, term309815.getClass(), "nano", 158906526);
        setField(term309810, term309810.getClass(), "time", term309815);
        setField(term309605, term309605.getClass(), "lastPlayDate", term309810);
        setIntField(term309605, term309605.getClass(), "lastPlaceId", 84008598);
        setField(term309605, term309605.getClass(), "lastPlaceName", "iVMKgSDqtv");
        setField(term309605, term309605.getClass(), "lastRegionId", "snUMTDsDAQ");
        setField(term309605, term309605.getClass(), "lastRegionName", "mLLEZxImzO");
        setField(term309605, term309605.getClass(), "lastAllNetId", "pmCySZHNoC");
        setField(term309605, term309605.getClass(), "lastClientId", "WvaVoeUTqA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term309605;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


