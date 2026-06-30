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

public class ExternalUserData_getCardSortSetting_1424855563147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146352;

    public ExternalUserData_getCardSortSetting_1424855563147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146352 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term146352, term146352.getClass(), "accessCode", null);
        setField(term146352, term146352.getClass(), "userName", null);
        setIntField(term146352, term146352.getClass(), "level", 0);
        setIntField(term146352, term146352.getClass(), "reincarnationNum", 0);
        setLongField(term146352, term146352.getClass(), "exp", 0L);
        setLongField(term146352, term146352.getClass(), "point", 0L);
        setLongField(term146352, term146352.getClass(), "totalPoint", 0L);
        setIntField(term146352, term146352.getClass(), "playCount", 0);
        setIntField(term146352, term146352.getClass(), "jewelCount", 0);
        setIntField(term146352, term146352.getClass(), "totalJewelCount", 0);
        setIntField(term146352, term146352.getClass(), "medalCount", 0);
        setIntField(term146352, term146352.getClass(), "playerRating", 0);
        setIntField(term146352, term146352.getClass(), "highestRating", 0);
        setIntField(term146352, term146352.getClass(), "battlePoint", 0);
        setIntField(term146352, term146352.getClass(), "bestBattlePoint", 0);
        setIntField(term146352, term146352.getClass(), "overDamageBattlePoint", 0);
        setIntField(term146352, term146352.getClass(), "nameplateId", 0);
        setIntField(term146352, term146352.getClass(), "trophyId", 0);
        setIntField(term146352, term146352.getClass(), "cardId", 0);
        setIntField(term146352, term146352.getClass(), "characterId", 0);
        setIntField(term146352, term146352.getClass(), "tabSetting", 0);
        setIntField(term146352, term146352.getClass(), "tabSortSetting", 0);
        setIntField(term146352, term146352.getClass(), "cardCategorySetting", 0);
        setIntField(term146352, term146352.getClass(), "cardSortSetting", 0);
        setIntField(term146352, term146352.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term146352, term146352.getClass(), "playedTutorialBit", 0);
        setIntField(term146352, term146352.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term146352, term146352.getClass(), "sumTechHighScore", 0L);
        setLongField(term146352, term146352.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term146352, term146352.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term146352, term146352.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term146352, term146352.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term146352, term146352.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term146352, term146352.getClass(), "sumBattleHighScore", 0L);
        setLongField(term146352, term146352.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term146352, term146352.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term146352, term146352.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term146352, term146352.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term146352, term146352.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term146352, term146352.getClass(), "eventWatchedDate", null);
        setField(term146352, term146352.getClass(), "cmEventWatchedDate", null);
        setField(term146352, term146352.getClass(), "firstGameId", null);
        setField(term146352, term146352.getClass(), "firstRomVersion", null);
        setField(term146352, term146352.getClass(), "firstDataVersion", null);
        setField(term146352, term146352.getClass(), "firstPlayDate", null);
        setField(term146352, term146352.getClass(), "lastGameId", null);
        setField(term146352, term146352.getClass(), "lastRomVersion", null);
        setField(term146352, term146352.getClass(), "lastDataVersion", null);
        setField(term146352, term146352.getClass(), "compatibleCmVersion", null);
        setField(term146352, term146352.getClass(), "lastPlayDate", null);
        setIntField(term146352, term146352.getClass(), "lastPlaceId", 0);
        setField(term146352, term146352.getClass(), "lastPlaceName", null);
        setIntField(term146352, term146352.getClass(), "lastRegionId", 0);
        setField(term146352, term146352.getClass(), "lastRegionName", null);
        setIntField(term146352, term146352.getClass(), "lastAllNetId", 0);
        setField(term146352, term146352.getClass(), "lastClientId", null);
        setIntField(term146352, term146352.getClass(), "lastUsedDeckId", 0);
        setIntField(term146352, term146352.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term146352, term146352.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardSortSetting", argTypes, term146352, args);
    }

};


