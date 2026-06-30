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

public class UserGeneralData_getUser_8187986682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303439;

    public UserGeneralData_getUser_8187986682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term303445 = new Long(-5761087225966065493L);
        term303439 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData"));
        Object term303441 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term303443 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term303459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term303460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term303464 = newInstance(Class.forName("java.time.LocalTime"));
        Object term303469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term303470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term303474 = newInstance(Class.forName("java.time.LocalTime"));
        Object term303491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term303492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term303496 = newInstance(Class.forName("java.time.LocalTime"));
        Object term303552 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term303553 = newInstance(Class.forName("java.time.LocalDate"));
        Object term303557 = newInstance(Class.forName("java.time.LocalTime"));
        Object term303600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term303601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term303605 = newInstance(Class.forName("java.time.LocalTime"));
        Object term303646 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term303647 = newInstance(Class.forName("java.time.LocalDate"));
        Object term303651 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term303439, term303439.getClass(), "id", -6054241362349257095L);
        setLongField(term303441, term303441.getClass(), "id", 5442568919413262365L);
        setLongField(term303443, term303443.getClass(), "id", 3549776544767502048L);
        setField(term303443, term303443.getClass(), "extId", term303445);
        setField(term303443, term303443.getClass(), "luid", "aAFUdZslxJ");
        setIntField(term303460, term303460.getClass(), "year", 2022);
        setShortField(term303460, term303460.getClass(), "month", (short) 10);
        setShortField(term303460, term303460.getClass(), "day", (short) 17);
        setField(term303459, term303459.getClass(), "date", term303460);
        setByteField(term303464, term303464.getClass(), "hour", (byte) 6);
        setByteField(term303464, term303464.getClass(), "minute", (byte) 16);
        setByteField(term303464, term303464.getClass(), "second", (byte) 46);
        setIntField(term303464, term303464.getClass(), "nano", 294778121);
        setField(term303459, term303459.getClass(), "time", term303464);
        setField(term303443, term303443.getClass(), "registerTime", term303459);
        setIntField(term303470, term303470.getClass(), "year", 2014);
        setShortField(term303470, term303470.getClass(), "month", (short) 3);
        setShortField(term303470, term303470.getClass(), "day", (short) 1);
        setField(term303469, term303469.getClass(), "date", term303470);
        setByteField(term303474, term303474.getClass(), "hour", (byte) 13);
        setByteField(term303474, term303474.getClass(), "minute", (byte) 7);
        setByteField(term303474, term303474.getClass(), "second", (byte) 18);
        setIntField(term303474, term303474.getClass(), "nano", 611824176);
        setField(term303469, term303469.getClass(), "time", term303474);
        setField(term303443, term303443.getClass(), "accessTime", term303469);
        setField(term303441, term303441.getClass(), "card", term303443);
        setField(term303441, term303441.getClass(), "userName", "gMrywiVyIr");
        setIntField(term303492, term303492.getClass(), "year", 2025);
        setShortField(term303492, term303492.getClass(), "month", (short) 12);
        setShortField(term303492, term303492.getClass(), "day", (short) 8);
        setField(term303491, term303491.getClass(), "date", term303492);
        setByteField(term303496, term303496.getClass(), "hour", (byte) 18);
        setByteField(term303496, term303496.getClass(), "minute", (byte) 1);
        setByteField(term303496, term303496.getClass(), "second", (byte) 15);
        setIntField(term303496, term303496.getClass(), "nano", 540427397);
        setField(term303491, term303491.getClass(), "time", term303496);
        setField(term303441, term303441.getClass(), "lastLoginDate", term303491);
        setBooleanField(term303441, term303441.getClass(), "isWebJoin", true);
        setField(term303441, term303441.getClass(), "webLimitDate", "iyZjIacLsw");
        setIntField(term303441, term303441.getClass(), "level", 2051375168);
        setIntField(term303441, term303441.getClass(), "reincarnationNum", 1951565709);
        setField(term303441, term303441.getClass(), "exp", "vYkgboKVHZ");
        setLongField(term303441, term303441.getClass(), "point", -5880536871644887019L);
        setLongField(term303441, term303441.getClass(), "totalPoint", 7984907992991522874L);
        setIntField(term303441, term303441.getClass(), "playCount", -609869128);
        setIntField(term303441, term303441.getClass(), "multiPlayCount", -1798058557);
        setIntField(term303441, term303441.getClass(), "multiWinCount", 1566465773);
        setIntField(term303441, term303441.getClass(), "requestResCount", -319806392);
        setIntField(term303441, term303441.getClass(), "acceptResCount", 1425075560);
        setIntField(term303441, term303441.getClass(), "successResCount", 314430334);
        setIntField(term303441, term303441.getClass(), "playerRating", -1001978760);
        setIntField(term303441, term303441.getClass(), "highestRating", -255413282);
        setIntField(term303441, term303441.getClass(), "nameplateId", 1797303999);
        setIntField(term303441, term303441.getClass(), "frameId", -327593257);
        setIntField(term303441, term303441.getClass(), "characterId", 16109140);
        setIntField(term303441, term303441.getClass(), "trophyId", -822251246);
        setIntField(term303441, term303441.getClass(), "playedTutorialBit", -408175867);
        setIntField(term303441, term303441.getClass(), "firstTutorialCancelNum", 1218877971);
        setIntField(term303441, term303441.getClass(), "masterTutorialCancelNum", 1248698741);
        setIntField(term303441, term303441.getClass(), "totalRepertoireCount", 563911514);
        setIntField(term303441, term303441.getClass(), "totalMapNum", 1278145075);
        setLongField(term303441, term303441.getClass(), "totalHiScore", 9033564673534072783L);
        setLongField(term303441, term303441.getClass(), "totalBasicHighScore", -551639182102677710L);
        setLongField(term303441, term303441.getClass(), "totalAdvancedHighScore", 7220537567889807156L);
        setLongField(term303441, term303441.getClass(), "totalExpertHighScore", 6406723091716352058L);
        setLongField(term303441, term303441.getClass(), "totalMasterHighScore", 2769255640086837293L);
        setIntField(term303553, term303553.getClass(), "year", 2028);
        setShortField(term303553, term303553.getClass(), "month", (short) 8);
        setShortField(term303553, term303553.getClass(), "day", (short) 7);
        setField(term303552, term303552.getClass(), "date", term303553);
        setByteField(term303557, term303557.getClass(), "hour", (byte) 12);
        setByteField(term303557, term303557.getClass(), "minute", (byte) 20);
        setByteField(term303557, term303557.getClass(), "second", (byte) 30);
        setIntField(term303557, term303557.getClass(), "nano", 533777827);
        setField(term303552, term303552.getClass(), "time", term303557);
        setField(term303441, term303441.getClass(), "eventWatchedDate", term303552);
        setIntField(term303441, term303441.getClass(), "friendCount", 347582830);
        setBooleanField(term303441, term303441.getClass(), "isMaimai", true);
        setField(term303441, term303441.getClass(), "firstGameId", "IaGDRvnqIb");
        setField(term303441, term303441.getClass(), "firstRomVersion", "yBxHnUtIkQ");
        setField(term303441, term303441.getClass(), "firstDataVersion", "qzQdYSDBmc");
        setIntField(term303601, term303601.getClass(), "year", 2023);
        setShortField(term303601, term303601.getClass(), "month", (short) 12);
        setShortField(term303601, term303601.getClass(), "day", (short) 7);
        setField(term303600, term303600.getClass(), "date", term303601);
        setByteField(term303605, term303605.getClass(), "hour", (byte) 0);
        setByteField(term303605, term303605.getClass(), "minute", (byte) 6);
        setByteField(term303605, term303605.getClass(), "second", (byte) 42);
        setIntField(term303605, term303605.getClass(), "nano", 382183522);
        setField(term303600, term303600.getClass(), "time", term303605);
        setField(term303441, term303441.getClass(), "firstPlayDate", term303600);
        setField(term303441, term303441.getClass(), "lastGameId", "lDCuOPQJTx");
        setField(term303441, term303441.getClass(), "lastRomVersion", "WrdCxtewLX");
        setField(term303441, term303441.getClass(), "lastDataVersion", "pVqgMvBetn");
        setIntField(term303647, term303647.getClass(), "year", 2029);
        setShortField(term303647, term303647.getClass(), "month", (short) 2);
        setShortField(term303647, term303647.getClass(), "day", (short) 22);
        setField(term303646, term303646.getClass(), "date", term303647);
        setByteField(term303651, term303651.getClass(), "hour", (byte) 19);
        setByteField(term303651, term303651.getClass(), "minute", (byte) 21);
        setByteField(term303651, term303651.getClass(), "second", (byte) 51);
        setIntField(term303651, term303651.getClass(), "nano", 149968612);
        setField(term303646, term303646.getClass(), "time", term303651);
        setField(term303441, term303441.getClass(), "lastPlayDate", term303646);
        setIntField(term303441, term303441.getClass(), "lastPlaceId", -462578945);
        setField(term303441, term303441.getClass(), "lastPlaceName", "GWyDJhNjHO");
        setField(term303441, term303441.getClass(), "lastRegionId", "wGLXibmokg");
        setField(term303441, term303441.getClass(), "lastRegionName", "pjzfuurpjQ");
        setField(term303441, term303441.getClass(), "lastAllNetId", "ruWiEcqbKE");
        setField(term303441, term303441.getClass(), "lastClientId", "fOazzEjCJK");
        setField(term303439, term303439.getClass(), "user", term303441);
        setField(term303439, term303439.getClass(), "propertyKey", "rQvktJLyNp");
        setField(term303439, term303439.getClass(), "propertyValue", "agrDiNiIaA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term303439, args);
    }

};


