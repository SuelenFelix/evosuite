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
import java.lang.Long;

public class ExternalUserData_setTotalPoint_1806711411189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148208;
     Object term148252;

    public ExternalUserData_setTotalPoint_1806711411189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148208 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148208, term148208.getClass(), "accessCode", null);
        setField(term148208, term148208.getClass(), "userName", null);
        setIntField(term148208, term148208.getClass(), "level", 0);
        setIntField(term148208, term148208.getClass(), "reincarnationNum", 0);
        setLongField(term148208, term148208.getClass(), "exp", 0L);
        setLongField(term148208, term148208.getClass(), "point", 0L);
        setLongField(term148208, term148208.getClass(), "totalPoint", 0L);
        setIntField(term148208, term148208.getClass(), "playCount", 0);
        setIntField(term148208, term148208.getClass(), "jewelCount", 0);
        setIntField(term148208, term148208.getClass(), "totalJewelCount", 0);
        setIntField(term148208, term148208.getClass(), "medalCount", 0);
        setIntField(term148208, term148208.getClass(), "playerRating", 0);
        setIntField(term148208, term148208.getClass(), "highestRating", 0);
        setIntField(term148208, term148208.getClass(), "battlePoint", 0);
        setIntField(term148208, term148208.getClass(), "bestBattlePoint", 0);
        setIntField(term148208, term148208.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148208, term148208.getClass(), "nameplateId", 0);
        setIntField(term148208, term148208.getClass(), "trophyId", 0);
        setIntField(term148208, term148208.getClass(), "cardId", 0);
        setIntField(term148208, term148208.getClass(), "characterId", 0);
        setIntField(term148208, term148208.getClass(), "tabSetting", 0);
        setIntField(term148208, term148208.getClass(), "tabSortSetting", 0);
        setIntField(term148208, term148208.getClass(), "cardCategorySetting", 0);
        setIntField(term148208, term148208.getClass(), "cardSortSetting", 0);
        setIntField(term148208, term148208.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148208, term148208.getClass(), "playedTutorialBit", 0);
        setIntField(term148208, term148208.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148208, term148208.getClass(), "sumTechHighScore", 0L);
        setLongField(term148208, term148208.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148208, term148208.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148208, term148208.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148208, term148208.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148208, term148208.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148208, term148208.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148208, term148208.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148208, term148208.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148208, term148208.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148208, term148208.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148208, term148208.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148208, term148208.getClass(), "eventWatchedDate", null);
        setField(term148208, term148208.getClass(), "cmEventWatchedDate", null);
        setField(term148208, term148208.getClass(), "firstGameId", null);
        setField(term148208, term148208.getClass(), "firstRomVersion", null);
        setField(term148208, term148208.getClass(), "firstDataVersion", null);
        setField(term148208, term148208.getClass(), "firstPlayDate", null);
        setField(term148208, term148208.getClass(), "lastGameId", null);
        setField(term148208, term148208.getClass(), "lastRomVersion", null);
        setField(term148208, term148208.getClass(), "lastDataVersion", null);
        setField(term148208, term148208.getClass(), "compatibleCmVersion", null);
        setField(term148208, term148208.getClass(), "lastPlayDate", null);
        setIntField(term148208, term148208.getClass(), "lastPlaceId", 0);
        setField(term148208, term148208.getClass(), "lastPlaceName", null);
        setIntField(term148208, term148208.getClass(), "lastRegionId", 0);
        setField(term148208, term148208.getClass(), "lastRegionName", null);
        setIntField(term148208, term148208.getClass(), "lastAllNetId", 0);
        setField(term148208, term148208.getClass(), "lastClientId", null);
        setIntField(term148208, term148208.getClass(), "lastUsedDeckId", 0);
        setIntField(term148208, term148208.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148208, term148208.getClass(), "lastEmoneyBrand", 0);
        term148252 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term148252;
        callMethod(klass, "setTotalPoint", argTypes, term148208, args);
    }

};


