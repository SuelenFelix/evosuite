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

public class ExternalUserData_setNameplateId_119794269199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148668;
     Object term148712;

    public ExternalUserData_setNameplateId_119794269199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148668 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148668, term148668.getClass(), "accessCode", null);
        setField(term148668, term148668.getClass(), "userName", null);
        setIntField(term148668, term148668.getClass(), "level", 0);
        setIntField(term148668, term148668.getClass(), "reincarnationNum", 0);
        setLongField(term148668, term148668.getClass(), "exp", 0L);
        setLongField(term148668, term148668.getClass(), "point", 0L);
        setLongField(term148668, term148668.getClass(), "totalPoint", 0L);
        setIntField(term148668, term148668.getClass(), "playCount", 0);
        setIntField(term148668, term148668.getClass(), "jewelCount", 0);
        setIntField(term148668, term148668.getClass(), "totalJewelCount", 0);
        setIntField(term148668, term148668.getClass(), "medalCount", 0);
        setIntField(term148668, term148668.getClass(), "playerRating", 0);
        setIntField(term148668, term148668.getClass(), "highestRating", 0);
        setIntField(term148668, term148668.getClass(), "battlePoint", 0);
        setIntField(term148668, term148668.getClass(), "bestBattlePoint", 0);
        setIntField(term148668, term148668.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148668, term148668.getClass(), "nameplateId", 0);
        setIntField(term148668, term148668.getClass(), "trophyId", 0);
        setIntField(term148668, term148668.getClass(), "cardId", 0);
        setIntField(term148668, term148668.getClass(), "characterId", 0);
        setIntField(term148668, term148668.getClass(), "tabSetting", 0);
        setIntField(term148668, term148668.getClass(), "tabSortSetting", 0);
        setIntField(term148668, term148668.getClass(), "cardCategorySetting", 0);
        setIntField(term148668, term148668.getClass(), "cardSortSetting", 0);
        setIntField(term148668, term148668.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148668, term148668.getClass(), "playedTutorialBit", 0);
        setIntField(term148668, term148668.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148668, term148668.getClass(), "sumTechHighScore", 0L);
        setLongField(term148668, term148668.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148668, term148668.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148668, term148668.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148668, term148668.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148668, term148668.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148668, term148668.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148668, term148668.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148668, term148668.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148668, term148668.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148668, term148668.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148668, term148668.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148668, term148668.getClass(), "eventWatchedDate", null);
        setField(term148668, term148668.getClass(), "cmEventWatchedDate", null);
        setField(term148668, term148668.getClass(), "firstGameId", null);
        setField(term148668, term148668.getClass(), "firstRomVersion", null);
        setField(term148668, term148668.getClass(), "firstDataVersion", null);
        setField(term148668, term148668.getClass(), "firstPlayDate", null);
        setField(term148668, term148668.getClass(), "lastGameId", null);
        setField(term148668, term148668.getClass(), "lastRomVersion", null);
        setField(term148668, term148668.getClass(), "lastDataVersion", null);
        setField(term148668, term148668.getClass(), "compatibleCmVersion", null);
        setField(term148668, term148668.getClass(), "lastPlayDate", null);
        setIntField(term148668, term148668.getClass(), "lastPlaceId", 0);
        setField(term148668, term148668.getClass(), "lastPlaceName", null);
        setIntField(term148668, term148668.getClass(), "lastRegionId", 0);
        setField(term148668, term148668.getClass(), "lastRegionName", null);
        setIntField(term148668, term148668.getClass(), "lastAllNetId", 0);
        setField(term148668, term148668.getClass(), "lastClientId", null);
        setIntField(term148668, term148668.getClass(), "lastUsedDeckId", 0);
        setIntField(term148668, term148668.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148668, term148668.getClass(), "lastEmoneyBrand", 0);
        term148712 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148712;
        callMethod(klass, "setNameplateId", argTypes, term148668, args);
    }

};


