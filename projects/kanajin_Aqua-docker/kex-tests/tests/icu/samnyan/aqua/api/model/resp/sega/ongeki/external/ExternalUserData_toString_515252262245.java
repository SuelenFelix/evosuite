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

public class ExternalUserData_toString_515252262245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150750;

    public ExternalUserData_toString_515252262245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150750 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term150750, term150750.getClass(), "accessCode", null);
        setField(term150750, term150750.getClass(), "userName", null);
        setIntField(term150750, term150750.getClass(), "level", 0);
        setIntField(term150750, term150750.getClass(), "reincarnationNum", 0);
        setLongField(term150750, term150750.getClass(), "exp", 0L);
        setLongField(term150750, term150750.getClass(), "point", 0L);
        setLongField(term150750, term150750.getClass(), "totalPoint", 0L);
        setIntField(term150750, term150750.getClass(), "playCount", 0);
        setIntField(term150750, term150750.getClass(), "jewelCount", 0);
        setIntField(term150750, term150750.getClass(), "totalJewelCount", 0);
        setIntField(term150750, term150750.getClass(), "medalCount", 0);
        setIntField(term150750, term150750.getClass(), "playerRating", 0);
        setIntField(term150750, term150750.getClass(), "highestRating", 0);
        setIntField(term150750, term150750.getClass(), "battlePoint", 0);
        setIntField(term150750, term150750.getClass(), "bestBattlePoint", 0);
        setIntField(term150750, term150750.getClass(), "overDamageBattlePoint", 0);
        setIntField(term150750, term150750.getClass(), "nameplateId", 0);
        setIntField(term150750, term150750.getClass(), "trophyId", 0);
        setIntField(term150750, term150750.getClass(), "cardId", 0);
        setIntField(term150750, term150750.getClass(), "characterId", 0);
        setIntField(term150750, term150750.getClass(), "tabSetting", 0);
        setIntField(term150750, term150750.getClass(), "tabSortSetting", 0);
        setIntField(term150750, term150750.getClass(), "cardCategorySetting", 0);
        setIntField(term150750, term150750.getClass(), "cardSortSetting", 0);
        setIntField(term150750, term150750.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term150750, term150750.getClass(), "playedTutorialBit", 0);
        setIntField(term150750, term150750.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term150750, term150750.getClass(), "sumTechHighScore", 0L);
        setLongField(term150750, term150750.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term150750, term150750.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term150750, term150750.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term150750, term150750.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term150750, term150750.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term150750, term150750.getClass(), "sumBattleHighScore", 0L);
        setLongField(term150750, term150750.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term150750, term150750.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term150750, term150750.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term150750, term150750.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term150750, term150750.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term150750, term150750.getClass(), "eventWatchedDate", null);
        setField(term150750, term150750.getClass(), "cmEventWatchedDate", null);
        setField(term150750, term150750.getClass(), "firstGameId", null);
        setField(term150750, term150750.getClass(), "firstRomVersion", null);
        setField(term150750, term150750.getClass(), "firstDataVersion", null);
        setField(term150750, term150750.getClass(), "firstPlayDate", null);
        setField(term150750, term150750.getClass(), "lastGameId", null);
        setField(term150750, term150750.getClass(), "lastRomVersion", null);
        setField(term150750, term150750.getClass(), "lastDataVersion", null);
        setField(term150750, term150750.getClass(), "compatibleCmVersion", null);
        setField(term150750, term150750.getClass(), "lastPlayDate", null);
        setIntField(term150750, term150750.getClass(), "lastPlaceId", 0);
        setField(term150750, term150750.getClass(), "lastPlaceName", null);
        setIntField(term150750, term150750.getClass(), "lastRegionId", 0);
        setField(term150750, term150750.getClass(), "lastRegionName", null);
        setIntField(term150750, term150750.getClass(), "lastAllNetId", 0);
        setField(term150750, term150750.getClass(), "lastClientId", null);
        setIntField(term150750, term150750.getClass(), "lastUsedDeckId", 0);
        setIntField(term150750, term150750.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term150750, term150750.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term150750, args);
    }

};


