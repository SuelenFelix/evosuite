package icu.samnyan.aqua.api.model.resp.sega.ongeki;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProfileResp_getCharacterId_13951129414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96836;

    public ProfileResp_getCharacterId_13951129414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96836 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96836, term96836.getClass(), "userName", "hCFIfxqHii");
        setIntField(term96836, term96836.getClass(), "level", -253748198);
        setLongField(term96836, term96836.getClass(), "exp", 2130326910524874760L);
        setLongField(term96836, term96836.getClass(), "point", 2706366660445612538L);
        setLongField(term96836, term96836.getClass(), "totalPoint", 5325475874564615498L);
        setIntField(term96836, term96836.getClass(), "playCount", -1973201059);
        setIntField(term96836, term96836.getClass(), "jewelCount", 1912348462);
        setIntField(term96836, term96836.getClass(), "totalJewelCount", 1546162730);
        setIntField(term96836, term96836.getClass(), "playerRating", 1938770461);
        setIntField(term96836, term96836.getClass(), "highestRating", -874163795);
        setIntField(term96836, term96836.getClass(), "battlePoint", -522227583);
        setIntField(term96836, term96836.getClass(), "nameplateId", 237880729);
        setIntField(term96836, term96836.getClass(), "trophyId", 595063205);
        setIntField(term96836, term96836.getClass(), "cardId", -589482837);
        setIntField(term96836, term96836.getClass(), "characterId", -475747013);
        setLongField(term96836, term96836.getClass(), "sumTechHighScore", 7261072770276964296L);
        setLongField(term96836, term96836.getClass(), "sumTechBasicHighScore", 3739822250666541713L);
        setLongField(term96836, term96836.getClass(), "sumTechAdvancedHighScore", 4960554911544249215L);
        setLongField(term96836, term96836.getClass(), "sumTechExpertHighScore", -7505526095762557687L);
        setLongField(term96836, term96836.getClass(), "sumTechMasterHighScore", 4233524282453909799L);
        setLongField(term96836, term96836.getClass(), "sumTechLunaticHighScore", -4309242839310028739L);
        setLongField(term96836, term96836.getClass(), "sumBattleHighScore", -2330073308716156131L);
        setLongField(term96836, term96836.getClass(), "sumBattleBasicHighScore", 8174316337374336919L);
        setLongField(term96836, term96836.getClass(), "sumBattleAdvancedHighScore", -7914894203120957126L);
        setLongField(term96836, term96836.getClass(), "sumBattleExpertHighScore", -6650466505107915737L);
        setLongField(term96836, term96836.getClass(), "sumBattleMasterHighScore", -6516171837681394125L);
        setLongField(term96836, term96836.getClass(), "sumBattleLunaticHighScore", -6397675950829507933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term96836, args);
    }

};


