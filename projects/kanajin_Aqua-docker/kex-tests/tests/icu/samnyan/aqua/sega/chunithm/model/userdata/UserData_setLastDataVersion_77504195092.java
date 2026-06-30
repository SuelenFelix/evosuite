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

public class UserData_setLastDataVersion_77504195092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168885;

    public UserData_setLastDataVersion_77504195092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term168889 = new Long(-3279534582096707294L);
        term168885 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term168887 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term168903 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168904 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168908 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168913 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168914 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168918 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168940 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168996 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168997 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169001 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169044 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169045 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169049 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169090 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169091 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169095 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term168885, term168885.getClass(), "id", 3226886549938182892L);
        setLongField(term168887, term168887.getClass(), "id", -7259275759445296815L);
        setField(term168887, term168887.getClass(), "extId", term168889);
        setField(term168887, term168887.getClass(), "luid", "EaDyXoCmvw");
        setIntField(term168904, term168904.getClass(), "year", 2025);
        setShortField(term168904, term168904.getClass(), "month", (short) 3);
        setShortField(term168904, term168904.getClass(), "day", (short) 16);
        setField(term168903, term168903.getClass(), "date", term168904);
        setByteField(term168908, term168908.getClass(), "hour", (byte) 12);
        setByteField(term168908, term168908.getClass(), "minute", (byte) 7);
        setByteField(term168908, term168908.getClass(), "second", (byte) 58);
        setIntField(term168908, term168908.getClass(), "nano", 362878976);
        setField(term168903, term168903.getClass(), "time", term168908);
        setField(term168887, term168887.getClass(), "registerTime", term168903);
        setIntField(term168914, term168914.getClass(), "year", 2023);
        setShortField(term168914, term168914.getClass(), "month", (short) 1);
        setShortField(term168914, term168914.getClass(), "day", (short) 11);
        setField(term168913, term168913.getClass(), "date", term168914);
        setByteField(term168918, term168918.getClass(), "hour", (byte) 2);
        setByteField(term168918, term168918.getClass(), "minute", (byte) 41);
        setByteField(term168918, term168918.getClass(), "second", (byte) 38);
        setIntField(term168918, term168918.getClass(), "nano", 570964357);
        setField(term168913, term168913.getClass(), "time", term168918);
        setField(term168887, term168887.getClass(), "accessTime", term168913);
        setField(term168885, term168885.getClass(), "card", term168887);
        setField(term168885, term168885.getClass(), "userName", "SnmEEcdVjr");
        setIntField(term168936, term168936.getClass(), "year", 2012);
        setShortField(term168936, term168936.getClass(), "month", (short) 10);
        setShortField(term168936, term168936.getClass(), "day", (short) 3);
        setField(term168935, term168935.getClass(), "date", term168936);
        setByteField(term168940, term168940.getClass(), "hour", (byte) 4);
        setByteField(term168940, term168940.getClass(), "minute", (byte) 53);
        setByteField(term168940, term168940.getClass(), "second", (byte) 7);
        setIntField(term168940, term168940.getClass(), "nano", 527049614);
        setField(term168935, term168935.getClass(), "time", term168940);
        setField(term168885, term168885.getClass(), "lastLoginDate", term168935);
        setBooleanField(term168885, term168885.getClass(), "isWebJoin", false);
        setField(term168885, term168885.getClass(), "webLimitDate", "spDbzLGljF");
        setIntField(term168885, term168885.getClass(), "level", -418135199);
        setIntField(term168885, term168885.getClass(), "reincarnationNum", -998308174);
        setField(term168885, term168885.getClass(), "exp", "kKriCwCMKZ");
        setLongField(term168885, term168885.getClass(), "point", 2146205273504422497L);
        setLongField(term168885, term168885.getClass(), "totalPoint", -6170196256774544832L);
        setIntField(term168885, term168885.getClass(), "playCount", 943396558);
        setIntField(term168885, term168885.getClass(), "multiPlayCount", -249229799);
        setIntField(term168885, term168885.getClass(), "multiWinCount", 1410694856);
        setIntField(term168885, term168885.getClass(), "requestResCount", -1629525320);
        setIntField(term168885, term168885.getClass(), "acceptResCount", -675248961);
        setIntField(term168885, term168885.getClass(), "successResCount", 633732117);
        setIntField(term168885, term168885.getClass(), "playerRating", 2061669437);
        setIntField(term168885, term168885.getClass(), "highestRating", 1974184760);
        setIntField(term168885, term168885.getClass(), "nameplateId", -2074909519);
        setIntField(term168885, term168885.getClass(), "frameId", -1055211106);
        setIntField(term168885, term168885.getClass(), "characterId", -1730335296);
        setIntField(term168885, term168885.getClass(), "trophyId", -891933643);
        setIntField(term168885, term168885.getClass(), "playedTutorialBit", -1896713868);
        setIntField(term168885, term168885.getClass(), "firstTutorialCancelNum", -461903855);
        setIntField(term168885, term168885.getClass(), "masterTutorialCancelNum", -865104705);
        setIntField(term168885, term168885.getClass(), "totalRepertoireCount", -871992654);
        setIntField(term168885, term168885.getClass(), "totalMapNum", 2144355880);
        setLongField(term168885, term168885.getClass(), "totalHiScore", -3949902082933699941L);
        setLongField(term168885, term168885.getClass(), "totalBasicHighScore", -611126419518448657L);
        setLongField(term168885, term168885.getClass(), "totalAdvancedHighScore", 3498203783805987897L);
        setLongField(term168885, term168885.getClass(), "totalExpertHighScore", 1448097862876060784L);
        setLongField(term168885, term168885.getClass(), "totalMasterHighScore", 8557138019134828645L);
        setIntField(term168997, term168997.getClass(), "year", 2019);
        setShortField(term168997, term168997.getClass(), "month", (short) 3);
        setShortField(term168997, term168997.getClass(), "day", (short) 1);
        setField(term168996, term168996.getClass(), "date", term168997);
        setByteField(term169001, term169001.getClass(), "hour", (byte) 21);
        setByteField(term169001, term169001.getClass(), "minute", (byte) 9);
        setByteField(term169001, term169001.getClass(), "second", (byte) 46);
        setIntField(term169001, term169001.getClass(), "nano", 902503654);
        setField(term168996, term168996.getClass(), "time", term169001);
        setField(term168885, term168885.getClass(), "eventWatchedDate", term168996);
        setIntField(term168885, term168885.getClass(), "friendCount", -1872843252);
        setBooleanField(term168885, term168885.getClass(), "isMaimai", false);
        setField(term168885, term168885.getClass(), "firstGameId", "OqqRKizGlA");
        setField(term168885, term168885.getClass(), "firstRomVersion", "BfkaSVewHo");
        setField(term168885, term168885.getClass(), "firstDataVersion", "GFeJRtCLPr");
        setIntField(term169045, term169045.getClass(), "year", 2013);
        setShortField(term169045, term169045.getClass(), "month", (short) 2);
        setShortField(term169045, term169045.getClass(), "day", (short) 5);
        setField(term169044, term169044.getClass(), "date", term169045);
        setByteField(term169049, term169049.getClass(), "hour", (byte) 18);
        setByteField(term169049, term169049.getClass(), "minute", (byte) 5);
        setByteField(term169049, term169049.getClass(), "second", (byte) 9);
        setIntField(term169049, term169049.getClass(), "nano", 34225331);
        setField(term169044, term169044.getClass(), "time", term169049);
        setField(term168885, term168885.getClass(), "firstPlayDate", term169044);
        setField(term168885, term168885.getClass(), "lastGameId", "peaLaAdtsN");
        setField(term168885, term168885.getClass(), "lastRomVersion", "jomJrYDlDE");
        setField(term168885, term168885.getClass(), "lastDataVersion", "BQmwDtrgti");
        setIntField(term169091, term169091.getClass(), "year", 2011);
        setShortField(term169091, term169091.getClass(), "month", (short) 10);
        setShortField(term169091, term169091.getClass(), "day", (short) 22);
        setField(term169090, term169090.getClass(), "date", term169091);
        setByteField(term169095, term169095.getClass(), "hour", (byte) 14);
        setByteField(term169095, term169095.getClass(), "minute", (byte) 49);
        setByteField(term169095, term169095.getClass(), "second", (byte) 29);
        setIntField(term169095, term169095.getClass(), "nano", 913608469);
        setField(term169090, term169090.getClass(), "time", term169095);
        setField(term168885, term168885.getClass(), "lastPlayDate", term169090);
        setIntField(term168885, term168885.getClass(), "lastPlaceId", -1245312089);
        setField(term168885, term168885.getClass(), "lastPlaceName", "iqVbRxUtcE");
        setField(term168885, term168885.getClass(), "lastRegionId", "CXKmGqWZmZ");
        setField(term168885, term168885.getClass(), "lastRegionName", "LZcrISHdty");
        setField(term168885, term168885.getClass(), "lastAllNetId", "ttStZmuDMP");
        setField(term168885, term168885.getClass(), "lastClientId", "tdVGOsPdFX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gzpBjJSCCd";
        callMethod(klass, "setLastDataVersion", argTypes, term168885, args);
    }

};


