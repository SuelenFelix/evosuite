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

public class ExternalUserData_getAccessCode_885782549124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145340;

    public ExternalUserData_getAccessCode_885782549124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145340 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term145340, term145340.getClass(), "accessCode", null);
        setField(term145340, term145340.getClass(), "userName", null);
        setIntField(term145340, term145340.getClass(), "level", 0);
        setIntField(term145340, term145340.getClass(), "reincarnationNum", 0);
        setLongField(term145340, term145340.getClass(), "exp", 0L);
        setLongField(term145340, term145340.getClass(), "point", 0L);
        setLongField(term145340, term145340.getClass(), "totalPoint", 0L);
        setIntField(term145340, term145340.getClass(), "playCount", 0);
        setIntField(term145340, term145340.getClass(), "jewelCount", 0);
        setIntField(term145340, term145340.getClass(), "totalJewelCount", 0);
        setIntField(term145340, term145340.getClass(), "medalCount", 0);
        setIntField(term145340, term145340.getClass(), "playerRating", 0);
        setIntField(term145340, term145340.getClass(), "highestRating", 0);
        setIntField(term145340, term145340.getClass(), "battlePoint", 0);
        setIntField(term145340, term145340.getClass(), "bestBattlePoint", 0);
        setIntField(term145340, term145340.getClass(), "overDamageBattlePoint", 0);
        setIntField(term145340, term145340.getClass(), "nameplateId", 0);
        setIntField(term145340, term145340.getClass(), "trophyId", 0);
        setIntField(term145340, term145340.getClass(), "cardId", 0);
        setIntField(term145340, term145340.getClass(), "characterId", 0);
        setIntField(term145340, term145340.getClass(), "tabSetting", 0);
        setIntField(term145340, term145340.getClass(), "tabSortSetting", 0);
        setIntField(term145340, term145340.getClass(), "cardCategorySetting", 0);
        setIntField(term145340, term145340.getClass(), "cardSortSetting", 0);
        setIntField(term145340, term145340.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term145340, term145340.getClass(), "playedTutorialBit", 0);
        setIntField(term145340, term145340.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term145340, term145340.getClass(), "sumTechHighScore", 0L);
        setLongField(term145340, term145340.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term145340, term145340.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term145340, term145340.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term145340, term145340.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term145340, term145340.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term145340, term145340.getClass(), "sumBattleHighScore", 0L);
        setLongField(term145340, term145340.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term145340, term145340.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term145340, term145340.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term145340, term145340.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term145340, term145340.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term145340, term145340.getClass(), "eventWatchedDate", null);
        setField(term145340, term145340.getClass(), "cmEventWatchedDate", null);
        setField(term145340, term145340.getClass(), "firstGameId", null);
        setField(term145340, term145340.getClass(), "firstRomVersion", null);
        setField(term145340, term145340.getClass(), "firstDataVersion", null);
        setField(term145340, term145340.getClass(), "firstPlayDate", null);
        setField(term145340, term145340.getClass(), "lastGameId", null);
        setField(term145340, term145340.getClass(), "lastRomVersion", null);
        setField(term145340, term145340.getClass(), "lastDataVersion", null);
        setField(term145340, term145340.getClass(), "compatibleCmVersion", null);
        setField(term145340, term145340.getClass(), "lastPlayDate", null);
        setIntField(term145340, term145340.getClass(), "lastPlaceId", 0);
        setField(term145340, term145340.getClass(), "lastPlaceName", null);
        setIntField(term145340, term145340.getClass(), "lastRegionId", 0);
        setField(term145340, term145340.getClass(), "lastRegionName", null);
        setIntField(term145340, term145340.getClass(), "lastAllNetId", 0);
        setField(term145340, term145340.getClass(), "lastClientId", null);
        setIntField(term145340, term145340.getClass(), "lastUsedDeckId", 0);
        setIntField(term145340, term145340.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term145340, term145340.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessCode", argTypes, term145340, args);
    }

};


