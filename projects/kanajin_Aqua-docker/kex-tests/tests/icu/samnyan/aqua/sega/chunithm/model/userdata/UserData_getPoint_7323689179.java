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

public class UserData_getPoint_7323689179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133215;

    public UserData_getPoint_7323689179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term133219 = new Long(8000844860910174690L);
        term133215 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term133217 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term133233 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133234 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133238 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133243 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133244 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133248 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133270 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133331 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133379 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133420 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133421 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133425 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term133215, term133215.getClass(), "id", 1627503725336812835L);
        setLongField(term133217, term133217.getClass(), "id", -6399585202609591962L);
        setField(term133217, term133217.getClass(), "extId", term133219);
        setField(term133217, term133217.getClass(), "luid", "ESnYpdjELS");
        setIntField(term133234, term133234.getClass(), "year", 2020);
        setShortField(term133234, term133234.getClass(), "month", (short) 12);
        setShortField(term133234, term133234.getClass(), "day", (short) 3);
        setField(term133233, term133233.getClass(), "date", term133234);
        setByteField(term133238, term133238.getClass(), "hour", (byte) 1);
        setByteField(term133238, term133238.getClass(), "minute", (byte) 33);
        setByteField(term133238, term133238.getClass(), "second", (byte) 21);
        setIntField(term133238, term133238.getClass(), "nano", 954639334);
        setField(term133233, term133233.getClass(), "time", term133238);
        setField(term133217, term133217.getClass(), "registerTime", term133233);
        setIntField(term133244, term133244.getClass(), "year", 2015);
        setShortField(term133244, term133244.getClass(), "month", (short) 1);
        setShortField(term133244, term133244.getClass(), "day", (short) 25);
        setField(term133243, term133243.getClass(), "date", term133244);
        setByteField(term133248, term133248.getClass(), "hour", (byte) 18);
        setByteField(term133248, term133248.getClass(), "minute", (byte) 44);
        setByteField(term133248, term133248.getClass(), "second", (byte) 8);
        setIntField(term133248, term133248.getClass(), "nano", 166791078);
        setField(term133243, term133243.getClass(), "time", term133248);
        setField(term133217, term133217.getClass(), "accessTime", term133243);
        setField(term133215, term133215.getClass(), "card", term133217);
        setField(term133215, term133215.getClass(), "userName", "IsOpDBwqZb");
        setIntField(term133266, term133266.getClass(), "year", 2012);
        setShortField(term133266, term133266.getClass(), "month", (short) 8);
        setShortField(term133266, term133266.getClass(), "day", (short) 14);
        setField(term133265, term133265.getClass(), "date", term133266);
        setByteField(term133270, term133270.getClass(), "hour", (byte) 23);
        setByteField(term133270, term133270.getClass(), "minute", (byte) 6);
        setByteField(term133270, term133270.getClass(), "second", (byte) 21);
        setIntField(term133270, term133270.getClass(), "nano", 990920610);
        setField(term133265, term133265.getClass(), "time", term133270);
        setField(term133215, term133215.getClass(), "lastLoginDate", term133265);
        setBooleanField(term133215, term133215.getClass(), "isWebJoin", true);
        setField(term133215, term133215.getClass(), "webLimitDate", "GBSKSryDNr");
        setIntField(term133215, term133215.getClass(), "level", 837208909);
        setIntField(term133215, term133215.getClass(), "reincarnationNum", 1016033285);
        setField(term133215, term133215.getClass(), "exp", "lewYJfdwbu");
        setLongField(term133215, term133215.getClass(), "point", -7548100222716923684L);
        setLongField(term133215, term133215.getClass(), "totalPoint", -862074792274450196L);
        setIntField(term133215, term133215.getClass(), "playCount", -1981879284);
        setIntField(term133215, term133215.getClass(), "multiPlayCount", -1922383305);
        setIntField(term133215, term133215.getClass(), "multiWinCount", -1515149854);
        setIntField(term133215, term133215.getClass(), "requestResCount", 2127902475);
        setIntField(term133215, term133215.getClass(), "acceptResCount", -974929860);
        setIntField(term133215, term133215.getClass(), "successResCount", -229722367);
        setIntField(term133215, term133215.getClass(), "playerRating", 46745820);
        setIntField(term133215, term133215.getClass(), "highestRating", 521784908);
        setIntField(term133215, term133215.getClass(), "nameplateId", -716648067);
        setIntField(term133215, term133215.getClass(), "frameId", 100573346);
        setIntField(term133215, term133215.getClass(), "characterId", 72576894);
        setIntField(term133215, term133215.getClass(), "trophyId", 1802709528);
        setIntField(term133215, term133215.getClass(), "playedTutorialBit", 625411236);
        setIntField(term133215, term133215.getClass(), "firstTutorialCancelNum", 1278363908);
        setIntField(term133215, term133215.getClass(), "masterTutorialCancelNum", 1679478889);
        setIntField(term133215, term133215.getClass(), "totalRepertoireCount", 1711128633);
        setIntField(term133215, term133215.getClass(), "totalMapNum", 558898048);
        setLongField(term133215, term133215.getClass(), "totalHiScore", 1942144735337962969L);
        setLongField(term133215, term133215.getClass(), "totalBasicHighScore", -4344753984954632336L);
        setLongField(term133215, term133215.getClass(), "totalAdvancedHighScore", 4631827794948700273L);
        setLongField(term133215, term133215.getClass(), "totalExpertHighScore", 6813589793299718428L);
        setLongField(term133215, term133215.getClass(), "totalMasterHighScore", 6539225967589742494L);
        setIntField(term133327, term133327.getClass(), "year", 2019);
        setShortField(term133327, term133327.getClass(), "month", (short) 7);
        setShortField(term133327, term133327.getClass(), "day", (short) 18);
        setField(term133326, term133326.getClass(), "date", term133327);
        setByteField(term133331, term133331.getClass(), "hour", (byte) 6);
        setByteField(term133331, term133331.getClass(), "minute", (byte) 12);
        setByteField(term133331, term133331.getClass(), "second", (byte) 52);
        setIntField(term133331, term133331.getClass(), "nano", 355715571);
        setField(term133326, term133326.getClass(), "time", term133331);
        setField(term133215, term133215.getClass(), "eventWatchedDate", term133326);
        setIntField(term133215, term133215.getClass(), "friendCount", -1751947747);
        setBooleanField(term133215, term133215.getClass(), "isMaimai", true);
        setField(term133215, term133215.getClass(), "firstGameId", "wmCdnKXFIV");
        setField(term133215, term133215.getClass(), "firstRomVersion", "OQFYTZSsmT");
        setField(term133215, term133215.getClass(), "firstDataVersion", "sERwhJnfhH");
        setIntField(term133375, term133375.getClass(), "year", 2018);
        setShortField(term133375, term133375.getClass(), "month", (short) 3);
        setShortField(term133375, term133375.getClass(), "day", (short) 18);
        setField(term133374, term133374.getClass(), "date", term133375);
        setByteField(term133379, term133379.getClass(), "hour", (byte) 9);
        setByteField(term133379, term133379.getClass(), "minute", (byte) 6);
        setByteField(term133379, term133379.getClass(), "second", (byte) 2);
        setIntField(term133379, term133379.getClass(), "nano", 689374698);
        setField(term133374, term133374.getClass(), "time", term133379);
        setField(term133215, term133215.getClass(), "firstPlayDate", term133374);
        setField(term133215, term133215.getClass(), "lastGameId", "ttMftcuYTC");
        setField(term133215, term133215.getClass(), "lastRomVersion", "ktSwbNnkjp");
        setField(term133215, term133215.getClass(), "lastDataVersion", "GnPQSLhuqc");
        setIntField(term133421, term133421.getClass(), "year", 2022);
        setShortField(term133421, term133421.getClass(), "month", (short) 4);
        setShortField(term133421, term133421.getClass(), "day", (short) 23);
        setField(term133420, term133420.getClass(), "date", term133421);
        setByteField(term133425, term133425.getClass(), "hour", (byte) 7);
        setByteField(term133425, term133425.getClass(), "minute", (byte) 9);
        setByteField(term133425, term133425.getClass(), "second", (byte) 27);
        setIntField(term133425, term133425.getClass(), "nano", 843142535);
        setField(term133420, term133420.getClass(), "time", term133425);
        setField(term133215, term133215.getClass(), "lastPlayDate", term133420);
        setIntField(term133215, term133215.getClass(), "lastPlaceId", 750226278);
        setField(term133215, term133215.getClass(), "lastPlaceName", "mfxNrcSOVD");
        setField(term133215, term133215.getClass(), "lastRegionId", "jrsTEswExz");
        setField(term133215, term133215.getClass(), "lastRegionName", "ZQJeRspiaW");
        setField(term133215, term133215.getClass(), "lastAllNetId", "ZPHvVTleEx");
        setField(term133215, term133215.getClass(), "lastClientId", "HTaevTdmSx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term133215, args);
    }

};


