package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_setLastClientId_1431802627120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73118;

    public UserData_setLastClientId_1431802627120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term73122 = new Long(3427570961451840069L);
        term73118 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term73120 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term73136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73141 = newInstance(Class.forName("java.time.LocalTime"));
        Object term73146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73151 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term73118, term73118.getClass(), "id", 2547799188192307646L);
        setLongField(term73120, term73120.getClass(), "id", -6223422928407204267L);
        setField(term73120, term73120.getClass(), "extId", term73122);
        setField(term73120, term73120.getClass(), "luid", "NJWFosJfXl");
        setIntField(term73137, term73137.getClass(), "year", 2021);
        setShortField(term73137, term73137.getClass(), "month", (short) 7);
        setShortField(term73137, term73137.getClass(), "day", (short) 2);
        setField(term73136, term73136.getClass(), "date", term73137);
        setByteField(term73141, term73141.getClass(), "hour", (byte) 21);
        setByteField(term73141, term73141.getClass(), "minute", (byte) 55);
        setByteField(term73141, term73141.getClass(), "second", (byte) 54);
        setIntField(term73141, term73141.getClass(), "nano", 731983440);
        setField(term73136, term73136.getClass(), "time", term73141);
        setField(term73120, term73120.getClass(), "registerTime", term73136);
        setIntField(term73147, term73147.getClass(), "year", 2022);
        setShortField(term73147, term73147.getClass(), "month", (short) 10);
        setShortField(term73147, term73147.getClass(), "day", (short) 14);
        setField(term73146, term73146.getClass(), "date", term73147);
        setByteField(term73151, term73151.getClass(), "hour", (byte) 7);
        setByteField(term73151, term73151.getClass(), "minute", (byte) 29);
        setByteField(term73151, term73151.getClass(), "second", (byte) 42);
        setIntField(term73151, term73151.getClass(), "nano", 962865996);
        setField(term73146, term73146.getClass(), "time", term73151);
        setField(term73120, term73120.getClass(), "accessTime", term73146);
        setField(term73118, term73118.getClass(), "card", term73120);
        setField(term73118, term73118.getClass(), "userName", "JraVClZLWB");
        setIntField(term73118, term73118.getClass(), "level", -619984116);
        setIntField(term73118, term73118.getClass(), "reincarnationNum", -468766084);
        setLongField(term73118, term73118.getClass(), "exp", 2173963419392699484L);
        setLongField(term73118, term73118.getClass(), "point", 7698059415513870721L);
        setLongField(term73118, term73118.getClass(), "totalPoint", -3622313282311155782L);
        setIntField(term73118, term73118.getClass(), "playCount", -1511205639);
        setIntField(term73118, term73118.getClass(), "jewelCount", 488730747);
        setIntField(term73118, term73118.getClass(), "totalJewelCount", 1410439573);
        setIntField(term73118, term73118.getClass(), "medalCount", -982945087);
        setIntField(term73118, term73118.getClass(), "playerRating", 171057010);
        setIntField(term73118, term73118.getClass(), "highestRating", -1039706080);
        setIntField(term73118, term73118.getClass(), "battlePoint", 1009893493);
        setIntField(term73118, term73118.getClass(), "bestBattlePoint", -1097846142);
        setIntField(term73118, term73118.getClass(), "overDamageBattlePoint", 1026272483);
        setBooleanField(term73118, term73118.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term73118, term73118.getClass(), "nameplateId", -48026838);
        setIntField(term73118, term73118.getClass(), "trophyId", 1557093855);
        setIntField(term73118, term73118.getClass(), "cardId", -445911899);
        setIntField(term73118, term73118.getClass(), "characterId", -1254075402);
        setIntField(term73118, term73118.getClass(), "characterVoiceNo", -1886407162);
        setIntField(term73118, term73118.getClass(), "tabSetting", -97996127);
        setIntField(term73118, term73118.getClass(), "tabSortSetting", 668350997);
        setIntField(term73118, term73118.getClass(), "cardCategorySetting", -1280690194);
        setIntField(term73118, term73118.getClass(), "cardSortSetting", -1825481062);
        setIntField(term73118, term73118.getClass(), "rivalScoreCategorySetting", 662456234);
        setIntField(term73118, term73118.getClass(), "playedTutorialBit", -1932565769);
        setIntField(term73118, term73118.getClass(), "firstTutorialCancelNum", 480924614);
        setLongField(term73118, term73118.getClass(), "sumTechHighScore", -4007892234713320168L);
        setLongField(term73118, term73118.getClass(), "sumTechBasicHighScore", -6673616791847296767L);
        setLongField(term73118, term73118.getClass(), "sumTechAdvancedHighScore", -2571747498538728579L);
        setLongField(term73118, term73118.getClass(), "sumTechExpertHighScore", 1167523958905554808L);
        setLongField(term73118, term73118.getClass(), "sumTechMasterHighScore", 5047458066598459178L);
        setLongField(term73118, term73118.getClass(), "sumTechLunaticHighScore", 703452043908964869L);
        setLongField(term73118, term73118.getClass(), "sumBattleHighScore", -652495003220214317L);
        setLongField(term73118, term73118.getClass(), "sumBattleBasicHighScore", 6336043600941119731L);
        setLongField(term73118, term73118.getClass(), "sumBattleAdvancedHighScore", 5597778474359417291L);
        setLongField(term73118, term73118.getClass(), "sumBattleExpertHighScore", -7785852591389112331L);
        setLongField(term73118, term73118.getClass(), "sumBattleMasterHighScore", -8920882081423821401L);
        setLongField(term73118, term73118.getClass(), "sumBattleLunaticHighScore", 6575164463340577898L);
        setField(term73118, term73118.getClass(), "eventWatchedDate", "PxscjEhxGk");
        setField(term73118, term73118.getClass(), "cmEventWatchedDate", "ePFnljQSHU");
        setField(term73118, term73118.getClass(), "firstGameId", "wedLWAuOOY");
        setField(term73118, term73118.getClass(), "firstRomVersion", "oZDNpnQlCv");
        setField(term73118, term73118.getClass(), "firstDataVersion", "NdPeQAHWKN");
        setField(term73118, term73118.getClass(), "firstPlayDate", "giGQTpcQuV");
        setField(term73118, term73118.getClass(), "lastGameId", "IWCccrYFQd");
        setField(term73118, term73118.getClass(), "lastRomVersion", "zpkdYKWkCa");
        setField(term73118, term73118.getClass(), "lastDataVersion", "mvOJAtEcWR");
        setField(term73118, term73118.getClass(), "compatibleCmVersion", "QybezBkmJu");
        setField(term73118, term73118.getClass(), "lastPlayDate", "uWIrREgpjs");
        setIntField(term73118, term73118.getClass(), "lastPlaceId", 1423620762);
        setField(term73118, term73118.getClass(), "lastPlaceName", "TmEdDFXkTZ");
        setIntField(term73118, term73118.getClass(), "lastRegionId", -182687795);
        setField(term73118, term73118.getClass(), "lastRegionName", "DjjdYbIhNY");
        setIntField(term73118, term73118.getClass(), "lastAllNetId", -1965076703);
        setField(term73118, term73118.getClass(), "lastClientId", "AGaeaoutjJ");
        setIntField(term73118, term73118.getClass(), "lastUsedDeckId", -1715006566);
        setIntField(term73118, term73118.getClass(), "lastPlayMusicLevel", 1190377243);
        setIntField(term73118, term73118.getClass(), "lastEmoneyBrand", -1013321277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oHWSUbpGiK";
        callMethod(klass, "setLastClientId", argTypes, term73118, args);
    }

};


