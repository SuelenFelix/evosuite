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

public class UserMusicDetail_getLevel_9183254704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405494;

    public UserMusicDetail_getLevel_9183254704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term405500 = new Long(7777131569376571611L);
        term405494 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term405496 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term405498 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term405514 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term405515 = newInstance(Class.forName("java.time.LocalDate"));
        Object term405519 = newInstance(Class.forName("java.time.LocalTime"));
        Object term405524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term405525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term405529 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term405494, term405494.getClass(), "id", 1502897996915587896L);
        setLongField(term405496, term405496.getClass(), "id", 5807078452178071797L);
        setLongField(term405498, term405498.getClass(), "id", 8993016582371171372L);
        setField(term405498, term405498.getClass(), "extId", term405500);
        setField(term405498, term405498.getClass(), "luid", "NJHUXqUkaP");
        setIntField(term405515, term405515.getClass(), "year", 2017);
        setShortField(term405515, term405515.getClass(), "month", (short) 1);
        setShortField(term405515, term405515.getClass(), "day", (short) 15);
        setField(term405514, term405514.getClass(), "date", term405515);
        setByteField(term405519, term405519.getClass(), "hour", (byte) 8);
        setByteField(term405519, term405519.getClass(), "minute", (byte) 47);
        setByteField(term405519, term405519.getClass(), "second", (byte) 25);
        setIntField(term405519, term405519.getClass(), "nano", 337248129);
        setField(term405514, term405514.getClass(), "time", term405519);
        setField(term405498, term405498.getClass(), "registerTime", term405514);
        setIntField(term405525, term405525.getClass(), "year", 2028);
        setShortField(term405525, term405525.getClass(), "month", (short) 2);
        setShortField(term405525, term405525.getClass(), "day", (short) 27);
        setField(term405524, term405524.getClass(), "date", term405525);
        setByteField(term405529, term405529.getClass(), "hour", (byte) 2);
        setByteField(term405529, term405529.getClass(), "minute", (byte) 5);
        setByteField(term405529, term405529.getClass(), "second", (byte) 39);
        setIntField(term405529, term405529.getClass(), "nano", 353732819);
        setField(term405524, term405524.getClass(), "time", term405529);
        setField(term405498, term405498.getClass(), "accessTime", term405524);
        setField(term405496, term405496.getClass(), "card", term405498);
        setField(term405496, term405496.getClass(), "userName", "LoTRkZWUKT");
        setIntField(term405496, term405496.getClass(), "level", 1927223232);
        setIntField(term405496, term405496.getClass(), "reincarnationNum", -1297932816);
        setLongField(term405496, term405496.getClass(), "exp", 282420200720715089L);
        setLongField(term405496, term405496.getClass(), "point", -8137183670134160915L);
        setLongField(term405496, term405496.getClass(), "totalPoint", -7361022332795272676L);
        setIntField(term405496, term405496.getClass(), "playCount", 2087879372);
        setIntField(term405496, term405496.getClass(), "jewelCount", -524497118);
        setIntField(term405496, term405496.getClass(), "totalJewelCount", 1627073599);
        setIntField(term405496, term405496.getClass(), "medalCount", 965220433);
        setIntField(term405496, term405496.getClass(), "playerRating", -1918717566);
        setIntField(term405496, term405496.getClass(), "highestRating", -2145322691);
        setIntField(term405496, term405496.getClass(), "battlePoint", -1394218396);
        setIntField(term405496, term405496.getClass(), "bestBattlePoint", 1301695357);
        setIntField(term405496, term405496.getClass(), "overDamageBattlePoint", 1084760898);
        setBooleanField(term405496, term405496.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term405496, term405496.getClass(), "nameplateId", 455748586);
        setIntField(term405496, term405496.getClass(), "trophyId", -444105134);
        setIntField(term405496, term405496.getClass(), "cardId", 311905476);
        setIntField(term405496, term405496.getClass(), "characterId", 1062327582);
        setIntField(term405496, term405496.getClass(), "characterVoiceNo", 1137789193);
        setIntField(term405496, term405496.getClass(), "tabSetting", 1034940016);
        setIntField(term405496, term405496.getClass(), "tabSortSetting", -1952183400);
        setIntField(term405496, term405496.getClass(), "cardCategorySetting", -1639585218);
        setIntField(term405496, term405496.getClass(), "cardSortSetting", 519602441);
        setIntField(term405496, term405496.getClass(), "rivalScoreCategorySetting", 1524806746);
        setIntField(term405496, term405496.getClass(), "playedTutorialBit", 741353842);
        setIntField(term405496, term405496.getClass(), "firstTutorialCancelNum", -1912803342);
        setLongField(term405496, term405496.getClass(), "sumTechHighScore", 3571534492929139026L);
        setLongField(term405496, term405496.getClass(), "sumTechBasicHighScore", 1768510726246994451L);
        setLongField(term405496, term405496.getClass(), "sumTechAdvancedHighScore", 6333121401704736899L);
        setLongField(term405496, term405496.getClass(), "sumTechExpertHighScore", 193183519240064509L);
        setLongField(term405496, term405496.getClass(), "sumTechMasterHighScore", -3521302381002188796L);
        setLongField(term405496, term405496.getClass(), "sumTechLunaticHighScore", 8806099566144028503L);
        setLongField(term405496, term405496.getClass(), "sumBattleHighScore", 8801542229673977841L);
        setLongField(term405496, term405496.getClass(), "sumBattleBasicHighScore", -559935473251034829L);
        setLongField(term405496, term405496.getClass(), "sumBattleAdvancedHighScore", 4215971209256795531L);
        setLongField(term405496, term405496.getClass(), "sumBattleExpertHighScore", -2720662516023225508L);
        setLongField(term405496, term405496.getClass(), "sumBattleMasterHighScore", 6875381188527633650L);
        setLongField(term405496, term405496.getClass(), "sumBattleLunaticHighScore", 4693628667129828286L);
        setField(term405496, term405496.getClass(), "eventWatchedDate", "otrzdcElWQ");
        setField(term405496, term405496.getClass(), "cmEventWatchedDate", "zQxzIsLVMn");
        setField(term405496, term405496.getClass(), "firstGameId", "GVBwNwfBux");
        setField(term405496, term405496.getClass(), "firstRomVersion", "bHjDDEcRWb");
        setField(term405496, term405496.getClass(), "firstDataVersion", "MDinGDXydr");
        setField(term405496, term405496.getClass(), "firstPlayDate", "uIxTDANXJc");
        setField(term405496, term405496.getClass(), "lastGameId", "qGJUQmueos");
        setField(term405496, term405496.getClass(), "lastRomVersion", "sNLlQMWKcb");
        setField(term405496, term405496.getClass(), "lastDataVersion", "LFUnoksTbc");
        setField(term405496, term405496.getClass(), "compatibleCmVersion", "UrmwvWszhN");
        setField(term405496, term405496.getClass(), "lastPlayDate", "OlhVgVWmEU");
        setIntField(term405496, term405496.getClass(), "lastPlaceId", -1727969434);
        setField(term405496, term405496.getClass(), "lastPlaceName", "wGqKnmFmZp");
        setIntField(term405496, term405496.getClass(), "lastRegionId", 1418621212);
        setField(term405496, term405496.getClass(), "lastRegionName", "WIeGTvGLPW");
        setIntField(term405496, term405496.getClass(), "lastAllNetId", -963089419);
        setField(term405496, term405496.getClass(), "lastClientId", "GMIgfrCzvj");
        setIntField(term405496, term405496.getClass(), "lastUsedDeckId", 1495584522);
        setIntField(term405496, term405496.getClass(), "lastPlayMusicLevel", -332493965);
        setIntField(term405496, term405496.getClass(), "lastEmoneyBrand", 2005872797);
        setField(term405494, term405494.getClass(), "user", term405496);
        setIntField(term405494, term405494.getClass(), "musicId", -1708937902);
        setIntField(term405494, term405494.getClass(), "level", -2026832283);
        setIntField(term405494, term405494.getClass(), "playCount", -571786919);
        setIntField(term405494, term405494.getClass(), "techScoreMax", 483192921);
        setIntField(term405494, term405494.getClass(), "techScoreRank", 1735913198);
        setIntField(term405494, term405494.getClass(), "battleScoreMax", 673368775);
        setIntField(term405494, term405494.getClass(), "battleScoreRank", 50939743);
        setIntField(term405494, term405494.getClass(), "maxComboCount", -1867555502);
        setIntField(term405494, term405494.getClass(), "maxOverKill", -1367641534);
        setIntField(term405494, term405494.getClass(), "maxTeamOverKill", 334350320);
        setBooleanField(term405494, term405494.getClass(), "isFullBell", false);
        setBooleanField(term405494, term405494.getClass(), "isFullCombo", true);
        setBooleanField(term405494, term405494.getClass(), "isAllBreake", false);
        setBooleanField(term405494, term405494.getClass(), "isLock", false);
        setIntField(term405494, term405494.getClass(), "clearStatus", -1852976277);
        setBooleanField(term405494, term405494.getClass(), "isStoryWatched", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term405494, args);
    }

};


