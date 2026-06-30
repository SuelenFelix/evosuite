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

public class ExternalUserData_setLastUsedDeckId_513092040239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150480;
     Object term150524;

    public ExternalUserData_setLastUsedDeckId_513092040239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150480 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term150480, term150480.getClass(), "accessCode", null);
        setField(term150480, term150480.getClass(), "userName", null);
        setIntField(term150480, term150480.getClass(), "level", 0);
        setIntField(term150480, term150480.getClass(), "reincarnationNum", 0);
        setLongField(term150480, term150480.getClass(), "exp", 0L);
        setLongField(term150480, term150480.getClass(), "point", 0L);
        setLongField(term150480, term150480.getClass(), "totalPoint", 0L);
        setIntField(term150480, term150480.getClass(), "playCount", 0);
        setIntField(term150480, term150480.getClass(), "jewelCount", 0);
        setIntField(term150480, term150480.getClass(), "totalJewelCount", 0);
        setIntField(term150480, term150480.getClass(), "medalCount", 0);
        setIntField(term150480, term150480.getClass(), "playerRating", 0);
        setIntField(term150480, term150480.getClass(), "highestRating", 0);
        setIntField(term150480, term150480.getClass(), "battlePoint", 0);
        setIntField(term150480, term150480.getClass(), "bestBattlePoint", 0);
        setIntField(term150480, term150480.getClass(), "overDamageBattlePoint", 0);
        setIntField(term150480, term150480.getClass(), "nameplateId", 0);
        setIntField(term150480, term150480.getClass(), "trophyId", 0);
        setIntField(term150480, term150480.getClass(), "cardId", 0);
        setIntField(term150480, term150480.getClass(), "characterId", 0);
        setIntField(term150480, term150480.getClass(), "tabSetting", 0);
        setIntField(term150480, term150480.getClass(), "tabSortSetting", 0);
        setIntField(term150480, term150480.getClass(), "cardCategorySetting", 0);
        setIntField(term150480, term150480.getClass(), "cardSortSetting", 0);
        setIntField(term150480, term150480.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term150480, term150480.getClass(), "playedTutorialBit", 0);
        setIntField(term150480, term150480.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term150480, term150480.getClass(), "sumTechHighScore", 0L);
        setLongField(term150480, term150480.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term150480, term150480.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term150480, term150480.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term150480, term150480.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term150480, term150480.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term150480, term150480.getClass(), "sumBattleHighScore", 0L);
        setLongField(term150480, term150480.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term150480, term150480.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term150480, term150480.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term150480, term150480.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term150480, term150480.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term150480, term150480.getClass(), "eventWatchedDate", null);
        setField(term150480, term150480.getClass(), "cmEventWatchedDate", null);
        setField(term150480, term150480.getClass(), "firstGameId", null);
        setField(term150480, term150480.getClass(), "firstRomVersion", null);
        setField(term150480, term150480.getClass(), "firstDataVersion", null);
        setField(term150480, term150480.getClass(), "firstPlayDate", null);
        setField(term150480, term150480.getClass(), "lastGameId", null);
        setField(term150480, term150480.getClass(), "lastRomVersion", null);
        setField(term150480, term150480.getClass(), "lastDataVersion", null);
        setField(term150480, term150480.getClass(), "compatibleCmVersion", null);
        setField(term150480, term150480.getClass(), "lastPlayDate", null);
        setIntField(term150480, term150480.getClass(), "lastPlaceId", 0);
        setField(term150480, term150480.getClass(), "lastPlaceName", null);
        setIntField(term150480, term150480.getClass(), "lastRegionId", 0);
        setField(term150480, term150480.getClass(), "lastRegionName", null);
        setIntField(term150480, term150480.getClass(), "lastAllNetId", 0);
        setField(term150480, term150480.getClass(), "lastClientId", null);
        setIntField(term150480, term150480.getClass(), "lastUsedDeckId", 0);
        setIntField(term150480, term150480.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term150480, term150480.getClass(), "lastEmoneyBrand", 0);
        term150524 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term150524;
        callMethod(klass, "setLastUsedDeckId", argTypes, term150480, args);
    }

};


