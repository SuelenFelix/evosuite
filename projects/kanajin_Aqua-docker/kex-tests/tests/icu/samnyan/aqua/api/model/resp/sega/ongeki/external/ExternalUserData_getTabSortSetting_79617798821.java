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

public class ExternalUserData_getTabSortSetting_79617798821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104466;

    public ExternalUserData_getTabSortSetting_79617798821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104466 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term104466, term104466.getClass(), "accessCode", "FUVgRzJbRP");
        setField(term104466, term104466.getClass(), "userName", "QCjaZAAayP");
        setIntField(term104466, term104466.getClass(), "level", 1750934756);
        setIntField(term104466, term104466.getClass(), "reincarnationNum", 422394282);
        setLongField(term104466, term104466.getClass(), "exp", 1899971755457488246L);
        setLongField(term104466, term104466.getClass(), "point", 8851463727956587910L);
        setLongField(term104466, term104466.getClass(), "totalPoint", 8713780813371812262L);
        setIntField(term104466, term104466.getClass(), "playCount", -213529739);
        setIntField(term104466, term104466.getClass(), "jewelCount", 2086055917);
        setIntField(term104466, term104466.getClass(), "totalJewelCount", -528132980);
        setIntField(term104466, term104466.getClass(), "medalCount", 1963632434);
        setIntField(term104466, term104466.getClass(), "playerRating", -924051474);
        setIntField(term104466, term104466.getClass(), "highestRating", -1288438220);
        setIntField(term104466, term104466.getClass(), "battlePoint", -1313294629);
        setIntField(term104466, term104466.getClass(), "bestBattlePoint", -1777498660);
        setIntField(term104466, term104466.getClass(), "overDamageBattlePoint", 1332103525);
        setIntField(term104466, term104466.getClass(), "nameplateId", 106282103);
        setIntField(term104466, term104466.getClass(), "trophyId", -1365356851);
        setIntField(term104466, term104466.getClass(), "cardId", -1992119869);
        setIntField(term104466, term104466.getClass(), "characterId", -1630275947);
        setIntField(term104466, term104466.getClass(), "tabSetting", 795575377);
        setIntField(term104466, term104466.getClass(), "tabSortSetting", -550783964);
        setIntField(term104466, term104466.getClass(), "cardCategorySetting", 1010798612);
        setIntField(term104466, term104466.getClass(), "cardSortSetting", -2064161482);
        setIntField(term104466, term104466.getClass(), "rivalScoreCategorySetting", 1971642139);
        setIntField(term104466, term104466.getClass(), "playedTutorialBit", -1975635096);
        setIntField(term104466, term104466.getClass(), "firstTutorialCancelNum", 566794429);
        setLongField(term104466, term104466.getClass(), "sumTechHighScore", 3557191045587060984L);
        setLongField(term104466, term104466.getClass(), "sumTechBasicHighScore", 2887807802515197723L);
        setLongField(term104466, term104466.getClass(), "sumTechAdvancedHighScore", 4071480204991861453L);
        setLongField(term104466, term104466.getClass(), "sumTechExpertHighScore", -2685349916092598053L);
        setLongField(term104466, term104466.getClass(), "sumTechMasterHighScore", 491694438146039380L);
        setLongField(term104466, term104466.getClass(), "sumTechLunaticHighScore", -7601151382201720048L);
        setLongField(term104466, term104466.getClass(), "sumBattleHighScore", 6235700915808994828L);
        setLongField(term104466, term104466.getClass(), "sumBattleBasicHighScore", 729029652647225135L);
        setLongField(term104466, term104466.getClass(), "sumBattleAdvancedHighScore", 7709882480457682539L);
        setLongField(term104466, term104466.getClass(), "sumBattleExpertHighScore", 7440384647054614109L);
        setLongField(term104466, term104466.getClass(), "sumBattleMasterHighScore", 4473009422220945627L);
        setLongField(term104466, term104466.getClass(), "sumBattleLunaticHighScore", -6700686536507259379L);
        setField(term104466, term104466.getClass(), "eventWatchedDate", "tbGeEeVRff");
        setField(term104466, term104466.getClass(), "cmEventWatchedDate", "uLpjBCWOqK");
        setField(term104466, term104466.getClass(), "firstGameId", "usKPpLGtiw");
        setField(term104466, term104466.getClass(), "firstRomVersion", "JaujPfAyUY");
        setField(term104466, term104466.getClass(), "firstDataVersion", "YzJSRePcMh");
        setField(term104466, term104466.getClass(), "firstPlayDate", "DaTdneamUE");
        setField(term104466, term104466.getClass(), "lastGameId", "BkbgXOZbPN");
        setField(term104466, term104466.getClass(), "lastRomVersion", "DruRsKpLrG");
        setField(term104466, term104466.getClass(), "lastDataVersion", "cjILsvuKyp");
        setField(term104466, term104466.getClass(), "compatibleCmVersion", "btOJSkDGeO");
        setField(term104466, term104466.getClass(), "lastPlayDate", "IqvaAeFxrV");
        setIntField(term104466, term104466.getClass(), "lastPlaceId", 1103352739);
        setField(term104466, term104466.getClass(), "lastPlaceName", "xtGWGduIRw");
        setIntField(term104466, term104466.getClass(), "lastRegionId", -419432251);
        setField(term104466, term104466.getClass(), "lastRegionName", "sFIIQjnSEH");
        setIntField(term104466, term104466.getClass(), "lastAllNetId", 139946543);
        setField(term104466, term104466.getClass(), "lastClientId", "FEfRUAsuKB");
        setIntField(term104466, term104466.getClass(), "lastUsedDeckId", 1731503972);
        setIntField(term104466, term104466.getClass(), "lastPlayMusicLevel", -1101776708);
        setIntField(term104466, term104466.getClass(), "lastEmoneyBrand", 254815209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTabSortSetting", argTypes, term104466, args);
    }

};


