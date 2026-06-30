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

public class UserChapter_setLastPlayMusicLevel_132923919418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91434;
     Object term91708;

    public UserChapter_setLastPlayMusicLevel_132923919418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term91440 = new Long(4199886998224701110L);
        term91434 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term91436 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term91438 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term91454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91469 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term91434, term91434.getClass(), "id", -6384638601613937294L);
        setLongField(term91436, term91436.getClass(), "id", -2341674103251376130L);
        setLongField(term91438, term91438.getClass(), "id", -7249496366136681891L);
        setField(term91438, term91438.getClass(), "extId", term91440);
        setField(term91438, term91438.getClass(), "luid", "WPaMGzqiDs");
        setIntField(term91455, term91455.getClass(), "year", 2025);
        setShortField(term91455, term91455.getClass(), "month", (short) 8);
        setShortField(term91455, term91455.getClass(), "day", (short) 4);
        setField(term91454, term91454.getClass(), "date", term91455);
        setByteField(term91459, term91459.getClass(), "hour", (byte) 7);
        setByteField(term91459, term91459.getClass(), "minute", (byte) 29);
        setByteField(term91459, term91459.getClass(), "second", (byte) 4);
        setIntField(term91459, term91459.getClass(), "nano", 175288511);
        setField(term91454, term91454.getClass(), "time", term91459);
        setField(term91438, term91438.getClass(), "registerTime", term91454);
        setIntField(term91465, term91465.getClass(), "year", 2029);
        setShortField(term91465, term91465.getClass(), "month", (short) 9);
        setShortField(term91465, term91465.getClass(), "day", (short) 1);
        setField(term91464, term91464.getClass(), "date", term91465);
        setByteField(term91469, term91469.getClass(), "hour", (byte) 19);
        setByteField(term91469, term91469.getClass(), "minute", (byte) 56);
        setByteField(term91469, term91469.getClass(), "second", (byte) 46);
        setIntField(term91469, term91469.getClass(), "nano", 657110114);
        setField(term91464, term91464.getClass(), "time", term91469);
        setField(term91438, term91438.getClass(), "accessTime", term91464);
        setField(term91436, term91436.getClass(), "card", term91438);
        setField(term91436, term91436.getClass(), "userName", "YtgjAWKCrQ");
        setIntField(term91436, term91436.getClass(), "level", 2097371569);
        setIntField(term91436, term91436.getClass(), "reincarnationNum", -10808205);
        setLongField(term91436, term91436.getClass(), "exp", 7470377993428674715L);
        setLongField(term91436, term91436.getClass(), "point", 8607992547586311637L);
        setLongField(term91436, term91436.getClass(), "totalPoint", -705228244449989156L);
        setIntField(term91436, term91436.getClass(), "playCount", -774591519);
        setIntField(term91436, term91436.getClass(), "jewelCount", 1785308866);
        setIntField(term91436, term91436.getClass(), "totalJewelCount", 1881022849);
        setIntField(term91436, term91436.getClass(), "medalCount", -1443744876);
        setIntField(term91436, term91436.getClass(), "playerRating", 1913818780);
        setIntField(term91436, term91436.getClass(), "highestRating", 2106340511);
        setIntField(term91436, term91436.getClass(), "battlePoint", 1742847722);
        setIntField(term91436, term91436.getClass(), "bestBattlePoint", 1423922857);
        setIntField(term91436, term91436.getClass(), "overDamageBattlePoint", 1181177739);
        setBooleanField(term91436, term91436.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term91436, term91436.getClass(), "nameplateId", -1721345168);
        setIntField(term91436, term91436.getClass(), "trophyId", -776806272);
        setIntField(term91436, term91436.getClass(), "cardId", -495130634);
        setIntField(term91436, term91436.getClass(), "characterId", -1517420629);
        setIntField(term91436, term91436.getClass(), "characterVoiceNo", 910419690);
        setIntField(term91436, term91436.getClass(), "tabSetting", 647300506);
        setIntField(term91436, term91436.getClass(), "tabSortSetting", -2110644158);
        setIntField(term91436, term91436.getClass(), "cardCategorySetting", -354120577);
        setIntField(term91436, term91436.getClass(), "cardSortSetting", 943350345);
        setIntField(term91436, term91436.getClass(), "rivalScoreCategorySetting", -1526651923);
        setIntField(term91436, term91436.getClass(), "playedTutorialBit", -1797724758);
        setIntField(term91436, term91436.getClass(), "firstTutorialCancelNum", 2137942105);
        setLongField(term91436, term91436.getClass(), "sumTechHighScore", 6210903460142550841L);
        setLongField(term91436, term91436.getClass(), "sumTechBasicHighScore", 6382689199350893487L);
        setLongField(term91436, term91436.getClass(), "sumTechAdvancedHighScore", 2335919891878722978L);
        setLongField(term91436, term91436.getClass(), "sumTechExpertHighScore", -79820031844738282L);
        setLongField(term91436, term91436.getClass(), "sumTechMasterHighScore", 6299176426687603491L);
        setLongField(term91436, term91436.getClass(), "sumTechLunaticHighScore", -7995639033732034295L);
        setLongField(term91436, term91436.getClass(), "sumBattleHighScore", 1698550456036894801L);
        setLongField(term91436, term91436.getClass(), "sumBattleBasicHighScore", -755873014166134886L);
        setLongField(term91436, term91436.getClass(), "sumBattleAdvancedHighScore", -4507951494272939003L);
        setLongField(term91436, term91436.getClass(), "sumBattleExpertHighScore", 6550082156210963802L);
        setLongField(term91436, term91436.getClass(), "sumBattleMasterHighScore", -5687779163165910176L);
        setLongField(term91436, term91436.getClass(), "sumBattleLunaticHighScore", -8899288939680518405L);
        setField(term91436, term91436.getClass(), "eventWatchedDate", "dVyyhFtNgV");
        setField(term91436, term91436.getClass(), "cmEventWatchedDate", "YBBxUpUwzX");
        setField(term91436, term91436.getClass(), "firstGameId", "ZujOTiubuf");
        setField(term91436, term91436.getClass(), "firstRomVersion", "groJdWOLGJ");
        setField(term91436, term91436.getClass(), "firstDataVersion", "zzCCDeuyOo");
        setField(term91436, term91436.getClass(), "firstPlayDate", "ixrDOyTkCB");
        setField(term91436, term91436.getClass(), "lastGameId", "PvrMbFoCJF");
        setField(term91436, term91436.getClass(), "lastRomVersion", "UJOrVYoraU");
        setField(term91436, term91436.getClass(), "lastDataVersion", "iVSQwPmTaa");
        setField(term91436, term91436.getClass(), "compatibleCmVersion", "ZGRjCkxZnF");
        setField(term91436, term91436.getClass(), "lastPlayDate", "qntIiXdFTu");
        setIntField(term91436, term91436.getClass(), "lastPlaceId", 925222207);
        setField(term91436, term91436.getClass(), "lastPlaceName", "qneYYcRNxx");
        setIntField(term91436, term91436.getClass(), "lastRegionId", 63865718);
        setField(term91436, term91436.getClass(), "lastRegionName", "UampjCLvRN");
        setIntField(term91436, term91436.getClass(), "lastAllNetId", 2107786162);
        setField(term91436, term91436.getClass(), "lastClientId", "EsQWMjShML");
        setIntField(term91436, term91436.getClass(), "lastUsedDeckId", 426605276);
        setIntField(term91436, term91436.getClass(), "lastPlayMusicLevel", 814644265);
        setIntField(term91436, term91436.getClass(), "lastEmoneyBrand", -2072841059);
        setField(term91434, term91434.getClass(), "user", term91436);
        setIntField(term91434, term91434.getClass(), "chapterId", 960614556);
        setIntField(term91434, term91434.getClass(), "jewelCount", 1482016188);
        setIntField(term91434, term91434.getClass(), "lastPlayMusicCategory", 1240153987);
        setIntField(term91434, term91434.getClass(), "lastPlayMusicId", 126731415);
        setIntField(term91434, term91434.getClass(), "lastPlayMusicLevel", -119958532);
        setBooleanField(term91434, term91434.getClass(), "isStoryWatched", false);
        setBooleanField(term91434, term91434.getClass(), "isClear", true);
        setIntField(term91434, term91434.getClass(), "skipTiming1", -1797813817);
        setIntField(term91434, term91434.getClass(), "skipTiming2", 434400926);
        term91708 = new Integer(2013467659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term91708;
        callMethod(klass, "setLastPlayMusicLevel", argTypes, term91434, args);
    }

};


