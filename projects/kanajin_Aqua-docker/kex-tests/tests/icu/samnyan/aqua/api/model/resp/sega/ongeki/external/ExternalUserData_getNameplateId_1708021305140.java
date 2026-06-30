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

public class ExternalUserData_getNameplateId_1708021305140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146044;

    public ExternalUserData_getNameplateId_1708021305140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146044 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term146044, term146044.getClass(), "accessCode", null);
        setField(term146044, term146044.getClass(), "userName", null);
        setIntField(term146044, term146044.getClass(), "level", 0);
        setIntField(term146044, term146044.getClass(), "reincarnationNum", 0);
        setLongField(term146044, term146044.getClass(), "exp", 0L);
        setLongField(term146044, term146044.getClass(), "point", 0L);
        setLongField(term146044, term146044.getClass(), "totalPoint", 0L);
        setIntField(term146044, term146044.getClass(), "playCount", 0);
        setIntField(term146044, term146044.getClass(), "jewelCount", 0);
        setIntField(term146044, term146044.getClass(), "totalJewelCount", 0);
        setIntField(term146044, term146044.getClass(), "medalCount", 0);
        setIntField(term146044, term146044.getClass(), "playerRating", 0);
        setIntField(term146044, term146044.getClass(), "highestRating", 0);
        setIntField(term146044, term146044.getClass(), "battlePoint", 0);
        setIntField(term146044, term146044.getClass(), "bestBattlePoint", 0);
        setIntField(term146044, term146044.getClass(), "overDamageBattlePoint", 0);
        setIntField(term146044, term146044.getClass(), "nameplateId", 0);
        setIntField(term146044, term146044.getClass(), "trophyId", 0);
        setIntField(term146044, term146044.getClass(), "cardId", 0);
        setIntField(term146044, term146044.getClass(), "characterId", 0);
        setIntField(term146044, term146044.getClass(), "tabSetting", 0);
        setIntField(term146044, term146044.getClass(), "tabSortSetting", 0);
        setIntField(term146044, term146044.getClass(), "cardCategorySetting", 0);
        setIntField(term146044, term146044.getClass(), "cardSortSetting", 0);
        setIntField(term146044, term146044.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term146044, term146044.getClass(), "playedTutorialBit", 0);
        setIntField(term146044, term146044.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term146044, term146044.getClass(), "sumTechHighScore", 0L);
        setLongField(term146044, term146044.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term146044, term146044.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term146044, term146044.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term146044, term146044.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term146044, term146044.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term146044, term146044.getClass(), "sumBattleHighScore", 0L);
        setLongField(term146044, term146044.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term146044, term146044.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term146044, term146044.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term146044, term146044.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term146044, term146044.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term146044, term146044.getClass(), "eventWatchedDate", null);
        setField(term146044, term146044.getClass(), "cmEventWatchedDate", null);
        setField(term146044, term146044.getClass(), "firstGameId", null);
        setField(term146044, term146044.getClass(), "firstRomVersion", null);
        setField(term146044, term146044.getClass(), "firstDataVersion", null);
        setField(term146044, term146044.getClass(), "firstPlayDate", null);
        setField(term146044, term146044.getClass(), "lastGameId", null);
        setField(term146044, term146044.getClass(), "lastRomVersion", null);
        setField(term146044, term146044.getClass(), "lastDataVersion", null);
        setField(term146044, term146044.getClass(), "compatibleCmVersion", null);
        setField(term146044, term146044.getClass(), "lastPlayDate", null);
        setIntField(term146044, term146044.getClass(), "lastPlaceId", 0);
        setField(term146044, term146044.getClass(), "lastPlaceName", null);
        setIntField(term146044, term146044.getClass(), "lastRegionId", 0);
        setField(term146044, term146044.getClass(), "lastRegionName", null);
        setIntField(term146044, term146044.getClass(), "lastAllNetId", 0);
        setField(term146044, term146044.getClass(), "lastClientId", null);
        setIntField(term146044, term146044.getClass(), "lastUsedDeckId", 0);
        setIntField(term146044, term146044.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term146044, term146044.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term146044, args);
    }

};


