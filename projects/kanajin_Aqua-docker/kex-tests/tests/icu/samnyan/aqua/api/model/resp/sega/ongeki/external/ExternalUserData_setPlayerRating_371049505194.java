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
import java.lang.Integer;

public class ExternalUserData_setPlayerRating_371049505194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148438;
     Object term148482;

    public ExternalUserData_setPlayerRating_371049505194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148438 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148438, term148438.getClass(), "accessCode", null);
        setField(term148438, term148438.getClass(), "userName", null);
        setIntField(term148438, term148438.getClass(), "level", 0);
        setIntField(term148438, term148438.getClass(), "reincarnationNum", 0);
        setLongField(term148438, term148438.getClass(), "exp", 0L);
        setLongField(term148438, term148438.getClass(), "point", 0L);
        setLongField(term148438, term148438.getClass(), "totalPoint", 0L);
        setIntField(term148438, term148438.getClass(), "playCount", 0);
        setIntField(term148438, term148438.getClass(), "jewelCount", 0);
        setIntField(term148438, term148438.getClass(), "totalJewelCount", 0);
        setIntField(term148438, term148438.getClass(), "medalCount", 0);
        setIntField(term148438, term148438.getClass(), "playerRating", 0);
        setIntField(term148438, term148438.getClass(), "highestRating", 0);
        setIntField(term148438, term148438.getClass(), "battlePoint", 0);
        setIntField(term148438, term148438.getClass(), "bestBattlePoint", 0);
        setIntField(term148438, term148438.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148438, term148438.getClass(), "nameplateId", 0);
        setIntField(term148438, term148438.getClass(), "trophyId", 0);
        setIntField(term148438, term148438.getClass(), "cardId", 0);
        setIntField(term148438, term148438.getClass(), "characterId", 0);
        setIntField(term148438, term148438.getClass(), "tabSetting", 0);
        setIntField(term148438, term148438.getClass(), "tabSortSetting", 0);
        setIntField(term148438, term148438.getClass(), "cardCategorySetting", 0);
        setIntField(term148438, term148438.getClass(), "cardSortSetting", 0);
        setIntField(term148438, term148438.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148438, term148438.getClass(), "playedTutorialBit", 0);
        setIntField(term148438, term148438.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148438, term148438.getClass(), "sumTechHighScore", 0L);
        setLongField(term148438, term148438.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148438, term148438.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148438, term148438.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148438, term148438.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148438, term148438.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148438, term148438.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148438, term148438.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148438, term148438.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148438, term148438.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148438, term148438.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148438, term148438.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148438, term148438.getClass(), "eventWatchedDate", null);
        setField(term148438, term148438.getClass(), "cmEventWatchedDate", null);
        setField(term148438, term148438.getClass(), "firstGameId", null);
        setField(term148438, term148438.getClass(), "firstRomVersion", null);
        setField(term148438, term148438.getClass(), "firstDataVersion", null);
        setField(term148438, term148438.getClass(), "firstPlayDate", null);
        setField(term148438, term148438.getClass(), "lastGameId", null);
        setField(term148438, term148438.getClass(), "lastRomVersion", null);
        setField(term148438, term148438.getClass(), "lastDataVersion", null);
        setField(term148438, term148438.getClass(), "compatibleCmVersion", null);
        setField(term148438, term148438.getClass(), "lastPlayDate", null);
        setIntField(term148438, term148438.getClass(), "lastPlaceId", 0);
        setField(term148438, term148438.getClass(), "lastPlaceName", null);
        setIntField(term148438, term148438.getClass(), "lastRegionId", 0);
        setField(term148438, term148438.getClass(), "lastRegionName", null);
        setIntField(term148438, term148438.getClass(), "lastAllNetId", 0);
        setField(term148438, term148438.getClass(), "lastClientId", null);
        setIntField(term148438, term148438.getClass(), "lastUsedDeckId", 0);
        setIntField(term148438, term148438.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148438, term148438.getClass(), "lastEmoneyBrand", 0);
        term148482 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148482;
        callMethod(klass, "setPlayerRating", argTypes, term148438, args);
    }

};


