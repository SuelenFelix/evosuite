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

public class UserChapter_getSkipTiming1_2289550910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87529;

    public UserChapter_getSkipTiming1_2289550910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term87535 = new Long(-433040798405298080L);
        term87529 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term87531 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term87533 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term87549 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87550 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87554 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87564 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term87529, term87529.getClass(), "id", -1712562533510140729L);
        setLongField(term87531, term87531.getClass(), "id", 5075787894187682520L);
        setLongField(term87533, term87533.getClass(), "id", -3151283560134614058L);
        setField(term87533, term87533.getClass(), "extId", term87535);
        setField(term87533, term87533.getClass(), "luid", "jgPUpbSRNf");
        setIntField(term87550, term87550.getClass(), "year", 2020);
        setShortField(term87550, term87550.getClass(), "month", (short) 10);
        setShortField(term87550, term87550.getClass(), "day", (short) 10);
        setField(term87549, term87549.getClass(), "date", term87550);
        setByteField(term87554, term87554.getClass(), "hour", (byte) 8);
        setByteField(term87554, term87554.getClass(), "minute", (byte) 35);
        setByteField(term87554, term87554.getClass(), "second", (byte) 54);
        setIntField(term87554, term87554.getClass(), "nano", 115111505);
        setField(term87549, term87549.getClass(), "time", term87554);
        setField(term87533, term87533.getClass(), "registerTime", term87549);
        setIntField(term87560, term87560.getClass(), "year", 2017);
        setShortField(term87560, term87560.getClass(), "month", (short) 10);
        setShortField(term87560, term87560.getClass(), "day", (short) 24);
        setField(term87559, term87559.getClass(), "date", term87560);
        setByteField(term87564, term87564.getClass(), "hour", (byte) 21);
        setByteField(term87564, term87564.getClass(), "minute", (byte) 10);
        setByteField(term87564, term87564.getClass(), "second", (byte) 20);
        setIntField(term87564, term87564.getClass(), "nano", 736076804);
        setField(term87559, term87559.getClass(), "time", term87564);
        setField(term87533, term87533.getClass(), "accessTime", term87559);
        setField(term87531, term87531.getClass(), "card", term87533);
        setField(term87531, term87531.getClass(), "userName", "GHKReaUGqB");
        setIntField(term87531, term87531.getClass(), "level", -1118052096);
        setIntField(term87531, term87531.getClass(), "reincarnationNum", 789771906);
        setLongField(term87531, term87531.getClass(), "exp", 8638115260738822106L);
        setLongField(term87531, term87531.getClass(), "point", 6633619306147406774L);
        setLongField(term87531, term87531.getClass(), "totalPoint", -2598531502895563715L);
        setIntField(term87531, term87531.getClass(), "playCount", 1156356127);
        setIntField(term87531, term87531.getClass(), "jewelCount", -2104118662);
        setIntField(term87531, term87531.getClass(), "totalJewelCount", -420723612);
        setIntField(term87531, term87531.getClass(), "medalCount", -1133208152);
        setIntField(term87531, term87531.getClass(), "playerRating", -696625342);
        setIntField(term87531, term87531.getClass(), "highestRating", -1414592494);
        setIntField(term87531, term87531.getClass(), "battlePoint", 1786579332);
        setIntField(term87531, term87531.getClass(), "bestBattlePoint", 1501260437);
        setIntField(term87531, term87531.getClass(), "overDamageBattlePoint", -76595520);
        setBooleanField(term87531, term87531.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term87531, term87531.getClass(), "nameplateId", 1443232393);
        setIntField(term87531, term87531.getClass(), "trophyId", -1910414427);
        setIntField(term87531, term87531.getClass(), "cardId", -2007275509);
        setIntField(term87531, term87531.getClass(), "characterId", -540049509);
        setIntField(term87531, term87531.getClass(), "characterVoiceNo", -75757335);
        setIntField(term87531, term87531.getClass(), "tabSetting", 1493891481);
        setIntField(term87531, term87531.getClass(), "tabSortSetting", 1654753354);
        setIntField(term87531, term87531.getClass(), "cardCategorySetting", 609765653);
        setIntField(term87531, term87531.getClass(), "cardSortSetting", 919376771);
        setIntField(term87531, term87531.getClass(), "rivalScoreCategorySetting", 632440696);
        setIntField(term87531, term87531.getClass(), "playedTutorialBit", 1176303286);
        setIntField(term87531, term87531.getClass(), "firstTutorialCancelNum", -1738480762);
        setLongField(term87531, term87531.getClass(), "sumTechHighScore", -6832530349389010593L);
        setLongField(term87531, term87531.getClass(), "sumTechBasicHighScore", 8784363523617467565L);
        setLongField(term87531, term87531.getClass(), "sumTechAdvancedHighScore", -2581326673349768387L);
        setLongField(term87531, term87531.getClass(), "sumTechExpertHighScore", -8721205078422480633L);
        setLongField(term87531, term87531.getClass(), "sumTechMasterHighScore", -8590885095512673228L);
        setLongField(term87531, term87531.getClass(), "sumTechLunaticHighScore", 4081077498890518776L);
        setLongField(term87531, term87531.getClass(), "sumBattleHighScore", -2218287258931868955L);
        setLongField(term87531, term87531.getClass(), "sumBattleBasicHighScore", 8007043833946390244L);
        setLongField(term87531, term87531.getClass(), "sumBattleAdvancedHighScore", -1028298066253346513L);
        setLongField(term87531, term87531.getClass(), "sumBattleExpertHighScore", -1736742262774950648L);
        setLongField(term87531, term87531.getClass(), "sumBattleMasterHighScore", -3526785905169020936L);
        setLongField(term87531, term87531.getClass(), "sumBattleLunaticHighScore", -6164563266809190174L);
        setField(term87531, term87531.getClass(), "eventWatchedDate", "oWFgLqbhiK");
        setField(term87531, term87531.getClass(), "cmEventWatchedDate", "gyLdvdOJQs");
        setField(term87531, term87531.getClass(), "firstGameId", "PASAYkwcOc");
        setField(term87531, term87531.getClass(), "firstRomVersion", "aeiojdusXr");
        setField(term87531, term87531.getClass(), "firstDataVersion", "KKgjZsGDBV");
        setField(term87531, term87531.getClass(), "firstPlayDate", "EkIjtjomYk");
        setField(term87531, term87531.getClass(), "lastGameId", "ZOUuaTJRXe");
        setField(term87531, term87531.getClass(), "lastRomVersion", "gIyzpvuRnO");
        setField(term87531, term87531.getClass(), "lastDataVersion", "oLFNhFdMBL");
        setField(term87531, term87531.getClass(), "compatibleCmVersion", "umJDDpmFWA");
        setField(term87531, term87531.getClass(), "lastPlayDate", "BczZfNSwaD");
        setIntField(term87531, term87531.getClass(), "lastPlaceId", -1175470028);
        setField(term87531, term87531.getClass(), "lastPlaceName", "UqBrzYVNgu");
        setIntField(term87531, term87531.getClass(), "lastRegionId", -910760048);
        setField(term87531, term87531.getClass(), "lastRegionName", "yETjenqbhE");
        setIntField(term87531, term87531.getClass(), "lastAllNetId", 702111671);
        setField(term87531, term87531.getClass(), "lastClientId", "XzpzIeoooh");
        setIntField(term87531, term87531.getClass(), "lastUsedDeckId", 1127359599);
        setIntField(term87531, term87531.getClass(), "lastPlayMusicLevel", 890298090);
        setIntField(term87531, term87531.getClass(), "lastEmoneyBrand", 1824978585);
        setField(term87529, term87529.getClass(), "user", term87531);
        setIntField(term87529, term87529.getClass(), "chapterId", 2056999648);
        setIntField(term87529, term87529.getClass(), "jewelCount", -1235710002);
        setIntField(term87529, term87529.getClass(), "lastPlayMusicCategory", -1092087194);
        setIntField(term87529, term87529.getClass(), "lastPlayMusicId", 287049516);
        setIntField(term87529, term87529.getClass(), "lastPlayMusicLevel", -2118245549);
        setBooleanField(term87529, term87529.getClass(), "isStoryWatched", false);
        setBooleanField(term87529, term87529.getClass(), "isClear", true);
        setIntField(term87529, term87529.getClass(), "skipTiming1", -974734669);
        setIntField(term87529, term87529.getClass(), "skipTiming2", 637485378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkipTiming1", argTypes, term87529, args);
    }

};


