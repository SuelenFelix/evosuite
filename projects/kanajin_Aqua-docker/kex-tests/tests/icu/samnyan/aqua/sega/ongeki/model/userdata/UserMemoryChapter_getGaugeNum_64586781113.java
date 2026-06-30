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

public class UserMemoryChapter_getGaugeNum_64586781113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394566;

    public UserMemoryChapter_getGaugeNum_64586781113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term394572 = new Long(7716258711075652753L);
        term394566 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term394568 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term394570 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term394586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term394587 = newInstance(Class.forName("java.time.LocalDate"));
        Object term394591 = newInstance(Class.forName("java.time.LocalTime"));
        Object term394596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term394597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term394601 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term394566, term394566.getClass(), "id", 4161342594538013440L);
        setLongField(term394568, term394568.getClass(), "id", 1312631357330663214L);
        setLongField(term394570, term394570.getClass(), "id", 713741022574034502L);
        setField(term394570, term394570.getClass(), "extId", term394572);
        setField(term394570, term394570.getClass(), "luid", "yWZdWAwkaK");
        setIntField(term394587, term394587.getClass(), "year", 2017);
        setShortField(term394587, term394587.getClass(), "month", (short) 4);
        setShortField(term394587, term394587.getClass(), "day", (short) 11);
        setField(term394586, term394586.getClass(), "date", term394587);
        setByteField(term394591, term394591.getClass(), "hour", (byte) 12);
        setByteField(term394591, term394591.getClass(), "minute", (byte) 28);
        setByteField(term394591, term394591.getClass(), "second", (byte) 41);
        setIntField(term394591, term394591.getClass(), "nano", 539410307);
        setField(term394586, term394586.getClass(), "time", term394591);
        setField(term394570, term394570.getClass(), "registerTime", term394586);
        setIntField(term394597, term394597.getClass(), "year", 2023);
        setShortField(term394597, term394597.getClass(), "month", (short) 9);
        setShortField(term394597, term394597.getClass(), "day", (short) 20);
        setField(term394596, term394596.getClass(), "date", term394597);
        setByteField(term394601, term394601.getClass(), "hour", (byte) 6);
        setByteField(term394601, term394601.getClass(), "minute", (byte) 7);
        setByteField(term394601, term394601.getClass(), "second", (byte) 15);
        setIntField(term394601, term394601.getClass(), "nano", 541992675);
        setField(term394596, term394596.getClass(), "time", term394601);
        setField(term394570, term394570.getClass(), "accessTime", term394596);
        setField(term394568, term394568.getClass(), "card", term394570);
        setField(term394568, term394568.getClass(), "userName", "ufMRpHwbAc");
        setIntField(term394568, term394568.getClass(), "level", -2013136370);
        setIntField(term394568, term394568.getClass(), "reincarnationNum", -2095751104);
        setLongField(term394568, term394568.getClass(), "exp", 2684889914049833069L);
        setLongField(term394568, term394568.getClass(), "point", 3092737582558127489L);
        setLongField(term394568, term394568.getClass(), "totalPoint", -3700967396082740491L);
        setIntField(term394568, term394568.getClass(), "playCount", -1712503299);
        setIntField(term394568, term394568.getClass(), "jewelCount", -1398907893);
        setIntField(term394568, term394568.getClass(), "totalJewelCount", -119786985);
        setIntField(term394568, term394568.getClass(), "medalCount", -1287796201);
        setIntField(term394568, term394568.getClass(), "playerRating", 545754695);
        setIntField(term394568, term394568.getClass(), "highestRating", -847514286);
        setIntField(term394568, term394568.getClass(), "battlePoint", -470758296);
        setIntField(term394568, term394568.getClass(), "bestBattlePoint", 1891053417);
        setIntField(term394568, term394568.getClass(), "overDamageBattlePoint", -216494106);
        setBooleanField(term394568, term394568.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term394568, term394568.getClass(), "nameplateId", 1918715906);
        setIntField(term394568, term394568.getClass(), "trophyId", 655888624);
        setIntField(term394568, term394568.getClass(), "cardId", 999435102);
        setIntField(term394568, term394568.getClass(), "characterId", -1335452458);
        setIntField(term394568, term394568.getClass(), "characterVoiceNo", 1392833741);
        setIntField(term394568, term394568.getClass(), "tabSetting", 683342209);
        setIntField(term394568, term394568.getClass(), "tabSortSetting", -415684405);
        setIntField(term394568, term394568.getClass(), "cardCategorySetting", -736368591);
        setIntField(term394568, term394568.getClass(), "cardSortSetting", -203381816);
        setIntField(term394568, term394568.getClass(), "rivalScoreCategorySetting", 2145190871);
        setIntField(term394568, term394568.getClass(), "playedTutorialBit", 217998825);
        setIntField(term394568, term394568.getClass(), "firstTutorialCancelNum", -1769877037);
        setLongField(term394568, term394568.getClass(), "sumTechHighScore", 3775402870482316054L);
        setLongField(term394568, term394568.getClass(), "sumTechBasicHighScore", 706445567923930538L);
        setLongField(term394568, term394568.getClass(), "sumTechAdvancedHighScore", 7395018499368984599L);
        setLongField(term394568, term394568.getClass(), "sumTechExpertHighScore", 2012997396639433575L);
        setLongField(term394568, term394568.getClass(), "sumTechMasterHighScore", 6808333697500268778L);
        setLongField(term394568, term394568.getClass(), "sumTechLunaticHighScore", -4354118509903605179L);
        setLongField(term394568, term394568.getClass(), "sumBattleHighScore", -2124280462742546388L);
        setLongField(term394568, term394568.getClass(), "sumBattleBasicHighScore", 1718045375557290781L);
        setLongField(term394568, term394568.getClass(), "sumBattleAdvancedHighScore", -3660549989010197550L);
        setLongField(term394568, term394568.getClass(), "sumBattleExpertHighScore", -5661285024722117302L);
        setLongField(term394568, term394568.getClass(), "sumBattleMasterHighScore", -4949461452251682671L);
        setLongField(term394568, term394568.getClass(), "sumBattleLunaticHighScore", -5302767309235664205L);
        setField(term394568, term394568.getClass(), "eventWatchedDate", "ofUsYgHrbN");
        setField(term394568, term394568.getClass(), "cmEventWatchedDate", "OPCrVYcjnd");
        setField(term394568, term394568.getClass(), "firstGameId", "IkIhzwQpqj");
        setField(term394568, term394568.getClass(), "firstRomVersion", "gbsRjPEGbm");
        setField(term394568, term394568.getClass(), "firstDataVersion", "LgcgFQLsGN");
        setField(term394568, term394568.getClass(), "firstPlayDate", "gkUGBzYEVm");
        setField(term394568, term394568.getClass(), "lastGameId", "vRBWaMaLGB");
        setField(term394568, term394568.getClass(), "lastRomVersion", "iramtfmvAP");
        setField(term394568, term394568.getClass(), "lastDataVersion", "GPNeQEVwnF");
        setField(term394568, term394568.getClass(), "compatibleCmVersion", "LsRTfxMVvE");
        setField(term394568, term394568.getClass(), "lastPlayDate", "xmBKlKuQhy");
        setIntField(term394568, term394568.getClass(), "lastPlaceId", 569217342);
        setField(term394568, term394568.getClass(), "lastPlaceName", "fZKALTjGZF");
        setIntField(term394568, term394568.getClass(), "lastRegionId", -1235050535);
        setField(term394568, term394568.getClass(), "lastRegionName", "jKsNKLYZQw");
        setIntField(term394568, term394568.getClass(), "lastAllNetId", -1445331129);
        setField(term394568, term394568.getClass(), "lastClientId", "wKkGGhApHi");
        setIntField(term394568, term394568.getClass(), "lastUsedDeckId", -2060269503);
        setIntField(term394568, term394568.getClass(), "lastPlayMusicLevel", -1114074176);
        setIntField(term394568, term394568.getClass(), "lastEmoneyBrand", -497435106);
        setField(term394566, term394566.getClass(), "user", term394568);
        setIntField(term394566, term394566.getClass(), "chapterId", 1812542977);
        setIntField(term394566, term394566.getClass(), "jewelCount", 2028856518);
        setIntField(term394566, term394566.getClass(), "lastPlayMusicCategory", -1387270272);
        setIntField(term394566, term394566.getClass(), "lastPlayMusicId", -1688321358);
        setIntField(term394566, term394566.getClass(), "lastPlayMusicLevel", 849306930);
        setBooleanField(term394566, term394566.getClass(), "isDialogWatched", true);
        setBooleanField(term394566, term394566.getClass(), "isStoryWatched", true);
        setBooleanField(term394566, term394566.getClass(), "isBossWatched", false);
        setBooleanField(term394566, term394566.getClass(), "isClear", true);
        setIntField(term394566, term394566.getClass(), "gaugeId", 29730270);
        setIntField(term394566, term394566.getClass(), "gaugeNum", 1963887327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGaugeNum", argTypes, term394566, args);
    }

};


