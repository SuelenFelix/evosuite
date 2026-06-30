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

public class ExternalUserData_setUserName_1551965618184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147980;

    public ExternalUserData_setUserName_1551965618184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147980 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term147980, term147980.getClass(), "accessCode", null);
        setField(term147980, term147980.getClass(), "userName", null);
        setIntField(term147980, term147980.getClass(), "level", 0);
        setIntField(term147980, term147980.getClass(), "reincarnationNum", 0);
        setLongField(term147980, term147980.getClass(), "exp", 0L);
        setLongField(term147980, term147980.getClass(), "point", 0L);
        setLongField(term147980, term147980.getClass(), "totalPoint", 0L);
        setIntField(term147980, term147980.getClass(), "playCount", 0);
        setIntField(term147980, term147980.getClass(), "jewelCount", 0);
        setIntField(term147980, term147980.getClass(), "totalJewelCount", 0);
        setIntField(term147980, term147980.getClass(), "medalCount", 0);
        setIntField(term147980, term147980.getClass(), "playerRating", 0);
        setIntField(term147980, term147980.getClass(), "highestRating", 0);
        setIntField(term147980, term147980.getClass(), "battlePoint", 0);
        setIntField(term147980, term147980.getClass(), "bestBattlePoint", 0);
        setIntField(term147980, term147980.getClass(), "overDamageBattlePoint", 0);
        setIntField(term147980, term147980.getClass(), "nameplateId", 0);
        setIntField(term147980, term147980.getClass(), "trophyId", 0);
        setIntField(term147980, term147980.getClass(), "cardId", 0);
        setIntField(term147980, term147980.getClass(), "characterId", 0);
        setIntField(term147980, term147980.getClass(), "tabSetting", 0);
        setIntField(term147980, term147980.getClass(), "tabSortSetting", 0);
        setIntField(term147980, term147980.getClass(), "cardCategorySetting", 0);
        setIntField(term147980, term147980.getClass(), "cardSortSetting", 0);
        setIntField(term147980, term147980.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term147980, term147980.getClass(), "playedTutorialBit", 0);
        setIntField(term147980, term147980.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term147980, term147980.getClass(), "sumTechHighScore", 0L);
        setLongField(term147980, term147980.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term147980, term147980.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term147980, term147980.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term147980, term147980.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term147980, term147980.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term147980, term147980.getClass(), "sumBattleHighScore", 0L);
        setLongField(term147980, term147980.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term147980, term147980.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term147980, term147980.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term147980, term147980.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term147980, term147980.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term147980, term147980.getClass(), "eventWatchedDate", null);
        setField(term147980, term147980.getClass(), "cmEventWatchedDate", null);
        setField(term147980, term147980.getClass(), "firstGameId", null);
        setField(term147980, term147980.getClass(), "firstRomVersion", null);
        setField(term147980, term147980.getClass(), "firstDataVersion", null);
        setField(term147980, term147980.getClass(), "firstPlayDate", null);
        setField(term147980, term147980.getClass(), "lastGameId", null);
        setField(term147980, term147980.getClass(), "lastRomVersion", null);
        setField(term147980, term147980.getClass(), "lastDataVersion", null);
        setField(term147980, term147980.getClass(), "compatibleCmVersion", null);
        setField(term147980, term147980.getClass(), "lastPlayDate", null);
        setIntField(term147980, term147980.getClass(), "lastPlaceId", 0);
        setField(term147980, term147980.getClass(), "lastPlaceName", null);
        setIntField(term147980, term147980.getClass(), "lastRegionId", 0);
        setField(term147980, term147980.getClass(), "lastRegionName", null);
        setIntField(term147980, term147980.getClass(), "lastAllNetId", 0);
        setField(term147980, term147980.getClass(), "lastClientId", null);
        setIntField(term147980, term147980.getClass(), "lastUsedDeckId", 0);
        setIntField(term147980, term147980.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term147980, term147980.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term147980, args);
    }

};


