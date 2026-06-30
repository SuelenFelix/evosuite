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

public class ExternalUserData_getPlayerRating_565476061135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145824;

    public ExternalUserData_getPlayerRating_565476061135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145824 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term145824, term145824.getClass(), "accessCode", null);
        setField(term145824, term145824.getClass(), "userName", null);
        setIntField(term145824, term145824.getClass(), "level", 0);
        setIntField(term145824, term145824.getClass(), "reincarnationNum", 0);
        setLongField(term145824, term145824.getClass(), "exp", 0L);
        setLongField(term145824, term145824.getClass(), "point", 0L);
        setLongField(term145824, term145824.getClass(), "totalPoint", 0L);
        setIntField(term145824, term145824.getClass(), "playCount", 0);
        setIntField(term145824, term145824.getClass(), "jewelCount", 0);
        setIntField(term145824, term145824.getClass(), "totalJewelCount", 0);
        setIntField(term145824, term145824.getClass(), "medalCount", 0);
        setIntField(term145824, term145824.getClass(), "playerRating", 0);
        setIntField(term145824, term145824.getClass(), "highestRating", 0);
        setIntField(term145824, term145824.getClass(), "battlePoint", 0);
        setIntField(term145824, term145824.getClass(), "bestBattlePoint", 0);
        setIntField(term145824, term145824.getClass(), "overDamageBattlePoint", 0);
        setIntField(term145824, term145824.getClass(), "nameplateId", 0);
        setIntField(term145824, term145824.getClass(), "trophyId", 0);
        setIntField(term145824, term145824.getClass(), "cardId", 0);
        setIntField(term145824, term145824.getClass(), "characterId", 0);
        setIntField(term145824, term145824.getClass(), "tabSetting", 0);
        setIntField(term145824, term145824.getClass(), "tabSortSetting", 0);
        setIntField(term145824, term145824.getClass(), "cardCategorySetting", 0);
        setIntField(term145824, term145824.getClass(), "cardSortSetting", 0);
        setIntField(term145824, term145824.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term145824, term145824.getClass(), "playedTutorialBit", 0);
        setIntField(term145824, term145824.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term145824, term145824.getClass(), "sumTechHighScore", 0L);
        setLongField(term145824, term145824.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term145824, term145824.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term145824, term145824.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term145824, term145824.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term145824, term145824.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term145824, term145824.getClass(), "sumBattleHighScore", 0L);
        setLongField(term145824, term145824.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term145824, term145824.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term145824, term145824.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term145824, term145824.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term145824, term145824.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term145824, term145824.getClass(), "eventWatchedDate", null);
        setField(term145824, term145824.getClass(), "cmEventWatchedDate", null);
        setField(term145824, term145824.getClass(), "firstGameId", null);
        setField(term145824, term145824.getClass(), "firstRomVersion", null);
        setField(term145824, term145824.getClass(), "firstDataVersion", null);
        setField(term145824, term145824.getClass(), "firstPlayDate", null);
        setField(term145824, term145824.getClass(), "lastGameId", null);
        setField(term145824, term145824.getClass(), "lastRomVersion", null);
        setField(term145824, term145824.getClass(), "lastDataVersion", null);
        setField(term145824, term145824.getClass(), "compatibleCmVersion", null);
        setField(term145824, term145824.getClass(), "lastPlayDate", null);
        setIntField(term145824, term145824.getClass(), "lastPlaceId", 0);
        setField(term145824, term145824.getClass(), "lastPlaceName", null);
        setIntField(term145824, term145824.getClass(), "lastRegionId", 0);
        setField(term145824, term145824.getClass(), "lastRegionName", null);
        setIntField(term145824, term145824.getClass(), "lastAllNetId", 0);
        setField(term145824, term145824.getClass(), "lastClientId", null);
        setIntField(term145824, term145824.getClass(), "lastUsedDeckId", 0);
        setIntField(term145824, term145824.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term145824, term145824.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term145824, args);
    }

};


