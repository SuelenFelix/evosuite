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

public class UserEventMusic_getMusicId_2157972255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371294;

    public UserEventMusic_getMusicId_2157972255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term371300 = new Long(7594342965038171122L);
        term371294 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term371296 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term371298 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term371314 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term371315 = newInstance(Class.forName("java.time.LocalDate"));
        Object term371319 = newInstance(Class.forName("java.time.LocalTime"));
        Object term371324 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term371325 = newInstance(Class.forName("java.time.LocalDate"));
        Object term371329 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term371294, term371294.getClass(), "id", -3816434186796408392L);
        setLongField(term371296, term371296.getClass(), "id", 3153479428306957549L);
        setLongField(term371298, term371298.getClass(), "id", 7230320912330576016L);
        setField(term371298, term371298.getClass(), "extId", term371300);
        setField(term371298, term371298.getClass(), "luid", "NdzcSnXjkl");
        setIntField(term371315, term371315.getClass(), "year", 2025);
        setShortField(term371315, term371315.getClass(), "month", (short) 11);
        setShortField(term371315, term371315.getClass(), "day", (short) 1);
        setField(term371314, term371314.getClass(), "date", term371315);
        setByteField(term371319, term371319.getClass(), "hour", (byte) 18);
        setByteField(term371319, term371319.getClass(), "minute", (byte) 1);
        setByteField(term371319, term371319.getClass(), "second", (byte) 17);
        setIntField(term371319, term371319.getClass(), "nano", 984602745);
        setField(term371314, term371314.getClass(), "time", term371319);
        setField(term371298, term371298.getClass(), "registerTime", term371314);
        setIntField(term371325, term371325.getClass(), "year", 2015);
        setShortField(term371325, term371325.getClass(), "month", (short) 4);
        setShortField(term371325, term371325.getClass(), "day", (short) 9);
        setField(term371324, term371324.getClass(), "date", term371325);
        setByteField(term371329, term371329.getClass(), "hour", (byte) 23);
        setByteField(term371329, term371329.getClass(), "minute", (byte) 29);
        setByteField(term371329, term371329.getClass(), "second", (byte) 20);
        setIntField(term371329, term371329.getClass(), "nano", 431389763);
        setField(term371324, term371324.getClass(), "time", term371329);
        setField(term371298, term371298.getClass(), "accessTime", term371324);
        setField(term371296, term371296.getClass(), "card", term371298);
        setField(term371296, term371296.getClass(), "userName", "fkhTkrPkEw");
        setIntField(term371296, term371296.getClass(), "level", -1235801463);
        setIntField(term371296, term371296.getClass(), "reincarnationNum", 229970919);
        setLongField(term371296, term371296.getClass(), "exp", -3775526123459345453L);
        setLongField(term371296, term371296.getClass(), "point", 1289924086718054829L);
        setLongField(term371296, term371296.getClass(), "totalPoint", 3101627699870665250L);
        setIntField(term371296, term371296.getClass(), "playCount", -966988457);
        setIntField(term371296, term371296.getClass(), "jewelCount", 1551186011);
        setIntField(term371296, term371296.getClass(), "totalJewelCount", 1356414279);
        setIntField(term371296, term371296.getClass(), "medalCount", -2009042860);
        setIntField(term371296, term371296.getClass(), "playerRating", -430525398);
        setIntField(term371296, term371296.getClass(), "highestRating", -203450962);
        setIntField(term371296, term371296.getClass(), "battlePoint", 796428879);
        setIntField(term371296, term371296.getClass(), "bestBattlePoint", -2080914054);
        setIntField(term371296, term371296.getClass(), "overDamageBattlePoint", 1438996696);
        setBooleanField(term371296, term371296.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term371296, term371296.getClass(), "nameplateId", -1384031982);
        setIntField(term371296, term371296.getClass(), "trophyId", 1740913645);
        setIntField(term371296, term371296.getClass(), "cardId", 310027403);
        setIntField(term371296, term371296.getClass(), "characterId", -1895710994);
        setIntField(term371296, term371296.getClass(), "characterVoiceNo", -726360684);
        setIntField(term371296, term371296.getClass(), "tabSetting", -529879799);
        setIntField(term371296, term371296.getClass(), "tabSortSetting", 1765021967);
        setIntField(term371296, term371296.getClass(), "cardCategorySetting", 1345170156);
        setIntField(term371296, term371296.getClass(), "cardSortSetting", -1102583068);
        setIntField(term371296, term371296.getClass(), "rivalScoreCategorySetting", -702549404);
        setIntField(term371296, term371296.getClass(), "playedTutorialBit", 428225239);
        setIntField(term371296, term371296.getClass(), "firstTutorialCancelNum", 1755232040);
        setLongField(term371296, term371296.getClass(), "sumTechHighScore", -2976324920773873844L);
        setLongField(term371296, term371296.getClass(), "sumTechBasicHighScore", -2404408412991764854L);
        setLongField(term371296, term371296.getClass(), "sumTechAdvancedHighScore", -765107020461125494L);
        setLongField(term371296, term371296.getClass(), "sumTechExpertHighScore", -5378293718331177214L);
        setLongField(term371296, term371296.getClass(), "sumTechMasterHighScore", -5334854336479830707L);
        setLongField(term371296, term371296.getClass(), "sumTechLunaticHighScore", -3268913506482902700L);
        setLongField(term371296, term371296.getClass(), "sumBattleHighScore", -2982402501401498523L);
        setLongField(term371296, term371296.getClass(), "sumBattleBasicHighScore", -2956500784473448481L);
        setLongField(term371296, term371296.getClass(), "sumBattleAdvancedHighScore", 5881752436912410605L);
        setLongField(term371296, term371296.getClass(), "sumBattleExpertHighScore", 1707007040975339160L);
        setLongField(term371296, term371296.getClass(), "sumBattleMasterHighScore", -6684631083971046409L);
        setLongField(term371296, term371296.getClass(), "sumBattleLunaticHighScore", -5773773633023126447L);
        setField(term371296, term371296.getClass(), "eventWatchedDate", "lGcmobyrdD");
        setField(term371296, term371296.getClass(), "cmEventWatchedDate", "TFExgmYITF");
        setField(term371296, term371296.getClass(), "firstGameId", "OCREQkojZR");
        setField(term371296, term371296.getClass(), "firstRomVersion", "PDVpaYQWUw");
        setField(term371296, term371296.getClass(), "firstDataVersion", "kWelTxTqKm");
        setField(term371296, term371296.getClass(), "firstPlayDate", "TzJkRQQuYH");
        setField(term371296, term371296.getClass(), "lastGameId", "vAemymcvHw");
        setField(term371296, term371296.getClass(), "lastRomVersion", "igacVGDoiq");
        setField(term371296, term371296.getClass(), "lastDataVersion", "zLtQRzzQsx");
        setField(term371296, term371296.getClass(), "compatibleCmVersion", "xrbYHaIJkz");
        setField(term371296, term371296.getClass(), "lastPlayDate", "uRsFFdRrYm");
        setIntField(term371296, term371296.getClass(), "lastPlaceId", -784510355);
        setField(term371296, term371296.getClass(), "lastPlaceName", "ngbxoIziCf");
        setIntField(term371296, term371296.getClass(), "lastRegionId", 1871524898);
        setField(term371296, term371296.getClass(), "lastRegionName", "YhncGiHTLa");
        setIntField(term371296, term371296.getClass(), "lastAllNetId", 365935403);
        setField(term371296, term371296.getClass(), "lastClientId", "OQoTXYHpkl");
        setIntField(term371296, term371296.getClass(), "lastUsedDeckId", 554250994);
        setIntField(term371296, term371296.getClass(), "lastPlayMusicLevel", 1387645350);
        setIntField(term371296, term371296.getClass(), "lastEmoneyBrand", 555588487);
        setField(term371294, term371294.getClass(), "user", term371296);
        setIntField(term371294, term371294.getClass(), "eventId", 1979418949);
        setIntField(term371294, term371294.getClass(), "type", 626479096);
        setIntField(term371294, term371294.getClass(), "musicId", -645442137);
        setIntField(term371294, term371294.getClass(), "level", 1401280773);
        setIntField(term371294, term371294.getClass(), "techScoreMax", 625748483);
        setIntField(term371294, term371294.getClass(), "platinumScoreMax", 788218348);
        setField(term371294, term371294.getClass(), "techRecordDate", "GYkJyiOMDG");
        setBooleanField(term371294, term371294.getClass(), "isTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term371294, args);
    }

};


