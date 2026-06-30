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

public class ExternalUserData_getCardCategorySetting_130674421322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104862;

    public ExternalUserData_getCardCategorySetting_130674421322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104862 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term104862, term104862.getClass(), "accessCode", "FhkpmQnwUC");
        setField(term104862, term104862.getClass(), "userName", "dDuKuhPbBw");
        setIntField(term104862, term104862.getClass(), "level", 936436638);
        setIntField(term104862, term104862.getClass(), "reincarnationNum", -1900716134);
        setLongField(term104862, term104862.getClass(), "exp", 6712378500780090116L);
        setLongField(term104862, term104862.getClass(), "point", -7631931869688460563L);
        setLongField(term104862, term104862.getClass(), "totalPoint", 4853024693378729552L);
        setIntField(term104862, term104862.getClass(), "playCount", -1145856499);
        setIntField(term104862, term104862.getClass(), "jewelCount", 869841693);
        setIntField(term104862, term104862.getClass(), "totalJewelCount", -1643218641);
        setIntField(term104862, term104862.getClass(), "medalCount", 23752784);
        setIntField(term104862, term104862.getClass(), "playerRating", -2117175249);
        setIntField(term104862, term104862.getClass(), "highestRating", -611759224);
        setIntField(term104862, term104862.getClass(), "battlePoint", 191855540);
        setIntField(term104862, term104862.getClass(), "bestBattlePoint", -812014967);
        setIntField(term104862, term104862.getClass(), "overDamageBattlePoint", -1166630546);
        setIntField(term104862, term104862.getClass(), "nameplateId", -391187273);
        setIntField(term104862, term104862.getClass(), "trophyId", -449124197);
        setIntField(term104862, term104862.getClass(), "cardId", 1959567185);
        setIntField(term104862, term104862.getClass(), "characterId", -958801237);
        setIntField(term104862, term104862.getClass(), "tabSetting", -16385615);
        setIntField(term104862, term104862.getClass(), "tabSortSetting", 2042834802);
        setIntField(term104862, term104862.getClass(), "cardCategorySetting", 1546690797);
        setIntField(term104862, term104862.getClass(), "cardSortSetting", -1989871996);
        setIntField(term104862, term104862.getClass(), "rivalScoreCategorySetting", -1891270840);
        setIntField(term104862, term104862.getClass(), "playedTutorialBit", 734153645);
        setIntField(term104862, term104862.getClass(), "firstTutorialCancelNum", -828144813);
        setLongField(term104862, term104862.getClass(), "sumTechHighScore", -6474049362506572286L);
        setLongField(term104862, term104862.getClass(), "sumTechBasicHighScore", -2088081429247726677L);
        setLongField(term104862, term104862.getClass(), "sumTechAdvancedHighScore", 5304684043785467921L);
        setLongField(term104862, term104862.getClass(), "sumTechExpertHighScore", -1990823654925056118L);
        setLongField(term104862, term104862.getClass(), "sumTechMasterHighScore", 7715295835447619393L);
        setLongField(term104862, term104862.getClass(), "sumTechLunaticHighScore", -4054765433548197329L);
        setLongField(term104862, term104862.getClass(), "sumBattleHighScore", -536182069079325955L);
        setLongField(term104862, term104862.getClass(), "sumBattleBasicHighScore", -8007150686430531542L);
        setLongField(term104862, term104862.getClass(), "sumBattleAdvancedHighScore", 9204718033380852255L);
        setLongField(term104862, term104862.getClass(), "sumBattleExpertHighScore", 3667236367126773538L);
        setLongField(term104862, term104862.getClass(), "sumBattleMasterHighScore", -3845936146638753974L);
        setLongField(term104862, term104862.getClass(), "sumBattleLunaticHighScore", -9033517055261545771L);
        setField(term104862, term104862.getClass(), "eventWatchedDate", "EDmBxLqpMt");
        setField(term104862, term104862.getClass(), "cmEventWatchedDate", "uQvBRdwOFM");
        setField(term104862, term104862.getClass(), "firstGameId", "yoBYaDsQoE");
        setField(term104862, term104862.getClass(), "firstRomVersion", "KsUUmluzsi");
        setField(term104862, term104862.getClass(), "firstDataVersion", "CWdYUcTZEH");
        setField(term104862, term104862.getClass(), "firstPlayDate", "nFFbzSuOFR");
        setField(term104862, term104862.getClass(), "lastGameId", "OOjipcHMcJ");
        setField(term104862, term104862.getClass(), "lastRomVersion", "PDMufDYuoK");
        setField(term104862, term104862.getClass(), "lastDataVersion", "hpVTpWrSUB");
        setField(term104862, term104862.getClass(), "compatibleCmVersion", "iQBljDNMnf");
        setField(term104862, term104862.getClass(), "lastPlayDate", "FZHLLlMvQk");
        setIntField(term104862, term104862.getClass(), "lastPlaceId", 1091310257);
        setField(term104862, term104862.getClass(), "lastPlaceName", "JUJCvrQBzT");
        setIntField(term104862, term104862.getClass(), "lastRegionId", -1197485135);
        setField(term104862, term104862.getClass(), "lastRegionName", "lZINKeQyFf");
        setIntField(term104862, term104862.getClass(), "lastAllNetId", 179779239);
        setField(term104862, term104862.getClass(), "lastClientId", "xYpgXjoror");
        setIntField(term104862, term104862.getClass(), "lastUsedDeckId", 1520232412);
        setIntField(term104862, term104862.getClass(), "lastPlayMusicLevel", 1066566576);
        setIntField(term104862, term104862.getClass(), "lastEmoneyBrand", -163112105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardCategorySetting", argTypes, term104862, args);
    }

};


