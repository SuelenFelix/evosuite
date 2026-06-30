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

public class ExternalUserData_setTabSortSetting_1958688702204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148898;
     Object term148942;

    public ExternalUserData_setTabSortSetting_1958688702204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148898 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148898, term148898.getClass(), "accessCode", null);
        setField(term148898, term148898.getClass(), "userName", null);
        setIntField(term148898, term148898.getClass(), "level", 0);
        setIntField(term148898, term148898.getClass(), "reincarnationNum", 0);
        setLongField(term148898, term148898.getClass(), "exp", 0L);
        setLongField(term148898, term148898.getClass(), "point", 0L);
        setLongField(term148898, term148898.getClass(), "totalPoint", 0L);
        setIntField(term148898, term148898.getClass(), "playCount", 0);
        setIntField(term148898, term148898.getClass(), "jewelCount", 0);
        setIntField(term148898, term148898.getClass(), "totalJewelCount", 0);
        setIntField(term148898, term148898.getClass(), "medalCount", 0);
        setIntField(term148898, term148898.getClass(), "playerRating", 0);
        setIntField(term148898, term148898.getClass(), "highestRating", 0);
        setIntField(term148898, term148898.getClass(), "battlePoint", 0);
        setIntField(term148898, term148898.getClass(), "bestBattlePoint", 0);
        setIntField(term148898, term148898.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148898, term148898.getClass(), "nameplateId", 0);
        setIntField(term148898, term148898.getClass(), "trophyId", 0);
        setIntField(term148898, term148898.getClass(), "cardId", 0);
        setIntField(term148898, term148898.getClass(), "characterId", 0);
        setIntField(term148898, term148898.getClass(), "tabSetting", 0);
        setIntField(term148898, term148898.getClass(), "tabSortSetting", 0);
        setIntField(term148898, term148898.getClass(), "cardCategorySetting", 0);
        setIntField(term148898, term148898.getClass(), "cardSortSetting", 0);
        setIntField(term148898, term148898.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148898, term148898.getClass(), "playedTutorialBit", 0);
        setIntField(term148898, term148898.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148898, term148898.getClass(), "sumTechHighScore", 0L);
        setLongField(term148898, term148898.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148898, term148898.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148898, term148898.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148898, term148898.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148898, term148898.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148898, term148898.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148898, term148898.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148898, term148898.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148898, term148898.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148898, term148898.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148898, term148898.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148898, term148898.getClass(), "eventWatchedDate", null);
        setField(term148898, term148898.getClass(), "cmEventWatchedDate", null);
        setField(term148898, term148898.getClass(), "firstGameId", null);
        setField(term148898, term148898.getClass(), "firstRomVersion", null);
        setField(term148898, term148898.getClass(), "firstDataVersion", null);
        setField(term148898, term148898.getClass(), "firstPlayDate", null);
        setField(term148898, term148898.getClass(), "lastGameId", null);
        setField(term148898, term148898.getClass(), "lastRomVersion", null);
        setField(term148898, term148898.getClass(), "lastDataVersion", null);
        setField(term148898, term148898.getClass(), "compatibleCmVersion", null);
        setField(term148898, term148898.getClass(), "lastPlayDate", null);
        setIntField(term148898, term148898.getClass(), "lastPlaceId", 0);
        setField(term148898, term148898.getClass(), "lastPlaceName", null);
        setIntField(term148898, term148898.getClass(), "lastRegionId", 0);
        setField(term148898, term148898.getClass(), "lastRegionName", null);
        setIntField(term148898, term148898.getClass(), "lastAllNetId", 0);
        setField(term148898, term148898.getClass(), "lastClientId", null);
        setIntField(term148898, term148898.getClass(), "lastUsedDeckId", 0);
        setIntField(term148898, term148898.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148898, term148898.getClass(), "lastEmoneyBrand", 0);
        term148942 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148942;
        callMethod(klass, "setTabSortSetting", argTypes, term148898, args);
    }

};


