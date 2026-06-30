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

public class UserData_setEventWatchedDate_1135674115234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81968;

    public UserData_setEventWatchedDate_1135674115234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81968 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81968, term81968.getClass(), "id", 0L);
        setField(term81968, term81968.getClass(), "card", null);
        setField(term81968, term81968.getClass(), "userName", null);
        setIntField(term81968, term81968.getClass(), "level", 0);
        setIntField(term81968, term81968.getClass(), "reincarnationNum", 0);
        setLongField(term81968, term81968.getClass(), "exp", 0L);
        setLongField(term81968, term81968.getClass(), "point", 0L);
        setLongField(term81968, term81968.getClass(), "totalPoint", 0L);
        setIntField(term81968, term81968.getClass(), "playCount", 0);
        setIntField(term81968, term81968.getClass(), "jewelCount", 0);
        setIntField(term81968, term81968.getClass(), "totalJewelCount", 0);
        setIntField(term81968, term81968.getClass(), "medalCount", 0);
        setIntField(term81968, term81968.getClass(), "playerRating", 0);
        setIntField(term81968, term81968.getClass(), "highestRating", 0);
        setIntField(term81968, term81968.getClass(), "battlePoint", 0);
        setIntField(term81968, term81968.getClass(), "bestBattlePoint", 0);
        setIntField(term81968, term81968.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81968, term81968.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81968, term81968.getClass(), "nameplateId", 0);
        setIntField(term81968, term81968.getClass(), "trophyId", 0);
        setIntField(term81968, term81968.getClass(), "cardId", 0);
        setIntField(term81968, term81968.getClass(), "characterId", 0);
        setIntField(term81968, term81968.getClass(), "characterVoiceNo", 0);
        setIntField(term81968, term81968.getClass(), "tabSetting", 0);
        setIntField(term81968, term81968.getClass(), "tabSortSetting", 0);
        setIntField(term81968, term81968.getClass(), "cardCategorySetting", 0);
        setIntField(term81968, term81968.getClass(), "cardSortSetting", 0);
        setIntField(term81968, term81968.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81968, term81968.getClass(), "playedTutorialBit", 0);
        setIntField(term81968, term81968.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81968, term81968.getClass(), "sumTechHighScore", 0L);
        setLongField(term81968, term81968.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81968, term81968.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81968, term81968.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81968, term81968.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81968, term81968.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81968, term81968.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81968, term81968.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81968, term81968.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81968, term81968.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81968, term81968.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81968, term81968.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81968, term81968.getClass(), "eventWatchedDate", null);
        setField(term81968, term81968.getClass(), "cmEventWatchedDate", null);
        setField(term81968, term81968.getClass(), "firstGameId", null);
        setField(term81968, term81968.getClass(), "firstRomVersion", null);
        setField(term81968, term81968.getClass(), "firstDataVersion", null);
        setField(term81968, term81968.getClass(), "firstPlayDate", null);
        setField(term81968, term81968.getClass(), "lastGameId", null);
        setField(term81968, term81968.getClass(), "lastRomVersion", null);
        setField(term81968, term81968.getClass(), "lastDataVersion", null);
        setField(term81968, term81968.getClass(), "compatibleCmVersion", null);
        setField(term81968, term81968.getClass(), "lastPlayDate", null);
        setIntField(term81968, term81968.getClass(), "lastPlaceId", 0);
        setField(term81968, term81968.getClass(), "lastPlaceName", null);
        setIntField(term81968, term81968.getClass(), "lastRegionId", 0);
        setField(term81968, term81968.getClass(), "lastRegionName", null);
        setIntField(term81968, term81968.getClass(), "lastAllNetId", 0);
        setField(term81968, term81968.getClass(), "lastClientId", null);
        setIntField(term81968, term81968.getClass(), "lastUsedDeckId", 0);
        setIntField(term81968, term81968.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81968, term81968.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEventWatchedDate", argTypes, term81968, args);
    }

};


