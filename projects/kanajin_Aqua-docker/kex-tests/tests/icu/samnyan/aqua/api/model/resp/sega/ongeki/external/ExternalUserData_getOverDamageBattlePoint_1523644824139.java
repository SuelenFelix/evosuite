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

public class ExternalUserData_getOverDamageBattlePoint_1523644824139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146000;

    public ExternalUserData_getOverDamageBattlePoint_1523644824139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146000 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term146000, term146000.getClass(), "accessCode", null);
        setField(term146000, term146000.getClass(), "userName", null);
        setIntField(term146000, term146000.getClass(), "level", 0);
        setIntField(term146000, term146000.getClass(), "reincarnationNum", 0);
        setLongField(term146000, term146000.getClass(), "exp", 0L);
        setLongField(term146000, term146000.getClass(), "point", 0L);
        setLongField(term146000, term146000.getClass(), "totalPoint", 0L);
        setIntField(term146000, term146000.getClass(), "playCount", 0);
        setIntField(term146000, term146000.getClass(), "jewelCount", 0);
        setIntField(term146000, term146000.getClass(), "totalJewelCount", 0);
        setIntField(term146000, term146000.getClass(), "medalCount", 0);
        setIntField(term146000, term146000.getClass(), "playerRating", 0);
        setIntField(term146000, term146000.getClass(), "highestRating", 0);
        setIntField(term146000, term146000.getClass(), "battlePoint", 0);
        setIntField(term146000, term146000.getClass(), "bestBattlePoint", 0);
        setIntField(term146000, term146000.getClass(), "overDamageBattlePoint", 0);
        setIntField(term146000, term146000.getClass(), "nameplateId", 0);
        setIntField(term146000, term146000.getClass(), "trophyId", 0);
        setIntField(term146000, term146000.getClass(), "cardId", 0);
        setIntField(term146000, term146000.getClass(), "characterId", 0);
        setIntField(term146000, term146000.getClass(), "tabSetting", 0);
        setIntField(term146000, term146000.getClass(), "tabSortSetting", 0);
        setIntField(term146000, term146000.getClass(), "cardCategorySetting", 0);
        setIntField(term146000, term146000.getClass(), "cardSortSetting", 0);
        setIntField(term146000, term146000.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term146000, term146000.getClass(), "playedTutorialBit", 0);
        setIntField(term146000, term146000.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term146000, term146000.getClass(), "sumTechHighScore", 0L);
        setLongField(term146000, term146000.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term146000, term146000.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term146000, term146000.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term146000, term146000.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term146000, term146000.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term146000, term146000.getClass(), "sumBattleHighScore", 0L);
        setLongField(term146000, term146000.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term146000, term146000.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term146000, term146000.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term146000, term146000.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term146000, term146000.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term146000, term146000.getClass(), "eventWatchedDate", null);
        setField(term146000, term146000.getClass(), "cmEventWatchedDate", null);
        setField(term146000, term146000.getClass(), "firstGameId", null);
        setField(term146000, term146000.getClass(), "firstRomVersion", null);
        setField(term146000, term146000.getClass(), "firstDataVersion", null);
        setField(term146000, term146000.getClass(), "firstPlayDate", null);
        setField(term146000, term146000.getClass(), "lastGameId", null);
        setField(term146000, term146000.getClass(), "lastRomVersion", null);
        setField(term146000, term146000.getClass(), "lastDataVersion", null);
        setField(term146000, term146000.getClass(), "compatibleCmVersion", null);
        setField(term146000, term146000.getClass(), "lastPlayDate", null);
        setIntField(term146000, term146000.getClass(), "lastPlaceId", 0);
        setField(term146000, term146000.getClass(), "lastPlaceName", null);
        setIntField(term146000, term146000.getClass(), "lastRegionId", 0);
        setField(term146000, term146000.getClass(), "lastRegionName", null);
        setIntField(term146000, term146000.getClass(), "lastAllNetId", 0);
        setField(term146000, term146000.getClass(), "lastClientId", null);
        setIntField(term146000, term146000.getClass(), "lastUsedDeckId", 0);
        setIntField(term146000, term146000.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term146000, term146000.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverDamageBattlePoint", argTypes, term146000, args);
    }

};


