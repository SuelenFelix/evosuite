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

public class ExternalUserData_setPlayedTutorialBit_221964359208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149082;
     Object term149126;

    public ExternalUserData_setPlayedTutorialBit_221964359208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149082 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149082, term149082.getClass(), "accessCode", null);
        setField(term149082, term149082.getClass(), "userName", null);
        setIntField(term149082, term149082.getClass(), "level", 0);
        setIntField(term149082, term149082.getClass(), "reincarnationNum", 0);
        setLongField(term149082, term149082.getClass(), "exp", 0L);
        setLongField(term149082, term149082.getClass(), "point", 0L);
        setLongField(term149082, term149082.getClass(), "totalPoint", 0L);
        setIntField(term149082, term149082.getClass(), "playCount", 0);
        setIntField(term149082, term149082.getClass(), "jewelCount", 0);
        setIntField(term149082, term149082.getClass(), "totalJewelCount", 0);
        setIntField(term149082, term149082.getClass(), "medalCount", 0);
        setIntField(term149082, term149082.getClass(), "playerRating", 0);
        setIntField(term149082, term149082.getClass(), "highestRating", 0);
        setIntField(term149082, term149082.getClass(), "battlePoint", 0);
        setIntField(term149082, term149082.getClass(), "bestBattlePoint", 0);
        setIntField(term149082, term149082.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149082, term149082.getClass(), "nameplateId", 0);
        setIntField(term149082, term149082.getClass(), "trophyId", 0);
        setIntField(term149082, term149082.getClass(), "cardId", 0);
        setIntField(term149082, term149082.getClass(), "characterId", 0);
        setIntField(term149082, term149082.getClass(), "tabSetting", 0);
        setIntField(term149082, term149082.getClass(), "tabSortSetting", 0);
        setIntField(term149082, term149082.getClass(), "cardCategorySetting", 0);
        setIntField(term149082, term149082.getClass(), "cardSortSetting", 0);
        setIntField(term149082, term149082.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149082, term149082.getClass(), "playedTutorialBit", 0);
        setIntField(term149082, term149082.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149082, term149082.getClass(), "sumTechHighScore", 0L);
        setLongField(term149082, term149082.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149082, term149082.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149082, term149082.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149082, term149082.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149082, term149082.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149082, term149082.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149082, term149082.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149082, term149082.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149082, term149082.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149082, term149082.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149082, term149082.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149082, term149082.getClass(), "eventWatchedDate", null);
        setField(term149082, term149082.getClass(), "cmEventWatchedDate", null);
        setField(term149082, term149082.getClass(), "firstGameId", null);
        setField(term149082, term149082.getClass(), "firstRomVersion", null);
        setField(term149082, term149082.getClass(), "firstDataVersion", null);
        setField(term149082, term149082.getClass(), "firstPlayDate", null);
        setField(term149082, term149082.getClass(), "lastGameId", null);
        setField(term149082, term149082.getClass(), "lastRomVersion", null);
        setField(term149082, term149082.getClass(), "lastDataVersion", null);
        setField(term149082, term149082.getClass(), "compatibleCmVersion", null);
        setField(term149082, term149082.getClass(), "lastPlayDate", null);
        setIntField(term149082, term149082.getClass(), "lastPlaceId", 0);
        setField(term149082, term149082.getClass(), "lastPlaceName", null);
        setIntField(term149082, term149082.getClass(), "lastRegionId", 0);
        setField(term149082, term149082.getClass(), "lastRegionName", null);
        setIntField(term149082, term149082.getClass(), "lastAllNetId", 0);
        setField(term149082, term149082.getClass(), "lastClientId", null);
        setIntField(term149082, term149082.getClass(), "lastUsedDeckId", 0);
        setIntField(term149082, term149082.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149082, term149082.getClass(), "lastEmoneyBrand", 0);
        term149126 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term149126;
        callMethod(klass, "setPlayedTutorialBit", argTypes, term149082, args);
    }

};


