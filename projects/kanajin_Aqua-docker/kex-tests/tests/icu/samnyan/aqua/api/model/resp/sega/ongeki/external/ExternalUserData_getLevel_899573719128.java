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

public class ExternalUserData_getLevel_899573719128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3214294;

    public ExternalUserData_getLevel_899573719128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3214294 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3214294, term3214294.getClass(), "accessCode", null);
        setField(term3214294, term3214294.getClass(), "userName", null);
        setIntField(term3214294, term3214294.getClass(), "level", 0);
        setIntField(term3214294, term3214294.getClass(), "reincarnationNum", 0);
        setLongField(term3214294, term3214294.getClass(), "exp", 0L);
        setLongField(term3214294, term3214294.getClass(), "point", 0L);
        setLongField(term3214294, term3214294.getClass(), "totalPoint", 0L);
        setIntField(term3214294, term3214294.getClass(), "playCount", 0);
        setIntField(term3214294, term3214294.getClass(), "jewelCount", 0);
        setIntField(term3214294, term3214294.getClass(), "totalJewelCount", 0);
        setIntField(term3214294, term3214294.getClass(), "medalCount", 0);
        setIntField(term3214294, term3214294.getClass(), "playerRating", 0);
        setIntField(term3214294, term3214294.getClass(), "highestRating", 0);
        setIntField(term3214294, term3214294.getClass(), "battlePoint", 0);
        setIntField(term3214294, term3214294.getClass(), "bestBattlePoint", 0);
        setIntField(term3214294, term3214294.getClass(), "overDamageBattlePoint", 0);
        setIntField(term3214294, term3214294.getClass(), "nameplateId", 0);
        setIntField(term3214294, term3214294.getClass(), "trophyId", 0);
        setIntField(term3214294, term3214294.getClass(), "cardId", 0);
        setIntField(term3214294, term3214294.getClass(), "characterId", 0);
        setIntField(term3214294, term3214294.getClass(), "tabSetting", 0);
        setIntField(term3214294, term3214294.getClass(), "tabSortSetting", 0);
        setIntField(term3214294, term3214294.getClass(), "cardCategorySetting", 0);
        setIntField(term3214294, term3214294.getClass(), "cardSortSetting", 0);
        setIntField(term3214294, term3214294.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term3214294, term3214294.getClass(), "playedTutorialBit", 0);
        setIntField(term3214294, term3214294.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term3214294, term3214294.getClass(), "sumTechHighScore", 0L);
        setLongField(term3214294, term3214294.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term3214294, term3214294.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term3214294, term3214294.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term3214294, term3214294.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term3214294, term3214294.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term3214294, term3214294.getClass(), "sumBattleHighScore", 0L);
        setLongField(term3214294, term3214294.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term3214294, term3214294.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term3214294, term3214294.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term3214294, term3214294.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term3214294, term3214294.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term3214294, term3214294.getClass(), "eventWatchedDate", null);
        setField(term3214294, term3214294.getClass(), "cmEventWatchedDate", null);
        setField(term3214294, term3214294.getClass(), "firstGameId", null);
        setField(term3214294, term3214294.getClass(), "firstRomVersion", null);
        setField(term3214294, term3214294.getClass(), "firstDataVersion", null);
        setField(term3214294, term3214294.getClass(), "firstPlayDate", null);
        setField(term3214294, term3214294.getClass(), "lastGameId", null);
        setField(term3214294, term3214294.getClass(), "lastRomVersion", null);
        setField(term3214294, term3214294.getClass(), "lastDataVersion", null);
        setField(term3214294, term3214294.getClass(), "compatibleCmVersion", null);
        setField(term3214294, term3214294.getClass(), "lastPlayDate", null);
        setIntField(term3214294, term3214294.getClass(), "lastPlaceId", 0);
        setField(term3214294, term3214294.getClass(), "lastPlaceName", null);
        setIntField(term3214294, term3214294.getClass(), "lastRegionId", 0);
        setField(term3214294, term3214294.getClass(), "lastRegionName", null);
        setIntField(term3214294, term3214294.getClass(), "lastAllNetId", 0);
        setField(term3214294, term3214294.getClass(), "lastClientId", null);
        setIntField(term3214294, term3214294.getClass(), "lastUsedDeckId", 0);
        setIntField(term3214294, term3214294.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term3214294, term3214294.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term3214294, args);
    }

};


