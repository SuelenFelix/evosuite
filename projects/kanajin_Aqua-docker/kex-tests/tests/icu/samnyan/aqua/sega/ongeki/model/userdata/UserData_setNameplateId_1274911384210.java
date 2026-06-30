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

public class UserData_setNameplateId_1274911384210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80792;
     Object term80839;

    public UserData_setNameplateId_1274911384210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80792 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80792, term80792.getClass(), "id", 0L);
        setField(term80792, term80792.getClass(), "card", null);
        setField(term80792, term80792.getClass(), "userName", null);
        setIntField(term80792, term80792.getClass(), "level", 0);
        setIntField(term80792, term80792.getClass(), "reincarnationNum", 0);
        setLongField(term80792, term80792.getClass(), "exp", 0L);
        setLongField(term80792, term80792.getClass(), "point", 0L);
        setLongField(term80792, term80792.getClass(), "totalPoint", 0L);
        setIntField(term80792, term80792.getClass(), "playCount", 0);
        setIntField(term80792, term80792.getClass(), "jewelCount", 0);
        setIntField(term80792, term80792.getClass(), "totalJewelCount", 0);
        setIntField(term80792, term80792.getClass(), "medalCount", 0);
        setIntField(term80792, term80792.getClass(), "playerRating", 0);
        setIntField(term80792, term80792.getClass(), "highestRating", 0);
        setIntField(term80792, term80792.getClass(), "battlePoint", 0);
        setIntField(term80792, term80792.getClass(), "bestBattlePoint", 0);
        setIntField(term80792, term80792.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80792, term80792.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80792, term80792.getClass(), "nameplateId", 0);
        setIntField(term80792, term80792.getClass(), "trophyId", 0);
        setIntField(term80792, term80792.getClass(), "cardId", 0);
        setIntField(term80792, term80792.getClass(), "characterId", 0);
        setIntField(term80792, term80792.getClass(), "characterVoiceNo", 0);
        setIntField(term80792, term80792.getClass(), "tabSetting", 0);
        setIntField(term80792, term80792.getClass(), "tabSortSetting", 0);
        setIntField(term80792, term80792.getClass(), "cardCategorySetting", 0);
        setIntField(term80792, term80792.getClass(), "cardSortSetting", 0);
        setIntField(term80792, term80792.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80792, term80792.getClass(), "playedTutorialBit", 0);
        setIntField(term80792, term80792.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80792, term80792.getClass(), "sumTechHighScore", 0L);
        setLongField(term80792, term80792.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80792, term80792.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80792, term80792.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80792, term80792.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80792, term80792.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80792, term80792.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80792, term80792.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80792, term80792.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80792, term80792.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80792, term80792.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80792, term80792.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80792, term80792.getClass(), "eventWatchedDate", null);
        setField(term80792, term80792.getClass(), "cmEventWatchedDate", null);
        setField(term80792, term80792.getClass(), "firstGameId", null);
        setField(term80792, term80792.getClass(), "firstRomVersion", null);
        setField(term80792, term80792.getClass(), "firstDataVersion", null);
        setField(term80792, term80792.getClass(), "firstPlayDate", null);
        setField(term80792, term80792.getClass(), "lastGameId", null);
        setField(term80792, term80792.getClass(), "lastRomVersion", null);
        setField(term80792, term80792.getClass(), "lastDataVersion", null);
        setField(term80792, term80792.getClass(), "compatibleCmVersion", null);
        setField(term80792, term80792.getClass(), "lastPlayDate", null);
        setIntField(term80792, term80792.getClass(), "lastPlaceId", 0);
        setField(term80792, term80792.getClass(), "lastPlaceName", null);
        setIntField(term80792, term80792.getClass(), "lastRegionId", 0);
        setField(term80792, term80792.getClass(), "lastRegionName", null);
        setIntField(term80792, term80792.getClass(), "lastAllNetId", 0);
        setField(term80792, term80792.getClass(), "lastClientId", null);
        setIntField(term80792, term80792.getClass(), "lastUsedDeckId", 0);
        setIntField(term80792, term80792.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80792, term80792.getClass(), "lastEmoneyBrand", 0);
        term80839 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80839;
        callMethod(klass, "setNameplateId", argTypes, term80792, args);
    }

};


