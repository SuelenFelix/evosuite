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

public class UserData_setCard_1724006749193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79963;

    public UserData_setCard_1724006749193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79963 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79963, term79963.getClass(), "id", 0L);
        setField(term79963, term79963.getClass(), "card", null);
        setField(term79963, term79963.getClass(), "userName", null);
        setIntField(term79963, term79963.getClass(), "level", 0);
        setIntField(term79963, term79963.getClass(), "reincarnationNum", 0);
        setLongField(term79963, term79963.getClass(), "exp", 0L);
        setLongField(term79963, term79963.getClass(), "point", 0L);
        setLongField(term79963, term79963.getClass(), "totalPoint", 0L);
        setIntField(term79963, term79963.getClass(), "playCount", 0);
        setIntField(term79963, term79963.getClass(), "jewelCount", 0);
        setIntField(term79963, term79963.getClass(), "totalJewelCount", 0);
        setIntField(term79963, term79963.getClass(), "medalCount", 0);
        setIntField(term79963, term79963.getClass(), "playerRating", 0);
        setIntField(term79963, term79963.getClass(), "highestRating", 0);
        setIntField(term79963, term79963.getClass(), "battlePoint", 0);
        setIntField(term79963, term79963.getClass(), "bestBattlePoint", 0);
        setIntField(term79963, term79963.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79963, term79963.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79963, term79963.getClass(), "nameplateId", 0);
        setIntField(term79963, term79963.getClass(), "trophyId", 0);
        setIntField(term79963, term79963.getClass(), "cardId", 0);
        setIntField(term79963, term79963.getClass(), "characterId", 0);
        setIntField(term79963, term79963.getClass(), "characterVoiceNo", 0);
        setIntField(term79963, term79963.getClass(), "tabSetting", 0);
        setIntField(term79963, term79963.getClass(), "tabSortSetting", 0);
        setIntField(term79963, term79963.getClass(), "cardCategorySetting", 0);
        setIntField(term79963, term79963.getClass(), "cardSortSetting", 0);
        setIntField(term79963, term79963.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79963, term79963.getClass(), "playedTutorialBit", 0);
        setIntField(term79963, term79963.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79963, term79963.getClass(), "sumTechHighScore", 0L);
        setLongField(term79963, term79963.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79963, term79963.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79963, term79963.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79963, term79963.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79963, term79963.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79963, term79963.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79963, term79963.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79963, term79963.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79963, term79963.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79963, term79963.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79963, term79963.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79963, term79963.getClass(), "eventWatchedDate", null);
        setField(term79963, term79963.getClass(), "cmEventWatchedDate", null);
        setField(term79963, term79963.getClass(), "firstGameId", null);
        setField(term79963, term79963.getClass(), "firstRomVersion", null);
        setField(term79963, term79963.getClass(), "firstDataVersion", null);
        setField(term79963, term79963.getClass(), "firstPlayDate", null);
        setField(term79963, term79963.getClass(), "lastGameId", null);
        setField(term79963, term79963.getClass(), "lastRomVersion", null);
        setField(term79963, term79963.getClass(), "lastDataVersion", null);
        setField(term79963, term79963.getClass(), "compatibleCmVersion", null);
        setField(term79963, term79963.getClass(), "lastPlayDate", null);
        setIntField(term79963, term79963.getClass(), "lastPlaceId", 0);
        setField(term79963, term79963.getClass(), "lastPlaceName", null);
        setIntField(term79963, term79963.getClass(), "lastRegionId", 0);
        setField(term79963, term79963.getClass(), "lastRegionName", null);
        setIntField(term79963, term79963.getClass(), "lastAllNetId", 0);
        setField(term79963, term79963.getClass(), "lastClientId", null);
        setIntField(term79963, term79963.getClass(), "lastUsedDeckId", 0);
        setIntField(term79963, term79963.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79963, term79963.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCard", argTypes, term79963, args);
    }

};


