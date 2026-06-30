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
import java.lang.Integer;

public class UserDuel_setParam3_103394654921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84653;
     Object term84949;

    public UserDuel_setParam3_103394654921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term84659 = new Long(-8649738738252714180L);
        term84653 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term84655 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term84657 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term84673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84678 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84683 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84684 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84688 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84710 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84771 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84814 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84815 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84819 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84860 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84861 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84865 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84940 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term84653, term84653.getClass(), "id", -4303254485153363630L);
        setLongField(term84655, term84655.getClass(), "id", -6459891615024824682L);
        setLongField(term84657, term84657.getClass(), "id", 4404944231648782138L);
        setField(term84657, term84657.getClass(), "extId", term84659);
        setField(term84657, term84657.getClass(), "luid", "QYNTEJcWIQ");
        setIntField(term84674, term84674.getClass(), "year", 2010);
        setShortField(term84674, term84674.getClass(), "month", (short) 7);
        setShortField(term84674, term84674.getClass(), "day", (short) 7);
        setField(term84673, term84673.getClass(), "date", term84674);
        setByteField(term84678, term84678.getClass(), "hour", (byte) 6);
        setByteField(term84678, term84678.getClass(), "minute", (byte) 57);
        setByteField(term84678, term84678.getClass(), "second", (byte) 11);
        setIntField(term84678, term84678.getClass(), "nano", 667015440);
        setField(term84673, term84673.getClass(), "time", term84678);
        setField(term84657, term84657.getClass(), "registerTime", term84673);
        setIntField(term84684, term84684.getClass(), "year", 2029);
        setShortField(term84684, term84684.getClass(), "month", (short) 7);
        setShortField(term84684, term84684.getClass(), "day", (short) 2);
        setField(term84683, term84683.getClass(), "date", term84684);
        setByteField(term84688, term84688.getClass(), "hour", (byte) 4);
        setByteField(term84688, term84688.getClass(), "minute", (byte) 58);
        setByteField(term84688, term84688.getClass(), "second", (byte) 25);
        setIntField(term84688, term84688.getClass(), "nano", 652407918);
        setField(term84683, term84683.getClass(), "time", term84688);
        setField(term84657, term84657.getClass(), "accessTime", term84683);
        setField(term84655, term84655.getClass(), "card", term84657);
        setField(term84655, term84655.getClass(), "userName", "SbdSVclvuX");
        setIntField(term84706, term84706.getClass(), "year", 2017);
        setShortField(term84706, term84706.getClass(), "month", (short) 1);
        setShortField(term84706, term84706.getClass(), "day", (short) 19);
        setField(term84705, term84705.getClass(), "date", term84706);
        setByteField(term84710, term84710.getClass(), "hour", (byte) 2);
        setByteField(term84710, term84710.getClass(), "minute", (byte) 18);
        setByteField(term84710, term84710.getClass(), "second", (byte) 26);
        setIntField(term84710, term84710.getClass(), "nano", 562246787);
        setField(term84705, term84705.getClass(), "time", term84710);
        setField(term84655, term84655.getClass(), "lastLoginDate", term84705);
        setBooleanField(term84655, term84655.getClass(), "isWebJoin", false);
        setField(term84655, term84655.getClass(), "webLimitDate", "QpoSxHFuJh");
        setIntField(term84655, term84655.getClass(), "level", -1638286616);
        setIntField(term84655, term84655.getClass(), "reincarnationNum", -256866404);
        setField(term84655, term84655.getClass(), "exp", "GLAJgnHQMo");
        setLongField(term84655, term84655.getClass(), "point", -7960465355740029962L);
        setLongField(term84655, term84655.getClass(), "totalPoint", -7641504744663354190L);
        setIntField(term84655, term84655.getClass(), "playCount", -354956895);
        setIntField(term84655, term84655.getClass(), "multiPlayCount", 1889003786);
        setIntField(term84655, term84655.getClass(), "multiWinCount", 452911848);
        setIntField(term84655, term84655.getClass(), "requestResCount", 2003994890);
        setIntField(term84655, term84655.getClass(), "acceptResCount", 2135032815);
        setIntField(term84655, term84655.getClass(), "successResCount", 2102441611);
        setIntField(term84655, term84655.getClass(), "playerRating", -972921113);
        setIntField(term84655, term84655.getClass(), "highestRating", -1692479417);
        setIntField(term84655, term84655.getClass(), "nameplateId", -1090532898);
        setIntField(term84655, term84655.getClass(), "frameId", 1732323444);
        setIntField(term84655, term84655.getClass(), "characterId", -1704583810);
        setIntField(term84655, term84655.getClass(), "trophyId", -1057666750);
        setIntField(term84655, term84655.getClass(), "playedTutorialBit", 702126350);
        setIntField(term84655, term84655.getClass(), "firstTutorialCancelNum", -1320161427);
        setIntField(term84655, term84655.getClass(), "masterTutorialCancelNum", 841954160);
        setIntField(term84655, term84655.getClass(), "totalRepertoireCount", 1417577834);
        setIntField(term84655, term84655.getClass(), "totalMapNum", -1641288466);
        setLongField(term84655, term84655.getClass(), "totalHiScore", 2973367088695686720L);
        setLongField(term84655, term84655.getClass(), "totalBasicHighScore", 3957586217570224080L);
        setLongField(term84655, term84655.getClass(), "totalAdvancedHighScore", 8593688994010397171L);
        setLongField(term84655, term84655.getClass(), "totalExpertHighScore", -4702186846634836119L);
        setLongField(term84655, term84655.getClass(), "totalMasterHighScore", -8068180925713934318L);
        setIntField(term84767, term84767.getClass(), "year", 2010);
        setShortField(term84767, term84767.getClass(), "month", (short) 9);
        setShortField(term84767, term84767.getClass(), "day", (short) 29);
        setField(term84766, term84766.getClass(), "date", term84767);
        setByteField(term84771, term84771.getClass(), "hour", (byte) 8);
        setByteField(term84771, term84771.getClass(), "minute", (byte) 31);
        setByteField(term84771, term84771.getClass(), "second", (byte) 30);
        setIntField(term84771, term84771.getClass(), "nano", 849859593);
        setField(term84766, term84766.getClass(), "time", term84771);
        setField(term84655, term84655.getClass(), "eventWatchedDate", term84766);
        setIntField(term84655, term84655.getClass(), "friendCount", 1755218175);
        setBooleanField(term84655, term84655.getClass(), "isMaimai", true);
        setField(term84655, term84655.getClass(), "firstGameId", "nDzlNeexNi");
        setField(term84655, term84655.getClass(), "firstRomVersion", "XhILAYdtGS");
        setField(term84655, term84655.getClass(), "firstDataVersion", "ZRWORAfStn");
        setIntField(term84815, term84815.getClass(), "year", 2012);
        setShortField(term84815, term84815.getClass(), "month", (short) 8);
        setShortField(term84815, term84815.getClass(), "day", (short) 20);
        setField(term84814, term84814.getClass(), "date", term84815);
        setByteField(term84819, term84819.getClass(), "hour", (byte) 3);
        setByteField(term84819, term84819.getClass(), "minute", (byte) 28);
        setByteField(term84819, term84819.getClass(), "second", (byte) 41);
        setIntField(term84819, term84819.getClass(), "nano", 318104116);
        setField(term84814, term84814.getClass(), "time", term84819);
        setField(term84655, term84655.getClass(), "firstPlayDate", term84814);
        setField(term84655, term84655.getClass(), "lastGameId", "loCxNBoGfW");
        setField(term84655, term84655.getClass(), "lastRomVersion", "PGVYUjJrZh");
        setField(term84655, term84655.getClass(), "lastDataVersion", "OHliEqVque");
        setIntField(term84861, term84861.getClass(), "year", 2013);
        setShortField(term84861, term84861.getClass(), "month", (short) 5);
        setShortField(term84861, term84861.getClass(), "day", (short) 23);
        setField(term84860, term84860.getClass(), "date", term84861);
        setByteField(term84865, term84865.getClass(), "hour", (byte) 17);
        setByteField(term84865, term84865.getClass(), "minute", (byte) 43);
        setByteField(term84865, term84865.getClass(), "second", (byte) 25);
        setIntField(term84865, term84865.getClass(), "nano", 472658100);
        setField(term84860, term84860.getClass(), "time", term84865);
        setField(term84655, term84655.getClass(), "lastPlayDate", term84860);
        setIntField(term84655, term84655.getClass(), "lastPlaceId", 647511055);
        setField(term84655, term84655.getClass(), "lastPlaceName", "kQWmmbQQqu");
        setField(term84655, term84655.getClass(), "lastRegionId", "bLKLlXYEeh");
        setField(term84655, term84655.getClass(), "lastRegionName", "amltyOnIBK");
        setField(term84655, term84655.getClass(), "lastAllNetId", "hjGlJibBAS");
        setField(term84655, term84655.getClass(), "lastClientId", "vinKDMUJMl");
        setField(term84653, term84653.getClass(), "user", term84655);
        setIntField(term84653, term84653.getClass(), "duelId", -1949921728);
        setIntField(term84653, term84653.getClass(), "progress", 932437963);
        setIntField(term84653, term84653.getClass(), "point", -194822585);
        setBooleanField(term84653, term84653.getClass(), "isClear", false);
        setIntField(term84936, term84936.getClass(), "year", 2026);
        setShortField(term84936, term84936.getClass(), "month", (short) 8);
        setShortField(term84936, term84936.getClass(), "day", (short) 30);
        setField(term84935, term84935.getClass(), "date", term84936);
        setByteField(term84940, term84940.getClass(), "hour", (byte) 23);
        setByteField(term84940, term84940.getClass(), "minute", (byte) 9);
        setByteField(term84940, term84940.getClass(), "second", (byte) 53);
        setIntField(term84940, term84940.getClass(), "nano", 748186544);
        setField(term84935, term84935.getClass(), "time", term84940);
        setField(term84653, term84653.getClass(), "lastPlayDate", term84935);
        setIntField(term84653, term84653.getClass(), "param1", 1420387294);
        setIntField(term84653, term84653.getClass(), "param2", 1088015655);
        setIntField(term84653, term84653.getClass(), "param3", -1328130039);
        setIntField(term84653, term84653.getClass(), "param4", 716362214);
        term84949 = new Integer(-699487881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term84949;
        callMethod(klass, "setParam3", argTypes, term84653, args);
    }

};


