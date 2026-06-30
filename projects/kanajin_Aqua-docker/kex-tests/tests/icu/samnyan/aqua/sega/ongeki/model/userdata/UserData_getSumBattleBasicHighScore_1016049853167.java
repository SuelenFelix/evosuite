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

public class UserData_getSumBattleBasicHighScore_1016049853167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78739;

    public UserData_getSumBattleBasicHighScore_1016049853167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78739 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78739, term78739.getClass(), "id", 0L);
        setField(term78739, term78739.getClass(), "card", null);
        setField(term78739, term78739.getClass(), "userName", null);
        setIntField(term78739, term78739.getClass(), "level", 0);
        setIntField(term78739, term78739.getClass(), "reincarnationNum", 0);
        setLongField(term78739, term78739.getClass(), "exp", 0L);
        setLongField(term78739, term78739.getClass(), "point", 0L);
        setLongField(term78739, term78739.getClass(), "totalPoint", 0L);
        setIntField(term78739, term78739.getClass(), "playCount", 0);
        setIntField(term78739, term78739.getClass(), "jewelCount", 0);
        setIntField(term78739, term78739.getClass(), "totalJewelCount", 0);
        setIntField(term78739, term78739.getClass(), "medalCount", 0);
        setIntField(term78739, term78739.getClass(), "playerRating", 0);
        setIntField(term78739, term78739.getClass(), "highestRating", 0);
        setIntField(term78739, term78739.getClass(), "battlePoint", 0);
        setIntField(term78739, term78739.getClass(), "bestBattlePoint", 0);
        setIntField(term78739, term78739.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78739, term78739.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78739, term78739.getClass(), "nameplateId", 0);
        setIntField(term78739, term78739.getClass(), "trophyId", 0);
        setIntField(term78739, term78739.getClass(), "cardId", 0);
        setIntField(term78739, term78739.getClass(), "characterId", 0);
        setIntField(term78739, term78739.getClass(), "characterVoiceNo", 0);
        setIntField(term78739, term78739.getClass(), "tabSetting", 0);
        setIntField(term78739, term78739.getClass(), "tabSortSetting", 0);
        setIntField(term78739, term78739.getClass(), "cardCategorySetting", 0);
        setIntField(term78739, term78739.getClass(), "cardSortSetting", 0);
        setIntField(term78739, term78739.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78739, term78739.getClass(), "playedTutorialBit", 0);
        setIntField(term78739, term78739.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78739, term78739.getClass(), "sumTechHighScore", 0L);
        setLongField(term78739, term78739.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78739, term78739.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78739, term78739.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78739, term78739.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78739, term78739.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78739, term78739.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78739, term78739.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78739, term78739.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78739, term78739.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78739, term78739.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78739, term78739.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78739, term78739.getClass(), "eventWatchedDate", null);
        setField(term78739, term78739.getClass(), "cmEventWatchedDate", null);
        setField(term78739, term78739.getClass(), "firstGameId", null);
        setField(term78739, term78739.getClass(), "firstRomVersion", null);
        setField(term78739, term78739.getClass(), "firstDataVersion", null);
        setField(term78739, term78739.getClass(), "firstPlayDate", null);
        setField(term78739, term78739.getClass(), "lastGameId", null);
        setField(term78739, term78739.getClass(), "lastRomVersion", null);
        setField(term78739, term78739.getClass(), "lastDataVersion", null);
        setField(term78739, term78739.getClass(), "compatibleCmVersion", null);
        setField(term78739, term78739.getClass(), "lastPlayDate", null);
        setIntField(term78739, term78739.getClass(), "lastPlaceId", 0);
        setField(term78739, term78739.getClass(), "lastPlaceName", null);
        setIntField(term78739, term78739.getClass(), "lastRegionId", 0);
        setField(term78739, term78739.getClass(), "lastRegionName", null);
        setIntField(term78739, term78739.getClass(), "lastAllNetId", 0);
        setField(term78739, term78739.getClass(), "lastClientId", null);
        setIntField(term78739, term78739.getClass(), "lastUsedDeckId", 0);
        setIntField(term78739, term78739.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78739, term78739.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleBasicHighScore", argTypes, term78739, args);
    }

};


