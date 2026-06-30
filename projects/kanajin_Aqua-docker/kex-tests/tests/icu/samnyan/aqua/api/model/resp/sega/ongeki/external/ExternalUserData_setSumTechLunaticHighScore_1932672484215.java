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

public class ExternalUserData_setSumTechLunaticHighScore_1932672484215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149404;
     Object term149448;

    public ExternalUserData_setSumTechLunaticHighScore_1932672484215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149404 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149404, term149404.getClass(), "accessCode", null);
        setField(term149404, term149404.getClass(), "userName", null);
        setIntField(term149404, term149404.getClass(), "level", 0);
        setIntField(term149404, term149404.getClass(), "reincarnationNum", 0);
        setLongField(term149404, term149404.getClass(), "exp", 0L);
        setLongField(term149404, term149404.getClass(), "point", 0L);
        setLongField(term149404, term149404.getClass(), "totalPoint", 0L);
        setIntField(term149404, term149404.getClass(), "playCount", 0);
        setIntField(term149404, term149404.getClass(), "jewelCount", 0);
        setIntField(term149404, term149404.getClass(), "totalJewelCount", 0);
        setIntField(term149404, term149404.getClass(), "medalCount", 0);
        setIntField(term149404, term149404.getClass(), "playerRating", 0);
        setIntField(term149404, term149404.getClass(), "highestRating", 0);
        setIntField(term149404, term149404.getClass(), "battlePoint", 0);
        setIntField(term149404, term149404.getClass(), "bestBattlePoint", 0);
        setIntField(term149404, term149404.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149404, term149404.getClass(), "nameplateId", 0);
        setIntField(term149404, term149404.getClass(), "trophyId", 0);
        setIntField(term149404, term149404.getClass(), "cardId", 0);
        setIntField(term149404, term149404.getClass(), "characterId", 0);
        setIntField(term149404, term149404.getClass(), "tabSetting", 0);
        setIntField(term149404, term149404.getClass(), "tabSortSetting", 0);
        setIntField(term149404, term149404.getClass(), "cardCategorySetting", 0);
        setIntField(term149404, term149404.getClass(), "cardSortSetting", 0);
        setIntField(term149404, term149404.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149404, term149404.getClass(), "playedTutorialBit", 0);
        setIntField(term149404, term149404.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149404, term149404.getClass(), "sumTechHighScore", 0L);
        setLongField(term149404, term149404.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149404, term149404.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149404, term149404.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149404, term149404.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149404, term149404.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149404, term149404.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149404, term149404.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149404, term149404.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149404, term149404.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149404, term149404.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149404, term149404.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149404, term149404.getClass(), "eventWatchedDate", null);
        setField(term149404, term149404.getClass(), "cmEventWatchedDate", null);
        setField(term149404, term149404.getClass(), "firstGameId", null);
        setField(term149404, term149404.getClass(), "firstRomVersion", null);
        setField(term149404, term149404.getClass(), "firstDataVersion", null);
        setField(term149404, term149404.getClass(), "firstPlayDate", null);
        setField(term149404, term149404.getClass(), "lastGameId", null);
        setField(term149404, term149404.getClass(), "lastRomVersion", null);
        setField(term149404, term149404.getClass(), "lastDataVersion", null);
        setField(term149404, term149404.getClass(), "compatibleCmVersion", null);
        setField(term149404, term149404.getClass(), "lastPlayDate", null);
        setIntField(term149404, term149404.getClass(), "lastPlaceId", 0);
        setField(term149404, term149404.getClass(), "lastPlaceName", null);
        setIntField(term149404, term149404.getClass(), "lastRegionId", 0);
        setField(term149404, term149404.getClass(), "lastRegionName", null);
        setIntField(term149404, term149404.getClass(), "lastAllNetId", 0);
        setField(term149404, term149404.getClass(), "lastClientId", null);
        setIntField(term149404, term149404.getClass(), "lastUsedDeckId", 0);
        setIntField(term149404, term149404.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149404, term149404.getClass(), "lastEmoneyBrand", 0);
        term149448 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term149448;
        callMethod(klass, "setSumTechLunaticHighScore", argTypes, term149404, args);
    }

};


