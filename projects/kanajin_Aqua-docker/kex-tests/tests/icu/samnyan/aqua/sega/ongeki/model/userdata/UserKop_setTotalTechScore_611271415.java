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

public class UserKop_setTotalTechScore_611271415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278252;
     Object term278546;

    public UserKop_setTotalTechScore_611271415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term278258 = new Long(2166921473521388808L);
        term278252 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term278254 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term278256 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term278272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278277 = newInstance(Class.forName("java.time.LocalTime"));
        Object term278282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278287 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term278252, term278252.getClass(), "id", 7102977751932828924L);
        setLongField(term278254, term278254.getClass(), "id", -6147534033119143621L);
        setLongField(term278256, term278256.getClass(), "id", -3642971774893519354L);
        setField(term278256, term278256.getClass(), "extId", term278258);
        setField(term278256, term278256.getClass(), "luid", "oaPePvATgc");
        setIntField(term278273, term278273.getClass(), "year", 2027);
        setShortField(term278273, term278273.getClass(), "month", (short) 4);
        setShortField(term278273, term278273.getClass(), "day", (short) 15);
        setField(term278272, term278272.getClass(), "date", term278273);
        setByteField(term278277, term278277.getClass(), "hour", (byte) 15);
        setByteField(term278277, term278277.getClass(), "minute", (byte) 59);
        setByteField(term278277, term278277.getClass(), "second", (byte) 10);
        setIntField(term278277, term278277.getClass(), "nano", 207659126);
        setField(term278272, term278272.getClass(), "time", term278277);
        setField(term278256, term278256.getClass(), "registerTime", term278272);
        setIntField(term278283, term278283.getClass(), "year", 2021);
        setShortField(term278283, term278283.getClass(), "month", (short) 12);
        setShortField(term278283, term278283.getClass(), "day", (short) 11);
        setField(term278282, term278282.getClass(), "date", term278283);
        setByteField(term278287, term278287.getClass(), "hour", (byte) 8);
        setByteField(term278287, term278287.getClass(), "minute", (byte) 30);
        setByteField(term278287, term278287.getClass(), "second", (byte) 15);
        setIntField(term278287, term278287.getClass(), "nano", 355111694);
        setField(term278282, term278282.getClass(), "time", term278287);
        setField(term278256, term278256.getClass(), "accessTime", term278282);
        setField(term278254, term278254.getClass(), "card", term278256);
        setField(term278254, term278254.getClass(), "userName", "JIjGGcVKJH");
        setIntField(term278254, term278254.getClass(), "level", 959274379);
        setIntField(term278254, term278254.getClass(), "reincarnationNum", -111125266);
        setLongField(term278254, term278254.getClass(), "exp", -986038252204081823L);
        setLongField(term278254, term278254.getClass(), "point", -6037414794866033043L);
        setLongField(term278254, term278254.getClass(), "totalPoint", -7601083573749234088L);
        setIntField(term278254, term278254.getClass(), "playCount", 448697018);
        setIntField(term278254, term278254.getClass(), "jewelCount", 1716089094);
        setIntField(term278254, term278254.getClass(), "totalJewelCount", 934961465);
        setIntField(term278254, term278254.getClass(), "medalCount", -417012777);
        setIntField(term278254, term278254.getClass(), "playerRating", 88517077);
        setIntField(term278254, term278254.getClass(), "highestRating", 337947983);
        setIntField(term278254, term278254.getClass(), "battlePoint", 68193922);
        setIntField(term278254, term278254.getClass(), "bestBattlePoint", 1396436320);
        setIntField(term278254, term278254.getClass(), "overDamageBattlePoint", -1669072852);
        setBooleanField(term278254, term278254.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term278254, term278254.getClass(), "nameplateId", 102952747);
        setIntField(term278254, term278254.getClass(), "trophyId", -953707233);
        setIntField(term278254, term278254.getClass(), "cardId", 1128790859);
        setIntField(term278254, term278254.getClass(), "characterId", -1442559952);
        setIntField(term278254, term278254.getClass(), "characterVoiceNo", 2077790798);
        setIntField(term278254, term278254.getClass(), "tabSetting", 646275345);
        setIntField(term278254, term278254.getClass(), "tabSortSetting", 163521440);
        setIntField(term278254, term278254.getClass(), "cardCategorySetting", 69136499);
        setIntField(term278254, term278254.getClass(), "cardSortSetting", 1571054206);
        setIntField(term278254, term278254.getClass(), "rivalScoreCategorySetting", -2018791707);
        setIntField(term278254, term278254.getClass(), "playedTutorialBit", 360204701);
        setIntField(term278254, term278254.getClass(), "firstTutorialCancelNum", -416199794);
        setLongField(term278254, term278254.getClass(), "sumTechHighScore", 6689687802322013920L);
        setLongField(term278254, term278254.getClass(), "sumTechBasicHighScore", -6086845797094901084L);
        setLongField(term278254, term278254.getClass(), "sumTechAdvancedHighScore", -8737904852443146349L);
        setLongField(term278254, term278254.getClass(), "sumTechExpertHighScore", 592145624334916142L);
        setLongField(term278254, term278254.getClass(), "sumTechMasterHighScore", 8605660284911865991L);
        setLongField(term278254, term278254.getClass(), "sumTechLunaticHighScore", 2765725107995945504L);
        setLongField(term278254, term278254.getClass(), "sumBattleHighScore", -2388334554689660402L);
        setLongField(term278254, term278254.getClass(), "sumBattleBasicHighScore", -3130021129497027821L);
        setLongField(term278254, term278254.getClass(), "sumBattleAdvancedHighScore", 7037253039596439950L);
        setLongField(term278254, term278254.getClass(), "sumBattleExpertHighScore", -1607220097264456340L);
        setLongField(term278254, term278254.getClass(), "sumBattleMasterHighScore", 3623747757466238596L);
        setLongField(term278254, term278254.getClass(), "sumBattleLunaticHighScore", -6181789730680784893L);
        setField(term278254, term278254.getClass(), "eventWatchedDate", "iasdYjtSEx");
        setField(term278254, term278254.getClass(), "cmEventWatchedDate", "QFfeXcsDUe");
        setField(term278254, term278254.getClass(), "firstGameId", "RuTPzciBfn");
        setField(term278254, term278254.getClass(), "firstRomVersion", "osTjagfbhA");
        setField(term278254, term278254.getClass(), "firstDataVersion", "KVJHdKBMKb");
        setField(term278254, term278254.getClass(), "firstPlayDate", "hrhwpRIDFJ");
        setField(term278254, term278254.getClass(), "lastGameId", "eanYvfnxqY");
        setField(term278254, term278254.getClass(), "lastRomVersion", "WHYzVTgpKa");
        setField(term278254, term278254.getClass(), "lastDataVersion", "RjzDomTTbS");
        setField(term278254, term278254.getClass(), "compatibleCmVersion", "pGIWKlGIzp");
        setField(term278254, term278254.getClass(), "lastPlayDate", "PUZgBUGBmS");
        setIntField(term278254, term278254.getClass(), "lastPlaceId", -850034771);
        setField(term278254, term278254.getClass(), "lastPlaceName", "xLEiWtPonE");
        setIntField(term278254, term278254.getClass(), "lastRegionId", 1276387384);
        setField(term278254, term278254.getClass(), "lastRegionName", "wyDaOmiffy");
        setIntField(term278254, term278254.getClass(), "lastAllNetId", 1478390250);
        setField(term278254, term278254.getClass(), "lastClientId", "mzQSpyiDzE");
        setIntField(term278254, term278254.getClass(), "lastUsedDeckId", -363836860);
        setIntField(term278254, term278254.getClass(), "lastPlayMusicLevel", -800919734);
        setIntField(term278254, term278254.getClass(), "lastEmoneyBrand", 993694845);
        setField(term278252, term278252.getClass(), "user", term278254);
        setField(term278252, term278252.getClass(), "authKey", "CTXGUQuXhq");
        setIntField(term278252, term278252.getClass(), "kopId", -2063030768);
        setIntField(term278252, term278252.getClass(), "areaId", -25263129);
        setIntField(term278252, term278252.getClass(), "totalTechScore", 1614442195);
        setIntField(term278252, term278252.getClass(), "totalPlatinumScore", -1041380867);
        setField(term278252, term278252.getClass(), "techRecordDate", "MIyWzhVoWw");
        setBooleanField(term278252, term278252.getClass(), "isTotalTechNewRecord", false);
        term278546 = new Integer(1592269612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term278546;
        callMethod(klass, "setTotalTechScore", argTypes, term278252, args);
    }

};


