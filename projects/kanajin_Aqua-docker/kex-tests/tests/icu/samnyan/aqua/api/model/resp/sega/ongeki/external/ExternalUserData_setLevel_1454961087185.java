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

public class ExternalUserData_setLevel_1454961087185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148024;
     Object term148068;

    public ExternalUserData_setLevel_1454961087185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148024 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148024, term148024.getClass(), "accessCode", null);
        setField(term148024, term148024.getClass(), "userName", null);
        setIntField(term148024, term148024.getClass(), "level", 0);
        setIntField(term148024, term148024.getClass(), "reincarnationNum", 0);
        setLongField(term148024, term148024.getClass(), "exp", 0L);
        setLongField(term148024, term148024.getClass(), "point", 0L);
        setLongField(term148024, term148024.getClass(), "totalPoint", 0L);
        setIntField(term148024, term148024.getClass(), "playCount", 0);
        setIntField(term148024, term148024.getClass(), "jewelCount", 0);
        setIntField(term148024, term148024.getClass(), "totalJewelCount", 0);
        setIntField(term148024, term148024.getClass(), "medalCount", 0);
        setIntField(term148024, term148024.getClass(), "playerRating", 0);
        setIntField(term148024, term148024.getClass(), "highestRating", 0);
        setIntField(term148024, term148024.getClass(), "battlePoint", 0);
        setIntField(term148024, term148024.getClass(), "bestBattlePoint", 0);
        setIntField(term148024, term148024.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148024, term148024.getClass(), "nameplateId", 0);
        setIntField(term148024, term148024.getClass(), "trophyId", 0);
        setIntField(term148024, term148024.getClass(), "cardId", 0);
        setIntField(term148024, term148024.getClass(), "characterId", 0);
        setIntField(term148024, term148024.getClass(), "tabSetting", 0);
        setIntField(term148024, term148024.getClass(), "tabSortSetting", 0);
        setIntField(term148024, term148024.getClass(), "cardCategorySetting", 0);
        setIntField(term148024, term148024.getClass(), "cardSortSetting", 0);
        setIntField(term148024, term148024.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148024, term148024.getClass(), "playedTutorialBit", 0);
        setIntField(term148024, term148024.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148024, term148024.getClass(), "sumTechHighScore", 0L);
        setLongField(term148024, term148024.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148024, term148024.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148024, term148024.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148024, term148024.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148024, term148024.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148024, term148024.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148024, term148024.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148024, term148024.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148024, term148024.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148024, term148024.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148024, term148024.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148024, term148024.getClass(), "eventWatchedDate", null);
        setField(term148024, term148024.getClass(), "cmEventWatchedDate", null);
        setField(term148024, term148024.getClass(), "firstGameId", null);
        setField(term148024, term148024.getClass(), "firstRomVersion", null);
        setField(term148024, term148024.getClass(), "firstDataVersion", null);
        setField(term148024, term148024.getClass(), "firstPlayDate", null);
        setField(term148024, term148024.getClass(), "lastGameId", null);
        setField(term148024, term148024.getClass(), "lastRomVersion", null);
        setField(term148024, term148024.getClass(), "lastDataVersion", null);
        setField(term148024, term148024.getClass(), "compatibleCmVersion", null);
        setField(term148024, term148024.getClass(), "lastPlayDate", null);
        setIntField(term148024, term148024.getClass(), "lastPlaceId", 0);
        setField(term148024, term148024.getClass(), "lastPlaceName", null);
        setIntField(term148024, term148024.getClass(), "lastRegionId", 0);
        setField(term148024, term148024.getClass(), "lastRegionName", null);
        setIntField(term148024, term148024.getClass(), "lastAllNetId", 0);
        setField(term148024, term148024.getClass(), "lastClientId", null);
        setIntField(term148024, term148024.getClass(), "lastUsedDeckId", 0);
        setIntField(term148024, term148024.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148024, term148024.getClass(), "lastEmoneyBrand", 0);
        term148068 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148068;
        callMethod(klass, "setLevel", argTypes, term148024, args);
    }

};


