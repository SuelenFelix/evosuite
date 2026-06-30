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

public class UserData_setPlayerRating_6786331167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158069;
     Object term158345;

    public UserData_setPlayerRating_6786331167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term158073 = new Long(-187772971269812453L);
        term158069 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term158071 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term158087 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158088 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158092 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158098 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158102 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158124 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158185 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158228 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158229 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158233 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158274 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158275 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158279 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term158069, term158069.getClass(), "id", 1123327822305694766L);
        setLongField(term158071, term158071.getClass(), "id", -7893702611376690699L);
        setField(term158071, term158071.getClass(), "extId", term158073);
        setField(term158071, term158071.getClass(), "luid", "JBjRYdrxgs");
        setIntField(term158088, term158088.getClass(), "year", 2028);
        setShortField(term158088, term158088.getClass(), "month", (short) 12);
        setShortField(term158088, term158088.getClass(), "day", (short) 29);
        setField(term158087, term158087.getClass(), "date", term158088);
        setByteField(term158092, term158092.getClass(), "hour", (byte) 9);
        setByteField(term158092, term158092.getClass(), "minute", (byte) 35);
        setByteField(term158092, term158092.getClass(), "second", (byte) 42);
        setIntField(term158092, term158092.getClass(), "nano", 975087365);
        setField(term158087, term158087.getClass(), "time", term158092);
        setField(term158071, term158071.getClass(), "registerTime", term158087);
        setIntField(term158098, term158098.getClass(), "year", 2025);
        setShortField(term158098, term158098.getClass(), "month", (short) 7);
        setShortField(term158098, term158098.getClass(), "day", (short) 17);
        setField(term158097, term158097.getClass(), "date", term158098);
        setByteField(term158102, term158102.getClass(), "hour", (byte) 16);
        setByteField(term158102, term158102.getClass(), "minute", (byte) 59);
        setByteField(term158102, term158102.getClass(), "second", (byte) 11);
        setIntField(term158102, term158102.getClass(), "nano", 463917561);
        setField(term158097, term158097.getClass(), "time", term158102);
        setField(term158071, term158071.getClass(), "accessTime", term158097);
        setField(term158069, term158069.getClass(), "card", term158071);
        setField(term158069, term158069.getClass(), "userName", "SGDHQYYzsR");
        setIntField(term158120, term158120.getClass(), "year", 2021);
        setShortField(term158120, term158120.getClass(), "month", (short) 10);
        setShortField(term158120, term158120.getClass(), "day", (short) 29);
        setField(term158119, term158119.getClass(), "date", term158120);
        setByteField(term158124, term158124.getClass(), "hour", (byte) 19);
        setByteField(term158124, term158124.getClass(), "minute", (byte) 54);
        setByteField(term158124, term158124.getClass(), "second", (byte) 16);
        setIntField(term158124, term158124.getClass(), "nano", 866556468);
        setField(term158119, term158119.getClass(), "time", term158124);
        setField(term158069, term158069.getClass(), "lastLoginDate", term158119);
        setBooleanField(term158069, term158069.getClass(), "isWebJoin", true);
        setField(term158069, term158069.getClass(), "webLimitDate", "hecboVcqgp");
        setIntField(term158069, term158069.getClass(), "level", -1542767364);
        setIntField(term158069, term158069.getClass(), "reincarnationNum", -597174536);
        setField(term158069, term158069.getClass(), "exp", "yjLlTYCCBx");
        setLongField(term158069, term158069.getClass(), "point", 665607857695451113L);
        setLongField(term158069, term158069.getClass(), "totalPoint", -6992013352199756588L);
        setIntField(term158069, term158069.getClass(), "playCount", -23544043);
        setIntField(term158069, term158069.getClass(), "multiPlayCount", -1186171274);
        setIntField(term158069, term158069.getClass(), "multiWinCount", -1573775399);
        setIntField(term158069, term158069.getClass(), "requestResCount", -301649033);
        setIntField(term158069, term158069.getClass(), "acceptResCount", 1335266802);
        setIntField(term158069, term158069.getClass(), "successResCount", -1732408059);
        setIntField(term158069, term158069.getClass(), "playerRating", 1433024397);
        setIntField(term158069, term158069.getClass(), "highestRating", 1216072735);
        setIntField(term158069, term158069.getClass(), "nameplateId", 1880806607);
        setIntField(term158069, term158069.getClass(), "frameId", 265152714);
        setIntField(term158069, term158069.getClass(), "characterId", 1291985298);
        setIntField(term158069, term158069.getClass(), "trophyId", -1615684635);
        setIntField(term158069, term158069.getClass(), "playedTutorialBit", -725181754);
        setIntField(term158069, term158069.getClass(), "firstTutorialCancelNum", -2117106210);
        setIntField(term158069, term158069.getClass(), "masterTutorialCancelNum", -767668699);
        setIntField(term158069, term158069.getClass(), "totalRepertoireCount", 1274445811);
        setIntField(term158069, term158069.getClass(), "totalMapNum", 1903103775);
        setLongField(term158069, term158069.getClass(), "totalHiScore", -4792083559351629166L);
        setLongField(term158069, term158069.getClass(), "totalBasicHighScore", -865520563203189439L);
        setLongField(term158069, term158069.getClass(), "totalAdvancedHighScore", 943353555627069347L);
        setLongField(term158069, term158069.getClass(), "totalExpertHighScore", 6265344567302607504L);
        setLongField(term158069, term158069.getClass(), "totalMasterHighScore", 7538755489771520951L);
        setIntField(term158181, term158181.getClass(), "year", 2022);
        setShortField(term158181, term158181.getClass(), "month", (short) 2);
        setShortField(term158181, term158181.getClass(), "day", (short) 18);
        setField(term158180, term158180.getClass(), "date", term158181);
        setByteField(term158185, term158185.getClass(), "hour", (byte) 17);
        setByteField(term158185, term158185.getClass(), "minute", (byte) 51);
        setByteField(term158185, term158185.getClass(), "second", (byte) 32);
        setIntField(term158185, term158185.getClass(), "nano", 625852483);
        setField(term158180, term158180.getClass(), "time", term158185);
        setField(term158069, term158069.getClass(), "eventWatchedDate", term158180);
        setIntField(term158069, term158069.getClass(), "friendCount", -5489488);
        setBooleanField(term158069, term158069.getClass(), "isMaimai", true);
        setField(term158069, term158069.getClass(), "firstGameId", "tmMslEelEQ");
        setField(term158069, term158069.getClass(), "firstRomVersion", "zQlbOXpNcl");
        setField(term158069, term158069.getClass(), "firstDataVersion", "iDjBOxOVMQ");
        setIntField(term158229, term158229.getClass(), "year", 2011);
        setShortField(term158229, term158229.getClass(), "month", (short) 11);
        setShortField(term158229, term158229.getClass(), "day", (short) 29);
        setField(term158228, term158228.getClass(), "date", term158229);
        setByteField(term158233, term158233.getClass(), "hour", (byte) 3);
        setByteField(term158233, term158233.getClass(), "minute", (byte) 43);
        setByteField(term158233, term158233.getClass(), "second", (byte) 43);
        setIntField(term158233, term158233.getClass(), "nano", 342290019);
        setField(term158228, term158228.getClass(), "time", term158233);
        setField(term158069, term158069.getClass(), "firstPlayDate", term158228);
        setField(term158069, term158069.getClass(), "lastGameId", "QSvmOZQTXd");
        setField(term158069, term158069.getClass(), "lastRomVersion", "vQLwJDUryB");
        setField(term158069, term158069.getClass(), "lastDataVersion", "JhCgwQaWUU");
        setIntField(term158275, term158275.getClass(), "year", 2013);
        setShortField(term158275, term158275.getClass(), "month", (short) 3);
        setShortField(term158275, term158275.getClass(), "day", (short) 13);
        setField(term158274, term158274.getClass(), "date", term158275);
        setByteField(term158279, term158279.getClass(), "hour", (byte) 9);
        setByteField(term158279, term158279.getClass(), "minute", (byte) 41);
        setByteField(term158279, term158279.getClass(), "second", (byte) 34);
        setIntField(term158279, term158279.getClass(), "nano", 118585758);
        setField(term158274, term158274.getClass(), "time", term158279);
        setField(term158069, term158069.getClass(), "lastPlayDate", term158274);
        setIntField(term158069, term158069.getClass(), "lastPlaceId", -1846449623);
        setField(term158069, term158069.getClass(), "lastPlaceName", "MbEifzcdun");
        setField(term158069, term158069.getClass(), "lastRegionId", "ZXcuwiDFkz");
        setField(term158069, term158069.getClass(), "lastRegionName", "OdQhbRFMKu");
        setField(term158069, term158069.getClass(), "lastAllNetId", "pwniyUkqxT");
        setField(term158069, term158069.getClass(), "lastClientId", "gtChMrVhZn");
        term158345 = new Integer(-1053745732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term158345;
        callMethod(klass, "setPlayerRating", argTypes, term158069, args);
    }

};


