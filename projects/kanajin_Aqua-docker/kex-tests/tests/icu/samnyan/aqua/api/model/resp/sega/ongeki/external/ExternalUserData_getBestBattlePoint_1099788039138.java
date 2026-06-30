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

public class ExternalUserData_getBestBattlePoint_1099788039138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145956;

    public ExternalUserData_getBestBattlePoint_1099788039138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145956 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term145956, term145956.getClass(), "accessCode", null);
        setField(term145956, term145956.getClass(), "userName", null);
        setIntField(term145956, term145956.getClass(), "level", 0);
        setIntField(term145956, term145956.getClass(), "reincarnationNum", 0);
        setLongField(term145956, term145956.getClass(), "exp", 0L);
        setLongField(term145956, term145956.getClass(), "point", 0L);
        setLongField(term145956, term145956.getClass(), "totalPoint", 0L);
        setIntField(term145956, term145956.getClass(), "playCount", 0);
        setIntField(term145956, term145956.getClass(), "jewelCount", 0);
        setIntField(term145956, term145956.getClass(), "totalJewelCount", 0);
        setIntField(term145956, term145956.getClass(), "medalCount", 0);
        setIntField(term145956, term145956.getClass(), "playerRating", 0);
        setIntField(term145956, term145956.getClass(), "highestRating", 0);
        setIntField(term145956, term145956.getClass(), "battlePoint", 0);
        setIntField(term145956, term145956.getClass(), "bestBattlePoint", 0);
        setIntField(term145956, term145956.getClass(), "overDamageBattlePoint", 0);
        setIntField(term145956, term145956.getClass(), "nameplateId", 0);
        setIntField(term145956, term145956.getClass(), "trophyId", 0);
        setIntField(term145956, term145956.getClass(), "cardId", 0);
        setIntField(term145956, term145956.getClass(), "characterId", 0);
        setIntField(term145956, term145956.getClass(), "tabSetting", 0);
        setIntField(term145956, term145956.getClass(), "tabSortSetting", 0);
        setIntField(term145956, term145956.getClass(), "cardCategorySetting", 0);
        setIntField(term145956, term145956.getClass(), "cardSortSetting", 0);
        setIntField(term145956, term145956.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term145956, term145956.getClass(), "playedTutorialBit", 0);
        setIntField(term145956, term145956.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term145956, term145956.getClass(), "sumTechHighScore", 0L);
        setLongField(term145956, term145956.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term145956, term145956.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term145956, term145956.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term145956, term145956.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term145956, term145956.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term145956, term145956.getClass(), "sumBattleHighScore", 0L);
        setLongField(term145956, term145956.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term145956, term145956.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term145956, term145956.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term145956, term145956.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term145956, term145956.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term145956, term145956.getClass(), "eventWatchedDate", null);
        setField(term145956, term145956.getClass(), "cmEventWatchedDate", null);
        setField(term145956, term145956.getClass(), "firstGameId", null);
        setField(term145956, term145956.getClass(), "firstRomVersion", null);
        setField(term145956, term145956.getClass(), "firstDataVersion", null);
        setField(term145956, term145956.getClass(), "firstPlayDate", null);
        setField(term145956, term145956.getClass(), "lastGameId", null);
        setField(term145956, term145956.getClass(), "lastRomVersion", null);
        setField(term145956, term145956.getClass(), "lastDataVersion", null);
        setField(term145956, term145956.getClass(), "compatibleCmVersion", null);
        setField(term145956, term145956.getClass(), "lastPlayDate", null);
        setIntField(term145956, term145956.getClass(), "lastPlaceId", 0);
        setField(term145956, term145956.getClass(), "lastPlaceName", null);
        setIntField(term145956, term145956.getClass(), "lastRegionId", 0);
        setField(term145956, term145956.getClass(), "lastRegionName", null);
        setIntField(term145956, term145956.getClass(), "lastAllNetId", 0);
        setField(term145956, term145956.getClass(), "lastClientId", null);
        setIntField(term145956, term145956.getClass(), "lastUsedDeckId", 0);
        setIntField(term145956, term145956.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term145956, term145956.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestBattlePoint", argTypes, term145956, args);
    }

};


