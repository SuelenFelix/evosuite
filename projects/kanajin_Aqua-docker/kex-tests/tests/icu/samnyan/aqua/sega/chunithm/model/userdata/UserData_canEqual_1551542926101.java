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

public class UserData_canEqual_1551542926101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172864;
     Object term173140;

    public UserData_canEqual_1551542926101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term172868 = new Long(8765880103547975810L);
        term172864 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term172866 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term172882 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172883 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172887 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172892 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172893 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172897 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172914 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172915 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172919 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172975 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172976 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172980 = newInstance(Class.forName("java.time.LocalTime"));
        Object term173023 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173028 = newInstance(Class.forName("java.time.LocalTime"));
        Object term173069 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173070 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173074 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term172864, term172864.getClass(), "id", 3017351470610010745L);
        setLongField(term172866, term172866.getClass(), "id", -8471313227858030061L);
        setField(term172866, term172866.getClass(), "extId", term172868);
        setField(term172866, term172866.getClass(), "luid", "xcAalPvMas");
        setIntField(term172883, term172883.getClass(), "year", 2018);
        setShortField(term172883, term172883.getClass(), "month", (short) 7);
        setShortField(term172883, term172883.getClass(), "day", (short) 20);
        setField(term172882, term172882.getClass(), "date", term172883);
        setByteField(term172887, term172887.getClass(), "hour", (byte) 4);
        setByteField(term172887, term172887.getClass(), "minute", (byte) 13);
        setByteField(term172887, term172887.getClass(), "second", (byte) 30);
        setIntField(term172887, term172887.getClass(), "nano", 91986804);
        setField(term172882, term172882.getClass(), "time", term172887);
        setField(term172866, term172866.getClass(), "registerTime", term172882);
        setIntField(term172893, term172893.getClass(), "year", 2024);
        setShortField(term172893, term172893.getClass(), "month", (short) 1);
        setShortField(term172893, term172893.getClass(), "day", (short) 15);
        setField(term172892, term172892.getClass(), "date", term172893);
        setByteField(term172897, term172897.getClass(), "hour", (byte) 6);
        setByteField(term172897, term172897.getClass(), "minute", (byte) 11);
        setByteField(term172897, term172897.getClass(), "second", (byte) 48);
        setIntField(term172897, term172897.getClass(), "nano", 262205359);
        setField(term172892, term172892.getClass(), "time", term172897);
        setField(term172866, term172866.getClass(), "accessTime", term172892);
        setField(term172864, term172864.getClass(), "card", term172866);
        setField(term172864, term172864.getClass(), "userName", "CUcmZFIqJn");
        setIntField(term172915, term172915.getClass(), "year", 2014);
        setShortField(term172915, term172915.getClass(), "month", (short) 9);
        setShortField(term172915, term172915.getClass(), "day", (short) 1);
        setField(term172914, term172914.getClass(), "date", term172915);
        setByteField(term172919, term172919.getClass(), "hour", (byte) 1);
        setByteField(term172919, term172919.getClass(), "minute", (byte) 13);
        setByteField(term172919, term172919.getClass(), "second", (byte) 47);
        setIntField(term172919, term172919.getClass(), "nano", 740898232);
        setField(term172914, term172914.getClass(), "time", term172919);
        setField(term172864, term172864.getClass(), "lastLoginDate", term172914);
        setBooleanField(term172864, term172864.getClass(), "isWebJoin", false);
        setField(term172864, term172864.getClass(), "webLimitDate", "jZSTuVeJwm");
        setIntField(term172864, term172864.getClass(), "level", -1898771379);
        setIntField(term172864, term172864.getClass(), "reincarnationNum", -1950750332);
        setField(term172864, term172864.getClass(), "exp", "sZtJeHgDoS");
        setLongField(term172864, term172864.getClass(), "point", -8456017519174078137L);
        setLongField(term172864, term172864.getClass(), "totalPoint", -361646163347941624L);
        setIntField(term172864, term172864.getClass(), "playCount", 98744131);
        setIntField(term172864, term172864.getClass(), "multiPlayCount", 1076913386);
        setIntField(term172864, term172864.getClass(), "multiWinCount", -1266016022);
        setIntField(term172864, term172864.getClass(), "requestResCount", -1417549926);
        setIntField(term172864, term172864.getClass(), "acceptResCount", -1109645729);
        setIntField(term172864, term172864.getClass(), "successResCount", -137499193);
        setIntField(term172864, term172864.getClass(), "playerRating", 1206373587);
        setIntField(term172864, term172864.getClass(), "highestRating", 613409117);
        setIntField(term172864, term172864.getClass(), "nameplateId", 449106222);
        setIntField(term172864, term172864.getClass(), "frameId", -2010754765);
        setIntField(term172864, term172864.getClass(), "characterId", -368905928);
        setIntField(term172864, term172864.getClass(), "trophyId", -324230177);
        setIntField(term172864, term172864.getClass(), "playedTutorialBit", 1907785292);
        setIntField(term172864, term172864.getClass(), "firstTutorialCancelNum", 719178137);
        setIntField(term172864, term172864.getClass(), "masterTutorialCancelNum", 1019714790);
        setIntField(term172864, term172864.getClass(), "totalRepertoireCount", -939662649);
        setIntField(term172864, term172864.getClass(), "totalMapNum", 104511876);
        setLongField(term172864, term172864.getClass(), "totalHiScore", -4370032684615634699L);
        setLongField(term172864, term172864.getClass(), "totalBasicHighScore", -7192603380963907943L);
        setLongField(term172864, term172864.getClass(), "totalAdvancedHighScore", 1063278168782243311L);
        setLongField(term172864, term172864.getClass(), "totalExpertHighScore", -393164980593030950L);
        setLongField(term172864, term172864.getClass(), "totalMasterHighScore", -9067010856580120712L);
        setIntField(term172976, term172976.getClass(), "year", 2014);
        setShortField(term172976, term172976.getClass(), "month", (short) 8);
        setShortField(term172976, term172976.getClass(), "day", (short) 6);
        setField(term172975, term172975.getClass(), "date", term172976);
        setByteField(term172980, term172980.getClass(), "hour", (byte) 4);
        setByteField(term172980, term172980.getClass(), "minute", (byte) 32);
        setByteField(term172980, term172980.getClass(), "second", (byte) 8);
        setIntField(term172980, term172980.getClass(), "nano", 707693038);
        setField(term172975, term172975.getClass(), "time", term172980);
        setField(term172864, term172864.getClass(), "eventWatchedDate", term172975);
        setIntField(term172864, term172864.getClass(), "friendCount", 1301097770);
        setBooleanField(term172864, term172864.getClass(), "isMaimai", false);
        setField(term172864, term172864.getClass(), "firstGameId", "PNjoWpTIKl");
        setField(term172864, term172864.getClass(), "firstRomVersion", "czpPLQIQFj");
        setField(term172864, term172864.getClass(), "firstDataVersion", "FLMgyDzlCF");
        setIntField(term173024, term173024.getClass(), "year", 2028);
        setShortField(term173024, term173024.getClass(), "month", (short) 7);
        setShortField(term173024, term173024.getClass(), "day", (short) 16);
        setField(term173023, term173023.getClass(), "date", term173024);
        setByteField(term173028, term173028.getClass(), "hour", (byte) 1);
        setByteField(term173028, term173028.getClass(), "minute", (byte) 29);
        setByteField(term173028, term173028.getClass(), "second", (byte) 56);
        setIntField(term173028, term173028.getClass(), "nano", 212081052);
        setField(term173023, term173023.getClass(), "time", term173028);
        setField(term172864, term172864.getClass(), "firstPlayDate", term173023);
        setField(term172864, term172864.getClass(), "lastGameId", "ZwHgGCiCeV");
        setField(term172864, term172864.getClass(), "lastRomVersion", "QbPwthOQnr");
        setField(term172864, term172864.getClass(), "lastDataVersion", "JIQQIDNpGz");
        setIntField(term173070, term173070.getClass(), "year", 2016);
        setShortField(term173070, term173070.getClass(), "month", (short) 10);
        setShortField(term173070, term173070.getClass(), "day", (short) 1);
        setField(term173069, term173069.getClass(), "date", term173070);
        setByteField(term173074, term173074.getClass(), "hour", (byte) 8);
        setByteField(term173074, term173074.getClass(), "minute", (byte) 36);
        setByteField(term173074, term173074.getClass(), "second", (byte) 53);
        setIntField(term173074, term173074.getClass(), "nano", 143889825);
        setField(term173069, term173069.getClass(), "time", term173074);
        setField(term172864, term172864.getClass(), "lastPlayDate", term173069);
        setIntField(term172864, term172864.getClass(), "lastPlaceId", -844791112);
        setField(term172864, term172864.getClass(), "lastPlaceName", "lAvGKEIUzY");
        setField(term172864, term172864.getClass(), "lastRegionId", "DzpjyfzuLi");
        setField(term172864, term172864.getClass(), "lastRegionName", "HaqsDSnFiE");
        setField(term172864, term172864.getClass(), "lastAllNetId", "mgkQBUvphv");
        setField(term172864, term172864.getClass(), "lastClientId", "dJlSrWNDYm");
        term173140 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term173140;
        callMethod(klass, "canEqual", argTypes, term172864, args);
    }

};


