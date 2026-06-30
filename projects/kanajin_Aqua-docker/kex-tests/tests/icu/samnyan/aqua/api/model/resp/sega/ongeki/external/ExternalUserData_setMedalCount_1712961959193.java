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

public class ExternalUserData_setMedalCount_1712961959193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148392;
     Object term148436;

    public ExternalUserData_setMedalCount_1712961959193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148392 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148392, term148392.getClass(), "accessCode", null);
        setField(term148392, term148392.getClass(), "userName", null);
        setIntField(term148392, term148392.getClass(), "level", 0);
        setIntField(term148392, term148392.getClass(), "reincarnationNum", 0);
        setLongField(term148392, term148392.getClass(), "exp", 0L);
        setLongField(term148392, term148392.getClass(), "point", 0L);
        setLongField(term148392, term148392.getClass(), "totalPoint", 0L);
        setIntField(term148392, term148392.getClass(), "playCount", 0);
        setIntField(term148392, term148392.getClass(), "jewelCount", 0);
        setIntField(term148392, term148392.getClass(), "totalJewelCount", 0);
        setIntField(term148392, term148392.getClass(), "medalCount", 0);
        setIntField(term148392, term148392.getClass(), "playerRating", 0);
        setIntField(term148392, term148392.getClass(), "highestRating", 0);
        setIntField(term148392, term148392.getClass(), "battlePoint", 0);
        setIntField(term148392, term148392.getClass(), "bestBattlePoint", 0);
        setIntField(term148392, term148392.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148392, term148392.getClass(), "nameplateId", 0);
        setIntField(term148392, term148392.getClass(), "trophyId", 0);
        setIntField(term148392, term148392.getClass(), "cardId", 0);
        setIntField(term148392, term148392.getClass(), "characterId", 0);
        setIntField(term148392, term148392.getClass(), "tabSetting", 0);
        setIntField(term148392, term148392.getClass(), "tabSortSetting", 0);
        setIntField(term148392, term148392.getClass(), "cardCategorySetting", 0);
        setIntField(term148392, term148392.getClass(), "cardSortSetting", 0);
        setIntField(term148392, term148392.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148392, term148392.getClass(), "playedTutorialBit", 0);
        setIntField(term148392, term148392.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148392, term148392.getClass(), "sumTechHighScore", 0L);
        setLongField(term148392, term148392.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148392, term148392.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148392, term148392.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148392, term148392.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148392, term148392.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148392, term148392.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148392, term148392.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148392, term148392.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148392, term148392.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148392, term148392.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148392, term148392.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148392, term148392.getClass(), "eventWatchedDate", null);
        setField(term148392, term148392.getClass(), "cmEventWatchedDate", null);
        setField(term148392, term148392.getClass(), "firstGameId", null);
        setField(term148392, term148392.getClass(), "firstRomVersion", null);
        setField(term148392, term148392.getClass(), "firstDataVersion", null);
        setField(term148392, term148392.getClass(), "firstPlayDate", null);
        setField(term148392, term148392.getClass(), "lastGameId", null);
        setField(term148392, term148392.getClass(), "lastRomVersion", null);
        setField(term148392, term148392.getClass(), "lastDataVersion", null);
        setField(term148392, term148392.getClass(), "compatibleCmVersion", null);
        setField(term148392, term148392.getClass(), "lastPlayDate", null);
        setIntField(term148392, term148392.getClass(), "lastPlaceId", 0);
        setField(term148392, term148392.getClass(), "lastPlaceName", null);
        setIntField(term148392, term148392.getClass(), "lastRegionId", 0);
        setField(term148392, term148392.getClass(), "lastRegionName", null);
        setIntField(term148392, term148392.getClass(), "lastAllNetId", 0);
        setField(term148392, term148392.getClass(), "lastClientId", null);
        setIntField(term148392, term148392.getClass(), "lastUsedDeckId", 0);
        setIntField(term148392, term148392.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148392, term148392.getClass(), "lastEmoneyBrand", 0);
        term148436 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148436;
        callMethod(klass, "setMedalCount", argTypes, term148392, args);
    }

};


