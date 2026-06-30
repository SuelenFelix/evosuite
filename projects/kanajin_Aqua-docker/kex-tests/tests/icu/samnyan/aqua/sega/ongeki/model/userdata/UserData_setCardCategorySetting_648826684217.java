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

public class UserData_setCardCategorySetting_648826684217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81135;
     Object term81182;

    public UserData_setCardCategorySetting_648826684217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81135 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81135, term81135.getClass(), "id", 0L);
        setField(term81135, term81135.getClass(), "card", null);
        setField(term81135, term81135.getClass(), "userName", null);
        setIntField(term81135, term81135.getClass(), "level", 0);
        setIntField(term81135, term81135.getClass(), "reincarnationNum", 0);
        setLongField(term81135, term81135.getClass(), "exp", 0L);
        setLongField(term81135, term81135.getClass(), "point", 0L);
        setLongField(term81135, term81135.getClass(), "totalPoint", 0L);
        setIntField(term81135, term81135.getClass(), "playCount", 0);
        setIntField(term81135, term81135.getClass(), "jewelCount", 0);
        setIntField(term81135, term81135.getClass(), "totalJewelCount", 0);
        setIntField(term81135, term81135.getClass(), "medalCount", 0);
        setIntField(term81135, term81135.getClass(), "playerRating", 0);
        setIntField(term81135, term81135.getClass(), "highestRating", 0);
        setIntField(term81135, term81135.getClass(), "battlePoint", 0);
        setIntField(term81135, term81135.getClass(), "bestBattlePoint", 0);
        setIntField(term81135, term81135.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81135, term81135.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81135, term81135.getClass(), "nameplateId", 0);
        setIntField(term81135, term81135.getClass(), "trophyId", 0);
        setIntField(term81135, term81135.getClass(), "cardId", 0);
        setIntField(term81135, term81135.getClass(), "characterId", 0);
        setIntField(term81135, term81135.getClass(), "characterVoiceNo", 0);
        setIntField(term81135, term81135.getClass(), "tabSetting", 0);
        setIntField(term81135, term81135.getClass(), "tabSortSetting", 0);
        setIntField(term81135, term81135.getClass(), "cardCategorySetting", 0);
        setIntField(term81135, term81135.getClass(), "cardSortSetting", 0);
        setIntField(term81135, term81135.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81135, term81135.getClass(), "playedTutorialBit", 0);
        setIntField(term81135, term81135.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81135, term81135.getClass(), "sumTechHighScore", 0L);
        setLongField(term81135, term81135.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81135, term81135.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81135, term81135.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81135, term81135.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81135, term81135.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81135, term81135.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81135, term81135.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81135, term81135.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81135, term81135.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81135, term81135.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81135, term81135.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81135, term81135.getClass(), "eventWatchedDate", null);
        setField(term81135, term81135.getClass(), "cmEventWatchedDate", null);
        setField(term81135, term81135.getClass(), "firstGameId", null);
        setField(term81135, term81135.getClass(), "firstRomVersion", null);
        setField(term81135, term81135.getClass(), "firstDataVersion", null);
        setField(term81135, term81135.getClass(), "firstPlayDate", null);
        setField(term81135, term81135.getClass(), "lastGameId", null);
        setField(term81135, term81135.getClass(), "lastRomVersion", null);
        setField(term81135, term81135.getClass(), "lastDataVersion", null);
        setField(term81135, term81135.getClass(), "compatibleCmVersion", null);
        setField(term81135, term81135.getClass(), "lastPlayDate", null);
        setIntField(term81135, term81135.getClass(), "lastPlaceId", 0);
        setField(term81135, term81135.getClass(), "lastPlaceName", null);
        setIntField(term81135, term81135.getClass(), "lastRegionId", 0);
        setField(term81135, term81135.getClass(), "lastRegionName", null);
        setIntField(term81135, term81135.getClass(), "lastAllNetId", 0);
        setField(term81135, term81135.getClass(), "lastClientId", null);
        setIntField(term81135, term81135.getClass(), "lastUsedDeckId", 0);
        setIntField(term81135, term81135.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81135, term81135.getClass(), "lastEmoneyBrand", 0);
        term81182 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term81182;
        callMethod(klass, "setCardCategorySetting", argTypes, term81135, args);
    }

};


