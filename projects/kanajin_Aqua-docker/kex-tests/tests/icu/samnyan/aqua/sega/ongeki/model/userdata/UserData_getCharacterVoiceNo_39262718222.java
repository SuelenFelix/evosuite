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

public class UserData_getCharacterVoiceNo_39262718222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31224;

    public UserData_getCharacterVoiceNo_39262718222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31228 = new Long(-6723783499250797216L);
        term31224 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term31226 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term31242 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31243 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31247 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31257 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term31224, term31224.getClass(), "id", -8447404910321380142L);
        setLongField(term31226, term31226.getClass(), "id", 3415544654174435087L);
        setField(term31226, term31226.getClass(), "extId", term31228);
        setField(term31226, term31226.getClass(), "luid", "nSzzeexTDI");
        setIntField(term31243, term31243.getClass(), "year", 2010);
        setShortField(term31243, term31243.getClass(), "month", (short) 1);
        setShortField(term31243, term31243.getClass(), "day", (short) 10);
        setField(term31242, term31242.getClass(), "date", term31243);
        setByteField(term31247, term31247.getClass(), "hour", (byte) 12);
        setByteField(term31247, term31247.getClass(), "minute", (byte) 46);
        setByteField(term31247, term31247.getClass(), "second", (byte) 5);
        setIntField(term31247, term31247.getClass(), "nano", 540440953);
        setField(term31242, term31242.getClass(), "time", term31247);
        setField(term31226, term31226.getClass(), "registerTime", term31242);
        setIntField(term31253, term31253.getClass(), "year", 2028);
        setShortField(term31253, term31253.getClass(), "month", (short) 5);
        setShortField(term31253, term31253.getClass(), "day", (short) 7);
        setField(term31252, term31252.getClass(), "date", term31253);
        setByteField(term31257, term31257.getClass(), "hour", (byte) 7);
        setByteField(term31257, term31257.getClass(), "minute", (byte) 48);
        setByteField(term31257, term31257.getClass(), "second", (byte) 4);
        setIntField(term31257, term31257.getClass(), "nano", 380425174);
        setField(term31252, term31252.getClass(), "time", term31257);
        setField(term31226, term31226.getClass(), "accessTime", term31252);
        setField(term31224, term31224.getClass(), "card", term31226);
        setField(term31224, term31224.getClass(), "userName", "WBrpvMhmsz");
        setIntField(term31224, term31224.getClass(), "level", -985141153);
        setIntField(term31224, term31224.getClass(), "reincarnationNum", -1983740361);
        setLongField(term31224, term31224.getClass(), "exp", -6444648462294378605L);
        setLongField(term31224, term31224.getClass(), "point", 2399163633137062666L);
        setLongField(term31224, term31224.getClass(), "totalPoint", 4553697734347851750L);
        setIntField(term31224, term31224.getClass(), "playCount", -1494716341);
        setIntField(term31224, term31224.getClass(), "jewelCount", 816237851);
        setIntField(term31224, term31224.getClass(), "totalJewelCount", -604114341);
        setIntField(term31224, term31224.getClass(), "medalCount", 1146236760);
        setIntField(term31224, term31224.getClass(), "playerRating", 985801789);
        setIntField(term31224, term31224.getClass(), "highestRating", -1628536749);
        setIntField(term31224, term31224.getClass(), "battlePoint", -748022064);
        setIntField(term31224, term31224.getClass(), "bestBattlePoint", -1745708025);
        setIntField(term31224, term31224.getClass(), "overDamageBattlePoint", 790614624);
        setBooleanField(term31224, term31224.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term31224, term31224.getClass(), "nameplateId", 117387225);
        setIntField(term31224, term31224.getClass(), "trophyId", 948347134);
        setIntField(term31224, term31224.getClass(), "cardId", -1552842218);
        setIntField(term31224, term31224.getClass(), "characterId", -157220068);
        setIntField(term31224, term31224.getClass(), "characterVoiceNo", 141434141);
        setIntField(term31224, term31224.getClass(), "tabSetting", -288619829);
        setIntField(term31224, term31224.getClass(), "tabSortSetting", -505635206);
        setIntField(term31224, term31224.getClass(), "cardCategorySetting", 932246615);
        setIntField(term31224, term31224.getClass(), "cardSortSetting", 261281668);
        setIntField(term31224, term31224.getClass(), "rivalScoreCategorySetting", 1712273163);
        setIntField(term31224, term31224.getClass(), "playedTutorialBit", 234306621);
        setIntField(term31224, term31224.getClass(), "firstTutorialCancelNum", 1025525602);
        setLongField(term31224, term31224.getClass(), "sumTechHighScore", 1612790513855406360L);
        setLongField(term31224, term31224.getClass(), "sumTechBasicHighScore", -3628485034781450950L);
        setLongField(term31224, term31224.getClass(), "sumTechAdvancedHighScore", 2505442540861032970L);
        setLongField(term31224, term31224.getClass(), "sumTechExpertHighScore", -4215965963361389968L);
        setLongField(term31224, term31224.getClass(), "sumTechMasterHighScore", 2070286321904569703L);
        setLongField(term31224, term31224.getClass(), "sumTechLunaticHighScore", -3945232339387324807L);
        setLongField(term31224, term31224.getClass(), "sumBattleHighScore", -5824480506846704461L);
        setLongField(term31224, term31224.getClass(), "sumBattleBasicHighScore", 3429445910087803709L);
        setLongField(term31224, term31224.getClass(), "sumBattleAdvancedHighScore", 6844542874326058740L);
        setLongField(term31224, term31224.getClass(), "sumBattleExpertHighScore", -7486371039960699202L);
        setLongField(term31224, term31224.getClass(), "sumBattleMasterHighScore", 3936368864173279345L);
        setLongField(term31224, term31224.getClass(), "sumBattleLunaticHighScore", 6993652740699384445L);
        setField(term31224, term31224.getClass(), "eventWatchedDate", "ZzqRHVEXcM");
        setField(term31224, term31224.getClass(), "cmEventWatchedDate", "YYwIEARNxi");
        setField(term31224, term31224.getClass(), "firstGameId", "rblXBUdTFc");
        setField(term31224, term31224.getClass(), "firstRomVersion", "rbsXSOJFKW");
        setField(term31224, term31224.getClass(), "firstDataVersion", "sAgGDoUNlf");
        setField(term31224, term31224.getClass(), "firstPlayDate", "TSTZcXdFFi");
        setField(term31224, term31224.getClass(), "lastGameId", "RyaaOzWfYO");
        setField(term31224, term31224.getClass(), "lastRomVersion", "HAkxFBZZzz");
        setField(term31224, term31224.getClass(), "lastDataVersion", "yejonZnVuy");
        setField(term31224, term31224.getClass(), "compatibleCmVersion", "ouesGIsvuG");
        setField(term31224, term31224.getClass(), "lastPlayDate", "pHBHlmLIZQ");
        setIntField(term31224, term31224.getClass(), "lastPlaceId", 1669406334);
        setField(term31224, term31224.getClass(), "lastPlaceName", "ZWRAbOuktl");
        setIntField(term31224, term31224.getClass(), "lastRegionId", -780862464);
        setField(term31224, term31224.getClass(), "lastRegionName", "iqFRvFmVID");
        setIntField(term31224, term31224.getClass(), "lastAllNetId", 2014099129);
        setField(term31224, term31224.getClass(), "lastClientId", "pNAEtppZdv");
        setIntField(term31224, term31224.getClass(), "lastUsedDeckId", -1024382698);
        setIntField(term31224, term31224.getClass(), "lastPlayMusicLevel", -168406824);
        setIntField(term31224, term31224.getClass(), "lastEmoneyBrand", 2063577636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterVoiceNo", argTypes, term31224, args);
    }

};


