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

public class ExternalUserData_setFirstTutorialCancelNum_690373023209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149128;
     Object term149172;

    public ExternalUserData_setFirstTutorialCancelNum_690373023209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149128 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149128, term149128.getClass(), "accessCode", null);
        setField(term149128, term149128.getClass(), "userName", null);
        setIntField(term149128, term149128.getClass(), "level", 0);
        setIntField(term149128, term149128.getClass(), "reincarnationNum", 0);
        setLongField(term149128, term149128.getClass(), "exp", 0L);
        setLongField(term149128, term149128.getClass(), "point", 0L);
        setLongField(term149128, term149128.getClass(), "totalPoint", 0L);
        setIntField(term149128, term149128.getClass(), "playCount", 0);
        setIntField(term149128, term149128.getClass(), "jewelCount", 0);
        setIntField(term149128, term149128.getClass(), "totalJewelCount", 0);
        setIntField(term149128, term149128.getClass(), "medalCount", 0);
        setIntField(term149128, term149128.getClass(), "playerRating", 0);
        setIntField(term149128, term149128.getClass(), "highestRating", 0);
        setIntField(term149128, term149128.getClass(), "battlePoint", 0);
        setIntField(term149128, term149128.getClass(), "bestBattlePoint", 0);
        setIntField(term149128, term149128.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149128, term149128.getClass(), "nameplateId", 0);
        setIntField(term149128, term149128.getClass(), "trophyId", 0);
        setIntField(term149128, term149128.getClass(), "cardId", 0);
        setIntField(term149128, term149128.getClass(), "characterId", 0);
        setIntField(term149128, term149128.getClass(), "tabSetting", 0);
        setIntField(term149128, term149128.getClass(), "tabSortSetting", 0);
        setIntField(term149128, term149128.getClass(), "cardCategorySetting", 0);
        setIntField(term149128, term149128.getClass(), "cardSortSetting", 0);
        setIntField(term149128, term149128.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149128, term149128.getClass(), "playedTutorialBit", 0);
        setIntField(term149128, term149128.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149128, term149128.getClass(), "sumTechHighScore", 0L);
        setLongField(term149128, term149128.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149128, term149128.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149128, term149128.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149128, term149128.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149128, term149128.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149128, term149128.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149128, term149128.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149128, term149128.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149128, term149128.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149128, term149128.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149128, term149128.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149128, term149128.getClass(), "eventWatchedDate", null);
        setField(term149128, term149128.getClass(), "cmEventWatchedDate", null);
        setField(term149128, term149128.getClass(), "firstGameId", null);
        setField(term149128, term149128.getClass(), "firstRomVersion", null);
        setField(term149128, term149128.getClass(), "firstDataVersion", null);
        setField(term149128, term149128.getClass(), "firstPlayDate", null);
        setField(term149128, term149128.getClass(), "lastGameId", null);
        setField(term149128, term149128.getClass(), "lastRomVersion", null);
        setField(term149128, term149128.getClass(), "lastDataVersion", null);
        setField(term149128, term149128.getClass(), "compatibleCmVersion", null);
        setField(term149128, term149128.getClass(), "lastPlayDate", null);
        setIntField(term149128, term149128.getClass(), "lastPlaceId", 0);
        setField(term149128, term149128.getClass(), "lastPlaceName", null);
        setIntField(term149128, term149128.getClass(), "lastRegionId", 0);
        setField(term149128, term149128.getClass(), "lastRegionName", null);
        setIntField(term149128, term149128.getClass(), "lastAllNetId", 0);
        setField(term149128, term149128.getClass(), "lastClientId", null);
        setIntField(term149128, term149128.getClass(), "lastUsedDeckId", 0);
        setIntField(term149128, term149128.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149128, term149128.getClass(), "lastEmoneyBrand", 0);
        term149172 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term149172;
        callMethod(klass, "setFirstTutorialCancelNum", argTypes, term149128, args);
    }

};


