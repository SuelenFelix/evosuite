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

public class ExternalUserData_getTotalJewelCount_30900675133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145736;

    public ExternalUserData_getTotalJewelCount_30900675133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145736 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term145736, term145736.getClass(), "accessCode", null);
        setField(term145736, term145736.getClass(), "userName", null);
        setIntField(term145736, term145736.getClass(), "level", 0);
        setIntField(term145736, term145736.getClass(), "reincarnationNum", 0);
        setLongField(term145736, term145736.getClass(), "exp", 0L);
        setLongField(term145736, term145736.getClass(), "point", 0L);
        setLongField(term145736, term145736.getClass(), "totalPoint", 0L);
        setIntField(term145736, term145736.getClass(), "playCount", 0);
        setIntField(term145736, term145736.getClass(), "jewelCount", 0);
        setIntField(term145736, term145736.getClass(), "totalJewelCount", 0);
        setIntField(term145736, term145736.getClass(), "medalCount", 0);
        setIntField(term145736, term145736.getClass(), "playerRating", 0);
        setIntField(term145736, term145736.getClass(), "highestRating", 0);
        setIntField(term145736, term145736.getClass(), "battlePoint", 0);
        setIntField(term145736, term145736.getClass(), "bestBattlePoint", 0);
        setIntField(term145736, term145736.getClass(), "overDamageBattlePoint", 0);
        setIntField(term145736, term145736.getClass(), "nameplateId", 0);
        setIntField(term145736, term145736.getClass(), "trophyId", 0);
        setIntField(term145736, term145736.getClass(), "cardId", 0);
        setIntField(term145736, term145736.getClass(), "characterId", 0);
        setIntField(term145736, term145736.getClass(), "tabSetting", 0);
        setIntField(term145736, term145736.getClass(), "tabSortSetting", 0);
        setIntField(term145736, term145736.getClass(), "cardCategorySetting", 0);
        setIntField(term145736, term145736.getClass(), "cardSortSetting", 0);
        setIntField(term145736, term145736.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term145736, term145736.getClass(), "playedTutorialBit", 0);
        setIntField(term145736, term145736.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term145736, term145736.getClass(), "sumTechHighScore", 0L);
        setLongField(term145736, term145736.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term145736, term145736.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term145736, term145736.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term145736, term145736.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term145736, term145736.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term145736, term145736.getClass(), "sumBattleHighScore", 0L);
        setLongField(term145736, term145736.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term145736, term145736.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term145736, term145736.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term145736, term145736.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term145736, term145736.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term145736, term145736.getClass(), "eventWatchedDate", null);
        setField(term145736, term145736.getClass(), "cmEventWatchedDate", null);
        setField(term145736, term145736.getClass(), "firstGameId", null);
        setField(term145736, term145736.getClass(), "firstRomVersion", null);
        setField(term145736, term145736.getClass(), "firstDataVersion", null);
        setField(term145736, term145736.getClass(), "firstPlayDate", null);
        setField(term145736, term145736.getClass(), "lastGameId", null);
        setField(term145736, term145736.getClass(), "lastRomVersion", null);
        setField(term145736, term145736.getClass(), "lastDataVersion", null);
        setField(term145736, term145736.getClass(), "compatibleCmVersion", null);
        setField(term145736, term145736.getClass(), "lastPlayDate", null);
        setIntField(term145736, term145736.getClass(), "lastPlaceId", 0);
        setField(term145736, term145736.getClass(), "lastPlaceName", null);
        setIntField(term145736, term145736.getClass(), "lastRegionId", 0);
        setField(term145736, term145736.getClass(), "lastRegionName", null);
        setIntField(term145736, term145736.getClass(), "lastAllNetId", 0);
        setField(term145736, term145736.getClass(), "lastClientId", null);
        setIntField(term145736, term145736.getClass(), "lastUsedDeckId", 0);
        setIntField(term145736, term145736.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term145736, term145736.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalJewelCount", argTypes, term145736, args);
    }

};


