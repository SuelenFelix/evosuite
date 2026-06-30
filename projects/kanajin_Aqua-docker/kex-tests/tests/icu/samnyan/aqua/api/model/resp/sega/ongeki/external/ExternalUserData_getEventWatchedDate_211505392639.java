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

public class ExternalUserData_getEventWatchedDate_211505392639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111594;

    public ExternalUserData_getEventWatchedDate_211505392639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111594 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term111594, term111594.getClass(), "accessCode", "hPRBDJXtIm");
        setField(term111594, term111594.getClass(), "userName", "lFpBaNXOGw");
        setIntField(term111594, term111594.getClass(), "level", -1053698200);
        setIntField(term111594, term111594.getClass(), "reincarnationNum", 1406777788);
        setLongField(term111594, term111594.getClass(), "exp", 5606820790473917567L);
        setLongField(term111594, term111594.getClass(), "point", 2222570641313690254L);
        setLongField(term111594, term111594.getClass(), "totalPoint", -9086054091297879205L);
        setIntField(term111594, term111594.getClass(), "playCount", 1022446985);
        setIntField(term111594, term111594.getClass(), "jewelCount", 104244377);
        setIntField(term111594, term111594.getClass(), "totalJewelCount", 1903208187);
        setIntField(term111594, term111594.getClass(), "medalCount", 2107367190);
        setIntField(term111594, term111594.getClass(), "playerRating", -2111064731);
        setIntField(term111594, term111594.getClass(), "highestRating", -157506467);
        setIntField(term111594, term111594.getClass(), "battlePoint", -972362325);
        setIntField(term111594, term111594.getClass(), "bestBattlePoint", 1699217154);
        setIntField(term111594, term111594.getClass(), "overDamageBattlePoint", -262688841);
        setIntField(term111594, term111594.getClass(), "nameplateId", -1931293639);
        setIntField(term111594, term111594.getClass(), "trophyId", 1960264985);
        setIntField(term111594, term111594.getClass(), "cardId", -1136724424);
        setIntField(term111594, term111594.getClass(), "characterId", 491519818);
        setIntField(term111594, term111594.getClass(), "tabSetting", 714499423);
        setIntField(term111594, term111594.getClass(), "tabSortSetting", -1451953569);
        setIntField(term111594, term111594.getClass(), "cardCategorySetting", -1167112486);
        setIntField(term111594, term111594.getClass(), "cardSortSetting", 1886951261);
        setIntField(term111594, term111594.getClass(), "rivalScoreCategorySetting", -1987340068);
        setIntField(term111594, term111594.getClass(), "playedTutorialBit", -728450662);
        setIntField(term111594, term111594.getClass(), "firstTutorialCancelNum", 1141882789);
        setLongField(term111594, term111594.getClass(), "sumTechHighScore", -4433155151923052669L);
        setLongField(term111594, term111594.getClass(), "sumTechBasicHighScore", -7954999924936224754L);
        setLongField(term111594, term111594.getClass(), "sumTechAdvancedHighScore", 4857187962580249593L);
        setLongField(term111594, term111594.getClass(), "sumTechExpertHighScore", 6757940015527142269L);
        setLongField(term111594, term111594.getClass(), "sumTechMasterHighScore", 690252317501985157L);
        setLongField(term111594, term111594.getClass(), "sumTechLunaticHighScore", -8602184519057287697L);
        setLongField(term111594, term111594.getClass(), "sumBattleHighScore", -8387724928136585335L);
        setLongField(term111594, term111594.getClass(), "sumBattleBasicHighScore", 1746984970241024752L);
        setLongField(term111594, term111594.getClass(), "sumBattleAdvancedHighScore", 6448299170686403509L);
        setLongField(term111594, term111594.getClass(), "sumBattleExpertHighScore", -6284262807090006153L);
        setLongField(term111594, term111594.getClass(), "sumBattleMasterHighScore", -8541828392812849455L);
        setLongField(term111594, term111594.getClass(), "sumBattleLunaticHighScore", -7061251528107788725L);
        setField(term111594, term111594.getClass(), "eventWatchedDate", "BVcseHqSdy");
        setField(term111594, term111594.getClass(), "cmEventWatchedDate", "JUEqPSnhuB");
        setField(term111594, term111594.getClass(), "firstGameId", "ZMWgxxUNDQ");
        setField(term111594, term111594.getClass(), "firstRomVersion", "SvlZPdLEcQ");
        setField(term111594, term111594.getClass(), "firstDataVersion", "rcsriQScsw");
        setField(term111594, term111594.getClass(), "firstPlayDate", "hmbjaRbJmy");
        setField(term111594, term111594.getClass(), "lastGameId", "YzSUGIkaWI");
        setField(term111594, term111594.getClass(), "lastRomVersion", "CsjxbNQpvO");
        setField(term111594, term111594.getClass(), "lastDataVersion", "UXxQEhADpf");
        setField(term111594, term111594.getClass(), "compatibleCmVersion", "RqIPVkyMLC");
        setField(term111594, term111594.getClass(), "lastPlayDate", "QPOlHAcPRG");
        setIntField(term111594, term111594.getClass(), "lastPlaceId", 562595019);
        setField(term111594, term111594.getClass(), "lastPlaceName", "etCBgnrABi");
        setIntField(term111594, term111594.getClass(), "lastRegionId", -1015804951);
        setField(term111594, term111594.getClass(), "lastRegionName", "NVWYkZczqy");
        setIntField(term111594, term111594.getClass(), "lastAllNetId", 754771372);
        setField(term111594, term111594.getClass(), "lastClientId", "wJMPOtkOhd");
        setIntField(term111594, term111594.getClass(), "lastUsedDeckId", -1744772510);
        setIntField(term111594, term111594.getClass(), "lastPlayMusicLevel", 81184108);
        setIntField(term111594, term111594.getClass(), "lastEmoneyBrand", -1588433535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventWatchedDate", argTypes, term111594, args);
    }

};


