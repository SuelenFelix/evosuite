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

public class UserData_equals_747380297100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172437;
     Object term172713;

    public UserData_equals_747380297100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term172441 = new Long(-5207216109884759743L);
        term172437 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term172439 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term172455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172460 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172470 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172492 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172548 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172549 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172553 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172601 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172642 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172643 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172647 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term172437, term172437.getClass(), "id", -1562117768116694382L);
        setLongField(term172439, term172439.getClass(), "id", 5704548673526128268L);
        setField(term172439, term172439.getClass(), "extId", term172441);
        setField(term172439, term172439.getClass(), "luid", "URFnfnnVnR");
        setIntField(term172456, term172456.getClass(), "year", 2029);
        setShortField(term172456, term172456.getClass(), "month", (short) 2);
        setShortField(term172456, term172456.getClass(), "day", (short) 27);
        setField(term172455, term172455.getClass(), "date", term172456);
        setByteField(term172460, term172460.getClass(), "hour", (byte) 18);
        setByteField(term172460, term172460.getClass(), "minute", (byte) 13);
        setByteField(term172460, term172460.getClass(), "second", (byte) 47);
        setIntField(term172460, term172460.getClass(), "nano", 118543714);
        setField(term172455, term172455.getClass(), "time", term172460);
        setField(term172439, term172439.getClass(), "registerTime", term172455);
        setIntField(term172466, term172466.getClass(), "year", 2018);
        setShortField(term172466, term172466.getClass(), "month", (short) 9);
        setShortField(term172466, term172466.getClass(), "day", (short) 5);
        setField(term172465, term172465.getClass(), "date", term172466);
        setByteField(term172470, term172470.getClass(), "hour", (byte) 4);
        setByteField(term172470, term172470.getClass(), "minute", (byte) 0);
        setByteField(term172470, term172470.getClass(), "second", (byte) 28);
        setIntField(term172470, term172470.getClass(), "nano", 574984289);
        setField(term172465, term172465.getClass(), "time", term172470);
        setField(term172439, term172439.getClass(), "accessTime", term172465);
        setField(term172437, term172437.getClass(), "card", term172439);
        setField(term172437, term172437.getClass(), "userName", "yYPbcSPbNI");
        setIntField(term172488, term172488.getClass(), "year", 2022);
        setShortField(term172488, term172488.getClass(), "month", (short) 8);
        setShortField(term172488, term172488.getClass(), "day", (short) 11);
        setField(term172487, term172487.getClass(), "date", term172488);
        setByteField(term172492, term172492.getClass(), "hour", (byte) 12);
        setByteField(term172492, term172492.getClass(), "minute", (byte) 21);
        setByteField(term172492, term172492.getClass(), "second", (byte) 48);
        setIntField(term172492, term172492.getClass(), "nano", 159371481);
        setField(term172487, term172487.getClass(), "time", term172492);
        setField(term172437, term172437.getClass(), "lastLoginDate", term172487);
        setBooleanField(term172437, term172437.getClass(), "isWebJoin", false);
        setField(term172437, term172437.getClass(), "webLimitDate", "xklUMESZww");
        setIntField(term172437, term172437.getClass(), "level", -508110901);
        setIntField(term172437, term172437.getClass(), "reincarnationNum", 2086708952);
        setField(term172437, term172437.getClass(), "exp", "ifSelTegbD");
        setLongField(term172437, term172437.getClass(), "point", 2264889560960513145L);
        setLongField(term172437, term172437.getClass(), "totalPoint", 3620836361287844637L);
        setIntField(term172437, term172437.getClass(), "playCount", 1938826379);
        setIntField(term172437, term172437.getClass(), "multiPlayCount", -1574173199);
        setIntField(term172437, term172437.getClass(), "multiWinCount", -1165441979);
        setIntField(term172437, term172437.getClass(), "requestResCount", -1921642793);
        setIntField(term172437, term172437.getClass(), "acceptResCount", -753596691);
        setIntField(term172437, term172437.getClass(), "successResCount", 1203822968);
        setIntField(term172437, term172437.getClass(), "playerRating", -149149061);
        setIntField(term172437, term172437.getClass(), "highestRating", 1599802857);
        setIntField(term172437, term172437.getClass(), "nameplateId", -284767862);
        setIntField(term172437, term172437.getClass(), "frameId", 1346515345);
        setIntField(term172437, term172437.getClass(), "characterId", 2132293781);
        setIntField(term172437, term172437.getClass(), "trophyId", 1025837124);
        setIntField(term172437, term172437.getClass(), "playedTutorialBit", -1875484532);
        setIntField(term172437, term172437.getClass(), "firstTutorialCancelNum", 2142478049);
        setIntField(term172437, term172437.getClass(), "masterTutorialCancelNum", 2085104036);
        setIntField(term172437, term172437.getClass(), "totalRepertoireCount", 136979507);
        setIntField(term172437, term172437.getClass(), "totalMapNum", -27834494);
        setLongField(term172437, term172437.getClass(), "totalHiScore", 2491904753526916872L);
        setLongField(term172437, term172437.getClass(), "totalBasicHighScore", -6367340974615807088L);
        setLongField(term172437, term172437.getClass(), "totalAdvancedHighScore", -3661358124870959771L);
        setLongField(term172437, term172437.getClass(), "totalExpertHighScore", -8120684450443636180L);
        setLongField(term172437, term172437.getClass(), "totalMasterHighScore", -1038564761233966381L);
        setIntField(term172549, term172549.getClass(), "year", 2029);
        setShortField(term172549, term172549.getClass(), "month", (short) 5);
        setShortField(term172549, term172549.getClass(), "day", (short) 21);
        setField(term172548, term172548.getClass(), "date", term172549);
        setByteField(term172553, term172553.getClass(), "hour", (byte) 21);
        setByteField(term172553, term172553.getClass(), "minute", (byte) 27);
        setByteField(term172553, term172553.getClass(), "second", (byte) 9);
        setIntField(term172553, term172553.getClass(), "nano", 1639864);
        setField(term172548, term172548.getClass(), "time", term172553);
        setField(term172437, term172437.getClass(), "eventWatchedDate", term172548);
        setIntField(term172437, term172437.getClass(), "friendCount", -470460903);
        setBooleanField(term172437, term172437.getClass(), "isMaimai", false);
        setField(term172437, term172437.getClass(), "firstGameId", "bshnstvPqL");
        setField(term172437, term172437.getClass(), "firstRomVersion", "VBdTvbXSPq");
        setField(term172437, term172437.getClass(), "firstDataVersion", "LNxOrvDiLu");
        setIntField(term172597, term172597.getClass(), "year", 2016);
        setShortField(term172597, term172597.getClass(), "month", (short) 10);
        setShortField(term172597, term172597.getClass(), "day", (short) 23);
        setField(term172596, term172596.getClass(), "date", term172597);
        setByteField(term172601, term172601.getClass(), "hour", (byte) 11);
        setByteField(term172601, term172601.getClass(), "minute", (byte) 27);
        setByteField(term172601, term172601.getClass(), "second", (byte) 18);
        setIntField(term172601, term172601.getClass(), "nano", 736209821);
        setField(term172596, term172596.getClass(), "time", term172601);
        setField(term172437, term172437.getClass(), "firstPlayDate", term172596);
        setField(term172437, term172437.getClass(), "lastGameId", "jwPgDafpXU");
        setField(term172437, term172437.getClass(), "lastRomVersion", "hKlSjWWTMB");
        setField(term172437, term172437.getClass(), "lastDataVersion", "RIyRjrXZyz");
        setIntField(term172643, term172643.getClass(), "year", 2027);
        setShortField(term172643, term172643.getClass(), "month", (short) 8);
        setShortField(term172643, term172643.getClass(), "day", (short) 3);
        setField(term172642, term172642.getClass(), "date", term172643);
        setByteField(term172647, term172647.getClass(), "hour", (byte) 4);
        setByteField(term172647, term172647.getClass(), "minute", (byte) 46);
        setByteField(term172647, term172647.getClass(), "second", (byte) 53);
        setIntField(term172647, term172647.getClass(), "nano", 244967892);
        setField(term172642, term172642.getClass(), "time", term172647);
        setField(term172437, term172437.getClass(), "lastPlayDate", term172642);
        setIntField(term172437, term172437.getClass(), "lastPlaceId", -1476214738);
        setField(term172437, term172437.getClass(), "lastPlaceName", "RSaouOqUAj");
        setField(term172437, term172437.getClass(), "lastRegionId", "HJeUoPJXeH");
        setField(term172437, term172437.getClass(), "lastRegionName", "zHnjCnTBlM");
        setField(term172437, term172437.getClass(), "lastAllNetId", "yZArpKdGoJ");
        setField(term172437, term172437.getClass(), "lastClientId", "wwMlzhTtbM");
        term172713 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term172713;
        callMethod(klass, "equals", argTypes, term172437, args);
    }

};


