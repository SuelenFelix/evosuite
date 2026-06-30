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

public class ExternalUserData_getSumTechMasterHighScore_751475692155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146704;

    public ExternalUserData_getSumTechMasterHighScore_751475692155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146704 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term146704, term146704.getClass(), "accessCode", null);
        setField(term146704, term146704.getClass(), "userName", null);
        setIntField(term146704, term146704.getClass(), "level", 0);
        setIntField(term146704, term146704.getClass(), "reincarnationNum", 0);
        setLongField(term146704, term146704.getClass(), "exp", 0L);
        setLongField(term146704, term146704.getClass(), "point", 0L);
        setLongField(term146704, term146704.getClass(), "totalPoint", 0L);
        setIntField(term146704, term146704.getClass(), "playCount", 0);
        setIntField(term146704, term146704.getClass(), "jewelCount", 0);
        setIntField(term146704, term146704.getClass(), "totalJewelCount", 0);
        setIntField(term146704, term146704.getClass(), "medalCount", 0);
        setIntField(term146704, term146704.getClass(), "playerRating", 0);
        setIntField(term146704, term146704.getClass(), "highestRating", 0);
        setIntField(term146704, term146704.getClass(), "battlePoint", 0);
        setIntField(term146704, term146704.getClass(), "bestBattlePoint", 0);
        setIntField(term146704, term146704.getClass(), "overDamageBattlePoint", 0);
        setIntField(term146704, term146704.getClass(), "nameplateId", 0);
        setIntField(term146704, term146704.getClass(), "trophyId", 0);
        setIntField(term146704, term146704.getClass(), "cardId", 0);
        setIntField(term146704, term146704.getClass(), "characterId", 0);
        setIntField(term146704, term146704.getClass(), "tabSetting", 0);
        setIntField(term146704, term146704.getClass(), "tabSortSetting", 0);
        setIntField(term146704, term146704.getClass(), "cardCategorySetting", 0);
        setIntField(term146704, term146704.getClass(), "cardSortSetting", 0);
        setIntField(term146704, term146704.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term146704, term146704.getClass(), "playedTutorialBit", 0);
        setIntField(term146704, term146704.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term146704, term146704.getClass(), "sumTechHighScore", 0L);
        setLongField(term146704, term146704.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term146704, term146704.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term146704, term146704.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term146704, term146704.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term146704, term146704.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term146704, term146704.getClass(), "sumBattleHighScore", 0L);
        setLongField(term146704, term146704.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term146704, term146704.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term146704, term146704.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term146704, term146704.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term146704, term146704.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term146704, term146704.getClass(), "eventWatchedDate", null);
        setField(term146704, term146704.getClass(), "cmEventWatchedDate", null);
        setField(term146704, term146704.getClass(), "firstGameId", null);
        setField(term146704, term146704.getClass(), "firstRomVersion", null);
        setField(term146704, term146704.getClass(), "firstDataVersion", null);
        setField(term146704, term146704.getClass(), "firstPlayDate", null);
        setField(term146704, term146704.getClass(), "lastGameId", null);
        setField(term146704, term146704.getClass(), "lastRomVersion", null);
        setField(term146704, term146704.getClass(), "lastDataVersion", null);
        setField(term146704, term146704.getClass(), "compatibleCmVersion", null);
        setField(term146704, term146704.getClass(), "lastPlayDate", null);
        setIntField(term146704, term146704.getClass(), "lastPlaceId", 0);
        setField(term146704, term146704.getClass(), "lastPlaceName", null);
        setIntField(term146704, term146704.getClass(), "lastRegionId", 0);
        setField(term146704, term146704.getClass(), "lastRegionName", null);
        setIntField(term146704, term146704.getClass(), "lastAllNetId", 0);
        setField(term146704, term146704.getClass(), "lastClientId", null);
        setIntField(term146704, term146704.getClass(), "lastUsedDeckId", 0);
        setIntField(term146704, term146704.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term146704, term146704.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechMasterHighScore", argTypes, term146704, args);
    }

};


