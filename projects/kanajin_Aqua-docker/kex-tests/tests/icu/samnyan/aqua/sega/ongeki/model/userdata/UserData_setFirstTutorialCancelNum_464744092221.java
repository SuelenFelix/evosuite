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
import java.lang.Integer;

public class UserData_setFirstTutorialCancelNum_464744092221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81331;
     Object term81378;

    public UserData_setFirstTutorialCancelNum_464744092221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81331 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81331, term81331.getClass(), "id", 0L);
        setField(term81331, term81331.getClass(), "card", null);
        setField(term81331, term81331.getClass(), "userName", null);
        setIntField(term81331, term81331.getClass(), "level", 0);
        setIntField(term81331, term81331.getClass(), "reincarnationNum", 0);
        setLongField(term81331, term81331.getClass(), "exp", 0L);
        setLongField(term81331, term81331.getClass(), "point", 0L);
        setLongField(term81331, term81331.getClass(), "totalPoint", 0L);
        setIntField(term81331, term81331.getClass(), "playCount", 0);
        setIntField(term81331, term81331.getClass(), "jewelCount", 0);
        setIntField(term81331, term81331.getClass(), "totalJewelCount", 0);
        setIntField(term81331, term81331.getClass(), "medalCount", 0);
        setIntField(term81331, term81331.getClass(), "playerRating", 0);
        setIntField(term81331, term81331.getClass(), "highestRating", 0);
        setIntField(term81331, term81331.getClass(), "battlePoint", 0);
        setIntField(term81331, term81331.getClass(), "bestBattlePoint", 0);
        setIntField(term81331, term81331.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81331, term81331.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81331, term81331.getClass(), "nameplateId", 0);
        setIntField(term81331, term81331.getClass(), "trophyId", 0);
        setIntField(term81331, term81331.getClass(), "cardId", 0);
        setIntField(term81331, term81331.getClass(), "characterId", 0);
        setIntField(term81331, term81331.getClass(), "characterVoiceNo", 0);
        setIntField(term81331, term81331.getClass(), "tabSetting", 0);
        setIntField(term81331, term81331.getClass(), "tabSortSetting", 0);
        setIntField(term81331, term81331.getClass(), "cardCategorySetting", 0);
        setIntField(term81331, term81331.getClass(), "cardSortSetting", 0);
        setIntField(term81331, term81331.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81331, term81331.getClass(), "playedTutorialBit", 0);
        setIntField(term81331, term81331.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81331, term81331.getClass(), "sumTechHighScore", 0L);
        setLongField(term81331, term81331.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81331, term81331.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81331, term81331.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81331, term81331.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81331, term81331.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81331, term81331.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81331, term81331.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81331, term81331.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81331, term81331.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81331, term81331.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81331, term81331.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81331, term81331.getClass(), "eventWatchedDate", null);
        setField(term81331, term81331.getClass(), "cmEventWatchedDate", null);
        setField(term81331, term81331.getClass(), "firstGameId", null);
        setField(term81331, term81331.getClass(), "firstRomVersion", null);
        setField(term81331, term81331.getClass(), "firstDataVersion", null);
        setField(term81331, term81331.getClass(), "firstPlayDate", null);
        setField(term81331, term81331.getClass(), "lastGameId", null);
        setField(term81331, term81331.getClass(), "lastRomVersion", null);
        setField(term81331, term81331.getClass(), "lastDataVersion", null);
        setField(term81331, term81331.getClass(), "compatibleCmVersion", null);
        setField(term81331, term81331.getClass(), "lastPlayDate", null);
        setIntField(term81331, term81331.getClass(), "lastPlaceId", 0);
        setField(term81331, term81331.getClass(), "lastPlaceName", null);
        setIntField(term81331, term81331.getClass(), "lastRegionId", 0);
        setField(term81331, term81331.getClass(), "lastRegionName", null);
        setIntField(term81331, term81331.getClass(), "lastAllNetId", 0);
        setField(term81331, term81331.getClass(), "lastClientId", null);
        setIntField(term81331, term81331.getClass(), "lastUsedDeckId", 0);
        setIntField(term81331, term81331.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81331, term81331.getClass(), "lastEmoneyBrand", 0);
        term81378 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term81378;
        callMethod(klass, "setFirstTutorialCancelNum", argTypes, term81331, args);
    }

};


