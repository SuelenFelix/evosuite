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

public class ExternalUserData_setCharacterId_647986591202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148806;
     Object term148850;

    public ExternalUserData_setCharacterId_647986591202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148806 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148806, term148806.getClass(), "accessCode", null);
        setField(term148806, term148806.getClass(), "userName", null);
        setIntField(term148806, term148806.getClass(), "level", 0);
        setIntField(term148806, term148806.getClass(), "reincarnationNum", 0);
        setLongField(term148806, term148806.getClass(), "exp", 0L);
        setLongField(term148806, term148806.getClass(), "point", 0L);
        setLongField(term148806, term148806.getClass(), "totalPoint", 0L);
        setIntField(term148806, term148806.getClass(), "playCount", 0);
        setIntField(term148806, term148806.getClass(), "jewelCount", 0);
        setIntField(term148806, term148806.getClass(), "totalJewelCount", 0);
        setIntField(term148806, term148806.getClass(), "medalCount", 0);
        setIntField(term148806, term148806.getClass(), "playerRating", 0);
        setIntField(term148806, term148806.getClass(), "highestRating", 0);
        setIntField(term148806, term148806.getClass(), "battlePoint", 0);
        setIntField(term148806, term148806.getClass(), "bestBattlePoint", 0);
        setIntField(term148806, term148806.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148806, term148806.getClass(), "nameplateId", 0);
        setIntField(term148806, term148806.getClass(), "trophyId", 0);
        setIntField(term148806, term148806.getClass(), "cardId", 0);
        setIntField(term148806, term148806.getClass(), "characterId", 0);
        setIntField(term148806, term148806.getClass(), "tabSetting", 0);
        setIntField(term148806, term148806.getClass(), "tabSortSetting", 0);
        setIntField(term148806, term148806.getClass(), "cardCategorySetting", 0);
        setIntField(term148806, term148806.getClass(), "cardSortSetting", 0);
        setIntField(term148806, term148806.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148806, term148806.getClass(), "playedTutorialBit", 0);
        setIntField(term148806, term148806.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148806, term148806.getClass(), "sumTechHighScore", 0L);
        setLongField(term148806, term148806.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148806, term148806.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148806, term148806.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148806, term148806.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148806, term148806.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148806, term148806.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148806, term148806.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148806, term148806.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148806, term148806.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148806, term148806.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148806, term148806.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148806, term148806.getClass(), "eventWatchedDate", null);
        setField(term148806, term148806.getClass(), "cmEventWatchedDate", null);
        setField(term148806, term148806.getClass(), "firstGameId", null);
        setField(term148806, term148806.getClass(), "firstRomVersion", null);
        setField(term148806, term148806.getClass(), "firstDataVersion", null);
        setField(term148806, term148806.getClass(), "firstPlayDate", null);
        setField(term148806, term148806.getClass(), "lastGameId", null);
        setField(term148806, term148806.getClass(), "lastRomVersion", null);
        setField(term148806, term148806.getClass(), "lastDataVersion", null);
        setField(term148806, term148806.getClass(), "compatibleCmVersion", null);
        setField(term148806, term148806.getClass(), "lastPlayDate", null);
        setIntField(term148806, term148806.getClass(), "lastPlaceId", 0);
        setField(term148806, term148806.getClass(), "lastPlaceName", null);
        setIntField(term148806, term148806.getClass(), "lastRegionId", 0);
        setField(term148806, term148806.getClass(), "lastRegionName", null);
        setIntField(term148806, term148806.getClass(), "lastAllNetId", 0);
        setField(term148806, term148806.getClass(), "lastClientId", null);
        setIntField(term148806, term148806.getClass(), "lastUsedDeckId", 0);
        setIntField(term148806, term148806.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148806, term148806.getClass(), "lastEmoneyBrand", 0);
        term148850 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148850;
        callMethod(klass, "setCharacterId", argTypes, term148806, args);
    }

};


