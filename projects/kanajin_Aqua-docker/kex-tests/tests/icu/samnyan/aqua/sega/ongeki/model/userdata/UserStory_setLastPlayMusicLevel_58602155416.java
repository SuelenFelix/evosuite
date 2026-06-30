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

public class UserStory_setLastPlayMusicLevel_58602155416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164957;
     Object term165228;

    public UserStory_setLastPlayMusicLevel_58602155416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term164963 = new Long(-3850323135468805420L);
        term164957 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term164959 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term164961 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term164977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164982 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164992 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term164957, term164957.getClass(), "id", 2350787735253804252L);
        setLongField(term164959, term164959.getClass(), "id", -8661909886885553459L);
        setLongField(term164961, term164961.getClass(), "id", -7742803118784055044L);
        setField(term164961, term164961.getClass(), "extId", term164963);
        setField(term164961, term164961.getClass(), "luid", "EdRaWmJlWR");
        setIntField(term164978, term164978.getClass(), "year", 2029);
        setShortField(term164978, term164978.getClass(), "month", (short) 5);
        setShortField(term164978, term164978.getClass(), "day", (short) 13);
        setField(term164977, term164977.getClass(), "date", term164978);
        setByteField(term164982, term164982.getClass(), "hour", (byte) 15);
        setByteField(term164982, term164982.getClass(), "minute", (byte) 43);
        setByteField(term164982, term164982.getClass(), "second", (byte) 9);
        setIntField(term164982, term164982.getClass(), "nano", 324755756);
        setField(term164977, term164977.getClass(), "time", term164982);
        setField(term164961, term164961.getClass(), "registerTime", term164977);
        setIntField(term164988, term164988.getClass(), "year", 2010);
        setShortField(term164988, term164988.getClass(), "month", (short) 4);
        setShortField(term164988, term164988.getClass(), "day", (short) 17);
        setField(term164987, term164987.getClass(), "date", term164988);
        setByteField(term164992, term164992.getClass(), "hour", (byte) 5);
        setByteField(term164992, term164992.getClass(), "minute", (byte) 31);
        setByteField(term164992, term164992.getClass(), "second", (byte) 28);
        setIntField(term164992, term164992.getClass(), "nano", 783557285);
        setField(term164987, term164987.getClass(), "time", term164992);
        setField(term164961, term164961.getClass(), "accessTime", term164987);
        setField(term164959, term164959.getClass(), "card", term164961);
        setField(term164959, term164959.getClass(), "userName", "idXxJetlwQ");
        setIntField(term164959, term164959.getClass(), "level", 270133587);
        setIntField(term164959, term164959.getClass(), "reincarnationNum", -559167477);
        setLongField(term164959, term164959.getClass(), "exp", 8214012866475671299L);
        setLongField(term164959, term164959.getClass(), "point", 832415693257274424L);
        setLongField(term164959, term164959.getClass(), "totalPoint", 2722675020564130824L);
        setIntField(term164959, term164959.getClass(), "playCount", -647004693);
        setIntField(term164959, term164959.getClass(), "jewelCount", -305072527);
        setIntField(term164959, term164959.getClass(), "totalJewelCount", 159778089);
        setIntField(term164959, term164959.getClass(), "medalCount", -69519222);
        setIntField(term164959, term164959.getClass(), "playerRating", -711812997);
        setIntField(term164959, term164959.getClass(), "highestRating", 880677370);
        setIntField(term164959, term164959.getClass(), "battlePoint", 1062818301);
        setIntField(term164959, term164959.getClass(), "bestBattlePoint", 1265936428);
        setIntField(term164959, term164959.getClass(), "overDamageBattlePoint", 352976860);
        setBooleanField(term164959, term164959.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term164959, term164959.getClass(), "nameplateId", 1084007767);
        setIntField(term164959, term164959.getClass(), "trophyId", 1304651878);
        setIntField(term164959, term164959.getClass(), "cardId", 505920746);
        setIntField(term164959, term164959.getClass(), "characterId", -1636904784);
        setIntField(term164959, term164959.getClass(), "characterVoiceNo", 323158291);
        setIntField(term164959, term164959.getClass(), "tabSetting", 717803007);
        setIntField(term164959, term164959.getClass(), "tabSortSetting", -2028178818);
        setIntField(term164959, term164959.getClass(), "cardCategorySetting", 1179208287);
        setIntField(term164959, term164959.getClass(), "cardSortSetting", 766783102);
        setIntField(term164959, term164959.getClass(), "rivalScoreCategorySetting", 1928797954);
        setIntField(term164959, term164959.getClass(), "playedTutorialBit", 2101488953);
        setIntField(term164959, term164959.getClass(), "firstTutorialCancelNum", 471223135);
        setLongField(term164959, term164959.getClass(), "sumTechHighScore", -5336191936387352032L);
        setLongField(term164959, term164959.getClass(), "sumTechBasicHighScore", 3818758099814858921L);
        setLongField(term164959, term164959.getClass(), "sumTechAdvancedHighScore", -7658376661508902183L);
        setLongField(term164959, term164959.getClass(), "sumTechExpertHighScore", -326178667255451482L);
        setLongField(term164959, term164959.getClass(), "sumTechMasterHighScore", -6509162164214360986L);
        setLongField(term164959, term164959.getClass(), "sumTechLunaticHighScore", 6528399195629894038L);
        setLongField(term164959, term164959.getClass(), "sumBattleHighScore", 3734991362872212520L);
        setLongField(term164959, term164959.getClass(), "sumBattleBasicHighScore", 3957811447955161607L);
        setLongField(term164959, term164959.getClass(), "sumBattleAdvancedHighScore", 4612592882614688935L);
        setLongField(term164959, term164959.getClass(), "sumBattleExpertHighScore", 4240989961327298281L);
        setLongField(term164959, term164959.getClass(), "sumBattleMasterHighScore", 7859125111975904146L);
        setLongField(term164959, term164959.getClass(), "sumBattleLunaticHighScore", 6653419355055110955L);
        setField(term164959, term164959.getClass(), "eventWatchedDate", "lNzXOjpomI");
        setField(term164959, term164959.getClass(), "cmEventWatchedDate", "NtxsTEMAqr");
        setField(term164959, term164959.getClass(), "firstGameId", "KyvbiyMmMH");
        setField(term164959, term164959.getClass(), "firstRomVersion", "QNdmVEKMEm");
        setField(term164959, term164959.getClass(), "firstDataVersion", "sMTYULvlCk");
        setField(term164959, term164959.getClass(), "firstPlayDate", "lEgoBZROnz");
        setField(term164959, term164959.getClass(), "lastGameId", "vtbyaDCaje");
        setField(term164959, term164959.getClass(), "lastRomVersion", "ONhxPKQMMo");
        setField(term164959, term164959.getClass(), "lastDataVersion", "gqboIFYuNV");
        setField(term164959, term164959.getClass(), "compatibleCmVersion", "RzdWOEWDgx");
        setField(term164959, term164959.getClass(), "lastPlayDate", "UvWhWDwqRL");
        setIntField(term164959, term164959.getClass(), "lastPlaceId", 1896542364);
        setField(term164959, term164959.getClass(), "lastPlaceName", "QtaCenHMXj");
        setIntField(term164959, term164959.getClass(), "lastRegionId", -1056985553);
        setField(term164959, term164959.getClass(), "lastRegionName", "uDaDGeYDnv");
        setIntField(term164959, term164959.getClass(), "lastAllNetId", 838641171);
        setField(term164959, term164959.getClass(), "lastClientId", "CZxtRDAuOY");
        setIntField(term164959, term164959.getClass(), "lastUsedDeckId", -1468936780);
        setIntField(term164959, term164959.getClass(), "lastPlayMusicLevel", 64970847);
        setIntField(term164959, term164959.getClass(), "lastEmoneyBrand", 1468120818);
        setField(term164957, term164957.getClass(), "user", term164959);
        setIntField(term164957, term164957.getClass(), "storyId", -575994877);
        setIntField(term164957, term164957.getClass(), "lastChapterId", -1798428742);
        setIntField(term164957, term164957.getClass(), "jewelCount", 204314649);
        setIntField(term164957, term164957.getClass(), "lastPlayMusicId", 758889924);
        setIntField(term164957, term164957.getClass(), "lastPlayMusicCategory", -579422575);
        setIntField(term164957, term164957.getClass(), "lastPlayMusicLevel", 223876386);
        term165228 = new Integer(87499307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term165228;
        callMethod(klass, "setLastPlayMusicLevel", argTypes, term164957, args);
    }

};


