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

public class ExternalUserData_getFirstDataVersion_194920143843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113178;

    public ExternalUserData_getFirstDataVersion_194920143843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113178 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term113178, term113178.getClass(), "accessCode", "RcZZnfFJyK");
        setField(term113178, term113178.getClass(), "userName", "NjAYNtbGoQ");
        setIntField(term113178, term113178.getClass(), "level", 316020457);
        setIntField(term113178, term113178.getClass(), "reincarnationNum", 57238364);
        setLongField(term113178, term113178.getClass(), "exp", -1227200230278255275L);
        setLongField(term113178, term113178.getClass(), "point", -2271649408838336402L);
        setLongField(term113178, term113178.getClass(), "totalPoint", 1478570841635730121L);
        setIntField(term113178, term113178.getClass(), "playCount", -771555097);
        setIntField(term113178, term113178.getClass(), "jewelCount", -1522986638);
        setIntField(term113178, term113178.getClass(), "totalJewelCount", -1309669801);
        setIntField(term113178, term113178.getClass(), "medalCount", 1439161867);
        setIntField(term113178, term113178.getClass(), "playerRating", -83123959);
        setIntField(term113178, term113178.getClass(), "highestRating", 429555031);
        setIntField(term113178, term113178.getClass(), "battlePoint", 1687865289);
        setIntField(term113178, term113178.getClass(), "bestBattlePoint", 1886962496);
        setIntField(term113178, term113178.getClass(), "overDamageBattlePoint", 1993286074);
        setIntField(term113178, term113178.getClass(), "nameplateId", 979600987);
        setIntField(term113178, term113178.getClass(), "trophyId", -369125795);
        setIntField(term113178, term113178.getClass(), "cardId", 1027067078);
        setIntField(term113178, term113178.getClass(), "characterId", -1007191844);
        setIntField(term113178, term113178.getClass(), "tabSetting", 1445519485);
        setIntField(term113178, term113178.getClass(), "tabSortSetting", -2130931297);
        setIntField(term113178, term113178.getClass(), "cardCategorySetting", 1045051394);
        setIntField(term113178, term113178.getClass(), "cardSortSetting", -1729853643);
        setIntField(term113178, term113178.getClass(), "rivalScoreCategorySetting", 1556226372);
        setIntField(term113178, term113178.getClass(), "playedTutorialBit", 1485975563);
        setIntField(term113178, term113178.getClass(), "firstTutorialCancelNum", -877977565);
        setLongField(term113178, term113178.getClass(), "sumTechHighScore", 1341096111951622964L);
        setLongField(term113178, term113178.getClass(), "sumTechBasicHighScore", -2312069257754675718L);
        setLongField(term113178, term113178.getClass(), "sumTechAdvancedHighScore", -3050613874514953293L);
        setLongField(term113178, term113178.getClass(), "sumTechExpertHighScore", -6514613926623974211L);
        setLongField(term113178, term113178.getClass(), "sumTechMasterHighScore", 2183188154740503738L);
        setLongField(term113178, term113178.getClass(), "sumTechLunaticHighScore", -451607477374993472L);
        setLongField(term113178, term113178.getClass(), "sumBattleHighScore", 2840755355585115935L);
        setLongField(term113178, term113178.getClass(), "sumBattleBasicHighScore", -5716496558005575185L);
        setLongField(term113178, term113178.getClass(), "sumBattleAdvancedHighScore", 3876149023053286847L);
        setLongField(term113178, term113178.getClass(), "sumBattleExpertHighScore", -5733112360762657255L);
        setLongField(term113178, term113178.getClass(), "sumBattleMasterHighScore", -3094489110597065278L);
        setLongField(term113178, term113178.getClass(), "sumBattleLunaticHighScore", 3629680404122589907L);
        setField(term113178, term113178.getClass(), "eventWatchedDate", "iuaovvOCav");
        setField(term113178, term113178.getClass(), "cmEventWatchedDate", "WaoUcRRKTp");
        setField(term113178, term113178.getClass(), "firstGameId", "XKXJZDGRQV");
        setField(term113178, term113178.getClass(), "firstRomVersion", "RaVLvKbrxO");
        setField(term113178, term113178.getClass(), "firstDataVersion", "HRkpPEsKVp");
        setField(term113178, term113178.getClass(), "firstPlayDate", "ZztKsgSkHX");
        setField(term113178, term113178.getClass(), "lastGameId", "taCiThbobc");
        setField(term113178, term113178.getClass(), "lastRomVersion", "xlApFwpDKn");
        setField(term113178, term113178.getClass(), "lastDataVersion", "jXgNLKcRBx");
        setField(term113178, term113178.getClass(), "compatibleCmVersion", "OsFcDUKtJs");
        setField(term113178, term113178.getClass(), "lastPlayDate", "ccKkfIWfHx");
        setIntField(term113178, term113178.getClass(), "lastPlaceId", 143210645);
        setField(term113178, term113178.getClass(), "lastPlaceName", "GcWOaFtXuP");
        setIntField(term113178, term113178.getClass(), "lastRegionId", 360761107);
        setField(term113178, term113178.getClass(), "lastRegionName", "wXBKBnDCES");
        setIntField(term113178, term113178.getClass(), "lastAllNetId", -1353263664);
        setField(term113178, term113178.getClass(), "lastClientId", "tIsiPqGOqK");
        setIntField(term113178, term113178.getClass(), "lastUsedDeckId", 1164363672);
        setIntField(term113178, term113178.getClass(), "lastPlayMusicLevel", 1178075710);
        setIntField(term113178, term113178.getClass(), "lastEmoneyBrand", 1929372096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstDataVersion", argTypes, term113178, args);
    }

};


