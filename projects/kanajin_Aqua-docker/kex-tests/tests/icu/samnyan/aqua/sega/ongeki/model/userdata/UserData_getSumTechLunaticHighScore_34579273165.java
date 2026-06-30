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

public class UserData_getSumTechLunaticHighScore_34579273165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78645;

    public UserData_getSumTechLunaticHighScore_34579273165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78645 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78645, term78645.getClass(), "id", 0L);
        setField(term78645, term78645.getClass(), "card", null);
        setField(term78645, term78645.getClass(), "userName", null);
        setIntField(term78645, term78645.getClass(), "level", 0);
        setIntField(term78645, term78645.getClass(), "reincarnationNum", 0);
        setLongField(term78645, term78645.getClass(), "exp", 0L);
        setLongField(term78645, term78645.getClass(), "point", 0L);
        setLongField(term78645, term78645.getClass(), "totalPoint", 0L);
        setIntField(term78645, term78645.getClass(), "playCount", 0);
        setIntField(term78645, term78645.getClass(), "jewelCount", 0);
        setIntField(term78645, term78645.getClass(), "totalJewelCount", 0);
        setIntField(term78645, term78645.getClass(), "medalCount", 0);
        setIntField(term78645, term78645.getClass(), "playerRating", 0);
        setIntField(term78645, term78645.getClass(), "highestRating", 0);
        setIntField(term78645, term78645.getClass(), "battlePoint", 0);
        setIntField(term78645, term78645.getClass(), "bestBattlePoint", 0);
        setIntField(term78645, term78645.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78645, term78645.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78645, term78645.getClass(), "nameplateId", 0);
        setIntField(term78645, term78645.getClass(), "trophyId", 0);
        setIntField(term78645, term78645.getClass(), "cardId", 0);
        setIntField(term78645, term78645.getClass(), "characterId", 0);
        setIntField(term78645, term78645.getClass(), "characterVoiceNo", 0);
        setIntField(term78645, term78645.getClass(), "tabSetting", 0);
        setIntField(term78645, term78645.getClass(), "tabSortSetting", 0);
        setIntField(term78645, term78645.getClass(), "cardCategorySetting", 0);
        setIntField(term78645, term78645.getClass(), "cardSortSetting", 0);
        setIntField(term78645, term78645.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78645, term78645.getClass(), "playedTutorialBit", 0);
        setIntField(term78645, term78645.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78645, term78645.getClass(), "sumTechHighScore", 0L);
        setLongField(term78645, term78645.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78645, term78645.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78645, term78645.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78645, term78645.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78645, term78645.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78645, term78645.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78645, term78645.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78645, term78645.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78645, term78645.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78645, term78645.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78645, term78645.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78645, term78645.getClass(), "eventWatchedDate", null);
        setField(term78645, term78645.getClass(), "cmEventWatchedDate", null);
        setField(term78645, term78645.getClass(), "firstGameId", null);
        setField(term78645, term78645.getClass(), "firstRomVersion", null);
        setField(term78645, term78645.getClass(), "firstDataVersion", null);
        setField(term78645, term78645.getClass(), "firstPlayDate", null);
        setField(term78645, term78645.getClass(), "lastGameId", null);
        setField(term78645, term78645.getClass(), "lastRomVersion", null);
        setField(term78645, term78645.getClass(), "lastDataVersion", null);
        setField(term78645, term78645.getClass(), "compatibleCmVersion", null);
        setField(term78645, term78645.getClass(), "lastPlayDate", null);
        setIntField(term78645, term78645.getClass(), "lastPlaceId", 0);
        setField(term78645, term78645.getClass(), "lastPlaceName", null);
        setIntField(term78645, term78645.getClass(), "lastRegionId", 0);
        setField(term78645, term78645.getClass(), "lastRegionName", null);
        setIntField(term78645, term78645.getClass(), "lastAllNetId", 0);
        setField(term78645, term78645.getClass(), "lastClientId", null);
        setIntField(term78645, term78645.getClass(), "lastUsedDeckId", 0);
        setIntField(term78645, term78645.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78645, term78645.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechLunaticHighScore", argTypes, term78645, args);
    }

};


