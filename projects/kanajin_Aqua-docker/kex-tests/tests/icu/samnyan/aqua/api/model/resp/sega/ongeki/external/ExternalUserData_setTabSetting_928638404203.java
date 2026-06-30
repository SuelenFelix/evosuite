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

public class ExternalUserData_setTabSetting_928638404203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148852;
     Object term148896;

    public ExternalUserData_setTabSetting_928638404203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148852 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148852, term148852.getClass(), "accessCode", null);
        setField(term148852, term148852.getClass(), "userName", null);
        setIntField(term148852, term148852.getClass(), "level", 0);
        setIntField(term148852, term148852.getClass(), "reincarnationNum", 0);
        setLongField(term148852, term148852.getClass(), "exp", 0L);
        setLongField(term148852, term148852.getClass(), "point", 0L);
        setLongField(term148852, term148852.getClass(), "totalPoint", 0L);
        setIntField(term148852, term148852.getClass(), "playCount", 0);
        setIntField(term148852, term148852.getClass(), "jewelCount", 0);
        setIntField(term148852, term148852.getClass(), "totalJewelCount", 0);
        setIntField(term148852, term148852.getClass(), "medalCount", 0);
        setIntField(term148852, term148852.getClass(), "playerRating", 0);
        setIntField(term148852, term148852.getClass(), "highestRating", 0);
        setIntField(term148852, term148852.getClass(), "battlePoint", 0);
        setIntField(term148852, term148852.getClass(), "bestBattlePoint", 0);
        setIntField(term148852, term148852.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148852, term148852.getClass(), "nameplateId", 0);
        setIntField(term148852, term148852.getClass(), "trophyId", 0);
        setIntField(term148852, term148852.getClass(), "cardId", 0);
        setIntField(term148852, term148852.getClass(), "characterId", 0);
        setIntField(term148852, term148852.getClass(), "tabSetting", 0);
        setIntField(term148852, term148852.getClass(), "tabSortSetting", 0);
        setIntField(term148852, term148852.getClass(), "cardCategorySetting", 0);
        setIntField(term148852, term148852.getClass(), "cardSortSetting", 0);
        setIntField(term148852, term148852.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148852, term148852.getClass(), "playedTutorialBit", 0);
        setIntField(term148852, term148852.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148852, term148852.getClass(), "sumTechHighScore", 0L);
        setLongField(term148852, term148852.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148852, term148852.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148852, term148852.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148852, term148852.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148852, term148852.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148852, term148852.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148852, term148852.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148852, term148852.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148852, term148852.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148852, term148852.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148852, term148852.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148852, term148852.getClass(), "eventWatchedDate", null);
        setField(term148852, term148852.getClass(), "cmEventWatchedDate", null);
        setField(term148852, term148852.getClass(), "firstGameId", null);
        setField(term148852, term148852.getClass(), "firstRomVersion", null);
        setField(term148852, term148852.getClass(), "firstDataVersion", null);
        setField(term148852, term148852.getClass(), "firstPlayDate", null);
        setField(term148852, term148852.getClass(), "lastGameId", null);
        setField(term148852, term148852.getClass(), "lastRomVersion", null);
        setField(term148852, term148852.getClass(), "lastDataVersion", null);
        setField(term148852, term148852.getClass(), "compatibleCmVersion", null);
        setField(term148852, term148852.getClass(), "lastPlayDate", null);
        setIntField(term148852, term148852.getClass(), "lastPlaceId", 0);
        setField(term148852, term148852.getClass(), "lastPlaceName", null);
        setIntField(term148852, term148852.getClass(), "lastRegionId", 0);
        setField(term148852, term148852.getClass(), "lastRegionName", null);
        setIntField(term148852, term148852.getClass(), "lastAllNetId", 0);
        setField(term148852, term148852.getClass(), "lastClientId", null);
        setIntField(term148852, term148852.getClass(), "lastUsedDeckId", 0);
        setIntField(term148852, term148852.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148852, term148852.getClass(), "lastEmoneyBrand", 0);
        term148896 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148896;
        callMethod(klass, "setTabSetting", argTypes, term148852, args);
    }

};


