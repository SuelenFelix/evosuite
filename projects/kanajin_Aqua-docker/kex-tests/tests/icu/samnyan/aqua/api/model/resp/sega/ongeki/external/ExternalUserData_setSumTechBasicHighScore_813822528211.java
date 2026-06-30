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
import java.lang.Long;

public class ExternalUserData_setSumTechBasicHighScore_813822528211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149220;
     Object term149264;

    public ExternalUserData_setSumTechBasicHighScore_813822528211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149220 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149220, term149220.getClass(), "accessCode", null);
        setField(term149220, term149220.getClass(), "userName", null);
        setIntField(term149220, term149220.getClass(), "level", 0);
        setIntField(term149220, term149220.getClass(), "reincarnationNum", 0);
        setLongField(term149220, term149220.getClass(), "exp", 0L);
        setLongField(term149220, term149220.getClass(), "point", 0L);
        setLongField(term149220, term149220.getClass(), "totalPoint", 0L);
        setIntField(term149220, term149220.getClass(), "playCount", 0);
        setIntField(term149220, term149220.getClass(), "jewelCount", 0);
        setIntField(term149220, term149220.getClass(), "totalJewelCount", 0);
        setIntField(term149220, term149220.getClass(), "medalCount", 0);
        setIntField(term149220, term149220.getClass(), "playerRating", 0);
        setIntField(term149220, term149220.getClass(), "highestRating", 0);
        setIntField(term149220, term149220.getClass(), "battlePoint", 0);
        setIntField(term149220, term149220.getClass(), "bestBattlePoint", 0);
        setIntField(term149220, term149220.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149220, term149220.getClass(), "nameplateId", 0);
        setIntField(term149220, term149220.getClass(), "trophyId", 0);
        setIntField(term149220, term149220.getClass(), "cardId", 0);
        setIntField(term149220, term149220.getClass(), "characterId", 0);
        setIntField(term149220, term149220.getClass(), "tabSetting", 0);
        setIntField(term149220, term149220.getClass(), "tabSortSetting", 0);
        setIntField(term149220, term149220.getClass(), "cardCategorySetting", 0);
        setIntField(term149220, term149220.getClass(), "cardSortSetting", 0);
        setIntField(term149220, term149220.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149220, term149220.getClass(), "playedTutorialBit", 0);
        setIntField(term149220, term149220.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149220, term149220.getClass(), "sumTechHighScore", 0L);
        setLongField(term149220, term149220.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149220, term149220.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149220, term149220.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149220, term149220.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149220, term149220.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149220, term149220.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149220, term149220.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149220, term149220.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149220, term149220.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149220, term149220.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149220, term149220.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149220, term149220.getClass(), "eventWatchedDate", null);
        setField(term149220, term149220.getClass(), "cmEventWatchedDate", null);
        setField(term149220, term149220.getClass(), "firstGameId", null);
        setField(term149220, term149220.getClass(), "firstRomVersion", null);
        setField(term149220, term149220.getClass(), "firstDataVersion", null);
        setField(term149220, term149220.getClass(), "firstPlayDate", null);
        setField(term149220, term149220.getClass(), "lastGameId", null);
        setField(term149220, term149220.getClass(), "lastRomVersion", null);
        setField(term149220, term149220.getClass(), "lastDataVersion", null);
        setField(term149220, term149220.getClass(), "compatibleCmVersion", null);
        setField(term149220, term149220.getClass(), "lastPlayDate", null);
        setIntField(term149220, term149220.getClass(), "lastPlaceId", 0);
        setField(term149220, term149220.getClass(), "lastPlaceName", null);
        setIntField(term149220, term149220.getClass(), "lastRegionId", 0);
        setField(term149220, term149220.getClass(), "lastRegionName", null);
        setIntField(term149220, term149220.getClass(), "lastAllNetId", 0);
        setField(term149220, term149220.getClass(), "lastClientId", null);
        setIntField(term149220, term149220.getClass(), "lastUsedDeckId", 0);
        setIntField(term149220, term149220.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149220, term149220.getClass(), "lastEmoneyBrand", 0);
        term149264 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term149264;
        callMethod(klass, "setSumTechBasicHighScore", argTypes, term149220, args);
    }

};


