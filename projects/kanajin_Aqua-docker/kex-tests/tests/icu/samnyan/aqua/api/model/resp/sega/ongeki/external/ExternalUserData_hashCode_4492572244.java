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

public class ExternalUserData_hashCode_4492572244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150706;

    public ExternalUserData_hashCode_4492572244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150706 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term150706, term150706.getClass(), "accessCode", null);
        setField(term150706, term150706.getClass(), "userName", null);
        setIntField(term150706, term150706.getClass(), "level", 0);
        setIntField(term150706, term150706.getClass(), "reincarnationNum", 0);
        setLongField(term150706, term150706.getClass(), "exp", 0L);
        setLongField(term150706, term150706.getClass(), "point", 0L);
        setLongField(term150706, term150706.getClass(), "totalPoint", 0L);
        setIntField(term150706, term150706.getClass(), "playCount", 0);
        setIntField(term150706, term150706.getClass(), "jewelCount", 0);
        setIntField(term150706, term150706.getClass(), "totalJewelCount", 0);
        setIntField(term150706, term150706.getClass(), "medalCount", 0);
        setIntField(term150706, term150706.getClass(), "playerRating", 0);
        setIntField(term150706, term150706.getClass(), "highestRating", 0);
        setIntField(term150706, term150706.getClass(), "battlePoint", 0);
        setIntField(term150706, term150706.getClass(), "bestBattlePoint", 0);
        setIntField(term150706, term150706.getClass(), "overDamageBattlePoint", 0);
        setIntField(term150706, term150706.getClass(), "nameplateId", 0);
        setIntField(term150706, term150706.getClass(), "trophyId", 0);
        setIntField(term150706, term150706.getClass(), "cardId", 0);
        setIntField(term150706, term150706.getClass(), "characterId", 0);
        setIntField(term150706, term150706.getClass(), "tabSetting", 0);
        setIntField(term150706, term150706.getClass(), "tabSortSetting", 0);
        setIntField(term150706, term150706.getClass(), "cardCategorySetting", 0);
        setIntField(term150706, term150706.getClass(), "cardSortSetting", 0);
        setIntField(term150706, term150706.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term150706, term150706.getClass(), "playedTutorialBit", 0);
        setIntField(term150706, term150706.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term150706, term150706.getClass(), "sumTechHighScore", 0L);
        setLongField(term150706, term150706.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term150706, term150706.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term150706, term150706.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term150706, term150706.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term150706, term150706.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term150706, term150706.getClass(), "sumBattleHighScore", 0L);
        setLongField(term150706, term150706.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term150706, term150706.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term150706, term150706.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term150706, term150706.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term150706, term150706.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term150706, term150706.getClass(), "eventWatchedDate", null);
        setField(term150706, term150706.getClass(), "cmEventWatchedDate", null);
        setField(term150706, term150706.getClass(), "firstGameId", null);
        setField(term150706, term150706.getClass(), "firstRomVersion", null);
        setField(term150706, term150706.getClass(), "firstDataVersion", null);
        setField(term150706, term150706.getClass(), "firstPlayDate", null);
        setField(term150706, term150706.getClass(), "lastGameId", null);
        setField(term150706, term150706.getClass(), "lastRomVersion", null);
        setField(term150706, term150706.getClass(), "lastDataVersion", null);
        setField(term150706, term150706.getClass(), "compatibleCmVersion", null);
        setField(term150706, term150706.getClass(), "lastPlayDate", null);
        setIntField(term150706, term150706.getClass(), "lastPlaceId", 0);
        setField(term150706, term150706.getClass(), "lastPlaceName", null);
        setIntField(term150706, term150706.getClass(), "lastRegionId", 0);
        setField(term150706, term150706.getClass(), "lastRegionName", null);
        setIntField(term150706, term150706.getClass(), "lastAllNetId", 0);
        setField(term150706, term150706.getClass(), "lastClientId", null);
        setIntField(term150706, term150706.getClass(), "lastUsedDeckId", 0);
        setIntField(term150706, term150706.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term150706, term150706.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term150706, args);
    }

};


