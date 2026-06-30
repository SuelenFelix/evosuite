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

public class UserStory_getJewelCount_2825696195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159781;

    public UserStory_getJewelCount_2825696195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term159787 = new Long(-2195061939206930224L);
        term159781 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term159783 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term159785 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term159801 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159802 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159806 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159811 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159812 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159816 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term159781, term159781.getClass(), "id", -7296521018649452L);
        setLongField(term159783, term159783.getClass(), "id", 7033590025135417127L);
        setLongField(term159785, term159785.getClass(), "id", -8535670338137566624L);
        setField(term159785, term159785.getClass(), "extId", term159787);
        setField(term159785, term159785.getClass(), "luid", "UkkxEeaUAd");
        setIntField(term159802, term159802.getClass(), "year", 2025);
        setShortField(term159802, term159802.getClass(), "month", (short) 10);
        setShortField(term159802, term159802.getClass(), "day", (short) 12);
        setField(term159801, term159801.getClass(), "date", term159802);
        setByteField(term159806, term159806.getClass(), "hour", (byte) 0);
        setByteField(term159806, term159806.getClass(), "minute", (byte) 58);
        setByteField(term159806, term159806.getClass(), "second", (byte) 44);
        setIntField(term159806, term159806.getClass(), "nano", 42807662);
        setField(term159801, term159801.getClass(), "time", term159806);
        setField(term159785, term159785.getClass(), "registerTime", term159801);
        setIntField(term159812, term159812.getClass(), "year", 2026);
        setShortField(term159812, term159812.getClass(), "month", (short) 3);
        setShortField(term159812, term159812.getClass(), "day", (short) 23);
        setField(term159811, term159811.getClass(), "date", term159812);
        setByteField(term159816, term159816.getClass(), "hour", (byte) 21);
        setByteField(term159816, term159816.getClass(), "minute", (byte) 25);
        setByteField(term159816, term159816.getClass(), "second", (byte) 41);
        setIntField(term159816, term159816.getClass(), "nano", 714890677);
        setField(term159811, term159811.getClass(), "time", term159816);
        setField(term159785, term159785.getClass(), "accessTime", term159811);
        setField(term159783, term159783.getClass(), "card", term159785);
        setField(term159783, term159783.getClass(), "userName", "YuCzAoZaux");
        setIntField(term159783, term159783.getClass(), "level", 1455387853);
        setIntField(term159783, term159783.getClass(), "reincarnationNum", -991820426);
        setLongField(term159783, term159783.getClass(), "exp", -5725007120981523482L);
        setLongField(term159783, term159783.getClass(), "point", 8434735838786581531L);
        setLongField(term159783, term159783.getClass(), "totalPoint", 7263834083570926393L);
        setIntField(term159783, term159783.getClass(), "playCount", 1097512745);
        setIntField(term159783, term159783.getClass(), "jewelCount", 449748254);
        setIntField(term159783, term159783.getClass(), "totalJewelCount", 446092014);
        setIntField(term159783, term159783.getClass(), "medalCount", 1299747957);
        setIntField(term159783, term159783.getClass(), "playerRating", 1495850839);
        setIntField(term159783, term159783.getClass(), "highestRating", -803230600);
        setIntField(term159783, term159783.getClass(), "battlePoint", -1664980170);
        setIntField(term159783, term159783.getClass(), "bestBattlePoint", -1434914663);
        setIntField(term159783, term159783.getClass(), "overDamageBattlePoint", -1057659831);
        setBooleanField(term159783, term159783.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term159783, term159783.getClass(), "nameplateId", -1734417411);
        setIntField(term159783, term159783.getClass(), "trophyId", 2082696095);
        setIntField(term159783, term159783.getClass(), "cardId", 1962199891);
        setIntField(term159783, term159783.getClass(), "characterId", 47146584);
        setIntField(term159783, term159783.getClass(), "characterVoiceNo", 2101216461);
        setIntField(term159783, term159783.getClass(), "tabSetting", 1476730674);
        setIntField(term159783, term159783.getClass(), "tabSortSetting", 1325210683);
        setIntField(term159783, term159783.getClass(), "cardCategorySetting", 794195150);
        setIntField(term159783, term159783.getClass(), "cardSortSetting", -84410522);
        setIntField(term159783, term159783.getClass(), "rivalScoreCategorySetting", 512600470);
        setIntField(term159783, term159783.getClass(), "playedTutorialBit", -694618352);
        setIntField(term159783, term159783.getClass(), "firstTutorialCancelNum", -656718439);
        setLongField(term159783, term159783.getClass(), "sumTechHighScore", -6550458274684737650L);
        setLongField(term159783, term159783.getClass(), "sumTechBasicHighScore", 1974009375418734835L);
        setLongField(term159783, term159783.getClass(), "sumTechAdvancedHighScore", 7308123421897565677L);
        setLongField(term159783, term159783.getClass(), "sumTechExpertHighScore", -4342562926436615897L);
        setLongField(term159783, term159783.getClass(), "sumTechMasterHighScore", 8435193238410123800L);
        setLongField(term159783, term159783.getClass(), "sumTechLunaticHighScore", 5942903947023249939L);
        setLongField(term159783, term159783.getClass(), "sumBattleHighScore", 5691134758421980957L);
        setLongField(term159783, term159783.getClass(), "sumBattleBasicHighScore", -7425210775721443271L);
        setLongField(term159783, term159783.getClass(), "sumBattleAdvancedHighScore", 922585489945514753L);
        setLongField(term159783, term159783.getClass(), "sumBattleExpertHighScore", -2452492363070783282L);
        setLongField(term159783, term159783.getClass(), "sumBattleMasterHighScore", 4124241067661990336L);
        setLongField(term159783, term159783.getClass(), "sumBattleLunaticHighScore", 1298941820973868632L);
        setField(term159783, term159783.getClass(), "eventWatchedDate", "ovBBNANJnh");
        setField(term159783, term159783.getClass(), "cmEventWatchedDate", "TXVFqDUypQ");
        setField(term159783, term159783.getClass(), "firstGameId", "bAuMZKiuMg");
        setField(term159783, term159783.getClass(), "firstRomVersion", "sOlEVEhJBz");
        setField(term159783, term159783.getClass(), "firstDataVersion", "PKUBbcvbbv");
        setField(term159783, term159783.getClass(), "firstPlayDate", "jrRihiCPvt");
        setField(term159783, term159783.getClass(), "lastGameId", "qlCPJWygtB");
        setField(term159783, term159783.getClass(), "lastRomVersion", "nuqtGxTogL");
        setField(term159783, term159783.getClass(), "lastDataVersion", "jaTZlmEwYn");
        setField(term159783, term159783.getClass(), "compatibleCmVersion", "YLEdXlSrOR");
        setField(term159783, term159783.getClass(), "lastPlayDate", "yiNDXYaPYF");
        setIntField(term159783, term159783.getClass(), "lastPlaceId", 1609229129);
        setField(term159783, term159783.getClass(), "lastPlaceName", "lQfbJGzgkN");
        setIntField(term159783, term159783.getClass(), "lastRegionId", 558262249);
        setField(term159783, term159783.getClass(), "lastRegionName", "vCTyZdNoZR");
        setIntField(term159783, term159783.getClass(), "lastAllNetId", 105201149);
        setField(term159783, term159783.getClass(), "lastClientId", "CUvKslUjGD");
        setIntField(term159783, term159783.getClass(), "lastUsedDeckId", 848802875);
        setIntField(term159783, term159783.getClass(), "lastPlayMusicLevel", 103720158);
        setIntField(term159783, term159783.getClass(), "lastEmoneyBrand", 1049168594);
        setField(term159781, term159781.getClass(), "user", term159783);
        setIntField(term159781, term159781.getClass(), "storyId", 1078375453);
        setIntField(term159781, term159781.getClass(), "lastChapterId", 687029252);
        setIntField(term159781, term159781.getClass(), "jewelCount", -289940076);
        setIntField(term159781, term159781.getClass(), "lastPlayMusicId", -438583850);
        setIntField(term159781, term159781.getClass(), "lastPlayMusicCategory", 246166593);
        setIntField(term159781, term159781.getClass(), "lastPlayMusicLevel", -1806147197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJewelCount", argTypes, term159781, args);
    }

};


