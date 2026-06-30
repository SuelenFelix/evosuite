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

public class UserMusicDetail_toString_49650051140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421829;

    public UserMusicDetail_toString_49650051140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term421835 = new Long(-7671399023433976259L);
        term421829 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term421831 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term421833 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term421849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term421850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term421854 = newInstance(Class.forName("java.time.LocalTime"));
        Object term421859 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term421860 = newInstance(Class.forName("java.time.LocalDate"));
        Object term421864 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term421829, term421829.getClass(), "id", 8537821413210416387L);
        setLongField(term421831, term421831.getClass(), "id", 2990258299796870119L);
        setLongField(term421833, term421833.getClass(), "id", 9028326640663240923L);
        setField(term421833, term421833.getClass(), "extId", term421835);
        setField(term421833, term421833.getClass(), "luid", "HBtHStSADS");
        setIntField(term421850, term421850.getClass(), "year", 2029);
        setShortField(term421850, term421850.getClass(), "month", (short) 6);
        setShortField(term421850, term421850.getClass(), "day", (short) 27);
        setField(term421849, term421849.getClass(), "date", term421850);
        setByteField(term421854, term421854.getClass(), "hour", (byte) 0);
        setByteField(term421854, term421854.getClass(), "minute", (byte) 18);
        setByteField(term421854, term421854.getClass(), "second", (byte) 15);
        setIntField(term421854, term421854.getClass(), "nano", 833456219);
        setField(term421849, term421849.getClass(), "time", term421854);
        setField(term421833, term421833.getClass(), "registerTime", term421849);
        setIntField(term421860, term421860.getClass(), "year", 2011);
        setShortField(term421860, term421860.getClass(), "month", (short) 6);
        setShortField(term421860, term421860.getClass(), "day", (short) 5);
        setField(term421859, term421859.getClass(), "date", term421860);
        setByteField(term421864, term421864.getClass(), "hour", (byte) 16);
        setByteField(term421864, term421864.getClass(), "minute", (byte) 13);
        setByteField(term421864, term421864.getClass(), "second", (byte) 21);
        setIntField(term421864, term421864.getClass(), "nano", 159356548);
        setField(term421859, term421859.getClass(), "time", term421864);
        setField(term421833, term421833.getClass(), "accessTime", term421859);
        setField(term421831, term421831.getClass(), "card", term421833);
        setField(term421831, term421831.getClass(), "userName", "dsyhmVTFCR");
        setIntField(term421831, term421831.getClass(), "level", -524785308);
        setIntField(term421831, term421831.getClass(), "reincarnationNum", -812182286);
        setLongField(term421831, term421831.getClass(), "exp", -1195523085658317664L);
        setLongField(term421831, term421831.getClass(), "point", 5061399699094558473L);
        setLongField(term421831, term421831.getClass(), "totalPoint", -4881076565326560082L);
        setIntField(term421831, term421831.getClass(), "playCount", 552434133);
        setIntField(term421831, term421831.getClass(), "jewelCount", 925826858);
        setIntField(term421831, term421831.getClass(), "totalJewelCount", 661143900);
        setIntField(term421831, term421831.getClass(), "medalCount", -2060296477);
        setIntField(term421831, term421831.getClass(), "playerRating", -1285162270);
        setIntField(term421831, term421831.getClass(), "highestRating", -1635315262);
        setIntField(term421831, term421831.getClass(), "battlePoint", -119793572);
        setIntField(term421831, term421831.getClass(), "bestBattlePoint", 1535179050);
        setIntField(term421831, term421831.getClass(), "overDamageBattlePoint", 2111873433);
        setBooleanField(term421831, term421831.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term421831, term421831.getClass(), "nameplateId", -1149348487);
        setIntField(term421831, term421831.getClass(), "trophyId", 1557726415);
        setIntField(term421831, term421831.getClass(), "cardId", 47550494);
        setIntField(term421831, term421831.getClass(), "characterId", -899726600);
        setIntField(term421831, term421831.getClass(), "characterVoiceNo", -354530807);
        setIntField(term421831, term421831.getClass(), "tabSetting", 292078921);
        setIntField(term421831, term421831.getClass(), "tabSortSetting", 1060390397);
        setIntField(term421831, term421831.getClass(), "cardCategorySetting", -858366406);
        setIntField(term421831, term421831.getClass(), "cardSortSetting", 2024600257);
        setIntField(term421831, term421831.getClass(), "rivalScoreCategorySetting", 733695999);
        setIntField(term421831, term421831.getClass(), "playedTutorialBit", -433127596);
        setIntField(term421831, term421831.getClass(), "firstTutorialCancelNum", -892634263);
        setLongField(term421831, term421831.getClass(), "sumTechHighScore", 3701516657913630770L);
        setLongField(term421831, term421831.getClass(), "sumTechBasicHighScore", -2388657946706901170L);
        setLongField(term421831, term421831.getClass(), "sumTechAdvancedHighScore", -183479311957511166L);
        setLongField(term421831, term421831.getClass(), "sumTechExpertHighScore", -7245032939572138851L);
        setLongField(term421831, term421831.getClass(), "sumTechMasterHighScore", 3318250061682477427L);
        setLongField(term421831, term421831.getClass(), "sumTechLunaticHighScore", 4540855449544625537L);
        setLongField(term421831, term421831.getClass(), "sumBattleHighScore", 3963881286356825935L);
        setLongField(term421831, term421831.getClass(), "sumBattleBasicHighScore", 1210608245198647754L);
        setLongField(term421831, term421831.getClass(), "sumBattleAdvancedHighScore", -4283909940556642061L);
        setLongField(term421831, term421831.getClass(), "sumBattleExpertHighScore", -5656451441167520621L);
        setLongField(term421831, term421831.getClass(), "sumBattleMasterHighScore", 3971162155343805269L);
        setLongField(term421831, term421831.getClass(), "sumBattleLunaticHighScore", 5151327539816045294L);
        setField(term421831, term421831.getClass(), "eventWatchedDate", "qHwmbMCsVJ");
        setField(term421831, term421831.getClass(), "cmEventWatchedDate", "vwaDvlpQqJ");
        setField(term421831, term421831.getClass(), "firstGameId", "bdBXOaWYMc");
        setField(term421831, term421831.getClass(), "firstRomVersion", "LdgsGbElMy");
        setField(term421831, term421831.getClass(), "firstDataVersion", "MIQgacXOYk");
        setField(term421831, term421831.getClass(), "firstPlayDate", "ncOgZmQQwb");
        setField(term421831, term421831.getClass(), "lastGameId", "lEfmVLzKqY");
        setField(term421831, term421831.getClass(), "lastRomVersion", "bSCOtmhMeQ");
        setField(term421831, term421831.getClass(), "lastDataVersion", "vvtPEcAsMq");
        setField(term421831, term421831.getClass(), "compatibleCmVersion", "UGCqxYEzjh");
        setField(term421831, term421831.getClass(), "lastPlayDate", "yVkvdeNWWn");
        setIntField(term421831, term421831.getClass(), "lastPlaceId", 1342444422);
        setField(term421831, term421831.getClass(), "lastPlaceName", "TdPdUkqbHJ");
        setIntField(term421831, term421831.getClass(), "lastRegionId", 256730489);
        setField(term421831, term421831.getClass(), "lastRegionName", "eJqkfEjFHR");
        setIntField(term421831, term421831.getClass(), "lastAllNetId", 403673507);
        setField(term421831, term421831.getClass(), "lastClientId", "iRGodpSVus");
        setIntField(term421831, term421831.getClass(), "lastUsedDeckId", -1889378506);
        setIntField(term421831, term421831.getClass(), "lastPlayMusicLevel", -525288934);
        setIntField(term421831, term421831.getClass(), "lastEmoneyBrand", 182000261);
        setField(term421829, term421829.getClass(), "user", term421831);
        setIntField(term421829, term421829.getClass(), "musicId", -215762880);
        setIntField(term421829, term421829.getClass(), "level", 2062100492);
        setIntField(term421829, term421829.getClass(), "playCount", -966027360);
        setIntField(term421829, term421829.getClass(), "techScoreMax", 695242094);
        setIntField(term421829, term421829.getClass(), "techScoreRank", -1093078149);
        setIntField(term421829, term421829.getClass(), "battleScoreMax", -715085726);
        setIntField(term421829, term421829.getClass(), "battleScoreRank", -1954615713);
        setIntField(term421829, term421829.getClass(), "maxComboCount", 1332886126);
        setIntField(term421829, term421829.getClass(), "maxOverKill", 915715586);
        setIntField(term421829, term421829.getClass(), "maxTeamOverKill", 1971294800);
        setBooleanField(term421829, term421829.getClass(), "isFullBell", false);
        setBooleanField(term421829, term421829.getClass(), "isFullCombo", false);
        setBooleanField(term421829, term421829.getClass(), "isAllBreake", false);
        setBooleanField(term421829, term421829.getClass(), "isLock", true);
        setIntField(term421829, term421829.getClass(), "clearStatus", 582424518);
        setBooleanField(term421829, term421829.getClass(), "isStoryWatched", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term421829, args);
    }

};


