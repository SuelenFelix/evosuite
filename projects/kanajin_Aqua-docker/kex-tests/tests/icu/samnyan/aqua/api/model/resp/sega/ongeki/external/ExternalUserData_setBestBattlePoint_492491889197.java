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

public class ExternalUserData_setBestBattlePoint_492491889197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148576;
     Object term148620;

    public ExternalUserData_setBestBattlePoint_492491889197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148576 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148576, term148576.getClass(), "accessCode", null);
        setField(term148576, term148576.getClass(), "userName", null);
        setIntField(term148576, term148576.getClass(), "level", 0);
        setIntField(term148576, term148576.getClass(), "reincarnationNum", 0);
        setLongField(term148576, term148576.getClass(), "exp", 0L);
        setLongField(term148576, term148576.getClass(), "point", 0L);
        setLongField(term148576, term148576.getClass(), "totalPoint", 0L);
        setIntField(term148576, term148576.getClass(), "playCount", 0);
        setIntField(term148576, term148576.getClass(), "jewelCount", 0);
        setIntField(term148576, term148576.getClass(), "totalJewelCount", 0);
        setIntField(term148576, term148576.getClass(), "medalCount", 0);
        setIntField(term148576, term148576.getClass(), "playerRating", 0);
        setIntField(term148576, term148576.getClass(), "highestRating", 0);
        setIntField(term148576, term148576.getClass(), "battlePoint", 0);
        setIntField(term148576, term148576.getClass(), "bestBattlePoint", 0);
        setIntField(term148576, term148576.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148576, term148576.getClass(), "nameplateId", 0);
        setIntField(term148576, term148576.getClass(), "trophyId", 0);
        setIntField(term148576, term148576.getClass(), "cardId", 0);
        setIntField(term148576, term148576.getClass(), "characterId", 0);
        setIntField(term148576, term148576.getClass(), "tabSetting", 0);
        setIntField(term148576, term148576.getClass(), "tabSortSetting", 0);
        setIntField(term148576, term148576.getClass(), "cardCategorySetting", 0);
        setIntField(term148576, term148576.getClass(), "cardSortSetting", 0);
        setIntField(term148576, term148576.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148576, term148576.getClass(), "playedTutorialBit", 0);
        setIntField(term148576, term148576.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148576, term148576.getClass(), "sumTechHighScore", 0L);
        setLongField(term148576, term148576.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148576, term148576.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148576, term148576.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148576, term148576.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148576, term148576.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148576, term148576.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148576, term148576.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148576, term148576.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148576, term148576.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148576, term148576.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148576, term148576.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148576, term148576.getClass(), "eventWatchedDate", null);
        setField(term148576, term148576.getClass(), "cmEventWatchedDate", null);
        setField(term148576, term148576.getClass(), "firstGameId", null);
        setField(term148576, term148576.getClass(), "firstRomVersion", null);
        setField(term148576, term148576.getClass(), "firstDataVersion", null);
        setField(term148576, term148576.getClass(), "firstPlayDate", null);
        setField(term148576, term148576.getClass(), "lastGameId", null);
        setField(term148576, term148576.getClass(), "lastRomVersion", null);
        setField(term148576, term148576.getClass(), "lastDataVersion", null);
        setField(term148576, term148576.getClass(), "compatibleCmVersion", null);
        setField(term148576, term148576.getClass(), "lastPlayDate", null);
        setIntField(term148576, term148576.getClass(), "lastPlaceId", 0);
        setField(term148576, term148576.getClass(), "lastPlaceName", null);
        setIntField(term148576, term148576.getClass(), "lastRegionId", 0);
        setField(term148576, term148576.getClass(), "lastRegionName", null);
        setIntField(term148576, term148576.getClass(), "lastAllNetId", 0);
        setField(term148576, term148576.getClass(), "lastClientId", null);
        setIntField(term148576, term148576.getClass(), "lastUsedDeckId", 0);
        setIntField(term148576, term148576.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148576, term148576.getClass(), "lastEmoneyBrand", 0);
        term148620 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148620;
        callMethod(klass, "setBestBattlePoint", argTypes, term148576, args);
    }

};


