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

public class UserDataEx_init_14169995640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UserDataEx_init_14169995640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5 = new Long(2442117782898005296L);
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term3 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term19 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term211 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setLongField(term3, term3.getClass(), "id", 6375119433582206027L);
        setField(term3, term3.getClass(), "extId", term5);
        setField(term3, term3.getClass(), "luid", "PAEBtnZtTD");
        setIntField(term20, term20.getClass(), "year", 2012);
        setShortField(term20, term20.getClass(), "month", (short) 8);
        setShortField(term20, term20.getClass(), "day", (short) 25);
        setField(term19, term19.getClass(), "date", term20);
        setByteField(term24, term24.getClass(), "hour", (byte) 5);
        setByteField(term24, term24.getClass(), "minute", (byte) 20);
        setByteField(term24, term24.getClass(), "second", (byte) 50);
        setIntField(term24, term24.getClass(), "nano", 345595912);
        setField(term19, term19.getClass(), "time", term24);
        setField(term3, term3.getClass(), "registerTime", term19);
        setIntField(term30, term30.getClass(), "year", 2021);
        setShortField(term30, term30.getClass(), "month", (short) 1);
        setShortField(term30, term30.getClass(), "day", (short) 18);
        setField(term29, term29.getClass(), "date", term30);
        setByteField(term34, term34.getClass(), "hour", (byte) 13);
        setByteField(term34, term34.getClass(), "minute", (byte) 38);
        setByteField(term34, term34.getClass(), "second", (byte) 26);
        setIntField(term34, term34.getClass(), "nano", 544608644);
        setField(term29, term29.getClass(), "time", term34);
        setField(term3, term3.getClass(), "accessTime", term29);
        setField(term1, term1.getClass(), "card", term3);
        setField(term1, term1.getClass(), "userName", "sjlJAEtRrb");
        setIntField(term52, term52.getClass(), "year", 2015);
        setShortField(term52, term52.getClass(), "month", (short) 9);
        setShortField(term52, term52.getClass(), "day", (short) 19);
        setField(term51, term51.getClass(), "date", term52);
        setByteField(term56, term56.getClass(), "hour", (byte) 9);
        setByteField(term56, term56.getClass(), "minute", (byte) 4);
        setByteField(term56, term56.getClass(), "second", (byte) 10);
        setIntField(term56, term56.getClass(), "nano", 401765865);
        setField(term51, term51.getClass(), "time", term56);
        setField(term1, term1.getClass(), "lastLoginDate", term51);
        setBooleanField(term1, term1.getClass(), "isWebJoin", false);
        setField(term1, term1.getClass(), "webLimitDate", "MuLcgQHgqz");
        setIntField(term1, term1.getClass(), "level", 568599855);
        setIntField(term1, term1.getClass(), "reincarnationNum", 1162663216);
        setField(term1, term1.getClass(), "exp", "xxtlPwDYFs");
        setLongField(term1, term1.getClass(), "point", -8257434502486459194L);
        setLongField(term1, term1.getClass(), "totalPoint", -8400487765614892086L);
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
        setLongField(term1, term1.getClass(), "totalHiScore", 5270370404989704783L);
        setLongField(term1, term1.getClass(), "totalBasicHighScore", 7411271909051562686L);
        setLongField(term1, term1.getClass(), "totalAdvancedHighScore", 4872422362414183754L);
        setLongField(term1, term1.getClass(), "totalExpertHighScore", 6811161968424632369L);
        setLongField(term1, term1.getClass(), "totalMasterHighScore", -7237588299778557629L);
        setIntField(term113, term113.getClass(), "year", 2015);
        setShortField(term113, term113.getClass(), "month", (short) 4);
        setShortField(term113, term113.getClass(), "day", (short) 14);
        setField(term112, term112.getClass(), "date", term113);
        setByteField(term117, term117.getClass(), "hour", (byte) 18);
        setByteField(term117, term117.getClass(), "minute", (byte) 24);
        setByteField(term117, term117.getClass(), "second", (byte) 32);
        setIntField(term117, term117.getClass(), "nano", 369233818);
        setField(term112, term112.getClass(), "time", term117);
        setField(term1, term1.getClass(), "eventWatchedDate", term112);
        setIntField(term1, term1.getClass(), "friendCount", 1048535127);
        setBooleanField(term1, term1.getClass(), "isMaimai", false);
        setField(term1, term1.getClass(), "firstGameId", "jJCZpVmanW");
        setField(term1, term1.getClass(), "firstRomVersion", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "firstDataVersion", "SzjVpOQTyS");
        setIntField(term161, term161.getClass(), "year", 2022);
        setShortField(term161, term161.getClass(), "month", (short) 2);
        setShortField(term161, term161.getClass(), "day", (short) 26);
        setField(term160, term160.getClass(), "date", term161);
        setByteField(term165, term165.getClass(), "hour", (byte) 11);
        setByteField(term165, term165.getClass(), "minute", (byte) 42);
        setByteField(term165, term165.getClass(), "second", (byte) 15);
        setIntField(term165, term165.getClass(), "nano", 377731937);
        setField(term160, term160.getClass(), "time", term165);
        setField(term1, term1.getClass(), "firstPlayDate", term160);
        setField(term1, term1.getClass(), "lastGameId", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "lastRomVersion", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "lastDataVersion", "RMFIsYGgne");
        setIntField(term207, term207.getClass(), "year", 2026);
        setShortField(term207, term207.getClass(), "month", (short) 12);
        setShortField(term207, term207.getClass(), "day", (short) 14);
        setField(term206, term206.getClass(), "date", term207);
        setByteField(term211, term211.getClass(), "hour", (byte) 16);
        setByteField(term211, term211.getClass(), "minute", (byte) 34);
        setByteField(term211, term211.getClass(), "second", (byte) 9);
        setIntField(term211, term211.getClass(), "nano", 518326996);
        setField(term206, term206.getClass(), "time", term211);
        setField(term1, term1.getClass(), "lastPlayDate", term206);
        setIntField(term1, term1.getClass(), "lastPlaceId", -655067527);
        setField(term1, term1.getClass(), "lastPlaceName", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "lastRegionId", "uuaPigETmJ");
        setField(term1, term1.getClass(), "lastRegionName", "MxlszYVzRf");
        setField(term1, term1.getClass(), "lastAllNetId", "LQFpaHEwXR");
        setField(term1, term1.getClass(), "lastClientId", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDataEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


