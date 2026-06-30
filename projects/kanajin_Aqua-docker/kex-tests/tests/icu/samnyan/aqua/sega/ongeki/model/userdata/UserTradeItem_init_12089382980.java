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

public class UserTradeItem_init_12089382980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150269;

    public UserTradeItem_init_12089382980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term150273 = new Long(-2463629530824341661L);
        term150269 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term150271 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term150287 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150288 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150292 = newInstance(Class.forName("java.time.LocalTime"));
        Object term150297 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150298 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150302 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term150269, term150269.getClass(), "id", 1223529889742116508L);
        setLongField(term150271, term150271.getClass(), "id", -7608333910137165605L);
        setField(term150271, term150271.getClass(), "extId", term150273);
        setField(term150271, term150271.getClass(), "luid", "PVYBCybavV");
        setIntField(term150288, term150288.getClass(), "year", 2017);
        setShortField(term150288, term150288.getClass(), "month", (short) 6);
        setShortField(term150288, term150288.getClass(), "day", (short) 3);
        setField(term150287, term150287.getClass(), "date", term150288);
        setByteField(term150292, term150292.getClass(), "hour", (byte) 20);
        setByteField(term150292, term150292.getClass(), "minute", (byte) 14);
        setByteField(term150292, term150292.getClass(), "second", (byte) 10);
        setIntField(term150292, term150292.getClass(), "nano", 594163001);
        setField(term150287, term150287.getClass(), "time", term150292);
        setField(term150271, term150271.getClass(), "registerTime", term150287);
        setIntField(term150298, term150298.getClass(), "year", 2014);
        setShortField(term150298, term150298.getClass(), "month", (short) 4);
        setShortField(term150298, term150298.getClass(), "day", (short) 9);
        setField(term150297, term150297.getClass(), "date", term150298);
        setByteField(term150302, term150302.getClass(), "hour", (byte) 0);
        setByteField(term150302, term150302.getClass(), "minute", (byte) 49);
        setByteField(term150302, term150302.getClass(), "second", (byte) 41);
        setIntField(term150302, term150302.getClass(), "nano", 379126669);
        setField(term150297, term150297.getClass(), "time", term150302);
        setField(term150271, term150271.getClass(), "accessTime", term150297);
        setField(term150269, term150269.getClass(), "card", term150271);
        setField(term150269, term150269.getClass(), "userName", "lXOLVBrGzc");
        setIntField(term150269, term150269.getClass(), "level", -18540131);
        setIntField(term150269, term150269.getClass(), "reincarnationNum", 2028220249);
        setLongField(term150269, term150269.getClass(), "exp", 7775762742219724615L);
        setLongField(term150269, term150269.getClass(), "point", 4796911631852447678L);
        setLongField(term150269, term150269.getClass(), "totalPoint", -4000062294733197650L);
        setIntField(term150269, term150269.getClass(), "playCount", 1647906129);
        setIntField(term150269, term150269.getClass(), "jewelCount", 711901095);
        setIntField(term150269, term150269.getClass(), "totalJewelCount", -1601686432);
        setIntField(term150269, term150269.getClass(), "medalCount", 1005405366);
        setIntField(term150269, term150269.getClass(), "playerRating", 1682083643);
        setIntField(term150269, term150269.getClass(), "highestRating", -913374434);
        setIntField(term150269, term150269.getClass(), "battlePoint", -852430845);
        setIntField(term150269, term150269.getClass(), "bestBattlePoint", 64842894);
        setIntField(term150269, term150269.getClass(), "overDamageBattlePoint", -1932624760);
        setBooleanField(term150269, term150269.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term150269, term150269.getClass(), "nameplateId", 527367438);
        setIntField(term150269, term150269.getClass(), "trophyId", -1862333439);
        setIntField(term150269, term150269.getClass(), "cardId", -798735804);
        setIntField(term150269, term150269.getClass(), "characterId", 1532015613);
        setIntField(term150269, term150269.getClass(), "characterVoiceNo", -1143681603);
        setIntField(term150269, term150269.getClass(), "tabSetting", 671881052);
        setIntField(term150269, term150269.getClass(), "tabSortSetting", 1496400210);
        setIntField(term150269, term150269.getClass(), "cardCategorySetting", -1434027177);
        setIntField(term150269, term150269.getClass(), "cardSortSetting", 1385323795);
        setIntField(term150269, term150269.getClass(), "rivalScoreCategorySetting", -66414124);
        setIntField(term150269, term150269.getClass(), "playedTutorialBit", 497879148);
        setIntField(term150269, term150269.getClass(), "firstTutorialCancelNum", -237343326);
        setLongField(term150269, term150269.getClass(), "sumTechHighScore", -2789989083005979316L);
        setLongField(term150269, term150269.getClass(), "sumTechBasicHighScore", -649501428243345120L);
        setLongField(term150269, term150269.getClass(), "sumTechAdvancedHighScore", 745658224156576889L);
        setLongField(term150269, term150269.getClass(), "sumTechExpertHighScore", -1387307751370396737L);
        setLongField(term150269, term150269.getClass(), "sumTechMasterHighScore", 2877088407951901125L);
        setLongField(term150269, term150269.getClass(), "sumTechLunaticHighScore", 3084528853605561732L);
        setLongField(term150269, term150269.getClass(), "sumBattleHighScore", -8620869190650173980L);
        setLongField(term150269, term150269.getClass(), "sumBattleBasicHighScore", 4948940116725271685L);
        setLongField(term150269, term150269.getClass(), "sumBattleAdvancedHighScore", -6075212730718245215L);
        setLongField(term150269, term150269.getClass(), "sumBattleExpertHighScore", 3441925780374037370L);
        setLongField(term150269, term150269.getClass(), "sumBattleMasterHighScore", 4988917650917706238L);
        setLongField(term150269, term150269.getClass(), "sumBattleLunaticHighScore", 1043913825539769213L);
        setField(term150269, term150269.getClass(), "eventWatchedDate", "lWRWhoPZaY");
        setField(term150269, term150269.getClass(), "cmEventWatchedDate", "jUBVwhASOA");
        setField(term150269, term150269.getClass(), "firstGameId", "WNLNmPMYIn");
        setField(term150269, term150269.getClass(), "firstRomVersion", "uGYzQjwRvb");
        setField(term150269, term150269.getClass(), "firstDataVersion", "nkZCVHXnmb");
        setField(term150269, term150269.getClass(), "firstPlayDate", "eevshnfTuP");
        setField(term150269, term150269.getClass(), "lastGameId", "HzOxmBbucP");
        setField(term150269, term150269.getClass(), "lastRomVersion", "lVuUoDaGSk");
        setField(term150269, term150269.getClass(), "lastDataVersion", "cuNrapAQtZ");
        setField(term150269, term150269.getClass(), "compatibleCmVersion", "fCiCxxhDyR");
        setField(term150269, term150269.getClass(), "lastPlayDate", "AseuIhxdgC");
        setIntField(term150269, term150269.getClass(), "lastPlaceId", -392082342);
        setField(term150269, term150269.getClass(), "lastPlaceName", "JXKflOoAwA");
        setIntField(term150269, term150269.getClass(), "lastRegionId", -854451115);
        setField(term150269, term150269.getClass(), "lastRegionName", "sqUthQtpCU");
        setIntField(term150269, term150269.getClass(), "lastAllNetId", 1986079462);
        setField(term150269, term150269.getClass(), "lastClientId", "heMCJQtnSe");
        setIntField(term150269, term150269.getClass(), "lastUsedDeckId", -1259832629);
        setIntField(term150269, term150269.getClass(), "lastPlayMusicLevel", -614088635);
        setIntField(term150269, term150269.getClass(), "lastEmoneyBrand", 2118042800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term150269;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


