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

public class ExternalUserData_setCardCategorySetting_506290431205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148944;
     Object term148988;

    public ExternalUserData_setCardCategorySetting_506290431205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148944 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148944, term148944.getClass(), "accessCode", null);
        setField(term148944, term148944.getClass(), "userName", null);
        setIntField(term148944, term148944.getClass(), "level", 0);
        setIntField(term148944, term148944.getClass(), "reincarnationNum", 0);
        setLongField(term148944, term148944.getClass(), "exp", 0L);
        setLongField(term148944, term148944.getClass(), "point", 0L);
        setLongField(term148944, term148944.getClass(), "totalPoint", 0L);
        setIntField(term148944, term148944.getClass(), "playCount", 0);
        setIntField(term148944, term148944.getClass(), "jewelCount", 0);
        setIntField(term148944, term148944.getClass(), "totalJewelCount", 0);
        setIntField(term148944, term148944.getClass(), "medalCount", 0);
        setIntField(term148944, term148944.getClass(), "playerRating", 0);
        setIntField(term148944, term148944.getClass(), "highestRating", 0);
        setIntField(term148944, term148944.getClass(), "battlePoint", 0);
        setIntField(term148944, term148944.getClass(), "bestBattlePoint", 0);
        setIntField(term148944, term148944.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148944, term148944.getClass(), "nameplateId", 0);
        setIntField(term148944, term148944.getClass(), "trophyId", 0);
        setIntField(term148944, term148944.getClass(), "cardId", 0);
        setIntField(term148944, term148944.getClass(), "characterId", 0);
        setIntField(term148944, term148944.getClass(), "tabSetting", 0);
        setIntField(term148944, term148944.getClass(), "tabSortSetting", 0);
        setIntField(term148944, term148944.getClass(), "cardCategorySetting", 0);
        setIntField(term148944, term148944.getClass(), "cardSortSetting", 0);
        setIntField(term148944, term148944.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148944, term148944.getClass(), "playedTutorialBit", 0);
        setIntField(term148944, term148944.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148944, term148944.getClass(), "sumTechHighScore", 0L);
        setLongField(term148944, term148944.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148944, term148944.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148944, term148944.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148944, term148944.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148944, term148944.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148944, term148944.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148944, term148944.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148944, term148944.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148944, term148944.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148944, term148944.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148944, term148944.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148944, term148944.getClass(), "eventWatchedDate", null);
        setField(term148944, term148944.getClass(), "cmEventWatchedDate", null);
        setField(term148944, term148944.getClass(), "firstGameId", null);
        setField(term148944, term148944.getClass(), "firstRomVersion", null);
        setField(term148944, term148944.getClass(), "firstDataVersion", null);
        setField(term148944, term148944.getClass(), "firstPlayDate", null);
        setField(term148944, term148944.getClass(), "lastGameId", null);
        setField(term148944, term148944.getClass(), "lastRomVersion", null);
        setField(term148944, term148944.getClass(), "lastDataVersion", null);
        setField(term148944, term148944.getClass(), "compatibleCmVersion", null);
        setField(term148944, term148944.getClass(), "lastPlayDate", null);
        setIntField(term148944, term148944.getClass(), "lastPlaceId", 0);
        setField(term148944, term148944.getClass(), "lastPlaceName", null);
        setIntField(term148944, term148944.getClass(), "lastRegionId", 0);
        setField(term148944, term148944.getClass(), "lastRegionName", null);
        setIntField(term148944, term148944.getClass(), "lastAllNetId", 0);
        setField(term148944, term148944.getClass(), "lastClientId", null);
        setIntField(term148944, term148944.getClass(), "lastUsedDeckId", 0);
        setIntField(term148944, term148944.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148944, term148944.getClass(), "lastEmoneyBrand", 0);
        term148988 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148988;
        callMethod(klass, "setCardCategorySetting", argTypes, term148944, args);
    }

};


