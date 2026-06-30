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
import java.lang.Long;

public class ExternalUserData_setSumBattleExpertHighScore_1083025732219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149588;
     Object term149632;

    public ExternalUserData_setSumBattleExpertHighScore_1083025732219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149588 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149588, term149588.getClass(), "accessCode", null);
        setField(term149588, term149588.getClass(), "userName", null);
        setIntField(term149588, term149588.getClass(), "level", 0);
        setIntField(term149588, term149588.getClass(), "reincarnationNum", 0);
        setLongField(term149588, term149588.getClass(), "exp", 0L);
        setLongField(term149588, term149588.getClass(), "point", 0L);
        setLongField(term149588, term149588.getClass(), "totalPoint", 0L);
        setIntField(term149588, term149588.getClass(), "playCount", 0);
        setIntField(term149588, term149588.getClass(), "jewelCount", 0);
        setIntField(term149588, term149588.getClass(), "totalJewelCount", 0);
        setIntField(term149588, term149588.getClass(), "medalCount", 0);
        setIntField(term149588, term149588.getClass(), "playerRating", 0);
        setIntField(term149588, term149588.getClass(), "highestRating", 0);
        setIntField(term149588, term149588.getClass(), "battlePoint", 0);
        setIntField(term149588, term149588.getClass(), "bestBattlePoint", 0);
        setIntField(term149588, term149588.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149588, term149588.getClass(), "nameplateId", 0);
        setIntField(term149588, term149588.getClass(), "trophyId", 0);
        setIntField(term149588, term149588.getClass(), "cardId", 0);
        setIntField(term149588, term149588.getClass(), "characterId", 0);
        setIntField(term149588, term149588.getClass(), "tabSetting", 0);
        setIntField(term149588, term149588.getClass(), "tabSortSetting", 0);
        setIntField(term149588, term149588.getClass(), "cardCategorySetting", 0);
        setIntField(term149588, term149588.getClass(), "cardSortSetting", 0);
        setIntField(term149588, term149588.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149588, term149588.getClass(), "playedTutorialBit", 0);
        setIntField(term149588, term149588.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149588, term149588.getClass(), "sumTechHighScore", 0L);
        setLongField(term149588, term149588.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149588, term149588.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149588, term149588.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149588, term149588.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149588, term149588.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149588, term149588.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149588, term149588.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149588, term149588.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149588, term149588.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149588, term149588.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149588, term149588.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149588, term149588.getClass(), "eventWatchedDate", null);
        setField(term149588, term149588.getClass(), "cmEventWatchedDate", null);
        setField(term149588, term149588.getClass(), "firstGameId", null);
        setField(term149588, term149588.getClass(), "firstRomVersion", null);
        setField(term149588, term149588.getClass(), "firstDataVersion", null);
        setField(term149588, term149588.getClass(), "firstPlayDate", null);
        setField(term149588, term149588.getClass(), "lastGameId", null);
        setField(term149588, term149588.getClass(), "lastRomVersion", null);
        setField(term149588, term149588.getClass(), "lastDataVersion", null);
        setField(term149588, term149588.getClass(), "compatibleCmVersion", null);
        setField(term149588, term149588.getClass(), "lastPlayDate", null);
        setIntField(term149588, term149588.getClass(), "lastPlaceId", 0);
        setField(term149588, term149588.getClass(), "lastPlaceName", null);
        setIntField(term149588, term149588.getClass(), "lastRegionId", 0);
        setField(term149588, term149588.getClass(), "lastRegionName", null);
        setIntField(term149588, term149588.getClass(), "lastAllNetId", 0);
        setField(term149588, term149588.getClass(), "lastClientId", null);
        setIntField(term149588, term149588.getClass(), "lastUsedDeckId", 0);
        setIntField(term149588, term149588.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149588, term149588.getClass(), "lastEmoneyBrand", 0);
        term149632 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term149632;
        callMethod(klass, "setSumBattleExpertHighScore", argTypes, term149588, args);
    }

};


