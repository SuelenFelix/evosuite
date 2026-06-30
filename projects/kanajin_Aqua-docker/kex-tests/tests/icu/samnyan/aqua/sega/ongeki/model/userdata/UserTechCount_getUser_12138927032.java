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

public class UserTechCount_getUser_12138927032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362541;

    public UserTechCount_getUser_12138927032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term362547 = new Long(6151197215723513345L);
        term362541 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        Object term362543 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term362545 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term362561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term362562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term362566 = newInstance(Class.forName("java.time.LocalTime"));
        Object term362571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term362572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term362576 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term362541, term362541.getClass(), "id", -469637140915286880L);
        setLongField(term362543, term362543.getClass(), "id", 5475212690357232746L);
        setLongField(term362545, term362545.getClass(), "id", 3508206393902816320L);
        setField(term362545, term362545.getClass(), "extId", term362547);
        setField(term362545, term362545.getClass(), "luid", "ryGcwvKsnG");
        setIntField(term362562, term362562.getClass(), "year", 2019);
        setShortField(term362562, term362562.getClass(), "month", (short) 3);
        setShortField(term362562, term362562.getClass(), "day", (short) 24);
        setField(term362561, term362561.getClass(), "date", term362562);
        setByteField(term362566, term362566.getClass(), "hour", (byte) 12);
        setByteField(term362566, term362566.getClass(), "minute", (byte) 23);
        setByteField(term362566, term362566.getClass(), "second", (byte) 30);
        setIntField(term362566, term362566.getClass(), "nano", 238829884);
        setField(term362561, term362561.getClass(), "time", term362566);
        setField(term362545, term362545.getClass(), "registerTime", term362561);
        setIntField(term362572, term362572.getClass(), "year", 2026);
        setShortField(term362572, term362572.getClass(), "month", (short) 12);
        setShortField(term362572, term362572.getClass(), "day", (short) 4);
        setField(term362571, term362571.getClass(), "date", term362572);
        setByteField(term362576, term362576.getClass(), "hour", (byte) 13);
        setByteField(term362576, term362576.getClass(), "minute", (byte) 45);
        setByteField(term362576, term362576.getClass(), "second", (byte) 45);
        setIntField(term362576, term362576.getClass(), "nano", 917953175);
        setField(term362571, term362571.getClass(), "time", term362576);
        setField(term362545, term362545.getClass(), "accessTime", term362571);
        setField(term362543, term362543.getClass(), "card", term362545);
        setField(term362543, term362543.getClass(), "userName", "YfYzzRDpwX");
        setIntField(term362543, term362543.getClass(), "level", 1191949760);
        setIntField(term362543, term362543.getClass(), "reincarnationNum", -1058761359);
        setLongField(term362543, term362543.getClass(), "exp", -3888208882979826873L);
        setLongField(term362543, term362543.getClass(), "point", 9103267917283365845L);
        setLongField(term362543, term362543.getClass(), "totalPoint", 826801555577718782L);
        setIntField(term362543, term362543.getClass(), "playCount", 2037048181);
        setIntField(term362543, term362543.getClass(), "jewelCount", -91071557);
        setIntField(term362543, term362543.getClass(), "totalJewelCount", 1456767992);
        setIntField(term362543, term362543.getClass(), "medalCount", -379915153);
        setIntField(term362543, term362543.getClass(), "playerRating", -1922064928);
        setIntField(term362543, term362543.getClass(), "highestRating", 630011147);
        setIntField(term362543, term362543.getClass(), "battlePoint", 1619748471);
        setIntField(term362543, term362543.getClass(), "bestBattlePoint", -1544582819);
        setIntField(term362543, term362543.getClass(), "overDamageBattlePoint", 1684332623);
        setBooleanField(term362543, term362543.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term362543, term362543.getClass(), "nameplateId", 1075685063);
        setIntField(term362543, term362543.getClass(), "trophyId", -1640861496);
        setIntField(term362543, term362543.getClass(), "cardId", -338446532);
        setIntField(term362543, term362543.getClass(), "characterId", 57124196);
        setIntField(term362543, term362543.getClass(), "characterVoiceNo", -1012082404);
        setIntField(term362543, term362543.getClass(), "tabSetting", -1497218336);
        setIntField(term362543, term362543.getClass(), "tabSortSetting", -908052130);
        setIntField(term362543, term362543.getClass(), "cardCategorySetting", -626484372);
        setIntField(term362543, term362543.getClass(), "cardSortSetting", -674082910);
        setIntField(term362543, term362543.getClass(), "rivalScoreCategorySetting", -1971003790);
        setIntField(term362543, term362543.getClass(), "playedTutorialBit", -2074382295);
        setIntField(term362543, term362543.getClass(), "firstTutorialCancelNum", 42134483);
        setLongField(term362543, term362543.getClass(), "sumTechHighScore", -6292123288369179914L);
        setLongField(term362543, term362543.getClass(), "sumTechBasicHighScore", -7676856940680206318L);
        setLongField(term362543, term362543.getClass(), "sumTechAdvancedHighScore", -4277917745779749832L);
        setLongField(term362543, term362543.getClass(), "sumTechExpertHighScore", -4593658646091219719L);
        setLongField(term362543, term362543.getClass(), "sumTechMasterHighScore", 6501628459970826414L);
        setLongField(term362543, term362543.getClass(), "sumTechLunaticHighScore", 2999803632891024711L);
        setLongField(term362543, term362543.getClass(), "sumBattleHighScore", 7115195112761692083L);
        setLongField(term362543, term362543.getClass(), "sumBattleBasicHighScore", -5371706608023530485L);
        setLongField(term362543, term362543.getClass(), "sumBattleAdvancedHighScore", -7879299166133432602L);
        setLongField(term362543, term362543.getClass(), "sumBattleExpertHighScore", -6114042952153034119L);
        setLongField(term362543, term362543.getClass(), "sumBattleMasterHighScore", -855429675423981962L);
        setLongField(term362543, term362543.getClass(), "sumBattleLunaticHighScore", 2728903142883129288L);
        setField(term362543, term362543.getClass(), "eventWatchedDate", "iLdntHNLlb");
        setField(term362543, term362543.getClass(), "cmEventWatchedDate", "dmtvGoPFMz");
        setField(term362543, term362543.getClass(), "firstGameId", "omCAshLFBc");
        setField(term362543, term362543.getClass(), "firstRomVersion", "FOiAoOHenu");
        setField(term362543, term362543.getClass(), "firstDataVersion", "oBoiwmmBsG");
        setField(term362543, term362543.getClass(), "firstPlayDate", "RkVhhbbrDb");
        setField(term362543, term362543.getClass(), "lastGameId", "YRIQOuomci");
        setField(term362543, term362543.getClass(), "lastRomVersion", "IvIJBAZVKF");
        setField(term362543, term362543.getClass(), "lastDataVersion", "wKIgrbFWVG");
        setField(term362543, term362543.getClass(), "compatibleCmVersion", "VhWamhmJkG");
        setField(term362543, term362543.getClass(), "lastPlayDate", "wAooJbXKDp");
        setIntField(term362543, term362543.getClass(), "lastPlaceId", 1126763966);
        setField(term362543, term362543.getClass(), "lastPlaceName", "CmeJChKlxD");
        setIntField(term362543, term362543.getClass(), "lastRegionId", 548928897);
        setField(term362543, term362543.getClass(), "lastRegionName", "ykMBkjJHCt");
        setIntField(term362543, term362543.getClass(), "lastAllNetId", -1353632230);
        setField(term362543, term362543.getClass(), "lastClientId", "MSGfPDgvSC");
        setIntField(term362543, term362543.getClass(), "lastUsedDeckId", -235698727);
        setIntField(term362543, term362543.getClass(), "lastPlayMusicLevel", 1059593544);
        setIntField(term362543, term362543.getClass(), "lastEmoneyBrand", 451264054);
        setField(term362541, term362541.getClass(), "user", term362543);
        setIntField(term362541, term362541.getClass(), "levelId", 1394901260);
        setIntField(term362541, term362541.getClass(), "allBreakCount", 1680728198);
        setIntField(term362541, term362541.getClass(), "allBreakPlusCount", 1135237997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term362541, args);
    }

};


