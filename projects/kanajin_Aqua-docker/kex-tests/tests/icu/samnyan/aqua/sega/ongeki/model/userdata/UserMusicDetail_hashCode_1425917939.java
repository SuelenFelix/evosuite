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

public class UserMusicDetail_hashCode_1425917939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421388;

    public UserMusicDetail_hashCode_1425917939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term421394 = new Long(5295517562699482299L);
        term421388 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term421390 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term421392 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term421408 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term421409 = newInstance(Class.forName("java.time.LocalDate"));
        Object term421413 = newInstance(Class.forName("java.time.LocalTime"));
        Object term421418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term421419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term421423 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term421388, term421388.getClass(), "id", 2055092005146691363L);
        setLongField(term421390, term421390.getClass(), "id", 2538778056417326178L);
        setLongField(term421392, term421392.getClass(), "id", -2529355207629461416L);
        setField(term421392, term421392.getClass(), "extId", term421394);
        setField(term421392, term421392.getClass(), "luid", "kUAqBCwqmt");
        setIntField(term421409, term421409.getClass(), "year", 2011);
        setShortField(term421409, term421409.getClass(), "month", (short) 9);
        setShortField(term421409, term421409.getClass(), "day", (short) 7);
        setField(term421408, term421408.getClass(), "date", term421409);
        setByteField(term421413, term421413.getClass(), "hour", (byte) 9);
        setByteField(term421413, term421413.getClass(), "minute", (byte) 31);
        setByteField(term421413, term421413.getClass(), "second", (byte) 37);
        setIntField(term421413, term421413.getClass(), "nano", 559056051);
        setField(term421408, term421408.getClass(), "time", term421413);
        setField(term421392, term421392.getClass(), "registerTime", term421408);
        setIntField(term421419, term421419.getClass(), "year", 2016);
        setShortField(term421419, term421419.getClass(), "month", (short) 2);
        setShortField(term421419, term421419.getClass(), "day", (short) 25);
        setField(term421418, term421418.getClass(), "date", term421419);
        setByteField(term421423, term421423.getClass(), "hour", (byte) 23);
        setByteField(term421423, term421423.getClass(), "minute", (byte) 49);
        setByteField(term421423, term421423.getClass(), "second", (byte) 23);
        setIntField(term421423, term421423.getClass(), "nano", 683094927);
        setField(term421418, term421418.getClass(), "time", term421423);
        setField(term421392, term421392.getClass(), "accessTime", term421418);
        setField(term421390, term421390.getClass(), "card", term421392);
        setField(term421390, term421390.getClass(), "userName", "dQEGtTkqGR");
        setIntField(term421390, term421390.getClass(), "level", 839689043);
        setIntField(term421390, term421390.getClass(), "reincarnationNum", -1489737797);
        setLongField(term421390, term421390.getClass(), "exp", 2500592426173126917L);
        setLongField(term421390, term421390.getClass(), "point", -7141324927836709257L);
        setLongField(term421390, term421390.getClass(), "totalPoint", -3581891786673156241L);
        setIntField(term421390, term421390.getClass(), "playCount", 1447709034);
        setIntField(term421390, term421390.getClass(), "jewelCount", 400942259);
        setIntField(term421390, term421390.getClass(), "totalJewelCount", -188321012);
        setIntField(term421390, term421390.getClass(), "medalCount", -453847551);
        setIntField(term421390, term421390.getClass(), "playerRating", -678607772);
        setIntField(term421390, term421390.getClass(), "highestRating", -224183508);
        setIntField(term421390, term421390.getClass(), "battlePoint", 79718149);
        setIntField(term421390, term421390.getClass(), "bestBattlePoint", -450385552);
        setIntField(term421390, term421390.getClass(), "overDamageBattlePoint", -146353952);
        setBooleanField(term421390, term421390.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term421390, term421390.getClass(), "nameplateId", -1983608400);
        setIntField(term421390, term421390.getClass(), "trophyId", 467076835);
        setIntField(term421390, term421390.getClass(), "cardId", -1212794445);
        setIntField(term421390, term421390.getClass(), "characterId", 1104316480);
        setIntField(term421390, term421390.getClass(), "characterVoiceNo", 1898638601);
        setIntField(term421390, term421390.getClass(), "tabSetting", 492939950);
        setIntField(term421390, term421390.getClass(), "tabSortSetting", -637221832);
        setIntField(term421390, term421390.getClass(), "cardCategorySetting", 21454112);
        setIntField(term421390, term421390.getClass(), "cardSortSetting", 37311790);
        setIntField(term421390, term421390.getClass(), "rivalScoreCategorySetting", -184330809);
        setIntField(term421390, term421390.getClass(), "playedTutorialBit", 730914320);
        setIntField(term421390, term421390.getClass(), "firstTutorialCancelNum", 1966010721);
        setLongField(term421390, term421390.getClass(), "sumTechHighScore", 7957779987363690895L);
        setLongField(term421390, term421390.getClass(), "sumTechBasicHighScore", -6872312190160437572L);
        setLongField(term421390, term421390.getClass(), "sumTechAdvancedHighScore", 1090275656516787603L);
        setLongField(term421390, term421390.getClass(), "sumTechExpertHighScore", 4890551021834035494L);
        setLongField(term421390, term421390.getClass(), "sumTechMasterHighScore", -2214215093525810083L);
        setLongField(term421390, term421390.getClass(), "sumTechLunaticHighScore", -5249902433685311574L);
        setLongField(term421390, term421390.getClass(), "sumBattleHighScore", -7600128755288474635L);
        setLongField(term421390, term421390.getClass(), "sumBattleBasicHighScore", 550251241494275050L);
        setLongField(term421390, term421390.getClass(), "sumBattleAdvancedHighScore", -4060928200008698606L);
        setLongField(term421390, term421390.getClass(), "sumBattleExpertHighScore", -1175452596770818987L);
        setLongField(term421390, term421390.getClass(), "sumBattleMasterHighScore", -1692651558462474784L);
        setLongField(term421390, term421390.getClass(), "sumBattleLunaticHighScore", -1907132851788452220L);
        setField(term421390, term421390.getClass(), "eventWatchedDate", "bFitXmvWRz");
        setField(term421390, term421390.getClass(), "cmEventWatchedDate", "yUgXyZcYTF");
        setField(term421390, term421390.getClass(), "firstGameId", "eMBHowjTgA");
        setField(term421390, term421390.getClass(), "firstRomVersion", "AUQimDitRT");
        setField(term421390, term421390.getClass(), "firstDataVersion", "quPwNhWSLm");
        setField(term421390, term421390.getClass(), "firstPlayDate", "grKMcJmAEb");
        setField(term421390, term421390.getClass(), "lastGameId", "BTvsklAJfi");
        setField(term421390, term421390.getClass(), "lastRomVersion", "xAunINNeRq");
        setField(term421390, term421390.getClass(), "lastDataVersion", "ozNDUHmvdI");
        setField(term421390, term421390.getClass(), "compatibleCmVersion", "bPJzyMOCpx");
        setField(term421390, term421390.getClass(), "lastPlayDate", "IAfTGehofK");
        setIntField(term421390, term421390.getClass(), "lastPlaceId", 2125079496);
        setField(term421390, term421390.getClass(), "lastPlaceName", "GbdYzCWCHw");
        setIntField(term421390, term421390.getClass(), "lastRegionId", -239481575);
        setField(term421390, term421390.getClass(), "lastRegionName", "jIruOEWwbk");
        setIntField(term421390, term421390.getClass(), "lastAllNetId", -784424936);
        setField(term421390, term421390.getClass(), "lastClientId", "NtztSuucCx");
        setIntField(term421390, term421390.getClass(), "lastUsedDeckId", -1508656762);
        setIntField(term421390, term421390.getClass(), "lastPlayMusicLevel", 1094823666);
        setIntField(term421390, term421390.getClass(), "lastEmoneyBrand", 1745575055);
        setField(term421388, term421388.getClass(), "user", term421390);
        setIntField(term421388, term421388.getClass(), "musicId", 19657053);
        setIntField(term421388, term421388.getClass(), "level", 1333625150);
        setIntField(term421388, term421388.getClass(), "playCount", -840979392);
        setIntField(term421388, term421388.getClass(), "techScoreMax", 1330053061);
        setIntField(term421388, term421388.getClass(), "techScoreRank", 964924348);
        setIntField(term421388, term421388.getClass(), "battleScoreMax", -1269226175);
        setIntField(term421388, term421388.getClass(), "battleScoreRank", -1710372861);
        setIntField(term421388, term421388.getClass(), "maxComboCount", 751952385);
        setIntField(term421388, term421388.getClass(), "maxOverKill", -1637755191);
        setIntField(term421388, term421388.getClass(), "maxTeamOverKill", -1270770081);
        setBooleanField(term421388, term421388.getClass(), "isFullBell", true);
        setBooleanField(term421388, term421388.getClass(), "isFullCombo", true);
        setBooleanField(term421388, term421388.getClass(), "isAllBreake", true);
        setBooleanField(term421388, term421388.getClass(), "isLock", false);
        setIntField(term421388, term421388.getClass(), "clearStatus", -464917302);
        setBooleanField(term421388, term421388.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term421388, args);
    }

};


