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
import java.lang.Boolean;

public class UserData_setMaimai_208008859585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165781;
     Object term166057;

    public UserData_setMaimai_208008859585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term165785 = new Long(-9147545274054597570L);
        term165781 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term165783 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term165799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165804 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165814 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165836 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165892 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165893 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165897 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165940 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165941 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165945 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165991 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term165781, term165781.getClass(), "id", 1150165300363165306L);
        setLongField(term165783, term165783.getClass(), "id", -7095519814518579268L);
        setField(term165783, term165783.getClass(), "extId", term165785);
        setField(term165783, term165783.getClass(), "luid", "aGkAdbRgHR");
        setIntField(term165800, term165800.getClass(), "year", 2021);
        setShortField(term165800, term165800.getClass(), "month", (short) 10);
        setShortField(term165800, term165800.getClass(), "day", (short) 29);
        setField(term165799, term165799.getClass(), "date", term165800);
        setByteField(term165804, term165804.getClass(), "hour", (byte) 17);
        setByteField(term165804, term165804.getClass(), "minute", (byte) 6);
        setByteField(term165804, term165804.getClass(), "second", (byte) 3);
        setIntField(term165804, term165804.getClass(), "nano", 193302732);
        setField(term165799, term165799.getClass(), "time", term165804);
        setField(term165783, term165783.getClass(), "registerTime", term165799);
        setIntField(term165810, term165810.getClass(), "year", 2021);
        setShortField(term165810, term165810.getClass(), "month", (short) 10);
        setShortField(term165810, term165810.getClass(), "day", (short) 20);
        setField(term165809, term165809.getClass(), "date", term165810);
        setByteField(term165814, term165814.getClass(), "hour", (byte) 19);
        setByteField(term165814, term165814.getClass(), "minute", (byte) 30);
        setByteField(term165814, term165814.getClass(), "second", (byte) 48);
        setIntField(term165814, term165814.getClass(), "nano", 478005313);
        setField(term165809, term165809.getClass(), "time", term165814);
        setField(term165783, term165783.getClass(), "accessTime", term165809);
        setField(term165781, term165781.getClass(), "card", term165783);
        setField(term165781, term165781.getClass(), "userName", "SFoAEuJBfh");
        setIntField(term165832, term165832.getClass(), "year", 2012);
        setShortField(term165832, term165832.getClass(), "month", (short) 5);
        setShortField(term165832, term165832.getClass(), "day", (short) 12);
        setField(term165831, term165831.getClass(), "date", term165832);
        setByteField(term165836, term165836.getClass(), "hour", (byte) 10);
        setByteField(term165836, term165836.getClass(), "minute", (byte) 39);
        setByteField(term165836, term165836.getClass(), "second", (byte) 38);
        setIntField(term165836, term165836.getClass(), "nano", 277821439);
        setField(term165831, term165831.getClass(), "time", term165836);
        setField(term165781, term165781.getClass(), "lastLoginDate", term165831);
        setBooleanField(term165781, term165781.getClass(), "isWebJoin", false);
        setField(term165781, term165781.getClass(), "webLimitDate", "zXNGAMtbCF");
        setIntField(term165781, term165781.getClass(), "level", -1849440649);
        setIntField(term165781, term165781.getClass(), "reincarnationNum", 215428761);
        setField(term165781, term165781.getClass(), "exp", "zlBxjMwVHV");
        setLongField(term165781, term165781.getClass(), "point", 6840349578265523330L);
        setLongField(term165781, term165781.getClass(), "totalPoint", -5498941518395349431L);
        setIntField(term165781, term165781.getClass(), "playCount", 196912819);
        setIntField(term165781, term165781.getClass(), "multiPlayCount", -2106416475);
        setIntField(term165781, term165781.getClass(), "multiWinCount", 1801549268);
        setIntField(term165781, term165781.getClass(), "requestResCount", -2109900781);
        setIntField(term165781, term165781.getClass(), "acceptResCount", 1524003020);
        setIntField(term165781, term165781.getClass(), "successResCount", 1117653130);
        setIntField(term165781, term165781.getClass(), "playerRating", -277091079);
        setIntField(term165781, term165781.getClass(), "highestRating", 421713339);
        setIntField(term165781, term165781.getClass(), "nameplateId", -998894691);
        setIntField(term165781, term165781.getClass(), "frameId", -334578847);
        setIntField(term165781, term165781.getClass(), "characterId", -1048098682);
        setIntField(term165781, term165781.getClass(), "trophyId", -1887879558);
        setIntField(term165781, term165781.getClass(), "playedTutorialBit", 333645088);
        setIntField(term165781, term165781.getClass(), "firstTutorialCancelNum", 154374104);
        setIntField(term165781, term165781.getClass(), "masterTutorialCancelNum", 852769097);
        setIntField(term165781, term165781.getClass(), "totalRepertoireCount", -1958995134);
        setIntField(term165781, term165781.getClass(), "totalMapNum", -2134940262);
        setLongField(term165781, term165781.getClass(), "totalHiScore", 1077896998632593692L);
        setLongField(term165781, term165781.getClass(), "totalBasicHighScore", -7560431579053662981L);
        setLongField(term165781, term165781.getClass(), "totalAdvancedHighScore", -2661716358705218539L);
        setLongField(term165781, term165781.getClass(), "totalExpertHighScore", -7527835270984650383L);
        setLongField(term165781, term165781.getClass(), "totalMasterHighScore", -8146697214903197715L);
        setIntField(term165893, term165893.getClass(), "year", 2025);
        setShortField(term165893, term165893.getClass(), "month", (short) 4);
        setShortField(term165893, term165893.getClass(), "day", (short) 11);
        setField(term165892, term165892.getClass(), "date", term165893);
        setByteField(term165897, term165897.getClass(), "hour", (byte) 0);
        setByteField(term165897, term165897.getClass(), "minute", (byte) 43);
        setByteField(term165897, term165897.getClass(), "second", (byte) 2);
        setIntField(term165897, term165897.getClass(), "nano", 374499981);
        setField(term165892, term165892.getClass(), "time", term165897);
        setField(term165781, term165781.getClass(), "eventWatchedDate", term165892);
        setIntField(term165781, term165781.getClass(), "friendCount", 1543999925);
        setBooleanField(term165781, term165781.getClass(), "isMaimai", true);
        setField(term165781, term165781.getClass(), "firstGameId", "rsBwYUCWbo");
        setField(term165781, term165781.getClass(), "firstRomVersion", "VFJXkkRgdr");
        setField(term165781, term165781.getClass(), "firstDataVersion", "LdsHLBFuxE");
        setIntField(term165941, term165941.getClass(), "year", 2022);
        setShortField(term165941, term165941.getClass(), "month", (short) 8);
        setShortField(term165941, term165941.getClass(), "day", (short) 12);
        setField(term165940, term165940.getClass(), "date", term165941);
        setByteField(term165945, term165945.getClass(), "hour", (byte) 18);
        setByteField(term165945, term165945.getClass(), "minute", (byte) 33);
        setByteField(term165945, term165945.getClass(), "second", (byte) 46);
        setIntField(term165945, term165945.getClass(), "nano", 686117734);
        setField(term165940, term165940.getClass(), "time", term165945);
        setField(term165781, term165781.getClass(), "firstPlayDate", term165940);
        setField(term165781, term165781.getClass(), "lastGameId", "WdDBobmXbb");
        setField(term165781, term165781.getClass(), "lastRomVersion", "LDbfuLlLaY");
        setField(term165781, term165781.getClass(), "lastDataVersion", "TdtRhjRbpE");
        setIntField(term165987, term165987.getClass(), "year", 2012);
        setShortField(term165987, term165987.getClass(), "month", (short) 2);
        setShortField(term165987, term165987.getClass(), "day", (short) 16);
        setField(term165986, term165986.getClass(), "date", term165987);
        setByteField(term165991, term165991.getClass(), "hour", (byte) 5);
        setByteField(term165991, term165991.getClass(), "minute", (byte) 9);
        setByteField(term165991, term165991.getClass(), "second", (byte) 54);
        setIntField(term165991, term165991.getClass(), "nano", 50292277);
        setField(term165986, term165986.getClass(), "time", term165991);
        setField(term165781, term165781.getClass(), "lastPlayDate", term165986);
        setIntField(term165781, term165781.getClass(), "lastPlaceId", -1587400954);
        setField(term165781, term165781.getClass(), "lastPlaceName", "QKqgZRJSAe");
        setField(term165781, term165781.getClass(), "lastRegionId", "NndiRNwUco");
        setField(term165781, term165781.getClass(), "lastRegionName", "ZdtqQPtFUL");
        setField(term165781, term165781.getClass(), "lastAllNetId", "PsuOGjzsiR");
        setField(term165781, term165781.getClass(), "lastClientId", "KMtZBUgxHg");
        term166057 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term166057;
        callMethod(klass, "setMaimai", argTypes, term165781, args);
    }

};


