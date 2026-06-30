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

public class UserMemoryChapter_setLastPlayMusicLevel_57652954120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398051;
     Object term398327;

    public UserMemoryChapter_setLastPlayMusicLevel_57652954120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term398057 = new Long(7840243516767232066L);
        term398051 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term398053 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term398055 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term398071 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term398072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term398076 = newInstance(Class.forName("java.time.LocalTime"));
        Object term398081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term398082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term398086 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term398051, term398051.getClass(), "id", 5304684043785467921L);
        setLongField(term398053, term398053.getClass(), "id", -1990823654925056118L);
        setLongField(term398055, term398055.getClass(), "id", 7715295835447619393L);
        setField(term398055, term398055.getClass(), "extId", term398057);
        setField(term398055, term398055.getClass(), "luid", "fQdIjEWknz");
        setIntField(term398072, term398072.getClass(), "year", 2024);
        setShortField(term398072, term398072.getClass(), "month", (short) 4);
        setShortField(term398072, term398072.getClass(), "day", (short) 28);
        setField(term398071, term398071.getClass(), "date", term398072);
        setByteField(term398076, term398076.getClass(), "hour", (byte) 13);
        setByteField(term398076, term398076.getClass(), "minute", (byte) 46);
        setByteField(term398076, term398076.getClass(), "second", (byte) 31);
        setIntField(term398076, term398076.getClass(), "nano", 344074294);
        setField(term398071, term398071.getClass(), "time", term398076);
        setField(term398055, term398055.getClass(), "registerTime", term398071);
        setIntField(term398082, term398082.getClass(), "year", 2022);
        setShortField(term398082, term398082.getClass(), "month", (short) 9);
        setShortField(term398082, term398082.getClass(), "day", (short) 30);
        setField(term398081, term398081.getClass(), "date", term398082);
        setByteField(term398086, term398086.getClass(), "hour", (byte) 1);
        setByteField(term398086, term398086.getClass(), "minute", (byte) 7);
        setByteField(term398086, term398086.getClass(), "second", (byte) 13);
        setIntField(term398086, term398086.getClass(), "nano", 662975228);
        setField(term398081, term398081.getClass(), "time", term398086);
        setField(term398055, term398055.getClass(), "accessTime", term398081);
        setField(term398053, term398053.getClass(), "card", term398055);
        setField(term398053, term398053.getClass(), "userName", "DNkuFbtlYE");
        setIntField(term398053, term398053.getClass(), "level", -1561814618);
        setIntField(term398053, term398053.getClass(), "reincarnationNum", 1268969194);
        setLongField(term398053, term398053.getClass(), "exp", -4054765433548197329L);
        setLongField(term398053, term398053.getClass(), "point", -536182069079325955L);
        setLongField(term398053, term398053.getClass(), "totalPoint", -8007150686430531542L);
        setIntField(term398053, term398053.getClass(), "playCount", -2000414074);
        setIntField(term398053, term398053.getClass(), "jewelCount", 912732556);
        setIntField(term398053, term398053.getClass(), "totalJewelCount", -1223285112);
        setIntField(term398053, term398053.getClass(), "medalCount", 1843235022);
        setIntField(term398053, term398053.getClass(), "playerRating", -1872815321);
        setIntField(term398053, term398053.getClass(), "highestRating", -1956760762);
        setIntField(term398053, term398053.getClass(), "battlePoint", -1303691132);
        setIntField(term398053, term398053.getClass(), "bestBattlePoint", -1959514555);
        setIntField(term398053, term398053.getClass(), "overDamageBattlePoint", 1296051500);
        setBooleanField(term398053, term398053.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term398053, term398053.getClass(), "nameplateId", -384598356);
        setIntField(term398053, term398053.getClass(), "trophyId", 787239006);
        setIntField(term398053, term398053.getClass(), "cardId", -1146003871);
        setIntField(term398053, term398053.getClass(), "characterId", 1142520547);
        setIntField(term398053, term398053.getClass(), "characterVoiceNo", -1198425650);
        setIntField(term398053, term398053.getClass(), "tabSetting", 1003180470);
        setIntField(term398053, term398053.getClass(), "tabSortSetting", -543745263);
        setIntField(term398053, term398053.getClass(), "cardCategorySetting", 1031994123);
        setIntField(term398053, term398053.getClass(), "cardSortSetting", 865844419);
        setIntField(term398053, term398053.getClass(), "rivalScoreCategorySetting", 888102268);
        setIntField(term398053, term398053.getClass(), "playedTutorialBit", 1839797378);
        setIntField(term398053, term398053.getClass(), "firstTutorialCancelNum", 1991950945);
        setLongField(term398053, term398053.getClass(), "sumTechHighScore", 9204718033380852255L);
        setLongField(term398053, term398053.getClass(), "sumTechBasicHighScore", 3667236367126773538L);
        setLongField(term398053, term398053.getClass(), "sumTechAdvancedHighScore", -3845936146638753974L);
        setLongField(term398053, term398053.getClass(), "sumTechExpertHighScore", -9033517055261545771L);
        setLongField(term398053, term398053.getClass(), "sumTechMasterHighScore", -2039415660848937066L);
        setLongField(term398053, term398053.getClass(), "sumTechLunaticHighScore", -5288308497989947812L);
        setLongField(term398053, term398053.getClass(), "sumBattleHighScore", -7824771278445605005L);
        setLongField(term398053, term398053.getClass(), "sumBattleBasicHighScore", 3924227041181820339L);
        setLongField(term398053, term398053.getClass(), "sumBattleAdvancedHighScore", 6299628643468364230L);
        setLongField(term398053, term398053.getClass(), "sumBattleExpertHighScore", -3437796750132882567L);
        setLongField(term398053, term398053.getClass(), "sumBattleMasterHighScore", -8883327576327176872L);
        setLongField(term398053, term398053.getClass(), "sumBattleLunaticHighScore", 545211381451685619L);
        setField(term398053, term398053.getClass(), "eventWatchedDate", "mNUPfWkrhs");
        setField(term398053, term398053.getClass(), "cmEventWatchedDate", "pvSiFGfUmf");
        setField(term398053, term398053.getClass(), "firstGameId", "OeZDaeUAJr");
        setField(term398053, term398053.getClass(), "firstRomVersion", "heApQOGVtW");
        setField(term398053, term398053.getClass(), "firstDataVersion", "fkifcQASow");
        setField(term398053, term398053.getClass(), "firstPlayDate", "euRVCcdTFR");
        setField(term398053, term398053.getClass(), "lastGameId", "BWKdZqbFqx");
        setField(term398053, term398053.getClass(), "lastRomVersion", "HyADgRrNVw");
        setField(term398053, term398053.getClass(), "lastDataVersion", "ijkXfNPkuR");
        setField(term398053, term398053.getClass(), "compatibleCmVersion", "wNwyPUEMgt");
        setField(term398053, term398053.getClass(), "lastPlayDate", "TMbwtNhpQx");
        setIntField(term398053, term398053.getClass(), "lastPlaceId", 2085406117);
        setField(term398053, term398053.getClass(), "lastPlaceName", "EYUCqLEUHo");
        setIntField(term398053, term398053.getClass(), "lastRegionId", -316282975);
        setField(term398053, term398053.getClass(), "lastRegionName", "xfpasOtrDI");
        setIntField(term398053, term398053.getClass(), "lastAllNetId", -1654413631);
        setField(term398053, term398053.getClass(), "lastClientId", "hupBQOyxPr");
        setIntField(term398053, term398053.getClass(), "lastUsedDeckId", 237001338);
        setIntField(term398053, term398053.getClass(), "lastPlayMusicLevel", -2129893152);
        setIntField(term398053, term398053.getClass(), "lastEmoneyBrand", -1652710382);
        setField(term398051, term398051.getClass(), "user", term398053);
        setIntField(term398051, term398051.getClass(), "chapterId", 1894944164);
        setIntField(term398051, term398051.getClass(), "jewelCount", 1963864531);
        setIntField(term398051, term398051.getClass(), "lastPlayMusicCategory", 2068218284);
        setIntField(term398051, term398051.getClass(), "lastPlayMusicId", 760628961);
        setIntField(term398051, term398051.getClass(), "lastPlayMusicLevel", -763071766);
        setBooleanField(term398051, term398051.getClass(), "isDialogWatched", false);
        setBooleanField(term398051, term398051.getClass(), "isStoryWatched", true);
        setBooleanField(term398051, term398051.getClass(), "isBossWatched", true);
        setBooleanField(term398051, term398051.getClass(), "isClear", false);
        setIntField(term398051, term398051.getClass(), "gaugeId", 1062304038);
        setIntField(term398051, term398051.getClass(), "gaugeNum", -675436841);
        term398327 = new Integer(145724357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term398327;
        callMethod(klass, "setLastPlayMusicLevel", argTypes, term398051, args);
    }

};


