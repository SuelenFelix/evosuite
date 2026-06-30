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

public class ExternalUserData_setBattlePoint_2038666997196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148530;
     Object term148574;

    public ExternalUserData_setBattlePoint_2038666997196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148530 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148530, term148530.getClass(), "accessCode", null);
        setField(term148530, term148530.getClass(), "userName", null);
        setIntField(term148530, term148530.getClass(), "level", 0);
        setIntField(term148530, term148530.getClass(), "reincarnationNum", 0);
        setLongField(term148530, term148530.getClass(), "exp", 0L);
        setLongField(term148530, term148530.getClass(), "point", 0L);
        setLongField(term148530, term148530.getClass(), "totalPoint", 0L);
        setIntField(term148530, term148530.getClass(), "playCount", 0);
        setIntField(term148530, term148530.getClass(), "jewelCount", 0);
        setIntField(term148530, term148530.getClass(), "totalJewelCount", 0);
        setIntField(term148530, term148530.getClass(), "medalCount", 0);
        setIntField(term148530, term148530.getClass(), "playerRating", 0);
        setIntField(term148530, term148530.getClass(), "highestRating", 0);
        setIntField(term148530, term148530.getClass(), "battlePoint", 0);
        setIntField(term148530, term148530.getClass(), "bestBattlePoint", 0);
        setIntField(term148530, term148530.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148530, term148530.getClass(), "nameplateId", 0);
        setIntField(term148530, term148530.getClass(), "trophyId", 0);
        setIntField(term148530, term148530.getClass(), "cardId", 0);
        setIntField(term148530, term148530.getClass(), "characterId", 0);
        setIntField(term148530, term148530.getClass(), "tabSetting", 0);
        setIntField(term148530, term148530.getClass(), "tabSortSetting", 0);
        setIntField(term148530, term148530.getClass(), "cardCategorySetting", 0);
        setIntField(term148530, term148530.getClass(), "cardSortSetting", 0);
        setIntField(term148530, term148530.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148530, term148530.getClass(), "playedTutorialBit", 0);
        setIntField(term148530, term148530.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148530, term148530.getClass(), "sumTechHighScore", 0L);
        setLongField(term148530, term148530.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148530, term148530.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148530, term148530.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148530, term148530.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148530, term148530.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148530, term148530.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148530, term148530.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148530, term148530.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148530, term148530.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148530, term148530.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148530, term148530.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148530, term148530.getClass(), "eventWatchedDate", null);
        setField(term148530, term148530.getClass(), "cmEventWatchedDate", null);
        setField(term148530, term148530.getClass(), "firstGameId", null);
        setField(term148530, term148530.getClass(), "firstRomVersion", null);
        setField(term148530, term148530.getClass(), "firstDataVersion", null);
        setField(term148530, term148530.getClass(), "firstPlayDate", null);
        setField(term148530, term148530.getClass(), "lastGameId", null);
        setField(term148530, term148530.getClass(), "lastRomVersion", null);
        setField(term148530, term148530.getClass(), "lastDataVersion", null);
        setField(term148530, term148530.getClass(), "compatibleCmVersion", null);
        setField(term148530, term148530.getClass(), "lastPlayDate", null);
        setIntField(term148530, term148530.getClass(), "lastPlaceId", 0);
        setField(term148530, term148530.getClass(), "lastPlaceName", null);
        setIntField(term148530, term148530.getClass(), "lastRegionId", 0);
        setField(term148530, term148530.getClass(), "lastRegionName", null);
        setIntField(term148530, term148530.getClass(), "lastAllNetId", 0);
        setField(term148530, term148530.getClass(), "lastClientId", null);
        setIntField(term148530, term148530.getClass(), "lastUsedDeckId", 0);
        setIntField(term148530, term148530.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148530, term148530.getClass(), "lastEmoneyBrand", 0);
        term148574 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148574;
        callMethod(klass, "setBattlePoint", argTypes, term148530, args);
    }

};


