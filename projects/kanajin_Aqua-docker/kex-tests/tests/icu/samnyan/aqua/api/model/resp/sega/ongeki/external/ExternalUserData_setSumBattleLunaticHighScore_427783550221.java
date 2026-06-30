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

public class ExternalUserData_setSumBattleLunaticHighScore_427783550221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149680;
     Object term149724;

    public ExternalUserData_setSumBattleLunaticHighScore_427783550221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149680 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149680, term149680.getClass(), "accessCode", null);
        setField(term149680, term149680.getClass(), "userName", null);
        setIntField(term149680, term149680.getClass(), "level", 0);
        setIntField(term149680, term149680.getClass(), "reincarnationNum", 0);
        setLongField(term149680, term149680.getClass(), "exp", 0L);
        setLongField(term149680, term149680.getClass(), "point", 0L);
        setLongField(term149680, term149680.getClass(), "totalPoint", 0L);
        setIntField(term149680, term149680.getClass(), "playCount", 0);
        setIntField(term149680, term149680.getClass(), "jewelCount", 0);
        setIntField(term149680, term149680.getClass(), "totalJewelCount", 0);
        setIntField(term149680, term149680.getClass(), "medalCount", 0);
        setIntField(term149680, term149680.getClass(), "playerRating", 0);
        setIntField(term149680, term149680.getClass(), "highestRating", 0);
        setIntField(term149680, term149680.getClass(), "battlePoint", 0);
        setIntField(term149680, term149680.getClass(), "bestBattlePoint", 0);
        setIntField(term149680, term149680.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149680, term149680.getClass(), "nameplateId", 0);
        setIntField(term149680, term149680.getClass(), "trophyId", 0);
        setIntField(term149680, term149680.getClass(), "cardId", 0);
        setIntField(term149680, term149680.getClass(), "characterId", 0);
        setIntField(term149680, term149680.getClass(), "tabSetting", 0);
        setIntField(term149680, term149680.getClass(), "tabSortSetting", 0);
        setIntField(term149680, term149680.getClass(), "cardCategorySetting", 0);
        setIntField(term149680, term149680.getClass(), "cardSortSetting", 0);
        setIntField(term149680, term149680.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149680, term149680.getClass(), "playedTutorialBit", 0);
        setIntField(term149680, term149680.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149680, term149680.getClass(), "sumTechHighScore", 0L);
        setLongField(term149680, term149680.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149680, term149680.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149680, term149680.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149680, term149680.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149680, term149680.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149680, term149680.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149680, term149680.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149680, term149680.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149680, term149680.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149680, term149680.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149680, term149680.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149680, term149680.getClass(), "eventWatchedDate", null);
        setField(term149680, term149680.getClass(), "cmEventWatchedDate", null);
        setField(term149680, term149680.getClass(), "firstGameId", null);
        setField(term149680, term149680.getClass(), "firstRomVersion", null);
        setField(term149680, term149680.getClass(), "firstDataVersion", null);
        setField(term149680, term149680.getClass(), "firstPlayDate", null);
        setField(term149680, term149680.getClass(), "lastGameId", null);
        setField(term149680, term149680.getClass(), "lastRomVersion", null);
        setField(term149680, term149680.getClass(), "lastDataVersion", null);
        setField(term149680, term149680.getClass(), "compatibleCmVersion", null);
        setField(term149680, term149680.getClass(), "lastPlayDate", null);
        setIntField(term149680, term149680.getClass(), "lastPlaceId", 0);
        setField(term149680, term149680.getClass(), "lastPlaceName", null);
        setIntField(term149680, term149680.getClass(), "lastRegionId", 0);
        setField(term149680, term149680.getClass(), "lastRegionName", null);
        setIntField(term149680, term149680.getClass(), "lastAllNetId", 0);
        setField(term149680, term149680.getClass(), "lastClientId", null);
        setIntField(term149680, term149680.getClass(), "lastUsedDeckId", 0);
        setIntField(term149680, term149680.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149680, term149680.getClass(), "lastEmoneyBrand", 0);
        term149724 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term149724;
        callMethod(klass, "setSumBattleLunaticHighScore", argTypes, term149680, args);
    }

};


