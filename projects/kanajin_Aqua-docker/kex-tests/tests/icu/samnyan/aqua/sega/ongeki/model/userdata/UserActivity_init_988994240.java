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

public class UserActivity_init_988994240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282731;

    public UserActivity_init_988994240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term282735 = new Long(-6806576523000182981L);
        term282731 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term282733 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term282749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282754 = newInstance(Class.forName("java.time.LocalTime"));
        Object term282759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282764 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term282731, term282731.getClass(), "id", 8156647561559988022L);
        setLongField(term282733, term282733.getClass(), "id", 4263332590120229885L);
        setField(term282733, term282733.getClass(), "extId", term282735);
        setField(term282733, term282733.getClass(), "luid", "nnmhGenvZB");
        setIntField(term282750, term282750.getClass(), "year", 2011);
        setShortField(term282750, term282750.getClass(), "month", (short) 3);
        setShortField(term282750, term282750.getClass(), "day", (short) 31);
        setField(term282749, term282749.getClass(), "date", term282750);
        setByteField(term282754, term282754.getClass(), "hour", (byte) 14);
        setByteField(term282754, term282754.getClass(), "minute", (byte) 57);
        setByteField(term282754, term282754.getClass(), "second", (byte) 41);
        setIntField(term282754, term282754.getClass(), "nano", 753465874);
        setField(term282749, term282749.getClass(), "time", term282754);
        setField(term282733, term282733.getClass(), "registerTime", term282749);
        setIntField(term282760, term282760.getClass(), "year", 2026);
        setShortField(term282760, term282760.getClass(), "month", (short) 7);
        setShortField(term282760, term282760.getClass(), "day", (short) 15);
        setField(term282759, term282759.getClass(), "date", term282760);
        setByteField(term282764, term282764.getClass(), "hour", (byte) 12);
        setByteField(term282764, term282764.getClass(), "minute", (byte) 44);
        setByteField(term282764, term282764.getClass(), "second", (byte) 24);
        setIntField(term282764, term282764.getClass(), "nano", 348318175);
        setField(term282759, term282759.getClass(), "time", term282764);
        setField(term282733, term282733.getClass(), "accessTime", term282759);
        setField(term282731, term282731.getClass(), "card", term282733);
        setField(term282731, term282731.getClass(), "userName", "WAqAYqgwuP");
        setIntField(term282731, term282731.getClass(), "level", -1170114262);
        setIntField(term282731, term282731.getClass(), "reincarnationNum", 1472006438);
        setLongField(term282731, term282731.getClass(), "exp", -3698714259650045143L);
        setLongField(term282731, term282731.getClass(), "point", -8760046709518852536L);
        setLongField(term282731, term282731.getClass(), "totalPoint", -3444595173254971473L);
        setIntField(term282731, term282731.getClass(), "playCount", -1709980802);
        setIntField(term282731, term282731.getClass(), "jewelCount", -844647509);
        setIntField(term282731, term282731.getClass(), "totalJewelCount", -1745270330);
        setIntField(term282731, term282731.getClass(), "medalCount", -1544639528);
        setIntField(term282731, term282731.getClass(), "playerRating", 1385044115);
        setIntField(term282731, term282731.getClass(), "highestRating", 1139126133);
        setIntField(term282731, term282731.getClass(), "battlePoint", 1498393769);
        setIntField(term282731, term282731.getClass(), "bestBattlePoint", -320845496);
        setIntField(term282731, term282731.getClass(), "overDamageBattlePoint", 1894524360);
        setBooleanField(term282731, term282731.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term282731, term282731.getClass(), "nameplateId", -161445471);
        setIntField(term282731, term282731.getClass(), "trophyId", -834299730);
        setIntField(term282731, term282731.getClass(), "cardId", -1844297547);
        setIntField(term282731, term282731.getClass(), "characterId", 1802451394);
        setIntField(term282731, term282731.getClass(), "characterVoiceNo", -182890909);
        setIntField(term282731, term282731.getClass(), "tabSetting", -1032180019);
        setIntField(term282731, term282731.getClass(), "tabSortSetting", -1616238764);
        setIntField(term282731, term282731.getClass(), "cardCategorySetting", 1976896930);
        setIntField(term282731, term282731.getClass(), "cardSortSetting", -1937263201);
        setIntField(term282731, term282731.getClass(), "rivalScoreCategorySetting", -25872721);
        setIntField(term282731, term282731.getClass(), "playedTutorialBit", 2005322577);
        setIntField(term282731, term282731.getClass(), "firstTutorialCancelNum", -1186814529);
        setLongField(term282731, term282731.getClass(), "sumTechHighScore", -6702347507610825757L);
        setLongField(term282731, term282731.getClass(), "sumTechBasicHighScore", 3290162514486122032L);
        setLongField(term282731, term282731.getClass(), "sumTechAdvancedHighScore", 3750259649126671112L);
        setLongField(term282731, term282731.getClass(), "sumTechExpertHighScore", 415708395462602530L);
        setLongField(term282731, term282731.getClass(), "sumTechMasterHighScore", -5139247704097834889L);
        setLongField(term282731, term282731.getClass(), "sumTechLunaticHighScore", -4623697595578263926L);
        setLongField(term282731, term282731.getClass(), "sumBattleHighScore", 7575368888141656476L);
        setLongField(term282731, term282731.getClass(), "sumBattleBasicHighScore", 1082182445739037889L);
        setLongField(term282731, term282731.getClass(), "sumBattleAdvancedHighScore", 8719156760082808048L);
        setLongField(term282731, term282731.getClass(), "sumBattleExpertHighScore", -2701806719592548485L);
        setLongField(term282731, term282731.getClass(), "sumBattleMasterHighScore", -1148606066751001441L);
        setLongField(term282731, term282731.getClass(), "sumBattleLunaticHighScore", 3368880725497128709L);
        setField(term282731, term282731.getClass(), "eventWatchedDate", "kwMgnfULWA");
        setField(term282731, term282731.getClass(), "cmEventWatchedDate", "JNvqAwFwOT");
        setField(term282731, term282731.getClass(), "firstGameId", "UiwUKKcPGt");
        setField(term282731, term282731.getClass(), "firstRomVersion", "gJQaBkFONi");
        setField(term282731, term282731.getClass(), "firstDataVersion", "hvCurjbKKA");
        setField(term282731, term282731.getClass(), "firstPlayDate", "KPDBuTWYxh");
        setField(term282731, term282731.getClass(), "lastGameId", "hHasDCgpXm");
        setField(term282731, term282731.getClass(), "lastRomVersion", "YIGgyxbBJX");
        setField(term282731, term282731.getClass(), "lastDataVersion", "yXWvbiyfBN");
        setField(term282731, term282731.getClass(), "compatibleCmVersion", "pzjAIwjtmM");
        setField(term282731, term282731.getClass(), "lastPlayDate", "PPTHZyWzja");
        setIntField(term282731, term282731.getClass(), "lastPlaceId", 1483573130);
        setField(term282731, term282731.getClass(), "lastPlaceName", "lkrEjOUbOb");
        setIntField(term282731, term282731.getClass(), "lastRegionId", 927223939);
        setField(term282731, term282731.getClass(), "lastRegionName", "cxeaGVfqIZ");
        setIntField(term282731, term282731.getClass(), "lastAllNetId", -647830765);
        setField(term282731, term282731.getClass(), "lastClientId", "PduAQEEVJs");
        setIntField(term282731, term282731.getClass(), "lastUsedDeckId", 2133854614);
        setIntField(term282731, term282731.getClass(), "lastPlayMusicLevel", 2120820625);
        setIntField(term282731, term282731.getClass(), "lastEmoneyBrand", 1775824914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term282731;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


