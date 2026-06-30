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

public class ExternalUserData_getExp_1745714896130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3214382;

    public ExternalUserData_getExp_1745714896130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3214382 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3214382, term3214382.getClass(), "accessCode", null);
        setField(term3214382, term3214382.getClass(), "userName", null);
        setIntField(term3214382, term3214382.getClass(), "level", 0);
        setIntField(term3214382, term3214382.getClass(), "reincarnationNum", 0);
        setLongField(term3214382, term3214382.getClass(), "exp", 0L);
        setLongField(term3214382, term3214382.getClass(), "point", 0L);
        setLongField(term3214382, term3214382.getClass(), "totalPoint", 0L);
        setIntField(term3214382, term3214382.getClass(), "playCount", 0);
        setIntField(term3214382, term3214382.getClass(), "jewelCount", 0);
        setIntField(term3214382, term3214382.getClass(), "totalJewelCount", 0);
        setIntField(term3214382, term3214382.getClass(), "medalCount", 0);
        setIntField(term3214382, term3214382.getClass(), "playerRating", 0);
        setIntField(term3214382, term3214382.getClass(), "highestRating", 0);
        setIntField(term3214382, term3214382.getClass(), "battlePoint", 0);
        setIntField(term3214382, term3214382.getClass(), "bestBattlePoint", 0);
        setIntField(term3214382, term3214382.getClass(), "overDamageBattlePoint", 0);
        setIntField(term3214382, term3214382.getClass(), "nameplateId", 0);
        setIntField(term3214382, term3214382.getClass(), "trophyId", 0);
        setIntField(term3214382, term3214382.getClass(), "cardId", 0);
        setIntField(term3214382, term3214382.getClass(), "characterId", 0);
        setIntField(term3214382, term3214382.getClass(), "tabSetting", 0);
        setIntField(term3214382, term3214382.getClass(), "tabSortSetting", 0);
        setIntField(term3214382, term3214382.getClass(), "cardCategorySetting", 0);
        setIntField(term3214382, term3214382.getClass(), "cardSortSetting", 0);
        setIntField(term3214382, term3214382.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term3214382, term3214382.getClass(), "playedTutorialBit", 0);
        setIntField(term3214382, term3214382.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term3214382, term3214382.getClass(), "sumTechHighScore", 0L);
        setLongField(term3214382, term3214382.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term3214382, term3214382.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term3214382, term3214382.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term3214382, term3214382.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term3214382, term3214382.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term3214382, term3214382.getClass(), "sumBattleHighScore", 0L);
        setLongField(term3214382, term3214382.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term3214382, term3214382.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term3214382, term3214382.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term3214382, term3214382.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term3214382, term3214382.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term3214382, term3214382.getClass(), "eventWatchedDate", null);
        setField(term3214382, term3214382.getClass(), "cmEventWatchedDate", null);
        setField(term3214382, term3214382.getClass(), "firstGameId", null);
        setField(term3214382, term3214382.getClass(), "firstRomVersion", null);
        setField(term3214382, term3214382.getClass(), "firstDataVersion", null);
        setField(term3214382, term3214382.getClass(), "firstPlayDate", null);
        setField(term3214382, term3214382.getClass(), "lastGameId", null);
        setField(term3214382, term3214382.getClass(), "lastRomVersion", null);
        setField(term3214382, term3214382.getClass(), "lastDataVersion", null);
        setField(term3214382, term3214382.getClass(), "compatibleCmVersion", null);
        setField(term3214382, term3214382.getClass(), "lastPlayDate", null);
        setIntField(term3214382, term3214382.getClass(), "lastPlaceId", 0);
        setField(term3214382, term3214382.getClass(), "lastPlaceName", null);
        setIntField(term3214382, term3214382.getClass(), "lastRegionId", 0);
        setField(term3214382, term3214382.getClass(), "lastRegionName", null);
        setIntField(term3214382, term3214382.getClass(), "lastAllNetId", 0);
        setField(term3214382, term3214382.getClass(), "lastClientId", null);
        setIntField(term3214382, term3214382.getClass(), "lastUsedDeckId", 0);
        setIntField(term3214382, term3214382.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term3214382, term3214382.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term3214382, args);
    }

};


