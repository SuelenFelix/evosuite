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

public class UserMemoryChapter_setChapterId_190211229816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396299;
     Object term396575;

    public UserMemoryChapter_setChapterId_190211229816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term396305 = new Long(5817794709356277010L);
        term396299 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term396301 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term396303 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term396319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term396320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term396324 = newInstance(Class.forName("java.time.LocalTime"));
        Object term396329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term396330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term396334 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term396299, term396299.getClass(), "id", -8948819443252049963L);
        setLongField(term396301, term396301.getClass(), "id", 1453490191575429352L);
        setLongField(term396303, term396303.getClass(), "id", -3825706505085522353L);
        setField(term396303, term396303.getClass(), "extId", term396305);
        setField(term396303, term396303.getClass(), "luid", "JfozpgLGZY");
        setIntField(term396320, term396320.getClass(), "year", 2025);
        setShortField(term396320, term396320.getClass(), "month", (short) 4);
        setShortField(term396320, term396320.getClass(), "day", (short) 5);
        setField(term396319, term396319.getClass(), "date", term396320);
        setByteField(term396324, term396324.getClass(), "hour", (byte) 3);
        setByteField(term396324, term396324.getClass(), "minute", (byte) 17);
        setByteField(term396324, term396324.getClass(), "second", (byte) 50);
        setIntField(term396324, term396324.getClass(), "nano", 174847283);
        setField(term396319, term396319.getClass(), "time", term396324);
        setField(term396303, term396303.getClass(), "registerTime", term396319);
        setIntField(term396330, term396330.getClass(), "year", 2019);
        setShortField(term396330, term396330.getClass(), "month", (short) 8);
        setShortField(term396330, term396330.getClass(), "day", (short) 9);
        setField(term396329, term396329.getClass(), "date", term396330);
        setByteField(term396334, term396334.getClass(), "hour", (byte) 14);
        setByteField(term396334, term396334.getClass(), "minute", (byte) 22);
        setByteField(term396334, term396334.getClass(), "second", (byte) 37);
        setIntField(term396334, term396334.getClass(), "nano", 474796589);
        setField(term396329, term396329.getClass(), "time", term396334);
        setField(term396303, term396303.getClass(), "accessTime", term396329);
        setField(term396301, term396301.getClass(), "card", term396303);
        setField(term396301, term396301.getClass(), "userName", "tyDZqBkAQB");
        setIntField(term396301, term396301.getClass(), "level", 26422668);
        setIntField(term396301, term396301.getClass(), "reincarnationNum", -1987040291);
        setLongField(term396301, term396301.getClass(), "exp", 6860188989104917092L);
        setLongField(term396301, term396301.getClass(), "point", 6728797662264246808L);
        setLongField(term396301, term396301.getClass(), "totalPoint", -4004666427351866130L);
        setIntField(term396301, term396301.getClass(), "playCount", 2119358213);
        setIntField(term396301, term396301.getClass(), "jewelCount", 371252394);
        setIntField(term396301, term396301.getClass(), "totalJewelCount", -1051827914);
        setIntField(term396301, term396301.getClass(), "medalCount", 1218256808);
        setIntField(term396301, term396301.getClass(), "playerRating", 2063428473);
        setIntField(term396301, term396301.getClass(), "highestRating", 839387286);
        setIntField(term396301, term396301.getClass(), "battlePoint", -1448477702);
        setIntField(term396301, term396301.getClass(), "bestBattlePoint", -207710449);
        setIntField(term396301, term396301.getClass(), "overDamageBattlePoint", 1491208900);
        setBooleanField(term396301, term396301.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term396301, term396301.getClass(), "nameplateId", -79455189);
        setIntField(term396301, term396301.getClass(), "trophyId", 610526137);
        setIntField(term396301, term396301.getClass(), "cardId", 2016756854);
        setIntField(term396301, term396301.getClass(), "characterId", -1800256233);
        setIntField(term396301, term396301.getClass(), "characterVoiceNo", 1489121561);
        setIntField(term396301, term396301.getClass(), "tabSetting", -508448980);
        setIntField(term396301, term396301.getClass(), "tabSortSetting", 1036552553);
        setIntField(term396301, term396301.getClass(), "cardCategorySetting", -388523155);
        setIntField(term396301, term396301.getClass(), "cardSortSetting", 2048898622);
        setIntField(term396301, term396301.getClass(), "rivalScoreCategorySetting", -568683499);
        setIntField(term396301, term396301.getClass(), "playedTutorialBit", 524524219);
        setIntField(term396301, term396301.getClass(), "firstTutorialCancelNum", 446970592);
        setLongField(term396301, term396301.getClass(), "sumTechHighScore", -8739949290721302866L);
        setLongField(term396301, term396301.getClass(), "sumTechBasicHighScore", -115390034484396886L);
        setLongField(term396301, term396301.getClass(), "sumTechAdvancedHighScore", -3287880884177946931L);
        setLongField(term396301, term396301.getClass(), "sumTechExpertHighScore", -8637180152381266746L);
        setLongField(term396301, term396301.getClass(), "sumTechMasterHighScore", -581400228756073964L);
        setLongField(term396301, term396301.getClass(), "sumTechLunaticHighScore", 2287844117902968763L);
        setLongField(term396301, term396301.getClass(), "sumBattleHighScore", 6878259540912005351L);
        setLongField(term396301, term396301.getClass(), "sumBattleBasicHighScore", -6685795678650226734L);
        setLongField(term396301, term396301.getClass(), "sumBattleAdvancedHighScore", 7692335908639437463L);
        setLongField(term396301, term396301.getClass(), "sumBattleExpertHighScore", 3007859086830511081L);
        setLongField(term396301, term396301.getClass(), "sumBattleMasterHighScore", 2299879841219058112L);
        setLongField(term396301, term396301.getClass(), "sumBattleLunaticHighScore", -5436291262767823754L);
        setField(term396301, term396301.getClass(), "eventWatchedDate", "AkDPotKMcg");
        setField(term396301, term396301.getClass(), "cmEventWatchedDate", "kZRVQfEBtK");
        setField(term396301, term396301.getClass(), "firstGameId", "ifbyLPTCIR");
        setField(term396301, term396301.getClass(), "firstRomVersion", "pyhMdSkDLO");
        setField(term396301, term396301.getClass(), "firstDataVersion", "NqAlXymhcu");
        setField(term396301, term396301.getClass(), "firstPlayDate", "QJBNQJBeev");
        setField(term396301, term396301.getClass(), "lastGameId", "xLKzMHRydT");
        setField(term396301, term396301.getClass(), "lastRomVersion", "hUiiDwjinl");
        setField(term396301, term396301.getClass(), "lastDataVersion", "MvLmcUdgFd");
        setField(term396301, term396301.getClass(), "compatibleCmVersion", "LUhKUIbLhv");
        setField(term396301, term396301.getClass(), "lastPlayDate", "CRFsOVKQph");
        setIntField(term396301, term396301.getClass(), "lastPlaceId", -2027771281);
        setField(term396301, term396301.getClass(), "lastPlaceName", "CsujcLeixe");
        setIntField(term396301, term396301.getClass(), "lastRegionId", -1035631434);
        setField(term396301, term396301.getClass(), "lastRegionName", "DkxVqrSKkA");
        setIntField(term396301, term396301.getClass(), "lastAllNetId", 591282930);
        setField(term396301, term396301.getClass(), "lastClientId", "vEutuGOCeC");
        setIntField(term396301, term396301.getClass(), "lastUsedDeckId", -293365448);
        setIntField(term396301, term396301.getClass(), "lastPlayMusicLevel", -175390857);
        setIntField(term396301, term396301.getClass(), "lastEmoneyBrand", -1199099769);
        setField(term396299, term396299.getClass(), "user", term396301);
        setIntField(term396299, term396299.getClass(), "chapterId", -1140529438);
        setIntField(term396299, term396299.getClass(), "jewelCount", 515884741);
        setIntField(term396299, term396299.getClass(), "lastPlayMusicCategory", 705571167);
        setIntField(term396299, term396299.getClass(), "lastPlayMusicId", 411229218);
        setIntField(term396299, term396299.getClass(), "lastPlayMusicLevel", 168407191);
        setBooleanField(term396299, term396299.getClass(), "isDialogWatched", true);
        setBooleanField(term396299, term396299.getClass(), "isStoryWatched", false);
        setBooleanField(term396299, term396299.getClass(), "isBossWatched", false);
        setBooleanField(term396299, term396299.getClass(), "isClear", false);
        setIntField(term396299, term396299.getClass(), "gaugeId", -1805022866);
        setIntField(term396299, term396299.getClass(), "gaugeNum", -1981342225);
        term396575 = new Integer(116147330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term396575;
        callMethod(klass, "setChapterId", argTypes, term396299, args);
    }

};


