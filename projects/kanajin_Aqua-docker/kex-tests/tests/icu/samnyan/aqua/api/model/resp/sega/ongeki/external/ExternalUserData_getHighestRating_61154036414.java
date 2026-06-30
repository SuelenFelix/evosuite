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

public class ExternalUserData_getHighestRating_61154036414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3169768;

    public ExternalUserData_getHighestRating_61154036414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3169768 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3169768, term3169768.getClass(), "accessCode", "pMzjNUzrrO");
        setField(term3169768, term3169768.getClass(), "userName", "sTgMEujUus");
        setIntField(term3169768, term3169768.getClass(), "level", 1273328909);
        setIntField(term3169768, term3169768.getClass(), "reincarnationNum", 652429785);
        setLongField(term3169768, term3169768.getClass(), "exp", -6532479421138768981L);
        setLongField(term3169768, term3169768.getClass(), "point", 2534722478647788751L);
        setLongField(term3169768, term3169768.getClass(), "totalPoint", -8365037287586938037L);
        setIntField(term3169768, term3169768.getClass(), "playCount", 331754349);
        setIntField(term3169768, term3169768.getClass(), "jewelCount", -427652416);
        setIntField(term3169768, term3169768.getClass(), "totalJewelCount", 643507396);
        setIntField(term3169768, term3169768.getClass(), "medalCount", -448668948);
        setIntField(term3169768, term3169768.getClass(), "playerRating", 1438965467);
        setIntField(term3169768, term3169768.getClass(), "highestRating", 1684392446);
        setIntField(term3169768, term3169768.getClass(), "battlePoint", -271041606);
        setIntField(term3169768, term3169768.getClass(), "bestBattlePoint", -893106376);
        setIntField(term3169768, term3169768.getClass(), "overDamageBattlePoint", 1530343452);
        setIntField(term3169768, term3169768.getClass(), "nameplateId", -884526877);
        setIntField(term3169768, term3169768.getClass(), "trophyId", -377692282);
        setIntField(term3169768, term3169768.getClass(), "cardId", 1201616706);
        setIntField(term3169768, term3169768.getClass(), "characterId", -2130052764);
        setIntField(term3169768, term3169768.getClass(), "tabSetting", -1091795357);
        setIntField(term3169768, term3169768.getClass(), "tabSortSetting", -1317659430);
        setIntField(term3169768, term3169768.getClass(), "cardCategorySetting", 299519805);
        setIntField(term3169768, term3169768.getClass(), "cardSortSetting", -296491733);
        setIntField(term3169768, term3169768.getClass(), "rivalScoreCategorySetting", -160329726);
        setIntField(term3169768, term3169768.getClass(), "playedTutorialBit", -1982720282);
        setIntField(term3169768, term3169768.getClass(), "firstTutorialCancelNum", 1483486361);
        setLongField(term3169768, term3169768.getClass(), "sumTechHighScore", -6644935317919978369L);
        setLongField(term3169768, term3169768.getClass(), "sumTechBasicHighScore", -531054837101291427L);
        setLongField(term3169768, term3169768.getClass(), "sumTechAdvancedHighScore", -387529740589347117L);
        setLongField(term3169768, term3169768.getClass(), "sumTechExpertHighScore", 41558732654150734L);
        setLongField(term3169768, term3169768.getClass(), "sumTechMasterHighScore", -7860414171669175097L);
        setLongField(term3169768, term3169768.getClass(), "sumTechLunaticHighScore", -4012585014273396986L);
        setLongField(term3169768, term3169768.getClass(), "sumBattleHighScore", 1248520002711379449L);
        setLongField(term3169768, term3169768.getClass(), "sumBattleBasicHighScore", -7428537655401114547L);
        setLongField(term3169768, term3169768.getClass(), "sumBattleAdvancedHighScore", 6803715484615065265L);
        setLongField(term3169768, term3169768.getClass(), "sumBattleExpertHighScore", 2093682111139593066L);
        setLongField(term3169768, term3169768.getClass(), "sumBattleMasterHighScore", 8270525146797103649L);
        setLongField(term3169768, term3169768.getClass(), "sumBattleLunaticHighScore", -6164367519920208627L);
        setField(term3169768, term3169768.getClass(), "eventWatchedDate", "PSOCeDRYaH");
        setField(term3169768, term3169768.getClass(), "cmEventWatchedDate", "FgbneoEFZa");
        setField(term3169768, term3169768.getClass(), "firstGameId", "EUjPFSutEi");
        setField(term3169768, term3169768.getClass(), "firstRomVersion", "MXTvbTtMxA");
        setField(term3169768, term3169768.getClass(), "firstDataVersion", "ECRHVkrKQi");
        setField(term3169768, term3169768.getClass(), "firstPlayDate", "ObqYtDZTIw");
        setField(term3169768, term3169768.getClass(), "lastGameId", "DGdCTjdiGE");
        setField(term3169768, term3169768.getClass(), "lastRomVersion", "hVOdjHxRqj");
        setField(term3169768, term3169768.getClass(), "lastDataVersion", "tVPLLSYSmG");
        setField(term3169768, term3169768.getClass(), "compatibleCmVersion", "biiFVBXBSM");
        setField(term3169768, term3169768.getClass(), "lastPlayDate", "VEtLkNQkRW");
        setIntField(term3169768, term3169768.getClass(), "lastPlaceId", 11978292);
        setField(term3169768, term3169768.getClass(), "lastPlaceName", "NOENoqYJqE");
        setIntField(term3169768, term3169768.getClass(), "lastRegionId", 1920869255);
        setField(term3169768, term3169768.getClass(), "lastRegionName", "jXHIDOYtmM");
        setIntField(term3169768, term3169768.getClass(), "lastAllNetId", 1801275646);
        setField(term3169768, term3169768.getClass(), "lastClientId", "TAlAFWrkrD");
        setIntField(term3169768, term3169768.getClass(), "lastUsedDeckId", 1335417055);
        setIntField(term3169768, term3169768.getClass(), "lastPlayMusicLevel", -1691358262);
        setIntField(term3169768, term3169768.getClass(), "lastEmoneyBrand", -564191249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term3169768, args);
    }

};


