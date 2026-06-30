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

public class ExternalUserData_canEqual_1248356732243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150662;

    public ExternalUserData_canEqual_1248356732243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150662 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term150662, term150662.getClass(), "accessCode", null);
        setField(term150662, term150662.getClass(), "userName", null);
        setIntField(term150662, term150662.getClass(), "level", 0);
        setIntField(term150662, term150662.getClass(), "reincarnationNum", 0);
        setLongField(term150662, term150662.getClass(), "exp", 0L);
        setLongField(term150662, term150662.getClass(), "point", 0L);
        setLongField(term150662, term150662.getClass(), "totalPoint", 0L);
        setIntField(term150662, term150662.getClass(), "playCount", 0);
        setIntField(term150662, term150662.getClass(), "jewelCount", 0);
        setIntField(term150662, term150662.getClass(), "totalJewelCount", 0);
        setIntField(term150662, term150662.getClass(), "medalCount", 0);
        setIntField(term150662, term150662.getClass(), "playerRating", 0);
        setIntField(term150662, term150662.getClass(), "highestRating", 0);
        setIntField(term150662, term150662.getClass(), "battlePoint", 0);
        setIntField(term150662, term150662.getClass(), "bestBattlePoint", 0);
        setIntField(term150662, term150662.getClass(), "overDamageBattlePoint", 0);
        setIntField(term150662, term150662.getClass(), "nameplateId", 0);
        setIntField(term150662, term150662.getClass(), "trophyId", 0);
        setIntField(term150662, term150662.getClass(), "cardId", 0);
        setIntField(term150662, term150662.getClass(), "characterId", 0);
        setIntField(term150662, term150662.getClass(), "tabSetting", 0);
        setIntField(term150662, term150662.getClass(), "tabSortSetting", 0);
        setIntField(term150662, term150662.getClass(), "cardCategorySetting", 0);
        setIntField(term150662, term150662.getClass(), "cardSortSetting", 0);
        setIntField(term150662, term150662.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term150662, term150662.getClass(), "playedTutorialBit", 0);
        setIntField(term150662, term150662.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term150662, term150662.getClass(), "sumTechHighScore", 0L);
        setLongField(term150662, term150662.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term150662, term150662.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term150662, term150662.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term150662, term150662.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term150662, term150662.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term150662, term150662.getClass(), "sumBattleHighScore", 0L);
        setLongField(term150662, term150662.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term150662, term150662.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term150662, term150662.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term150662, term150662.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term150662, term150662.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term150662, term150662.getClass(), "eventWatchedDate", null);
        setField(term150662, term150662.getClass(), "cmEventWatchedDate", null);
        setField(term150662, term150662.getClass(), "firstGameId", null);
        setField(term150662, term150662.getClass(), "firstRomVersion", null);
        setField(term150662, term150662.getClass(), "firstDataVersion", null);
        setField(term150662, term150662.getClass(), "firstPlayDate", null);
        setField(term150662, term150662.getClass(), "lastGameId", null);
        setField(term150662, term150662.getClass(), "lastRomVersion", null);
        setField(term150662, term150662.getClass(), "lastDataVersion", null);
        setField(term150662, term150662.getClass(), "compatibleCmVersion", null);
        setField(term150662, term150662.getClass(), "lastPlayDate", null);
        setIntField(term150662, term150662.getClass(), "lastPlaceId", 0);
        setField(term150662, term150662.getClass(), "lastPlaceName", null);
        setIntField(term150662, term150662.getClass(), "lastRegionId", 0);
        setField(term150662, term150662.getClass(), "lastRegionName", null);
        setIntField(term150662, term150662.getClass(), "lastAllNetId", 0);
        setField(term150662, term150662.getClass(), "lastClientId", null);
        setIntField(term150662, term150662.getClass(), "lastUsedDeckId", 0);
        setIntField(term150662, term150662.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term150662, term150662.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term150662, args);
    }

};


