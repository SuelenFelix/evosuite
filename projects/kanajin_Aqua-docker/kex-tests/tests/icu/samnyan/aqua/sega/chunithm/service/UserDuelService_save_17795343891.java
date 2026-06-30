package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserDuelService_save_17795343891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5148;

    public UserDuelService_save_17795343891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5154 = new Long(5127676408959197577L);
        term5148 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term5150 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term5152 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term5168 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5169 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5173 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5178 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5179 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5183 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5200 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5201 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5205 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5266 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5314 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5356 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5360 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5430 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5431 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5435 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5148, term5148.getClass(), "id", 3452833434644634217L);
        setLongField(term5150, term5150.getClass(), "id", -8603648071751666348L);
        setLongField(term5152, term5152.getClass(), "id", -7884871963229073324L);
        setField(term5152, term5152.getClass(), "extId", term5154);
        setField(term5152, term5152.getClass(), "luid", "UKAReurpHG");
        setIntField(term5169, term5169.getClass(), "year", 2022);
        setShortField(term5169, term5169.getClass(), "month", (short) 11);
        setShortField(term5169, term5169.getClass(), "day", (short) 5);
        setField(term5168, term5168.getClass(), "date", term5169);
        setByteField(term5173, term5173.getClass(), "hour", (byte) 0);
        setByteField(term5173, term5173.getClass(), "minute", (byte) 51);
        setByteField(term5173, term5173.getClass(), "second", (byte) 23);
        setIntField(term5173, term5173.getClass(), "nano", 1140962);
        setField(term5168, term5168.getClass(), "time", term5173);
        setField(term5152, term5152.getClass(), "registerTime", term5168);
        setIntField(term5179, term5179.getClass(), "year", 2020);
        setShortField(term5179, term5179.getClass(), "month", (short) 5);
        setShortField(term5179, term5179.getClass(), "day", (short) 24);
        setField(term5178, term5178.getClass(), "date", term5179);
        setByteField(term5183, term5183.getClass(), "hour", (byte) 2);
        setByteField(term5183, term5183.getClass(), "minute", (byte) 9);
        setByteField(term5183, term5183.getClass(), "second", (byte) 52);
        setIntField(term5183, term5183.getClass(), "nano", 653329393);
        setField(term5178, term5178.getClass(), "time", term5183);
        setField(term5152, term5152.getClass(), "accessTime", term5178);
        setField(term5150, term5150.getClass(), "card", term5152);
        setField(term5150, term5150.getClass(), "userName", "WVRMUmrljA");
        setIntField(term5201, term5201.getClass(), "year", 2024);
        setShortField(term5201, term5201.getClass(), "month", (short) 9);
        setShortField(term5201, term5201.getClass(), "day", (short) 22);
        setField(term5200, term5200.getClass(), "date", term5201);
        setByteField(term5205, term5205.getClass(), "hour", (byte) 0);
        setByteField(term5205, term5205.getClass(), "minute", (byte) 11);
        setByteField(term5205, term5205.getClass(), "second", (byte) 7);
        setIntField(term5205, term5205.getClass(), "nano", 56643259);
        setField(term5200, term5200.getClass(), "time", term5205);
        setField(term5150, term5150.getClass(), "lastLoginDate", term5200);
        setBooleanField(term5150, term5150.getClass(), "isWebJoin", false);
        setField(term5150, term5150.getClass(), "webLimitDate", "NTlKJDDWlk");
        setIntField(term5150, term5150.getClass(), "level", -1702055571);
        setIntField(term5150, term5150.getClass(), "reincarnationNum", -944542900);
        setField(term5150, term5150.getClass(), "exp", "vOuMEpOQAg");
        setLongField(term5150, term5150.getClass(), "point", -8649738738252714180L);
        setLongField(term5150, term5150.getClass(), "totalPoint", -7278883608542636188L);
        setIntField(term5150, term5150.getClass(), "playCount", 2063762142);
        setIntField(term5150, term5150.getClass(), "multiPlayCount", 1658391716);
        setIntField(term5150, term5150.getClass(), "multiWinCount", 2143282300);
        setIntField(term5150, term5150.getClass(), "requestResCount", 1137624258);
        setIntField(term5150, term5150.getClass(), "acceptResCount", 977862393);
        setIntField(term5150, term5150.getClass(), "successResCount", 301401782);
        setIntField(term5150, term5150.getClass(), "playerRating", 1988605357);
        setIntField(term5150, term5150.getClass(), "highestRating", 808203320);
        setIntField(term5150, term5150.getClass(), "nameplateId", -544382127);
        setIntField(term5150, term5150.getClass(), "frameId", -1830198043);
        setIntField(term5150, term5150.getClass(), "characterId", -439048495);
        setIntField(term5150, term5150.getClass(), "trophyId", -1849105286);
        setIntField(term5150, term5150.getClass(), "playedTutorialBit", 1334483645);
        setIntField(term5150, term5150.getClass(), "firstTutorialCancelNum", 917513193);
        setIntField(term5150, term5150.getClass(), "masterTutorialCancelNum", 787278105);
        setIntField(term5150, term5150.getClass(), "totalRepertoireCount", -2063843486);
        setIntField(term5150, term5150.getClass(), "totalMapNum", 833762980);
        setLongField(term5150, term5150.getClass(), "totalHiScore", -1539859611880912454L);
        setLongField(term5150, term5150.getClass(), "totalBasicHighScore", 4100236067313034103L);
        setLongField(term5150, term5150.getClass(), "totalAdvancedHighScore", 1195529027276497124L);
        setLongField(term5150, term5150.getClass(), "totalExpertHighScore", -2783999800714825789L);
        setLongField(term5150, term5150.getClass(), "totalMasterHighScore", 4266570509071948633L);
        setIntField(term5262, term5262.getClass(), "year", 2021);
        setShortField(term5262, term5262.getClass(), "month", (short) 12);
        setShortField(term5262, term5262.getClass(), "day", (short) 21);
        setField(term5261, term5261.getClass(), "date", term5262);
        setByteField(term5266, term5266.getClass(), "hour", (byte) 12);
        setByteField(term5266, term5266.getClass(), "minute", (byte) 59);
        setByteField(term5266, term5266.getClass(), "second", (byte) 52);
        setIntField(term5266, term5266.getClass(), "nano", 47081639);
        setField(term5261, term5261.getClass(), "time", term5266);
        setField(term5150, term5150.getClass(), "eventWatchedDate", term5261);
        setIntField(term5150, term5150.getClass(), "friendCount", 320711637);
        setBooleanField(term5150, term5150.getClass(), "isMaimai", true);
        setField(term5150, term5150.getClass(), "firstGameId", "SIODFGaQhr");
        setField(term5150, term5150.getClass(), "firstRomVersion", "qYzsiuXOgS");
        setField(term5150, term5150.getClass(), "firstDataVersion", "bxrCBbrrct");
        setIntField(term5310, term5310.getClass(), "year", 2026);
        setShortField(term5310, term5310.getClass(), "month", (short) 6);
        setShortField(term5310, term5310.getClass(), "day", (short) 13);
        setField(term5309, term5309.getClass(), "date", term5310);
        setByteField(term5314, term5314.getClass(), "hour", (byte) 19);
        setByteField(term5314, term5314.getClass(), "minute", (byte) 23);
        setByteField(term5314, term5314.getClass(), "second", (byte) 46);
        setIntField(term5314, term5314.getClass(), "nano", 67955056);
        setField(term5309, term5309.getClass(), "time", term5314);
        setField(term5150, term5150.getClass(), "firstPlayDate", term5309);
        setField(term5150, term5150.getClass(), "lastGameId", "CKWpJaaaxX");
        setField(term5150, term5150.getClass(), "lastRomVersion", "UBRmXJmfrt");
        setField(term5150, term5150.getClass(), "lastDataVersion", "WZzvmIHhzZ");
        setIntField(term5356, term5356.getClass(), "year", 2013);
        setShortField(term5356, term5356.getClass(), "month", (short) 12);
        setShortField(term5356, term5356.getClass(), "day", (short) 23);
        setField(term5355, term5355.getClass(), "date", term5356);
        setByteField(term5360, term5360.getClass(), "hour", (byte) 1);
        setByteField(term5360, term5360.getClass(), "minute", (byte) 0);
        setByteField(term5360, term5360.getClass(), "second", (byte) 32);
        setIntField(term5360, term5360.getClass(), "nano", 168525686);
        setField(term5355, term5355.getClass(), "time", term5360);
        setField(term5150, term5150.getClass(), "lastPlayDate", term5355);
        setIntField(term5150, term5150.getClass(), "lastPlaceId", 1241164745);
        setField(term5150, term5150.getClass(), "lastPlaceName", "doQLHkjpNm");
        setField(term5150, term5150.getClass(), "lastRegionId", "lCyLIcSuom");
        setField(term5150, term5150.getClass(), "lastRegionName", "CGOpQSZZwI");
        setField(term5150, term5150.getClass(), "lastAllNetId", "ypEdrstygY");
        setField(term5150, term5150.getClass(), "lastClientId", "sNQFlATEeQ");
        setField(term5148, term5148.getClass(), "user", term5150);
        setIntField(term5148, term5148.getClass(), "duelId", 1723148410);
        setIntField(term5148, term5148.getClass(), "progress", -920797484);
        setIntField(term5148, term5148.getClass(), "point", -1631697577);
        setBooleanField(term5148, term5148.getClass(), "isClear", true);
        setIntField(term5431, term5431.getClass(), "year", 2014);
        setShortField(term5431, term5431.getClass(), "month", (short) 1);
        setShortField(term5431, term5431.getClass(), "day", (short) 26);
        setField(term5430, term5430.getClass(), "date", term5431);
        setByteField(term5435, term5435.getClass(), "hour", (byte) 3);
        setByteField(term5435, term5435.getClass(), "minute", (byte) 31);
        setByteField(term5435, term5435.getClass(), "second", (byte) 56);
        setIntField(term5435, term5435.getClass(), "nano", 100873602);
        setField(term5430, term5430.getClass(), "time", term5435);
        setField(term5148, term5148.getClass(), "lastPlayDate", term5430);
        setIntField(term5148, term5148.getClass(), "param1", 765731371);
        setIntField(term5148, term5148.getClass(), "param2", -1703035419);
        setIntField(term5148, term5148.getClass(), "param3", 765766290);
        setIntField(term5148, term5148.getClass(), "param4", -1284825282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserDuelService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Object[] args = new Object[1];
        args[0] = term5148;
        callMethod(klass, "save", argTypes, null, args);
    }

};


