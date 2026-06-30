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

public class ExternalUserData_setJewelCount_178882675191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148300;
     Object term148344;

    public ExternalUserData_setJewelCount_178882675191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148300 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148300, term148300.getClass(), "accessCode", null);
        setField(term148300, term148300.getClass(), "userName", null);
        setIntField(term148300, term148300.getClass(), "level", 0);
        setIntField(term148300, term148300.getClass(), "reincarnationNum", 0);
        setLongField(term148300, term148300.getClass(), "exp", 0L);
        setLongField(term148300, term148300.getClass(), "point", 0L);
        setLongField(term148300, term148300.getClass(), "totalPoint", 0L);
        setIntField(term148300, term148300.getClass(), "playCount", 0);
        setIntField(term148300, term148300.getClass(), "jewelCount", 0);
        setIntField(term148300, term148300.getClass(), "totalJewelCount", 0);
        setIntField(term148300, term148300.getClass(), "medalCount", 0);
        setIntField(term148300, term148300.getClass(), "playerRating", 0);
        setIntField(term148300, term148300.getClass(), "highestRating", 0);
        setIntField(term148300, term148300.getClass(), "battlePoint", 0);
        setIntField(term148300, term148300.getClass(), "bestBattlePoint", 0);
        setIntField(term148300, term148300.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148300, term148300.getClass(), "nameplateId", 0);
        setIntField(term148300, term148300.getClass(), "trophyId", 0);
        setIntField(term148300, term148300.getClass(), "cardId", 0);
        setIntField(term148300, term148300.getClass(), "characterId", 0);
        setIntField(term148300, term148300.getClass(), "tabSetting", 0);
        setIntField(term148300, term148300.getClass(), "tabSortSetting", 0);
        setIntField(term148300, term148300.getClass(), "cardCategorySetting", 0);
        setIntField(term148300, term148300.getClass(), "cardSortSetting", 0);
        setIntField(term148300, term148300.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148300, term148300.getClass(), "playedTutorialBit", 0);
        setIntField(term148300, term148300.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148300, term148300.getClass(), "sumTechHighScore", 0L);
        setLongField(term148300, term148300.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148300, term148300.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148300, term148300.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148300, term148300.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148300, term148300.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148300, term148300.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148300, term148300.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148300, term148300.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148300, term148300.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148300, term148300.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148300, term148300.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148300, term148300.getClass(), "eventWatchedDate", null);
        setField(term148300, term148300.getClass(), "cmEventWatchedDate", null);
        setField(term148300, term148300.getClass(), "firstGameId", null);
        setField(term148300, term148300.getClass(), "firstRomVersion", null);
        setField(term148300, term148300.getClass(), "firstDataVersion", null);
        setField(term148300, term148300.getClass(), "firstPlayDate", null);
        setField(term148300, term148300.getClass(), "lastGameId", null);
        setField(term148300, term148300.getClass(), "lastRomVersion", null);
        setField(term148300, term148300.getClass(), "lastDataVersion", null);
        setField(term148300, term148300.getClass(), "compatibleCmVersion", null);
        setField(term148300, term148300.getClass(), "lastPlayDate", null);
        setIntField(term148300, term148300.getClass(), "lastPlaceId", 0);
        setField(term148300, term148300.getClass(), "lastPlaceName", null);
        setIntField(term148300, term148300.getClass(), "lastRegionId", 0);
        setField(term148300, term148300.getClass(), "lastRegionName", null);
        setIntField(term148300, term148300.getClass(), "lastAllNetId", 0);
        setField(term148300, term148300.getClass(), "lastClientId", null);
        setIntField(term148300, term148300.getClass(), "lastUsedDeckId", 0);
        setIntField(term148300, term148300.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148300, term148300.getClass(), "lastEmoneyBrand", 0);
        term148344 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148344;
        callMethod(klass, "setJewelCount", argTypes, term148300, args);
    }

};


