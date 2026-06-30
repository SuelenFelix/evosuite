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

public class ExternalUserData_setTrophyId_1348102868200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148714;
     Object term148758;

    public ExternalUserData_setTrophyId_1348102868200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148714 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148714, term148714.getClass(), "accessCode", null);
        setField(term148714, term148714.getClass(), "userName", null);
        setIntField(term148714, term148714.getClass(), "level", 0);
        setIntField(term148714, term148714.getClass(), "reincarnationNum", 0);
        setLongField(term148714, term148714.getClass(), "exp", 0L);
        setLongField(term148714, term148714.getClass(), "point", 0L);
        setLongField(term148714, term148714.getClass(), "totalPoint", 0L);
        setIntField(term148714, term148714.getClass(), "playCount", 0);
        setIntField(term148714, term148714.getClass(), "jewelCount", 0);
        setIntField(term148714, term148714.getClass(), "totalJewelCount", 0);
        setIntField(term148714, term148714.getClass(), "medalCount", 0);
        setIntField(term148714, term148714.getClass(), "playerRating", 0);
        setIntField(term148714, term148714.getClass(), "highestRating", 0);
        setIntField(term148714, term148714.getClass(), "battlePoint", 0);
        setIntField(term148714, term148714.getClass(), "bestBattlePoint", 0);
        setIntField(term148714, term148714.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148714, term148714.getClass(), "nameplateId", 0);
        setIntField(term148714, term148714.getClass(), "trophyId", 0);
        setIntField(term148714, term148714.getClass(), "cardId", 0);
        setIntField(term148714, term148714.getClass(), "characterId", 0);
        setIntField(term148714, term148714.getClass(), "tabSetting", 0);
        setIntField(term148714, term148714.getClass(), "tabSortSetting", 0);
        setIntField(term148714, term148714.getClass(), "cardCategorySetting", 0);
        setIntField(term148714, term148714.getClass(), "cardSortSetting", 0);
        setIntField(term148714, term148714.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148714, term148714.getClass(), "playedTutorialBit", 0);
        setIntField(term148714, term148714.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148714, term148714.getClass(), "sumTechHighScore", 0L);
        setLongField(term148714, term148714.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148714, term148714.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148714, term148714.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148714, term148714.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148714, term148714.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148714, term148714.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148714, term148714.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148714, term148714.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148714, term148714.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148714, term148714.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148714, term148714.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148714, term148714.getClass(), "eventWatchedDate", null);
        setField(term148714, term148714.getClass(), "cmEventWatchedDate", null);
        setField(term148714, term148714.getClass(), "firstGameId", null);
        setField(term148714, term148714.getClass(), "firstRomVersion", null);
        setField(term148714, term148714.getClass(), "firstDataVersion", null);
        setField(term148714, term148714.getClass(), "firstPlayDate", null);
        setField(term148714, term148714.getClass(), "lastGameId", null);
        setField(term148714, term148714.getClass(), "lastRomVersion", null);
        setField(term148714, term148714.getClass(), "lastDataVersion", null);
        setField(term148714, term148714.getClass(), "compatibleCmVersion", null);
        setField(term148714, term148714.getClass(), "lastPlayDate", null);
        setIntField(term148714, term148714.getClass(), "lastPlaceId", 0);
        setField(term148714, term148714.getClass(), "lastPlaceName", null);
        setIntField(term148714, term148714.getClass(), "lastRegionId", 0);
        setField(term148714, term148714.getClass(), "lastRegionName", null);
        setIntField(term148714, term148714.getClass(), "lastAllNetId", 0);
        setField(term148714, term148714.getClass(), "lastClientId", null);
        setIntField(term148714, term148714.getClass(), "lastUsedDeckId", 0);
        setIntField(term148714, term148714.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148714, term148714.getClass(), "lastEmoneyBrand", 0);
        term148758 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148758;
        callMethod(klass, "setTrophyId", argTypes, term148714, args);
    }

};


