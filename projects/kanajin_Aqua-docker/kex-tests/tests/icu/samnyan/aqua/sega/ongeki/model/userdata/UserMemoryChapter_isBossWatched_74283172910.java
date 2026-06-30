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

public class UserMemoryChapter_isBossWatched_74283172910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393258;

    public UserMemoryChapter_isBossWatched_74283172910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term393264 = new Long(4665980239039735158L);
        term393258 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term393260 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term393262 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term393278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term393279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term393283 = newInstance(Class.forName("java.time.LocalTime"));
        Object term393288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term393289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term393293 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term393258, term393258.getClass(), "id", -6705665497605860386L);
        setLongField(term393260, term393260.getClass(), "id", 3197734872719272103L);
        setLongField(term393262, term393262.getClass(), "id", 500226617772174121L);
        setField(term393262, term393262.getClass(), "extId", term393264);
        setField(term393262, term393262.getClass(), "luid", "CgIDMpLHUf");
        setIntField(term393279, term393279.getClass(), "year", 2017);
        setShortField(term393279, term393279.getClass(), "month", (short) 3);
        setShortField(term393279, term393279.getClass(), "day", (short) 3);
        setField(term393278, term393278.getClass(), "date", term393279);
        setByteField(term393283, term393283.getClass(), "hour", (byte) 3);
        setByteField(term393283, term393283.getClass(), "minute", (byte) 38);
        setByteField(term393283, term393283.getClass(), "second", (byte) 23);
        setIntField(term393283, term393283.getClass(), "nano", 523322909);
        setField(term393278, term393278.getClass(), "time", term393283);
        setField(term393262, term393262.getClass(), "registerTime", term393278);
        setIntField(term393289, term393289.getClass(), "year", 2016);
        setShortField(term393289, term393289.getClass(), "month", (short) 7);
        setShortField(term393289, term393289.getClass(), "day", (short) 17);
        setField(term393288, term393288.getClass(), "date", term393289);
        setByteField(term393293, term393293.getClass(), "hour", (byte) 3);
        setByteField(term393293, term393293.getClass(), "minute", (byte) 44);
        setByteField(term393293, term393293.getClass(), "second", (byte) 18);
        setIntField(term393293, term393293.getClass(), "nano", 761029754);
        setField(term393288, term393288.getClass(), "time", term393293);
        setField(term393262, term393262.getClass(), "accessTime", term393288);
        setField(term393260, term393260.getClass(), "card", term393262);
        setField(term393260, term393260.getClass(), "userName", "jOvHaukwQE");
        setIntField(term393260, term393260.getClass(), "level", 263348148);
        setIntField(term393260, term393260.getClass(), "reincarnationNum", 917497589);
        setLongField(term393260, term393260.getClass(), "exp", 5666766866781931229L);
        setLongField(term393260, term393260.getClass(), "point", 127359375245968240L);
        setLongField(term393260, term393260.getClass(), "totalPoint", 8826101634790046603L);
        setIntField(term393260, term393260.getClass(), "playCount", -1370525366);
        setIntField(term393260, term393260.getClass(), "jewelCount", 1047267337);
        setIntField(term393260, term393260.getClass(), "totalJewelCount", -771197734);
        setIntField(term393260, term393260.getClass(), "medalCount", -702988529);
        setIntField(term393260, term393260.getClass(), "playerRating", -13467198);
        setIntField(term393260, term393260.getClass(), "highestRating", 167681031);
        setIntField(term393260, term393260.getClass(), "battlePoint", -1274171569);
        setIntField(term393260, term393260.getClass(), "bestBattlePoint", -1087703702);
        setIntField(term393260, term393260.getClass(), "overDamageBattlePoint", 1259735818);
        setBooleanField(term393260, term393260.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term393260, term393260.getClass(), "nameplateId", 335126116);
        setIntField(term393260, term393260.getClass(), "trophyId", -1355585450);
        setIntField(term393260, term393260.getClass(), "cardId", -540303878);
        setIntField(term393260, term393260.getClass(), "characterId", -298987628);
        setIntField(term393260, term393260.getClass(), "characterVoiceNo", 1714599450);
        setIntField(term393260, term393260.getClass(), "tabSetting", 669147948);
        setIntField(term393260, term393260.getClass(), "tabSortSetting", 852096227);
        setIntField(term393260, term393260.getClass(), "cardCategorySetting", 409189159);
        setIntField(term393260, term393260.getClass(), "cardSortSetting", -2088630362);
        setIntField(term393260, term393260.getClass(), "rivalScoreCategorySetting", -911242168);
        setIntField(term393260, term393260.getClass(), "playedTutorialBit", 819553906);
        setIntField(term393260, term393260.getClass(), "firstTutorialCancelNum", -1208812098);
        setLongField(term393260, term393260.getClass(), "sumTechHighScore", -5828221028674344098L);
        setLongField(term393260, term393260.getClass(), "sumTechBasicHighScore", 8477488500751075152L);
        setLongField(term393260, term393260.getClass(), "sumTechAdvancedHighScore", -9141318298668677756L);
        setLongField(term393260, term393260.getClass(), "sumTechExpertHighScore", 6691895071361411350L);
        setLongField(term393260, term393260.getClass(), "sumTechMasterHighScore", 7034780785466178614L);
        setLongField(term393260, term393260.getClass(), "sumTechLunaticHighScore", -5806903111553773932L);
        setLongField(term393260, term393260.getClass(), "sumBattleHighScore", -4695361419617939533L);
        setLongField(term393260, term393260.getClass(), "sumBattleBasicHighScore", 6232814662785894682L);
        setLongField(term393260, term393260.getClass(), "sumBattleAdvancedHighScore", -2155767273076186488L);
        setLongField(term393260, term393260.getClass(), "sumBattleExpertHighScore", 8110441689725602445L);
        setLongField(term393260, term393260.getClass(), "sumBattleMasterHighScore", -9082281991821907915L);
        setLongField(term393260, term393260.getClass(), "sumBattleLunaticHighScore", 4417761383883681455L);
        setField(term393260, term393260.getClass(), "eventWatchedDate", "vTwkkAbFRS");
        setField(term393260, term393260.getClass(), "cmEventWatchedDate", "CHCEYohXRC");
        setField(term393260, term393260.getClass(), "firstGameId", "OsNzeqsDPp");
        setField(term393260, term393260.getClass(), "firstRomVersion", "qbbasjDTXB");
        setField(term393260, term393260.getClass(), "firstDataVersion", "OfBmNrKeig");
        setField(term393260, term393260.getClass(), "firstPlayDate", "rwwlHIWaEM");
        setField(term393260, term393260.getClass(), "lastGameId", "KXluiyuMzA");
        setField(term393260, term393260.getClass(), "lastRomVersion", "gPvrYCZxCD");
        setField(term393260, term393260.getClass(), "lastDataVersion", "PdbcQvEkQu");
        setField(term393260, term393260.getClass(), "compatibleCmVersion", "iRBiotLpMd");
        setField(term393260, term393260.getClass(), "lastPlayDate", "NLDuvRmgAS");
        setIntField(term393260, term393260.getClass(), "lastPlaceId", 673546274);
        setField(term393260, term393260.getClass(), "lastPlaceName", "dqZykDnAln");
        setIntField(term393260, term393260.getClass(), "lastRegionId", 898033892);
        setField(term393260, term393260.getClass(), "lastRegionName", "jLyBZSoFcU");
        setIntField(term393260, term393260.getClass(), "lastAllNetId", -776297904);
        setField(term393260, term393260.getClass(), "lastClientId", "hfTInynaFU");
        setIntField(term393260, term393260.getClass(), "lastUsedDeckId", 937390256);
        setIntField(term393260, term393260.getClass(), "lastPlayMusicLevel", 480591251);
        setIntField(term393260, term393260.getClass(), "lastEmoneyBrand", 135756476);
        setField(term393258, term393258.getClass(), "user", term393260);
        setIntField(term393258, term393258.getClass(), "chapterId", 662547956);
        setIntField(term393258, term393258.getClass(), "jewelCount", -1835292144);
        setIntField(term393258, term393258.getClass(), "lastPlayMusicCategory", -198858624);
        setIntField(term393258, term393258.getClass(), "lastPlayMusicId", -1842144235);
        setIntField(term393258, term393258.getClass(), "lastPlayMusicLevel", 1252928089);
        setBooleanField(term393258, term393258.getClass(), "isDialogWatched", false);
        setBooleanField(term393258, term393258.getClass(), "isStoryWatched", true);
        setBooleanField(term393258, term393258.getClass(), "isBossWatched", false);
        setBooleanField(term393258, term393258.getClass(), "isClear", true);
        setIntField(term393258, term393258.getClass(), "gaugeId", 24273494);
        setIntField(term393258, term393258.getClass(), "gaugeNum", 1489572547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBossWatched", argTypes, term393258, args);
    }

};


