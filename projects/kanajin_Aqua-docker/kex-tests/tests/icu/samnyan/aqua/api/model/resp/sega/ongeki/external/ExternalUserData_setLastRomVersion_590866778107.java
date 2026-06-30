package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_setLastRomVersion_590866778107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3206868;

    public ExternalUserData_setLastRomVersion_590866778107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3206868 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3206868, term3206868.getClass(), "accessCode", "KlNnSJyLla");
        setField(term3206868, term3206868.getClass(), "userName", "uygSVPDiCi");
        setIntField(term3206868, term3206868.getClass(), "level", -142987820);
        setIntField(term3206868, term3206868.getClass(), "reincarnationNum", -705166483);
        setLongField(term3206868, term3206868.getClass(), "exp", 7234604593603309573L);
        setLongField(term3206868, term3206868.getClass(), "point", 6402118035801827976L);
        setLongField(term3206868, term3206868.getClass(), "totalPoint", 7402975490723154607L);
        setIntField(term3206868, term3206868.getClass(), "playCount", -2036319041);
        setIntField(term3206868, term3206868.getClass(), "jewelCount", -1791405720);
        setIntField(term3206868, term3206868.getClass(), "totalJewelCount", -987932930);
        setIntField(term3206868, term3206868.getClass(), "medalCount", -1422968597);
        setIntField(term3206868, term3206868.getClass(), "playerRating", 160725141);
        setIntField(term3206868, term3206868.getClass(), "highestRating", 397789153);
        setIntField(term3206868, term3206868.getClass(), "battlePoint", 1143211772);
        setIntField(term3206868, term3206868.getClass(), "bestBattlePoint", -2019818323);
        setIntField(term3206868, term3206868.getClass(), "overDamageBattlePoint", 1078514906);
        setIntField(term3206868, term3206868.getClass(), "nameplateId", 1674653764);
        setIntField(term3206868, term3206868.getClass(), "trophyId", -1581531196);
        setIntField(term3206868, term3206868.getClass(), "cardId", 1911927832);
        setIntField(term3206868, term3206868.getClass(), "characterId", 1937560999);
        setIntField(term3206868, term3206868.getClass(), "tabSetting", 795073625);
        setIntField(term3206868, term3206868.getClass(), "tabSortSetting", -919073835);
        setIntField(term3206868, term3206868.getClass(), "cardCategorySetting", 1547109990);
        setIntField(term3206868, term3206868.getClass(), "cardSortSetting", -1804163122);
        setIntField(term3206868, term3206868.getClass(), "rivalScoreCategorySetting", -1206262683);
        setIntField(term3206868, term3206868.getClass(), "playedTutorialBit", 337058354);
        setIntField(term3206868, term3206868.getClass(), "firstTutorialCancelNum", -2056244655);
        setLongField(term3206868, term3206868.getClass(), "sumTechHighScore", 4776581276346123508L);
        setLongField(term3206868, term3206868.getClass(), "sumTechBasicHighScore", 2775680810144735234L);
        setLongField(term3206868, term3206868.getClass(), "sumTechAdvancedHighScore", -2728803459081965758L);
        setLongField(term3206868, term3206868.getClass(), "sumTechExpertHighScore", -6711579221400131175L);
        setLongField(term3206868, term3206868.getClass(), "sumTechMasterHighScore", -8814151838892541374L);
        setLongField(term3206868, term3206868.getClass(), "sumTechLunaticHighScore", 5455183974934175720L);
        setLongField(term3206868, term3206868.getClass(), "sumBattleHighScore", 5798432107428572777L);
        setLongField(term3206868, term3206868.getClass(), "sumBattleBasicHighScore", 3813140676662534633L);
        setLongField(term3206868, term3206868.getClass(), "sumBattleAdvancedHighScore", -3261707881619196388L);
        setLongField(term3206868, term3206868.getClass(), "sumBattleExpertHighScore", -5629155840427445510L);
        setLongField(term3206868, term3206868.getClass(), "sumBattleMasterHighScore", -8885892446204827602L);
        setLongField(term3206868, term3206868.getClass(), "sumBattleLunaticHighScore", 1726516496938021637L);
        setField(term3206868, term3206868.getClass(), "eventWatchedDate", "xQaANIiess");
        setField(term3206868, term3206868.getClass(), "cmEventWatchedDate", "UjyHZFSjZI");
        setField(term3206868, term3206868.getClass(), "firstGameId", "WFCKEKyDjV");
        setField(term3206868, term3206868.getClass(), "firstRomVersion", "lEOksPQulm");
        setField(term3206868, term3206868.getClass(), "firstDataVersion", "sqnVzlVTRS");
        setField(term3206868, term3206868.getClass(), "firstPlayDate", "yCZzoLdEYs");
        setField(term3206868, term3206868.getClass(), "lastGameId", "qMaQkjvpGw");
        setField(term3206868, term3206868.getClass(), "lastRomVersion", "PxORkrAtFS");
        setField(term3206868, term3206868.getClass(), "lastDataVersion", "mOrNYekhtd");
        setField(term3206868, term3206868.getClass(), "compatibleCmVersion", "BYCxqeKqmh");
        setField(term3206868, term3206868.getClass(), "lastPlayDate", "oGxsJgPJCZ");
        setIntField(term3206868, term3206868.getClass(), "lastPlaceId", -293648762);
        setField(term3206868, term3206868.getClass(), "lastPlaceName", "xdmobcYbtp");
        setIntField(term3206868, term3206868.getClass(), "lastRegionId", -900692476);
        setField(term3206868, term3206868.getClass(), "lastRegionName", "RUnJdppvVR");
        setIntField(term3206868, term3206868.getClass(), "lastAllNetId", 1558550190);
        setField(term3206868, term3206868.getClass(), "lastClientId", "zVkzWeaMMX");
        setIntField(term3206868, term3206868.getClass(), "lastUsedDeckId", -1882778870);
        setIntField(term3206868, term3206868.getClass(), "lastPlayMusicLevel", -1236740275);
        setIntField(term3206868, term3206868.getClass(), "lastEmoneyBrand", 879369275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jjmNEQhwqL";
        callMethod(klass, "setLastRomVersion", argTypes, term3206868, args);
    }

};


