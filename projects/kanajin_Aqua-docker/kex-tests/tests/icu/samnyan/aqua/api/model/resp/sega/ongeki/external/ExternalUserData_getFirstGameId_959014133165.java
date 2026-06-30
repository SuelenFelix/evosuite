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

public class ExternalUserData_getFirstGameId_959014133165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147144;

    public ExternalUserData_getFirstGameId_959014133165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147144 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term147144, term147144.getClass(), "accessCode", null);
        setField(term147144, term147144.getClass(), "userName", null);
        setIntField(term147144, term147144.getClass(), "level", 0);
        setIntField(term147144, term147144.getClass(), "reincarnationNum", 0);
        setLongField(term147144, term147144.getClass(), "exp", 0L);
        setLongField(term147144, term147144.getClass(), "point", 0L);
        setLongField(term147144, term147144.getClass(), "totalPoint", 0L);
        setIntField(term147144, term147144.getClass(), "playCount", 0);
        setIntField(term147144, term147144.getClass(), "jewelCount", 0);
        setIntField(term147144, term147144.getClass(), "totalJewelCount", 0);
        setIntField(term147144, term147144.getClass(), "medalCount", 0);
        setIntField(term147144, term147144.getClass(), "playerRating", 0);
        setIntField(term147144, term147144.getClass(), "highestRating", 0);
        setIntField(term147144, term147144.getClass(), "battlePoint", 0);
        setIntField(term147144, term147144.getClass(), "bestBattlePoint", 0);
        setIntField(term147144, term147144.getClass(), "overDamageBattlePoint", 0);
        setIntField(term147144, term147144.getClass(), "nameplateId", 0);
        setIntField(term147144, term147144.getClass(), "trophyId", 0);
        setIntField(term147144, term147144.getClass(), "cardId", 0);
        setIntField(term147144, term147144.getClass(), "characterId", 0);
        setIntField(term147144, term147144.getClass(), "tabSetting", 0);
        setIntField(term147144, term147144.getClass(), "tabSortSetting", 0);
        setIntField(term147144, term147144.getClass(), "cardCategorySetting", 0);
        setIntField(term147144, term147144.getClass(), "cardSortSetting", 0);
        setIntField(term147144, term147144.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term147144, term147144.getClass(), "playedTutorialBit", 0);
        setIntField(term147144, term147144.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term147144, term147144.getClass(), "sumTechHighScore", 0L);
        setLongField(term147144, term147144.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term147144, term147144.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term147144, term147144.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term147144, term147144.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term147144, term147144.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term147144, term147144.getClass(), "sumBattleHighScore", 0L);
        setLongField(term147144, term147144.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term147144, term147144.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term147144, term147144.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term147144, term147144.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term147144, term147144.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term147144, term147144.getClass(), "eventWatchedDate", null);
        setField(term147144, term147144.getClass(), "cmEventWatchedDate", null);
        setField(term147144, term147144.getClass(), "firstGameId", null);
        setField(term147144, term147144.getClass(), "firstRomVersion", null);
        setField(term147144, term147144.getClass(), "firstDataVersion", null);
        setField(term147144, term147144.getClass(), "firstPlayDate", null);
        setField(term147144, term147144.getClass(), "lastGameId", null);
        setField(term147144, term147144.getClass(), "lastRomVersion", null);
        setField(term147144, term147144.getClass(), "lastDataVersion", null);
        setField(term147144, term147144.getClass(), "compatibleCmVersion", null);
        setField(term147144, term147144.getClass(), "lastPlayDate", null);
        setIntField(term147144, term147144.getClass(), "lastPlaceId", 0);
        setField(term147144, term147144.getClass(), "lastPlaceName", null);
        setIntField(term147144, term147144.getClass(), "lastRegionId", 0);
        setField(term147144, term147144.getClass(), "lastRegionName", null);
        setIntField(term147144, term147144.getClass(), "lastAllNetId", 0);
        setField(term147144, term147144.getClass(), "lastClientId", null);
        setIntField(term147144, term147144.getClass(), "lastUsedDeckId", 0);
        setIntField(term147144, term147144.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term147144, term147144.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstGameId", argTypes, term147144, args);
    }

};


