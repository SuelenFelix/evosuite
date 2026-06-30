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

public class ExternalUserData_setOverDamageBattlePoint_1147779886198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148622;
     Object term148666;

    public ExternalUserData_setOverDamageBattlePoint_1147779886198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148622 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148622, term148622.getClass(), "accessCode", null);
        setField(term148622, term148622.getClass(), "userName", null);
        setIntField(term148622, term148622.getClass(), "level", 0);
        setIntField(term148622, term148622.getClass(), "reincarnationNum", 0);
        setLongField(term148622, term148622.getClass(), "exp", 0L);
        setLongField(term148622, term148622.getClass(), "point", 0L);
        setLongField(term148622, term148622.getClass(), "totalPoint", 0L);
        setIntField(term148622, term148622.getClass(), "playCount", 0);
        setIntField(term148622, term148622.getClass(), "jewelCount", 0);
        setIntField(term148622, term148622.getClass(), "totalJewelCount", 0);
        setIntField(term148622, term148622.getClass(), "medalCount", 0);
        setIntField(term148622, term148622.getClass(), "playerRating", 0);
        setIntField(term148622, term148622.getClass(), "highestRating", 0);
        setIntField(term148622, term148622.getClass(), "battlePoint", 0);
        setIntField(term148622, term148622.getClass(), "bestBattlePoint", 0);
        setIntField(term148622, term148622.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148622, term148622.getClass(), "nameplateId", 0);
        setIntField(term148622, term148622.getClass(), "trophyId", 0);
        setIntField(term148622, term148622.getClass(), "cardId", 0);
        setIntField(term148622, term148622.getClass(), "characterId", 0);
        setIntField(term148622, term148622.getClass(), "tabSetting", 0);
        setIntField(term148622, term148622.getClass(), "tabSortSetting", 0);
        setIntField(term148622, term148622.getClass(), "cardCategorySetting", 0);
        setIntField(term148622, term148622.getClass(), "cardSortSetting", 0);
        setIntField(term148622, term148622.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148622, term148622.getClass(), "playedTutorialBit", 0);
        setIntField(term148622, term148622.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148622, term148622.getClass(), "sumTechHighScore", 0L);
        setLongField(term148622, term148622.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148622, term148622.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148622, term148622.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148622, term148622.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148622, term148622.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148622, term148622.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148622, term148622.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148622, term148622.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148622, term148622.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148622, term148622.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148622, term148622.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148622, term148622.getClass(), "eventWatchedDate", null);
        setField(term148622, term148622.getClass(), "cmEventWatchedDate", null);
        setField(term148622, term148622.getClass(), "firstGameId", null);
        setField(term148622, term148622.getClass(), "firstRomVersion", null);
        setField(term148622, term148622.getClass(), "firstDataVersion", null);
        setField(term148622, term148622.getClass(), "firstPlayDate", null);
        setField(term148622, term148622.getClass(), "lastGameId", null);
        setField(term148622, term148622.getClass(), "lastRomVersion", null);
        setField(term148622, term148622.getClass(), "lastDataVersion", null);
        setField(term148622, term148622.getClass(), "compatibleCmVersion", null);
        setField(term148622, term148622.getClass(), "lastPlayDate", null);
        setIntField(term148622, term148622.getClass(), "lastPlaceId", 0);
        setField(term148622, term148622.getClass(), "lastPlaceName", null);
        setIntField(term148622, term148622.getClass(), "lastRegionId", 0);
        setField(term148622, term148622.getClass(), "lastRegionName", null);
        setIntField(term148622, term148622.getClass(), "lastAllNetId", 0);
        setField(term148622, term148622.getClass(), "lastClientId", null);
        setIntField(term148622, term148622.getClass(), "lastUsedDeckId", 0);
        setIntField(term148622, term148622.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148622, term148622.getClass(), "lastEmoneyBrand", 0);
        term148666 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148666;
        callMethod(klass, "setOverDamageBattlePoint", argTypes, term148622, args);
    }

};


