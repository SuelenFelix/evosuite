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

public class ExternalUserData_getBestBattlePoint_109978803914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101694;

    public ExternalUserData_getBestBattlePoint_109978803914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101694 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term101694, term101694.getClass(), "accessCode", "htETaiDMgw");
        setField(term101694, term101694.getClass(), "userName", "UjqNGJSBEX");
        setIntField(term101694, term101694.getClass(), "level", 173258285);
        setIntField(term101694, term101694.getClass(), "reincarnationNum", 158170344);
        setLongField(term101694, term101694.getClass(), "exp", 2130326910524874760L);
        setLongField(term101694, term101694.getClass(), "point", 2706366660445612538L);
        setLongField(term101694, term101694.getClass(), "totalPoint", 5325475874564615498L);
        setIntField(term101694, term101694.getClass(), "playCount", -1175478574);
        setIntField(term101694, term101694.getClass(), "jewelCount", -1717508219);
        setIntField(term101694, term101694.getClass(), "totalJewelCount", 1666697);
        setIntField(term101694, term101694.getClass(), "medalCount", -853854553);
        setIntField(term101694, term101694.getClass(), "playerRating", -799969894);
        setIntField(term101694, term101694.getClass(), "highestRating", 2067721111);
        setIntField(term101694, term101694.getClass(), "battlePoint", 405142057);
        setIntField(term101694, term101694.getClass(), "bestBattlePoint", -1243668793);
        setIntField(term101694, term101694.getClass(), "overDamageBattlePoint", -1856986214);
        setIntField(term101694, term101694.getClass(), "nameplateId", 862975892);
        setIntField(term101694, term101694.getClass(), "trophyId", -1047267490);
        setIntField(term101694, term101694.getClass(), "cardId", -582915442);
        setIntField(term101694, term101694.getClass(), "characterId", -420425111);
        setIntField(term101694, term101694.getClass(), "tabSetting", -2104355252);
        setIntField(term101694, term101694.getClass(), "tabSortSetting", 793731767);
        setIntField(term101694, term101694.getClass(), "cardCategorySetting", -1302844902);
        setIntField(term101694, term101694.getClass(), "cardSortSetting", -1092897164);
        setIntField(term101694, term101694.getClass(), "rivalScoreCategorySetting", 100050684);
        setIntField(term101694, term101694.getClass(), "playedTutorialBit", 401625801);
        setIntField(term101694, term101694.getClass(), "firstTutorialCancelNum", 1061901020);
        setLongField(term101694, term101694.getClass(), "sumTechHighScore", 7261072770276964296L);
        setLongField(term101694, term101694.getClass(), "sumTechBasicHighScore", 3739822250666541713L);
        setLongField(term101694, term101694.getClass(), "sumTechAdvancedHighScore", 4960554911544249215L);
        setLongField(term101694, term101694.getClass(), "sumTechExpertHighScore", -7505526095762557687L);
        setLongField(term101694, term101694.getClass(), "sumTechMasterHighScore", 4233524282453909799L);
        setLongField(term101694, term101694.getClass(), "sumTechLunaticHighScore", -4309242839310028739L);
        setLongField(term101694, term101694.getClass(), "sumBattleHighScore", -2330073308716156131L);
        setLongField(term101694, term101694.getClass(), "sumBattleBasicHighScore", 8174316337374336919L);
        setLongField(term101694, term101694.getClass(), "sumBattleAdvancedHighScore", -7914894203120957126L);
        setLongField(term101694, term101694.getClass(), "sumBattleExpertHighScore", -6650466505107915737L);
        setLongField(term101694, term101694.getClass(), "sumBattleMasterHighScore", -6516171837681394125L);
        setLongField(term101694, term101694.getClass(), "sumBattleLunaticHighScore", -6397675950829507933L);
        setField(term101694, term101694.getClass(), "eventWatchedDate", "qWPcKUbGGx");
        setField(term101694, term101694.getClass(), "cmEventWatchedDate", "nUKWXpkdOn");
        setField(term101694, term101694.getClass(), "firstGameId", "bjxyKMjXrD");
        setField(term101694, term101694.getClass(), "firstRomVersion", "ryGcwvKsnG");
        setField(term101694, term101694.getClass(), "firstDataVersion", "YfYzzRDpwX");
        setField(term101694, term101694.getClass(), "firstPlayDate", "iLdntHNLlb");
        setField(term101694, term101694.getClass(), "lastGameId", "dmtvGoPFMz");
        setField(term101694, term101694.getClass(), "lastRomVersion", "omCAshLFBc");
        setField(term101694, term101694.getClass(), "lastDataVersion", "FOiAoOHenu");
        setField(term101694, term101694.getClass(), "compatibleCmVersion", "oBoiwmmBsG");
        setField(term101694, term101694.getClass(), "lastPlayDate", "RkVhhbbrDb");
        setIntField(term101694, term101694.getClass(), "lastPlaceId", 2146296423);
        setField(term101694, term101694.getClass(), "lastPlaceName", "YRIQOuomci");
        setIntField(term101694, term101694.getClass(), "lastRegionId", 1592995555);
        setField(term101694, term101694.getClass(), "lastRegionName", "IvIJBAZVKF");
        setIntField(term101694, term101694.getClass(), "lastAllNetId", 10431539);
        setField(term101694, term101694.getClass(), "lastClientId", "wKIgrbFWVG");
        setIntField(term101694, term101694.getClass(), "lastUsedDeckId", 2129296711);
        setIntField(term101694, term101694.getClass(), "lastPlayMusicLevel", -44548911);
        setIntField(term101694, term101694.getClass(), "lastEmoneyBrand", -634048491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestBattlePoint", argTypes, term101694, args);
    }

};


