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

public class ExternalUserData_getLastClientId_127102633655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117930;

    public ExternalUserData_getLastClientId_127102633655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117930 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term117930, term117930.getClass(), "accessCode", "aumLrHdQcU");
        setField(term117930, term117930.getClass(), "userName", "AtmgJeEIVk");
        setIntField(term117930, term117930.getClass(), "level", 359580486);
        setIntField(term117930, term117930.getClass(), "reincarnationNum", 1803116039);
        setLongField(term117930, term117930.getClass(), "exp", -3183525352022378229L);
        setLongField(term117930, term117930.getClass(), "point", -2112525754530386827L);
        setLongField(term117930, term117930.getClass(), "totalPoint", -7558640179934958704L);
        setIntField(term117930, term117930.getClass(), "playCount", 1612717765);
        setIntField(term117930, term117930.getClass(), "jewelCount", 1100433023);
        setIntField(term117930, term117930.getClass(), "totalJewelCount", 1090416692);
        setIntField(term117930, term117930.getClass(), "medalCount", -1611542137);
        setIntField(term117930, term117930.getClass(), "playerRating", -579248439);
        setIntField(term117930, term117930.getClass(), "highestRating", -1120057208);
        setIntField(term117930, term117930.getClass(), "battlePoint", 1927511411);
        setIntField(term117930, term117930.getClass(), "bestBattlePoint", 1836452129);
        setIntField(term117930, term117930.getClass(), "overDamageBattlePoint", 1288232190);
        setIntField(term117930, term117930.getClass(), "nameplateId", -876186818);
        setIntField(term117930, term117930.getClass(), "trophyId", -1589490657);
        setIntField(term117930, term117930.getClass(), "cardId", 906901850);
        setIntField(term117930, term117930.getClass(), "characterId", -1407777270);
        setIntField(term117930, term117930.getClass(), "tabSetting", 693176963);
        setIntField(term117930, term117930.getClass(), "tabSortSetting", 121332879);
        setIntField(term117930, term117930.getClass(), "cardCategorySetting", -244683552);
        setIntField(term117930, term117930.getClass(), "cardSortSetting", 838383816);
        setIntField(term117930, term117930.getClass(), "rivalScoreCategorySetting", 1776791756);
        setIntField(term117930, term117930.getClass(), "playedTutorialBit", -2024258083);
        setIntField(term117930, term117930.getClass(), "firstTutorialCancelNum", -1655212102);
        setLongField(term117930, term117930.getClass(), "sumTechHighScore", 7534275919759555162L);
        setLongField(term117930, term117930.getClass(), "sumTechBasicHighScore", -6297522184197592868L);
        setLongField(term117930, term117930.getClass(), "sumTechAdvancedHighScore", 8332584667883410658L);
        setLongField(term117930, term117930.getClass(), "sumTechExpertHighScore", -7684351169632643854L);
        setLongField(term117930, term117930.getClass(), "sumTechMasterHighScore", -3754325764090193679L);
        setLongField(term117930, term117930.getClass(), "sumTechLunaticHighScore", -2836847517663893738L);
        setLongField(term117930, term117930.getClass(), "sumBattleHighScore", -9144061403350933482L);
        setLongField(term117930, term117930.getClass(), "sumBattleBasicHighScore", -2061418607713782861L);
        setLongField(term117930, term117930.getClass(), "sumBattleAdvancedHighScore", 6663959595334072081L);
        setLongField(term117930, term117930.getClass(), "sumBattleExpertHighScore", 561545793548791935L);
        setLongField(term117930, term117930.getClass(), "sumBattleMasterHighScore", 2339724581479774358L);
        setLongField(term117930, term117930.getClass(), "sumBattleLunaticHighScore", 2035340628592826076L);
        setField(term117930, term117930.getClass(), "eventWatchedDate", "NmALCMwbdV");
        setField(term117930, term117930.getClass(), "cmEventWatchedDate", "GPKnMfrdoi");
        setField(term117930, term117930.getClass(), "firstGameId", "tRqGmjfkhY");
        setField(term117930, term117930.getClass(), "firstRomVersion", "CNylzkbkqX");
        setField(term117930, term117930.getClass(), "firstDataVersion", "MZOvhvkbNL");
        setField(term117930, term117930.getClass(), "firstPlayDate", "QpTiKNQuKE");
        setField(term117930, term117930.getClass(), "lastGameId", "PiqFzmVzrH");
        setField(term117930, term117930.getClass(), "lastRomVersion", "xGooBAPjZs");
        setField(term117930, term117930.getClass(), "lastDataVersion", "iAEyqLNmqO");
        setField(term117930, term117930.getClass(), "compatibleCmVersion", "ibnxqMQtwd");
        setField(term117930, term117930.getClass(), "lastPlayDate", "pUpVBWjpJC");
        setIntField(term117930, term117930.getClass(), "lastPlaceId", -1916040337);
        setField(term117930, term117930.getClass(), "lastPlaceName", "RZkxUvEJPU");
        setIntField(term117930, term117930.getClass(), "lastRegionId", 1853435776);
        setField(term117930, term117930.getClass(), "lastRegionName", "XjjToJVNct");
        setIntField(term117930, term117930.getClass(), "lastAllNetId", -1669912156);
        setField(term117930, term117930.getClass(), "lastClientId", "ePuvOLHPAK");
        setIntField(term117930, term117930.getClass(), "lastUsedDeckId", 347302337);
        setIntField(term117930, term117930.getClass(), "lastPlayMusicLevel", 663666418);
        setIntField(term117930, term117930.getClass(), "lastEmoneyBrand", -1760300922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastClientId", argTypes, term117930, args);
    }

};


