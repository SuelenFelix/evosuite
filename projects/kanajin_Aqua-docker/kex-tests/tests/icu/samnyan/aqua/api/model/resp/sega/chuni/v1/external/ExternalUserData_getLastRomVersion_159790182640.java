package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getLastRomVersion_159790182640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16041;

    public ExternalUserData_getLastRomVersion_159790182640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16041 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term16066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16071 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16132 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16180 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16221 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16222 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16226 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16041, term16041.getClass(), "accessCode", "ndAITnOsny");
        setField(term16041, term16041.getClass(), "userName", "CVZnTiJucs");
        setIntField(term16067, term16067.getClass(), "year", 2027);
        setShortField(term16067, term16067.getClass(), "month", (short) 5);
        setShortField(term16067, term16067.getClass(), "day", (short) 2);
        setField(term16066, term16066.getClass(), "date", term16067);
        setByteField(term16071, term16071.getClass(), "hour", (byte) 6);
        setByteField(term16071, term16071.getClass(), "minute", (byte) 10);
        setByteField(term16071, term16071.getClass(), "second", (byte) 19);
        setIntField(term16071, term16071.getClass(), "nano", 422884120);
        setField(term16066, term16066.getClass(), "time", term16071);
        setField(term16041, term16041.getClass(), "lastLoginDate", term16066);
        setBooleanField(term16041, term16041.getClass(), "isWebJoin", false);
        setField(term16041, term16041.getClass(), "webLimitDate", "ecHEQufXoq");
        setIntField(term16041, term16041.getClass(), "level", -407582855);
        setIntField(term16041, term16041.getClass(), "reincarnationNum", 1190753616);
        setField(term16041, term16041.getClass(), "exp", "btBLMvHzJg");
        setLongField(term16041, term16041.getClass(), "point", -593735869267672817L);
        setLongField(term16041, term16041.getClass(), "totalPoint", 6041374912351843923L);
        setIntField(term16041, term16041.getClass(), "playCount", -752378450);
        setIntField(term16041, term16041.getClass(), "multiPlayCount", 848907965);
        setIntField(term16041, term16041.getClass(), "multiWinCount", 1865070548);
        setIntField(term16041, term16041.getClass(), "requestResCount", 1904515443);
        setIntField(term16041, term16041.getClass(), "acceptResCount", 1361126430);
        setIntField(term16041, term16041.getClass(), "successResCount", 1728588701);
        setIntField(term16041, term16041.getClass(), "playerRating", -355769268);
        setIntField(term16041, term16041.getClass(), "highestRating", -114460662);
        setIntField(term16041, term16041.getClass(), "nameplateId", -355376034);
        setIntField(term16041, term16041.getClass(), "frameId", 588390599);
        setIntField(term16041, term16041.getClass(), "characterId", -95969566);
        setIntField(term16041, term16041.getClass(), "trophyId", -68615285);
        setIntField(term16041, term16041.getClass(), "playedTutorialBit", -337504086);
        setIntField(term16041, term16041.getClass(), "firstTutorialCancelNum", 2074130991);
        setIntField(term16041, term16041.getClass(), "masterTutorialCancelNum", 532588266);
        setIntField(term16041, term16041.getClass(), "totalRepertoireCount", -1286686332);
        setIntField(term16041, term16041.getClass(), "totalMapNum", -284885486);
        setLongField(term16041, term16041.getClass(), "totalHiScore", 2535970782317488741L);
        setLongField(term16041, term16041.getClass(), "totalBasicHighScore", -5258945362776941718L);
        setLongField(term16041, term16041.getClass(), "totalAdvancedHighScore", 24067105862153728L);
        setLongField(term16041, term16041.getClass(), "totalExpertHighScore", -8477368071089201577L);
        setLongField(term16041, term16041.getClass(), "totalMasterHighScore", -1526729287349763895L);
        setIntField(term16128, term16128.getClass(), "year", 2029);
        setShortField(term16128, term16128.getClass(), "month", (short) 10);
        setShortField(term16128, term16128.getClass(), "day", (short) 19);
        setField(term16127, term16127.getClass(), "date", term16128);
        setByteField(term16132, term16132.getClass(), "hour", (byte) 15);
        setByteField(term16132, term16132.getClass(), "minute", (byte) 8);
        setByteField(term16132, term16132.getClass(), "second", (byte) 15);
        setIntField(term16132, term16132.getClass(), "nano", 25396748);
        setField(term16127, term16127.getClass(), "time", term16132);
        setField(term16041, term16041.getClass(), "eventWatchedDate", term16127);
        setIntField(term16041, term16041.getClass(), "friendCount", 1791984446);
        setBooleanField(term16041, term16041.getClass(), "isMaimai", false);
        setField(term16041, term16041.getClass(), "firstGameId", "JdOMfNWgLP");
        setField(term16041, term16041.getClass(), "firstRomVersion", "uWqXrwAsDU");
        setField(term16041, term16041.getClass(), "firstDataVersion", "hgFbWAUtsu");
        setIntField(term16176, term16176.getClass(), "year", 2014);
        setShortField(term16176, term16176.getClass(), "month", (short) 6);
        setShortField(term16176, term16176.getClass(), "day", (short) 28);
        setField(term16175, term16175.getClass(), "date", term16176);
        setByteField(term16180, term16180.getClass(), "hour", (byte) 7);
        setByteField(term16180, term16180.getClass(), "minute", (byte) 14);
        setByteField(term16180, term16180.getClass(), "second", (byte) 59);
        setIntField(term16180, term16180.getClass(), "nano", 314278386);
        setField(term16175, term16175.getClass(), "time", term16180);
        setField(term16041, term16041.getClass(), "firstPlayDate", term16175);
        setField(term16041, term16041.getClass(), "lastGameId", "HqoTWlkbwF");
        setField(term16041, term16041.getClass(), "lastRomVersion", "CwNELDTAPP");
        setField(term16041, term16041.getClass(), "lastDataVersion", "GSzQdbHLHw");
        setIntField(term16222, term16222.getClass(), "year", 2015);
        setShortField(term16222, term16222.getClass(), "month", (short) 10);
        setShortField(term16222, term16222.getClass(), "day", (short) 8);
        setField(term16221, term16221.getClass(), "date", term16222);
        setByteField(term16226, term16226.getClass(), "hour", (byte) 22);
        setByteField(term16226, term16226.getClass(), "minute", (byte) 20);
        setByteField(term16226, term16226.getClass(), "second", (byte) 59);
        setIntField(term16226, term16226.getClass(), "nano", 350521903);
        setField(term16221, term16221.getClass(), "time", term16226);
        setField(term16041, term16041.getClass(), "lastPlayDate", term16221);
        setIntField(term16041, term16041.getClass(), "lastPlaceId", 804070622);
        setField(term16041, term16041.getClass(), "lastPlaceName", "IkfarsYNJO");
        setField(term16041, term16041.getClass(), "lastRegionId", "aZKOWhHMEh");
        setField(term16041, term16041.getClass(), "lastRegionName", "YfkhviKZwl");
        setField(term16041, term16041.getClass(), "lastAllNetId", "DcOhhAfJTI");
        setField(term16041, term16041.getClass(), "lastClientId", "gYTIkBFOoS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term16041, args);
    }

};


