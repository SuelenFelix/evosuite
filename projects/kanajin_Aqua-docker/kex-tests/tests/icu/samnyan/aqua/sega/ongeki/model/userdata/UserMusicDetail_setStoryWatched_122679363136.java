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
import java.lang.Boolean;

public class UserMusicDetail_setStoryWatched_122679363136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420061;
     Object term420342;

    public UserMusicDetail_setStoryWatched_122679363136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term420067 = new Long(937792282597213200L);
        term420061 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term420063 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term420065 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term420081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term420082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term420086 = newInstance(Class.forName("java.time.LocalTime"));
        Object term420091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term420092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term420096 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term420061, term420061.getClass(), "id", 5767562736594368918L);
        setLongField(term420063, term420063.getClass(), "id", 5492314312691801564L);
        setLongField(term420065, term420065.getClass(), "id", 1735944151582864402L);
        setField(term420065, term420065.getClass(), "extId", term420067);
        setField(term420065, term420065.getClass(), "luid", "RmTDGVRuRt");
        setIntField(term420082, term420082.getClass(), "year", 2017);
        setShortField(term420082, term420082.getClass(), "month", (short) 2);
        setShortField(term420082, term420082.getClass(), "day", (short) 15);
        setField(term420081, term420081.getClass(), "date", term420082);
        setByteField(term420086, term420086.getClass(), "hour", (byte) 2);
        setByteField(term420086, term420086.getClass(), "minute", (byte) 35);
        setByteField(term420086, term420086.getClass(), "second", (byte) 41);
        setIntField(term420086, term420086.getClass(), "nano", 416362651);
        setField(term420081, term420081.getClass(), "time", term420086);
        setField(term420065, term420065.getClass(), "registerTime", term420081);
        setIntField(term420092, term420092.getClass(), "year", 2024);
        setShortField(term420092, term420092.getClass(), "month", (short) 6);
        setShortField(term420092, term420092.getClass(), "day", (short) 27);
        setField(term420091, term420091.getClass(), "date", term420092);
        setByteField(term420096, term420096.getClass(), "hour", (byte) 5);
        setByteField(term420096, term420096.getClass(), "minute", (byte) 45);
        setByteField(term420096, term420096.getClass(), "second", (byte) 51);
        setIntField(term420096, term420096.getClass(), "nano", 363991868);
        setField(term420091, term420091.getClass(), "time", term420096);
        setField(term420065, term420065.getClass(), "accessTime", term420091);
        setField(term420063, term420063.getClass(), "card", term420065);
        setField(term420063, term420063.getClass(), "userName", "KWWpPSJSCg");
        setIntField(term420063, term420063.getClass(), "level", 371744544);
        setIntField(term420063, term420063.getClass(), "reincarnationNum", 1051003157);
        setLongField(term420063, term420063.getClass(), "exp", 1155522169797745639L);
        setLongField(term420063, term420063.getClass(), "point", -1179386315439071457L);
        setLongField(term420063, term420063.getClass(), "totalPoint", -5118322094045608748L);
        setIntField(term420063, term420063.getClass(), "playCount", 1309716703);
        setIntField(term420063, term420063.getClass(), "jewelCount", 1119355754);
        setIntField(term420063, term420063.getClass(), "totalJewelCount", -1432457770);
        setIntField(term420063, term420063.getClass(), "medalCount", -1549550148);
        setIntField(term420063, term420063.getClass(), "playerRating", -934914144);
        setIntField(term420063, term420063.getClass(), "highestRating", -1956234380);
        setIntField(term420063, term420063.getClass(), "battlePoint", -1957755344);
        setIntField(term420063, term420063.getClass(), "bestBattlePoint", 2119986156);
        setIntField(term420063, term420063.getClass(), "overDamageBattlePoint", 1427835474);
        setBooleanField(term420063, term420063.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term420063, term420063.getClass(), "nameplateId", -703662178);
        setIntField(term420063, term420063.getClass(), "trophyId", 1167450469);
        setIntField(term420063, term420063.getClass(), "cardId", 1886528943);
        setIntField(term420063, term420063.getClass(), "characterId", -789221265);
        setIntField(term420063, term420063.getClass(), "characterVoiceNo", -1179743417);
        setIntField(term420063, term420063.getClass(), "tabSetting", 441450424);
        setIntField(term420063, term420063.getClass(), "tabSortSetting", 793139290);
        setIntField(term420063, term420063.getClass(), "cardCategorySetting", 1379976592);
        setIntField(term420063, term420063.getClass(), "cardSortSetting", -960650812);
        setIntField(term420063, term420063.getClass(), "rivalScoreCategorySetting", 1610368493);
        setIntField(term420063, term420063.getClass(), "playedTutorialBit", 1480724209);
        setIntField(term420063, term420063.getClass(), "firstTutorialCancelNum", 1249113599);
        setLongField(term420063, term420063.getClass(), "sumTechHighScore", 6129769421217613344L);
        setLongField(term420063, term420063.getClass(), "sumTechBasicHighScore", -5362725050048484810L);
        setLongField(term420063, term420063.getClass(), "sumTechAdvancedHighScore", 295244016757629042L);
        setLongField(term420063, term420063.getClass(), "sumTechExpertHighScore", 6636345959546591474L);
        setLongField(term420063, term420063.getClass(), "sumTechMasterHighScore", 7429047873433383084L);
        setLongField(term420063, term420063.getClass(), "sumTechLunaticHighScore", -1462909427681782748L);
        setLongField(term420063, term420063.getClass(), "sumBattleHighScore", 2846196862466446376L);
        setLongField(term420063, term420063.getClass(), "sumBattleBasicHighScore", -5008009745465451965L);
        setLongField(term420063, term420063.getClass(), "sumBattleAdvancedHighScore", 1139810230214575810L);
        setLongField(term420063, term420063.getClass(), "sumBattleExpertHighScore", -8507826672797230974L);
        setLongField(term420063, term420063.getClass(), "sumBattleMasterHighScore", -6850502752917168417L);
        setLongField(term420063, term420063.getClass(), "sumBattleLunaticHighScore", 132402494831095929L);
        setField(term420063, term420063.getClass(), "eventWatchedDate", "OaYxEZPLTK");
        setField(term420063, term420063.getClass(), "cmEventWatchedDate", "YlEndnsyjr");
        setField(term420063, term420063.getClass(), "firstGameId", "yoeDxfJSjB");
        setField(term420063, term420063.getClass(), "firstRomVersion", "qrHZQHKNZQ");
        setField(term420063, term420063.getClass(), "firstDataVersion", "gCGSeExuhP");
        setField(term420063, term420063.getClass(), "firstPlayDate", "pjSfyUSDGF");
        setField(term420063, term420063.getClass(), "lastGameId", "MwrCuBGWtU");
        setField(term420063, term420063.getClass(), "lastRomVersion", "kSSFZsxfPr");
        setField(term420063, term420063.getClass(), "lastDataVersion", "YvFFVVhNJe");
        setField(term420063, term420063.getClass(), "compatibleCmVersion", "scPpcqhSAx");
        setField(term420063, term420063.getClass(), "lastPlayDate", "VMEtznEpnp");
        setIntField(term420063, term420063.getClass(), "lastPlaceId", -1420467871);
        setField(term420063, term420063.getClass(), "lastPlaceName", "sPPzSzAogw");
        setIntField(term420063, term420063.getClass(), "lastRegionId", 490995191);
        setField(term420063, term420063.getClass(), "lastRegionName", "CrnDxuuGCl");
        setIntField(term420063, term420063.getClass(), "lastAllNetId", -1635354935);
        setField(term420063, term420063.getClass(), "lastClientId", "MyfKueIDSH");
        setIntField(term420063, term420063.getClass(), "lastUsedDeckId", 278229130);
        setIntField(term420063, term420063.getClass(), "lastPlayMusicLevel", -482067802);
        setIntField(term420063, term420063.getClass(), "lastEmoneyBrand", -1094832395);
        setField(term420061, term420061.getClass(), "user", term420063);
        setIntField(term420061, term420061.getClass(), "musicId", 1561234031);
        setIntField(term420061, term420061.getClass(), "level", -1689665127);
        setIntField(term420061, term420061.getClass(), "playCount", 1577707482);
        setIntField(term420061, term420061.getClass(), "techScoreMax", 813432927);
        setIntField(term420061, term420061.getClass(), "techScoreRank", 612763336);
        setIntField(term420061, term420061.getClass(), "battleScoreMax", 986205059);
        setIntField(term420061, term420061.getClass(), "battleScoreRank", 1326801100);
        setIntField(term420061, term420061.getClass(), "maxComboCount", -501506948);
        setIntField(term420061, term420061.getClass(), "maxOverKill", -910684551);
        setIntField(term420061, term420061.getClass(), "maxTeamOverKill", 2096279580);
        setBooleanField(term420061, term420061.getClass(), "isFullBell", false);
        setBooleanField(term420061, term420061.getClass(), "isFullCombo", true);
        setBooleanField(term420061, term420061.getClass(), "isAllBreake", true);
        setBooleanField(term420061, term420061.getClass(), "isLock", false);
        setIntField(term420061, term420061.getClass(), "clearStatus", 17286864);
        setBooleanField(term420061, term420061.getClass(), "isStoryWatched", false);
        term420342 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term420342;
        callMethod(klass, "setStoryWatched", argTypes, term420061, args);
    }

};


