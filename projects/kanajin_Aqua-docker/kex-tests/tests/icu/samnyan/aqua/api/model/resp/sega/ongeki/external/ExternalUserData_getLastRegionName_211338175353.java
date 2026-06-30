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

public class ExternalUserData_getLastRegionName_211338175353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117138;

    public ExternalUserData_getLastRegionName_211338175353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117138 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term117138, term117138.getClass(), "accessCode", "SbEnzAKxTm");
        setField(term117138, term117138.getClass(), "userName", "SONjsMGvSo");
        setIntField(term117138, term117138.getClass(), "level", -816133316);
        setIntField(term117138, term117138.getClass(), "reincarnationNum", -1135502676);
        setLongField(term117138, term117138.getClass(), "exp", 3854446282437601289L);
        setLongField(term117138, term117138.getClass(), "point", 8565087322521317165L);
        setLongField(term117138, term117138.getClass(), "totalPoint", -3314866861999065002L);
        setIntField(term117138, term117138.getClass(), "playCount", 1978089639);
        setIntField(term117138, term117138.getClass(), "jewelCount", 326965902);
        setIntField(term117138, term117138.getClass(), "totalJewelCount", -2120243804);
        setIntField(term117138, term117138.getClass(), "medalCount", 818002733);
        setIntField(term117138, term117138.getClass(), "playerRating", -155705355);
        setIntField(term117138, term117138.getClass(), "highestRating", -1241738972);
        setIntField(term117138, term117138.getClass(), "battlePoint", -2037736756);
        setIntField(term117138, term117138.getClass(), "bestBattlePoint", -1266992174);
        setIntField(term117138, term117138.getClass(), "overDamageBattlePoint", 617021670);
        setIntField(term117138, term117138.getClass(), "nameplateId", -211579308);
        setIntField(term117138, term117138.getClass(), "trophyId", 387704742);
        setIntField(term117138, term117138.getClass(), "cardId", -1824690354);
        setIntField(term117138, term117138.getClass(), "characterId", -1408241430);
        setIntField(term117138, term117138.getClass(), "tabSetting", -1903589360);
        setIntField(term117138, term117138.getClass(), "tabSortSetting", 1650001261);
        setIntField(term117138, term117138.getClass(), "cardCategorySetting", -1953324315);
        setIntField(term117138, term117138.getClass(), "cardSortSetting", -341352461);
        setIntField(term117138, term117138.getClass(), "rivalScoreCategorySetting", -66563702);
        setIntField(term117138, term117138.getClass(), "playedTutorialBit", -1267154528);
        setIntField(term117138, term117138.getClass(), "firstTutorialCancelNum", -1244008419);
        setLongField(term117138, term117138.getClass(), "sumTechHighScore", 1846497971426121509L);
        setLongField(term117138, term117138.getClass(), "sumTechBasicHighScore", 4505057184263458227L);
        setLongField(term117138, term117138.getClass(), "sumTechAdvancedHighScore", -8568433449411339885L);
        setLongField(term117138, term117138.getClass(), "sumTechExpertHighScore", -6804203069033733085L);
        setLongField(term117138, term117138.getClass(), "sumTechMasterHighScore", 5079513179886147872L);
        setLongField(term117138, term117138.getClass(), "sumTechLunaticHighScore", -5847331116152904564L);
        setLongField(term117138, term117138.getClass(), "sumBattleHighScore", 635953914377265513L);
        setLongField(term117138, term117138.getClass(), "sumBattleBasicHighScore", -8898900260136590113L);
        setLongField(term117138, term117138.getClass(), "sumBattleAdvancedHighScore", 9120889159648845245L);
        setLongField(term117138, term117138.getClass(), "sumBattleExpertHighScore", 7231121302151038587L);
        setLongField(term117138, term117138.getClass(), "sumBattleMasterHighScore", -5049156697737365468L);
        setLongField(term117138, term117138.getClass(), "sumBattleLunaticHighScore", 5220991136779392723L);
        setField(term117138, term117138.getClass(), "eventWatchedDate", "EnMLGHLwuX");
        setField(term117138, term117138.getClass(), "cmEventWatchedDate", "SFPrRqVEYV");
        setField(term117138, term117138.getClass(), "firstGameId", "oXBsUtWaBr");
        setField(term117138, term117138.getClass(), "firstRomVersion", "WwxFSZzErk");
        setField(term117138, term117138.getClass(), "firstDataVersion", "kvbycvBtsE");
        setField(term117138, term117138.getClass(), "firstPlayDate", "TKmmbUuJiS");
        setField(term117138, term117138.getClass(), "lastGameId", "RfBXfEtuDg");
        setField(term117138, term117138.getClass(), "lastRomVersion", "zoqzGOxBac");
        setField(term117138, term117138.getClass(), "lastDataVersion", "FkBwcArxXF");
        setField(term117138, term117138.getClass(), "compatibleCmVersion", "WQqJkQNpny");
        setField(term117138, term117138.getClass(), "lastPlayDate", "ROIsepQHAA");
        setIntField(term117138, term117138.getClass(), "lastPlaceId", -1858067948);
        setField(term117138, term117138.getClass(), "lastPlaceName", "kkYDHznTak");
        setIntField(term117138, term117138.getClass(), "lastRegionId", -1158404598);
        setField(term117138, term117138.getClass(), "lastRegionName", "jyEoZRPUuE");
        setIntField(term117138, term117138.getClass(), "lastAllNetId", 1785352781);
        setField(term117138, term117138.getClass(), "lastClientId", "vhlWqnjZqT");
        setIntField(term117138, term117138.getClass(), "lastUsedDeckId", 934278582);
        setIntField(term117138, term117138.getClass(), "lastPlayMusicLevel", 735930212);
        setIntField(term117138, term117138.getClass(), "lastEmoneyBrand", -309785343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionName", argTypes, term117138, args);
    }

};


