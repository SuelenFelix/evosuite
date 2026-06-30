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

public class UserMemoryChapter_isStoryWatched_13024044199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392822;

    public UserMemoryChapter_isStoryWatched_13024044199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term392828 = new Long(-3684549603148553700L);
        term392822 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term392824 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term392826 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term392842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term392843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term392847 = newInstance(Class.forName("java.time.LocalTime"));
        Object term392852 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term392853 = newInstance(Class.forName("java.time.LocalDate"));
        Object term392857 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term392822, term392822.getClass(), "id", -8100617172874490521L);
        setLongField(term392824, term392824.getClass(), "id", -3659440908284951671L);
        setLongField(term392826, term392826.getClass(), "id", -7765047844820629139L);
        setField(term392826, term392826.getClass(), "extId", term392828);
        setField(term392826, term392826.getClass(), "luid", "QSFBFIKDuA");
        setIntField(term392843, term392843.getClass(), "year", 2016);
        setShortField(term392843, term392843.getClass(), "month", (short) 7);
        setShortField(term392843, term392843.getClass(), "day", (short) 21);
        setField(term392842, term392842.getClass(), "date", term392843);
        setByteField(term392847, term392847.getClass(), "hour", (byte) 14);
        setByteField(term392847, term392847.getClass(), "minute", (byte) 40);
        setByteField(term392847, term392847.getClass(), "second", (byte) 6);
        setIntField(term392847, term392847.getClass(), "nano", 100705510);
        setField(term392842, term392842.getClass(), "time", term392847);
        setField(term392826, term392826.getClass(), "registerTime", term392842);
        setIntField(term392853, term392853.getClass(), "year", 2028);
        setShortField(term392853, term392853.getClass(), "month", (short) 9);
        setShortField(term392853, term392853.getClass(), "day", (short) 23);
        setField(term392852, term392852.getClass(), "date", term392853);
        setByteField(term392857, term392857.getClass(), "hour", (byte) 12);
        setByteField(term392857, term392857.getClass(), "minute", (byte) 0);
        setByteField(term392857, term392857.getClass(), "second", (byte) 6);
        setIntField(term392857, term392857.getClass(), "nano", 531523723);
        setField(term392852, term392852.getClass(), "time", term392857);
        setField(term392826, term392826.getClass(), "accessTime", term392852);
        setField(term392824, term392824.getClass(), "card", term392826);
        setField(term392824, term392824.getClass(), "userName", "RcrOmqAXJy");
        setIntField(term392824, term392824.getClass(), "level", -2007780750);
        setIntField(term392824, term392824.getClass(), "reincarnationNum", 1221975918);
        setLongField(term392824, term392824.getClass(), "exp", 8383786494956136808L);
        setLongField(term392824, term392824.getClass(), "point", 5771210429423801585L);
        setLongField(term392824, term392824.getClass(), "totalPoint", -5863172386644874673L);
        setIntField(term392824, term392824.getClass(), "playCount", 513493935);
        setIntField(term392824, term392824.getClass(), "jewelCount", -1767161654);
        setIntField(term392824, term392824.getClass(), "totalJewelCount", 82348663);
        setIntField(term392824, term392824.getClass(), "medalCount", 997084638);
        setIntField(term392824, term392824.getClass(), "playerRating", -291591105);
        setIntField(term392824, term392824.getClass(), "highestRating", 998629722);
        setIntField(term392824, term392824.getClass(), "battlePoint", -688820743);
        setIntField(term392824, term392824.getClass(), "bestBattlePoint", -1763005304);
        setIntField(term392824, term392824.getClass(), "overDamageBattlePoint", 773141457);
        setBooleanField(term392824, term392824.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term392824, term392824.getClass(), "nameplateId", -34864949);
        setIntField(term392824, term392824.getClass(), "trophyId", 2133376564);
        setIntField(term392824, term392824.getClass(), "cardId", 791762740);
        setIntField(term392824, term392824.getClass(), "characterId", 689875911);
        setIntField(term392824, term392824.getClass(), "characterVoiceNo", 720543916);
        setIntField(term392824, term392824.getClass(), "tabSetting", 787706938);
        setIntField(term392824, term392824.getClass(), "tabSortSetting", -1671495540);
        setIntField(term392824, term392824.getClass(), "cardCategorySetting", 2019126805);
        setIntField(term392824, term392824.getClass(), "cardSortSetting", 907353244);
        setIntField(term392824, term392824.getClass(), "rivalScoreCategorySetting", -1549966858);
        setIntField(term392824, term392824.getClass(), "playedTutorialBit", 495450314);
        setIntField(term392824, term392824.getClass(), "firstTutorialCancelNum", 2023962589);
        setLongField(term392824, term392824.getClass(), "sumTechHighScore", -419663668545840258L);
        setLongField(term392824, term392824.getClass(), "sumTechBasicHighScore", 6945210364634324001L);
        setLongField(term392824, term392824.getClass(), "sumTechAdvancedHighScore", 6777084224967766719L);
        setLongField(term392824, term392824.getClass(), "sumTechExpertHighScore", -7827540310243817048L);
        setLongField(term392824, term392824.getClass(), "sumTechMasterHighScore", 2699582055130560033L);
        setLongField(term392824, term392824.getClass(), "sumTechLunaticHighScore", 4844673580466139355L);
        setLongField(term392824, term392824.getClass(), "sumBattleHighScore", -3377436235292018505L);
        setLongField(term392824, term392824.getClass(), "sumBattleBasicHighScore", -2947150639083970205L);
        setLongField(term392824, term392824.getClass(), "sumBattleAdvancedHighScore", 1665748343853232478L);
        setLongField(term392824, term392824.getClass(), "sumBattleExpertHighScore", -5806587400708685989L);
        setLongField(term392824, term392824.getClass(), "sumBattleMasterHighScore", -6358992007411333855L);
        setLongField(term392824, term392824.getClass(), "sumBattleLunaticHighScore", 7536042680141246039L);
        setField(term392824, term392824.getClass(), "eventWatchedDate", "eWAJSQqtUy");
        setField(term392824, term392824.getClass(), "cmEventWatchedDate", "jWWzpOSZYQ");
        setField(term392824, term392824.getClass(), "firstGameId", "EOnRdOrAGC");
        setField(term392824, term392824.getClass(), "firstRomVersion", "aAxtJdjhqn");
        setField(term392824, term392824.getClass(), "firstDataVersion", "OLujSCDtXo");
        setField(term392824, term392824.getClass(), "firstPlayDate", "GoRjwJdAue");
        setField(term392824, term392824.getClass(), "lastGameId", "kXvhrilSNA");
        setField(term392824, term392824.getClass(), "lastRomVersion", "xHdahbrJMG");
        setField(term392824, term392824.getClass(), "lastDataVersion", "qUdSSUQJjt");
        setField(term392824, term392824.getClass(), "compatibleCmVersion", "jjONsLvlMf");
        setField(term392824, term392824.getClass(), "lastPlayDate", "lgQfPHMcgv");
        setIntField(term392824, term392824.getClass(), "lastPlaceId", 1522414111);
        setField(term392824, term392824.getClass(), "lastPlaceName", "faRDhDaBEA");
        setIntField(term392824, term392824.getClass(), "lastRegionId", 438959981);
        setField(term392824, term392824.getClass(), "lastRegionName", "OEdRxYaZeh");
        setIntField(term392824, term392824.getClass(), "lastAllNetId", 867871666);
        setField(term392824, term392824.getClass(), "lastClientId", "LBqXFlsvHr");
        setIntField(term392824, term392824.getClass(), "lastUsedDeckId", 1027736152);
        setIntField(term392824, term392824.getClass(), "lastPlayMusicLevel", 347681204);
        setIntField(term392824, term392824.getClass(), "lastEmoneyBrand", -535934905);
        setField(term392822, term392822.getClass(), "user", term392824);
        setIntField(term392822, term392822.getClass(), "chapterId", -338196029);
        setIntField(term392822, term392822.getClass(), "jewelCount", 273090045);
        setIntField(term392822, term392822.getClass(), "lastPlayMusicCategory", -597906138);
        setIntField(term392822, term392822.getClass(), "lastPlayMusicId", 1466723726);
        setIntField(term392822, term392822.getClass(), "lastPlayMusicLevel", 643944617);
        setBooleanField(term392822, term392822.getClass(), "isDialogWatched", false);
        setBooleanField(term392822, term392822.getClass(), "isStoryWatched", false);
        setBooleanField(term392822, term392822.getClass(), "isBossWatched", true);
        setBooleanField(term392822, term392822.getClass(), "isClear", true);
        setIntField(term392822, term392822.getClass(), "gaugeId", -42185765);
        setIntField(term392822, term392822.getClass(), "gaugeNum", 2122397474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStoryWatched", argTypes, term392822, args);
    }

};


