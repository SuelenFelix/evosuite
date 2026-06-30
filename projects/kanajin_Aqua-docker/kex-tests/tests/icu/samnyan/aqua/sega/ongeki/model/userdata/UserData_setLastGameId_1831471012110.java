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

public class UserData_setLastGameId_1831471012110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68728;

    public UserData_setLastGameId_1831471012110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term68732 = new Long(1195529027276497124L);
        term68728 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term68730 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term68746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68751 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68761 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term68728, term68728.getClass(), "id", -712231978771147321L);
        setLongField(term68730, term68730.getClass(), "id", -3719705503663357236L);
        setField(term68730, term68730.getClass(), "extId", term68732);
        setField(term68730, term68730.getClass(), "luid", "XfzbAdTaCO");
        setIntField(term68747, term68747.getClass(), "year", 2014);
        setShortField(term68747, term68747.getClass(), "month", (short) 2);
        setShortField(term68747, term68747.getClass(), "day", (short) 18);
        setField(term68746, term68746.getClass(), "date", term68747);
        setByteField(term68751, term68751.getClass(), "hour", (byte) 4);
        setByteField(term68751, term68751.getClass(), "minute", (byte) 16);
        setByteField(term68751, term68751.getClass(), "second", (byte) 8);
        setIntField(term68751, term68751.getClass(), "nano", 486006871);
        setField(term68746, term68746.getClass(), "time", term68751);
        setField(term68730, term68730.getClass(), "registerTime", term68746);
        setIntField(term68757, term68757.getClass(), "year", 2024);
        setShortField(term68757, term68757.getClass(), "month", (short) 10);
        setShortField(term68757, term68757.getClass(), "day", (short) 8);
        setField(term68756, term68756.getClass(), "date", term68757);
        setByteField(term68761, term68761.getClass(), "hour", (byte) 19);
        setByteField(term68761, term68761.getClass(), "minute", (byte) 31);
        setByteField(term68761, term68761.getClass(), "second", (byte) 10);
        setIntField(term68761, term68761.getClass(), "nano", 930417883);
        setField(term68756, term68756.getClass(), "time", term68761);
        setField(term68730, term68730.getClass(), "accessTime", term68756);
        setField(term68728, term68728.getClass(), "card", term68730);
        setField(term68728, term68728.getClass(), "userName", "rDcGfVDmsE");
        setIntField(term68728, term68728.getClass(), "level", 450142186);
        setIntField(term68728, term68728.getClass(), "reincarnationNum", 874917656);
        setLongField(term68728, term68728.getClass(), "exp", -2486316003854133942L);
        setLongField(term68728, term68728.getClass(), "point", 1641523513056981056L);
        setLongField(term68728, term68728.getClass(), "totalPoint", 1493991027927867330L);
        setIntField(term68728, term68728.getClass(), "playCount", 998050776);
        setIntField(term68728, term68728.getClass(), "jewelCount", -1154360532);
        setIntField(term68728, term68728.getClass(), "totalJewelCount", -1414782360);
        setIntField(term68728, term68728.getClass(), "medalCount", 812774787);
        setIntField(term68728, term68728.getClass(), "playerRating", 1955108847);
        setIntField(term68728, term68728.getClass(), "highestRating", 601282140);
        setIntField(term68728, term68728.getClass(), "battlePoint", -1989711686);
        setIntField(term68728, term68728.getClass(), "bestBattlePoint", -427352130);
        setIntField(term68728, term68728.getClass(), "overDamageBattlePoint", 490225359);
        setBooleanField(term68728, term68728.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term68728, term68728.getClass(), "nameplateId", 338229726);
        setIntField(term68728, term68728.getClass(), "trophyId", -1891580978);
        setIntField(term68728, term68728.getClass(), "cardId", 1101260257);
        setIntField(term68728, term68728.getClass(), "characterId", 1800400048);
        setIntField(term68728, term68728.getClass(), "characterVoiceNo", -1248348901);
        setIntField(term68728, term68728.getClass(), "tabSetting", -808864128);
        setIntField(term68728, term68728.getClass(), "tabSortSetting", -1813216452);
        setIntField(term68728, term68728.getClass(), "cardCategorySetting", 180516410);
        setIntField(term68728, term68728.getClass(), "cardSortSetting", 606206987);
        setIntField(term68728, term68728.getClass(), "rivalScoreCategorySetting", -534930572);
        setIntField(term68728, term68728.getClass(), "playedTutorialBit", -748140133);
        setIntField(term68728, term68728.getClass(), "firstTutorialCancelNum", 795993216);
        setLongField(term68728, term68728.getClass(), "sumTechHighScore", -2211824773087441240L);
        setLongField(term68728, term68728.getClass(), "sumTechBasicHighScore", -227938851357677611L);
        setLongField(term68728, term68728.getClass(), "sumTechAdvancedHighScore", 8977912935219434305L);
        setLongField(term68728, term68728.getClass(), "sumTechExpertHighScore", 5474159458400902959L);
        setLongField(term68728, term68728.getClass(), "sumTechMasterHighScore", -5190905799542005717L);
        setLongField(term68728, term68728.getClass(), "sumTechLunaticHighScore", -5832306759320914230L);
        setLongField(term68728, term68728.getClass(), "sumBattleHighScore", -2056599550418122679L);
        setLongField(term68728, term68728.getClass(), "sumBattleBasicHighScore", -5763013479597334672L);
        setLongField(term68728, term68728.getClass(), "sumBattleAdvancedHighScore", 8973659121888341355L);
        setLongField(term68728, term68728.getClass(), "sumBattleExpertHighScore", -3485196582845968771L);
        setLongField(term68728, term68728.getClass(), "sumBattleMasterHighScore", -5312023077883044689L);
        setLongField(term68728, term68728.getClass(), "sumBattleLunaticHighScore", 3628199752798604009L);
        setField(term68728, term68728.getClass(), "eventWatchedDate", "agspBqCjgG");
        setField(term68728, term68728.getClass(), "cmEventWatchedDate", "HMJaeNiTNW");
        setField(term68728, term68728.getClass(), "firstGameId", "ggcJNlLcZb");
        setField(term68728, term68728.getClass(), "firstRomVersion", "EzhvjUZCQP");
        setField(term68728, term68728.getClass(), "firstDataVersion", "FTHebphiPR");
        setField(term68728, term68728.getClass(), "firstPlayDate", "OQjMPmyJQz");
        setField(term68728, term68728.getClass(), "lastGameId", "FZQimBsMNt");
        setField(term68728, term68728.getClass(), "lastRomVersion", "lowANLpXCV");
        setField(term68728, term68728.getClass(), "lastDataVersion", "orjiIcUIcD");
        setField(term68728, term68728.getClass(), "compatibleCmVersion", "lGzFueHQqZ");
        setField(term68728, term68728.getClass(), "lastPlayDate", "cjiDFHGGlp");
        setIntField(term68728, term68728.getClass(), "lastPlaceId", 1583601182);
        setField(term68728, term68728.getClass(), "lastPlaceName", "XLjtkfroHJ");
        setIntField(term68728, term68728.getClass(), "lastRegionId", -1372040155);
        setField(term68728, term68728.getClass(), "lastRegionName", "hdqypaATat");
        setIntField(term68728, term68728.getClass(), "lastAllNetId", 2091263178);
        setField(term68728, term68728.getClass(), "lastClientId", "yXrHDHEipD");
        setIntField(term68728, term68728.getClass(), "lastUsedDeckId", -1726739412);
        setIntField(term68728, term68728.getClass(), "lastPlayMusicLevel", -910985376);
        setIntField(term68728, term68728.getClass(), "lastEmoneyBrand", 1260410174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pbqIeikQzp";
        callMethod(klass, "setLastGameId", argTypes, term68728, args);
    }

};


