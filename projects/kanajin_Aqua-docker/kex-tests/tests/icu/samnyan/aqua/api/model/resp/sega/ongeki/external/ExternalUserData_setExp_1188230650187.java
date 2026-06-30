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

public class ExternalUserData_setExp_1188230650187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148116;
     Object term148160;

    public ExternalUserData_setExp_1188230650187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148116 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148116, term148116.getClass(), "accessCode", null);
        setField(term148116, term148116.getClass(), "userName", null);
        setIntField(term148116, term148116.getClass(), "level", 0);
        setIntField(term148116, term148116.getClass(), "reincarnationNum", 0);
        setLongField(term148116, term148116.getClass(), "exp", 0L);
        setLongField(term148116, term148116.getClass(), "point", 0L);
        setLongField(term148116, term148116.getClass(), "totalPoint", 0L);
        setIntField(term148116, term148116.getClass(), "playCount", 0);
        setIntField(term148116, term148116.getClass(), "jewelCount", 0);
        setIntField(term148116, term148116.getClass(), "totalJewelCount", 0);
        setIntField(term148116, term148116.getClass(), "medalCount", 0);
        setIntField(term148116, term148116.getClass(), "playerRating", 0);
        setIntField(term148116, term148116.getClass(), "highestRating", 0);
        setIntField(term148116, term148116.getClass(), "battlePoint", 0);
        setIntField(term148116, term148116.getClass(), "bestBattlePoint", 0);
        setIntField(term148116, term148116.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148116, term148116.getClass(), "nameplateId", 0);
        setIntField(term148116, term148116.getClass(), "trophyId", 0);
        setIntField(term148116, term148116.getClass(), "cardId", 0);
        setIntField(term148116, term148116.getClass(), "characterId", 0);
        setIntField(term148116, term148116.getClass(), "tabSetting", 0);
        setIntField(term148116, term148116.getClass(), "tabSortSetting", 0);
        setIntField(term148116, term148116.getClass(), "cardCategorySetting", 0);
        setIntField(term148116, term148116.getClass(), "cardSortSetting", 0);
        setIntField(term148116, term148116.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148116, term148116.getClass(), "playedTutorialBit", 0);
        setIntField(term148116, term148116.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148116, term148116.getClass(), "sumTechHighScore", 0L);
        setLongField(term148116, term148116.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148116, term148116.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148116, term148116.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148116, term148116.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148116, term148116.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148116, term148116.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148116, term148116.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148116, term148116.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148116, term148116.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148116, term148116.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148116, term148116.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148116, term148116.getClass(), "eventWatchedDate", null);
        setField(term148116, term148116.getClass(), "cmEventWatchedDate", null);
        setField(term148116, term148116.getClass(), "firstGameId", null);
        setField(term148116, term148116.getClass(), "firstRomVersion", null);
        setField(term148116, term148116.getClass(), "firstDataVersion", null);
        setField(term148116, term148116.getClass(), "firstPlayDate", null);
        setField(term148116, term148116.getClass(), "lastGameId", null);
        setField(term148116, term148116.getClass(), "lastRomVersion", null);
        setField(term148116, term148116.getClass(), "lastDataVersion", null);
        setField(term148116, term148116.getClass(), "compatibleCmVersion", null);
        setField(term148116, term148116.getClass(), "lastPlayDate", null);
        setIntField(term148116, term148116.getClass(), "lastPlaceId", 0);
        setField(term148116, term148116.getClass(), "lastPlaceName", null);
        setIntField(term148116, term148116.getClass(), "lastRegionId", 0);
        setField(term148116, term148116.getClass(), "lastRegionName", null);
        setIntField(term148116, term148116.getClass(), "lastAllNetId", 0);
        setField(term148116, term148116.getClass(), "lastClientId", null);
        setIntField(term148116, term148116.getClass(), "lastUsedDeckId", 0);
        setIntField(term148116, term148116.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148116, term148116.getClass(), "lastEmoneyBrand", 0);
        term148160 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term148160;
        callMethod(klass, "setExp", argTypes, term148116, args);
    }

};


