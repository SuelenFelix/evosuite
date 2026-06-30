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

public class ExternalUserData_setEventWatchedDate_2004176066222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149726;

    public ExternalUserData_setEventWatchedDate_2004176066222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149726 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149726, term149726.getClass(), "accessCode", null);
        setField(term149726, term149726.getClass(), "userName", null);
        setIntField(term149726, term149726.getClass(), "level", 0);
        setIntField(term149726, term149726.getClass(), "reincarnationNum", 0);
        setLongField(term149726, term149726.getClass(), "exp", 0L);
        setLongField(term149726, term149726.getClass(), "point", 0L);
        setLongField(term149726, term149726.getClass(), "totalPoint", 0L);
        setIntField(term149726, term149726.getClass(), "playCount", 0);
        setIntField(term149726, term149726.getClass(), "jewelCount", 0);
        setIntField(term149726, term149726.getClass(), "totalJewelCount", 0);
        setIntField(term149726, term149726.getClass(), "medalCount", 0);
        setIntField(term149726, term149726.getClass(), "playerRating", 0);
        setIntField(term149726, term149726.getClass(), "highestRating", 0);
        setIntField(term149726, term149726.getClass(), "battlePoint", 0);
        setIntField(term149726, term149726.getClass(), "bestBattlePoint", 0);
        setIntField(term149726, term149726.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149726, term149726.getClass(), "nameplateId", 0);
        setIntField(term149726, term149726.getClass(), "trophyId", 0);
        setIntField(term149726, term149726.getClass(), "cardId", 0);
        setIntField(term149726, term149726.getClass(), "characterId", 0);
        setIntField(term149726, term149726.getClass(), "tabSetting", 0);
        setIntField(term149726, term149726.getClass(), "tabSortSetting", 0);
        setIntField(term149726, term149726.getClass(), "cardCategorySetting", 0);
        setIntField(term149726, term149726.getClass(), "cardSortSetting", 0);
        setIntField(term149726, term149726.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149726, term149726.getClass(), "playedTutorialBit", 0);
        setIntField(term149726, term149726.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149726, term149726.getClass(), "sumTechHighScore", 0L);
        setLongField(term149726, term149726.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149726, term149726.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149726, term149726.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149726, term149726.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149726, term149726.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149726, term149726.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149726, term149726.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149726, term149726.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149726, term149726.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149726, term149726.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149726, term149726.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149726, term149726.getClass(), "eventWatchedDate", null);
        setField(term149726, term149726.getClass(), "cmEventWatchedDate", null);
        setField(term149726, term149726.getClass(), "firstGameId", null);
        setField(term149726, term149726.getClass(), "firstRomVersion", null);
        setField(term149726, term149726.getClass(), "firstDataVersion", null);
        setField(term149726, term149726.getClass(), "firstPlayDate", null);
        setField(term149726, term149726.getClass(), "lastGameId", null);
        setField(term149726, term149726.getClass(), "lastRomVersion", null);
        setField(term149726, term149726.getClass(), "lastDataVersion", null);
        setField(term149726, term149726.getClass(), "compatibleCmVersion", null);
        setField(term149726, term149726.getClass(), "lastPlayDate", null);
        setIntField(term149726, term149726.getClass(), "lastPlaceId", 0);
        setField(term149726, term149726.getClass(), "lastPlaceName", null);
        setIntField(term149726, term149726.getClass(), "lastRegionId", 0);
        setField(term149726, term149726.getClass(), "lastRegionName", null);
        setIntField(term149726, term149726.getClass(), "lastAllNetId", 0);
        setField(term149726, term149726.getClass(), "lastClientId", null);
        setIntField(term149726, term149726.getClass(), "lastUsedDeckId", 0);
        setIntField(term149726, term149726.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149726, term149726.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEventWatchedDate", argTypes, term149726, args);
    }

};


