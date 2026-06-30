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

public class UserMissionPoint_init_6313881810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6468;

    public UserMissionPoint_init_6313881810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6472 = new Long(-872011222785455006L);
        term6468 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term6470 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term6486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6491 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6496 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6497 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6501 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term6468, term6468.getClass(), "id", 5315236285592892506L);
        setLongField(term6470, term6470.getClass(), "id", -6969704322644192945L);
        setField(term6470, term6470.getClass(), "extId", term6472);
        setField(term6470, term6470.getClass(), "luid", "iIRsCSYqXH");
        setIntField(term6487, term6487.getClass(), "year", 2016);
        setShortField(term6487, term6487.getClass(), "month", (short) 6);
        setShortField(term6487, term6487.getClass(), "day", (short) 15);
        setField(term6486, term6486.getClass(), "date", term6487);
        setByteField(term6491, term6491.getClass(), "hour", (byte) 21);
        setByteField(term6491, term6491.getClass(), "minute", (byte) 23);
        setByteField(term6491, term6491.getClass(), "second", (byte) 23);
        setIntField(term6491, term6491.getClass(), "nano", 433372070);
        setField(term6486, term6486.getClass(), "time", term6491);
        setField(term6470, term6470.getClass(), "registerTime", term6486);
        setIntField(term6497, term6497.getClass(), "year", 2012);
        setShortField(term6497, term6497.getClass(), "month", (short) 8);
        setShortField(term6497, term6497.getClass(), "day", (short) 25);
        setField(term6496, term6496.getClass(), "date", term6497);
        setByteField(term6501, term6501.getClass(), "hour", (byte) 19);
        setByteField(term6501, term6501.getClass(), "minute", (byte) 49);
        setByteField(term6501, term6501.getClass(), "second", (byte) 8);
        setIntField(term6501, term6501.getClass(), "nano", 912685024);
        setField(term6496, term6496.getClass(), "time", term6501);
        setField(term6470, term6470.getClass(), "accessTime", term6496);
        setField(term6468, term6468.getClass(), "card", term6470);
        setField(term6468, term6468.getClass(), "userName", "nghfqDXyCG");
        setIntField(term6468, term6468.getClass(), "level", 1365087144);
        setIntField(term6468, term6468.getClass(), "reincarnationNum", -1537255112);
        setLongField(term6468, term6468.getClass(), "exp", -6685235643232255177L);
        setLongField(term6468, term6468.getClass(), "point", -5656664340499957324L);
        setLongField(term6468, term6468.getClass(), "totalPoint", -5460517064177800852L);
        setIntField(term6468, term6468.getClass(), "playCount", 934477462);
        setIntField(term6468, term6468.getClass(), "jewelCount", 4900410);
        setIntField(term6468, term6468.getClass(), "totalJewelCount", -1252345779);
        setIntField(term6468, term6468.getClass(), "medalCount", -2063365430);
        setIntField(term6468, term6468.getClass(), "playerRating", 812570053);
        setIntField(term6468, term6468.getClass(), "highestRating", -1488938905);
        setIntField(term6468, term6468.getClass(), "battlePoint", 1916544127);
        setIntField(term6468, term6468.getClass(), "bestBattlePoint", -1133405894);
        setIntField(term6468, term6468.getClass(), "overDamageBattlePoint", 1289741214);
        setBooleanField(term6468, term6468.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term6468, term6468.getClass(), "nameplateId", 243280944);
        setIntField(term6468, term6468.getClass(), "trophyId", -726681073);
        setIntField(term6468, term6468.getClass(), "cardId", -1724487863);
        setIntField(term6468, term6468.getClass(), "characterId", -128490829);
        setIntField(term6468, term6468.getClass(), "characterVoiceNo", 202214133);
        setIntField(term6468, term6468.getClass(), "tabSetting", 1543091617);
        setIntField(term6468, term6468.getClass(), "tabSortSetting", -763166094);
        setIntField(term6468, term6468.getClass(), "cardCategorySetting", -222941705);
        setIntField(term6468, term6468.getClass(), "cardSortSetting", 291864719);
        setIntField(term6468, term6468.getClass(), "rivalScoreCategorySetting", -1549607466);
        setIntField(term6468, term6468.getClass(), "playedTutorialBit", 853609788);
        setIntField(term6468, term6468.getClass(), "firstTutorialCancelNum", -197820800);
        setLongField(term6468, term6468.getClass(), "sumTechHighScore", -5242567610844514867L);
        setLongField(term6468, term6468.getClass(), "sumTechBasicHighScore", -2951854704066477061L);
        setLongField(term6468, term6468.getClass(), "sumTechAdvancedHighScore", 174253963298276221L);
        setLongField(term6468, term6468.getClass(), "sumTechExpertHighScore", 3713624957161771816L);
        setLongField(term6468, term6468.getClass(), "sumTechMasterHighScore", 6130232388739280211L);
        setLongField(term6468, term6468.getClass(), "sumTechLunaticHighScore", 3423965054378869855L);
        setLongField(term6468, term6468.getClass(), "sumBattleHighScore", -593735869267672817L);
        setLongField(term6468, term6468.getClass(), "sumBattleBasicHighScore", 6041374912351843923L);
        setLongField(term6468, term6468.getClass(), "sumBattleAdvancedHighScore", 2535970782317488741L);
        setLongField(term6468, term6468.getClass(), "sumBattleExpertHighScore", -5258945362776941718L);
        setLongField(term6468, term6468.getClass(), "sumBattleMasterHighScore", 24067105862153728L);
        setLongField(term6468, term6468.getClass(), "sumBattleLunaticHighScore", -8477368071089201577L);
        setField(term6468, term6468.getClass(), "eventWatchedDate", "WBAOTqErtm");
        setField(term6468, term6468.getClass(), "cmEventWatchedDate", "PqtVXXZMqK");
        setField(term6468, term6468.getClass(), "firstGameId", "rYbtIDVdnd");
        setField(term6468, term6468.getClass(), "firstRomVersion", "UKAReurpHG");
        setField(term6468, term6468.getClass(), "firstDataVersion", "WVRMUmrljA");
        setField(term6468, term6468.getClass(), "firstPlayDate", "NTlKJDDWlk");
        setField(term6468, term6468.getClass(), "lastGameId", "vOuMEpOQAg");
        setField(term6468, term6468.getClass(), "lastRomVersion", "SIODFGaQhr");
        setField(term6468, term6468.getClass(), "lastDataVersion", "qYzsiuXOgS");
        setField(term6468, term6468.getClass(), "compatibleCmVersion", "bxrCBbrrct");
        setField(term6468, term6468.getClass(), "lastPlayDate", "CKWpJaaaxX");
        setIntField(term6468, term6468.getClass(), "lastPlaceId", 723812297);
        setField(term6468, term6468.getClass(), "lastPlaceName", "UBRmXJmfrt");
        setIntField(term6468, term6468.getClass(), "lastRegionId", 1639448749);
        setField(term6468, term6468.getClass(), "lastRegionName", "WZzvmIHhzZ");
        setIntField(term6468, term6468.getClass(), "lastAllNetId", 873659088);
        setField(term6468, term6468.getClass(), "lastClientId", "doQLHkjpNm");
        setIntField(term6468, term6468.getClass(), "lastUsedDeckId", -975748721);
        setIntField(term6468, term6468.getClass(), "lastPlayMusicLevel", 433248783);
        setIntField(term6468, term6468.getClass(), "lastEmoneyBrand", -507944154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term6468;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


