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

public class UserChapter_canEqual_92756085224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94049;
     Object term94323;

    public UserChapter_canEqual_92756085224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term94055 = new Long(3580984732036213717L);
        term94049 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term94051 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term94053 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term94069 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94070 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94074 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94079 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94080 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94084 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term94049, term94049.getClass(), "id", 1459572037043540862L);
        setLongField(term94051, term94051.getClass(), "id", -4114910889328811120L);
        setLongField(term94053, term94053.getClass(), "id", -2813503561360404702L);
        setField(term94053, term94053.getClass(), "extId", term94055);
        setField(term94053, term94053.getClass(), "luid", "VWFNUuzpse");
        setIntField(term94070, term94070.getClass(), "year", 2018);
        setShortField(term94070, term94070.getClass(), "month", (short) 11);
        setShortField(term94070, term94070.getClass(), "day", (short) 23);
        setField(term94069, term94069.getClass(), "date", term94070);
        setByteField(term94074, term94074.getClass(), "hour", (byte) 15);
        setByteField(term94074, term94074.getClass(), "minute", (byte) 21);
        setByteField(term94074, term94074.getClass(), "second", (byte) 39);
        setIntField(term94074, term94074.getClass(), "nano", 255623386);
        setField(term94069, term94069.getClass(), "time", term94074);
        setField(term94053, term94053.getClass(), "registerTime", term94069);
        setIntField(term94080, term94080.getClass(), "year", 2016);
        setShortField(term94080, term94080.getClass(), "month", (short) 11);
        setShortField(term94080, term94080.getClass(), "day", (short) 8);
        setField(term94079, term94079.getClass(), "date", term94080);
        setByteField(term94084, term94084.getClass(), "hour", (byte) 7);
        setByteField(term94084, term94084.getClass(), "minute", (byte) 33);
        setByteField(term94084, term94084.getClass(), "second", (byte) 30);
        setIntField(term94084, term94084.getClass(), "nano", 274725601);
        setField(term94079, term94079.getClass(), "time", term94084);
        setField(term94053, term94053.getClass(), "accessTime", term94079);
        setField(term94051, term94051.getClass(), "card", term94053);
        setField(term94051, term94051.getClass(), "userName", "XdnUnODLtI");
        setIntField(term94051, term94051.getClass(), "level", 430345693);
        setIntField(term94051, term94051.getClass(), "reincarnationNum", -516065529);
        setLongField(term94051, term94051.getClass(), "exp", 2695728348721527946L);
        setLongField(term94051, term94051.getClass(), "point", -7935029292830022204L);
        setLongField(term94051, term94051.getClass(), "totalPoint", 2983167160852735866L);
        setIntField(term94051, term94051.getClass(), "playCount", 334889421);
        setIntField(term94051, term94051.getClass(), "jewelCount", 624371858);
        setIntField(term94051, term94051.getClass(), "totalJewelCount", -460751227);
        setIntField(term94051, term94051.getClass(), "medalCount", 1608431617);
        setIntField(term94051, term94051.getClass(), "playerRating", 112321383);
        setIntField(term94051, term94051.getClass(), "highestRating", 1763430532);
        setIntField(term94051, term94051.getClass(), "battlePoint", -923019123);
        setIntField(term94051, term94051.getClass(), "bestBattlePoint", 1425210363);
        setIntField(term94051, term94051.getClass(), "overDamageBattlePoint", 656143415);
        setBooleanField(term94051, term94051.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term94051, term94051.getClass(), "nameplateId", 1654162366);
        setIntField(term94051, term94051.getClass(), "trophyId", 1659672136);
        setIntField(term94051, term94051.getClass(), "cardId", 1379028862);
        setIntField(term94051, term94051.getClass(), "characterId", 1923849673);
        setIntField(term94051, term94051.getClass(), "characterVoiceNo", 783108536);
        setIntField(term94051, term94051.getClass(), "tabSetting", 1305284548);
        setIntField(term94051, term94051.getClass(), "tabSortSetting", -567549105);
        setIntField(term94051, term94051.getClass(), "cardCategorySetting", -1707996167);
        setIntField(term94051, term94051.getClass(), "cardSortSetting", 1222265931);
        setIntField(term94051, term94051.getClass(), "rivalScoreCategorySetting", 1684951870);
        setIntField(term94051, term94051.getClass(), "playedTutorialBit", -1511199281);
        setIntField(term94051, term94051.getClass(), "firstTutorialCancelNum", -1801978748);
        setLongField(term94051, term94051.getClass(), "sumTechHighScore", 5372227829409893821L);
        setLongField(term94051, term94051.getClass(), "sumTechBasicHighScore", -546626977716687964L);
        setLongField(term94051, term94051.getClass(), "sumTechAdvancedHighScore", 6528524159745127222L);
        setLongField(term94051, term94051.getClass(), "sumTechExpertHighScore", -2675518906672937671L);
        setLongField(term94051, term94051.getClass(), "sumTechMasterHighScore", -6799873058539741971L);
        setLongField(term94051, term94051.getClass(), "sumTechLunaticHighScore", -3154740942935891531L);
        setLongField(term94051, term94051.getClass(), "sumBattleHighScore", 531850285907925304L);
        setLongField(term94051, term94051.getClass(), "sumBattleBasicHighScore", -189236760210129272L);
        setLongField(term94051, term94051.getClass(), "sumBattleAdvancedHighScore", 6932423689998612298L);
        setLongField(term94051, term94051.getClass(), "sumBattleExpertHighScore", -3056402354884243976L);
        setLongField(term94051, term94051.getClass(), "sumBattleMasterHighScore", -5675141479040642892L);
        setLongField(term94051, term94051.getClass(), "sumBattleLunaticHighScore", -7505624754248055227L);
        setField(term94051, term94051.getClass(), "eventWatchedDate", "blbqUBWvWn");
        setField(term94051, term94051.getClass(), "cmEventWatchedDate", "GqITHNYwXE");
        setField(term94051, term94051.getClass(), "firstGameId", "UZgYyXlvna");
        setField(term94051, term94051.getClass(), "firstRomVersion", "VGFyNxXSkc");
        setField(term94051, term94051.getClass(), "firstDataVersion", "qkZsBlbGpw");
        setField(term94051, term94051.getClass(), "firstPlayDate", "UonOkFcwuK");
        setField(term94051, term94051.getClass(), "lastGameId", "coDGKPmcIo");
        setField(term94051, term94051.getClass(), "lastRomVersion", "sNKnkClMjH");
        setField(term94051, term94051.getClass(), "lastDataVersion", "DzuhSmFHcg");
        setField(term94051, term94051.getClass(), "compatibleCmVersion", "lHFGeijIrp");
        setField(term94051, term94051.getClass(), "lastPlayDate", "OjqiiqbEQC");
        setIntField(term94051, term94051.getClass(), "lastPlaceId", 1121989052);
        setField(term94051, term94051.getClass(), "lastPlaceName", "lOnziohwRj");
        setIntField(term94051, term94051.getClass(), "lastRegionId", 1115099352);
        setField(term94051, term94051.getClass(), "lastRegionName", "FcuzXnxIut");
        setIntField(term94051, term94051.getClass(), "lastAllNetId", -269893980);
        setField(term94051, term94051.getClass(), "lastClientId", "fyepabvKPu");
        setIntField(term94051, term94051.getClass(), "lastUsedDeckId", 1190163419);
        setIntField(term94051, term94051.getClass(), "lastPlayMusicLevel", -1365404936);
        setIntField(term94051, term94051.getClass(), "lastEmoneyBrand", -828371576);
        setField(term94049, term94049.getClass(), "user", term94051);
        setIntField(term94049, term94049.getClass(), "chapterId", 1475471511);
        setIntField(term94049, term94049.getClass(), "jewelCount", 1061251899);
        setIntField(term94049, term94049.getClass(), "lastPlayMusicCategory", -1000926687);
        setIntField(term94049, term94049.getClass(), "lastPlayMusicId", 89149779);
        setIntField(term94049, term94049.getClass(), "lastPlayMusicLevel", 354592191);
        setBooleanField(term94049, term94049.getClass(), "isStoryWatched", false);
        setBooleanField(term94049, term94049.getClass(), "isClear", true);
        setIntField(term94049, term94049.getClass(), "skipTiming1", -874460167);
        setIntField(term94049, term94049.getClass(), "skipTiming2", 1753994569);
        term94323 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term94323;
        callMethod(klass, "canEqual", argTypes, term94049, args);
    }

};


