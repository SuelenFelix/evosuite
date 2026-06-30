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

public class UserPlaylog_getPlayDate_11122667395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184378;

    public UserPlaylog_getPlayDate_11122667395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term184384 = new Long(-4776514981294468834L);
        term184378 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term184380 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term184382 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term184398 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term184399 = newInstance(Class.forName("java.time.LocalDate"));
        Object term184403 = newInstance(Class.forName("java.time.LocalTime"));
        Object term184408 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term184409 = newInstance(Class.forName("java.time.LocalDate"));
        Object term184413 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term184378, term184378.getClass(), "id", 3418222245252980196L);
        setLongField(term184380, term184380.getClass(), "id", -6049545420317042559L);
        setLongField(term184382, term184382.getClass(), "id", 6506840278977311745L);
        setField(term184382, term184382.getClass(), "extId", term184384);
        setField(term184382, term184382.getClass(), "luid", "rzKUhEsySj");
        setIntField(term184399, term184399.getClass(), "year", 2020);
        setShortField(term184399, term184399.getClass(), "month", (short) 6);
        setShortField(term184399, term184399.getClass(), "day", (short) 2);
        setField(term184398, term184398.getClass(), "date", term184399);
        setByteField(term184403, term184403.getClass(), "hour", (byte) 10);
        setByteField(term184403, term184403.getClass(), "minute", (byte) 4);
        setByteField(term184403, term184403.getClass(), "second", (byte) 37);
        setIntField(term184403, term184403.getClass(), "nano", 482860495);
        setField(term184398, term184398.getClass(), "time", term184403);
        setField(term184382, term184382.getClass(), "registerTime", term184398);
        setIntField(term184409, term184409.getClass(), "year", 2027);
        setShortField(term184409, term184409.getClass(), "month", (short) 1);
        setShortField(term184409, term184409.getClass(), "day", (short) 9);
        setField(term184408, term184408.getClass(), "date", term184409);
        setByteField(term184413, term184413.getClass(), "hour", (byte) 3);
        setByteField(term184413, term184413.getClass(), "minute", (byte) 52);
        setByteField(term184413, term184413.getClass(), "second", (byte) 13);
        setIntField(term184413, term184413.getClass(), "nano", 357829313);
        setField(term184408, term184408.getClass(), "time", term184413);
        setField(term184382, term184382.getClass(), "accessTime", term184408);
        setField(term184380, term184380.getClass(), "card", term184382);
        setField(term184380, term184380.getClass(), "userName", "wZFZRaxcNf");
        setIntField(term184380, term184380.getClass(), "level", 1276576124);
        setIntField(term184380, term184380.getClass(), "reincarnationNum", 806312193);
        setLongField(term184380, term184380.getClass(), "exp", 4984827162222228924L);
        setLongField(term184380, term184380.getClass(), "point", -4977729913285104357L);
        setLongField(term184380, term184380.getClass(), "totalPoint", -7632402404509832308L);
        setIntField(term184380, term184380.getClass(), "playCount", -34164224);
        setIntField(term184380, term184380.getClass(), "jewelCount", -1800382588);
        setIntField(term184380, term184380.getClass(), "totalJewelCount", -414071951);
        setIntField(term184380, term184380.getClass(), "medalCount", -2141708936);
        setIntField(term184380, term184380.getClass(), "playerRating", 260410067);
        setIntField(term184380, term184380.getClass(), "highestRating", -413083092);
        setIntField(term184380, term184380.getClass(), "battlePoint", -1760860172);
        setIntField(term184380, term184380.getClass(), "bestBattlePoint", -1218209025);
        setIntField(term184380, term184380.getClass(), "overDamageBattlePoint", -1603360365);
        setBooleanField(term184380, term184380.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term184380, term184380.getClass(), "nameplateId", 661051072);
        setIntField(term184380, term184380.getClass(), "trophyId", -968061271);
        setIntField(term184380, term184380.getClass(), "cardId", -1544354289);
        setIntField(term184380, term184380.getClass(), "characterId", -268598222);
        setIntField(term184380, term184380.getClass(), "characterVoiceNo", -1310386151);
        setIntField(term184380, term184380.getClass(), "tabSetting", -1654288079);
        setIntField(term184380, term184380.getClass(), "tabSortSetting", -744777680);
        setIntField(term184380, term184380.getClass(), "cardCategorySetting", 1610915527);
        setIntField(term184380, term184380.getClass(), "cardSortSetting", -1491140606);
        setIntField(term184380, term184380.getClass(), "rivalScoreCategorySetting", 2133917835);
        setIntField(term184380, term184380.getClass(), "playedTutorialBit", -185742454);
        setIntField(term184380, term184380.getClass(), "firstTutorialCancelNum", -1014439536);
        setLongField(term184380, term184380.getClass(), "sumTechHighScore", 4147344134637411052L);
        setLongField(term184380, term184380.getClass(), "sumTechBasicHighScore", -5721314969496372665L);
        setLongField(term184380, term184380.getClass(), "sumTechAdvancedHighScore", 3145258254248365850L);
        setLongField(term184380, term184380.getClass(), "sumTechExpertHighScore", -6960693994602911362L);
        setLongField(term184380, term184380.getClass(), "sumTechMasterHighScore", -2677397085138664479L);
        setLongField(term184380, term184380.getClass(), "sumTechLunaticHighScore", 5853848687282756413L);
        setLongField(term184380, term184380.getClass(), "sumBattleHighScore", 4438254867600550639L);
        setLongField(term184380, term184380.getClass(), "sumBattleBasicHighScore", 8051628118406926225L);
        setLongField(term184380, term184380.getClass(), "sumBattleAdvancedHighScore", 7808475277288474254L);
        setLongField(term184380, term184380.getClass(), "sumBattleExpertHighScore", -4931395592119755702L);
        setLongField(term184380, term184380.getClass(), "sumBattleMasterHighScore", -3467617408797888248L);
        setLongField(term184380, term184380.getClass(), "sumBattleLunaticHighScore", 7425258440383487233L);
        setField(term184380, term184380.getClass(), "eventWatchedDate", "ZXeOtTJTEw");
        setField(term184380, term184380.getClass(), "cmEventWatchedDate", "QLiujmKpbl");
        setField(term184380, term184380.getClass(), "firstGameId", "urWFjQWEsN");
        setField(term184380, term184380.getClass(), "firstRomVersion", "yRqmckDaWQ");
        setField(term184380, term184380.getClass(), "firstDataVersion", "NyLoSaVRpL");
        setField(term184380, term184380.getClass(), "firstPlayDate", "hmPyuzYKXU");
        setField(term184380, term184380.getClass(), "lastGameId", "KhhKtlPkUq");
        setField(term184380, term184380.getClass(), "lastRomVersion", "GfrUvQyuXI");
        setField(term184380, term184380.getClass(), "lastDataVersion", "PLhGFeYSpm");
        setField(term184380, term184380.getClass(), "compatibleCmVersion", "VGBjXtYbqH");
        setField(term184380, term184380.getClass(), "lastPlayDate", "ANFGUfOYmw");
        setIntField(term184380, term184380.getClass(), "lastPlaceId", 476298983);
        setField(term184380, term184380.getClass(), "lastPlaceName", "NUUMwMAxia");
        setIntField(term184380, term184380.getClass(), "lastRegionId", 271979703);
        setField(term184380, term184380.getClass(), "lastRegionName", "aQGVzRXubV");
        setIntField(term184380, term184380.getClass(), "lastAllNetId", -191087684);
        setField(term184380, term184380.getClass(), "lastClientId", "LgLQoNmiDg");
        setIntField(term184380, term184380.getClass(), "lastUsedDeckId", -776090822);
        setIntField(term184380, term184380.getClass(), "lastPlayMusicLevel", -179776820);
        setIntField(term184380, term184380.getClass(), "lastEmoneyBrand", -477105508);
        setField(term184378, term184378.getClass(), "user", term184380);
        setIntField(term184378, term184378.getClass(), "sortNumber", -1964032020);
        setIntField(term184378, term184378.getClass(), "placeId", -1625554081);
        setField(term184378, term184378.getClass(), "placeName", "bbYPwbDjdW");
        setField(term184378, term184378.getClass(), "playDate", "uvmFryfiWZ");
        setField(term184378, term184378.getClass(), "userPlayDate", "UektSjnypK");
        setIntField(term184378, term184378.getClass(), "musicId", 1134100864);
        setIntField(term184378, term184378.getClass(), "level", -932647893);
        setIntField(term184378, term184378.getClass(), "playKind", 1309643294);
        setIntField(term184378, term184378.getClass(), "eventId", -1829760689);
        setField(term184378, term184378.getClass(), "eventName", "GkbTLDGskC");
        setIntField(term184378, term184378.getClass(), "eventPoint", -2114174447);
        setIntField(term184378, term184378.getClass(), "playedUserId1", 1848057539);
        setIntField(term184378, term184378.getClass(), "playedUserId2", 1803786185);
        setIntField(term184378, term184378.getClass(), "playedUserId3", 827800338);
        setField(term184378, term184378.getClass(), "playedUserName1", "GNwWutEmZm");
        setField(term184378, term184378.getClass(), "playedUserName2", "XjZjmwoHED");
        setField(term184378, term184378.getClass(), "playedUserName3", "jGyzcAPDDu");
        setIntField(term184378, term184378.getClass(), "playedMusicLevel1", -726644350);
        setIntField(term184378, term184378.getClass(), "playedMusicLevel2", -1889922089);
        setIntField(term184378, term184378.getClass(), "playedMusicLevel3", -1126162521);
        setIntField(term184378, term184378.getClass(), "cardId1", -1937977171);
        setIntField(term184378, term184378.getClass(), "cardId2", -1393512773);
        setIntField(term184378, term184378.getClass(), "cardId3", -766556211);
        setIntField(term184378, term184378.getClass(), "cardLevel1", -362370868);
        setIntField(term184378, term184378.getClass(), "cardLevel2", 340420516);
        setIntField(term184378, term184378.getClass(), "cardLevel3", -500639296);
        setIntField(term184378, term184378.getClass(), "cardAttack1", -64111831);
        setIntField(term184378, term184378.getClass(), "cardAttack2", -145193222);
        setIntField(term184378, term184378.getClass(), "cardAttack3", 1575078592);
        setIntField(term184378, term184378.getClass(), "bossCharaId", 788083238);
        setIntField(term184378, term184378.getClass(), "bossLevel", 1054274026);
        setIntField(term184378, term184378.getClass(), "bossAttribute", -1201178573);
        setIntField(term184378, term184378.getClass(), "clearStatus", -195059182);
        setIntField(term184378, term184378.getClass(), "techScore", 1388069057);
        setIntField(term184378, term184378.getClass(), "techScoreRank", 1154352435);
        setIntField(term184378, term184378.getClass(), "battleScore", -98467954);
        setIntField(term184378, term184378.getClass(), "battleScoreRank", 785520439);
        setIntField(term184378, term184378.getClass(), "platinumScore", 701479074);
        setIntField(term184378, term184378.getClass(), "maxCombo", -11818194);
        setIntField(term184378, term184378.getClass(), "judgeMiss", 1019156814);
        setIntField(term184378, term184378.getClass(), "judgeHit", -1002505764);
        setIntField(term184378, term184378.getClass(), "judgeBreak", 1521523520);
        setIntField(term184378, term184378.getClass(), "judgeCriticalBreak", 464541997);
        setIntField(term184378, term184378.getClass(), "rateTap", -241689552);
        setIntField(term184378, term184378.getClass(), "rateHold", -1974916988);
        setIntField(term184378, term184378.getClass(), "rateFlick", -1422332940);
        setIntField(term184378, term184378.getClass(), "rateSideTap", -990649327);
        setIntField(term184378, term184378.getClass(), "rateSideHold", -1242244093);
        setIntField(term184378, term184378.getClass(), "bellCount", -1648541304);
        setIntField(term184378, term184378.getClass(), "totalBellCount", 1396745898);
        setIntField(term184378, term184378.getClass(), "damageCount", -171687185);
        setIntField(term184378, term184378.getClass(), "overDamage", -1808375426);
        setBooleanField(term184378, term184378.getClass(), "isTechNewRecord", true);
        setBooleanField(term184378, term184378.getClass(), "isBattleNewRecord", true);
        setBooleanField(term184378, term184378.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term184378, term184378.getClass(), "isFullCombo", false);
        setBooleanField(term184378, term184378.getClass(), "isFullBell", false);
        setBooleanField(term184378, term184378.getClass(), "isAllBreak", false);
        setIntField(term184378, term184378.getClass(), "playerRating", -1840652193);
        setIntField(term184378, term184378.getClass(), "battlePoint", 1204481493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayDate", argTypes, term184378, args);
    }

};


