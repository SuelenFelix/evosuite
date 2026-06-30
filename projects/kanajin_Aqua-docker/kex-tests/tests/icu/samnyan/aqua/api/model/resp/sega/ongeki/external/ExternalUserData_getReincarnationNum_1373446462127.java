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

public class ExternalUserData_getReincarnationNum_1373446462127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145472;

    public ExternalUserData_getReincarnationNum_1373446462127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145472 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term145472, term145472.getClass(), "accessCode", null);
        setField(term145472, term145472.getClass(), "userName", null);
        setIntField(term145472, term145472.getClass(), "level", 0);
        setIntField(term145472, term145472.getClass(), "reincarnationNum", 0);
        setLongField(term145472, term145472.getClass(), "exp", 0L);
        setLongField(term145472, term145472.getClass(), "point", 0L);
        setLongField(term145472, term145472.getClass(), "totalPoint", 0L);
        setIntField(term145472, term145472.getClass(), "playCount", 0);
        setIntField(term145472, term145472.getClass(), "jewelCount", 0);
        setIntField(term145472, term145472.getClass(), "totalJewelCount", 0);
        setIntField(term145472, term145472.getClass(), "medalCount", 0);
        setIntField(term145472, term145472.getClass(), "playerRating", 0);
        setIntField(term145472, term145472.getClass(), "highestRating", 0);
        setIntField(term145472, term145472.getClass(), "battlePoint", 0);
        setIntField(term145472, term145472.getClass(), "bestBattlePoint", 0);
        setIntField(term145472, term145472.getClass(), "overDamageBattlePoint", 0);
        setIntField(term145472, term145472.getClass(), "nameplateId", 0);
        setIntField(term145472, term145472.getClass(), "trophyId", 0);
        setIntField(term145472, term145472.getClass(), "cardId", 0);
        setIntField(term145472, term145472.getClass(), "characterId", 0);
        setIntField(term145472, term145472.getClass(), "tabSetting", 0);
        setIntField(term145472, term145472.getClass(), "tabSortSetting", 0);
        setIntField(term145472, term145472.getClass(), "cardCategorySetting", 0);
        setIntField(term145472, term145472.getClass(), "cardSortSetting", 0);
        setIntField(term145472, term145472.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term145472, term145472.getClass(), "playedTutorialBit", 0);
        setIntField(term145472, term145472.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term145472, term145472.getClass(), "sumTechHighScore", 0L);
        setLongField(term145472, term145472.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term145472, term145472.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term145472, term145472.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term145472, term145472.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term145472, term145472.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term145472, term145472.getClass(), "sumBattleHighScore", 0L);
        setLongField(term145472, term145472.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term145472, term145472.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term145472, term145472.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term145472, term145472.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term145472, term145472.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term145472, term145472.getClass(), "eventWatchedDate", null);
        setField(term145472, term145472.getClass(), "cmEventWatchedDate", null);
        setField(term145472, term145472.getClass(), "firstGameId", null);
        setField(term145472, term145472.getClass(), "firstRomVersion", null);
        setField(term145472, term145472.getClass(), "firstDataVersion", null);
        setField(term145472, term145472.getClass(), "firstPlayDate", null);
        setField(term145472, term145472.getClass(), "lastGameId", null);
        setField(term145472, term145472.getClass(), "lastRomVersion", null);
        setField(term145472, term145472.getClass(), "lastDataVersion", null);
        setField(term145472, term145472.getClass(), "compatibleCmVersion", null);
        setField(term145472, term145472.getClass(), "lastPlayDate", null);
        setIntField(term145472, term145472.getClass(), "lastPlaceId", 0);
        setField(term145472, term145472.getClass(), "lastPlaceName", null);
        setIntField(term145472, term145472.getClass(), "lastRegionId", 0);
        setField(term145472, term145472.getClass(), "lastRegionName", null);
        setIntField(term145472, term145472.getClass(), "lastAllNetId", 0);
        setField(term145472, term145472.getClass(), "lastClientId", null);
        setIntField(term145472, term145472.getClass(), "lastUsedDeckId", 0);
        setIntField(term145472, term145472.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term145472, term145472.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReincarnationNum", argTypes, term145472, args);
    }

};


