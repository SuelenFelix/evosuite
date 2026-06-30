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

public class ExternalUserData_setReincarnationNum_1166391748186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148070;
     Object term148114;

    public ExternalUserData_setReincarnationNum_1166391748186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148070 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148070, term148070.getClass(), "accessCode", null);
        setField(term148070, term148070.getClass(), "userName", null);
        setIntField(term148070, term148070.getClass(), "level", 0);
        setIntField(term148070, term148070.getClass(), "reincarnationNum", 0);
        setLongField(term148070, term148070.getClass(), "exp", 0L);
        setLongField(term148070, term148070.getClass(), "point", 0L);
        setLongField(term148070, term148070.getClass(), "totalPoint", 0L);
        setIntField(term148070, term148070.getClass(), "playCount", 0);
        setIntField(term148070, term148070.getClass(), "jewelCount", 0);
        setIntField(term148070, term148070.getClass(), "totalJewelCount", 0);
        setIntField(term148070, term148070.getClass(), "medalCount", 0);
        setIntField(term148070, term148070.getClass(), "playerRating", 0);
        setIntField(term148070, term148070.getClass(), "highestRating", 0);
        setIntField(term148070, term148070.getClass(), "battlePoint", 0);
        setIntField(term148070, term148070.getClass(), "bestBattlePoint", 0);
        setIntField(term148070, term148070.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148070, term148070.getClass(), "nameplateId", 0);
        setIntField(term148070, term148070.getClass(), "trophyId", 0);
        setIntField(term148070, term148070.getClass(), "cardId", 0);
        setIntField(term148070, term148070.getClass(), "characterId", 0);
        setIntField(term148070, term148070.getClass(), "tabSetting", 0);
        setIntField(term148070, term148070.getClass(), "tabSortSetting", 0);
        setIntField(term148070, term148070.getClass(), "cardCategorySetting", 0);
        setIntField(term148070, term148070.getClass(), "cardSortSetting", 0);
        setIntField(term148070, term148070.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148070, term148070.getClass(), "playedTutorialBit", 0);
        setIntField(term148070, term148070.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148070, term148070.getClass(), "sumTechHighScore", 0L);
        setLongField(term148070, term148070.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148070, term148070.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148070, term148070.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148070, term148070.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148070, term148070.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148070, term148070.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148070, term148070.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148070, term148070.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148070, term148070.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148070, term148070.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148070, term148070.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148070, term148070.getClass(), "eventWatchedDate", null);
        setField(term148070, term148070.getClass(), "cmEventWatchedDate", null);
        setField(term148070, term148070.getClass(), "firstGameId", null);
        setField(term148070, term148070.getClass(), "firstRomVersion", null);
        setField(term148070, term148070.getClass(), "firstDataVersion", null);
        setField(term148070, term148070.getClass(), "firstPlayDate", null);
        setField(term148070, term148070.getClass(), "lastGameId", null);
        setField(term148070, term148070.getClass(), "lastRomVersion", null);
        setField(term148070, term148070.getClass(), "lastDataVersion", null);
        setField(term148070, term148070.getClass(), "compatibleCmVersion", null);
        setField(term148070, term148070.getClass(), "lastPlayDate", null);
        setIntField(term148070, term148070.getClass(), "lastPlaceId", 0);
        setField(term148070, term148070.getClass(), "lastPlaceName", null);
        setIntField(term148070, term148070.getClass(), "lastRegionId", 0);
        setField(term148070, term148070.getClass(), "lastRegionName", null);
        setIntField(term148070, term148070.getClass(), "lastAllNetId", 0);
        setField(term148070, term148070.getClass(), "lastClientId", null);
        setIntField(term148070, term148070.getClass(), "lastUsedDeckId", 0);
        setIntField(term148070, term148070.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148070, term148070.getClass(), "lastEmoneyBrand", 0);
        term148114 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148114;
        callMethod(klass, "setReincarnationNum", argTypes, term148070, args);
    }

};


