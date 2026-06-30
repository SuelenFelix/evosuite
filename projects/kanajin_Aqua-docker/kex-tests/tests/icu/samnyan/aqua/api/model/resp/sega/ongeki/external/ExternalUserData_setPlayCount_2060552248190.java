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

public class ExternalUserData_setPlayCount_2060552248190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148254;
     Object term148298;

    public ExternalUserData_setPlayCount_2060552248190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148254 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148254, term148254.getClass(), "accessCode", null);
        setField(term148254, term148254.getClass(), "userName", null);
        setIntField(term148254, term148254.getClass(), "level", 0);
        setIntField(term148254, term148254.getClass(), "reincarnationNum", 0);
        setLongField(term148254, term148254.getClass(), "exp", 0L);
        setLongField(term148254, term148254.getClass(), "point", 0L);
        setLongField(term148254, term148254.getClass(), "totalPoint", 0L);
        setIntField(term148254, term148254.getClass(), "playCount", 0);
        setIntField(term148254, term148254.getClass(), "jewelCount", 0);
        setIntField(term148254, term148254.getClass(), "totalJewelCount", 0);
        setIntField(term148254, term148254.getClass(), "medalCount", 0);
        setIntField(term148254, term148254.getClass(), "playerRating", 0);
        setIntField(term148254, term148254.getClass(), "highestRating", 0);
        setIntField(term148254, term148254.getClass(), "battlePoint", 0);
        setIntField(term148254, term148254.getClass(), "bestBattlePoint", 0);
        setIntField(term148254, term148254.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148254, term148254.getClass(), "nameplateId", 0);
        setIntField(term148254, term148254.getClass(), "trophyId", 0);
        setIntField(term148254, term148254.getClass(), "cardId", 0);
        setIntField(term148254, term148254.getClass(), "characterId", 0);
        setIntField(term148254, term148254.getClass(), "tabSetting", 0);
        setIntField(term148254, term148254.getClass(), "tabSortSetting", 0);
        setIntField(term148254, term148254.getClass(), "cardCategorySetting", 0);
        setIntField(term148254, term148254.getClass(), "cardSortSetting", 0);
        setIntField(term148254, term148254.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148254, term148254.getClass(), "playedTutorialBit", 0);
        setIntField(term148254, term148254.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148254, term148254.getClass(), "sumTechHighScore", 0L);
        setLongField(term148254, term148254.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148254, term148254.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148254, term148254.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148254, term148254.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148254, term148254.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148254, term148254.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148254, term148254.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148254, term148254.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148254, term148254.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148254, term148254.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148254, term148254.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148254, term148254.getClass(), "eventWatchedDate", null);
        setField(term148254, term148254.getClass(), "cmEventWatchedDate", null);
        setField(term148254, term148254.getClass(), "firstGameId", null);
        setField(term148254, term148254.getClass(), "firstRomVersion", null);
        setField(term148254, term148254.getClass(), "firstDataVersion", null);
        setField(term148254, term148254.getClass(), "firstPlayDate", null);
        setField(term148254, term148254.getClass(), "lastGameId", null);
        setField(term148254, term148254.getClass(), "lastRomVersion", null);
        setField(term148254, term148254.getClass(), "lastDataVersion", null);
        setField(term148254, term148254.getClass(), "compatibleCmVersion", null);
        setField(term148254, term148254.getClass(), "lastPlayDate", null);
        setIntField(term148254, term148254.getClass(), "lastPlaceId", 0);
        setField(term148254, term148254.getClass(), "lastPlaceName", null);
        setIntField(term148254, term148254.getClass(), "lastRegionId", 0);
        setField(term148254, term148254.getClass(), "lastRegionName", null);
        setIntField(term148254, term148254.getClass(), "lastAllNetId", 0);
        setField(term148254, term148254.getClass(), "lastClientId", null);
        setIntField(term148254, term148254.getClass(), "lastUsedDeckId", 0);
        setIntField(term148254, term148254.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148254, term148254.getClass(), "lastEmoneyBrand", 0);
        term148298 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148298;
        callMethod(klass, "setPlayCount", argTypes, term148254, args);
    }

};


