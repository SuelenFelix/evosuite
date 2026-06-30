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

public class ExternalUserData_setSumTechExpertHighScore_2115260646213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149312;
     Object term149356;

    public ExternalUserData_setSumTechExpertHighScore_2115260646213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149312 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149312, term149312.getClass(), "accessCode", null);
        setField(term149312, term149312.getClass(), "userName", null);
        setIntField(term149312, term149312.getClass(), "level", 0);
        setIntField(term149312, term149312.getClass(), "reincarnationNum", 0);
        setLongField(term149312, term149312.getClass(), "exp", 0L);
        setLongField(term149312, term149312.getClass(), "point", 0L);
        setLongField(term149312, term149312.getClass(), "totalPoint", 0L);
        setIntField(term149312, term149312.getClass(), "playCount", 0);
        setIntField(term149312, term149312.getClass(), "jewelCount", 0);
        setIntField(term149312, term149312.getClass(), "totalJewelCount", 0);
        setIntField(term149312, term149312.getClass(), "medalCount", 0);
        setIntField(term149312, term149312.getClass(), "playerRating", 0);
        setIntField(term149312, term149312.getClass(), "highestRating", 0);
        setIntField(term149312, term149312.getClass(), "battlePoint", 0);
        setIntField(term149312, term149312.getClass(), "bestBattlePoint", 0);
        setIntField(term149312, term149312.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149312, term149312.getClass(), "nameplateId", 0);
        setIntField(term149312, term149312.getClass(), "trophyId", 0);
        setIntField(term149312, term149312.getClass(), "cardId", 0);
        setIntField(term149312, term149312.getClass(), "characterId", 0);
        setIntField(term149312, term149312.getClass(), "tabSetting", 0);
        setIntField(term149312, term149312.getClass(), "tabSortSetting", 0);
        setIntField(term149312, term149312.getClass(), "cardCategorySetting", 0);
        setIntField(term149312, term149312.getClass(), "cardSortSetting", 0);
        setIntField(term149312, term149312.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149312, term149312.getClass(), "playedTutorialBit", 0);
        setIntField(term149312, term149312.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149312, term149312.getClass(), "sumTechHighScore", 0L);
        setLongField(term149312, term149312.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149312, term149312.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149312, term149312.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149312, term149312.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149312, term149312.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149312, term149312.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149312, term149312.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149312, term149312.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149312, term149312.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149312, term149312.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149312, term149312.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149312, term149312.getClass(), "eventWatchedDate", null);
        setField(term149312, term149312.getClass(), "cmEventWatchedDate", null);
        setField(term149312, term149312.getClass(), "firstGameId", null);
        setField(term149312, term149312.getClass(), "firstRomVersion", null);
        setField(term149312, term149312.getClass(), "firstDataVersion", null);
        setField(term149312, term149312.getClass(), "firstPlayDate", null);
        setField(term149312, term149312.getClass(), "lastGameId", null);
        setField(term149312, term149312.getClass(), "lastRomVersion", null);
        setField(term149312, term149312.getClass(), "lastDataVersion", null);
        setField(term149312, term149312.getClass(), "compatibleCmVersion", null);
        setField(term149312, term149312.getClass(), "lastPlayDate", null);
        setIntField(term149312, term149312.getClass(), "lastPlaceId", 0);
        setField(term149312, term149312.getClass(), "lastPlaceName", null);
        setIntField(term149312, term149312.getClass(), "lastRegionId", 0);
        setField(term149312, term149312.getClass(), "lastRegionName", null);
        setIntField(term149312, term149312.getClass(), "lastAllNetId", 0);
        setField(term149312, term149312.getClass(), "lastClientId", null);
        setIntField(term149312, term149312.getClass(), "lastUsedDeckId", 0);
        setIntField(term149312, term149312.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149312, term149312.getClass(), "lastEmoneyBrand", 0);
        term149356 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term149356;
        callMethod(klass, "setSumTechExpertHighScore", argTypes, term149312, args);
    }

};


