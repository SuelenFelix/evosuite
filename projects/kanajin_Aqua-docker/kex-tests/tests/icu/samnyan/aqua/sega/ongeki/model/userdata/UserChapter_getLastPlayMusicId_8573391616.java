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

public class UserChapter_getLastPlayMusicId_8573391616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85793;

    public UserChapter_getLastPlayMusicId_8573391616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term85799 = new Long(-6673920710396545553L);
        term85793 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term85795 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term85797 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term85813 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85814 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85818 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85828 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term85793, term85793.getClass(), "id", 6088450434923228398L);
        setLongField(term85795, term85795.getClass(), "id", 7538604659617315855L);
        setLongField(term85797, term85797.getClass(), "id", -8374850050587369525L);
        setField(term85797, term85797.getClass(), "extId", term85799);
        setField(term85797, term85797.getClass(), "luid", "BIFQrvbqSd");
        setIntField(term85814, term85814.getClass(), "year", 2024);
        setShortField(term85814, term85814.getClass(), "month", (short) 11);
        setShortField(term85814, term85814.getClass(), "day", (short) 26);
        setField(term85813, term85813.getClass(), "date", term85814);
        setByteField(term85818, term85818.getClass(), "hour", (byte) 3);
        setByteField(term85818, term85818.getClass(), "minute", (byte) 8);
        setByteField(term85818, term85818.getClass(), "second", (byte) 47);
        setIntField(term85818, term85818.getClass(), "nano", 559634968);
        setField(term85813, term85813.getClass(), "time", term85818);
        setField(term85797, term85797.getClass(), "registerTime", term85813);
        setIntField(term85824, term85824.getClass(), "year", 2018);
        setShortField(term85824, term85824.getClass(), "month", (short) 4);
        setShortField(term85824, term85824.getClass(), "day", (short) 20);
        setField(term85823, term85823.getClass(), "date", term85824);
        setByteField(term85828, term85828.getClass(), "hour", (byte) 16);
        setByteField(term85828, term85828.getClass(), "minute", (byte) 13);
        setByteField(term85828, term85828.getClass(), "second", (byte) 15);
        setIntField(term85828, term85828.getClass(), "nano", 195741881);
        setField(term85823, term85823.getClass(), "time", term85828);
        setField(term85797, term85797.getClass(), "accessTime", term85823);
        setField(term85795, term85795.getClass(), "card", term85797);
        setField(term85795, term85795.getClass(), "userName", "wcVhMnVVMH");
        setIntField(term85795, term85795.getClass(), "level", -1201954705);
        setIntField(term85795, term85795.getClass(), "reincarnationNum", -339503028);
        setLongField(term85795, term85795.getClass(), "exp", -836756629676792866L);
        setLongField(term85795, term85795.getClass(), "point", 4672991654432888841L);
        setLongField(term85795, term85795.getClass(), "totalPoint", 3076752280520665463L);
        setIntField(term85795, term85795.getClass(), "playCount", -1432328434);
        setIntField(term85795, term85795.getClass(), "jewelCount", 1166275920);
        setIntField(term85795, term85795.getClass(), "totalJewelCount", -895238659);
        setIntField(term85795, term85795.getClass(), "medalCount", -1402177219);
        setIntField(term85795, term85795.getClass(), "playerRating", -253998401);
        setIntField(term85795, term85795.getClass(), "highestRating", 325883202);
        setIntField(term85795, term85795.getClass(), "battlePoint", -206493043);
        setIntField(term85795, term85795.getClass(), "bestBattlePoint", 1965551499);
        setIntField(term85795, term85795.getClass(), "overDamageBattlePoint", -2009375732);
        setBooleanField(term85795, term85795.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term85795, term85795.getClass(), "nameplateId", 2023451839);
        setIntField(term85795, term85795.getClass(), "trophyId", 1529272966);
        setIntField(term85795, term85795.getClass(), "cardId", 1613280223);
        setIntField(term85795, term85795.getClass(), "characterId", -949788335);
        setIntField(term85795, term85795.getClass(), "characterVoiceNo", -606972786);
        setIntField(term85795, term85795.getClass(), "tabSetting", -764263155);
        setIntField(term85795, term85795.getClass(), "tabSortSetting", 1713503695);
        setIntField(term85795, term85795.getClass(), "cardCategorySetting", 316488155);
        setIntField(term85795, term85795.getClass(), "cardSortSetting", 164922289);
        setIntField(term85795, term85795.getClass(), "rivalScoreCategorySetting", -1214805826);
        setIntField(term85795, term85795.getClass(), "playedTutorialBit", 1176296583);
        setIntField(term85795, term85795.getClass(), "firstTutorialCancelNum", 801043391);
        setLongField(term85795, term85795.getClass(), "sumTechHighScore", 2416212527872886191L);
        setLongField(term85795, term85795.getClass(), "sumTechBasicHighScore", -167485056215007058L);
        setLongField(term85795, term85795.getClass(), "sumTechAdvancedHighScore", 8799846684737844264L);
        setLongField(term85795, term85795.getClass(), "sumTechExpertHighScore", 6561793945762759671L);
        setLongField(term85795, term85795.getClass(), "sumTechMasterHighScore", 7570535625157096519L);
        setLongField(term85795, term85795.getClass(), "sumTechLunaticHighScore", -5730025546264012796L);
        setLongField(term85795, term85795.getClass(), "sumBattleHighScore", -7096673502760443253L);
        setLongField(term85795, term85795.getClass(), "sumBattleBasicHighScore", -2893509529518791246L);
        setLongField(term85795, term85795.getClass(), "sumBattleAdvancedHighScore", 4257701569083510180L);
        setLongField(term85795, term85795.getClass(), "sumBattleExpertHighScore", 1504636590940802597L);
        setLongField(term85795, term85795.getClass(), "sumBattleMasterHighScore", -4151715116647923403L);
        setLongField(term85795, term85795.getClass(), "sumBattleLunaticHighScore", -3063236388589519567L);
        setField(term85795, term85795.getClass(), "eventWatchedDate", "EUWyNZxbWR");
        setField(term85795, term85795.getClass(), "cmEventWatchedDate", "TaoriKlxVP");
        setField(term85795, term85795.getClass(), "firstGameId", "CDKCMwdzTR");
        setField(term85795, term85795.getClass(), "firstRomVersion", "ehviwWrUip");
        setField(term85795, term85795.getClass(), "firstDataVersion", "LNsNBvvYgQ");
        setField(term85795, term85795.getClass(), "firstPlayDate", "VGKsvldNNB");
        setField(term85795, term85795.getClass(), "lastGameId", "pfyJIgGkiH");
        setField(term85795, term85795.getClass(), "lastRomVersion", "lvQpEwdZeM");
        setField(term85795, term85795.getClass(), "lastDataVersion", "xtNmObxmHy");
        setField(term85795, term85795.getClass(), "compatibleCmVersion", "nComTwhtzu");
        setField(term85795, term85795.getClass(), "lastPlayDate", "gXyUtfRzMt");
        setIntField(term85795, term85795.getClass(), "lastPlaceId", 786322082);
        setField(term85795, term85795.getClass(), "lastPlaceName", "RUmloTNkOF");
        setIntField(term85795, term85795.getClass(), "lastRegionId", -1051809896);
        setField(term85795, term85795.getClass(), "lastRegionName", "xlEdrgoOEf");
        setIntField(term85795, term85795.getClass(), "lastAllNetId", -1900546652);
        setField(term85795, term85795.getClass(), "lastClientId", "DfKLAuTNTf");
        setIntField(term85795, term85795.getClass(), "lastUsedDeckId", 729869031);
        setIntField(term85795, term85795.getClass(), "lastPlayMusicLevel", 79654623);
        setIntField(term85795, term85795.getClass(), "lastEmoneyBrand", 539233848);
        setField(term85793, term85793.getClass(), "user", term85795);
        setIntField(term85793, term85793.getClass(), "chapterId", -1368797597);
        setIntField(term85793, term85793.getClass(), "jewelCount", 2065515885);
        setIntField(term85793, term85793.getClass(), "lastPlayMusicCategory", -765050200);
        setIntField(term85793, term85793.getClass(), "lastPlayMusicId", 750639689);
        setIntField(term85793, term85793.getClass(), "lastPlayMusicLevel", -281279750);
        setBooleanField(term85793, term85793.getClass(), "isStoryWatched", false);
        setBooleanField(term85793, term85793.getClass(), "isClear", true);
        setIntField(term85793, term85793.getClass(), "skipTiming1", 632971563);
        setIntField(term85793, term85793.getClass(), "skipTiming2", 290690311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMusicId", argTypes, term85793, args);
    }

};


