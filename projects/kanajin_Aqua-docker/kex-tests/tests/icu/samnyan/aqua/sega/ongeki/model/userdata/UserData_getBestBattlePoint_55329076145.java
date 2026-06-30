package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_getBestBattlePoint_55329076145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77705;

    public UserData_getBestBattlePoint_55329076145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77705 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77705, term77705.getClass(), "id", 0L);
        setField(term77705, term77705.getClass(), "card", null);
        setField(term77705, term77705.getClass(), "userName", null);
        setIntField(term77705, term77705.getClass(), "level", 0);
        setIntField(term77705, term77705.getClass(), "reincarnationNum", 0);
        setLongField(term77705, term77705.getClass(), "exp", 0L);
        setLongField(term77705, term77705.getClass(), "point", 0L);
        setLongField(term77705, term77705.getClass(), "totalPoint", 0L);
        setIntField(term77705, term77705.getClass(), "playCount", 0);
        setIntField(term77705, term77705.getClass(), "jewelCount", 0);
        setIntField(term77705, term77705.getClass(), "totalJewelCount", 0);
        setIntField(term77705, term77705.getClass(), "medalCount", 0);
        setIntField(term77705, term77705.getClass(), "playerRating", 0);
        setIntField(term77705, term77705.getClass(), "highestRating", 0);
        setIntField(term77705, term77705.getClass(), "battlePoint", 0);
        setIntField(term77705, term77705.getClass(), "bestBattlePoint", 0);
        setIntField(term77705, term77705.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77705, term77705.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77705, term77705.getClass(), "nameplateId", 0);
        setIntField(term77705, term77705.getClass(), "trophyId", 0);
        setIntField(term77705, term77705.getClass(), "cardId", 0);
        setIntField(term77705, term77705.getClass(), "characterId", 0);
        setIntField(term77705, term77705.getClass(), "characterVoiceNo", 0);
        setIntField(term77705, term77705.getClass(), "tabSetting", 0);
        setIntField(term77705, term77705.getClass(), "tabSortSetting", 0);
        setIntField(term77705, term77705.getClass(), "cardCategorySetting", 0);
        setIntField(term77705, term77705.getClass(), "cardSortSetting", 0);
        setIntField(term77705, term77705.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77705, term77705.getClass(), "playedTutorialBit", 0);
        setIntField(term77705, term77705.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77705, term77705.getClass(), "sumTechHighScore", 0L);
        setLongField(term77705, term77705.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77705, term77705.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77705, term77705.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77705, term77705.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77705, term77705.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77705, term77705.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77705, term77705.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77705, term77705.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77705, term77705.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77705, term77705.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77705, term77705.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77705, term77705.getClass(), "eventWatchedDate", null);
        setField(term77705, term77705.getClass(), "cmEventWatchedDate", null);
        setField(term77705, term77705.getClass(), "firstGameId", null);
        setField(term77705, term77705.getClass(), "firstRomVersion", null);
        setField(term77705, term77705.getClass(), "firstDataVersion", null);
        setField(term77705, term77705.getClass(), "firstPlayDate", null);
        setField(term77705, term77705.getClass(), "lastGameId", null);
        setField(term77705, term77705.getClass(), "lastRomVersion", null);
        setField(term77705, term77705.getClass(), "lastDataVersion", null);
        setField(term77705, term77705.getClass(), "compatibleCmVersion", null);
        setField(term77705, term77705.getClass(), "lastPlayDate", null);
        setIntField(term77705, term77705.getClass(), "lastPlaceId", 0);
        setField(term77705, term77705.getClass(), "lastPlaceName", null);
        setIntField(term77705, term77705.getClass(), "lastRegionId", 0);
        setField(term77705, term77705.getClass(), "lastRegionName", null);
        setIntField(term77705, term77705.getClass(), "lastAllNetId", 0);
        setField(term77705, term77705.getClass(), "lastClientId", null);
        setIntField(term77705, term77705.getClass(), "lastUsedDeckId", 0);
        setIntField(term77705, term77705.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77705, term77705.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestBattlePoint", argTypes, term77705, args);
    }

};


