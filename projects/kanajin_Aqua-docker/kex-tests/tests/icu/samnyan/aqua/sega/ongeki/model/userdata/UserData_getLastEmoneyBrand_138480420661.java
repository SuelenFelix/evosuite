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

public class UserData_getLastEmoneyBrand_138480420661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47721;

    public UserData_getLastEmoneyBrand_138480420661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term47725 = new Long(1597484336218508869L);
        term47721 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term47723 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term47739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47744 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47754 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term47721, term47721.getClass(), "id", -4718136580123793528L);
        setLongField(term47723, term47723.getClass(), "id", 5370230694464734941L);
        setField(term47723, term47723.getClass(), "extId", term47725);
        setField(term47723, term47723.getClass(), "luid", "fNlDLqQZFT");
        setIntField(term47740, term47740.getClass(), "year", 2022);
        setShortField(term47740, term47740.getClass(), "month", (short) 1);
        setShortField(term47740, term47740.getClass(), "day", (short) 4);
        setField(term47739, term47739.getClass(), "date", term47740);
        setByteField(term47744, term47744.getClass(), "hour", (byte) 21);
        setByteField(term47744, term47744.getClass(), "minute", (byte) 36);
        setByteField(term47744, term47744.getClass(), "second", (byte) 43);
        setIntField(term47744, term47744.getClass(), "nano", 941221944);
        setField(term47739, term47739.getClass(), "time", term47744);
        setField(term47723, term47723.getClass(), "registerTime", term47739);
        setIntField(term47750, term47750.getClass(), "year", 2011);
        setShortField(term47750, term47750.getClass(), "month", (short) 4);
        setShortField(term47750, term47750.getClass(), "day", (short) 18);
        setField(term47749, term47749.getClass(), "date", term47750);
        setByteField(term47754, term47754.getClass(), "hour", (byte) 15);
        setByteField(term47754, term47754.getClass(), "minute", (byte) 35);
        setByteField(term47754, term47754.getClass(), "second", (byte) 7);
        setIntField(term47754, term47754.getClass(), "nano", 925983040);
        setField(term47749, term47749.getClass(), "time", term47754);
        setField(term47723, term47723.getClass(), "accessTime", term47749);
        setField(term47721, term47721.getClass(), "card", term47723);
        setField(term47721, term47721.getClass(), "userName", "szCfpoTDXX");
        setIntField(term47721, term47721.getClass(), "level", -289675978);
        setIntField(term47721, term47721.getClass(), "reincarnationNum", 1466847406);
        setLongField(term47721, term47721.getClass(), "exp", -1887513396695229317L);
        setLongField(term47721, term47721.getClass(), "point", 4538748174903798169L);
        setLongField(term47721, term47721.getClass(), "totalPoint", 8651853359004042709L);
        setIntField(term47721, term47721.getClass(), "playCount", 1943280473);
        setIntField(term47721, term47721.getClass(), "jewelCount", 1068101842);
        setIntField(term47721, term47721.getClass(), "totalJewelCount", 1060522715);
        setIntField(term47721, term47721.getClass(), "medalCount", -451590147);
        setIntField(term47721, term47721.getClass(), "playerRating", -537090894);
        setIntField(term47721, term47721.getClass(), "highestRating", 105089682);
        setIntField(term47721, term47721.getClass(), "battlePoint", 1304790955);
        setIntField(term47721, term47721.getClass(), "bestBattlePoint", -1412824084);
        setIntField(term47721, term47721.getClass(), "overDamageBattlePoint", 659034364);
        setBooleanField(term47721, term47721.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term47721, term47721.getClass(), "nameplateId", 671129726);
        setIntField(term47721, term47721.getClass(), "trophyId", -1217066846);
        setIntField(term47721, term47721.getClass(), "cardId", 570145845);
        setIntField(term47721, term47721.getClass(), "characterId", 1990162126);
        setIntField(term47721, term47721.getClass(), "characterVoiceNo", 1728957652);
        setIntField(term47721, term47721.getClass(), "tabSetting", -482056965);
        setIntField(term47721, term47721.getClass(), "tabSortSetting", 1727638564);
        setIntField(term47721, term47721.getClass(), "cardCategorySetting", 1102029917);
        setIntField(term47721, term47721.getClass(), "cardSortSetting", 506784803);
        setIntField(term47721, term47721.getClass(), "rivalScoreCategorySetting", -1201816382);
        setIntField(term47721, term47721.getClass(), "playedTutorialBit", 964841377);
        setIntField(term47721, term47721.getClass(), "firstTutorialCancelNum", -1503153618);
        setLongField(term47721, term47721.getClass(), "sumTechHighScore", -2356268402672275562L);
        setLongField(term47721, term47721.getClass(), "sumTechBasicHighScore", 4920060206553726462L);
        setLongField(term47721, term47721.getClass(), "sumTechAdvancedHighScore", -5089949977716478457L);
        setLongField(term47721, term47721.getClass(), "sumTechExpertHighScore", -3603009652560084801L);
        setLongField(term47721, term47721.getClass(), "sumTechMasterHighScore", -6386251470690822466L);
        setLongField(term47721, term47721.getClass(), "sumTechLunaticHighScore", -8340412977479666356L);
        setLongField(term47721, term47721.getClass(), "sumBattleHighScore", 5072151233307900881L);
        setLongField(term47721, term47721.getClass(), "sumBattleBasicHighScore", 2250556415549346949L);
        setLongField(term47721, term47721.getClass(), "sumBattleAdvancedHighScore", -4674840583005034118L);
        setLongField(term47721, term47721.getClass(), "sumBattleExpertHighScore", 3952299423271006072L);
        setLongField(term47721, term47721.getClass(), "sumBattleMasterHighScore", 6681879584837155391L);
        setLongField(term47721, term47721.getClass(), "sumBattleLunaticHighScore", 5457987117152229930L);
        setField(term47721, term47721.getClass(), "eventWatchedDate", "blnSDUyHkS");
        setField(term47721, term47721.getClass(), "cmEventWatchedDate", "byyepwHlHN");
        setField(term47721, term47721.getClass(), "firstGameId", "akVNsUcFra");
        setField(term47721, term47721.getClass(), "firstRomVersion", "BKiHMTzLoY");
        setField(term47721, term47721.getClass(), "firstDataVersion", "arrHHpXCBD");
        setField(term47721, term47721.getClass(), "firstPlayDate", "zzfzxQYlis");
        setField(term47721, term47721.getClass(), "lastGameId", "TJJQwVEzxz");
        setField(term47721, term47721.getClass(), "lastRomVersion", "kHtEHBrsFo");
        setField(term47721, term47721.getClass(), "lastDataVersion", "EmAvkhGlPV");
        setField(term47721, term47721.getClass(), "compatibleCmVersion", "mBrbyQVzve");
        setField(term47721, term47721.getClass(), "lastPlayDate", "FQODEbQeKa");
        setIntField(term47721, term47721.getClass(), "lastPlaceId", -1417720854);
        setField(term47721, term47721.getClass(), "lastPlaceName", "iLsUPvsdys");
        setIntField(term47721, term47721.getClass(), "lastRegionId", -231019352);
        setField(term47721, term47721.getClass(), "lastRegionName", "zsglFxvzdp");
        setIntField(term47721, term47721.getClass(), "lastAllNetId", -677712787);
        setField(term47721, term47721.getClass(), "lastClientId", "zhXtSGLnJR");
        setIntField(term47721, term47721.getClass(), "lastUsedDeckId", -473854701);
        setIntField(term47721, term47721.getClass(), "lastPlayMusicLevel", -193355905);
        setIntField(term47721, term47721.getClass(), "lastEmoneyBrand", -104223978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastEmoneyBrand", argTypes, term47721, args);
    }

};


