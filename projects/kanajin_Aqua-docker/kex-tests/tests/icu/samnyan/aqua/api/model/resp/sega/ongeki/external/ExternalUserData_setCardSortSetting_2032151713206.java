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

public class ExternalUserData_setCardSortSetting_2032151713206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148990;
     Object term149034;

    public ExternalUserData_setCardSortSetting_2032151713206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148990 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148990, term148990.getClass(), "accessCode", null);
        setField(term148990, term148990.getClass(), "userName", null);
        setIntField(term148990, term148990.getClass(), "level", 0);
        setIntField(term148990, term148990.getClass(), "reincarnationNum", 0);
        setLongField(term148990, term148990.getClass(), "exp", 0L);
        setLongField(term148990, term148990.getClass(), "point", 0L);
        setLongField(term148990, term148990.getClass(), "totalPoint", 0L);
        setIntField(term148990, term148990.getClass(), "playCount", 0);
        setIntField(term148990, term148990.getClass(), "jewelCount", 0);
        setIntField(term148990, term148990.getClass(), "totalJewelCount", 0);
        setIntField(term148990, term148990.getClass(), "medalCount", 0);
        setIntField(term148990, term148990.getClass(), "playerRating", 0);
        setIntField(term148990, term148990.getClass(), "highestRating", 0);
        setIntField(term148990, term148990.getClass(), "battlePoint", 0);
        setIntField(term148990, term148990.getClass(), "bestBattlePoint", 0);
        setIntField(term148990, term148990.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148990, term148990.getClass(), "nameplateId", 0);
        setIntField(term148990, term148990.getClass(), "trophyId", 0);
        setIntField(term148990, term148990.getClass(), "cardId", 0);
        setIntField(term148990, term148990.getClass(), "characterId", 0);
        setIntField(term148990, term148990.getClass(), "tabSetting", 0);
        setIntField(term148990, term148990.getClass(), "tabSortSetting", 0);
        setIntField(term148990, term148990.getClass(), "cardCategorySetting", 0);
        setIntField(term148990, term148990.getClass(), "cardSortSetting", 0);
        setIntField(term148990, term148990.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148990, term148990.getClass(), "playedTutorialBit", 0);
        setIntField(term148990, term148990.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148990, term148990.getClass(), "sumTechHighScore", 0L);
        setLongField(term148990, term148990.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148990, term148990.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148990, term148990.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148990, term148990.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148990, term148990.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148990, term148990.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148990, term148990.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148990, term148990.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148990, term148990.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148990, term148990.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148990, term148990.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148990, term148990.getClass(), "eventWatchedDate", null);
        setField(term148990, term148990.getClass(), "cmEventWatchedDate", null);
        setField(term148990, term148990.getClass(), "firstGameId", null);
        setField(term148990, term148990.getClass(), "firstRomVersion", null);
        setField(term148990, term148990.getClass(), "firstDataVersion", null);
        setField(term148990, term148990.getClass(), "firstPlayDate", null);
        setField(term148990, term148990.getClass(), "lastGameId", null);
        setField(term148990, term148990.getClass(), "lastRomVersion", null);
        setField(term148990, term148990.getClass(), "lastDataVersion", null);
        setField(term148990, term148990.getClass(), "compatibleCmVersion", null);
        setField(term148990, term148990.getClass(), "lastPlayDate", null);
        setIntField(term148990, term148990.getClass(), "lastPlaceId", 0);
        setField(term148990, term148990.getClass(), "lastPlaceName", null);
        setIntField(term148990, term148990.getClass(), "lastRegionId", 0);
        setField(term148990, term148990.getClass(), "lastRegionName", null);
        setIntField(term148990, term148990.getClass(), "lastAllNetId", 0);
        setField(term148990, term148990.getClass(), "lastClientId", null);
        setIntField(term148990, term148990.getClass(), "lastUsedDeckId", 0);
        setIntField(term148990, term148990.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148990, term148990.getClass(), "lastEmoneyBrand", 0);
        term149034 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term149034;
        callMethod(klass, "setCardSortSetting", argTypes, term148990, args);
    }

};


