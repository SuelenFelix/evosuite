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

public class ExternalUserData_setAccessCode_563938579183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147936;

    public ExternalUserData_setAccessCode_563938579183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147936 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term147936, term147936.getClass(), "accessCode", null);
        setField(term147936, term147936.getClass(), "userName", null);
        setIntField(term147936, term147936.getClass(), "level", 0);
        setIntField(term147936, term147936.getClass(), "reincarnationNum", 0);
        setLongField(term147936, term147936.getClass(), "exp", 0L);
        setLongField(term147936, term147936.getClass(), "point", 0L);
        setLongField(term147936, term147936.getClass(), "totalPoint", 0L);
        setIntField(term147936, term147936.getClass(), "playCount", 0);
        setIntField(term147936, term147936.getClass(), "jewelCount", 0);
        setIntField(term147936, term147936.getClass(), "totalJewelCount", 0);
        setIntField(term147936, term147936.getClass(), "medalCount", 0);
        setIntField(term147936, term147936.getClass(), "playerRating", 0);
        setIntField(term147936, term147936.getClass(), "highestRating", 0);
        setIntField(term147936, term147936.getClass(), "battlePoint", 0);
        setIntField(term147936, term147936.getClass(), "bestBattlePoint", 0);
        setIntField(term147936, term147936.getClass(), "overDamageBattlePoint", 0);
        setIntField(term147936, term147936.getClass(), "nameplateId", 0);
        setIntField(term147936, term147936.getClass(), "trophyId", 0);
        setIntField(term147936, term147936.getClass(), "cardId", 0);
        setIntField(term147936, term147936.getClass(), "characterId", 0);
        setIntField(term147936, term147936.getClass(), "tabSetting", 0);
        setIntField(term147936, term147936.getClass(), "tabSortSetting", 0);
        setIntField(term147936, term147936.getClass(), "cardCategorySetting", 0);
        setIntField(term147936, term147936.getClass(), "cardSortSetting", 0);
        setIntField(term147936, term147936.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term147936, term147936.getClass(), "playedTutorialBit", 0);
        setIntField(term147936, term147936.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term147936, term147936.getClass(), "sumTechHighScore", 0L);
        setLongField(term147936, term147936.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term147936, term147936.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term147936, term147936.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term147936, term147936.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term147936, term147936.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term147936, term147936.getClass(), "sumBattleHighScore", 0L);
        setLongField(term147936, term147936.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term147936, term147936.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term147936, term147936.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term147936, term147936.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term147936, term147936.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term147936, term147936.getClass(), "eventWatchedDate", null);
        setField(term147936, term147936.getClass(), "cmEventWatchedDate", null);
        setField(term147936, term147936.getClass(), "firstGameId", null);
        setField(term147936, term147936.getClass(), "firstRomVersion", null);
        setField(term147936, term147936.getClass(), "firstDataVersion", null);
        setField(term147936, term147936.getClass(), "firstPlayDate", null);
        setField(term147936, term147936.getClass(), "lastGameId", null);
        setField(term147936, term147936.getClass(), "lastRomVersion", null);
        setField(term147936, term147936.getClass(), "lastDataVersion", null);
        setField(term147936, term147936.getClass(), "compatibleCmVersion", null);
        setField(term147936, term147936.getClass(), "lastPlayDate", null);
        setIntField(term147936, term147936.getClass(), "lastPlaceId", 0);
        setField(term147936, term147936.getClass(), "lastPlaceName", null);
        setIntField(term147936, term147936.getClass(), "lastRegionId", 0);
        setField(term147936, term147936.getClass(), "lastRegionName", null);
        setIntField(term147936, term147936.getClass(), "lastAllNetId", 0);
        setField(term147936, term147936.getClass(), "lastClientId", null);
        setIntField(term147936, term147936.getClass(), "lastUsedDeckId", 0);
        setIntField(term147936, term147936.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term147936, term147936.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAccessCode", argTypes, term147936, args);
    }

};


