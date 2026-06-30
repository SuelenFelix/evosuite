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

public class UserMusicDetail_getMusicId_1918847943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405053;

    public UserMusicDetail_getMusicId_1918847943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term405059 = new Long(7016651719770171901L);
        term405053 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term405055 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term405057 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term405073 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term405074 = newInstance(Class.forName("java.time.LocalDate"));
        Object term405078 = newInstance(Class.forName("java.time.LocalTime"));
        Object term405083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term405084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term405088 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term405053, term405053.getClass(), "id", 3893749781941066423L);
        setLongField(term405055, term405055.getClass(), "id", 6807296582805319307L);
        setLongField(term405057, term405057.getClass(), "id", -6973513350312993881L);
        setField(term405057, term405057.getClass(), "extId", term405059);
        setField(term405057, term405057.getClass(), "luid", "cdAxQaQHBU");
        setIntField(term405074, term405074.getClass(), "year", 2014);
        setShortField(term405074, term405074.getClass(), "month", (short) 8);
        setShortField(term405074, term405074.getClass(), "day", (short) 14);
        setField(term405073, term405073.getClass(), "date", term405074);
        setByteField(term405078, term405078.getClass(), "hour", (byte) 7);
        setByteField(term405078, term405078.getClass(), "minute", (byte) 13);
        setByteField(term405078, term405078.getClass(), "second", (byte) 55);
        setIntField(term405078, term405078.getClass(), "nano", 81566526);
        setField(term405073, term405073.getClass(), "time", term405078);
        setField(term405057, term405057.getClass(), "registerTime", term405073);
        setIntField(term405084, term405084.getClass(), "year", 2025);
        setShortField(term405084, term405084.getClass(), "month", (short) 7);
        setShortField(term405084, term405084.getClass(), "day", (short) 2);
        setField(term405083, term405083.getClass(), "date", term405084);
        setByteField(term405088, term405088.getClass(), "hour", (byte) 16);
        setByteField(term405088, term405088.getClass(), "minute", (byte) 12);
        setByteField(term405088, term405088.getClass(), "second", (byte) 51);
        setIntField(term405088, term405088.getClass(), "nano", 833941622);
        setField(term405083, term405083.getClass(), "time", term405088);
        setField(term405057, term405057.getClass(), "accessTime", term405083);
        setField(term405055, term405055.getClass(), "card", term405057);
        setField(term405055, term405055.getClass(), "userName", "CgtxuAwbdL");
        setIntField(term405055, term405055.getClass(), "level", -2122070333);
        setIntField(term405055, term405055.getClass(), "reincarnationNum", -369584553);
        setLongField(term405055, term405055.getClass(), "exp", 8559326440221191693L);
        setLongField(term405055, term405055.getClass(), "point", -7319992795474227745L);
        setLongField(term405055, term405055.getClass(), "totalPoint", 8562150791832814583L);
        setIntField(term405055, term405055.getClass(), "playCount", -1707507725);
        setIntField(term405055, term405055.getClass(), "jewelCount", -362337094);
        setIntField(term405055, term405055.getClass(), "totalJewelCount", 1321475995);
        setIntField(term405055, term405055.getClass(), "medalCount", -1499710218);
        setIntField(term405055, term405055.getClass(), "playerRating", -1861124511);
        setIntField(term405055, term405055.getClass(), "highestRating", -1800901601);
        setIntField(term405055, term405055.getClass(), "battlePoint", -27455687);
        setIntField(term405055, term405055.getClass(), "bestBattlePoint", -328096410);
        setIntField(term405055, term405055.getClass(), "overDamageBattlePoint", 2097759295);
        setBooleanField(term405055, term405055.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term405055, term405055.getClass(), "nameplateId", -700827970);
        setIntField(term405055, term405055.getClass(), "trophyId", -1167710068);
        setIntField(term405055, term405055.getClass(), "cardId", 1164312223);
        setIntField(term405055, term405055.getClass(), "characterId", 716499737);
        setIntField(term405055, term405055.getClass(), "characterVoiceNo", -2051020199);
        setIntField(term405055, term405055.getClass(), "tabSetting", 1584712189);
        setIntField(term405055, term405055.getClass(), "tabSortSetting", -1981426032);
        setIntField(term405055, term405055.getClass(), "cardCategorySetting", 342610564);
        setIntField(term405055, term405055.getClass(), "cardSortSetting", 950575062);
        setIntField(term405055, term405055.getClass(), "rivalScoreCategorySetting", 1105891814);
        setIntField(term405055, term405055.getClass(), "playedTutorialBit", 1943332743);
        setIntField(term405055, term405055.getClass(), "firstTutorialCancelNum", -1467814983);
        setLongField(term405055, term405055.getClass(), "sumTechHighScore", 2029233416534236849L);
        setLongField(term405055, term405055.getClass(), "sumTechBasicHighScore", -4979285821366810599L);
        setLongField(term405055, term405055.getClass(), "sumTechAdvancedHighScore", 6383198918476424929L);
        setLongField(term405055, term405055.getClass(), "sumTechExpertHighScore", -1185168739583572533L);
        setLongField(term405055, term405055.getClass(), "sumTechMasterHighScore", -4221295278052243097L);
        setLongField(term405055, term405055.getClass(), "sumTechLunaticHighScore", 1908480098967503445L);
        setLongField(term405055, term405055.getClass(), "sumBattleHighScore", 1939409221013600883L);
        setLongField(term405055, term405055.getClass(), "sumBattleBasicHighScore", 6650512235487380881L);
        setLongField(term405055, term405055.getClass(), "sumBattleAdvancedHighScore", -8796965023246191952L);
        setLongField(term405055, term405055.getClass(), "sumBattleExpertHighScore", 7146866325263763663L);
        setLongField(term405055, term405055.getClass(), "sumBattleMasterHighScore", -2840005887862287668L);
        setLongField(term405055, term405055.getClass(), "sumBattleLunaticHighScore", 7909964535341297656L);
        setField(term405055, term405055.getClass(), "eventWatchedDate", "mLFpedJpAk");
        setField(term405055, term405055.getClass(), "cmEventWatchedDate", "rlVfpqKXwT");
        setField(term405055, term405055.getClass(), "firstGameId", "BeosXysVnK");
        setField(term405055, term405055.getClass(), "firstRomVersion", "teMxzirnko");
        setField(term405055, term405055.getClass(), "firstDataVersion", "QOKTMwMxwo");
        setField(term405055, term405055.getClass(), "firstPlayDate", "dzsbIHLHUR");
        setField(term405055, term405055.getClass(), "lastGameId", "iCQeslwoSk");
        setField(term405055, term405055.getClass(), "lastRomVersion", "YcYDgihIBS");
        setField(term405055, term405055.getClass(), "lastDataVersion", "XEOwHowFcA");
        setField(term405055, term405055.getClass(), "compatibleCmVersion", "eWqLwGXqDv");
        setField(term405055, term405055.getClass(), "lastPlayDate", "uXVGgqbsML");
        setIntField(term405055, term405055.getClass(), "lastPlaceId", -1906814651);
        setField(term405055, term405055.getClass(), "lastPlaceName", "hWSHBxVekP");
        setIntField(term405055, term405055.getClass(), "lastRegionId", -1269684667);
        setField(term405055, term405055.getClass(), "lastRegionName", "PeuOitJqIN");
        setIntField(term405055, term405055.getClass(), "lastAllNetId", 527095765);
        setField(term405055, term405055.getClass(), "lastClientId", "iPbscRHExP");
        setIntField(term405055, term405055.getClass(), "lastUsedDeckId", 1588046439);
        setIntField(term405055, term405055.getClass(), "lastPlayMusicLevel", -676406238);
        setIntField(term405055, term405055.getClass(), "lastEmoneyBrand", -1399569492);
        setField(term405053, term405053.getClass(), "user", term405055);
        setIntField(term405053, term405053.getClass(), "musicId", -1322659919);
        setIntField(term405053, term405053.getClass(), "level", -759648572);
        setIntField(term405053, term405053.getClass(), "playCount", 1350984662);
        setIntField(term405053, term405053.getClass(), "techScoreMax", 435832700);
        setIntField(term405053, term405053.getClass(), "techScoreRank", -1676801700);
        setIntField(term405053, term405053.getClass(), "battleScoreMax", 2075557092);
        setIntField(term405053, term405053.getClass(), "battleScoreRank", 576116867);
        setIntField(term405053, term405053.getClass(), "maxComboCount", 596814162);
        setIntField(term405053, term405053.getClass(), "maxOverKill", 1935916934);
        setIntField(term405053, term405053.getClass(), "maxTeamOverKill", -1271409330);
        setBooleanField(term405053, term405053.getClass(), "isFullBell", false);
        setBooleanField(term405053, term405053.getClass(), "isFullCombo", false);
        setBooleanField(term405053, term405053.getClass(), "isAllBreake", false);
        setBooleanField(term405053, term405053.getClass(), "isLock", true);
        setIntField(term405053, term405053.getClass(), "clearStatus", -2050710016);
        setBooleanField(term405053, term405053.getClass(), "isStoryWatched", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term405053, args);
    }

};


