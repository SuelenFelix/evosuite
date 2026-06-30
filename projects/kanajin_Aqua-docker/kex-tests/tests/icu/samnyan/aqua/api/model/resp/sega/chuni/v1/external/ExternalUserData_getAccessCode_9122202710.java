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

public class ExternalUserData_getAccessCode_9122202710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ExternalUserData_getAccessCode_9122202710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term26 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140 = newInstance(Class.forName("java.time.LocalTime"));
        Object term181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "accessCode", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "userName", "sjlJAEtRrb");
        setIntField(term27, term27.getClass(), "year", 2012);
        setShortField(term27, term27.getClass(), "month", (short) 8);
        setShortField(term27, term27.getClass(), "day", (short) 25);
        setField(term26, term26.getClass(), "date", term27);
        setByteField(term31, term31.getClass(), "hour", (byte) 5);
        setByteField(term31, term31.getClass(), "minute", (byte) 20);
        setByteField(term31, term31.getClass(), "second", (byte) 50);
        setIntField(term31, term31.getClass(), "nano", 345595912);
        setField(term26, term26.getClass(), "time", term31);
        setField(term1, term1.getClass(), "lastLoginDate", term26);
        setBooleanField(term1, term1.getClass(), "isWebJoin", false);
        setField(term1, term1.getClass(), "webLimitDate", "MuLcgQHgqz");
        setIntField(term1, term1.getClass(), "level", 568599855);
        setIntField(term1, term1.getClass(), "reincarnationNum", 1162663216);
        setField(term1, term1.getClass(), "exp", "xxtlPwDYFs");
        setLongField(term1, term1.getClass(), "point", 2442117782898005296L);
        setLongField(term1, term1.getClass(), "totalPoint", 6375119433582206027L);
        setIntField(term1, term1.getClass(), "playCount", 1484323161);
        setIntField(term1, term1.getClass(), "multiPlayCount", 391863371);
        setIntField(term1, term1.getClass(), "multiWinCount", -1922583790);
        setIntField(term1, term1.getClass(), "requestResCount", -616727354);
        setIntField(term1, term1.getClass(), "acceptResCount", -1955890973);
        setIntField(term1, term1.getClass(), "successResCount", -2038273078);
        setIntField(term1, term1.getClass(), "playerRating", 1227103734);
        setIntField(term1, term1.getClass(), "highestRating", -1339778481);
        setIntField(term1, term1.getClass(), "nameplateId", 1725571209);
        setIntField(term1, term1.getClass(), "frameId", -522618178);
        setIntField(term1, term1.getClass(), "characterId", 1134449235);
        setIntField(term1, term1.getClass(), "trophyId", -883034806);
        setIntField(term1, term1.getClass(), "playedTutorialBit", 1585847225);
        setIntField(term1, term1.getClass(), "firstTutorialCancelNum", 597278769);
        setIntField(term1, term1.getClass(), "masterTutorialCancelNum", -1685132342);
        setIntField(term1, term1.getClass(), "totalRepertoireCount", -1456670397);
        setIntField(term1, term1.getClass(), "totalMapNum", 1622346318);
        setLongField(term1, term1.getClass(), "totalHiScore", -8257434502486459194L);
        setLongField(term1, term1.getClass(), "totalBasicHighScore", -8400487765614892086L);
        setLongField(term1, term1.getClass(), "totalAdvancedHighScore", 5270370404989704783L);
        setLongField(term1, term1.getClass(), "totalExpertHighScore", 7411271909051562686L);
        setLongField(term1, term1.getClass(), "totalMasterHighScore", 4872422362414183754L);
        setIntField(term88, term88.getClass(), "year", 2021);
        setShortField(term88, term88.getClass(), "month", (short) 1);
        setShortField(term88, term88.getClass(), "day", (short) 18);
        setField(term87, term87.getClass(), "date", term88);
        setByteField(term92, term92.getClass(), "hour", (byte) 13);
        setByteField(term92, term92.getClass(), "minute", (byte) 38);
        setByteField(term92, term92.getClass(), "second", (byte) 26);
        setIntField(term92, term92.getClass(), "nano", 544608644);
        setField(term87, term87.getClass(), "time", term92);
        setField(term1, term1.getClass(), "eventWatchedDate", term87);
        setIntField(term1, term1.getClass(), "friendCount", 1048535127);
        setBooleanField(term1, term1.getClass(), "isMaimai", false);
        setField(term1, term1.getClass(), "firstGameId", "jJCZpVmanW");
        setField(term1, term1.getClass(), "firstRomVersion", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "firstDataVersion", "SzjVpOQTyS");
        setIntField(term136, term136.getClass(), "year", 2015);
        setShortField(term136, term136.getClass(), "month", (short) 9);
        setShortField(term136, term136.getClass(), "day", (short) 19);
        setField(term135, term135.getClass(), "date", term136);
        setByteField(term140, term140.getClass(), "hour", (byte) 9);
        setByteField(term140, term140.getClass(), "minute", (byte) 4);
        setByteField(term140, term140.getClass(), "second", (byte) 10);
        setIntField(term140, term140.getClass(), "nano", 401765865);
        setField(term135, term135.getClass(), "time", term140);
        setField(term1, term1.getClass(), "firstPlayDate", term135);
        setField(term1, term1.getClass(), "lastGameId", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "lastRomVersion", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "lastDataVersion", "RMFIsYGgne");
        setIntField(term182, term182.getClass(), "year", 2015);
        setShortField(term182, term182.getClass(), "month", (short) 4);
        setShortField(term182, term182.getClass(), "day", (short) 14);
        setField(term181, term181.getClass(), "date", term182);
        setByteField(term186, term186.getClass(), "hour", (byte) 18);
        setByteField(term186, term186.getClass(), "minute", (byte) 24);
        setByteField(term186, term186.getClass(), "second", (byte) 32);
        setIntField(term186, term186.getClass(), "nano", 369233818);
        setField(term181, term181.getClass(), "time", term186);
        setField(term1, term1.getClass(), "lastPlayDate", term181);
        setIntField(term1, term1.getClass(), "lastPlaceId", -655067527);
        setField(term1, term1.getClass(), "lastPlaceName", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "lastRegionId", "uuaPigETmJ");
        setField(term1, term1.getClass(), "lastRegionName", "MxlszYVzRf");
        setField(term1, term1.getClass(), "lastAllNetId", "LQFpaHEwXR");
        setField(term1, term1.getClass(), "lastClientId", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessCode", argTypes, term1, args);
    }

};


