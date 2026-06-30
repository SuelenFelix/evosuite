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

public class ExternalUserData_setLastAllNetId_2006649710237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150390;
     Object term150434;

    public ExternalUserData_setLastAllNetId_2006649710237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150390 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term150390, term150390.getClass(), "accessCode", null);
        setField(term150390, term150390.getClass(), "userName", null);
        setIntField(term150390, term150390.getClass(), "level", 0);
        setIntField(term150390, term150390.getClass(), "reincarnationNum", 0);
        setLongField(term150390, term150390.getClass(), "exp", 0L);
        setLongField(term150390, term150390.getClass(), "point", 0L);
        setLongField(term150390, term150390.getClass(), "totalPoint", 0L);
        setIntField(term150390, term150390.getClass(), "playCount", 0);
        setIntField(term150390, term150390.getClass(), "jewelCount", 0);
        setIntField(term150390, term150390.getClass(), "totalJewelCount", 0);
        setIntField(term150390, term150390.getClass(), "medalCount", 0);
        setIntField(term150390, term150390.getClass(), "playerRating", 0);
        setIntField(term150390, term150390.getClass(), "highestRating", 0);
        setIntField(term150390, term150390.getClass(), "battlePoint", 0);
        setIntField(term150390, term150390.getClass(), "bestBattlePoint", 0);
        setIntField(term150390, term150390.getClass(), "overDamageBattlePoint", 0);
        setIntField(term150390, term150390.getClass(), "nameplateId", 0);
        setIntField(term150390, term150390.getClass(), "trophyId", 0);
        setIntField(term150390, term150390.getClass(), "cardId", 0);
        setIntField(term150390, term150390.getClass(), "characterId", 0);
        setIntField(term150390, term150390.getClass(), "tabSetting", 0);
        setIntField(term150390, term150390.getClass(), "tabSortSetting", 0);
        setIntField(term150390, term150390.getClass(), "cardCategorySetting", 0);
        setIntField(term150390, term150390.getClass(), "cardSortSetting", 0);
        setIntField(term150390, term150390.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term150390, term150390.getClass(), "playedTutorialBit", 0);
        setIntField(term150390, term150390.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term150390, term150390.getClass(), "sumTechHighScore", 0L);
        setLongField(term150390, term150390.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term150390, term150390.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term150390, term150390.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term150390, term150390.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term150390, term150390.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term150390, term150390.getClass(), "sumBattleHighScore", 0L);
        setLongField(term150390, term150390.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term150390, term150390.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term150390, term150390.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term150390, term150390.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term150390, term150390.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term150390, term150390.getClass(), "eventWatchedDate", null);
        setField(term150390, term150390.getClass(), "cmEventWatchedDate", null);
        setField(term150390, term150390.getClass(), "firstGameId", null);
        setField(term150390, term150390.getClass(), "firstRomVersion", null);
        setField(term150390, term150390.getClass(), "firstDataVersion", null);
        setField(term150390, term150390.getClass(), "firstPlayDate", null);
        setField(term150390, term150390.getClass(), "lastGameId", null);
        setField(term150390, term150390.getClass(), "lastRomVersion", null);
        setField(term150390, term150390.getClass(), "lastDataVersion", null);
        setField(term150390, term150390.getClass(), "compatibleCmVersion", null);
        setField(term150390, term150390.getClass(), "lastPlayDate", null);
        setIntField(term150390, term150390.getClass(), "lastPlaceId", 0);
        setField(term150390, term150390.getClass(), "lastPlaceName", null);
        setIntField(term150390, term150390.getClass(), "lastRegionId", 0);
        setField(term150390, term150390.getClass(), "lastRegionName", null);
        setIntField(term150390, term150390.getClass(), "lastAllNetId", 0);
        setField(term150390, term150390.getClass(), "lastClientId", null);
        setIntField(term150390, term150390.getClass(), "lastUsedDeckId", 0);
        setIntField(term150390, term150390.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term150390, term150390.getClass(), "lastEmoneyBrand", 0);
        term150434 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term150434;
        callMethod(klass, "setLastAllNetId", argTypes, term150390, args);
    }

};


