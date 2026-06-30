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

public class UserChapter_getChapterId_17717653873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84491;

    public UserChapter_getChapterId_17717653873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term84497 = new Long(4795660804170399986L);
        term84491 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term84493 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term84495 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term84511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84516 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84526 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term84491, term84491.getClass(), "id", 4070330593262624489L);
        setLongField(term84493, term84493.getClass(), "id", 2686508286588631111L);
        setLongField(term84495, term84495.getClass(), "id", -3949646833091670623L);
        setField(term84495, term84495.getClass(), "extId", term84497);
        setField(term84495, term84495.getClass(), "luid", "kqDHOsurKa");
        setIntField(term84512, term84512.getClass(), "year", 2018);
        setShortField(term84512, term84512.getClass(), "month", (short) 9);
        setShortField(term84512, term84512.getClass(), "day", (short) 19);
        setField(term84511, term84511.getClass(), "date", term84512);
        setByteField(term84516, term84516.getClass(), "hour", (byte) 23);
        setByteField(term84516, term84516.getClass(), "minute", (byte) 30);
        setByteField(term84516, term84516.getClass(), "second", (byte) 11);
        setIntField(term84516, term84516.getClass(), "nano", 615798597);
        setField(term84511, term84511.getClass(), "time", term84516);
        setField(term84495, term84495.getClass(), "registerTime", term84511);
        setIntField(term84522, term84522.getClass(), "year", 2021);
        setShortField(term84522, term84522.getClass(), "month", (short) 3);
        setShortField(term84522, term84522.getClass(), "day", (short) 13);
        setField(term84521, term84521.getClass(), "date", term84522);
        setByteField(term84526, term84526.getClass(), "hour", (byte) 11);
        setByteField(term84526, term84526.getClass(), "minute", (byte) 11);
        setByteField(term84526, term84526.getClass(), "second", (byte) 36);
        setIntField(term84526, term84526.getClass(), "nano", 411690155);
        setField(term84521, term84521.getClass(), "time", term84526);
        setField(term84495, term84495.getClass(), "accessTime", term84521);
        setField(term84493, term84493.getClass(), "card", term84495);
        setField(term84493, term84493.getClass(), "userName", "NCqNKzmHkE");
        setIntField(term84493, term84493.getClass(), "level", -163004363);
        setIntField(term84493, term84493.getClass(), "reincarnationNum", 1165339838);
        setLongField(term84493, term84493.getClass(), "exp", 6452661156585832400L);
        setLongField(term84493, term84493.getClass(), "point", 8434360451654713658L);
        setLongField(term84493, term84493.getClass(), "totalPoint", 7064473722660118998L);
        setIntField(term84493, term84493.getClass(), "playCount", 1943234848);
        setIntField(term84493, term84493.getClass(), "jewelCount", -226052940);
        setIntField(term84493, term84493.getClass(), "totalJewelCount", -541512295);
        setIntField(term84493, term84493.getClass(), "medalCount", 1961504413);
        setIntField(term84493, term84493.getClass(), "playerRating", -818349758);
        setIntField(term84493, term84493.getClass(), "highestRating", -328707642);
        setIntField(term84493, term84493.getClass(), "battlePoint", -1189408120);
        setIntField(term84493, term84493.getClass(), "bestBattlePoint", -211929036);
        setIntField(term84493, term84493.getClass(), "overDamageBattlePoint", 117783491);
        setBooleanField(term84493, term84493.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term84493, term84493.getClass(), "nameplateId", -1289051383);
        setIntField(term84493, term84493.getClass(), "trophyId", 1802752902);
        setIntField(term84493, term84493.getClass(), "cardId", -1137533005);
        setIntField(term84493, term84493.getClass(), "characterId", -2093544170);
        setIntField(term84493, term84493.getClass(), "characterVoiceNo", 39380540);
        setIntField(term84493, term84493.getClass(), "tabSetting", 1307563354);
        setIntField(term84493, term84493.getClass(), "tabSortSetting", -1960918162);
        setIntField(term84493, term84493.getClass(), "cardCategorySetting", -1039727165);
        setIntField(term84493, term84493.getClass(), "cardSortSetting", -64649810);
        setIntField(term84493, term84493.getClass(), "rivalScoreCategorySetting", -1883605503);
        setIntField(term84493, term84493.getClass(), "playedTutorialBit", 264290749);
        setIntField(term84493, term84493.getClass(), "firstTutorialCancelNum", 481697403);
        setLongField(term84493, term84493.getClass(), "sumTechHighScore", -3328202565303629170L);
        setLongField(term84493, term84493.getClass(), "sumTechBasicHighScore", -7303222772169138653L);
        setLongField(term84493, term84493.getClass(), "sumTechAdvancedHighScore", -5237668391482898957L);
        setLongField(term84493, term84493.getClass(), "sumTechExpertHighScore", 6347050696926206807L);
        setLongField(term84493, term84493.getClass(), "sumTechMasterHighScore", -6693328220911275400L);
        setLongField(term84493, term84493.getClass(), "sumTechLunaticHighScore", -6217009676274443835L);
        setLongField(term84493, term84493.getClass(), "sumBattleHighScore", 4798281117299013998L);
        setLongField(term84493, term84493.getClass(), "sumBattleBasicHighScore", 4734290833546653850L);
        setLongField(term84493, term84493.getClass(), "sumBattleAdvancedHighScore", 6957785192444979753L);
        setLongField(term84493, term84493.getClass(), "sumBattleExpertHighScore", 3092320965130533188L);
        setLongField(term84493, term84493.getClass(), "sumBattleMasterHighScore", -1170031023592641016L);
        setLongField(term84493, term84493.getClass(), "sumBattleLunaticHighScore", -4256671127039800048L);
        setField(term84493, term84493.getClass(), "eventWatchedDate", "eFSnWGCXQK");
        setField(term84493, term84493.getClass(), "cmEventWatchedDate", "GrrqChmbDB");
        setField(term84493, term84493.getClass(), "firstGameId", "AOUZgesZGu");
        setField(term84493, term84493.getClass(), "firstRomVersion", "RApShxzpug");
        setField(term84493, term84493.getClass(), "firstDataVersion", "aygFZPbIko");
        setField(term84493, term84493.getClass(), "firstPlayDate", "hUhlDCVWIF");
        setField(term84493, term84493.getClass(), "lastGameId", "GjzKvoPaBR");
        setField(term84493, term84493.getClass(), "lastRomVersion", "VZRLekBSXz");
        setField(term84493, term84493.getClass(), "lastDataVersion", "XfdYCOWEXZ");
        setField(term84493, term84493.getClass(), "compatibleCmVersion", "aPbJKoMxFL");
        setField(term84493, term84493.getClass(), "lastPlayDate", "FgtqUFBPnP");
        setIntField(term84493, term84493.getClass(), "lastPlaceId", 926936251);
        setField(term84493, term84493.getClass(), "lastPlaceName", "NUkHqaKZhA");
        setIntField(term84493, term84493.getClass(), "lastRegionId", -1700257563);
        setField(term84493, term84493.getClass(), "lastRegionName", "kHSkpGasYO");
        setIntField(term84493, term84493.getClass(), "lastAllNetId", 1981729571);
        setField(term84493, term84493.getClass(), "lastClientId", "OvTdHngAsq");
        setIntField(term84493, term84493.getClass(), "lastUsedDeckId", 127533420);
        setIntField(term84493, term84493.getClass(), "lastPlayMusicLevel", -426467178);
        setIntField(term84493, term84493.getClass(), "lastEmoneyBrand", 1659957838);
        setField(term84491, term84491.getClass(), "user", term84493);
        setIntField(term84491, term84491.getClass(), "chapterId", 1323889329);
        setIntField(term84491, term84491.getClass(), "jewelCount", -343106345);
        setIntField(term84491, term84491.getClass(), "lastPlayMusicCategory", 602906952);
        setIntField(term84491, term84491.getClass(), "lastPlayMusicId", -114450920);
        setIntField(term84491, term84491.getClass(), "lastPlayMusicLevel", -1252187988);
        setBooleanField(term84491, term84491.getClass(), "isStoryWatched", true);
        setBooleanField(term84491, term84491.getClass(), "isClear", false);
        setIntField(term84491, term84491.getClass(), "skipTiming1", -81147170);
        setIntField(term84491, term84491.getClass(), "skipTiming2", -1351264521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChapterId", argTypes, term84491, args);
    }

};


