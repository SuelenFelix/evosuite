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

public class UserData_setCardSortSetting_1107698468218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81184;
     Object term81231;

    public UserData_setCardSortSetting_1107698468218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81184 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81184, term81184.getClass(), "id", 0L);
        setField(term81184, term81184.getClass(), "card", null);
        setField(term81184, term81184.getClass(), "userName", null);
        setIntField(term81184, term81184.getClass(), "level", 0);
        setIntField(term81184, term81184.getClass(), "reincarnationNum", 0);
        setLongField(term81184, term81184.getClass(), "exp", 0L);
        setLongField(term81184, term81184.getClass(), "point", 0L);
        setLongField(term81184, term81184.getClass(), "totalPoint", 0L);
        setIntField(term81184, term81184.getClass(), "playCount", 0);
        setIntField(term81184, term81184.getClass(), "jewelCount", 0);
        setIntField(term81184, term81184.getClass(), "totalJewelCount", 0);
        setIntField(term81184, term81184.getClass(), "medalCount", 0);
        setIntField(term81184, term81184.getClass(), "playerRating", 0);
        setIntField(term81184, term81184.getClass(), "highestRating", 0);
        setIntField(term81184, term81184.getClass(), "battlePoint", 0);
        setIntField(term81184, term81184.getClass(), "bestBattlePoint", 0);
        setIntField(term81184, term81184.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81184, term81184.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81184, term81184.getClass(), "nameplateId", 0);
        setIntField(term81184, term81184.getClass(), "trophyId", 0);
        setIntField(term81184, term81184.getClass(), "cardId", 0);
        setIntField(term81184, term81184.getClass(), "characterId", 0);
        setIntField(term81184, term81184.getClass(), "characterVoiceNo", 0);
        setIntField(term81184, term81184.getClass(), "tabSetting", 0);
        setIntField(term81184, term81184.getClass(), "tabSortSetting", 0);
        setIntField(term81184, term81184.getClass(), "cardCategorySetting", 0);
        setIntField(term81184, term81184.getClass(), "cardSortSetting", 0);
        setIntField(term81184, term81184.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81184, term81184.getClass(), "playedTutorialBit", 0);
        setIntField(term81184, term81184.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81184, term81184.getClass(), "sumTechHighScore", 0L);
        setLongField(term81184, term81184.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81184, term81184.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81184, term81184.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81184, term81184.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81184, term81184.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81184, term81184.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81184, term81184.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81184, term81184.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81184, term81184.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81184, term81184.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81184, term81184.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81184, term81184.getClass(), "eventWatchedDate", null);
        setField(term81184, term81184.getClass(), "cmEventWatchedDate", null);
        setField(term81184, term81184.getClass(), "firstGameId", null);
        setField(term81184, term81184.getClass(), "firstRomVersion", null);
        setField(term81184, term81184.getClass(), "firstDataVersion", null);
        setField(term81184, term81184.getClass(), "firstPlayDate", null);
        setField(term81184, term81184.getClass(), "lastGameId", null);
        setField(term81184, term81184.getClass(), "lastRomVersion", null);
        setField(term81184, term81184.getClass(), "lastDataVersion", null);
        setField(term81184, term81184.getClass(), "compatibleCmVersion", null);
        setField(term81184, term81184.getClass(), "lastPlayDate", null);
        setIntField(term81184, term81184.getClass(), "lastPlaceId", 0);
        setField(term81184, term81184.getClass(), "lastPlaceName", null);
        setIntField(term81184, term81184.getClass(), "lastRegionId", 0);
        setField(term81184, term81184.getClass(), "lastRegionName", null);
        setIntField(term81184, term81184.getClass(), "lastAllNetId", 0);
        setField(term81184, term81184.getClass(), "lastClientId", null);
        setIntField(term81184, term81184.getClass(), "lastUsedDeckId", 0);
        setIntField(term81184, term81184.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81184, term81184.getClass(), "lastEmoneyBrand", 0);
        term81231 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term81231;
        callMethod(klass, "setCardSortSetting", argTypes, term81184, args);
    }

};


