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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class UserScenario_init_51769264314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102099;
     Object term102101;
     Object term102364;
     Object term102366;

    public UserScenario_init_51769264314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102099 = new Long(5177705694707399783L);
        Long term102105 = new Long(-1820639665251914495L);
        term102101 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term102103 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term102119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102124 = newInstance(Class.forName("java.time.LocalTime"));
        Object term102129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102134 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term102101, term102101.getClass(), "id", -6461397685703694449L);
        setLongField(term102103, term102103.getClass(), "id", -1352759923751287487L);
        setField(term102103, term102103.getClass(), "extId", term102105);
        setField(term102103, term102103.getClass(), "luid", "UasONzOTXn");
        setIntField(term102120, term102120.getClass(), "year", 2024);
        setShortField(term102120, term102120.getClass(), "month", (short) 3);
        setShortField(term102120, term102120.getClass(), "day", (short) 30);
        setField(term102119, term102119.getClass(), "date", term102120);
        setByteField(term102124, term102124.getClass(), "hour", (byte) 7);
        setByteField(term102124, term102124.getClass(), "minute", (byte) 18);
        setByteField(term102124, term102124.getClass(), "second", (byte) 30);
        setIntField(term102124, term102124.getClass(), "nano", 930626265);
        setField(term102119, term102119.getClass(), "time", term102124);
        setField(term102103, term102103.getClass(), "registerTime", term102119);
        setIntField(term102130, term102130.getClass(), "year", 2017);
        setShortField(term102130, term102130.getClass(), "month", (short) 10);
        setShortField(term102130, term102130.getClass(), "day", (short) 18);
        setField(term102129, term102129.getClass(), "date", term102130);
        setByteField(term102134, term102134.getClass(), "hour", (byte) 20);
        setByteField(term102134, term102134.getClass(), "minute", (byte) 35);
        setByteField(term102134, term102134.getClass(), "second", (byte) 5);
        setIntField(term102134, term102134.getClass(), "nano", 697625538);
        setField(term102129, term102129.getClass(), "time", term102134);
        setField(term102103, term102103.getClass(), "accessTime", term102129);
        setField(term102101, term102101.getClass(), "card", term102103);
        setField(term102101, term102101.getClass(), "userName", "gRkWWojcfo");
        setIntField(term102101, term102101.getClass(), "level", 1228854608);
        setIntField(term102101, term102101.getClass(), "reincarnationNum", -1210488188);
        setLongField(term102101, term102101.getClass(), "exp", 776959709485350743L);
        setLongField(term102101, term102101.getClass(), "point", -2636982387234489767L);
        setLongField(term102101, term102101.getClass(), "totalPoint", -8815984245590591067L);
        setIntField(term102101, term102101.getClass(), "playCount", -529430973);
        setIntField(term102101, term102101.getClass(), "jewelCount", 1735280371);
        setIntField(term102101, term102101.getClass(), "totalJewelCount", 2014178265);
        setIntField(term102101, term102101.getClass(), "medalCount", 650318106);
        setIntField(term102101, term102101.getClass(), "playerRating", 361184580);
        setIntField(term102101, term102101.getClass(), "highestRating", -1132844305);
        setIntField(term102101, term102101.getClass(), "battlePoint", -1893839838);
        setIntField(term102101, term102101.getClass(), "bestBattlePoint", -1899964739);
        setIntField(term102101, term102101.getClass(), "overDamageBattlePoint", 1320936203);
        setBooleanField(term102101, term102101.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term102101, term102101.getClass(), "nameplateId", 815999627);
        setIntField(term102101, term102101.getClass(), "trophyId", -1361096912);
        setIntField(term102101, term102101.getClass(), "cardId", -1489448292);
        setIntField(term102101, term102101.getClass(), "characterId", -111099654);
        setIntField(term102101, term102101.getClass(), "characterVoiceNo", 1865814659);
        setIntField(term102101, term102101.getClass(), "tabSetting", -715300089);
        setIntField(term102101, term102101.getClass(), "tabSortSetting", 493602399);
        setIntField(term102101, term102101.getClass(), "cardCategorySetting", 306088960);
        setIntField(term102101, term102101.getClass(), "cardSortSetting", 1739612725);
        setIntField(term102101, term102101.getClass(), "rivalScoreCategorySetting", 684431128);
        setIntField(term102101, term102101.getClass(), "playedTutorialBit", -131718261);
        setIntField(term102101, term102101.getClass(), "firstTutorialCancelNum", 1392281647);
        setLongField(term102101, term102101.getClass(), "sumTechHighScore", -1003686044277246587L);
        setLongField(term102101, term102101.getClass(), "sumTechBasicHighScore", -8776098518047697120L);
        setLongField(term102101, term102101.getClass(), "sumTechAdvancedHighScore", 8404934947021386860L);
        setLongField(term102101, term102101.getClass(), "sumTechExpertHighScore", 6719075499684927110L);
        setLongField(term102101, term102101.getClass(), "sumTechMasterHighScore", 5483860233667206947L);
        setLongField(term102101, term102101.getClass(), "sumTechLunaticHighScore", 3676789390529205745L);
        setLongField(term102101, term102101.getClass(), "sumBattleHighScore", -8742664229808515814L);
        setLongField(term102101, term102101.getClass(), "sumBattleBasicHighScore", 4520972160981828699L);
        setLongField(term102101, term102101.getClass(), "sumBattleAdvancedHighScore", -1397583526788570055L);
        setLongField(term102101, term102101.getClass(), "sumBattleExpertHighScore", -8878130853856860317L);
        setLongField(term102101, term102101.getClass(), "sumBattleMasterHighScore", -6748373037285093819L);
        setLongField(term102101, term102101.getClass(), "sumBattleLunaticHighScore", -1258197335072720560L);
        setField(term102101, term102101.getClass(), "eventWatchedDate", "FHujUNXIxu");
        setField(term102101, term102101.getClass(), "cmEventWatchedDate", "OMWsPUFcoJ");
        setField(term102101, term102101.getClass(), "firstGameId", "oWooJBZOyh");
        setField(term102101, term102101.getClass(), "firstRomVersion", "iNnWLGJCBN");
        setField(term102101, term102101.getClass(), "firstDataVersion", "jYJrGEVHCD");
        setField(term102101, term102101.getClass(), "firstPlayDate", "wlBPkhpzWH");
        setField(term102101, term102101.getClass(), "lastGameId", "aBZsgezjug");
        setField(term102101, term102101.getClass(), "lastRomVersion", "hvlXhuKNfP");
        setField(term102101, term102101.getClass(), "lastDataVersion", "csdpRGUrjJ");
        setField(term102101, term102101.getClass(), "compatibleCmVersion", "FtOpFdJBak");
        setField(term102101, term102101.getClass(), "lastPlayDate", "mqiIwoVVkU");
        setIntField(term102101, term102101.getClass(), "lastPlaceId", 1896966568);
        setField(term102101, term102101.getClass(), "lastPlaceName", "LYcLrQMkAA");
        setIntField(term102101, term102101.getClass(), "lastRegionId", 95747063);
        setField(term102101, term102101.getClass(), "lastRegionName", "XhbGnImmgd");
        setIntField(term102101, term102101.getClass(), "lastAllNetId", 1353810730);
        setField(term102101, term102101.getClass(), "lastClientId", "UUTpuViRuV");
        setIntField(term102101, term102101.getClass(), "lastUsedDeckId", 1704841611);
        setIntField(term102101, term102101.getClass(), "lastPlayMusicLevel", -1055865904);
        setIntField(term102101, term102101.getClass(), "lastEmoneyBrand", 1639434832);
        term102364 = new Integer(41120682);
        term102366 = new Integer(-565584348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term102099;
        args[1] = term102101;
        args[2] = term102364;
        args[3] = term102366;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


