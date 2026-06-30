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

public class UserMemoryChapter_getId_692456211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389334;

    public UserMemoryChapter_getId_692456211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term389340 = new Long(2155219577693802424L);
        term389334 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term389336 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term389338 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term389354 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term389355 = newInstance(Class.forName("java.time.LocalDate"));
        Object term389359 = newInstance(Class.forName("java.time.LocalTime"));
        Object term389364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term389365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term389369 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term389334, term389334.getClass(), "id", 386752331554862731L);
        setLongField(term389336, term389336.getClass(), "id", 7564273303666220157L);
        setLongField(term389338, term389338.getClass(), "id", -6402253663370377818L);
        setField(term389338, term389338.getClass(), "extId", term389340);
        setField(term389338, term389338.getClass(), "luid", "BHwBLzfXkS");
        setIntField(term389355, term389355.getClass(), "year", 2010);
        setShortField(term389355, term389355.getClass(), "month", (short) 7);
        setShortField(term389355, term389355.getClass(), "day", (short) 11);
        setField(term389354, term389354.getClass(), "date", term389355);
        setByteField(term389359, term389359.getClass(), "hour", (byte) 1);
        setByteField(term389359, term389359.getClass(), "minute", (byte) 34);
        setByteField(term389359, term389359.getClass(), "second", (byte) 16);
        setIntField(term389359, term389359.getClass(), "nano", 785092864);
        setField(term389354, term389354.getClass(), "time", term389359);
        setField(term389338, term389338.getClass(), "registerTime", term389354);
        setIntField(term389365, term389365.getClass(), "year", 2013);
        setShortField(term389365, term389365.getClass(), "month", (short) 1);
        setShortField(term389365, term389365.getClass(), "day", (short) 21);
        setField(term389364, term389364.getClass(), "date", term389365);
        setByteField(term389369, term389369.getClass(), "hour", (byte) 3);
        setByteField(term389369, term389369.getClass(), "minute", (byte) 21);
        setByteField(term389369, term389369.getClass(), "second", (byte) 11);
        setIntField(term389369, term389369.getClass(), "nano", 386422534);
        setField(term389364, term389364.getClass(), "time", term389369);
        setField(term389338, term389338.getClass(), "accessTime", term389364);
        setField(term389336, term389336.getClass(), "card", term389338);
        setField(term389336, term389336.getClass(), "userName", "LtxsFAlbYB");
        setIntField(term389336, term389336.getClass(), "level", -363671747);
        setIntField(term389336, term389336.getClass(), "reincarnationNum", -1326499060);
        setLongField(term389336, term389336.getClass(), "exp", -5505774854922361359L);
        setLongField(term389336, term389336.getClass(), "point", -1453102661821663747L);
        setLongField(term389336, term389336.getClass(), "totalPoint", -322651932870752650L);
        setIntField(term389336, term389336.getClass(), "playCount", 1234533117);
        setIntField(term389336, term389336.getClass(), "jewelCount", -92642794);
        setIntField(term389336, term389336.getClass(), "totalJewelCount", -22703725);
        setIntField(term389336, term389336.getClass(), "medalCount", -793446662);
        setIntField(term389336, term389336.getClass(), "playerRating", 1764254206);
        setIntField(term389336, term389336.getClass(), "highestRating", 710079737);
        setIntField(term389336, term389336.getClass(), "battlePoint", -484292966);
        setIntField(term389336, term389336.getClass(), "bestBattlePoint", -2036519048);
        setIntField(term389336, term389336.getClass(), "overDamageBattlePoint", -1798943992);
        setBooleanField(term389336, term389336.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term389336, term389336.getClass(), "nameplateId", -742525462);
        setIntField(term389336, term389336.getClass(), "trophyId", -1095204117);
        setIntField(term389336, term389336.getClass(), "cardId", 369333076);
        setIntField(term389336, term389336.getClass(), "characterId", -1281180404);
        setIntField(term389336, term389336.getClass(), "characterVoiceNo", -361910291);
        setIntField(term389336, term389336.getClass(), "tabSetting", 277711577);
        setIntField(term389336, term389336.getClass(), "tabSortSetting", 380015263);
        setIntField(term389336, term389336.getClass(), "cardCategorySetting", -1804903831);
        setIntField(term389336, term389336.getClass(), "cardSortSetting", -891672199);
        setIntField(term389336, term389336.getClass(), "rivalScoreCategorySetting", -599379607);
        setIntField(term389336, term389336.getClass(), "playedTutorialBit", -1104614567);
        setIntField(term389336, term389336.getClass(), "firstTutorialCancelNum", 1808433554);
        setLongField(term389336, term389336.getClass(), "sumTechHighScore", 7303513151483241515L);
        setLongField(term389336, term389336.getClass(), "sumTechBasicHighScore", 7261281414202834606L);
        setLongField(term389336, term389336.getClass(), "sumTechAdvancedHighScore", 8052088503852030407L);
        setLongField(term389336, term389336.getClass(), "sumTechExpertHighScore", 3815358402816799233L);
        setLongField(term389336, term389336.getClass(), "sumTechMasterHighScore", 5559926917915522830L);
        setLongField(term389336, term389336.getClass(), "sumTechLunaticHighScore", -321466481006468379L);
        setLongField(term389336, term389336.getClass(), "sumBattleHighScore", 7467903062160855743L);
        setLongField(term389336, term389336.getClass(), "sumBattleBasicHighScore", -1529727440366014625L);
        setLongField(term389336, term389336.getClass(), "sumBattleAdvancedHighScore", 2743443538869957702L);
        setLongField(term389336, term389336.getClass(), "sumBattleExpertHighScore", 1556743963096945096L);
        setLongField(term389336, term389336.getClass(), "sumBattleMasterHighScore", -5282566601503814628L);
        setLongField(term389336, term389336.getClass(), "sumBattleLunaticHighScore", 2467158560780282324L);
        setField(term389336, term389336.getClass(), "eventWatchedDate", "HqGFtZUAtW");
        setField(term389336, term389336.getClass(), "cmEventWatchedDate", "vhBXAvaiQV");
        setField(term389336, term389336.getClass(), "firstGameId", "MmUSSMGDpm");
        setField(term389336, term389336.getClass(), "firstRomVersion", "tbQAvWolIf");
        setField(term389336, term389336.getClass(), "firstDataVersion", "JhKvOJyidx");
        setField(term389336, term389336.getClass(), "firstPlayDate", "GtbWhfvEEW");
        setField(term389336, term389336.getClass(), "lastGameId", "pxxprUnDgC");
        setField(term389336, term389336.getClass(), "lastRomVersion", "ubJXxvGnCI");
        setField(term389336, term389336.getClass(), "lastDataVersion", "RndMmqNTzc");
        setField(term389336, term389336.getClass(), "compatibleCmVersion", "dUyeqQltOt");
        setField(term389336, term389336.getClass(), "lastPlayDate", "WGhBNzshcn");
        setIntField(term389336, term389336.getClass(), "lastPlaceId", -1016929720);
        setField(term389336, term389336.getClass(), "lastPlaceName", "xdOQxCPipD");
        setIntField(term389336, term389336.getClass(), "lastRegionId", 895558561);
        setField(term389336, term389336.getClass(), "lastRegionName", "cRXbaUwrSw");
        setIntField(term389336, term389336.getClass(), "lastAllNetId", -1345139349);
        setField(term389336, term389336.getClass(), "lastClientId", "AUcTKXACfV");
        setIntField(term389336, term389336.getClass(), "lastUsedDeckId", -1931422739);
        setIntField(term389336, term389336.getClass(), "lastPlayMusicLevel", -512877970);
        setIntField(term389336, term389336.getClass(), "lastEmoneyBrand", -1915476987);
        setField(term389334, term389334.getClass(), "user", term389336);
        setIntField(term389334, term389334.getClass(), "chapterId", 246204889);
        setIntField(term389334, term389334.getClass(), "jewelCount", -308951298);
        setIntField(term389334, term389334.getClass(), "lastPlayMusicCategory", -1353910611);
        setIntField(term389334, term389334.getClass(), "lastPlayMusicId", -566035874);
        setIntField(term389334, term389334.getClass(), "lastPlayMusicLevel", -117571273);
        setBooleanField(term389334, term389334.getClass(), "isDialogWatched", true);
        setBooleanField(term389334, term389334.getClass(), "isStoryWatched", false);
        setBooleanField(term389334, term389334.getClass(), "isBossWatched", false);
        setBooleanField(term389334, term389334.getClass(), "isClear", true);
        setIntField(term389334, term389334.getClass(), "gaugeId", -2080529468);
        setIntField(term389334, term389334.getClass(), "gaugeNum", -1001581049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term389334, args);
    }

};


