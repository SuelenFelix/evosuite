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
import java.lang.Integer;

public class UserData_setPlayerRating_152616662074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53308;
     Object term53571;

    public UserData_setPlayerRating_152616662074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53312 = new Long(6273754186658578034L);
        term53308 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term53310 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term53326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53331 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53341 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term53308, term53308.getClass(), "id", -8433455023051048992L);
        setLongField(term53310, term53310.getClass(), "id", 2135057416650245432L);
        setField(term53310, term53310.getClass(), "extId", term53312);
        setField(term53310, term53310.getClass(), "luid", "SUDRrjpChc");
        setIntField(term53327, term53327.getClass(), "year", 2020);
        setShortField(term53327, term53327.getClass(), "month", (short) 7);
        setShortField(term53327, term53327.getClass(), "day", (short) 24);
        setField(term53326, term53326.getClass(), "date", term53327);
        setByteField(term53331, term53331.getClass(), "hour", (byte) 22);
        setByteField(term53331, term53331.getClass(), "minute", (byte) 16);
        setByteField(term53331, term53331.getClass(), "second", (byte) 59);
        setIntField(term53331, term53331.getClass(), "nano", 588569833);
        setField(term53326, term53326.getClass(), "time", term53331);
        setField(term53310, term53310.getClass(), "registerTime", term53326);
        setIntField(term53337, term53337.getClass(), "year", 2019);
        setShortField(term53337, term53337.getClass(), "month", (short) 8);
        setShortField(term53337, term53337.getClass(), "day", (short) 6);
        setField(term53336, term53336.getClass(), "date", term53337);
        setByteField(term53341, term53341.getClass(), "hour", (byte) 5);
        setByteField(term53341, term53341.getClass(), "minute", (byte) 32);
        setByteField(term53341, term53341.getClass(), "second", (byte) 47);
        setIntField(term53341, term53341.getClass(), "nano", 73220317);
        setField(term53336, term53336.getClass(), "time", term53341);
        setField(term53310, term53310.getClass(), "accessTime", term53336);
        setField(term53308, term53308.getClass(), "card", term53310);
        setField(term53308, term53308.getClass(), "userName", "pmpprxfFwy");
        setIntField(term53308, term53308.getClass(), "level", -665192132);
        setIntField(term53308, term53308.getClass(), "reincarnationNum", 720355914);
        setLongField(term53308, term53308.getClass(), "exp", -7977668399638006021L);
        setLongField(term53308, term53308.getClass(), "point", -6264785127930873499L);
        setLongField(term53308, term53308.getClass(), "totalPoint", -3057089152637139157L);
        setIntField(term53308, term53308.getClass(), "playCount", -775874930);
        setIntField(term53308, term53308.getClass(), "jewelCount", 1404363846);
        setIntField(term53308, term53308.getClass(), "totalJewelCount", -2081298107);
        setIntField(term53308, term53308.getClass(), "medalCount", -231030486);
        setIntField(term53308, term53308.getClass(), "playerRating", 908016119);
        setIntField(term53308, term53308.getClass(), "highestRating", 110988463);
        setIntField(term53308, term53308.getClass(), "battlePoint", 955685902);
        setIntField(term53308, term53308.getClass(), "bestBattlePoint", 462054815);
        setIntField(term53308, term53308.getClass(), "overDamageBattlePoint", 406100677);
        setBooleanField(term53308, term53308.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term53308, term53308.getClass(), "nameplateId", 778368290);
        setIntField(term53308, term53308.getClass(), "trophyId", 963185413);
        setIntField(term53308, term53308.getClass(), "cardId", 1937434591);
        setIntField(term53308, term53308.getClass(), "characterId", 759908235);
        setIntField(term53308, term53308.getClass(), "characterVoiceNo", -1220035028);
        setIntField(term53308, term53308.getClass(), "tabSetting", 211574528);
        setIntField(term53308, term53308.getClass(), "tabSortSetting", 984819165);
        setIntField(term53308, term53308.getClass(), "cardCategorySetting", 1276438509);
        setIntField(term53308, term53308.getClass(), "cardSortSetting", -934156422);
        setIntField(term53308, term53308.getClass(), "rivalScoreCategorySetting", -1644931931);
        setIntField(term53308, term53308.getClass(), "playedTutorialBit", -1890108963);
        setIntField(term53308, term53308.getClass(), "firstTutorialCancelNum", 1848496553);
        setLongField(term53308, term53308.getClass(), "sumTechHighScore", 3094322609315685109L);
        setLongField(term53308, term53308.getClass(), "sumTechBasicHighScore", -1909960197370926856L);
        setLongField(term53308, term53308.getClass(), "sumTechAdvancedHighScore", -9121990928010625836L);
        setLongField(term53308, term53308.getClass(), "sumTechExpertHighScore", 1281090837858883601L);
        setLongField(term53308, term53308.getClass(), "sumTechMasterHighScore", -1930943711257094155L);
        setLongField(term53308, term53308.getClass(), "sumTechLunaticHighScore", 8895118820871384465L);
        setLongField(term53308, term53308.getClass(), "sumBattleHighScore", -1133623154868596434L);
        setLongField(term53308, term53308.getClass(), "sumBattleBasicHighScore", -7907370981376515453L);
        setLongField(term53308, term53308.getClass(), "sumBattleAdvancedHighScore", 912529279953387872L);
        setLongField(term53308, term53308.getClass(), "sumBattleExpertHighScore", 6140052465174132392L);
        setLongField(term53308, term53308.getClass(), "sumBattleMasterHighScore", 3429269088703450074L);
        setLongField(term53308, term53308.getClass(), "sumBattleLunaticHighScore", 5075494854539116407L);
        setField(term53308, term53308.getClass(), "eventWatchedDate", "AQbnQoJwOO");
        setField(term53308, term53308.getClass(), "cmEventWatchedDate", "NnicBPzNzw");
        setField(term53308, term53308.getClass(), "firstGameId", "WADNPbexnT");
        setField(term53308, term53308.getClass(), "firstRomVersion", "rMbsSfMKvX");
        setField(term53308, term53308.getClass(), "firstDataVersion", "oCsqRJXMBc");
        setField(term53308, term53308.getClass(), "firstPlayDate", "npPxKNoqdS");
        setField(term53308, term53308.getClass(), "lastGameId", "tGgCtmAQPu");
        setField(term53308, term53308.getClass(), "lastRomVersion", "HokisXXNMR");
        setField(term53308, term53308.getClass(), "lastDataVersion", "JbtvoXZZHr");
        setField(term53308, term53308.getClass(), "compatibleCmVersion", "eMlkqCfrnK");
        setField(term53308, term53308.getClass(), "lastPlayDate", "HCiwohQDUV");
        setIntField(term53308, term53308.getClass(), "lastPlaceId", 79714955);
        setField(term53308, term53308.getClass(), "lastPlaceName", "RRWTUIdKkl");
        setIntField(term53308, term53308.getClass(), "lastRegionId", -1409613044);
        setField(term53308, term53308.getClass(), "lastRegionName", "pBnfJsGPNO");
        setIntField(term53308, term53308.getClass(), "lastAllNetId", -1594530234);
        setField(term53308, term53308.getClass(), "lastClientId", "hzaRTeUQpV");
        setIntField(term53308, term53308.getClass(), "lastUsedDeckId", -414324261);
        setIntField(term53308, term53308.getClass(), "lastPlayMusicLevel", -1729893211);
        setIntField(term53308, term53308.getClass(), "lastEmoneyBrand", -1648760670);
        term53571 = new Integer(590703291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53571;
        callMethod(klass, "setPlayerRating", argTypes, term53308, args);
    }

};


